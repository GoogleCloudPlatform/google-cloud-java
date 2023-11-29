/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dialogflow/cx/v3/security_settings.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The request message for [SecuritySettings.CreateSecuritySettings][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest}
 */
public final class CreateSecuritySettingsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest)
    CreateSecuritySettingsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSecuritySettingsRequest.newBuilder() to construct.
  private CreateSecuritySettingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSecuritySettingsRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSecuritySettingsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.SecuritySettingsProto
        .internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.SecuritySettingsProto
        .internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest.class,
            com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The location to create an
   * [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The location to create an
   * [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITY_SETTINGS_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.cx.v3.SecuritySettings securitySettings_;
  /**
   *
   *
   * <pre>
   * Required. The security settings to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the securitySettings field is set.
   */
  @java.lang.Override
  public boolean hasSecuritySettings() {
    return securitySettings_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The security settings to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The securitySettings.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.SecuritySettings getSecuritySettings() {
    return securitySettings_ == null
        ? com.google.cloud.dialogflow.cx.v3.SecuritySettings.getDefaultInstance()
        : securitySettings_;
  }
  /**
   *
   *
   * <pre>
   * Required. The security settings to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.SecuritySettingsOrBuilder
      getSecuritySettingsOrBuilder() {
    return securitySettings_ == null
        ? com.google.cloud.dialogflow.cx.v3.SecuritySettings.getDefaultInstance()
        : securitySettings_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (securitySettings_ != null) {
      output.writeMessage(2, getSecuritySettings());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (securitySettings_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSecuritySettings());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest other =
        (com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasSecuritySettings() != other.hasSecuritySettings()) return false;
    if (hasSecuritySettings()) {
      if (!getSecuritySettings().equals(other.getSecuritySettings())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSecuritySettings()) {
      hash = (37 * hash) + SECURITY_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSecuritySettings().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest prototype) {
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
   * The request message for [SecuritySettings.CreateSecuritySettings][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest)
      com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.SecuritySettingsProto
          .internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.SecuritySettingsProto
          .internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest.class,
              com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      securitySettings_ = null;
      if (securitySettingsBuilder_ != null) {
        securitySettingsBuilder_.dispose();
        securitySettingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.SecuritySettingsProto
          .internal_static_google_cloud_dialogflow_cx_v3_CreateSecuritySettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest build() {
      com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest result =
          new com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.securitySettings_ =
            securitySettingsBuilder_ == null ? securitySettings_ : securitySettingsBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest other) {
      if (other
          == com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSecuritySettings()) {
        mergeSecuritySettings(other.getSecuritySettings());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getSecuritySettingsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The location to create an
     * [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The location to create an
     * [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The location to create an
     * [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The location to create an
     * [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The location to create an
     * [SecuritySettings][google.cloud.dialogflow.cx.v3.SecuritySettings] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.cx.v3.SecuritySettings securitySettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.SecuritySettings,
            com.google.cloud.dialogflow.cx.v3.SecuritySettings.Builder,
            com.google.cloud.dialogflow.cx.v3.SecuritySettingsOrBuilder>
        securitySettingsBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The security settings to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the securitySettings field is set.
     */
    public boolean hasSecuritySettings() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The security settings to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The securitySettings.
     */
    public com.google.cloud.dialogflow.cx.v3.SecuritySettings getSecuritySettings() {
      if (securitySettingsBuilder_ == null) {
        return securitySettings_ == null
            ? com.google.cloud.dialogflow.cx.v3.SecuritySettings.getDefaultInstance()
            : securitySettings_;
      } else {
        return securitySettingsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The security settings to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSecuritySettings(com.google.cloud.dialogflow.cx.v3.SecuritySettings value) {
      if (securitySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        securitySettings_ = value;
      } else {
        securitySettingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The security settings to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSecuritySettings(
        com.google.cloud.dialogflow.cx.v3.SecuritySettings.Builder builderForValue) {
      if (securitySettingsBuilder_ == null) {
        securitySettings_ = builderForValue.build();
      } else {
        securitySettingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The security settings to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSecuritySettings(com.google.cloud.dialogflow.cx.v3.SecuritySettings value) {
      if (securitySettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && securitySettings_ != null
            && securitySettings_
                != com.google.cloud.dialogflow.cx.v3.SecuritySettings.getDefaultInstance()) {
          getSecuritySettingsBuilder().mergeFrom(value);
        } else {
          securitySettings_ = value;
        }
      } else {
        securitySettingsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The security settings to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSecuritySettings() {
      bitField0_ = (bitField0_ & ~0x00000002);
      securitySettings_ = null;
      if (securitySettingsBuilder_ != null) {
        securitySettingsBuilder_.dispose();
        securitySettingsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The security settings to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3.SecuritySettings.Builder getSecuritySettingsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSecuritySettingsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The security settings to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3.SecuritySettingsOrBuilder
        getSecuritySettingsOrBuilder() {
      if (securitySettingsBuilder_ != null) {
        return securitySettingsBuilder_.getMessageOrBuilder();
      } else {
        return securitySettings_ == null
            ? com.google.cloud.dialogflow.cx.v3.SecuritySettings.getDefaultInstance()
            : securitySettings_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The security settings to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.SecuritySettings security_settings = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.SecuritySettings,
            com.google.cloud.dialogflow.cx.v3.SecuritySettings.Builder,
            com.google.cloud.dialogflow.cx.v3.SecuritySettingsOrBuilder>
        getSecuritySettingsFieldBuilder() {
      if (securitySettingsBuilder_ == null) {
        securitySettingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3.SecuritySettings,
                com.google.cloud.dialogflow.cx.v3.SecuritySettings.Builder,
                com.google.cloud.dialogflow.cx.v3.SecuritySettingsOrBuilder>(
                getSecuritySettings(), getParentForChildren(), isClean());
        securitySettings_ = null;
      }
      return securitySettingsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest)
  private static final com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSecuritySettingsRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSecuritySettingsRequest>() {
        @java.lang.Override
        public CreateSecuritySettingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSecuritySettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSecuritySettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.CreateSecuritySettingsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
