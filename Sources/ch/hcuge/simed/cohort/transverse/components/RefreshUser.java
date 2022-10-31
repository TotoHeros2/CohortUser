package ch.hcuge.simed.cohort.transverse.components;

import com.webobjects.appserver.WOContext;

import ch.hcuge.simed.cohort.transverse.db.SimedUser;
import er.extensions.components.ERXComponent;
import er.extensions.eof.ERXEC;

public class RefreshUser extends ERXComponent {
	public SimedUser user;
	private String login;
	
    public RefreshUser(WOContext context) {
        super(context);
    }

	public String login() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
        user = SimedUser.fetchSimedUser(ERXEC.newEditingContext(), SimedUser.LOGIN_KEY, login());

	}
}