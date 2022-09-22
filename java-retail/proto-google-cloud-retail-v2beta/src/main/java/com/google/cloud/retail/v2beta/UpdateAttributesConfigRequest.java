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
// source: google/cloud/retail/v2beta/catalog_service.proto

package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * Request for
 * [CatalogService.UpdateAttributesConfig][google.cloud.retail.v2beta.CatalogService.UpdateAttributesConfig]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.UpdateAttributesConfigRequest}
 */
public final class UpdateAttributesConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.UpdateAttributesConfigRequest)
    UpdateAttributesConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateAttributesConfigRequest.newBuilder() to construct.
  private UpdateAttributesConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateAttributesConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateAttributesConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateAttributesConfigRequest(
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
              com.google.cloud.retail.v2beta.AttributesConfig.Builder subBuilder = null;
              if (attributesConfig_ != null) {
                subBuilder = attributesConfig_.toBuilder();
              }
              attributesConfig_ =
                  input.readMessage(
                      com.google.cloud.retail.v2beta.AttributesConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(attributesConfig_);
                attributesConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.retail.v2beta.CatalogServiceProto
        .internal_static_google_cloud_retail_v2beta_UpdateAttributesConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.CatalogServiceProto
        .internal_static_google_cloud_retail_v2beta_UpdateAttributesConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest.class,
            com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest.Builder.class);
  }

  public static final int ATTRIBUTES_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.retail.v2beta.AttributesConfig attributesConfig_;
  /**
   *
   *
   * <pre>
   * Required. The
   * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the attributesConfig field is set.
   */
  @java.lang.Override
  public boolean hasAttributesConfig() {
    return attributesConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The
   * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The attributesConfig.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.AttributesConfig getAttributesConfig() {
    return attributesConfig_ == null
        ? com.google.cloud.retail.v2beta.AttributesConfig.getDefaultInstance()
        : attributesConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The
   * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.AttributesConfigOrBuilder getAttributesConfigOrBuilder() {
    return getAttributesConfig();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
   * The following is the only supported field:
   * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
   * The following is the only supported field:
   * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
   * If not set, all supported fields are updated.
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
   * Indicates which fields in the provided
   * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
   * The following is the only supported field:
   * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (attributesConfig_ != null) {
      output.writeMessage(1, getAttributesConfig());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attributesConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAttributesConfig());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest other =
        (com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest) obj;

    if (hasAttributesConfig() != other.hasAttributesConfig()) return false;
    if (hasAttributesConfig()) {
      if (!getAttributesConfig().equals(other.getAttributesConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasAttributesConfig()) {
      hash = (37 * hash) + ATTRIBUTES_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getAttributesConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parseFrom(
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
      com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest prototype) {
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
   * Request for
   * [CatalogService.UpdateAttributesConfig][google.cloud.retail.v2beta.CatalogService.UpdateAttributesConfig]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.UpdateAttributesConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.UpdateAttributesConfigRequest)
      com.google.cloud.retail.v2beta.UpdateAttributesConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2beta.CatalogServiceProto
          .internal_static_google_cloud_retail_v2beta_UpdateAttributesConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.CatalogServiceProto
          .internal_static_google_cloud_retail_v2beta_UpdateAttributesConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest.class,
              com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest.newBuilder()
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
      if (attributesConfigBuilder_ == null) {
        attributesConfig_ = null;
      } else {
        attributesConfig_ = null;
        attributesConfigBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2beta.CatalogServiceProto
          .internal_static_google_cloud_retail_v2beta_UpdateAttributesConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest build() {
      com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest buildPartial() {
      com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest result =
          new com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest(this);
      if (attributesConfigBuilder_ == null) {
        result.attributesConfig_ = attributesConfig_;
      } else {
        result.attributesConfig_ = attributesConfigBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest) {
        return mergeFrom((com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest other) {
      if (other
          == com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest.getDefaultInstance())
        return this;
      if (other.hasAttributesConfig()) {
        mergeAttributesConfig(other.getAttributesConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.retail.v2beta.AttributesConfig attributesConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.AttributesConfig,
            com.google.cloud.retail.v2beta.AttributesConfig.Builder,
            com.google.cloud.retail.v2beta.AttributesConfigOrBuilder>
        attributesConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the attributesConfig field is set.
     */
    public boolean hasAttributesConfig() {
      return attributesConfigBuilder_ != null || attributesConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The attributesConfig.
     */
    public com.google.cloud.retail.v2beta.AttributesConfig getAttributesConfig() {
      if (attributesConfigBuilder_ == null) {
        return attributesConfig_ == null
            ? com.google.cloud.retail.v2beta.AttributesConfig.getDefaultInstance()
            : attributesConfig_;
      } else {
        return attributesConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAttributesConfig(com.google.cloud.retail.v2beta.AttributesConfig value) {
      if (attributesConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attributesConfig_ = value;
        onChanged();
      } else {
        attributesConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAttributesConfig(
        com.google.cloud.retail.v2beta.AttributesConfig.Builder builderForValue) {
      if (attributesConfigBuilder_ == null) {
        attributesConfig_ = builderForValue.build();
        onChanged();
      } else {
        attributesConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAttributesConfig(com.google.cloud.retail.v2beta.AttributesConfig value) {
      if (attributesConfigBuilder_ == null) {
        if (attributesConfig_ != null) {
          attributesConfig_ =
              com.google.cloud.retail.v2beta.AttributesConfig.newBuilder(attributesConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          attributesConfig_ = value;
        }
        onChanged();
      } else {
        attributesConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAttributesConfig() {
      if (attributesConfigBuilder_ == null) {
        attributesConfig_ = null;
        onChanged();
      } else {
        attributesConfig_ = null;
        attributesConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2beta.AttributesConfig.Builder getAttributesConfigBuilder() {

      onChanged();
      return getAttributesConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2beta.AttributesConfigOrBuilder getAttributesConfigOrBuilder() {
      if (attributesConfigBuilder_ != null) {
        return attributesConfigBuilder_.getMessageOrBuilder();
      } else {
        return attributesConfig_ == null
            ? com.google.cloud.retail.v2beta.AttributesConfig.getDefaultInstance()
            : attributesConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2beta.AttributesConfig attributes_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.AttributesConfig,
            com.google.cloud.retail.v2beta.AttributesConfig.Builder,
            com.google.cloud.retail.v2beta.AttributesConfigOrBuilder>
        getAttributesConfigFieldBuilder() {
      if (attributesConfigBuilder_ == null) {
        attributesConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.retail.v2beta.AttributesConfig,
                com.google.cloud.retail.v2beta.AttributesConfig.Builder,
                com.google.cloud.retail.v2beta.AttributesConfigOrBuilder>(
                getAttributesConfig(), getParentForChildren(), isClean());
        attributesConfig_ = null;
      }
      return attributesConfigBuilder_;
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
     * Indicates which fields in the provided
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * The following is the only supported field:
     * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * The following is the only supported field:
     * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
     * If not set, all supported fields are updated.
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
     * Indicates which fields in the provided
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * The following is the only supported field:
     * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
     * If not set, all supported fields are updated.
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
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * The following is the only supported field:
     * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * The following is the only supported field:
     * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * The following is the only supported field:
     * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * The following is the only supported field:
     * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * The following is the only supported field:
     * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
     * If not set, all supported fields are updated.
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
     * Indicates which fields in the provided
     * [AttributesConfig][google.cloud.retail.v2beta.AttributesConfig] to update.
     * The following is the only supported field:
     * * [AttributesConfig.catalog_attributes][google.cloud.retail.v2beta.AttributesConfig.catalog_attributes]
     * If not set, all supported fields are updated.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.UpdateAttributesConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.UpdateAttributesConfigRequest)
  private static final com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest();
  }

  public static com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAttributesConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateAttributesConfigRequest>() {
        @java.lang.Override
        public UpdateAttributesConfigRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateAttributesConfigRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateAttributesConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAttributesConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.UpdateAttributesConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
