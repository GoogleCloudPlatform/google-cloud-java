// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

/**
 * <pre>
 * Configuration options for the private GKE cluster in a Cloud Composer
 * environment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig}
 */
public final class PrivateClusterConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig)
    PrivateClusterConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrivateClusterConfig.newBuilder() to construct.
  private PrivateClusterConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrivateClusterConfig() {
    masterIpv4CidrBlock_ = "";
    masterIpv4ReservedRange_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrivateClusterConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_PrivateClusterConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_PrivateClusterConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig.class, com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig.Builder.class);
  }

  public static final int ENABLE_PRIVATE_ENDPOINT_FIELD_NUMBER = 1;
  private boolean enablePrivateEndpoint_ = false;
  /**
   * <pre>
   * Optional. If `true`, access to the public endpoint of the GKE cluster is
   * denied.
   * </pre>
   *
   * <code>bool enable_private_endpoint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enablePrivateEndpoint.
   */
  @java.lang.Override
  public boolean getEnablePrivateEndpoint() {
    return enablePrivateEndpoint_;
  }

  public static final int MASTER_IPV4_CIDR_BLOCK_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object masterIpv4CidrBlock_ = "";
  /**
   * <pre>
   * Optional. The CIDR block from which IPv4 range for GKE master will be
   * reserved. If left blank, the default value of '172.16.0.0/23' is used.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The masterIpv4CidrBlock.
   */
  @java.lang.Override
  public java.lang.String getMasterIpv4CidrBlock() {
    java.lang.Object ref = masterIpv4CidrBlock_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      masterIpv4CidrBlock_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The CIDR block from which IPv4 range for GKE master will be
   * reserved. If left blank, the default value of '172.16.0.0/23' is used.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for masterIpv4CidrBlock.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMasterIpv4CidrBlockBytes() {
    java.lang.Object ref = masterIpv4CidrBlock_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      masterIpv4CidrBlock_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MASTER_IPV4_RESERVED_RANGE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object masterIpv4ReservedRange_ = "";
  /**
   * <pre>
   * Output only. The IP range in CIDR notation to use for the hosted master
   * network. This range is used for assigning internal IP addresses to the
   * cluster master or set of masters and to the internal load balancer virtual
   * IP. This range must not overlap with any other ranges in use within the
   * cluster's network.
   * </pre>
   *
   * <code>string master_ipv4_reserved_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The masterIpv4ReservedRange.
   */
  @java.lang.Override
  public java.lang.String getMasterIpv4ReservedRange() {
    java.lang.Object ref = masterIpv4ReservedRange_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      masterIpv4ReservedRange_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The IP range in CIDR notation to use for the hosted master
   * network. This range is used for assigning internal IP addresses to the
   * cluster master or set of masters and to the internal load balancer virtual
   * IP. This range must not overlap with any other ranges in use within the
   * cluster's network.
   * </pre>
   *
   * <code>string master_ipv4_reserved_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for masterIpv4ReservedRange.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMasterIpv4ReservedRangeBytes() {
    java.lang.Object ref = masterIpv4ReservedRange_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      masterIpv4ReservedRange_ = b;
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
    if (enablePrivateEndpoint_ != false) {
      output.writeBool(1, enablePrivateEndpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(masterIpv4CidrBlock_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, masterIpv4CidrBlock_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(masterIpv4ReservedRange_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, masterIpv4ReservedRange_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enablePrivateEndpoint_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enablePrivateEndpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(masterIpv4CidrBlock_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, masterIpv4CidrBlock_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(masterIpv4ReservedRange_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, masterIpv4ReservedRange_);
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
    if (!(obj instanceof com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig other = (com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig) obj;

    if (getEnablePrivateEndpoint()
        != other.getEnablePrivateEndpoint()) return false;
    if (!getMasterIpv4CidrBlock()
        .equals(other.getMasterIpv4CidrBlock())) return false;
    if (!getMasterIpv4ReservedRange()
        .equals(other.getMasterIpv4ReservedRange())) return false;
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
    hash = (37 * hash) + ENABLE_PRIVATE_ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnablePrivateEndpoint());
    hash = (37 * hash) + MASTER_IPV4_CIDR_BLOCK_FIELD_NUMBER;
    hash = (53 * hash) + getMasterIpv4CidrBlock().hashCode();
    hash = (37 * hash) + MASTER_IPV4_RESERVED_RANGE_FIELD_NUMBER;
    hash = (53 * hash) + getMasterIpv4ReservedRange().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig prototype) {
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
   * Configuration options for the private GKE cluster in a Cloud Composer
   * environment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig)
      com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_PrivateClusterConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_PrivateClusterConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig.class, com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig.Builder.class);
    }

    // Construct using com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig.newBuilder()
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
      enablePrivateEndpoint_ = false;
      masterIpv4CidrBlock_ = "";
      masterIpv4ReservedRange_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass.internal_static_google_cloud_orchestration_airflow_service_v1beta1_PrivateClusterConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig build() {
      com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig result = new com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enablePrivateEndpoint_ = enablePrivateEndpoint_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.masterIpv4CidrBlock_ = masterIpv4CidrBlock_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.masterIpv4ReservedRange_ = masterIpv4ReservedRange_;
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
      if (other instanceof com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig) {
        return mergeFrom((com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig other) {
      if (other == com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig.getDefaultInstance()) return this;
      if (other.getEnablePrivateEndpoint() != false) {
        setEnablePrivateEndpoint(other.getEnablePrivateEndpoint());
      }
      if (!other.getMasterIpv4CidrBlock().isEmpty()) {
        masterIpv4CidrBlock_ = other.masterIpv4CidrBlock_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMasterIpv4ReservedRange().isEmpty()) {
        masterIpv4ReservedRange_ = other.masterIpv4ReservedRange_;
        bitField0_ |= 0x00000004;
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
            case 8: {
              enablePrivateEndpoint_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              masterIpv4CidrBlock_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              masterIpv4ReservedRange_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private boolean enablePrivateEndpoint_ ;
    /**
     * <pre>
     * Optional. If `true`, access to the public endpoint of the GKE cluster is
     * denied.
     * </pre>
     *
     * <code>bool enable_private_endpoint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The enablePrivateEndpoint.
     */
    @java.lang.Override
    public boolean getEnablePrivateEndpoint() {
      return enablePrivateEndpoint_;
    }
    /**
     * <pre>
     * Optional. If `true`, access to the public endpoint of the GKE cluster is
     * denied.
     * </pre>
     *
     * <code>bool enable_private_endpoint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The enablePrivateEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEnablePrivateEndpoint(boolean value) {
      
      enablePrivateEndpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. If `true`, access to the public endpoint of the GKE cluster is
     * denied.
     * </pre>
     *
     * <code>bool enable_private_endpoint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnablePrivateEndpoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enablePrivateEndpoint_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object masterIpv4CidrBlock_ = "";
    /**
     * <pre>
     * Optional. The CIDR block from which IPv4 range for GKE master will be
     * reserved. If left blank, the default value of '172.16.0.0/23' is used.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The masterIpv4CidrBlock.
     */
    public java.lang.String getMasterIpv4CidrBlock() {
      java.lang.Object ref = masterIpv4CidrBlock_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        masterIpv4CidrBlock_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The CIDR block from which IPv4 range for GKE master will be
     * reserved. If left blank, the default value of '172.16.0.0/23' is used.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for masterIpv4CidrBlock.
     */
    public com.google.protobuf.ByteString
        getMasterIpv4CidrBlockBytes() {
      java.lang.Object ref = masterIpv4CidrBlock_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        masterIpv4CidrBlock_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The CIDR block from which IPv4 range for GKE master will be
     * reserved. If left blank, the default value of '172.16.0.0/23' is used.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The masterIpv4CidrBlock to set.
     * @return This builder for chaining.
     */
    public Builder setMasterIpv4CidrBlock(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      masterIpv4CidrBlock_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The CIDR block from which IPv4 range for GKE master will be
     * reserved. If left blank, the default value of '172.16.0.0/23' is used.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearMasterIpv4CidrBlock() {
      masterIpv4CidrBlock_ = getDefaultInstance().getMasterIpv4CidrBlock();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The CIDR block from which IPv4 range for GKE master will be
     * reserved. If left blank, the default value of '172.16.0.0/23' is used.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for masterIpv4CidrBlock to set.
     * @return This builder for chaining.
     */
    public Builder setMasterIpv4CidrBlockBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      masterIpv4CidrBlock_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object masterIpv4ReservedRange_ = "";
    /**
     * <pre>
     * Output only. The IP range in CIDR notation to use for the hosted master
     * network. This range is used for assigning internal IP addresses to the
     * cluster master or set of masters and to the internal load balancer virtual
     * IP. This range must not overlap with any other ranges in use within the
     * cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_reserved_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The masterIpv4ReservedRange.
     */
    public java.lang.String getMasterIpv4ReservedRange() {
      java.lang.Object ref = masterIpv4ReservedRange_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        masterIpv4ReservedRange_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The IP range in CIDR notation to use for the hosted master
     * network. This range is used for assigning internal IP addresses to the
     * cluster master or set of masters and to the internal load balancer virtual
     * IP. This range must not overlap with any other ranges in use within the
     * cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_reserved_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for masterIpv4ReservedRange.
     */
    public com.google.protobuf.ByteString
        getMasterIpv4ReservedRangeBytes() {
      java.lang.Object ref = masterIpv4ReservedRange_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        masterIpv4ReservedRange_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The IP range in CIDR notation to use for the hosted master
     * network. This range is used for assigning internal IP addresses to the
     * cluster master or set of masters and to the internal load balancer virtual
     * IP. This range must not overlap with any other ranges in use within the
     * cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_reserved_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The masterIpv4ReservedRange to set.
     * @return This builder for chaining.
     */
    public Builder setMasterIpv4ReservedRange(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      masterIpv4ReservedRange_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The IP range in CIDR notation to use for the hosted master
     * network. This range is used for assigning internal IP addresses to the
     * cluster master or set of masters and to the internal load balancer virtual
     * IP. This range must not overlap with any other ranges in use within the
     * cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_reserved_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearMasterIpv4ReservedRange() {
      masterIpv4ReservedRange_ = getDefaultInstance().getMasterIpv4ReservedRange();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The IP range in CIDR notation to use for the hosted master
     * network. This range is used for assigning internal IP addresses to the
     * cluster master or set of masters and to the internal load balancer virtual
     * IP. This range must not overlap with any other ranges in use within the
     * cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_reserved_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for masterIpv4ReservedRange to set.
     * @return This builder for chaining.
     */
    public Builder setMasterIpv4ReservedRangeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      masterIpv4ReservedRange_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig)
  private static final com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig();
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrivateClusterConfig>
      PARSER = new com.google.protobuf.AbstractParser<PrivateClusterConfig>() {
    @java.lang.Override
    public PrivateClusterConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<PrivateClusterConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrivateClusterConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

