// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

/**
 * Protobuf type {@code google.cloud.dataplex.v1.RunTaskResponse}
 */
public final class RunTaskResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.RunTaskResponse)
    RunTaskResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RunTaskResponse.newBuilder() to construct.
  private RunTaskResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunTaskResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RunTaskResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_RunTaskResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_RunTaskResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.RunTaskResponse.class, com.google.cloud.dataplex.v1.RunTaskResponse.Builder.class);
  }

  private int bitField0_;
  public static final int JOB_FIELD_NUMBER = 1;
  private com.google.cloud.dataplex.v1.Job job_;
  /**
   * <pre>
   * Jobs created by RunTask API.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
   * @return Whether the job field is set.
   */
  @java.lang.Override
  public boolean hasJob() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Jobs created by RunTask API.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
   * @return The job.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.Job getJob() {
    return job_ == null ? com.google.cloud.dataplex.v1.Job.getDefaultInstance() : job_;
  }
  /**
   * <pre>
   * Jobs created by RunTask API.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.JobOrBuilder getJobOrBuilder() {
    return job_ == null ? com.google.cloud.dataplex.v1.Job.getDefaultInstance() : job_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getJob());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getJob());
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.RunTaskResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.RunTaskResponse other = (com.google.cloud.dataplex.v1.RunTaskResponse) obj;

    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob()
          .equals(other.getJob())) return false;
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
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.RunTaskResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.RunTaskResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.RunTaskResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataplex.v1.RunTaskResponse prototype) {
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
   * Protobuf type {@code google.cloud.dataplex.v1.RunTaskResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.RunTaskResponse)
      com.google.cloud.dataplex.v1.RunTaskResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_RunTaskResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_RunTaskResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.RunTaskResponse.class, com.google.cloud.dataplex.v1.RunTaskResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.RunTaskResponse.newBuilder()
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
        getJobFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_RunTaskResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.RunTaskResponse getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.RunTaskResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.RunTaskResponse build() {
      com.google.cloud.dataplex.v1.RunTaskResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.RunTaskResponse buildPartial() {
      com.google.cloud.dataplex.v1.RunTaskResponse result = new com.google.cloud.dataplex.v1.RunTaskResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.RunTaskResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.job_ = jobBuilder_ == null
            ? job_
            : jobBuilder_.build();
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
      if (other instanceof com.google.cloud.dataplex.v1.RunTaskResponse) {
        return mergeFrom((com.google.cloud.dataplex.v1.RunTaskResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.RunTaskResponse other) {
      if (other == com.google.cloud.dataplex.v1.RunTaskResponse.getDefaultInstance()) return this;
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
            case 10: {
              input.readMessage(
                  getJobFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.cloud.dataplex.v1.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.Job, com.google.cloud.dataplex.v1.Job.Builder, com.google.cloud.dataplex.v1.JobOrBuilder> jobBuilder_;
    /**
     * <pre>
     * Jobs created by RunTask API.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
     * @return Whether the job field is set.
     */
    public boolean hasJob() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Jobs created by RunTask API.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
     * @return The job.
     */
    public com.google.cloud.dataplex.v1.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.cloud.dataplex.v1.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Jobs created by RunTask API.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
     */
    public Builder setJob(com.google.cloud.dataplex.v1.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
      } else {
        jobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Jobs created by RunTask API.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
     */
    public Builder setJob(
        com.google.cloud.dataplex.v1.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Jobs created by RunTask API.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
     */
    public Builder mergeJob(com.google.cloud.dataplex.v1.Job value) {
      if (jobBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          job_ != null &&
          job_ != com.google.cloud.dataplex.v1.Job.getDefaultInstance()) {
          getJobBuilder().mergeFrom(value);
        } else {
          job_ = value;
        }
      } else {
        jobBuilder_.mergeFrom(value);
      }
      if (job_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Jobs created by RunTask API.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
     */
    public Builder clearJob() {
      bitField0_ = (bitField0_ & ~0x00000001);
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Jobs created by RunTask API.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Job.Builder getJobBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Jobs created by RunTask API.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
     */
    public com.google.cloud.dataplex.v1.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ?
            com.google.cloud.dataplex.v1.Job.getDefaultInstance() : job_;
      }
    }
    /**
     * <pre>
     * Jobs created by RunTask API.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Job job = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.Job, com.google.cloud.dataplex.v1.Job.Builder, com.google.cloud.dataplex.v1.JobOrBuilder> 
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.Job, com.google.cloud.dataplex.v1.Job.Builder, com.google.cloud.dataplex.v1.JobOrBuilder>(
                getJob(),
                getParentForChildren(),
                isClean());
        job_ = null;
      }
      return jobBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.RunTaskResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.RunTaskResponse)
  private static final com.google.cloud.dataplex.v1.RunTaskResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.RunTaskResponse();
  }

  public static com.google.cloud.dataplex.v1.RunTaskResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunTaskResponse>
      PARSER = new com.google.protobuf.AbstractParser<RunTaskResponse>() {
    @java.lang.Override
    public RunTaskResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RunTaskResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunTaskResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.RunTaskResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

