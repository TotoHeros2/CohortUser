// DO NOT EDIT.  Make changes to OldPassHash.java instead.
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
public abstract class _OldPassHash extends ch.hcuge.simed.foundation.eo.SimedEnterpriseObject {
  public static final String ENTITY_NAME = "OldPassHash";

  // Attribute Keys
  public static final ERXKey<NSTimestamp> CREATION_DATE = new ERXKey<NSTimestamp>("creationDate");
  public static final ERXKey<String> HASH = new ERXKey<String>("hash");
  public static final ERXKey<String> PUBLIC_ID = new ERXKey<String>("publicID");

  // Relationship Keys
  public static final ERXKey<ch.hcuge.simed.cohort.transverse.db.SimedUser> SIMED_USER = new ERXKey<ch.hcuge.simed.cohort.transverse.db.SimedUser>("simedUser");

  // Attributes
  public static final String CREATION_DATE_KEY = CREATION_DATE.key();
  public static final String HASH_KEY = HASH.key();
  public static final String PUBLIC_ID_KEY = PUBLIC_ID.key();

  // Relationships
  public static final String SIMED_USER_KEY = SIMED_USER.key();

  private static final Logger log = LoggerFactory.getLogger(_OldPassHash.class);

  public OldPassHash localInstanceIn(EOEditingContext editingContext) {
    OldPassHash localInstance = (OldPassHash)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

/*
<h2>documentation for: creationDate</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: NSTimestamp
attribute.capitalizedName = CreationDate
attribute.uppercaseUnderscoreName = CREATION_DATE
attribute.fullyQualifiedName = CohortUser/OldPassHash/attr: creationDate
**CLASS
attribute.javaClassName = NSTimestamp
attribute.valueClassName = NSCalendarDate
attribute.valueType = T
**PROPERTIES
attribute.columnName = creationDate
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = false
attribute.prototype = [EOAttribute: dateTime]
attribute.externalType = Timestamp
attribute.precision = $attribute.precision
attribute.scale = $attribute.scale
attribute.width = $attribute.width
attribute.serverTimeZone = Europe/Zurich
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
@return NSTimestamp was $attribute.documentation
*/
  public NSTimestamp creationDate() {
    return (NSTimestamp) storedValueForKey(_OldPassHash.CREATION_DATE_KEY);
  }

  public void setCreationDate(NSTimestamp value) {
    log.debug( "updating creationDate from {} to {}", creationDate(), value);
    takeStoredValueForKey(value, _OldPassHash.CREATION_DATE_KEY);
  }

/*
<h2>documentation for: hash</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = Hash
attribute.uppercaseUnderscoreName = HASH
attribute.fullyQualifiedName = CohortUser/OldPassHash/attr: hash
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = hash
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = false
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
  public String hash() {
    return (String) storedValueForKey(_OldPassHash.HASH_KEY);
  }

  public void setHash(String value) {
    log.debug( "updating hash from {} to {}", hash(), value);
    takeStoredValueForKey(value, _OldPassHash.HASH_KEY);
  }

/*
<h2>documentation for: publicID</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = PublicID
attribute.uppercaseUnderscoreName = PUBLIC_ID
attribute.fullyQualifiedName = CohortUser/OldPassHash/attr: publicID
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
    return (String) storedValueForKey(_OldPassHash.PUBLIC_ID_KEY);
  }

  public void setPublicID(String value) {
    log.debug( "updating publicID from {} to {}", publicID(), value);
    takeStoredValueForKey(value, _OldPassHash.PUBLIC_ID_KEY);
  }


//RELATIONSHIP TO_ONE_SORTED (sortedClassToOneRelationships)
//relationship.name = simedUser
//relationship.classNameWithDefault = ${relationship.classNameWithDefault}
//relationship.uppercaseUnderscoreName = SIMED_USER
//relationship.capitalizedName = SimedUser
//relationship.flattened = false
//relationship.inherited = false
//relationship.mandatory = true
//relationship.genericRecord = ${relationship.genericRecord}
//relationship.ownsDestination = ${relationship.ownsDestination}
//relationship.propagatesPrimaryKey = ${relationship.propagatesPrimaryKey}
//relationship.userInfo = {}
//ACTUAL_DESTINATION
//relationship.actualDestination.name = SimedUser
//relationship.actualDestination.classNameWithDefault = ch.hcuge.simed.cohort.transverse.db.SimedUser
//relationship.actualDestination.uppercaseUnderscoreName = ${relationship.actualDestination.uppercaseUnderscoreName}
//relationship.actualDestination.capitalizedName = ${relationship.actualDestination.capitalizedName}
//relationship.actualDestination.flattened = ${relationship.actualDestination.flattened}
//relationship.actualDestination.inherited = false
//relationship.actualDestination.mandatory = ${relationship.actualDestination.mandatory}
//relationship.actualDestination.genericRecord = false
//relationship.actualDestination.ownsDestination = ${relationship.actualDestination.ownsDestination}
//relationship.actualDestination.propagatesPrimaryKey = ${relationship.actualDestination.propagatesPrimaryKey}
//relationship.actualDestination.userInfo = {}
//attrName for SimedUser is canUseAuditTrail
//attrName for SimedUser is canUseSampleManager
//attrName for SimedUser is currentWorkPositionID
//attrName for SimedUser is email
//attrName for SimedUser is firstName
//attrName for SimedUser is id
//attrName for SimedUser is isActive
//attrName for SimedUser is lastName
//attrName for SimedUser is login
//attrName for SimedUser is passwordHash
//attrName for SimedUser is publicID
//attrName for SimedUser is urlParam
//INVERSE
//relationship.inverseRelationship.name = oldPassHashs
//relationship.inverseRelationship.classNameWithDefault = ${relationship.inverseRelationship.classNameWithDefault}
//relationship.inverseRelationship.uppercaseUnderscoreName = OLD_PASS_HASHS
//relationship.inverseRelationship.capitalizedName = OldPassHashs
//relationship.inverseRelationship.flattened = false
//relationship.inverseRelationship.inherited = false
//relationship.inverseRelationship.mandatory = ${relationship.inverseRelationship.mandatory}
//relationship.inverseRelationship.genericRecord = ${relationship.inverseRelationship.genericRecord}
//relationship.inverseRelationship.ownsDestination = ${relationship.inverseRelationship.ownsDestination}
//relationship.inverseRelationship.propagatesPrimaryKey = ${relationship.inverseRelationship.propagatesPrimaryKey}
//relationship.inverseRelationship.userInfo = {}
  public ch.hcuge.simed.cohort.transverse.db.SimedUser simedUser() {
    return (ch.hcuge.simed.cohort.transverse.db.SimedUser)storedValueForKey(_OldPassHash.SIMED_USER_KEY);
  }

  public void setSimedUser(ch.hcuge.simed.cohort.transverse.db.SimedUser value) {
    takeStoredValueForKey(value, _OldPassHash.SIMED_USER_KEY);
  }

  public void setSimedUserRelationship(ch.hcuge.simed.cohort.transverse.db.SimedUser value) {
    log.debug("updating simedUser from {} to {}", simedUser(), value);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      setSimedUser(value);
    }
    else if (value == null) {
      ch.hcuge.simed.cohort.transverse.db.SimedUser oldValue = simedUser();
      if (oldValue != null) {
        removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _OldPassHash.SIMED_USER_KEY);
      }
    } else {
      addObjectToBothSidesOfRelationshipWithKey(value, _OldPassHash.SIMED_USER_KEY);
    }
  }


  public static OldPassHash createOldPassHash(EOEditingContext editingContext, NSTimestamp creationDate
, String hash
, String publicID
//RELATIONSHIP TO_ONE_2 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
, ch.hcuge.simed.cohort.transverse.db.SimedUser simedUser) {
    OldPassHash eo = (OldPassHash) EOUtilities.createAndInsertInstance(editingContext, _OldPassHash.ENTITY_NAME);
    eo.setCreationDate(creationDate);
    eo.setHash(hash);
    eo.setPublicID(publicID);
//RELATIONSHIP TO_ONE_3 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
    eo.setSimedUserRelationship(simedUser);
    return eo;
  }

  public static ERXFetchSpecification<OldPassHash> fetchSpec() {
    return new ERXFetchSpecification<OldPassHash>(_OldPassHash.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<OldPassHash> fetchAllOldPassHashs(EOEditingContext editingContext) {
    return _OldPassHash.fetchAllOldPassHashs(editingContext, null);
  }

  public static NSArray<OldPassHash> fetchAllOldPassHashs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _OldPassHash.fetchOldPassHashs(editingContext, null, sortOrderings);
  }

  public static NSArray<OldPassHash> fetchOldPassHashs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<OldPassHash> fetchSpec = new ERXFetchSpecification<OldPassHash>(_OldPassHash.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<OldPassHash> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static OldPassHash fetchOldPassHash(EOEditingContext editingContext, String keyName, Object value) {
    return _OldPassHash.fetchOldPassHash(editingContext, ERXQ.equals(keyName, value));
  }

  public static OldPassHash fetchOldPassHash(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<OldPassHash> eoObjects = _OldPassHash.fetchOldPassHashs(editingContext, qualifier, null);
    OldPassHash eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one OldPassHash that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static OldPassHash fetchRequiredOldPassHash(EOEditingContext editingContext, String keyName, Object value) {
    return _OldPassHash.fetchRequiredOldPassHash(editingContext, ERXQ.equals(keyName, value));
  }

  public static OldPassHash fetchRequiredOldPassHash(EOEditingContext editingContext, EOQualifier qualifier) {
    OldPassHash eoObject = _OldPassHash.fetchOldPassHash(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no OldPassHash that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static OldPassHash localInstanceIn(EOEditingContext editingContext, OldPassHash eo) {
    OldPassHash localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
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
		log.warn("start validating attribute for OldPassHash");
		problems().addObjectsFromArray(creationDateValidate());
		problems().addObjectsFromArray(hashValidate());
		problems().addObjectsFromArray(publicIDValidate());
		log.warn("end validating attribute for OldPassHash");

	//Relationship Validation
		log.warn("start validating relationship for OldPassHash");
		log.warn("end validating relationship for OldPassHash");
	}
	


	private String creationDateErrorKey = "creationDate";

	public ValidationProblemList creationDateValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.creationDate() == null){
			problems.add(new ValidationProblem(creationDateErrorKey, "creationDate can't be null", Validator.ErrorLevel("NULL")));
		}
		if(creationDateValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : creationDateValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, CREATION_DATE_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String hashErrorKey = "hash";

	public ValidationProblemList hashValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.hash() == null){
			problems.add(new ValidationProblem(hashErrorKey, "hash can't be null", Validator.ErrorLevel("NULL")));
		}
		if(hashValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : hashValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, HASH_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
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
	public String creationDateErrorStyle() {
		return "creationDate_error creationDate_warn";
	}

	public String hashErrorStyle() {
		return "hash_error hash_warn";
	}

	public String publicIDErrorStyle() {
		return "publicID_error publicID_warn";
	}


//utilityMethod to know if the red point should be displayed
//unanswered
//null value
	public boolean creationDateDisplayRedPoint() {
		if(this.creationDate() == null){
			return true;
		}
		return false;
	}
	
	public boolean hashDisplayRedPoint() {
		if(this.hash() == null){
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
//for attribute: 'creationDate'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'hash'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'publicID'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = 
//Base utility 
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _creationDateValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators creationDateValidators() {
		if(_creationDateValidators == null) {
			_creationDateValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _creationDateValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _hashValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators hashValidators() {
		if(_hashValidators == null) {
			_hashValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _hashValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _publicIDValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators publicIDValidators() {
		if(_publicIDValidators == null) {
			_publicIDValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _publicIDValidators;
	}

}
