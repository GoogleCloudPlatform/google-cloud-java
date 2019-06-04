// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1beta1/cloud_redis.proto

package com.google.cloud.redis.v1beta1;

/**
 *
 *
 * <pre>
 * This location metadata represents additional configuration options for a
 * given location where a Redis instance may be created. All fields are output
 * only. It is returned as content of the
 * `google.cloud.location.Location.metadata` field.
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1beta1.LocationMetadata}
 */
public final class LocationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1beta1.LocationMetadata)
    LocationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LocationMetadata.newBuilder() to construct.
  private LocationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LocationMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LocationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LocationMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                availableZones_ =
                    com.google.protobuf.MapField.newMapField(
                        AvailableZonesDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<
                      java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
                  availableZones__ =
                      input.readMessage(
                          AvailableZonesDefaultEntryHolder.defaultEntry.getParserForType(),
                          extensionRegistry);
              availableZones_
                  .getMutableMap()
                  .put(availableZones__.getKey(), availableZones__.getValue());
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
        .internal_static_google_cloud_redis_v1beta1_LocationMetadata_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetAvailableZones();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
        .internal_static_google_cloud_redis_v1beta1_LocationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1beta1.LocationMetadata.class,
            com.google.cloud.redis.v1beta1.LocationMetadata.Builder.class);
  }

  public static final int AVAILABLE_ZONES_FIELD_NUMBER = 1;

  private static final class AvailableZonesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>newDefaultInstance(
                    com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
                        .internal_static_google_cloud_redis_v1beta1_LocationMetadata_AvailableZonesEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                    com.google.cloud.redis.v1beta1.ZoneMetadata.getDefaultInstance());
  }

  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
      availableZones_;

  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
      internalGetAvailableZones() {
    if (availableZones_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AvailableZonesDefaultEntryHolder.defaultEntry);
    }
    return availableZones_;
  }

  public int getAvailableZonesCount() {
    return internalGetAvailableZones().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Output only. The set of available zones in the location. The map is keyed
   * by the lowercase ID of each zone, as defined by GCE. These keys can be
   * specified in `location_id` or `alternative_location_id` fields when
   * creating a Redis instance.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
   */
  public boolean containsAvailableZones(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetAvailableZones().getMap().containsKey(key);
  }
  /** Use {@link #getAvailableZonesMap()} instead. */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
      getAvailableZones() {
    return getAvailableZonesMap();
  }
  /**
   *
   *
   * <pre>
   * Output only. The set of available zones in the location. The map is keyed
   * by the lowercase ID of each zone, as defined by GCE. These keys can be
   * specified in `location_id` or `alternative_location_id` fields when
   * creating a Redis instance.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
   */
  public java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
      getAvailableZonesMap() {
    return internalGetAvailableZones().getMap();
  }
  /**
   *
   *
   * <pre>
   * Output only. The set of available zones in the location. The map is keyed
   * by the lowercase ID of each zone, as defined by GCE. These keys can be
   * specified in `location_id` or `alternative_location_id` fields when
   * creating a Redis instance.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
   */
  public com.google.cloud.redis.v1beta1.ZoneMetadata getAvailableZonesOrDefault(
      java.lang.String key, com.google.cloud.redis.v1beta1.ZoneMetadata defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata> map =
        internalGetAvailableZones().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Output only. The set of available zones in the location. The map is keyed
   * by the lowercase ID of each zone, as defined by GCE. These keys can be
   * specified in `location_id` or `alternative_location_id` fields when
   * creating a Redis instance.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
   */
  public com.google.cloud.redis.v1beta1.ZoneMetadata getAvailableZonesOrThrow(
      java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata> map =
        internalGetAvailableZones().getMap();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetAvailableZones(), AvailableZonesDefaultEntryHolder.defaultEntry, 1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata> entry :
        internalGetAvailableZones().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
          availableZones__ =
              AvailableZonesDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, availableZones__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.redis.v1beta1.LocationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1beta1.LocationMetadata other =
        (com.google.cloud.redis.v1beta1.LocationMetadata) obj;

    if (!internalGetAvailableZones().equals(other.internalGetAvailableZones())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetAvailableZones().getMap().isEmpty()) {
      hash = (37 * hash) + AVAILABLE_ZONES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAvailableZones().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.redis.v1beta1.LocationMetadata prototype) {
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
   * This location metadata represents additional configuration options for a
   * given location where a Redis instance may be created. All fields are output
   * only. It is returned as content of the
   * `google.cloud.location.Location.metadata` field.
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1beta1.LocationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1beta1.LocationMetadata)
      com.google.cloud.redis.v1beta1.LocationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
          .internal_static_google_cloud_redis_v1beta1_LocationMetadata_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetAvailableZones();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableAvailableZones();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
          .internal_static_google_cloud_redis_v1beta1_LocationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1beta1.LocationMetadata.class,
              com.google.cloud.redis.v1beta1.LocationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1beta1.LocationMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableAvailableZones().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
          .internal_static_google_cloud_redis_v1beta1_LocationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.LocationMetadata getDefaultInstanceForType() {
      return com.google.cloud.redis.v1beta1.LocationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.LocationMetadata build() {
      com.google.cloud.redis.v1beta1.LocationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.LocationMetadata buildPartial() {
      com.google.cloud.redis.v1beta1.LocationMetadata result =
          new com.google.cloud.redis.v1beta1.LocationMetadata(this);
      int from_bitField0_ = bitField0_;
      result.availableZones_ = internalGetAvailableZones();
      result.availableZones_.makeImmutable();
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.redis.v1beta1.LocationMetadata) {
        return mergeFrom((com.google.cloud.redis.v1beta1.LocationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1beta1.LocationMetadata other) {
      if (other == com.google.cloud.redis.v1beta1.LocationMetadata.getDefaultInstance())
        return this;
      internalGetMutableAvailableZones().mergeFrom(other.internalGetAvailableZones());
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.redis.v1beta1.LocationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.redis.v1beta1.LocationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
        availableZones_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
        internalGetAvailableZones() {
      if (availableZones_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AvailableZonesDefaultEntryHolder.defaultEntry);
      }
      return availableZones_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
        internalGetMutableAvailableZones() {
      onChanged();
      ;
      if (availableZones_ == null) {
        availableZones_ =
            com.google.protobuf.MapField.newMapField(AvailableZonesDefaultEntryHolder.defaultEntry);
      }
      if (!availableZones_.isMutable()) {
        availableZones_ = availableZones_.copy();
      }
      return availableZones_;
    }

    public int getAvailableZonesCount() {
      return internalGetAvailableZones().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Output only. The set of available zones in the location. The map is keyed
     * by the lowercase ID of each zone, as defined by GCE. These keys can be
     * specified in `location_id` or `alternative_location_id` fields when
     * creating a Redis instance.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
     */
    public boolean containsAvailableZones(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetAvailableZones().getMap().containsKey(key);
    }
    /** Use {@link #getAvailableZonesMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
        getAvailableZones() {
      return getAvailableZonesMap();
    }
    /**
     *
     *
     * <pre>
     * Output only. The set of available zones in the location. The map is keyed
     * by the lowercase ID of each zone, as defined by GCE. These keys can be
     * specified in `location_id` or `alternative_location_id` fields when
     * creating a Redis instance.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
     */
    public java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
        getAvailableZonesMap() {
      return internalGetAvailableZones().getMap();
    }
    /**
     *
     *
     * <pre>
     * Output only. The set of available zones in the location. The map is keyed
     * by the lowercase ID of each zone, as defined by GCE. These keys can be
     * specified in `location_id` or `alternative_location_id` fields when
     * creating a Redis instance.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
     */
    public com.google.cloud.redis.v1beta1.ZoneMetadata getAvailableZonesOrDefault(
        java.lang.String key, com.google.cloud.redis.v1beta1.ZoneMetadata defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata> map =
          internalGetAvailableZones().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Output only. The set of available zones in the location. The map is keyed
     * by the lowercase ID of each zone, as defined by GCE. These keys can be
     * specified in `location_id` or `alternative_location_id` fields when
     * creating a Redis instance.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
     */
    public com.google.cloud.redis.v1beta1.ZoneMetadata getAvailableZonesOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata> map =
          internalGetAvailableZones().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAvailableZones() {
      internalGetMutableAvailableZones().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The set of available zones in the location. The map is keyed
     * by the lowercase ID of each zone, as defined by GCE. These keys can be
     * specified in `location_id` or `alternative_location_id` fields when
     * creating a Redis instance.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
     */
    public Builder removeAvailableZones(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableAvailableZones().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata>
        getMutableAvailableZones() {
      return internalGetMutableAvailableZones().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Output only. The set of available zones in the location. The map is keyed
     * by the lowercase ID of each zone, as defined by GCE. These keys can be
     * specified in `location_id` or `alternative_location_id` fields when
     * creating a Redis instance.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
     */
    public Builder putAvailableZones(
        java.lang.String key, com.google.cloud.redis.v1beta1.ZoneMetadata value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableAvailableZones().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The set of available zones in the location. The map is keyed
     * by the lowercase ID of each zone, as defined by GCE. These keys can be
     * specified in `location_id` or `alternative_location_id` fields when
     * creating a Redis instance.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.redis.v1beta1.ZoneMetadata&gt; available_zones = 1;</code>
     */
    public Builder putAllAvailableZones(
        java.util.Map<java.lang.String, com.google.cloud.redis.v1beta1.ZoneMetadata> values) {
      internalGetMutableAvailableZones().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1beta1.LocationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1beta1.LocationMetadata)
  private static final com.google.cloud.redis.v1beta1.LocationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1beta1.LocationMetadata();
  }

  public static com.google.cloud.redis.v1beta1.LocationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<LocationMetadata>() {
        @java.lang.Override
        public LocationMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LocationMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LocationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.v1beta1.LocationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
