// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest}
 */
public final class InstancesSetMinCpuPlatformRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest)
    InstancesSetMinCpuPlatformRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstancesSetMinCpuPlatformRequest.newBuilder() to construct.
  private InstancesSetMinCpuPlatformRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstancesSetMinCpuPlatformRequest() {
    minCpuPlatform_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstancesSetMinCpuPlatformRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstancesSetMinCpuPlatformRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstancesSetMinCpuPlatformRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest.class, com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_CPU_PLATFORM_FIELD_NUMBER = 242912759;
  @SuppressWarnings("serial")
  private volatile java.lang.Object minCpuPlatform_ = "";
  /**
   * <pre>
   * Minimum cpu/platform this instance should be started at.
   * </pre>
   *
   * <code>optional string min_cpu_platform = 242912759;</code>
   * @return Whether the minCpuPlatform field is set.
   */
  @java.lang.Override
  public boolean hasMinCpuPlatform() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Minimum cpu/platform this instance should be started at.
   * </pre>
   *
   * <code>optional string min_cpu_platform = 242912759;</code>
   * @return The minCpuPlatform.
   */
  @java.lang.Override
  public java.lang.String getMinCpuPlatform() {
    java.lang.Object ref = minCpuPlatform_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      minCpuPlatform_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Minimum cpu/platform this instance should be started at.
   * </pre>
   *
   * <code>optional string min_cpu_platform = 242912759;</code>
   * @return The bytes for minCpuPlatform.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMinCpuPlatformBytes() {
    java.lang.Object ref = minCpuPlatform_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      minCpuPlatform_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 242912759, minCpuPlatform_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(242912759, minCpuPlatform_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest other = (com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest) obj;

    if (hasMinCpuPlatform() != other.hasMinCpuPlatform()) return false;
    if (hasMinCpuPlatform()) {
      if (!getMinCpuPlatform()
          .equals(other.getMinCpuPlatform())) return false;
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
    if (hasMinCpuPlatform()) {
      hash = (37 * hash) + MIN_CPU_PLATFORM_FIELD_NUMBER;
      hash = (53 * hash) + getMinCpuPlatform().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest)
      com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstancesSetMinCpuPlatformRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstancesSetMinCpuPlatformRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest.class, com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest.newBuilder()
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
      minCpuPlatform_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstancesSetMinCpuPlatformRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest build() {
      com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest buildPartial() {
      com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest result = new com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minCpuPlatform_ = minCpuPlatform_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest) {
        return mergeFrom((com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest other) {
      if (other == com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest.getDefaultInstance()) return this;
      if (other.hasMinCpuPlatform()) {
        minCpuPlatform_ = other.minCpuPlatform_;
        bitField0_ |= 0x00000001;
        onChanged();
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
            case 1943302074: {
              minCpuPlatform_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 1943302074
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

    private java.lang.Object minCpuPlatform_ = "";
    /**
     * <pre>
     * Minimum cpu/platform this instance should be started at.
     * </pre>
     *
     * <code>optional string min_cpu_platform = 242912759;</code>
     * @return Whether the minCpuPlatform field is set.
     */
    public boolean hasMinCpuPlatform() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Minimum cpu/platform this instance should be started at.
     * </pre>
     *
     * <code>optional string min_cpu_platform = 242912759;</code>
     * @return The minCpuPlatform.
     */
    public java.lang.String getMinCpuPlatform() {
      java.lang.Object ref = minCpuPlatform_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        minCpuPlatform_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Minimum cpu/platform this instance should be started at.
     * </pre>
     *
     * <code>optional string min_cpu_platform = 242912759;</code>
     * @return The bytes for minCpuPlatform.
     */
    public com.google.protobuf.ByteString
        getMinCpuPlatformBytes() {
      java.lang.Object ref = minCpuPlatform_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minCpuPlatform_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Minimum cpu/platform this instance should be started at.
     * </pre>
     *
     * <code>optional string min_cpu_platform = 242912759;</code>
     * @param value The minCpuPlatform to set.
     * @return This builder for chaining.
     */
    public Builder setMinCpuPlatform(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      minCpuPlatform_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum cpu/platform this instance should be started at.
     * </pre>
     *
     * <code>optional string min_cpu_platform = 242912759;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinCpuPlatform() {
      minCpuPlatform_ = getDefaultInstance().getMinCpuPlatform();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum cpu/platform this instance should be started at.
     * </pre>
     *
     * <code>optional string min_cpu_platform = 242912759;</code>
     * @param value The bytes for minCpuPlatform to set.
     * @return This builder for chaining.
     */
    public Builder setMinCpuPlatformBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      minCpuPlatform_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest)
  private static final com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest();
  }

  public static com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstancesSetMinCpuPlatformRequest>
      PARSER = new com.google.protobuf.AbstractParser<InstancesSetMinCpuPlatformRequest>() {
    @java.lang.Override
    public InstancesSetMinCpuPlatformRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstancesSetMinCpuPlatformRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstancesSetMinCpuPlatformRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

