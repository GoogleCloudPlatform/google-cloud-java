// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * Describes a pre-shared key used to setup MACsec in static connectivity association key (CAK) mode.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey}
 */
public final class InterconnectMacsecConfigPreSharedKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey)
    InterconnectMacsecConfigPreSharedKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InterconnectMacsecConfigPreSharedKey.newBuilder() to construct.
  private InterconnectMacsecConfigPreSharedKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InterconnectMacsecConfigPreSharedKey() {
    cak_ = "";
    ckn_ = "";
    name_ = "";
    startTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InterconnectMacsecConfigPreSharedKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectMacsecConfigPreSharedKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectMacsecConfigPreSharedKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey.class, com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey.Builder.class);
  }

  private int bitField0_;
  public static final int CAK_FIELD_NUMBER = 98253;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cak_ = "";
  /**
   * <pre>
   * An auto-generated Connectivity Association Key (CAK) for this key.
   * </pre>
   *
   * <code>optional string cak = 98253;</code>
   * @return Whether the cak field is set.
   */
  @java.lang.Override
  public boolean hasCak() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * An auto-generated Connectivity Association Key (CAK) for this key.
   * </pre>
   *
   * <code>optional string cak = 98253;</code>
   * @return The cak.
   */
  @java.lang.Override
  public java.lang.String getCak() {
    java.lang.Object ref = cak_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cak_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An auto-generated Connectivity Association Key (CAK) for this key.
   * </pre>
   *
   * <code>optional string cak = 98253;</code>
   * @return The bytes for cak.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCakBytes() {
    java.lang.Object ref = cak_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cak_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CKN_FIELD_NUMBER = 98566;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ckn_ = "";
  /**
   * <pre>
   * An auto-generated Connectivity Association Key Name (CKN) for this key.
   * </pre>
   *
   * <code>optional string ckn = 98566;</code>
   * @return Whether the ckn field is set.
   */
  @java.lang.Override
  public boolean hasCkn() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * An auto-generated Connectivity Association Key Name (CKN) for this key.
   * </pre>
   *
   * <code>optional string ckn = 98566;</code>
   * @return The ckn.
   */
  @java.lang.Override
  public java.lang.String getCkn() {
    java.lang.Object ref = ckn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ckn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An auto-generated Connectivity Association Key Name (CKN) for this key.
   * </pre>
   *
   * <code>optional string ckn = 98566;</code>
   * @return The bytes for ckn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCknBytes() {
    java.lang.Object ref = ckn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ckn_ = b;
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
   * User provided name for this pre-shared key.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * User provided name for this pre-shared key.
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
   * User provided name for this pre-shared key.
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

  public static final int START_TIME_FIELD_NUMBER = 37467274;
  @SuppressWarnings("serial")
  private volatile java.lang.Object startTime_ = "";
  /**
   * <pre>
   * User provided timestamp on or after which this key is valid.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * User provided timestamp on or after which this key is valid.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public java.lang.String getStartTime() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * User provided timestamp on or after which this key is valid.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   * @return The bytes for startTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartTimeBytes() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startTime_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 98253, cak_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 98566, ckn_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3373707, name_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 37467274, startTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(98253, cak_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(98566, ckn_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3373707, name_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(37467274, startTime_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey other = (com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey) obj;

    if (hasCak() != other.hasCak()) return false;
    if (hasCak()) {
      if (!getCak()
          .equals(other.getCak())) return false;
    }
    if (hasCkn() != other.hasCkn()) return false;
    if (hasCkn()) {
      if (!getCkn()
          .equals(other.getCkn())) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime()
          .equals(other.getStartTime())) return false;
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
    if (hasCak()) {
      hash = (37 * hash) + CAK_FIELD_NUMBER;
      hash = (53 * hash) + getCak().hashCode();
    }
    if (hasCkn()) {
      hash = (37 * hash) + CKN_FIELD_NUMBER;
      hash = (53 * hash) + getCkn().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey prototype) {
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
   * Describes a pre-shared key used to setup MACsec in static connectivity association key (CAK) mode.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey)
      com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectMacsecConfigPreSharedKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectMacsecConfigPreSharedKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey.class, com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey.newBuilder()
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
      cak_ = "";
      ckn_ = "";
      name_ = "";
      startTime_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectMacsecConfigPreSharedKey_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey build() {
      com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey buildPartial() {
      com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey result = new com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cak_ = cak_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ckn_ = ckn_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.startTime_ = startTime_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey other) {
      if (other == com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey.getDefaultInstance()) return this;
      if (other.hasCak()) {
        cak_ = other.cak_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCkn()) {
        ckn_ = other.ckn_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasName()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasStartTime()) {
        startTime_ = other.startTime_;
        bitField0_ |= 0x00000008;
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
            case 786026: {
              cak_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 786026
            case 788530: {
              ckn_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 788530
            case 26989658: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26989658
            case 299738194: {
              startTime_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 299738194
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

    private java.lang.Object cak_ = "";
    /**
     * <pre>
     * An auto-generated Connectivity Association Key (CAK) for this key.
     * </pre>
     *
     * <code>optional string cak = 98253;</code>
     * @return Whether the cak field is set.
     */
    public boolean hasCak() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key (CAK) for this key.
     * </pre>
     *
     * <code>optional string cak = 98253;</code>
     * @return The cak.
     */
    public java.lang.String getCak() {
      java.lang.Object ref = cak_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cak_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key (CAK) for this key.
     * </pre>
     *
     * <code>optional string cak = 98253;</code>
     * @return The bytes for cak.
     */
    public com.google.protobuf.ByteString
        getCakBytes() {
      java.lang.Object ref = cak_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cak_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key (CAK) for this key.
     * </pre>
     *
     * <code>optional string cak = 98253;</code>
     * @param value The cak to set.
     * @return This builder for chaining.
     */
    public Builder setCak(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cak_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key (CAK) for this key.
     * </pre>
     *
     * <code>optional string cak = 98253;</code>
     * @return This builder for chaining.
     */
    public Builder clearCak() {
      cak_ = getDefaultInstance().getCak();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key (CAK) for this key.
     * </pre>
     *
     * <code>optional string cak = 98253;</code>
     * @param value The bytes for cak to set.
     * @return This builder for chaining.
     */
    public Builder setCakBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cak_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ckn_ = "";
    /**
     * <pre>
     * An auto-generated Connectivity Association Key Name (CKN) for this key.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     * @return Whether the ckn field is set.
     */
    public boolean hasCkn() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key Name (CKN) for this key.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     * @return The ckn.
     */
    public java.lang.String getCkn() {
      java.lang.Object ref = ckn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ckn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key Name (CKN) for this key.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     * @return The bytes for ckn.
     */
    public com.google.protobuf.ByteString
        getCknBytes() {
      java.lang.Object ref = ckn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ckn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key Name (CKN) for this key.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     * @param value The ckn to set.
     * @return This builder for chaining.
     */
    public Builder setCkn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ckn_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key Name (CKN) for this key.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     * @return This builder for chaining.
     */
    public Builder clearCkn() {
      ckn_ = getDefaultInstance().getCkn();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An auto-generated Connectivity Association Key Name (CKN) for this key.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     * @param value The bytes for ckn to set.
     * @return This builder for chaining.
     */
    public Builder setCknBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ckn_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * User provided name for this pre-shared key.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * User provided name for this pre-shared key.
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
     * User provided name for this pre-shared key.
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
     * User provided name for this pre-shared key.
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User provided name for this pre-shared key.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User provided name for this pre-shared key.
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object startTime_ = "";
    /**
     * <pre>
     * User provided timestamp on or after which this key is valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * User provided timestamp on or after which this key is valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @return The startTime.
     */
    public java.lang.String getStartTime() {
      java.lang.Object ref = startTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * User provided timestamp on or after which this key is valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @return The bytes for startTime.
     */
    public com.google.protobuf.ByteString
        getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * User provided timestamp on or after which this key is valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      startTime_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User provided timestamp on or after which this key is valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      startTime_ = getDefaultInstance().getStartTime();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User provided timestamp on or after which this key is valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @param value The bytes for startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      startTime_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey)
  private static final com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey();
  }

  public static com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectMacsecConfigPreSharedKey>
      PARSER = new com.google.protobuf.AbstractParser<InterconnectMacsecConfigPreSharedKey>() {
    @java.lang.Override
    public InterconnectMacsecConfigPreSharedKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<InterconnectMacsecConfigPreSharedKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectMacsecConfigPreSharedKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

