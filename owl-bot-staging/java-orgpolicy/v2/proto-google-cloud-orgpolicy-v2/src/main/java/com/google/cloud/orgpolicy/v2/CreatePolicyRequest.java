// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

package com.google.cloud.orgpolicy.v2;

/**
 * <pre>
 * The request sent to the [CreatePolicyRequest]
 * [google.cloud.orgpolicy.v2.OrgPolicy.CreatePolicy] method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orgpolicy.v2.CreatePolicyRequest}
 */
public final class CreatePolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.orgpolicy.v2.CreatePolicyRequest)
    CreatePolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePolicyRequest.newBuilder() to construct.
  private CreatePolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePolicyRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreatePolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orgpolicy.v2.CreatePolicyRequest.class, com.google.cloud.orgpolicy.v2.CreatePolicyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The Cloud resource that will parent the new Policy. Must be in
   * one of the following forms:
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
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
   * Required. The Cloud resource that will parent the new Policy. Must be in
   * one of the following forms:
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
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

  public static final int POLICY_FIELD_NUMBER = 3;
  private com.google.cloud.orgpolicy.v2.Policy policy_;
  /**
   * <pre>
   * Required. `Policy` to create.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the policy field is set.
   */
  @java.lang.Override
  public boolean hasPolicy() {
    return policy_ != null;
  }
  /**
   * <pre>
   * Required. `Policy` to create.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The policy.
   */
  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.Policy getPolicy() {
    return policy_ == null ? com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance() : policy_;
  }
  /**
   * <pre>
   * Required. `Policy` to create.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.PolicyOrBuilder getPolicyOrBuilder() {
    return policy_ == null ? com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance() : policy_;
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
    if (policy_ != null) {
      output.writeMessage(3, getPolicy());
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
    if (policy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPolicy());
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
    if (!(obj instanceof com.google.cloud.orgpolicy.v2.CreatePolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.orgpolicy.v2.CreatePolicyRequest other = (com.google.cloud.orgpolicy.v2.CreatePolicyRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy()
          .equals(other.getPolicy())) return false;
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
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.orgpolicy.v2.CreatePolicyRequest prototype) {
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
   * The request sent to the [CreatePolicyRequest]
   * [google.cloud.orgpolicy.v2.OrgPolicy.CreatePolicy] method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orgpolicy.v2.CreatePolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orgpolicy.v2.CreatePolicyRequest)
      com.google.cloud.orgpolicy.v2.CreatePolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orgpolicy.v2.CreatePolicyRequest.class, com.google.cloud.orgpolicy.v2.CreatePolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.orgpolicy.v2.CreatePolicyRequest.newBuilder()
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
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.CreatePolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.orgpolicy.v2.CreatePolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.CreatePolicyRequest build() {
      com.google.cloud.orgpolicy.v2.CreatePolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.CreatePolicyRequest buildPartial() {
      com.google.cloud.orgpolicy.v2.CreatePolicyRequest result = new com.google.cloud.orgpolicy.v2.CreatePolicyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.orgpolicy.v2.CreatePolicyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.policy_ = policyBuilder_ == null
            ? policy_
            : policyBuilder_.build();
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
      if (other instanceof com.google.cloud.orgpolicy.v2.CreatePolicyRequest) {
        return mergeFrom((com.google.cloud.orgpolicy.v2.CreatePolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.orgpolicy.v2.CreatePolicyRequest other) {
      if (other == com.google.cloud.orgpolicy.v2.CreatePolicyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
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
            case 26: {
              input.readMessage(
                  getPolicyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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
     * Required. The Cloud resource that will parent the new Policy. Must be in
     * one of the following forms:
     * * `projects/{project_number}`
     * * `projects/{project_id}`
     * * `folders/{folder_id}`
     * * `organizations/{organization_id}`
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
     * Required. The Cloud resource that will parent the new Policy. Must be in
     * one of the following forms:
     * * `projects/{project_number}`
     * * `projects/{project_id}`
     * * `folders/{folder_id}`
     * * `organizations/{organization_id}`
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
     * Required. The Cloud resource that will parent the new Policy. Must be in
     * one of the following forms:
     * * `projects/{project_number}`
     * * `projects/{project_id}`
     * * `folders/{folder_id}`
     * * `organizations/{organization_id}`
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
     * Required. The Cloud resource that will parent the new Policy. Must be in
     * one of the following forms:
     * * `projects/{project_number}`
     * * `projects/{project_id}`
     * * `folders/{folder_id}`
     * * `organizations/{organization_id}`
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
     * Required. The Cloud resource that will parent the new Policy. Must be in
     * one of the following forms:
     * * `projects/{project_number}`
     * * `projects/{project_id}`
     * * `folders/{folder_id}`
     * * `organizations/{organization_id}`
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

    private com.google.cloud.orgpolicy.v2.Policy policy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.orgpolicy.v2.Policy, com.google.cloud.orgpolicy.v2.Policy.Builder, com.google.cloud.orgpolicy.v2.PolicyOrBuilder> policyBuilder_;
    /**
     * <pre>
     * Required. `Policy` to create.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. `Policy` to create.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The policy.
     */
    public com.google.cloud.orgpolicy.v2.Policy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null ? com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance() : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. `Policy` to create.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicy(com.google.cloud.orgpolicy.v2.Policy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
      } else {
        policyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. `Policy` to create.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPolicy(
        com.google.cloud.orgpolicy.v2.Policy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. `Policy` to create.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergePolicy(com.google.cloud.orgpolicy.v2.Policy value) {
      if (policyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          policy_ != null &&
          policy_ != com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance()) {
          getPolicyBuilder().mergeFrom(value);
        } else {
          policy_ = value;
        }
      } else {
        policyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. `Policy` to create.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPolicy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. `Policy` to create.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.orgpolicy.v2.Policy.Builder getPolicyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. `Policy` to create.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.orgpolicy.v2.PolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null ?
            com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance() : policy_;
      }
    }
    /**
     * <pre>
     * Required. `Policy` to create.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.orgpolicy.v2.Policy, com.google.cloud.orgpolicy.v2.Policy.Builder, com.google.cloud.orgpolicy.v2.PolicyOrBuilder> 
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.orgpolicy.v2.Policy, com.google.cloud.orgpolicy.v2.Policy.Builder, com.google.cloud.orgpolicy.v2.PolicyOrBuilder>(
                getPolicy(),
                getParentForChildren(),
                isClean());
        policy_ = null;
      }
      return policyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.orgpolicy.v2.CreatePolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orgpolicy.v2.CreatePolicyRequest)
  private static final com.google.cloud.orgpolicy.v2.CreatePolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.orgpolicy.v2.CreatePolicyRequest();
  }

  public static com.google.cloud.orgpolicy.v2.CreatePolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreatePolicyRequest>() {
    @java.lang.Override
    public CreatePolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.CreatePolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

