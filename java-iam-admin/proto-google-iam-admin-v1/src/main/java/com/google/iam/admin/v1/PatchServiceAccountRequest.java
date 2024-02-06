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
 * The service account patch request.
 *
 * You can patch only the `display_name` and `description` fields. You must use
 * the `update_mask` field to specify which of these fields you want to patch.
 *
 * Only the fields specified in the request are guaranteed to be returned in
 * the response. Other fields may be empty in the response.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.PatchServiceAccountRequest}
 */
public final class PatchServiceAccountRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.PatchServiceAccountRequest)
    PatchServiceAccountRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PatchServiceAccountRequest.newBuilder() to construct.
  private PatchServiceAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PatchServiceAccountRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PatchServiceAccountRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_PatchServiceAccountRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_PatchServiceAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.PatchServiceAccountRequest.class,
            com.google.iam.admin.v1.PatchServiceAccountRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICE_ACCOUNT_FIELD_NUMBER = 1;
  private com.google.iam.admin.v1.ServiceAccount serviceAccount_;
  /**
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code>
   *
   * @return Whether the serviceAccount field is set.
   */
  @java.lang.Override
  public boolean hasServiceAccount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code>
   *
   * @return The serviceAccount.
   */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccount getServiceAccount() {
    return serviceAccount_ == null
        ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
        : serviceAccount_;
  }
  /** <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code> */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccountOrBuilder getServiceAccountOrBuilder() {
    return serviceAccount_ == null
        ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
        : serviceAccount_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /** <code>.google.protobuf.FieldMask update_mask = 2;</code> */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getServiceAccount());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getServiceAccount());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.iam.admin.v1.PatchServiceAccountRequest)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.PatchServiceAccountRequest other =
        (com.google.iam.admin.v1.PatchServiceAccountRequest) obj;

    if (hasServiceAccount() != other.hasServiceAccount()) return false;
    if (hasServiceAccount()) {
      if (!getServiceAccount().equals(other.getServiceAccount())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasServiceAccount()) {
      hash = (37 * hash) + SERVICE_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getServiceAccount().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest parseFrom(
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

  public static Builder newBuilder(com.google.iam.admin.v1.PatchServiceAccountRequest prototype) {
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
   * The service account patch request.
   *
   * You can patch only the `display_name` and `description` fields. You must use
   * the `update_mask` field to specify which of these fields you want to patch.
   *
   * Only the fields specified in the request are guaranteed to be returned in
   * the response. Other fields may be empty in the response.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.PatchServiceAccountRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.PatchServiceAccountRequest)
      com.google.iam.admin.v1.PatchServiceAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_PatchServiceAccountRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_PatchServiceAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.PatchServiceAccountRequest.class,
              com.google.iam.admin.v1.PatchServiceAccountRequest.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.PatchServiceAccountRequest.newBuilder()
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
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      serviceAccount_ = null;
      if (serviceAccountBuilder_ != null) {
        serviceAccountBuilder_.dispose();
        serviceAccountBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_PatchServiceAccountRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.PatchServiceAccountRequest getDefaultInstanceForType() {
      return com.google.iam.admin.v1.PatchServiceAccountRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.PatchServiceAccountRequest build() {
      com.google.iam.admin.v1.PatchServiceAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.PatchServiceAccountRequest buildPartial() {
      com.google.iam.admin.v1.PatchServiceAccountRequest result =
          new com.google.iam.admin.v1.PatchServiceAccountRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.admin.v1.PatchServiceAccountRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceAccount_ =
            serviceAccountBuilder_ == null ? serviceAccount_ : serviceAccountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.iam.admin.v1.PatchServiceAccountRequest) {
        return mergeFrom((com.google.iam.admin.v1.PatchServiceAccountRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.PatchServiceAccountRequest other) {
      if (other == com.google.iam.admin.v1.PatchServiceAccountRequest.getDefaultInstance())
        return this;
      if (other.hasServiceAccount()) {
        mergeServiceAccount(other.getServiceAccount());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getServiceAccountFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.iam.admin.v1.ServiceAccount serviceAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.admin.v1.ServiceAccount,
            com.google.iam.admin.v1.ServiceAccount.Builder,
            com.google.iam.admin.v1.ServiceAccountOrBuilder>
        serviceAccountBuilder_;
    /**
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code>
     *
     * @return Whether the serviceAccount field is set.
     */
    public boolean hasServiceAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code>
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
    /** <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code> */
    public Builder setServiceAccount(com.google.iam.admin.v1.ServiceAccount value) {
      if (serviceAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceAccount_ = value;
      } else {
        serviceAccountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /** <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code> */
    public Builder setServiceAccount(
        com.google.iam.admin.v1.ServiceAccount.Builder builderForValue) {
      if (serviceAccountBuilder_ == null) {
        serviceAccount_ = builderForValue.build();
      } else {
        serviceAccountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /** <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code> */
    public Builder mergeServiceAccount(com.google.iam.admin.v1.ServiceAccount value) {
      if (serviceAccountBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
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
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /** <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code> */
    public Builder clearServiceAccount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      serviceAccount_ = null;
      if (serviceAccountBuilder_ != null) {
        serviceAccountBuilder_.dispose();
        serviceAccountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /** <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code> */
    public com.google.iam.admin.v1.ServiceAccount.Builder getServiceAccountBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getServiceAccountFieldBuilder().getBuilder();
    }
    /** <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code> */
    public com.google.iam.admin.v1.ServiceAccountOrBuilder getServiceAccountOrBuilder() {
      if (serviceAccountBuilder_ != null) {
        return serviceAccountBuilder_.getMessageOrBuilder();
      } else {
        return serviceAccount_ == null
            ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
            : serviceAccount_;
      }
    }
    /** <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code> */
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /** <code>.google.protobuf.FieldMask update_mask = 2;</code> */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /** <code>.google.protobuf.FieldMask update_mask = 2;</code> */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /** <code>.google.protobuf.FieldMask update_mask = 2;</code> */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /** <code>.google.protobuf.FieldMask update_mask = 2;</code> */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /** <code>.google.protobuf.FieldMask update_mask = 2;</code> */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /** <code>.google.protobuf.FieldMask update_mask = 2;</code> */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /** <code>.google.protobuf.FieldMask update_mask = 2;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.PatchServiceAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.PatchServiceAccountRequest)
  private static final com.google.iam.admin.v1.PatchServiceAccountRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.PatchServiceAccountRequest();
  }

  public static com.google.iam.admin.v1.PatchServiceAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PatchServiceAccountRequest> PARSER =
      new com.google.protobuf.AbstractParser<PatchServiceAccountRequest>() {
        @java.lang.Override
        public PatchServiceAccountRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PatchServiceAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PatchServiceAccountRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.PatchServiceAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
