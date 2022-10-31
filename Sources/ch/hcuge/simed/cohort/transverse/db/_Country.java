// DO NOT EDIT.  Make changes to Country.java instead.
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
public abstract class _Country extends ch.hcuge.simed.foundation.eo.SimedEnterpriseObject {
  public static final String ENTITY_NAME = "Country";

  // Attribute Keys
  public static final ERXKey<String> ENGLISH_NAME = new ERXKey<String>("englishName");
  public static final ERXKey<String> LONG_CODE = new ERXKey<String>("longCode");
  public static final ERXKey<String> SHORT_CODE = new ERXKey<String>("shortCode");

  // Relationship Keys
  public static final ERXKey<ch.hcuge.simed.cohort.transverse.db.Center> CENTERS = new ERXKey<ch.hcuge.simed.cohort.transverse.db.Center>("centers");

  // Attributes
  public static final String ENGLISH_NAME_KEY = ENGLISH_NAME.key();
  public static final String LONG_CODE_KEY = LONG_CODE.key();
  public static final String SHORT_CODE_KEY = SHORT_CODE.key();

  // Relationships
  public static final String CENTERS_KEY = CENTERS.key();

  private static final Logger log = LoggerFactory.getLogger(_Country.class);

  public Country localInstanceIn(EOEditingContext editingContext) {
    Country localInstance = (Country)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

/*
<h2>documentation for: englishName</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = EnglishName
attribute.uppercaseUnderscoreName = ENGLISH_NAME
attribute.fullyQualifiedName = CohortUser/Country/attr: englishName
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = englishName
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
  public String englishName() {
    return (String) storedValueForKey(_Country.ENGLISH_NAME_KEY);
  }

  public void setEnglishName(String value) {
    log.debug( "updating englishName from {} to {}", englishName(), value);
    takeStoredValueForKey(value, _Country.ENGLISH_NAME_KEY);
  }

/*
<h2>documentation for: longCode</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = LongCode
attribute.uppercaseUnderscoreName = LONG_CODE
attribute.fullyQualifiedName = CohortUser/Country/attr: longCode
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = longCode
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = true
attribute.prototype = [EOAttribute: varchar10]
attribute.externalType = VARCHAR2
attribute.precision = $attribute.precision
attribute.scale = $attribute.scale
attribute.width = 3
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
  public String longCode() {
    return (String) storedValueForKey(_Country.LONG_CODE_KEY);
  }

  public void setLongCode(String value) {
    log.debug( "updating longCode from {} to {}", longCode(), value);
    takeStoredValueForKey(value, _Country.LONG_CODE_KEY);
  }

/*
<h2>documentation for: shortCode</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = ShortCode
attribute.uppercaseUnderscoreName = SHORT_CODE
attribute.fullyQualifiedName = CohortUser/Country/attr: shortCode
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = shortCode
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = true
attribute.prototype = [EOAttribute: varchar10]
attribute.externalType = VARCHAR2
attribute.precision = $attribute.precision
attribute.scale = $attribute.scale
attribute.width = 2
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
  public String shortCode() {
    return (String) storedValueForKey(_Country.SHORT_CODE_KEY);
  }

  public void setShortCode(String value) {
    log.debug( "updating shortCode from {} to {}", shortCode(), value);
    takeStoredValueForKey(value, _Country.SHORT_CODE_KEY);
  }


//RELATIONSHIP sortedClassToManyRelationships
//relationship.name = centers
//relationship.classNameWithDefault = ${relationship.classNameWithDefault}
//relationship.uppercaseUnderscoreName = CENTERS
//relationship.capitalizedName = Centers
//relationship.flattened = false
//relationship.inherited = false
//relationship.mandatory = ${relationship.mandatory}
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
//relationship.inverseRelationship.name = country
//relationship.inverseRelationship.classNameWithDefault = ${relationship.inverseRelationship.classNameWithDefault}
//relationship.inverseRelationship.uppercaseUnderscoreName = COUNTRY
//relationship.inverseRelationship.capitalizedName = Country
//relationship.inverseRelationship.flattened = false
//relationship.inverseRelationship.inherited = false
//relationship.inverseRelationship.mandatory = true
//relationship.inverseRelationship.genericRecord = ${relationship.inverseRelationship.genericRecord}
//relationship.inverseRelationship.ownsDestination = ${relationship.inverseRelationship.ownsDestination}
//relationship.inverseRelationship.propagatesPrimaryKey = ${relationship.inverseRelationship.propagatesPrimaryKey}
//relationship.inverseRelationship.userInfo = {}
//optionalToOne [centers] will be public
	//NOT inherited
  public NSArray<ch.hcuge.simed.cohort.transverse.db.Center> centers() {
	  //R01
    return (NSArray<ch.hcuge.simed.cohort.transverse.db.Center>)storedValueForKey(_Country.CENTERS_KEY);
  }

	public NSArray<ch.hcuge.simed.cohort.transverse.db.Center> centers(EOQualifier qualifier) {
	  //R03
    return centers(qualifier, null, false);
  }

	public NSArray<ch.hcuge.simed.cohort.transverse.db.Center> centers(EOQualifier qualifier, boolean fetch) {
	  //R04
    return centers(qualifier, null, fetch);
  }

  public NSArray<ch.hcuge.simed.cohort.transverse.db.Center> centers(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
	  //R05
    NSArray<ch.hcuge.simed.cohort.transverse.db.Center> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = ERXQ.equals(ch.hcuge.simed.cohort.transverse.db.Center.COUNTRY_KEY, this);

      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        fullQualifier = ERXQ.and(qualifier, inverseQualifier);
      }

      results = ch.hcuge.simed.cohort.transverse.db.Center.fetchCenters(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = centers();
      if (qualifier != null) {
        results = (NSArray<ch.hcuge.simed.cohort.transverse.db.Center>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<ch.hcuge.simed.cohort.transverse.db.Center>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }

  public void addToCenters(ch.hcuge.simed.cohort.transverse.db.Center object) {
	  //R06
    includeObjectIntoPropertyWithKey(object, _Country.CENTERS_KEY);
  }

  public void removeFromCenters(ch.hcuge.simed.cohort.transverse.db.Center object) {
	  //R07
    excludeObjectFromPropertyWithKey(object, _Country.CENTERS_KEY);
  }

  public void addToCentersRelationship(ch.hcuge.simed.cohort.transverse.db.Center object) {
	  //R08
    log.debug("adding {} to centers relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToCenters(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _Country.CENTERS_KEY);
    }
  }

  public void removeFromCentersRelationship(ch.hcuge.simed.cohort.transverse.db.Center object) {
	  //R09
    log.debug("removing {} from centers relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromCenters(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _Country.CENTERS_KEY);
    }
  }

  public ch.hcuge.simed.cohort.transverse.db.Center createCentersRelationship() {
	  //R10
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  ch.hcuge.simed.cohort.transverse.db.Center.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _Country.CENTERS_KEY);
    return (ch.hcuge.simed.cohort.transverse.db.Center) eo;
  }

  public void deleteCentersRelationship(ch.hcuge.simed.cohort.transverse.db.Center object) {
	  //R11
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Country.CENTERS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllCentersRelationships() {
	  //R12
    Enumeration<ch.hcuge.simed.cohort.transverse.db.Center> objects = centers().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteCentersRelationship(objects.nextElement());
    }
  }


  public static Country createCountry(EOEditingContext editingContext, String englishName
, String longCode
, String shortCode
) {
    Country eo = (Country) EOUtilities.createAndInsertInstance(editingContext, _Country.ENTITY_NAME);
    eo.setEnglishName(englishName);
    eo.setLongCode(longCode);
    eo.setShortCode(shortCode);
    return eo;
  }

  public static ERXFetchSpecification<Country> fetchSpec() {
    return new ERXFetchSpecification<Country>(_Country.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Country> fetchAllCountries(EOEditingContext editingContext) {
    return _Country.fetchAllCountries(editingContext, null);
  }

  public static NSArray<Country> fetchAllCountries(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Country.fetchCountries(editingContext, null, sortOrderings);
  }

  public static NSArray<Country> fetchCountries(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Country> fetchSpec = new ERXFetchSpecification<Country>(_Country.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<Country> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Country fetchCountry(EOEditingContext editingContext, String keyName, Object value) {
    return _Country.fetchCountry(editingContext, ERXQ.equals(keyName, value));
  }

  public static Country fetchCountry(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Country> eoObjects = _Country.fetchCountries(editingContext, qualifier, null);
    Country eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Country that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Country fetchRequiredCountry(EOEditingContext editingContext, String keyName, Object value) {
    return _Country.fetchRequiredCountry(editingContext, ERXQ.equals(keyName, value));
  }

  public static Country fetchRequiredCountry(EOEditingContext editingContext, EOQualifier qualifier) {
    Country eoObject = _Country.fetchCountry(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Country that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Country localInstanceIn(EOEditingContext editingContext, Country eo) {
    Country localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
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
		log.warn("start validating attribute for Country");
		problems().addObjectsFromArray(englishNameValidate());
		problems().addObjectsFromArray(longCodeValidate());
		problems().addObjectsFromArray(shortCodeValidate());
		log.warn("end validating attribute for Country");

	//Relationship Validation
		log.warn("start validating relationship for Country");
		log.warn("end validating relationship for Country");
	}
	


	private String englishNameErrorKey = "englishName";

	public ValidationProblemList englishNameValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.englishName() == null){
			problems.add(new ValidationProblem(englishNameErrorKey, "englishName can't be null", Validator.ErrorLevel("NULL")));
		}
		if(englishNameValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : englishNameValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, ENGLISH_NAME_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String longCodeErrorKey = "longCode";

	public ValidationProblemList longCodeValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.longCode() == null){
			problems.add(new ValidationProblem(longCodeErrorKey, "longCode can't be null", Validator.ErrorLevel("NULL")));
		}
		if(longCodeValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : longCodeValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, LONG_CODE_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String shortCodeErrorKey = "shortCode";

	public ValidationProblemList shortCodeValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.shortCode() == null){
			problems.add(new ValidationProblem(shortCodeErrorKey, "shortCode can't be null", Validator.ErrorLevel("NULL")));
		}
		if(shortCodeValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : shortCodeValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, SHORT_CODE_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

//utilityMethod to add style for highliting error
	public String englishNameErrorStyle() {
		return "englishName_error englishName_warn";
	}

	public String longCodeErrorStyle() {
		return "longCode_error longCode_warn";
	}

	public String shortCodeErrorStyle() {
		return "shortCode_error shortCode_warn";
	}


//utilityMethod to know if the red point should be displayed
//unanswered
//null value
	public boolean englishNameDisplayRedPoint() {
		if(this.englishName() == null){
			return true;
		}
		return false;
	}
	
	public boolean longCodeDisplayRedPoint() {
		if(this.longCode() == null){
			return true;
		}
		return false;
	}
	
	public boolean shortCodeDisplayRedPoint() {
		if(this.shortCode() == null){
			return true;
		}
		return false;
	}
	

//utilityMethod to rreturn the min and max value from the rangeValidator if needed
//unanswered
//null value
//for attribute: 'englishName'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'longCode'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'shortCode'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = 
//Base utility 
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _englishNameValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators englishNameValidators() {
		if(_englishNameValidators == null) {
			_englishNameValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _englishNameValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _longCodeValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators longCodeValidators() {
		if(_longCodeValidators == null) {
			_longCodeValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _longCodeValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _shortCodeValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators shortCodeValidators() {
		if(_shortCodeValidators == null) {
			_shortCodeValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _shortCodeValidators;
	}

}
