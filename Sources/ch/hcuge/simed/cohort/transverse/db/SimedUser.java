package ch.hcuge.simed.cohort.transverse.db;

import java.util.UUID;

import org.joda.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.glass.ui.Application;
import com.webobjects.appserver.WOApplication;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;
import com.webobjects.foundation.NSValidation.ValidationException;

import ch.hcuge.simed.cohort.transverse.db.enumeration.UserStatus;
import ch.hcuge.simed.cohort.transverse.security.PrivilegeProxy;
import ch.hcuge.simed.cohort.transverse.security.RoleProxy;
import ch.hcuge.simed.cohort.transverse.security.UserEntityInterface;
import ch.hcuge.simed.foundation.SimedApplication;
import ch.hcuge.simed.foundation.interfaces.eo.GenericUser;
import ch.hcuge.simed.foundation.security.SimedBCrypt;
import er.extensions.eof.ERXEC;

public class SimedUser extends _SimedUser implements GenericUser, UserEntityInterface{
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(SimedUser.class);
	
	
	private static final String EDIT = "edit";
	private static final String VALIDATE = "validate";
	
	private NSArray<Privilege> privileges;
	
	private boolean canEdit = false;
	private boolean canValidate = false;

	private String cleanPwd;
	private boolean isUpdateInChangePassword = false;
	
	private String _typedPwd;
	private Boolean _secondLoop = false; 

	public static final String TO_SEND = "ToSend";


	@Override
	public void awakeFromInsertion(EOEditingContext editingContext) {
		super.awakeFromInsertion(editingContext);
		String uuid = UUID.randomUUID().toString();
		this.setPublicID(uuid);
//		uuid = uuid.replaceAll("-", "");
//		this.setPasswordHash(uuid);
		this.setUrlParam(UUID.randomUUID().toString() + UUID.randomUUID().toString());
		this.setCanUseSampleManager(false);
		this.setCanUseAuditTrail(false);
		setIsActive(false);
		setPasswordHash(null);
//		this.setStatus(UserStatus.PENDING);
		// create a urlParameter for changing passwd
	}

	@Override
	public void willInsert() {
		super.willInsert();
// a la creation un user n'a pas de pwd et est desactivé
		_typedPwd = this.passwordHash();
//		setIsActive(false);
//		this.setPasswordHash(null);
		
		
//		String login = this.login();
//		String password = this.passwordHash();
//		log.warn("[SIMED]{" + this.getClass().getName() + "} <willInsert> with login: '" + login + "' and pwd: '" + password + "'.");
//		String passwordHash = SimedApplication.actionauthenticate().encryptPassword(this.passwordHash(), this.login());
//		this.setPasswordHash(passwordHash);
//		password = this.passwordHash();
//		log.warn("[SIMED]{" + this.getClass().getName() + "} <willInsert> with login: '" + login + "' and pwdHash: '" + password + "'.");
	}

//	@Override
//	public void willUpdate() {
//		super.willUpdate();
//		if (!isUpdateInChangePassword()) // interdit dans DTW
//			return; // nothing
//		NSDictionary<String, Object> change = this.changesFromCommittedSnapshot();
//		String newPwd = (String) change.valueForKey(SimedUser.PASSWORD_HASH_KEY);
//		if (newPwd != null) {
////			checkPasswordValidity();
////			addPreviousPasswordToOldHash();
//			String hash = SimedApplication.actionauthenticate().encryptPassword(this.passwordHash(), this.login());
//			this.setPasswordHash(hash);
//			this.setIsActive(true);
//		}
//		else
//		{
//			if (passwordHash() == null)
//				setIsActive(false);			
//		}
//	}

	@Override
	public void validateForUpdate() throws ValidationException {
		// TODO Auto-generated method stub
		super.validateForUpdate();
		
		if(!_secondLoop) {
			NSDictionary<String, Object> change = this.changesFromCommittedSnapshot();
			NSDictionary<String, Object> committed = this.committedSnapshot();
			
			String newPwd  = null;
			String oldPwd = null;
			try {
				newPwd = (String) change.valueForKey(SimedUser.PASSWORD_HASH_KEY);
			}catch(Exception e) {
				newPwd = "";
			}
			try {
				oldPwd =  (String)committed.valueForKey(SimedUser.PASSWORD_HASH_KEY);
			}catch(Exception e) {
				oldPwd = "";
			}
			
			Boolean newIsActive = (Boolean) change.valueForKey(SimedUser.IS_ACTIVE_KEY);
			Boolean oldIsActive = (Boolean) committed.valueForKey(SimedUser.IS_ACTIVE_KEY);
	
			String toCheckPass = null;
			Boolean toCheckIsActive = null;
			if(newIsActive==null)
				toCheckIsActive = oldIsActive;
			else
				toCheckIsActive = newIsActive;
			if(newPwd==null)
				toCheckPass = oldPwd;
			else
				toCheckPass = newPwd;
			
			if(isUpdateInChangePassword == false) {
				if(toCheckIsActive==true && toCheckPass.equals("")) {
					setIsActive(false);
					throw new ValidationException("User set to active but has no password. This should not occur! \'Is Active\' has been set to 0 to prevent problems.");
				} else if(newPwd!=null) {
					setPasswordHash(newPwd);
					if(!newPwd.equals("")) {
						checkPasswordValidity();
	
						setPasswordHash(SimedApplication.actionauthenticate().encryptPassword(this.passwordHash(), this.login()));
						addPasswordToOldHash();
					}
				}
			} else {
				checkPasswordValidity();
				setPasswordHash(SimedApplication.actionauthenticate().encryptPassword(this.passwordHash(), this.login()));
				addPasswordToOldHash();
			}
			_secondLoop = true;
		}
		else {
			_secondLoop = false;
		}
	}
	
