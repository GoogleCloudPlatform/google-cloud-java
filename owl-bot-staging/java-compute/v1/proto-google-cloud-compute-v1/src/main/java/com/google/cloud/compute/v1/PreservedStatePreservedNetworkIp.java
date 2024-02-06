// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.PreservedStatePreservedNetworkIp}
 */
public final class PreservedStatePreservedNetworkIp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.PreservedStatePreservedNetworkIp)
    PreservedStatePreservedNetworkIpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PreservedStatePreservedNetworkIp.newBuilder() to construct.
  private PreservedStatePreservedNetworkIp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PreservedStatePreservedNetworkIp() {
    autoDelete_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PreservedStatePreservedNetworkIp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreservedStatePreservedNetworkIp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreservedStatePreservedNetworkIp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp.class, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp.Builder.class);
  }

  /**
   * <pre>
   * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.PreservedStatePreservedNetworkIp.AutoDelete}
   */
  public enum AutoDelete
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_AUTO_DELETE = 0;</code>
     */
    UNDEFINED_AUTO_DELETE(0),
    /**
     * <code>NEVER = 74175084;</code>
     */
    NEVER(74175084),
    /**
     * <code>ON_PERMANENT_INSTANCE_DELETION = 95727719;</code>
     */
    ON_PERMANENT_INSTANCE_DELETION(95727719),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_AUTO_DELETE = 0;</code>
     */
    public static final int UNDEFINED_AUTO_DELETE_VALUE = 0;
    /**
     * <code>NEVER = 74175084;</code>
     */
    public static final int NEVER_VALUE = 74175084;
    /**
     * <code>ON_PERMANENT_INSTANCE_DELETION = 95727719;</code>
     */
    public static final int ON_PERMANENT_INSTANCE_DELETION_VALUE = 95727719;


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
    public static AutoDelete valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AutoDelete forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_AUTO_DELETE;
        case 74175084: return NEVER;
        case 95727719: return ON_PERMANENT_INSTANCE_DELETION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AutoDelete>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AutoDelete> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AutoDelete>() {
            public AutoDelete findValueByNumber(int number) {
              return AutoDelete.forNumber(number);
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
      return com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp.getDescriptor().getEnumTypes().get(0);
    }

    private static final AutoDelete[] VALUES = values();

    public static AutoDelete valueOf(
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

    private AutoDelete(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.PreservedStatePreservedNetworkIp.AutoDelete)
  }

  private int bitField0_;
  public static final int AUTO_DELETE_FIELD_NUMBER = 464761403;
  @SuppressWarnings("serial")
  private volatile java.lang.Object autoDelete_ = "";
  /**
   * <pre>
   * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
   * Check the AutoDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string auto_delete = 464761403;</code>
   * @return Whether the autoDelete field is set.
   */
  @java.lang.Override
  public boolean hasAutoDelete() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
   * Check the AutoDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string auto_delete = 464761403;</code>
   * @return The autoDelete.
   */
  @java.lang.Override
  public java.lang.String getAutoDelete() {
    java.lang.Object ref = autoDelete_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      autoDelete_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
   * Check the AutoDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string auto_delete = 464761403;</code>
   * @return The bytes for autoDelete.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAutoDeleteBytes() {
    java.lang.Object ref = autoDelete_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      autoDelete_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IP_ADDRESS_FIELD_NUMBER = 406272220;
  private com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ipAddress_;
  /**
   * <pre>
   * Ip address representation
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
   * @return Whether the ipAddress field is set.
   */
  @java.lang.Override
  public boolean hasIpAddress() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Ip address representation
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
   * @return The ipAddress.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress getIpAddress() {
    return ipAddress_ == null ? com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.getDefaultInstance() : ipAddress_;
  }
  /**
   * <pre>
   * Ip address representation
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddressOrBuilder getIpAddressOrBuilder() {
    return ipAddress_ == null ? com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.getDefaultInstance() : ipAddress_;
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
      output.writeMessage(406272220, getIpAddress());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 464761403, autoDelete_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(406272220, getIpAddress());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(464761403, autoDelete_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp other = (com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp) obj;

    if (hasAutoDelete() != other.hasAutoDelete()) return false;
    if (hasAutoDelete()) {
      if (!getAutoDelete()
          .equals(other.getAutoDelete())) return false;
    }
    if (hasIpAddress() != other.hasIpAddress()) return false;
    if (hasIpAddress()) {
      if (!getIpAddress()
          .equals(other.getIpAddress())) return false;
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
    if (hasAutoDelete()) {
      hash = (37 * hash) + AUTO_DELETE_FIELD_NUMBER;
      hash = (53 * hash) + getAutoDelete().hashCode();
    }
    if (hasIpAddress()) {
      hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getIpAddress().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.PreservedStatePreservedNetworkIp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.PreservedStatePreservedNetworkIp)
      com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreservedStatePreservedNetworkIp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreservedStatePreservedNetworkIp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp.class, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getIpAddressFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      autoDelete_ = "";
      ipAddress_ = null;
      if (ipAddressBuilder_ != null) {
        ipAddressBuilder_.dispose();
        ipAddressBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreservedStatePreservedNetworkIp_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp build() {
      com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp buildPartial() {
      com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp result = new com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.autoDelete_ = autoDelete_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ipAddress_ = ipAddressBuilder_ == null
            ? ipAddress_
            : ipAddressBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp) {
        return mergeFrom((com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp other) {
      if (other == com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp.getDefaultInstance()) return this;
      if (other.hasAutoDelete()) {
        autoDelete_ = other.autoDelete_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasIpAddress()) {
        mergeIpAddress(other.getIpAddress());
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
            case -1044789534: {
              input.readMessage(
                  getIpAddressFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case -1044789534
            case -576876070: {
              autoDelete_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -576876070
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

    private java.lang.Object autoDelete_ = "";
    /**
     * <pre>
     * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @return Whether the autoDelete field is set.
     */
    public boolean hasAutoDelete() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @return The autoDelete.
     */
    public java.lang.String getAutoDelete() {
      java.lang.Object ref = autoDelete_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        autoDelete_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @return The bytes for autoDelete.
     */
    public com.google.protobuf.ByteString
        getAutoDeleteBytes() {
      java.lang.Object ref = autoDelete_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        autoDelete_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @param value The autoDelete to set.
     * @return This builder for chaining.
     */
    public Builder setAutoDelete(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      autoDelete_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoDelete() {
      autoDelete_ = getDefaultInstance().getAutoDelete();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
     * Check the AutoDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string auto_delete = 464761403;</code>
     * @param value The bytes for autoDelete to set.
     * @return This builder for chaining.
     */
    public Builder setAutoDeleteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      autoDelete_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ipAddress_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.Builder, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddressOrBuilder> ipAddressBuilder_;
    /**
     * <pre>
     * Ip address representation
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
     * @return Whether the ipAddress field is set.
     */
    public boolean hasIpAddress() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Ip address representation
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
     * @return The ipAddress.
     */
    public com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress getIpAddress() {
      if (ipAddressBuilder_ == null) {
        return ipAddress_ == null ? com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.getDefaultInstance() : ipAddress_;
      } else {
        return ipAddressBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Ip address representation
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
     */
    public Builder setIpAddress(com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress value) {
      if (ipAddressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ipAddress_ = value;
      } else {
        ipAddressBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ip address representation
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
     */
    public Builder setIpAddress(
        com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.Builder builderForValue) {
      if (ipAddressBuilder_ == null) {
        ipAddress_ = builderForValue.build();
      } else {
        ipAddressBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ip address representation
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
     */
    public Builder mergeIpAddress(com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress value) {
      if (ipAddressBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          ipAddress_ != null &&
          ipAddress_ != com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.getDefaultInstance()) {
          getIpAddressBuilder().mergeFrom(value);
        } else {
          ipAddress_ = value;
        }
      } else {
        ipAddressBuilder_.mergeFrom(value);
      }
      if (ipAddress_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Ip address representation
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
     */
    public Builder clearIpAddress() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ipAddress_ = null;
      if (ipAddressBuilder_ != null) {
        ipAddressBuilder_.dispose();
        ipAddressBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ip address representation
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
     */
    public com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.Builder getIpAddressBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getIpAddressFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Ip address representation
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
     */
    public com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddressOrBuilder getIpAddressOrBuilder() {
      if (ipAddressBuilder_ != null) {
        return ipAddressBuilder_.getMessageOrBuilder();
      } else {
        return ipAddress_ == null ?
            com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.getDefaultInstance() : ipAddress_;
      }
    }
    /**
     * <pre>
     * Ip address representation
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress ip_address = 406272220;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.Builder, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddressOrBuilder> 
        getIpAddressFieldBuilder() {
      if (ipAddressBuilder_ == null) {
        ipAddressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddress.Builder, com.google.cloud.compute.v1.PreservedStatePreservedNetworkIpIpAddressOrBuilder>(
                getIpAddress(),
                getParentForChildren(),
                isClean());
        ipAddress_ = null;
      }
      return ipAddressBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.PreservedStatePreservedNetworkIp)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.PreservedStatePreservedNetworkIp)
  private static final com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp();
  }

  public static com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreservedStatePreservedNetworkIp>
      PARSER = new com.google.protobuf.AbstractParser<PreservedStatePreservedNetworkIp>() {
    @java.lang.Override
    public PreservedStatePreservedNetworkIp parsePartialFrom(
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

  public static com.google.protobuf.Parser<PreservedStatePreservedNetworkIp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreservedStatePreservedNetworkIp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.PreservedStatePreservedNetworkIp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

