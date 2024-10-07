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
// source: google/cloud/vision/v1/product_search_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vision.v1;

/**
 *
 *
 * <pre>
 * Request message for the `UpdateProductSet` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.UpdateProductSetRequest}
 */
public final class UpdateProductSetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.UpdateProductSetRequest)
    UpdateProductSetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateProductSetRequest.newBuilder() to construct.
  private UpdateProductSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateProductSetRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateProductSetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1_UpdateProductSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1_UpdateProductSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.UpdateProductSetRequest.class,
            com.google.cloud.vision.v1.UpdateProductSetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCT_SET_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1.ProductSet productSet_;
  /**
   *
   *
   * <pre>
   * Required. The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the productSet field is set.
   */
  @java.lang.Override
  public boolean hasProductSet() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The productSet.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1.ProductSet getProductSet() {
    return productSet_ == null
        ? com.google.cloud.vision.v1.ProductSet.getDefaultInstance()
        : productSet_;
  }
  /**
   *
   *
   * <pre>
   * Required. The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1.ProductSetOrBuilder getProductSetOrBuilder() {
    return productSet_ == null
        ? com.google.cloud.vision.v1.ProductSet.getDefaultInstance()
        : productSet_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
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
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
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
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
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
      output.writeMessage(1, getProductSet());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getProductSet());
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
    if (!(obj instanceof com.google.cloud.vision.v1.UpdateProductSetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.UpdateProductSetRequest other =
        (com.google.cloud.vision.v1.UpdateProductSetRequest) obj;

    if (hasProductSet() != other.hasProductSet()) return false;
    if (hasProductSet()) {
      if (!getProductSet().equals(other.getProductSet())) return false;
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
    if (hasProductSet()) {
      hash = (37 * hash) + PRODUCT_SET_FIELD_NUMBER;
      hash = (53 * hash) + getProductSet().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1.UpdateProductSetRequest prototype) {
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
   * Request message for the `UpdateProductSet` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.UpdateProductSetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.UpdateProductSetRequest)
      com.google.cloud.vision.v1.UpdateProductSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1_UpdateProductSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1_UpdateProductSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.UpdateProductSetRequest.class,
              com.google.cloud.vision.v1.UpdateProductSetRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.UpdateProductSetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProductSetFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      productSet_ = null;
      if (productSetBuilder_ != null) {
        productSetBuilder_.dispose();
        productSetBuilder_ = null;
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
      return com.google.cloud.vision.v1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1_UpdateProductSetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.UpdateProductSetRequest getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.UpdateProductSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.UpdateProductSetRequest build() {
      com.google.cloud.vision.v1.UpdateProductSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.UpdateProductSetRequest buildPartial() {
      com.google.cloud.vision.v1.UpdateProductSetRequest result =
          new com.google.cloud.vision.v1.UpdateProductSetRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1.UpdateProductSetRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.productSet_ = productSetBuilder_ == null ? productSet_ : productSetBuilder_.build();
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
      if (other instanceof com.google.cloud.vision.v1.UpdateProductSetRequest) {
        return mergeFrom((com.google.cloud.vision.v1.UpdateProductSetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.UpdateProductSetRequest other) {
      if (other == com.google.cloud.vision.v1.UpdateProductSetRequest.getDefaultInstance())
        return this;
      if (other.hasProductSet()) {
        mergeProductSet(other.getProductSet());
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
                input.readMessage(getProductSetFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.vision.v1.ProductSet productSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.ProductSet,
            com.google.cloud.vision.v1.ProductSet.Builder,
            com.google.cloud.vision.v1.ProductSetOrBuilder>
        productSetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the productSet field is set.
     */
    public boolean hasProductSet() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The productSet.
     */
    public com.google.cloud.vision.v1.ProductSet getProductSet() {
      if (productSetBuilder_ == null) {
        return productSet_ == null
            ? com.google.cloud.vision.v1.ProductSet.getDefaultInstance()
            : productSet_;
      } else {
        return productSetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProductSet(com.google.cloud.vision.v1.ProductSet value) {
      if (productSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productSet_ = value;
      } else {
        productSetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProductSet(com.google.cloud.vision.v1.ProductSet.Builder builderForValue) {
      if (productSetBuilder_ == null) {
        productSet_ = builderForValue.build();
      } else {
        productSetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeProductSet(com.google.cloud.vision.v1.ProductSet value) {
      if (productSetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && productSet_ != null
            && productSet_ != com.google.cloud.vision.v1.ProductSet.getDefaultInstance()) {
          getProductSetBuilder().mergeFrom(value);
        } else {
          productSet_ = value;
        }
      } else {
        productSetBuilder_.mergeFrom(value);
      }
      if (productSet_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearProductSet() {
      bitField0_ = (bitField0_ & ~0x00000001);
      productSet_ = null;
      if (productSetBuilder_ != null) {
        productSetBuilder_.dispose();
        productSetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1.ProductSet.Builder getProductSetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProductSetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1.ProductSetOrBuilder getProductSetOrBuilder() {
      if (productSetBuilder_ != null) {
        return productSetBuilder_.getMessageOrBuilder();
      } else {
        return productSet_ == null
            ? com.google.cloud.vision.v1.ProductSet.getDefaultInstance()
            : productSet_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet resource which replaces the one on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.ProductSet,
            com.google.cloud.vision.v1.ProductSet.Builder,
            com.google.cloud.vision.v1.ProductSetOrBuilder>
        getProductSetFieldBuilder() {
      if (productSetBuilder_ == null) {
        productSetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1.ProductSet,
                com.google.cloud.vision.v1.ProductSet.Builder,
                com.google.cloud.vision.v1.ProductSetOrBuilder>(
                getProductSet(), getParentForChildren(), isClean());
        productSet_ = null;
      }
      return productSetBuilder_;
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
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
     * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
     * update.
     * If update_mask isn't specified, all mutable fields are to be updated.
     * Valid mask path is `display_name`.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.UpdateProductSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.UpdateProductSetRequest)
  private static final com.google.cloud.vision.v1.UpdateProductSetRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.UpdateProductSetRequest();
  }

  public static com.google.cloud.vision.v1.UpdateProductSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateProductSetRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateProductSetRequest>() {
        @java.lang.Override
        public UpdateProductSetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateProductSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateProductSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.UpdateProductSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
