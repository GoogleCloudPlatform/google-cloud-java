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
// source: google/cloud/securityposture/v1/sha_constraints.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securityposture.v1;

/**
 *
 *
 * <pre>
 * Message for Security Health Analytics built-in detector.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securityposture.v1.SecurityHealthAnalyticsModule}
 */
public final class SecurityHealthAnalyticsModule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securityposture.v1.SecurityHealthAnalyticsModule)
    SecurityHealthAnalyticsModuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SecurityHealthAnalyticsModule.newBuilder() to construct.
  private SecurityHealthAnalyticsModule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SecurityHealthAnalyticsModule() {
    moduleName_ = "";
    moduleEnablementState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SecurityHealthAnalyticsModule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securityposture.v1.ShaConstraintsProto
        .internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securityposture.v1.ShaConstraintsProto
        .internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule.class,
            com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule.Builder.class);
  }

  public static final int MODULE_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object moduleName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the module eg: BIGQUERY_TABLE_CMEK_DISABLED.
   * </pre>
   *
   * <code>string module_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The moduleName.
   */
  @java.lang.Override
  public java.lang.String getModuleName() {
    java.lang.Object ref = moduleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      moduleName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the module eg: BIGQUERY_TABLE_CMEK_DISABLED.
   * </pre>
   *
   * <code>string module_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for moduleName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getModuleNameBytes() {
    java.lang.Object ref = moduleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      moduleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODULE_ENABLEMENT_STATE_FIELD_NUMBER = 2;
  private int moduleEnablementState_ = 0;
  /**
   *
   *
   * <pre>
   * The state of enablement for the module at its level of the resource
   * hierarchy.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.EnablementState module_enablement_state = 2;</code>
   *
   * @return The enum numeric value on the wire for moduleEnablementState.
   */
  @java.lang.Override
  public int getModuleEnablementStateValue() {
    return moduleEnablementState_;
  }
  /**
   *
   *
   * <pre>
   * The state of enablement for the module at its level of the resource
   * hierarchy.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.EnablementState module_enablement_state = 2;</code>
   *
   * @return The moduleEnablementState.
   */
  @java.lang.Override
  public com.google.cloud.securityposture.v1.EnablementState getModuleEnablementState() {
    com.google.cloud.securityposture.v1.EnablementState result =
        com.google.cloud.securityposture.v1.EnablementState.forNumber(moduleEnablementState_);
    return result == null
        ? com.google.cloud.securityposture.v1.EnablementState.UNRECOGNIZED
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(moduleName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, moduleName_);
    }
    if (moduleEnablementState_
        != com.google.cloud.securityposture.v1.EnablementState.ENABLEMENT_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, moduleEnablementState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(moduleName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, moduleName_);
    }
    if (moduleEnablementState_
        != com.google.cloud.securityposture.v1.EnablementState.ENABLEMENT_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, moduleEnablementState_);
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
    if (!(obj instanceof com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule)) {
      return super.equals(obj);
    }
    com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule other =
        (com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule) obj;

    if (!getModuleName().equals(other.getModuleName())) return false;
    if (moduleEnablementState_ != other.moduleEnablementState_) return false;
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
    hash = (37 * hash) + MODULE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getModuleName().hashCode();
    hash = (37 * hash) + MODULE_ENABLEMENT_STATE_FIELD_NUMBER;
    hash = (53 * hash) + moduleEnablementState_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule parseFrom(
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
      com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule prototype) {
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
   * Message for Security Health Analytics built-in detector.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securityposture.v1.SecurityHealthAnalyticsModule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securityposture.v1.SecurityHealthAnalyticsModule)
      com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securityposture.v1.ShaConstraintsProto
          .internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securityposture.v1.ShaConstraintsProto
          .internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule.class,
              com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule.Builder.class);
    }

    // Construct using
    // com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      moduleName_ = "";
      moduleEnablementState_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securityposture.v1.ShaConstraintsProto
          .internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule
        getDefaultInstanceForType() {
      return com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule build() {
      com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule buildPartial() {
      com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule result =
          new com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.moduleName_ = moduleName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.moduleEnablementState_ = moduleEnablementState_;
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
      if (other instanceof com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule) {
        return mergeFrom((com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule other) {
      if (other
          == com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule.getDefaultInstance())
        return this;
      if (!other.getModuleName().isEmpty()) {
        moduleName_ = other.moduleName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.moduleEnablementState_ != 0) {
        setModuleEnablementStateValue(other.getModuleEnablementStateValue());
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
                moduleName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                moduleEnablementState_ = input.readEnum();
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

    private java.lang.Object moduleName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the module eg: BIGQUERY_TABLE_CMEK_DISABLED.
     * </pre>
     *
     * <code>string module_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The moduleName.
     */
    public java.lang.String getModuleName() {
      java.lang.Object ref = moduleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moduleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the module eg: BIGQUERY_TABLE_CMEK_DISABLED.
     * </pre>
     *
     * <code>string module_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for moduleName.
     */
    public com.google.protobuf.ByteString getModuleNameBytes() {
      java.lang.Object ref = moduleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        moduleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the module eg: BIGQUERY_TABLE_CMEK_DISABLED.
     * </pre>
     *
     * <code>string module_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The moduleName to set.
     * @return This builder for chaining.
     */
    public Builder setModuleName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      moduleName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the module eg: BIGQUERY_TABLE_CMEK_DISABLED.
     * </pre>
     *
     * <code>string module_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModuleName() {
      moduleName_ = getDefaultInstance().getModuleName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the module eg: BIGQUERY_TABLE_CMEK_DISABLED.
     * </pre>
     *
     * <code>string module_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for moduleName to set.
     * @return This builder for chaining.
     */
    public Builder setModuleNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      moduleName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int moduleEnablementState_ = 0;
    /**
     *
     *
     * <pre>
     * The state of enablement for the module at its level of the resource
     * hierarchy.
     * </pre>
     *
     * <code>.google.cloud.securityposture.v1.EnablementState module_enablement_state = 2;</code>
     *
     * @return The enum numeric value on the wire for moduleEnablementState.
     */
    @java.lang.Override
    public int getModuleEnablementStateValue() {
      return moduleEnablementState_;
    }
    /**
     *
     *
     * <pre>
     * The state of enablement for the module at its level of the resource
     * hierarchy.
     * </pre>
     *
     * <code>.google.cloud.securityposture.v1.EnablementState module_enablement_state = 2;</code>
     *
     * @param value The enum numeric value on the wire for moduleEnablementState to set.
     * @return This builder for chaining.
     */
    public Builder setModuleEnablementStateValue(int value) {
      moduleEnablementState_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of enablement for the module at its level of the resource
     * hierarchy.
     * </pre>
     *
     * <code>.google.cloud.securityposture.v1.EnablementState module_enablement_state = 2;</code>
     *
     * @return The moduleEnablementState.
     */
    @java.lang.Override
    public com.google.cloud.securityposture.v1.EnablementState getModuleEnablementState() {
      com.google.cloud.securityposture.v1.EnablementState result =
          com.google.cloud.securityposture.v1.EnablementState.forNumber(moduleEnablementState_);
      return result == null
          ? com.google.cloud.securityposture.v1.EnablementState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The state of enablement for the module at its level of the resource
     * hierarchy.
     * </pre>
     *
     * <code>.google.cloud.securityposture.v1.EnablementState module_enablement_state = 2;</code>
     *
     * @param value The moduleEnablementState to set.
     * @return This builder for chaining.
     */
    public Builder setModuleEnablementState(
        com.google.cloud.securityposture.v1.EnablementState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      moduleEnablementState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of enablement for the module at its level of the resource
     * hierarchy.
     * </pre>
     *
     * <code>.google.cloud.securityposture.v1.EnablementState module_enablement_state = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModuleEnablementState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      moduleEnablementState_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securityposture.v1.SecurityHealthAnalyticsModule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securityposture.v1.SecurityHealthAnalyticsModule)
  private static final com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule();
  }

  public static com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityHealthAnalyticsModule> PARSER =
      new com.google.protobuf.AbstractParser<SecurityHealthAnalyticsModule>() {
        @java.lang.Override
        public SecurityHealthAnalyticsModule parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecurityHealthAnalyticsModule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityHealthAnalyticsModule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securityposture.v1.SecurityHealthAnalyticsModule
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
