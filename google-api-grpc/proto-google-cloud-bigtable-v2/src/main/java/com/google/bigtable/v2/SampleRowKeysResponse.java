// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

package com.google.bigtable.v2;

/**
 *
 *
 * <pre>
 * Response message for Bigtable.SampleRowKeys.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.SampleRowKeysResponse}
 */
public final class SampleRowKeysResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.SampleRowKeysResponse)
    SampleRowKeysResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SampleRowKeysResponse.newBuilder() to construct.
  private SampleRowKeysResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SampleRowKeysResponse() {
    rowKey_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SampleRowKeysResponse(
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
              rowKey_ = input.readBytes();
              break;
            }
          case 16:
            {
              offsetBytes_ = input.readInt64();
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
    return com.google.bigtable.v2.BigtableProto
        .internal_static_google_bigtable_v2_SampleRowKeysResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.BigtableProto
        .internal_static_google_bigtable_v2_SampleRowKeysResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.SampleRowKeysResponse.class,
            com.google.bigtable.v2.SampleRowKeysResponse.Builder.class);
  }

  public static final int ROW_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString rowKey_;
  /**
   *
   *
   * <pre>
   * Sorted streamed sequence of sample row keys in the table. The table might
   * have contents before the first row key in the list and after the last one,
   * but a key containing the empty string indicates "end of table" and will be
   * the last response given, if present.
   * Note that row keys in this list may not have ever been written to or read
   * from, and users should therefore not make any assumptions about the row key
   * structure that are specific to their use case.
   * </pre>
   *
   * <code>bytes row_key = 1;</code>
   */
  public com.google.protobuf.ByteString getRowKey() {
    return rowKey_;
  }

  public static final int OFFSET_BYTES_FIELD_NUMBER = 2;
  private long offsetBytes_;
  /**
   *
   *
   * <pre>
   * Approximate total storage space used by all rows in the table which precede
   * `row_key`. Buffering the contents of all rows between two subsequent
   * samples would require space roughly equal to the difference in their
   * `offset_bytes` fields.
   * </pre>
   *
   * <code>int64 offset_bytes = 2;</code>
   */
  public long getOffsetBytes() {
    return offsetBytes_;
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
    if (!rowKey_.isEmpty()) {
      output.writeBytes(1, rowKey_);
    }
    if (offsetBytes_ != 0L) {
      output.writeInt64(2, offsetBytes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!rowKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, rowKey_);
    }
    if (offsetBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, offsetBytes_);
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
    if (!(obj instanceof com.google.bigtable.v2.SampleRowKeysResponse)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.SampleRowKeysResponse other =
        (com.google.bigtable.v2.SampleRowKeysResponse) obj;

    if (!getRowKey().equals(other.getRowKey())) return false;
    if (getOffsetBytes() != other.getOffsetBytes()) return false;
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
    hash = (37 * hash) + ROW_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getRowKey().hashCode();
    hash = (37 * hash) + OFFSET_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getOffsetBytes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse parseFrom(
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

  public static Builder newBuilder(com.google.bigtable.v2.SampleRowKeysResponse prototype) {
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
   * Response message for Bigtable.SampleRowKeys.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.SampleRowKeysResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.SampleRowKeysResponse)
      com.google.bigtable.v2.SampleRowKeysResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.v2.BigtableProto
          .internal_static_google_bigtable_v2_SampleRowKeysResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.BigtableProto
          .internal_static_google_bigtable_v2_SampleRowKeysResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.SampleRowKeysResponse.class,
              com.google.bigtable.v2.SampleRowKeysResponse.Builder.class);
    }

    // Construct using com.google.bigtable.v2.SampleRowKeysResponse.newBuilder()
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
      rowKey_ = com.google.protobuf.ByteString.EMPTY;

      offsetBytes_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.v2.BigtableProto
          .internal_static_google_bigtable_v2_SampleRowKeysResponse_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.SampleRowKeysResponse getDefaultInstanceForType() {
      return com.google.bigtable.v2.SampleRowKeysResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.SampleRowKeysResponse build() {
      com.google.bigtable.v2.SampleRowKeysResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.SampleRowKeysResponse buildPartial() {
      com.google.bigtable.v2.SampleRowKeysResponse result =
          new com.google.bigtable.v2.SampleRowKeysResponse(this);
      result.rowKey_ = rowKey_;
      result.offsetBytes_ = offsetBytes_;
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
      if (other instanceof com.google.bigtable.v2.SampleRowKeysResponse) {
        return mergeFrom((com.google.bigtable.v2.SampleRowKeysResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.SampleRowKeysResponse other) {
      if (other == com.google.bigtable.v2.SampleRowKeysResponse.getDefaultInstance()) return this;
      if (other.getRowKey() != com.google.protobuf.ByteString.EMPTY) {
        setRowKey(other.getRowKey());
      }
      if (other.getOffsetBytes() != 0L) {
        setOffsetBytes(other.getOffsetBytes());
      }
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
      com.google.bigtable.v2.SampleRowKeysResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v2.SampleRowKeysResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString rowKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Sorted streamed sequence of sample row keys in the table. The table might
     * have contents before the first row key in the list and after the last one,
     * but a key containing the empty string indicates "end of table" and will be
     * the last response given, if present.
     * Note that row keys in this list may not have ever been written to or read
     * from, and users should therefore not make any assumptions about the row key
     * structure that are specific to their use case.
     * </pre>
     *
     * <code>bytes row_key = 1;</code>
     */
    public com.google.protobuf.ByteString getRowKey() {
      return rowKey_;
    }
    /**
     *
     *
     * <pre>
     * Sorted streamed sequence of sample row keys in the table. The table might
     * have contents before the first row key in the list and after the last one,
     * but a key containing the empty string indicates "end of table" and will be
     * the last response given, if present.
     * Note that row keys in this list may not have ever been written to or read
     * from, and users should therefore not make any assumptions about the row key
     * structure that are specific to their use case.
     * </pre>
     *
     * <code>bytes row_key = 1;</code>
     */
    public Builder setRowKey(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      rowKey_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorted streamed sequence of sample row keys in the table. The table might
     * have contents before the first row key in the list and after the last one,
     * but a key containing the empty string indicates "end of table" and will be
     * the last response given, if present.
     * Note that row keys in this list may not have ever been written to or read
     * from, and users should therefore not make any assumptions about the row key
     * structure that are specific to their use case.
     * </pre>
     *
     * <code>bytes row_key = 1;</code>
     */
    public Builder clearRowKey() {

      rowKey_ = getDefaultInstance().getRowKey();
      onChanged();
      return this;
    }

    private long offsetBytes_;
    /**
     *
     *
     * <pre>
     * Approximate total storage space used by all rows in the table which precede
     * `row_key`. Buffering the contents of all rows between two subsequent
     * samples would require space roughly equal to the difference in their
     * `offset_bytes` fields.
     * </pre>
     *
     * <code>int64 offset_bytes = 2;</code>
     */
    public long getOffsetBytes() {
      return offsetBytes_;
    }
    /**
     *
     *
     * <pre>
     * Approximate total storage space used by all rows in the table which precede
     * `row_key`. Buffering the contents of all rows between two subsequent
     * samples would require space roughly equal to the difference in their
     * `offset_bytes` fields.
     * </pre>
     *
     * <code>int64 offset_bytes = 2;</code>
     */
    public Builder setOffsetBytes(long value) {

      offsetBytes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approximate total storage space used by all rows in the table which precede
     * `row_key`. Buffering the contents of all rows between two subsequent
     * samples would require space roughly equal to the difference in their
     * `offset_bytes` fields.
     * </pre>
     *
     * <code>int64 offset_bytes = 2;</code>
     */
    public Builder clearOffsetBytes() {

      offsetBytes_ = 0L;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.SampleRowKeysResponse)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.SampleRowKeysResponse)
  private static final com.google.bigtable.v2.SampleRowKeysResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.SampleRowKeysResponse();
  }

  public static com.google.bigtable.v2.SampleRowKeysResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SampleRowKeysResponse> PARSER =
      new com.google.protobuf.AbstractParser<SampleRowKeysResponse>() {
        @java.lang.Override
        public SampleRowKeysResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SampleRowKeysResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SampleRowKeysResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SampleRowKeysResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.SampleRowKeysResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
