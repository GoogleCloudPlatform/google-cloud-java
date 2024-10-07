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
// source: google/cloud/workflows/executions/v1/executions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.workflows.executions.v1;

/**
 *
 *
 * <pre>
 * Request for the
 * [CreateExecution][google.cloud.workflows.executions.v1.Executions.CreateExecution]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.workflows.executions.v1.CreateExecutionRequest}
 */
public final class CreateExecutionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.workflows.executions.v1.CreateExecutionRequest)
    CreateExecutionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateExecutionRequest.newBuilder() to construct.
  private CreateExecutionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateExecutionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateExecutionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.workflows.executions.v1.ExecutionsProto
        .internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.workflows.executions.v1.ExecutionsProto
        .internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.workflows.executions.v1.CreateExecutionRequest.class,
            com.google.cloud.workflows.executions.v1.CreateExecutionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the workflow for which an execution should be created.
   * Format: projects/{project}/locations/{location}/workflows/{workflow}
   * The latest revision of the workflow will be used.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the workflow for which an execution should be created.
   * Format: projects/{project}/locations/{location}/workflows/{workflow}
   * The latest revision of the workflow will be used.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXECUTION_FIELD_NUMBER = 2;
  private com.google.cloud.workflows.executions.v1.Execution execution_;
  /**
   *
   *
   * <pre>
   * Required. Execution to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the execution field is set.
   */
  @java.lang.Override
  public boolean hasExecution() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Execution to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The execution.
   */
  @java.lang.Override
  public com.google.cloud.workflows.executions.v1.Execution getExecution() {
    return execution_ == null
        ? com.google.cloud.workflows.executions.v1.Execution.getDefaultInstance()
        : execution_;
  }
  /**
   *
   *
   * <pre>
   * Required. Execution to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.workflows.executions.v1.ExecutionOrBuilder getExecutionOrBuilder() {
    return execution_ == null
        ? com.google.cloud.workflows.executions.v1.Execution.getDefaultInstance()
        : execution_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getExecution());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExecution());
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
    if (!(obj instanceof com.google.cloud.workflows.executions.v1.CreateExecutionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.workflows.executions.v1.CreateExecutionRequest other =
        (com.google.cloud.workflows.executions.v1.CreateExecutionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasExecution() != other.hasExecution()) return false;
    if (hasExecution()) {
      if (!getExecution().equals(other.getExecution())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasExecution()) {
      hash = (37 * hash) + EXECUTION_FIELD_NUMBER;
      hash = (53 * hash) + getExecution().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.workflows.executions.v1.CreateExecutionRequest prototype) {
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
   * Request for the
   * [CreateExecution][google.cloud.workflows.executions.v1.Executions.CreateExecution]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.workflows.executions.v1.CreateExecutionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.workflows.executions.v1.CreateExecutionRequest)
      com.google.cloud.workflows.executions.v1.CreateExecutionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.workflows.executions.v1.ExecutionsProto
          .internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.workflows.executions.v1.ExecutionsProto
          .internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.workflows.executions.v1.CreateExecutionRequest.class,
              com.google.cloud.workflows.executions.v1.CreateExecutionRequest.Builder.class);
    }

    // Construct using com.google.cloud.workflows.executions.v1.CreateExecutionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getExecutionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      execution_ = null;
      if (executionBuilder_ != null) {
        executionBuilder_.dispose();
        executionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.workflows.executions.v1.ExecutionsProto
          .internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.workflows.executions.v1.CreateExecutionRequest
        getDefaultInstanceForType() {
      return com.google.cloud.workflows.executions.v1.CreateExecutionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.workflows.executions.v1.CreateExecutionRequest build() {
      com.google.cloud.workflows.executions.v1.CreateExecutionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.workflows.executions.v1.CreateExecutionRequest buildPartial() {
      com.google.cloud.workflows.executions.v1.CreateExecutionRequest result =
          new com.google.cloud.workflows.executions.v1.CreateExecutionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.workflows.executions.v1.CreateExecutionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.execution_ = executionBuilder_ == null ? execution_ : executionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.workflows.executions.v1.CreateExecutionRequest) {
        return mergeFrom((com.google.cloud.workflows.executions.v1.CreateExecutionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.workflows.executions.v1.CreateExecutionRequest other) {
      if (other
          == com.google.cloud.workflows.executions.v1.CreateExecutionRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExecution()) {
        mergeExecution(other.getExecution());
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getExecutionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the workflow for which an execution should be created.
     * Format: projects/{project}/locations/{location}/workflows/{workflow}
     * The latest revision of the workflow will be used.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the workflow for which an execution should be created.
     * Format: projects/{project}/locations/{location}/workflows/{workflow}
     * The latest revision of the workflow will be used.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the workflow for which an execution should be created.
     * Format: projects/{project}/locations/{location}/workflows/{workflow}
     * The latest revision of the workflow will be used.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the workflow for which an execution should be created.
     * Format: projects/{project}/locations/{location}/workflows/{workflow}
     * The latest revision of the workflow will be used.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the workflow for which an execution should be created.
     * Format: projects/{project}/locations/{location}/workflows/{workflow}
     * The latest revision of the workflow will be used.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.workflows.executions.v1.Execution execution_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workflows.executions.v1.Execution,
            com.google.cloud.workflows.executions.v1.Execution.Builder,
            com.google.cloud.workflows.executions.v1.ExecutionOrBuilder>
        executionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Execution to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the execution field is set.
     */
    public boolean hasExecution() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Execution to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The execution.
     */
    public com.google.cloud.workflows.executions.v1.Execution getExecution() {
      if (executionBuilder_ == null) {
        return execution_ == null
            ? com.google.cloud.workflows.executions.v1.Execution.getDefaultInstance()
            : execution_;
      } else {
        return executionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Execution to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExecution(com.google.cloud.workflows.executions.v1.Execution value) {
      if (executionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        execution_ = value;
      } else {
        executionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Execution to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExecution(
        com.google.cloud.workflows.executions.v1.Execution.Builder builderForValue) {
      if (executionBuilder_ == null) {
        execution_ = builderForValue.build();
      } else {
        executionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Execution to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeExecution(com.google.cloud.workflows.executions.v1.Execution value) {
      if (executionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && execution_ != null
            && execution_
                != com.google.cloud.workflows.executions.v1.Execution.getDefaultInstance()) {
          getExecutionBuilder().mergeFrom(value);
        } else {
          execution_ = value;
        }
      } else {
        executionBuilder_.mergeFrom(value);
      }
      if (execution_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Execution to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearExecution() {
      bitField0_ = (bitField0_ & ~0x00000002);
      execution_ = null;
      if (executionBuilder_ != null) {
        executionBuilder_.dispose();
        executionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Execution to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workflows.executions.v1.Execution.Builder getExecutionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExecutionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Execution to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workflows.executions.v1.ExecutionOrBuilder getExecutionOrBuilder() {
      if (executionBuilder_ != null) {
        return executionBuilder_.getMessageOrBuilder();
      } else {
        return execution_ == null
            ? com.google.cloud.workflows.executions.v1.Execution.getDefaultInstance()
            : execution_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Execution to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workflows.executions.v1.Execution,
            com.google.cloud.workflows.executions.v1.Execution.Builder,
            com.google.cloud.workflows.executions.v1.ExecutionOrBuilder>
        getExecutionFieldBuilder() {
      if (executionBuilder_ == null) {
        executionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.workflows.executions.v1.Execution,
                com.google.cloud.workflows.executions.v1.Execution.Builder,
                com.google.cloud.workflows.executions.v1.ExecutionOrBuilder>(
                getExecution(), getParentForChildren(), isClean());
        execution_ = null;
      }
      return executionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.workflows.executions.v1.CreateExecutionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.workflows.executions.v1.CreateExecutionRequest)
  private static final com.google.cloud.workflows.executions.v1.CreateExecutionRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.workflows.executions.v1.CreateExecutionRequest();
  }

  public static com.google.cloud.workflows.executions.v1.CreateExecutionRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateExecutionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateExecutionRequest>() {
        @java.lang.Override
        public CreateExecutionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateExecutionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateExecutionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.workflows.executions.v1.CreateExecutionRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
