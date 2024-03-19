// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_object_detection.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

/**
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs}
 */
public final class AutoMlImageObjectDetectionInputs extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs)
    AutoMlImageObjectDetectionInputsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoMlImageObjectDetectionInputs.newBuilder() to construct.
  private AutoMlImageObjectDetectionInputs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoMlImageObjectDetectionInputs() {
    modelType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutoMlImageObjectDetectionInputs();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageObjectDetectionProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageObjectDetectionProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.class, com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.Builder.class);
  }

  /**
   * Protobuf enum {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType}
   */
  public enum ModelType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Should not be set.
     * </pre>
     *
     * <code>MODEL_TYPE_UNSPECIFIED = 0;</code>
     */
    MODEL_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * A model best tailored to be used within Google Cloud, and which cannot
     * be exported. Expected to have a higher latency, but should also have a
     * higher prediction quality than other cloud models.
     * </pre>
     *
     * <code>CLOUD_HIGH_ACCURACY_1 = 1;</code>
     */
    CLOUD_HIGH_ACCURACY_1(1),
    /**
     * <pre>
     * A model best tailored to be used within Google Cloud, and which cannot
     * be exported. Expected to have a low latency, but may have lower
     * prediction quality than other cloud models.
     * </pre>
     *
     * <code>CLOUD_LOW_LATENCY_1 = 2;</code>
     */
    CLOUD_LOW_LATENCY_1(2),
    /**
     * <pre>
     * A model that, in addition to being available within Google
     * Cloud can also be exported (see ModelService.ExportModel) and
     * used on a mobile or edge device with TensorFlow afterwards.
     * Expected to have low latency, but may have lower prediction
     * quality than other mobile models.
     * </pre>
     *
     * <code>MOBILE_TF_LOW_LATENCY_1 = 3;</code>
     */
    MOBILE_TF_LOW_LATENCY_1(3),
    /**
     * <pre>
     * A model that, in addition to being available within Google
     * Cloud can also be exported (see ModelService.ExportModel) and
     * used on a mobile or edge device with TensorFlow afterwards.
     * </pre>
     *
     * <code>MOBILE_TF_VERSATILE_1 = 4;</code>
     */
    MOBILE_TF_VERSATILE_1(4),
    /**
     * <pre>
     * A model that, in addition to being available within Google
     * Cloud, can also be exported (see ModelService.ExportModel) and
     * used on a mobile or edge device with TensorFlow afterwards.
     * Expected to have a higher latency, but should also have a higher
     * prediction quality than other mobile models.
     * </pre>
     *
     * <code>MOBILE_TF_HIGH_ACCURACY_1 = 5;</code>
     */
    MOBILE_TF_HIGH_ACCURACY_1(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Should not be set.
     * </pre>
     *
     * <code>MODEL_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int MODEL_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * A model best tailored to be used within Google Cloud, and which cannot
     * be exported. Expected to have a higher latency, but should also have a
     * higher prediction quality than other cloud models.
     * </pre>
     *
     * <code>CLOUD_HIGH_ACCURACY_1 = 1;</code>
     */
    public static final int CLOUD_HIGH_ACCURACY_1_VALUE = 1;
    /**
     * <pre>
     * A model best tailored to be used within Google Cloud, and which cannot
     * be exported. Expected to have a low latency, but may have lower
     * prediction quality than other cloud models.
     * </pre>
     *
     * <code>CLOUD_LOW_LATENCY_1 = 2;</code>
     */
    public static final int CLOUD_LOW_LATENCY_1_VALUE = 2;
    /**
     * <pre>
     * A model that, in addition to being available within Google
     * Cloud can also be exported (see ModelService.ExportModel) and
     * used on a mobile or edge device with TensorFlow afterwards.
     * Expected to have low latency, but may have lower prediction
     * quality than other mobile models.
     * </pre>
     *
     * <code>MOBILE_TF_LOW_LATENCY_1 = 3;</code>
     */
    public static final int MOBILE_TF_LOW_LATENCY_1_VALUE = 3;
    /**
     * <pre>
     * A model that, in addition to being available within Google
     * Cloud can also be exported (see ModelService.ExportModel) and
     * used on a mobile or edge device with TensorFlow afterwards.
     * </pre>
     *
     * <code>MOBILE_TF_VERSATILE_1 = 4;</code>
     */
    public static final int MOBILE_TF_VERSATILE_1_VALUE = 4;
    /**
     * <pre>
     * A model that, in addition to being available within Google
     * Cloud, can also be exported (see ModelService.ExportModel) and
     * used on a mobile or edge device with TensorFlow afterwards.
     * Expected to have a higher latency, but should also have a higher
     * prediction quality than other mobile models.
     * </pre>
     *
     * <code>MOBILE_TF_HIGH_ACCURACY_1 = 5;</code>
     */
    public static final int MOBILE_TF_HIGH_ACCURACY_1_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ModelType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ModelType forNumber(int value) {
      switch (value) {
        case 0: return MODEL_TYPE_UNSPECIFIED;
        case 1: return CLOUD_HIGH_ACCURACY_1;
        case 2: return CLOUD_LOW_LATENCY_1;
        case 3: return MOBILE_TF_LOW_LATENCY_1;
        case 4: return MOBILE_TF_VERSATILE_1;
        case 5: return MOBILE_TF_HIGH_ACCURACY_1;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ModelType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ModelType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ModelType>() {
            public ModelType findValueByNumber(int number) {
              return ModelType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.getDescriptor().getEnumTypes().get(0);
    }

    private static final ModelType[] VALUES = values();

    public static ModelType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ModelType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType)
  }

  public static final int MODEL_TYPE_FIELD_NUMBER = 1;
  private int modelType_ = 0;
  /**
   * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType model_type = 1;</code>
   * @return The enum numeric value on the wire for modelType.
   */
  @java.lang.Override public int getModelTypeValue() {
    return modelType_;
  }
  /**
   * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType model_type = 1;</code>
   * @return The modelType.
   */
  @java.lang.Override public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType getModelType() {
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType result = com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType.forNumber(modelType_);
    return result == null ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType.UNRECOGNIZED : result;
  }

  public static final int BUDGET_MILLI_NODE_HOURS_FIELD_NUMBER = 2;
  private long budgetMilliNodeHours_ = 0L;
  /**
   * <pre>
   * The training budget of creating this model, expressed in milli node
   * hours i.e. 1,000 value in this field means 1 node hour. The actual
   * metadata.costMilliNodeHours will be equal or less than this value.
   * If further model training ceases to provide any improvements, it will
   * stop without using the full budget and the metadata.successfulStopReason
   * will be `model-converged`.
   * Note, node_hour  = actual_hour * number_of_nodes_involved.
   * For modelType `cloud`(default), the budget must be between 20,000
   * and 900,000 milli node hours, inclusive. The default value is 216,000
   * which represents one day in wall time, considering 9 nodes are used.
   * For model types `mobile-tf-low-latency-1`, `mobile-tf-versatile-1`,
   * `mobile-tf-high-accuracy-1`
   * the training budget must be between 1,000 and 100,000 milli node hours,
   * inclusive. The default value is 24,000 which represents one day in
   * wall time on a single node that is used.
   * </pre>
   *
   * <code>int64 budget_milli_node_hours = 2;</code>
   * @return The budgetMilliNodeHours.
   */
  @java.lang.Override
  public long getBudgetMilliNodeHours() {
    return budgetMilliNodeHours_;
  }

  public static final int DISABLE_EARLY_STOPPING_FIELD_NUMBER = 3;
  private boolean disableEarlyStopping_ = false;
  /**
   * <pre>
   * Use the entire training budget. This disables the early stopping feature.
   * When false the early stopping feature is enabled, which means that AutoML
   * Image Object Detection might stop training before the entire training
   * budget has been used.
   * </pre>
   *
   * <code>bool disable_early_stopping = 3;</code>
   * @return The disableEarlyStopping.
   */
  @java.lang.Override
  public boolean getDisableEarlyStopping() {
    return disableEarlyStopping_;
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
    if (modelType_ != com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType.MODEL_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, modelType_);
    }
    if (budgetMilliNodeHours_ != 0L) {
      output.writeInt64(2, budgetMilliNodeHours_);
    }
    if (disableEarlyStopping_ != false) {
      output.writeBool(3, disableEarlyStopping_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modelType_ != com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType.MODEL_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, modelType_);
    }
    if (budgetMilliNodeHours_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, budgetMilliNodeHours_);
    }
    if (disableEarlyStopping_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, disableEarlyStopping_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs other = (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs) obj;

    if (modelType_ != other.modelType_) return false;
    if (getBudgetMilliNodeHours()
        != other.getBudgetMilliNodeHours()) return false;
    if (getDisableEarlyStopping()
        != other.getDisableEarlyStopping()) return false;
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
    hash = (37 * hash) + MODEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + modelType_;
    hash = (37 * hash) + BUDGET_MILLI_NODE_HOURS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBudgetMilliNodeHours());
    hash = (37 * hash) + DISABLE_EARLY_STOPPING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisableEarlyStopping());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs prototype) {
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
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs)
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageObjectDetectionProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageObjectDetectionProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.class, com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.newBuilder()
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
      modelType_ = 0;
      budgetMilliNodeHours_ = 0L;
      disableEarlyStopping_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageObjectDetectionProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs build() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs result = new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.modelType_ = modelType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.budgetMilliNodeHours_ = budgetMilliNodeHours_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.disableEarlyStopping_ = disableEarlyStopping_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs other) {
      if (other == com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.getDefaultInstance()) return this;
      if (other.modelType_ != 0) {
        setModelTypeValue(other.getModelTypeValue());
      }
      if (other.getBudgetMilliNodeHours() != 0L) {
        setBudgetMilliNodeHours(other.getBudgetMilliNodeHours());
      }
      if (other.getDisableEarlyStopping() != false) {
        setDisableEarlyStopping(other.getDisableEarlyStopping());
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
              modelType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              budgetMilliNodeHours_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              disableEarlyStopping_ = input.readBool();
              bitField0_ |= 0x00000004;
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
    private int bitField0_;

    private int modelType_ = 0;
    /**
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType model_type = 1;</code>
     * @return The enum numeric value on the wire for modelType.
     */
    @java.lang.Override public int getModelTypeValue() {
      return modelType_;
    }
    /**
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType model_type = 1;</code>
     * @param value The enum numeric value on the wire for modelType to set.
     * @return This builder for chaining.
     */
    public Builder setModelTypeValue(int value) {
      modelType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType model_type = 1;</code>
     * @return The modelType.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType getModelType() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType result = com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType.forNumber(modelType_);
      return result == null ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType.UNRECOGNIZED : result;
    }
    /**
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType model_type = 1;</code>
     * @param value The modelType to set.
     * @return This builder for chaining.
     */
    public Builder setModelType(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      modelType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType model_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      modelType_ = 0;
      onChanged();
      return this;
    }

    private long budgetMilliNodeHours_ ;
    /**
     * <pre>
     * The training budget of creating this model, expressed in milli node
     * hours i.e. 1,000 value in this field means 1 node hour. The actual
     * metadata.costMilliNodeHours will be equal or less than this value.
     * If further model training ceases to provide any improvements, it will
     * stop without using the full budget and the metadata.successfulStopReason
     * will be `model-converged`.
     * Note, node_hour  = actual_hour * number_of_nodes_involved.
     * For modelType `cloud`(default), the budget must be between 20,000
     * and 900,000 milli node hours, inclusive. The default value is 216,000
     * which represents one day in wall time, considering 9 nodes are used.
     * For model types `mobile-tf-low-latency-1`, `mobile-tf-versatile-1`,
     * `mobile-tf-high-accuracy-1`
     * the training budget must be between 1,000 and 100,000 milli node hours,
     * inclusive. The default value is 24,000 which represents one day in
     * wall time on a single node that is used.
     * </pre>
     *
     * <code>int64 budget_milli_node_hours = 2;</code>
     * @return The budgetMilliNodeHours.
     */
    @java.lang.Override
    public long getBudgetMilliNodeHours() {
      return budgetMilliNodeHours_;
    }
    /**
     * <pre>
     * The training budget of creating this model, expressed in milli node
     * hours i.e. 1,000 value in this field means 1 node hour. The actual
     * metadata.costMilliNodeHours will be equal or less than this value.
     * If further model training ceases to provide any improvements, it will
     * stop without using the full budget and the metadata.successfulStopReason
     * will be `model-converged`.
     * Note, node_hour  = actual_hour * number_of_nodes_involved.
     * For modelType `cloud`(default), the budget must be between 20,000
     * and 900,000 milli node hours, inclusive. The default value is 216,000
     * which represents one day in wall time, considering 9 nodes are used.
     * For model types `mobile-tf-low-latency-1`, `mobile-tf-versatile-1`,
     * `mobile-tf-high-accuracy-1`
     * the training budget must be between 1,000 and 100,000 milli node hours,
     * inclusive. The default value is 24,000 which represents one day in
     * wall time on a single node that is used.
     * </pre>
     *
     * <code>int64 budget_milli_node_hours = 2;</code>
     * @param value The budgetMilliNodeHours to set.
     * @return This builder for chaining.
     */
    public Builder setBudgetMilliNodeHours(long value) {

      budgetMilliNodeHours_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The training budget of creating this model, expressed in milli node
     * hours i.e. 1,000 value in this field means 1 node hour. The actual
     * metadata.costMilliNodeHours will be equal or less than this value.
     * If further model training ceases to provide any improvements, it will
     * stop without using the full budget and the metadata.successfulStopReason
     * will be `model-converged`.
     * Note, node_hour  = actual_hour * number_of_nodes_involved.
     * For modelType `cloud`(default), the budget must be between 20,000
     * and 900,000 milli node hours, inclusive. The default value is 216,000
     * which represents one day in wall time, considering 9 nodes are used.
     * For model types `mobile-tf-low-latency-1`, `mobile-tf-versatile-1`,
     * `mobile-tf-high-accuracy-1`
     * the training budget must be between 1,000 and 100,000 milli node hours,
     * inclusive. The default value is 24,000 which represents one day in
     * wall time on a single node that is used.
     * </pre>
     *
     * <code>int64 budget_milli_node_hours = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBudgetMilliNodeHours() {
      bitField0_ = (bitField0_ & ~0x00000002);
      budgetMilliNodeHours_ = 0L;
      onChanged();
      return this;
    }

    private boolean disableEarlyStopping_ ;
    /**
     * <pre>
     * Use the entire training budget. This disables the early stopping feature.
     * When false the early stopping feature is enabled, which means that AutoML
     * Image Object Detection might stop training before the entire training
     * budget has been used.
     * </pre>
     *
     * <code>bool disable_early_stopping = 3;</code>
     * @return The disableEarlyStopping.
     */
    @java.lang.Override
    public boolean getDisableEarlyStopping() {
      return disableEarlyStopping_;
    }
    /**
     * <pre>
     * Use the entire training budget. This disables the early stopping feature.
     * When false the early stopping feature is enabled, which means that AutoML
     * Image Object Detection might stop training before the entire training
     * budget has been used.
     * </pre>
     *
     * <code>bool disable_early_stopping = 3;</code>
     * @param value The disableEarlyStopping to set.
     * @return This builder for chaining.
     */
    public Builder setDisableEarlyStopping(boolean value) {

      disableEarlyStopping_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Use the entire training budget. This disables the early stopping feature.
     * When false the early stopping feature is enabled, which means that AutoML
     * Image Object Detection might stop training before the entire training
     * budget has been used.
     * </pre>
     *
     * <code>bool disable_early_stopping = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisableEarlyStopping() {
      bitField0_ = (bitField0_ & ~0x00000004);
      disableEarlyStopping_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs)
  private static final com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlImageObjectDetectionInputs>
      PARSER = new com.google.protobuf.AbstractParser<AutoMlImageObjectDetectionInputs>() {
    @java.lang.Override
    public AutoMlImageObjectDetectionInputs parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoMlImageObjectDetectionInputs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlImageObjectDetectionInputs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

