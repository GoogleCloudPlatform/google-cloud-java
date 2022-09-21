// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * Specifies an executable to run on a fully configured node and a
 * timeout period for executable completion.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.NodeInitializationAction}
 */
public final class NodeInitializationAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.NodeInitializationAction)
    NodeInitializationActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeInitializationAction.newBuilder() to construct.
  private NodeInitializationAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeInitializationAction() {
    executableFile_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeInitializationAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NodeInitializationAction(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            executableFile_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (executionTimeout_ != null) {
              subBuilder = executionTimeout_.toBuilder();
            }
            executionTimeout_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(executionTimeout_);
              executionTimeout_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_NodeInitializationAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_NodeInitializationAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.NodeInitializationAction.class, com.google.cloud.dataproc.v1.NodeInitializationAction.Builder.class);
  }

  public static final int EXECUTABLE_FILE_FIELD_NUMBER = 1;
  private volatile java.lang.Object executableFile_;
  /**
   * <pre>
   * Required. Cloud Storage URI of executable file.
   * </pre>
   *
   * <code>string executable_file = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The executableFile.
   */
  @java.lang.Override
  public java.lang.String getExecutableFile() {
    java.lang.Object ref = executableFile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      executableFile_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Cloud Storage URI of executable file.
   * </pre>
   *
   * <code>string executable_file = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for executableFile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExecutableFileBytes() {
    java.lang.Object ref = executableFile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      executableFile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXECUTION_TIMEOUT_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration executionTimeout_;
  /**
   * <pre>
   * Optional. Amount of time executable has to complete. Default is
   * 10 minutes (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * Cluster creation fails with an explanatory error message (the
   * name of the executable that caused the error and the exceeded timeout
   * period) if the executable is not completed at end of the timeout period.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the executionTimeout field is set.
   */
  @java.lang.Override
  public boolean hasExecutionTimeout() {
    return executionTimeout_ != null;
  }
  /**
   * <pre>
   * Optional. Amount of time executable has to complete. Default is
   * 10 minutes (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * Cluster creation fails with an explanatory error message (the
   * name of the executable that caused the error and the exceeded timeout
   * period) if the executable is not completed at end of the timeout period.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The executionTimeout.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getExecutionTimeout() {
    return executionTimeout_ == null ? com.google.protobuf.Duration.getDefaultInstance() : executionTimeout_;
  }
  /**
   * <pre>
   * Optional. Amount of time executable has to complete. Default is
   * 10 minutes (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * Cluster creation fails with an explanatory error message (the
   * name of the executable that caused the error and the exceeded timeout
   * period) if the executable is not completed at end of the timeout period.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getExecutionTimeoutOrBuilder() {
    return getExecutionTimeout();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(executableFile_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, executableFile_);
    }
    if (executionTimeout_ != null) {
      output.writeMessage(2, getExecutionTimeout());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(executableFile_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, executableFile_);
    }
    if (executionTimeout_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExecutionTimeout());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.NodeInitializationAction)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.NodeInitializationAction other = (com.google.cloud.dataproc.v1.NodeInitializationAction) obj;

    if (!getExecutableFile()
        .equals(other.getExecutableFile())) return false;
    if (hasExecutionTimeout() != other.hasExecutionTimeout()) return false;
    if (hasExecutionTimeout()) {
      if (!getExecutionTimeout()
          .equals(other.getExecutionTimeout())) return false;
    }
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
    hash = (37 * hash) + EXECUTABLE_FILE_FIELD_NUMBER;
    hash = (53 * hash) + getExecutableFile().hashCode();
    if (hasExecutionTimeout()) {
      hash = (37 * hash) + EXECUTION_TIMEOUT_FIELD_NUMBER;
      hash = (53 * hash) + getExecutionTimeout().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.NodeInitializationAction parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.NodeInitializationAction prototype) {
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
   * Specifies an executable to run on a fully configured node and a
   * timeout period for executable completion.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.NodeInitializationAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.NodeInitializationAction)
      com.google.cloud.dataproc.v1.NodeInitializationActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_NodeInitializationAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_NodeInitializationAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.NodeInitializationAction.class, com.google.cloud.dataproc.v1.NodeInitializationAction.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.NodeInitializationAction.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      executableFile_ = "";

      if (executionTimeoutBuilder_ == null) {
        executionTimeout_ = null;
      } else {
        executionTimeout_ = null;
        executionTimeoutBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_NodeInitializationAction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.NodeInitializationAction getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.NodeInitializationAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.NodeInitializationAction build() {
      com.google.cloud.dataproc.v1.NodeInitializationAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.NodeInitializationAction buildPartial() {
      com.google.cloud.dataproc.v1.NodeInitializationAction result = new com.google.cloud.dataproc.v1.NodeInitializationAction(this);
      result.executableFile_ = executableFile_;
      if (executionTimeoutBuilder_ == null) {
        result.executionTimeout_ = executionTimeout_;
      } else {
        result.executionTimeout_ = executionTimeoutBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1.NodeInitializationAction) {
        return mergeFrom((com.google.cloud.dataproc.v1.NodeInitializationAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.NodeInitializationAction other) {
      if (other == com.google.cloud.dataproc.v1.NodeInitializationAction.getDefaultInstance()) return this;
      if (!other.getExecutableFile().isEmpty()) {
        executableFile_ = other.executableFile_;
        onChanged();
      }
      if (other.hasExecutionTimeout()) {
        mergeExecutionTimeout(other.getExecutionTimeout());
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
      com.google.cloud.dataproc.v1.NodeInitializationAction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.NodeInitializationAction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object executableFile_ = "";
    /**
     * <pre>
     * Required. Cloud Storage URI of executable file.
     * </pre>
     *
     * <code>string executable_file = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The executableFile.
     */
    public java.lang.String getExecutableFile() {
      java.lang.Object ref = executableFile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        executableFile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Cloud Storage URI of executable file.
     * </pre>
     *
     * <code>string executable_file = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for executableFile.
     */
    public com.google.protobuf.ByteString
        getExecutableFileBytes() {
      java.lang.Object ref = executableFile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        executableFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Cloud Storage URI of executable file.
     * </pre>
     *
     * <code>string executable_file = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The executableFile to set.
     * @return This builder for chaining.
     */
    public Builder setExecutableFile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      executableFile_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Cloud Storage URI of executable file.
     * </pre>
     *
     * <code>string executable_file = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearExecutableFile() {
      
      executableFile_ = getDefaultInstance().getExecutableFile();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Cloud Storage URI of executable file.
     * </pre>
     *
     * <code>string executable_file = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for executableFile to set.
     * @return This builder for chaining.
     */
    public Builder setExecutableFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      executableFile_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration executionTimeout_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> executionTimeoutBuilder_;
    /**
     * <pre>
     * Optional. Amount of time executable has to complete. Default is
     * 10 minutes (see JSON representation of
     * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * Cluster creation fails with an explanatory error message (the
     * name of the executable that caused the error and the exceeded timeout
     * period) if the executable is not completed at end of the timeout period.
     * </pre>
     *
     * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the executionTimeout field is set.
     */
    public boolean hasExecutionTimeout() {
      return executionTimeoutBuilder_ != null || executionTimeout_ != null;
    }
    /**
     * <pre>
     * Optional. Amount of time executable has to complete. Default is
     * 10 minutes (see JSON representation of
     * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * Cluster creation fails with an explanatory error message (the
     * name of the executable that caused the error and the exceeded timeout
     * period) if the executable is not completed at end of the timeout period.
     * </pre>
     *
     * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The executionTimeout.
     */
    public com.google.protobuf.Duration getExecutionTimeout() {
      if (executionTimeoutBuilder_ == null) {
        return executionTimeout_ == null ? com.google.protobuf.Duration.getDefaultInstance() : executionTimeout_;
      } else {
        return executionTimeoutBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Amount of time executable has to complete. Default is
     * 10 minutes (see JSON representation of
     * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * Cluster creation fails with an explanatory error message (the
     * name of the executable that caused the error and the exceeded timeout
     * period) if the executable is not completed at end of the timeout period.
     * </pre>
     *
     * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setExecutionTimeout(com.google.protobuf.Duration value) {
      if (executionTimeoutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        executionTimeout_ = value;
        onChanged();
      } else {
        executionTimeoutBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Amount of time executable has to complete. Default is
     * 10 minutes (see JSON representation of
     * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * Cluster creation fails with an explanatory error message (the
     * name of the executable that caused the error and the exceeded timeout
     * period) if the executable is not completed at end of the timeout period.
     * </pre>
     *
     * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setExecutionTimeout(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (executionTimeoutBuilder_ == null) {
        executionTimeout_ = builderForValue.build();
        onChanged();
      } else {
        executionTimeoutBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Amount of time executable has to complete. Default is
     * 10 minutes (see JSON representation of
     * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * Cluster creation fails with an explanatory error message (the
     * name of the executable that caused the error and the exceeded timeout
     * period) if the executable is not completed at end of the timeout period.
     * </pre>
     *
     * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeExecutionTimeout(com.google.protobuf.Duration value) {
      if (executionTimeoutBuilder_ == null) {
        if (executionTimeout_ != null) {
          executionTimeout_ =
            com.google.protobuf.Duration.newBuilder(executionTimeout_).mergeFrom(value).buildPartial();
        } else {
          executionTimeout_ = value;
        }
        onChanged();
      } else {
        executionTimeoutBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Amount of time executable has to complete. Default is
     * 10 minutes (see JSON representation of
     * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * Cluster creation fails with an explanatory error message (the
     * name of the executable that caused the error and the exceeded timeout
     * period) if the executable is not completed at end of the timeout period.
     * </pre>
     *
     * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearExecutionTimeout() {
      if (executionTimeoutBuilder_ == null) {
        executionTimeout_ = null;
        onChanged();
      } else {
        executionTimeout_ = null;
        executionTimeoutBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Amount of time executable has to complete. Default is
     * 10 minutes (see JSON representation of
     * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * Cluster creation fails with an explanatory error message (the
     * name of the executable that caused the error and the exceeded timeout
     * period) if the executable is not completed at end of the timeout period.
     * </pre>
     *
     * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.Duration.Builder getExecutionTimeoutBuilder() {
      
      onChanged();
      return getExecutionTimeoutFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Amount of time executable has to complete. Default is
     * 10 minutes (see JSON representation of
     * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * Cluster creation fails with an explanatory error message (the
     * name of the executable that caused the error and the exceeded timeout
     * period) if the executable is not completed at end of the timeout period.
     * </pre>
     *
     * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.DurationOrBuilder getExecutionTimeoutOrBuilder() {
      if (executionTimeoutBuilder_ != null) {
        return executionTimeoutBuilder_.getMessageOrBuilder();
      } else {
        return executionTimeout_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : executionTimeout_;
      }
    }
    /**
     * <pre>
     * Optional. Amount of time executable has to complete. Default is
     * 10 minutes (see JSON representation of
     * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * Cluster creation fails with an explanatory error message (the
     * name of the executable that caused the error and the exceeded timeout
     * period) if the executable is not completed at end of the timeout period.
     * </pre>
     *
     * <code>.google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getExecutionTimeoutFieldBuilder() {
      if (executionTimeoutBuilder_ == null) {
        executionTimeoutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getExecutionTimeout(),
                getParentForChildren(),
                isClean());
        executionTimeout_ = null;
      }
      return executionTimeoutBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.NodeInitializationAction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.NodeInitializationAction)
  private static final com.google.cloud.dataproc.v1.NodeInitializationAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.NodeInitializationAction();
  }

  public static com.google.cloud.dataproc.v1.NodeInitializationAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeInitializationAction>
      PARSER = new com.google.protobuf.AbstractParser<NodeInitializationAction>() {
    @java.lang.Override
    public NodeInitializationAction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NodeInitializationAction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodeInitializationAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeInitializationAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.NodeInitializationAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

