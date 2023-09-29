// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for
 * [MetadataService.CreateMetadataSchema][google.cloud.aiplatform.v1beta1.MetadataService.CreateMetadataSchema].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest}
 */
public final class CreateMetadataSchemaRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest)
    CreateMetadataSchemaRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateMetadataSchemaRequest.newBuilder() to construct.
  private CreateMetadataSchemaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateMetadataSchemaRequest() {
    parent_ = "";
    metadataSchemaId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateMetadataSchemaRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataSchemaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataSchemaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest.class, com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The resource name of the MetadataStore where the MetadataSchema
   * should be created. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the MetadataStore where the MetadataSchema
   * should be created. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATA_SCHEMA_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.MetadataSchema metadataSchema_;
  /**
   * <pre>
   * Required. The MetadataSchema to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the metadataSchema field is set.
   */
  @java.lang.Override
  public boolean hasMetadataSchema() {
    return metadataSchema_ != null;
  }
  /**
   * <pre>
   * Required. The MetadataSchema to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The metadataSchema.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.MetadataSchema getMetadataSchema() {
    return metadataSchema_ == null ? com.google.cloud.aiplatform.v1beta1.MetadataSchema.getDefaultInstance() : metadataSchema_;
  }
  /**
   * <pre>
   * Required. The MetadataSchema to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.MetadataSchemaOrBuilder getMetadataSchemaOrBuilder() {
    return metadataSchema_ == null ? com.google.cloud.aiplatform.v1beta1.MetadataSchema.getDefaultInstance() : metadataSchema_;
  }

  public static final int METADATA_SCHEMA_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object metadataSchemaId_ = "";
  /**
   * <pre>
   * The {metadata_schema} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}`
   * If not provided, the MetadataStore's ID will be a UUID generated by the
   * service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all MetadataSchemas in the parent Location.
   * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
   * if the caller can't view the preexisting MetadataSchema.)
   * </pre>
   *
   * <code>string metadata_schema_id = 3;</code>
   * @return The metadataSchemaId.
   */
  @java.lang.Override
  public java.lang.String getMetadataSchemaId() {
    java.lang.Object ref = metadataSchemaId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metadataSchemaId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The {metadata_schema} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}`
   * If not provided, the MetadataStore's ID will be a UUID generated by the
   * service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all MetadataSchemas in the parent Location.
   * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
   * if the caller can't view the preexisting MetadataSchema.)
   * </pre>
   *
   * <code>string metadata_schema_id = 3;</code>
   * @return The bytes for metadataSchemaId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMetadataSchemaIdBytes() {
    java.lang.Object ref = metadataSchemaId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metadataSchemaId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (metadataSchema_ != null) {
      output.writeMessage(2, getMetadataSchema());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataSchemaId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, metadataSchemaId_);
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
    if (metadataSchema_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadataSchema());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataSchemaId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, metadataSchemaId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest other = (com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasMetadataSchema() != other.hasMetadataSchema()) return false;
    if (hasMetadataSchema()) {
      if (!getMetadataSchema()
          .equals(other.getMetadataSchema())) return false;
    }
    if (!getMetadataSchemaId()
        .equals(other.getMetadataSchemaId())) return false;
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
    if (hasMetadataSchema()) {
      hash = (37 * hash) + METADATA_SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataSchema().hashCode();
    }
    hash = (37 * hash) + METADATA_SCHEMA_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMetadataSchemaId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest prototype) {
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
   * [MetadataService.CreateMetadataSchema][google.cloud.aiplatform.v1beta1.MetadataService.CreateMetadataSchema].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest)
      com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataSchemaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataSchemaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest.class, com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest.newBuilder()
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
      parent_ = "";
      metadataSchema_ = null;
      if (metadataSchemaBuilder_ != null) {
        metadataSchemaBuilder_.dispose();
        metadataSchemaBuilder_ = null;
      }
      metadataSchemaId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataSchemaRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest result = new com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadataSchema_ = metadataSchemaBuilder_ == null
            ? metadataSchema_
            : metadataSchemaBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.metadataSchemaId_ = metadataSchemaId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMetadataSchema()) {
        mergeMetadataSchema(other.getMetadataSchema());
      }
      if (!other.getMetadataSchemaId().isEmpty()) {
        metadataSchemaId_ = other.metadataSchemaId_;
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
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMetadataSchemaFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              metadataSchemaId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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
    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the MetadataSchema
     * should be created. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the MetadataSchema
     * should be created. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the MetadataSchema
     * should be created. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the MetadataSchema
     * should be created. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the MetadataSchema
     * should be created. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.MetadataSchema metadataSchema_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.MetadataSchema, com.google.cloud.aiplatform.v1beta1.MetadataSchema.Builder, com.google.cloud.aiplatform.v1beta1.MetadataSchemaOrBuilder> metadataSchemaBuilder_;
    /**
     * <pre>
     * Required. The MetadataSchema to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the metadataSchema field is set.
     */
    public boolean hasMetadataSchema() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The MetadataSchema to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The metadataSchema.
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataSchema getMetadataSchema() {
      if (metadataSchemaBuilder_ == null) {
        return metadataSchema_ == null ? com.google.cloud.aiplatform.v1beta1.MetadataSchema.getDefaultInstance() : metadataSchema_;
      } else {
        return metadataSchemaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The MetadataSchema to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMetadataSchema(com.google.cloud.aiplatform.v1beta1.MetadataSchema value) {
      if (metadataSchemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadataSchema_ = value;
      } else {
        metadataSchemaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The MetadataSchema to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMetadataSchema(
        com.google.cloud.aiplatform.v1beta1.MetadataSchema.Builder builderForValue) {
      if (metadataSchemaBuilder_ == null) {
        metadataSchema_ = builderForValue.build();
      } else {
        metadataSchemaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The MetadataSchema to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeMetadataSchema(com.google.cloud.aiplatform.v1beta1.MetadataSchema value) {
      if (metadataSchemaBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          metadataSchema_ != null &&
          metadataSchema_ != com.google.cloud.aiplatform.v1beta1.MetadataSchema.getDefaultInstance()) {
          getMetadataSchemaBuilder().mergeFrom(value);
        } else {
          metadataSchema_ = value;
        }
      } else {
        metadataSchemaBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The MetadataSchema to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMetadataSchema() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadataSchema_ = null;
      if (metadataSchemaBuilder_ != null) {
        metadataSchemaBuilder_.dispose();
        metadataSchemaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The MetadataSchema to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataSchema.Builder getMetadataSchemaBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataSchemaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The MetadataSchema to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataSchemaOrBuilder getMetadataSchemaOrBuilder() {
      if (metadataSchemaBuilder_ != null) {
        return metadataSchemaBuilder_.getMessageOrBuilder();
      } else {
        return metadataSchema_ == null ?
            com.google.cloud.aiplatform.v1beta1.MetadataSchema.getDefaultInstance() : metadataSchema_;
      }
    }
    /**
     * <pre>
     * Required. The MetadataSchema to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.MetadataSchema metadata_schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.MetadataSchema, com.google.cloud.aiplatform.v1beta1.MetadataSchema.Builder, com.google.cloud.aiplatform.v1beta1.MetadataSchemaOrBuilder> 
        getMetadataSchemaFieldBuilder() {
      if (metadataSchemaBuilder_ == null) {
        metadataSchemaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.MetadataSchema, com.google.cloud.aiplatform.v1beta1.MetadataSchema.Builder, com.google.cloud.aiplatform.v1beta1.MetadataSchemaOrBuilder>(
                getMetadataSchema(),
                getParentForChildren(),
                isClean());
        metadataSchema_ = null;
      }
      return metadataSchemaBuilder_;
    }

    private java.lang.Object metadataSchemaId_ = "";
    /**
     * <pre>
     * The {metadata_schema} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataSchemas in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataSchema.)
     * </pre>
     *
     * <code>string metadata_schema_id = 3;</code>
     * @return The metadataSchemaId.
     */
    public java.lang.String getMetadataSchemaId() {
      java.lang.Object ref = metadataSchemaId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metadataSchemaId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The {metadata_schema} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataSchemas in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataSchema.)
     * </pre>
     *
     * <code>string metadata_schema_id = 3;</code>
     * @return The bytes for metadataSchemaId.
     */
    public com.google.protobuf.ByteString
        getMetadataSchemaIdBytes() {
      java.lang.Object ref = metadataSchemaId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metadataSchemaId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The {metadata_schema} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataSchemas in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataSchema.)
     * </pre>
     *
     * <code>string metadata_schema_id = 3;</code>
     * @param value The metadataSchemaId to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataSchemaId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      metadataSchemaId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The {metadata_schema} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataSchemas in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataSchema.)
     * </pre>
     *
     * <code>string metadata_schema_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetadataSchemaId() {
      metadataSchemaId_ = getDefaultInstance().getMetadataSchemaId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The {metadata_schema} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/metadataSchemas/{metadataschema}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataSchemas in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataSchema.)
     * </pre>
     *
     * <code>string metadata_schema_id = 3;</code>
     * @param value The bytes for metadataSchemaId to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataSchemaIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      metadataSchemaId_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMetadataSchemaRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateMetadataSchemaRequest>() {
    @java.lang.Override
    public CreateMetadataSchemaRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMetadataSchemaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMetadataSchemaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateMetadataSchemaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

