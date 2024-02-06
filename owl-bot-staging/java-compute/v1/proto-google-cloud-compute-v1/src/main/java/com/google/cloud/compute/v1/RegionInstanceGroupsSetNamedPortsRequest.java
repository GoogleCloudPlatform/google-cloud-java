// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest}
 */
public final class RegionInstanceGroupsSetNamedPortsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest)
    RegionInstanceGroupsSetNamedPortsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegionInstanceGroupsSetNamedPortsRequest.newBuilder() to construct.
  private RegionInstanceGroupsSetNamedPortsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegionInstanceGroupsSetNamedPortsRequest() {
    fingerprint_ = "";
    namedPorts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegionInstanceGroupsSetNamedPortsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupsSetNamedPortsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupsSetNamedPortsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest.class, com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FINGERPRINT_FIELD_NUMBER = 234678500;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fingerprint_ = "";
  /**
   * <pre>
   * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return Whether the fingerprint field is set.
   */
  @java.lang.Override
  public boolean hasFingerprint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return The fingerprint.
   */
  @java.lang.Override
  public java.lang.String getFingerprint() {
    java.lang.Object ref = fingerprint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fingerprint_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return The bytes for fingerprint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFingerprintBytes() {
    java.lang.Object ref = fingerprint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fingerprint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMED_PORTS_FIELD_NUMBER = 427598732;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.NamedPort> namedPorts_;
  /**
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.NamedPort> getNamedPortsList() {
    return namedPorts_;
  }
  /**
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.NamedPortOrBuilder> 
      getNamedPortsOrBuilderList() {
    return namedPorts_;
  }
  /**
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  @java.lang.Override
  public int getNamedPortsCount() {
    return namedPorts_.size();
  }
  /**
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NamedPort getNamedPorts(int index) {
    return namedPorts_.get(index);
  }
  /**
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NamedPortOrBuilder getNamedPortsOrBuilder(
      int index) {
    return namedPorts_.get(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 234678500, fingerprint_);
    }
    for (int i = 0; i < namedPorts_.size(); i++) {
      output.writeMessage(427598732, namedPorts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(234678500, fingerprint_);
    }
    for (int i = 0; i < namedPorts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(427598732, namedPorts_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest other = (com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest) obj;

    if (hasFingerprint() != other.hasFingerprint()) return false;
    if (hasFingerprint()) {
      if (!getFingerprint()
          .equals(other.getFingerprint())) return false;
    }
    if (!getNamedPortsList()
        .equals(other.getNamedPortsList())) return false;
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
    if (hasFingerprint()) {
      hash = (37 * hash) + FINGERPRINT_FIELD_NUMBER;
      hash = (53 * hash) + getFingerprint().hashCode();
    }
    if (getNamedPortsCount() > 0) {
      hash = (37 * hash) + NAMED_PORTS_FIELD_NUMBER;
      hash = (53 * hash) + getNamedPortsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest)
      com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupsSetNamedPortsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupsSetNamedPortsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest.class, com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest.newBuilder()
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
      fingerprint_ = "";
      if (namedPortsBuilder_ == null) {
        namedPorts_ = java.util.Collections.emptyList();
      } else {
        namedPorts_ = null;
        namedPortsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupsSetNamedPortsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest build() {
      com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest buildPartial() {
      com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest result = new com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest result) {
      if (namedPortsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          namedPorts_ = java.util.Collections.unmodifiableList(namedPorts_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.namedPorts_ = namedPorts_;
      } else {
        result.namedPorts_ = namedPortsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fingerprint_ = fingerprint_;
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
      if (other instanceof com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest) {
        return mergeFrom((com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest other) {
      if (other == com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest.getDefaultInstance()) return this;
      if (other.hasFingerprint()) {
        fingerprint_ = other.fingerprint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (namedPortsBuilder_ == null) {
        if (!other.namedPorts_.isEmpty()) {
          if (namedPorts_.isEmpty()) {
            namedPorts_ = other.namedPorts_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureNamedPortsIsMutable();
            namedPorts_.addAll(other.namedPorts_);
          }
          onChanged();
        }
      } else {
        if (!other.namedPorts_.isEmpty()) {
          if (namedPortsBuilder_.isEmpty()) {
            namedPortsBuilder_.dispose();
            namedPortsBuilder_ = null;
            namedPorts_ = other.namedPorts_;
            bitField0_ = (bitField0_ & ~0x00000002);
            namedPortsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNamedPortsFieldBuilder() : null;
          } else {
            namedPortsBuilder_.addAllMessages(other.namedPorts_);
          }
        }
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
            case 1877428002: {
              fingerprint_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 1877428002
            case -874177438: {
              com.google.cloud.compute.v1.NamedPort m =
                  input.readMessage(
                      com.google.cloud.compute.v1.NamedPort.parser(),
                      extensionRegistry);
              if (namedPortsBuilder_ == null) {
                ensureNamedPortsIsMutable();
                namedPorts_.add(m);
              } else {
                namedPortsBuilder_.addMessage(m);
              }
              break;
            } // case -874177438
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

    private java.lang.Object fingerprint_ = "";
    /**
     * <pre>
     * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     * @return Whether the fingerprint field is set.
     */
    public boolean hasFingerprint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     * @return The fingerprint.
     */
    public java.lang.String getFingerprint() {
      java.lang.Object ref = fingerprint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fingerprint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     * @return The bytes for fingerprint.
     */
    public com.google.protobuf.ByteString
        getFingerprintBytes() {
      java.lang.Object ref = fingerprint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fingerprint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     * @param value The fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setFingerprint(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fingerprint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     * @return This builder for chaining.
     */
    public Builder clearFingerprint() {
      fingerprint_ = getDefaultInstance().getFingerprint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     * @param value The bytes for fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setFingerprintBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fingerprint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.compute.v1.NamedPort> namedPorts_ =
      java.util.Collections.emptyList();
    private void ensureNamedPortsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        namedPorts_ = new java.util.ArrayList<com.google.cloud.compute.v1.NamedPort>(namedPorts_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.NamedPort, com.google.cloud.compute.v1.NamedPort.Builder, com.google.cloud.compute.v1.NamedPortOrBuilder> namedPortsBuilder_;

    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NamedPort> getNamedPortsList() {
      if (namedPortsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(namedPorts_);
      } else {
        return namedPortsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public int getNamedPortsCount() {
      if (namedPortsBuilder_ == null) {
        return namedPorts_.size();
      } else {
        return namedPortsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public com.google.cloud.compute.v1.NamedPort getNamedPorts(int index) {
      if (namedPortsBuilder_ == null) {
        return namedPorts_.get(index);
      } else {
        return namedPortsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public Builder setNamedPorts(
        int index, com.google.cloud.compute.v1.NamedPort value) {
      if (namedPortsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamedPortsIsMutable();
        namedPorts_.set(index, value);
        onChanged();
      } else {
        namedPortsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public Builder setNamedPorts(
        int index, com.google.cloud.compute.v1.NamedPort.Builder builderForValue) {
      if (namedPortsBuilder_ == null) {
        ensureNamedPortsIsMutable();
        namedPorts_.set(index, builderForValue.build());
        onChanged();
      } else {
        namedPortsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public Builder addNamedPorts(com.google.cloud.compute.v1.NamedPort value) {
      if (namedPortsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamedPortsIsMutable();
        namedPorts_.add(value);
        onChanged();
      } else {
        namedPortsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public Builder addNamedPorts(
        int index, com.google.cloud.compute.v1.NamedPort value) {
      if (namedPortsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamedPortsIsMutable();
        namedPorts_.add(index, value);
        onChanged();
      } else {
        namedPortsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public Builder addNamedPorts(
        com.google.cloud.compute.v1.NamedPort.Builder builderForValue) {
      if (namedPortsBuilder_ == null) {
        ensureNamedPortsIsMutable();
        namedPorts_.add(builderForValue.build());
        onChanged();
      } else {
        namedPortsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public Builder addNamedPorts(
        int index, com.google.cloud.compute.v1.NamedPort.Builder builderForValue) {
      if (namedPortsBuilder_ == null) {
        ensureNamedPortsIsMutable();
        namedPorts_.add(index, builderForValue.build());
        onChanged();
      } else {
        namedPortsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public Builder addAllNamedPorts(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.NamedPort> values) {
      if (namedPortsBuilder_ == null) {
        ensureNamedPortsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, namedPorts_);
        onChanged();
      } else {
        namedPortsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public Builder clearNamedPorts() {
      if (namedPortsBuilder_ == null) {
        namedPorts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        namedPortsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public Builder removeNamedPorts(int index) {
      if (namedPortsBuilder_ == null) {
        ensureNamedPortsIsMutable();
        namedPorts_.remove(index);
        onChanged();
      } else {
        namedPortsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public com.google.cloud.compute.v1.NamedPort.Builder getNamedPortsBuilder(
        int index) {
      return getNamedPortsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public com.google.cloud.compute.v1.NamedPortOrBuilder getNamedPortsOrBuilder(
        int index) {
      if (namedPortsBuilder_ == null) {
        return namedPorts_.get(index);  } else {
        return namedPortsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.NamedPortOrBuilder> 
         getNamedPortsOrBuilderList() {
      if (namedPortsBuilder_ != null) {
        return namedPortsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(namedPorts_);
      }
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public com.google.cloud.compute.v1.NamedPort.Builder addNamedPortsBuilder() {
      return getNamedPortsFieldBuilder().addBuilder(
          com.google.cloud.compute.v1.NamedPort.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public com.google.cloud.compute.v1.NamedPort.Builder addNamedPortsBuilder(
        int index) {
      return getNamedPortsFieldBuilder().addBuilder(
          index, com.google.cloud.compute.v1.NamedPort.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of named ports to set for this instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NamedPort.Builder> 
         getNamedPortsBuilderList() {
      return getNamedPortsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.NamedPort, com.google.cloud.compute.v1.NamedPort.Builder, com.google.cloud.compute.v1.NamedPortOrBuilder> 
        getNamedPortsFieldBuilder() {
      if (namedPortsBuilder_ == null) {
        namedPortsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.NamedPort, com.google.cloud.compute.v1.NamedPort.Builder, com.google.cloud.compute.v1.NamedPortOrBuilder>(
                namedPorts_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        namedPorts_ = null;
      }
      return namedPortsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest)
  private static final com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest();
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegionInstanceGroupsSetNamedPortsRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegionInstanceGroupsSetNamedPortsRequest>() {
    @java.lang.Override
    public RegionInstanceGroupsSetNamedPortsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegionInstanceGroupsSetNamedPortsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegionInstanceGroupsSetNamedPortsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

