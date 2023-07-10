// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by the load balancer on a percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.HttpFaultInjection}
 */
public final class HttpFaultInjection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.HttpFaultInjection)
    HttpFaultInjectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpFaultInjection.newBuilder() to construct.
  private HttpFaultInjection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpFaultInjection() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpFaultInjection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultInjection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultInjection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.HttpFaultInjection.class, com.google.cloud.compute.v1.HttpFaultInjection.Builder.class);
  }

  private int bitField0_;
  public static final int ABORT_FIELD_NUMBER = 92611376;
  private com.google.cloud.compute.v1.HttpFaultAbort abort_;
  /**
   * <pre>
   * The specification for how client requests are aborted as part of fault injection.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
   * @return Whether the abort field is set.
   */
  @java.lang.Override
  public boolean hasAbort() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The specification for how client requests are aborted as part of fault injection.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
   * @return The abort.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HttpFaultAbort getAbort() {
    return abort_ == null ? com.google.cloud.compute.v1.HttpFaultAbort.getDefaultInstance() : abort_;
  }
  /**
   * <pre>
   * The specification for how client requests are aborted as part of fault injection.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HttpFaultAbortOrBuilder getAbortOrBuilder() {
    return abort_ == null ? com.google.cloud.compute.v1.HttpFaultAbort.getDefaultInstance() : abort_;
  }

  public static final int DELAY_FIELD_NUMBER = 95467907;
  private com.google.cloud.compute.v1.HttpFaultDelay delay_;
  /**
   * <pre>
   * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
   * @return Whether the delay field is set.
   */
  @java.lang.Override
  public boolean hasDelay() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
   * @return The delay.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HttpFaultDelay getDelay() {
    return delay_ == null ? com.google.cloud.compute.v1.HttpFaultDelay.getDefaultInstance() : delay_;
  }
  /**
   * <pre>
   * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HttpFaultDelayOrBuilder getDelayOrBuilder() {
    return delay_ == null ? com.google.cloud.compute.v1.HttpFaultDelay.getDefaultInstance() : delay_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(92611376, getAbort());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(95467907, getDelay());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(92611376, getAbort());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(95467907, getDelay());
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
    if (!(obj instanceof com.google.cloud.compute.v1.HttpFaultInjection)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.HttpFaultInjection other = (com.google.cloud.compute.v1.HttpFaultInjection) obj;

    if (hasAbort() != other.hasAbort()) return false;
    if (hasAbort()) {
      if (!getAbort()
          .equals(other.getAbort())) return false;
    }
    if (hasDelay() != other.hasDelay()) return false;
    if (hasDelay()) {
      if (!getDelay()
          .equals(other.getDelay())) return false;
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
    if (hasAbort()) {
      hash = (37 * hash) + ABORT_FIELD_NUMBER;
      hash = (53 * hash) + getAbort().hashCode();
    }
    if (hasDelay()) {
      hash = (37 * hash) + DELAY_FIELD_NUMBER;
      hash = (53 * hash) + getDelay().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpFaultInjection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HttpFaultInjection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.HttpFaultInjection parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.HttpFaultInjection prototype) {
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
   * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by the load balancer on a percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.HttpFaultInjection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.HttpFaultInjection)
      com.google.cloud.compute.v1.HttpFaultInjectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultInjection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultInjection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.HttpFaultInjection.class, com.google.cloud.compute.v1.HttpFaultInjection.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.HttpFaultInjection.newBuilder()
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
        getAbortFieldBuilder();
        getDelayFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      abort_ = null;
      if (abortBuilder_ != null) {
        abortBuilder_.dispose();
        abortBuilder_ = null;
      }
      delay_ = null;
      if (delayBuilder_ != null) {
        delayBuilder_.dispose();
        delayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_HttpFaultInjection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpFaultInjection getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.HttpFaultInjection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpFaultInjection build() {
      com.google.cloud.compute.v1.HttpFaultInjection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpFaultInjection buildPartial() {
      com.google.cloud.compute.v1.HttpFaultInjection result = new com.google.cloud.compute.v1.HttpFaultInjection(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.HttpFaultInjection result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.abort_ = abortBuilder_ == null
            ? abort_
            : abortBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.delay_ = delayBuilder_ == null
            ? delay_
            : delayBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.HttpFaultInjection) {
        return mergeFrom((com.google.cloud.compute.v1.HttpFaultInjection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.HttpFaultInjection other) {
      if (other == com.google.cloud.compute.v1.HttpFaultInjection.getDefaultInstance()) return this;
      if (other.hasAbort()) {
        mergeAbort(other.getAbort());
      }
      if (other.hasDelay()) {
        mergeDelay(other.getDelay());
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
            case 740891010: {
              input.readMessage(
                  getAbortFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 740891010
            case 763743258: {
              input.readMessage(
                  getDelayFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 763743258
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

    private com.google.cloud.compute.v1.HttpFaultAbort abort_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.HttpFaultAbort, com.google.cloud.compute.v1.HttpFaultAbort.Builder, com.google.cloud.compute.v1.HttpFaultAbortOrBuilder> abortBuilder_;
    /**
     * <pre>
     * The specification for how client requests are aborted as part of fault injection.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
     * @return Whether the abort field is set.
     */
    public boolean hasAbort() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The specification for how client requests are aborted as part of fault injection.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
     * @return The abort.
     */
    public com.google.cloud.compute.v1.HttpFaultAbort getAbort() {
      if (abortBuilder_ == null) {
        return abort_ == null ? com.google.cloud.compute.v1.HttpFaultAbort.getDefaultInstance() : abort_;
      } else {
        return abortBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The specification for how client requests are aborted as part of fault injection.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
     */
    public Builder setAbort(com.google.cloud.compute.v1.HttpFaultAbort value) {
      if (abortBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abort_ = value;
      } else {
        abortBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specification for how client requests are aborted as part of fault injection.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
     */
    public Builder setAbort(
        com.google.cloud.compute.v1.HttpFaultAbort.Builder builderForValue) {
      if (abortBuilder_ == null) {
        abort_ = builderForValue.build();
      } else {
        abortBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specification for how client requests are aborted as part of fault injection.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
     */
    public Builder mergeAbort(com.google.cloud.compute.v1.HttpFaultAbort value) {
      if (abortBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          abort_ != null &&
          abort_ != com.google.cloud.compute.v1.HttpFaultAbort.getDefaultInstance()) {
          getAbortBuilder().mergeFrom(value);
        } else {
          abort_ = value;
        }
      } else {
        abortBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specification for how client requests are aborted as part of fault injection.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
     */
    public Builder clearAbort() {
      bitField0_ = (bitField0_ & ~0x00000001);
      abort_ = null;
      if (abortBuilder_ != null) {
        abortBuilder_.dispose();
        abortBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specification for how client requests are aborted as part of fault injection.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
     */
    public com.google.cloud.compute.v1.HttpFaultAbort.Builder getAbortBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAbortFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The specification for how client requests are aborted as part of fault injection.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
     */
    public com.google.cloud.compute.v1.HttpFaultAbortOrBuilder getAbortOrBuilder() {
      if (abortBuilder_ != null) {
        return abortBuilder_.getMessageOrBuilder();
      } else {
        return abort_ == null ?
            com.google.cloud.compute.v1.HttpFaultAbort.getDefaultInstance() : abort_;
      }
    }
    /**
     * <pre>
     * The specification for how client requests are aborted as part of fault injection.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultAbort abort = 92611376;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.HttpFaultAbort, com.google.cloud.compute.v1.HttpFaultAbort.Builder, com.google.cloud.compute.v1.HttpFaultAbortOrBuilder> 
        getAbortFieldBuilder() {
      if (abortBuilder_ == null) {
        abortBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.HttpFaultAbort, com.google.cloud.compute.v1.HttpFaultAbort.Builder, com.google.cloud.compute.v1.HttpFaultAbortOrBuilder>(
                getAbort(),
                getParentForChildren(),
                isClean());
        abort_ = null;
      }
      return abortBuilder_;
    }

    private com.google.cloud.compute.v1.HttpFaultDelay delay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.HttpFaultDelay, com.google.cloud.compute.v1.HttpFaultDelay.Builder, com.google.cloud.compute.v1.HttpFaultDelayOrBuilder> delayBuilder_;
    /**
     * <pre>
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
     * @return Whether the delay field is set.
     */
    public boolean hasDelay() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
     * @return The delay.
     */
    public com.google.cloud.compute.v1.HttpFaultDelay getDelay() {
      if (delayBuilder_ == null) {
        return delay_ == null ? com.google.cloud.compute.v1.HttpFaultDelay.getDefaultInstance() : delay_;
      } else {
        return delayBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
     */
    public Builder setDelay(com.google.cloud.compute.v1.HttpFaultDelay value) {
      if (delayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        delay_ = value;
      } else {
        delayBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
     */
    public Builder setDelay(
        com.google.cloud.compute.v1.HttpFaultDelay.Builder builderForValue) {
      if (delayBuilder_ == null) {
        delay_ = builderForValue.build();
      } else {
        delayBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
     */
    public Builder mergeDelay(com.google.cloud.compute.v1.HttpFaultDelay value) {
      if (delayBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          delay_ != null &&
          delay_ != com.google.cloud.compute.v1.HttpFaultDelay.getDefaultInstance()) {
          getDelayBuilder().mergeFrom(value);
        } else {
          delay_ = value;
        }
      } else {
        delayBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
     */
    public Builder clearDelay() {
      bitField0_ = (bitField0_ & ~0x00000002);
      delay_ = null;
      if (delayBuilder_ != null) {
        delayBuilder_.dispose();
        delayBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
     */
    public com.google.cloud.compute.v1.HttpFaultDelay.Builder getDelayBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDelayFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
     */
    public com.google.cloud.compute.v1.HttpFaultDelayOrBuilder getDelayOrBuilder() {
      if (delayBuilder_ != null) {
        return delayBuilder_.getMessageOrBuilder();
      } else {
        return delay_ == null ?
            com.google.cloud.compute.v1.HttpFaultDelay.getDefaultInstance() : delay_;
      }
    }
    /**
     * <pre>
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.HttpFaultDelay delay = 95467907;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.HttpFaultDelay, com.google.cloud.compute.v1.HttpFaultDelay.Builder, com.google.cloud.compute.v1.HttpFaultDelayOrBuilder> 
        getDelayFieldBuilder() {
      if (delayBuilder_ == null) {
        delayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.HttpFaultDelay, com.google.cloud.compute.v1.HttpFaultDelay.Builder, com.google.cloud.compute.v1.HttpFaultDelayOrBuilder>(
                getDelay(),
                getParentForChildren(),
                isClean());
        delay_ = null;
      }
      return delayBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.HttpFaultInjection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.HttpFaultInjection)
  private static final com.google.cloud.compute.v1.HttpFaultInjection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.HttpFaultInjection();
  }

  public static com.google.cloud.compute.v1.HttpFaultInjection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpFaultInjection>
      PARSER = new com.google.protobuf.AbstractParser<HttpFaultInjection>() {
    @java.lang.Override
    public HttpFaultInjection parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpFaultInjection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpFaultInjection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.HttpFaultInjection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

