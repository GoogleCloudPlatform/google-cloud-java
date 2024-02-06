// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

/**
 * <pre>
 * NodePoolAutoscaling contains information required by cluster autoscaler to
 * adjust the size of the node pool to the current cluster usage.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.NodePoolAutoscaling}
 */
public final class NodePoolAutoscaling extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.NodePoolAutoscaling)
    NodePoolAutoscalingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodePoolAutoscaling.newBuilder() to construct.
  private NodePoolAutoscaling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodePoolAutoscaling() {
    locationPolicy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodePoolAutoscaling();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolAutoscaling_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolAutoscaling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.NodePoolAutoscaling.class, com.google.container.v1beta1.NodePoolAutoscaling.Builder.class);
  }

  /**
   * <pre>
   * Location policy specifies how zones are picked when scaling up the
   * nodepool.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.NodePoolAutoscaling.LocationPolicy}
   */
  public enum LocationPolicy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not set.
     * </pre>
     *
     * <code>LOCATION_POLICY_UNSPECIFIED = 0;</code>
     */
    LOCATION_POLICY_UNSPECIFIED(0),
    /**
     * <pre>
     * BALANCED is a best effort policy that aims to balance the sizes of
     * different zones.
     * </pre>
     *
     * <code>BALANCED = 1;</code>
     */
    BALANCED(1),
    /**
     * <pre>
     * ANY policy picks zones that have the highest capacity available.
     * </pre>
     *
     * <code>ANY = 2;</code>
     */
    ANY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not set.
     * </pre>
     *
     * <code>LOCATION_POLICY_UNSPECIFIED = 0;</code>
     */
    public static final int LOCATION_POLICY_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * BALANCED is a best effort policy that aims to balance the sizes of
     * different zones.
     * </pre>
     *
     * <code>BALANCED = 1;</code>
     */
    public static final int BALANCED_VALUE = 1;
    /**
     * <pre>
     * ANY policy picks zones that have the highest capacity available.
     * </pre>
     *
     * <code>ANY = 2;</code>
     */
    public static final int ANY_VALUE = 2;


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
    public static LocationPolicy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LocationPolicy forNumber(int value) {
      switch (value) {
        case 0: return LOCATION_POLICY_UNSPECIFIED;
        case 1: return BALANCED;
        case 2: return ANY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LocationPolicy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LocationPolicy> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LocationPolicy>() {
            public LocationPolicy findValueByNumber(int number) {
              return LocationPolicy.forNumber(number);
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
      return com.google.container.v1beta1.NodePoolAutoscaling.getDescriptor().getEnumTypes().get(0);
    }

    private static final LocationPolicy[] VALUES = values();

    public static LocationPolicy valueOf(
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

    private LocationPolicy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.NodePoolAutoscaling.LocationPolicy)
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   * <pre>
   * Is autoscaling enabled for this node pool.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int MIN_NODE_COUNT_FIELD_NUMBER = 2;
  private int minNodeCount_ = 0;
  /**
   * <pre>
   * Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and
   * &lt;= max_node_count.
   * </pre>
   *
   * <code>int32 min_node_count = 2;</code>
   * @return The minNodeCount.
   */
  @java.lang.Override
  public int getMinNodeCount() {
    return minNodeCount_;
  }

  public static final int MAX_NODE_COUNT_FIELD_NUMBER = 3;
  private int maxNodeCount_ = 0;
  /**
   * <pre>
   * Maximum number of nodes for one location in the NodePool. Must be &gt;=
   * min_node_count. There has to be enough quota to scale up the cluster.
   * </pre>
   *
   * <code>int32 max_node_count = 3;</code>
   * @return The maxNodeCount.
   */
  @java.lang.Override
  public int getMaxNodeCount() {
    return maxNodeCount_;
  }

  public static final int AUTOPROVISIONED_FIELD_NUMBER = 4;
  private boolean autoprovisioned_ = false;
  /**
   * <pre>
   * Can this node pool be deleted automatically.
   * </pre>
   *
   * <code>bool autoprovisioned = 4;</code>
   * @return The autoprovisioned.
   */
  @java.lang.Override
  public boolean getAutoprovisioned() {
    return autoprovisioned_;
  }

  public static final int LOCATION_POLICY_FIELD_NUMBER = 5;
  private int locationPolicy_ = 0;
  /**
   * <pre>
   * Location policy used when scaling up a nodepool.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy location_policy = 5;</code>
   * @return The enum numeric value on the wire for locationPolicy.
   */
  @java.lang.Override public int getLocationPolicyValue() {
    return locationPolicy_;
  }
  /**
   * <pre>
   * Location policy used when scaling up a nodepool.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy location_policy = 5;</code>
   * @return The locationPolicy.
   */
  @java.lang.Override public com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy getLocationPolicy() {
    com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy result = com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy.forNumber(locationPolicy_);
    return result == null ? com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy.UNRECOGNIZED : result;
  }

  public static final int TOTAL_MIN_NODE_COUNT_FIELD_NUMBER = 6;
  private int totalMinNodeCount_ = 0;
  /**
   * <pre>
   * Minimum number of nodes in the node pool. Must be greater than 1 less than
   * total_max_node_count.
   * The total_*_node_count fields are mutually exclusive with the *_node_count
   * fields.
   * </pre>
   *
   * <code>int32 total_min_node_count = 6;</code>
   * @return The totalMinNodeCount.
   */
  @java.lang.Override
  public int getTotalMinNodeCount() {
    return totalMinNodeCount_;
  }

  public static final int TOTAL_MAX_NODE_COUNT_FIELD_NUMBER = 7;
  private int totalMaxNodeCount_ = 0;
  /**
   * <pre>
   * Maximum number of nodes in the node pool. Must be greater than
   * total_min_node_count. There has to be enough quota to scale up the cluster.
   * The total_*_node_count fields are mutually exclusive with the *_node_count
   * fields.
   * </pre>
   *
   * <code>int32 total_max_node_count = 7;</code>
   * @return The totalMaxNodeCount.
   */
  @java.lang.Override
  public int getTotalMaxNodeCount() {
    return totalMaxNodeCount_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (minNodeCount_ != 0) {
      output.writeInt32(2, minNodeCount_);
    }
    if (maxNodeCount_ != 0) {
      output.writeInt32(3, maxNodeCount_);
    }
    if (autoprovisioned_ != false) {
      output.writeBool(4, autoprovisioned_);
    }
    if (locationPolicy_ != com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy.LOCATION_POLICY_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, locationPolicy_);
    }
    if (totalMinNodeCount_ != 0) {
      output.writeInt32(6, totalMinNodeCount_);
    }
    if (totalMaxNodeCount_ != 0) {
      output.writeInt32(7, totalMaxNodeCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    if (minNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minNodeCount_);
    }
    if (maxNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxNodeCount_);
    }
    if (autoprovisioned_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, autoprovisioned_);
    }
    if (locationPolicy_ != com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy.LOCATION_POLICY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, locationPolicy_);
    }
    if (totalMinNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, totalMinNodeCount_);
    }
    if (totalMaxNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, totalMaxNodeCount_);
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
    if (!(obj instanceof com.google.container.v1beta1.NodePoolAutoscaling)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.NodePoolAutoscaling other = (com.google.container.v1beta1.NodePoolAutoscaling) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
    if (getMinNodeCount()
        != other.getMinNodeCount()) return false;
    if (getMaxNodeCount()
        != other.getMaxNodeCount()) return false;
    if (getAutoprovisioned()
        != other.getAutoprovisioned()) return false;
    if (locationPolicy_ != other.locationPolicy_) return false;
    if (getTotalMinNodeCount()
        != other.getTotalMinNodeCount()) return false;
    if (getTotalMaxNodeCount()
        != other.getTotalMaxNodeCount()) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (37 * hash) + MIN_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMinNodeCount();
    hash = (37 * hash) + MAX_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxNodeCount();
    hash = (37 * hash) + AUTOPROVISIONED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutoprovisioned());
    hash = (37 * hash) + LOCATION_POLICY_FIELD_NUMBER;
    hash = (53 * hash) + locationPolicy_;
    hash = (37 * hash) + TOTAL_MIN_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalMinNodeCount();
    hash = (37 * hash) + TOTAL_MAX_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalMaxNodeCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodePoolAutoscaling parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NodePoolAutoscaling parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.NodePoolAutoscaling parseFrom(
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
  public static Builder newBuilder(com.google.container.v1beta1.NodePoolAutoscaling prototype) {
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
   * NodePoolAutoscaling contains information required by cluster autoscaler to
   * adjust the size of the node pool to the current cluster usage.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.NodePoolAutoscaling}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.NodePoolAutoscaling)
      com.google.container.v1beta1.NodePoolAutoscalingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolAutoscaling_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolAutoscaling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.NodePoolAutoscaling.class, com.google.container.v1beta1.NodePoolAutoscaling.Builder.class);
    }

    // Construct using com.google.container.v1beta1.NodePoolAutoscaling.newBuilder()
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
      enabled_ = false;
      minNodeCount_ = 0;
      maxNodeCount_ = 0;
      autoprovisioned_ = false;
      locationPolicy_ = 0;
      totalMinNodeCount_ = 0;
      totalMaxNodeCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolAutoscaling_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodePoolAutoscaling getDefaultInstanceForType() {
      return com.google.container.v1beta1.NodePoolAutoscaling.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodePoolAutoscaling build() {
      com.google.container.v1beta1.NodePoolAutoscaling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodePoolAutoscaling buildPartial() {
      com.google.container.v1beta1.NodePoolAutoscaling result = new com.google.container.v1beta1.NodePoolAutoscaling(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.NodePoolAutoscaling result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minNodeCount_ = minNodeCount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxNodeCount_ = maxNodeCount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.autoprovisioned_ = autoprovisioned_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.locationPolicy_ = locationPolicy_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.totalMinNodeCount_ = totalMinNodeCount_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.totalMaxNodeCount_ = totalMaxNodeCount_;
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
      if (other instanceof com.google.container.v1beta1.NodePoolAutoscaling) {
        return mergeFrom((com.google.container.v1beta1.NodePoolAutoscaling)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.NodePoolAutoscaling other) {
      if (other == com.google.container.v1beta1.NodePoolAutoscaling.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.getMinNodeCount() != 0) {
        setMinNodeCount(other.getMinNodeCount());
      }
      if (other.getMaxNodeCount() != 0) {
        setMaxNodeCount(other.getMaxNodeCount());
      }
      if (other.getAutoprovisioned() != false) {
        setAutoprovisioned(other.getAutoprovisioned());
      }
      if (other.locationPolicy_ != 0) {
        setLocationPolicyValue(other.getLocationPolicyValue());
      }
      if (other.getTotalMinNodeCount() != 0) {
        setTotalMinNodeCount(other.getTotalMinNodeCount());
      }
      if (other.getTotalMaxNodeCount() != 0) {
        setTotalMaxNodeCount(other.getTotalMaxNodeCount());
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
              enabled_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              minNodeCount_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              maxNodeCount_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              autoprovisioned_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              locationPolicy_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              totalMinNodeCount_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              totalMaxNodeCount_ = input.readInt32();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
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

    private boolean enabled_ ;
    /**
     * <pre>
     * Is autoscaling enabled for this node pool.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * Is autoscaling enabled for this node pool.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Is autoscaling enabled for this node pool.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private int minNodeCount_ ;
    /**
     * <pre>
     * Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and
     * &lt;= max_node_count.
     * </pre>
     *
     * <code>int32 min_node_count = 2;</code>
     * @return The minNodeCount.
     */
    @java.lang.Override
    public int getMinNodeCount() {
      return minNodeCount_;
    }
    /**
     * <pre>
     * Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and
     * &lt;= max_node_count.
     * </pre>
     *
     * <code>int32 min_node_count = 2;</code>
     * @param value The minNodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setMinNodeCount(int value) {

      minNodeCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and
     * &lt;= max_node_count.
     * </pre>
     *
     * <code>int32 min_node_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minNodeCount_ = 0;
      onChanged();
      return this;
    }

    private int maxNodeCount_ ;
    /**
     * <pre>
     * Maximum number of nodes for one location in the NodePool. Must be &gt;=
     * min_node_count. There has to be enough quota to scale up the cluster.
     * </pre>
     *
     * <code>int32 max_node_count = 3;</code>
     * @return The maxNodeCount.
     */
    @java.lang.Override
    public int getMaxNodeCount() {
      return maxNodeCount_;
    }
    /**
     * <pre>
     * Maximum number of nodes for one location in the NodePool. Must be &gt;=
     * min_node_count. There has to be enough quota to scale up the cluster.
     * </pre>
     *
     * <code>int32 max_node_count = 3;</code>
     * @param value The maxNodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNodeCount(int value) {

      maxNodeCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of nodes for one location in the NodePool. Must be &gt;=
     * min_node_count. There has to be enough quota to scale up the cluster.
     * </pre>
     *
     * <code>int32 max_node_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxNodeCount_ = 0;
      onChanged();
      return this;
    }

    private boolean autoprovisioned_ ;
    /**
     * <pre>
     * Can this node pool be deleted automatically.
     * </pre>
     *
     * <code>bool autoprovisioned = 4;</code>
     * @return The autoprovisioned.
     */
    @java.lang.Override
    public boolean getAutoprovisioned() {
      return autoprovisioned_;
    }
    /**
     * <pre>
     * Can this node pool be deleted automatically.
     * </pre>
     *
     * <code>bool autoprovisioned = 4;</code>
     * @param value The autoprovisioned to set.
     * @return This builder for chaining.
     */
    public Builder setAutoprovisioned(boolean value) {

      autoprovisioned_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Can this node pool be deleted automatically.
     * </pre>
     *
     * <code>bool autoprovisioned = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoprovisioned() {
      bitField0_ = (bitField0_ & ~0x00000008);
      autoprovisioned_ = false;
      onChanged();
      return this;
    }

    private int locationPolicy_ = 0;
    /**
     * <pre>
     * Location policy used when scaling up a nodepool.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy location_policy = 5;</code>
     * @return The enum numeric value on the wire for locationPolicy.
     */
    @java.lang.Override public int getLocationPolicyValue() {
      return locationPolicy_;
    }
    /**
     * <pre>
     * Location policy used when scaling up a nodepool.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy location_policy = 5;</code>
     * @param value The enum numeric value on the wire for locationPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setLocationPolicyValue(int value) {
      locationPolicy_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location policy used when scaling up a nodepool.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy location_policy = 5;</code>
     * @return The locationPolicy.
     */
    @java.lang.Override
    public com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy getLocationPolicy() {
      com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy result = com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy.forNumber(locationPolicy_);
      return result == null ? com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Location policy used when scaling up a nodepool.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy location_policy = 5;</code>
     * @param value The locationPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setLocationPolicy(com.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      locationPolicy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location policy used when scaling up a nodepool.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodePoolAutoscaling.LocationPolicy location_policy = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocationPolicy() {
      bitField0_ = (bitField0_ & ~0x00000010);
      locationPolicy_ = 0;
      onChanged();
      return this;
    }

    private int totalMinNodeCount_ ;
    /**
     * <pre>
     * Minimum number of nodes in the node pool. Must be greater than 1 less than
     * total_max_node_count.
     * The total_*_node_count fields are mutually exclusive with the *_node_count
     * fields.
     * </pre>
     *
     * <code>int32 total_min_node_count = 6;</code>
     * @return The totalMinNodeCount.
     */
    @java.lang.Override
    public int getTotalMinNodeCount() {
      return totalMinNodeCount_;
    }
    /**
     * <pre>
     * Minimum number of nodes in the node pool. Must be greater than 1 less than
     * total_max_node_count.
     * The total_*_node_count fields are mutually exclusive with the *_node_count
     * fields.
     * </pre>
     *
     * <code>int32 total_min_node_count = 6;</code>
     * @param value The totalMinNodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalMinNodeCount(int value) {

      totalMinNodeCount_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum number of nodes in the node pool. Must be greater than 1 less than
     * total_max_node_count.
     * The total_*_node_count fields are mutually exclusive with the *_node_count
     * fields.
     * </pre>
     *
     * <code>int32 total_min_node_count = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalMinNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000020);
      totalMinNodeCount_ = 0;
      onChanged();
      return this;
    }

    private int totalMaxNodeCount_ ;
    /**
     * <pre>
     * Maximum number of nodes in the node pool. Must be greater than
     * total_min_node_count. There has to be enough quota to scale up the cluster.
     * The total_*_node_count fields are mutually exclusive with the *_node_count
     * fields.
     * </pre>
     *
     * <code>int32 total_max_node_count = 7;</code>
     * @return The totalMaxNodeCount.
     */
    @java.lang.Override
    public int getTotalMaxNodeCount() {
      return totalMaxNodeCount_;
    }
    /**
     * <pre>
     * Maximum number of nodes in the node pool. Must be greater than
     * total_min_node_count. There has to be enough quota to scale up the cluster.
     * The total_*_node_count fields are mutually exclusive with the *_node_count
     * fields.
     * </pre>
     *
     * <code>int32 total_max_node_count = 7;</code>
     * @param value The totalMaxNodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalMaxNodeCount(int value) {

      totalMaxNodeCount_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of nodes in the node pool. Must be greater than
     * total_min_node_count. There has to be enough quota to scale up the cluster.
     * The total_*_node_count fields are mutually exclusive with the *_node_count
     * fields.
     * </pre>
     *
     * <code>int32 total_max_node_count = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalMaxNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000040);
      totalMaxNodeCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.NodePoolAutoscaling)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.NodePoolAutoscaling)
  private static final com.google.container.v1beta1.NodePoolAutoscaling DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.NodePoolAutoscaling();
  }

  public static com.google.container.v1beta1.NodePoolAutoscaling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodePoolAutoscaling>
      PARSER = new com.google.protobuf.AbstractParser<NodePoolAutoscaling>() {
    @java.lang.Override
    public NodePoolAutoscaling parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodePoolAutoscaling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodePoolAutoscaling> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.NodePoolAutoscaling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

