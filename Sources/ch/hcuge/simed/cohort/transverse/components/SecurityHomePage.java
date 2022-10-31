package ch.hcuge.simed.cohort.transverse.components;

import org.apache.commons.lang.exception.ExceptionUtils;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSTimestamp;

import ch.hcuge.simed.cohort.transverse.interfaces.LandingPage;
import ch.hcuge.simed.foundation.interfaces.eo.GenericUser;
import er.extensions.components.ERXComponent;
import com.webobjects.appserver.WOActionResults;

public class SecurityHomePage extends ERXComponent {
	private Throwable error;
	private String _logoName;
	private String _framework;
	private String _landingPageName;


    public SecurityHomePage(WOContext context) {
        super(context);
    }
    
	public Throwable getError() {
		return error;
	}

	public void setError(Throwable originalException) {
		this.error = originalException;
	}
	public String rootCause() {
		return ExceptionUtils.getRootCauseMessage(error);
	}
	public String stackTrace() {
		return ExceptionUtils.getFullStackTrace(error);
	}
	
	public String url() {
		return application().servletConnectURL();
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

	public WOActionResults backToApp() {
		LandingPage landingPage = (LandingPage) pageWithName("Main");
		return (WOActionResults) landingPage;
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
	
	public String now()
	{
		return new NSTimestamp().toLocaleString();
	}
}