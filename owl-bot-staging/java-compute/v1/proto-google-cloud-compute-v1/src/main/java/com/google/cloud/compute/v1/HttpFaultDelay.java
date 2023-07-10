// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Specifies the delay introduced by the load balancer before forwarding the request to the backend service as part of fault injection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.HttpFaultDelay}
 */
public final class HttpFaultDelay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.HttpFaultDelay)
    HttpFaultDelayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpFaultDelay.newBuilder() to construct.
  private HttpFaultDelay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpFaultDelay() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpFaultDelay();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultDelay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultDelay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.HttpFaultDelay.class, com.google.cloud.compute.v1.HttpFaultDelay.Builder.class);
  }

  private int bitField0_;
  public static final int FIXED_DELAY_FIELD_NUMBER = 317037816;
  private com.google.cloud.compute.v1.Duration fixedDelay_;
  /**
   * <pre>
   * Specifies the value of the fixed delay interval.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
   * @return Whether the fixedDelay field is set.
   */
  @java.lang.Override
  public boolean hasFixedDelay() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Specifies the value of the fixed delay interval.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
   * @return The fixedDelay.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Duration getFixedDelay() {
    return fixedDelay_ == null ? com.google.cloud.compute.v1.Duration.getDefaultInstance() : fixedDelay_;
  }
  /**
   * <pre>
   * Specifies the value of the fixed delay interval.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DurationOrBuilder getFixedDelayOrBuilder() {
    return fixedDelay_ == null ? com.google.cloud.compute.v1.Duration.getDefaultInstance() : fixedDelay_;
  }

  public static final int PERCENTAGE_FIELD_NUMBER = 151909018;
  private double percentage_ = 0D;
  /**
   * <pre>
   * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
   * </pre>
   *
   * <code>optional double percentage = 151909018;</code>
   * @return Whether the percentage field is set.
   */
  @java.lang.Override
  public boolean hasPercentage() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
   * </pre>
   *
   * <code>optional double percentage = 151909018;</code>
   * @return The percentage.
   */
  @java.lang.Override
  public double getPercentage() {
    return percentage_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(151909018, percentage_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(317037816, getFixedDelay());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(151909018, percentage_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(317037816, getFixedDelay());
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
    if (!(obj instanceof com.google.cloud.compute.v1.HttpFaultDelay)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.HttpFaultDelay other = (com.google.cloud.compute.v1.HttpFaultDelay) obj;

    if (hasFixedDelay() != other.hasFixedDelay()) return false;
    if (hasFixedDelay()) {
      if (!getFixedDelay()
          .equals(other.getFixedDelay())) return false;
    }
    if (hasPercentage() != other.hasPercentage()) return false;
    if (hasPercentage()) {
      if (java.lang.Double.doubleToLongBits(getPercentage())
          != java.lang.Double.doubleToLongBits(
              other.getPercentage())) return false;
    }
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
    if (hasFixedDelay()) {
      hash = (37 * hash) + FIXED_DELAY_FIELD_NUMBER;
      hash = (53 * hash) + getFixedDelay().hashCode();
    }
    if (hasPercentage()) {
      hash = (37 * hash) + PERCENTAGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getPercentage()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpFaultDelay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HttpFaultDelay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.HttpFaultDelay parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.HttpFaultDelay prototype) {
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
   * Specifies the delay introduced by the load balancer before forwarding the request to the backend service as part of fault injection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.HttpFaultDelay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.HttpFaultDelay)
      com.google.cloud.compute.v1.HttpFaultDelayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultDelay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultDelay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.HttpFaultDelay.class, com.google.cloud.compute.v1.HttpFaultDelay.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.HttpFaultDelay.newBuilder()
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
        getFixedDelayFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fixedDelay_ = null;
      if (fixedDelayBuilder_ != null) {
        fixedDelayBuilder_.dispose();
        fixedDelayBuilder_ = null;
      }
      percentage_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultDelay_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpFaultDelay getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.HttpFaultDelay.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpFaultDelay build() {
      com.google.cloud.compute.v1.HttpFaultDelay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpFaultDelay buildPartial() {
      com.google.cloud.compute.v1.HttpFaultDelay result = new com.google.cloud.compute.v1.HttpFaultDelay(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.HttpFaultDelay result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fixedDelay_ = fixedDelayBuilder_ == null
            ? fixedDelay_
            : fixedDelayBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.percentage_ = percentage_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.HttpFaultDelay) {
        return mergeFrom((com.google.cloud.compute.v1.HttpFaultDelay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.HttpFaultDelay other) {
      if (other == com.google.cloud.compute.v1.HttpFaultDelay.getDefaultInstance()) return this;
      if (other.hasFixedDelay()) {
        mergeFixedDelay(other.getFixedDelay());
      }
      if (other.hasPercentage()) {
        setPercentage(other.getPercentage());
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
            case 1215272145: {
              percentage_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 1215272145
            case -1758664766: {
              input.readMessage(
                  getFixedDelayFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case -1758664766
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

    private com.google.cloud.compute.v1.Duration fixedDelay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Duration, com.google.cloud.compute.v1.Duration.Builder, com.google.cloud.compute.v1.DurationOrBuilder> fixedDelayBuilder_;
    /**
     * <pre>
     * Specifies the value of the fixed delay interval.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
     * @return Whether the fixedDelay field is set.
     */
    public boolean hasFixedDelay() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Specifies the value of the fixed delay interval.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
     * @return The fixedDelay.
     */
    public com.google.cloud.compute.v1.Duration getFixedDelay() {
      if (fixedDelayBuilder_ == null) {
        return fixedDelay_ == null ? com.google.cloud.compute.v1.Duration.getDefaultInstance() : fixedDelay_;
      } else {
        return fixedDelayBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the value of the fixed delay interval.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
     */
    public Builder setFixedDelay(com.google.cloud.compute.v1.Duration value) {
      if (fixedDelayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fixedDelay_ = value;
      } else {
        fixedDelayBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the value of the fixed delay interval.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
     */
    public Builder setFixedDelay(
        com.google.cloud.compute.v1.Duration.Builder builderForValue) {
      if (fixedDelayBuilder_ == null) {
        fixedDelay_ = builderForValue.build();
      } else {
        fixedDelayBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the value of the fixed delay interval.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
     */
    public Builder mergeFixedDelay(com.google.cloud.compute.v1.Duration value) {
      if (fixedDelayBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          fixedDelay_ != null &&
          fixedDelay_ != com.google.cloud.compute.v1.Duration.getDefaultInstance()) {
          getFixedDelayBuilder().mergeFrom(value);
        } else {
          fixedDelay_ = value;
        }
      } else {
        fixedDelayBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the value of the fixed delay interval.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
     */
    public Builder clearFixedDelay() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fixedDelay_ = null;
      if (fixedDelayBuilder_ != null) {
        fixedDelayBuilder_.dispose();
        fixedDelayBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the value of the fixed delay interval.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
     */
    public com.google.cloud.compute.v1.Duration.Builder getFixedDelayBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFixedDelayFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the value of the fixed delay interval.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
     */
    public com.google.cloud.compute.v1.DurationOrBuilder getFixedDelayOrBuilder() {
      if (fixedDelayBuilder_ != null) {
        return fixedDelayBuilder_.getMessageOrBuilder();
      } else {
        return fixedDelay_ == null ?
            com.google.cloud.compute.v1.Duration.getDefaultInstance() : fixedDelay_;
      }
    }
    /**
     * <pre>
     * Specifies the value of the fixed delay interval.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Duration, com.google.cloud.compute.v1.Duration.Builder, com.google.cloud.compute.v1.DurationOrBuilder> 
        getFixedDelayFieldBuilder() {
      if (fixedDelayBuilder_ == null) {
        fixedDelayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Duration, com.google.cloud.compute.v1.Duration.Builder, com.google.cloud.compute.v1.DurationOrBuilder>(
                getFixedDelay(),
                getParentForChildren(),
                isClean());
        fixedDelay_ = null;
      }
      return fixedDelayBuilder_;
    }

    private double percentage_ ;
    /**
     * <pre>
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * </pre>
     *
     * <code>optional double percentage = 151909018;</code>
     * @return Whether the percentage field is set.
     */
    @java.lang.Override
    public boolean hasPercentage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * </pre>
     *
     * <code>optional double percentage = 151909018;</code>
     * @return The percentage.
     */
    @java.lang.Override
    public double getPercentage() {
      return percentage_;
    }
    /**
     * <pre>
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * </pre>
     *
     * <code>optional double percentage = 151909018;</code>
     * @param value The percentage to set.
     * @return This builder for chaining.
     */
    public Builder setPercentage(double value) {

      percentage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * </pre>
     *
     * <code>optional double percentage = 151909018;</code>
     * @return This builder for chaining.
     */
    public Builder clearPercentage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      percentage_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.HttpFaultDelay)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.HttpFaultDelay)
  private static final com.google.cloud.compute.v1.HttpFaultDelay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.HttpFaultDelay();
  }

  public static com.google.cloud.compute.v1.HttpFaultDelay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpFaultDelay>
      PARSER = new com.google.protobuf.AbstractParser<HttpFaultDelay>() {
    @java.lang.Override
    public HttpFaultDelay parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpFaultDelay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpFaultDelay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.HttpFaultDelay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

