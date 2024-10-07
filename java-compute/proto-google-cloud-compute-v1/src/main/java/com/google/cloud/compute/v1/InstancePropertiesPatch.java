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

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Represents the change that you want to make to the instance properties.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstancePropertiesPatch}
 */
public final class InstancePropertiesPatch extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstancePropertiesPatch)
    InstancePropertiesPatchOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstancePropertiesPatch.newBuilder() to construct.
  private InstancePropertiesPatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstancePropertiesPatch() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstancePropertiesPatch();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancePropertiesPatch_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 500195327:
        return internalGetLabels();
      case 86866735:
        return internalGetMetadata();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancePropertiesPatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstancePropertiesPatch.class,
            com.google.cloud.compute.v1.InstancePropertiesPatch.Builder.class);
  }

  public static final int LABELS_FIELD_NUMBER = 500195327;

  private static final class LabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.compute.v1.Compute
                .internal_static_google_cloud_compute_v1_InstancePropertiesPatch_LabelsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
    if (labels_ == null) {
      return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
    }
    return labels_;
  }

  public int getLabelsCount() {
    return internalGetLabels().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * The label key-value pairs that you want to patch onto the instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  @java.lang.Override
  public boolean containsLabels(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetLabels().getMap().containsKey(key);
  }
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }
  /**
   *
   *
   * <pre>
   * The label key-value pairs that you want to patch onto the instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return internalGetLabels().getMap();
  }
  /**
   *
   *
   * <pre>
   * The label key-value pairs that you want to patch onto the instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * The label key-value pairs that you want to patch onto the instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  @java.lang.Override
  public java.lang.String getLabelsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int METADATA_FIELD_NUMBER = 86866735;

  private static final class MetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.compute.v1.Compute
                .internal_static_google_cloud_compute_v1_InstancePropertiesPatch_MetadataEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> metadata_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMetadata() {
    if (metadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(MetadataDefaultEntryHolder.defaultEntry);
    }
    return metadata_;
  }

  public int getMetadataCount() {
    return internalGetMetadata().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  @java.lang.Override
  public boolean containsMetadata(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetMetadata().getMap().containsKey(key);
  }
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
    return getMetadataMap();
  }
  /**
   *
   *
   * <pre>
   * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
    return internalGetMetadata().getMap();
  }
  /**
   *
   *
   * <pre>
   * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  @java.lang.Override
  public java.lang.String getMetadataOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
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
        output, internalGetMetadata(), MetadataDefaultEntryHolder.defaultEntry, 86866735);
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetLabels(), LabelsDefaultEntryHolder.defaultEntry, 500195327);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> metadata__ =
          MetadataDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(86866735, metadata__);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetLabels().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
          LabelsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(500195327, labels__);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstancePropertiesPatch)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstancePropertiesPatch other =
        (com.google.cloud.compute.v1.InstancePropertiesPatch) obj;

    if (!internalGetLabels().equals(other.internalGetLabels())) return false;
    if (!internalGetMetadata().equals(other.internalGetMetadata())) return false;
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
    if (!internalGetLabels().getMap().isEmpty()) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabels().hashCode();
    }
    if (!internalGetMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.InstancePropertiesPatch prototype) {
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
   * Represents the change that you want to make to the instance properties.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstancePropertiesPatch}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstancePropertiesPatch)
      com.google.cloud.compute.v1.InstancePropertiesPatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancePropertiesPatch_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 500195327:
          return internalGetLabels();
        case 86866735:
          return internalGetMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 500195327:
          return internalGetMutableLabels();
        case 86866735:
          return internalGetMutableMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancePropertiesPatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstancePropertiesPatch.class,
              com.google.cloud.compute.v1.InstancePropertiesPatch.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstancePropertiesPatch.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableLabels().clear();
      internalGetMutableMetadata().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancePropertiesPatch_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancePropertiesPatch getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstancePropertiesPatch.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancePropertiesPatch build() {
      com.google.cloud.compute.v1.InstancePropertiesPatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancePropertiesPatch buildPartial() {
      com.google.cloud.compute.v1.InstancePropertiesPatch result =
          new com.google.cloud.compute.v1.InstancePropertiesPatch(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.InstancePropertiesPatch result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.labels_ = internalGetLabels();
        result.labels_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = internalGetMetadata();
        result.metadata_.makeImmutable();
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
      if (other instanceof com.google.cloud.compute.v1.InstancePropertiesPatch) {
        return mergeFrom((com.google.cloud.compute.v1.InstancePropertiesPatch) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstancePropertiesPatch other) {
      if (other == com.google.cloud.compute.v1.InstancePropertiesPatch.getDefaultInstance())
        return this;
      internalGetMutableLabels().mergeFrom(other.internalGetLabels());
      bitField0_ |= 0x00000001;
      internalGetMutableMetadata().mergeFrom(other.internalGetMetadata());
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
            case 694933882:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> metadata__ =
                    input.readMessage(
                        MetadataDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableMetadata()
                    .getMutableMap()
                    .put(metadata__.getKey(), metadata__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 694933882
            case -293404678:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
                    input.readMessage(
                        LabelsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableLabels()
                    .getMutableMap()
                    .put(labels__.getKey(), labels__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case -293404678
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
      if (labels_ == null) {
        return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      return labels_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableLabels() {
      if (labels_ == null) {
        labels_ = com.google.protobuf.MapField.newMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      if (!labels_.isMutable()) {
        labels_ = labels_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return labels_;
    }

    public int getLabelsCount() {
      return internalGetLabels().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * The label key-value pairs that you want to patch onto the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    @java.lang.Override
    public boolean containsLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetLabels().getMap().containsKey(key);
    }
    /** Use {@link #getLabelsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }
    /**
     *
     *
     * <pre>
     * The label key-value pairs that you want to patch onto the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return internalGetLabels().getMap();
    }
    /**
     *
     *
     * <pre>
     * The label key-value pairs that you want to patch onto the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getLabelsOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * The label key-value pairs that you want to patch onto the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    @java.lang.Override
    public java.lang.String getLabelsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLabels() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableLabels().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The label key-value pairs that you want to patch onto the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    public Builder removeLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableLabels().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableLabels() {
      bitField0_ |= 0x00000001;
      return internalGetMutableLabels().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * The label key-value pairs that you want to patch onto the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    public Builder putLabels(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableLabels().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The label key-value pairs that you want to patch onto the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    public Builder putAllLabels(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLabels().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> metadata_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMetadata() {
      if (metadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(MetadataDefaultEntryHolder.defaultEntry);
      }
      return metadata_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableMetadata() {
      if (metadata_ == null) {
        metadata_ =
            com.google.protobuf.MapField.newMapField(MetadataDefaultEntryHolder.defaultEntry);
      }
      if (!metadata_.isMutable()) {
        metadata_ = metadata_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return metadata_;
    }

    public int getMetadataCount() {
      return internalGetMetadata().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    @java.lang.Override
    public boolean containsMetadata(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetMetadata().getMap().containsKey(key);
    }
    /** Use {@link #getMetadataMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
      return getMetadataMap();
    }
    /**
     *
     *
     * <pre>
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
      return internalGetMetadata().getMap();
    }
    /**
     *
     *
     * <pre>
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getMetadataOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    @java.lang.Override
    public java.lang.String getMetadataOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableMetadata().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    public Builder removeMetadata(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableMetadata().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableMetadata() {
      bitField0_ |= 0x00000002;
      return internalGetMutableMetadata().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    public Builder putMetadata(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableMetadata().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    public Builder putAllMetadata(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMetadata().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstancePropertiesPatch)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstancePropertiesPatch)
  private static final com.google.cloud.compute.v1.InstancePropertiesPatch DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstancePropertiesPatch();
  }

  public static com.google.cloud.compute.v1.InstancePropertiesPatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstancePropertiesPatch> PARSER =
      new com.google.protobuf.AbstractParser<InstancePropertiesPatch>() {
        @java.lang.Override
        public InstancePropertiesPatch parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstancePropertiesPatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstancePropertiesPatch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstancePropertiesPatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
