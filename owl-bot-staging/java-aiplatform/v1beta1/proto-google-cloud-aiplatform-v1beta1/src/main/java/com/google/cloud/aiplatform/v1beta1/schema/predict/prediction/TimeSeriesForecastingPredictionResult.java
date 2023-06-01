// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/time_series_forecasting.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

/**
 * <pre>
 * Prediction output format for Time Series Forecasting.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult}
 */
public final class TimeSeriesForecastingPredictionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult)
    TimeSeriesForecastingPredictionResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimeSeriesForecastingPredictionResult.newBuilder() to construct.
  private TimeSeriesForecastingPredictionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimeSeriesForecastingPredictionResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimeSeriesForecastingPredictionResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TimeSeriesForecastingPredictionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TimeSeriesForecastingPredictionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult.class, com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private float value_ = 0F;
  /**
   * <pre>
   * The regression value.
   * </pre>
   *
   * <code>float value = 1;</code>
   * @return The value.
   */
  @java.lang.Override
  public float getValue() {
    return value_;
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
    if (java.lang.Float.floatToRawIntBits(value_) != 0) {
      output.writeFloat(1, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(value_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, value_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult other = (com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult) obj;

    if (java.lang.Float.floatToIntBits(getValue())
        != java.lang.Float.floatToIntBits(
            other.getValue())) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getValue());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult prototype) {
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
   * Prediction output format for Time Series Forecasting.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult)
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TimeSeriesForecastingPredictionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TimeSeriesForecastingPredictionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult.class, com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult.newBuilder()
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
      value_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResultProto.internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TimeSeriesForecastingPredictionResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult build() {
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult result = new com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult other) {
      if (other == com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult.getDefaultInstance()) return this;
      if (other.getValue() != 0F) {
        setValue(other.getValue());
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
              value_ = input.readFloat();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
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

    private float value_ ;
    /**
     * <pre>
     * The regression value.
     * </pre>
     *
     * <code>float value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
    }
    /**
     * <pre>
     * The regression value.
     * </pre>
     *
     * <code>float value = 1;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(float value) {

      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The regression value.
     * </pre>
     *
     * <code>float value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult)
  private static final com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeSeriesForecastingPredictionResult>
      PARSER = new com.google.protobuf.AbstractParser<TimeSeriesForecastingPredictionResult>() {
    @java.lang.Override
    public TimeSeriesForecastingPredictionResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimeSeriesForecastingPredictionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeSeriesForecastingPredictionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.predict.prediction.TimeSeriesForecastingPredictionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

