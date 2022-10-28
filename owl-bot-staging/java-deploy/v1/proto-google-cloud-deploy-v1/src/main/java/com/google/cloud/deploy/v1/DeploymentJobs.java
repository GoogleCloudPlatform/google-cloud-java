// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 * <pre>
 * Deployment job composition.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.DeploymentJobs}
 */
public final class DeploymentJobs extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.DeploymentJobs)
    DeploymentJobsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeploymentJobs.newBuilder() to construct.
  private DeploymentJobs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeploymentJobs() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeploymentJobs();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DeploymentJobs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DeploymentJobs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.DeploymentJobs.class, com.google.cloud.deploy.v1.DeploymentJobs.Builder.class);
  }

  public static final int DEPLOY_JOB_FIELD_NUMBER = 1;
  private com.google.cloud.deploy.v1.Job deployJob_;
  /**
   * <pre>
   * Output only. The deploy Job. This is the first job run in the phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the deployJob field is set.
   */
  @java.lang.Override
  public boolean hasDeployJob() {
    return deployJob_ != null;
  }
  /**
   * <pre>
   * Output only. The deploy Job. This is the first job run in the phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The deployJob.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.Job getDeployJob() {
    return deployJob_ == null ? com.google.cloud.deploy.v1.Job.getDefaultInstance() : deployJob_;
  }
  /**
   * <pre>
   * Output only. The deploy Job. This is the first job run in the phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.JobOrBuilder getDeployJobOrBuilder() {
    return getDeployJob();
  }

  public static final int VERIFY_JOB_FIELD_NUMBER = 2;
  private com.google.cloud.deploy.v1.Job verifyJob_;
  /**
   * <pre>
   * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the verifyJob field is set.
   */
  @java.lang.Override
  public boolean hasVerifyJob() {
    return verifyJob_ != null;
  }
  /**
   * <pre>
   * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The verifyJob.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.Job getVerifyJob() {
    return verifyJob_ == null ? com.google.cloud.deploy.v1.Job.getDefaultInstance() : verifyJob_;
  }
  /**
   * <pre>
   * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.JobOrBuilder getVerifyJobOrBuilder() {
    return getVerifyJob();
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
    if (deployJob_ != null) {
      output.writeMessage(1, getDeployJob());
    }
    if (verifyJob_ != null) {
      output.writeMessage(2, getVerifyJob());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deployJob_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeployJob());
    }
    if (verifyJob_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVerifyJob());
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
    if (!(obj instanceof com.google.cloud.deploy.v1.DeploymentJobs)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.DeploymentJobs other = (com.google.cloud.deploy.v1.DeploymentJobs) obj;

    if (hasDeployJob() != other.hasDeployJob()) return false;
    if (hasDeployJob()) {
      if (!getDeployJob()
          .equals(other.getDeployJob())) return false;
    }
    if (hasVerifyJob() != other.hasVerifyJob()) return false;
    if (hasVerifyJob()) {
      if (!getVerifyJob()
          .equals(other.getVerifyJob())) return false;
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
    if (hasDeployJob()) {
      hash = (37 * hash) + DEPLOY_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getDeployJob().hashCode();
    }
    if (hasVerifyJob()) {
      hash = (37 * hash) + VERIFY_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getVerifyJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.DeploymentJobs parseFrom(
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
  public static Builder newBuilder(com.google.cloud.deploy.v1.DeploymentJobs prototype) {
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
   * Deployment job composition.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.DeploymentJobs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.DeploymentJobs)
      com.google.cloud.deploy.v1.DeploymentJobsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DeploymentJobs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DeploymentJobs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.DeploymentJobs.class, com.google.cloud.deploy.v1.DeploymentJobs.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.DeploymentJobs.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deployJobBuilder_ == null) {
        deployJob_ = null;
      } else {
        deployJob_ = null;
        deployJobBuilder_ = null;
      }
      if (verifyJobBuilder_ == null) {
        verifyJob_ = null;
      } else {
        verifyJob_ = null;
        verifyJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DeploymentJobs_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.DeploymentJobs getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.DeploymentJobs.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.DeploymentJobs build() {
      com.google.cloud.deploy.v1.DeploymentJobs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.DeploymentJobs buildPartial() {
      com.google.cloud.deploy.v1.DeploymentJobs result = new com.google.cloud.deploy.v1.DeploymentJobs(this);
      if (deployJobBuilder_ == null) {
        result.deployJob_ = deployJob_;
      } else {
        result.deployJob_ = deployJobBuilder_.build();
      }
      if (verifyJobBuilder_ == null) {
        result.verifyJob_ = verifyJob_;
      } else {
        result.verifyJob_ = verifyJobBuilder_.build();
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
      if (other instanceof com.google.cloud.deploy.v1.DeploymentJobs) {
        return mergeFrom((com.google.cloud.deploy.v1.DeploymentJobs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.DeploymentJobs other) {
      if (other == com.google.cloud.deploy.v1.DeploymentJobs.getDefaultInstance()) return this;
      if (other.hasDeployJob()) {
        mergeDeployJob(other.getDeployJob());
      }
      if (other.hasVerifyJob()) {
        mergeVerifyJob(other.getVerifyJob());
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
                  getDeployJobFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getVerifyJobFieldBuilder().getBuilder(),
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

    private com.google.cloud.deploy.v1.Job deployJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.deploy.v1.Job, com.google.cloud.deploy.v1.Job.Builder, com.google.cloud.deploy.v1.JobOrBuilder> deployJobBuilder_;
    /**
     * <pre>
     * Output only. The deploy Job. This is the first job run in the phase.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the deployJob field is set.
     */
    public boolean hasDeployJob() {
      return deployJobBuilder_ != null || deployJob_ != null;
    }
    /**
     * <pre>
     * Output only. The deploy Job. This is the first job run in the phase.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The deployJob.
     */
    public com.google.cloud.deploy.v1.Job getDeployJob() {
      if (deployJobBuilder_ == null) {
        return deployJob_ == null ? com.google.cloud.deploy.v1.Job.getDefaultInstance() : deployJob_;
      } else {
        return deployJobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The deploy Job. This is the first job run in the phase.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setDeployJob(com.google.cloud.deploy.v1.Job value) {
      if (deployJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deployJob_ = value;
        onChanged();
      } else {
        deployJobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The deploy Job. This is the first job run in the phase.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setDeployJob(
        com.google.cloud.deploy.v1.Job.Builder builderForValue) {
      if (deployJobBuilder_ == null) {
        deployJob_ = builderForValue.build();
        onChanged();
      } else {
        deployJobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The deploy Job. This is the first job run in the phase.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeDeployJob(com.google.cloud.deploy.v1.Job value) {
      if (deployJobBuilder_ == null) {
        if (deployJob_ != null) {
          deployJob_ =
            com.google.cloud.deploy.v1.Job.newBuilder(deployJob_).mergeFrom(value).buildPartial();
        } else {
          deployJob_ = value;
        }
        onChanged();
      } else {
        deployJobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The deploy Job. This is the first job run in the phase.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearDeployJob() {
      if (deployJobBuilder_ == null) {
        deployJob_ = null;
        onChanged();
      } else {
        deployJob_ = null;
        deployJobBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The deploy Job. This is the first job run in the phase.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.deploy.v1.Job.Builder getDeployJobBuilder() {
      
      onChanged();
      return getDeployJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The deploy Job. This is the first job run in the phase.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.deploy.v1.JobOrBuilder getDeployJobOrBuilder() {
      if (deployJobBuilder_ != null) {
        return deployJobBuilder_.getMessageOrBuilder();
      } else {
        return deployJob_ == null ?
            com.google.cloud.deploy.v1.Job.getDefaultInstance() : deployJob_;
      }
    }
    /**
     * <pre>
     * Output only. The deploy Job. This is the first job run in the phase.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job deploy_job = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.deploy.v1.Job, com.google.cloud.deploy.v1.Job.Builder, com.google.cloud.deploy.v1.JobOrBuilder> 
        getDeployJobFieldBuilder() {
      if (deployJobBuilder_ == null) {
        deployJobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.Job, com.google.cloud.deploy.v1.Job.Builder, com.google.cloud.deploy.v1.JobOrBuilder>(
                getDeployJob(),
                getParentForChildren(),
                isClean());
        deployJob_ = null;
      }
      return deployJobBuilder_;
    }

    private com.google.cloud.deploy.v1.Job verifyJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.deploy.v1.Job, com.google.cloud.deploy.v1.Job.Builder, com.google.cloud.deploy.v1.JobOrBuilder> verifyJobBuilder_;
    /**
     * <pre>
     * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the verifyJob field is set.
     */
    public boolean hasVerifyJob() {
      return verifyJobBuilder_ != null || verifyJob_ != null;
    }
    /**
     * <pre>
     * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The verifyJob.
     */
    public com.google.cloud.deploy.v1.Job getVerifyJob() {
      if (verifyJobBuilder_ == null) {
        return verifyJob_ == null ? com.google.cloud.deploy.v1.Job.getDefaultInstance() : verifyJob_;
      } else {
        return verifyJobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setVerifyJob(com.google.cloud.deploy.v1.Job value) {
      if (verifyJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        verifyJob_ = value;
        onChanged();
      } else {
        verifyJobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setVerifyJob(
        com.google.cloud.deploy.v1.Job.Builder builderForValue) {
      if (verifyJobBuilder_ == null) {
        verifyJob_ = builderForValue.build();
        onChanged();
      } else {
        verifyJobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeVerifyJob(com.google.cloud.deploy.v1.Job value) {
      if (verifyJobBuilder_ == null) {
        if (verifyJob_ != null) {
          verifyJob_ =
            com.google.cloud.deploy.v1.Job.newBuilder(verifyJob_).mergeFrom(value).buildPartial();
        } else {
          verifyJob_ = value;
        }
        onChanged();
      } else {
        verifyJobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearVerifyJob() {
      if (verifyJobBuilder_ == null) {
        verifyJob_ = null;
        onChanged();
      } else {
        verifyJob_ = null;
        verifyJobBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.deploy.v1.Job.Builder getVerifyJobBuilder() {
      
      onChanged();
      return getVerifyJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.deploy.v1.JobOrBuilder getVerifyJobOrBuilder() {
      if (verifyJobBuilder_ != null) {
        return verifyJobBuilder_.getMessageOrBuilder();
      } else {
        return verifyJob_ == null ?
            com.google.cloud.deploy.v1.Job.getDefaultInstance() : verifyJob_;
      }
    }
    /**
     * <pre>
     * Output only. The verify Job. Runs after a deploy if the deploy succeeds.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Job verify_job = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.deploy.v1.Job, com.google.cloud.deploy.v1.Job.Builder, com.google.cloud.deploy.v1.JobOrBuilder> 
        getVerifyJobFieldBuilder() {
      if (verifyJobBuilder_ == null) {
        verifyJobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.Job, com.google.cloud.deploy.v1.Job.Builder, com.google.cloud.deploy.v1.JobOrBuilder>(
                getVerifyJob(),
                getParentForChildren(),
                isClean());
        verifyJob_ = null;
      }
      return verifyJobBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.DeploymentJobs)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.DeploymentJobs)
  private static final com.google.cloud.deploy.v1.DeploymentJobs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.DeploymentJobs();
  }

  public static com.google.cloud.deploy.v1.DeploymentJobs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeploymentJobs>
      PARSER = new com.google.protobuf.AbstractParser<DeploymentJobs>() {
    @java.lang.Override
    public DeploymentJobs parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeploymentJobs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeploymentJobs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.DeploymentJobs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

