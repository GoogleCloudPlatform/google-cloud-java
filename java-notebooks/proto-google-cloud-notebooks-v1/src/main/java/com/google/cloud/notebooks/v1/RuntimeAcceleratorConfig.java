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
// source: google/cloud/notebooks/v1/runtime.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Definition of the types of hardware accelerators that can be used.
 * Definition of the types of hardware accelerators that can be used.
 * See [Compute Engine
 * AcceleratorTypes](https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes).
 * Examples:
 *
 * * `nvidia-tesla-k80`
 * * `nvidia-tesla-p100`
 * * `nvidia-tesla-v100`
 * * `nvidia-tesla-p4`
 * * `nvidia-tesla-t4`
 * * `nvidia-tesla-a100`
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.RuntimeAcceleratorConfig}
 */
public final class RuntimeAcceleratorConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.RuntimeAcceleratorConfig)
    RuntimeAcceleratorConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RuntimeAcceleratorConfig.newBuilder() to construct.
  private RuntimeAcceleratorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RuntimeAcceleratorConfig() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RuntimeAcceleratorConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1.RuntimeProto
        .internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.RuntimeProto
        .internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.class,
            com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Type of this accelerator.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType}
   */
  public enum AcceleratorType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Accelerator type is not specified.
     * </pre>
     *
     * <code>ACCELERATOR_TYPE_UNSPECIFIED = 0;</code>
     */
    ACCELERATOR_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla K80.
     * </pre>
     *
     * <code>NVIDIA_TESLA_K80 = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    NVIDIA_TESLA_K80(1),
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla P100.
     * </pre>
     *
     * <code>NVIDIA_TESLA_P100 = 2;</code>
     */
    NVIDIA_TESLA_P100(2),
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla V100.
     * </pre>
     *
     * <code>NVIDIA_TESLA_V100 = 3;</code>
     */
    NVIDIA_TESLA_V100(3),
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla P4.
     * </pre>
     *
     * <code>NVIDIA_TESLA_P4 = 4;</code>
     */
    NVIDIA_TESLA_P4(4),
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla T4.
     * </pre>
     *
     * <code>NVIDIA_TESLA_T4 = 5;</code>
     */
    NVIDIA_TESLA_T4(5),
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla A100.
     * </pre>
     *
     * <code>NVIDIA_TESLA_A100 = 6;</code>
     */
    NVIDIA_TESLA_A100(6),
    /**
     *
     *
     * <pre>
     * (Coming soon) Accelerator type is TPU V2.
     * </pre>
     *
     * <code>TPU_V2 = 7;</code>
     */
    TPU_V2(7),
    /**
     *
     *
     * <pre>
     * (Coming soon) Accelerator type is TPU V3.
     * </pre>
     *
     * <code>TPU_V3 = 8;</code>
     */
    TPU_V3(8),
    /**
     *
     *
     * <pre>
     * Accelerator type is NVIDIA Tesla T4 Virtual Workstations.
     * </pre>
     *
     * <code>NVIDIA_TESLA_T4_VWS = 9;</code>
     */
    NVIDIA_TESLA_T4_VWS(9),
    /**
     *
     *
     * <pre>
     * Accelerator type is NVIDIA Tesla P100 Virtual Workstations.
     * </pre>
     *
     * <code>NVIDIA_TESLA_P100_VWS = 10;</code>
     */
    NVIDIA_TESLA_P100_VWS(10),
    /**
     *
     *
     * <pre>
     * Accelerator type is NVIDIA Tesla P4 Virtual Workstations.
     * </pre>
     *
     * <code>NVIDIA_TESLA_P4_VWS = 11;</code>
     */
    NVIDIA_TESLA_P4_VWS(11),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Accelerator type is not specified.
     * </pre>
     *
     * <code>ACCELERATOR_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int ACCELERATOR_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla K80.
     * </pre>
     *
     * <code>NVIDIA_TESLA_K80 = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated public static final int NVIDIA_TESLA_K80_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla P100.
     * </pre>
     *
     * <code>NVIDIA_TESLA_P100 = 2;</code>
     */
    public static final int NVIDIA_TESLA_P100_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla V100.
     * </pre>
     *
     * <code>NVIDIA_TESLA_V100 = 3;</code>
     */
    public static final int NVIDIA_TESLA_V100_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla P4.
     * </pre>
     *
     * <code>NVIDIA_TESLA_P4 = 4;</code>
     */
    public static final int NVIDIA_TESLA_P4_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla T4.
     * </pre>
     *
     * <code>NVIDIA_TESLA_T4 = 5;</code>
     */
    public static final int NVIDIA_TESLA_T4_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Accelerator type is Nvidia Tesla A100.
     * </pre>
     *
     * <code>NVIDIA_TESLA_A100 = 6;</code>
     */
    public static final int NVIDIA_TESLA_A100_VALUE = 6;
    /**
     *
     *
     * <pre>
     * (Coming soon) Accelerator type is TPU V2.
     * </pre>
     *
     * <code>TPU_V2 = 7;</code>
     */
    public static final int TPU_V2_VALUE = 7;
    /**
     *
     *
     * <pre>
     * (Coming soon) Accelerator type is TPU V3.
     * </pre>
     *
     * <code>TPU_V3 = 8;</code>
     */
    public static final int TPU_V3_VALUE = 8;
    /**
     *
     *
     * <pre>
     * Accelerator type is NVIDIA Tesla T4 Virtual Workstations.
     * </pre>
     *
     * <code>NVIDIA_TESLA_T4_VWS = 9;</code>
     */
    public static final int NVIDIA_TESLA_T4_VWS_VALUE = 9;
    /**
     *
     *
     * <pre>
     * Accelerator type is NVIDIA Tesla P100 Virtual Workstations.
     * </pre>
     *
     * <code>NVIDIA_TESLA_P100_VWS = 10;</code>
     */
    public static final int NVIDIA_TESLA_P100_VWS_VALUE = 10;
    /**
     *
     *
     * <pre>
     * Accelerator type is NVIDIA Tesla P4 Virtual Workstations.
     * </pre>
     *
     * <code>NVIDIA_TESLA_P4_VWS = 11;</code>
     */
    public static final int NVIDIA_TESLA_P4_VWS_VALUE = 11;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AcceleratorType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AcceleratorType forNumber(int value) {
      switch (value) {
        case 0:
          return ACCELERATOR_TYPE_UNSPECIFIED;
        case 1:
          return NVIDIA_TESLA_K80;
        case 2:
          return NVIDIA_TESLA_P100;
        case 3:
          return NVIDIA_TESLA_V100;
        case 4:
          return NVIDIA_TESLA_P4;
        case 5:
          return NVIDIA_TESLA_T4;
        case 6:
          return NVIDIA_TESLA_A100;
        case 7:
          return TPU_V2;
        case 8:
          return TPU_V3;
        case 9:
          return NVIDIA_TESLA_T4_VWS;
        case 10:
          return NVIDIA_TESLA_P100_VWS;
        case 11:
          return NVIDIA_TESLA_P4_VWS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AcceleratorType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AcceleratorType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AcceleratorType>() {
              public AcceleratorType findValueByNumber(int number) {
                return AcceleratorType.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final AcceleratorType[] VALUES = values();

    public static AcceleratorType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AcceleratorType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Accelerator model.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Accelerator model.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType getType() {
    com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType result =
        com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType.forNumber(type_);
    return result == null
        ? com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType.UNRECOGNIZED
        : result;
  }

  public static final int CORE_COUNT_FIELD_NUMBER = 2;
  private long coreCount_ = 0L;
  /**
   *
   *
   * <pre>
   * Count of cores of this accelerator.
   * </pre>
   *
   * <code>int64 core_count = 2;</code>
   *
   * @return The coreCount.
   */
  @java.lang.Override
  public long getCoreCount() {
    return coreCount_;
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
    if (type_
        != com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType
            .ACCELERATOR_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, type_);
    }
    if (coreCount_ != 0L) {
      output.writeInt64(2, coreCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType
            .ACCELERATOR_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    if (coreCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, coreCount_);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig other =
        (com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig) obj;

    if (type_ != other.type_) return false;
    if (getCoreCount() != other.getCoreCount()) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + CORE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCoreCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig prototype) {
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
   * Definition of the types of hardware accelerators that can be used.
   * Definition of the types of hardware accelerators that can be used.
   * See [Compute Engine
   * AcceleratorTypes](https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes).
   * Examples:
   *
   * * `nvidia-tesla-k80`
   * * `nvidia-tesla-p100`
   * * `nvidia-tesla-v100`
   * * `nvidia-tesla-p4`
   * * `nvidia-tesla-t4`
   * * `nvidia-tesla-a100`
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.RuntimeAcceleratorConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.RuntimeAcceleratorConfig)
      com.google.cloud.notebooks.v1.RuntimeAcceleratorConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.class,
              com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      coreCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig build() {
      com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig buildPartial() {
      com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig result =
          new com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.coreCount_ = coreCount_;
      }
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
      if (other instanceof com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig) {
        return mergeFrom((com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig other) {
      if (other == com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.getDefaultInstance())
        return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getCoreCount() != 0L) {
        setCoreCount(other.getCoreCount());
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
            case 8:
              {
                type_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                coreCount_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Accelerator model.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType type = 1;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Accelerator model.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType type = 1;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Accelerator model.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType type = 1;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType getType() {
      com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType result =
          com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType.forNumber(type_);
      return result == null
          ? com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Accelerator model.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Accelerator model.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private long coreCount_;
    /**
     *
     *
     * <pre>
     * Count of cores of this accelerator.
     * </pre>
     *
     * <code>int64 core_count = 2;</code>
     *
     * @return The coreCount.
     */
    @java.lang.Override
    public long getCoreCount() {
      return coreCount_;
    }
    /**
     *
     *
     * <pre>
     * Count of cores of this accelerator.
     * </pre>
     *
     * <code>int64 core_count = 2;</code>
     *
     * @param value The coreCount to set.
     * @return This builder for chaining.
     */
    public Builder setCoreCount(long value) {

      coreCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Count of cores of this accelerator.
     * </pre>
     *
     * <code>int64 core_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCoreCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      coreCount_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.RuntimeAcceleratorConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.RuntimeAcceleratorConfig)
  private static final com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig();
  }

  public static com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeAcceleratorConfig> PARSER =
      new com.google.protobuf.AbstractParser<RuntimeAcceleratorConfig>() {
        @java.lang.Override
        public RuntimeAcceleratorConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<RuntimeAcceleratorConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeAcceleratorConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
