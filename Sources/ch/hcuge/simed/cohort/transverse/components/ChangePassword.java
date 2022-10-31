package ch.hcuge.simed.cohort.transverse.components;

import java.util.UUID;

import org.apache.log4j.Logger;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;

import ch.hcuge.simed.cohort.transverse.db.SimedUser;
import ch.hcuge.simed.foundation.SimedApplication;
import er.extensions.components.ERXComponent;

public class ChangePassword extends  ERXComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static Logger log = Logger.getLogger(LoginPanel.class);

	private String _logoName;

	private String _password;
	
	private String _passwordRetyped;


	private String _errorMessage;


	private String _framework;
	
	
	private SimedUser user;

	// pegn
	private String _currentPassword;

	private String _originalHashPassword = null;
	
	private boolean _successfulyChanged = false;


	public ChangePassword(WOContext context) {
		super(context);
	}



	/*
	 * Custom accessor
	 */
	/**
	 * @return true if the component binding set a logo
	 */
	public boolean hasLogo() {
		if (logoName() == null || logoName().trim().length() == 0) {
			return false;
		}
		return true;
	}



	/*
	 * Accessor
	 */
	/**
	 * @return the logoName
	 */
	public String logoName() {
		return this._logoName;
	}

	/**
	 * @param newLogoName
	 *            the logoName to set
	 */
	public void setLogoName(String newLogoName) {
		this._logoName = newLogoName;
	}


	/**
	 * @return the password
	 */
	public String password() {
		return this._password;
	}

	/**
	 * @param newPassword
	 *            the password to set
	 */
	public void setPassword(String newPassword) {
		this._password = newPassword;
	}

	/**
	 * @return the errorMessage
	 */
	public String errorMessage() {
		return _errorMessage;
	}

	/**
	 * @param newErrorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String newErrorMessage) {
		this._errorMessage = newErrorMessage;
	}


	/**
	 * @return the framework
	 */
	public String framework() {
		if (this._framework == null) {
			this._framework = "app";
		}
		return _framework;
	}

	/**
	 * @param newFramework
	 *            the framework to set
	 */
	public void setFramework(String newFramework) {
		this._framework = newFramework;
	}

	public SimedUser getUser() {
		return user;
	}

	public void setUser(SimedUser user) {
		this.user = user;
		_originalHashPassword = user.passwordHash();
	}



	public String passwordRetyped() {
		return _passwordRetyped;
	}

	public void setPasswordRetyped(String _passwordRetyped) {
		this._passwordRetyped = _passwordRetyped;
	}
	
	public WOActionResults changePassword() {


		setPassword(password().trim());
		setPasswordRetyped(passwordRetyped().trim());
		if (currentPassword() != null)
		{
			setCurrentPassword(currentPassword().trim());
		}
		if(isPasswordConditionValid() == false) { // pegn only oldPass + check on typed passwds
			return null;
		}	
		
		user.setPasswordHash(this.password()); // will calculate hash alone in SimedUser.validateForUpdate
		user.setUrlParam(null);
		user.setIsActive(true);
		user.setUpdateInChangePassword(true); // allows modif of pwd
		// 24.04 use public = ToSend for send  mail chgt pwd
		user.setPublicID(UUID.randomUUID().toString());
		try {
			user.editingContext().saveChanges();
			_successfulyChanged = true;
			this.setErrorMessage("Your password has been successfully changed");

		} catch (ValidationException e) {
			this.setErrorMessage(e.getMessage());
			user.editingContext().undo();
			user.editingContext().revert();
		}

		return null;
	}
	private boolean isPasswordConditionValid() {
		
		// test current pwd
		
		if (hasCurrentPassword())
		{
			if (!SimedApplication.actionauthenticate().authenticate(user.passwordHash(), currentPassword(), user.login()))
			{
				this.setErrorMessage("The current password is not valid");
				return false;				
			}

		}
		
		
		//check that both password and retyped password are not null or empty
		if (password() == null || passwordRetyped() == null || passwordRetyped().trim().length() == 0 || password().trim().length() == 0) {
			this.setErrorMessage("You must enter an not empty password 2 times");
			return false;
		}
		//removes whitespaces in front and back of the password and retyped password and issues a warning when necessary
		if(password().length() != password().trim().length() || passwordRetyped().length() != passwordRetyped().trim().length()) {
			setPassword(password().trim());
			setPasswordRetyped(passwordRetyped().trim());
			this.setErrorMessage("WhiteSpace characters in front or back have been removed from one of the typed passwords");
		}
		//check equality between password and retyped password
		if (!password().equals(passwordRetyped())){
			this.setErrorMessage("The passwords typed are not the same");
			return false;
		}
		return true;

	}


	public String currentPassword() {
		return _currentPassword;
	}



	public void setCurrentPassword(String _currentPassword) {
		this._currentPassword = _currentPassword;
	}
	
	public boolean hasCurrentPassword()
	{
		if (_originalHashPassword != null)
		{
			return true;
		}
		return false;
	}



	public boolean isSuccessfulyChanged() {
		return _successfulyChanged;
	}
}