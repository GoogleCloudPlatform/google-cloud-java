// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/persistent_resource_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for UpdatePersistentResource method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest}
 */
public final class UpdatePersistentResourceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest)
    UpdatePersistentResourceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePersistentResourceRequest.newBuilder() to construct.
  private UpdatePersistentResourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePersistentResourceRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatePersistentResourceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdatePersistentResourceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdatePersistentResourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest.class, com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest.Builder.class);
  }

  public static final int PERSISTENT_RESOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.PersistentResource persistentResource_;
  /**
   * <pre>
   * Required. The PersistentResource to update.
   *
   * The PersistentResource's `name` field is used to identify the
   * PersistentResource to update. Format:
   * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the persistentResource field is set.
   */
  @java.lang.Override
  public boolean hasPersistentResource() {
    return persistentResource_ != null;
  }
  /**
   * <pre>
   * Required. The PersistentResource to update.
   *
   * The PersistentResource's `name` field is used to identify the
   * PersistentResource to update. Format:
   * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The persistentResource.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PersistentResource getPersistentResource() {
    return persistentResource_ == null ? com.google.cloud.aiplatform.v1beta1.PersistentResource.getDefaultInstance() : persistentResource_;
  }
  /**
   * <pre>
   * Required. The PersistentResource to update.
   *
   * The PersistentResource's `name` field is used to identify the
   * PersistentResource to update. Format:
   * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder getPersistentResourceOrBuilder() {
    return persistentResource_ == null ? com.google.cloud.aiplatform.v1beta1.PersistentResource.getDefaultInstance() : persistentResource_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Specify the fields to be overwritten in the PersistentResource by
   * the update method.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Specify the fields to be overwritten in the PersistentResource by
   * the update method.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Specify the fields to be overwritten in the PersistentResource by
   * the update method.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (persistentResource_ != null) {
      output.writeMessage(1, getPersistentResource());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (persistentResource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPersistentResource());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest other = (com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest) obj;

    if (hasPersistentResource() != other.hasPersistentResource()) return false;
    if (hasPersistentResource()) {
      if (!getPersistentResource()
          .equals(other.getPersistentResource())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasPersistentResource()) {
      hash = (37 * hash) + PERSISTENT_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getPersistentResource().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for UpdatePersistentResource method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest)
      com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdatePersistentResourceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdatePersistentResourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest.class, com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      persistentResource_ = null;
      if (persistentResourceBuilder_ != null) {
        persistentResourceBuilder_.dispose();
        persistentResourceBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_UpdatePersistentResourceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest build() {
      com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest result = new com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.persistentResource_ = persistentResourceBuilder_ == null
            ? persistentResource_
            : persistentResourceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest.getDefaultInstance()) return this;
      if (other.hasPersistentResource()) {
        mergePersistentResource(other.getPersistentResource());
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
            case 10: {
              input.readMessage(
                  getPersistentResourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
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

    private com.google.cloud.aiplatform.v1beta1.PersistentResource persistentResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.PersistentResource, com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder, com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder> persistentResourceBuilder_;
    /**
     * <pre>
     * Required. The PersistentResource to update.
     *
     * The PersistentResource's `name` field is used to identify the
     * PersistentResource to update. Format:
     * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the persistentResource field is set.
     */
    public boolean hasPersistentResource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The PersistentResource to update.
     *
     * The PersistentResource's `name` field is used to identify the
     * PersistentResource to update. Format:
     * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The persistentResource.
     */
    public com.google.cloud.aiplatform.v1beta1.PersistentResource getPersistentResource() {
      if (persistentResourceBuilder_ == null) {
        return persistentResource_ == null ? com.google.cloud.aiplatform.v1beta1.PersistentResource.getDefaultInstance() : persistentResource_;
      } else {
        return persistentResourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The PersistentResource to update.
     *
     * The PersistentResource's `name` field is used to identify the
     * PersistentResource to update. Format:
     * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPersistentResource(com.google.cloud.aiplatform.v1beta1.PersistentResource value) {
      if (persistentResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        persistentResource_ = value;
      } else {
        persistentResourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The PersistentResource to update.
     *
     * The PersistentResource's `name` field is used to identify the
     * PersistentResource to update. Format:
     * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPersistentResource(
        com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder builderForValue) {
      if (persistentResourceBuilder_ == null) {
        persistentResource_ = builderForValue.build();
      } else {
        persistentResourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The PersistentResource to update.
     *
     * The PersistentResource's `name` field is used to identify the
     * PersistentResource to update. Format:
     * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergePersistentResource(com.google.cloud.aiplatform.v1beta1.PersistentResource value) {
      if (persistentResourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          persistentResource_ != null &&
          persistentResource_ != com.google.cloud.aiplatform.v1beta1.PersistentResource.getDefaultInstance()) {
          getPersistentResourceBuilder().mergeFrom(value);
        } else {
          persistentResource_ = value;
        }
      } else {
        persistentResourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The PersistentResource to update.
     *
     * The PersistentResource's `name` field is used to identify the
     * PersistentResource to update. Format:
     * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPersistentResource() {
      bitField0_ = (bitField0_ & ~0x00000001);
      persistentResource_ = null;
      if (persistentResourceBuilder_ != null) {
        persistentResourceBuilder_.dispose();
        persistentResourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The PersistentResource to update.
     *
     * The PersistentResource's `name` field is used to identify the
     * PersistentResource to update. Format:
     * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder getPersistentResourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPersistentResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The PersistentResource to update.
     *
     * The PersistentResource's `name` field is used to identify the
     * PersistentResource to update. Format:
     * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder getPersistentResourceOrBuilder() {
      if (persistentResourceBuilder_ != null) {
        return persistentResourceBuilder_.getMessageOrBuilder();
      } else {
        return persistentResource_ == null ?
            com.google.cloud.aiplatform.v1beta1.PersistentResource.getDefaultInstance() : persistentResource_;
      }
    }
    /**
     * <pre>
     * Required. The PersistentResource to update.
     *
     * The PersistentResource's `name` field is used to identify the
     * PersistentResource to update. Format:
     * `projects/{project}/locations/{location}/persistentResources/{persistent_resource}`
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.PersistentResource persistent_resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.PersistentResource, com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder, com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder> 
        getPersistentResourceFieldBuilder() {
      if (persistentResourceBuilder_ == null) {
        persistentResourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.PersistentResource, com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder, com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder>(
                getPersistentResource(),
                getParentForChildren(),
                isClean());
        persistentResource_ = null;
      }
      return persistentResourceBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Specify the fields to be overwritten in the PersistentResource by
     * the update method.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Specify the fields to be overwritten in the PersistentResource by
     * the update method.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Specify the fields to be overwritten in the PersistentResource by
     * the update method.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specify the fields to be overwritten in the PersistentResource by
     * the update method.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specify the fields to be overwritten in the PersistentResource by
     * the update method.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Specify the fields to be overwritten in the PersistentResource by
     * the update method.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
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
    /**
     * <pre>
     * Required. Specify the fields to be overwritten in the PersistentResource by
     * the update method.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Specify the fields to be overwritten in the PersistentResource by
     * the update method.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. Specify the fields to be overwritten in the PersistentResource by
     * the update method.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest)
  private static final com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePersistentResourceRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePersistentResourceRequest>() {
    @java.lang.Override
    public UpdatePersistentResourceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdatePersistentResourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePersistentResourceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UpdatePersistentResourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

