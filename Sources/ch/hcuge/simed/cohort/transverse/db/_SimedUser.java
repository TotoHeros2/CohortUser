// DO NOT EDIT.  Make changes to SimedUser.java instead.
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
public abstract class _SimedUser extends ch.hcuge.simed.foundation.eo.SimedEnterpriseObject {
  public static final String ENTITY_NAME = "SimedUser";

  // Attribute Keys
  public static final ERXKey<Boolean> CAN_USE_AUDIT_TRAIL = new ERXKey<Boolean>("canUseAuditTrail");
  public static final ERXKey<Boolean> CAN_USE_SAMPLE_MANAGER = new ERXKey<Boolean>("canUseSampleManager");
  public static final ERXKey<String> EMAIL = new ERXKey<String>("email");
  public static final ERXKey<String> FIRST_NAME = new ERXKey<String>("firstName");
  public static final ERXKey<Boolean> IS_ACTIVE = new ERXKey<Boolean>("isActive");
  public static final ERXKey<String> LAST_NAME = new ERXKey<String>("lastName");
  public static final ERXKey<String> LOGIN = new ERXKey<String>("login");
  public static final ERXKey<String> PASSWORD_HASH = new ERXKey<String>("passwordHash");
  public static final ERXKey<String> PUBLIC_ID = new ERXKey<String>("publicID");
  public static final ERXKey<String> URL_PARAM = new ERXKey<String>("urlParam");

  // Relationship Keys
  public static final ERXKey<ch.hcuge.simed.cohort.transverse.db.WorkPosition> CURRENT_WORK_POSITION = new ERXKey<ch.hcuge.simed.cohort.transverse.db.WorkPosition>("currentWorkPosition");
  public static final ERXKey<ch.hcuge.simed.cohort.transverse.db.OldPassHash> OLD_PASS_HASHS = new ERXKey<ch.hcuge.simed.cohort.transverse.db.OldPassHash>("oldPassHashs");
  public static final ERXKey<ch.hcuge.simed.cohort.transverse.db.WorkPosition> WORK_POSITIONS = new ERXKey<ch.hcuge.simed.cohort.transverse.db.WorkPosition>("workPositions");

  // Attributes
  public static final String CAN_USE_AUDIT_TRAIL_KEY = CAN_USE_AUDIT_TRAIL.key();
  public static final String CAN_USE_SAMPLE_MANAGER_KEY = CAN_USE_SAMPLE_MANAGER.key();
  public static final String EMAIL_KEY = EMAIL.key();
  public static final String FIRST_NAME_KEY = FIRST_NAME.key();
  public static final String IS_ACTIVE_KEY = IS_ACTIVE.key();
  public static final String LAST_NAME_KEY = LAST_NAME.key();
  public static final String LOGIN_KEY = LOGIN.key();
  public static final String PASSWORD_HASH_KEY = PASSWORD_HASH.key();
  public static final String PUBLIC_ID_KEY = PUBLIC_ID.key();
  public static final String URL_PARAM_KEY = URL_PARAM.key();

  // Relationships
  public static final String CURRENT_WORK_POSITION_KEY = CURRENT_WORK_POSITION.key();
  public static final String OLD_PASS_HASHS_KEY = OLD_PASS_HASHS.key();
  public static final String WORK_POSITIONS_KEY = WORK_POSITIONS.key();

  private static final Logger log = LoggerFactory.getLogger(_SimedUser.class);

