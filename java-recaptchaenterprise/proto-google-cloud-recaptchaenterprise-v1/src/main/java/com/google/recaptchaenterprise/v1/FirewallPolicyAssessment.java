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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.5
package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * Policy config assessment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment}
 */
public final class FirewallPolicyAssessment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment)
    FirewallPolicyAssessmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FirewallPolicyAssessment.newBuilder() to construct.
  private FirewallPolicyAssessment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FirewallPolicyAssessment() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FirewallPolicyAssessment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_FirewallPolicyAssessment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_FirewallPolicyAssessment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.FirewallPolicyAssessment.class,
            com.google.recaptchaenterprise.v1.FirewallPolicyAssessment.Builder.class);
  }

  private int bitField0_;
  public static final int ERROR_FIELD_NUMBER = 5;
  private com.google.rpc.Status error_;
  /**
   *
   *
   * <pre>
   * Output only. If the processing of a policy config fails, an error is
   * populated and the firewall_policy is left empty.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Output only. If the processing of a policy config fails, an error is
   * populated and the firewall_policy is left empty.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  @java.lang.Override
  public com.google.rpc.Status getError() {
    return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
  }
  /**
   *
   *
   * <pre>
   * Output only. If the processing of a policy config fails, an error is
   * populated and the firewall_policy is left empty.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
    return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
  }

  public static final int FIREWALL_POLICY_FIELD_NUMBER = 8;
  private com.google.recaptchaenterprise.v1.FirewallPolicy firewallPolicy_;
  /**
   *
   *
   * <pre>
   * Output only. The policy that matched the request. If more than one policy
   * may match, this is the first match. If no policy matches the incoming
   * request, the policy field is left empty.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the firewallPolicy field is set.
   */
  @java.lang.Override
  public boolean hasFirewallPolicy() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Output only. The policy that matched the request. If more than one policy
   * may match, this is the first match. If no policy matches the incoming
   * request, the policy field is left empty.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The firewallPolicy.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.FirewallPolicy getFirewallPolicy() {
    return firewallPolicy_ == null
        ? com.google.recaptchaenterprise.v1.FirewallPolicy.getDefaultInstance()
        : firewallPolicy_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The policy that matched the request. If more than one policy
   * may match, this is the first match. If no policy matches the incoming
   * request, the policy field is left empty.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.FirewallPolicyOrBuilder getFirewallPolicyOrBuilder() {
    return firewallPolicy_ == null
        ? com.google.recaptchaenterprise.v1.FirewallPolicy.getDefaultInstance()
        : firewallPolicy_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(5, getError());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(8, getFirewallPolicy());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getError());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getFirewallPolicy());
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.FirewallPolicyAssessment)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.FirewallPolicyAssessment other =
        (com.google.recaptchaenterprise.v1.FirewallPolicyAssessment) obj;

    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError().equals(other.getError())) return false;
    }
    if (hasFirewallPolicy() != other.hasFirewallPolicy()) return false;
    if (hasFirewallPolicy()) {
      if (!getFirewallPolicy().equals(other.getFirewallPolicy())) return false;
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
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    if (hasFirewallPolicy()) {
      hash = (37 * hash) + FIREWALL_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getFirewallPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment parseFrom(
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
      com.google.recaptchaenterprise.v1.FirewallPolicyAssessment prototype) {
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
   * Policy config assessment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment)
      com.google.recaptchaenterprise.v1.FirewallPolicyAssessmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_FirewallPolicyAssessment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_FirewallPolicyAssessment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.FirewallPolicyAssessment.class,
              com.google.recaptchaenterprise.v1.FirewallPolicyAssessment.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.FirewallPolicyAssessment.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getErrorFieldBuilder();
        getFirewallPolicyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      firewallPolicy_ = null;
      if (firewallPolicyBuilder_ != null) {
        firewallPolicyBuilder_.dispose();
        firewallPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_FirewallPolicyAssessment_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.FirewallPolicyAssessment getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.FirewallPolicyAssessment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.FirewallPolicyAssessment build() {
      com.google.recaptchaenterprise.v1.FirewallPolicyAssessment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.FirewallPolicyAssessment buildPartial() {
      com.google.recaptchaenterprise.v1.FirewallPolicyAssessment result =
          new com.google.recaptchaenterprise.v1.FirewallPolicyAssessment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.recaptchaenterprise.v1.FirewallPolicyAssessment result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.error_ = errorBuilder_ == null ? error_ : errorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.firewallPolicy_ =
            firewallPolicyBuilder_ == null ? firewallPolicy_ : firewallPolicyBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.recaptchaenterprise.v1.FirewallPolicyAssessment) {
        return mergeFrom((com.google.recaptchaenterprise.v1.FirewallPolicyAssessment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.FirewallPolicyAssessment other) {
      if (other == com.google.recaptchaenterprise.v1.FirewallPolicyAssessment.getDefaultInstance())
        return this;
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (other.hasFirewallPolicy()) {
        mergeFirewallPolicy(other.getFirewallPolicy());
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
            case 42:
              {
                input.readMessage(getErrorFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 42
            case 66:
              {
                input.readMessage(getFirewallPolicyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 66
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

    private com.google.rpc.Status error_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        errorBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. If the processing of a policy config fails, an error is
     * populated and the firewall_policy is left empty.
     * </pre>
     *
     * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. If the processing of a policy config fails, an error is
     * populated and the firewall_policy is left empty.
     * </pre>
     *
     * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The error.
     */
    public com.google.rpc.Status getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. If the processing of a policy config fails, an error is
     * populated and the firewall_policy is left empty.
     * </pre>
     *
     * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. If the processing of a policy config fails, an error is
     * populated and the firewall_policy is left empty.
     * </pre>
     *
     * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setError(com.google.rpc.Status.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. If the processing of a policy config fails, an error is
     * populated and the firewall_policy is left empty.
     * </pre>
     *
     * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && error_ != null
            && error_ != com.google.rpc.Status.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      if (error_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. If the processing of a policy config fails, an error is
     * populated and the firewall_policy is left empty.
     * </pre>
     *
     * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000001);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. If the processing of a policy config fails, an error is
     * populated and the firewall_policy is left empty.
     * </pre>
     *
     * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.rpc.Status.Builder getErrorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. If the processing of a policy config fails, an error is
     * populated and the firewall_policy is left empty.
     * </pre>
     *
     * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. If the processing of a policy config fails, an error is
     * populated and the firewall_policy is left empty.
     * </pre>
     *
     * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(getError(), getParentForChildren(), isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private com.google.recaptchaenterprise.v1.FirewallPolicy firewallPolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1.FirewallPolicy,
            com.google.recaptchaenterprise.v1.FirewallPolicy.Builder,
            com.google.recaptchaenterprise.v1.FirewallPolicyOrBuilder>
        firewallPolicyBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The policy that matched the request. If more than one policy
     * may match, this is the first match. If no policy matches the incoming
     * request, the policy field is left empty.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the firewallPolicy field is set.
     */
    public boolean hasFirewallPolicy() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. The policy that matched the request. If more than one policy
     * may match, this is the first match. If no policy matches the incoming
     * request, the policy field is left empty.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The firewallPolicy.
     */
    public com.google.recaptchaenterprise.v1.FirewallPolicy getFirewallPolicy() {
      if (firewallPolicyBuilder_ == null) {
        return firewallPolicy_ == null
            ? com.google.recaptchaenterprise.v1.FirewallPolicy.getDefaultInstance()
            : firewallPolicy_;
      } else {
        return firewallPolicyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The policy that matched the request. If more than one policy
     * may match, this is the first match. If no policy matches the incoming
     * request, the policy field is left empty.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setFirewallPolicy(com.google.recaptchaenterprise.v1.FirewallPolicy value) {
      if (firewallPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        firewallPolicy_ = value;
      } else {
        firewallPolicyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The policy that matched the request. If more than one policy
     * may match, this is the first match. If no policy matches the incoming
     * request, the policy field is left empty.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setFirewallPolicy(
        com.google.recaptchaenterprise.v1.FirewallPolicy.Builder builderForValue) {
      if (firewallPolicyBuilder_ == null) {
        firewallPolicy_ = builderForValue.build();
      } else {
        firewallPolicyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The policy that matched the request. If more than one policy
     * may match, this is the first match. If no policy matches the incoming
     * request, the policy field is left empty.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeFirewallPolicy(com.google.recaptchaenterprise.v1.FirewallPolicy value) {
      if (firewallPolicyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && firewallPolicy_ != null
            && firewallPolicy_
                != com.google.recaptchaenterprise.v1.FirewallPolicy.getDefaultInstance()) {
          getFirewallPolicyBuilder().mergeFrom(value);
        } else {
          firewallPolicy_ = value;
        }
      } else {
        firewallPolicyBuilder_.mergeFrom(value);
      }
      if (firewallPolicy_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The policy that matched the request. If more than one policy
     * may match, this is the first match. If no policy matches the incoming
     * request, the policy field is left empty.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearFirewallPolicy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      firewallPolicy_ = null;
      if (firewallPolicyBuilder_ != null) {
        firewallPolicyBuilder_.dispose();
        firewallPolicyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The policy that matched the request. If more than one policy
     * may match, this is the first match. If no policy matches the incoming
     * request, the policy field is left empty.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.recaptchaenterprise.v1.FirewallPolicy.Builder getFirewallPolicyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFirewallPolicyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The policy that matched the request. If more than one policy
     * may match, this is the first match. If no policy matches the incoming
     * request, the policy field is left empty.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.recaptchaenterprise.v1.FirewallPolicyOrBuilder getFirewallPolicyOrBuilder() {
      if (firewallPolicyBuilder_ != null) {
        return firewallPolicyBuilder_.getMessageOrBuilder();
      } else {
        return firewallPolicy_ == null
            ? com.google.recaptchaenterprise.v1.FirewallPolicy.getDefaultInstance()
            : firewallPolicy_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The policy that matched the request. If more than one policy
     * may match, this is the first match. If no policy matches the incoming
     * request, the policy field is left empty.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1.FirewallPolicy,
            com.google.recaptchaenterprise.v1.FirewallPolicy.Builder,
            com.google.recaptchaenterprise.v1.FirewallPolicyOrBuilder>
        getFirewallPolicyFieldBuilder() {
      if (firewallPolicyBuilder_ == null) {
        firewallPolicyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.recaptchaenterprise.v1.FirewallPolicy,
                com.google.recaptchaenterprise.v1.FirewallPolicy.Builder,
                com.google.recaptchaenterprise.v1.FirewallPolicyOrBuilder>(
                getFirewallPolicy(), getParentForChildren(), isClean());
        firewallPolicy_ = null;
      }
      return firewallPolicyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment)
  private static final com.google.recaptchaenterprise.v1.FirewallPolicyAssessment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.FirewallPolicyAssessment();
  }

  public static com.google.recaptchaenterprise.v1.FirewallPolicyAssessment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FirewallPolicyAssessment> PARSER =
      new com.google.protobuf.AbstractParser<FirewallPolicyAssessment>() {
        @java.lang.Override
        public FirewallPolicyAssessment parsePartialFrom(
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

  public static com.google.protobuf.Parser<FirewallPolicyAssessment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FirewallPolicyAssessment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.FirewallPolicyAssessment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
