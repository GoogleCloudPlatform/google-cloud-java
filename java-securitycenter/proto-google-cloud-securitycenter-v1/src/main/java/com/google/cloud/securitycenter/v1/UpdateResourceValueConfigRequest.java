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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Request message to update resource value config
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest}
 */
public final class UpdateResourceValueConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest)
    UpdateResourceValueConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateResourceValueConfigRequest.newBuilder() to construct.
  private UpdateResourceValueConfigRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateResourceValueConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateResourceValueConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_UpdateResourceValueConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_UpdateResourceValueConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest.class,
            com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_VALUE_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.securitycenter.v1.ResourceValueConfig resourceValueConfig_;
  /**
   *
   *
   * <pre>
   * Required. The resource value config being updated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the resourceValueConfig field is set.
   */
  @java.lang.Override
  public boolean hasResourceValueConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The resource value config being updated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The resourceValueConfig.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.ResourceValueConfig getResourceValueConfig() {
    return resourceValueConfig_ == null
        ? com.google.cloud.securitycenter.v1.ResourceValueConfig.getDefaultInstance()
        : resourceValueConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The resource value config being updated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.ResourceValueConfigOrBuilder
      getResourceValueConfigOrBuilder() {
    return resourceValueConfig_ == null
        ? com.google.cloud.securitycenter.v1.ResourceValueConfig.getDefaultInstance()
        : resourceValueConfig_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getResourceValueConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getResourceValueConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest other =
        (com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest) obj;

    if (hasResourceValueConfig() != other.hasResourceValueConfig()) return false;
    if (hasResourceValueConfig()) {
      if (!getResourceValueConfig().equals(other.getResourceValueConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasResourceValueConfig()) {
      hash = (37 * hash) + RESOURCE_VALUE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getResourceValueConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest parseFrom(
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
      com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest prototype) {
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
   * Request message to update resource value config
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest)
      com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_UpdateResourceValueConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_UpdateResourceValueConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest.class,
              com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResourceValueConfigFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceValueConfig_ = null;
      if (resourceValueConfigBuilder_ != null) {
        resourceValueConfigBuilder_.dispose();
        resourceValueConfigBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_UpdateResourceValueConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest build() {
      com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest buildPartial() {
      com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest result =
          new com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceValueConfig_ =
            resourceValueConfigBuilder_ == null
                ? resourceValueConfig_
                : resourceValueConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest) {
        return mergeFrom(
            (com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest other) {
      if (other
          == com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest
              .getDefaultInstance()) return this;
      if (other.hasResourceValueConfig()) {
        mergeResourceValueConfig(other.getResourceValueConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(
                    getResourceValueConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.cloud.securitycenter.v1.ResourceValueConfig resourceValueConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.ResourceValueConfig,
            com.google.cloud.securitycenter.v1.ResourceValueConfig.Builder,
            com.google.cloud.securitycenter.v1.ResourceValueConfigOrBuilder>
        resourceValueConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The resource value config being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the resourceValueConfig field is set.
     */
    public boolean hasResourceValueConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The resource value config being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The resourceValueConfig.
     */
    public com.google.cloud.securitycenter.v1.ResourceValueConfig getResourceValueConfig() {
      if (resourceValueConfigBuilder_ == null) {
        return resourceValueConfig_ == null
            ? com.google.cloud.securitycenter.v1.ResourceValueConfig.getDefaultInstance()
            : resourceValueConfig_;
      } else {
        return resourceValueConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource value config being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setResourceValueConfig(
        com.google.cloud.securitycenter.v1.ResourceValueConfig value) {
      if (resourceValueConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resourceValueConfig_ = value;
      } else {
        resourceValueConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource value config being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setResourceValueConfig(
        com.google.cloud.securitycenter.v1.ResourceValueConfig.Builder builderForValue) {
      if (resourceValueConfigBuilder_ == null) {
        resourceValueConfig_ = builderForValue.build();
      } else {
        resourceValueConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource value config being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeResourceValueConfig(
        com.google.cloud.securitycenter.v1.ResourceValueConfig value) {
      if (resourceValueConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && resourceValueConfig_ != null
            && resourceValueConfig_
                != com.google.cloud.securitycenter.v1.ResourceValueConfig.getDefaultInstance()) {
          getResourceValueConfigBuilder().mergeFrom(value);
        } else {
          resourceValueConfig_ = value;
        }
      } else {
        resourceValueConfigBuilder_.mergeFrom(value);
      }
      if (resourceValueConfig_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource value config being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearResourceValueConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      resourceValueConfig_ = null;
      if (resourceValueConfigBuilder_ != null) {
        resourceValueConfigBuilder_.dispose();
        resourceValueConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource value config being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.ResourceValueConfig.Builder
        getResourceValueConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResourceValueConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The resource value config being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.ResourceValueConfigOrBuilder
        getResourceValueConfigOrBuilder() {
      if (resourceValueConfigBuilder_ != null) {
        return resourceValueConfigBuilder_.getMessageOrBuilder();
      } else {
        return resourceValueConfig_ == null
            ? com.google.cloud.securitycenter.v1.ResourceValueConfig.getDefaultInstance()
            : resourceValueConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource value config being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.ResourceValueConfig resource_value_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.ResourceValueConfig,
            com.google.cloud.securitycenter.v1.ResourceValueConfig.Builder,
            com.google.cloud.securitycenter.v1.ResourceValueConfigOrBuilder>
        getResourceValueConfigFieldBuilder() {
      if (resourceValueConfigBuilder_ == null) {
        resourceValueConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securitycenter.v1.ResourceValueConfig,
                com.google.cloud.securitycenter.v1.ResourceValueConfig.Builder,
                com.google.cloud.securitycenter.v1.ResourceValueConfigOrBuilder>(
                getResourceValueConfig(), getParentForChildren(), isClean());
        resourceValueConfig_ = null;
      }
      return resourceValueConfigBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest)
  private static final com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest();
  }

  public static com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateResourceValueConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateResourceValueConfigRequest>() {
        @java.lang.Override
        public UpdateResourceValueConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateResourceValueConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateResourceValueConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
