// DO NOT EDIT.  Make changes to Role.java instead.
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
public abstract class _Role extends ch.hcuge.simed.foundation.eo.SimedEnterpriseObject {
  public static final String ENTITY_NAME = "Role";

  // Attribute Keys
  public static final ERXKey<String> CODE = new ERXKey<String>("code");
  public static final ERXKey<String> NAME = new ERXKey<String>("name");
  public static final ERXKey<String> PUBLIC_ID = new ERXKey<String>("publicID");

  // Relationship Keys
  public static final ERXKey<ch.hcuge.simed.cohort.transverse.db.Privilege> PRIVILEGES = new ERXKey<ch.hcuge.simed.cohort.transverse.db.Privilege>("privileges");

  // Attributes
  public static final String CODE_KEY = CODE.key();
  public static final String NAME_KEY = NAME.key();
  public static final String PUBLIC_ID_KEY = PUBLIC_ID.key();

  // Relationships
  public static final String PRIVILEGES_KEY = PRIVILEGES.key();

  private static final Logger log = LoggerFactory.getLogger(_Role.class);

  public Role localInstanceIn(EOEditingContext editingContext) {
    Role localInstance = (Role)EOUtilities.localInstanceOfObject(editingContext, this);
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
attribute.fullyQualifiedName = CohortUser/Role/attr: code
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
    return (String) storedValueForKey(_Role.CODE_KEY);
  }