	// pegn only {pwd vide/desactivé} ou {pwd/activé}
	
	@Override
	public void validateForInsert() throws ValidationException {
		// TODO Auto-generated method stub
		super.validateForInsert();
		// valeur en clair
		if (passwordHash() != null && passwordHash().trim().length() > 0)
		{
			if (!isActive())
			{
				throw new ValidationException("Except for DEV/FORM, User must be created not actived and with a null pwd !");
				
			}
		}
		else
		{
			if (isActive())
			{
				throw new ValidationException("User must be created not actived and with a null pwd !");
			}
		}
		if(this.passwordHash() != null && this.passwordHash().trim().equals(_typedPwd)) // 1 seul fois
		{
			String passwordHash = SimedApplication.actionauthenticate().encryptPassword(this.passwordHash().trim(), this.login());
			this.setPasswordHash(passwordHash);
		}
	}

	//Verifies that a password about to be saved is not the same as a previous password.
	//Should be done in willUpdate() only and before the new password gets encrypted.
	private void checkPasswordValidity() {
//		//check for valid password length
//		if(passwordHash().length() < 10) {
//			throw new ValidationException("Your password must be minimum 10 chars long");
//		}
//		this.committedSnapshot().get("isActive");
//		this.committedSnapshot();
		checkPasswordFormat();
//		Object test = (String)this.committedSnapshotValueForKey(PASSWORD_HASH_KEY);
//		test.getClass();
//		NSKeyValueCoding test2 = null;
//		if(passwordHash() != null && SimedApplication.actionauthenticate().authenticate((String)this.committedSnapshotValueForKey(PASSWORD_HASH_KEY), this.passwordHash(), this.login())){
//			throw new ValidationException("You have already used this password once. You should not reuse passwords.");
//		}

		NSMutableArray<OldPassHash> oldPasswordHashes = oldPassHashs().mutableClone();
		for(int i = 0; i < oldPasswordHashes.size(); i++) {
			if(SimedApplication.actionauthenticate().authenticate(oldPasswordHashes.get(i).hash(), this.passwordHash(), this.login())) {
				throw new ValidationException("You have already used this password once. You should not reuse passwords.");
			}
		}
	}
	
	private void checkPasswordFormat() {
		// pegn
		if (this.passwordHash() == null)
		{
			return;
		}
		
		//removes whitespaces in front and back of the password and retyped password and issues a warning when necessary
		this.setPasswordHash(this.passwordHash().trim());
		//check for valid password length
		if(this.passwordHash().length() < 10) {
			throw new ValidationException("Your password must be minimum 10 chars long");
		}
		//check for presence of a least one uppercase letter
		if(this.passwordHash().equals(this.passwordHash().toLowerCase())) {
			throw new ValidationException("Your password must contain at least one uppercase letter");
		}
		//check for presence of at least one lowercase letter
		if(this.passwordHash().equals(this.passwordHash().toUpperCase())) {
			throw new ValidationException("Your password must contain at least one lowercase letter");
		}
		//check for presence of at least one number
		if(!this.passwordHash().matches(".*\\d+.*")) {
			throw new ValidationException("Your password must contain at least one number");
		}
		//check for presence of at least one special character
		if(this.passwordHash().matches("[a-zA-Z0-9]*")) {
			throw new ValidationException("Your password must contain at least one special character");
		}
		//check for the presence of non ascii characters
		if(this.passwordHash().matches(".*[^\\x00-\\x7F].*")) {
			throw new ValidationException("Your password cannot contain non-ascii characters such as é, à , ç.");
		}
	}
	
	private void addPasswordToOldHash() {
//		OldPassHash.createOldPassHash(this.editingContext(), LocalDateTime.now(), (String)this.passwordHash(), UUID.randomUUID().toString(), this);
		OldPassHash.createOldPassHash(this.editingContext(), new NSTimestamp(), (String)this.passwordHash(), UUID.randomUUID().toString(), this);
		
		NSArray<OldPassHash> oldPasswordhashes = oldPassHashs(null, OldPassHash.CREATION_DATE.ascs(), false);
		NSMutableArray<OldPassHash> mutableOldPasswordhashes = oldPasswordhashes.mutableClone();
		OldPassHash toDelete = null;
//		for(OldPassHash alreadyIncluded : mutableOldPasswordhashes) {
//			if (SimedBCrypt.) {
//				
//			}
//		}

		while(mutableOldPasswordhashes.size() > 5) {
			toDelete = mutableOldPasswordhashes.get(0);
			this.removeFromOldPassHashs(toDelete);
			this.deleteOldPassHashsRelationship(toDelete);
			toDelete.delete();
			mutableOldPasswordhashes = oldPassHashs(null, OldPassHash.CREATION_DATE.ascs(), false).mutableClone();
		}
	}

