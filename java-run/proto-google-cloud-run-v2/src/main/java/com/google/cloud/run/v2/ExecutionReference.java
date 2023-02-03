/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/run/v2/job.proto

package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * Reference to an Execution. Use /Executions.GetExecution with the given name
 * to get full execution including the latest status.
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.ExecutionReference}
 */
public final class ExecutionReference extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.ExecutionReference)
    ExecutionReferenceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExecutionReference.newBuilder() to construct.
  private ExecutionReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExecutionReference() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExecutionReference();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.run.v2.JobProto
        .internal_static_google_cloud_run_v2_ExecutionReference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.JobProto
        .internal_static_google_cloud_run_v2_ExecutionReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.ExecutionReference.class,
            com.google.cloud.run.v2.ExecutionReference.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Name of the execution.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the execution.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createTime_;
  /**
   *
   *
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   *
   *
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }

  public static final int COMPLETION_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp completionTime_;
  /**
   *
   *
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completion_time = 3;</code>
   *
   * @return Whether the completionTime field is set.
   */
  @java.lang.Override
  public boolean hasCompletionTime() {
    return completionTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completion_time = 3;</code>
   *
   * @return The completionTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCompletionTime() {
    return completionTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : completionTime_;
  }
  /**
   *
   *
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completion_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder() {
    return completionTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : completionTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (createTime_ != null) {
      output.writeMessage(2, getCreateTime());
    }
    if (completionTime_ != null) {
      output.writeMessage(3, getCompletionTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCreateTime());
    }
    if (completionTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCompletionTime());
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
    if (!(obj instanceof com.google.cloud.run.v2.ExecutionReference)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.ExecutionReference other =
        (com.google.cloud.run.v2.ExecutionReference) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime().equals(other.getCreateTime())) return false;
    }
    if (hasCompletionTime() != other.hasCompletionTime()) return false;
    if (hasCompletionTime()) {
      if (!getCompletionTime().equals(other.getCompletionTime())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    if (hasCompletionTime()) {
      hash = (37 * hash) + COMPLETION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCompletionTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.ExecutionReference parseFrom(
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

  public static Builder newBuilder(com.google.cloud.run.v2.ExecutionReference prototype) {
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
   * Reference to an Execution. Use /Executions.GetExecution with the given name
   * to get full execution including the latest status.
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.ExecutionReference}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.ExecutionReference)
      com.google.cloud.run.v2.ExecutionReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.run.v2.JobProto
          .internal_static_google_cloud_run_v2_ExecutionReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.JobProto
          .internal_static_google_cloud_run_v2_ExecutionReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.ExecutionReference.class,
              com.google.cloud.run.v2.ExecutionReference.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.ExecutionReference.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      completionTime_ = null;
      if (completionTimeBuilder_ != null) {
        completionTimeBuilder_.dispose();
        completionTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.run.v2.JobProto
          .internal_static_google_cloud_run_v2_ExecutionReference_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.ExecutionReference getDefaultInstanceForType() {
      return com.google.cloud.run.v2.ExecutionReference.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.ExecutionReference build() {
      com.google.cloud.run.v2.ExecutionReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.ExecutionReference buildPartial() {
      com.google.cloud.run.v2.ExecutionReference result =
          new com.google.cloud.run.v2.ExecutionReference(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.run.v2.ExecutionReference result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.createTime_ = createTimeBuilder_ == null ? createTime_ : createTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.completionTime_ =
            completionTimeBuilder_ == null ? completionTime_ : completionTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.run.v2.ExecutionReference) {
        return mergeFrom((com.google.cloud.run.v2.ExecutionReference) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.ExecutionReference other) {
      if (other == com.google.cloud.run.v2.ExecutionReference.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.hasCompletionTime()) {
        mergeCompletionTime(other.getCompletionTime());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getCreateTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getCompletionTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name of the execution.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the execution.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the execution.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the execution.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the execution.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        createTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     *
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     *
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
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
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
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
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && createTime_ != null
            && createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreateTimeBuilder().mergeFrom(value);
        } else {
          createTime_ = value;
        }
      } else {
        createTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
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
     *
     *
     * <pre>
     * Creation timestamp of the execution.
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
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : createTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(), getParentForChildren(), isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private com.google.protobuf.Timestamp completionTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        completionTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 3;</code>
     *
     * @return Whether the completionTime field is set.
     */
    public boolean hasCompletionTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 3;</code>
     *
     * @return The completionTime.
     */
    public com.google.protobuf.Timestamp getCompletionTime() {
      if (completionTimeBuilder_ == null) {
        return completionTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : completionTime_;
      } else {
        return completionTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 3;</code>
     */
    public Builder setCompletionTime(com.google.protobuf.Timestamp value) {
      if (completionTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        completionTime_ = value;
      } else {
        completionTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 3;</code>
     */
    public Builder setCompletionTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (completionTimeBuilder_ == null) {
        completionTime_ = builderForValue.build();
      } else {
        completionTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 3;</code>
     */
    public Builder mergeCompletionTime(com.google.protobuf.Timestamp value) {
      if (completionTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && completionTime_ != null
            && completionTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCompletionTimeBuilder().mergeFrom(value);
        } else {
          completionTime_ = value;
        }
      } else {
        completionTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 3;</code>
     */
    public Builder clearCompletionTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      completionTime_ = null;
      if (completionTimeBuilder_ != null) {
        completionTimeBuilder_.dispose();
        completionTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCompletionTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCompletionTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder() {
      if (completionTimeBuilder_ != null) {
        return completionTimeBuilder_.getMessageOrBuilder();
      } else {
        return completionTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : completionTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Creation timestamp of the execution.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp completion_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getCompletionTimeFieldBuilder() {
      if (completionTimeBuilder_ == null) {
        completionTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getCompletionTime(), getParentForChildren(), isClean());
        completionTime_ = null;
      }
      return completionTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.ExecutionReference)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.ExecutionReference)
  private static final com.google.cloud.run.v2.ExecutionReference DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.ExecutionReference();
  }

  public static com.google.cloud.run.v2.ExecutionReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecutionReference> PARSER =
      new com.google.protobuf.AbstractParser<ExecutionReference>() {
        @java.lang.Override
        public ExecutionReference parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExecutionReference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecutionReference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.ExecutionReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
