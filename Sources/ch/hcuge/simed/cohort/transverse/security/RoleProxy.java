package ch.hcuge.simed.cohort.transverse.security;

import java.util.Enumeration;

import org.apache.log4j.Logger;

import ch.hcuge.simed.cohort.transverse.db.Role;
import ch.hcuge.simed.foundation.SimedSession;
import ch.hcuge.simed.foundation.utilities.SimedEOUtilities;
import ch.hcuge.simed.foundation.utilities.SimedNotificationUtilities;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSNotification;

public class RoleProxy implements NSKeyValueCoding {

	public static Logger log = Logger.getLogger(RoleProxy.class);

	private EntityInterface _entityInterface = null;
	private boolean negate = false;

	/**
	 * @param anEntity
	 */
	public RoleProxy(EntityInterface anEntity) {
		super();

		if (anEntity != null) {
			this._entityInterface = anEntity;
		} else {
			throw new IllegalArgumentException(SecurityConstante.ERRORMSG_USER_NULL);
		}

		registerAsUserRolesObserver();
	}/* constructor */

	/**
	 * @see com.webobjects.foundation.NSKeyValueCoding#valueForKey(java.lang.String)
	 * @return Boolean.TRUE if the role code is valid for the current user
	 */
	@Override
	public Object valueForKey(String key) {
		Boolean userInRole = Boolean.FALSE;

		if (this._entityInterface != null) {
			Role role = Role.instanceByCode(this._entityInterface.editingContext(), key);
			if (role == null) {
				return Boolean.FALSE;
			}
			userInRole = Boolean.valueOf(this._entityInterface.allRoles().contains(role));
		} else {
			throw new IllegalStateException(SecurityConstante.ERRORMSG_USER_NULL);
		}

		if (this.negate) {
			userInRole = Boolean.valueOf(!userInRole.booleanValue());
		}

		return userInRole;
	}/* valueForKey */

	/**
	 * @see com.webobjects.foundation.NSKeyValueCoding#takeValueForKey(java.lang.Object,
	 *      java.lang.String)
	 * 
	 *      Not used.
	 */
	@Override
	public void takeValueForKey(Object arg0, String arg1) {
		/* Nothing to do it's an access only class */
	}

	public void negate(boolean negate) {
		this.negate = negate;
	}

	/**
	 * @return a list of role code
	 * 
	 *         This method avoid an access to the DB for role access
	 */
	protected NSArray<String> userRolesAsArrayOfStrings() {
		NSMutableArray<String> mutableResult = new NSMutableArray<String>();

		NSArray<Role> dbRoles = _entityInterface.allRoles();
		Enumeration<Role> rolesEnum = dbRoles.objectEnumerator();
		while (rolesEnum.hasMoreElements()) {
			Role role = rolesEnum.nextElement();
			mutableResult.addObject(role.code().toUpperCase());
		}
		return mutableResult.immutableClone();
	}

	/**
	 * @param notification
	 * 
	 *            C'est le callback appele' en cas de notification
	 */
	public void onUserRolesChange(NSNotification notification) {
		@SuppressWarnings("unchecked")
		NSDictionary<String, Object> userInfo = notification.userInfo();
		String userLogin = (String) userInfo.objectForKey(SecurityConstante.USER_LOGIN);

		boolean mustRefresh = (userLogin == null) || userLogin.equals(_entityInterface.login());

		if (mustRefresh) {
			log.debug("[SIMED]{" + this.getClass().getName() + "} <onUserRolesChange> >>>>> roles changed");
			SimedEOUtilities.invalidateEnterpriseObject(_entityInterface);

			NSArray<String> userNewRoles = userRolesAsArrayOfStrings();
			session().setObjectForKey(userNewRoles, SimedSession.KEY_USER_ROLES);
		}
	}/* onUserRolesChange() */

	private void registerAsUserRolesObserver() {
		SimedNotificationUtilities.registerObserverForNotification(this, SecurityConstante.ROLES_CHANGE_NOTIFICATION_NAME,
				SecurityConstante.ON_USER_ROLES_CHANGE);
	}/* registerAsUserRolesObserver() */

	private SimedSession session() {
		return (SimedSession) _entityInterface.editingContext().delegate();
	}
}
