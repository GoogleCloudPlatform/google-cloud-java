// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/batches.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * A configuration for running
 * [Apache Spark SQL](http://spark.apache.org/sql/) queries as a batch workload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.SparkSqlBatch}
 */
public final class SparkSqlBatch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.SparkSqlBatch)
    SparkSqlBatchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SparkSqlBatch.newBuilder() to construct.
  private SparkSqlBatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SparkSqlBatch() {
    queryFileUri_ = "";
    jarFileUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SparkSqlBatch();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.v1.BatchesProto.internal_static_google_cloud_dataproc_v1_SparkSqlBatch_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetQueryVariables();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.BatchesProto.internal_static_google_cloud_dataproc_v1_SparkSqlBatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.SparkSqlBatch.class, com.google.cloud.dataproc.v1.SparkSqlBatch.Builder.class);
  }

  public static final int QUERY_FILE_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object queryFileUri_;
  /**
   * <pre>
   * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
   * </pre>
   *
   * <code>string query_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The queryFileUri.
   */
  @java.lang.Override
  public java.lang.String getQueryFileUri() {
    java.lang.Object ref = queryFileUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queryFileUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
   * </pre>
   *
   * <code>string query_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for queryFileUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryFileUriBytes() {
    java.lang.Object ref = queryFileUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queryFileUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_VARIABLES_FIELD_NUMBER = 2;
  private static final class QueryVariablesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.dataproc.v1.BatchesProto.internal_static_google_cloud_dataproc_v1_SparkSqlBatch_QueryVariablesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> queryVariables_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetQueryVariables() {
    if (queryVariables_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          QueryVariablesDefaultEntryHolder.defaultEntry);
    }
    return queryVariables_;
  }

  public int getQueryVariablesCount() {
    return internalGetQueryVariables().getMap().size();
  }
  /**
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Spark SQL command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  @java.lang.Override
  public boolean containsQueryVariables(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetQueryVariables().getMap().containsKey(key);
  }
  /**
   * Use {@link #getQueryVariablesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getQueryVariables() {
    return getQueryVariablesMap();
  }
  /**
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Spark SQL command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getQueryVariablesMap() {
    return internalGetQueryVariables().getMap();
  }
  /**
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Spark SQL command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override

  public java.lang.String getQueryVariablesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetQueryVariables().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Spark SQL command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override

  public java.lang.String getQueryVariablesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetQueryVariables().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int JAR_FILE_URIS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList jarFileUris_;
  /**
   * <pre>
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the jarFileUris.
   */
  public com.google.protobuf.ProtocolStringList
      getJarFileUrisList() {
    return jarFileUris_;
  }
  /**
   * <pre>
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of jarFileUris.
   */
  public int getJarFileUrisCount() {
    return jarFileUris_.size();
  }
  /**
   * <pre>
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The jarFileUris at the given index.
   */
  public java.lang.String getJarFileUris(int index) {
    return jarFileUris_.get(index);
  }
  /**
   * <pre>
   * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the jarFileUris at the given index.
   */
  public com.google.protobuf.ByteString
      getJarFileUrisBytes(int index) {
    return jarFileUris_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryFileUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queryFileUri_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetQueryVariables(),
        QueryVariablesDefaultEntryHolder.defaultEntry,
        2);
    for (int i = 0; i < jarFileUris_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jarFileUris_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryFileUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, queryFileUri_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetQueryVariables().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      queryVariables__ = QueryVariablesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, queryVariables__);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < jarFileUris_.size(); i++) {
        dataSize += computeStringSizeNoTag(jarFileUris_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getJarFileUrisList().size();
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.SparkSqlBatch)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.SparkSqlBatch other = (com.google.cloud.dataproc.v1.SparkSqlBatch) obj;

    if (!getQueryFileUri()
        .equals(other.getQueryFileUri())) return false;
    if (!internalGetQueryVariables().equals(
        other.internalGetQueryVariables())) return false;
    if (!getJarFileUrisList()
        .equals(other.getJarFileUrisList())) return false;
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
    hash = (37 * hash) + QUERY_FILE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getQueryFileUri().hashCode();
    if (!internalGetQueryVariables().getMap().isEmpty()) {
      hash = (37 * hash) + QUERY_VARIABLES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetQueryVariables().hashCode();
    }
    if (getJarFileUrisCount() > 0) {
      hash = (37 * hash) + JAR_FILE_URIS_FIELD_NUMBER;
      hash = (53 * hash) + getJarFileUrisList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.SparkSqlBatch parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.SparkSqlBatch prototype) {
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
   * A configuration for running
   * [Apache Spark SQL](http://spark.apache.org/sql/) queries as a batch workload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.SparkSqlBatch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.SparkSqlBatch)
      com.google.cloud.dataproc.v1.SparkSqlBatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.BatchesProto.internal_static_google_cloud_dataproc_v1_SparkSqlBatch_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetQueryVariables();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableQueryVariables();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.BatchesProto.internal_static_google_cloud_dataproc_v1_SparkSqlBatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.SparkSqlBatch.class, com.google.cloud.dataproc.v1.SparkSqlBatch.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.SparkSqlBatch.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      queryFileUri_ = "";

      internalGetMutableQueryVariables().clear();
      jarFileUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.BatchesProto.internal_static_google_cloud_dataproc_v1_SparkSqlBatch_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SparkSqlBatch getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.SparkSqlBatch.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SparkSqlBatch build() {
      com.google.cloud.dataproc.v1.SparkSqlBatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SparkSqlBatch buildPartial() {
      com.google.cloud.dataproc.v1.SparkSqlBatch result = new com.google.cloud.dataproc.v1.SparkSqlBatch(this);
      int from_bitField0_ = bitField0_;
      result.queryFileUri_ = queryFileUri_;
      result.queryVariables_ = internalGetQueryVariables();
      result.queryVariables_.makeImmutable();
      if (((bitField0_ & 0x00000002) != 0)) {
        jarFileUris_ = jarFileUris_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.jarFileUris_ = jarFileUris_;
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
      if (other instanceof com.google.cloud.dataproc.v1.SparkSqlBatch) {
        return mergeFrom((com.google.cloud.dataproc.v1.SparkSqlBatch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.SparkSqlBatch other) {
      if (other == com.google.cloud.dataproc.v1.SparkSqlBatch.getDefaultInstance()) return this;
      if (!other.getQueryFileUri().isEmpty()) {
        queryFileUri_ = other.queryFileUri_;
        onChanged();
      }
      internalGetMutableQueryVariables().mergeFrom(
          other.internalGetQueryVariables());
      if (!other.jarFileUris_.isEmpty()) {
        if (jarFileUris_.isEmpty()) {
          jarFileUris_ = other.jarFileUris_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureJarFileUrisIsMutable();
          jarFileUris_.addAll(other.jarFileUris_);
        }
        onChanged();
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
              queryFileUri_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              queryVariables__ = input.readMessage(
                  QueryVariablesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableQueryVariables().getMutableMap().put(
                  queryVariables__.getKey(), queryVariables__.getValue());
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureJarFileUrisIsMutable();
              jarFileUris_.add(s);
              break;
            } // case 26
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

    private java.lang.Object queryFileUri_ = "";
    /**
     * <pre>
     * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
     * </pre>
     *
     * <code>string query_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The queryFileUri.
     */
    public java.lang.String getQueryFileUri() {
      java.lang.Object ref = queryFileUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queryFileUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
     * </pre>
     *
     * <code>string query_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for queryFileUri.
     */
    public com.google.protobuf.ByteString
        getQueryFileUriBytes() {
      java.lang.Object ref = queryFileUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queryFileUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
     * </pre>
     *
     * <code>string query_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The queryFileUri to set.
     * @return This builder for chaining.
     */
    public Builder setQueryFileUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      queryFileUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
     * </pre>
     *
     * <code>string query_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearQueryFileUri() {
      
      queryFileUri_ = getDefaultInstance().getQueryFileUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
     * </pre>
     *
     * <code>string query_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for queryFileUri to set.
     * @return This builder for chaining.
     */
    public Builder setQueryFileUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      queryFileUri_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> queryVariables_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetQueryVariables() {
      if (queryVariables_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            QueryVariablesDefaultEntryHolder.defaultEntry);
      }
      return queryVariables_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableQueryVariables() {
      onChanged();;
      if (queryVariables_ == null) {
        queryVariables_ = com.google.protobuf.MapField.newMapField(
            QueryVariablesDefaultEntryHolder.defaultEntry);
      }
      if (!queryVariables_.isMutable()) {
        queryVariables_ = queryVariables_.copy();
      }
      return queryVariables_;
    }

    public int getQueryVariablesCount() {
      return internalGetQueryVariables().getMap().size();
    }
    /**
     * <pre>
     * Optional. Mapping of query variable names to values (equivalent to the
     * Spark SQL command: `SET name="value";`).
     * </pre>
     *
     * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */

    @java.lang.Override
    public boolean containsQueryVariables(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetQueryVariables().getMap().containsKey(key);
    }
    /**
     * Use {@link #getQueryVariablesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getQueryVariables() {
      return getQueryVariablesMap();
    }
    /**
     * <pre>
     * Optional. Mapping of query variable names to values (equivalent to the
     * Spark SQL command: `SET name="value";`).
     * </pre>
     *
     * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getQueryVariablesMap() {
      return internalGetQueryVariables().getMap();
    }
    /**
     * <pre>
     * Optional. Mapping of query variable names to values (equivalent to the
     * Spark SQL command: `SET name="value";`).
     * </pre>
     *
     * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    @java.lang.Override

    public java.lang.String getQueryVariablesOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetQueryVariables().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Optional. Mapping of query variable names to values (equivalent to the
     * Spark SQL command: `SET name="value";`).
     * </pre>
     *
     * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    @java.lang.Override

    public java.lang.String getQueryVariablesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetQueryVariables().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearQueryVariables() {
      internalGetMutableQueryVariables().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Optional. Mapping of query variable names to values (equivalent to the
     * Spark SQL command: `SET name="value";`).
     * </pre>
     *
     * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */

    public Builder removeQueryVariables(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableQueryVariables().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableQueryVariables() {
      return internalGetMutableQueryVariables().getMutableMap();
    }
    /**
     * <pre>
     * Optional. Mapping of query variable names to values (equivalent to the
     * Spark SQL command: `SET name="value";`).
     * </pre>
     *
     * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder putQueryVariables(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableQueryVariables().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Optional. Mapping of query variable names to values (equivalent to the
     * Spark SQL command: `SET name="value";`).
     * </pre>
     *
     * <code>map&lt;string, string&gt; query_variables = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */

    public Builder putAllQueryVariables(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableQueryVariables().getMutableMap()
          .putAll(values);
      return this;
    }

    private com.google.protobuf.LazyStringList jarFileUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureJarFileUrisIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        jarFileUris_ = new com.google.protobuf.LazyStringArrayList(jarFileUris_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * </pre>
     *
     * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return A list containing the jarFileUris.
     */
    public com.google.protobuf.ProtocolStringList
        getJarFileUrisList() {
      return jarFileUris_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * </pre>
     *
     * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The count of jarFileUris.
     */
    public int getJarFileUrisCount() {
      return jarFileUris_.size();
    }
    /**
     * <pre>
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * </pre>
     *
     * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param index The index of the element to return.
     * @return The jarFileUris at the given index.
     */
    public java.lang.String getJarFileUris(int index) {
      return jarFileUris_.get(index);
    }
    /**
     * <pre>
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * </pre>
     *
     * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param index The index of the value to return.
     * @return The bytes of the jarFileUris at the given index.
     */
    public com.google.protobuf.ByteString
        getJarFileUrisBytes(int index) {
      return jarFileUris_.getByteString(index);
    }
    /**
     * <pre>
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * </pre>
     *
     * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param index The index to set the value at.
     * @param value The jarFileUris to set.
     * @return This builder for chaining.
     */
    public Builder setJarFileUris(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureJarFileUrisIsMutable();
      jarFileUris_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * </pre>
     *
     * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The jarFileUris to add.
     * @return This builder for chaining.
     */
    public Builder addJarFileUris(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureJarFileUrisIsMutable();
      jarFileUris_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * </pre>
     *
     * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param values The jarFileUris to add.
     * @return This builder for chaining.
     */
    public Builder addAllJarFileUris(
        java.lang.Iterable<java.lang.String> values) {
      ensureJarFileUrisIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, jarFileUris_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * </pre>
     *
     * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearJarFileUris() {
      jarFileUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * </pre>
     *
     * <code>repeated string jar_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes of the jarFileUris to add.
     * @return This builder for chaining.
     */
    public Builder addJarFileUrisBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureJarFileUrisIsMutable();
      jarFileUris_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.SparkSqlBatch)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.SparkSqlBatch)
  private static final com.google.cloud.dataproc.v1.SparkSqlBatch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.SparkSqlBatch();
  }

  public static com.google.cloud.dataproc.v1.SparkSqlBatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SparkSqlBatch>
      PARSER = new com.google.protobuf.AbstractParser<SparkSqlBatch>() {
    @java.lang.Override
    public SparkSqlBatch parsePartialFrom(
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

  public static com.google.protobuf.Parser<SparkSqlBatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SparkSqlBatch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.SparkSqlBatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

