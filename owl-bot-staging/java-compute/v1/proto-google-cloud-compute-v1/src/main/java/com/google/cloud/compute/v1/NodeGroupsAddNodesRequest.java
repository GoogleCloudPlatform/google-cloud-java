// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NodeGroupsAddNodesRequest}
 */
public final class NodeGroupsAddNodesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NodeGroupsAddNodesRequest)
    NodeGroupsAddNodesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeGroupsAddNodesRequest.newBuilder() to construct.
  private NodeGroupsAddNodesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeGroupsAddNodesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeGroupsAddNodesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupsAddNodesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupsAddNodesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NodeGroupsAddNodesRequest.class, com.google.cloud.compute.v1.NodeGroupsAddNodesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ADDITIONAL_NODE_COUNT_FIELD_NUMBER = 134997930;
  private int additionalNodeCount_ = 0;
  /**
   * <pre>
   * Count of additional nodes to be added to the node group.
   * </pre>
   *
   * <code>optional int32 additional_node_count = 134997930;</code>
   * @return Whether the additionalNodeCount field is set.
   */
  @java.lang.Override
  public boolean hasAdditionalNodeCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Count of additional nodes to be added to the node group.
   * </pre>
   *
   * <code>optional int32 additional_node_count = 134997930;</code>
   * @return The additionalNodeCount.
   */
  @java.lang.Override
  public int getAdditionalNodeCount() {
    return additionalNodeCount_;
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
      output.writeInt32(134997930, additionalNodeCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(134997930, additionalNodeCount_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.NodeGroupsAddNodesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NodeGroupsAddNodesRequest other = (com.google.cloud.compute.v1.NodeGroupsAddNodesRequest) obj;

    if (hasAdditionalNodeCount() != other.hasAdditionalNodeCount()) return false;
    if (hasAdditionalNodeCount()) {
      if (getAdditionalNodeCount()
          != other.getAdditionalNodeCount()) return false;
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
    if (hasAdditionalNodeCount()) {
      hash = (37 * hash) + ADDITIONAL_NODE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAdditionalNodeCount();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.NodeGroupsAddNodesRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.NodeGroupsAddNodesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NodeGroupsAddNodesRequest)
      com.google.cloud.compute.v1.NodeGroupsAddNodesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupsAddNodesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupsAddNodesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NodeGroupsAddNodesRequest.class, com.google.cloud.compute.v1.NodeGroupsAddNodesRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NodeGroupsAddNodesRequest.newBuilder()
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
      additionalNodeCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupsAddNodesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupsAddNodesRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NodeGroupsAddNodesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupsAddNodesRequest build() {
      com.google.cloud.compute.v1.NodeGroupsAddNodesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupsAddNodesRequest buildPartial() {
      com.google.cloud.compute.v1.NodeGroupsAddNodesRequest result = new com.google.cloud.compute.v1.NodeGroupsAddNodesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.NodeGroupsAddNodesRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.additionalNodeCount_ = additionalNodeCount_;
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
      if (other instanceof com.google.cloud.compute.v1.NodeGroupsAddNodesRequest) {
        return mergeFrom((com.google.cloud.compute.v1.NodeGroupsAddNodesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NodeGroupsAddNodesRequest other) {
      if (other == com.google.cloud.compute.v1.NodeGroupsAddNodesRequest.getDefaultInstance()) return this;
      if (other.hasAdditionalNodeCount()) {
        setAdditionalNodeCount(other.getAdditionalNodeCount());
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
            case 1079983440: {
              additionalNodeCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 1079983440
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

    private int additionalNodeCount_ ;
    /**
     * <pre>
     * Count of additional nodes to be added to the node group.
     * </pre>
     *
     * <code>optional int32 additional_node_count = 134997930;</code>
     * @return Whether the additionalNodeCount field is set.
     */
    @java.lang.Override
    public boolean hasAdditionalNodeCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Count of additional nodes to be added to the node group.
     * </pre>
     *
     * <code>optional int32 additional_node_count = 134997930;</code>
     * @return The additionalNodeCount.
     */
    @java.lang.Override
    public int getAdditionalNodeCount() {
      return additionalNodeCount_;
    }
    /**
     * <pre>
     * Count of additional nodes to be added to the node group.
     * </pre>
     *
     * <code>optional int32 additional_node_count = 134997930;</code>
     * @param value The additionalNodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionalNodeCount(int value) {

      additionalNodeCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of additional nodes to be added to the node group.
     * </pre>
     *
     * <code>optional int32 additional_node_count = 134997930;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdditionalNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      additionalNodeCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NodeGroupsAddNodesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NodeGroupsAddNodesRequest)
  private static final com.google.cloud.compute.v1.NodeGroupsAddNodesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NodeGroupsAddNodesRequest();
  }

  public static com.google.cloud.compute.v1.NodeGroupsAddNodesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeGroupsAddNodesRequest>
      PARSER = new com.google.protobuf.AbstractParser<NodeGroupsAddNodesRequest>() {
    @java.lang.Override
    public NodeGroupsAddNodesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeGroupsAddNodesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeGroupsAddNodesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NodeGroupsAddNodesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

