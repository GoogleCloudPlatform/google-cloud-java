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
 * The service account create request.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.CreateServiceAccountRequest}
 */
public final class CreateServiceAccountRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.CreateServiceAccountRequest)
    CreateServiceAccountRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateServiceAccountRequest.newBuilder() to construct.
  private CreateServiceAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateServiceAccountRequest() {
    name_ = "";
    accountId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateServiceAccountRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_CreateServiceAccountRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_CreateServiceAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.CreateServiceAccountRequest.class,
            com.google.iam.admin.v1.CreateServiceAccountRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the project associated with the service
   * accounts, such as `projects/my-project-123`.
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
   * Required. The resource name of the project associated with the service
   * accounts, such as `projects/my-project-123`.
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

  public static final int ACCOUNT_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object accountId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The account id that is used to generate the service account
   * email address and a stable unique id. It is unique within a project,
   * must be 6-30 characters long, and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
   * </pre>
   *
   * <code>string account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The accountId.
   */
  @java.lang.Override
  public java.lang.String getAccountId() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The account id that is used to generate the service account
   * email address and a stable unique id. It is unique within a project,
   * must be 6-30 characters long, and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
   * </pre>
   *
   * <code>string account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for accountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAccountIdBytes() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      accountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_ACCOUNT_FIELD_NUMBER = 3;
  private com.google.iam.admin.v1.ServiceAccount serviceAccount_;
  /**
   *
   *
   * <pre>
   * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
   * create. Currently, only the following values are user assignable:
   * `display_name` and `description`.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
   *
   * @return Whether the serviceAccount field is set.
   */
  @java.lang.Override
  public boolean hasServiceAccount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
   * create. Currently, only the following values are user assignable:
   * `display_name` and `description`.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
   *
   * @return The serviceAccount.
   */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccount getServiceAccount() {
    return serviceAccount_ == null
        ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
        : serviceAccount_;
  }
  /**
   *
   *
   * <pre>
   * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
   * create. Currently, only the following values are user assignable:
   * `display_name` and `description`.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
   */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccountOrBuilder getServiceAccountOrBuilder() {
    return serviceAccount_ == null
        ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
        : serviceAccount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accountId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getServiceAccount());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accountId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getServiceAccount());
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
    if (!(obj instanceof com.google.iam.admin.v1.CreateServiceAccountRequest)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.CreateServiceAccountRequest other =
        (com.google.iam.admin.v1.CreateServiceAccountRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getAccountId().equals(other.getAccountId())) return false;
    if (hasServiceAccount() != other.hasServiceAccount()) return false;
    if (hasServiceAccount()) {
      if (!getServiceAccount().equals(other.getServiceAccount())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId().hashCode();
    if (hasServiceAccount()) {
      hash = (37 * hash) + SERVICE_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getServiceAccount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
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

  public static Builder newBuilder(com.google.iam.admin.v1.CreateServiceAccountRequest prototype) {
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
   * The service account create request.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.CreateServiceAccountRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.CreateServiceAccountRequest)
      com.google.iam.admin.v1.CreateServiceAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_CreateServiceAccountRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_CreateServiceAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.CreateServiceAccountRequest.class,
              com.google.iam.admin.v1.CreateServiceAccountRequest.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.CreateServiceAccountRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getServiceAccountFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      accountId_ = "";
      serviceAccount_ = null;
      if (serviceAccountBuilder_ != null) {
        serviceAccountBuilder_.dispose();
        serviceAccountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_CreateServiceAccountRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.CreateServiceAccountRequest getDefaultInstanceForType() {
      return com.google.iam.admin.v1.CreateServiceAccountRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.CreateServiceAccountRequest build() {
      com.google.iam.admin.v1.CreateServiceAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.CreateServiceAccountRequest buildPartial() {
      com.google.iam.admin.v1.CreateServiceAccountRequest result =
          new com.google.iam.admin.v1.CreateServiceAccountRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.admin.v1.CreateServiceAccountRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accountId_ = accountId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.serviceAccount_ =
            serviceAccountBuilder_ == null ? serviceAccount_ : serviceAccountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.iam.admin.v1.CreateServiceAccountRequest) {
        return mergeFrom((com.google.iam.admin.v1.CreateServiceAccountRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.CreateServiceAccountRequest other) {
      if (other == com.google.iam.admin.v1.CreateServiceAccountRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAccountId().isEmpty()) {
        accountId_ = other.accountId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasServiceAccount()) {
        mergeServiceAccount(other.getServiceAccount());
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
                accountId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getServiceAccountFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
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
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
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
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
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
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
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
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
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

    private java.lang.Object accountId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The accountId.
     */
    public java.lang.String getAccountId() {
      java.lang.Object ref = accountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for accountId.
     */
    public com.google.protobuf.ByteString getAccountIdBytes() {
      java.lang.Object ref = accountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        accountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The accountId to set.
     * @return This builder for chaining.
     */
    public Builder setAccountId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      accountId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccountId() {
      accountId_ = getDefaultInstance().getAccountId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for accountId to set.
     * @return This builder for chaining.
     */
    public Builder setAccountIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      accountId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.iam.admin.v1.ServiceAccount serviceAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.admin.v1.ServiceAccount,
            com.google.iam.admin.v1.ServiceAccount.Builder,
            com.google.iam.admin.v1.ServiceAccountOrBuilder>
        serviceAccountBuilder_;
    /**
     *
     *
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
     * create. Currently, only the following values are user assignable:
     * `display_name` and `description`.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     *
     * @return Whether the serviceAccount field is set.
     */
    public boolean hasServiceAccount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
     * create. Currently, only the following values are user assignable:
     * `display_name` and `description`.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     *
     * @return The serviceAccount.
     */
    public com.google.iam.admin.v1.ServiceAccount getServiceAccount() {
      if (serviceAccountBuilder_ == null) {
        return serviceAccount_ == null
            ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
            : serviceAccount_;
      } else {
        return serviceAccountBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
     * create. Currently, only the following values are user assignable:
     * `display_name` and `description`.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public Builder setServiceAccount(com.google.iam.admin.v1.ServiceAccount value) {
      if (serviceAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceAccount_ = value;
      } else {
        serviceAccountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
     * create. Currently, only the following values are user assignable:
     * `display_name` and `description`.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public Builder setServiceAccount(
        com.google.iam.admin.v1.ServiceAccount.Builder builderForValue) {
      if (serviceAccountBuilder_ == null) {
        serviceAccount_ = builderForValue.build();
      } else {
        serviceAccountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
     * create. Currently, only the following values are user assignable:
     * `display_name` and `description`.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public Builder mergeServiceAccount(com.google.iam.admin.v1.ServiceAccount value) {
      if (serviceAccountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && serviceAccount_ != null
            && serviceAccount_ != com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()) {
          getServiceAccountBuilder().mergeFrom(value);
        } else {
          serviceAccount_ = value;
        }
      } else {
        serviceAccountBuilder_.mergeFrom(value);
      }
      if (serviceAccount_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
     * create. Currently, only the following values are user assignable:
     * `display_name` and `description`.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public Builder clearServiceAccount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      serviceAccount_ = null;
      if (serviceAccountBuilder_ != null) {
        serviceAccountBuilder_.dispose();
        serviceAccountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
     * create. Currently, only the following values are user assignable:
     * `display_name` and `description`.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public com.google.iam.admin.v1.ServiceAccount.Builder getServiceAccountBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getServiceAccountFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
     * create. Currently, only the following values are user assignable:
     * `display_name` and `description`.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public com.google.iam.admin.v1.ServiceAccountOrBuilder getServiceAccountOrBuilder() {
      if (serviceAccountBuilder_ != null) {
        return serviceAccountBuilder_.getMessageOrBuilder();
      } else {
        return serviceAccount_ == null
            ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
            : serviceAccount_;
      }
    }
    /**
     *
     *
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
     * create. Currently, only the following values are user assignable:
     * `display_name` and `description`.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.admin.v1.ServiceAccount,
            com.google.iam.admin.v1.ServiceAccount.Builder,
            com.google.iam.admin.v1.ServiceAccountOrBuilder>
        getServiceAccountFieldBuilder() {
      if (serviceAccountBuilder_ == null) {
        serviceAccountBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.iam.admin.v1.ServiceAccount,
                com.google.iam.admin.v1.ServiceAccount.Builder,
                com.google.iam.admin.v1.ServiceAccountOrBuilder>(
                getServiceAccount(), getParentForChildren(), isClean());
        serviceAccount_ = null;
      }
      return serviceAccountBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.CreateServiceAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.CreateServiceAccountRequest)
  private static final com.google.iam.admin.v1.CreateServiceAccountRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.CreateServiceAccountRequest();
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceAccountRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateServiceAccountRequest>() {
        @java.lang.Override
        public CreateServiceAccountRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateServiceAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceAccountRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.CreateServiceAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
