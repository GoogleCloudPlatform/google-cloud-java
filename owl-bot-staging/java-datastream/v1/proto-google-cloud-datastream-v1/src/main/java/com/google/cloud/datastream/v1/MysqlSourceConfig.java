// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datastream.v1;

/**
 * <pre>
 * MySQL source configuration
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.MysqlSourceConfig}
 */
public final class MysqlSourceConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.MysqlSourceConfig)
    MysqlSourceConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MysqlSourceConfig.newBuilder() to construct.
  private MysqlSourceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MysqlSourceConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MysqlSourceConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlSourceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlSourceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.MysqlSourceConfig.class, com.google.cloud.datastream.v1.MysqlSourceConfig.Builder.class);
  }

  private int bitField0_;
  public static final int INCLUDE_OBJECTS_FIELD_NUMBER = 1;
  private com.google.cloud.datastream.v1.MysqlRdbms includeObjects_;
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
   * @return Whether the includeObjects field is set.
   */
  @java.lang.Override
  public boolean hasIncludeObjects() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
   * @return The includeObjects.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlRdbms getIncludeObjects() {
    return includeObjects_ == null ? com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance() : includeObjects_;
  }
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getIncludeObjectsOrBuilder() {
    return includeObjects_ == null ? com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance() : includeObjects_;
  }

  public static final int EXCLUDE_OBJECTS_FIELD_NUMBER = 2;
  private com.google.cloud.datastream.v1.MysqlRdbms excludeObjects_;
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
   * @return Whether the excludeObjects field is set.
   */
  @java.lang.Override
  public boolean hasExcludeObjects() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
   * @return The excludeObjects.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlRdbms getExcludeObjects() {
    return excludeObjects_ == null ? com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance() : excludeObjects_;
  }
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getExcludeObjectsOrBuilder() {
    return excludeObjects_ == null ? com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance() : excludeObjects_;
  }

  public static final int MAX_CONCURRENT_CDC_TASKS_FIELD_NUMBER = 3;
  private int maxConcurrentCdcTasks_ = 0;
  /**
   * <pre>
   * Maximum number of concurrent CDC tasks. The number should be non negative.
   * If not set (or set to 0), the system's default value will be used.
   * </pre>
   *
   * <code>int32 max_concurrent_cdc_tasks = 3;</code>
   * @return The maxConcurrentCdcTasks.
   */
  @java.lang.Override
  public int getMaxConcurrentCdcTasks() {
    return maxConcurrentCdcTasks_;
  }

  public static final int MAX_CONCURRENT_BACKFILL_TASKS_FIELD_NUMBER = 4;
  private int maxConcurrentBackfillTasks_ = 0;
  /**
   * <pre>
   * Maximum number of concurrent backfill tasks. The number should be non
   * negative. If not set (or set to 0), the system's default value will be
   * used.
   * </pre>
   *
   * <code>int32 max_concurrent_backfill_tasks = 4;</code>
   * @return The maxConcurrentBackfillTasks.
   */
  @java.lang.Override
  public int getMaxConcurrentBackfillTasks() {
    return maxConcurrentBackfillTasks_;
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
      output.writeMessage(1, getIncludeObjects());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getExcludeObjects());
    }
    if (maxConcurrentCdcTasks_ != 0) {
      output.writeInt32(3, maxConcurrentCdcTasks_);
    }
    if (maxConcurrentBackfillTasks_ != 0) {
      output.writeInt32(4, maxConcurrentBackfillTasks_);
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
        .computeMessageSize(1, getIncludeObjects());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExcludeObjects());
    }
    if (maxConcurrentCdcTasks_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxConcurrentCdcTasks_);
    }
    if (maxConcurrentBackfillTasks_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, maxConcurrentBackfillTasks_);
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
    if (!(obj instanceof com.google.cloud.datastream.v1.MysqlSourceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.MysqlSourceConfig other = (com.google.cloud.datastream.v1.MysqlSourceConfig) obj;

    if (hasIncludeObjects() != other.hasIncludeObjects()) return false;
    if (hasIncludeObjects()) {
      if (!getIncludeObjects()
          .equals(other.getIncludeObjects())) return false;
    }
    if (hasExcludeObjects() != other.hasExcludeObjects()) return false;
    if (hasExcludeObjects()) {
      if (!getExcludeObjects()
          .equals(other.getExcludeObjects())) return false;
    }
    if (getMaxConcurrentCdcTasks()
        != other.getMaxConcurrentCdcTasks()) return false;
    if (getMaxConcurrentBackfillTasks()
        != other.getMaxConcurrentBackfillTasks()) return false;
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
    if (hasIncludeObjects()) {
      hash = (37 * hash) + INCLUDE_OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getIncludeObjects().hashCode();
    }
    if (hasExcludeObjects()) {
      hash = (37 * hash) + EXCLUDE_OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getExcludeObjects().hashCode();
    }
    hash = (37 * hash) + MAX_CONCURRENT_CDC_TASKS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxConcurrentCdcTasks();
    hash = (37 * hash) + MAX_CONCURRENT_BACKFILL_TASKS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxConcurrentBackfillTasks();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.MysqlSourceConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1.MysqlSourceConfig prototype) {
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
   * MySQL source configuration
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.MysqlSourceConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.MysqlSourceConfig)
      com.google.cloud.datastream.v1.MysqlSourceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlSourceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlSourceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.MysqlSourceConfig.class, com.google.cloud.datastream.v1.MysqlSourceConfig.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.MysqlSourceConfig.newBuilder()
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
        getIncludeObjectsFieldBuilder();
        getExcludeObjectsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      includeObjects_ = null;
      if (includeObjectsBuilder_ != null) {
        includeObjectsBuilder_.dispose();
        includeObjectsBuilder_ = null;
      }
      excludeObjects_ = null;
      if (excludeObjectsBuilder_ != null) {
        excludeObjectsBuilder_.dispose();
        excludeObjectsBuilder_ = null;
      }
      maxConcurrentCdcTasks_ = 0;
      maxConcurrentBackfillTasks_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlSourceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlSourceConfig getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.MysqlSourceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlSourceConfig build() {
      com.google.cloud.datastream.v1.MysqlSourceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlSourceConfig buildPartial() {
      com.google.cloud.datastream.v1.MysqlSourceConfig result = new com.google.cloud.datastream.v1.MysqlSourceConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datastream.v1.MysqlSourceConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.includeObjects_ = includeObjectsBuilder_ == null
            ? includeObjects_
            : includeObjectsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.excludeObjects_ = excludeObjectsBuilder_ == null
            ? excludeObjects_
            : excludeObjectsBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxConcurrentCdcTasks_ = maxConcurrentCdcTasks_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.maxConcurrentBackfillTasks_ = maxConcurrentBackfillTasks_;
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
      if (other instanceof com.google.cloud.datastream.v1.MysqlSourceConfig) {
        return mergeFrom((com.google.cloud.datastream.v1.MysqlSourceConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.MysqlSourceConfig other) {
      if (other == com.google.cloud.datastream.v1.MysqlSourceConfig.getDefaultInstance()) return this;
      if (other.hasIncludeObjects()) {
        mergeIncludeObjects(other.getIncludeObjects());
      }
      if (other.hasExcludeObjects()) {
        mergeExcludeObjects(other.getExcludeObjects());
      }
      if (other.getMaxConcurrentCdcTasks() != 0) {
        setMaxConcurrentCdcTasks(other.getMaxConcurrentCdcTasks());
      }
      if (other.getMaxConcurrentBackfillTasks() != 0) {
        setMaxConcurrentBackfillTasks(other.getMaxConcurrentBackfillTasks());
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
            case 10: {
              input.readMessage(
                  getIncludeObjectsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getExcludeObjectsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              maxConcurrentCdcTasks_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              maxConcurrentBackfillTasks_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private com.google.cloud.datastream.v1.MysqlRdbms includeObjects_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.MysqlRdbms, com.google.cloud.datastream.v1.MysqlRdbms.Builder, com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder> includeObjectsBuilder_;
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
     * @return Whether the includeObjects field is set.
     */
    public boolean hasIncludeObjects() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
     * @return The includeObjects.
     */
    public com.google.cloud.datastream.v1.MysqlRdbms getIncludeObjects() {
      if (includeObjectsBuilder_ == null) {
        return includeObjects_ == null ? com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance() : includeObjects_;
      } else {
        return includeObjectsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
     */
    public Builder setIncludeObjects(com.google.cloud.datastream.v1.MysqlRdbms value) {
      if (includeObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        includeObjects_ = value;
      } else {
        includeObjectsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
     */
    public Builder setIncludeObjects(
        com.google.cloud.datastream.v1.MysqlRdbms.Builder builderForValue) {
      if (includeObjectsBuilder_ == null) {
        includeObjects_ = builderForValue.build();
      } else {
        includeObjectsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
     */
    public Builder mergeIncludeObjects(com.google.cloud.datastream.v1.MysqlRdbms value) {
      if (includeObjectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          includeObjects_ != null &&
          includeObjects_ != com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance()) {
          getIncludeObjectsBuilder().mergeFrom(value);
        } else {
          includeObjects_ = value;
        }
      } else {
        includeObjectsBuilder_.mergeFrom(value);
      }
      if (includeObjects_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
     */
    public Builder clearIncludeObjects() {
      bitField0_ = (bitField0_ & ~0x00000001);
      includeObjects_ = null;
      if (includeObjectsBuilder_ != null) {
        includeObjectsBuilder_.dispose();
        includeObjectsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.MysqlRdbms.Builder getIncludeObjectsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIncludeObjectsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getIncludeObjectsOrBuilder() {
      if (includeObjectsBuilder_ != null) {
        return includeObjectsBuilder_.getMessageOrBuilder();
      } else {
        return includeObjects_ == null ?
            com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance() : includeObjects_;
      }
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms include_objects = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.MysqlRdbms, com.google.cloud.datastream.v1.MysqlRdbms.Builder, com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder> 
        getIncludeObjectsFieldBuilder() {
      if (includeObjectsBuilder_ == null) {
        includeObjectsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.MysqlRdbms, com.google.cloud.datastream.v1.MysqlRdbms.Builder, com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder>(
                getIncludeObjects(),
                getParentForChildren(),
                isClean());
        includeObjects_ = null;
      }
      return includeObjectsBuilder_;
    }

    private com.google.cloud.datastream.v1.MysqlRdbms excludeObjects_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.MysqlRdbms, com.google.cloud.datastream.v1.MysqlRdbms.Builder, com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder> excludeObjectsBuilder_;
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
     * @return Whether the excludeObjects field is set.
     */
    public boolean hasExcludeObjects() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
     * @return The excludeObjects.
     */
    public com.google.cloud.datastream.v1.MysqlRdbms getExcludeObjects() {
      if (excludeObjectsBuilder_ == null) {
        return excludeObjects_ == null ? com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance() : excludeObjects_;
      } else {
        return excludeObjectsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
     */
    public Builder setExcludeObjects(com.google.cloud.datastream.v1.MysqlRdbms value) {
      if (excludeObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        excludeObjects_ = value;
      } else {
        excludeObjectsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
     */
    public Builder setExcludeObjects(
        com.google.cloud.datastream.v1.MysqlRdbms.Builder builderForValue) {
      if (excludeObjectsBuilder_ == null) {
        excludeObjects_ = builderForValue.build();
      } else {
        excludeObjectsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
     */
    public Builder mergeExcludeObjects(com.google.cloud.datastream.v1.MysqlRdbms value) {
      if (excludeObjectsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          excludeObjects_ != null &&
          excludeObjects_ != com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance()) {
          getExcludeObjectsBuilder().mergeFrom(value);
        } else {
          excludeObjects_ = value;
        }
      } else {
        excludeObjectsBuilder_.mergeFrom(value);
      }
      if (excludeObjects_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
     */
    public Builder clearExcludeObjects() {
      bitField0_ = (bitField0_ & ~0x00000002);
      excludeObjects_ = null;
      if (excludeObjectsBuilder_ != null) {
        excludeObjectsBuilder_.dispose();
        excludeObjectsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
     */
    public com.google.cloud.datastream.v1.MysqlRdbms.Builder getExcludeObjectsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExcludeObjectsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
     */
    public com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getExcludeObjectsOrBuilder() {
      if (excludeObjectsBuilder_ != null) {
        return excludeObjectsBuilder_.getMessageOrBuilder();
      } else {
        return excludeObjects_ == null ?
            com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance() : excludeObjects_;
      }
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms exclude_objects = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.MysqlRdbms, com.google.cloud.datastream.v1.MysqlRdbms.Builder, com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder> 
        getExcludeObjectsFieldBuilder() {
      if (excludeObjectsBuilder_ == null) {
        excludeObjectsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.MysqlRdbms, com.google.cloud.datastream.v1.MysqlRdbms.Builder, com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder>(
                getExcludeObjects(),
                getParentForChildren(),
                isClean());
        excludeObjects_ = null;
      }
      return excludeObjectsBuilder_;
    }

    private int maxConcurrentCdcTasks_ ;
    /**
     * <pre>
     * Maximum number of concurrent CDC tasks. The number should be non negative.
     * If not set (or set to 0), the system's default value will be used.
     * </pre>
     *
     * <code>int32 max_concurrent_cdc_tasks = 3;</code>
     * @return The maxConcurrentCdcTasks.
     */
    @java.lang.Override
    public int getMaxConcurrentCdcTasks() {
      return maxConcurrentCdcTasks_;
    }
    /**
     * <pre>
     * Maximum number of concurrent CDC tasks. The number should be non negative.
     * If not set (or set to 0), the system's default value will be used.
     * </pre>
     *
     * <code>int32 max_concurrent_cdc_tasks = 3;</code>
     * @param value The maxConcurrentCdcTasks to set.
     * @return This builder for chaining.
     */
    public Builder setMaxConcurrentCdcTasks(int value) {

      maxConcurrentCdcTasks_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of concurrent CDC tasks. The number should be non negative.
     * If not set (or set to 0), the system's default value will be used.
     * </pre>
     *
     * <code>int32 max_concurrent_cdc_tasks = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxConcurrentCdcTasks() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxConcurrentCdcTasks_ = 0;
      onChanged();
      return this;
    }

    private int maxConcurrentBackfillTasks_ ;
    /**
     * <pre>
     * Maximum number of concurrent backfill tasks. The number should be non
     * negative. If not set (or set to 0), the system's default value will be
     * used.
     * </pre>
     *
     * <code>int32 max_concurrent_backfill_tasks = 4;</code>
     * @return The maxConcurrentBackfillTasks.
     */
    @java.lang.Override
    public int getMaxConcurrentBackfillTasks() {
      return maxConcurrentBackfillTasks_;
    }
    /**
     * <pre>
     * Maximum number of concurrent backfill tasks. The number should be non
     * negative. If not set (or set to 0), the system's default value will be
     * used.
     * </pre>
     *
     * <code>int32 max_concurrent_backfill_tasks = 4;</code>
     * @param value The maxConcurrentBackfillTasks to set.
     * @return This builder for chaining.
     */
    public Builder setMaxConcurrentBackfillTasks(int value) {

      maxConcurrentBackfillTasks_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of concurrent backfill tasks. The number should be non
     * negative. If not set (or set to 0), the system's default value will be
     * used.
     * </pre>
     *
     * <code>int32 max_concurrent_backfill_tasks = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxConcurrentBackfillTasks() {
      bitField0_ = (bitField0_ & ~0x00000008);
      maxConcurrentBackfillTasks_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.MysqlSourceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.MysqlSourceConfig)
  private static final com.google.cloud.datastream.v1.MysqlSourceConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.MysqlSourceConfig();
  }

  public static com.google.cloud.datastream.v1.MysqlSourceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MysqlSourceConfig>
      PARSER = new com.google.protobuf.AbstractParser<MysqlSourceConfig>() {
    @java.lang.Override
    public MysqlSourceConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<MysqlSourceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MysqlSourceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlSourceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

