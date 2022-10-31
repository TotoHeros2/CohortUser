package ch.hcuge.simed.cohort.transverse.security;

import ch.hcuge.simed.cohort.transverse.db.Privilege;
import ch.hcuge.simed.cohort.transverse.db.Role;

import com.webobjects.foundation.NSArray;

import er.extensions.eof.ERXEnterpriseObject;

public interface RoleProvider extends ERXEnterpriseObject {

	public NSArray<Role> allRoles();

	public NSArray<Privilege> allPrivileges();

	public RoleProxy is();

	public PrivilegeProxy can();

}
