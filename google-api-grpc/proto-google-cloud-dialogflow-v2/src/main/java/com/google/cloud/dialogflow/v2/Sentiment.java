// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The sentiment, such as positive/negative feeling or association, for a unit
 * of analysis, such as the query text.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.Sentiment}
 */
public final class Sentiment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.Sentiment)
    SentimentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Sentiment.newBuilder() to construct.
  private Sentiment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Sentiment() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Sentiment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Sentiment(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 13:
            {
              score_ = input.readFloat();
              break;
            }
          case 21:
            {
              magnitude_ = input.readFloat();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.SessionProto
        .internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.SessionProto
        .internal_static_google_cloud_dialogflow_v2_Sentiment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.Sentiment.class,
            com.google.cloud.dialogflow.v2.Sentiment.Builder.class);
  }

  public static final int SCORE_FIELD_NUMBER = 1;
  private float score_;
  /**
   *
   *
   * <pre>
   * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
   * sentiment).
   * </pre>
   *
   * <code>float score = 1;</code>
   */
  public float getScore() {
    return score_;
  }

  public static final int MAGNITUDE_FIELD_NUMBER = 2;
  private float magnitude_;
  /**
   *
   *
   * <pre>
   * A non-negative number in the [0, +inf) range, which represents the absolute
   * magnitude of sentiment, regardless of score (positive or negative).
   * </pre>
   *
   * <code>float magnitude = 2;</code>
   */
  public float getMagnitude() {
    return magnitude_;
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
    if (score_ != 0F) {
      output.writeFloat(1, score_);
    }
    if (magnitude_ != 0F) {
      output.writeFloat(2, magnitude_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, score_);
    }
    if (magnitude_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, magnitude_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.Sentiment)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.Sentiment other = (com.google.cloud.dialogflow.v2.Sentiment) obj;

    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(other.getScore())) return false;
    if (java.lang.Float.floatToIntBits(getMagnitude())
        != java.lang.Float.floatToIntBits(other.getMagnitude())) return false;
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getScore());
    hash = (37 * hash) + MAGNITUDE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getMagnitude());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.Sentiment parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.Sentiment prototype) {
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
   * The sentiment, such as positive/negative feeling or association, for a unit
   * of analysis, such as the query text.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.Sentiment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.Sentiment)
      com.google.cloud.dialogflow.v2.SentimentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_Sentiment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.Sentiment.class,
              com.google.cloud.dialogflow.v2.Sentiment.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.Sentiment.newBuilder()
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
      score_ = 0F;

      magnitude_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.Sentiment getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.Sentiment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.Sentiment build() {
      com.google.cloud.dialogflow.v2.Sentiment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.Sentiment buildPartial() {
      com.google.cloud.dialogflow.v2.Sentiment result =
          new com.google.cloud.dialogflow.v2.Sentiment(this);
      result.score_ = score_;
      result.magnitude_ = magnitude_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.Sentiment) {
        return mergeFrom((com.google.cloud.dialogflow.v2.Sentiment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.Sentiment other) {
      if (other == com.google.cloud.dialogflow.v2.Sentiment.getDefaultInstance()) return this;
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.getMagnitude() != 0F) {
        setMagnitude(other.getMagnitude());
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
      com.google.cloud.dialogflow.v2.Sentiment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2.Sentiment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float score_;
    /**
     *
     *
     * <pre>
     * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
     * sentiment).
     * </pre>
     *
     * <code>float score = 1;</code>
     */
    public float getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
     * sentiment).
     * </pre>
     *
     * <code>float score = 1;</code>
     */
    public Builder setScore(float value) {

      score_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
     * sentiment).
     * </pre>
     *
     * <code>float score = 1;</code>
     */
    public Builder clearScore() {

      score_ = 0F;
      onChanged();
      return this;
    }

    private float magnitude_;
    /**
     *
     *
     * <pre>
     * A non-negative number in the [0, +inf) range, which represents the absolute
     * magnitude of sentiment, regardless of score (positive or negative).
     * </pre>
     *
     * <code>float magnitude = 2;</code>
     */
    public float getMagnitude() {
      return magnitude_;
    }
    /**
     *
     *
     * <pre>
     * A non-negative number in the [0, +inf) range, which represents the absolute
     * magnitude of sentiment, regardless of score (positive or negative).
     * </pre>
     *
     * <code>float magnitude = 2;</code>
     */
    public Builder setMagnitude(float value) {

      magnitude_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A non-negative number in the [0, +inf) range, which represents the absolute
     * magnitude of sentiment, regardless of score (positive or negative).
     * </pre>
     *
     * <code>float magnitude = 2;</code>
     */
    public Builder clearMagnitude() {

      magnitude_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.Sentiment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.Sentiment)
  private static final com.google.cloud.dialogflow.v2.Sentiment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.Sentiment();
  }

  public static com.google.cloud.dialogflow.v2.Sentiment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Sentiment> PARSER =
      new com.google.protobuf.AbstractParser<Sentiment>() {
        @java.lang.Override
        public Sentiment parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Sentiment(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Sentiment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Sentiment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Sentiment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
