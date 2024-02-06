// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/evaluation_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

/**
 * <pre>
 * Provides details for how an evaluation job sends email alerts based on the
 * results of a run.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig}
 */
public final class EvaluationJobAlertConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig)
    EvaluationJobAlertConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EvaluationJobAlertConfig.newBuilder() to construct.
  private EvaluationJobAlertConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EvaluationJobAlertConfig() {
    email_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EvaluationJobAlertConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig.class, com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig.Builder.class);
  }

  public static final int EMAIL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object email_ = "";
  /**
   * <pre>
   * Required. An email address to send alerts to.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. An email address to send alerts to.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIN_ACCEPTABLE_MEAN_AVERAGE_PRECISION_FIELD_NUMBER = 2;
  private double minAcceptableMeanAveragePrecision_ = 0D;
  /**
   * <pre>
   * Required. A number between 0 and 1 that describes a minimum mean average
   * precision threshold. When the evaluation job runs, if it calculates that
   * your model version's predictions from the recent interval have
   * [meanAveragePrecision][google.cloud.datalabeling.v1beta1.PrCurve.mean_average_precision] below this
   * threshold, then it sends an alert to your specified email.
   * </pre>
   *
   * <code>double min_acceptable_mean_average_precision = 2;</code>
   * @return The minAcceptableMeanAveragePrecision.
   */
  @java.lang.Override
  public double getMinAcceptableMeanAveragePrecision() {
    return minAcceptableMeanAveragePrecision_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, email_);
    }
    if (java.lang.Double.doubleToRawLongBits(minAcceptableMeanAveragePrecision_) != 0) {
      output.writeDouble(2, minAcceptableMeanAveragePrecision_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, email_);
    }
    if (java.lang.Double.doubleToRawLongBits(minAcceptableMeanAveragePrecision_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, minAcceptableMeanAveragePrecision_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig other = (com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig) obj;

    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (java.lang.Double.doubleToLongBits(getMinAcceptableMeanAveragePrecision())
        != java.lang.Double.doubleToLongBits(
            other.getMinAcceptableMeanAveragePrecision())) return false;
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
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + MIN_ACCEPTABLE_MEAN_AVERAGE_PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMinAcceptableMeanAveragePrecision()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig prototype) {
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
   * Provides details for how an evaluation job sends email alerts based on the
   * results of a run.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig)
      com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig.class, com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig.newBuilder()
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
      email_ = "";
      minAcceptableMeanAveragePrecision_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig build() {
      com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig buildPartial() {
      com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig result = new com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.email_ = email_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minAcceptableMeanAveragePrecision_ = minAcceptableMeanAveragePrecision_;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig other) {
      if (other == com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig.getDefaultInstance()) return this;
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMinAcceptableMeanAveragePrecision() != 0D) {
        setMinAcceptableMeanAveragePrecision(other.getMinAcceptableMeanAveragePrecision());
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
              email_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 17: {
              minAcceptableMeanAveragePrecision_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
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

    private java.lang.Object email_ = "";
    /**
     * <pre>
     * Required. An email address to send alerts to.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. An email address to send alerts to.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. An email address to send alerts to.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. An email address to send alerts to.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      email_ = getDefaultInstance().getEmail();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. An email address to send alerts to.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private double minAcceptableMeanAveragePrecision_ ;
    /**
     * <pre>
     * Required. A number between 0 and 1 that describes a minimum mean average
     * precision threshold. When the evaluation job runs, if it calculates that
     * your model version's predictions from the recent interval have
     * [meanAveragePrecision][google.cloud.datalabeling.v1beta1.PrCurve.mean_average_precision] below this
     * threshold, then it sends an alert to your specified email.
     * </pre>
     *
     * <code>double min_acceptable_mean_average_precision = 2;</code>
     * @return The minAcceptableMeanAveragePrecision.
     */
    @java.lang.Override
    public double getMinAcceptableMeanAveragePrecision() {
      return minAcceptableMeanAveragePrecision_;
    }
    /**
     * <pre>
     * Required. A number between 0 and 1 that describes a minimum mean average
     * precision threshold. When the evaluation job runs, if it calculates that
     * your model version's predictions from the recent interval have
     * [meanAveragePrecision][google.cloud.datalabeling.v1beta1.PrCurve.mean_average_precision] below this
     * threshold, then it sends an alert to your specified email.
     * </pre>
     *
     * <code>double min_acceptable_mean_average_precision = 2;</code>
     * @param value The minAcceptableMeanAveragePrecision to set.
     * @return This builder for chaining.
     */
    public Builder setMinAcceptableMeanAveragePrecision(double value) {

      minAcceptableMeanAveragePrecision_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A number between 0 and 1 that describes a minimum mean average
     * precision threshold. When the evaluation job runs, if it calculates that
     * your model version's predictions from the recent interval have
     * [meanAveragePrecision][google.cloud.datalabeling.v1beta1.PrCurve.mean_average_precision] below this
     * threshold, then it sends an alert to your specified email.
     * </pre>
     *
     * <code>double min_acceptable_mean_average_precision = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinAcceptableMeanAveragePrecision() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minAcceptableMeanAveragePrecision_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig)
  private static final com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig();
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvaluationJobAlertConfig>
      PARSER = new com.google.protobuf.AbstractParser<EvaluationJobAlertConfig>() {
    @java.lang.Override
    public EvaluationJobAlertConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<EvaluationJobAlertConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvaluationJobAlertConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

