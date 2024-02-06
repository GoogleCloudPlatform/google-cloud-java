// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/usage.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1beta1;

/**
 * <pre>
 * The set of all usage signals that we store in Data Catalog.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.UsageSignal}
 */
public final class UsageSignal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.UsageSignal)
    UsageSignalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UsageSignal.newBuilder() to construct.
  private UsageSignal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsageSignal() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UsageSignal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.Usage.internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetUsageWithinTimeRange();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.Usage.internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.UsageSignal.class, com.google.cloud.datacatalog.v1beta1.UsageSignal.Builder.class);
  }

  private int bitField0_;
  public static final int UPDATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   * <pre>
   * The timestamp of the end of the usage statistics duration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The timestamp of the end of the usage statistics duration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   * <pre>
   * The timestamp of the end of the usage statistics duration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }

  public static final int USAGE_WITHIN_TIME_RANGE_FIELD_NUMBER = 2;
  private static final class UsageWithinTimeRangeDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats>newDefaultInstance(
                com.google.cloud.datacatalog.v1beta1.Usage.internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_UsageWithinTimeRangeEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.cloud.datacatalog.v1beta1.UsageStats.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> usageWithinTimeRange_;
  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats>
  internalGetUsageWithinTimeRange() {
    if (usageWithinTimeRange_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          UsageWithinTimeRangeDefaultEntryHolder.defaultEntry);
    }
    return usageWithinTimeRange_;
  }
  public int getUsageWithinTimeRangeCount() {
    return internalGetUsageWithinTimeRange().getMap().size();
  }
  /**
   * <pre>
   * Usage statistics over each of the pre-defined time ranges, supported
   * strings for time ranges are {"24H", "7D", "30D"}.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
   */
  @java.lang.Override
  public boolean containsUsageWithinTimeRange(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetUsageWithinTimeRange().getMap().containsKey(key);
  }
  /**
   * Use {@link #getUsageWithinTimeRangeMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> getUsageWithinTimeRange() {
    return getUsageWithinTimeRangeMap();
  }
  /**
   * <pre>
   * Usage statistics over each of the pre-defined time ranges, supported
   * strings for time ranges are {"24H", "7D", "30D"}.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> getUsageWithinTimeRangeMap() {
    return internalGetUsageWithinTimeRange().getMap();
  }
  /**
   * <pre>
   * Usage statistics over each of the pre-defined time ranges, supported
   * strings for time ranges are {"24H", "7D", "30D"}.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
   */
  @java.lang.Override
  public /* nullable */
