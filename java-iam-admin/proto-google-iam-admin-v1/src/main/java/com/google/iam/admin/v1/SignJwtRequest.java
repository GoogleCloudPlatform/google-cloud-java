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
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 3.25.2
package com.google.iam.admin.v1;

/**
 *
 *
 * <pre>
 * Deprecated. [Migrate to Service Account Credentials
 * API](https://cloud.google.com/iam/help/credentials/migrate-api).
 *
 * The service account sign JWT request.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.SignJwtRequest}
 */
public final class SignJwtRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.SignJwtRequest)
    SignJwtRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SignJwtRequest.newBuilder() to construct.
  private SignJwtRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SignJwtRequest() {
    name_ = "";
    payload_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SignJwtRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_SignJwtRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_SignJwtRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.SignJwtRequest.class,
            com.google.iam.admin.v1.SignJwtRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>
   * string name = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.iam.admin.v1.SignJwtRequest.name is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=1023
   * @return The name.
   */
  @java.lang.Override
  @java.lang.Deprecated
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
   * Required. Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>
   * string name = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.iam.admin.v1.SignJwtRequest.name is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=1023
   * @return The bytes for name.
   */
  @java.lang.Override
  @java.lang.Deprecated
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

  public static final int PAYLOAD_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object payload_ = "";
  /**
   *
   *
   * <pre>
   * Required. Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The JWT payload to sign. Must be a serialized JSON object that contains a
   * JWT Claims Set. For example: `{"sub": "user&#64;example.com", "iat": 313435}`
   *
   * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be
   * an integer timestamp that is not in the past and no more than 12 hours in
   * the future.
   *
   * If the JWT Claims Set does not contain an expiration time (`exp`) claim,
   * this claim is added automatically, with a timestamp that is 1 hour in the
   * future.
   * </pre>
   *
   * <code>string payload = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @deprecated google.iam.admin.v1.SignJwtRequest.payload is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=1044
   * @return The payload.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getPayload() {
    java.lang.Object ref = payload_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      payload_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The JWT payload to sign. Must be a serialized JSON object that contains a
   * JWT Claims Set. For example: `{"sub": "user&#64;example.com", "iat": 313435}`
   *
   * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be
   * an integer timestamp that is not in the past and no more than 12 hours in
   * the future.
   *
   * If the JWT Claims Set does not contain an expiration time (`exp`) claim,
   * this claim is added automatically, with a timestamp that is 1 hour in the
   * future.
   * </pre>
   *
   * <code>string payload = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @deprecated google.iam.admin.v1.SignJwtRequest.payload is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=1044
   * @return The bytes for payload.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getPayloadBytes() {
    java.lang.Object ref = payload_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      payload_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payload_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, payload_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payload_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, payload_);
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
    if (!(obj instanceof com.google.iam.admin.v1.SignJwtRequest)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.SignJwtRequest other = (com.google.iam.admin.v1.SignJwtRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getPayload().equals(other.getPayload())) return false;
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
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.SignJwtRequest parseFrom(
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

  public static Builder newBuilder(com.google.iam.admin.v1.SignJwtRequest prototype) {
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
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The service account sign JWT request.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.SignJwtRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.SignJwtRequest)
      com.google.iam.admin.v1.SignJwtRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_SignJwtRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_SignJwtRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.SignJwtRequest.class,
              com.google.iam.admin.v1.SignJwtRequest.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.SignJwtRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      payload_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_SignJwtRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.SignJwtRequest getDefaultInstanceForType() {
      return com.google.iam.admin.v1.SignJwtRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.SignJwtRequest build() {
      com.google.iam.admin.v1.SignJwtRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.SignJwtRequest buildPartial() {
      com.google.iam.admin.v1.SignJwtRequest result =
          new com.google.iam.admin.v1.SignJwtRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.admin.v1.SignJwtRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.payload_ = payload_;
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
      if (other instanceof com.google.iam.admin.v1.SignJwtRequest) {
        return mergeFrom((com.google.iam.admin.v1.SignJwtRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.SignJwtRequest other) {
      if (other == com.google.iam.admin.v1.SignJwtRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPayload().isEmpty()) {
        payload_ = other.payload_;
        bitField0_ |= 0x00000002;
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
                payload_ = input.readStringRequireUtf8();
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.name is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1023
     * @return The name.
     */
    @java.lang.Deprecated
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
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.name is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1023
     * @return The bytes for name.
     */
    @java.lang.Deprecated
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
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.name is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1023
     * @param value The name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
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
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.name is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1023
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
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
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The resource name of the service account in the following format:
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
     * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
     * the account. The `ACCOUNT` value can be the `email` address or the
     * `unique_id` of the service account.
     * </pre>
     *
     * <code>
     * string name = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.name is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1023
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
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

    private java.lang.Object payload_ = "";
    /**
     *
     *
     * <pre>
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The JWT payload to sign. Must be a serialized JSON object that contains a
     * JWT Claims Set. For example: `{"sub": "user&#64;example.com", "iat": 313435}`
     *
     * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be
     * an integer timestamp that is not in the past and no more than 12 hours in
     * the future.
     *
     * If the JWT Claims Set does not contain an expiration time (`exp`) claim,
     * this claim is added automatically, with a timestamp that is 1 hour in the
     * future.
     * </pre>
     *
     * <code>string payload = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.payload is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1044
     * @return The payload.
     */
    @java.lang.Deprecated
    public java.lang.String getPayload() {
      java.lang.Object ref = payload_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payload_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The JWT payload to sign. Must be a serialized JSON object that contains a
     * JWT Claims Set. For example: `{"sub": "user&#64;example.com", "iat": 313435}`
     *
     * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be
     * an integer timestamp that is not in the past and no more than 12 hours in
     * the future.
     *
     * If the JWT Claims Set does not contain an expiration time (`exp`) claim,
     * this claim is added automatically, with a timestamp that is 1 hour in the
     * future.
     * </pre>
     *
     * <code>string payload = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.payload is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1044
     * @return The bytes for payload.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getPayloadBytes() {
      java.lang.Object ref = payload_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        payload_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The JWT payload to sign. Must be a serialized JSON object that contains a
     * JWT Claims Set. For example: `{"sub": "user&#64;example.com", "iat": 313435}`
     *
     * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be
     * an integer timestamp that is not in the past and no more than 12 hours in
     * the future.
     *
     * If the JWT Claims Set does not contain an expiration time (`exp`) claim,
     * this claim is added automatically, with a timestamp that is 1 hour in the
     * future.
     * </pre>
     *
     * <code>string payload = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.payload is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1044
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setPayload(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      payload_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The JWT payload to sign. Must be a serialized JSON object that contains a
     * JWT Claims Set. For example: `{"sub": "user&#64;example.com", "iat": 313435}`
     *
     * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be
     * an integer timestamp that is not in the past and no more than 12 hours in
     * the future.
     *
     * If the JWT Claims Set does not contain an expiration time (`exp`) claim,
     * this claim is added automatically, with a timestamp that is 1 hour in the
     * future.
     * </pre>
     *
     * <code>string payload = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.payload is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1044
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearPayload() {
      payload_ = getDefaultInstance().getPayload();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The JWT payload to sign. Must be a serialized JSON object that contains a
     * JWT Claims Set. For example: `{"sub": "user&#64;example.com", "iat": 313435}`
     *
     * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be
     * an integer timestamp that is not in the past and no more than 12 hours in
     * the future.
     *
     * If the JWT Claims Set does not contain an expiration time (`exp`) claim,
     * this claim is added automatically, with a timestamp that is 1 hour in the
     * future.
     * </pre>
     *
     * <code>string payload = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtRequest.payload is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1044
     * @param value The bytes for payload to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setPayloadBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      payload_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.SignJwtRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.SignJwtRequest)
  private static final com.google.iam.admin.v1.SignJwtRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.SignJwtRequest();
  }

  public static com.google.iam.admin.v1.SignJwtRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignJwtRequest> PARSER =
      new com.google.protobuf.AbstractParser<SignJwtRequest>() {
        @java.lang.Override
        public SignJwtRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignJwtRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignJwtRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.SignJwtRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
