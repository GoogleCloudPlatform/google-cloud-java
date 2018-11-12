// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1beta1/cloudscheduler.proto

package com.google.cloud.scheduler.v1beta1;

/**
 * <pre>
 * Response message for listing jobs using [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs].
 * </pre>
 *
 * Protobuf type {@code google.cloud.scheduler.v1beta1.ListJobsResponse}
 */
public  final class ListJobsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.scheduler.v1beta1.ListJobsResponse)
    ListJobsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListJobsResponse.newBuilder() to construct.
  private ListJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListJobsResponse() {
    jobs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListJobsResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              jobs_ = new java.util.ArrayList<com.google.cloud.scheduler.v1beta1.Job>();
              mutable_bitField0_ |= 0x00000001;
            }
            jobs_.add(
                input.readMessage(com.google.cloud.scheduler.v1beta1.Job.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        jobs_ = java.util.Collections.unmodifiableList(jobs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.scheduler.v1beta1.SchedulerProto.internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.scheduler.v1beta1.SchedulerProto.internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.scheduler.v1beta1.ListJobsResponse.class, com.google.cloud.scheduler.v1beta1.ListJobsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int JOBS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.scheduler.v1beta1.Job> jobs_;
  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
   */
  public java.util.List<com.google.cloud.scheduler.v1beta1.Job> getJobsList() {
    return jobs_;
  }
  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.scheduler.v1beta1.JobOrBuilder> 
      getJobsOrBuilderList() {
    return jobs_;
  }
  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
   */
  public int getJobsCount() {
    return jobs_.size();
  }
  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
   */
  public com.google.cloud.scheduler.v1beta1.Job getJobs(int index) {
    return jobs_.get(index);
  }
  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
   */
  public com.google.cloud.scheduler.v1beta1.JobOrBuilder getJobsOrBuilder(
      int index) {
    return jobs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in the
   * [page_token][google.cloud.scheduler.v1beta1.ListJobsRequest.page_token] field in the subsequent call to
   * [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs] to retrieve the next page of results.
   * If this is empty it indicates that there are no more results
   * through which to paginate.
   * The page token is valid for only 2 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in the
   * [page_token][google.cloud.scheduler.v1beta1.ListJobsRequest.page_token] field in the subsequent call to
   * [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs] to retrieve the next page of results.
   * If this is empty it indicates that there are no more results
   * through which to paginate.
   * The page token is valid for only 2 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < jobs_.size(); i++) {
      output.writeMessage(1, jobs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, jobs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.scheduler.v1beta1.ListJobsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.scheduler.v1beta1.ListJobsResponse other = (com.google.cloud.scheduler.v1beta1.ListJobsResponse) obj;

    boolean result = true;
    result = result && getJobsList()
        .equals(other.getJobsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getJobsCount() > 0) {
      hash = (37 * hash) + JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getJobsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.scheduler.v1beta1.ListJobsResponse prototype) {
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
   * Response message for listing jobs using [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs].
   * </pre>
   *
   * Protobuf type {@code google.cloud.scheduler.v1beta1.ListJobsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.scheduler.v1beta1.ListJobsResponse)
      com.google.cloud.scheduler.v1beta1.ListJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.scheduler.v1beta1.SchedulerProto.internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.scheduler.v1beta1.SchedulerProto.internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.scheduler.v1beta1.ListJobsResponse.class, com.google.cloud.scheduler.v1beta1.ListJobsResponse.Builder.class);
    }

    // Construct using com.google.cloud.scheduler.v1beta1.ListJobsResponse.newBuilder()
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
        getJobsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jobsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.scheduler.v1beta1.SchedulerProto.internal_static_google_cloud_scheduler_v1beta1_ListJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.ListJobsResponse getDefaultInstanceForType() {
      return com.google.cloud.scheduler.v1beta1.ListJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.ListJobsResponse build() {
      com.google.cloud.scheduler.v1beta1.ListJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.ListJobsResponse buildPartial() {
      com.google.cloud.scheduler.v1beta1.ListJobsResponse result = new com.google.cloud.scheduler.v1beta1.ListJobsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (jobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          jobs_ = java.util.Collections.unmodifiableList(jobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jobs_ = jobs_;
      } else {
        result.jobs_ = jobsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.scheduler.v1beta1.ListJobsResponse) {
        return mergeFrom((com.google.cloud.scheduler.v1beta1.ListJobsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.scheduler.v1beta1.ListJobsResponse other) {
      if (other == com.google.cloud.scheduler.v1beta1.ListJobsResponse.getDefaultInstance()) return this;
      if (jobsBuilder_ == null) {
        if (!other.jobs_.isEmpty()) {
          if (jobs_.isEmpty()) {
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobsIsMutable();
            jobs_.addAll(other.jobs_);
          }
          onChanged();
        }
      } else {
        if (!other.jobs_.isEmpty()) {
          if (jobsBuilder_.isEmpty()) {
            jobsBuilder_.dispose();
            jobsBuilder_ = null;
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJobsFieldBuilder() : null;
          } else {
            jobsBuilder_.addAllMessages(other.jobs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.scheduler.v1beta1.ListJobsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.scheduler.v1beta1.ListJobsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.scheduler.v1beta1.Job> jobs_ =
      java.util.Collections.emptyList();
    private void ensureJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        jobs_ = new java.util.ArrayList<com.google.cloud.scheduler.v1beta1.Job>(jobs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.scheduler.v1beta1.Job, com.google.cloud.scheduler.v1beta1.Job.Builder, com.google.cloud.scheduler.v1beta1.JobOrBuilder> jobsBuilder_;

    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.scheduler.v1beta1.Job> getJobsList() {
      if (jobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobs_);
      } else {
        return jobsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public int getJobsCount() {
      if (jobsBuilder_ == null) {
        return jobs_.size();
      } else {
        return jobsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public com.google.cloud.scheduler.v1beta1.Job getJobs(int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);
      } else {
        return jobsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public Builder setJobs(
        int index, com.google.cloud.scheduler.v1beta1.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.set(index, value);
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public Builder setJobs(
        int index, com.google.cloud.scheduler.v1beta1.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public Builder addJobs(com.google.cloud.scheduler.v1beta1.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public Builder addJobs(
        int index, com.google.cloud.scheduler.v1beta1.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(index, value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public Builder addJobs(
        com.google.cloud.scheduler.v1beta1.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public Builder addJobs(
        int index, com.google.cloud.scheduler.v1beta1.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public Builder addAllJobs(
        java.lang.Iterable<? extends com.google.cloud.scheduler.v1beta1.Job> values) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobs_);
        onChanged();
      } else {
        jobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public Builder clearJobs() {
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public Builder removeJobs(int index) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.remove(index);
        onChanged();
      } else {
        jobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public com.google.cloud.scheduler.v1beta1.Job.Builder getJobsBuilder(
        int index) {
      return getJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public com.google.cloud.scheduler.v1beta1.JobOrBuilder getJobsOrBuilder(
        int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);  } else {
        return jobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.scheduler.v1beta1.JobOrBuilder> 
         getJobsOrBuilderList() {
      if (jobsBuilder_ != null) {
        return jobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobs_);
      }
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public com.google.cloud.scheduler.v1beta1.Job.Builder addJobsBuilder() {
      return getJobsFieldBuilder().addBuilder(
          com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public com.google.cloud.scheduler.v1beta1.Job.Builder addJobsBuilder(
        int index) {
      return getJobsFieldBuilder().addBuilder(
          index, com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.scheduler.v1beta1.Job jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.scheduler.v1beta1.Job.Builder> 
         getJobsBuilderList() {
      return getJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.scheduler.v1beta1.Job, com.google.cloud.scheduler.v1beta1.Job.Builder, com.google.cloud.scheduler.v1beta1.JobOrBuilder> 
        getJobsFieldBuilder() {
      if (jobsBuilder_ == null) {
        jobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.scheduler.v1beta1.Job, com.google.cloud.scheduler.v1beta1.Job.Builder, com.google.cloud.scheduler.v1beta1.JobOrBuilder>(
                jobs_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        jobs_ = null;
      }
      return jobsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in the
     * [page_token][google.cloud.scheduler.v1beta1.ListJobsRequest.page_token] field in the subsequent call to
     * [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs] to retrieve the next page of results.
     * If this is empty it indicates that there are no more results
     * through which to paginate.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in the
     * [page_token][google.cloud.scheduler.v1beta1.ListJobsRequest.page_token] field in the subsequent call to
     * [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs] to retrieve the next page of results.
     * If this is empty it indicates that there are no more results
     * through which to paginate.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in the
     * [page_token][google.cloud.scheduler.v1beta1.ListJobsRequest.page_token] field in the subsequent call to
     * [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs] to retrieve the next page of results.
     * If this is empty it indicates that there are no more results
     * through which to paginate.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in the
     * [page_token][google.cloud.scheduler.v1beta1.ListJobsRequest.page_token] field in the subsequent call to
     * [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs] to retrieve the next page of results.
     * If this is empty it indicates that there are no more results
     * through which to paginate.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in the
     * [page_token][google.cloud.scheduler.v1beta1.ListJobsRequest.page_token] field in the subsequent call to
     * [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs] to retrieve the next page of results.
     * If this is empty it indicates that there are no more results
     * through which to paginate.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.scheduler.v1beta1.ListJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.scheduler.v1beta1.ListJobsResponse)
  private static final com.google.cloud.scheduler.v1beta1.ListJobsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.scheduler.v1beta1.ListJobsResponse();
  }

  public static com.google.cloud.scheduler.v1beta1.ListJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListJobsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListJobsResponse>() {
    @java.lang.Override
    public ListJobsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListJobsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.scheduler.v1beta1.ListJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

