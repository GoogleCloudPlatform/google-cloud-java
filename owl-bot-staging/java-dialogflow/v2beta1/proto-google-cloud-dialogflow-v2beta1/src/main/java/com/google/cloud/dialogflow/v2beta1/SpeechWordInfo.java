// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * Information for a word recognized by the speech recognizer.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.SpeechWordInfo}
 */
public final class SpeechWordInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.SpeechWordInfo)
    SpeechWordInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpeechWordInfo.newBuilder() to construct.
  private SpeechWordInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpeechWordInfo() {
    word_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpeechWordInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.SpeechWordInfo.class, com.google.cloud.dialogflow.v2beta1.SpeechWordInfo.Builder.class);
  }

  public static final int WORD_FIELD_NUMBER = 3;
  private volatile java.lang.Object word_;
  /**
   * <pre>
   * The word this info is for.
   * </pre>
   *
   * <code>string word = 3;</code>
   * @return The word.
   */
  @java.lang.Override
  public java.lang.String getWord() {
    java.lang.Object ref = word_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      word_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The word this info is for.
   * </pre>
   *
   * <code>string word = 3;</code>
   * @return The bytes for word.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWordBytes() {
    java.lang.Object ref = word_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      word_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_OFFSET_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration startOffset_;
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * start of the spoken word. This is an experimental feature and the accuracy
   * of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1;</code>
   * @return Whether the startOffset field is set.
   */
  @java.lang.Override
  public boolean hasStartOffset() {
    return startOffset_ != null;
  }
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * start of the spoken word. This is an experimental feature and the accuracy
   * of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1;</code>
   * @return The startOffset.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getStartOffset() {
    return startOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startOffset_;
  }
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * start of the spoken word. This is an experimental feature and the accuracy
   * of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getStartOffsetOrBuilder() {
    return getStartOffset();
  }

  public static final int END_OFFSET_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration endOffset_;
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * end of the spoken word. This is an experimental feature and the accuracy of
   * the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2;</code>
   * @return Whether the endOffset field is set.
   */
  @java.lang.Override
  public boolean hasEndOffset() {
    return endOffset_ != null;
  }
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * end of the spoken word. This is an experimental feature and the accuracy of
   * the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2;</code>
   * @return The endOffset.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getEndOffset() {
    return endOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : endOffset_;
  }
  /**
   * <pre>
   * Time offset relative to the beginning of the audio that corresponds to the
   * end of the spoken word. This is an experimental feature and the accuracy of
   * the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getEndOffsetOrBuilder() {
    return getEndOffset();
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 4;
  private float confidence_;
  /**
   * <pre>
   * The Speech confidence between 0.0 and 1.0 for this word. A higher number
   * indicates an estimated greater likelihood that the recognized word is
   * correct. The default of 0.0 is a sentinel value indicating that confidence
   * was not set.
   * This field is not guaranteed to be fully stable over time for the same
   * audio input. Users should also not rely on it to always be provided.
   * </pre>
   *
   * <code>float confidence = 4;</code>
   * @return The confidence.
   */
  @java.lang.Override
  public float getConfidence() {
    return confidence_;
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
    if (startOffset_ != null) {
      output.writeMessage(1, getStartOffset());
    }
    if (endOffset_ != null) {
      output.writeMessage(2, getEndOffset());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(word_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, word_);
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      output.writeFloat(4, confidence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStartOffset());
    }
    if (endOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndOffset());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(word_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, word_);
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, confidence_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.SpeechWordInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.SpeechWordInfo other = (com.google.cloud.dialogflow.v2beta1.SpeechWordInfo) obj;

    if (!getWord()
        .equals(other.getWord())) return false;
    if (hasStartOffset() != other.hasStartOffset()) return false;
    if (hasStartOffset()) {
      if (!getStartOffset()
          .equals(other.getStartOffset())) return false;
    }
    if (hasEndOffset() != other.hasEndOffset()) return false;
    if (hasEndOffset()) {
      if (!getEndOffset()
          .equals(other.getEndOffset())) return false;
    }
    if (java.lang.Float.floatToIntBits(getConfidence())
        != java.lang.Float.floatToIntBits(
            other.getConfidence())) return false;
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
    hash = (37 * hash) + WORD_FIELD_NUMBER;
    hash = (53 * hash) + getWord().hashCode();
    if (hasStartOffset()) {
      hash = (37 * hash) + START_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getStartOffset().hashCode();
    }
    if (hasEndOffset()) {
      hash = (37 * hash) + END_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getEndOffset().hashCode();
    }
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getConfidence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.SpeechWordInfo prototype) {
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
   * Information for a word recognized by the speech recognizer.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.SpeechWordInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.SpeechWordInfo)
      com.google.cloud.dialogflow.v2beta1.SpeechWordInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.SpeechWordInfo.class, com.google.cloud.dialogflow.v2beta1.SpeechWordInfo.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.SpeechWordInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      word_ = "";

      if (startOffsetBuilder_ == null) {
        startOffset_ = null;
      } else {
        startOffset_ = null;
        startOffsetBuilder_ = null;
      }
      if (endOffsetBuilder_ == null) {
        endOffset_ = null;
      } else {
        endOffset_ = null;
        endOffsetBuilder_ = null;
      }
      confidence_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechWordInfo getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.SpeechWordInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechWordInfo build() {
      com.google.cloud.dialogflow.v2beta1.SpeechWordInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechWordInfo buildPartial() {
      com.google.cloud.dialogflow.v2beta1.SpeechWordInfo result = new com.google.cloud.dialogflow.v2beta1.SpeechWordInfo(this);
      result.word_ = word_;
      if (startOffsetBuilder_ == null) {
        result.startOffset_ = startOffset_;
      } else {
        result.startOffset_ = startOffsetBuilder_.build();
      }
      if (endOffsetBuilder_ == null) {
        result.endOffset_ = endOffset_;
      } else {
        result.endOffset_ = endOffsetBuilder_.build();
      }
      result.confidence_ = confidence_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.SpeechWordInfo) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.SpeechWordInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.SpeechWordInfo other) {
      if (other == com.google.cloud.dialogflow.v2beta1.SpeechWordInfo.getDefaultInstance()) return this;
      if (!other.getWord().isEmpty()) {
        word_ = other.word_;
        onChanged();
      }
      if (other.hasStartOffset()) {
        mergeStartOffset(other.getStartOffset());
      }
      if (other.hasEndOffset()) {
        mergeEndOffset(other.getEndOffset());
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
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
                  getStartOffsetFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndOffsetFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              word_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 37: {
              confidence_ = input.readFloat();

              break;
            } // case 37
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

    private java.lang.Object word_ = "";
    /**
     * <pre>
     * The word this info is for.
     * </pre>
     *
     * <code>string word = 3;</code>
     * @return The word.
     */
    public java.lang.String getWord() {
      java.lang.Object ref = word_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        word_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The word this info is for.
     * </pre>
     *
     * <code>string word = 3;</code>
     * @return The bytes for word.
     */
    public com.google.protobuf.ByteString
        getWordBytes() {
      java.lang.Object ref = word_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        word_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The word this info is for.
     * </pre>
     *
     * <code>string word = 3;</code>
     * @param value The word to set.
     * @return This builder for chaining.
     */
    public Builder setWord(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      word_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The word this info is for.
     * </pre>
     *
     * <code>string word = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWord() {
      
      word_ = getDefaultInstance().getWord();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The word this info is for.
     * </pre>
     *
     * <code>string word = 3;</code>
     * @param value The bytes for word to set.
     * @return This builder for chaining.
     */
    public Builder setWordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      word_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration startOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> startOffsetBuilder_;
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * start of the spoken word. This is an experimental feature and the accuracy
     * of the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1;</code>
     * @return Whether the startOffset field is set.
     */
    public boolean hasStartOffset() {
      return startOffsetBuilder_ != null || startOffset_ != null;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * start of the spoken word. This is an experimental feature and the accuracy
     * of the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1;</code>
     * @return The startOffset.
     */
    public com.google.protobuf.Duration getStartOffset() {
      if (startOffsetBuilder_ == null) {
        return startOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startOffset_;
      } else {
        return startOffsetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * start of the spoken word. This is an experimental feature and the accuracy
     * of the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1;</code>
     */
    public Builder setStartOffset(com.google.protobuf.Duration value) {
      if (startOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startOffset_ = value;
        onChanged();
      } else {
        startOffsetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * start of the spoken word. This is an experimental feature and the accuracy
     * of the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1;</code>
     */
    public Builder setStartOffset(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (startOffsetBuilder_ == null) {
        startOffset_ = builderForValue.build();
        onChanged();
      } else {
        startOffsetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * start of the spoken word. This is an experimental feature and the accuracy
     * of the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1;</code>
     */
    public Builder mergeStartOffset(com.google.protobuf.Duration value) {
      if (startOffsetBuilder_ == null) {
        if (startOffset_ != null) {
          startOffset_ =
            com.google.protobuf.Duration.newBuilder(startOffset_).mergeFrom(value).buildPartial();
        } else {
          startOffset_ = value;
        }
        onChanged();
      } else {
        startOffsetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * start of the spoken word. This is an experimental feature and the accuracy
     * of the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1;</code>
     */
    public Builder clearStartOffset() {
      if (startOffsetBuilder_ == null) {
        startOffset_ = null;
        onChanged();
      } else {
        startOffset_ = null;
        startOffsetBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * start of the spoken word. This is an experimental feature and the accuracy
     * of the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getStartOffsetBuilder() {
      
      onChanged();
      return getStartOffsetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * start of the spoken word. This is an experimental feature and the accuracy
     * of the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getStartOffsetOrBuilder() {
      if (startOffsetBuilder_ != null) {
        return startOffsetBuilder_.getMessageOrBuilder();
      } else {
        return startOffset_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : startOffset_;
      }
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * start of the spoken word. This is an experimental feature and the accuracy
     * of the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_offset = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getStartOffsetFieldBuilder() {
      if (startOffsetBuilder_ == null) {
        startOffsetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getStartOffset(),
                getParentForChildren(),
                isClean());
        startOffset_ = null;
      }
      return startOffsetBuilder_;
    }

    private com.google.protobuf.Duration endOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> endOffsetBuilder_;
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * end of the spoken word. This is an experimental feature and the accuracy of
     * the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2;</code>
     * @return Whether the endOffset field is set.
     */
    public boolean hasEndOffset() {
      return endOffsetBuilder_ != null || endOffset_ != null;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * end of the spoken word. This is an experimental feature and the accuracy of
     * the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2;</code>
     * @return The endOffset.
     */
    public com.google.protobuf.Duration getEndOffset() {
      if (endOffsetBuilder_ == null) {
        return endOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : endOffset_;
      } else {
        return endOffsetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * end of the spoken word. This is an experimental feature and the accuracy of
     * the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2;</code>
     */
    public Builder setEndOffset(com.google.protobuf.Duration value) {
      if (endOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endOffset_ = value;
        onChanged();
      } else {
        endOffsetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * end of the spoken word. This is an experimental feature and the accuracy of
     * the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2;</code>
     */
    public Builder setEndOffset(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (endOffsetBuilder_ == null) {
        endOffset_ = builderForValue.build();
        onChanged();
      } else {
        endOffsetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * end of the spoken word. This is an experimental feature and the accuracy of
     * the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2;</code>
     */
    public Builder mergeEndOffset(com.google.protobuf.Duration value) {
      if (endOffsetBuilder_ == null) {
        if (endOffset_ != null) {
          endOffset_ =
            com.google.protobuf.Duration.newBuilder(endOffset_).mergeFrom(value).buildPartial();
        } else {
          endOffset_ = value;
        }
        onChanged();
      } else {
        endOffsetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * end of the spoken word. This is an experimental feature and the accuracy of
     * the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2;</code>
     */
    public Builder clearEndOffset() {
      if (endOffsetBuilder_ == null) {
        endOffset_ = null;
        onChanged();
      } else {
        endOffset_ = null;
        endOffsetBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * end of the spoken word. This is an experimental feature and the accuracy of
     * the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getEndOffsetBuilder() {
      
      onChanged();
      return getEndOffsetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * end of the spoken word. This is an experimental feature and the accuracy of
     * the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getEndOffsetOrBuilder() {
      if (endOffsetBuilder_ != null) {
        return endOffsetBuilder_.getMessageOrBuilder();
      } else {
        return endOffset_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : endOffset_;
      }
    }
    /**
     * <pre>
     * Time offset relative to the beginning of the audio that corresponds to the
     * end of the spoken word. This is an experimental feature and the accuracy of
     * the time offset can vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_offset = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getEndOffsetFieldBuilder() {
      if (endOffsetBuilder_ == null) {
        endOffsetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getEndOffset(),
                getParentForChildren(),
                isClean());
        endOffset_ = null;
      }
      return endOffsetBuilder_;
    }

    private float confidence_ ;
    /**
     * <pre>
     * The Speech confidence between 0.0 and 1.0 for this word. A higher number
     * indicates an estimated greater likelihood that the recognized word is
     * correct. The default of 0.0 is a sentinel value indicating that confidence
     * was not set.
     * This field is not guaranteed to be fully stable over time for the same
     * audio input. Users should also not rely on it to always be provided.
     * </pre>
     *
     * <code>float confidence = 4;</code>
     * @return The confidence.
     */
    @java.lang.Override
    public float getConfidence() {
      return confidence_;
    }
    /**
     * <pre>
     * The Speech confidence between 0.0 and 1.0 for this word. A higher number
     * indicates an estimated greater likelihood that the recognized word is
     * correct. The default of 0.0 is a sentinel value indicating that confidence
     * was not set.
     * This field is not guaranteed to be fully stable over time for the same
     * audio input. Users should also not rely on it to always be provided.
     * </pre>
     *
     * <code>float confidence = 4;</code>
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(float value) {
      
      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Speech confidence between 0.0 and 1.0 for this word. A higher number
     * indicates an estimated greater likelihood that the recognized word is
     * correct. The default of 0.0 is a sentinel value indicating that confidence
     * was not set.
     * This field is not guaranteed to be fully stable over time for the same
     * audio input. Users should also not rely on it to always be provided.
     * </pre>
     *
     * <code>float confidence = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {
      
      confidence_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.SpeechWordInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SpeechWordInfo)
  private static final com.google.cloud.dialogflow.v2beta1.SpeechWordInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.SpeechWordInfo();
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechWordInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechWordInfo>
      PARSER = new com.google.protobuf.AbstractParser<SpeechWordInfo>() {
    @java.lang.Override
    public SpeechWordInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpeechWordInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechWordInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SpeechWordInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

