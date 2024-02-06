// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/synonymset_service_request.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

/**
 * <pre>
 * Request message for SynonymSetService.CreateSynonymSet.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.CreateSynonymSetRequest}
 */
public final class CreateSynonymSetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.CreateSynonymSetRequest)
    CreateSynonymSetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSynonymSetRequest.newBuilder() to construct.
  private CreateSynonymSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSynonymSetRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSynonymSetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.SynonymSetServiceRequestProto.internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.SynonymSetServiceRequestProto.internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest.class, com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent name.
   * Format: projects/{project_number}/locations/{location}.
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
   * Required. The parent name.
   * Format: projects/{project_number}/locations/{location}.
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

  public static final int SYNONYM_SET_FIELD_NUMBER = 2;
  private com.google.cloud.contentwarehouse.v1.SynonymSet synonymSet_;
  /**
   * <pre>
   * Required. The synonymSet to be created for a context
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the synonymSet field is set.
   */
  @java.lang.Override
  public boolean hasSynonymSet() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The synonymSet to be created for a context
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The synonymSet.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.SynonymSet getSynonymSet() {
    return synonymSet_ == null ? com.google.cloud.contentwarehouse.v1.SynonymSet.getDefaultInstance() : synonymSet_;
  }
  /**
   * <pre>
   * Required. The synonymSet to be created for a context
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.SynonymSetOrBuilder getSynonymSetOrBuilder() {
    return synonymSet_ == null ? com.google.cloud.contentwarehouse.v1.SynonymSet.getDefaultInstance() : synonymSet_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSynonymSet());
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
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSynonymSet());
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest other = (com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSynonymSet() != other.hasSynonymSet()) return false;
    if (hasSynonymSet()) {
      if (!getSynonymSet()
          .equals(other.getSynonymSet())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSynonymSet()) {
      hash = (37 * hash) + SYNONYM_SET_FIELD_NUMBER;
      hash = (53 * hash) + getSynonymSet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest prototype) {
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
   * Request message for SynonymSetService.CreateSynonymSet.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.CreateSynonymSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.CreateSynonymSetRequest)
      com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.SynonymSetServiceRequestProto.internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.SynonymSetServiceRequestProto.internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest.class, com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest.newBuilder()
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
        getSynonymSetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      synonymSet_ = null;
      if (synonymSetBuilder_ != null) {
        synonymSetBuilder_.dispose();
        synonymSetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.SynonymSetServiceRequestProto.internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest build() {
      com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest buildPartial() {
      com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest result = new com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.synonymSet_ = synonymSetBuilder_ == null
            ? synonymSet_
            : synonymSetBuilder_.build();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest other) {
      if (other == com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSynonymSet()) {
        mergeSynonymSet(other.getSynonymSet());
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
                  getSynonymSetFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent name.
     * Format: projects/{project_number}/locations/{location}.
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
     * Required. The parent name.
     * Format: projects/{project_number}/locations/{location}.
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
     * Required. The parent name.
     * Format: projects/{project_number}/locations/{location}.
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
     * Required. The parent name.
     * Format: projects/{project_number}/locations/{location}.
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
     * Required. The parent name.
     * Format: projects/{project_number}/locations/{location}.
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

    private com.google.cloud.contentwarehouse.v1.SynonymSet synonymSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contentwarehouse.v1.SynonymSet, com.google.cloud.contentwarehouse.v1.SynonymSet.Builder, com.google.cloud.contentwarehouse.v1.SynonymSetOrBuilder> synonymSetBuilder_;
    /**
     * <pre>
     * Required. The synonymSet to be created for a context
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the synonymSet field is set.
     */
    public boolean hasSynonymSet() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The synonymSet to be created for a context
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The synonymSet.
     */
    public com.google.cloud.contentwarehouse.v1.SynonymSet getSynonymSet() {
      if (synonymSetBuilder_ == null) {
        return synonymSet_ == null ? com.google.cloud.contentwarehouse.v1.SynonymSet.getDefaultInstance() : synonymSet_;
      } else {
        return synonymSetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The synonymSet to be created for a context
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSynonymSet(com.google.cloud.contentwarehouse.v1.SynonymSet value) {
      if (synonymSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        synonymSet_ = value;
      } else {
        synonymSetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The synonymSet to be created for a context
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSynonymSet(
        com.google.cloud.contentwarehouse.v1.SynonymSet.Builder builderForValue) {
      if (synonymSetBuilder_ == null) {
        synonymSet_ = builderForValue.build();
      } else {
        synonymSetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The synonymSet to be created for a context
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSynonymSet(com.google.cloud.contentwarehouse.v1.SynonymSet value) {
      if (synonymSetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          synonymSet_ != null &&
          synonymSet_ != com.google.cloud.contentwarehouse.v1.SynonymSet.getDefaultInstance()) {
          getSynonymSetBuilder().mergeFrom(value);
        } else {
          synonymSet_ = value;
        }
      } else {
        synonymSetBuilder_.mergeFrom(value);
      }
      if (synonymSet_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The synonymSet to be created for a context
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSynonymSet() {
      bitField0_ = (bitField0_ & ~0x00000002);
      synonymSet_ = null;
      if (synonymSetBuilder_ != null) {
        synonymSetBuilder_.dispose();
        synonymSetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The synonymSet to be created for a context
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.contentwarehouse.v1.SynonymSet.Builder getSynonymSetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSynonymSetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The synonymSet to be created for a context
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.contentwarehouse.v1.SynonymSetOrBuilder getSynonymSetOrBuilder() {
      if (synonymSetBuilder_ != null) {
        return synonymSetBuilder_.getMessageOrBuilder();
      } else {
        return synonymSet_ == null ?
            com.google.cloud.contentwarehouse.v1.SynonymSet.getDefaultInstance() : synonymSet_;
      }
    }
    /**
     * <pre>
     * Required. The synonymSet to be created for a context
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contentwarehouse.v1.SynonymSet, com.google.cloud.contentwarehouse.v1.SynonymSet.Builder, com.google.cloud.contentwarehouse.v1.SynonymSetOrBuilder> 
        getSynonymSetFieldBuilder() {
      if (synonymSetBuilder_ == null) {
        synonymSetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.SynonymSet, com.google.cloud.contentwarehouse.v1.SynonymSet.Builder, com.google.cloud.contentwarehouse.v1.SynonymSetOrBuilder>(
                getSynonymSet(),
                getParentForChildren(),
                isClean());
        synonymSet_ = null;
      }
      return synonymSetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.CreateSynonymSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.CreateSynonymSetRequest)
  private static final com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest();
  }

  public static com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSynonymSetRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSynonymSetRequest>() {
    @java.lang.Override
    public CreateSynonymSetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSynonymSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSynonymSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.CreateSynonymSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

