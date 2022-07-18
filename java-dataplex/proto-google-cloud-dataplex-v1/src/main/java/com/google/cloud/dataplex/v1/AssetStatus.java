/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dataplex/v1/resources.proto

package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Aggregated status of the underlying assets of a lake or zone.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.AssetStatus}
 */
public final class AssetStatus extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.AssetStatus)
    AssetStatusOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AssetStatus.newBuilder() to construct.
  private AssetStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AssetStatus() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AssetStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AssetStatus(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (updateTime_ != null) {
                subBuilder = updateTime_.toBuilder();
              }
              updateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateTime_);
                updateTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              activeAssets_ = input.readInt32();
              break;
            }
          case 24:
            {
              securityPolicyApplyingAssets_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.ResourcesProto
        .internal_static_google_cloud_dataplex_v1_AssetStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.ResourcesProto
        .internal_static_google_cloud_dataplex_v1_AssetStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.AssetStatus.class,
            com.google.cloud.dataplex.v1.AssetStatus.Builder.class);
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Last update time of the status.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Last update time of the status.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * Last update time of the status.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  public static final int ACTIVE_ASSETS_FIELD_NUMBER = 2;
  private int activeAssets_;
  /**
   *
   *
   * <pre>
   * Number of active assets.
   * </pre>
   *
   * <code>int32 active_assets = 2;</code>
   *
   * @return The activeAssets.
   */
  @java.lang.Override
  public int getActiveAssets() {
    return activeAssets_;
  }

  public static final int SECURITY_POLICY_APPLYING_ASSETS_FIELD_NUMBER = 3;
  private int securityPolicyApplyingAssets_;
  /**
   *
   *
   * <pre>
   * Number of assets that are in process of updating the security policy on
   * attached resources.
   * </pre>
   *
   * <code>int32 security_policy_applying_assets = 3;</code>
   *
   * @return The securityPolicyApplyingAssets.
   */
  @java.lang.Override
  public int getSecurityPolicyApplyingAssets() {
    return securityPolicyApplyingAssets_;
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
    if (updateTime_ != null) {
      output.writeMessage(1, getUpdateTime());
    }
    if (activeAssets_ != 0) {
      output.writeInt32(2, activeAssets_);
    }
    if (securityPolicyApplyingAssets_ != 0) {
      output.writeInt32(3, securityPolicyApplyingAssets_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateTime());
    }
    if (activeAssets_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, activeAssets_);
    }
    if (securityPolicyApplyingAssets_ != 0) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt32Size(3, securityPolicyApplyingAssets_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dataplex.v1.AssetStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.AssetStatus other = (com.google.cloud.dataplex.v1.AssetStatus) obj;

    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (getActiveAssets() != other.getActiveAssets()) return false;
    if (getSecurityPolicyApplyingAssets() != other.getSecurityPolicyApplyingAssets()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (37 * hash) + ACTIVE_ASSETS_FIELD_NUMBER;
    hash = (53 * hash) + getActiveAssets();
    hash = (37 * hash) + SECURITY_POLICY_APPLYING_ASSETS_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityPolicyApplyingAssets();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.AssetStatus parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.AssetStatus prototype) {
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
   * Aggregated status of the underlying assets of a lake or zone.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.AssetStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.AssetStatus)
      com.google.cloud.dataplex.v1.AssetStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.ResourcesProto
          .internal_static_google_cloud_dataplex_v1_AssetStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.ResourcesProto
          .internal_static_google_cloud_dataplex_v1_AssetStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.AssetStatus.class,
              com.google.cloud.dataplex.v1.AssetStatus.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.AssetStatus.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      activeAssets_ = 0;

      securityPolicyApplyingAssets_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.ResourcesProto
          .internal_static_google_cloud_dataplex_v1_AssetStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.AssetStatus getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.AssetStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.AssetStatus build() {
      com.google.cloud.dataplex.v1.AssetStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.AssetStatus buildPartial() {
      com.google.cloud.dataplex.v1.AssetStatus result =
          new com.google.cloud.dataplex.v1.AssetStatus(this);
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      result.activeAssets_ = activeAssets_;
      result.securityPolicyApplyingAssets_ = securityPolicyApplyingAssets_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.dataplex.v1.AssetStatus) {
        return mergeFrom((com.google.cloud.dataplex.v1.AssetStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.AssetStatus other) {
      if (other == com.google.cloud.dataplex.v1.AssetStatus.getDefaultInstance()) return this;
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      if (other.getActiveAssets() != 0) {
        setActiveAssets(other.getActiveAssets());
      }
      if (other.getSecurityPolicyApplyingAssets() != 0) {
        setSecurityPolicyApplyingAssets(other.getSecurityPolicyApplyingAssets());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.dataplex.v1.AssetStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataplex.v1.AssetStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Last update time of the status.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Last update time of the status.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Last update time of the status.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last update time of the status.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last update time of the status.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
              com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last update time of the status.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last update time of the status.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {

      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Last update time of the status.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Last update time of the status.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    private int activeAssets_;
    /**
     *
     *
     * <pre>
     * Number of active assets.
     * </pre>
     *
     * <code>int32 active_assets = 2;</code>
     *
     * @return The activeAssets.
     */
    @java.lang.Override
    public int getActiveAssets() {
      return activeAssets_;
    }
    /**
     *
     *
     * <pre>
     * Number of active assets.
     * </pre>
     *
     * <code>int32 active_assets = 2;</code>
     *
     * @param value The activeAssets to set.
     * @return This builder for chaining.
     */
    public Builder setActiveAssets(int value) {

      activeAssets_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of active assets.
     * </pre>
     *
     * <code>int32 active_assets = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearActiveAssets() {

      activeAssets_ = 0;
      onChanged();
      return this;
    }

    private int securityPolicyApplyingAssets_;
    /**
     *
     *
     * <pre>
     * Number of assets that are in process of updating the security policy on
     * attached resources.
     * </pre>
     *
     * <code>int32 security_policy_applying_assets = 3;</code>
     *
     * @return The securityPolicyApplyingAssets.
     */
    @java.lang.Override
    public int getSecurityPolicyApplyingAssets() {
      return securityPolicyApplyingAssets_;
    }
    /**
     *
     *
     * <pre>
     * Number of assets that are in process of updating the security policy on
     * attached resources.
     * </pre>
     *
     * <code>int32 security_policy_applying_assets = 3;</code>
     *
     * @param value The securityPolicyApplyingAssets to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityPolicyApplyingAssets(int value) {

      securityPolicyApplyingAssets_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of assets that are in process of updating the security policy on
     * attached resources.
     * </pre>
     *
     * <code>int32 security_policy_applying_assets = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSecurityPolicyApplyingAssets() {

      securityPolicyApplyingAssets_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.AssetStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.AssetStatus)
  private static final com.google.cloud.dataplex.v1.AssetStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.AssetStatus();
  }

  public static com.google.cloud.dataplex.v1.AssetStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetStatus> PARSER =
      new com.google.protobuf.AbstractParser<AssetStatus>() {
        @java.lang.Override
        public AssetStatus parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AssetStatus(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AssetStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.AssetStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
