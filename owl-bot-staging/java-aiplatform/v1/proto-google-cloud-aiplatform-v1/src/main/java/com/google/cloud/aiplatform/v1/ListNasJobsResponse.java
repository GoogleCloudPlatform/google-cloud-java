// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Response message for
 * [JobService.ListNasJobs][google.cloud.aiplatform.v1.JobService.ListNasJobs]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListNasJobsResponse}
 */
public final class ListNasJobsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListNasJobsResponse)
    ListNasJobsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNasJobsResponse.newBuilder() to construct.
  private ListNasJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNasJobsResponse() {
    nasJobs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNasJobsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListNasJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListNasJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListNasJobsResponse.class, com.google.cloud.aiplatform.v1.ListNasJobsResponse.Builder.class);
  }

  public static final int NAS_JOBS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.NasJob> nasJobs_;
  /**
   * <pre>
   * List of NasJobs in the requested page.
   * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
   * of the jobs will not be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.NasJob> getNasJobsList() {
    return nasJobs_;
  }
  /**
   * <pre>
   * List of NasJobs in the requested page.
   * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
   * of the jobs will not be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.NasJobOrBuilder> 
      getNasJobsOrBuilderList() {
    return nasJobs_;
  }
  /**
   * <pre>
   * List of NasJobs in the requested page.
   * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
   * of the jobs will not be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
   */
  @java.lang.Override
  public int getNasJobsCount() {
    return nasJobs_.size();
  }
  /**
   * <pre>
   * List of NasJobs in the requested page.
   * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
   * of the jobs will not be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.NasJob getNasJobs(int index) {
    return nasJobs_.get(index);
  }
  /**
   * <pre>
   * List of NasJobs in the requested page.
   * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
   * of the jobs will not be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.NasJobOrBuilder getNasJobsOrBuilder(
      int index) {
    return nasJobs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListNasJobsRequest.page_token][google.cloud.aiplatform.v1.ListNasJobsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
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
   * A token to retrieve the next page of results.
   * Pass to
   * [ListNasJobsRequest.page_token][google.cloud.aiplatform.v1.ListNasJobsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
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
    for (int i = 0; i < nasJobs_.size(); i++) {
      output.writeMessage(1, nasJobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nasJobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nasJobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListNasJobsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListNasJobsResponse other = (com.google.cloud.aiplatform.v1.ListNasJobsResponse) obj;

    if (!getNasJobsList()
        .equals(other.getNasJobsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getNasJobsCount() > 0) {
      hash = (37 * hash) + NAS_JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getNasJobsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ListNasJobsResponse prototype) {
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
   * Response message for
   * [JobService.ListNasJobs][google.cloud.aiplatform.v1.JobService.ListNasJobs]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListNasJobsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListNasJobsResponse)
      com.google.cloud.aiplatform.v1.ListNasJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListNasJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListNasJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListNasJobsResponse.class, com.google.cloud.aiplatform.v1.ListNasJobsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListNasJobsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (nasJobsBuilder_ == null) {
        nasJobs_ = java.util.Collections.emptyList();
      } else {
        nasJobs_ = null;
        nasJobsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListNasJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListNasJobsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListNasJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListNasJobsResponse build() {
      com.google.cloud.aiplatform.v1.ListNasJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListNasJobsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListNasJobsResponse result = new com.google.cloud.aiplatform.v1.ListNasJobsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1.ListNasJobsResponse result) {
      if (nasJobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nasJobs_ = java.util.Collections.unmodifiableList(nasJobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nasJobs_ = nasJobs_;
      } else {
        result.nasJobs_ = nasJobsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ListNasJobsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListNasJobsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListNasJobsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListNasJobsResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListNasJobsResponse.getDefaultInstance()) return this;
      if (nasJobsBuilder_ == null) {
        if (!other.nasJobs_.isEmpty()) {
          if (nasJobs_.isEmpty()) {
            nasJobs_ = other.nasJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNasJobsIsMutable();
            nasJobs_.addAll(other.nasJobs_);
          }
          onChanged();
        }
      } else {
        if (!other.nasJobs_.isEmpty()) {
          if (nasJobsBuilder_.isEmpty()) {
            nasJobsBuilder_.dispose();
            nasJobsBuilder_ = null;
            nasJobs_ = other.nasJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nasJobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNasJobsFieldBuilder() : null;
          } else {
            nasJobsBuilder_.addAllMessages(other.nasJobs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10: {
              com.google.cloud.aiplatform.v1.NasJob m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1.NasJob.parser(),
                      extensionRegistry);
              if (nasJobsBuilder_ == null) {
                ensureNasJobsIsMutable();
                nasJobs_.add(m);
              } else {
                nasJobsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.google.cloud.aiplatform.v1.NasJob> nasJobs_ =
      java.util.Collections.emptyList();
    private void ensureNasJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nasJobs_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.NasJob>(nasJobs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.NasJob, com.google.cloud.aiplatform.v1.NasJob.Builder, com.google.cloud.aiplatform.v1.NasJobOrBuilder> nasJobsBuilder_;

    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.NasJob> getNasJobsList() {
      if (nasJobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nasJobs_);
      } else {
        return nasJobsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public int getNasJobsCount() {
      if (nasJobsBuilder_ == null) {
        return nasJobs_.size();
      } else {
        return nasJobsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasJob getNasJobs(int index) {
      if (nasJobsBuilder_ == null) {
        return nasJobs_.get(index);
      } else {
        return nasJobsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public Builder setNasJobs(
        int index, com.google.cloud.aiplatform.v1.NasJob value) {
      if (nasJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNasJobsIsMutable();
        nasJobs_.set(index, value);
        onChanged();
      } else {
        nasJobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public Builder setNasJobs(
        int index, com.google.cloud.aiplatform.v1.NasJob.Builder builderForValue) {
      if (nasJobsBuilder_ == null) {
        ensureNasJobsIsMutable();
        nasJobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        nasJobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public Builder addNasJobs(com.google.cloud.aiplatform.v1.NasJob value) {
      if (nasJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNasJobsIsMutable();
        nasJobs_.add(value);
        onChanged();
      } else {
        nasJobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public Builder addNasJobs(
        int index, com.google.cloud.aiplatform.v1.NasJob value) {
      if (nasJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNasJobsIsMutable();
        nasJobs_.add(index, value);
        onChanged();
      } else {
        nasJobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public Builder addNasJobs(
        com.google.cloud.aiplatform.v1.NasJob.Builder builderForValue) {
      if (nasJobsBuilder_ == null) {
        ensureNasJobsIsMutable();
        nasJobs_.add(builderForValue.build());
        onChanged();
      } else {
        nasJobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public Builder addNasJobs(
        int index, com.google.cloud.aiplatform.v1.NasJob.Builder builderForValue) {
      if (nasJobsBuilder_ == null) {
        ensureNasJobsIsMutable();
        nasJobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        nasJobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public Builder addAllNasJobs(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.NasJob> values) {
      if (nasJobsBuilder_ == null) {
        ensureNasJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nasJobs_);
        onChanged();
      } else {
        nasJobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public Builder clearNasJobs() {
      if (nasJobsBuilder_ == null) {
        nasJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nasJobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public Builder removeNasJobs(int index) {
      if (nasJobsBuilder_ == null) {
        ensureNasJobsIsMutable();
        nasJobs_.remove(index);
        onChanged();
      } else {
        nasJobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasJob.Builder getNasJobsBuilder(
        int index) {
      return getNasJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasJobOrBuilder getNasJobsOrBuilder(
        int index) {
      if (nasJobsBuilder_ == null) {
        return nasJobs_.get(index);  } else {
        return nasJobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.NasJobOrBuilder> 
         getNasJobsOrBuilderList() {
      if (nasJobsBuilder_ != null) {
        return nasJobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nasJobs_);
      }
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasJob.Builder addNasJobsBuilder() {
      return getNasJobsFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1.NasJob.getDefaultInstance());
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasJob.Builder addNasJobsBuilder(
        int index) {
      return getNasJobsFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1.NasJob.getDefaultInstance());
    }
    /**
     * <pre>
     * List of NasJobs in the requested page.
     * [NasJob.nas_job_output][google.cloud.aiplatform.v1.NasJob.nas_job_output]
     * of the jobs will not be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasJob nas_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.NasJob.Builder> 
         getNasJobsBuilderList() {
      return getNasJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.NasJob, com.google.cloud.aiplatform.v1.NasJob.Builder, com.google.cloud.aiplatform.v1.NasJobOrBuilder> 
        getNasJobsFieldBuilder() {
      if (nasJobsBuilder_ == null) {
        nasJobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.NasJob, com.google.cloud.aiplatform.v1.NasJob.Builder, com.google.cloud.aiplatform.v1.NasJobOrBuilder>(
                nasJobs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nasJobs_ = null;
      }
      return nasJobsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasJobsRequest.page_token][google.cloud.aiplatform.v1.ListNasJobsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasJobsRequest.page_token][google.cloud.aiplatform.v1.ListNasJobsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasJobsRequest.page_token][google.cloud.aiplatform.v1.ListNasJobsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasJobsRequest.page_token][google.cloud.aiplatform.v1.ListNasJobsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasJobsRequest.page_token][google.cloud.aiplatform.v1.ListNasJobsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListNasJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListNasJobsResponse)
  private static final com.google.cloud.aiplatform.v1.ListNasJobsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListNasJobsResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListNasJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNasJobsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNasJobsResponse>() {
    @java.lang.Override
    public ListNasJobsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNasJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNasJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListNasJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

