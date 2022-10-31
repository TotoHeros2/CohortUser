package ch.hcuge.simed.cohort;

import er.extensions.ERXFrameworkPrincipal;

public class CohortUser extends ERXFrameworkPrincipal {
	protected static CohortUser sharedInstance;
	@SuppressWarnings("unchecked")
	public final static Class<? extends ERXFrameworkPrincipal> REQUIRES[] = new Class[] {};

	static {
		setUpFrameworkPrincipalClass(CohortUser.class);
	}

	public static CohortUser sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = sharedInstance(CohortUser.class);
		}
		return sharedInstance;
	}

	@Override
	public void finishInitialization() {
		log.debug("CohortUser loaded");
	}
}
