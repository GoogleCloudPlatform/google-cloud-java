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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Request message for UploadAsset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.UploadAssetRequest}
 */
public final class UploadAssetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.UploadAssetRequest)
    UploadAssetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UploadAssetRequest.newBuilder() to construct.
  private UploadAssetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UploadAssetRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UploadAssetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_UploadAssetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_UploadAssetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.UploadAssetRequest.class,
            com.google.cloud.visionai.v1.UploadAssetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the asset to upload.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
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
   * Required. The resource name of the asset to upload.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
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

  public static final int ASSET_SOURCE_FIELD_NUMBER = 2;
  private com.google.cloud.visionai.v1.AssetSource assetSource_;
  /**
   *
   *
   * <pre>
   * The source of the asset.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
   *
   * @return Whether the assetSource field is set.
   */
  @java.lang.Override
  public boolean hasAssetSource() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The source of the asset.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
   *
   * @return The assetSource.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.AssetSource getAssetSource() {
    return assetSource_ == null
        ? com.google.cloud.visionai.v1.AssetSource.getDefaultInstance()
        : assetSource_;
  }
  /**
   *
   *
   * <pre>
   * The source of the asset.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.AssetSourceOrBuilder getAssetSourceOrBuilder() {
    return assetSource_ == null
        ? com.google.cloud.visionai.v1.AssetSource.getDefaultInstance()
        : assetSource_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAssetSource());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAssetSource());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.UploadAssetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.UploadAssetRequest other =
        (com.google.cloud.visionai.v1.UploadAssetRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasAssetSource() != other.hasAssetSource()) return false;
    if (hasAssetSource()) {
      if (!getAssetSource().equals(other.getAssetSource())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasAssetSource()) {
      hash = (37 * hash) + ASSET_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getAssetSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.UploadAssetRequest prototype) {
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
   * Request message for UploadAsset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.UploadAssetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.UploadAssetRequest)
      com.google.cloud.visionai.v1.UploadAssetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UploadAssetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UploadAssetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.UploadAssetRequest.class,
              com.google.cloud.visionai.v1.UploadAssetRequest.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.UploadAssetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAssetSourceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      assetSource_ = null;
      if (assetSourceBuilder_ != null) {
        assetSourceBuilder_.dispose();
        assetSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UploadAssetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UploadAssetRequest getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.UploadAssetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UploadAssetRequest build() {
      com.google.cloud.visionai.v1.UploadAssetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UploadAssetRequest buildPartial() {
      com.google.cloud.visionai.v1.UploadAssetRequest result =
          new com.google.cloud.visionai.v1.UploadAssetRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.UploadAssetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assetSource_ =
            assetSourceBuilder_ == null ? assetSource_ : assetSourceBuilder_.build();
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
      if (other instanceof com.google.cloud.visionai.v1.UploadAssetRequest) {
        return mergeFrom((com.google.cloud.visionai.v1.UploadAssetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.UploadAssetRequest other) {
      if (other == com.google.cloud.visionai.v1.UploadAssetRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAssetSource()) {
        mergeAssetSource(other.getAssetSource());
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
            case 18:
              {
                input.readMessage(getAssetSourceFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the asset to upload.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
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
     * Required. The resource name of the asset to upload.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
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
     * Required. The resource name of the asset to upload.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
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
     * Required. The resource name of the asset to upload.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
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
     * Required. The resource name of the asset to upload.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
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

    private com.google.cloud.visionai.v1.AssetSource assetSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.AssetSource,
            com.google.cloud.visionai.v1.AssetSource.Builder,
            com.google.cloud.visionai.v1.AssetSourceOrBuilder>
        assetSourceBuilder_;
    /**
     *
     *
     * <pre>
     * The source of the asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
     *
     * @return Whether the assetSource field is set.
     */
    public boolean hasAssetSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The source of the asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
     *
     * @return The assetSource.
     */
    public com.google.cloud.visionai.v1.AssetSource getAssetSource() {
      if (assetSourceBuilder_ == null) {
        return assetSource_ == null
            ? com.google.cloud.visionai.v1.AssetSource.getDefaultInstance()
            : assetSource_;
      } else {
        return assetSourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The source of the asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
     */
    public Builder setAssetSource(com.google.cloud.visionai.v1.AssetSource value) {
      if (assetSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assetSource_ = value;
      } else {
        assetSourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source of the asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
     */
    public Builder setAssetSource(
        com.google.cloud.visionai.v1.AssetSource.Builder builderForValue) {
      if (assetSourceBuilder_ == null) {
        assetSource_ = builderForValue.build();
      } else {
        assetSourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source of the asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
     */
    public Builder mergeAssetSource(com.google.cloud.visionai.v1.AssetSource value) {
      if (assetSourceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && assetSource_ != null
            && assetSource_ != com.google.cloud.visionai.v1.AssetSource.getDefaultInstance()) {
          getAssetSourceBuilder().mergeFrom(value);
        } else {
          assetSource_ = value;
        }
      } else {
        assetSourceBuilder_.mergeFrom(value);
      }
      if (assetSource_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source of the asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
     */
    public Builder clearAssetSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      assetSource_ = null;
      if (assetSourceBuilder_ != null) {
        assetSourceBuilder_.dispose();
        assetSourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source of the asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
     */
    public com.google.cloud.visionai.v1.AssetSource.Builder getAssetSourceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAssetSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The source of the asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
     */
    public com.google.cloud.visionai.v1.AssetSourceOrBuilder getAssetSourceOrBuilder() {
      if (assetSourceBuilder_ != null) {
        return assetSourceBuilder_.getMessageOrBuilder();
      } else {
        return assetSource_ == null
            ? com.google.cloud.visionai.v1.AssetSource.getDefaultInstance()
            : assetSource_;
      }
    }
    /**
     *
     *
     * <pre>
     * The source of the asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.AssetSource asset_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.AssetSource,
            com.google.cloud.visionai.v1.AssetSource.Builder,
            com.google.cloud.visionai.v1.AssetSourceOrBuilder>
        getAssetSourceFieldBuilder() {
      if (assetSourceBuilder_ == null) {
        assetSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.AssetSource,
                com.google.cloud.visionai.v1.AssetSource.Builder,
                com.google.cloud.visionai.v1.AssetSourceOrBuilder>(
                getAssetSource(), getParentForChildren(), isClean());
        assetSource_ = null;
      }
      return assetSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.UploadAssetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.UploadAssetRequest)
  private static final com.google.cloud.visionai.v1.UploadAssetRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.UploadAssetRequest();
  }

  public static com.google.cloud.visionai.v1.UploadAssetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadAssetRequest> PARSER =
      new com.google.protobuf.AbstractParser<UploadAssetRequest>() {
        @java.lang.Override
        public UploadAssetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UploadAssetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadAssetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.UploadAssetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
