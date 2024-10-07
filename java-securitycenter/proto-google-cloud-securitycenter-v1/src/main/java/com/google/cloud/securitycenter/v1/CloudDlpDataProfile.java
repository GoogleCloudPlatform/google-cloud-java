/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/securitycenter/v1/cloud_dlp_data_profile.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * The [data profile](https://cloud.google.com/dlp/docs/data-profiles)
 * associated with the finding.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.CloudDlpDataProfile}
 */
public final class CloudDlpDataProfile extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.CloudDlpDataProfile)
    CloudDlpDataProfileOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CloudDlpDataProfile.newBuilder() to construct.
  private CloudDlpDataProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CloudDlpDataProfile() {
    dataProfile_ = "";
    parentType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CloudDlpDataProfile();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.CloudDlpDataProfileProto
        .internal_static_google_cloud_securitycenter_v1_CloudDlpDataProfile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.CloudDlpDataProfileProto
        .internal_static_google_cloud_securitycenter_v1_CloudDlpDataProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.CloudDlpDataProfile.class,
            com.google.cloud.securitycenter.v1.CloudDlpDataProfile.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Parents for configurations that produce data profile findings.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType}
   */
  public enum ParentType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified parent type.
     * </pre>
     *
     * <code>PARENT_TYPE_UNSPECIFIED = 0;</code>
     */
    PARENT_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Organization-level configurations.
     * </pre>
     *
     * <code>ORGANIZATION = 1;</code>
     */
    ORGANIZATION(1),
    /**
     *
     *
     * <pre>
     * Project-level configurations.
     * </pre>
     *
     * <code>PROJECT = 2;</code>
     */
    PROJECT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified parent type.
     * </pre>
     *
     * <code>PARENT_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int PARENT_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Organization-level configurations.
     * </pre>
     *
     * <code>ORGANIZATION = 1;</code>
     */
    public static final int ORGANIZATION_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Project-level configurations.
     * </pre>
     *
     * <code>PROJECT = 2;</code>
     */
    public static final int PROJECT_VALUE = 2;

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
    public static ParentType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ParentType forNumber(int value) {
      switch (value) {
        case 0:
          return PARENT_TYPE_UNSPECIFIED;
        case 1:
          return ORGANIZATION;
        case 2:
          return PROJECT;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ParentType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ParentType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ParentType>() {
          public ParentType findValueByNumber(int number) {
            return ParentType.forNumber(number);
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
      return com.google.cloud.securitycenter.v1.CloudDlpDataProfile.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ParentType[] VALUES = values();

    public static ParentType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ParentType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType)
  }

  public static final int DATA_PROFILE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object dataProfile_ = "";
  /**
   *
   *
   * <pre>
   * Name of the data profile, for example,
   * `projects/123/locations/europe/tableProfiles/8383929`.
   * </pre>
   *
   * <code>string data_profile = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The dataProfile.
   */
  @java.lang.Override
  public java.lang.String getDataProfile() {
    java.lang.Object ref = dataProfile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataProfile_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the data profile, for example,
   * `projects/123/locations/europe/tableProfiles/8383929`.
   * </pre>
   *
   * <code>string data_profile = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for dataProfile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDataProfileBytes() {
    java.lang.Object ref = dataProfile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dataProfile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_TYPE_FIELD_NUMBER = 2;
  private int parentType_ = 0;
  /**
   *
   *
   * <pre>
   * The resource hierarchy level at which the data profile was generated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType parent_type = 2;</code>
   *
   * @return The enum numeric value on the wire for parentType.
   */
  @java.lang.Override
  public int getParentTypeValue() {
    return parentType_;
  }
  /**
   *
   *
   * <pre>
   * The resource hierarchy level at which the data profile was generated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType parent_type = 2;</code>
   *
   * @return The parentType.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType getParentType() {
    com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType result =
        com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType.forNumber(parentType_);
    return result == null
        ? com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType.UNRECOGNIZED
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataProfile_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataProfile_);
    }
    if (parentType_
        != com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType.PARENT_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, parentType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataProfile_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dataProfile_);
    }
    if (parentType_
        != com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType.PARENT_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, parentType_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.CloudDlpDataProfile)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.CloudDlpDataProfile other =
        (com.google.cloud.securitycenter.v1.CloudDlpDataProfile) obj;

    if (!getDataProfile().equals(other.getDataProfile())) return false;
    if (parentType_ != other.parentType_) return false;
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
    hash = (37 * hash) + DATA_PROFILE_FIELD_NUMBER;
    hash = (53 * hash) + getDataProfile().hashCode();
    hash = (37 * hash) + PARENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + parentType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.securitycenter.v1.CloudDlpDataProfile prototype) {
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
   * The [data profile](https://cloud.google.com/dlp/docs/data-profiles)
   * associated with the finding.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.CloudDlpDataProfile}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.CloudDlpDataProfile)
      com.google.cloud.securitycenter.v1.CloudDlpDataProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.CloudDlpDataProfileProto
          .internal_static_google_cloud_securitycenter_v1_CloudDlpDataProfile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.CloudDlpDataProfileProto
          .internal_static_google_cloud_securitycenter_v1_CloudDlpDataProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.CloudDlpDataProfile.class,
              com.google.cloud.securitycenter.v1.CloudDlpDataProfile.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.CloudDlpDataProfile.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataProfile_ = "";
      parentType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.CloudDlpDataProfileProto
          .internal_static_google_cloud_securitycenter_v1_CloudDlpDataProfile_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CloudDlpDataProfile getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.CloudDlpDataProfile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CloudDlpDataProfile build() {
      com.google.cloud.securitycenter.v1.CloudDlpDataProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CloudDlpDataProfile buildPartial() {
      com.google.cloud.securitycenter.v1.CloudDlpDataProfile result =
          new com.google.cloud.securitycenter.v1.CloudDlpDataProfile(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.CloudDlpDataProfile result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataProfile_ = dataProfile_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parentType_ = parentType_;
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
      if (other instanceof com.google.cloud.securitycenter.v1.CloudDlpDataProfile) {
        return mergeFrom((com.google.cloud.securitycenter.v1.CloudDlpDataProfile) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.CloudDlpDataProfile other) {
      if (other == com.google.cloud.securitycenter.v1.CloudDlpDataProfile.getDefaultInstance())
        return this;
      if (!other.getDataProfile().isEmpty()) {
        dataProfile_ = other.dataProfile_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.parentType_ != 0) {
        setParentTypeValue(other.getParentTypeValue());
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
                dataProfile_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                parentType_ = input.readEnum();
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

    private java.lang.Object dataProfile_ = "";
    /**
     *
     *
     * <pre>
     * Name of the data profile, for example,
     * `projects/123/locations/europe/tableProfiles/8383929`.
     * </pre>
     *
     * <code>string data_profile = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The dataProfile.
     */
    public java.lang.String getDataProfile() {
      java.lang.Object ref = dataProfile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataProfile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the data profile, for example,
     * `projects/123/locations/europe/tableProfiles/8383929`.
     * </pre>
     *
     * <code>string data_profile = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for dataProfile.
     */
    public com.google.protobuf.ByteString getDataProfileBytes() {
      java.lang.Object ref = dataProfile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dataProfile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the data profile, for example,
     * `projects/123/locations/europe/tableProfiles/8383929`.
     * </pre>
     *
     * <code>string data_profile = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The dataProfile to set.
     * @return This builder for chaining.
     */
    public Builder setDataProfile(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dataProfile_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the data profile, for example,
     * `projects/123/locations/europe/tableProfiles/8383929`.
     * </pre>
     *
     * <code>string data_profile = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataProfile() {
      dataProfile_ = getDefaultInstance().getDataProfile();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the data profile, for example,
     * `projects/123/locations/europe/tableProfiles/8383929`.
     * </pre>
     *
     * <code>string data_profile = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for dataProfile to set.
     * @return This builder for chaining.
     */
    public Builder setDataProfileBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      dataProfile_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int parentType_ = 0;
    /**
     *
     *
     * <pre>
     * The resource hierarchy level at which the data profile was generated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType parent_type = 2;</code>
     *
     * @return The enum numeric value on the wire for parentType.
     */
    @java.lang.Override
    public int getParentTypeValue() {
      return parentType_;
    }
    /**
     *
     *
     * <pre>
     * The resource hierarchy level at which the data profile was generated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType parent_type = 2;</code>
     *
     * @param value The enum numeric value on the wire for parentType to set.
     * @return This builder for chaining.
     */
    public Builder setParentTypeValue(int value) {
      parentType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource hierarchy level at which the data profile was generated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType parent_type = 2;</code>
     *
     * @return The parentType.
     */
    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType getParentType() {
      com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType result =
          com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType.forNumber(parentType_);
      return result == null
          ? com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The resource hierarchy level at which the data profile was generated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType parent_type = 2;</code>
     *
     * @param value The parentType to set.
     * @return This builder for chaining.
     */
    public Builder setParentType(
        com.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      parentType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource hierarchy level at which the data profile was generated.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudDlpDataProfile.ParentType parent_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParentType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      parentType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.CloudDlpDataProfile)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.CloudDlpDataProfile)
  private static final com.google.cloud.securitycenter.v1.CloudDlpDataProfile DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.CloudDlpDataProfile();
  }

  public static com.google.cloud.securitycenter.v1.CloudDlpDataProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudDlpDataProfile> PARSER =
      new com.google.protobuf.AbstractParser<CloudDlpDataProfile>() {
        @java.lang.Override
        public CloudDlpDataProfile parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudDlpDataProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudDlpDataProfile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.CloudDlpDataProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
