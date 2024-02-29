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
 * Protobuf type {@code google.cloud.compute.v1.InstanceConsumptionData}
 */
public final class InstanceConsumptionData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceConsumptionData)
    InstanceConsumptionDataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceConsumptionData.newBuilder() to construct.
  private InstanceConsumptionData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceConsumptionData() {
    instance_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceConsumptionData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceConsumptionData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceConsumptionData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceConsumptionData.class,
            com.google.cloud.compute.v1.InstanceConsumptionData.Builder.class);
  }

  private int bitField0_;
  public static final int CONSUMPTION_INFO_FIELD_NUMBER = 146354898;
  private com.google.cloud.compute.v1.InstanceConsumptionInfo consumptionInfo_;
  /**
   *
   *
   * <pre>
   * Resources consumed by the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
   * </code>
   *
   * @return Whether the consumptionInfo field is set.
   */
  @java.lang.Override
  public boolean hasConsumptionInfo() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Resources consumed by the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
   * </code>
   *
   * @return The consumptionInfo.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceConsumptionInfo getConsumptionInfo() {
    return consumptionInfo_ == null
        ? com.google.cloud.compute.v1.InstanceConsumptionInfo.getDefaultInstance()
        : consumptionInfo_;
  }
  /**
   *
   *
   * <pre>
   * Resources consumed by the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder
      getConsumptionInfoOrBuilder() {
    return consumptionInfo_ == null
        ? com.google.cloud.compute.v1.InstanceConsumptionInfo.getDefaultInstance()
        : consumptionInfo_;
  }

  public static final int INSTANCE_FIELD_NUMBER = 18257045;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instance_ = "";
  /**
   *
   *
   * <pre>
   * Server-defined URL for the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return Whether the instance field is set.
   */
  @java.lang.Override
  public boolean hasInstance() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Server-defined URL for the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return The instance.
   */
  @java.lang.Override
  public java.lang.String getInstance() {
    java.lang.Object ref = instance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instance_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Server-defined URL for the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return The bytes for instance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceBytes() {
    java.lang.Object ref = instance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instance_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 18257045, instance_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(146354898, getConsumptionInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(18257045, instance_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(146354898, getConsumptionInfo());
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceConsumptionData)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceConsumptionData other =
        (com.google.cloud.compute.v1.InstanceConsumptionData) obj;

    if (hasConsumptionInfo() != other.hasConsumptionInfo()) return false;
    if (hasConsumptionInfo()) {
      if (!getConsumptionInfo().equals(other.getConsumptionInfo())) return false;
    }
    if (hasInstance() != other.hasInstance()) return false;
    if (hasInstance()) {
      if (!getInstance().equals(other.getInstance())) return false;
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
    if (hasConsumptionInfo()) {
      hash = (37 * hash) + CONSUMPTION_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getConsumptionInfo().hashCode();
    }
    if (hasInstance()) {
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.InstanceConsumptionData prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.InstanceConsumptionData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceConsumptionData)
      com.google.cloud.compute.v1.InstanceConsumptionDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceConsumptionData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceConsumptionData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceConsumptionData.class,
              com.google.cloud.compute.v1.InstanceConsumptionData.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstanceConsumptionData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getConsumptionInfoFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      consumptionInfo_ = null;
      if (consumptionInfoBuilder_ != null) {
        consumptionInfoBuilder_.dispose();
        consumptionInfoBuilder_ = null;
      }
      instance_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceConsumptionData_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceConsumptionData getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceConsumptionData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceConsumptionData build() {
      com.google.cloud.compute.v1.InstanceConsumptionData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceConsumptionData buildPartial() {
      com.google.cloud.compute.v1.InstanceConsumptionData result =
          new com.google.cloud.compute.v1.InstanceConsumptionData(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.InstanceConsumptionData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.consumptionInfo_ =
            consumptionInfoBuilder_ == null ? consumptionInfo_ : consumptionInfoBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.instance_ = instance_;
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
      if (other instanceof com.google.cloud.compute.v1.InstanceConsumptionData) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceConsumptionData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstanceConsumptionData other) {
      if (other == com.google.cloud.compute.v1.InstanceConsumptionData.getDefaultInstance())
        return this;
      if (other.hasConsumptionInfo()) {
        mergeConsumptionInfo(other.getConsumptionInfo());
      }
      if (other.hasInstance()) {
        instance_ = other.instance_;
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
            case 146056362:
              {
                instance_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 146056362
            case 1170839186:
              {
                input.readMessage(getConsumptionInfoFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 1170839186
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

    private com.google.cloud.compute.v1.InstanceConsumptionInfo consumptionInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.InstanceConsumptionInfo,
            com.google.cloud.compute.v1.InstanceConsumptionInfo.Builder,
            com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder>
        consumptionInfoBuilder_;
    /**
     *
     *
     * <pre>
     * Resources consumed by the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
     * </code>
     *
     * @return Whether the consumptionInfo field is set.
     */
    public boolean hasConsumptionInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Resources consumed by the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
     * </code>
     *
     * @return The consumptionInfo.
     */
    public com.google.cloud.compute.v1.InstanceConsumptionInfo getConsumptionInfo() {
      if (consumptionInfoBuilder_ == null) {
        return consumptionInfo_ == null
            ? com.google.cloud.compute.v1.InstanceConsumptionInfo.getDefaultInstance()
            : consumptionInfo_;
      } else {
        return consumptionInfoBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Resources consumed by the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
     * </code>
     */
    public Builder setConsumptionInfo(com.google.cloud.compute.v1.InstanceConsumptionInfo value) {
      if (consumptionInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        consumptionInfo_ = value;
      } else {
        consumptionInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resources consumed by the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
     * </code>
     */
    public Builder setConsumptionInfo(
        com.google.cloud.compute.v1.InstanceConsumptionInfo.Builder builderForValue) {
      if (consumptionInfoBuilder_ == null) {
        consumptionInfo_ = builderForValue.build();
      } else {
        consumptionInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resources consumed by the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
     * </code>
     */
    public Builder mergeConsumptionInfo(com.google.cloud.compute.v1.InstanceConsumptionInfo value) {
      if (consumptionInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && consumptionInfo_ != null
            && consumptionInfo_
                != com.google.cloud.compute.v1.InstanceConsumptionInfo.getDefaultInstance()) {
          getConsumptionInfoBuilder().mergeFrom(value);
        } else {
          consumptionInfo_ = value;
        }
      } else {
        consumptionInfoBuilder_.mergeFrom(value);
      }
      if (consumptionInfo_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resources consumed by the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
     * </code>
     */
    public Builder clearConsumptionInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      consumptionInfo_ = null;
      if (consumptionInfoBuilder_ != null) {
        consumptionInfoBuilder_.dispose();
        consumptionInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resources consumed by the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
     * </code>
     */
    public com.google.cloud.compute.v1.InstanceConsumptionInfo.Builder getConsumptionInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConsumptionInfoFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Resources consumed by the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
     * </code>
     */
    public com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder
        getConsumptionInfoOrBuilder() {
      if (consumptionInfoBuilder_ != null) {
        return consumptionInfoBuilder_.getMessageOrBuilder();
      } else {
        return consumptionInfo_ == null
            ? com.google.cloud.compute.v1.InstanceConsumptionInfo.getDefaultInstance()
            : consumptionInfo_;
      }
    }
    /**
     *
     *
     * <pre>
     * Resources consumed by the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.InstanceConsumptionInfo,
            com.google.cloud.compute.v1.InstanceConsumptionInfo.Builder,
            com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder>
        getConsumptionInfoFieldBuilder() {
      if (consumptionInfoBuilder_ == null) {
        consumptionInfoBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.InstanceConsumptionInfo,
                com.google.cloud.compute.v1.InstanceConsumptionInfo.Builder,
                com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder>(
                getConsumptionInfo(), getParentForChildren(), isClean());
        consumptionInfo_ = null;
      }
      return consumptionInfoBuilder_;
    }

    private java.lang.Object instance_ = "";
    /**
     *
     *
     * <pre>
     * Server-defined URL for the instance.
     * </pre>
     *
     * <code>optional string instance = 18257045;</code>
     *
     * @return Whether the instance field is set.
     */
    public boolean hasInstance() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Server-defined URL for the instance.
     * </pre>
     *
     * <code>optional string instance = 18257045;</code>
     *
     * @return The instance.
     */
    public java.lang.String getInstance() {
      java.lang.Object ref = instance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Server-defined URL for the instance.
     * </pre>
     *
     * <code>optional string instance = 18257045;</code>
     *
     * @return The bytes for instance.
     */
    public com.google.protobuf.ByteString getInstanceBytes() {
      java.lang.Object ref = instance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Server-defined URL for the instance.
     * </pre>
     *
     * <code>optional string instance = 18257045;</code>
     *
     * @param value The instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstance(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instance_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Server-defined URL for the instance.
     * </pre>
     *
     * <code>optional string instance = 18257045;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstance() {
      instance_ = getDefaultInstance().getInstance();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Server-defined URL for the instance.
     * </pre>
     *
     * <code>optional string instance = 18257045;</code>
     *
     * @param value The bytes for instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instance_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceConsumptionData)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceConsumptionData)
  private static final com.google.cloud.compute.v1.InstanceConsumptionData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceConsumptionData();
  }

  public static com.google.cloud.compute.v1.InstanceConsumptionData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceConsumptionData> PARSER =
      new com.google.protobuf.AbstractParser<InstanceConsumptionData>() {
        @java.lang.Override
        public InstanceConsumptionData parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceConsumptionData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceConsumptionData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceConsumptionData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
