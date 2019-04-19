// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The request message for [EntityTypes.BatchDeleteEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchDeleteEntityTypes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest}
 */
public final class BatchDeleteEntityTypesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)
    BatchDeleteEntityTypesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchDeleteEntityTypesRequest.newBuilder() to construct.
  private BatchDeleteEntityTypesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchDeleteEntityTypesRequest() {
    parent_ = "";
    entityTypeNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchDeleteEntityTypesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                entityTypeNames_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              entityTypeNames_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        entityTypeNames_ = entityTypeNames_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.class,
            com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
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
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
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

  public static final int ENTITY_TYPE_NAMES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList entityTypeNames_;
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList getEntityTypeNamesList() {
    return entityTypeNames_;
  }
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2;</code>
   */
  public int getEntityTypeNamesCount() {
    return entityTypeNames_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2;</code>
   */
  public java.lang.String getEntityTypeNames(int index) {
    return entityTypeNames_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2;</code>
   */
  public com.google.protobuf.ByteString getEntityTypeNamesBytes(int index) {
    return entityTypeNames_.getByteString(index);
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < entityTypeNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityTypeNames_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < entityTypeNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(entityTypeNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntityTypeNamesList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest other =
        (com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getEntityTypeNamesList().equals(other.getEntityTypeNamesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (getEntityTypeNamesCount() > 0) {
      hash = (37 * hash) + ENTITY_TYPE_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getEntityTypeNamesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
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
      com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest prototype) {
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
   * The request message for [EntityTypes.BatchDeleteEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchDeleteEntityTypes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)
      com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.class,
              com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      entityTypeNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest build() {
      com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest buildPartial() {
      com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest result =
          new com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.parent_ = parent_;
      if (((bitField0_ & 0x00000002) != 0)) {
        entityTypeNames_ = entityTypeNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.entityTypeNames_ = entityTypeNames_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.entityTypeNames_.isEmpty()) {
        if (entityTypeNames_.isEmpty()) {
          entityTypeNames_ = other.entityTypeNames_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureEntityTypeNamesIsMutable();
          entityTypeNames_.addAll(other.entityTypeNames_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList entityTypeNames_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureEntityTypeNamesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        entityTypeNames_ = new com.google.protobuf.LazyStringArrayList(entityTypeNames_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getEntityTypeNamesList() {
      return entityTypeNames_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2;</code>
     */
    public int getEntityTypeNamesCount() {
      return entityTypeNames_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2;</code>
     */
    public java.lang.String getEntityTypeNames(int index) {
      return entityTypeNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2;</code>
     */
    public com.google.protobuf.ByteString getEntityTypeNamesBytes(int index) {
      return entityTypeNames_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2;</code>
     */
    public Builder setEntityTypeNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEntityTypeNamesIsMutable();
      entityTypeNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2;</code>
     */
    public Builder addEntityTypeNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEntityTypeNamesIsMutable();
      entityTypeNames_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2;</code>
     */
    public Builder addAllEntityTypeNames(java.lang.Iterable<java.lang.String> values) {
      ensureEntityTypeNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entityTypeNames_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2;</code>
     */
    public Builder clearEntityTypeNames() {
      entityTypeNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2;</code>
     */
    public Builder addEntityTypeNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureEntityTypeNamesIsMutable();
      entityTypeNames_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)
  private static final com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest();
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDeleteEntityTypesRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchDeleteEntityTypesRequest>() {
        @java.lang.Override
        public BatchDeleteEntityTypesRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchDeleteEntityTypesRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchDeleteEntityTypesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDeleteEntityTypesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
