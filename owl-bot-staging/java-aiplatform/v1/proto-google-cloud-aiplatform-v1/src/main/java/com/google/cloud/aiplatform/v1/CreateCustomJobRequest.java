// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for
 * [JobService.CreateCustomJob][google.cloud.aiplatform.v1.JobService.CreateCustomJob].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CreateCustomJobRequest}
 */
public final class CreateCustomJobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CreateCustomJobRequest)
    CreateCustomJobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCustomJobRequest.newBuilder() to construct.
  private CreateCustomJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCustomJobRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCustomJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateCustomJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateCustomJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CreateCustomJobRequest.class, com.google.cloud.aiplatform.v1.CreateCustomJobRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The resource name of the Location to create the CustomJob in.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location to create the CustomJob in.
   * Format: `projects/{project}/locations/{location}`
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

  public static final int CUSTOM_JOB_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.CustomJob customJob_;
  /**
   * <pre>
   * Required. The CustomJob to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customJob field is set.
   */
  @java.lang.Override
  public boolean hasCustomJob() {
    return customJob_ != null;
  }
  /**
   * <pre>
   * Required. The CustomJob to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customJob.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CustomJob getCustomJob() {
    return customJob_ == null ? com.google.cloud.aiplatform.v1.CustomJob.getDefaultInstance() : customJob_;
  }
  /**
   * <pre>
   * Required. The CustomJob to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CustomJobOrBuilder getCustomJobOrBuilder() {
    return customJob_ == null ? com.google.cloud.aiplatform.v1.CustomJob.getDefaultInstance() : customJob_;
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
    if (customJob_ != null) {
      output.writeMessage(2, getCustomJob());
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
    if (customJob_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCustomJob());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CreateCustomJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CreateCustomJobRequest other = (com.google.cloud.aiplatform.v1.CreateCustomJobRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasCustomJob() != other.hasCustomJob()) return false;
    if (hasCustomJob()) {
      if (!getCustomJob()
          .equals(other.getCustomJob())) return false;
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
    if (hasCustomJob()) {
      hash = (37 * hash) + CUSTOM_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getCustomJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CreateCustomJobRequest prototype) {
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
   * Request message for
   * [JobService.CreateCustomJob][google.cloud.aiplatform.v1.JobService.CreateCustomJob].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CreateCustomJobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CreateCustomJobRequest)
      com.google.cloud.aiplatform.v1.CreateCustomJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateCustomJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateCustomJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CreateCustomJobRequest.class, com.google.cloud.aiplatform.v1.CreateCustomJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CreateCustomJobRequest.newBuilder()
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
      parent_ = "";
      customJob_ = null;
      if (customJobBuilder_ != null) {
        customJobBuilder_.dispose();
        customJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_CreateCustomJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateCustomJobRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CreateCustomJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateCustomJobRequest build() {
      com.google.cloud.aiplatform.v1.CreateCustomJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateCustomJobRequest buildPartial() {
      com.google.cloud.aiplatform.v1.CreateCustomJobRequest result = new com.google.cloud.aiplatform.v1.CreateCustomJobRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.CreateCustomJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.customJob_ = customJobBuilder_ == null
            ? customJob_
            : customJobBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.CreateCustomJobRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CreateCustomJobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CreateCustomJobRequest other) {
      if (other == com.google.cloud.aiplatform.v1.CreateCustomJobRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCustomJob()) {
        mergeCustomJob(other.getCustomJob());
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
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCustomJobFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the Location to create the CustomJob in.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create the CustomJob in.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create the CustomJob in.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Location to create the CustomJob in.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Location to create the CustomJob in.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.CustomJob customJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.CustomJob, com.google.cloud.aiplatform.v1.CustomJob.Builder, com.google.cloud.aiplatform.v1.CustomJobOrBuilder> customJobBuilder_;
    /**
     * <pre>
     * Required. The CustomJob to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the customJob field is set.
     */
    public boolean hasCustomJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The CustomJob to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customJob.
     */
    public com.google.cloud.aiplatform.v1.CustomJob getCustomJob() {
      if (customJobBuilder_ == null) {
        return customJob_ == null ? com.google.cloud.aiplatform.v1.CustomJob.getDefaultInstance() : customJob_;
      } else {
        return customJobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The CustomJob to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomJob(com.google.cloud.aiplatform.v1.CustomJob value) {
      if (customJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customJob_ = value;
      } else {
        customJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The CustomJob to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomJob(
        com.google.cloud.aiplatform.v1.CustomJob.Builder builderForValue) {
      if (customJobBuilder_ == null) {
        customJob_ = builderForValue.build();
      } else {
        customJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The CustomJob to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCustomJob(com.google.cloud.aiplatform.v1.CustomJob value) {
      if (customJobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          customJob_ != null &&
          customJob_ != com.google.cloud.aiplatform.v1.CustomJob.getDefaultInstance()) {
          getCustomJobBuilder().mergeFrom(value);
        } else {
          customJob_ = value;
        }
      } else {
        customJobBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The CustomJob to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCustomJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      customJob_ = null;
      if (customJobBuilder_ != null) {
        customJobBuilder_.dispose();
        customJobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The CustomJob to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.CustomJob.Builder getCustomJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCustomJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The CustomJob to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.CustomJobOrBuilder getCustomJobOrBuilder() {
      if (customJobBuilder_ != null) {
        return customJobBuilder_.getMessageOrBuilder();
      } else {
        return customJob_ == null ?
            com.google.cloud.aiplatform.v1.CustomJob.getDefaultInstance() : customJob_;
      }
    }
    /**
     * <pre>
     * Required. The CustomJob to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CustomJob custom_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.CustomJob, com.google.cloud.aiplatform.v1.CustomJob.Builder, com.google.cloud.aiplatform.v1.CustomJobOrBuilder> 
        getCustomJobFieldBuilder() {
      if (customJobBuilder_ == null) {
        customJobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.CustomJob, com.google.cloud.aiplatform.v1.CustomJob.Builder, com.google.cloud.aiplatform.v1.CustomJobOrBuilder>(
                getCustomJob(),
                getParentForChildren(),
                isClean());
        customJob_ = null;
      }
      return customJobBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CreateCustomJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CreateCustomJobRequest)
  private static final com.google.cloud.aiplatform.v1.CreateCustomJobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CreateCustomJobRequest();
  }

  public static com.google.cloud.aiplatform.v1.CreateCustomJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomJobRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCustomJobRequest>() {
    @java.lang.Override
    public CreateCustomJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCustomJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CreateCustomJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

