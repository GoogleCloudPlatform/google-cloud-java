// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * The metric specification that defines the target resource utilization
 * (CPU utilization, accelerator's duty cycle, and so on) for calculating the
 * desired replica count.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec}
 */
public final class AutoscalingMetricSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec)
    AutoscalingMetricSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoscalingMetricSpec.newBuilder() to construct.
  private AutoscalingMetricSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoscalingMetricSpec() {
    metricName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutoscalingMetricSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.class, com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.Builder.class);
  }

  public static final int METRIC_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object metricName_ = "";
  /**
   * <pre>
   * Required. The resource metric name.
   * Supported metrics:
   *
   * * For Online Prediction:
   * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
   * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
   * </pre>
   *
   * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The metricName.
   */
  @java.lang.Override
  public java.lang.String getMetricName() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metricName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource metric name.
   * Supported metrics:
   *
   * * For Online Prediction:
   * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
   * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
   * </pre>
   *
   * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for metricName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMetricNameBytes() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metricName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_FIELD_NUMBER = 2;
  private int target_ = 0;
  /**
   * <pre>
   * The target resource utilization in percentage (1% - 100%) for the given
   * metric; once the real usage deviates from the target by a certain
   * percentage, the machine replicas change. The default value is 60
   * (representing 60%) if not provided.
   * </pre>
   *
   * <code>int32 target = 2;</code>
   * @return The target.
   */
  @java.lang.Override
  public int getTarget() {
    return target_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metricName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
    }
    if (target_ != 0) {
      output.writeInt32(2, target_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metricName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
    }
    if (target_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, target_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec other = (com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec) obj;

    if (!getMetricName()
        .equals(other.getMetricName())) return false;
    if (getTarget()
        != other.getTarget()) return false;
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
    hash = (37 * hash) + METRIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMetricName().hashCode();
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec prototype) {
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
   * The metric specification that defines the target resource utilization
   * (CPU utilization, accelerator's duty cycle, and so on) for calculating the
   * desired replica count.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec)
      com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.class, com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.newBuilder()
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
      metricName_ = "";
      target_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec build() {
      com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec result = new com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metricName_ = metricName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.target_ = target_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec other) {
      if (other == com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.getDefaultInstance()) return this;
      if (!other.getMetricName().isEmpty()) {
        metricName_ = other.metricName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getTarget() != 0) {
        setTarget(other.getTarget());
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
              metricName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              target_ = input.readInt32();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.lang.Object metricName_ = "";
    /**
     * <pre>
     * Required. The resource metric name.
     * Supported metrics:
     *
     * * For Online Prediction:
     * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
     * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
     * </pre>
     *
     * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The metricName.
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metricName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource metric name.
     * Supported metrics:
     *
     * * For Online Prediction:
     * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
     * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
     * </pre>
     *
     * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for metricName.
     */
    public com.google.protobuf.ByteString
        getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource metric name.
     * Supported metrics:
     *
     * * For Online Prediction:
     * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
     * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
     * </pre>
     *
     * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The metricName to set.
     * @return This builder for chaining.
     */
    public Builder setMetricName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      metricName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource metric name.
     * Supported metrics:
     *
     * * For Online Prediction:
     * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
     * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
     * </pre>
     *
     * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearMetricName() {
      metricName_ = getDefaultInstance().getMetricName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource metric name.
     * Supported metrics:
     *
     * * For Online Prediction:
     * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
     * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
     * </pre>
     *
     * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for metricName to set.
     * @return This builder for chaining.
     */
    public Builder setMetricNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      metricName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int target_ ;
    /**
     * <pre>
     * The target resource utilization in percentage (1% - 100%) for the given
     * metric; once the real usage deviates from the target by a certain
     * percentage, the machine replicas change. The default value is 60
     * (representing 60%) if not provided.
     * </pre>
     *
     * <code>int32 target = 2;</code>
     * @return The target.
     */
    @java.lang.Override
    public int getTarget() {
      return target_;
    }
    /**
     * <pre>
     * The target resource utilization in percentage (1% - 100%) for the given
     * metric; once the real usage deviates from the target by a certain
     * percentage, the machine replicas change. The default value is 60
     * (representing 60%) if not provided.
     * </pre>
     *
     * <code>int32 target = 2;</code>
     * @param value The target to set.
     * @return This builder for chaining.
     */
    public Builder setTarget(int value) {

      target_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target resource utilization in percentage (1% - 100%) for the given
     * metric; once the real usage deviates from the target by a certain
     * percentage, the machine replicas change. The default value is 60
     * (representing 60%) if not provided.
     * </pre>
     *
     * <code>int32 target = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTarget() {
      bitField0_ = (bitField0_ & ~0x00000002);
      target_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec)
  private static final com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoscalingMetricSpec>
      PARSER = new com.google.protobuf.AbstractParser<AutoscalingMetricSpec>() {
    @java.lang.Override
    public AutoscalingMetricSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoscalingMetricSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoscalingMetricSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

