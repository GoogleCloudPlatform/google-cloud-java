// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * A list of queries to run on a cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.QueryList}
 */
public final class QueryList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.QueryList)
    QueryListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QueryList.newBuilder() to construct.
  private QueryList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueryList() {
    queries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private QueryList(
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
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                queries_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              queries_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        queries_ = queries_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.JobsProto
        .internal_static_google_cloud_dataproc_v1_QueryList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.JobsProto
        .internal_static_google_cloud_dataproc_v1_QueryList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.QueryList.class,
            com.google.cloud.dataproc.v1.QueryList.Builder.class);
  }

  public static final int QUERIES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList queries_;
  /**
   *
   *
   * <pre>
   * Required. The queries to execute. You do not need to terminate a query
   * with a semicolon. Multiple queries can be specified in one string
   * by separating each with a semicolon. Here is an example of an Cloud
   * Dataproc API snippet that uses a QueryList to specify a HiveJob:
   *     "hiveJob": {
   *       "queryList": {
   *         "queries": [
   *           "query1",
   *           "query2",
   *           "query3;query4",
   *         ]
   *       }
   *     }
   * </pre>
   *
   * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ProtocolStringList getQueriesList() {
    return queries_;
  }
  /**
   *
   *
   * <pre>
   * Required. The queries to execute. You do not need to terminate a query
   * with a semicolon. Multiple queries can be specified in one string
   * by separating each with a semicolon. Here is an example of an Cloud
   * Dataproc API snippet that uses a QueryList to specify a HiveJob:
   *     "hiveJob": {
   *       "queryList": {
   *         "queries": [
   *           "query1",
   *           "query2",
   *           "query3;query4",
   *         ]
   *       }
   *     }
   * </pre>
   *
   * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public int getQueriesCount() {
    return queries_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The queries to execute. You do not need to terminate a query
   * with a semicolon. Multiple queries can be specified in one string
   * by separating each with a semicolon. Here is an example of an Cloud
   * Dataproc API snippet that uses a QueryList to specify a HiveJob:
   *     "hiveJob": {
   *       "queryList": {
   *         "queries": [
   *           "query1",
   *           "query2",
   *           "query3;query4",
   *         ]
   *       }
   *     }
   * </pre>
   *
   * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getQueries(int index) {
    return queries_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The queries to execute. You do not need to terminate a query
   * with a semicolon. Multiple queries can be specified in one string
   * by separating each with a semicolon. Here is an example of an Cloud
   * Dataproc API snippet that uses a QueryList to specify a HiveJob:
   *     "hiveJob": {
   *       "queryList": {
   *         "queries": [
   *           "query1",
   *           "query2",
   *           "query3;query4",
   *         ]
   *       }
   *     }
   * </pre>
   *
   * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString getQueriesBytes(int index) {
    return queries_.getByteString(index);
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
    for (int i = 0; i < queries_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queries_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < queries_.size(); i++) {
        dataSize += computeStringSizeNoTag(queries_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getQueriesList().size();
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.QueryList)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.QueryList other = (com.google.cloud.dataproc.v1.QueryList) obj;

    if (!getQueriesList().equals(other.getQueriesList())) return false;
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
    if (getQueriesCount() > 0) {
      hash = (37 * hash) + QUERIES_FIELD_NUMBER;
      hash = (53 * hash) + getQueriesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.QueryList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.QueryList prototype) {
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
   * A list of queries to run on a cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.QueryList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.QueryList)
      com.google.cloud.dataproc.v1.QueryListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.JobsProto
          .internal_static_google_cloud_dataproc_v1_QueryList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.JobsProto
          .internal_static_google_cloud_dataproc_v1_QueryList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.QueryList.class,
              com.google.cloud.dataproc.v1.QueryList.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.QueryList.newBuilder()
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
      queries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.JobsProto
          .internal_static_google_cloud_dataproc_v1_QueryList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.QueryList getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.QueryList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.QueryList build() {
      com.google.cloud.dataproc.v1.QueryList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.QueryList buildPartial() {
      com.google.cloud.dataproc.v1.QueryList result =
          new com.google.cloud.dataproc.v1.QueryList(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        queries_ = queries_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.queries_ = queries_;
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
      if (other instanceof com.google.cloud.dataproc.v1.QueryList) {
        return mergeFrom((com.google.cloud.dataproc.v1.QueryList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.QueryList other) {
      if (other == com.google.cloud.dataproc.v1.QueryList.getDefaultInstance()) return this;
      if (!other.queries_.isEmpty()) {
        if (queries_.isEmpty()) {
          queries_ = other.queries_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureQueriesIsMutable();
          queries_.addAll(other.queries_);
        }
        onChanged();
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
      com.google.cloud.dataproc.v1.QueryList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.QueryList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList queries_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureQueriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        queries_ = new com.google.protobuf.LazyStringArrayList(queries_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The queries to execute. You do not need to terminate a query
     * with a semicolon. Multiple queries can be specified in one string
     * by separating each with a semicolon. Here is an example of an Cloud
     * Dataproc API snippet that uses a QueryList to specify a HiveJob:
     *     "hiveJob": {
     *       "queryList": {
     *         "queries": [
     *           "query1",
     *           "query2",
     *           "query3;query4",
     *         ]
     *       }
     *     }
     * </pre>
     *
     * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ProtocolStringList getQueriesList() {
      return queries_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Required. The queries to execute. You do not need to terminate a query
     * with a semicolon. Multiple queries can be specified in one string
     * by separating each with a semicolon. Here is an example of an Cloud
     * Dataproc API snippet that uses a QueryList to specify a HiveJob:
     *     "hiveJob": {
     *       "queryList": {
     *         "queries": [
     *           "query1",
     *           "query2",
     *           "query3;query4",
     *         ]
     *       }
     *     }
     * </pre>
     *
     * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getQueriesCount() {
      return queries_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The queries to execute. You do not need to terminate a query
     * with a semicolon. Multiple queries can be specified in one string
     * by separating each with a semicolon. Here is an example of an Cloud
     * Dataproc API snippet that uses a QueryList to specify a HiveJob:
     *     "hiveJob": {
     *       "queryList": {
     *         "queries": [
     *           "query1",
     *           "query2",
     *           "query3;query4",
     *         ]
     *       }
     *     }
     * </pre>
     *
     * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getQueries(int index) {
      return queries_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The queries to execute. You do not need to terminate a query
     * with a semicolon. Multiple queries can be specified in one string
     * by separating each with a semicolon. Here is an example of an Cloud
     * Dataproc API snippet that uses a QueryList to specify a HiveJob:
     *     "hiveJob": {
     *       "queryList": {
     *         "queries": [
     *           "query1",
     *           "query2",
     *           "query3;query4",
     *         ]
     *       }
     *     }
     * </pre>
     *
     * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString getQueriesBytes(int index) {
      return queries_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The queries to execute. You do not need to terminate a query
     * with a semicolon. Multiple queries can be specified in one string
     * by separating each with a semicolon. Here is an example of an Cloud
     * Dataproc API snippet that uses a QueryList to specify a HiveJob:
     *     "hiveJob": {
     *       "queryList": {
     *         "queries": [
     *           "query1",
     *           "query2",
     *           "query3;query4",
     *         ]
     *       }
     *     }
     * </pre>
     *
     * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setQueries(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureQueriesIsMutable();
      queries_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The queries to execute. You do not need to terminate a query
     * with a semicolon. Multiple queries can be specified in one string
     * by separating each with a semicolon. Here is an example of an Cloud
     * Dataproc API snippet that uses a QueryList to specify a HiveJob:
     *     "hiveJob": {
     *       "queryList": {
     *         "queries": [
     *           "query1",
     *           "query2",
     *           "query3;query4",
     *         ]
     *       }
     *     }
     * </pre>
     *
     * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addQueries(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureQueriesIsMutable();
      queries_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The queries to execute. You do not need to terminate a query
     * with a semicolon. Multiple queries can be specified in one string
     * by separating each with a semicolon. Here is an example of an Cloud
     * Dataproc API snippet that uses a QueryList to specify a HiveJob:
     *     "hiveJob": {
     *       "queryList": {
     *         "queries": [
     *           "query1",
     *           "query2",
     *           "query3;query4",
     *         ]
     *       }
     *     }
     * </pre>
     *
     * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllQueries(java.lang.Iterable<java.lang.String> values) {
      ensureQueriesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, queries_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The queries to execute. You do not need to terminate a query
     * with a semicolon. Multiple queries can be specified in one string
     * by separating each with a semicolon. Here is an example of an Cloud
     * Dataproc API snippet that uses a QueryList to specify a HiveJob:
     *     "hiveJob": {
     *       "queryList": {
     *         "queries": [
     *           "query1",
     *           "query2",
     *           "query3;query4",
     *         ]
     *       }
     *     }
     * </pre>
     *
     * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearQueries() {
      queries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The queries to execute. You do not need to terminate a query
     * with a semicolon. Multiple queries can be specified in one string
     * by separating each with a semicolon. Here is an example of an Cloud
     * Dataproc API snippet that uses a QueryList to specify a HiveJob:
     *     "hiveJob": {
     *       "queryList": {
     *         "queries": [
     *           "query1",
     *           "query2",
     *           "query3;query4",
     *         ]
     *       }
     *     }
     * </pre>
     *
     * <code>repeated string queries = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addQueriesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureQueriesIsMutable();
      queries_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.QueryList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.QueryList)
  private static final com.google.cloud.dataproc.v1.QueryList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.QueryList();
  }

  public static com.google.cloud.dataproc.v1.QueryList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryList> PARSER =
      new com.google.protobuf.AbstractParser<QueryList>() {
        @java.lang.Override
        public QueryList parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new QueryList(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<QueryList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.QueryList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
