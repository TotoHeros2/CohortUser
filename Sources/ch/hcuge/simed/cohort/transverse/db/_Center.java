// DO NOT EDIT.  Make changes to Center.java instead.
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
public abstract class _Center extends ch.hcuge.simed.foundation.eo.SimedEnterpriseObject {
  public static final String ENTITY_NAME = "Center";

  // Attribute Keys
  public static final ERXKey<String> ADDRESS = new ERXKey<String>("address");
  public static final ERXKey<String> CITY = new ERXKey<String>("city");
  public static final ERXKey<String> CODE = new ERXKey<String>("code");
  public static final ERXKey<String> NAME = new ERXKey<String>("name");
  public static final ERXKey<String> POSTAL_CODE = new ERXKey<String>("postalCode");
  public static final ERXKey<String> PUBLIC_ID = new ERXKey<String>("publicID");

  // Relationship Keys
  public static final ERXKey<ch.hcuge.simed.cohort.transverse.db.Country> COUNTRY = new ERXKey<ch.hcuge.simed.cohort.transverse.db.Country>("country");

  // Attributes
  public static final String ADDRESS_KEY = ADDRESS.key();
  public static final String CITY_KEY = CITY.key();
  public static final String CODE_KEY = CODE.key();
  public static final String NAME_KEY = NAME.key();
  public static final String POSTAL_CODE_KEY = POSTAL_CODE.key();
  public static final String PUBLIC_ID_KEY = PUBLIC_ID.key();

  // Relationships
  public static final String COUNTRY_KEY = COUNTRY.key();

  private static final Logger log = LoggerFactory.getLogger(_Center.class);

