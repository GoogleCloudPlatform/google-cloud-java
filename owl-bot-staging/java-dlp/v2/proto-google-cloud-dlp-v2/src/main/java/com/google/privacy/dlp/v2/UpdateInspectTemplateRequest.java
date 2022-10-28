// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Request message for UpdateInspectTemplate.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.UpdateInspectTemplateRequest}
 */
public final class UpdateInspectTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.UpdateInspectTemplateRequest)
    UpdateInspectTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateInspectTemplateRequest.newBuilder() to construct.
  private UpdateInspectTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateInspectTemplateRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateInspectTemplateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateInspectTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateInspectTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.UpdateInspectTemplateRequest.class, com.google.privacy.dlp.v2.UpdateInspectTemplateRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. Resource name of organization and inspectTemplate to be updated, for
   * example `organizations/433245324/inspectTemplates/432452342` or
   * projects/project-id/inspectTemplates/432452342.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Resource name of organization and inspectTemplate to be updated, for
   * example `organizations/433245324/inspectTemplates/432452342` or
   * projects/project-id/inspectTemplates/432452342.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSPECT_TEMPLATE_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.InspectTemplate inspectTemplate_;
  /**
   * <pre>
   * New InspectTemplate value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
   * @return Whether the inspectTemplate field is set.
   */
  @java.lang.Override
  public boolean hasInspectTemplate() {
    return inspectTemplate_ != null;
  }
  /**
   * <pre>
   * New InspectTemplate value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
   * @return The inspectTemplate.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectTemplate getInspectTemplate() {
    return inspectTemplate_ == null ? com.google.privacy.dlp.v2.InspectTemplate.getDefaultInstance() : inspectTemplate_;
  }
  /**
   * <pre>
   * New InspectTemplate value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectTemplateOrBuilder getInspectTemplateOrBuilder() {
    return getInspectTemplate();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (inspectTemplate_ != null) {
      output.writeMessage(2, getInspectTemplate());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
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
    if (inspectTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInspectTemplate());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.UpdateInspectTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.UpdateInspectTemplateRequest other = (com.google.privacy.dlp.v2.UpdateInspectTemplateRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasInspectTemplate() != other.hasInspectTemplate()) return false;
    if (hasInspectTemplate()) {
      if (!getInspectTemplate()
          .equals(other.getInspectTemplate())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasInspectTemplate()) {
      hash = (37 * hash) + INSPECT_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getInspectTemplate().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.UpdateInspectTemplateRequest prototype) {
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
   * Request message for UpdateInspectTemplate.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.UpdateInspectTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.UpdateInspectTemplateRequest)
      com.google.privacy.dlp.v2.UpdateInspectTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateInspectTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateInspectTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.UpdateInspectTemplateRequest.class, com.google.privacy.dlp.v2.UpdateInspectTemplateRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.UpdateInspectTemplateRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (inspectTemplateBuilder_ == null) {
        inspectTemplate_ = null;
      } else {
        inspectTemplate_ = null;
        inspectTemplateBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateInspectTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.UpdateInspectTemplateRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.UpdateInspectTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.UpdateInspectTemplateRequest build() {
      com.google.privacy.dlp.v2.UpdateInspectTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.UpdateInspectTemplateRequest buildPartial() {
      com.google.privacy.dlp.v2.UpdateInspectTemplateRequest result = new com.google.privacy.dlp.v2.UpdateInspectTemplateRequest(this);
      result.name_ = name_;
      if (inspectTemplateBuilder_ == null) {
        result.inspectTemplate_ = inspectTemplate_;
      } else {
        result.inspectTemplate_ = inspectTemplateBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.privacy.dlp.v2.UpdateInspectTemplateRequest) {
        return mergeFrom((com.google.privacy.dlp.v2.UpdateInspectTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.UpdateInspectTemplateRequest other) {
      if (other == com.google.privacy.dlp.v2.UpdateInspectTemplateRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasInspectTemplate()) {
        mergeInspectTemplate(other.getInspectTemplate());
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
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getInspectTemplateFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. Resource name of organization and inspectTemplate to be updated, for
     * example `organizations/433245324/inspectTemplates/432452342` or
     * projects/project-id/inspectTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of organization and inspectTemplate to be updated, for
     * example `organizations/433245324/inspectTemplates/432452342` or
     * projects/project-id/inspectTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of organization and inspectTemplate to be updated, for
     * example `organizations/433245324/inspectTemplates/432452342` or
     * projects/project-id/inspectTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of organization and inspectTemplate to be updated, for
     * example `organizations/433245324/inspectTemplates/432452342` or
     * projects/project-id/inspectTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of organization and inspectTemplate to be updated, for
     * example `organizations/433245324/inspectTemplates/432452342` or
     * projects/project-id/inspectTemplates/432452342.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2.InspectTemplate inspectTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.InspectTemplate, com.google.privacy.dlp.v2.InspectTemplate.Builder, com.google.privacy.dlp.v2.InspectTemplateOrBuilder> inspectTemplateBuilder_;
    /**
     * <pre>
     * New InspectTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
     * @return Whether the inspectTemplate field is set.
     */
    public boolean hasInspectTemplate() {
      return inspectTemplateBuilder_ != null || inspectTemplate_ != null;
    }
    /**
     * <pre>
     * New InspectTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
     * @return The inspectTemplate.
     */
    public com.google.privacy.dlp.v2.InspectTemplate getInspectTemplate() {
      if (inspectTemplateBuilder_ == null) {
        return inspectTemplate_ == null ? com.google.privacy.dlp.v2.InspectTemplate.getDefaultInstance() : inspectTemplate_;
      } else {
        return inspectTemplateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * New InspectTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
     */
    public Builder setInspectTemplate(com.google.privacy.dlp.v2.InspectTemplate value) {
      if (inspectTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inspectTemplate_ = value;
        onChanged();
      } else {
        inspectTemplateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * New InspectTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
     */
    public Builder setInspectTemplate(
        com.google.privacy.dlp.v2.InspectTemplate.Builder builderForValue) {
      if (inspectTemplateBuilder_ == null) {
        inspectTemplate_ = builderForValue.build();
        onChanged();
      } else {
        inspectTemplateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * New InspectTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
     */
    public Builder mergeInspectTemplate(com.google.privacy.dlp.v2.InspectTemplate value) {
      if (inspectTemplateBuilder_ == null) {
        if (inspectTemplate_ != null) {
          inspectTemplate_ =
            com.google.privacy.dlp.v2.InspectTemplate.newBuilder(inspectTemplate_).mergeFrom(value).buildPartial();
        } else {
          inspectTemplate_ = value;
        }
        onChanged();
      } else {
        inspectTemplateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * New InspectTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
     */
    public Builder clearInspectTemplate() {
      if (inspectTemplateBuilder_ == null) {
        inspectTemplate_ = null;
        onChanged();
      } else {
        inspectTemplate_ = null;
        inspectTemplateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * New InspectTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
     */
    public com.google.privacy.dlp.v2.InspectTemplate.Builder getInspectTemplateBuilder() {
      
      onChanged();
      return getInspectTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * New InspectTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
     */
    public com.google.privacy.dlp.v2.InspectTemplateOrBuilder getInspectTemplateOrBuilder() {
      if (inspectTemplateBuilder_ != null) {
        return inspectTemplateBuilder_.getMessageOrBuilder();
      } else {
        return inspectTemplate_ == null ?
            com.google.privacy.dlp.v2.InspectTemplate.getDefaultInstance() : inspectTemplate_;
      }
    }
    /**
     * <pre>
     * New InspectTemplate value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectTemplate inspect_template = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.InspectTemplate, com.google.privacy.dlp.v2.InspectTemplate.Builder, com.google.privacy.dlp.v2.InspectTemplateOrBuilder> 
        getInspectTemplateFieldBuilder() {
      if (inspectTemplateBuilder_ == null) {
        inspectTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.InspectTemplate, com.google.privacy.dlp.v2.InspectTemplate.Builder, com.google.privacy.dlp.v2.InspectTemplateOrBuilder>(
                getInspectTemplate(),
                getParentForChildren(),
                isClean());
        inspectTemplate_ = null;
      }
      return inspectTemplateBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.UpdateInspectTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.UpdateInspectTemplateRequest)
  private static final com.google.privacy.dlp.v2.UpdateInspectTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.UpdateInspectTemplateRequest();
  }

  public static com.google.privacy.dlp.v2.UpdateInspectTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateInspectTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateInspectTemplateRequest>() {
    @java.lang.Override
    public UpdateInspectTemplateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateInspectTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateInspectTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.UpdateInspectTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