	public static boolean isLoginInfoValid(String login, String password) {
		// String passwordHash =
		// SimedApplication.actionauthenticate().encryptPassword(password,
		// login);
		EOEditingContext ec = ERXEC.newEditingContext();
		// pegn activate only
		NSArray<SimedUser> users = SimedUser.fetchSimedUsers(ec, SimedUser.LOGIN.ilike(login), null);
		if (users.count() == 1) {
			SimedUser user = users.objectAtIndex(0);
			String passworHash = user.passwordHash();
			if(!user.isActive()) {
				log.debug("[SIMED]{ch.hcuge.simed.cohort.transverse.db.User} <isLoginInfoValidWithHash> User is not active yet");
				return false;
			}
			return SimedApplication.actionauthenticate().authenticate(passworHash, password, login);
		} else if (users.count() == 0) {
			log.debug("[SIMED]{ch.hcuge.simed.cohort.transverse.db.User} <isLoginInfoValidWithHash> No user found");
			return false;
		} else {
			log.error("[SIMED]{ch.hcuge.simed.cohort.transverse.db.User} <isLoginInfoValidWithHash> Too many users found for login: '" + login + "'.");
			return false;
		}
	}

	public static SimedUser obtainUserWithCredential(String login, String password) {
		EOEditingContext ec = ERXEC.newEditingContext();
		SimedUser user = SimedUser.fetchRequiredSimedUser(ec, SimedUser.LOGIN.ilike(login));
		return user;
	}

	public static SimedUser createSimedUser(EOEditingContext editingContext, String email, String firstName, String lastName, String login,
			String passwordHash, String publicID) {
		return registerUser(editingContext, email, firstName, lastName, login, passwordHash, publicID);
	}

	public static SimedUser registerUser(EOEditingContext editingContext, String email, String firstName, String lastName, String login, String password,
			String publicID) {
		Boolean isActive = false;
		String passwordHash = SimedApplication.actionauthenticate().encryptPassword(password, login);
		SimedUser user = _SimedUser.createSimedUser(editingContext, email, firstName, isActive, lastName, login /*, passwordHash*/, publicID /*, UserStatus.PENDING*/);
		return user;
	}

	/*
	 * Utility method
	 */

	@Override
	public String fullName() {
		return this.firstName() + " " + this.lastName() + " (" + this.email()+ ")";
	}

	@Override
	public NSArray<Role> allRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NSArray<Privilege> allPrivileges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleProxy is() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrivilegeProxy can() {
		// TODO Auto-generated method stub
		return null;
	}
// bug loose currentCenter

	@Override
	public void setCurrentWorkPosition(WorkPosition value) {
		if (currentWorkPosition() != null && value == null)
			return;
		super.setCurrentWorkPosition(value);
	}

	public NSArray<Privilege> getPrivileges() {
		return privileges;
	}
	
	public boolean canEdit() {
		calculPrivileges();
		return canEdit;
	}


	public boolean canValidate() {
		calculPrivileges();
		return canValidate;
	}

	private void calculPrivileges() {
		/* depend on current WP
		 * canUseSM is boolean field now
		if (privileges == null)
		{
			privileges = new NSMutableArray<Privilege>();
			for (WorkPosition position : workPositions())
			{
				privileges.arrayByAddingObjectsFromArray(position.role().privileges());
			}
			for (Privilege privilege : privileges)
			{
				if (privilege.code().equalsIgnoreCase(EDIT))
				{
					canEdit = true;
				}
				else if (privilege.code().equalsIgnoreCase(VALIDATE))
				{
					canValidate = true;
				}

			}
		}
		*/
		canEdit = false;
		canValidate = false;
		for (Privilege privilege : currentWorkPosition().role().privileges())
		{
			if (privilege.code().equalsIgnoreCase(EDIT))
			{
				canEdit = true;
			}
			else if (privilege.code().equalsIgnoreCase(VALIDATE))
			{
				canValidate = true;
			}

		}
		
		
	}

	public String getCleanPwd() {
		return cleanPwd;
	}

	public void setCleanPwd(String cleanPwd) {
		this.cleanPwd = cleanPwd;
	}

	public boolean isUpdateInChangePassword() {
		return isUpdateInChangePassword;
	}

	public void setUpdateInChangePassword(boolean isUpdateInChangePassword) {
		this.isUpdateInChangePassword = isUpdateInChangePassword;
	}

// pegn 13.02.20 no more new urlparam on update	
	
//	@Override
//	public void willUpdate() {
//		if (publicID().equals(TO_SEND))
//		{
//			setUrlParam(UUID.randomUUID().toString() + UUID.randomUUID().toString());
//		}
//		super.willUpdate();
//	}

}
