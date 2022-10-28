// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1beta1/webrisk.proto

package com.google.webrisk.v1beta1;

/**
 * <pre>
 * Contains the set of entries to remove from a local database.
 * </pre>
 *
 * Protobuf type {@code google.cloud.webrisk.v1beta1.ThreatEntryRemovals}
 */
public final class ThreatEntryRemovals extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.webrisk.v1beta1.ThreatEntryRemovals)
    ThreatEntryRemovalsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreatEntryRemovals.newBuilder() to construct.
  private ThreatEntryRemovals(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreatEntryRemovals() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreatEntryRemovals();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.webrisk.v1beta1.ThreatEntryRemovals.class, com.google.webrisk.v1beta1.ThreatEntryRemovals.Builder.class);
  }

  public static final int RAW_INDICES_FIELD_NUMBER = 1;
  private com.google.webrisk.v1beta1.RawIndices rawIndices_;
  /**
   * <pre>
   * The raw removal indices for a local list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
   * @return Whether the rawIndices field is set.
   */
  @java.lang.Override
  public boolean hasRawIndices() {
    return rawIndices_ != null;
  }
  /**
   * <pre>
   * The raw removal indices for a local list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
   * @return The rawIndices.
   */
  @java.lang.Override
  public com.google.webrisk.v1beta1.RawIndices getRawIndices() {
    return rawIndices_ == null ? com.google.webrisk.v1beta1.RawIndices.getDefaultInstance() : rawIndices_;
  }
  /**
   * <pre>
   * The raw removal indices for a local list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
   */
  @java.lang.Override
  public com.google.webrisk.v1beta1.RawIndicesOrBuilder getRawIndicesOrBuilder() {
    return getRawIndices();
  }

  public static final int RICE_INDICES_FIELD_NUMBER = 2;
  private com.google.webrisk.v1beta1.RiceDeltaEncoding riceIndices_;
  /**
   * <pre>
   * The encoded local, lexicographically-sorted list indices, using a
   * Golomb-Rice encoding. Used for sending compressed removal indices. The
   * removal indices (uint32) are sorted in ascending order, then delta encoded
   * and stored as encoded_data.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
   * @return Whether the riceIndices field is set.
   */
  @java.lang.Override
  public boolean hasRiceIndices() {
    return riceIndices_ != null;
  }
  /**
   * <pre>
   * The encoded local, lexicographically-sorted list indices, using a
   * Golomb-Rice encoding. Used for sending compressed removal indices. The
   * removal indices (uint32) are sorted in ascending order, then delta encoded
   * and stored as encoded_data.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
   * @return The riceIndices.
   */
  @java.lang.Override
  public com.google.webrisk.v1beta1.RiceDeltaEncoding getRiceIndices() {
    return riceIndices_ == null ? com.google.webrisk.v1beta1.RiceDeltaEncoding.getDefaultInstance() : riceIndices_;
  }
  /**
   * <pre>
   * The encoded local, lexicographically-sorted list indices, using a
   * Golomb-Rice encoding. Used for sending compressed removal indices. The
   * removal indices (uint32) are sorted in ascending order, then delta encoded
   * and stored as encoded_data.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
   */
  @java.lang.Override
  public com.google.webrisk.v1beta1.RiceDeltaEncodingOrBuilder getRiceIndicesOrBuilder() {
    return getRiceIndices();
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
    if (rawIndices_ != null) {
      output.writeMessage(1, getRawIndices());
    }
    if (riceIndices_ != null) {
      output.writeMessage(2, getRiceIndices());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rawIndices_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRawIndices());
    }
    if (riceIndices_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRiceIndices());
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
    if (!(obj instanceof com.google.webrisk.v1beta1.ThreatEntryRemovals)) {
      return super.equals(obj);
    }
    com.google.webrisk.v1beta1.ThreatEntryRemovals other = (com.google.webrisk.v1beta1.ThreatEntryRemovals) obj;

    if (hasRawIndices() != other.hasRawIndices()) return false;
    if (hasRawIndices()) {
      if (!getRawIndices()
          .equals(other.getRawIndices())) return false;
    }
    if (hasRiceIndices() != other.hasRiceIndices()) return false;
    if (hasRiceIndices()) {
      if (!getRiceIndices()
          .equals(other.getRiceIndices())) return false;
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
    if (hasRawIndices()) {
      hash = (37 * hash) + RAW_INDICES_FIELD_NUMBER;
      hash = (53 * hash) + getRawIndices().hashCode();
    }
    if (hasRiceIndices()) {
      hash = (37 * hash) + RICE_INDICES_FIELD_NUMBER;
      hash = (53 * hash) + getRiceIndices().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1beta1.ThreatEntryRemovals parseFrom(
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
  public static Builder newBuilder(com.google.webrisk.v1beta1.ThreatEntryRemovals prototype) {
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
   * Contains the set of entries to remove from a local database.
   * </pre>
   *
   * Protobuf type {@code google.cloud.webrisk.v1beta1.ThreatEntryRemovals}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.webrisk.v1beta1.ThreatEntryRemovals)
      com.google.webrisk.v1beta1.ThreatEntryRemovalsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.webrisk.v1beta1.ThreatEntryRemovals.class, com.google.webrisk.v1beta1.ThreatEntryRemovals.Builder.class);
    }

    // Construct using com.google.webrisk.v1beta1.ThreatEntryRemovals.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rawIndicesBuilder_ == null) {
        rawIndices_ = null;
      } else {
        rawIndices_ = null;
        rawIndicesBuilder_ = null;
      }
      if (riceIndicesBuilder_ == null) {
        riceIndices_ = null;
      } else {
        riceIndices_ = null;
        riceIndicesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_descriptor;
    }

    @java.lang.Override
    public com.google.webrisk.v1beta1.ThreatEntryRemovals getDefaultInstanceForType() {
      return com.google.webrisk.v1beta1.ThreatEntryRemovals.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.webrisk.v1beta1.ThreatEntryRemovals build() {
      com.google.webrisk.v1beta1.ThreatEntryRemovals result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.webrisk.v1beta1.ThreatEntryRemovals buildPartial() {
      com.google.webrisk.v1beta1.ThreatEntryRemovals result = new com.google.webrisk.v1beta1.ThreatEntryRemovals(this);
      if (rawIndicesBuilder_ == null) {
        result.rawIndices_ = rawIndices_;
      } else {
        result.rawIndices_ = rawIndicesBuilder_.build();
      }
      if (riceIndicesBuilder_ == null) {
        result.riceIndices_ = riceIndices_;
      } else {
        result.riceIndices_ = riceIndicesBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.webrisk.v1beta1.ThreatEntryRemovals) {
        return mergeFrom((com.google.webrisk.v1beta1.ThreatEntryRemovals)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.webrisk.v1beta1.ThreatEntryRemovals other) {
      if (other == com.google.webrisk.v1beta1.ThreatEntryRemovals.getDefaultInstance()) return this;
      if (other.hasRawIndices()) {
        mergeRawIndices(other.getRawIndices());
      }
      if (other.hasRiceIndices()) {
        mergeRiceIndices(other.getRiceIndices());
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
                  getRawIndicesFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRiceIndicesFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private com.google.webrisk.v1beta1.RawIndices rawIndices_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.webrisk.v1beta1.RawIndices, com.google.webrisk.v1beta1.RawIndices.Builder, com.google.webrisk.v1beta1.RawIndicesOrBuilder> rawIndicesBuilder_;
    /**
     * <pre>
     * The raw removal indices for a local list.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
     * @return Whether the rawIndices field is set.
     */
    public boolean hasRawIndices() {
      return rawIndicesBuilder_ != null || rawIndices_ != null;
    }
    /**
     * <pre>
     * The raw removal indices for a local list.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
     * @return The rawIndices.
     */
    public com.google.webrisk.v1beta1.RawIndices getRawIndices() {
      if (rawIndicesBuilder_ == null) {
        return rawIndices_ == null ? com.google.webrisk.v1beta1.RawIndices.getDefaultInstance() : rawIndices_;
      } else {
        return rawIndicesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The raw removal indices for a local list.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
     */
    public Builder setRawIndices(com.google.webrisk.v1beta1.RawIndices value) {
      if (rawIndicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rawIndices_ = value;
        onChanged();
      } else {
        rawIndicesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The raw removal indices for a local list.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
     */
    public Builder setRawIndices(
        com.google.webrisk.v1beta1.RawIndices.Builder builderForValue) {
      if (rawIndicesBuilder_ == null) {
        rawIndices_ = builderForValue.build();
        onChanged();
      } else {
        rawIndicesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The raw removal indices for a local list.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
     */
    public Builder mergeRawIndices(com.google.webrisk.v1beta1.RawIndices value) {
      if (rawIndicesBuilder_ == null) {
        if (rawIndices_ != null) {
          rawIndices_ =
            com.google.webrisk.v1beta1.RawIndices.newBuilder(rawIndices_).mergeFrom(value).buildPartial();
        } else {
          rawIndices_ = value;
        }
        onChanged();
      } else {
        rawIndicesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The raw removal indices for a local list.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
     */
    public Builder clearRawIndices() {
      if (rawIndicesBuilder_ == null) {
        rawIndices_ = null;
        onChanged();
      } else {
        rawIndices_ = null;
        rawIndicesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The raw removal indices for a local list.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
     */
    public com.google.webrisk.v1beta1.RawIndices.Builder getRawIndicesBuilder() {
      
      onChanged();
      return getRawIndicesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The raw removal indices for a local list.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
     */
    public com.google.webrisk.v1beta1.RawIndicesOrBuilder getRawIndicesOrBuilder() {
      if (rawIndicesBuilder_ != null) {
        return rawIndicesBuilder_.getMessageOrBuilder();
      } else {
        return rawIndices_ == null ?
            com.google.webrisk.v1beta1.RawIndices.getDefaultInstance() : rawIndices_;
      }
    }
    /**
     * <pre>
     * The raw removal indices for a local list.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.webrisk.v1beta1.RawIndices, com.google.webrisk.v1beta1.RawIndices.Builder, com.google.webrisk.v1beta1.RawIndicesOrBuilder> 
        getRawIndicesFieldBuilder() {
      if (rawIndicesBuilder_ == null) {
        rawIndicesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.webrisk.v1beta1.RawIndices, com.google.webrisk.v1beta1.RawIndices.Builder, com.google.webrisk.v1beta1.RawIndicesOrBuilder>(
                getRawIndices(),
                getParentForChildren(),
                isClean());
        rawIndices_ = null;
      }
      return rawIndicesBuilder_;
    }

    private com.google.webrisk.v1beta1.RiceDeltaEncoding riceIndices_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.webrisk.v1beta1.RiceDeltaEncoding, com.google.webrisk.v1beta1.RiceDeltaEncoding.Builder, com.google.webrisk.v1beta1.RiceDeltaEncodingOrBuilder> riceIndicesBuilder_;
    /**
     * <pre>
     * The encoded local, lexicographically-sorted list indices, using a
     * Golomb-Rice encoding. Used for sending compressed removal indices. The
     * removal indices (uint32) are sorted in ascending order, then delta encoded
     * and stored as encoded_data.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
     * @return Whether the riceIndices field is set.
     */
    public boolean hasRiceIndices() {
      return riceIndicesBuilder_ != null || riceIndices_ != null;
    }
    /**
     * <pre>
     * The encoded local, lexicographically-sorted list indices, using a
     * Golomb-Rice encoding. Used for sending compressed removal indices. The
     * removal indices (uint32) are sorted in ascending order, then delta encoded
     * and stored as encoded_data.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
     * @return The riceIndices.
     */
    public com.google.webrisk.v1beta1.RiceDeltaEncoding getRiceIndices() {
      if (riceIndicesBuilder_ == null) {
        return riceIndices_ == null ? com.google.webrisk.v1beta1.RiceDeltaEncoding.getDefaultInstance() : riceIndices_;
      } else {
        return riceIndicesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The encoded local, lexicographically-sorted list indices, using a
     * Golomb-Rice encoding. Used for sending compressed removal indices. The
     * removal indices (uint32) are sorted in ascending order, then delta encoded
     * and stored as encoded_data.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
     */
    public Builder setRiceIndices(com.google.webrisk.v1beta1.RiceDeltaEncoding value) {
      if (riceIndicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        riceIndices_ = value;
        onChanged();
      } else {
        riceIndicesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The encoded local, lexicographically-sorted list indices, using a
     * Golomb-Rice encoding. Used for sending compressed removal indices. The
     * removal indices (uint32) are sorted in ascending order, then delta encoded
     * and stored as encoded_data.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
     */
    public Builder setRiceIndices(
        com.google.webrisk.v1beta1.RiceDeltaEncoding.Builder builderForValue) {
      if (riceIndicesBuilder_ == null) {
        riceIndices_ = builderForValue.build();
        onChanged();
      } else {
        riceIndicesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The encoded local, lexicographically-sorted list indices, using a
     * Golomb-Rice encoding. Used for sending compressed removal indices. The
     * removal indices (uint32) are sorted in ascending order, then delta encoded
     * and stored as encoded_data.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
     */
    public Builder mergeRiceIndices(com.google.webrisk.v1beta1.RiceDeltaEncoding value) {
      if (riceIndicesBuilder_ == null) {
        if (riceIndices_ != null) {
          riceIndices_ =
            com.google.webrisk.v1beta1.RiceDeltaEncoding.newBuilder(riceIndices_).mergeFrom(value).buildPartial();
        } else {
          riceIndices_ = value;
        }
        onChanged();
      } else {
        riceIndicesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The encoded local, lexicographically-sorted list indices, using a
     * Golomb-Rice encoding. Used for sending compressed removal indices. The
     * removal indices (uint32) are sorted in ascending order, then delta encoded
     * and stored as encoded_data.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
     */
    public Builder clearRiceIndices() {
      if (riceIndicesBuilder_ == null) {
        riceIndices_ = null;
        onChanged();
      } else {
        riceIndices_ = null;
        riceIndicesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The encoded local, lexicographically-sorted list indices, using a
     * Golomb-Rice encoding. Used for sending compressed removal indices. The
     * removal indices (uint32) are sorted in ascending order, then delta encoded
     * and stored as encoded_data.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
     */
    public com.google.webrisk.v1beta1.RiceDeltaEncoding.Builder getRiceIndicesBuilder() {
      
      onChanged();
      return getRiceIndicesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The encoded local, lexicographically-sorted list indices, using a
     * Golomb-Rice encoding. Used for sending compressed removal indices. The
     * removal indices (uint32) are sorted in ascending order, then delta encoded
     * and stored as encoded_data.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
     */
    public com.google.webrisk.v1beta1.RiceDeltaEncodingOrBuilder getRiceIndicesOrBuilder() {
      if (riceIndicesBuilder_ != null) {
        return riceIndicesBuilder_.getMessageOrBuilder();
      } else {
        return riceIndices_ == null ?
            com.google.webrisk.v1beta1.RiceDeltaEncoding.getDefaultInstance() : riceIndices_;
      }
    }
    /**
     * <pre>
     * The encoded local, lexicographically-sorted list indices, using a
     * Golomb-Rice encoding. Used for sending compressed removal indices. The
     * removal indices (uint32) are sorted in ascending order, then delta encoded
     * and stored as encoded_data.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.webrisk.v1beta1.RiceDeltaEncoding, com.google.webrisk.v1beta1.RiceDeltaEncoding.Builder, com.google.webrisk.v1beta1.RiceDeltaEncodingOrBuilder> 
        getRiceIndicesFieldBuilder() {
      if (riceIndicesBuilder_ == null) {
        riceIndicesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.webrisk.v1beta1.RiceDeltaEncoding, com.google.webrisk.v1beta1.RiceDeltaEncoding.Builder, com.google.webrisk.v1beta1.RiceDeltaEncodingOrBuilder>(
                getRiceIndices(),
                getParentForChildren(),
                isClean());
        riceIndices_ = null;
      }
      return riceIndicesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.webrisk.v1beta1.ThreatEntryRemovals)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.webrisk.v1beta1.ThreatEntryRemovals)
  private static final com.google.webrisk.v1beta1.ThreatEntryRemovals DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.webrisk.v1beta1.ThreatEntryRemovals();
  }

  public static com.google.webrisk.v1beta1.ThreatEntryRemovals getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreatEntryRemovals>
      PARSER = new com.google.protobuf.AbstractParser<ThreatEntryRemovals>() {
    @java.lang.Override
    public ThreatEntryRemovals parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThreatEntryRemovals> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreatEntryRemovals> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.webrisk.v1beta1.ThreatEntryRemovals getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

