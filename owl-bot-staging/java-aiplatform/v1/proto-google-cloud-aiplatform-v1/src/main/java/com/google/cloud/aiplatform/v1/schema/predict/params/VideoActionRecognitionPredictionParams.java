// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/params/video_action_recognition.proto

package com.google.cloud.aiplatform.v1.schema.predict.params;

/**
 * <pre>
 * Prediction model parameters for Video Action Recognition.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams}
 */
public final class VideoActionRecognitionPredictionParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams)
    VideoActionRecognitionPredictionParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoActionRecognitionPredictionParams.newBuilder() to construct.
  private VideoActionRecognitionPredictionParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoActionRecognitionPredictionParams() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoActionRecognitionPredictionParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParamsProto.internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParamsProto.internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams.class, com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams.Builder.class);
  }

  public static final int CONFIDENCE_THRESHOLD_FIELD_NUMBER = 1;
  private float confidenceThreshold_;
  /**
   * <pre>
   * The Model only returns predictions with at least this confidence score.
   * Default value is 0.0
   * </pre>
   *
   * <code>float confidence_threshold = 1;</code>
   * @return The confidenceThreshold.
   */
  @java.lang.Override
  public float getConfidenceThreshold() {
    return confidenceThreshold_;
  }

  public static final int MAX_PREDICTIONS_FIELD_NUMBER = 2;
  private int maxPredictions_;
  /**
   * <pre>
   * The model only returns up to that many top, by confidence score,
   * predictions per frame of the video. If this number is very high, the
   * Model may return fewer predictions per frame. Default value is 50.
   * </pre>
   *
   * <code>int32 max_predictions = 2;</code>
   * @return The maxPredictions.
   */
  @java.lang.Override
  public int getMaxPredictions() {
    return maxPredictions_;
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
    if (java.lang.Float.floatToRawIntBits(confidenceThreshold_) != 0) {
      output.writeFloat(1, confidenceThreshold_);
    }
    if (maxPredictions_ != 0) {
      output.writeInt32(2, maxPredictions_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(confidenceThreshold_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, confidenceThreshold_);
    }
    if (maxPredictions_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxPredictions_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams other = (com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams) obj;

    if (java.lang.Float.floatToIntBits(getConfidenceThreshold())
        != java.lang.Float.floatToIntBits(
            other.getConfidenceThreshold())) return false;
    if (getMaxPredictions()
        != other.getMaxPredictions()) return false;
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
    hash = (37 * hash) + CONFIDENCE_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getConfidenceThreshold());
    hash = (37 * hash) + MAX_PREDICTIONS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxPredictions();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams prototype) {
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
   * Prediction model parameters for Video Action Recognition.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams)
      com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParamsProto.internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParamsProto.internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams.class, com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      confidenceThreshold_ = 0F;

      maxPredictions_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParamsProto.internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoActionRecognitionPredictionParams_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams build() {
      com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams buildPartial() {
      com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams result = new com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams(this);
      result.confidenceThreshold_ = confidenceThreshold_;
      result.maxPredictions_ = maxPredictions_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams) {
        return mergeFrom((com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams other) {
      if (other == com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams.getDefaultInstance()) return this;
      if (other.getConfidenceThreshold() != 0F) {
        setConfidenceThreshold(other.getConfidenceThreshold());
      }
      if (other.getMaxPredictions() != 0) {
        setMaxPredictions(other.getMaxPredictions());
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
            case 13: {
              confidenceThreshold_ = input.readFloat();

              break;
            } // case 13
            case 16: {
              maxPredictions_ = input.readInt32();

              break;
            } // case 16
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

    private float confidenceThreshold_ ;
    /**
     * <pre>
     * The Model only returns predictions with at least this confidence score.
     * Default value is 0.0
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     * @return The confidenceThreshold.
     */
    @java.lang.Override
    public float getConfidenceThreshold() {
      return confidenceThreshold_;
    }
    /**
     * <pre>
     * The Model only returns predictions with at least this confidence score.
     * Default value is 0.0
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     * @param value The confidenceThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setConfidenceThreshold(float value) {
      
      confidenceThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Model only returns predictions with at least this confidence score.
     * Default value is 0.0
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidenceThreshold() {
      
      confidenceThreshold_ = 0F;
      onChanged();
      return this;
    }

    private int maxPredictions_ ;
    /**
     * <pre>
     * The model only returns up to that many top, by confidence score,
     * predictions per frame of the video. If this number is very high, the
     * Model may return fewer predictions per frame. Default value is 50.
     * </pre>
     *
     * <code>int32 max_predictions = 2;</code>
     * @return The maxPredictions.
     */
    @java.lang.Override
    public int getMaxPredictions() {
      return maxPredictions_;
    }
    /**
     * <pre>
     * The model only returns up to that many top, by confidence score,
     * predictions per frame of the video. If this number is very high, the
     * Model may return fewer predictions per frame. Default value is 50.
     * </pre>
     *
     * <code>int32 max_predictions = 2;</code>
     * @param value The maxPredictions to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPredictions(int value) {
      
      maxPredictions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The model only returns up to that many top, by confidence score,
     * predictions per frame of the video. If this number is very high, the
     * Model may return fewer predictions per frame. Default value is 50.
     * </pre>
     *
     * <code>int32 max_predictions = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxPredictions() {
      
      maxPredictions_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams)
  private static final com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams();
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoActionRecognitionPredictionParams>
      PARSER = new com.google.protobuf.AbstractParser<VideoActionRecognitionPredictionParams>() {
    @java.lang.Override
    public VideoActionRecognitionPredictionParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoActionRecognitionPredictionParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoActionRecognitionPredictionParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.predict.params.VideoActionRecognitionPredictionParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

