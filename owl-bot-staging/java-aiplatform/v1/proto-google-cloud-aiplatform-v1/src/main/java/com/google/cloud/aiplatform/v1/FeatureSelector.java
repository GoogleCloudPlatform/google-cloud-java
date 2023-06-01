// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/feature_selector.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Selector for Features of an EntityType.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.FeatureSelector}
 */
public final class FeatureSelector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.FeatureSelector)
    FeatureSelectorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeatureSelector.newBuilder() to construct.
  private FeatureSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeatureSelector() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeatureSelector();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_FeatureSelector_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_FeatureSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.FeatureSelector.class, com.google.cloud.aiplatform.v1.FeatureSelector.Builder.class);
  }

  public static final int ID_MATCHER_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.IdMatcher idMatcher_;
  /**
   * <pre>
   * Required. Matches Features based on ID.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the idMatcher field is set.
   */
  @java.lang.Override
  public boolean hasIdMatcher() {
    return idMatcher_ != null;
  }
  /**
   * <pre>
   * Required. Matches Features based on ID.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The idMatcher.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.IdMatcher getIdMatcher() {
    return idMatcher_ == null ? com.google.cloud.aiplatform.v1.IdMatcher.getDefaultInstance() : idMatcher_;
  }
  /**
   * <pre>
   * Required. Matches Features based on ID.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.IdMatcherOrBuilder getIdMatcherOrBuilder() {
    return idMatcher_ == null ? com.google.cloud.aiplatform.v1.IdMatcher.getDefaultInstance() : idMatcher_;
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
    if (idMatcher_ != null) {
      output.writeMessage(1, getIdMatcher());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idMatcher_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIdMatcher());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.FeatureSelector)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.FeatureSelector other = (com.google.cloud.aiplatform.v1.FeatureSelector) obj;

    if (hasIdMatcher() != other.hasIdMatcher()) return false;
    if (hasIdMatcher()) {
      if (!getIdMatcher()
          .equals(other.getIdMatcher())) return false;
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
    if (hasIdMatcher()) {
      hash = (37 * hash) + ID_MATCHER_FIELD_NUMBER;
      hash = (53 * hash) + getIdMatcher().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.FeatureSelector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.FeatureSelector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.FeatureSelector parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.FeatureSelector prototype) {
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
   * Selector for Features of an EntityType.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.FeatureSelector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.FeatureSelector)
      com.google.cloud.aiplatform.v1.FeatureSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_FeatureSelector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_FeatureSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.FeatureSelector.class, com.google.cloud.aiplatform.v1.FeatureSelector.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.FeatureSelector.newBuilder()
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
      idMatcher_ = null;
      if (idMatcherBuilder_ != null) {
        idMatcherBuilder_.dispose();
        idMatcherBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_FeatureSelector_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FeatureSelector getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.FeatureSelector.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FeatureSelector build() {
      com.google.cloud.aiplatform.v1.FeatureSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.FeatureSelector buildPartial() {
      com.google.cloud.aiplatform.v1.FeatureSelector result = new com.google.cloud.aiplatform.v1.FeatureSelector(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.FeatureSelector result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.idMatcher_ = idMatcherBuilder_ == null
            ? idMatcher_
            : idMatcherBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.FeatureSelector) {
        return mergeFrom((com.google.cloud.aiplatform.v1.FeatureSelector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.FeatureSelector other) {
      if (other == com.google.cloud.aiplatform.v1.FeatureSelector.getDefaultInstance()) return this;
      if (other.hasIdMatcher()) {
        mergeIdMatcher(other.getIdMatcher());
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
                  getIdMatcherFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.cloud.aiplatform.v1.IdMatcher idMatcher_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.IdMatcher, com.google.cloud.aiplatform.v1.IdMatcher.Builder, com.google.cloud.aiplatform.v1.IdMatcherOrBuilder> idMatcherBuilder_;
    /**
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the idMatcher field is set.
     */
    public boolean hasIdMatcher() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The idMatcher.
     */
    public com.google.cloud.aiplatform.v1.IdMatcher getIdMatcher() {
      if (idMatcherBuilder_ == null) {
        return idMatcher_ == null ? com.google.cloud.aiplatform.v1.IdMatcher.getDefaultInstance() : idMatcher_;
      } else {
        return idMatcherBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setIdMatcher(com.google.cloud.aiplatform.v1.IdMatcher value) {
      if (idMatcherBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        idMatcher_ = value;
      } else {
        idMatcherBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setIdMatcher(
        com.google.cloud.aiplatform.v1.IdMatcher.Builder builderForValue) {
      if (idMatcherBuilder_ == null) {
        idMatcher_ = builderForValue.build();
      } else {
        idMatcherBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeIdMatcher(com.google.cloud.aiplatform.v1.IdMatcher value) {
      if (idMatcherBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          idMatcher_ != null &&
          idMatcher_ != com.google.cloud.aiplatform.v1.IdMatcher.getDefaultInstance()) {
          getIdMatcherBuilder().mergeFrom(value);
        } else {
          idMatcher_ = value;
        }
      } else {
        idMatcherBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearIdMatcher() {
      bitField0_ = (bitField0_ & ~0x00000001);
      idMatcher_ = null;
      if (idMatcherBuilder_ != null) {
        idMatcherBuilder_.dispose();
        idMatcherBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.IdMatcher.Builder getIdMatcherBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIdMatcherFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.IdMatcherOrBuilder getIdMatcherOrBuilder() {
      if (idMatcherBuilder_ != null) {
        return idMatcherBuilder_.getMessageOrBuilder();
      } else {
        return idMatcher_ == null ?
            com.google.cloud.aiplatform.v1.IdMatcher.getDefaultInstance() : idMatcher_;
      }
    }
    /**
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.IdMatcher, com.google.cloud.aiplatform.v1.IdMatcher.Builder, com.google.cloud.aiplatform.v1.IdMatcherOrBuilder> 
        getIdMatcherFieldBuilder() {
      if (idMatcherBuilder_ == null) {
        idMatcherBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.IdMatcher, com.google.cloud.aiplatform.v1.IdMatcher.Builder, com.google.cloud.aiplatform.v1.IdMatcherOrBuilder>(
                getIdMatcher(),
                getParentForChildren(),
                isClean());
        idMatcher_ = null;
      }
      return idMatcherBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.FeatureSelector)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.FeatureSelector)
  private static final com.google.cloud.aiplatform.v1.FeatureSelector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.FeatureSelector();
  }

  public static com.google.cloud.aiplatform.v1.FeatureSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureSelector>
      PARSER = new com.google.protobuf.AbstractParser<FeatureSelector>() {
    @java.lang.Override
    public FeatureSelector parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureSelector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeatureSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

