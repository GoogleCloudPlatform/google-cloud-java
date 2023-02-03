/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1/cloud_redis.proto

package com.google.cloud.redis.v1;

/**
 *
 *
 * <pre>
 * Request for [Failover][google.cloud.redis.v1.CloudRedis.FailoverInstance].
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1.FailoverInstanceRequest}
 */
public final class FailoverInstanceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1.FailoverInstanceRequest)
    FailoverInstanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FailoverInstanceRequest.newBuilder() to construct.
  private FailoverInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FailoverInstanceRequest() {
    name_ = "";
    dataProtectionMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FailoverInstanceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
        .internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
        .internal_static_google_cloud_redis_v1_FailoverInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1.FailoverInstanceRequest.class,
            com.google.cloud.redis.v1.FailoverInstanceRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Specifies different modes of operation in relation to the data retention.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode}
   */
  public enum DataProtectionMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Defaults to LIMITED_DATA_LOSS if a data protection mode is not
     * specified.
     * </pre>
     *
     * <code>DATA_PROTECTION_MODE_UNSPECIFIED = 0;</code>
     */
    DATA_PROTECTION_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Instance failover will be protected with data loss control. More
     * specifically, the failover will only be performed if the current
     * replication offset diff between primary and replica is under a certain
     * threshold.
     * </pre>
     *
     * <code>LIMITED_DATA_LOSS = 1;</code>
     */
    LIMITED_DATA_LOSS(1),
    /**
     *
     *
     * <pre>
     * Instance failover will be performed without data loss control.
     * </pre>
     *
     * <code>FORCE_DATA_LOSS = 2;</code>
     */
    FORCE_DATA_LOSS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Defaults to LIMITED_DATA_LOSS if a data protection mode is not
     * specified.
     * </pre>
     *
     * <code>DATA_PROTECTION_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int DATA_PROTECTION_MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Instance failover will be protected with data loss control. More
     * specifically, the failover will only be performed if the current
     * replication offset diff between primary and replica is under a certain
     * threshold.
     * </pre>
     *
     * <code>LIMITED_DATA_LOSS = 1;</code>
     */
    public static final int LIMITED_DATA_LOSS_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Instance failover will be performed without data loss control.
     * </pre>
     *
     * <code>FORCE_DATA_LOSS = 2;</code>
     */
    public static final int FORCE_DATA_LOSS_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataProtectionMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DataProtectionMode forNumber(int value) {
      switch (value) {
        case 0:
          return DATA_PROTECTION_MODE_UNSPECIFIED;
        case 1:
          return LIMITED_DATA_LOSS;
        case 2:
          return FORCE_DATA_LOSS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DataProtectionMode>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<DataProtectionMode>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DataProtectionMode>() {
              public DataProtectionMode findValueByNumber(int number) {
                return DataProtectionMode.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.redis.v1.FailoverInstanceRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final DataProtectionMode[] VALUES = values();

    public static DataProtectionMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DataProtectionMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode)
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_PROTECTION_MODE_FIELD_NUMBER = 2;
  private int dataProtectionMode_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Available data protection modes that the user can choose. If it's
   * unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode data_protection_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for dataProtectionMode.
   */
  @java.lang.Override
  public int getDataProtectionModeValue() {
    return dataProtectionMode_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Available data protection modes that the user can choose. If it's
   * unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode data_protection_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataProtectionMode.
   */
  @java.lang.Override
  public com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode
      getDataProtectionMode() {
    com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode result =
        com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode.forNumber(
            dataProtectionMode_);
    return result == null
        ? com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (dataProtectionMode_
        != com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode
            .DATA_PROTECTION_MODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, dataProtectionMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (dataProtectionMode_
        != com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode
            .DATA_PROTECTION_MODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, dataProtectionMode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.redis.v1.FailoverInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1.FailoverInstanceRequest other =
        (com.google.cloud.redis.v1.FailoverInstanceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (dataProtectionMode_ != other.dataProtectionMode_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DATA_PROTECTION_MODE_FIELD_NUMBER;
    hash = (53 * hash) + dataProtectionMode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.redis.v1.FailoverInstanceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for [Failover][google.cloud.redis.v1.CloudRedis.FailoverInstance].
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1.FailoverInstanceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1.FailoverInstanceRequest)
      com.google.cloud.redis.v1.FailoverInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_FailoverInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1.FailoverInstanceRequest.class,
              com.google.cloud.redis.v1.FailoverInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1.FailoverInstanceRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      dataProtectionMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.FailoverInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.redis.v1.FailoverInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.FailoverInstanceRequest build() {
      com.google.cloud.redis.v1.FailoverInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.FailoverInstanceRequest buildPartial() {
      com.google.cloud.redis.v1.FailoverInstanceRequest result =
          new com.google.cloud.redis.v1.FailoverInstanceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.redis.v1.FailoverInstanceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataProtectionMode_ = dataProtectionMode_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.redis.v1.FailoverInstanceRequest) {
        return mergeFrom((com.google.cloud.redis.v1.FailoverInstanceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1.FailoverInstanceRequest other) {
      if (other == com.google.cloud.redis.v1.FailoverInstanceRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.dataProtectionMode_ != 0) {
        setDataProtectionModeValue(other.getDataProtectionModeValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                dataProtectionMode_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int dataProtectionMode_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Available data protection modes that the user can choose. If it's
     * unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode data_protection_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for dataProtectionMode.
     */
    @java.lang.Override
    public int getDataProtectionModeValue() {
      return dataProtectionMode_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Available data protection modes that the user can choose. If it's
     * unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode data_protection_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for dataProtectionMode to set.
     * @return This builder for chaining.
     */
    public Builder setDataProtectionModeValue(int value) {
      dataProtectionMode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Available data protection modes that the user can choose. If it's
     * unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode data_protection_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The dataProtectionMode.
     */
    @java.lang.Override
    public com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode
        getDataProtectionMode() {
      com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode result =
          com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode.forNumber(
              dataProtectionMode_);
      return result == null
          ? com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Available data protection modes that the user can choose. If it's
     * unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode data_protection_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The dataProtectionMode to set.
     * @return This builder for chaining.
     */
    public Builder setDataProtectionMode(
        com.google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      dataProtectionMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Available data protection modes that the user can choose. If it's
     * unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.FailoverInstanceRequest.DataProtectionMode data_protection_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataProtectionMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataProtectionMode_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1.FailoverInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1.FailoverInstanceRequest)
  private static final com.google.cloud.redis.v1.FailoverInstanceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1.FailoverInstanceRequest();
  }

  public static com.google.cloud.redis.v1.FailoverInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FailoverInstanceRequest> PARSER =
      new com.google.protobuf.AbstractParser<FailoverInstanceRequest>() {
        @java.lang.Override
        public FailoverInstanceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<FailoverInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FailoverInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.v1.FailoverInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
