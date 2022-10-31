package ch.hcuge.simed.cohort.transverse.db.enumeration;

import org.apache.log4j.Logger;

import ch.hcuge.simed.foundation.extendableenum.ExtendableEnum;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

public class UserStatus extends ExtendableEnum {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final UserStatus PENDING = new UserStatus("0", "Pending");
	public static final UserStatus ACTIVE = new UserStatus("1", "Active");
	public static final UserStatus REVOKED = new UserStatus("2", "Revoked");

	public static Logger log = Logger.getLogger(UserStatus.class);

	private static final NSMutableDictionary<String, UserStatus> stringToEnum = new NSMutableDictionary<String, UserStatus>();
	private static final NSMutableDictionary<String, String> codeToString = new NSMutableDictionary<String, String>();
	private static final NSMutableArray<UserStatus> backend = new NSMutableArray<UserStatus>();

	static {
		backend.add(PENDING);
		backend.add(ACTIVE);
		backend.add(REVOKED);

		for (UserStatus element : backend) {
			stringToEnum.takeValueForKey(element, element.getDisplayValue());
			codeToString.takeValueForKey(element.getDisplayValue(), element.getCode());
		}
	}

	private String _code;
	private String _displayValue;

	/**
	 * @param code
	 * @param displayValue
	 */
	UserStatus(String code, String displayValue) {
		this._code = code;
		this._displayValue = displayValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ch.hcuge.simed.foundation.extendableenum.ExtendableEnum#getCode()
	 */
	@Override
	public final String getCode() {
		return _code;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ch.hcuge.simed.foundation.extendableenum.ExtendableEnum#setCode(java.
	 * lang.String)
	 */
	@Override
	public final void setCode(String newCode) {
		this._code = newCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ch.hcuge.simed.foundation.extendableenum.ExtendableEnum#getDisplayValue()
	 */
	@Override
	public final String getDisplayValue() {
		return _displayValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ch.hcuge.simed.foundation.extendableenum.ExtendableEnum#setDisplayValue
	 * (java.lang.String)
	 */
	@Override
	public final void setDisplayValue(String newDisplayValue) {
		this._displayValue = newDisplayValue;
	}

	public static final UserStatus fromCode(String code) {
		String displayValue = (String) codeToString.valueForKey(code);
		UserStatus element = fromString(displayValue);
		return element;
	}

	public static final UserStatus fromString(String displayValue) {
		UserStatus element = (UserStatus) stringToEnum.valueForKey(displayValue);
		return element;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return this.getDisplayValue();
	}

	public static NSDictionary<String, String> popupDictionnary() {
		return codeToString.immutableClone();
	}

	@SuppressWarnings("unchecked")
	public static NSArray<String> orderedKeys() {
		return (NSArray<String>) backend.valueForKey("code");
	}
}
