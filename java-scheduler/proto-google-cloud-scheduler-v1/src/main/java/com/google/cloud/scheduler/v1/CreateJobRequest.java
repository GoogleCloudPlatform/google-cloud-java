/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/scheduler/v1/cloudscheduler.proto

package com.google.cloud.scheduler.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [CreateJob][google.cloud.scheduler.v1.CloudScheduler.CreateJob].
 * </pre>
 *
 * Protobuf type {@code google.cloud.scheduler.v1.CreateJobRequest}
 */
public final class CreateJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.scheduler.v1.CreateJobRequest)
    CreateJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateJobRequest.newBuilder() to construct.
  private CreateJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateJobRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.scheduler.v1.SchedulerProto
        .internal_static_google_cloud_scheduler_v1_CreateJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.scheduler.v1.SchedulerProto
        .internal_static_google_cloud_scheduler_v1_CreateJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.scheduler.v1.CreateJobRequest.class,
            com.google.cloud.scheduler.v1.CreateJobRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The location name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID`.
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
   * Required. The location name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID`.
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

  public static final int JOB_FIELD_NUMBER = 2;
  private com.google.cloud.scheduler.v1.Job job_;
  /**
   *
   *
   * <pre>
   * Required. The job to add. The user can optionally specify a name for the
   * job in [name][google.cloud.scheduler.v1.Job.name].
   * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
   * existing job. If a name is not specified then the system will
   * generate a random unique name that will be returned
   * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the job field is set.
   */
  @java.lang.Override
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The job to add. The user can optionally specify a name for the
   * job in [name][google.cloud.scheduler.v1.Job.name].
   * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
   * existing job. If a name is not specified then the system will
   * generate a random unique name that will be returned
   * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The job.
   */
  @java.lang.Override
  public com.google.cloud.scheduler.v1.Job getJob() {
    return job_ == null ? com.google.cloud.scheduler.v1.Job.getDefaultInstance() : job_;
  }
  /**
   *
   *
   * <pre>
   * Required. The job to add. The user can optionally specify a name for the
   * job in [name][google.cloud.scheduler.v1.Job.name].
   * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
   * existing job. If a name is not specified then the system will
   * generate a random unique name that will be returned
   * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.scheduler.v1.JobOrBuilder getJobOrBuilder() {
    return job_ == null ? com.google.cloud.scheduler.v1.Job.getDefaultInstance() : job_;
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
    if (job_ != null) {
      output.writeMessage(2, getJob());
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
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getJob());
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
    if (!(obj instanceof com.google.cloud.scheduler.v1.CreateJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.scheduler.v1.CreateJobRequest other =
        (com.google.cloud.scheduler.v1.CreateJobRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob().equals(other.getJob())) return false;
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
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.scheduler.v1.CreateJobRequest prototype) {
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
   * Request message for
   * [CreateJob][google.cloud.scheduler.v1.CloudScheduler.CreateJob].
   * </pre>
   *
   * Protobuf type {@code google.cloud.scheduler.v1.CreateJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.scheduler.v1.CreateJobRequest)
      com.google.cloud.scheduler.v1.CreateJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.scheduler.v1.SchedulerProto
          .internal_static_google_cloud_scheduler_v1_CreateJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.scheduler.v1.SchedulerProto
          .internal_static_google_cloud_scheduler_v1_CreateJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.scheduler.v1.CreateJobRequest.class,
              com.google.cloud.scheduler.v1.CreateJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.scheduler.v1.CreateJobRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.scheduler.v1.SchedulerProto
          .internal_static_google_cloud_scheduler_v1_CreateJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1.CreateJobRequest getDefaultInstanceForType() {
      return com.google.cloud.scheduler.v1.CreateJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1.CreateJobRequest build() {
      com.google.cloud.scheduler.v1.CreateJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1.CreateJobRequest buildPartial() {
      com.google.cloud.scheduler.v1.CreateJobRequest result =
          new com.google.cloud.scheduler.v1.CreateJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.scheduler.v1.CreateJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.job_ = jobBuilder_ == null ? job_ : jobBuilder_.build();
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
      if (other instanceof com.google.cloud.scheduler.v1.CreateJobRequest) {
        return mergeFrom((com.google.cloud.scheduler.v1.CreateJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.scheduler.v1.CreateJobRequest other) {
      if (other == com.google.cloud.scheduler.v1.CreateJobRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasJob()) {
        mergeJob(other.getJob());
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
                input.readMessage(getJobFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The location name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID`.
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
     * Required. The location name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID`.
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
     * Required. The location name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID`.
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
     * Required. The location name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID`.
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
     * Required. The location name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID`.
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

    private com.google.cloud.scheduler.v1.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.scheduler.v1.Job,
            com.google.cloud.scheduler.v1.Job.Builder,
            com.google.cloud.scheduler.v1.JobOrBuilder>
        jobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The job to add. The user can optionally specify a name for the
     * job in [name][google.cloud.scheduler.v1.Job.name].
     * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
     * existing job. If a name is not specified then the system will
     * generate a random unique name that will be returned
     * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the job field is set.
     */
    public boolean hasJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The job to add. The user can optionally specify a name for the
     * job in [name][google.cloud.scheduler.v1.Job.name].
     * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
     * existing job. If a name is not specified then the system will
     * generate a random unique name that will be returned
     * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The job.
     */
    public com.google.cloud.scheduler.v1.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.cloud.scheduler.v1.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The job to add. The user can optionally specify a name for the
     * job in [name][google.cloud.scheduler.v1.Job.name].
     * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
     * existing job. If a name is not specified then the system will
     * generate a random unique name that will be returned
     * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJob(com.google.cloud.scheduler.v1.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
      } else {
        jobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job to add. The user can optionally specify a name for the
     * job in [name][google.cloud.scheduler.v1.Job.name].
     * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
     * existing job. If a name is not specified then the system will
     * generate a random unique name that will be returned
     * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJob(com.google.cloud.scheduler.v1.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job to add. The user can optionally specify a name for the
     * job in [name][google.cloud.scheduler.v1.Job.name].
     * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
     * existing job. If a name is not specified then the system will
     * generate a random unique name that will be returned
     * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeJob(com.google.cloud.scheduler.v1.Job value) {
      if (jobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && job_ != null
            && job_ != com.google.cloud.scheduler.v1.Job.getDefaultInstance()) {
          getJobBuilder().mergeFrom(value);
        } else {
          job_ = value;
        }
      } else {
        jobBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job to add. The user can optionally specify a name for the
     * job in [name][google.cloud.scheduler.v1.Job.name].
     * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
     * existing job. If a name is not specified then the system will
     * generate a random unique name that will be returned
     * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job to add. The user can optionally specify a name for the
     * job in [name][google.cloud.scheduler.v1.Job.name].
     * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
     * existing job. If a name is not specified then the system will
     * generate a random unique name that will be returned
     * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.scheduler.v1.Job.Builder getJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The job to add. The user can optionally specify a name for the
     * job in [name][google.cloud.scheduler.v1.Job.name].
     * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
     * existing job. If a name is not specified then the system will
     * generate a random unique name that will be returned
     * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.scheduler.v1.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ? com.google.cloud.scheduler.v1.Job.getDefaultInstance() : job_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The job to add. The user can optionally specify a name for the
     * job in [name][google.cloud.scheduler.v1.Job.name].
     * [name][google.cloud.scheduler.v1.Job.name] cannot be the same as an
     * existing job. If a name is not specified then the system will
     * generate a random unique name that will be returned
     * ([name][google.cloud.scheduler.v1.Job.name]) in the response.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.scheduler.v1.Job,
            com.google.cloud.scheduler.v1.Job.Builder,
            com.google.cloud.scheduler.v1.JobOrBuilder>
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.scheduler.v1.Job,
                com.google.cloud.scheduler.v1.Job.Builder,
                com.google.cloud.scheduler.v1.JobOrBuilder>(
                getJob(), getParentForChildren(), isClean());
        job_ = null;
      }
      return jobBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.scheduler.v1.CreateJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.scheduler.v1.CreateJobRequest)
  private static final com.google.cloud.scheduler.v1.CreateJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.scheduler.v1.CreateJobRequest();
  }

  public static com.google.cloud.scheduler.v1.CreateJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateJobRequest>() {
        @java.lang.Override
        public CreateJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.scheduler.v1.CreateJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
