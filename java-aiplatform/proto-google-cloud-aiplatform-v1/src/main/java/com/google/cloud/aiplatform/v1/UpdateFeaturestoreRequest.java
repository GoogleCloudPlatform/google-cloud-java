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
// source: google/cloud/aiplatform/v1/featurestore_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for [FeaturestoreService.UpdateFeaturestore][google.cloud.aiplatform.v1.FeaturestoreService.UpdateFeaturestore].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.UpdateFeaturestoreRequest}
 */
public final class UpdateFeaturestoreRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.UpdateFeaturestoreRequest)
    UpdateFeaturestoreRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateFeaturestoreRequest.newBuilder() to construct.
  private UpdateFeaturestoreRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateFeaturestoreRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateFeaturestoreRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_UpdateFeaturestoreRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_UpdateFeaturestoreRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest.class,
            com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest.Builder.class);
  }

  public static final int FEATURESTORE_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.Featurestore featurestore_;
  /**
   *
   *
   * <pre>
   * Required. The Featurestore's `name` field is used to identify the Featurestore to be
   * updated.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the featurestore field is set.
   */
  @java.lang.Override
  public boolean hasFeaturestore() {
    return featurestore_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Featurestore's `name` field is used to identify the Featurestore to be
   * updated.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The featurestore.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Featurestore getFeaturestore() {
    return featurestore_ == null
        ? com.google.cloud.aiplatform.v1.Featurestore.getDefaultInstance()
        : featurestore_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Featurestore's `name` field is used to identify the Featurestore to be
   * updated.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder getFeaturestoreOrBuilder() {
    return getFeaturestore();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * Featurestore resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then only the non-empty fields present in the
   * request will be overwritten. Set the update_mask to `*` to override all
   * fields.
   * Updatable fields:
   *   * `labels`
   *   * `online_serving_config.fixed_node_count`
   *   * `online_serving_config.scaling`
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
   * Field mask is used to specify the fields to be overwritten in the
   * Featurestore resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then only the non-empty fields present in the
   * request will be overwritten. Set the update_mask to `*` to override all
   * fields.
   * Updatable fields:
   *   * `labels`
   *   * `online_serving_config.fixed_node_count`
   *   * `online_serving_config.scaling`
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
   * Field mask is used to specify the fields to be overwritten in the
   * Featurestore resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then only the non-empty fields present in the
   * request will be overwritten. Set the update_mask to `*` to override all
   * fields.
   * Updatable fields:
   *   * `labels`
   *   * `online_serving_config.fixed_node_count`
   *   * `online_serving_config.scaling`
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
    if (featurestore_ != null) {
      output.writeMessage(1, getFeaturestore());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (featurestore_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getFeaturestore());
    }
    if (updateMask_ != null) {
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest other =
        (com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest) obj;

    if (hasFeaturestore() != other.hasFeaturestore()) return false;
    if (hasFeaturestore()) {
      if (!getFeaturestore().equals(other.getFeaturestore())) return false;
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
    if (hasFeaturestore()) {
      hash = (37 * hash) + FEATURESTORE_FIELD_NUMBER;
      hash = (53 * hash) + getFeaturestore().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest parseFrom(
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
      com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest prototype) {
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
   * Request message for [FeaturestoreService.UpdateFeaturestore][google.cloud.aiplatform.v1.FeaturestoreService.UpdateFeaturestore].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.UpdateFeaturestoreRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.UpdateFeaturestoreRequest)
      com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateFeaturestoreRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateFeaturestoreRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest.class,
              com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (featurestoreBuilder_ == null) {
        featurestore_ = null;
      } else {
        featurestore_ = null;
        featurestoreBuilder_ = null;
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
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateFeaturestoreRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest build() {
      com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest buildPartial() {
      com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest result =
          new com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest(this);
      if (featurestoreBuilder_ == null) {
        result.featurestore_ = featurestore_;
      } else {
        result.featurestore_ = featurestoreBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest other) {
      if (other == com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest.getDefaultInstance())
        return this;
      if (other.hasFeaturestore()) {
        mergeFeaturestore(other.getFeaturestore());
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
                input.readMessage(getFeaturestoreFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.aiplatform.v1.Featurestore featurestore_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Featurestore,
            com.google.cloud.aiplatform.v1.Featurestore.Builder,
            com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder>
        featurestoreBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Featurestore's `name` field is used to identify the Featurestore to be
     * updated.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the featurestore field is set.
     */
    public boolean hasFeaturestore() {
      return featurestoreBuilder_ != null || featurestore_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The Featurestore's `name` field is used to identify the Featurestore to be
     * updated.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The featurestore.
     */
    public com.google.cloud.aiplatform.v1.Featurestore getFeaturestore() {
      if (featurestoreBuilder_ == null) {
        return featurestore_ == null
            ? com.google.cloud.aiplatform.v1.Featurestore.getDefaultInstance()
            : featurestore_;
      } else {
        return featurestoreBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Featurestore's `name` field is used to identify the Featurestore to be
     * updated.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFeaturestore(com.google.cloud.aiplatform.v1.Featurestore value) {
      if (featurestoreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featurestore_ = value;
        onChanged();
      } else {
        featurestoreBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Featurestore's `name` field is used to identify the Featurestore to be
     * updated.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFeaturestore(
        com.google.cloud.aiplatform.v1.Featurestore.Builder builderForValue) {
      if (featurestoreBuilder_ == null) {
        featurestore_ = builderForValue.build();
        onChanged();
      } else {
        featurestoreBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Featurestore's `name` field is used to identify the Featurestore to be
     * updated.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeFeaturestore(com.google.cloud.aiplatform.v1.Featurestore value) {
      if (featurestoreBuilder_ == null) {
        if (featurestore_ != null) {
          featurestore_ =
              com.google.cloud.aiplatform.v1.Featurestore.newBuilder(featurestore_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          featurestore_ = value;
        }
        onChanged();
      } else {
        featurestoreBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Featurestore's `name` field is used to identify the Featurestore to be
     * updated.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearFeaturestore() {
      if (featurestoreBuilder_ == null) {
        featurestore_ = null;
        onChanged();
      } else {
        featurestore_ = null;
        featurestoreBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Featurestore's `name` field is used to identify the Featurestore to be
     * updated.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.Featurestore.Builder getFeaturestoreBuilder() {

      onChanged();
      return getFeaturestoreFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Featurestore's `name` field is used to identify the Featurestore to be
     * updated.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder getFeaturestoreOrBuilder() {
      if (featurestoreBuilder_ != null) {
        return featurestoreBuilder_.getMessageOrBuilder();
      } else {
        return featurestore_ == null
            ? com.google.cloud.aiplatform.v1.Featurestore.getDefaultInstance()
            : featurestore_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Featurestore's `name` field is used to identify the Featurestore to be
     * updated.
     * Format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Featurestore featurestore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Featurestore,
            com.google.cloud.aiplatform.v1.Featurestore.Builder,
            com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder>
        getFeaturestoreFieldBuilder() {
      if (featurestoreBuilder_ == null) {
        featurestoreBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Featurestore,
                com.google.cloud.aiplatform.v1.Featurestore.Builder,
                com.google.cloud.aiplatform.v1.FeaturestoreOrBuilder>(
                getFeaturestore(), getParentForChildren(), isClean());
        featurestore_ = null;
      }
      return featurestoreBuilder_;
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
     * Field mask is used to specify the fields to be overwritten in the
     * Featurestore resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then only the non-empty fields present in the
     * request will be overwritten. Set the update_mask to `*` to override all
     * fields.
     * Updatable fields:
     *   * `labels`
     *   * `online_serving_config.fixed_node_count`
     *   * `online_serving_config.scaling`
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
     * Field mask is used to specify the fields to be overwritten in the
     * Featurestore resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then only the non-empty fields present in the
     * request will be overwritten. Set the update_mask to `*` to override all
     * fields.
     * Updatable fields:
     *   * `labels`
     *   * `online_serving_config.fixed_node_count`
     *   * `online_serving_config.scaling`
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
     * Field mask is used to specify the fields to be overwritten in the
     * Featurestore resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then only the non-empty fields present in the
     * request will be overwritten. Set the update_mask to `*` to override all
     * fields.
     * Updatable fields:
     *   * `labels`
     *   * `online_serving_config.fixed_node_count`
     *   * `online_serving_config.scaling`
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
     * Field mask is used to specify the fields to be overwritten in the
     * Featurestore resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then only the non-empty fields present in the
     * request will be overwritten. Set the update_mask to `*` to override all
     * fields.
     * Updatable fields:
     *   * `labels`
     *   * `online_serving_config.fixed_node_count`
     *   * `online_serving_config.scaling`
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
     * Field mask is used to specify the fields to be overwritten in the
     * Featurestore resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then only the non-empty fields present in the
     * request will be overwritten. Set the update_mask to `*` to override all
     * fields.
     * Updatable fields:
     *   * `labels`
     *   * `online_serving_config.fixed_node_count`
     *   * `online_serving_config.scaling`
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
     * Field mask is used to specify the fields to be overwritten in the
     * Featurestore resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then only the non-empty fields present in the
     * request will be overwritten. Set the update_mask to `*` to override all
     * fields.
     * Updatable fields:
     *   * `labels`
     *   * `online_serving_config.fixed_node_count`
     *   * `online_serving_config.scaling`
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
     * Field mask is used to specify the fields to be overwritten in the
     * Featurestore resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then only the non-empty fields present in the
     * request will be overwritten. Set the update_mask to `*` to override all
     * fields.
     * Updatable fields:
     *   * `labels`
     *   * `online_serving_config.fixed_node_count`
     *   * `online_serving_config.scaling`
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
     * Field mask is used to specify the fields to be overwritten in the
     * Featurestore resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then only the non-empty fields present in the
     * request will be overwritten. Set the update_mask to `*` to override all
     * fields.
     * Updatable fields:
     *   * `labels`
     *   * `online_serving_config.fixed_node_count`
     *   * `online_serving_config.scaling`
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
     * Field mask is used to specify the fields to be overwritten in the
     * Featurestore resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then only the non-empty fields present in the
     * request will be overwritten. Set the update_mask to `*` to override all
     * fields.
     * Updatable fields:
     *   * `labels`
     *   * `online_serving_config.fixed_node_count`
     *   * `online_serving_config.scaling`
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.UpdateFeaturestoreRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.UpdateFeaturestoreRequest)
  private static final com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest();
  }

  public static com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFeaturestoreRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateFeaturestoreRequest>() {
        @java.lang.Override
        public UpdateFeaturestoreRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateFeaturestoreRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFeaturestoreRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
