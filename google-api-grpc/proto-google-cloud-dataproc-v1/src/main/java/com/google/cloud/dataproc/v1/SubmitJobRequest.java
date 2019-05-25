// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * A request to submit a job.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.SubmitJobRequest}
 */
public final class SubmitJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.SubmitJobRequest)
    SubmitJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SubmitJobRequest.newBuilder() to construct.
  private SubmitJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubmitJobRequest() {
    projectId_ = "";
    region_ = "";
    requestId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SubmitJobRequest(
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

              projectId_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.dataproc.v1.Job.Builder subBuilder = null;
              if (job_ != null) {
                subBuilder = job_.toBuilder();
              }
              job_ =
                  input.readMessage(com.google.cloud.dataproc.v1.Job.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(job_);
                job_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              region_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              requestId_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.JobsProto
        .internal_static_google_cloud_dataproc_v1_SubmitJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.JobsProto
        .internal_static_google_cloud_dataproc_v1_SubmitJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.SubmitJobRequest.class,
            com.google.cloud.dataproc.v1.SubmitJobRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_FIELD_NUMBER = 3;
  private volatile java.lang.Object region_;
  /**
   *
   *
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 3;</code>
   */
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 3;</code>
   */
  public com.google.protobuf.ByteString getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      region_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_FIELD_NUMBER = 2;
  private com.google.cloud.dataproc.v1.Job job_;
  /**
   *
   *
   * <pre>
   * Required. The job resource.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
   */
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The job resource.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
   */
  public com.google.cloud.dataproc.v1.Job getJob() {
    return job_ == null ? com.google.cloud.dataproc.v1.Job.getDefaultInstance() : job_;
  }
  /**
   *
   *
   * <pre>
   * Required. The job resource.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
   */
  public com.google.cloud.dataproc.v1.JobOrBuilder getJobOrBuilder() {
    return getJob();
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object requestId_;
  /**
   *
   *
   * <pre>
   * Optional. A unique id used to identify the request. If the server
   * receives two [SubmitJobRequest][google.cloud.dataproc.v1.SubmitJobRequest] requests  with the same
   * id, then the second request will be ignored and the
   * first [Job][google.cloud.dataproc.v1.Job] created and stored in the backend
   * is returned.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   */
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. A unique id used to identify the request. If the server
   * receives two [SubmitJobRequest][google.cloud.dataproc.v1.SubmitJobRequest] requests  with the same
   * id, then the second request will be ignored and the
   * first [Job][google.cloud.dataproc.v1.Job] created and stored in the backend
   * is returned.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   */
  public com.google.protobuf.ByteString getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      requestId_ = b;
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
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (job_ != null) {
      output.writeMessage(2, getJob());
    }
    if (!getRegionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, region_);
    }
    if (!getRequestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, requestId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getJob());
    }
    if (!getRegionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, region_);
    }
    if (!getRequestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, requestId_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.SubmitJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.SubmitJobRequest other =
        (com.google.cloud.dataproc.v1.SubmitJobRequest) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (!getRegion().equals(other.getRegion())) return false;
    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob().equals(other.getJob())) return false;
    }
    if (!getRequestId().equals(other.getRequestId())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.SubmitJobRequest prototype) {
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
   * A request to submit a job.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.SubmitJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.SubmitJobRequest)
      com.google.cloud.dataproc.v1.SubmitJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.JobsProto
          .internal_static_google_cloud_dataproc_v1_SubmitJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.JobsProto
          .internal_static_google_cloud_dataproc_v1_SubmitJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.SubmitJobRequest.class,
              com.google.cloud.dataproc.v1.SubmitJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.SubmitJobRequest.newBuilder()
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
      projectId_ = "";

      region_ = "";

      if (jobBuilder_ == null) {
        job_ = null;
      } else {
        job_ = null;
        jobBuilder_ = null;
      }
      requestId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.JobsProto
          .internal_static_google_cloud_dataproc_v1_SubmitJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SubmitJobRequest getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.SubmitJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SubmitJobRequest build() {
      com.google.cloud.dataproc.v1.SubmitJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SubmitJobRequest buildPartial() {
      com.google.cloud.dataproc.v1.SubmitJobRequest result =
          new com.google.cloud.dataproc.v1.SubmitJobRequest(this);
      result.projectId_ = projectId_;
      result.region_ = region_;
      if (jobBuilder_ == null) {
        result.job_ = job_;
      } else {
        result.job_ = jobBuilder_.build();
      }
      result.requestId_ = requestId_;
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
      if (other instanceof com.google.cloud.dataproc.v1.SubmitJobRequest) {
        return mergeFrom((com.google.cloud.dataproc.v1.SubmitJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.SubmitJobRequest other) {
      if (other == com.google.cloud.dataproc.v1.SubmitJobRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
        onChanged();
      }
      if (other.hasJob()) {
        mergeJob(other.getJob());
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
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
      com.google.cloud.dataproc.v1.SubmitJobRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.SubmitJobRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the Google Cloud Platform project that the job
     * belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the Google Cloud Platform project that the job
     * belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the Google Cloud Platform project that the job
     * belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the Google Cloud Platform project that the job
     * belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder clearProjectId() {

      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the Google Cloud Platform project that the job
     * belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object region_ = "";
    /**
     *
     *
     * <pre>
     * Required. The Cloud Dataproc region in which to handle the request.
     * </pre>
     *
     * <code>string region = 3;</code>
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud Dataproc region in which to handle the request.
     * </pre>
     *
     * <code>string region = 3;</code>
     */
    public com.google.protobuf.ByteString getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud Dataproc region in which to handle the request.
     * </pre>
     *
     * <code>string region = 3;</code>
     */
    public Builder setRegion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      region_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud Dataproc region in which to handle the request.
     * </pre>
     *
     * <code>string region = 3;</code>
     */
    public Builder clearRegion() {

      region_ = getDefaultInstance().getRegion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud Dataproc region in which to handle the request.
     * </pre>
     *
     * <code>string region = 3;</code>
     */
    public Builder setRegionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      region_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dataproc.v1.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.Job,
            com.google.cloud.dataproc.v1.Job.Builder,
            com.google.cloud.dataproc.v1.JobOrBuilder>
        jobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The job resource.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
     */
    public boolean hasJob() {
      return jobBuilder_ != null || job_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The job resource.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
     */
    public com.google.cloud.dataproc.v1.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.cloud.dataproc.v1.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The job resource.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
     */
    public Builder setJob(com.google.cloud.dataproc.v1.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
        onChanged();
      } else {
        jobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job resource.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
     */
    public Builder setJob(com.google.cloud.dataproc.v1.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
        onChanged();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job resource.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
     */
    public Builder mergeJob(com.google.cloud.dataproc.v1.Job value) {
      if (jobBuilder_ == null) {
        if (job_ != null) {
          job_ = com.google.cloud.dataproc.v1.Job.newBuilder(job_).mergeFrom(value).buildPartial();
        } else {
          job_ = value;
        }
        onChanged();
      } else {
        jobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job resource.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
     */
    public Builder clearJob() {
      if (jobBuilder_ == null) {
        job_ = null;
        onChanged();
      } else {
        job_ = null;
        jobBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The job resource.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
     */
    public com.google.cloud.dataproc.v1.Job.Builder getJobBuilder() {

      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The job resource.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
     */
    public com.google.cloud.dataproc.v1.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ? com.google.cloud.dataproc.v1.Job.getDefaultInstance() : job_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The job resource.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.Job job = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.Job,
            com.google.cloud.dataproc.v1.Job.Builder,
            com.google.cloud.dataproc.v1.JobOrBuilder>
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.Job,
                com.google.cloud.dataproc.v1.Job.Builder,
                com.google.cloud.dataproc.v1.JobOrBuilder>(
                getJob(), getParentForChildren(), isClean());
        job_ = null;
      }
      return jobBuilder_;
    }

    private java.lang.Object requestId_ = "";
    /**
     *
     *
     * <pre>
     * Optional. A unique id used to identify the request. If the server
     * receives two [SubmitJobRequest][google.cloud.dataproc.v1.SubmitJobRequest] requests  with the same
     * id, then the second request will be ignored and the
     * first [Job][google.cloud.dataproc.v1.Job] created and stored in the backend
     * is returned.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The id must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A unique id used to identify the request. If the server
     * receives two [SubmitJobRequest][google.cloud.dataproc.v1.SubmitJobRequest] requests  with the same
     * id, then the second request will be ignored and the
     * first [Job][google.cloud.dataproc.v1.Job] created and stored in the backend
     * is returned.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The id must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     */
    public com.google.protobuf.ByteString getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A unique id used to identify the request. If the server
     * receives two [SubmitJobRequest][google.cloud.dataproc.v1.SubmitJobRequest] requests  with the same
     * id, then the second request will be ignored and the
     * first [Job][google.cloud.dataproc.v1.Job] created and stored in the backend
     * is returned.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The id must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     */
    public Builder setRequestId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A unique id used to identify the request. If the server
     * receives two [SubmitJobRequest][google.cloud.dataproc.v1.SubmitJobRequest] requests  with the same
     * id, then the second request will be ignored and the
     * first [Job][google.cloud.dataproc.v1.Job] created and stored in the backend
     * is returned.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The id must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     */
    public Builder clearRequestId() {

      requestId_ = getDefaultInstance().getRequestId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A unique id used to identify the request. If the server
     * receives two [SubmitJobRequest][google.cloud.dataproc.v1.SubmitJobRequest] requests  with the same
     * id, then the second request will be ignored and the
     * first [Job][google.cloud.dataproc.v1.Job] created and stored in the backend
     * is returned.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The id must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     */
    public Builder setRequestIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      requestId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.SubmitJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.SubmitJobRequest)
  private static final com.google.cloud.dataproc.v1.SubmitJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.SubmitJobRequest();
  }

  public static com.google.cloud.dataproc.v1.SubmitJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<SubmitJobRequest>() {
        @java.lang.Override
        public SubmitJobRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SubmitJobRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SubmitJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.SubmitJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