com.google.cloud.datacatalog.v1beta1.UsageStats getUsageWithinTimeRangeOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.datacatalog.v1beta1.UsageStats defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> map =
        internalGetUsageWithinTimeRange().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Usage statistics over each of the pre-defined time ranges, supported
   * strings for time ranges are {"24H", "7D", "30D"}.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.UsageStats getUsageWithinTimeRangeOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> map =
        internalGetUsageWithinTimeRange().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
      output.writeMessage(1, getUpdateTime());
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetUsageWithinTimeRange(),
        UsageWithinTimeRangeDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdateTime());
    }
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> entry
         : internalGetUsageWithinTimeRange().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats>
      usageWithinTimeRange__ = UsageWithinTimeRangeDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, usageWithinTimeRange__);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.UsageSignal)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.UsageSignal other = (com.google.cloud.datacatalog.v1beta1.UsageSignal) obj;

    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime()
          .equals(other.getUpdateTime())) return false;
    }
    if (!internalGetUsageWithinTimeRange().equals(
        other.internalGetUsageWithinTimeRange())) return false;
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
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    if (!internalGetUsageWithinTimeRange().getMap().isEmpty()) {
      hash = (37 * hash) + USAGE_WITHIN_TIME_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetUsageWithinTimeRange().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1beta1.UsageSignal parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1beta1.UsageSignal prototype) {
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
   * The set of all usage signals that we store in Data Catalog.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.UsageSignal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.UsageSignal)
      com.google.cloud.datacatalog.v1beta1.UsageSignalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.Usage.internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetUsageWithinTimeRange();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableUsageWithinTimeRange();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.Usage.internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.UsageSignal.class, com.google.cloud.datacatalog.v1beta1.UsageSignal.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.UsageSignal.newBuilder()
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
        getUpdateTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      internalGetMutableUsageWithinTimeRange().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.Usage.internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UsageSignal getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.UsageSignal.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UsageSignal build() {
      com.google.cloud.datacatalog.v1beta1.UsageSignal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UsageSignal buildPartial() {
      com.google.cloud.datacatalog.v1beta1.UsageSignal result = new com.google.cloud.datacatalog.v1beta1.UsageSignal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1beta1.UsageSignal result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateTime_ = updateTimeBuilder_ == null
            ? updateTime_
            : updateTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.usageWithinTimeRange_ = internalGetUsageWithinTimeRange().build(UsageWithinTimeRangeDefaultEntryHolder.defaultEntry);
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
      if (other instanceof com.google.cloud.datacatalog.v1beta1.UsageSignal) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.UsageSignal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.UsageSignal other) {
      if (other == com.google.cloud.datacatalog.v1beta1.UsageSignal.getDefaultInstance()) return this;
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      internalGetMutableUsageWithinTimeRange().mergeFrom(
          other.internalGetUsageWithinTimeRange());
      bitField0_ |= 0x00000002;
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
                  getUpdateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats>
              usageWithinTimeRange__ = input.readMessage(
                  UsageWithinTimeRangeDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableUsageWithinTimeRange().ensureBuilderMap().put(
                  usageWithinTimeRange__.getKey(), usageWithinTimeRange__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updateTimeBuilder_;
    /**
     * <pre>
     * The timestamp of the end of the usage statistics duration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The timestamp of the end of the usage statistics duration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The timestamp of the end of the usage statistics duration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp of the end of the usage statistics duration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp of the end of the usage statistics duration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          updateTime_ != null &&
          updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdateTimeBuilder().mergeFrom(value);
        } else {
          updateTime_ = value;
        }
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }
      if (updateTime_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The timestamp of the end of the usage statistics duration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder clearUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp of the end of the usage statistics duration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The timestamp of the end of the usage statistics duration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      }
    }
    /**
     * <pre>
     * The timestamp of the end of the usage statistics duration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(),
                getParentForChildren(),
                isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    private static final class UsageWithinTimeRangeConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStatsOrBuilder, com.google.cloud.datacatalog.v1beta1.UsageStats> {
      @java.lang.Override
      public com.google.cloud.datacatalog.v1beta1.UsageStats build(com.google.cloud.datacatalog.v1beta1.UsageStatsOrBuilder val) {
        if (val instanceof com.google.cloud.datacatalog.v1beta1.UsageStats) { return (com.google.cloud.datacatalog.v1beta1.UsageStats) val; }
        return ((com.google.cloud.datacatalog.v1beta1.UsageStats.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> defaultEntry() {
        return UsageWithinTimeRangeDefaultEntryHolder.defaultEntry;
      }
    };
    private static final UsageWithinTimeRangeConverter usageWithinTimeRangeConverter = new UsageWithinTimeRangeConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStatsOrBuilder, com.google.cloud.datacatalog.v1beta1.UsageStats, com.google.cloud.datacatalog.v1beta1.UsageStats.Builder> usageWithinTimeRange_;
    private com.google.protobuf.MapFieldBuilder<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStatsOrBuilder, com.google.cloud.datacatalog.v1beta1.UsageStats, com.google.cloud.datacatalog.v1beta1.UsageStats.Builder>
        internalGetUsageWithinTimeRange() {
      if (usageWithinTimeRange_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(usageWithinTimeRangeConverter);
      }
      return usageWithinTimeRange_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStatsOrBuilder, com.google.cloud.datacatalog.v1beta1.UsageStats, com.google.cloud.datacatalog.v1beta1.UsageStats.Builder>
        internalGetMutableUsageWithinTimeRange() {
      if (usageWithinTimeRange_ == null) {
        usageWithinTimeRange_ = new com.google.protobuf.MapFieldBuilder<>(usageWithinTimeRangeConverter);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return usageWithinTimeRange_;
    }
    public int getUsageWithinTimeRangeCount() {
      return internalGetUsageWithinTimeRange().ensureBuilderMap().size();
    }
    /**
     * <pre>
     * Usage statistics over each of the pre-defined time ranges, supported
     * strings for time ranges are {"24H", "7D", "30D"}.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
     */
    @java.lang.Override
    public boolean containsUsageWithinTimeRange(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetUsageWithinTimeRange().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getUsageWithinTimeRangeMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> getUsageWithinTimeRange() {
      return getUsageWithinTimeRangeMap();
    }
    /**
     * <pre>
     * Usage statistics over each of the pre-defined time ranges, supported
     * strings for time ranges are {"24H", "7D", "30D"}.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> getUsageWithinTimeRangeMap() {
      return internalGetUsageWithinTimeRange().getImmutableMap();
    }
    /**
     * <pre>
     * Usage statistics over each of the pre-defined time ranges, supported
     * strings for time ranges are {"24H", "7D", "30D"}.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
com.google.cloud.datacatalog.v1beta1.UsageStats getUsageWithinTimeRangeOrDefault(
        java.lang.String key,
        /* nullable */
com.google.cloud.datacatalog.v1beta1.UsageStats defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStatsOrBuilder> map = internalGetMutableUsageWithinTimeRange().ensureBuilderMap();
      return map.containsKey(key) ? usageWithinTimeRangeConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <pre>
     * Usage statistics over each of the pre-defined time ranges, supported
     * strings for time ranges are {"24H", "7D", "30D"}.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UsageStats getUsageWithinTimeRangeOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStatsOrBuilder> map = internalGetMutableUsageWithinTimeRange().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return usageWithinTimeRangeConverter.build(map.get(key));
    }
    public Builder clearUsageWithinTimeRange() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableUsageWithinTimeRange().clear();
      return this;
    }
    /**
     * <pre>
     * Usage statistics over each of the pre-defined time ranges, supported
     * strings for time ranges are {"24H", "7D", "30D"}.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
     */
    public Builder removeUsageWithinTimeRange(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableUsageWithinTimeRange().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats>
        getMutableUsageWithinTimeRange() {
      bitField0_ |= 0x00000002;
      return internalGetMutableUsageWithinTimeRange().ensureMessageMap();
    }
    /**
     * <pre>
     * Usage statistics over each of the pre-defined time ranges, supported
     * strings for time ranges are {"24H", "7D", "30D"}.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
     */
    public Builder putUsageWithinTimeRange(
        java.lang.String key,
        com.google.cloud.datacatalog.v1beta1.UsageStats value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableUsageWithinTimeRange().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Usage statistics over each of the pre-defined time ranges, supported
     * strings for time ranges are {"24H", "7D", "30D"}.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
     */
    public Builder putAllUsageWithinTimeRange(
        java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> values) {
      for (java.util.Map.Entry<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStats> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableUsageWithinTimeRange().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Usage statistics over each of the pre-defined time ranges, supported
     * strings for time ranges are {"24H", "7D", "30D"}.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.UsageStats&gt; usage_within_time_range = 2;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.UsageStats.Builder putUsageWithinTimeRangeBuilderIfAbsent(
        java.lang.String key) {
      java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.UsageStatsOrBuilder> builderMap = internalGetMutableUsageWithinTimeRange().ensureBuilderMap();
      com.google.cloud.datacatalog.v1beta1.UsageStatsOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.google.cloud.datacatalog.v1beta1.UsageStats.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.google.cloud.datacatalog.v1beta1.UsageStats) {
        entry = ((com.google.cloud.datacatalog.v1beta1.UsageStats) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.google.cloud.datacatalog.v1beta1.UsageStats.Builder) entry;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.UsageSignal)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.UsageSignal)
  private static final com.google.cloud.datacatalog.v1beta1.UsageSignal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.UsageSignal();
  }

  public static com.google.cloud.datacatalog.v1beta1.UsageSignal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsageSignal>
      PARSER = new com.google.protobuf.AbstractParser<UsageSignal>() {
    @java.lang.Override
    public UsageSignal parsePartialFrom(
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

  public static com.google.protobuf.Parser<UsageSignal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsageSignal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.UsageSignal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

