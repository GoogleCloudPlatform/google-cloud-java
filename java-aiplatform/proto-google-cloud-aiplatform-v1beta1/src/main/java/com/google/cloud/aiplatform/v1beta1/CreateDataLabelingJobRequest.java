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
// source: google/cloud/aiplatform/v1beta1/job_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [JobService.CreateDataLabelingJob][google.cloud.aiplatform.v1beta1.JobService.CreateDataLabelingJob].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest}
 */
public final class CreateDataLabelingJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest)
    CreateDataLabelingJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateDataLabelingJobRequest.newBuilder() to construct.
  private CreateDataLabelingJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDataLabelingJobRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDataLabelingJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.JobServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateDataLabelingJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.JobServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateDataLabelingJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest.class,
            com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent of the DataLabelingJob.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The parent of the DataLabelingJob.
   * Format: `projects/{project}/locations/{location}`
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

  public static final int DATA_LABELING_JOB_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.DataLabelingJob dataLabelingJob_;
  /**
   *
   *
   * <pre>
   * Required. The DataLabelingJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataLabelingJob field is set.
   */
  @java.lang.Override
  public boolean hasDataLabelingJob() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The DataLabelingJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataLabelingJob.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DataLabelingJob getDataLabelingJob() {
    return dataLabelingJob_ == null
        ? com.google.cloud.aiplatform.v1beta1.DataLabelingJob.getDefaultInstance()
        : dataLabelingJob_;
  }
  /**
   *
   *
   * <pre>
   * Required. The DataLabelingJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DataLabelingJobOrBuilder
      getDataLabelingJobOrBuilder() {
    return dataLabelingJob_ == null
        ? com.google.cloud.aiplatform.v1beta1.DataLabelingJob.getDefaultInstance()
        : dataLabelingJob_;
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
      output.writeMessage(2, getDataLabelingJob());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDataLabelingJob());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest other =
        (com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasDataLabelingJob() != other.hasDataLabelingJob()) return false;
    if (hasDataLabelingJob()) {
      if (!getDataLabelingJob().equals(other.getDataLabelingJob())) return false;
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
    if (hasDataLabelingJob()) {
      hash = (37 * hash) + DATA_LABELING_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getDataLabelingJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest prototype) {
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
   * [JobService.CreateDataLabelingJob][google.cloud.aiplatform.v1beta1.JobService.CreateDataLabelingJob].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest)
      com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.JobServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateDataLabelingJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.JobServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateDataLabelingJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest.class,
              com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataLabelingJobFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      dataLabelingJob_ = null;
      if (dataLabelingJobBuilder_ != null) {
        dataLabelingJobBuilder_.dispose();
        dataLabelingJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.JobServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateDataLabelingJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest result =
          new com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataLabelingJob_ =
            dataLabelingJobBuilder_ == null ? dataLabelingJob_ : dataLabelingJobBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDataLabelingJob()) {
        mergeDataLabelingJob(other.getDataLabelingJob());
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
                input.readMessage(getDataLabelingJobFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The parent of the DataLabelingJob.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The parent of the DataLabelingJob.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The parent of the DataLabelingJob.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The parent of the DataLabelingJob.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The parent of the DataLabelingJob.
     * Format: `projects/{project}/locations/{location}`
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

    private com.google.cloud.aiplatform.v1beta1.DataLabelingJob dataLabelingJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DataLabelingJob,
            com.google.cloud.aiplatform.v1beta1.DataLabelingJob.Builder,
            com.google.cloud.aiplatform.v1beta1.DataLabelingJobOrBuilder>
        dataLabelingJobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The DataLabelingJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dataLabelingJob field is set.
     */
    public boolean hasDataLabelingJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The DataLabelingJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dataLabelingJob.
     */
    public com.google.cloud.aiplatform.v1beta1.DataLabelingJob getDataLabelingJob() {
      if (dataLabelingJobBuilder_ == null) {
        return dataLabelingJob_ == null
            ? com.google.cloud.aiplatform.v1beta1.DataLabelingJob.getDefaultInstance()
            : dataLabelingJob_;
      } else {
        return dataLabelingJobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The DataLabelingJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataLabelingJob(com.google.cloud.aiplatform.v1beta1.DataLabelingJob value) {
      if (dataLabelingJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataLabelingJob_ = value;
      } else {
        dataLabelingJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DataLabelingJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataLabelingJob(
        com.google.cloud.aiplatform.v1beta1.DataLabelingJob.Builder builderForValue) {
      if (dataLabelingJobBuilder_ == null) {
        dataLabelingJob_ = builderForValue.build();
      } else {
        dataLabelingJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DataLabelingJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDataLabelingJob(com.google.cloud.aiplatform.v1beta1.DataLabelingJob value) {
      if (dataLabelingJobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && dataLabelingJob_ != null
            && dataLabelingJob_
                != com.google.cloud.aiplatform.v1beta1.DataLabelingJob.getDefaultInstance()) {
          getDataLabelingJobBuilder().mergeFrom(value);
        } else {
          dataLabelingJob_ = value;
        }
      } else {
        dataLabelingJobBuilder_.mergeFrom(value);
      }
      if (dataLabelingJob_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DataLabelingJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDataLabelingJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataLabelingJob_ = null;
      if (dataLabelingJobBuilder_ != null) {
        dataLabelingJobBuilder_.dispose();
        dataLabelingJobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DataLabelingJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.DataLabelingJob.Builder getDataLabelingJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataLabelingJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The DataLabelingJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.DataLabelingJobOrBuilder
        getDataLabelingJobOrBuilder() {
      if (dataLabelingJobBuilder_ != null) {
        return dataLabelingJobBuilder_.getMessageOrBuilder();
      } else {
        return dataLabelingJob_ == null
            ? com.google.cloud.aiplatform.v1beta1.DataLabelingJob.getDefaultInstance()
            : dataLabelingJob_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The DataLabelingJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DataLabelingJob data_labeling_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DataLabelingJob,
            com.google.cloud.aiplatform.v1beta1.DataLabelingJob.Builder,
            com.google.cloud.aiplatform.v1beta1.DataLabelingJobOrBuilder>
        getDataLabelingJobFieldBuilder() {
      if (dataLabelingJobBuilder_ == null) {
        dataLabelingJobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.DataLabelingJob,
                com.google.cloud.aiplatform.v1beta1.DataLabelingJob.Builder,
                com.google.cloud.aiplatform.v1beta1.DataLabelingJobOrBuilder>(
                getDataLabelingJob(), getParentForChildren(), isClean());
        dataLabelingJob_ = null;
      }
      return dataLabelingJobBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDataLabelingJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDataLabelingJobRequest>() {
        @java.lang.Override
        public CreateDataLabelingJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDataLabelingJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDataLabelingJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateDataLabelingJobRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