  public SimedUser localInstanceIn(EOEditingContext editingContext) {
    SimedUser localInstance = (SimedUser)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

/*
<h2>documentation for: canUseAuditTrail</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: Boolean
attribute.capitalizedName = CanUseAuditTrail
attribute.uppercaseUnderscoreName = CAN_USE_AUDIT_TRAIL
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: canUseAuditTrail
**CLASS
attribute.javaClassName = Boolean
attribute.valueClassName = NSNumber
attribute.valueType = c
**PROPERTIES
attribute.columnName = canUseAuditTrail
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = true
attribute.usedForLocking = false
attribute.prototype = [EOAttribute: intBoolean]
attribute.externalType = NUMBER
attribute.precision = $attribute.precision
attribute.scale = $attribute.scale
attribute.width = $attribute.width
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
attribute.adaptorValueConversionMethodName = toString
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
@return Boolean was $attribute.documentation
*/
  public Boolean canUseAuditTrail() {
    return (Boolean) storedValueForKey(_SimedUser.CAN_USE_AUDIT_TRAIL_KEY);
  }

  public void setCanUseAuditTrail(Boolean value) {
    log.debug( "updating canUseAuditTrail from {} to {}", canUseAuditTrail(), value);
    takeStoredValueForKey(value, _SimedUser.CAN_USE_AUDIT_TRAIL_KEY);
  }

/*
<h2>documentation for: canUseSampleManager</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: Boolean
attribute.capitalizedName = CanUseSampleManager
attribute.uppercaseUnderscoreName = CAN_USE_SAMPLE_MANAGER
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: canUseSampleManager
**CLASS
attribute.javaClassName = Boolean
attribute.valueClassName = NSNumber
attribute.valueType = c
**PROPERTIES
attribute.columnName = canUseSampleManager
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = true
attribute.usedForLocking = false
attribute.prototype = [EOAttribute: intBoolean]
attribute.externalType = NUMBER
attribute.precision = $attribute.precision
attribute.scale = $attribute.scale
attribute.width = $attribute.width
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
attribute.adaptorValueConversionMethodName = toString
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
@return Boolean was $attribute.documentation
*/
  public Boolean canUseSampleManager() {
    return (Boolean) storedValueForKey(_SimedUser.CAN_USE_SAMPLE_MANAGER_KEY);
  }

  public void setCanUseSampleManager(Boolean value) {
    log.debug( "updating canUseSampleManager from {} to {}", canUseSampleManager(), value);
    takeStoredValueForKey(value, _SimedUser.CAN_USE_SAMPLE_MANAGER_KEY);
  }

/*
<h2>documentation for: email</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = Email
attribute.uppercaseUnderscoreName = EMAIL
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: email
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = email
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = false
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
  public String email() {
    return (String) storedValueForKey(_SimedUser.EMAIL_KEY);
  }

  public void setEmail(String value) {
    log.debug( "updating email from {} to {}", email(), value);
    takeStoredValueForKey(value, _SimedUser.EMAIL_KEY);
  }

/*
<h2>documentation for: firstName</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = FirstName
attribute.uppercaseUnderscoreName = FIRST_NAME
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: firstName
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = firstName
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = false
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
  public String firstName() {
    return (String) storedValueForKey(_SimedUser.FIRST_NAME_KEY);
  }

  public void setFirstName(String value) {
    log.debug( "updating firstName from {} to {}", firstName(), value);
    takeStoredValueForKey(value, _SimedUser.FIRST_NAME_KEY);
  }

/*
<h2>documentation for: isActive</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: Boolean
attribute.capitalizedName = IsActive
attribute.uppercaseUnderscoreName = IS_ACTIVE
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: isActive
**CLASS
attribute.javaClassName = Boolean
attribute.valueClassName = NSNumber
attribute.valueType = c
**PROPERTIES
attribute.columnName = isActive
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = true
attribute.prototype = [EOAttribute: intBoolean]
attribute.externalType = NUMBER
attribute.precision = $attribute.precision
attribute.scale = $attribute.scale
attribute.width = $attribute.width
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
attribute.adaptorValueConversionMethodName = toString
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
@return Boolean was $attribute.documentation
*/
  public Boolean isActive() {
    return (Boolean) storedValueForKey(_SimedUser.IS_ACTIVE_KEY);
  }

  public void setIsActive(Boolean value) {
    log.debug( "updating isActive from {} to {}", isActive(), value);
    takeStoredValueForKey(value, _SimedUser.IS_ACTIVE_KEY);
  }

/*
<h2>documentation for: lastName</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = LastName
attribute.uppercaseUnderscoreName = LAST_NAME
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: lastName
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = lastName
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = false
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
  public String lastName() {
    return (String) storedValueForKey(_SimedUser.LAST_NAME_KEY);
  }

  public void setLastName(String value) {
    log.debug( "updating lastName from {} to {}", lastName(), value);
    takeStoredValueForKey(value, _SimedUser.LAST_NAME_KEY);
  }

/*
<h2>documentation for: login</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = Login
attribute.uppercaseUnderscoreName = LOGIN
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: login
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = login
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = $attribute.allowsNull
attribute.usedForLocking = false
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
  public String login() {
    return (String) storedValueForKey(_SimedUser.LOGIN_KEY);
  }

  public void setLogin(String value) {
    log.debug( "updating login from {} to {}", login(), value);
    takeStoredValueForKey(value, _SimedUser.LOGIN_KEY);
  }

/*
<h2>documentation for: passwordHash</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = PasswordHash
attribute.uppercaseUnderscoreName = PASSWORD_HASH
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: passwordHash
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = passwordHash
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = true
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
  public String passwordHash() {
    return (String) storedValueForKey(_SimedUser.PASSWORD_HASH_KEY);
  }

  public void setPasswordHash(String value) {
    log.debug( "updating passwordHash from {} to {}", passwordHash(), value);
    takeStoredValueForKey(value, _SimedUser.PASSWORD_HASH_KEY);
  }

/*
<h2>documentation for: publicID</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = PublicID
attribute.uppercaseUnderscoreName = PUBLIC_ID
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: publicID
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
    return (String) storedValueForKey(_SimedUser.PUBLIC_ID_KEY);
  }

  public void setPublicID(String value) {
    log.debug( "updating publicID from {} to {}", publicID(), value);
    takeStoredValueForKey(value, _SimedUser.PUBLIC_ID_KEY);
  }

/*
<h2>documentation for: urlParam</h2> 
<pre>
-inherited: false
-userInfo: {}
-javaClassName: String
attribute.capitalizedName = UrlParam
attribute.uppercaseUnderscoreName = URL_PARAM
attribute.fullyQualifiedName = CohortUser/SimedUser/attr: urlParam
**CLASS
attribute.javaClassName = String
attribute.valueClassName = NSString
attribute.valueType = $attribute.valueType
**PROPERTIES
attribute.columnName = urlParam
attribute.definition = $attribute.definition
attribute.definitionPath = $attribute.definitionPath
attribute.allowsNull = true
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
  public String urlParam() {
    return (String) storedValueForKey(_SimedUser.URL_PARAM_KEY);
  }

  public void setUrlParam(String value) {
    log.debug( "updating urlParam from {} to {}", urlParam(), value);
    takeStoredValueForKey(value, _SimedUser.URL_PARAM_KEY);
  }


//RELATIONSHIP TO_ONE_SORTED (sortedClassToOneRelationships)
//relationship.name = currentWorkPosition
//relationship.classNameWithDefault = ${relationship.classNameWithDefault}
//relationship.uppercaseUnderscoreName = CURRENT_WORK_POSITION
//relationship.capitalizedName = CurrentWorkPosition
//relationship.flattened = false
//relationship.inherited = false
//relationship.mandatory = ${relationship.mandatory}
//relationship.genericRecord = ${relationship.genericRecord}
//relationship.ownsDestination = ${relationship.ownsDestination}
//relationship.propagatesPrimaryKey = ${relationship.propagatesPrimaryKey}
//relationship.userInfo = {}
//ACTUAL_DESTINATION
//relationship.actualDestination.name = WorkPosition
//relationship.actualDestination.classNameWithDefault = ch.hcuge.simed.cohort.transverse.db.WorkPosition
//relationship.actualDestination.uppercaseUnderscoreName = ${relationship.actualDestination.uppercaseUnderscoreName}
//relationship.actualDestination.capitalizedName = ${relationship.actualDestination.capitalizedName}
//relationship.actualDestination.flattened = ${relationship.actualDestination.flattened}
//relationship.actualDestination.inherited = false
//relationship.actualDestination.mandatory = ${relationship.actualDestination.mandatory}
//relationship.actualDestination.genericRecord = false
//relationship.actualDestination.ownsDestination = ${relationship.actualDestination.ownsDestination}
//relationship.actualDestination.propagatesPrimaryKey = ${relationship.actualDestination.propagatesPrimaryKey}
//relationship.actualDestination.userInfo = {_EntityModeler={generateSource=NO}}
//attrName for WorkPosition is centerID
//attrName for WorkPosition is id
//attrName for WorkPosition is publicID
//attrName for WorkPosition is roleId
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
  public ch.hcuge.simed.cohort.transverse.db.WorkPosition currentWorkPosition() {
    return (ch.hcuge.simed.cohort.transverse.db.WorkPosition)storedValueForKey(_SimedUser.CURRENT_WORK_POSITION_KEY);
  }

  public void setCurrentWorkPosition(ch.hcuge.simed.cohort.transverse.db.WorkPosition value) {
    takeStoredValueForKey(value, _SimedUser.CURRENT_WORK_POSITION_KEY);
  }

  public void setCurrentWorkPositionRelationship(ch.hcuge.simed.cohort.transverse.db.WorkPosition value) {
    log.debug("updating currentWorkPosition from {} to {}", currentWorkPosition(), value);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      setCurrentWorkPosition(value);
    }
    else if (value == null) {
      ch.hcuge.simed.cohort.transverse.db.WorkPosition oldValue = currentWorkPosition();
      if (oldValue != null) {
        removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _SimedUser.CURRENT_WORK_POSITION_KEY);
      }
    } else {
      addObjectToBothSidesOfRelationshipWithKey(value, _SimedUser.CURRENT_WORK_POSITION_KEY);
    }
  }

//RELATIONSHIP sortedClassToManyRelationships
//relationship.name = oldPassHashs
//relationship.classNameWithDefault = ${relationship.classNameWithDefault}
//relationship.uppercaseUnderscoreName = OLD_PASS_HASHS
//relationship.capitalizedName = OldPassHashs
//relationship.flattened = false
//relationship.inherited = false
//relationship.mandatory = ${relationship.mandatory}
//relationship.genericRecord = ${relationship.genericRecord}
//relationship.ownsDestination = ${relationship.ownsDestination}
//relationship.propagatesPrimaryKey = ${relationship.propagatesPrimaryKey}
//relationship.userInfo = {}
//ACTUAL_DESTINATION
//relationship.actualDestination.name = OldPassHash
//relationship.actualDestination.classNameWithDefault = ch.hcuge.simed.cohort.transverse.db.OldPassHash
//relationship.actualDestination.uppercaseUnderscoreName = ${relationship.actualDestination.uppercaseUnderscoreName}
//relationship.actualDestination.capitalizedName = ${relationship.actualDestination.capitalizedName}
//relationship.actualDestination.flattened = ${relationship.actualDestination.flattened}
//relationship.actualDestination.inherited = false
//relationship.actualDestination.mandatory = ${relationship.actualDestination.mandatory}
//relationship.actualDestination.genericRecord = false
//relationship.actualDestination.ownsDestination = ${relationship.actualDestination.ownsDestination}
//relationship.actualDestination.propagatesPrimaryKey = ${relationship.actualDestination.propagatesPrimaryKey}
//relationship.actualDestination.userInfo = {}
//attrName for OldPassHash is creationDate
//attrName for OldPassHash is hash
//attrName for OldPassHash is id
//attrName for OldPassHash is publicID
//attrName for OldPassHash is simedUserID
//INVERSE
//relationship.inverseRelationship.name = simedUser
//relationship.inverseRelationship.classNameWithDefault = ${relationship.inverseRelationship.classNameWithDefault}
//relationship.inverseRelationship.uppercaseUnderscoreName = SIMED_USER
//relationship.inverseRelationship.capitalizedName = SimedUser
//relationship.inverseRelationship.flattened = false
//relationship.inverseRelationship.inherited = false
//relationship.inverseRelationship.mandatory = true
//relationship.inverseRelationship.genericRecord = ${relationship.inverseRelationship.genericRecord}
//relationship.inverseRelationship.ownsDestination = ${relationship.inverseRelationship.ownsDestination}
//relationship.inverseRelationship.propagatesPrimaryKey = ${relationship.inverseRelationship.propagatesPrimaryKey}
//relationship.inverseRelationship.userInfo = {}
//optionalToOne [oldPassHashs] will be public
	//NOT inherited
  public NSArray<ch.hcuge.simed.cohort.transverse.db.OldPassHash> oldPassHashs() {
	  //R01
    return (NSArray<ch.hcuge.simed.cohort.transverse.db.OldPassHash>)storedValueForKey(_SimedUser.OLD_PASS_HASHS_KEY);
  }

	public NSArray<ch.hcuge.simed.cohort.transverse.db.OldPassHash> oldPassHashs(EOQualifier qualifier) {
	  //R03
    return oldPassHashs(qualifier, null, false);
  }

	public NSArray<ch.hcuge.simed.cohort.transverse.db.OldPassHash> oldPassHashs(EOQualifier qualifier, boolean fetch) {
	  //R04
    return oldPassHashs(qualifier, null, fetch);
  }

  public NSArray<ch.hcuge.simed.cohort.transverse.db.OldPassHash> oldPassHashs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
	  //R05
    NSArray<ch.hcuge.simed.cohort.transverse.db.OldPassHash> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = ERXQ.equals(ch.hcuge.simed.cohort.transverse.db.OldPassHash.SIMED_USER_KEY, this);

      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        fullQualifier = ERXQ.and(qualifier, inverseQualifier);
      }

      results = ch.hcuge.simed.cohort.transverse.db.OldPassHash.fetchOldPassHashs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = oldPassHashs();
      if (qualifier != null) {
        results = (NSArray<ch.hcuge.simed.cohort.transverse.db.OldPassHash>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<ch.hcuge.simed.cohort.transverse.db.OldPassHash>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }

  public void addToOldPassHashs(ch.hcuge.simed.cohort.transverse.db.OldPassHash object) {
	  //R06
    includeObjectIntoPropertyWithKey(object, _SimedUser.OLD_PASS_HASHS_KEY);
  }

  public void removeFromOldPassHashs(ch.hcuge.simed.cohort.transverse.db.OldPassHash object) {
	  //R07
    excludeObjectFromPropertyWithKey(object, _SimedUser.OLD_PASS_HASHS_KEY);
  }

  public void addToOldPassHashsRelationship(ch.hcuge.simed.cohort.transverse.db.OldPassHash object) {
	  //R08
    log.debug("adding {} to oldPassHashs relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToOldPassHashs(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _SimedUser.OLD_PASS_HASHS_KEY);
    }
  }

  public void removeFromOldPassHashsRelationship(ch.hcuge.simed.cohort.transverse.db.OldPassHash object) {
	  //R09
    log.debug("removing {} from oldPassHashs relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromOldPassHashs(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _SimedUser.OLD_PASS_HASHS_KEY);
    }
  }

  public ch.hcuge.simed.cohort.transverse.db.OldPassHash createOldPassHashsRelationship() {
	  //R10
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  ch.hcuge.simed.cohort.transverse.db.OldPassHash.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _SimedUser.OLD_PASS_HASHS_KEY);
    return (ch.hcuge.simed.cohort.transverse.db.OldPassHash) eo;
  }

  public void deleteOldPassHashsRelationship(ch.hcuge.simed.cohort.transverse.db.OldPassHash object) {
	  //R11
    removeObjectFromBothSidesOfRelationshipWithKey(object, _SimedUser.OLD_PASS_HASHS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllOldPassHashsRelationships() {
	  //R12
    Enumeration<ch.hcuge.simed.cohort.transverse.db.OldPassHash> objects = oldPassHashs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteOldPassHashsRelationship(objects.nextElement());
    }
  }

//RELATIONSHIP sortedClassToManyRelationships
//relationship.name = workPositions
//relationship.classNameWithDefault = ${relationship.classNameWithDefault}
//relationship.uppercaseUnderscoreName = WORK_POSITIONS
//relationship.capitalizedName = WorkPositions
//relationship.flattened = true
//relationship.inherited = false
//relationship.mandatory = ${relationship.mandatory}
//relationship.genericRecord = ${relationship.genericRecord}
//relationship.ownsDestination = ${relationship.ownsDestination}
//relationship.propagatesPrimaryKey = ${relationship.propagatesPrimaryKey}
//relationship.userInfo = {}
//ACTUAL_DESTINATION
//relationship.actualDestination.name = WorkPosition
//relationship.actualDestination.classNameWithDefault = ch.hcuge.simed.cohort.transverse.db.WorkPosition
//relationship.actualDestination.uppercaseUnderscoreName = ${relationship.actualDestination.uppercaseUnderscoreName}
//relationship.actualDestination.capitalizedName = ${relationship.actualDestination.capitalizedName}
//relationship.actualDestination.flattened = ${relationship.actualDestination.flattened}
//relationship.actualDestination.inherited = false
//relationship.actualDestination.mandatory = ${relationship.actualDestination.mandatory}
//relationship.actualDestination.genericRecord = false
//relationship.actualDestination.ownsDestination = ${relationship.actualDestination.ownsDestination}
//relationship.actualDestination.propagatesPrimaryKey = ${relationship.actualDestination.propagatesPrimaryKey}
//relationship.actualDestination.userInfo = {_EntityModeler={generateSource=NO}}
//attrName for WorkPosition is centerID
//attrName for WorkPosition is id
//attrName for WorkPosition is publicID
//attrName for WorkPosition is roleId
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
//optionalToOne [workPositions] will be public
	//NOT inherited
  public NSArray<ch.hcuge.simed.cohort.transverse.db.WorkPosition> workPositions() {
	  //R01
    return (NSArray<ch.hcuge.simed.cohort.transverse.db.WorkPosition>)storedValueForKey(_SimedUser.WORK_POSITIONS_KEY);
  }

  public NSArray<ch.hcuge.simed.cohort.transverse.db.WorkPosition> workPositions(EOQualifier qualifier) {
    //R02
    return workPositions(qualifier, null);
  }

  public NSArray<ch.hcuge.simed.cohort.transverse.db.WorkPosition> workPositions(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
	  //R05
    NSArray<ch.hcuge.simed.cohort.transverse.db.WorkPosition> results;
      results = workPositions();
      if (qualifier != null) {
        results = (NSArray<ch.hcuge.simed.cohort.transverse.db.WorkPosition>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<ch.hcuge.simed.cohort.transverse.db.WorkPosition>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }

  public void addToWorkPositions(ch.hcuge.simed.cohort.transverse.db.WorkPosition object) {
	  //R06
    includeObjectIntoPropertyWithKey(object, _SimedUser.WORK_POSITIONS_KEY);
  }

  public void removeFromWorkPositions(ch.hcuge.simed.cohort.transverse.db.WorkPosition object) {
	  //R07
    excludeObjectFromPropertyWithKey(object, _SimedUser.WORK_POSITIONS_KEY);
  }

  public void addToWorkPositionsRelationship(ch.hcuge.simed.cohort.transverse.db.WorkPosition object) {
	  //R08
    log.debug("adding {} to workPositions relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToWorkPositions(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _SimedUser.WORK_POSITIONS_KEY);
    }
  }

  public void removeFromWorkPositionsRelationship(ch.hcuge.simed.cohort.transverse.db.WorkPosition object) {
	  //R09
    log.debug("removing {} from workPositions relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromWorkPositions(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _SimedUser.WORK_POSITIONS_KEY);
    }
  }

  public ch.hcuge.simed.cohort.transverse.db.WorkPosition createWorkPositionsRelationship() {
	  //R10
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  ch.hcuge.simed.cohort.transverse.db.WorkPosition.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _SimedUser.WORK_POSITIONS_KEY);
    return (ch.hcuge.simed.cohort.transverse.db.WorkPosition) eo;
  }

  public void deleteWorkPositionsRelationship(ch.hcuge.simed.cohort.transverse.db.WorkPosition object) {
	  //R11
    removeObjectFromBothSidesOfRelationshipWithKey(object, _SimedUser.WORK_POSITIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllWorkPositionsRelationships() {
	  //R12
    Enumeration<ch.hcuge.simed.cohort.transverse.db.WorkPosition> objects = workPositions().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteWorkPositionsRelationship(objects.nextElement());
    }
  }


  public static SimedUser createSimedUser(EOEditingContext editingContext, String email
, String firstName
, Boolean isActive
, String lastName
, String login
, String publicID
//RELATIONSHIP TO_ONE_2 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
) {
    SimedUser eo = (SimedUser) EOUtilities.createAndInsertInstance(editingContext, _SimedUser.ENTITY_NAME);
    eo.setEmail(email);
    eo.setFirstName(firstName);
    eo.setIsActive(isActive);
    eo.setLastName(lastName);
    eo.setLogin(login);
    eo.setPublicID(publicID);
//RELATIONSHIP TO_ONE_3 sortedClassToOneRelationships createObject for relationship.name {relationship.name}
    return eo;
  }

  public static ERXFetchSpecification<SimedUser> fetchSpec() {
    return new ERXFetchSpecification<SimedUser>(_SimedUser.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<SimedUser> fetchAllSimedUsers(EOEditingContext editingContext) {
    return _SimedUser.fetchAllSimedUsers(editingContext, null);
  }

  public static NSArray<SimedUser> fetchAllSimedUsers(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _SimedUser.fetchSimedUsers(editingContext, null, sortOrderings);
  }

  public static NSArray<SimedUser> fetchSimedUsers(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<SimedUser> fetchSpec = new ERXFetchSpecification<SimedUser>(_SimedUser.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<SimedUser> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static SimedUser fetchSimedUser(EOEditingContext editingContext, String keyName, Object value) {
    return _SimedUser.fetchSimedUser(editingContext, ERXQ.equals(keyName, value));
  }

  public static SimedUser fetchSimedUser(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<SimedUser> eoObjects = _SimedUser.fetchSimedUsers(editingContext, qualifier, null);
    SimedUser eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one SimedUser that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static SimedUser fetchRequiredSimedUser(EOEditingContext editingContext, String keyName, Object value) {
    return _SimedUser.fetchRequiredSimedUser(editingContext, ERXQ.equals(keyName, value));
  }

  public static SimedUser fetchRequiredSimedUser(EOEditingContext editingContext, EOQualifier qualifier) {
    SimedUser eoObject = _SimedUser.fetchSimedUser(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no SimedUser that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static SimedUser localInstanceIn(EOEditingContext editingContext, SimedUser eo) {
    SimedUser localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
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
		log.warn("start validating attribute for SimedUser");
		problems().addObjectsFromArray(canUseAuditTrailValidate());
		problems().addObjectsFromArray(canUseSampleManagerValidate());
		problems().addObjectsFromArray(emailValidate());
		problems().addObjectsFromArray(firstNameValidate());
		problems().addObjectsFromArray(isActiveValidate());
		problems().addObjectsFromArray(lastNameValidate());
		problems().addObjectsFromArray(loginValidate());
		problems().addObjectsFromArray(passwordHashValidate());
		problems().addObjectsFromArray(publicIDValidate());
		problems().addObjectsFromArray(urlParamValidate());
		log.warn("end validating attribute for SimedUser");

	//Relationship Validation
		log.warn("start validating relationship for SimedUser");
		log.warn("end validating relationship for SimedUser");
	}
	


	private String canUseAuditTrailErrorKey = "canUseAuditTrail";

	public ValidationProblemList canUseAuditTrailValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(canUseAuditTrailValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : canUseAuditTrailValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, CAN_USE_AUDIT_TRAIL_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String canUseSampleManagerErrorKey = "canUseSampleManager";

	public ValidationProblemList canUseSampleManagerValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(canUseSampleManagerValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : canUseSampleManagerValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, CAN_USE_SAMPLE_MANAGER_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String emailErrorKey = "email";

	public ValidationProblemList emailValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.email() == null){
			problems.add(new ValidationProblem(emailErrorKey, "email can't be null", Validator.ErrorLevel("NULL")));
		}
		if(emailValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : emailValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, EMAIL_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String firstNameErrorKey = "firstName";

	public ValidationProblemList firstNameValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.firstName() == null){
			problems.add(new ValidationProblem(firstNameErrorKey, "firstName can't be null", Validator.ErrorLevel("NULL")));
		}
		if(firstNameValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : firstNameValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, FIRST_NAME_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String isActiveErrorKey = "isActive";

	public ValidationProblemList isActiveValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.isActive() == null){
			problems.add(new ValidationProblem(isActiveErrorKey, "isActive can't be null", Validator.ErrorLevel("NULL")));
		}
		if(isActiveValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : isActiveValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, IS_ACTIVE_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String lastNameErrorKey = "lastName";

	public ValidationProblemList lastNameValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.lastName() == null){
			problems.add(new ValidationProblem(lastNameErrorKey, "lastName can't be null", Validator.ErrorLevel("NULL")));
		}
		if(lastNameValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : lastNameValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, LAST_NAME_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String loginErrorKey = "login";

	public ValidationProblemList loginValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(this.login() == null){
			problems.add(new ValidationProblem(loginErrorKey, "login can't be null", Validator.ErrorLevel("NULL")));
		}
		if(loginValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : loginValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, LOGIN_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

	private String passwordHashErrorKey = "passwordHash";

	public ValidationProblemList passwordHashValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(passwordHashValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : passwordHashValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, PASSWORD_HASH_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
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

	private String urlParamErrorKey = "urlParam";

	public ValidationProblemList urlParamValidate() {
		ValidationProblemList problems = new ValidationProblemList();
		if(urlParamValidators().count() > 0){
			HashMap<Object, Object> constraintMap = new HashMap<Object, Object>();
			AbstractValidator v;
			//We will treat: 
			for (Validator p : urlParamValidators()) {
			
				if(ch.hcuge.simed.foundation.eo.SimedEnterpriseObject.respectDependency(this, p.getDependency())){
			
			
					v = ValidatorFactory.getClass(p.getValidatorName());
					ValidationProblem pb = v.checkForProblem(this, URL_PARAM_KEY, p, Validator.ErrorLevel(p.getValidatorName()));
					if(pb != null) {
						problems.add(pb);
					}
				}
			}
		}
		return problems;
	}

//utilityMethod to add style for highliting error
	public String canUseAuditTrailErrorStyle() {
		return "canUseAuditTrail_error canUseAuditTrail_warn";
	}

	public String canUseSampleManagerErrorStyle() {
		return "canUseSampleManager_error canUseSampleManager_warn";
	}

	public String emailErrorStyle() {
		return "email_error email_warn";
	}

	public String firstNameErrorStyle() {
		return "firstName_error firstName_warn";
	}

	public String isActiveErrorStyle() {
		return "isActive_error isActive_warn";
	}

	public String lastNameErrorStyle() {
		return "lastName_error lastName_warn";
	}

	public String loginErrorStyle() {
		return "login_error login_warn";
	}

	public String passwordHashErrorStyle() {
		return "passwordHash_error passwordHash_warn";
	}

	public String publicIDErrorStyle() {
		return "publicID_error publicID_warn";
	}

	public String urlParamErrorStyle() {
		return "urlParam_error urlParam_warn";
	}


//utilityMethod to know if the red point should be displayed
//unanswered
//null value
	public boolean emailDisplayRedPoint() {
		if(this.email() == null){
			return true;
		}
		return false;
	}
	
	public boolean firstNameDisplayRedPoint() {
		if(this.firstName() == null){
			return true;
		}
		return false;
	}
	
	public boolean isActiveDisplayRedPoint() {
		if(this.isActive() == null){
			return true;
		}
		return false;
	}
	
	public boolean lastNameDisplayRedPoint() {
		if(this.lastName() == null){
			return true;
		}
		return false;
	}
	
	public boolean loginDisplayRedPoint() {
		if(this.login() == null){
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
//for attribute: 'canUseAuditTrail'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'canUseSampleManager'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'email'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'firstName'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'isActive'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'lastName'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'login'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'passwordHash'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'publicID'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = //for attribute: 'urlParam'
//attribute.userInfo.validator = //attribute.javaClassName is 'org.joda.time.LocalDate' = <<>>
//coumpound if = 
//Base utility 
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _canUseAuditTrailValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators canUseAuditTrailValidators() {
		if(_canUseAuditTrailValidators == null) {
			_canUseAuditTrailValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _canUseAuditTrailValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _canUseSampleManagerValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators canUseSampleManagerValidators() {
		if(_canUseSampleManagerValidators == null) {
			_canUseSampleManagerValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _canUseSampleManagerValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _emailValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators emailValidators() {
		if(_emailValidators == null) {
			_emailValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _emailValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _firstNameValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators firstNameValidators() {
		if(_firstNameValidators == null) {
			_firstNameValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _firstNameValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _isActiveValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators isActiveValidators() {
		if(_isActiveValidators == null) {
			_isActiveValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _isActiveValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _lastNameValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators lastNameValidators() {
		if(_lastNameValidators == null) {
			_lastNameValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _lastNameValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _loginValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators loginValidators() {
		if(_loginValidators == null) {
			_loginValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _loginValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _passwordHashValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators passwordHashValidators() {
		if(_passwordHashValidators == null) {
			_passwordHashValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _passwordHashValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _publicIDValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators publicIDValidators() {
		if(_publicIDValidators == null) {
			_publicIDValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _publicIDValidators;
	}
	private static ch.hcuge.simed.foundation.utilities.validator.Validators _urlParamValidators;
	public static ch.hcuge.simed.foundation.utilities.validator.Validators urlParamValidators() {
		if(_urlParamValidators == null) {
			_urlParamValidators = new ch.hcuge.simed.foundation.utilities.validator.Validators();
		}
		return _urlParamValidators;
	}

}
