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

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceConsumptionInfo}
 */
public final class InstanceConsumptionInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceConsumptionInfo)
    InstanceConsumptionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceConsumptionInfo.newBuilder() to construct.
  private InstanceConsumptionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceConsumptionInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceConsumptionInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceConsumptionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceConsumptionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceConsumptionInfo.class,
            com.google.cloud.compute.v1.InstanceConsumptionInfo.Builder.class);
  }

  private int bitField0_;
  public static final int GUEST_CPUS_FIELD_NUMBER = 393356754;
  private int guestCpus_ = 0;
  /**
   *
   *
   * <pre>
   * The number of virtual CPUs that are available to the instance.
   * </pre>
   *
   * <code>optional int32 guest_cpus = 393356754;</code>
   *
   * @return Whether the guestCpus field is set.
   */
  @java.lang.Override
  public boolean hasGuestCpus() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The number of virtual CPUs that are available to the instance.
   * </pre>
   *
   * <code>optional int32 guest_cpus = 393356754;</code>
   *
   * @return The guestCpus.
   */
  @java.lang.Override
  public int getGuestCpus() {
    return guestCpus_;
  }

  public static final int LOCAL_SSD_GB_FIELD_NUMBER = 329237578;
  private int localSsdGb_ = 0;
  /**
   *
   *
   * <pre>
   * The amount of local SSD storage available to the instance, defined in GiB.
   * </pre>
   *
   * <code>optional int32 local_ssd_gb = 329237578;</code>
   *
   * @return Whether the localSsdGb field is set.
   */
  @java.lang.Override
  public boolean hasLocalSsdGb() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The amount of local SSD storage available to the instance, defined in GiB.
   * </pre>
   *
   * <code>optional int32 local_ssd_gb = 329237578;</code>
   *
   * @return The localSsdGb.
   */
  @java.lang.Override
  public int getLocalSsdGb() {
    return localSsdGb_;
  }

  public static final int MEMORY_MB_FIELD_NUMBER = 116001171;
  private int memoryMb_ = 0;
  /**
   *
   *
   * <pre>
   * The amount of physical memory available to the instance, defined in MiB.
   * </pre>
   *
   * <code>optional int32 memory_mb = 116001171;</code>
   *
   * @return Whether the memoryMb field is set.
   */
  @java.lang.Override
  public boolean hasMemoryMb() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * The amount of physical memory available to the instance, defined in MiB.
   * </pre>
   *
   * <code>optional int32 memory_mb = 116001171;</code>
   *
   * @return The memoryMb.
   */
  @java.lang.Override
  public int getMemoryMb() {
    return memoryMb_;
  }

  public static final int MIN_NODE_CPUS_FIELD_NUMBER = 317231675;
  private int minNodeCpus_ = 0;
  /**
   *
   *
   * <pre>
   * The minimal guaranteed number of virtual CPUs that are reserved.
   * </pre>
   *
   * <code>optional int32 min_node_cpus = 317231675;</code>
   *
   * @return Whether the minNodeCpus field is set.
   */
  @java.lang.Override
  public boolean hasMinNodeCpus() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   *
   *
   * <pre>
   * The minimal guaranteed number of virtual CPUs that are reserved.
   * </pre>
   *
   * <code>optional int32 min_node_cpus = 317231675;</code>
   *
   * @return The minNodeCpus.
   */
  @java.lang.Override
  public int getMinNodeCpus() {
    return minNodeCpus_;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(116001171, memoryMb_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(317231675, minNodeCpus_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(329237578, localSsdGb_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(393356754, guestCpus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(116001171, memoryMb_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(317231675, minNodeCpus_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(329237578, localSsdGb_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(393356754, guestCpus_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceConsumptionInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceConsumptionInfo other =
        (com.google.cloud.compute.v1.InstanceConsumptionInfo) obj;

    if (hasGuestCpus() != other.hasGuestCpus()) return false;
    if (hasGuestCpus()) {
      if (getGuestCpus() != other.getGuestCpus()) return false;
    }
    if (hasLocalSsdGb() != other.hasLocalSsdGb()) return false;
    if (hasLocalSsdGb()) {
      if (getLocalSsdGb() != other.getLocalSsdGb()) return false;
    }
    if (hasMemoryMb() != other.hasMemoryMb()) return false;
    if (hasMemoryMb()) {
      if (getMemoryMb() != other.getMemoryMb()) return false;
    }
    if (hasMinNodeCpus() != other.hasMinNodeCpus()) return false;
    if (hasMinNodeCpus()) {
      if (getMinNodeCpus() != other.getMinNodeCpus()) return false;
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
    if (hasGuestCpus()) {
      hash = (37 * hash) + GUEST_CPUS_FIELD_NUMBER;
      hash = (53 * hash) + getGuestCpus();
    }
    if (hasLocalSsdGb()) {
      hash = (37 * hash) + LOCAL_SSD_GB_FIELD_NUMBER;
      hash = (53 * hash) + getLocalSsdGb();
    }
    if (hasMemoryMb()) {
      hash = (37 * hash) + MEMORY_MB_FIELD_NUMBER;
      hash = (53 * hash) + getMemoryMb();
    }
    if (hasMinNodeCpus()) {
      hash = (37 * hash) + MIN_NODE_CPUS_FIELD_NUMBER;
      hash = (53 * hash) + getMinNodeCpus();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.InstanceConsumptionInfo prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstanceConsumptionInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceConsumptionInfo)
      com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceConsumptionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceConsumptionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceConsumptionInfo.class,
              com.google.cloud.compute.v1.InstanceConsumptionInfo.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstanceConsumptionInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      guestCpus_ = 0;
      localSsdGb_ = 0;
      memoryMb_ = 0;
      minNodeCpus_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceConsumptionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceConsumptionInfo getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceConsumptionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceConsumptionInfo build() {
      com.google.cloud.compute.v1.InstanceConsumptionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceConsumptionInfo buildPartial() {
      com.google.cloud.compute.v1.InstanceConsumptionInfo result =
          new com.google.cloud.compute.v1.InstanceConsumptionInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.InstanceConsumptionInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.guestCpus_ = guestCpus_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.localSsdGb_ = localSsdGb_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.memoryMb_ = memoryMb_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.minNodeCpus_ = minNodeCpus_;
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
      if (other instanceof com.google.cloud.compute.v1.InstanceConsumptionInfo) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceConsumptionInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstanceConsumptionInfo other) {
      if (other == com.google.cloud.compute.v1.InstanceConsumptionInfo.getDefaultInstance())
        return this;
      if (other.hasGuestCpus()) {
        setGuestCpus(other.getGuestCpus());
      }
      if (other.hasLocalSsdGb()) {
        setLocalSsdGb(other.getLocalSsdGb());
      }
      if (other.hasMemoryMb()) {
        setMemoryMb(other.getMemoryMb());
      }
      if (other.hasMinNodeCpus()) {
        setMinNodeCpus(other.getMinNodeCpus());
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
            case 928009368:
              {
                memoryMb_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 928009368
            case -1757113896:
              {
                minNodeCpus_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case -1757113896
            case -1661066672:
              {
                localSsdGb_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case -1661066672
            case -1148113264:
              {
                guestCpus_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case -1148113264
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

    private int guestCpus_;
    /**
     *
     *
     * <pre>
     * The number of virtual CPUs that are available to the instance.
     * </pre>
     *
     * <code>optional int32 guest_cpus = 393356754;</code>
     *
     * @return Whether the guestCpus field is set.
     */
    @java.lang.Override
    public boolean hasGuestCpus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The number of virtual CPUs that are available to the instance.
     * </pre>
     *
     * <code>optional int32 guest_cpus = 393356754;</code>
     *
     * @return The guestCpus.
     */
    @java.lang.Override
    public int getGuestCpus() {
      return guestCpus_;
    }
    /**
     *
     *
     * <pre>
     * The number of virtual CPUs that are available to the instance.
     * </pre>
     *
     * <code>optional int32 guest_cpus = 393356754;</code>
     *
     * @param value The guestCpus to set.
     * @return This builder for chaining.
     */
    public Builder setGuestCpus(int value) {

      guestCpus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of virtual CPUs that are available to the instance.
     * </pre>
     *
     * <code>optional int32 guest_cpus = 393356754;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGuestCpus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      guestCpus_ = 0;
      onChanged();
      return this;
    }

    private int localSsdGb_;
    /**
     *
     *
     * <pre>
     * The amount of local SSD storage available to the instance, defined in GiB.
     * </pre>
     *
     * <code>optional int32 local_ssd_gb = 329237578;</code>
     *
     * @return Whether the localSsdGb field is set.
     */
    @java.lang.Override
    public boolean hasLocalSsdGb() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The amount of local SSD storage available to the instance, defined in GiB.
     * </pre>
     *
     * <code>optional int32 local_ssd_gb = 329237578;</code>
     *
     * @return The localSsdGb.
     */
    @java.lang.Override
    public int getLocalSsdGb() {
      return localSsdGb_;
    }
    /**
     *
     *
     * <pre>
     * The amount of local SSD storage available to the instance, defined in GiB.
     * </pre>
     *
     * <code>optional int32 local_ssd_gb = 329237578;</code>
     *
     * @param value The localSsdGb to set.
     * @return This builder for chaining.
     */
    public Builder setLocalSsdGb(int value) {

      localSsdGb_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The amount of local SSD storage available to the instance, defined in GiB.
     * </pre>
     *
     * <code>optional int32 local_ssd_gb = 329237578;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocalSsdGb() {
      bitField0_ = (bitField0_ & ~0x00000002);
      localSsdGb_ = 0;
      onChanged();
      return this;
    }

    private int memoryMb_;
    /**
     *
     *
     * <pre>
     * The amount of physical memory available to the instance, defined in MiB.
     * </pre>
     *
     * <code>optional int32 memory_mb = 116001171;</code>
     *
     * @return Whether the memoryMb field is set.
     */
    @java.lang.Override
    public boolean hasMemoryMb() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The amount of physical memory available to the instance, defined in MiB.
     * </pre>
     *
     * <code>optional int32 memory_mb = 116001171;</code>
     *
     * @return The memoryMb.
     */
    @java.lang.Override
    public int getMemoryMb() {
      return memoryMb_;
    }
    /**
     *
     *
     * <pre>
     * The amount of physical memory available to the instance, defined in MiB.
     * </pre>
     *
     * <code>optional int32 memory_mb = 116001171;</code>
     *
     * @param value The memoryMb to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryMb(int value) {

      memoryMb_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The amount of physical memory available to the instance, defined in MiB.
     * </pre>
     *
     * <code>optional int32 memory_mb = 116001171;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMemoryMb() {
      bitField0_ = (bitField0_ & ~0x00000004);
      memoryMb_ = 0;
      onChanged();
      return this;
    }

    private int minNodeCpus_;
    /**
     *
     *
     * <pre>
     * The minimal guaranteed number of virtual CPUs that are reserved.
     * </pre>
     *
     * <code>optional int32 min_node_cpus = 317231675;</code>
     *
     * @return Whether the minNodeCpus field is set.
     */
    @java.lang.Override
    public boolean hasMinNodeCpus() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * The minimal guaranteed number of virtual CPUs that are reserved.
     * </pre>
     *
     * <code>optional int32 min_node_cpus = 317231675;</code>
     *
     * @return The minNodeCpus.
     */
    @java.lang.Override
    public int getMinNodeCpus() {
      return minNodeCpus_;
    }
    /**
     *
     *
     * <pre>
     * The minimal guaranteed number of virtual CPUs that are reserved.
     * </pre>
     *
     * <code>optional int32 min_node_cpus = 317231675;</code>
     *
     * @param value The minNodeCpus to set.
     * @return This builder for chaining.
     */
    public Builder setMinNodeCpus(int value) {

      minNodeCpus_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The minimal guaranteed number of virtual CPUs that are reserved.
     * </pre>
     *
     * <code>optional int32 min_node_cpus = 317231675;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinNodeCpus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      minNodeCpus_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceConsumptionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceConsumptionInfo)
  private static final com.google.cloud.compute.v1.InstanceConsumptionInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceConsumptionInfo();
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceConsumptionInfo> PARSER =
      new com.google.protobuf.AbstractParser<InstanceConsumptionInfo>() {
        @java.lang.Override
        public InstanceConsumptionInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceConsumptionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceConsumptionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceConsumptionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
