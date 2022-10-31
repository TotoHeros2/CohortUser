package ch.hcuge.simed.cohort.transverse.components;

import org.apache.log4j.Logger;

import ch.hcuge.simed.cohort.transverse.db.SimedUser;
import ch.hcuge.simed.cohort.transverse.interfaces.LandingPage;
import ch.hcuge.simed.foundation.interfaces.eo.GenericUser;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;

import er.extensions.components.ERXComponent;
import er.extensions.eof.ERXEC;
import er.extensions.foundation.ERXProperties;

public class LoginPanel extends ERXComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static Logger log = Logger.getLogger(LoginPanel.class);

	private String _logoName;

	private String _login;

	private String _password;

	private String _errorMessage;

	private String _landingPageName;

	private String _framework;

	public LoginPanel(WOContext context) {
		super(context);
	}

	/*
	 * Action
	 */

	public WOActionResults validateLogin() {
		if (login() == null || password() == null || login().trim().length() == 0 || password().trim().length() == 0) {
			WOActionResults result = this.context().page();
			this.setErrorMessage("You must enter your login and password");
			return result;
		}
		boolean isLoginValid = SimedUser.isLoginInfoValid(login(), password());
		// return pageWithName(landingPageName());
		if (isLoginValid) {
			SimedUser user = SimedUser.obtainUserWithCredential(login(), password());
			if(!user.isActive()) {
				WOActionResults result = this.context().page();
				this.setErrorMessage("This account is not activated or has been deactivated.");
				return result;
			}
			LandingPage landingPage = (LandingPage) pageWithName(landingPageName());
			landingPage.setUserToSession((GenericUser) user);
			return (WOActionResults) landingPage;
		} else {
			WOActionResults result = this.context().page();
			this.setErrorMessage("bad login");
			return result;
		}
	}

	public WOActionResults devLoginWithDefaultUser() {
		try {
			String defaultUserCode = ERXProperties.stringForKeyWithDefault("ch.simed.devenv.defaultuser", "xxxxxxxxxxxxxxxxxxxxxxxx");
			SimedUser user = SimedUser.fetchRequiredSimedUser(ERXEC.newEditingContext(), SimedUser.LOGIN.eq(defaultUserCode));
			LandingPage landingPage = (LandingPage) pageWithName(landingPageName());
			landingPage.setUserToSession((GenericUser) user);
			return (WOActionResults) landingPage;
		} catch (Exception e) {
			WOActionResults result = this.context().page();
			this.setErrorMessage("bad default user");
			return result;
		}
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

	/**
	 * @return the isDevMode
	 */
	public final boolean isDevMode() {
		Boolean result = ERXProperties.booleanForKeyWithDefault("ch.simed.devenv", false);
		return result;
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
	 * @return the login
	 */
	public String login() {
		return this._login;
	}

	/**
	 * @param newLogin
	 *            the login to set
	 */
	public void setLogin(String newLogin) {
		this._login = newLogin;
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
	 * @return the landingPageName
	 */
	public String landingPageName() {
		return this._landingPageName;
	}

	/**
	 * @param newLandingPageName
	 *            the landingPageName to set
	 */
	public void setLandingPageName(String newLandingPageName) {
		this._landingPageName = newLandingPageName;
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

}