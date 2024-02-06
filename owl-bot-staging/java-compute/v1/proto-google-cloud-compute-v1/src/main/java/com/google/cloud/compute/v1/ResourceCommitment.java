// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * Commitment for a particular resource (a Commitment is composed of one or more of these).
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ResourceCommitment}
 */
public final class ResourceCommitment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ResourceCommitment)
    ResourceCommitmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceCommitment.newBuilder() to construct.
  private ResourceCommitment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceCommitment() {
    acceleratorType_ = "";
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceCommitment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourceCommitment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourceCommitment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ResourceCommitment.class, com.google.cloud.compute.v1.ResourceCommitment.Builder.class);
  }

  /**
   * <pre>
   * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.ResourceCommitment.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_TYPE = 0;</code>
     */
    UNDEFINED_TYPE(0),
    /**
     * <code>ACCELERATOR = 429815371;</code>
     */
    ACCELERATOR(429815371),
    /**
     * <code>LOCAL_SSD = 508934896;</code>
     */
    LOCAL_SSD(508934896),
    /**
     * <code>MEMORY = 123056385;</code>
     */
    MEMORY(123056385),
    /**
     * <code>UNSPECIFIED = 526786327;</code>
     */
    UNSPECIFIED(526786327),
    /**
     * <code>VCPU = 2628978;</code>
     */
    VCPU(2628978),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_TYPE = 0;</code>
     */
    public static final int UNDEFINED_TYPE_VALUE = 0;
    /**
     * <code>ACCELERATOR = 429815371;</code>
     */
    public static final int ACCELERATOR_VALUE = 429815371;
    /**
     * <code>LOCAL_SSD = 508934896;</code>
     */
    public static final int LOCAL_SSD_VALUE = 508934896;
    /**
     * <code>MEMORY = 123056385;</code>
     */
    public static final int MEMORY_VALUE = 123056385;
    /**
     * <code>UNSPECIFIED = 526786327;</code>
     */
    public static final int UNSPECIFIED_VALUE = 526786327;
    /**
     * <code>VCPU = 2628978;</code>
     */
    public static final int VCPU_VALUE = 2628978;


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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_TYPE;
        case 429815371: return ACCELERATOR;
        case 508934896: return LOCAL_SSD;
        case 123056385: return MEMORY;
        case 526786327: return UNSPECIFIED;
        case 2628978: return VCPU;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.ResourceCommitment.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.ResourceCommitment.Type)
  }

  private int bitField0_;
  public static final int ACCELERATOR_TYPE_FIELD_NUMBER = 138031246;
  @SuppressWarnings("serial")
  private volatile java.lang.Object acceleratorType_ = "";
  /**
   * <pre>
   * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   * @return Whether the acceleratorType field is set.
   */
  @java.lang.Override
  public boolean hasAcceleratorType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   * @return The acceleratorType.
   */
  @java.lang.Override
  public java.lang.String getAcceleratorType() {
    java.lang.Object ref = acceleratorType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acceleratorType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   * @return The bytes for acceleratorType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcceleratorTypeBytes() {
    java.lang.Object ref = acceleratorType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      acceleratorType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 196759640;
  private long amount_ = 0L;
  /**
   * <pre>
   * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
   * </pre>
   *
   * <code>optional int64 amount = 196759640;</code>
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
   * </pre>
   *
   * <code>optional int64 amount = 196759640;</code>
   * @return The amount.
   */
  @java.lang.Override
  public long getAmount() {
    return amount_;
  }

  public static final int TYPE_FIELD_NUMBER = 3575610;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <pre>
   * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override
  public boolean hasType() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3575610, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 138031246, acceleratorType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(196759640, amount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3575610, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(138031246, acceleratorType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(196759640, amount_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ResourceCommitment)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ResourceCommitment other = (com.google.cloud.compute.v1.ResourceCommitment) obj;

    if (hasAcceleratorType() != other.hasAcceleratorType()) return false;
    if (hasAcceleratorType()) {
      if (!getAcceleratorType()
          .equals(other.getAcceleratorType())) return false;
    }
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (getAmount()
          != other.getAmount()) return false;
    }
    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (!getType()
          .equals(other.getType())) return false;
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
    if (hasAcceleratorType()) {
      hash = (37 * hash) + ACCELERATOR_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAcceleratorType().hashCode();
    }
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAmount());
    }
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourceCommitment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ResourceCommitment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourceCommitment parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ResourceCommitment prototype) {
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
   * Commitment for a particular resource (a Commitment is composed of one or more of these).
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ResourceCommitment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ResourceCommitment)
      com.google.cloud.compute.v1.ResourceCommitmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourceCommitment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourceCommitment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ResourceCommitment.class, com.google.cloud.compute.v1.ResourceCommitment.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ResourceCommitment.newBuilder()
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
      acceleratorType_ = "";
      amount_ = 0L;
      type_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourceCommitment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourceCommitment getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ResourceCommitment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourceCommitment build() {
      com.google.cloud.compute.v1.ResourceCommitment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourceCommitment buildPartial() {
      com.google.cloud.compute.v1.ResourceCommitment result = new com.google.cloud.compute.v1.ResourceCommitment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ResourceCommitment result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.acceleratorType_ = acceleratorType_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amount_ = amount_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.ResourceCommitment) {
        return mergeFrom((com.google.cloud.compute.v1.ResourceCommitment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ResourceCommitment other) {
      if (other == com.google.cloud.compute.v1.ResourceCommitment.getDefaultInstance()) return this;
      if (other.hasAcceleratorType()) {
        acceleratorType_ = other.acceleratorType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAmount()) {
        setAmount(other.getAmount());
      }
      if (other.hasType()) {
        type_ = other.type_;
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
            case 28604882: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 28604882
            case 1104249970: {
              acceleratorType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 1104249970
            case 1574077120: {
              amount_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 1574077120
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

    private java.lang.Object acceleratorType_ = "";
    /**
     * <pre>
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     * @return Whether the acceleratorType field is set.
     */
    public boolean hasAcceleratorType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     * @return The acceleratorType.
     */
    public java.lang.String getAcceleratorType() {
      java.lang.Object ref = acceleratorType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acceleratorType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     * @return The bytes for acceleratorType.
     */
    public com.google.protobuf.ByteString
        getAcceleratorTypeBytes() {
      java.lang.Object ref = acceleratorType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acceleratorType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     * @param value The acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      acceleratorType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorType() {
      acceleratorType_ = getDefaultInstance().getAcceleratorType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     * @param value The bytes for acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      acceleratorType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long amount_ ;
    /**
     * <pre>
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * </pre>
     *
     * <code>optional int64 amount = 196759640;</code>
     * @return Whether the amount field is set.
     */
    @java.lang.Override
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * </pre>
     *
     * <code>optional int64 amount = 196759640;</code>
     * @return The amount.
     */
    @java.lang.Override
    public long getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * </pre>
     *
     * <code>optional int64 amount = 196759640;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(long value) {

      amount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * </pre>
     *
     * <code>optional int64 amount = 196759640;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      amount_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
     * Check the Type enum for the list of possible values.
     * </pre>
     *
     * <code>optional string type = 3575610;</code>
     * @return Whether the type field is set.
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
     * Check the Type enum for the list of possible values.
     * </pre>
     *
     * <code>optional string type = 3575610;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
     * Check the Type enum for the list of possible values.
     * </pre>
     *
     * <code>optional string type = 3575610;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
     * Check the Type enum for the list of possible values.
     * </pre>
     *
     * <code>optional string type = 3575610;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
     * Check the Type enum for the list of possible values.
     * </pre>
     *
     * <code>optional string type = 3575610;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of resource for which this commitment applies. Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
     * Check the Type enum for the list of possible values.
     * </pre>
     *
     * <code>optional string type = 3575610;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ResourceCommitment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ResourceCommitment)
  private static final com.google.cloud.compute.v1.ResourceCommitment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ResourceCommitment();
  }

  public static com.google.cloud.compute.v1.ResourceCommitment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceCommitment>
      PARSER = new com.google.protobuf.AbstractParser<ResourceCommitment>() {
    @java.lang.Override
    public ResourceCommitment parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceCommitment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceCommitment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ResourceCommitment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

