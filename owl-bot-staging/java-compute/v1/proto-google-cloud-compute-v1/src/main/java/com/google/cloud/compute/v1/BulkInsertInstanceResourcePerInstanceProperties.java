// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * Per-instance properties to be set on individual instances. To be extended in the future.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties}
 */
public final class BulkInsertInstanceResourcePerInstanceProperties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties)
    BulkInsertInstanceResourcePerInstancePropertiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BulkInsertInstanceResourcePerInstanceProperties.newBuilder() to construct.
  private BulkInsertInstanceResourcePerInstanceProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BulkInsertInstanceResourcePerInstanceProperties() {
    hostname_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BulkInsertInstanceResourcePerInstanceProperties();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BulkInsertInstanceResourcePerInstanceProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BulkInsertInstanceResourcePerInstanceProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties.class, com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties.Builder.class);
  }

  private int bitField0_;
  public static final int HOSTNAME_FIELD_NUMBER = 237067315;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hostname_ = "";
  /**
   * <pre>
   * Specifies the hostname of the instance. More details in: https://cloud.google.com/compute/docs/instances/custom-hostname-vm#naming_convention
   * </pre>
   *
   * <code>optional string hostname = 237067315;</code>
   * @return Whether the hostname field is set.
   */
  @java.lang.Override
  public boolean hasHostname() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Specifies the hostname of the instance. More details in: https://cloud.google.com/compute/docs/instances/custom-hostname-vm#naming_convention
   * </pre>
   *
   * <code>optional string hostname = 237067315;</code>
   * @return The hostname.
   */
  @java.lang.Override
  public java.lang.String getHostname() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostname_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the hostname of the instance. More details in: https://cloud.google.com/compute/docs/instances/custom-hostname-vm#naming_convention
   * </pre>
   *
   * <code>optional string hostname = 237067315;</code>
   * @return The bytes for hostname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostnameBytes() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3373707;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * This field is only temporary. It will be removed. Do not use it.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * This field is only temporary. It will be removed. Do not use it.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This field is only temporary. It will be removed. Do not use it.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3373707, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 237067315, hostname_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3373707, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(237067315, hostname_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties other = (com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties) obj;

    if (hasHostname() != other.hasHostname()) return false;
    if (hasHostname()) {
      if (!getHostname()
          .equals(other.getHostname())) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
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
    if (hasHostname()) {
      hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
      hash = (53 * hash) + getHostname().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties prototype) {
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
   * Per-instance properties to be set on individual instances. To be extended in the future.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties)
      com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstancePropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BulkInsertInstanceResourcePerInstanceProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BulkInsertInstanceResourcePerInstanceProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties.class, com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties.newBuilder()
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
      hostname_ = "";
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BulkInsertInstanceResourcePerInstanceProperties_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties build() {
      com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties buildPartial() {
      com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties result = new com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hostname_ = hostname_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
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
      if (other instanceof com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties) {
        return mergeFrom((com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties other) {
      if (other == com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties.getDefaultInstance()) return this;
      if (other.hasHostname()) {
        hostname_ = other.hostname_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasName()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
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
            case 26989658: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 26989658
            case 1896538522: {
              hostname_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 1896538522
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

    private java.lang.Object hostname_ = "";
    /**
     * <pre>
     * Specifies the hostname of the instance. More details in: https://cloud.google.com/compute/docs/instances/custom-hostname-vm#naming_convention
     * </pre>
     *
     * <code>optional string hostname = 237067315;</code>
     * @return Whether the hostname field is set.
     */
    public boolean hasHostname() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Specifies the hostname of the instance. More details in: https://cloud.google.com/compute/docs/instances/custom-hostname-vm#naming_convention
     * </pre>
     *
     * <code>optional string hostname = 237067315;</code>
     * @return The hostname.
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the hostname of the instance. More details in: https://cloud.google.com/compute/docs/instances/custom-hostname-vm#naming_convention
     * </pre>
     *
     * <code>optional string hostname = 237067315;</code>
     * @return The bytes for hostname.
     */
    public com.google.protobuf.ByteString
        getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the hostname of the instance. More details in: https://cloud.google.com/compute/docs/instances/custom-hostname-vm#naming_convention
     * </pre>
     *
     * <code>optional string hostname = 237067315;</code>
     * @param value The hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostname(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hostname_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the hostname of the instance. More details in: https://cloud.google.com/compute/docs/instances/custom-hostname-vm#naming_convention
     * </pre>
     *
     * <code>optional string hostname = 237067315;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostname() {
      hostname_ = getDefaultInstance().getHostname();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the hostname of the instance. More details in: https://cloud.google.com/compute/docs/instances/custom-hostname-vm#naming_convention
     * </pre>
     *
     * <code>optional string hostname = 237067315;</code>
     * @param value The bytes for hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hostname_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * This field is only temporary. It will be removed. Do not use it.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * This field is only temporary. It will be removed. Do not use it.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This field is only temporary. It will be removed. Do not use it.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This field is only temporary. It will be removed. Do not use it.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is only temporary. It will be removed. Do not use it.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is only temporary. It will be removed. Do not use it.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties)
  private static final com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties();
  }

  public static com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BulkInsertInstanceResourcePerInstanceProperties>
      PARSER = new com.google.protobuf.AbstractParser<BulkInsertInstanceResourcePerInstanceProperties>() {
    @java.lang.Override
    public BulkInsertInstanceResourcePerInstanceProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<BulkInsertInstanceResourcePerInstanceProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BulkInsertInstanceResourcePerInstanceProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