  public Center localInstanceIn(EOEditingContext editingContext) {
    Center localInstance = (Center)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

/*
<h2>documentation for: address</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = Address
attribute.uppercaseUnderscoreName = ADDRESS
attribute.fullyQualifiedName = CohortUser/Center/attr: address
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = address
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
  public String address() {
    return (String) storedValueForKey(_Center.ADDRESS_KEY);
  }

  public void setAddress(String value) {
    log.debug( "updating address from {} to {}", address(), value);
    takeStoredValueForKey(value, _Center.ADDRESS_KEY);
  }

/*
<h2>documentation for: city</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = City
attribute.uppercaseUnderscoreName = CITY
attribute.fullyQualifiedName = CohortUser/Center/attr: city
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = city
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
  public String city() {
    return (String) storedValueForKey(_Center.CITY_KEY);
  }

  public void setCity(String value) {
    log.debug( "updating city from {} to {}", city(), value);
    takeStoredValueForKey(value, _Center.CITY_KEY);
  }

/*
<h2>documentation for: code</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = Code
attribute.uppercaseUnderscoreName = CODE
attribute.fullyQualifiedName = CohortUser/Center/attr: code
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
    return (String) storedValueForKey(_Center.CODE_KEY);
  }

  public void setCode(String value) {
    log.debug( "updating code from {} to {}", code(), value);
    takeStoredValueForKey(value, _Center.CODE_KEY);
  }

/*
<h2>documentation for: name</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = Name
attribute.uppercaseUnderscoreName = NAME
attribute.fullyQualifiedName = CohortUser/Center/attr: name
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
    return (String) storedValueForKey(_Center.NAME_KEY);
  }

  public void setName(String value) {
    log.debug( "updating name from {} to {}", name(), value);
    takeStoredValueForKey(value, _Center.NAME_KEY);
  }

/*
<h2>documentation for: postalCode</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = PostalCode
attribute.uppercaseUnderscoreName = POSTAL_CODE
attribute.fullyQualifiedName = CohortUser/Center/attr: postalCode
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = postalCode
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
  public String postalCode() {
    return (String) storedValueForKey(_Center.POSTAL_CODE_KEY);
  }

  public void setPostalCode(String value) {
    log.debug( "updating postalCode from {} to {}", postalCode(), value);
    takeStoredValueForKey(value, _Center.POSTAL_CODE_KEY);
  }

/*
<h2>documentation for: publicID</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = PublicID
attribute.uppercaseUnderscoreName = PUBLIC_ID
attribute.fullyQualifiedName = CohortUser/Center/attr: publicID
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
    return (String) storedValueForKey(_Center.PUBLIC_ID_KEY);
  }

  public void setPublicID(String value) {
    log.debug( "updating publicID from {} to {}", publicID(), value);
    takeStoredValueForKey(value, _Center.PUBLIC_ID_KEY);
  }


//RELATIONSHIP TO_ONE_SORTED (sortedClassToOneRelationships)
//relationship.name = country
//relationship.classNameWithDefault = ${relationship.classNameWithDefault}
//relationship.uppercaseUnderscoreName = COUNTRY
//relationship.capitalizedName = Country
//relationship.flattened = false
//relationship.inherited = false
//relationship.mandatory = true
//relationship.genericRecord = ${relationship.genericRecord}
//relationship.ownsDestination = ${relationship.ownsDestination}
//relationship.propagatesPrimaryKey = ${relationship.propagatesPrimaryKey}
//relationship.userInfo = {}
//ACTUAL_DESTINATION
//relationship.actualDestination.name = Country
//relationship.actualDestination.classNameWithDefault = ch.hcuge.simed.cohort.transverse.db.Country
//relationship.actualDestination.uppercaseUnderscoreName = ${relationship.actualDestination.uppercaseUnderscoreName}
//relationship.actualDestination.capitalizedName = ${relationship.actualDestination.capitalizedName}
//relationship.actualDestination.flattened = ${relationship.actualDestination.flattened}
//relationship.actualDestination.inherited = false
//relationship.actualDestination.mandatory = ${relationship.actualDestination.mandatory}
//relationship.actualDestination.genericRecord = false
//relationship.actualDestination.ownsDestination = ${relationship.actualDestination.ownsDestination}
//relationship.actualDestination.propagatesPrimaryKey = ${relationship.actualDestination.propagatesPrimaryKey}
//relationship.actualDestination.userInfo = {}
//attrName for Country is englishName
//attrName for Country is id
//attrName for Country is longCode
//attrName for Country is shortCode
//INVERSE
//relationship.inverseRelationship.name = centers
//relationship.inverseRelationship.classNameWithDefault = ${relationship.inverseRelationship.classNameWithDefault}
//relationship.inverseRelationship.uppercaseUnderscoreName = CENTERS
//relationship.inverseRelationship.capitalizedName = Centers
//relationship.inverseRelationship.flattened = false
//relationship.inverseRelationship.inherited = false
//relationship.inverseRelationship.mandatory = ${relationship.inverseRelationship.mandatory}
//relationship.inverseRelationship.genericRecord = ${relationship.inverseRelationship.genericRecord}
//relationship.inverseRelationship.ownsDestination = ${relationship.inverseRelationship.ownsDestination}
//relationship.inverseRelationship.propagatesPrimaryKey = ${relationship.inverseRelationship.propagatesPrimaryKey}
//relationship.inverseRelationship.userInfo = {}
  public ch.hcuge.simed.cohort.transverse.db.Country country() {
    return (ch.hcuge.simed.cohort.transverse.db.Country)storedValueForKey(_Center.COUNTRY_KEY);
  }

  public void setCountry(ch.hcuge.simed.cohort.transverse.db.Country value) {
    takeStoredValueForKey(value, _Center.COUNTRY_KEY);
  }

  public void setCountryRelationship(ch.hcuge.simed.cohort.transverse.db.Country value) {
    log.debug("updating country from {} to {}", country(), value);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      setCountry(value);
    }
    else if (value == null) {
      ch.hcuge.simed.cohort.transverse.db.Country oldValue = country();
      if (oldValue != null) {
        removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Center.COUNTRY_KEY);
      }
    } else {
      addObjectToBothSidesOfRelationshipWithKey(value, _Center.COUNTRY_KEY);
    }
  }


  public static Center createCenter(EOEditingContext editingContext, String address
, String city
, String code
, String name
, String postalCode
, String publicID
//RELATIONSHIP TO_ONE_2 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
, ch.hcuge.simed.cohort.transverse.db.Country country) {
    Center eo = (Center) EOUtilities.createAndInsertInstance(editingContext, _Center.ENTITY_NAME);
    eo.setAddress(address);
    eo.setCity(city);
    eo.setCode(code);
    eo.setName(name);
    eo.setPostalCode(postalCode);
    eo.setPublicID(publicID);
//RELATIONSHIP TO_ONE_3 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
    eo.setCountryRelationship(country);
    return eo;
  }

  public static ERXFetchSpecification<Center> fetchSpec() {
    return new ERXFetchSpecification<Center>(_Center.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Center> fetchAllCenters(EOEditingContext editingContext) {
    return _Center.fetchAllCenters(editingContext, null);
  }

  public static NSArray<Center> fetchAllCenters(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Center.fetchCenters(editingContext, null, sortOrderings);
  }

  public static NSArray<Center> fetchCenters(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Center> fetchSpec = new ERXFetchSpecification<Center>(_Center.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<Center> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Center fetchCenter(EOEditingContext editingContext, String keyName, Object value) {
    return _Center.fetchCenter(editingContext, ERXQ.equals(keyName, value));
  }

  public static Center fetchCenter(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Center> eoObjects = _Center.fetchCenters(editingContext, qualifier, null);
    Center eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Center that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Center fetchRequiredCenter(EOEditingContext editingContext, String keyName, Object value) {
    return _Center.fetchRequiredCenter(editingContext, ERXQ.equals(keyName, value));
  }

  public static Center fetchRequiredCenter(EOEditingContext editingContext, EOQualifier qualifier) {
    Center eoObject = _Center.fetchCenter(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Center that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Center localInstanceIn(EOEditingContext editingContext, Center eo) {
    Center localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
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
		log.warn("start validating attribute for Center");
		problems().addObjectsFromArray(addressValidate());
		problems().addObjectsFromArray(cityValidate());
		problems().addObjectsFromArray(codeValidate());
		problems().addObjectsFromArray(nameValidate());
		problems().addObjectsFromArray(postalCodeValidate());
		problems().addObjectsFromArray(publicIDValidate());
		log.warn("end validating attribute for Center");

	//Relationship Validation
		log.warn("start validating relationship for Center");
		log.warn("end validating relationship for Center");
	}
	


	private String addressErrorKey = "address";

	public ValidationProblemList addressValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.address() == null){
			problems.add(new ValidationProblem(addressErrorKey, "address can't be null", Validator.ErrorLevel("NULL")));
		}
		if(addressValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : addressValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, ADDRESS_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String cityErrorKey = "city";

	public ValidationProblemList cityValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.city() == null){
			problems.add(new ValidationProblem(cityErrorKey, "city can't be null", Validator.ErrorLevel("NULL")));
		}
		if(cityValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : cityValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, CITY_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
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

	private String postalCodeErrorKey = "postalCode";

	public ValidationProblemList postalCodeValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.postalCode() == null){
			problems.add(new ValidationProblem(postalCodeErrorKey, "postalCode can't be null", Validator.ErrorLevel("NULL")));
		}
		if(postalCodeValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : postalCodeValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, POSTAL_CODE_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
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
	public String addressErrorStyle() {
		return "address_error address_warn";
	}

	public String cityErrorStyle() {
		return "city_error city_warn";
	}

	public String codeErrorStyle() {
		return "code_error code_warn";
	}

	public String nameErrorStyle() {
		return "name_error name_warn";
	}

	public String postalCodeErrorStyle() {
		return "postalCode_error postalCode_warn";
	}

	public String publicIDErrorStyle() {
		return "publicID_error publicID_warn";
	}


//utilityMethod to know if the red point should be displayed
//unanswered
//null value
	public boolean addressDisplayRedPoint() {
		if(this.address() == null){
			return true;
		}
		return false;
	}
	
	public boolean cityDisplayRedPoint() {
		if(this.city() == null){
			return true;
		}
		return false;
	}
	
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
	
	public boolean postalCodeDisplayRedPoint() {
		if(this.postalCode() == null){
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
//for attribute: 'address'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'city'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'code'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'name'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'postalCode'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'publicID'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = 
//Base utility 
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _addressValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators addressValidators() {
		if(_addressValidators == null) {
			_addressValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _addressValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _cityValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators cityValidators() {
		if(_cityValidators == null) {
			_cityValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _cityValidators;
	}
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
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _postalCodeValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators postalCodeValidators() {
		if(_postalCodeValidators == null) {
			_postalCodeValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _postalCodeValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _publicIDValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators publicIDValidators() {
		if(_publicIDValidators == null) {
			_publicIDValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _publicIDValidators;
	}

}
