// DO NOT EDIT.  Make changes to Privilege.java instead.
package ch.hcuge.simed.cohort.transverse.db;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;

import er.extensions.eof.*;
import er.extensions.foundation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.hcuge.simed.foundation.utilities.validator.*;

@SuppressWarnings("all")
public abstract class _Privilege extends ch.hcuge.simed.foundation.eo.SimedEnterpriseObject {
  public static final String ENTITY_NAME = "Privilege";

  // Attribute Keys
  public static final ERXKey<String> CODE = new ERXKey<String>("code");
  public static final ERXKey<String> NAME = new ERXKey<String>("name");
  public static final ERXKey<String> PUBLIC_ID = new ERXKey<String>("publicID");

  // Relationship Keys

  // Attributes
  public static final String CODE_KEY = CODE.key();
  public static final String NAME_KEY = NAME.key();
  public static final String PUBLIC_ID_KEY = PUBLIC_ID.key();

  // Relationships

  private static final Logger log = LoggerFactory.getLogger(_Privilege.class);

  public Privilege localInstanceIn(EOEditingContext editingContext) {
    Privilege localInstance = (Privilege)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

/*
<h2>documentation for: code</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = Code
attribute.uppercaseUnderscoreName = CODE
attribute.fullyQualifiedName = CohortUser/Privilege/attr: code
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = code
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = true
attribute.prototype = [EOAttribute: varchar10]
attribute.externalType = VARCHAR2
attribute.precision = $attribute.precision
attribute.scale = $attribute.scale
attribute.width = 10
attribute.serverTimeZone = $attribute.serverTimeZone
attribute.prototyped  (isPrototyped) = true  (isPrototyped)
attribute.flattened  (isFlattened) = false  (isFlattened)
attribute.inherited  (isInherited) = false  (isInherited)
attribute.readOnly  (isReadOnly) = $attribute.readOnly  (isReadOnly)
attribute.indexed  (isIndexed) = $attribute.indexed  (isIndexed)
attribute.classProperty  (isClassProperty) = true  (isClassProperty)
attribute.clientClassProperty  (isClientClassProperty) = false  (isClientClassProperty)
attribute.commonClassProperty  (isCommonClassProperty) = false  (isCommonClassProperty)
attribute.primaryKey  (isPrimaryKey) = false  (isPrimaryKey)
attribute.adaptorValueConversionMethodName = $attribute.adaptorValueConversionMethodName
attribute.factoryMethodArgumentType = $attribute.factoryMethodArgumentType
attribute.valueFactoryMethodName = $attribute.valueFactoryMethodName
attribute.readFormat = $attribute.readFormat
attribute.writeFormat = $attribute.writeFormat
attribute.referenceFailures = []
attribute.referencingFlattenedAttributes = []
attribute.referencingRelationships = $attribute.referencingRelationships
**DOCUMENTATION
//attribute.documentation =
 </pre> 
 */
/**
@return String was $attribute.documentation
*/
  public String code() {
    return (String) storedValueForKey(_Privilege.CODE_KEY);
  }

  public void setCode(String value) {
    log.debug( "updating code from {} to {}", code(), value);
    takeStoredValueForKey(value, _Privilege.CODE_KEY);
  }

/*
<h2>documentation for: name</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = Name
attribute.uppercaseUnderscoreName = NAME
attribute.fullyQualifiedName = CohortUser/Privilege/attr: name
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = name
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = true
attribute.prototype = [EOAttribute: varchar50]
attribute.externalType = VARCHAR2
attribute.precision = $attribute.precision
attribute.scale = $attribute.scale
attribute.width = 50
attribute.serverTimeZone = $attribute.serverTimeZone
attribute.prototyped  (isPrototyped) = true  (isPrototyped)
attribute.flattened  (isFlattened) = false  (isFlattened)
attribute.inherited  (isInherited) = false  (isInherited)
attribute.readOnly  (isReadOnly) = $attribute.readOnly  (isReadOnly)
attribute.indexed  (isIndexed) = $attribute.indexed  (isIndexed)
attribute.classProperty  (isClassProperty) = true  (isClassProperty)
attribute.clientClassProperty  (isClientClassProperty) = false  (isClientClassProperty)
attribute.commonClassProperty  (isCommonClassProperty) = false  (isCommonClassProperty)
attribute.primaryKey  (isPrimaryKey) = false  (isPrimaryKey)
attribute.adaptorValueConversionMethodName = $attribute.adaptorValueConversionMethodName
attribute.factoryMethodArgumentType = $attribute.factoryMethodArgumentType
attribute.valueFactoryMethodName = $attribute.valueFactoryMethodName
attribute.readFormat = $attribute.readFormat
attribute.writeFormat = $attribute.writeFormat
attribute.referenceFailures = []
attribute.referencingFlattenedAttributes = []
attribute.referencingRelationships = $attribute.referencingRelationships
**DOCUMENTATION
//attribute.documentation =
 </pre> 
 */
/**
@return String was $attribute.documentation
*/
  public String name() {
    return (String) storedValueForKey(_Privilege.NAME_KEY);
  }

  public void setName(String value) {
    log.debug( "updating name from {} to {}", name(), value);
    takeStoredValueForKey(value, _Privilege.NAME_KEY);
  }

/*
<h2>documentation for: publicID</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = PublicID
attribute.uppercaseUnderscoreName = PUBLIC_ID
attribute.fullyQualifiedName = CohortUser/Privilege/attr: publicID
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = publicID
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = true
attribute.prototype = [EOAttribute: varchar100]
attribute.externalType = VARCHAR2
attribute.precision = $attribute.precision
attribute.scale = $attribute.scale
attribute.width = 100
attribute.serverTimeZone = $attribute.serverTimeZone
attribute.prototyped  (isPrototyped) = true  (isPrototyped)
attribute.flattened  (isFlattened) = false  (isFlattened)
attribute.inherited  (isInherited) = false  (isInherited)
attribute.readOnly  (isReadOnly) = $attribute.readOnly  (isReadOnly)
attribute.indexed  (isIndexed) = $attribute.indexed  (isIndexed)
attribute.classProperty  (isClassProperty) = true  (isClassProperty)
attribute.clientClassProperty  (isClientClassProperty) = false  (isClientClassProperty)
attribute.commonClassProperty  (isCommonClassProperty) = false  (isCommonClassProperty)
attribute.primaryKey  (isPrimaryKey) = false  (isPrimaryKey)
attribute.adaptorValueConversionMethodName = $attribute.adaptorValueConversionMethodName
attribute.factoryMethodArgumentType = $attribute.factoryMethodArgumentType
attribute.valueFactoryMethodName = $attribute.valueFactoryMethodName
attribute.readFormat = $attribute.readFormat
attribute.writeFormat = $attribute.writeFormat
attribute.referenceFailures = []
attribute.referencingFlattenedAttributes = []
attribute.referencingRelationships = $attribute.referencingRelationships
**DOCUMENTATION
//attribute.documentation =
 </pre> 
 */
/**
@return String was $attribute.documentation
*/
  public String publicID() {
    return (String) storedValueForKey(_Privilege.PUBLIC_ID_KEY);
  }

  public void setPublicID(String value) {
    log.debug( "updating publicID from {} to {}", publicID(), value);
    takeStoredValueForKey(value, _Privilege.PUBLIC_ID_KEY);
  }



  public static Privilege createPrivilege(EOEditingContext editingContext, String code
, String name
, String publicID
) {
    Privilege eo = (Privilege) EOUtilities.createAndInsertInstance(editingContext, _Privilege.ENTITY_NAME);
    eo.setCode(code);
    eo.setName(name);
    eo.setPublicID(publicID);
    return eo;
  }

  public static ERXFetchSpecification<Privilege> fetchSpec() {
    return new ERXFetchSpecification<Privilege>(_Privilege.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Privilege> fetchAllPrivileges(EOEditingContext editingContext) {
    return _Privilege.fetchAllPrivileges(editingContext, null);
  }

  public static NSArray<Privilege> fetchAllPrivileges(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Privilege.fetchPrivileges(editingContext, null, sortOrderings);
  }

  public static NSArray<Privilege> fetchPrivileges(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Privilege> fetchSpec = new ERXFetchSpecification<Privilege>(_Privilege.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<Privilege> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Privilege fetchPrivilege(EOEditingContext editingContext, String keyName, Object value) {
    return _Privilege.fetchPrivilege(editingContext, ERXQ.equals(keyName, value));
  }

  public static Privilege fetchPrivilege(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Privilege> eoObjects = _Privilege.fetchPrivileges(editingContext, qualifier, null);
    Privilege eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Privilege that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Privilege fetchRequiredPrivilege(EOEditingContext editingContext, String keyName, Object value) {
    return _Privilege.fetchRequiredPrivilege(editingContext, ERXQ.equals(keyName, value));
  }

  public static Privilege fetchRequiredPrivilege(EOEditingContext editingContext, EOQualifier qualifier) {
    Privilege eoObject = _Privilege.fetchPrivilege(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Privilege that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Privilege localInstanceIn(EOEditingContext editingContext, Privilege eo) {
    Privilege localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

//FetchSpecification

//Custom method for SIMED
  public void cleanup() {
}

	public void validateData() {
		log.warn("start validating attribute for Privilege");
		problems().addObjectsFromArray(codeValidate());
		problems().addObjectsFromArray(nameValidate());
		problems().addObjectsFromArray(publicIDValidate());
		log.warn("end validating attribute for Privilege");

	//Relationship Validation
		log.warn("start validating relationship for Privilege");
		log.warn("end validating relationship for Privilege");
	}
	


	private String codeErrorKey = "code";

	public ValidationProblemList codeValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.code() == null){
			problems.add(new ValidationProblem(codeErrorKey, "code can't be null", Validator.ErrorLevel("NULL")));
		}
		if(codeValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : codeValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, CODE_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String nameErrorKey = "name";

	public ValidationProblemList nameValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.name() == null){
			problems.add(new ValidationProblem(nameErrorKey, "name can't be null", Validator.ErrorLevel("NULL")));
		}
		if(nameValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : nameValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, NAME_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String publicIDErrorKey = "publicID";

	public ValidationProblemList publicIDValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.publicID() == null){
			problems.add(new ValidationProblem(publicIDErrorKey, "publicID can't be null", Validator.ErrorLevel("NULL")));
		}
		if(publicIDValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : publicIDValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, PUBLIC_ID_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

//utilityMethod to add style for highliting error
	public String codeErrorStyle() {
		return "code_error code_warn";
	}

	public String nameErrorStyle() {
		return "name_error name_warn";
	}

	public String publicIDErrorStyle() {
		return "publicID_error publicID_warn";
	}


//utilityMethod to know if the red point should be displayed
//unanswered
//null value
	public boolean codeDisplayRedPoint() {
		if(this.code() == null){
			return true;
		}
		return false;
	}
	
	public boolean nameDisplayRedPoint() {
		if(this.name() == null){
			return true;
		}
		return false;
	}
	
	public boolean publicIDDisplayRedPoint() {
		if(this.publicID() == null){
			return true;
		}
		return false;
	}
	

//utilityMethod to rreturn the min and max value from the rangeValidator if needed
//unanswered
//null value
//for attribute: 'code'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'name'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'publicID'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = 
//Base utility 
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _codeValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators codeValidators() {
		if(_codeValidators == null) {
			_codeValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _codeValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _nameValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators nameValidators() {
		if(_nameValidators == null) {
			_nameValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _nameValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _publicIDValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators publicIDValidators() {
		if(_publicIDValidators == null) {
			_publicIDValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _publicIDValidators;
	}

}
