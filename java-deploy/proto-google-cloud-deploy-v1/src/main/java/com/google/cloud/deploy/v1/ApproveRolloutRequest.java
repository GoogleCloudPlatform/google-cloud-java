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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * The request object used by `ApproveRollout`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.ApproveRolloutRequest}
 */
public final class ApproveRolloutRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.ApproveRolloutRequest)
    ApproveRolloutRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ApproveRolloutRequest.newBuilder() to construct.
  private ApproveRolloutRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApproveRolloutRequest() {
    name_ = "";
    overrideDeployPolicy_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ApproveRolloutRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_ApproveRolloutRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_ApproveRolloutRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.ApproveRolloutRequest.class,
            com.google.cloud.deploy.v1.ApproveRolloutRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the Rollout. Format is
   * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the Rollout. Format is
   * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPROVED_FIELD_NUMBER = 2;
  private boolean approved_ = false;
  /**
   *
   *
   * <pre>
   * Required. True = approve; false = reject
   * </pre>
   *
   * <code>bool approved = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The approved.
   */
  @java.lang.Override
  public boolean getApproved() {
    return approved_;
  }

  public static final int OVERRIDE_DEPLOY_POLICY_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList overrideDeployPolicy_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
   * </pre>
   *
   * <code>
   * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the overrideDeployPolicy.
   */
  public com.google.protobuf.ProtocolStringList getOverrideDeployPolicyList() {
    return overrideDeployPolicy_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
   * </pre>
   *
   * <code>
   * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of overrideDeployPolicy.
   */
  public int getOverrideDeployPolicyCount() {
    return overrideDeployPolicy_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
   * </pre>
   *
   * <code>
   * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The overrideDeployPolicy at the given index.
   */
  public java.lang.String getOverrideDeployPolicy(int index) {
    return overrideDeployPolicy_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. Deploy policies to override. Format is
   * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
   * </pre>
   *
   * <code>
   * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the overrideDeployPolicy at the given index.
   */
  public com.google.protobuf.ByteString getOverrideDeployPolicyBytes(int index) {
    return overrideDeployPolicy_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (approved_ != false) {
      output.writeBool(2, approved_);
    }
    for (int i = 0; i < overrideDeployPolicy_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 3, overrideDeployPolicy_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (approved_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, approved_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < overrideDeployPolicy_.size(); i++) {
        dataSize += computeStringSizeNoTag(overrideDeployPolicy_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getOverrideDeployPolicyList().size();
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
    if (!(obj instanceof com.google.cloud.deploy.v1.ApproveRolloutRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.ApproveRolloutRequest other =
        (com.google.cloud.deploy.v1.ApproveRolloutRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (getApproved() != other.getApproved()) return false;
    if (!getOverrideDeployPolicyList().equals(other.getOverrideDeployPolicyList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + APPROVED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getApproved());
    if (getOverrideDeployPolicyCount() > 0) {
      hash = (37 * hash) + OVERRIDE_DEPLOY_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getOverrideDeployPolicyList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.ApproveRolloutRequest prototype) {
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
   * The request object used by `ApproveRollout`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.ApproveRolloutRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.ApproveRolloutRequest)
      com.google.cloud.deploy.v1.ApproveRolloutRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_ApproveRolloutRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_ApproveRolloutRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.ApproveRolloutRequest.class,
              com.google.cloud.deploy.v1.ApproveRolloutRequest.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.ApproveRolloutRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      approved_ = false;
      overrideDeployPolicy_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_ApproveRolloutRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.ApproveRolloutRequest getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.ApproveRolloutRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.ApproveRolloutRequest build() {
      com.google.cloud.deploy.v1.ApproveRolloutRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.ApproveRolloutRequest buildPartial() {
      com.google.cloud.deploy.v1.ApproveRolloutRequest result =
          new com.google.cloud.deploy.v1.ApproveRolloutRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.ApproveRolloutRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.approved_ = approved_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        overrideDeployPolicy_.makeImmutable();
        result.overrideDeployPolicy_ = overrideDeployPolicy_;
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
      if (other instanceof com.google.cloud.deploy.v1.ApproveRolloutRequest) {
        return mergeFrom((com.google.cloud.deploy.v1.ApproveRolloutRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.ApproveRolloutRequest other) {
      if (other == com.google.cloud.deploy.v1.ApproveRolloutRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getApproved() != false) {
        setApproved(other.getApproved());
      }
      if (!other.overrideDeployPolicy_.isEmpty()) {
        if (overrideDeployPolicy_.isEmpty()) {
          overrideDeployPolicy_ = other.overrideDeployPolicy_;
          bitField0_ |= 0x00000004;
        } else {
          ensureOverrideDeployPolicyIsMutable();
          overrideDeployPolicy_.addAll(other.overrideDeployPolicy_);
        }
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                approved_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureOverrideDeployPolicyIsMutable();
                overrideDeployPolicy_.add(s);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Rollout. Format is
     * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean approved_;
    /**
     *
     *
     * <pre>
     * Required. True = approve; false = reject
     * </pre>
     *
     * <code>bool approved = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The approved.
     */
    @java.lang.Override
    public boolean getApproved() {
      return approved_;
    }
    /**
     *
     *
     * <pre>
     * Required. True = approve; false = reject
     * </pre>
     *
     * <code>bool approved = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The approved to set.
     * @return This builder for chaining.
     */
    public Builder setApproved(boolean value) {

      approved_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. True = approve; false = reject
     * </pre>
     *
     * <code>bool approved = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearApproved() {
      bitField0_ = (bitField0_ & ~0x00000002);
      approved_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList overrideDeployPolicy_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureOverrideDeployPolicyIsMutable() {
      if (!overrideDeployPolicy_.isModifiable()) {
        overrideDeployPolicy_ = new com.google.protobuf.LazyStringArrayList(overrideDeployPolicy_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     *
     *
     * <pre>
     * Optional. Deploy policies to override. Format is
     * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
     * </pre>
     *
     * <code>
     * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return A list containing the overrideDeployPolicy.
     */
    public com.google.protobuf.ProtocolStringList getOverrideDeployPolicyList() {
      overrideDeployPolicy_.makeImmutable();
      return overrideDeployPolicy_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Deploy policies to override. Format is
     * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
     * </pre>
     *
     * <code>
     * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The count of overrideDeployPolicy.
     */
    public int getOverrideDeployPolicyCount() {
      return overrideDeployPolicy_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. Deploy policies to override. Format is
     * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
     * </pre>
     *
     * <code>
     * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the element to return.
     * @return The overrideDeployPolicy at the given index.
     */
    public java.lang.String getOverrideDeployPolicy(int index) {
      return overrideDeployPolicy_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Deploy policies to override. Format is
     * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
     * </pre>
     *
     * <code>
     * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the overrideDeployPolicy at the given index.
     */
    public com.google.protobuf.ByteString getOverrideDeployPolicyBytes(int index) {
      return overrideDeployPolicy_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Deploy policies to override. Format is
     * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
     * </pre>
     *
     * <code>
     * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The overrideDeployPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setOverrideDeployPolicy(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOverrideDeployPolicyIsMutable();
      overrideDeployPolicy_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Deploy policies to override. Format is
     * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
     * </pre>
     *
     * <code>
     * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The overrideDeployPolicy to add.
     * @return This builder for chaining.
     */
    public Builder addOverrideDeployPolicy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOverrideDeployPolicyIsMutable();
      overrideDeployPolicy_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Deploy policies to override. Format is
     * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
     * </pre>
     *
     * <code>
     * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param values The overrideDeployPolicy to add.
     * @return This builder for chaining.
     */
    public Builder addAllOverrideDeployPolicy(java.lang.Iterable<java.lang.String> values) {
      ensureOverrideDeployPolicyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, overrideDeployPolicy_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Deploy policies to override. Format is
     * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
     * </pre>
     *
     * <code>
     * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOverrideDeployPolicy() {
      overrideDeployPolicy_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Deploy policies to override. Format is
     * `projects/{project}/locations/{location}/deployPolicies/{deployPolicy}`.
     * </pre>
     *
     * <code>
     * repeated string override_deploy_policy = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes of the overrideDeployPolicy to add.
     * @return This builder for chaining.
     */
    public Builder addOverrideDeployPolicyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureOverrideDeployPolicyIsMutable();
      overrideDeployPolicy_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.ApproveRolloutRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.ApproveRolloutRequest)
  private static final com.google.cloud.deploy.v1.ApproveRolloutRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.ApproveRolloutRequest();
  }

  public static com.google.cloud.deploy.v1.ApproveRolloutRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApproveRolloutRequest> PARSER =
      new com.google.protobuf.AbstractParser<ApproveRolloutRequest>() {
        @java.lang.Override
        public ApproveRolloutRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApproveRolloutRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApproveRolloutRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.ApproveRolloutRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
