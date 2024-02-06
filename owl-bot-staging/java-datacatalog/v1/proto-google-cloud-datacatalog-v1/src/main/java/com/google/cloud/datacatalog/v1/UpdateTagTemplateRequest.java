// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

/**
 * <pre>
 * Request message for
 * [UpdateTagTemplate][google.cloud.datacatalog.v1.DataCatalog.UpdateTagTemplate].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.UpdateTagTemplateRequest}
 */
public final class UpdateTagTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.UpdateTagTemplateRequest)
    UpdateTagTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateTagTemplateRequest.newBuilder() to construct.
  private UpdateTagTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTagTemplateRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateTagTemplateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_UpdateTagTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_UpdateTagTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest.class, com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TAG_TEMPLATE_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1.TagTemplate tagTemplate_;
  /**
   * <pre>
   * Required. The template to update. The `name` field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tagTemplate field is set.
   */
  @java.lang.Override
  public boolean hasTagTemplate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The template to update. The `name` field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagTemplate.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.TagTemplate getTagTemplate() {
    return tagTemplate_ == null ? com.google.cloud.datacatalog.v1.TagTemplate.getDefaultInstance() : tagTemplate_;
  }
  /**
   * <pre>
   * Required. The template to update. The `name` field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.TagTemplateOrBuilder getTagTemplateOrBuilder() {
    return tagTemplate_ == null ? com.google.cloud.datacatalog.v1.TagTemplate.getDefaultInstance() : tagTemplate_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Names of fields whose values to overwrite on a tag template. Currently,
   * only `display_name` and `is_publicly_readable` can be overwritten.
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   *
   * Note: Updating the `is_publicly_readable` field may require up to 12
   * hours to take effect in search results.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Names of fields whose values to overwrite on a tag template. Currently,
   * only `display_name` and `is_publicly_readable` can be overwritten.
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   *
   * Note: Updating the `is_publicly_readable` field may require up to 12
   * hours to take effect in search results.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Names of fields whose values to overwrite on a tag template. Currently,
   * only `display_name` and `is_publicly_readable` can be overwritten.
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   *
   * Note: Updating the `is_publicly_readable` field may require up to 12
   * hours to take effect in search results.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTagTemplate());
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
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTagTemplate());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest other = (com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest) obj;

    if (hasTagTemplate() != other.hasTagTemplate()) return false;
    if (hasTagTemplate()) {
      if (!getTagTemplate()
          .equals(other.getTagTemplate())) return false;
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
    if (hasTagTemplate()) {
      hash = (37 * hash) + TAG_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getTagTemplate().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest prototype) {
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
   * Request message for
   * [UpdateTagTemplate][google.cloud.datacatalog.v1.DataCatalog.UpdateTagTemplate].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.UpdateTagTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.UpdateTagTemplateRequest)
      com.google.cloud.datacatalog.v1.UpdateTagTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_UpdateTagTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_UpdateTagTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest.class, com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest.newBuilder()
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
        getTagTemplateFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tagTemplate_ = null;
      if (tagTemplateBuilder_ != null) {
        tagTemplateBuilder_.dispose();
        tagTemplateBuilder_ = null;
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
      return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_UpdateTagTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest build() {
      com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest buildPartial() {
      com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest result = new com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tagTemplate_ = tagTemplateBuilder_ == null
            ? tagTemplate_
            : tagTemplateBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest other) {
      if (other == com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest.getDefaultInstance()) return this;
      if (other.hasTagTemplate()) {
        mergeTagTemplate(other.getTagTemplate());
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
                  getTagTemplateFieldBuilder().getBuilder(),
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

    private com.google.cloud.datacatalog.v1.TagTemplate tagTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.TagTemplate, com.google.cloud.datacatalog.v1.TagTemplate.Builder, com.google.cloud.datacatalog.v1.TagTemplateOrBuilder> tagTemplateBuilder_;
    /**
     * <pre>
     * Required. The template to update. The `name` field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the tagTemplate field is set.
     */
    public boolean hasTagTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The template to update. The `name` field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tagTemplate.
     */
    public com.google.cloud.datacatalog.v1.TagTemplate getTagTemplate() {
      if (tagTemplateBuilder_ == null) {
        return tagTemplate_ == null ? com.google.cloud.datacatalog.v1.TagTemplate.getDefaultInstance() : tagTemplate_;
      } else {
        return tagTemplateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The template to update. The `name` field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTagTemplate(com.google.cloud.datacatalog.v1.TagTemplate value) {
      if (tagTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tagTemplate_ = value;
      } else {
        tagTemplateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The template to update. The `name` field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTagTemplate(
        com.google.cloud.datacatalog.v1.TagTemplate.Builder builderForValue) {
      if (tagTemplateBuilder_ == null) {
        tagTemplate_ = builderForValue.build();
      } else {
        tagTemplateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The template to update. The `name` field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTagTemplate(com.google.cloud.datacatalog.v1.TagTemplate value) {
      if (tagTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tagTemplate_ != null &&
          tagTemplate_ != com.google.cloud.datacatalog.v1.TagTemplate.getDefaultInstance()) {
          getTagTemplateBuilder().mergeFrom(value);
        } else {
          tagTemplate_ = value;
        }
      } else {
        tagTemplateBuilder_.mergeFrom(value);
      }
      if (tagTemplate_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The template to update. The `name` field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTagTemplate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tagTemplate_ = null;
      if (tagTemplateBuilder_ != null) {
        tagTemplateBuilder_.dispose();
        tagTemplateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The template to update. The `name` field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.datacatalog.v1.TagTemplate.Builder getTagTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTagTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The template to update. The `name` field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.datacatalog.v1.TagTemplateOrBuilder getTagTemplateOrBuilder() {
      if (tagTemplateBuilder_ != null) {
        return tagTemplateBuilder_.getMessageOrBuilder();
      } else {
        return tagTemplate_ == null ?
            com.google.cloud.datacatalog.v1.TagTemplate.getDefaultInstance() : tagTemplate_;
      }
    }
    /**
     * <pre>
     * Required. The template to update. The `name` field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.TagTemplate, com.google.cloud.datacatalog.v1.TagTemplate.Builder, com.google.cloud.datacatalog.v1.TagTemplateOrBuilder> 
        getTagTemplateFieldBuilder() {
      if (tagTemplateBuilder_ == null) {
        tagTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.TagTemplate, com.google.cloud.datacatalog.v1.TagTemplate.Builder, com.google.cloud.datacatalog.v1.TagTemplateOrBuilder>(
                getTagTemplate(),
                getParentForChildren(),
                isClean());
        tagTemplate_ = null;
      }
      return tagTemplateBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Names of fields whose values to overwrite on a tag template. Currently,
     * only `display_name` and `is_publicly_readable` can be overwritten.
     *
     * If this parameter is absent or empty, all modifiable fields
     * are overwritten. If such fields are non-required and omitted in the
     * request body, their values are emptied.
     *
     * Note: Updating the `is_publicly_readable` field may require up to 12
     * hours to take effect in search results.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Names of fields whose values to overwrite on a tag template. Currently,
     * only `display_name` and `is_publicly_readable` can be overwritten.
     *
     * If this parameter is absent or empty, all modifiable fields
     * are overwritten. If such fields are non-required and omitted in the
     * request body, their values are emptied.
     *
     * Note: Updating the `is_publicly_readable` field may require up to 12
     * hours to take effect in search results.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Names of fields whose values to overwrite on a tag template. Currently,
     * only `display_name` and `is_publicly_readable` can be overwritten.
     *
     * If this parameter is absent or empty, all modifiable fields
     * are overwritten. If such fields are non-required and omitted in the
     * request body, their values are emptied.
     *
     * Note: Updating the `is_publicly_readable` field may require up to 12
     * hours to take effect in search results.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Names of fields whose values to overwrite on a tag template. Currently,
     * only `display_name` and `is_publicly_readable` can be overwritten.
     *
     * If this parameter is absent or empty, all modifiable fields
     * are overwritten. If such fields are non-required and omitted in the
     * request body, their values are emptied.
     *
     * Note: Updating the `is_publicly_readable` field may require up to 12
     * hours to take effect in search results.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Names of fields whose values to overwrite on a tag template. Currently,
     * only `display_name` and `is_publicly_readable` can be overwritten.
     *
     * If this parameter is absent or empty, all modifiable fields
     * are overwritten. If such fields are non-required and omitted in the
     * request body, their values are emptied.
     *
     * Note: Updating the `is_publicly_readable` field may require up to 12
     * hours to take effect in search results.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Names of fields whose values to overwrite on a tag template. Currently,
     * only `display_name` and `is_publicly_readable` can be overwritten.
     *
     * If this parameter is absent or empty, all modifiable fields
     * are overwritten. If such fields are non-required and omitted in the
     * request body, their values are emptied.
     *
     * Note: Updating the `is_publicly_readable` field may require up to 12
     * hours to take effect in search results.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Names of fields whose values to overwrite on a tag template. Currently,
     * only `display_name` and `is_publicly_readable` can be overwritten.
     *
     * If this parameter is absent or empty, all modifiable fields
     * are overwritten. If such fields are non-required and omitted in the
     * request body, their values are emptied.
     *
     * Note: Updating the `is_publicly_readable` field may require up to 12
     * hours to take effect in search results.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Names of fields whose values to overwrite on a tag template. Currently,
     * only `display_name` and `is_publicly_readable` can be overwritten.
     *
     * If this parameter is absent or empty, all modifiable fields
     * are overwritten. If such fields are non-required and omitted in the
     * request body, their values are emptied.
     *
     * Note: Updating the `is_publicly_readable` field may require up to 12
     * hours to take effect in search results.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Names of fields whose values to overwrite on a tag template. Currently,
     * only `display_name` and `is_publicly_readable` can be overwritten.
     *
     * If this parameter is absent or empty, all modifiable fields
     * are overwritten. If such fields are non-required and omitted in the
     * request body, their values are emptied.
     *
     * Note: Updating the `is_publicly_readable` field may require up to 12
     * hours to take effect in search results.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.UpdateTagTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.UpdateTagTemplateRequest)
  private static final com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest();
  }

  public static com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTagTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTagTemplateRequest>() {
    @java.lang.Override
    public UpdateTagTemplateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTagTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTagTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.UpdateTagTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

