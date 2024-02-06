// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * A point in a conversation that marks the start or the end of an annotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.AnnotationBoundary}
 */
public final class AnnotationBoundary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.AnnotationBoundary)
    AnnotationBoundaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnnotationBoundary.newBuilder() to construct.
  private AnnotationBoundary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnnotationBoundary() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnnotationBoundary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnnotationBoundary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnnotationBoundary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.AnnotationBoundary.class, com.google.cloud.contactcenterinsights.v1.AnnotationBoundary.Builder.class);
  }

  private int detailedBoundaryCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object detailedBoundary_;
  public enum DetailedBoundaryCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    WORD_INDEX(3),
    DETAILEDBOUNDARY_NOT_SET(0);
    private final int value;
    private DetailedBoundaryCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DetailedBoundaryCase valueOf(int value) {
      return forNumber(value);
    }

    public static DetailedBoundaryCase forNumber(int value) {
      switch (value) {
        case 3: return WORD_INDEX;
        case 0: return DETAILEDBOUNDARY_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DetailedBoundaryCase
  getDetailedBoundaryCase() {
    return DetailedBoundaryCase.forNumber(
        detailedBoundaryCase_);
  }

  public static final int WORD_INDEX_FIELD_NUMBER = 3;
  /**
   * <pre>
   * The word index of this boundary with respect to the first word in the
   * transcript piece. This index starts at zero.
   * </pre>
   *
   * <code>int32 word_index = 3;</code>
   * @return Whether the wordIndex field is set.
   */
  @java.lang.Override
  public boolean hasWordIndex() {
    return detailedBoundaryCase_ == 3;
  }
  /**
   * <pre>
   * The word index of this boundary with respect to the first word in the
   * transcript piece. This index starts at zero.
   * </pre>
   *
   * <code>int32 word_index = 3;</code>
   * @return The wordIndex.
   */
  @java.lang.Override
  public int getWordIndex() {
    if (detailedBoundaryCase_ == 3) {
      return (java.lang.Integer) detailedBoundary_;
    }
    return 0;
  }

  public static final int TRANSCRIPT_INDEX_FIELD_NUMBER = 1;
  private int transcriptIndex_ = 0;
  /**
   * <pre>
   * The index in the sequence of transcribed pieces of the conversation where
   * the boundary is located. This index starts at zero.
   * </pre>
   *
   * <code>int32 transcript_index = 1;</code>
   * @return The transcriptIndex.
   */
  @java.lang.Override
  public int getTranscriptIndex() {
    return transcriptIndex_;
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
    if (transcriptIndex_ != 0) {
      output.writeInt32(1, transcriptIndex_);
    }
    if (detailedBoundaryCase_ == 3) {
      output.writeInt32(
          3, (int)((java.lang.Integer) detailedBoundary_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transcriptIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, transcriptIndex_);
    }
    if (detailedBoundaryCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            3, (int)((java.lang.Integer) detailedBoundary_));
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.AnnotationBoundary)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.AnnotationBoundary other = (com.google.cloud.contactcenterinsights.v1.AnnotationBoundary) obj;

    if (getTranscriptIndex()
        != other.getTranscriptIndex()) return false;
    if (!getDetailedBoundaryCase().equals(other.getDetailedBoundaryCase())) return false;
    switch (detailedBoundaryCase_) {
      case 3:
        if (getWordIndex()
            != other.getWordIndex()) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + TRANSCRIPT_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getTranscriptIndex();
    switch (detailedBoundaryCase_) {
      case 3:
        hash = (37 * hash) + WORD_INDEX_FIELD_NUMBER;
        hash = (53 * hash) + getWordIndex();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.AnnotationBoundary prototype) {
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
   * A point in a conversation that marks the start or the end of an annotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.AnnotationBoundary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.AnnotationBoundary)
      com.google.cloud.contactcenterinsights.v1.AnnotationBoundaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnnotationBoundary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnnotationBoundary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.AnnotationBoundary.class, com.google.cloud.contactcenterinsights.v1.AnnotationBoundary.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.AnnotationBoundary.newBuilder()
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
      transcriptIndex_ = 0;
      detailedBoundaryCase_ = 0;
      detailedBoundary_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_AnnotationBoundary_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.AnnotationBoundary getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.AnnotationBoundary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.AnnotationBoundary build() {
      com.google.cloud.contactcenterinsights.v1.AnnotationBoundary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.AnnotationBoundary buildPartial() {
      com.google.cloud.contactcenterinsights.v1.AnnotationBoundary result = new com.google.cloud.contactcenterinsights.v1.AnnotationBoundary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contactcenterinsights.v1.AnnotationBoundary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.transcriptIndex_ = transcriptIndex_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.contactcenterinsights.v1.AnnotationBoundary result) {
      result.detailedBoundaryCase_ = detailedBoundaryCase_;
      result.detailedBoundary_ = this.detailedBoundary_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.AnnotationBoundary) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.AnnotationBoundary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.AnnotationBoundary other) {
      if (other == com.google.cloud.contactcenterinsights.v1.AnnotationBoundary.getDefaultInstance()) return this;
      if (other.getTranscriptIndex() != 0) {
        setTranscriptIndex(other.getTranscriptIndex());
      }
      switch (other.getDetailedBoundaryCase()) {
        case WORD_INDEX: {
          setWordIndex(other.getWordIndex());
          break;
        }
        case DETAILEDBOUNDARY_NOT_SET: {
          break;
        }
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
            case 8: {
              transcriptIndex_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 8
            case 24: {
              detailedBoundary_ = input.readInt32();
              detailedBoundaryCase_ = 3;
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
    private int detailedBoundaryCase_ = 0;
    private java.lang.Object detailedBoundary_;
    public DetailedBoundaryCase
        getDetailedBoundaryCase() {
      return DetailedBoundaryCase.forNumber(
          detailedBoundaryCase_);
    }

    public Builder clearDetailedBoundary() {
      detailedBoundaryCase_ = 0;
      detailedBoundary_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * The word index of this boundary with respect to the first word in the
     * transcript piece. This index starts at zero.
     * </pre>
     *
     * <code>int32 word_index = 3;</code>
     * @return Whether the wordIndex field is set.
     */
    public boolean hasWordIndex() {
      return detailedBoundaryCase_ == 3;
    }
    /**
     * <pre>
     * The word index of this boundary with respect to the first word in the
     * transcript piece. This index starts at zero.
     * </pre>
     *
     * <code>int32 word_index = 3;</code>
     * @return The wordIndex.
     */
    public int getWordIndex() {
      if (detailedBoundaryCase_ == 3) {
        return (java.lang.Integer) detailedBoundary_;
      }
      return 0;
    }
    /**
     * <pre>
     * The word index of this boundary with respect to the first word in the
     * transcript piece. This index starts at zero.
     * </pre>
     *
     * <code>int32 word_index = 3;</code>
     * @param value The wordIndex to set.
     * @return This builder for chaining.
     */
    public Builder setWordIndex(int value) {

      detailedBoundaryCase_ = 3;
      detailedBoundary_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The word index of this boundary with respect to the first word in the
     * transcript piece. This index starts at zero.
     * </pre>
     *
     * <code>int32 word_index = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWordIndex() {
      if (detailedBoundaryCase_ == 3) {
        detailedBoundaryCase_ = 0;
        detailedBoundary_ = null;
        onChanged();
      }
      return this;
    }

    private int transcriptIndex_ ;
    /**
     * <pre>
     * The index in the sequence of transcribed pieces of the conversation where
     * the boundary is located. This index starts at zero.
     * </pre>
     *
     * <code>int32 transcript_index = 1;</code>
     * @return The transcriptIndex.
     */
    @java.lang.Override
    public int getTranscriptIndex() {
      return transcriptIndex_;
    }
    /**
     * <pre>
     * The index in the sequence of transcribed pieces of the conversation where
     * the boundary is located. This index starts at zero.
     * </pre>
     *
     * <code>int32 transcript_index = 1;</code>
     * @param value The transcriptIndex to set.
     * @return This builder for chaining.
     */
    public Builder setTranscriptIndex(int value) {

      transcriptIndex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The index in the sequence of transcribed pieces of the conversation where
     * the boundary is located. This index starts at zero.
     * </pre>
     *
     * <code>int32 transcript_index = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTranscriptIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      transcriptIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.AnnotationBoundary)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.AnnotationBoundary)
  private static final com.google.cloud.contactcenterinsights.v1.AnnotationBoundary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.AnnotationBoundary();
  }

  public static com.google.cloud.contactcenterinsights.v1.AnnotationBoundary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotationBoundary>
      PARSER = new com.google.protobuf.AbstractParser<AnnotationBoundary>() {
    @java.lang.Override
    public AnnotationBoundary parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnnotationBoundary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotationBoundary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.AnnotationBoundary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

