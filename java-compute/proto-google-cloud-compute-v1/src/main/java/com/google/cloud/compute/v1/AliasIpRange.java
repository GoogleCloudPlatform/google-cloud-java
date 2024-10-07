/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * An alias IP range attached to an instance's network interface.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AliasIpRange}
 */
public final class AliasIpRange extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AliasIpRange)
    AliasIpRangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AliasIpRange.newBuilder() to construct.
  private AliasIpRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AliasIpRange() {
    ipCidrRange_ = "";
    subnetworkRangeName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AliasIpRange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AliasIpRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AliasIpRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AliasIpRange.class,
            com.google.cloud.compute.v1.AliasIpRange.Builder.class);
  }

  private int bitField0_;
  public static final int IP_CIDR_RANGE_FIELD_NUMBER = 98117322;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ipCidrRange_ = "";
  /**
   *
   *
   * <pre>
   * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return Whether the ipCidrRange field is set.
   */
  @java.lang.Override
  public boolean hasIpCidrRange() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The ipCidrRange.
   */
  @java.lang.Override
  public java.lang.String getIpCidrRange() {
    java.lang.Object ref = ipCidrRange_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipCidrRange_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The bytes for ipCidrRange.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIpCidrRangeBytes() {
    java.lang.Object ref = ipCidrRange_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ipCidrRange_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBNETWORK_RANGE_NAME_FIELD_NUMBER = 387995966;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subnetworkRangeName_ = "";
  /**
   *
   *
   * <pre>
   * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
   * </pre>
   *
   * <code>optional string subnetwork_range_name = 387995966;</code>
   *
   * @return Whether the subnetworkRangeName field is set.
   */
  @java.lang.Override
  public boolean hasSubnetworkRangeName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
   * </pre>
   *
   * <code>optional string subnetwork_range_name = 387995966;</code>
   *
   * @return The subnetworkRangeName.
   */
  @java.lang.Override
  public java.lang.String getSubnetworkRangeName() {
    java.lang.Object ref = subnetworkRangeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnetworkRangeName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
   * </pre>
   *
   * <code>optional string subnetwork_range_name = 387995966;</code>
   *
   * @return The bytes for subnetworkRangeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubnetworkRangeNameBytes() {
    java.lang.Object ref = subnetworkRangeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subnetworkRangeName_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 98117322, ipCidrRange_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 387995966, subnetworkRangeName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(98117322, ipCidrRange_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(387995966, subnetworkRangeName_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.AliasIpRange)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AliasIpRange other = (com.google.cloud.compute.v1.AliasIpRange) obj;

    if (hasIpCidrRange() != other.hasIpCidrRange()) return false;
    if (hasIpCidrRange()) {
      if (!getIpCidrRange().equals(other.getIpCidrRange())) return false;
    }
    if (hasSubnetworkRangeName() != other.hasSubnetworkRangeName()) return false;
    if (hasSubnetworkRangeName()) {
      if (!getSubnetworkRangeName().equals(other.getSubnetworkRangeName())) return false;
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
    if (hasIpCidrRange()) {
      hash = (37 * hash) + IP_CIDR_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getIpCidrRange().hashCode();
    }
    if (hasSubnetworkRangeName()) {
      hash = (37 * hash) + SUBNETWORK_RANGE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getSubnetworkRangeName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AliasIpRange parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.compute.v1.AliasIpRange prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * An alias IP range attached to an instance's network interface.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.AliasIpRange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AliasIpRange)
      com.google.cloud.compute.v1.AliasIpRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AliasIpRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AliasIpRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AliasIpRange.class,
              com.google.cloud.compute.v1.AliasIpRange.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AliasIpRange.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ipCidrRange_ = "";
      subnetworkRangeName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AliasIpRange_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AliasIpRange getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AliasIpRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AliasIpRange build() {
      com.google.cloud.compute.v1.AliasIpRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AliasIpRange buildPartial() {
      com.google.cloud.compute.v1.AliasIpRange result =
          new com.google.cloud.compute.v1.AliasIpRange(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.AliasIpRange result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ipCidrRange_ = ipCidrRange_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subnetworkRangeName_ = subnetworkRangeName_;
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.AliasIpRange) {
        return mergeFrom((com.google.cloud.compute.v1.AliasIpRange) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AliasIpRange other) {
      if (other == com.google.cloud.compute.v1.AliasIpRange.getDefaultInstance()) return this;
      if (other.hasIpCidrRange()) {
        ipCidrRange_ = other.ipCidrRange_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSubnetworkRangeName()) {
        subnetworkRangeName_ = other.subnetworkRangeName_;
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
            case 784938578:
              {
                ipCidrRange_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 784938578
            case -1190999566:
              {
                subnetworkRangeName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -1190999566
            default:
              {
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

    private java.lang.Object ipCidrRange_ = "";
    /**
     *
     *
     * <pre>
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     *
     * @return Whether the ipCidrRange field is set.
     */
    public boolean hasIpCidrRange() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     *
     * @return The ipCidrRange.
     */
    public java.lang.String getIpCidrRange() {
      java.lang.Object ref = ipCidrRange_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipCidrRange_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     *
     * @return The bytes for ipCidrRange.
     */
    public com.google.protobuf.ByteString getIpCidrRangeBytes() {
      java.lang.Object ref = ipCidrRange_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ipCidrRange_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     *
     * @param value The ipCidrRange to set.
     * @return This builder for chaining.
     */
    public Builder setIpCidrRange(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ipCidrRange_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIpCidrRange() {
      ipCidrRange_ = getDefaultInstance().getIpCidrRange();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     *
     * @param value The bytes for ipCidrRange to set.
     * @return This builder for chaining.
     */
    public Builder setIpCidrRangeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ipCidrRange_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object subnetworkRangeName_ = "";
    /**
     *
     *
     * <pre>
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
     * </pre>
     *
     * <code>optional string subnetwork_range_name = 387995966;</code>
     *
     * @return Whether the subnetworkRangeName field is set.
     */
    public boolean hasSubnetworkRangeName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
     * </pre>
     *
     * <code>optional string subnetwork_range_name = 387995966;</code>
     *
     * @return The subnetworkRangeName.
     */
    public java.lang.String getSubnetworkRangeName() {
      java.lang.Object ref = subnetworkRangeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnetworkRangeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
     * </pre>
     *
     * <code>optional string subnetwork_range_name = 387995966;</code>
     *
     * @return The bytes for subnetworkRangeName.
     */
    public com.google.protobuf.ByteString getSubnetworkRangeNameBytes() {
      java.lang.Object ref = subnetworkRangeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subnetworkRangeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
     * </pre>
     *
     * <code>optional string subnetwork_range_name = 387995966;</code>
     *
     * @param value The subnetworkRangeName to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetworkRangeName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subnetworkRangeName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
     * </pre>
     *
     * <code>optional string subnetwork_range_name = 387995966;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubnetworkRangeName() {
      subnetworkRangeName_ = getDefaultInstance().getSubnetworkRangeName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
     * </pre>
     *
     * <code>optional string subnetwork_range_name = 387995966;</code>
     *
     * @param value The bytes for subnetworkRangeName to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetworkRangeNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subnetworkRangeName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AliasIpRange)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AliasIpRange)
  private static final com.google.cloud.compute.v1.AliasIpRange DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AliasIpRange();
  }

  public static com.google.cloud.compute.v1.AliasIpRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AliasIpRange> PARSER =
      new com.google.protobuf.AbstractParser<AliasIpRange>() {
        @java.lang.Override
        public AliasIpRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<AliasIpRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AliasIpRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AliasIpRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
