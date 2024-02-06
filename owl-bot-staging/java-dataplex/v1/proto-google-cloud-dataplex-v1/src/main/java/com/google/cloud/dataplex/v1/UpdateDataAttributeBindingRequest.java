// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/data_taxonomy.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

/**
 * <pre>
 * Update DataAttributeBinding request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest}
 */
public final class UpdateDataAttributeBindingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest)
    UpdateDataAttributeBindingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDataAttributeBindingRequest.newBuilder() to construct.
  private UpdateDataAttributeBindingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDataAttributeBindingRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDataAttributeBindingRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataplex.v1.DataTaxonomyProto.internal_static_google_cloud_dataplex_v1_UpdateDataAttributeBindingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.DataTaxonomyProto.internal_static_google_cloud_dataplex_v1_UpdateDataAttributeBindingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest.class, com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest.Builder.class);
  }

  private int bitField0_;
  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int DATA_ATTRIBUTE_BINDING_FIELD_NUMBER = 2;
  private com.google.cloud.dataplex.v1.DataAttributeBinding dataAttributeBinding_;
  /**
   * <pre>
   * Required. Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dataAttributeBinding field is set.
   */
  @java.lang.Override
  public boolean hasDataAttributeBinding() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Required. Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dataAttributeBinding.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataAttributeBinding getDataAttributeBinding() {
    return dataAttributeBinding_ == null ? com.google.cloud.dataplex.v1.DataAttributeBinding.getDefaultInstance() : dataAttributeBinding_;
  }
  /**
   * <pre>
   * Required. Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataAttributeBindingOrBuilder getDataAttributeBindingOrBuilder() {
    return dataAttributeBinding_ == null ? com.google.cloud.dataplex.v1.DataAttributeBinding.getDefaultInstance() : dataAttributeBinding_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;
  /**
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getDataAttributeBinding());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDataAttributeBinding());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest other = (com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (hasDataAttributeBinding() != other.hasDataAttributeBinding()) return false;
    if (hasDataAttributeBinding()) {
      if (!getDataAttributeBinding()
          .equals(other.getDataAttributeBinding())) return false;
    }
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
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
    if (hasDataAttributeBinding()) {
      hash = (37 * hash) + DATA_ATTRIBUTE_BINDING_FIELD_NUMBER;
      hash = (53 * hash) + getDataAttributeBinding().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest prototype) {
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
   * Update DataAttributeBinding request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest)
      com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataplex.v1.DataTaxonomyProto.internal_static_google_cloud_dataplex_v1_UpdateDataAttributeBindingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.DataTaxonomyProto.internal_static_google_cloud_dataplex_v1_UpdateDataAttributeBindingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest.class, com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getUpdateMaskFieldBuilder();
        getDataAttributeBindingFieldBuilder();
      }
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
      dataAttributeBinding_ = null;
      if (dataAttributeBindingBuilder_ != null) {
        dataAttributeBindingBuilder_.dispose();
        dataAttributeBindingBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataplex.v1.DataTaxonomyProto.internal_static_google_cloud_dataplex_v1_UpdateDataAttributeBindingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest build() {
      com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest buildPartial() {
      com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest result = new com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataAttributeBinding_ = dataAttributeBindingBuilder_ == null
            ? dataAttributeBinding_
            : dataAttributeBindingBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.validateOnly_ = validateOnly_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest other) {
      if (other == com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasDataAttributeBinding()) {
        mergeDataAttributeBinding(other.getDataAttributeBinding());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDataAttributeBindingFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              validateOnly_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
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
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.cloud.dataplex.v1.DataAttributeBinding dataAttributeBinding_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.DataAttributeBinding, com.google.cloud.dataplex.v1.DataAttributeBinding.Builder, com.google.cloud.dataplex.v1.DataAttributeBindingOrBuilder> dataAttributeBindingBuilder_;
    /**
     * <pre>
     * Required. Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the dataAttributeBinding field is set.
     */
    public boolean hasDataAttributeBinding() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The dataAttributeBinding.
     */
    public com.google.cloud.dataplex.v1.DataAttributeBinding getDataAttributeBinding() {
      if (dataAttributeBindingBuilder_ == null) {
        return dataAttributeBinding_ == null ? com.google.cloud.dataplex.v1.DataAttributeBinding.getDefaultInstance() : dataAttributeBinding_;
      } else {
        return dataAttributeBindingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDataAttributeBinding(com.google.cloud.dataplex.v1.DataAttributeBinding value) {
      if (dataAttributeBindingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataAttributeBinding_ = value;
      } else {
        dataAttributeBindingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDataAttributeBinding(
        com.google.cloud.dataplex.v1.DataAttributeBinding.Builder builderForValue) {
      if (dataAttributeBindingBuilder_ == null) {
        dataAttributeBinding_ = builderForValue.build();
      } else {
        dataAttributeBindingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeDataAttributeBinding(com.google.cloud.dataplex.v1.DataAttributeBinding value) {
      if (dataAttributeBindingBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          dataAttributeBinding_ != null &&
          dataAttributeBinding_ != com.google.cloud.dataplex.v1.DataAttributeBinding.getDefaultInstance()) {
          getDataAttributeBindingBuilder().mergeFrom(value);
        } else {
          dataAttributeBinding_ = value;
        }
      } else {
        dataAttributeBindingBuilder_.mergeFrom(value);
      }
      if (dataAttributeBinding_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearDataAttributeBinding() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataAttributeBinding_ = null;
      if (dataAttributeBindingBuilder_ != null) {
        dataAttributeBindingBuilder_.dispose();
        dataAttributeBindingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataplex.v1.DataAttributeBinding.Builder getDataAttributeBindingBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataAttributeBindingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataplex.v1.DataAttributeBindingOrBuilder getDataAttributeBindingOrBuilder() {
      if (dataAttributeBindingBuilder_ != null) {
        return dataAttributeBindingBuilder_.getMessageOrBuilder();
      } else {
        return dataAttributeBinding_ == null ?
            com.google.cloud.dataplex.v1.DataAttributeBinding.getDefaultInstance() : dataAttributeBinding_;
      }
    }
    /**
     * <pre>
     * Required. Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataAttributeBinding data_attribute_binding = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.DataAttributeBinding, com.google.cloud.dataplex.v1.DataAttributeBinding.Builder, com.google.cloud.dataplex.v1.DataAttributeBindingOrBuilder> 
        getDataAttributeBindingFieldBuilder() {
      if (dataAttributeBindingBuilder_ == null) {
        dataAttributeBindingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.DataAttributeBinding, com.google.cloud.dataplex.v1.DataAttributeBinding.Builder, com.google.cloud.dataplex.v1.DataAttributeBindingOrBuilder>(
                getDataAttributeBinding(),
                getParentForChildren(),
                isClean());
        dataAttributeBinding_ = null;
      }
      return dataAttributeBindingBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      validateOnly_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest)
  private static final com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest();
  }

  public static com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDataAttributeBindingRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDataAttributeBindingRequest>() {
    @java.lang.Override
    public UpdateDataAttributeBindingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDataAttributeBindingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDataAttributeBindingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.UpdateDataAttributeBindingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

