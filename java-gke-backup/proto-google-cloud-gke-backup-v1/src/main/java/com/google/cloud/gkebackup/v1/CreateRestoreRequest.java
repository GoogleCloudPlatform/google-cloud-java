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
// source: google/cloud/gkebackup/v1/gkebackup.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkebackup.v1;

/**
 *
 *
 * <pre>
 * Request message for CreateRestore.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkebackup.v1.CreateRestoreRequest}
 */
public final class CreateRestoreRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkebackup.v1.CreateRestoreRequest)
    CreateRestoreRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateRestoreRequest.newBuilder() to construct.
  private CreateRestoreRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateRestoreRequest() {
    parent_ = "";
    restoreId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateRestoreRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_CreateRestoreRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_CreateRestoreRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkebackup.v1.CreateRestoreRequest.class,
            com.google.cloud.gkebackup.v1.CreateRestoreRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The RestorePlan within which to create the Restore.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;`
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
   * Required. The RestorePlan within which to create the Restore.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;`
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

  public static final int RESTORE_FIELD_NUMBER = 2;
  private com.google.cloud.gkebackup.v1.Restore restore_;
  /**
   *
   *
   * <pre>
   * Required. The restore resource to create.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the restore field is set.
   */
  @java.lang.Override
  public boolean hasRestore() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The restore resource to create.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The restore.
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.Restore getRestore() {
    return restore_ == null ? com.google.cloud.gkebackup.v1.Restore.getDefaultInstance() : restore_;
  }
  /**
   *
   *
   * <pre>
   * Required. The restore resource to create.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.RestoreOrBuilder getRestoreOrBuilder() {
    return restore_ == null ? com.google.cloud.gkebackup.v1.Restore.getDefaultInstance() : restore_;
  }

  public static final int RESTORE_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object restoreId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The client-provided short name for the Restore resource.
   * This name must:
   *
   * - be between 1 and 63 characters long (inclusive)
   * - consist of only lower-case ASCII letters, numbers, and dashes
   * - start with a lower-case letter
   * - end with a lower-case letter or number
   * - be unique within the set of Restores in this RestorePlan.
   * </pre>
   *
   * <code>string restore_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The restoreId.
   */
  @java.lang.Override
  public java.lang.String getRestoreId() {
    java.lang.Object ref = restoreId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      restoreId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The client-provided short name for the Restore resource.
   * This name must:
   *
   * - be between 1 and 63 characters long (inclusive)
   * - consist of only lower-case ASCII letters, numbers, and dashes
   * - start with a lower-case letter
   * - end with a lower-case letter or number
   * - be unique within the set of Restores in this RestorePlan.
   * </pre>
   *
   * <code>string restore_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for restoreId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRestoreIdBytes() {
    java.lang.Object ref = restoreId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      restoreId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getRestore());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restoreId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, restoreId_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRestore());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restoreId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, restoreId_);
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
    if (!(obj instanceof com.google.cloud.gkebackup.v1.CreateRestoreRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gkebackup.v1.CreateRestoreRequest other =
        (com.google.cloud.gkebackup.v1.CreateRestoreRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasRestore() != other.hasRestore()) return false;
    if (hasRestore()) {
      if (!getRestore().equals(other.getRestore())) return false;
    }
    if (!getRestoreId().equals(other.getRestoreId())) return false;
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
    if (hasRestore()) {
      hash = (37 * hash) + RESTORE_FIELD_NUMBER;
      hash = (53 * hash) + getRestore().hashCode();
    }
    hash = (37 * hash) + RESTORE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRestoreId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkebackup.v1.CreateRestoreRequest prototype) {
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
   * Request message for CreateRestore.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkebackup.v1.CreateRestoreRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkebackup.v1.CreateRestoreRequest)
      com.google.cloud.gkebackup.v1.CreateRestoreRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_CreateRestoreRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_CreateRestoreRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkebackup.v1.CreateRestoreRequest.class,
              com.google.cloud.gkebackup.v1.CreateRestoreRequest.Builder.class);
    }

    // Construct using com.google.cloud.gkebackup.v1.CreateRestoreRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRestoreFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      restore_ = null;
      if (restoreBuilder_ != null) {
        restoreBuilder_.dispose();
        restoreBuilder_ = null;
      }
      restoreId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_CreateRestoreRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.CreateRestoreRequest getDefaultInstanceForType() {
      return com.google.cloud.gkebackup.v1.CreateRestoreRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.CreateRestoreRequest build() {
      com.google.cloud.gkebackup.v1.CreateRestoreRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.CreateRestoreRequest buildPartial() {
      com.google.cloud.gkebackup.v1.CreateRestoreRequest result =
          new com.google.cloud.gkebackup.v1.CreateRestoreRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkebackup.v1.CreateRestoreRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.restore_ = restoreBuilder_ == null ? restore_ : restoreBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.restoreId_ = restoreId_;
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
      if (other instanceof com.google.cloud.gkebackup.v1.CreateRestoreRequest) {
        return mergeFrom((com.google.cloud.gkebackup.v1.CreateRestoreRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkebackup.v1.CreateRestoreRequest other) {
      if (other == com.google.cloud.gkebackup.v1.CreateRestoreRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRestore()) {
        mergeRestore(other.getRestore());
      }
      if (!other.getRestoreId().isEmpty()) {
        restoreId_ = other.restoreId_;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getRestoreFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                restoreId_ = input.readStringRequireUtf8();
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan within which to create the Restore.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;`
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
     * Required. The RestorePlan within which to create the Restore.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;`
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
     * Required. The RestorePlan within which to create the Restore.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;`
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
     * Required. The RestorePlan within which to create the Restore.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;`
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
     * Required. The RestorePlan within which to create the Restore.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;`
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

    private com.google.cloud.gkebackup.v1.Restore restore_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkebackup.v1.Restore,
            com.google.cloud.gkebackup.v1.Restore.Builder,
            com.google.cloud.gkebackup.v1.RestoreOrBuilder>
        restoreBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The restore resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the restore field is set.
     */
    public boolean hasRestore() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The restore resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The restore.
     */
    public com.google.cloud.gkebackup.v1.Restore getRestore() {
      if (restoreBuilder_ == null) {
        return restore_ == null
            ? com.google.cloud.gkebackup.v1.Restore.getDefaultInstance()
            : restore_;
      } else {
        return restoreBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The restore resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRestore(com.google.cloud.gkebackup.v1.Restore value) {
      if (restoreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        restore_ = value;
      } else {
        restoreBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The restore resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRestore(com.google.cloud.gkebackup.v1.Restore.Builder builderForValue) {
      if (restoreBuilder_ == null) {
        restore_ = builderForValue.build();
      } else {
        restoreBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The restore resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRestore(com.google.cloud.gkebackup.v1.Restore value) {
      if (restoreBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && restore_ != null
            && restore_ != com.google.cloud.gkebackup.v1.Restore.getDefaultInstance()) {
          getRestoreBuilder().mergeFrom(value);
        } else {
          restore_ = value;
        }
      } else {
        restoreBuilder_.mergeFrom(value);
      }
      if (restore_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The restore resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRestore() {
      bitField0_ = (bitField0_ & ~0x00000002);
      restore_ = null;
      if (restoreBuilder_ != null) {
        restoreBuilder_.dispose();
        restoreBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The restore resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkebackup.v1.Restore.Builder getRestoreBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRestoreFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The restore resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkebackup.v1.RestoreOrBuilder getRestoreOrBuilder() {
      if (restoreBuilder_ != null) {
        return restoreBuilder_.getMessageOrBuilder();
      } else {
        return restore_ == null
            ? com.google.cloud.gkebackup.v1.Restore.getDefaultInstance()
            : restore_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The restore resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkebackup.v1.Restore,
            com.google.cloud.gkebackup.v1.Restore.Builder,
            com.google.cloud.gkebackup.v1.RestoreOrBuilder>
        getRestoreFieldBuilder() {
      if (restoreBuilder_ == null) {
        restoreBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkebackup.v1.Restore,
                com.google.cloud.gkebackup.v1.Restore.Builder,
                com.google.cloud.gkebackup.v1.RestoreOrBuilder>(
                getRestore(), getParentForChildren(), isClean());
        restore_ = null;
      }
      return restoreBuilder_;
    }

    private java.lang.Object restoreId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the Restore resource.
     * This name must:
     *
     * - be between 1 and 63 characters long (inclusive)
     * - consist of only lower-case ASCII letters, numbers, and dashes
     * - start with a lower-case letter
     * - end with a lower-case letter or number
     * - be unique within the set of Restores in this RestorePlan.
     * </pre>
     *
     * <code>string restore_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The restoreId.
     */
    public java.lang.String getRestoreId() {
      java.lang.Object ref = restoreId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        restoreId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the Restore resource.
     * This name must:
     *
     * - be between 1 and 63 characters long (inclusive)
     * - consist of only lower-case ASCII letters, numbers, and dashes
     * - start with a lower-case letter
     * - end with a lower-case letter or number
     * - be unique within the set of Restores in this RestorePlan.
     * </pre>
     *
     * <code>string restore_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for restoreId.
     */
    public com.google.protobuf.ByteString getRestoreIdBytes() {
      java.lang.Object ref = restoreId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        restoreId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the Restore resource.
     * This name must:
     *
     * - be between 1 and 63 characters long (inclusive)
     * - consist of only lower-case ASCII letters, numbers, and dashes
     * - start with a lower-case letter
     * - end with a lower-case letter or number
     * - be unique within the set of Restores in this RestorePlan.
     * </pre>
     *
     * <code>string restore_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The restoreId to set.
     * @return This builder for chaining.
     */
    public Builder setRestoreId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      restoreId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the Restore resource.
     * This name must:
     *
     * - be between 1 and 63 characters long (inclusive)
     * - consist of only lower-case ASCII letters, numbers, and dashes
     * - start with a lower-case letter
     * - end with a lower-case letter or number
     * - be unique within the set of Restores in this RestorePlan.
     * </pre>
     *
     * <code>string restore_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRestoreId() {
      restoreId_ = getDefaultInstance().getRestoreId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the Restore resource.
     * This name must:
     *
     * - be between 1 and 63 characters long (inclusive)
     * - consist of only lower-case ASCII letters, numbers, and dashes
     * - start with a lower-case letter
     * - end with a lower-case letter or number
     * - be unique within the set of Restores in this RestorePlan.
     * </pre>
     *
     * <code>string restore_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for restoreId to set.
     * @return This builder for chaining.
     */
    public Builder setRestoreIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      restoreId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkebackup.v1.CreateRestoreRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkebackup.v1.CreateRestoreRequest)
  private static final com.google.cloud.gkebackup.v1.CreateRestoreRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkebackup.v1.CreateRestoreRequest();
  }

  public static com.google.cloud.gkebackup.v1.CreateRestoreRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRestoreRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateRestoreRequest>() {
        @java.lang.Override
        public CreateRestoreRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRestoreRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRestoreRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkebackup.v1.CreateRestoreRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
