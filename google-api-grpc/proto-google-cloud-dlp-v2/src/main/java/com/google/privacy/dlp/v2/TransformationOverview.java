// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Overview of the modifications that occurred.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.TransformationOverview}
 */
public  final class TransformationOverview extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.TransformationOverview)
    TransformationOverviewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransformationOverview.newBuilder() to construct.
  private TransformationOverview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransformationOverview() {
    transformedBytes_ = 0L;
    transformationSummaries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransformationOverview(
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
          case 16: {

            transformedBytes_ = input.readInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              transformationSummaries_ = new java.util.ArrayList<com.google.privacy.dlp.v2.TransformationSummary>();
              mutable_bitField0_ |= 0x00000002;
            }
            transformationSummaries_.add(
                input.readMessage(com.google.privacy.dlp.v2.TransformationSummary.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        transformationSummaries_ = java.util.Collections.unmodifiableList(transformationSummaries_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationOverview_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationOverview_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.TransformationOverview.class, com.google.privacy.dlp.v2.TransformationOverview.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSFORMED_BYTES_FIELD_NUMBER = 2;
  private long transformedBytes_;
  /**
   * <pre>
   * Total size in bytes that were transformed in some way.
   * </pre>
   *
   * <code>int64 transformed_bytes = 2;</code>
   */
  public long getTransformedBytes() {
    return transformedBytes_;
  }

  public static final int TRANSFORMATION_SUMMARIES_FIELD_NUMBER = 3;
  private java.util.List<com.google.privacy.dlp.v2.TransformationSummary> transformationSummaries_;
  /**
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
   */
  public java.util.List<com.google.privacy.dlp.v2.TransformationSummary> getTransformationSummariesList() {
    return transformationSummaries_;
  }
  /**
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
   */
  public java.util.List<? extends com.google.privacy.dlp.v2.TransformationSummaryOrBuilder> 
      getTransformationSummariesOrBuilderList() {
    return transformationSummaries_;
  }
  /**
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
   */
  public int getTransformationSummariesCount() {
    return transformationSummaries_.size();
  }
  /**
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
   */
  public com.google.privacy.dlp.v2.TransformationSummary getTransformationSummaries(int index) {
    return transformationSummaries_.get(index);
  }
  /**
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
   */
  public com.google.privacy.dlp.v2.TransformationSummaryOrBuilder getTransformationSummariesOrBuilder(
      int index) {
    return transformationSummaries_.get(index);
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
    if (transformedBytes_ != 0L) {
      output.writeInt64(2, transformedBytes_);
    }
    for (int i = 0; i < transformationSummaries_.size(); i++) {
      output.writeMessage(3, transformationSummaries_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transformedBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, transformedBytes_);
    }
    for (int i = 0; i < transformationSummaries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, transformationSummaries_.get(i));
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
    if (!(obj instanceof com.google.privacy.dlp.v2.TransformationOverview)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.TransformationOverview other = (com.google.privacy.dlp.v2.TransformationOverview) obj;

    boolean result = true;
    result = result && (getTransformedBytes()
        == other.getTransformedBytes());
    result = result && getTransformationSummariesList()
        .equals(other.getTransformationSummariesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRANSFORMED_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTransformedBytes());
    if (getTransformationSummariesCount() > 0) {
      hash = (37 * hash) + TRANSFORMATION_SUMMARIES_FIELD_NUMBER;
      hash = (53 * hash) + getTransformationSummariesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.TransformationOverview parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.TransformationOverview prototype) {
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
   * Overview of the modifications that occurred.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.TransformationOverview}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.TransformationOverview)
      com.google.privacy.dlp.v2.TransformationOverviewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationOverview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationOverview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.TransformationOverview.class, com.google.privacy.dlp.v2.TransformationOverview.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.TransformationOverview.newBuilder()
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
        getTransformationSummariesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      transformedBytes_ = 0L;

      if (transformationSummariesBuilder_ == null) {
        transformationSummaries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        transformationSummariesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationOverview_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TransformationOverview getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.TransformationOverview.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TransformationOverview build() {
      com.google.privacy.dlp.v2.TransformationOverview result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TransformationOverview buildPartial() {
      com.google.privacy.dlp.v2.TransformationOverview result = new com.google.privacy.dlp.v2.TransformationOverview(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.transformedBytes_ = transformedBytes_;
      if (transformationSummariesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          transformationSummaries_ = java.util.Collections.unmodifiableList(transformationSummaries_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.transformationSummaries_ = transformationSummaries_;
      } else {
        result.transformationSummaries_ = transformationSummariesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.TransformationOverview) {
        return mergeFrom((com.google.privacy.dlp.v2.TransformationOverview)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.TransformationOverview other) {
      if (other == com.google.privacy.dlp.v2.TransformationOverview.getDefaultInstance()) return this;
      if (other.getTransformedBytes() != 0L) {
        setTransformedBytes(other.getTransformedBytes());
      }
      if (transformationSummariesBuilder_ == null) {
        if (!other.transformationSummaries_.isEmpty()) {
          if (transformationSummaries_.isEmpty()) {
            transformationSummaries_ = other.transformationSummaries_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTransformationSummariesIsMutable();
            transformationSummaries_.addAll(other.transformationSummaries_);
          }
          onChanged();
        }
      } else {
        if (!other.transformationSummaries_.isEmpty()) {
          if (transformationSummariesBuilder_.isEmpty()) {
            transformationSummariesBuilder_.dispose();
            transformationSummariesBuilder_ = null;
            transformationSummaries_ = other.transformationSummaries_;
            bitField0_ = (bitField0_ & ~0x00000002);
            transformationSummariesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransformationSummariesFieldBuilder() : null;
          } else {
            transformationSummariesBuilder_.addAllMessages(other.transformationSummaries_);
          }
        }
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
      com.google.privacy.dlp.v2.TransformationOverview parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.TransformationOverview) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long transformedBytes_ ;
    /**
     * <pre>
     * Total size in bytes that were transformed in some way.
     * </pre>
     *
     * <code>int64 transformed_bytes = 2;</code>
     */
    public long getTransformedBytes() {
      return transformedBytes_;
    }
    /**
     * <pre>
     * Total size in bytes that were transformed in some way.
     * </pre>
     *
     * <code>int64 transformed_bytes = 2;</code>
     */
    public Builder setTransformedBytes(long value) {
      
      transformedBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total size in bytes that were transformed in some way.
     * </pre>
     *
     * <code>int64 transformed_bytes = 2;</code>
     */
    public Builder clearTransformedBytes() {
      
      transformedBytes_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.google.privacy.dlp.v2.TransformationSummary> transformationSummaries_ =
      java.util.Collections.emptyList();
    private void ensureTransformationSummariesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        transformationSummaries_ = new java.util.ArrayList<com.google.privacy.dlp.v2.TransformationSummary>(transformationSummaries_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2.TransformationSummary, com.google.privacy.dlp.v2.TransformationSummary.Builder, com.google.privacy.dlp.v2.TransformationSummaryOrBuilder> transformationSummariesBuilder_;

    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.TransformationSummary> getTransformationSummariesList() {
      if (transformationSummariesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transformationSummaries_);
      } else {
        return transformationSummariesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public int getTransformationSummariesCount() {
      if (transformationSummariesBuilder_ == null) {
        return transformationSummaries_.size();
      } else {
        return transformationSummariesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public com.google.privacy.dlp.v2.TransformationSummary getTransformationSummaries(int index) {
      if (transformationSummariesBuilder_ == null) {
        return transformationSummaries_.get(index);
      } else {
        return transformationSummariesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public Builder setTransformationSummaries(
        int index, com.google.privacy.dlp.v2.TransformationSummary value) {
      if (transformationSummariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransformationSummariesIsMutable();
        transformationSummaries_.set(index, value);
        onChanged();
      } else {
        transformationSummariesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public Builder setTransformationSummaries(
        int index, com.google.privacy.dlp.v2.TransformationSummary.Builder builderForValue) {
      if (transformationSummariesBuilder_ == null) {
        ensureTransformationSummariesIsMutable();
        transformationSummaries_.set(index, builderForValue.build());
        onChanged();
      } else {
        transformationSummariesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public Builder addTransformationSummaries(com.google.privacy.dlp.v2.TransformationSummary value) {
      if (transformationSummariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransformationSummariesIsMutable();
        transformationSummaries_.add(value);
        onChanged();
      } else {
        transformationSummariesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public Builder addTransformationSummaries(
        int index, com.google.privacy.dlp.v2.TransformationSummary value) {
      if (transformationSummariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransformationSummariesIsMutable();
        transformationSummaries_.add(index, value);
        onChanged();
      } else {
        transformationSummariesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public Builder addTransformationSummaries(
        com.google.privacy.dlp.v2.TransformationSummary.Builder builderForValue) {
      if (transformationSummariesBuilder_ == null) {
        ensureTransformationSummariesIsMutable();
        transformationSummaries_.add(builderForValue.build());
        onChanged();
      } else {
        transformationSummariesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public Builder addTransformationSummaries(
        int index, com.google.privacy.dlp.v2.TransformationSummary.Builder builderForValue) {
      if (transformationSummariesBuilder_ == null) {
        ensureTransformationSummariesIsMutable();
        transformationSummaries_.add(index, builderForValue.build());
        onChanged();
      } else {
        transformationSummariesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public Builder addAllTransformationSummaries(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.TransformationSummary> values) {
      if (transformationSummariesBuilder_ == null) {
        ensureTransformationSummariesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transformationSummaries_);
        onChanged();
      } else {
        transformationSummariesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public Builder clearTransformationSummaries() {
      if (transformationSummariesBuilder_ == null) {
        transformationSummaries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        transformationSummariesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public Builder removeTransformationSummaries(int index) {
      if (transformationSummariesBuilder_ == null) {
        ensureTransformationSummariesIsMutable();
        transformationSummaries_.remove(index);
        onChanged();
      } else {
        transformationSummariesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public com.google.privacy.dlp.v2.TransformationSummary.Builder getTransformationSummariesBuilder(
        int index) {
      return getTransformationSummariesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public com.google.privacy.dlp.v2.TransformationSummaryOrBuilder getTransformationSummariesOrBuilder(
        int index) {
      if (transformationSummariesBuilder_ == null) {
        return transformationSummaries_.get(index);  } else {
        return transformationSummariesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2.TransformationSummaryOrBuilder> 
         getTransformationSummariesOrBuilderList() {
      if (transformationSummariesBuilder_ != null) {
        return transformationSummariesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transformationSummaries_);
      }
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public com.google.privacy.dlp.v2.TransformationSummary.Builder addTransformationSummariesBuilder() {
      return getTransformationSummariesFieldBuilder().addBuilder(
          com.google.privacy.dlp.v2.TransformationSummary.getDefaultInstance());
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public com.google.privacy.dlp.v2.TransformationSummary.Builder addTransformationSummariesBuilder(
        int index) {
      return getTransformationSummariesFieldBuilder().addBuilder(
          index, com.google.privacy.dlp.v2.TransformationSummary.getDefaultInstance());
    }
    /**
     * <pre>
     * Transformations applied to the dataset.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.TransformationSummary.Builder> 
         getTransformationSummariesBuilderList() {
      return getTransformationSummariesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2.TransformationSummary, com.google.privacy.dlp.v2.TransformationSummary.Builder, com.google.privacy.dlp.v2.TransformationSummaryOrBuilder> 
        getTransformationSummariesFieldBuilder() {
      if (transformationSummariesBuilder_ == null) {
        transformationSummariesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.TransformationSummary, com.google.privacy.dlp.v2.TransformationSummary.Builder, com.google.privacy.dlp.v2.TransformationSummaryOrBuilder>(
                transformationSummaries_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        transformationSummaries_ = null;
      }
      return transformationSummariesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.TransformationOverview)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.TransformationOverview)
  private static final com.google.privacy.dlp.v2.TransformationOverview DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.TransformationOverview();
  }

  public static com.google.privacy.dlp.v2.TransformationOverview getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransformationOverview>
      PARSER = new com.google.protobuf.AbstractParser<TransformationOverview>() {
    @java.lang.Override
    public TransformationOverview parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransformationOverview(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransformationOverview> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransformationOverview> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.TransformationOverview getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

