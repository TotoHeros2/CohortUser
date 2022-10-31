// DO NOT EDIT.  Make changes to WorkPosition.java instead.
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
public abstract class _WorkPosition extends ch.hcuge.simed.foundation.eo.SimedEnterpriseObject {
  public static final String ENTITY_NAME = "WorkPosition";

  // Attribute Keys
  public static final ERXKey<String> PUBLIC_ID = new ERXKey<String>("publicID");

  // Relationship Keys
  public static final ERXKey<ch.hcuge.simed.cohort.transverse.db.Role> ROLE = new ERXKey<ch.hcuge.simed.cohort.transverse.db.Role>("role");
  public static final ERXKey<ch.hcuge.simed.cohort.transverse.db.Center> WORK_LOCATION = new ERXKey<ch.hcuge.simed.cohort.transverse.db.Center>("workLocation");

  // Attributes
  public static final String PUBLIC_ID_KEY = PUBLIC_ID.key();

  // Relationships
  public static final String ROLE_KEY = ROLE.key();
  public static final String WORK_LOCATION_KEY = WORK_LOCATION.key();

  private static final Logger log = LoggerFactory.getLogger(_WorkPosition.class);

  public WorkPosition localInstanceIn(EOEditingContext editingContext) {
    WorkPosition localInstance = (WorkPosition)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

/*
<h2>documentation for: publicID</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = PublicID
attribute.uppercaseUnderscoreName = PUBLIC_ID
attribute.fullyQualifiedName = CohortUser/WorkPosition/attr: publicID
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
    return (String) storedValueForKey(_WorkPosition.PUBLIC_ID_KEY);
  }

  public void setPublicID(String value) {
    log.debug( "updating publicID from {} to {}", publicID(), value);
    takeStoredValueForKey(value, _WorkPosition.PUBLIC_ID_KEY);
  }


//RELATIONSHIP TO_ONE_SORTED (sortedClassToOneRelationships)
//relationship.name = role
//relationship.classNameWithDefault = ${relationship.classNameWithDefault}
//relationship.uppercaseUnderscoreName = ROLE
//relationship.capitalizedName = Role
//relationship.flattened = false
//relationship.inherited = false
//relationship.mandatory = true
//relationship.genericRecord = ${relationship.genericRecord}
//relationship.ownsDestination = ${relationship.ownsDestination}
//relationship.propagatesPrimaryKey = ${relationship.propagatesPrimaryKey}
//relationship.userInfo = {}
//ACTUAL_DESTINATION
//relationship.actualDestination.name = Role
//relationship.actualDestination.classNameWithDefault = ch.hcuge.simed.cohort.transverse.db.Role
//relationship.actualDestination.uppercaseUnderscoreName = ${relationship.actualDestination.uppercaseUnderscoreName}
//relationship.actualDestination.capitalizedName = ${relationship.actualDestination.capitalizedName}
//relationship.actualDestination.flattened = ${relationship.actualDestination.flattened}
//relationship.actualDestination.inherited = false
//relationship.actualDestination.mandatory = ${relationship.actualDestination.mandatory}
//relationship.actualDestination.genericRecord = false
//relationship.actualDestination.ownsDestination = ${relationship.actualDestination.ownsDestination}
//relationship.actualDestination.propagatesPrimaryKey = ${relationship.actualDestination.propagatesPrimaryKey}
//relationship.actualDestination.userInfo = {}
//attrName for Role is code
//attrName for Role is id
//attrName for Role is name
//attrName for Role is publicID
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
  public ch.hcuge.simed.cohort.transverse.db.Role role() {
    return (ch.hcuge.simed.cohort.transverse.db.Role)storedValueForKey(_WorkPosition.ROLE_KEY);
  }

  public void setRole(ch.hcuge.simed.cohort.transverse.db.Role value) {
    takeStoredValueForKey(value, _WorkPosition.ROLE_KEY);
  }

  public void setRoleRelationship(ch.hcuge.simed.cohort.transverse.db.Role value) {
    log.debug("updating role from {} to {}", role(), value);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      setRole(value);
    }
    else if (value == null) {
      ch.hcuge.simed.cohort.transverse.db.Role oldValue = role();
      if (oldValue != null) {
        removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _WorkPosition.ROLE_KEY);
      }
    } else {
      addObjectToBothSidesOfRelationshipWithKey(value, _WorkPosition.ROLE_KEY);
    }
  }

//RELATIONSHIP TO_ONE_SORTED (sortedClassToOneRelationships)
//relationship.name = workLocation
//relationship.classNameWithDefault = ${relationship.classNameWithDefault}
//relationship.uppercaseUnderscoreName = WORK_LOCATION
//relationship.capitalizedName = WorkLocation
//relationship.flattened = false
//relationship.inherited = false
//relationship.mandatory = true
//relationship.genericRecord = ${relationship.genericRecord}
//relationship.ownsDestination = ${relationship.ownsDestination}
//relationship.propagatesPrimaryKey = ${relationship.propagatesPrimaryKey}
//relationship.userInfo = {}
//ACTUAL_DESTINATION
//relationship.actualDestination.name = Center
//relationship.actualDestination.classNameWithDefault = ch.hcuge.simed.cohort.transverse.db.Center
//relationship.actualDestination.uppercaseUnderscoreName = ${relationship.actualDestination.uppercaseUnderscoreName}
//relationship.actualDestination.capitalizedName = ${relationship.actualDestination.capitalizedName}
//relationship.actualDestination.flattened = ${relationship.actualDestination.flattened}
//relationship.actualDestination.inherited = false
//relationship.actualDestination.mandatory = ${relationship.actualDestination.mandatory}
//relationship.actualDestination.genericRecord = false
//relationship.actualDestination.ownsDestination = ${relationship.actualDestination.ownsDestination}
//relationship.actualDestination.propagatesPrimaryKey = ${relationship.actualDestination.propagatesPrimaryKey}
//relationship.actualDestination.userInfo = {}
//attrName for Center is address
//attrName for Center is city
//attrName for Center is code
//attrName for Center is countryID
//attrName for Center is id
//attrName for Center is name
//attrName for Center is postalCode
//attrName for Center is publicID
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
  public ch.hcuge.simed.cohort.transverse.db.Center workLocation() {
    return (ch.hcuge.simed.cohort.transverse.db.Center)storedValueForKey(_WorkPosition.WORK_LOCATION_KEY);
  }

  public void setWorkLocation(ch.hcuge.simed.cohort.transverse.db.Center value) {
    takeStoredValueForKey(value, _WorkPosition.WORK_LOCATION_KEY);
  }

  public void setWorkLocationRelationship(ch.hcuge.simed.cohort.transverse.db.Center value) {
    log.debug("updating workLocation from {} to {}", workLocation(), value);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      setWorkLocation(value);
    }
    else if (value == null) {
      ch.hcuge.simed.cohort.transverse.db.Center oldValue = workLocation();
      if (oldValue != null) {
        removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _WorkPosition.WORK_LOCATION_KEY);
      }
    } else {
      addObjectToBothSidesOfRelationshipWithKey(value, _WorkPosition.WORK_LOCATION_KEY);
    }
  }


  public static WorkPosition createWorkPosition(EOEditingContext editingContext, String publicID
//RELATIONSHIP TO_ONE_2 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
, ch.hcuge.simed.cohort.transverse.db.Role role//RELATIONSHIP TO_ONE_2 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
, ch.hcuge.simed.cohort.transverse.db.Center workLocation) {
    WorkPosition eo = (WorkPosition) EOUtilities.createAndInsertInstance(editingContext, _WorkPosition.ENTITY_NAME);
    eo.setPublicID(publicID);
//RELATIONSHIP TO_ONE_3 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
    eo.setRoleRelationship(role);
//RELATIONSHIP TO_ONE_3 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
    eo.setWorkLocationRelationship(workLocation);
    return eo;
  }

  public static ERXFetchSpecification<WorkPosition> fetchSpec() {
    return new ERXFetchSpecification<WorkPosition>(_WorkPosition.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<WorkPosition> fetchAllWorkPositions(EOEditingContext editingContext) {
    return _WorkPosition.fetchAllWorkPositions(editingContext, null);
  }

  public static NSArray<WorkPosition> fetchAllWorkPositions(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _WorkPosition.fetchWorkPositions(editingContext, null, sortOrderings);
  }

  public static NSArray<WorkPosition> fetchWorkPositions(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<WorkPosition> fetchSpec = new ERXFetchSpecification<WorkPosition>(_WorkPosition.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<WorkPosition> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static WorkPosition fetchWorkPosition(EOEditingContext editingContext, String keyName, Object value) {
    return _WorkPosition.fetchWorkPosition(editingContext, ERXQ.equals(keyName, value));
  }

  public static WorkPosition fetchWorkPosition(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<WorkPosition> eoObjects = _WorkPosition.fetchWorkPositions(editingContext, qualifier, null);
    WorkPosition eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one WorkPosition that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static WorkPosition fetchRequiredWorkPosition(EOEditingContext editingContext, String keyName, Object value) {
    return _WorkPosition.fetchRequiredWorkPosition(editingContext, ERXQ.equals(keyName, value));
  }

  public static WorkPosition fetchRequiredWorkPosition(EOEditingContext editingContext, EOQualifier qualifier) {
    WorkPosition eoObject = _WorkPosition.fetchWorkPosition(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no WorkPosition that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static WorkPosition localInstanceIn(EOEditingContext editingContext, WorkPosition eo) {
    WorkPosition localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
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
		log.warn("start validating attribute for WorkPosition");
		problems().addObjectsFromArray(publicIDValidate());
		log.warn("end validating attribute for WorkPosition");

	//Relationship Validation
		log.warn("start validating relationship for WorkPosition");
		log.warn("end validating relationship for WorkPosition");
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
	public String publicIDErrorStyle() {
		return "publicID_error publicID_warn";
	}


//utilityMethod to know if the red point should be displayed
//unanswered
//null value
	public boolean publicIDDisplayRedPoint() {
		if(this.publicID() == null){
			return true;
		}
		return false;
	}
	

//utilityMethod to rreturn the min and max value from the rangeValidator if needed
//unanswered
//null value
//for attribute: 'publicID'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = 
//Base utility 
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _publicIDValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators publicIDValidators() {
		if(_publicIDValidators == null) {
			_publicIDValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _publicIDValidators;
	}

}
