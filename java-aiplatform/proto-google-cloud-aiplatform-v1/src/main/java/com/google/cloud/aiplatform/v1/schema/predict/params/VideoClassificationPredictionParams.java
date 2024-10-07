/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/params/video_classification.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1.schema.predict.params;

/**
 *
 *
 * <pre>
 * Prediction model parameters for Video Classification.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams}
 */
public final class VideoClassificationPredictionParams
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams)
    VideoClassificationPredictionParamsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VideoClassificationPredictionParams.newBuilder() to construct.
  private VideoClassificationPredictionParams(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoClassificationPredictionParams() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoClassificationPredictionParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.schema.predict.params
        .VideoClassificationPredictionParamsProto
        .internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoClassificationPredictionParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.schema.predict.params
        .VideoClassificationPredictionParamsProto
        .internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoClassificationPredictionParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
                .class,
            com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
                .Builder.class);
  }

  public static final int CONFIDENCE_THRESHOLD_FIELD_NUMBER = 1;
  private float confidenceThreshold_ = 0F;
  /**
   *
   *
   * <pre>
   * The Model only returns predictions with at least this confidence score.
   * Default value is 0.0
   * </pre>
   *
   * <code>float confidence_threshold = 1;</code>
   *
   * @return The confidenceThreshold.
   */
  @java.lang.Override
  public float getConfidenceThreshold() {
    return confidenceThreshold_;
  }

  public static final int MAX_PREDICTIONS_FIELD_NUMBER = 2;
  private int maxPredictions_ = 0;
  /**
   *
   *
   * <pre>
   * The Model only returns up to that many top, by confidence score,
   * predictions per instance. If this number is very high, the Model may return
   * fewer predictions. Default value is 10,000.
   * </pre>
   *
   * <code>int32 max_predictions = 2;</code>
   *
   * @return The maxPredictions.
   */
  @java.lang.Override
  public int getMaxPredictions() {
    return maxPredictions_;
  }

  public static final int SEGMENT_CLASSIFICATION_FIELD_NUMBER = 3;
  private boolean segmentClassification_ = false;
  /**
   *
   *
   * <pre>
   * Set to true to request segment-level classification. Vertex AI returns
   * labels and their confidence scores for the entire time segment of the
   * video that user specified in the input instance.
   * Default value is true
   * </pre>
   *
   * <code>bool segment_classification = 3;</code>
   *
   * @return The segmentClassification.
   */
  @java.lang.Override
  public boolean getSegmentClassification() {
    return segmentClassification_;
  }

  public static final int SHOT_CLASSIFICATION_FIELD_NUMBER = 4;
  private boolean shotClassification_ = false;
  /**
   *
   *
   * <pre>
   * Set to true to request shot-level classification. Vertex AI determines
   * the boundaries for each camera shot in the entire time segment of the
   * video that user specified in the input instance. Vertex AI then
   * returns labels and their confidence scores for each detected shot, along
   * with the start and end time of the shot.
   * WARNING: Model evaluation is not done for this classification type,
   * the quality of it depends on the training data, but there are no metrics
   * provided to describe that quality.
   * Default value is false
   * </pre>
   *
   * <code>bool shot_classification = 4;</code>
   *
   * @return The shotClassification.
   */
  @java.lang.Override
  public boolean getShotClassification() {
    return shotClassification_;
  }

  public static final int ONE_SEC_INTERVAL_CLASSIFICATION_FIELD_NUMBER = 5;
  private boolean oneSecIntervalClassification_ = false;
  /**
   *
   *
   * <pre>
   * Set to true to request classification for a video at one-second intervals.
   * Vertex AI returns labels and their confidence scores for each second of
   * the entire time segment of the video that user specified in the input
   * WARNING: Model evaluation is not done for this classification type, the
   * quality of it depends on the training data, but there are no metrics
   * provided to describe that quality. Default value is false
   * </pre>
   *
   * <code>bool one_sec_interval_classification = 5;</code>
   *
   * @return The oneSecIntervalClassification.
   */
  @java.lang.Override
  public boolean getOneSecIntervalClassification() {
    return oneSecIntervalClassification_;
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
    if (java.lang.Float.floatToRawIntBits(confidenceThreshold_) != 0) {
      output.writeFloat(1, confidenceThreshold_);
    }
    if (maxPredictions_ != 0) {
      output.writeInt32(2, maxPredictions_);
    }
    if (segmentClassification_ != false) {
      output.writeBool(3, segmentClassification_);
    }
    if (shotClassification_ != false) {
      output.writeBool(4, shotClassification_);
    }
    if (oneSecIntervalClassification_ != false) {
      output.writeBool(5, oneSecIntervalClassification_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(confidenceThreshold_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, confidenceThreshold_);
    }
    if (maxPredictions_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxPredictions_);
    }
    if (segmentClassification_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, segmentClassification_);
    }
    if (shotClassification_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, shotClassification_);
    }
    if (oneSecIntervalClassification_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(5, oneSecIntervalClassification_);
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
    if (!(obj
        instanceof
        com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams other =
        (com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams)
            obj;

    if (java.lang.Float.floatToIntBits(getConfidenceThreshold())
        != java.lang.Float.floatToIntBits(other.getConfidenceThreshold())) return false;
    if (getMaxPredictions() != other.getMaxPredictions()) return false;
    if (getSegmentClassification() != other.getSegmentClassification()) return false;
    if (getShotClassification() != other.getShotClassification()) return false;
    if (getOneSecIntervalClassification() != other.getOneSecIntervalClassification()) return false;
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
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidenceThreshold());
    hash = (37 * hash) + MAX_PREDICTIONS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxPredictions();
    hash = (37 * hash) + SEGMENT_CLASSIFICATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSegmentClassification());
    hash = (37 * hash) + SHOT_CLASSIFICATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getShotClassification());
    hash = (37 * hash) + ONE_SEC_INTERVAL_CLASSIFICATION_FIELD_NUMBER;
    hash =
        (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOneSecIntervalClassification());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      parseFrom(
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
      com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
          prototype) {
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
   * Prediction model parameters for Video Classification.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams)
      com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParamsProto
          .internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoClassificationPredictionParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParamsProto
          .internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoClassificationPredictionParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.schema.predict.params
                  .VideoClassificationPredictionParams.class,
              com.google.cloud.aiplatform.v1.schema.predict.params
                  .VideoClassificationPredictionParams.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      confidenceThreshold_ = 0F;
      maxPredictions_ = 0;
      segmentClassification_ = false;
      shotClassification_ = false;
      oneSecIntervalClassification_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParamsProto
          .internal_static_google_cloud_aiplatform_v1_schema_predict_params_VideoClassificationPredictionParams_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
        build() {
      com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
        buildPartial() {
      com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
          result =
              new com.google.cloud.aiplatform.v1.schema.predict.params
                  .VideoClassificationPredictionParams(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
            result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.confidenceThreshold_ = confidenceThreshold_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxPredictions_ = maxPredictions_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.segmentClassification_ = segmentClassification_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.shotClassification_ = shotClassification_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.oneSecIntervalClassification_ = oneSecIntervalClassification_;
      }
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
      if (other
          instanceof
          com.google.cloud.aiplatform.v1.schema.predict.params
              .VideoClassificationPredictionParams) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1.schema.predict.params
                    .VideoClassificationPredictionParams)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
            other) {
      if (other
          == com.google.cloud.aiplatform.v1.schema.predict.params
              .VideoClassificationPredictionParams.getDefaultInstance()) return this;
      if (other.getConfidenceThreshold() != 0F) {
        setConfidenceThreshold(other.getConfidenceThreshold());
      }
      if (other.getMaxPredictions() != 0) {
        setMaxPredictions(other.getMaxPredictions());
      }
      if (other.getSegmentClassification() != false) {
        setSegmentClassification(other.getSegmentClassification());
      }
      if (other.getShotClassification() != false) {
        setShotClassification(other.getShotClassification());
      }
      if (other.getOneSecIntervalClassification() != false) {
        setOneSecIntervalClassification(other.getOneSecIntervalClassification());
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
            case 13:
              {
                confidenceThreshold_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
            case 16:
              {
                maxPredictions_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                segmentClassification_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                shotClassification_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            case 40:
              {
                oneSecIntervalClassification_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
            default:
              {
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

    private float confidenceThreshold_;
    /**
     *
     *
     * <pre>
     * The Model only returns predictions with at least this confidence score.
     * Default value is 0.0
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     *
     * @return The confidenceThreshold.
     */
    @java.lang.Override
    public float getConfidenceThreshold() {
      return confidenceThreshold_;
    }
    /**
     *
     *
     * <pre>
     * The Model only returns predictions with at least this confidence score.
     * Default value is 0.0
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     *
     * @param value The confidenceThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setConfidenceThreshold(float value) {

      confidenceThreshold_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Model only returns predictions with at least this confidence score.
     * Default value is 0.0
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfidenceThreshold() {
      bitField0_ = (bitField0_ & ~0x00000001);
      confidenceThreshold_ = 0F;
      onChanged();
      return this;
    }

    private int maxPredictions_;
    /**
     *
     *
     * <pre>
     * The Model only returns up to that many top, by confidence score,
     * predictions per instance. If this number is very high, the Model may return
     * fewer predictions. Default value is 10,000.
     * </pre>
     *
     * <code>int32 max_predictions = 2;</code>
     *
     * @return The maxPredictions.
     */
    @java.lang.Override
    public int getMaxPredictions() {
      return maxPredictions_;
    }
    /**
     *
     *
     * <pre>
     * The Model only returns up to that many top, by confidence score,
     * predictions per instance. If this number is very high, the Model may return
     * fewer predictions. Default value is 10,000.
     * </pre>
     *
     * <code>int32 max_predictions = 2;</code>
     *
     * @param value The maxPredictions to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPredictions(int value) {

      maxPredictions_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Model only returns up to that many top, by confidence score,
     * predictions per instance. If this number is very high, the Model may return
     * fewer predictions. Default value is 10,000.
     * </pre>
     *
     * <code>int32 max_predictions = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxPredictions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxPredictions_ = 0;
      onChanged();
      return this;
    }

    private boolean segmentClassification_;
    /**
     *
     *
     * <pre>
     * Set to true to request segment-level classification. Vertex AI returns
     * labels and their confidence scores for the entire time segment of the
     * video that user specified in the input instance.
     * Default value is true
     * </pre>
     *
     * <code>bool segment_classification = 3;</code>
     *
     * @return The segmentClassification.
     */
    @java.lang.Override
    public boolean getSegmentClassification() {
      return segmentClassification_;
    }
    /**
     *
     *
     * <pre>
     * Set to true to request segment-level classification. Vertex AI returns
     * labels and their confidence scores for the entire time segment of the
     * video that user specified in the input instance.
     * Default value is true
     * </pre>
     *
     * <code>bool segment_classification = 3;</code>
     *
     * @param value The segmentClassification to set.
     * @return This builder for chaining.
     */
    public Builder setSegmentClassification(boolean value) {

      segmentClassification_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set to true to request segment-level classification. Vertex AI returns
     * labels and their confidence scores for the entire time segment of the
     * video that user specified in the input instance.
     * Default value is true
     * </pre>
     *
     * <code>bool segment_classification = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSegmentClassification() {
      bitField0_ = (bitField0_ & ~0x00000004);
      segmentClassification_ = false;
      onChanged();
      return this;
    }

    private boolean shotClassification_;
    /**
     *
     *
     * <pre>
     * Set to true to request shot-level classification. Vertex AI determines
     * the boundaries for each camera shot in the entire time segment of the
     * video that user specified in the input instance. Vertex AI then
     * returns labels and their confidence scores for each detected shot, along
     * with the start and end time of the shot.
     * WARNING: Model evaluation is not done for this classification type,
     * the quality of it depends on the training data, but there are no metrics
     * provided to describe that quality.
     * Default value is false
     * </pre>
     *
     * <code>bool shot_classification = 4;</code>
     *
     * @return The shotClassification.
     */
    @java.lang.Override
    public boolean getShotClassification() {
      return shotClassification_;
    }
    /**
     *
     *
     * <pre>
     * Set to true to request shot-level classification. Vertex AI determines
     * the boundaries for each camera shot in the entire time segment of the
     * video that user specified in the input instance. Vertex AI then
     * returns labels and their confidence scores for each detected shot, along
     * with the start and end time of the shot.
     * WARNING: Model evaluation is not done for this classification type,
     * the quality of it depends on the training data, but there are no metrics
     * provided to describe that quality.
     * Default value is false
     * </pre>
     *
     * <code>bool shot_classification = 4;</code>
     *
     * @param value The shotClassification to set.
     * @return This builder for chaining.
     */
    public Builder setShotClassification(boolean value) {

      shotClassification_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set to true to request shot-level classification. Vertex AI determines
     * the boundaries for each camera shot in the entire time segment of the
     * video that user specified in the input instance. Vertex AI then
     * returns labels and their confidence scores for each detected shot, along
     * with the start and end time of the shot.
     * WARNING: Model evaluation is not done for this classification type,
     * the quality of it depends on the training data, but there are no metrics
     * provided to describe that quality.
     * Default value is false
     * </pre>
     *
     * <code>bool shot_classification = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearShotClassification() {
      bitField0_ = (bitField0_ & ~0x00000008);
      shotClassification_ = false;
      onChanged();
      return this;
    }

    private boolean oneSecIntervalClassification_;
    /**
     *
     *
     * <pre>
     * Set to true to request classification for a video at one-second intervals.
     * Vertex AI returns labels and their confidence scores for each second of
     * the entire time segment of the video that user specified in the input
     * WARNING: Model evaluation is not done for this classification type, the
     * quality of it depends on the training data, but there are no metrics
     * provided to describe that quality. Default value is false
     * </pre>
     *
     * <code>bool one_sec_interval_classification = 5;</code>
     *
     * @return The oneSecIntervalClassification.
     */
    @java.lang.Override
    public boolean getOneSecIntervalClassification() {
      return oneSecIntervalClassification_;
    }
    /**
     *
     *
     * <pre>
     * Set to true to request classification for a video at one-second intervals.
     * Vertex AI returns labels and their confidence scores for each second of
     * the entire time segment of the video that user specified in the input
     * WARNING: Model evaluation is not done for this classification type, the
     * quality of it depends on the training data, but there are no metrics
     * provided to describe that quality. Default value is false
     * </pre>
     *
     * <code>bool one_sec_interval_classification = 5;</code>
     *
     * @param value The oneSecIntervalClassification to set.
     * @return This builder for chaining.
     */
    public Builder setOneSecIntervalClassification(boolean value) {

      oneSecIntervalClassification_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set to true to request classification for a video at one-second intervals.
     * Vertex AI returns labels and their confidence scores for each second of
     * the entire time segment of the video that user specified in the input
     * WARNING: Model evaluation is not done for this classification type, the
     * quality of it depends on the training data, but there are no metrics
     * provided to describe that quality. Default value is false
     * </pre>
     *
     * <code>bool one_sec_interval_classification = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOneSecIntervalClassification() {
      bitField0_ = (bitField0_ & ~0x00000010);
      oneSecIntervalClassification_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams)
  private static final com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1.schema.predict.params
            .VideoClassificationPredictionParams();
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .VideoClassificationPredictionParams
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoClassificationPredictionParams> PARSER =
      new com.google.protobuf.AbstractParser<VideoClassificationPredictionParams>() {
        @java.lang.Override
        public VideoClassificationPredictionParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoClassificationPredictionParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoClassificationPredictionParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