  public void setCode(String value) {
    log.debug( "updating code from {} to {}", code(), value);
    takeStoredValueForKey(value, _Role.CODE_KEY);
  }

/*
<h2>documentation for: name</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = Name
attribute.uppercaseUnderscoreName = NAME
attribute.fullyQualifiedName = CohortUser/Role/attr: name
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
    return (String) storedValueForKey(_Role.NAME_KEY);
  }

  public void setName(String value) {
    log.debug( "updating name from {} to {}", name(), value);
    takeStoredValueForKey(value, _Role.NAME_KEY);
  }

/*
<h2>documentation for: publicID</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = PublicID
attribute.uppercaseUnderscoreName = PUBLIC_ID
attribute.fullyQualifiedName = CohortUser/Role/attr: publicID
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
    return (String) storedValueForKey(_Role.PUBLIC_ID_KEY);
  }

  public void setPublicID(String value) {
    log.debug( "updating publicID from {} to {}", publicID(), value);
    takeStoredValueForKey(value, _Role.PUBLIC_ID_KEY);
  }


//RELATIONSHIP sortedClassToManyRelationships
//relationship.name = privileges
//relationship.classNameWithDefault = ${relationship.classNameWithDefault}
//relationship.uppercaseUnderscoreName = PRIVILEGES
//relationship.capitalizedName = Privileges
//relationship.flattened = true
//relationship.inherited = false
//relationship.mandatory = ${relationship.mandatory}
//relationship.genericRecord = ${relationship.genericRecord}
//relationship.ownsDestination = ${relationship.ownsDestination}
//relationship.propagatesPrimaryKey = ${relationship.propagatesPrimaryKey}
//relationship.userInfo = {}
//ACTUAL_DESTINATION
//relationship.actualDestination.name = Privilege
//relationship.actualDestination.classNameWithDefault = ch.hcuge.simed.cohort.transverse.db.Privilege
//relationship.actualDestination.uppercaseUnderscoreName = ${relationship.actualDestination.uppercaseUnderscoreName}
//relationship.actualDestination.capitalizedName = ${relationship.actualDestination.capitalizedName}
//relationship.actualDestination.flattened = ${relationship.actualDestination.flattened}
//relationship.actualDestination.inherited = false
//relationship.actualDestination.mandatory = ${relationship.actualDestination.mandatory}
//relationship.actualDestination.genericRecord = false
//relationship.actualDestination.ownsDestination = ${relationship.actualDestination.ownsDestination}
//relationship.actualDestination.propagatesPrimaryKey = ${relationship.actualDestination.propagatesPrimaryKey}
//relationship.actualDestination.userInfo = {}
//attrName for Privilege is code
//attrName for Privilege is id
//attrName for Privilege is name
//attrName for Privilege is publicID
//INVERSE
//relationship.inverseRelationship.name = ${relationship.inverseRelationship.name}
//relationship.inverseRelationship.classNameWithDefault = ${relationship.inverseRelationship.classNameWithDefault}
//relationship.inverseRelationship.uppercaseUnderscoreName = ${relationship.inverseRelationship.uppercaseUnderscoreName}
//relationship.inverseRelationship.capitalizedName = ${relationship.inverseRelationship.capitalizedName}
//relationship.inverseRelationship.flattened = ${relationship.inverseRelationship.flattened}
//relationship.inverseRelationship.inherited = ${relationship.inverseRelationship.inherited}
//relationship.inverseRelationship.mandatory = ${relationship.inverseRelationship.mandatory}
//relationship.inverseRelationship.genericRecord = ${relationship.inverseRelationship.genericRecord}
//relationship.inverseRelationship.ownsDestination = ${relationship.inverseRelationship.ownsDestination}
//relationship.inverseRelationship.propagatesPrimaryKey = ${relationship.inverseRelationship.propagatesPrimaryKey}
//relationship.inverseRelationship.userInfo = ${relationship.inverseRelationship.userInfo}
//optionalToOne [privileges] will be public
	//NOT inherited
  public NSArray<ch.hcuge.simed.cohort.transverse.db.Privilege> privileges() {
	  //R01
    return (NSArray<ch.hcuge.simed.cohort.transverse.db.Privilege>)storedValueForKey(_Role.PRIVILEGES_KEY);
  }

  public NSArray<ch.hcuge.simed.cohort.transverse.db.Privilege> privileges(EOQualifier qualifier) {
    //R02
    return privileges(qualifier, null);
  }

  public NSArray<ch.hcuge.simed.cohort.transverse.db.Privilege> privileges(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
	  //R05
    NSArray<ch.hcuge.simed.cohort.transverse.db.Privilege> results;
      results = privileges();
      if (qualifier != null) {
        results = (NSArray<ch.hcuge.simed.cohort.transverse.db.Privilege>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<ch.hcuge.simed.cohort.transverse.db.Privilege>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }

  public void addToPrivileges(ch.hcuge.simed.cohort.transverse.db.Privilege object) {
	  //R06
    includeObjectIntoPropertyWithKey(object, _Role.PRIVILEGES_KEY);
  }

  public void removeFromPrivileges(ch.hcuge.simed.cohort.transverse.db.Privilege object) {
	  //R07
    excludeObjectFromPropertyWithKey(object, _Role.PRIVILEGES_KEY);
  }

  public void addToPrivilegesRelationship(ch.hcuge.simed.cohort.transverse.db.Privilege object) {
	  //R08
    log.debug("adding {} to privileges relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToPrivileges(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _Role.PRIVILEGES_KEY);
    }
  }

  public void removeFromPrivilegesRelationship(ch.hcuge.simed.cohort.transverse.db.Privilege object) {
	  //R09
    log.debug("removing {} from privileges relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromPrivileges(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _Role.PRIVILEGES_KEY);
    }
  }

  public ch.hcuge.simed.cohort.transverse.db.Privilege createPrivilegesRelationship() {
	  //R10
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  ch.hcuge.simed.cohort.transverse.db.Privilege.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _Role.PRIVILEGES_KEY);
    return (ch.hcuge.simed.cohort.transverse.db.Privilege) eo;
  }

  public void deletePrivilegesRelationship(ch.hcuge.simed.cohort.transverse.db.Privilege object) {
	  //R11
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Role.PRIVILEGES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPrivilegesRelationships() {
	  //R12
    Enumeration<ch.hcuge.simed.cohort.transverse.db.Privilege> objects = privileges().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePrivilegesRelationship(objects.nextElement());
    }
  }


  public static Role createRole(EOEditingContext editingContext, String code
, String name
, String publicID
) {
    Role eo = (Role) EOUtilities.createAndInsertInstance(editingContext, _Role.ENTITY_NAME);
    eo.setCode(code);
    eo.setName(name);
    eo.setPublicID(publicID);
    return eo;
  }

  public static ERXFetchSpecification<Role> fetchSpec() {
    return new ERXFetchSpecification<Role>(_Role.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Role> fetchAllRoles(EOEditingContext editingContext) {
    return _Role.fetchAllRoles(editingContext, null);
  }

  public static NSArray<Role> fetchAllRoles(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Role.fetchRoles(editingContext, null, sortOrderings);
  }

  public static NSArray<Role> fetchRoles(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Role> fetchSpec = new ERXFetchSpecification<Role>(_Role.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<Role> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Role fetchRole(EOEditingContext editingContext, String keyName, Object value) {
    return _Role.fetchRole(editingContext, ERXQ.equals(keyName, value));
  }

  public static Role fetchRole(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Role> eoObjects = _Role.fetchRoles(editingContext, qualifier, null);
    Role eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Role that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Role fetchRequiredRole(EOEditingContext editingContext, String keyName, Object value) {
    return _Role.fetchRequiredRole(editingContext, ERXQ.equals(keyName, value));
  }

  public static Role fetchRequiredRole(EOEditingContext editingContext, EOQualifier qualifier) {
    Role eoObject = _Role.fetchRole(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Role that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Role localInstanceIn(EOEditingContext editingContext, Role eo) {
    Role localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
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
		log.warn("start validating attribute for Role");
		problems().addObjectsFromArray(codeValidate());
		problems().addObjectsFromArray(nameValidate());
		problems().addObjectsFromArray(publicIDValidate());
		log.warn("end validating attribute for Role");

	//Relationship Validation
		log.warn("start validating relationship for Role");
		log.warn("end validating relationship for Role");
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
