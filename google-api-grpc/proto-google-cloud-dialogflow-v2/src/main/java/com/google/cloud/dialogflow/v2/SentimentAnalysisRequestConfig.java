// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Configures the types of sentiment analysis to perform.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig}
 */
public final class SentimentAnalysisRequestConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig)
    SentimentAnalysisRequestConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SentimentAnalysisRequestConfig.newBuilder() to construct.
  private SentimentAnalysisRequestConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SentimentAnalysisRequestConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SentimentAnalysisRequestConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SentimentAnalysisRequestConfig(
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
          case 8:
            {
              analyzeQueryTextSentiment_ = input.readBool();
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
        .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.SessionProto
        .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.class,
            com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.Builder.class);
  }

  public static final int ANALYZE_QUERY_TEXT_SENTIMENT_FIELD_NUMBER = 1;
  private boolean analyzeQueryTextSentiment_;
  /**
   *
   *
   * <pre>
   * Optional. Instructs the service to perform sentiment analysis on
   * `query_text`. If not provided, sentiment analysis is not performed on
   * `query_text`.
   * </pre>
   *
   * <code>bool analyze_query_text_sentiment = 1;</code>
   */
  public boolean getAnalyzeQueryTextSentiment() {
    return analyzeQueryTextSentiment_;
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
    if (analyzeQueryTextSentiment_ != false) {
      output.writeBool(1, analyzeQueryTextSentiment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (analyzeQueryTextSentiment_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, analyzeQueryTextSentiment_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig other =
        (com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig) obj;

    if (getAnalyzeQueryTextSentiment() != other.getAnalyzeQueryTextSentiment()) return false;
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
    hash = (37 * hash) + ANALYZE_QUERY_TEXT_SENTIMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAnalyzeQueryTextSentiment());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parseFrom(
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
      com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig prototype) {
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
   * Configures the types of sentiment analysis to perform.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig)
      com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.class,
              com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.newBuilder()
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
      analyzeQueryTextSentiment_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig build() {
      com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig buildPartial() {
      com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig result =
          new com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig(this);
      result.analyzeQueryTextSentiment_ = analyzeQueryTextSentiment_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig) {
        return mergeFrom((com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig other) {
      if (other
          == com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig.getDefaultInstance())
        return this;
      if (other.getAnalyzeQueryTextSentiment() != false) {
        setAnalyzeQueryTextSentiment(other.getAnalyzeQueryTextSentiment());
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
      com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean analyzeQueryTextSentiment_;
    /**
     *
     *
     * <pre>
     * Optional. Instructs the service to perform sentiment analysis on
     * `query_text`. If not provided, sentiment analysis is not performed on
     * `query_text`.
     * </pre>
     *
     * <code>bool analyze_query_text_sentiment = 1;</code>
     */
    public boolean getAnalyzeQueryTextSentiment() {
      return analyzeQueryTextSentiment_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Instructs the service to perform sentiment analysis on
     * `query_text`. If not provided, sentiment analysis is not performed on
     * `query_text`.
     * </pre>
     *
     * <code>bool analyze_query_text_sentiment = 1;</code>
     */
    public Builder setAnalyzeQueryTextSentiment(boolean value) {

      analyzeQueryTextSentiment_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Instructs the service to perform sentiment analysis on
     * `query_text`. If not provided, sentiment analysis is not performed on
     * `query_text`.
     * </pre>
     *
     * <code>bool analyze_query_text_sentiment = 1;</code>
     */
    public Builder clearAnalyzeQueryTextSentiment() {

      analyzeQueryTextSentiment_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig)
  private static final com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig();
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SentimentAnalysisRequestConfig> PARSER =
      new com.google.protobuf.AbstractParser<SentimentAnalysisRequestConfig>() {
        @java.lang.Override
        public SentimentAnalysisRequestConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SentimentAnalysisRequestConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SentimentAnalysisRequestConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SentimentAnalysisRequestConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
