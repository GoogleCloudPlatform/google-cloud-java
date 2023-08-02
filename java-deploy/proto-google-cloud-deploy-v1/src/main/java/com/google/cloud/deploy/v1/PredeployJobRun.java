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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * PredeployJobRun contains information specific to a predeploy `JobRun`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.PredeployJobRun}
 */
public final class PredeployJobRun extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.PredeployJobRun)
    PredeployJobRunOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PredeployJobRun.newBuilder() to construct.
  private PredeployJobRun(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PredeployJobRun() {
    build_ = "";
    failureCause_ = 0;
    failureMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PredeployJobRun();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_PredeployJobRun_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_PredeployJobRun_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.PredeployJobRun.class,
            com.google.cloud.deploy.v1.PredeployJobRun.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Well-known predeploy failures.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.deploy.v1.PredeployJobRun.FailureCause}
   */
  public enum FailureCause implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * No reason for failure is specified.
     * </pre>
     *
     * <code>FAILURE_CAUSE_UNSPECIFIED = 0;</code>
     */
    FAILURE_CAUSE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Cloud Build is not available, either because it is not enabled or because
     * Cloud Deploy has insufficient permissions. See [required
     * permission](https://cloud.google.com/deploy/docs/cloud-deploy-service-account#required_permissions).
     * </pre>
     *
     * <code>CLOUD_BUILD_UNAVAILABLE = 1;</code>
     */
    CLOUD_BUILD_UNAVAILABLE(1),
    /**
     *
     *
     * <pre>
     * The predeploy operation did not complete successfully; check Cloud Build
     * logs.
     * </pre>
     *
     * <code>EXECUTION_FAILED = 2;</code>
     */
    EXECUTION_FAILED(2),
    /**
     *
     *
     * <pre>
     * The predeploy build did not complete within the alloted time.
     * </pre>
     *
     * <code>DEADLINE_EXCEEDED = 3;</code>
     */
    DEADLINE_EXCEEDED(3),
    /**
     *
     *
     * <pre>
     * Cloud Build failed to fulfill Cloud Deploy's request. See failure_message
     * for additional details.
     * </pre>
     *
     * <code>CLOUD_BUILD_REQUEST_FAILED = 4;</code>
     */
    CLOUD_BUILD_REQUEST_FAILED(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * No reason for failure is specified.
     * </pre>
     *
     * <code>FAILURE_CAUSE_UNSPECIFIED = 0;</code>
     */
    public static final int FAILURE_CAUSE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Cloud Build is not available, either because it is not enabled or because
     * Cloud Deploy has insufficient permissions. See [required
     * permission](https://cloud.google.com/deploy/docs/cloud-deploy-service-account#required_permissions).
     * </pre>
     *
     * <code>CLOUD_BUILD_UNAVAILABLE = 1;</code>
     */
    public static final int CLOUD_BUILD_UNAVAILABLE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The predeploy operation did not complete successfully; check Cloud Build
     * logs.
     * </pre>
     *
     * <code>EXECUTION_FAILED = 2;</code>
     */
    public static final int EXECUTION_FAILED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The predeploy build did not complete within the alloted time.
     * </pre>
     *
     * <code>DEADLINE_EXCEEDED = 3;</code>
     */
    public static final int DEADLINE_EXCEEDED_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Cloud Build failed to fulfill Cloud Deploy's request. See failure_message
     * for additional details.
     * </pre>
     *
     * <code>CLOUD_BUILD_REQUEST_FAILED = 4;</code>
     */
    public static final int CLOUD_BUILD_REQUEST_FAILED_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FailureCause valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FailureCause forNumber(int value) {
      switch (value) {
        case 0:
          return FAILURE_CAUSE_UNSPECIFIED;
        case 1:
          return CLOUD_BUILD_UNAVAILABLE;
        case 2:
          return EXECUTION_FAILED;
        case 3:
          return DEADLINE_EXCEEDED;
        case 4:
          return CLOUD_BUILD_REQUEST_FAILED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FailureCause> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<FailureCause> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FailureCause>() {
          public FailureCause findValueByNumber(int number) {
            return FailureCause.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.deploy.v1.PredeployJobRun.getDescriptor().getEnumTypes().get(0);
    }

    private static final FailureCause[] VALUES = values();

    public static FailureCause valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FailureCause(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.deploy.v1.PredeployJobRun.FailureCause)
  }

  public static final int BUILD_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object build_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Cloud Build `Build` object that is
   * used to execute the custom actions associated with the predeploy Job.
   * Format is projects/{project}/locations/{location}/builds/{build}.
   * </pre>
   *
   * <code>
   * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The build.
   */
  @java.lang.Override
  public java.lang.String getBuild() {
    java.lang.Object ref = build_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      build_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Cloud Build `Build` object that is
   * used to execute the custom actions associated with the predeploy Job.
   * Format is projects/{project}/locations/{location}/builds/{build}.
   * </pre>
   *
   * <code>
   * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for build.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBuildBytes() {
    java.lang.Object ref = build_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      build_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FAILURE_CAUSE_FIELD_NUMBER = 2;
  private int failureCause_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. The reason the predeploy failed. This will always be
   * unspecified while the predeploy is in progress or if it succeeded.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.PredeployJobRun.FailureCause failure_cause = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for failureCause.
   */
  @java.lang.Override
  public int getFailureCauseValue() {
    return failureCause_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The reason the predeploy failed. This will always be
   * unspecified while the predeploy is in progress or if it succeeded.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.PredeployJobRun.FailureCause failure_cause = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The failureCause.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.PredeployJobRun.FailureCause getFailureCause() {
    com.google.cloud.deploy.v1.PredeployJobRun.FailureCause result =
        com.google.cloud.deploy.v1.PredeployJobRun.FailureCause.forNumber(failureCause_);
    return result == null
        ? com.google.cloud.deploy.v1.PredeployJobRun.FailureCause.UNRECOGNIZED
        : result;
  }

  public static final int FAILURE_MESSAGE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object failureMessage_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the predeploy failure, if
   * available.
   * </pre>
   *
   * <code>string failure_message = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The failureMessage.
   */
  @java.lang.Override
  public java.lang.String getFailureMessage() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failureMessage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the predeploy failure, if
   * available.
   * </pre>
   *
   * <code>string failure_message = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for failureMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFailureMessageBytes() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      failureMessage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(build_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, build_);
    }
    if (failureCause_
        != com.google.cloud.deploy.v1.PredeployJobRun.FailureCause.FAILURE_CAUSE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, failureCause_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, failureMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(build_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, build_);
    }
    if (failureCause_
        != com.google.cloud.deploy.v1.PredeployJobRun.FailureCause.FAILURE_CAUSE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, failureCause_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, failureMessage_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.PredeployJobRun)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.PredeployJobRun other =
        (com.google.cloud.deploy.v1.PredeployJobRun) obj;

    if (!getBuild().equals(other.getBuild())) return false;
    if (failureCause_ != other.failureCause_) return false;
    if (!getFailureMessage().equals(other.getFailureMessage())) return false;
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
    hash = (37 * hash) + BUILD_FIELD_NUMBER;
    hash = (53 * hash) + getBuild().hashCode();
    hash = (37 * hash) + FAILURE_CAUSE_FIELD_NUMBER;
    hash = (53 * hash) + failureCause_;
    hash = (37 * hash) + FAILURE_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getFailureMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.PredeployJobRun prototype) {
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
   * PredeployJobRun contains information specific to a predeploy `JobRun`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.PredeployJobRun}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.PredeployJobRun)
      com.google.cloud.deploy.v1.PredeployJobRunOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_PredeployJobRun_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_PredeployJobRun_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.PredeployJobRun.class,
              com.google.cloud.deploy.v1.PredeployJobRun.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.PredeployJobRun.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      build_ = "";
      failureCause_ = 0;
      failureMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_PredeployJobRun_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.PredeployJobRun getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.PredeployJobRun.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.PredeployJobRun build() {
      com.google.cloud.deploy.v1.PredeployJobRun result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.PredeployJobRun buildPartial() {
      com.google.cloud.deploy.v1.PredeployJobRun result =
          new com.google.cloud.deploy.v1.PredeployJobRun(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.PredeployJobRun result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.build_ = build_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.failureCause_ = failureCause_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failureMessage_ = failureMessage_;
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
      if (other instanceof com.google.cloud.deploy.v1.PredeployJobRun) {
        return mergeFrom((com.google.cloud.deploy.v1.PredeployJobRun) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.PredeployJobRun other) {
      if (other == com.google.cloud.deploy.v1.PredeployJobRun.getDefaultInstance()) return this;
      if (!other.getBuild().isEmpty()) {
        build_ = other.build_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.failureCause_ != 0) {
        setFailureCauseValue(other.getFailureCauseValue());
      }
      if (!other.getFailureMessage().isEmpty()) {
        failureMessage_ = other.failureMessage_;
        bitField0_ |= 0x00000004;
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
            case 10:
              {
                build_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                failureCause_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                failureMessage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object build_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the Cloud Build `Build` object that is
     * used to execute the custom actions associated with the predeploy Job.
     * Format is projects/{project}/locations/{location}/builds/{build}.
     * </pre>
     *
     * <code>
     * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The build.
     */
    public java.lang.String getBuild() {
      java.lang.Object ref = build_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        build_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the Cloud Build `Build` object that is
     * used to execute the custom actions associated with the predeploy Job.
     * Format is projects/{project}/locations/{location}/builds/{build}.
     * </pre>
     *
     * <code>
     * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for build.
     */
    public com.google.protobuf.ByteString getBuildBytes() {
      java.lang.Object ref = build_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        build_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the Cloud Build `Build` object that is
     * used to execute the custom actions associated with the predeploy Job.
     * Format is projects/{project}/locations/{location}/builds/{build}.
     * </pre>
     *
     * <code>
     * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The build to set.
     * @return This builder for chaining.
     */
    public Builder setBuild(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      build_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the Cloud Build `Build` object that is
     * used to execute the custom actions associated with the predeploy Job.
     * Format is projects/{project}/locations/{location}/builds/{build}.
     * </pre>
     *
     * <code>
     * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBuild() {
      build_ = getDefaultInstance().getBuild();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of the Cloud Build `Build` object that is
     * used to execute the custom actions associated with the predeploy Job.
     * Format is projects/{project}/locations/{location}/builds/{build}.
     * </pre>
     *
     * <code>
     * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for build to set.
     * @return This builder for chaining.
     */
    public Builder setBuildBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      build_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int failureCause_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. The reason the predeploy failed. This will always be
     * unspecified while the predeploy is in progress or if it succeeded.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.PredeployJobRun.FailureCause failure_cause = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for failureCause.
     */
    @java.lang.Override
    public int getFailureCauseValue() {
      return failureCause_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The reason the predeploy failed. This will always be
     * unspecified while the predeploy is in progress or if it succeeded.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.PredeployJobRun.FailureCause failure_cause = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for failureCause to set.
     * @return This builder for chaining.
     */
    public Builder setFailureCauseValue(int value) {
      failureCause_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The reason the predeploy failed. This will always be
     * unspecified while the predeploy is in progress or if it succeeded.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.PredeployJobRun.FailureCause failure_cause = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The failureCause.
     */
    @java.lang.Override
    public com.google.cloud.deploy.v1.PredeployJobRun.FailureCause getFailureCause() {
      com.google.cloud.deploy.v1.PredeployJobRun.FailureCause result =
          com.google.cloud.deploy.v1.PredeployJobRun.FailureCause.forNumber(failureCause_);
      return result == null
          ? com.google.cloud.deploy.v1.PredeployJobRun.FailureCause.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. The reason the predeploy failed. This will always be
     * unspecified while the predeploy is in progress or if it succeeded.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.PredeployJobRun.FailureCause failure_cause = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The failureCause to set.
     * @return This builder for chaining.
     */
    public Builder setFailureCause(com.google.cloud.deploy.v1.PredeployJobRun.FailureCause value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      failureCause_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The reason the predeploy failed. This will always be
     * unspecified while the predeploy is in progress or if it succeeded.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.PredeployJobRun.FailureCause failure_cause = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFailureCause() {
      bitField0_ = (bitField0_ & ~0x00000002);
      failureCause_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object failureMessage_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the predeploy failure, if
     * available.
     * </pre>
     *
     * <code>string failure_message = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The failureMessage.
     */
    public java.lang.String getFailureMessage() {
      java.lang.Object ref = failureMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failureMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the predeploy failure, if
     * available.
     * </pre>
     *
     * <code>string failure_message = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for failureMessage.
     */
    public com.google.protobuf.ByteString getFailureMessageBytes() {
      java.lang.Object ref = failureMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        failureMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the predeploy failure, if
     * available.
     * </pre>
     *
     * <code>string failure_message = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      failureMessage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the predeploy failure, if
     * available.
     * </pre>
     *
     * <code>string failure_message = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFailureMessage() {
      failureMessage_ = getDefaultInstance().getFailureMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the predeploy failure, if
     * available.
     * </pre>
     *
     * <code>string failure_message = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      failureMessage_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.PredeployJobRun)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.PredeployJobRun)
  private static final com.google.cloud.deploy.v1.PredeployJobRun DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.PredeployJobRun();
  }

  public static com.google.cloud.deploy.v1.PredeployJobRun getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredeployJobRun> PARSER =
      new com.google.protobuf.AbstractParser<PredeployJobRun>() {
        @java.lang.Override
        public PredeployJobRun parsePartialFrom(
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

  public static com.google.protobuf.Parser<PredeployJobRun> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredeployJobRun> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.PredeployJobRun getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
