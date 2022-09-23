// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for [MetadataService.CreateExecution][google.cloud.aiplatform.v1.MetadataService.CreateExecution].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CreateExecutionRequest}
 */
public final class CreateExecutionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CreateExecutionRequest)
    CreateExecutionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateExecutionRequest.newBuilder() to construct.
  private CreateExecutionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateExecutionRequest() {
    parent_ = "";
    executionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateExecutionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateExecutionRequest(
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

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.aiplatform.v1.Execution.Builder subBuilder = null;
            if (execution_ != null) {
              subBuilder = execution_.toBuilder();
            }
            execution_ = input.readMessage(com.google.cloud.aiplatform.v1.Execution.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(execution_);
              execution_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            executionId_ = s;
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
    return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_CreateExecutionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_CreateExecutionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CreateExecutionRequest.class, com.google.cloud.aiplatform.v1.CreateExecutionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The resource name of the MetadataStore where the Execution should
   * be created.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the MetadataStore where the Execution should
   * be created.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXECUTION_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.Execution execution_;
  /**
   * <pre>
   * Required. The Execution to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the execution field is set.
   */
  @java.lang.Override
  public boolean hasExecution() {
    return execution_ != null;
  }
  /**
   * <pre>
   * Required. The Execution to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The execution.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Execution getExecution() {
    return execution_ == null ? com.google.cloud.aiplatform.v1.Execution.getDefaultInstance() : execution_;
  }
  /**
   * <pre>
   * Required. The Execution to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ExecutionOrBuilder getExecutionOrBuilder() {
    return getExecution();
  }

  public static final int EXECUTION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object executionId_;
  /**
   * <pre>
   * The {execution} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * If not provided, the Execution's ID will be a UUID generated by the
   * service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all Executions in the parent MetadataStore.
   * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
   * if the caller can't view the preexisting Execution.)
   * </pre>
   *
   * <code>string execution_id = 3;</code>
   * @return The executionId.
   */
  @java.lang.Override
  public java.lang.String getExecutionId() {
    java.lang.Object ref = executionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      executionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The {execution} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * If not provided, the Execution's ID will be a UUID generated by the
   * service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all Executions in the parent MetadataStore.
   * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
   * if the caller can't view the preexisting Execution.)
   * </pre>
   *
   * <code>string execution_id = 3;</code>
   * @return The bytes for executionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExecutionIdBytes() {
    java.lang.Object ref = executionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      executionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (execution_ != null) {
      output.writeMessage(2, getExecution());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(executionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, executionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (execution_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExecution());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(executionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, executionId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CreateExecutionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CreateExecutionRequest other = (com.google.cloud.aiplatform.v1.CreateExecutionRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasExecution() != other.hasExecution()) return false;
    if (hasExecution()) {
      if (!getExecution()
          .equals(other.getExecution())) return false;
    }
    if (!getExecutionId()
        .equals(other.getExecutionId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasExecution()) {
      hash = (37 * hash) + EXECUTION_FIELD_NUMBER;
      hash = (53 * hash) + getExecution().hashCode();
    }
    hash = (37 * hash) + EXECUTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExecutionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CreateExecutionRequest prototype) {
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
   * Request message for [MetadataService.CreateExecution][google.cloud.aiplatform.v1.MetadataService.CreateExecution].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CreateExecutionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CreateExecutionRequest)
      com.google.cloud.aiplatform.v1.CreateExecutionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_CreateExecutionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_CreateExecutionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CreateExecutionRequest.class, com.google.cloud.aiplatform.v1.CreateExecutionRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CreateExecutionRequest.newBuilder()
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
      parent_ = "";

      if (executionBuilder_ == null) {
        execution_ = null;
      } else {
        execution_ = null;
        executionBuilder_ = null;
      }
      executionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1_CreateExecutionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateExecutionRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CreateExecutionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateExecutionRequest build() {
      com.google.cloud.aiplatform.v1.CreateExecutionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateExecutionRequest buildPartial() {
      com.google.cloud.aiplatform.v1.CreateExecutionRequest result = new com.google.cloud.aiplatform.v1.CreateExecutionRequest(this);
      result.parent_ = parent_;
      if (executionBuilder_ == null) {
        result.execution_ = execution_;
      } else {
        result.execution_ = executionBuilder_.build();
      }
      result.executionId_ = executionId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.CreateExecutionRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CreateExecutionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CreateExecutionRequest other) {
      if (other == com.google.cloud.aiplatform.v1.CreateExecutionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasExecution()) {
        mergeExecution(other.getExecution());
      }
      if (!other.getExecutionId().isEmpty()) {
        executionId_ = other.executionId_;
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
      com.google.cloud.aiplatform.v1.CreateExecutionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.CreateExecutionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the Execution should
     * be created.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the Execution should
     * be created.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the Execution should
     * be created.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the Execution should
     * be created.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the MetadataStore where the Execution should
     * be created.
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.Execution execution_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.Execution, com.google.cloud.aiplatform.v1.Execution.Builder, com.google.cloud.aiplatform.v1.ExecutionOrBuilder> executionBuilder_;
    /**
     * <pre>
     * Required. The Execution to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the execution field is set.
     */
    public boolean hasExecution() {
      return executionBuilder_ != null || execution_ != null;
    }
    /**
     * <pre>
     * Required. The Execution to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The execution.
     */
    public com.google.cloud.aiplatform.v1.Execution getExecution() {
      if (executionBuilder_ == null) {
        return execution_ == null ? com.google.cloud.aiplatform.v1.Execution.getDefaultInstance() : execution_;
      } else {
        return executionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Execution to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setExecution(com.google.cloud.aiplatform.v1.Execution value) {
      if (executionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        execution_ = value;
        onChanged();
      } else {
        executionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Execution to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setExecution(
        com.google.cloud.aiplatform.v1.Execution.Builder builderForValue) {
      if (executionBuilder_ == null) {
        execution_ = builderForValue.build();
        onChanged();
      } else {
        executionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Execution to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeExecution(com.google.cloud.aiplatform.v1.Execution value) {
      if (executionBuilder_ == null) {
        if (execution_ != null) {
          execution_ =
            com.google.cloud.aiplatform.v1.Execution.newBuilder(execution_).mergeFrom(value).buildPartial();
        } else {
          execution_ = value;
        }
        onChanged();
      } else {
        executionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Execution to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearExecution() {
      if (executionBuilder_ == null) {
        execution_ = null;
        onChanged();
      } else {
        execution_ = null;
        executionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Execution to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.Execution.Builder getExecutionBuilder() {
      
      onChanged();
      return getExecutionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Execution to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.ExecutionOrBuilder getExecutionOrBuilder() {
      if (executionBuilder_ != null) {
        return executionBuilder_.getMessageOrBuilder();
      } else {
        return execution_ == null ?
            com.google.cloud.aiplatform.v1.Execution.getDefaultInstance() : execution_;
      }
    }
    /**
     * <pre>
     * Required. The Execution to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.Execution, com.google.cloud.aiplatform.v1.Execution.Builder, com.google.cloud.aiplatform.v1.ExecutionOrBuilder> 
        getExecutionFieldBuilder() {
      if (executionBuilder_ == null) {
        executionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Execution, com.google.cloud.aiplatform.v1.Execution.Builder, com.google.cloud.aiplatform.v1.ExecutionOrBuilder>(
                getExecution(),
                getParentForChildren(),
                isClean());
        execution_ = null;
      }
      return executionBuilder_;
    }

    private java.lang.Object executionId_ = "";
    /**
     * <pre>
     * The {execution} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * If not provided, the Execution's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all Executions in the parent MetadataStore.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting Execution.)
     * </pre>
     *
     * <code>string execution_id = 3;</code>
     * @return The executionId.
     */
    public java.lang.String getExecutionId() {
      java.lang.Object ref = executionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        executionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The {execution} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * If not provided, the Execution's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all Executions in the parent MetadataStore.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting Execution.)
     * </pre>
     *
     * <code>string execution_id = 3;</code>
     * @return The bytes for executionId.
     */
    public com.google.protobuf.ByteString
        getExecutionIdBytes() {
      java.lang.Object ref = executionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        executionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The {execution} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * If not provided, the Execution's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all Executions in the parent MetadataStore.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting Execution.)
     * </pre>
     *
     * <code>string execution_id = 3;</code>
     * @param value The executionId to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      executionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The {execution} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * If not provided, the Execution's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all Executions in the parent MetadataStore.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting Execution.)
     * </pre>
     *
     * <code>string execution_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExecutionId() {
      
      executionId_ = getDefaultInstance().getExecutionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The {execution} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * If not provided, the Execution's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all Executions in the parent MetadataStore.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting Execution.)
     * </pre>
     *
     * <code>string execution_id = 3;</code>
     * @param value The bytes for executionId to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      executionId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CreateExecutionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CreateExecutionRequest)
  private static final com.google.cloud.aiplatform.v1.CreateExecutionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CreateExecutionRequest();
  }

  public static com.google.cloud.aiplatform.v1.CreateExecutionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateExecutionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateExecutionRequest>() {
    @java.lang.Override
    public CreateExecutionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateExecutionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateExecutionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateExecutionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CreateExecutionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

