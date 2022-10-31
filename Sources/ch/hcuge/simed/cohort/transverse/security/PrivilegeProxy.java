package ch.hcuge.simed.cohort.transverse.security;

import java.util.Enumeration;

import org.apache.log4j.Logger;

import ch.hcuge.simed.cohort.transverse.db.Privilege;
import ch.hcuge.simed.foundation.SimedSession;
import ch.hcuge.simed.foundation.utilities.SimedEOUtilities;
import ch.hcuge.simed.foundation.utilities.SimedNotificationUtilities;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSNotification;

public class PrivilegeProxy implements NSKeyValueCoding {

	public static Logger log = Logger.getLogger(PrivilegeProxy.class);

	private EntityInterface _entityInterface = null;
	private boolean negate = false;

	public PrivilegeProxy(EntityInterface anEntity) {
		super();

		if (anEntity != null) {
			this._entityInterface = anEntity;
		} else {
			throw new IllegalArgumentException(SecurityConstante.ERRORMSG_USER_NULL);
		}

		registerAsUserPrivilegesObserver();
	}/* constructor */

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.webobjects.foundation.NSKeyValueCoding#takeValueForKey(java.lang.Object,
	 *      java.lang.String)
	 * 
	 *      Not used.
	 */
	@Override
	public void takeValueForKey(Object value, String key) {
		/* Nothing to do it's an access only class */
	}

	/**
	 * @see com.webobjects.foundation.NSKeyValueCoding#valueForKey(java.lang.String)
	 * @return Boolean.TRUE if the privilege code is valid for the current user
	 */
	@Override
	public Object valueForKey(String key) {
		Boolean userHasPrivilege = Boolean.FALSE;

		if (this._entityInterface != null) {

			Privilege privilege = Privilege.instanceByCode(this._entityInterface.editingContext(), key);
			if(privilege == null){
				return Boolean.FALSE;
			}

			userHasPrivilege = Boolean.valueOf(this._entityInterface.allPrivileges().containsObject(key.toUpperCase()));
		} else {
			throw new IllegalStateException(SecurityConstante.ERRORMSG_USER_NULL);
		}

		if (this.negate) {
			userHasPrivilege = Boolean.valueOf(!userHasPrivilege.booleanValue());
		}

		return userHasPrivilege;
	} /* valueForKey */

	public void negate(boolean negate) {
		this.negate = negate;
	}

	/**
	 * @return a list of privilege code
	 * 
	 *         This method avoid an access to the DB for privilege access
	 */
	protected NSArray<String> userPrivilegesAsArrayOfStrings() {
		NSMutableArray<String> mutableResult = new NSMutableArray<String>();
		NSArray<Privilege> dbPrivileges = _entityInterface.allPrivileges();
		Enumeration<Privilege> privEnum = dbPrivileges.objectEnumerator();
		while (privEnum.hasMoreElements()) {
			Privilege priv = privEnum.nextElement();
			mutableResult.addObject(priv.code().toUpperCase());
		}
		return mutableResult.immutableClone();
	}

	public void onUserPrivilegesChange(NSNotification notification) {
		@SuppressWarnings("unchecked")
		NSDictionary<String, Object> userInfo = notification.userInfo();
		String userLogin = (String) userInfo.objectForKey(SecurityConstante.USER_LOGIN);

		boolean mustRefresh = (userLogin == null) || userLogin.equals(_entityInterface.login());

		if (mustRefresh) {
			log.debug("[SIMED]{" + this.getClass().getName() + "} <onUserPrivilegesChange> >>>>> privileges changed");
			SimedEOUtilities.invalidateEnterpriseObject(_entityInterface);

			NSArray<String> userNewPriv = userPrivilegesAsArrayOfStrings();
			session().setObjectForKey(userNewPriv, SimedSession.KEY_USER_PRIVILEGES);
		}
	}/* onUserPrivilegesChange() */

	private void registerAsUserPrivilegesObserver() {
		SimedNotificationUtilities.registerObserverForNotification(this, SecurityConstante.PRIVILEGES_CHANGE_NOTIFICATION_NAME,
				SecurityConstante.ON_USER_PRIVILEGES_CHANGE);
	}/* registerAsUserPrivilegesObserver() */

	private SimedSession session() {
		return (SimedSession) _entityInterface.editingContext().delegate();
	}
}
