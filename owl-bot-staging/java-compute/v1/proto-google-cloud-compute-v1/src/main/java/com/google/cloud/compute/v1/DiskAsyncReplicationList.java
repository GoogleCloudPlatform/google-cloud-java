// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.DiskAsyncReplicationList}
 */
public final class DiskAsyncReplicationList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.DiskAsyncReplicationList)
    DiskAsyncReplicationListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiskAsyncReplicationList.newBuilder() to construct.
  private DiskAsyncReplicationList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiskAsyncReplicationList() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DiskAsyncReplicationList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DiskAsyncReplicationList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DiskAsyncReplicationList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.DiskAsyncReplicationList.class, com.google.cloud.compute.v1.DiskAsyncReplicationList.Builder.class);
  }

  private int bitField0_;
  public static final int ASYNC_REPLICATION_DISK_FIELD_NUMBER = 231794067;
  private com.google.cloud.compute.v1.DiskAsyncReplication asyncReplicationDisk_;
  /**
   * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
   * @return Whether the asyncReplicationDisk field is set.
   */
  @java.lang.Override
  public boolean hasAsyncReplicationDisk() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
   * @return The asyncReplicationDisk.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DiskAsyncReplication getAsyncReplicationDisk() {
    return asyncReplicationDisk_ == null ? com.google.cloud.compute.v1.DiskAsyncReplication.getDefaultInstance() : asyncReplicationDisk_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DiskAsyncReplicationOrBuilder getAsyncReplicationDiskOrBuilder() {
    return asyncReplicationDisk_ == null ? com.google.cloud.compute.v1.DiskAsyncReplication.getDefaultInstance() : asyncReplicationDisk_;
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
      output.writeMessage(231794067, getAsyncReplicationDisk());
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
        .computeMessageSize(231794067, getAsyncReplicationDisk());
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
    if (!(obj instanceof com.google.cloud.compute.v1.DiskAsyncReplicationList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.DiskAsyncReplicationList other = (com.google.cloud.compute.v1.DiskAsyncReplicationList) obj;

    if (hasAsyncReplicationDisk() != other.hasAsyncReplicationDisk()) return false;
    if (hasAsyncReplicationDisk()) {
      if (!getAsyncReplicationDisk()
          .equals(other.getAsyncReplicationDisk())) return false;
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
    if (hasAsyncReplicationDisk()) {
      hash = (37 * hash) + ASYNC_REPLICATION_DISK_FIELD_NUMBER;
      hash = (53 * hash) + getAsyncReplicationDisk().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.DiskAsyncReplicationList parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.DiskAsyncReplicationList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.DiskAsyncReplicationList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.DiskAsyncReplicationList)
      com.google.cloud.compute.v1.DiskAsyncReplicationListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DiskAsyncReplicationList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DiskAsyncReplicationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.DiskAsyncReplicationList.class, com.google.cloud.compute.v1.DiskAsyncReplicationList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.DiskAsyncReplicationList.newBuilder()
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
        getAsyncReplicationDiskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      asyncReplicationDisk_ = null;
      if (asyncReplicationDiskBuilder_ != null) {
        asyncReplicationDiskBuilder_.dispose();
        asyncReplicationDiskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DiskAsyncReplicationList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DiskAsyncReplicationList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.DiskAsyncReplicationList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DiskAsyncReplicationList build() {
      com.google.cloud.compute.v1.DiskAsyncReplicationList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DiskAsyncReplicationList buildPartial() {
      com.google.cloud.compute.v1.DiskAsyncReplicationList result = new com.google.cloud.compute.v1.DiskAsyncReplicationList(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.DiskAsyncReplicationList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.asyncReplicationDisk_ = asyncReplicationDiskBuilder_ == null
            ? asyncReplicationDisk_
            : asyncReplicationDiskBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.DiskAsyncReplicationList) {
        return mergeFrom((com.google.cloud.compute.v1.DiskAsyncReplicationList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.DiskAsyncReplicationList other) {
      if (other == com.google.cloud.compute.v1.DiskAsyncReplicationList.getDefaultInstance()) return this;
      if (other.hasAsyncReplicationDisk()) {
        mergeAsyncReplicationDisk(other.getAsyncReplicationDisk());
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
            case 1854352538: {
              input.readMessage(
                  getAsyncReplicationDiskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 1854352538
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

    private com.google.cloud.compute.v1.DiskAsyncReplication asyncReplicationDisk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.DiskAsyncReplication, com.google.cloud.compute.v1.DiskAsyncReplication.Builder, com.google.cloud.compute.v1.DiskAsyncReplicationOrBuilder> asyncReplicationDiskBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
     * @return Whether the asyncReplicationDisk field is set.
     */
    public boolean hasAsyncReplicationDisk() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
     * @return The asyncReplicationDisk.
     */
    public com.google.cloud.compute.v1.DiskAsyncReplication getAsyncReplicationDisk() {
      if (asyncReplicationDiskBuilder_ == null) {
        return asyncReplicationDisk_ == null ? com.google.cloud.compute.v1.DiskAsyncReplication.getDefaultInstance() : asyncReplicationDisk_;
      } else {
        return asyncReplicationDiskBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
     */
    public Builder setAsyncReplicationDisk(com.google.cloud.compute.v1.DiskAsyncReplication value) {
      if (asyncReplicationDiskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        asyncReplicationDisk_ = value;
      } else {
        asyncReplicationDiskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
     */
    public Builder setAsyncReplicationDisk(
        com.google.cloud.compute.v1.DiskAsyncReplication.Builder builderForValue) {
      if (asyncReplicationDiskBuilder_ == null) {
        asyncReplicationDisk_ = builderForValue.build();
      } else {
        asyncReplicationDiskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
     */
    public Builder mergeAsyncReplicationDisk(com.google.cloud.compute.v1.DiskAsyncReplication value) {
      if (asyncReplicationDiskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          asyncReplicationDisk_ != null &&
          asyncReplicationDisk_ != com.google.cloud.compute.v1.DiskAsyncReplication.getDefaultInstance()) {
          getAsyncReplicationDiskBuilder().mergeFrom(value);
        } else {
          asyncReplicationDisk_ = value;
        }
      } else {
        asyncReplicationDiskBuilder_.mergeFrom(value);
      }
      if (asyncReplicationDisk_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
     */
    public Builder clearAsyncReplicationDisk() {
      bitField0_ = (bitField0_ & ~0x00000001);
      asyncReplicationDisk_ = null;
      if (asyncReplicationDiskBuilder_ != null) {
        asyncReplicationDiskBuilder_.dispose();
        asyncReplicationDiskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
     */
    public com.google.cloud.compute.v1.DiskAsyncReplication.Builder getAsyncReplicationDiskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAsyncReplicationDiskFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
     */
    public com.google.cloud.compute.v1.DiskAsyncReplicationOrBuilder getAsyncReplicationDiskOrBuilder() {
      if (asyncReplicationDiskBuilder_ != null) {
        return asyncReplicationDiskBuilder_.getMessageOrBuilder();
      } else {
        return asyncReplicationDisk_ == null ?
            com.google.cloud.compute.v1.DiskAsyncReplication.getDefaultInstance() : asyncReplicationDisk_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.DiskAsyncReplication async_replication_disk = 231794067;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.DiskAsyncReplication, com.google.cloud.compute.v1.DiskAsyncReplication.Builder, com.google.cloud.compute.v1.DiskAsyncReplicationOrBuilder> 
        getAsyncReplicationDiskFieldBuilder() {
      if (asyncReplicationDiskBuilder_ == null) {
        asyncReplicationDiskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.DiskAsyncReplication, com.google.cloud.compute.v1.DiskAsyncReplication.Builder, com.google.cloud.compute.v1.DiskAsyncReplicationOrBuilder>(
                getAsyncReplicationDisk(),
                getParentForChildren(),
                isClean());
        asyncReplicationDisk_ = null;
      }
      return asyncReplicationDiskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.DiskAsyncReplicationList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.DiskAsyncReplicationList)
  private static final com.google.cloud.compute.v1.DiskAsyncReplicationList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.DiskAsyncReplicationList();
  }

  public static com.google.cloud.compute.v1.DiskAsyncReplicationList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiskAsyncReplicationList>
      PARSER = new com.google.protobuf.AbstractParser<DiskAsyncReplicationList>() {
    @java.lang.Override
    public DiskAsyncReplicationList parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiskAsyncReplicationList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiskAsyncReplicationList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.DiskAsyncReplicationList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

