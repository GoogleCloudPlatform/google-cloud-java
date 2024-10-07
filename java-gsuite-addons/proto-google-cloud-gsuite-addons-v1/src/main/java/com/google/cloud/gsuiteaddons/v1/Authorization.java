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
// source: google/cloud/gsuiteaddons/v1/gsuiteaddons.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gsuiteaddons.v1;

/**
 *
 *
 * <pre>
 * The authorization information used when invoking deployment endpoints.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gsuiteaddons.v1.Authorization}
 */
public final class Authorization extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gsuiteaddons.v1.Authorization)
    AuthorizationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Authorization.newBuilder() to construct.
  private Authorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Authorization() {
    name_ = "";
    serviceAccountEmail_ = "";
    oauthClientId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Authorization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
        .internal_static_google_cloud_gsuiteaddons_v1_Authorization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
        .internal_static_google_cloud_gsuiteaddons_v1_Authorization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gsuiteaddons.v1.Authorization.class,
            com.google.cloud.gsuiteaddons.v1.Authorization.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * The canonical full name of this resource.
   * Example:  `projects/123/authorization`
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * The canonical full name of this resource.
   * Example:  `projects/123/authorization`
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int SERVICE_ACCOUNT_EMAIL_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceAccountEmail_ = "";
  /**
   *
   *
   * <pre>
   * The email address of the service account used to authenticate requests to
   * add-on callback endpoints.
   * </pre>
   *
   * <code>string service_account_email = 2;</code>
   *
   * @return The serviceAccountEmail.
   */
  @java.lang.Override
  public java.lang.String getServiceAccountEmail() {
    java.lang.Object ref = serviceAccountEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAccountEmail_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The email address of the service account used to authenticate requests to
   * add-on callback endpoints.
   * </pre>
   *
   * <code>string service_account_email = 2;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceAccountEmailBytes() {
    java.lang.Object ref = serviceAccountEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceAccountEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OAUTH_CLIENT_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object oauthClientId_ = "";
  /**
   *
   *
   * <pre>
   * The OAuth client ID used to obtain OAuth access tokens for a user on the
   * add-on's behalf.
   * </pre>
   *
   * <code>string oauth_client_id = 3;</code>
   *
   * @return The oauthClientId.
   */
  @java.lang.Override
  public java.lang.String getOauthClientId() {
    java.lang.Object ref = oauthClientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oauthClientId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The OAuth client ID used to obtain OAuth access tokens for a user on the
   * add-on's behalf.
   * </pre>
   *
   * <code>string oauth_client_id = 3;</code>
   *
   * @return The bytes for oauthClientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOauthClientIdBytes() {
    java.lang.Object ref = oauthClientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      oauthClientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccountEmail_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceAccountEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oauthClientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, oauthClientId_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccountEmail_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceAccountEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oauthClientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, oauthClientId_);
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
    if (!(obj instanceof com.google.cloud.gsuiteaddons.v1.Authorization)) {
      return super.equals(obj);
    }
    com.google.cloud.gsuiteaddons.v1.Authorization other =
        (com.google.cloud.gsuiteaddons.v1.Authorization) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getServiceAccountEmail().equals(other.getServiceAccountEmail())) return false;
    if (!getOauthClientId().equals(other.getOauthClientId())) return false;
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
    hash = (37 * hash) + SERVICE_ACCOUNT_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAccountEmail().hashCode();
    hash = (37 * hash) + OAUTH_CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOauthClientId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gsuiteaddons.v1.Authorization prototype) {
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
   * The authorization information used when invoking deployment endpoints.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gsuiteaddons.v1.Authorization}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gsuiteaddons.v1.Authorization)
      com.google.cloud.gsuiteaddons.v1.AuthorizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
          .internal_static_google_cloud_gsuiteaddons_v1_Authorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
          .internal_static_google_cloud_gsuiteaddons_v1_Authorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gsuiteaddons.v1.Authorization.class,
              com.google.cloud.gsuiteaddons.v1.Authorization.Builder.class);
    }

    // Construct using com.google.cloud.gsuiteaddons.v1.Authorization.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      serviceAccountEmail_ = "";
      oauthClientId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
          .internal_static_google_cloud_gsuiteaddons_v1_Authorization_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gsuiteaddons.v1.Authorization getDefaultInstanceForType() {
      return com.google.cloud.gsuiteaddons.v1.Authorization.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gsuiteaddons.v1.Authorization build() {
      com.google.cloud.gsuiteaddons.v1.Authorization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gsuiteaddons.v1.Authorization buildPartial() {
      com.google.cloud.gsuiteaddons.v1.Authorization result =
          new com.google.cloud.gsuiteaddons.v1.Authorization(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gsuiteaddons.v1.Authorization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serviceAccountEmail_ = serviceAccountEmail_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.oauthClientId_ = oauthClientId_;
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
      if (other instanceof com.google.cloud.gsuiteaddons.v1.Authorization) {
        return mergeFrom((com.google.cloud.gsuiteaddons.v1.Authorization) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gsuiteaddons.v1.Authorization other) {
      if (other == com.google.cloud.gsuiteaddons.v1.Authorization.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getServiceAccountEmail().isEmpty()) {
        serviceAccountEmail_ = other.serviceAccountEmail_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getOauthClientId().isEmpty()) {
        oauthClientId_ = other.oauthClientId_;
        bitField0_ |= 0x00000004;
        onChanged();
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
            case 18:
              {
                serviceAccountEmail_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                oauthClientId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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
     * The canonical full name of this resource.
     * Example:  `projects/123/authorization`
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The canonical full name of this resource.
     * Example:  `projects/123/authorization`
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The canonical full name of this resource.
     * Example:  `projects/123/authorization`
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The canonical full name of this resource.
     * Example:  `projects/123/authorization`
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The canonical full name of this resource.
     * Example:  `projects/123/authorization`
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private java.lang.Object serviceAccountEmail_ = "";
    /**
     *
     *
     * <pre>
     * The email address of the service account used to authenticate requests to
     * add-on callback endpoints.
     * </pre>
     *
     * <code>string service_account_email = 2;</code>
     *
     * @return The serviceAccountEmail.
     */
    public java.lang.String getServiceAccountEmail() {
      java.lang.Object ref = serviceAccountEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAccountEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The email address of the service account used to authenticate requests to
     * add-on callback endpoints.
     * </pre>
     *
     * <code>string service_account_email = 2;</code>
     *
     * @return The bytes for serviceAccountEmail.
     */
    public com.google.protobuf.ByteString getServiceAccountEmailBytes() {
      java.lang.Object ref = serviceAccountEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceAccountEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The email address of the service account used to authenticate requests to
     * add-on callback endpoints.
     * </pre>
     *
     * <code>string service_account_email = 2;</code>
     *
     * @param value The serviceAccountEmail to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceAccountEmail_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The email address of the service account used to authenticate requests to
     * add-on callback endpoints.
     * </pre>
     *
     * <code>string service_account_email = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceAccountEmail() {
      serviceAccountEmail_ = getDefaultInstance().getServiceAccountEmail();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The email address of the service account used to authenticate requests to
     * add-on callback endpoints.
     * </pre>
     *
     * <code>string service_account_email = 2;</code>
     *
     * @param value The bytes for serviceAccountEmail to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceAccountEmail_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object oauthClientId_ = "";
    /**
     *
     *
     * <pre>
     * The OAuth client ID used to obtain OAuth access tokens for a user on the
     * add-on's behalf.
     * </pre>
     *
     * <code>string oauth_client_id = 3;</code>
     *
     * @return The oauthClientId.
     */
    public java.lang.String getOauthClientId() {
      java.lang.Object ref = oauthClientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oauthClientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The OAuth client ID used to obtain OAuth access tokens for a user on the
     * add-on's behalf.
     * </pre>
     *
     * <code>string oauth_client_id = 3;</code>
     *
     * @return The bytes for oauthClientId.
     */
    public com.google.protobuf.ByteString getOauthClientIdBytes() {
      java.lang.Object ref = oauthClientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        oauthClientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The OAuth client ID used to obtain OAuth access tokens for a user on the
     * add-on's behalf.
     * </pre>
     *
     * <code>string oauth_client_id = 3;</code>
     *
     * @param value The oauthClientId to set.
     * @return This builder for chaining.
     */
    public Builder setOauthClientId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      oauthClientId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The OAuth client ID used to obtain OAuth access tokens for a user on the
     * add-on's behalf.
     * </pre>
     *
     * <code>string oauth_client_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOauthClientId() {
      oauthClientId_ = getDefaultInstance().getOauthClientId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The OAuth client ID used to obtain OAuth access tokens for a user on the
     * add-on's behalf.
     * </pre>
     *
     * <code>string oauth_client_id = 3;</code>
     *
     * @param value The bytes for oauthClientId to set.
     * @return This builder for chaining.
     */
    public Builder setOauthClientIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      oauthClientId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gsuiteaddons.v1.Authorization)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gsuiteaddons.v1.Authorization)
  private static final com.google.cloud.gsuiteaddons.v1.Authorization DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gsuiteaddons.v1.Authorization();
  }

  public static com.google.cloud.gsuiteaddons.v1.Authorization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Authorization> PARSER =
      new com.google.protobuf.AbstractParser<Authorization>() {
        @java.lang.Override
        public Authorization parsePartialFrom(
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

  public static com.google.protobuf.Parser<Authorization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Authorization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gsuiteaddons.v1.Authorization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
