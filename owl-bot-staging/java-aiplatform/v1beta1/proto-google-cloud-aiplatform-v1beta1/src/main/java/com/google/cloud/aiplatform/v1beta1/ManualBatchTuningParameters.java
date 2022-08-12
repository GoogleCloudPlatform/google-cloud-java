// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/manual_batch_tuning_parameters.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Manual batch tuning parameters.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters}
 */
public final class ManualBatchTuningParameters extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters)
    ManualBatchTuningParametersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ManualBatchTuningParameters.newBuilder() to construct.
  private ManualBatchTuningParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManualBatchTuningParameters() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ManualBatchTuningParameters();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ManualBatchTuningParameters(
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
          case 8: {

            batchSize_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.internal_static_google_cloud_aiplatform_v1beta1_ManualBatchTuningParameters_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.internal_static_google_cloud_aiplatform_v1beta1_ManualBatchTuningParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters.class, com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters.Builder.class);
  }

  public static final int BATCH_SIZE_FIELD_NUMBER = 1;
  private int batchSize_;
  /**
   * <pre>
   * Immutable. The number of the records (e.g. instances) of the operation given in
   * each batch to a machine replica. Machine type, and size of a single
   * record should be considered when setting this parameter, higher value
   * speeds up the batch operation's execution, but too high value will result
   * in a whole batch not fitting in a machine's memory, and the whole
   * operation will fail.
   * The default value is 64.
   * </pre>
   *
   * <code>int32 batch_size = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The batchSize.
   */
  @java.lang.Override
  public int getBatchSize() {
    return batchSize_;
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
    if (batchSize_ != 0) {
      output.writeInt32(1, batchSize_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (batchSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, batchSize_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters other = (com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters) obj;

    if (getBatchSize()
        != other.getBatchSize()) return false;
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
    hash = (37 * hash) + BATCH_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getBatchSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters prototype) {
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
   * Manual batch tuning parameters.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters)
      com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.internal_static_google_cloud_aiplatform_v1beta1_ManualBatchTuningParameters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.internal_static_google_cloud_aiplatform_v1beta1_ManualBatchTuningParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters.class, com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      batchSize_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.internal_static_google_cloud_aiplatform_v1beta1_ManualBatchTuningParameters_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters build() {
      com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters result = new com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters(this);
      result.batchSize_ = batchSize_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters.getDefaultInstance()) return this;
      if (other.getBatchSize() != 0) {
        setBatchSize(other.getBatchSize());
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
      com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int batchSize_ ;
    /**
     * <pre>
     * Immutable. The number of the records (e.g. instances) of the operation given in
     * each batch to a machine replica. Machine type, and size of a single
     * record should be considered when setting this parameter, higher value
     * speeds up the batch operation's execution, but too high value will result
     * in a whole batch not fitting in a machine's memory, and the whole
     * operation will fail.
     * The default value is 64.
     * </pre>
     *
     * <code>int32 batch_size = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The batchSize.
     */
    @java.lang.Override
    public int getBatchSize() {
      return batchSize_;
    }
    /**
     * <pre>
     * Immutable. The number of the records (e.g. instances) of the operation given in
     * each batch to a machine replica. Machine type, and size of a single
     * record should be considered when setting this parameter, higher value
     * speeds up the batch operation's execution, but too high value will result
     * in a whole batch not fitting in a machine's memory, and the whole
     * operation will fail.
     * The default value is 64.
     * </pre>
     *
     * <code>int32 batch_size = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The batchSize to set.
     * @return This builder for chaining.
     */
    public Builder setBatchSize(int value) {
      
      batchSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The number of the records (e.g. instances) of the operation given in
     * each batch to a machine replica. Machine type, and size of a single
     * record should be considered when setting this parameter, higher value
     * speeds up the batch operation's execution, but too high value will result
     * in a whole batch not fitting in a machine's memory, and the whole
     * operation will fail.
     * The default value is 64.
     * </pre>
     *
     * <code>int32 batch_size = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearBatchSize() {
      
      batchSize_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters)
  private static final com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters();
  }

  public static com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManualBatchTuningParameters>
      PARSER = new com.google.protobuf.AbstractParser<ManualBatchTuningParameters>() {
    @java.lang.Override
    public ManualBatchTuningParameters parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ManualBatchTuningParameters(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ManualBatchTuningParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManualBatchTuningParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

