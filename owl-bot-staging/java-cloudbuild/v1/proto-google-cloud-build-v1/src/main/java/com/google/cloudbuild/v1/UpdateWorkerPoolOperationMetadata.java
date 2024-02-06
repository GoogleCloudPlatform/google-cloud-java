// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v1;

/**
 * <pre>
 * Metadata for the `UpdateWorkerPool` operation.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.UpdateWorkerPoolOperationMetadata}
 */
public final class UpdateWorkerPoolOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.UpdateWorkerPoolOperationMetadata)
    UpdateWorkerPoolOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateWorkerPoolOperationMetadata.newBuilder() to construct.
  private UpdateWorkerPoolOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateWorkerPoolOperationMetadata() {
    workerPool_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateWorkerPoolOperationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_UpdateWorkerPoolOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_UpdateWorkerPoolOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata.class, com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int WORKER_POOL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object workerPool_ = "";
  /**
   * <pre>
   * The resource name of the `WorkerPool` being updated.
   * Format:
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * </pre>
   *
   * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The workerPool.
   */
  @java.lang.Override
  public java.lang.String getWorkerPool() {
    java.lang.Object ref = workerPool_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workerPool_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the `WorkerPool` being updated.
   * Format:
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * </pre>
   *
   * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for workerPool.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWorkerPoolBytes() {
    java.lang.Object ref = workerPool_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workerPool_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }

  public static final int COMPLETE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp completeTime_;
  /**
   * <pre>
   * Time the operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 3;</code>
   * @return Whether the completeTime field is set.
   */
  @java.lang.Override
  public boolean hasCompleteTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Time the operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 3;</code>
   * @return The completeTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCompleteTime() {
    return completeTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completeTime_;
  }
  /**
   * <pre>
   * Time the operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder() {
    return completeTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completeTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workerPool_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, workerPool_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCreateTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getCompleteTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workerPool_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, workerPool_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreateTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCompleteTime());
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
    if (!(obj instanceof com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata other = (com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata) obj;

    if (!getWorkerPool()
        .equals(other.getWorkerPool())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (hasCompleteTime() != other.hasCompleteTime()) return false;
    if (hasCompleteTime()) {
      if (!getCompleteTime()
          .equals(other.getCompleteTime())) return false;
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
    hash = (37 * hash) + WORKER_POOL_FIELD_NUMBER;
    hash = (53 * hash) + getWorkerPool().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    if (hasCompleteTime()) {
      hash = (37 * hash) + COMPLETE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCompleteTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata prototype) {
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
   * Metadata for the `UpdateWorkerPool` operation.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.UpdateWorkerPoolOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.UpdateWorkerPoolOperationMetadata)
      com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_UpdateWorkerPoolOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_UpdateWorkerPoolOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata.class, com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata.newBuilder()
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
        getCreateTimeFieldBuilder();
        getCompleteTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      workerPool_ = "";
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      completeTime_ = null;
      if (completeTimeBuilder_ != null) {
        completeTimeBuilder_.dispose();
        completeTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_UpdateWorkerPoolOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata build() {
      com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata buildPartial() {
      com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata result = new com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.workerPool_ = workerPool_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.createTime_ = createTimeBuilder_ == null
            ? createTime_
            : createTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.completeTime_ = completeTimeBuilder_ == null
            ? completeTime_
            : completeTimeBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata) {
        return mergeFrom((com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata other) {
      if (other == com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata.getDefaultInstance()) return this;
      if (!other.getWorkerPool().isEmpty()) {
        workerPool_ = other.workerPool_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.hasCompleteTime()) {
        mergeCompleteTime(other.getCompleteTime());
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
              workerPool_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getCompleteTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private java.lang.Object workerPool_ = "";
    /**
     * <pre>
     * The resource name of the `WorkerPool` being updated.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The workerPool.
     */
    public java.lang.String getWorkerPool() {
      java.lang.Object ref = workerPool_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workerPool_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the `WorkerPool` being updated.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for workerPool.
     */
    public com.google.protobuf.ByteString
        getWorkerPoolBytes() {
      java.lang.Object ref = workerPool_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workerPool_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the `WorkerPool` being updated.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The workerPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkerPool(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      workerPool_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the `WorkerPool` being updated.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkerPool() {
      workerPool_ = getDefaultInstance().getWorkerPool();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the `WorkerPool` being updated.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for workerPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkerPoolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      workerPool_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
      } else {
        createTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          createTime_ != null &&
          createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreateTimeBuilder().mergeFrom(value);
        } else {
          createTime_ = value;
        }
      } else {
        createTimeBuilder_.mergeFrom(value);
      }
      if (createTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder clearCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private com.google.protobuf.Timestamp completeTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> completeTimeBuilder_;
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     * @return Whether the completeTime field is set.
     */
    public boolean hasCompleteTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     * @return The completeTime.
     */
    public com.google.protobuf.Timestamp getCompleteTime() {
      if (completeTimeBuilder_ == null) {
        return completeTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completeTime_;
      } else {
        return completeTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public Builder setCompleteTime(com.google.protobuf.Timestamp value) {
      if (completeTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        completeTime_ = value;
      } else {
        completeTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public Builder setCompleteTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (completeTimeBuilder_ == null) {
        completeTime_ = builderForValue.build();
      } else {
        completeTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public Builder mergeCompleteTime(com.google.protobuf.Timestamp value) {
      if (completeTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          completeTime_ != null &&
          completeTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCompleteTimeBuilder().mergeFrom(value);
        } else {
          completeTime_ = value;
        }
      } else {
        completeTimeBuilder_.mergeFrom(value);
      }
      if (completeTime_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public Builder clearCompleteTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      completeTime_ = null;
      if (completeTimeBuilder_ != null) {
        completeTimeBuilder_.dispose();
        completeTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCompleteTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCompleteTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder() {
      if (completeTimeBuilder_ != null) {
        return completeTimeBuilder_.getMessageOrBuilder();
      } else {
        return completeTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : completeTime_;
      }
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCompleteTimeFieldBuilder() {
      if (completeTimeBuilder_ == null) {
        completeTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCompleteTime(),
                getParentForChildren(),
                isClean());
        completeTime_ = null;
      }
      return completeTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.UpdateWorkerPoolOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.UpdateWorkerPoolOperationMetadata)
  private static final com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata();
  }

  public static com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWorkerPoolOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<UpdateWorkerPoolOperationMetadata>() {
    @java.lang.Override
    public UpdateWorkerPoolOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateWorkerPoolOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWorkerPoolOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.UpdateWorkerPoolOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

