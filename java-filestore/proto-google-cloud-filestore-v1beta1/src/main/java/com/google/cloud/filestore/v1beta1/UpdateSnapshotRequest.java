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
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1beta1;

/**
 *
 *
 * <pre>
 * UpdateSnapshotRequest updates description and/or labels for a snapshot.
 * </pre>
 *
 * Protobuf type {@code google.cloud.filestore.v1beta1.UpdateSnapshotRequest}
 */
public final class UpdateSnapshotRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.filestore.v1beta1.UpdateSnapshotRequest)
    UpdateSnapshotRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateSnapshotRequest.newBuilder() to construct.
  private UpdateSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateSnapshotRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateSnapshotRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
        .internal_static_google_cloud_filestore_v1beta1_UpdateSnapshotRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
        .internal_static_google_cloud_filestore_v1beta1_UpdateSnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest.class,
            com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int SNAPSHOT_FIELD_NUMBER = 2;
  private com.google.cloud.filestore.v1beta1.Snapshot snapshot_;
  /**
   *
   *
   * <pre>
   * Required. A snapshot resource
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the snapshot field is set.
   */
  @java.lang.Override
  public boolean hasSnapshot() {
    return snapshot_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A snapshot resource
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The snapshot.
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.Snapshot getSnapshot() {
    return snapshot_ == null
        ? com.google.cloud.filestore.v1beta1.Snapshot.getDefaultInstance()
        : snapshot_;
  }
  /**
   *
   *
   * <pre>
   * Required. A snapshot resource
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.SnapshotOrBuilder getSnapshotOrBuilder() {
    return snapshot_ == null
        ? com.google.cloud.filestore.v1beta1.Snapshot.getDefaultInstance()
        : snapshot_;
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (snapshot_ != null) {
      output.writeMessage(2, getSnapshot());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateMask());
    }
    if (snapshot_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSnapshot());
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
    if (!(obj instanceof com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest other =
        (com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasSnapshot() != other.hasSnapshot()) return false;
    if (hasSnapshot()) {
      if (!getSnapshot().equals(other.getSnapshot())) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasSnapshot()) {
      hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshot().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest parseFrom(
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
      com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest prototype) {
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
   * UpdateSnapshotRequest updates description and/or labels for a snapshot.
   * </pre>
   *
   * Protobuf type {@code google.cloud.filestore.v1beta1.UpdateSnapshotRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.filestore.v1beta1.UpdateSnapshotRequest)
      com.google.cloud.filestore.v1beta1.UpdateSnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
          .internal_static_google_cloud_filestore_v1beta1_UpdateSnapshotRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
          .internal_static_google_cloud_filestore_v1beta1_UpdateSnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest.class,
              com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest.Builder.class);
    }

    // Construct using com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      snapshot_ = null;
      if (snapshotBuilder_ != null) {
        snapshotBuilder_.dispose();
        snapshotBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
          .internal_static_google_cloud_filestore_v1beta1_UpdateSnapshotRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest getDefaultInstanceForType() {
      return com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest build() {
      com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest buildPartial() {
      com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest result =
          new com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.snapshot_ = snapshotBuilder_ == null ? snapshot_ : snapshotBuilder_.build();
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
      if (other instanceof com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest) {
        return mergeFrom((com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest other) {
      if (other == com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasSnapshot()) {
        mergeSnapshot(other.getSnapshot());
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
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getSnapshotFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
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

    private com.google.cloud.filestore.v1beta1.Snapshot snapshot_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.filestore.v1beta1.Snapshot,
            com.google.cloud.filestore.v1beta1.Snapshot.Builder,
            com.google.cloud.filestore.v1beta1.SnapshotOrBuilder>
        snapshotBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A snapshot resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the snapshot field is set.
     */
    public boolean hasSnapshot() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A snapshot resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The snapshot.
     */
    public com.google.cloud.filestore.v1beta1.Snapshot getSnapshot() {
      if (snapshotBuilder_ == null) {
        return snapshot_ == null
            ? com.google.cloud.filestore.v1beta1.Snapshot.getDefaultInstance()
            : snapshot_;
      } else {
        return snapshotBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A snapshot resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSnapshot(com.google.cloud.filestore.v1beta1.Snapshot value) {
      if (snapshotBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        snapshot_ = value;
      } else {
        snapshotBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A snapshot resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSnapshot(
        com.google.cloud.filestore.v1beta1.Snapshot.Builder builderForValue) {
      if (snapshotBuilder_ == null) {
        snapshot_ = builderForValue.build();
      } else {
        snapshotBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A snapshot resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSnapshot(com.google.cloud.filestore.v1beta1.Snapshot value) {
      if (snapshotBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && snapshot_ != null
            && snapshot_ != com.google.cloud.filestore.v1beta1.Snapshot.getDefaultInstance()) {
          getSnapshotBuilder().mergeFrom(value);
        } else {
          snapshot_ = value;
        }
      } else {
        snapshotBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A snapshot resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSnapshot() {
      bitField0_ = (bitField0_ & ~0x00000002);
      snapshot_ = null;
      if (snapshotBuilder_ != null) {
        snapshotBuilder_.dispose();
        snapshotBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A snapshot resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.filestore.v1beta1.Snapshot.Builder getSnapshotBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSnapshotFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A snapshot resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.filestore.v1beta1.SnapshotOrBuilder getSnapshotOrBuilder() {
      if (snapshotBuilder_ != null) {
        return snapshotBuilder_.getMessageOrBuilder();
      } else {
        return snapshot_ == null
            ? com.google.cloud.filestore.v1beta1.Snapshot.getDefaultInstance()
            : snapshot_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A snapshot resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.filestore.v1beta1.Snapshot,
            com.google.cloud.filestore.v1beta1.Snapshot.Builder,
            com.google.cloud.filestore.v1beta1.SnapshotOrBuilder>
        getSnapshotFieldBuilder() {
      if (snapshotBuilder_ == null) {
        snapshotBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.filestore.v1beta1.Snapshot,
                com.google.cloud.filestore.v1beta1.Snapshot.Builder,
                com.google.cloud.filestore.v1beta1.SnapshotOrBuilder>(
                getSnapshot(), getParentForChildren(), isClean());
        snapshot_ = null;
      }
      return snapshotBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.filestore.v1beta1.UpdateSnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.filestore.v1beta1.UpdateSnapshotRequest)
  private static final com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest();
  }

  public static com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSnapshotRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateSnapshotRequest>() {
        @java.lang.Override
        public UpdateSnapshotRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSnapshotRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.UpdateSnapshotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
