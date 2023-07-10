// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Contains output only fields. Use this sub-message for all output fields set on ResourcePolicy. The internal structure of this "status" field should mimic the structure of ResourcePolicy proto specification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ResourcePolicyResourceStatus}
 */
public final class ResourcePolicyResourceStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ResourcePolicyResourceStatus)
    ResourcePolicyResourceStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourcePolicyResourceStatus.newBuilder() to construct.
  private ResourcePolicyResourceStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourcePolicyResourceStatus() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourcePolicyResourceStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyResourceStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyResourceStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ResourcePolicyResourceStatus.class, com.google.cloud.compute.v1.ResourcePolicyResourceStatus.Builder.class);
  }

  private int bitField0_;
  public static final int INSTANCE_SCHEDULE_POLICY_FIELD_NUMBER = 344877104;
  private com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instanceSchedulePolicy_;
  /**
   * <pre>
   * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
   * @return Whether the instanceSchedulePolicy field is set.
   */
  @java.lang.Override
  public boolean hasInstanceSchedulePolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
   * @return The instanceSchedulePolicy.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus getInstanceSchedulePolicy() {
    return instanceSchedulePolicy_ == null ? com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.getDefaultInstance() : instanceSchedulePolicy_;
  }
  /**
   * <pre>
   * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusOrBuilder getInstanceSchedulePolicyOrBuilder() {
    return instanceSchedulePolicy_ == null ? com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.getDefaultInstance() : instanceSchedulePolicy_;
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
      output.writeMessage(344877104, getInstanceSchedulePolicy());
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
        .computeMessageSize(344877104, getInstanceSchedulePolicy());
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
    if (!(obj instanceof com.google.cloud.compute.v1.ResourcePolicyResourceStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ResourcePolicyResourceStatus other = (com.google.cloud.compute.v1.ResourcePolicyResourceStatus) obj;

    if (hasInstanceSchedulePolicy() != other.hasInstanceSchedulePolicy()) return false;
    if (hasInstanceSchedulePolicy()) {
      if (!getInstanceSchedulePolicy()
          .equals(other.getInstanceSchedulePolicy())) return false;
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
    if (hasInstanceSchedulePolicy()) {
      hash = (37 * hash) + INSTANCE_SCHEDULE_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getInstanceSchedulePolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ResourcePolicyResourceStatus prototype) {
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
   * Contains output only fields. Use this sub-message for all output fields set on ResourcePolicy. The internal structure of this "status" field should mimic the structure of ResourcePolicy proto specification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ResourcePolicyResourceStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ResourcePolicyResourceStatus)
      com.google.cloud.compute.v1.ResourcePolicyResourceStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyResourceStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyResourceStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ResourcePolicyResourceStatus.class, com.google.cloud.compute.v1.ResourcePolicyResourceStatus.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ResourcePolicyResourceStatus.newBuilder()
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
        getInstanceSchedulePolicyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      instanceSchedulePolicy_ = null;
      if (instanceSchedulePolicyBuilder_ != null) {
        instanceSchedulePolicyBuilder_.dispose();
        instanceSchedulePolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyResourceStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyResourceStatus getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ResourcePolicyResourceStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyResourceStatus build() {
      com.google.cloud.compute.v1.ResourcePolicyResourceStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyResourceStatus buildPartial() {
      com.google.cloud.compute.v1.ResourcePolicyResourceStatus result = new com.google.cloud.compute.v1.ResourcePolicyResourceStatus(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ResourcePolicyResourceStatus result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instanceSchedulePolicy_ = instanceSchedulePolicyBuilder_ == null
            ? instanceSchedulePolicy_
            : instanceSchedulePolicyBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.ResourcePolicyResourceStatus) {
        return mergeFrom((com.google.cloud.compute.v1.ResourcePolicyResourceStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ResourcePolicyResourceStatus other) {
      if (other == com.google.cloud.compute.v1.ResourcePolicyResourceStatus.getDefaultInstance()) return this;
      if (other.hasInstanceSchedulePolicy()) {
        mergeInstanceSchedulePolicy(other.getInstanceSchedulePolicy());
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
            case -1535950462: {
              input.readMessage(
                  getInstanceSchedulePolicyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case -1535950462
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

    private com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instanceSchedulePolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus, com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.Builder, com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusOrBuilder> instanceSchedulePolicyBuilder_;
    /**
     * <pre>
     * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
     * @return Whether the instanceSchedulePolicy field is set.
     */
    public boolean hasInstanceSchedulePolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
     * @return The instanceSchedulePolicy.
     */
    public com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus getInstanceSchedulePolicy() {
      if (instanceSchedulePolicyBuilder_ == null) {
        return instanceSchedulePolicy_ == null ? com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.getDefaultInstance() : instanceSchedulePolicy_;
      } else {
        return instanceSchedulePolicyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
     */
    public Builder setInstanceSchedulePolicy(com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus value) {
      if (instanceSchedulePolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        instanceSchedulePolicy_ = value;
      } else {
        instanceSchedulePolicyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
     */
    public Builder setInstanceSchedulePolicy(
        com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.Builder builderForValue) {
      if (instanceSchedulePolicyBuilder_ == null) {
        instanceSchedulePolicy_ = builderForValue.build();
      } else {
        instanceSchedulePolicyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
     */
    public Builder mergeInstanceSchedulePolicy(com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus value) {
      if (instanceSchedulePolicyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          instanceSchedulePolicy_ != null &&
          instanceSchedulePolicy_ != com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.getDefaultInstance()) {
          getInstanceSchedulePolicyBuilder().mergeFrom(value);
        } else {
          instanceSchedulePolicy_ = value;
        }
      } else {
        instanceSchedulePolicyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
     */
    public Builder clearInstanceSchedulePolicy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      instanceSchedulePolicy_ = null;
      if (instanceSchedulePolicyBuilder_ != null) {
        instanceSchedulePolicyBuilder_.dispose();
        instanceSchedulePolicyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.Builder getInstanceSchedulePolicyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInstanceSchedulePolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusOrBuilder getInstanceSchedulePolicyOrBuilder() {
      if (instanceSchedulePolicyBuilder_ != null) {
        return instanceSchedulePolicyBuilder_.getMessageOrBuilder();
      } else {
        return instanceSchedulePolicy_ == null ?
            com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.getDefaultInstance() : instanceSchedulePolicy_;
      }
    }
    /**
     * <pre>
     * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus instance_schedule_policy = 344877104;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus, com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.Builder, com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusOrBuilder> 
        getInstanceSchedulePolicyFieldBuilder() {
      if (instanceSchedulePolicyBuilder_ == null) {
        instanceSchedulePolicyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus, com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatus.Builder, com.google.cloud.compute.v1.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusOrBuilder>(
                getInstanceSchedulePolicy(),
                getParentForChildren(),
                isClean());
        instanceSchedulePolicy_ = null;
      }
      return instanceSchedulePolicyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ResourcePolicyResourceStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ResourcePolicyResourceStatus)
  private static final com.google.cloud.compute.v1.ResourcePolicyResourceStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ResourcePolicyResourceStatus();
  }

  public static com.google.cloud.compute.v1.ResourcePolicyResourceStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourcePolicyResourceStatus>
      PARSER = new com.google.protobuf.AbstractParser<ResourcePolicyResourceStatus>() {
    @java.lang.Override
    public ResourcePolicyResourceStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourcePolicyResourceStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourcePolicyResourceStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyResourceStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

