/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndpointUserConfigurationUpdate implements org.apache.thrift.TBase<EndpointUserConfigurationUpdate, EndpointUserConfigurationUpdate._Fields>, java.io.Serializable, Cloneable, Comparable<EndpointUserConfigurationUpdate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EndpointUserConfigurationUpdate");

  private static final org.apache.thrift.protocol.TField TENANT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tenantId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField APPLICATION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationToken", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ENDPOINT_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("endpointKey", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField UCF_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("ucfHash", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EndpointUserConfigurationUpdateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EndpointUserConfigurationUpdateTupleSchemeFactory());
  }

  public String tenantId; // required
  public String userId; // required
  public String applicationToken; // required
  public ByteBuffer endpointKey; // required
  public ByteBuffer ucfHash; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TENANT_ID((short)1, "tenantId"),
    USER_ID((short)2, "userId"),
    APPLICATION_TOKEN((short)3, "applicationToken"),
    ENDPOINT_KEY((short)4, "endpointKey"),
    UCF_HASH((short)5, "ucfHash");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TENANT_ID
          return TENANT_ID;
        case 2: // USER_ID
          return USER_ID;
        case 3: // APPLICATION_TOKEN
          return APPLICATION_TOKEN;
        case 4: // ENDPOINT_KEY
          return ENDPOINT_KEY;
        case 5: // UCF_HASH
          return UCF_HASH;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TENANT_ID, new org.apache.thrift.meta_data.FieldMetaData("tenantId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "tenant_id")));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "user_id")));
    tmpMap.put(_Fields.APPLICATION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("applicationToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "application_token")));
    tmpMap.put(_Fields.ENDPOINT_KEY, new org.apache.thrift.meta_data.FieldMetaData("endpointKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "endpoint_id")));
    tmpMap.put(_Fields.UCF_HASH, new org.apache.thrift.meta_data.FieldMetaData("ucfHash", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EndpointUserConfigurationUpdate.class, metaDataMap);
  }

  public EndpointUserConfigurationUpdate() {
  }

  public EndpointUserConfigurationUpdate(
    String tenantId,
    String userId,
    String applicationToken,
    ByteBuffer endpointKey,
    ByteBuffer ucfHash)
  {
    this();
    this.tenantId = tenantId;
    this.userId = userId;
    this.applicationToken = applicationToken;
    this.endpointKey = endpointKey;
    this.ucfHash = ucfHash;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EndpointUserConfigurationUpdate(EndpointUserConfigurationUpdate other) {
    if (other.isSetTenantId()) {
      this.tenantId = other.tenantId;
    }
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetApplicationToken()) {
      this.applicationToken = other.applicationToken;
    }
    if (other.isSetEndpointKey()) {
      this.endpointKey = other.endpointKey;
    }
    if (other.isSetUcfHash()) {
      this.ucfHash = org.apache.thrift.TBaseHelper.copyBinary(other.ucfHash);
;
    }
  }

  public EndpointUserConfigurationUpdate deepCopy() {
    return new EndpointUserConfigurationUpdate(this);
  }

  @Override
  public void clear() {
    this.tenantId = null;
    this.userId = null;
    this.applicationToken = null;
    this.endpointKey = null;
    this.ucfHash = null;
  }

  public String getTenantId() {
    return this.tenantId;
  }

  public EndpointUserConfigurationUpdate setTenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  public void unsetTenantId() {
    this.tenantId = null;
  }

  /** Returns true if field tenantId is set (has been assigned a value) and false otherwise */
  public boolean isSetTenantId() {
    return this.tenantId != null;
  }

  public void setTenantIdIsSet(boolean value) {
    if (!value) {
      this.tenantId = null;
    }
  }

  public String getUserId() {
    return this.userId;
  }

  public EndpointUserConfigurationUpdate setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public String getApplicationToken() {
    return this.applicationToken;
  }

  public EndpointUserConfigurationUpdate setApplicationToken(String applicationToken) {
    this.applicationToken = applicationToken;
    return this;
  }

  public void unsetApplicationToken() {
    this.applicationToken = null;
  }

  /** Returns true if field applicationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationToken() {
    return this.applicationToken != null;
  }

  public void setApplicationTokenIsSet(boolean value) {
    if (!value) {
      this.applicationToken = null;
    }
  }

  public byte[] getEndpointKey() {
    setEndpointKey(org.apache.thrift.TBaseHelper.rightSize(endpointKey));
    return endpointKey == null ? null : endpointKey.array();
  }

  public ByteBuffer bufferForEndpointKey() {
    return endpointKey;
  }

  public EndpointUserConfigurationUpdate setEndpointKey(byte[] endpointKey) {
    setEndpointKey(endpointKey == null ? (ByteBuffer)null : ByteBuffer.wrap(endpointKey));
    return this;
  }

  public EndpointUserConfigurationUpdate setEndpointKey(ByteBuffer endpointKey) {
    this.endpointKey = endpointKey;
    return this;
  }

  public void unsetEndpointKey() {
    this.endpointKey = null;
  }

  /** Returns true if field endpointKey is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpointKey() {
    return this.endpointKey != null;
  }

  public void setEndpointKeyIsSet(boolean value) {
    if (!value) {
      this.endpointKey = null;
    }
  }

  public byte[] getUcfHash() {
    setUcfHash(org.apache.thrift.TBaseHelper.rightSize(ucfHash));
    return ucfHash == null ? null : ucfHash.array();
  }

  public ByteBuffer bufferForUcfHash() {
    return ucfHash;
  }

  public EndpointUserConfigurationUpdate setUcfHash(byte[] ucfHash) {
    setUcfHash(ucfHash == null ? (ByteBuffer)null : ByteBuffer.wrap(ucfHash));
    return this;
  }

  public EndpointUserConfigurationUpdate setUcfHash(ByteBuffer ucfHash) {
    this.ucfHash = ucfHash;
    return this;
  }

  public void unsetUcfHash() {
    this.ucfHash = null;
  }

  /** Returns true if field ucfHash is set (has been assigned a value) and false otherwise */
  public boolean isSetUcfHash() {
    return this.ucfHash != null;
  }

  public void setUcfHashIsSet(boolean value) {
    if (!value) {
      this.ucfHash = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TENANT_ID:
      if (value == null) {
        unsetTenantId();
      } else {
        setTenantId((String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((String)value);
      }
      break;

    case APPLICATION_TOKEN:
      if (value == null) {
        unsetApplicationToken();
      } else {
        setApplicationToken((String)value);
      }
      break;

    case ENDPOINT_KEY:
      if (value == null) {
        unsetEndpointKey();
      } else {
        setEndpointKey((ByteBuffer)value);
      }
      break;

    case UCF_HASH:
      if (value == null) {
        unsetUcfHash();
      } else {
        setUcfHash((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TENANT_ID:
      return getTenantId();

    case USER_ID:
      return getUserId();

    case APPLICATION_TOKEN:
      return getApplicationToken();

    case ENDPOINT_KEY:
      return getEndpointKey();

    case UCF_HASH:
      return getUcfHash();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TENANT_ID:
      return isSetTenantId();
    case USER_ID:
      return isSetUserId();
    case APPLICATION_TOKEN:
      return isSetApplicationToken();
    case ENDPOINT_KEY:
      return isSetEndpointKey();
    case UCF_HASH:
      return isSetUcfHash();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EndpointUserConfigurationUpdate)
      return this.equals((EndpointUserConfigurationUpdate)that);
    return false;
  }

  public boolean equals(EndpointUserConfigurationUpdate that) {
    if (that == null)
      return false;

    boolean this_present_tenantId = true && this.isSetTenantId();
    boolean that_present_tenantId = true && that.isSetTenantId();
    if (this_present_tenantId || that_present_tenantId) {
      if (!(this_present_tenantId && that_present_tenantId))
        return false;
      if (!this.tenantId.equals(that.tenantId))
        return false;
    }

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_applicationToken = true && this.isSetApplicationToken();
    boolean that_present_applicationToken = true && that.isSetApplicationToken();
    if (this_present_applicationToken || that_present_applicationToken) {
      if (!(this_present_applicationToken && that_present_applicationToken))
        return false;
      if (!this.applicationToken.equals(that.applicationToken))
        return false;
    }

    boolean this_present_endpointKey = true && this.isSetEndpointKey();
    boolean that_present_endpointKey = true && that.isSetEndpointKey();
    if (this_present_endpointKey || that_present_endpointKey) {
      if (!(this_present_endpointKey && that_present_endpointKey))
        return false;
      if (!this.endpointKey.equals(that.endpointKey))
        return false;
    }

    boolean this_present_ucfHash = true && this.isSetUcfHash();
    boolean that_present_ucfHash = true && that.isSetUcfHash();
    if (this_present_ucfHash || that_present_ucfHash) {
      if (!(this_present_ucfHash && that_present_ucfHash))
        return false;
      if (!this.ucfHash.equals(that.ucfHash))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_tenantId = true && (isSetTenantId());
    builder.append(present_tenantId);
    if (present_tenantId)
      builder.append(tenantId);

    boolean present_userId = true && (isSetUserId());
    builder.append(present_userId);
    if (present_userId)
      builder.append(userId);

    boolean present_applicationToken = true && (isSetApplicationToken());
    builder.append(present_applicationToken);
    if (present_applicationToken)
      builder.append(applicationToken);

    boolean present_endpointKey = true && (isSetEndpointKey());
    builder.append(present_endpointKey);
    if (present_endpointKey)
      builder.append(endpointKey);

    boolean present_ucfHash = true && (isSetUcfHash());
    builder.append(present_ucfHash);
    if (present_ucfHash)
      builder.append(ucfHash);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(EndpointUserConfigurationUpdate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTenantId()).compareTo(other.isSetTenantId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTenantId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tenantId, other.tenantId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplicationToken()).compareTo(other.isSetApplicationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationToken, other.applicationToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndpointKey()).compareTo(other.isSetEndpointKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpointKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpointKey, other.endpointKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUcfHash()).compareTo(other.isSetUcfHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUcfHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ucfHash, other.ucfHash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EndpointUserConfigurationUpdate(");
    boolean first = true;

    sb.append("tenantId:");
    if (this.tenantId == null) {
      sb.append("null");
    } else {
      sb.append(this.tenantId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("applicationToken:");
    if (this.applicationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.applicationToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endpointKey:");
    if (this.endpointKey == null) {
      sb.append("null");
    } else {
      sb.append(this.endpointKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ucfHash:");
    if (this.ucfHash == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.ucfHash, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EndpointUserConfigurationUpdateStandardSchemeFactory implements SchemeFactory {
    public EndpointUserConfigurationUpdateStandardScheme getScheme() {
      return new EndpointUserConfigurationUpdateStandardScheme();
    }
  }

  private static class EndpointUserConfigurationUpdateStandardScheme extends StandardScheme<EndpointUserConfigurationUpdate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EndpointUserConfigurationUpdate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TENANT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tenantId = iprot.readString();
              struct.setTenantIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APPLICATION_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.applicationToken = iprot.readString();
              struct.setApplicationTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENDPOINT_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endpointKey = iprot.readBinary();
              struct.setEndpointKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UCF_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ucfHash = iprot.readBinary();
              struct.setUcfHashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, EndpointUserConfigurationUpdate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tenantId != null) {
        oprot.writeFieldBegin(TENANT_ID_FIELD_DESC);
        oprot.writeString(struct.tenantId);
        oprot.writeFieldEnd();
      }
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.applicationToken != null) {
        oprot.writeFieldBegin(APPLICATION_TOKEN_FIELD_DESC);
        oprot.writeString(struct.applicationToken);
        oprot.writeFieldEnd();
      }
      if (struct.endpointKey != null) {
        oprot.writeFieldBegin(ENDPOINT_KEY_FIELD_DESC);
        oprot.writeBinary(struct.endpointKey);
        oprot.writeFieldEnd();
      }
      if (struct.ucfHash != null) {
        oprot.writeFieldBegin(UCF_HASH_FIELD_DESC);
        oprot.writeBinary(struct.ucfHash);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EndpointUserConfigurationUpdateTupleSchemeFactory implements SchemeFactory {
    public EndpointUserConfigurationUpdateTupleScheme getScheme() {
      return new EndpointUserConfigurationUpdateTupleScheme();
    }
  }

  private static class EndpointUserConfigurationUpdateTupleScheme extends TupleScheme<EndpointUserConfigurationUpdate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EndpointUserConfigurationUpdate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTenantId()) {
        optionals.set(0);
      }
      if (struct.isSetUserId()) {
        optionals.set(1);
      }
      if (struct.isSetApplicationToken()) {
        optionals.set(2);
      }
      if (struct.isSetEndpointKey()) {
        optionals.set(3);
      }
      if (struct.isSetUcfHash()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTenantId()) {
        oprot.writeString(struct.tenantId);
      }
      if (struct.isSetUserId()) {
        oprot.writeString(struct.userId);
      }
      if (struct.isSetApplicationToken()) {
        oprot.writeString(struct.applicationToken);
      }
      if (struct.isSetEndpointKey()) {
        oprot.writeBinary(struct.endpointKey);
      }
      if (struct.isSetUcfHash()) {
        oprot.writeBinary(struct.ucfHash);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EndpointUserConfigurationUpdate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.tenantId = iprot.readString();
        struct.setTenantIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userId = iprot.readString();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.applicationToken = iprot.readString();
        struct.setApplicationTokenIsSet(true);
      }
      if (incoming.get(3)) {
        struct.endpointKey = iprot.readBinary();
        struct.setEndpointKeyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.ucfHash = iprot.readBinary();
        struct.setUcfHashIsSet(true);
      }
    }
  }

}

