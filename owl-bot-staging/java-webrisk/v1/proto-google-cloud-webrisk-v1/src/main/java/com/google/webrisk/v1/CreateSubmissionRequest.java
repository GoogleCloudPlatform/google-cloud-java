// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1/webrisk.proto

package com.google.webrisk.v1;

/**
 * <pre>
 * Request to send a potentially phishy URI to WebRisk.
 * </pre>
 *
 * Protobuf type {@code google.cloud.webrisk.v1.CreateSubmissionRequest}
 */
public final class CreateSubmissionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.webrisk.v1.CreateSubmissionRequest)
    CreateSubmissionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSubmissionRequest.newBuilder() to construct.
  private CreateSubmissionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSubmissionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSubmissionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_CreateSubmissionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_CreateSubmissionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.webrisk.v1.CreateSubmissionRequest.class, com.google.webrisk.v1.CreateSubmissionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The name of the project that is making the submission. This string is in
   * the format "projects/{project_number}".
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
   * Required. The name of the project that is making the submission. This string is in
   * the format "projects/{project_number}".
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

  public static final int SUBMISSION_FIELD_NUMBER = 2;
  private com.google.webrisk.v1.Submission submission_;
  /**
   * <pre>
   * Required. The submission that contains the content of the phishing report.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the submission field is set.
   */
  @java.lang.Override
  public boolean hasSubmission() {
    return submission_ != null;
  }
  /**
   * <pre>
   * Required. The submission that contains the content of the phishing report.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The submission.
   */
  @java.lang.Override
  public com.google.webrisk.v1.Submission getSubmission() {
    return submission_ == null ? com.google.webrisk.v1.Submission.getDefaultInstance() : submission_;
  }
  /**
   * <pre>
   * Required. The submission that contains the content of the phishing report.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.webrisk.v1.SubmissionOrBuilder getSubmissionOrBuilder() {
    return getSubmission();
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
    if (submission_ != null) {
      output.writeMessage(2, getSubmission());
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
    if (submission_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSubmission());
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
    if (!(obj instanceof com.google.webrisk.v1.CreateSubmissionRequest)) {
      return super.equals(obj);
    }
    com.google.webrisk.v1.CreateSubmissionRequest other = (com.google.webrisk.v1.CreateSubmissionRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSubmission() != other.hasSubmission()) return false;
    if (hasSubmission()) {
      if (!getSubmission()
          .equals(other.getSubmission())) return false;
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
    if (hasSubmission()) {
      hash = (37 * hash) + SUBMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getSubmission().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1.CreateSubmissionRequest parseFrom(
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
  public static Builder newBuilder(com.google.webrisk.v1.CreateSubmissionRequest prototype) {
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
   * Request to send a potentially phishy URI to WebRisk.
   * </pre>
   *
   * Protobuf type {@code google.cloud.webrisk.v1.CreateSubmissionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.webrisk.v1.CreateSubmissionRequest)
      com.google.webrisk.v1.CreateSubmissionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_CreateSubmissionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_CreateSubmissionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.webrisk.v1.CreateSubmissionRequest.class, com.google.webrisk.v1.CreateSubmissionRequest.Builder.class);
    }

    // Construct using com.google.webrisk.v1.CreateSubmissionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (submissionBuilder_ == null) {
        submission_ = null;
      } else {
        submission_ = null;
        submissionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_CreateSubmissionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.webrisk.v1.CreateSubmissionRequest getDefaultInstanceForType() {
      return com.google.webrisk.v1.CreateSubmissionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.webrisk.v1.CreateSubmissionRequest build() {
      com.google.webrisk.v1.CreateSubmissionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.webrisk.v1.CreateSubmissionRequest buildPartial() {
      com.google.webrisk.v1.CreateSubmissionRequest result = new com.google.webrisk.v1.CreateSubmissionRequest(this);
      result.parent_ = parent_;
      if (submissionBuilder_ == null) {
        result.submission_ = submission_;
      } else {
        result.submission_ = submissionBuilder_.build();
      }
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
      if (other instanceof com.google.webrisk.v1.CreateSubmissionRequest) {
        return mergeFrom((com.google.webrisk.v1.CreateSubmissionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.webrisk.v1.CreateSubmissionRequest other) {
      if (other == com.google.webrisk.v1.CreateSubmissionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSubmission()) {
        mergeSubmission(other.getSubmission());
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
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSubmissionFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The name of the project that is making the submission. This string is in
     * the format "projects/{project_number}".
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
     * Required. The name of the project that is making the submission. This string is in
     * the format "projects/{project_number}".
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
     * Required. The name of the project that is making the submission. This string is in
     * the format "projects/{project_number}".
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
     * Required. The name of the project that is making the submission. This string is in
     * the format "projects/{project_number}".
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
     * Required. The name of the project that is making the submission. This string is in
     * the format "projects/{project_number}".
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

    private com.google.webrisk.v1.Submission submission_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.webrisk.v1.Submission, com.google.webrisk.v1.Submission.Builder, com.google.webrisk.v1.SubmissionOrBuilder> submissionBuilder_;
    /**
     * <pre>
     * Required. The submission that contains the content of the phishing report.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the submission field is set.
     */
    public boolean hasSubmission() {
      return submissionBuilder_ != null || submission_ != null;
    }
    /**
     * <pre>
     * Required. The submission that contains the content of the phishing report.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The submission.
     */
    public com.google.webrisk.v1.Submission getSubmission() {
      if (submissionBuilder_ == null) {
        return submission_ == null ? com.google.webrisk.v1.Submission.getDefaultInstance() : submission_;
      } else {
        return submissionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The submission that contains the content of the phishing report.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSubmission(com.google.webrisk.v1.Submission value) {
      if (submissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        submission_ = value;
        onChanged();
      } else {
        submissionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The submission that contains the content of the phishing report.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSubmission(
        com.google.webrisk.v1.Submission.Builder builderForValue) {
      if (submissionBuilder_ == null) {
        submission_ = builderForValue.build();
        onChanged();
      } else {
        submissionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The submission that contains the content of the phishing report.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSubmission(com.google.webrisk.v1.Submission value) {
      if (submissionBuilder_ == null) {
        if (submission_ != null) {
          submission_ =
            com.google.webrisk.v1.Submission.newBuilder(submission_).mergeFrom(value).buildPartial();
        } else {
          submission_ = value;
        }
        onChanged();
      } else {
        submissionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The submission that contains the content of the phishing report.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSubmission() {
      if (submissionBuilder_ == null) {
        submission_ = null;
        onChanged();
      } else {
        submission_ = null;
        submissionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The submission that contains the content of the phishing report.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.webrisk.v1.Submission.Builder getSubmissionBuilder() {
      
      onChanged();
      return getSubmissionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The submission that contains the content of the phishing report.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.webrisk.v1.SubmissionOrBuilder getSubmissionOrBuilder() {
      if (submissionBuilder_ != null) {
        return submissionBuilder_.getMessageOrBuilder();
      } else {
        return submission_ == null ?
            com.google.webrisk.v1.Submission.getDefaultInstance() : submission_;
      }
    }
    /**
     * <pre>
     * Required. The submission that contains the content of the phishing report.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.Submission submission = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.webrisk.v1.Submission, com.google.webrisk.v1.Submission.Builder, com.google.webrisk.v1.SubmissionOrBuilder> 
        getSubmissionFieldBuilder() {
      if (submissionBuilder_ == null) {
        submissionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.webrisk.v1.Submission, com.google.webrisk.v1.Submission.Builder, com.google.webrisk.v1.SubmissionOrBuilder>(
                getSubmission(),
                getParentForChildren(),
                isClean());
        submission_ = null;
      }
      return submissionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.webrisk.v1.CreateSubmissionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.webrisk.v1.CreateSubmissionRequest)
  private static final com.google.webrisk.v1.CreateSubmissionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.webrisk.v1.CreateSubmissionRequest();
  }

  public static com.google.webrisk.v1.CreateSubmissionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSubmissionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSubmissionRequest>() {
    @java.lang.Override
    public CreateSubmissionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSubmissionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSubmissionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.webrisk.v1.CreateSubmissionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

