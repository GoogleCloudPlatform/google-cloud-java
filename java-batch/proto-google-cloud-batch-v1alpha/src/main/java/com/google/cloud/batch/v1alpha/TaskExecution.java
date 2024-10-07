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
// source: google/cloud/batch/v1alpha/task.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.batch.v1alpha;

/**
 *
 *
 * <pre>
 * This Task Execution field includes detail information for
 * task execution procedures, based on StatusEvent types.
 * </pre>
 *
 * Protobuf type {@code google.cloud.batch.v1alpha.TaskExecution}
 */
public final class TaskExecution extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.batch.v1alpha.TaskExecution)
    TaskExecutionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TaskExecution.newBuilder() to construct.
  private TaskExecution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TaskExecution() {
    stderrSnippet_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TaskExecution();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.batch.v1alpha.TaskProto
        .internal_static_google_cloud_batch_v1alpha_TaskExecution_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.batch.v1alpha.TaskProto
        .internal_static_google_cloud_batch_v1alpha_TaskExecution_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.batch.v1alpha.TaskExecution.class,
            com.google.cloud.batch.v1alpha.TaskExecution.Builder.class);
  }

  public static final int EXIT_CODE_FIELD_NUMBER = 1;
  private int exitCode_ = 0;
  /**
   *
   *
   * <pre>
   * The exit code of a finished task.
   *
   * If the task succeeded, the exit code will be 0. If the task failed but not
   * due to the following reasons, the exit code will be 50000.
   *
   * Otherwise, it can be from different sources:
   * * Batch known failures:
   * https://cloud.google.com/batch/docs/troubleshooting#reserved-exit-codes.
   * * Batch runnable execution failures; you can rely on Batch logs to further
   * diagnose: https://cloud.google.com/batch/docs/analyze-job-using-logs. If
   * there are multiple runnables failures, Batch only exposes the first error.
   * </pre>
   *
   * <code>int32 exit_code = 1;</code>
   *
   * @return The exitCode.
   */
  @java.lang.Override
  public int getExitCode() {
    return exitCode_;
  }

  public static final int STDERR_SNIPPET_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object stderrSnippet_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The tail end of any content written to standard error by the task
   * execution. This field will be populated only when the execution failed.
   * </pre>
   *
   * <code>string stderr_snippet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The stderrSnippet.
   */
  @java.lang.Override
  public java.lang.String getStderrSnippet() {
    java.lang.Object ref = stderrSnippet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stderrSnippet_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The tail end of any content written to standard error by the task
   * execution. This field will be populated only when the execution failed.
   * </pre>
   *
   * <code>string stderr_snippet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for stderrSnippet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStderrSnippetBytes() {
    java.lang.Object ref = stderrSnippet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      stderrSnippet_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (exitCode_ != 0) {
      output.writeInt32(1, exitCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stderrSnippet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stderrSnippet_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (exitCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, exitCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stderrSnippet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stderrSnippet_);
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
    if (!(obj instanceof com.google.cloud.batch.v1alpha.TaskExecution)) {
      return super.equals(obj);
    }
    com.google.cloud.batch.v1alpha.TaskExecution other =
        (com.google.cloud.batch.v1alpha.TaskExecution) obj;

    if (getExitCode() != other.getExitCode()) return false;
    if (!getStderrSnippet().equals(other.getStderrSnippet())) return false;
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
    hash = (37 * hash) + EXIT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getExitCode();
    hash = (37 * hash) + STDERR_SNIPPET_FIELD_NUMBER;
    hash = (53 * hash) + getStderrSnippet().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution parseFrom(
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

  public static Builder newBuilder(com.google.cloud.batch.v1alpha.TaskExecution prototype) {
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
   * This Task Execution field includes detail information for
   * task execution procedures, based on StatusEvent types.
   * </pre>
   *
   * Protobuf type {@code google.cloud.batch.v1alpha.TaskExecution}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.batch.v1alpha.TaskExecution)
      com.google.cloud.batch.v1alpha.TaskExecutionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.batch.v1alpha.TaskProto
          .internal_static_google_cloud_batch_v1alpha_TaskExecution_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.batch.v1alpha.TaskProto
          .internal_static_google_cloud_batch_v1alpha_TaskExecution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.batch.v1alpha.TaskExecution.class,
              com.google.cloud.batch.v1alpha.TaskExecution.Builder.class);
    }

    // Construct using com.google.cloud.batch.v1alpha.TaskExecution.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      exitCode_ = 0;
      stderrSnippet_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.batch.v1alpha.TaskProto
          .internal_static_google_cloud_batch_v1alpha_TaskExecution_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.TaskExecution getDefaultInstanceForType() {
      return com.google.cloud.batch.v1alpha.TaskExecution.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.TaskExecution build() {
      com.google.cloud.batch.v1alpha.TaskExecution result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.TaskExecution buildPartial() {
      com.google.cloud.batch.v1alpha.TaskExecution result =
          new com.google.cloud.batch.v1alpha.TaskExecution(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.batch.v1alpha.TaskExecution result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.exitCode_ = exitCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stderrSnippet_ = stderrSnippet_;
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
      if (other instanceof com.google.cloud.batch.v1alpha.TaskExecution) {
        return mergeFrom((com.google.cloud.batch.v1alpha.TaskExecution) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.batch.v1alpha.TaskExecution other) {
      if (other == com.google.cloud.batch.v1alpha.TaskExecution.getDefaultInstance()) return this;
      if (other.getExitCode() != 0) {
        setExitCode(other.getExitCode());
      }
      if (!other.getStderrSnippet().isEmpty()) {
        stderrSnippet_ = other.stderrSnippet_;
        bitField0_ |= 0x00000002;
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
            case 8:
              {
                exitCode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                stderrSnippet_ = input.readStringRequireUtf8();
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

    private int exitCode_;
    /**
     *
     *
     * <pre>
     * The exit code of a finished task.
     *
     * If the task succeeded, the exit code will be 0. If the task failed but not
     * due to the following reasons, the exit code will be 50000.
     *
     * Otherwise, it can be from different sources:
     * * Batch known failures:
     * https://cloud.google.com/batch/docs/troubleshooting#reserved-exit-codes.
     * * Batch runnable execution failures; you can rely on Batch logs to further
     * diagnose: https://cloud.google.com/batch/docs/analyze-job-using-logs. If
     * there are multiple runnables failures, Batch only exposes the first error.
     * </pre>
     *
     * <code>int32 exit_code = 1;</code>
     *
     * @return The exitCode.
     */
    @java.lang.Override
    public int getExitCode() {
      return exitCode_;
    }
    /**
     *
     *
     * <pre>
     * The exit code of a finished task.
     *
     * If the task succeeded, the exit code will be 0. If the task failed but not
     * due to the following reasons, the exit code will be 50000.
     *
     * Otherwise, it can be from different sources:
     * * Batch known failures:
     * https://cloud.google.com/batch/docs/troubleshooting#reserved-exit-codes.
     * * Batch runnable execution failures; you can rely on Batch logs to further
     * diagnose: https://cloud.google.com/batch/docs/analyze-job-using-logs. If
     * there are multiple runnables failures, Batch only exposes the first error.
     * </pre>
     *
     * <code>int32 exit_code = 1;</code>
     *
     * @param value The exitCode to set.
     * @return This builder for chaining.
     */
    public Builder setExitCode(int value) {

      exitCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The exit code of a finished task.
     *
     * If the task succeeded, the exit code will be 0. If the task failed but not
     * due to the following reasons, the exit code will be 50000.
     *
     * Otherwise, it can be from different sources:
     * * Batch known failures:
     * https://cloud.google.com/batch/docs/troubleshooting#reserved-exit-codes.
     * * Batch runnable execution failures; you can rely on Batch logs to further
     * diagnose: https://cloud.google.com/batch/docs/analyze-job-using-logs. If
     * there are multiple runnables failures, Batch only exposes the first error.
     * </pre>
     *
     * <code>int32 exit_code = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExitCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      exitCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object stderrSnippet_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The tail end of any content written to standard error by the task
     * execution. This field will be populated only when the execution failed.
     * </pre>
     *
     * <code>string stderr_snippet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The stderrSnippet.
     */
    public java.lang.String getStderrSnippet() {
      java.lang.Object ref = stderrSnippet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stderrSnippet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The tail end of any content written to standard error by the task
     * execution. This field will be populated only when the execution failed.
     * </pre>
     *
     * <code>string stderr_snippet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for stderrSnippet.
     */
    public com.google.protobuf.ByteString getStderrSnippetBytes() {
      java.lang.Object ref = stderrSnippet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        stderrSnippet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The tail end of any content written to standard error by the task
     * execution. This field will be populated only when the execution failed.
     * </pre>
     *
     * <code>string stderr_snippet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The stderrSnippet to set.
     * @return This builder for chaining.
     */
    public Builder setStderrSnippet(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      stderrSnippet_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The tail end of any content written to standard error by the task
     * execution. This field will be populated only when the execution failed.
     * </pre>
     *
     * <code>string stderr_snippet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStderrSnippet() {
      stderrSnippet_ = getDefaultInstance().getStderrSnippet();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The tail end of any content written to standard error by the task
     * execution. This field will be populated only when the execution failed.
     * </pre>
     *
     * <code>string stderr_snippet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for stderrSnippet to set.
     * @return This builder for chaining.
     */
    public Builder setStderrSnippetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      stderrSnippet_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.batch.v1alpha.TaskExecution)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.batch.v1alpha.TaskExecution)
  private static final com.google.cloud.batch.v1alpha.TaskExecution DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.batch.v1alpha.TaskExecution();
  }

  public static com.google.cloud.batch.v1alpha.TaskExecution getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskExecution> PARSER =
      new com.google.protobuf.AbstractParser<TaskExecution>() {
        @java.lang.Override
        public TaskExecution parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskExecution> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskExecution> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.batch.v1alpha.TaskExecution getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
