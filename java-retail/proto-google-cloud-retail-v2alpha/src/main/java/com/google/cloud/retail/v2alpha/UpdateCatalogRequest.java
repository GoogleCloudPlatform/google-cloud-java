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
// source: google/cloud/retail/v2alpha/catalog_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * Request for
 * [CatalogService.UpdateCatalog][google.cloud.retail.v2alpha.CatalogService.UpdateCatalog]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.UpdateCatalogRequest}
 */
public final class UpdateCatalogRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.UpdateCatalogRequest)
    UpdateCatalogRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateCatalogRequest.newBuilder() to construct.
  private UpdateCatalogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateCatalogRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateCatalogRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2alpha.CatalogServiceProto
        .internal_static_google_cloud_retail_v2alpha_UpdateCatalogRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.CatalogServiceProto
        .internal_static_google_cloud_retail_v2alpha_UpdateCatalogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.UpdateCatalogRequest.class,
            com.google.cloud.retail.v2alpha.UpdateCatalogRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CATALOG_FIELD_NUMBER = 1;
  private com.google.cloud.retail.v2alpha.Catalog catalog_;
  /**
   *
   *
   * <pre>
   * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
   *
   * If the caller does not have permission to update the
   * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
   * exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the catalog field is set.
   */
  @java.lang.Override
  public boolean hasCatalog() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
   *
   * If the caller does not have permission to update the
   * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
   * exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The catalog.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.Catalog getCatalog() {
    return catalog_ == null
        ? com.google.cloud.retail.v2alpha.Catalog.getDefaultInstance()
        : catalog_;
  }
  /**
   *
   *
   * <pre>
   * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
   *
   * If the caller does not have permission to update the
   * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
   * exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.CatalogOrBuilder getCatalogOrBuilder() {
    return catalog_ == null
        ? com.google.cloud.retail.v2alpha.Catalog.getDefaultInstance()
        : catalog_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
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
   * Indicates which fields in the provided
   * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
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
   * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
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
      output.writeMessage(1, getCatalog());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCatalog());
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
    if (!(obj instanceof com.google.cloud.retail.v2alpha.UpdateCatalogRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.UpdateCatalogRequest other =
        (com.google.cloud.retail.v2alpha.UpdateCatalogRequest) obj;

    if (hasCatalog() != other.hasCatalog()) return false;
    if (hasCatalog()) {
      if (!getCatalog().equals(other.getCatalog())) return false;
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
    if (hasCatalog()) {
      hash = (37 * hash) + CATALOG_FIELD_NUMBER;
      hash = (53 * hash) + getCatalog().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2alpha.UpdateCatalogRequest prototype) {
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
   * [CatalogService.UpdateCatalog][google.cloud.retail.v2alpha.CatalogService.UpdateCatalog]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.UpdateCatalogRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.UpdateCatalogRequest)
      com.google.cloud.retail.v2alpha.UpdateCatalogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2alpha.CatalogServiceProto
          .internal_static_google_cloud_retail_v2alpha_UpdateCatalogRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.CatalogServiceProto
          .internal_static_google_cloud_retail_v2alpha_UpdateCatalogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.UpdateCatalogRequest.class,
              com.google.cloud.retail.v2alpha.UpdateCatalogRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2alpha.UpdateCatalogRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCatalogFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      catalog_ = null;
      if (catalogBuilder_ != null) {
        catalogBuilder_.dispose();
        catalogBuilder_ = null;
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
      return com.google.cloud.retail.v2alpha.CatalogServiceProto
          .internal_static_google_cloud_retail_v2alpha_UpdateCatalogRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.UpdateCatalogRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.UpdateCatalogRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.UpdateCatalogRequest build() {
      com.google.cloud.retail.v2alpha.UpdateCatalogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.UpdateCatalogRequest buildPartial() {
      com.google.cloud.retail.v2alpha.UpdateCatalogRequest result =
          new com.google.cloud.retail.v2alpha.UpdateCatalogRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2alpha.UpdateCatalogRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.catalog_ = catalogBuilder_ == null ? catalog_ : catalogBuilder_.build();
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
      if (other instanceof com.google.cloud.retail.v2alpha.UpdateCatalogRequest) {
        return mergeFrom((com.google.cloud.retail.v2alpha.UpdateCatalogRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2alpha.UpdateCatalogRequest other) {
      if (other == com.google.cloud.retail.v2alpha.UpdateCatalogRequest.getDefaultInstance())
        return this;
      if (other.hasCatalog()) {
        mergeCatalog(other.getCatalog());
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
                input.readMessage(getCatalogFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.retail.v2alpha.Catalog catalog_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2alpha.Catalog,
            com.google.cloud.retail.v2alpha.Catalog.Builder,
            com.google.cloud.retail.v2alpha.CatalogOrBuilder>
        catalogBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If the caller does not have permission to update the
     * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the catalog field is set.
     */
    public boolean hasCatalog() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If the caller does not have permission to update the
     * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The catalog.
     */
    public com.google.cloud.retail.v2alpha.Catalog getCatalog() {
      if (catalogBuilder_ == null) {
        return catalog_ == null
            ? com.google.cloud.retail.v2alpha.Catalog.getDefaultInstance()
            : catalog_;
      } else {
        return catalogBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If the caller does not have permission to update the
     * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCatalog(com.google.cloud.retail.v2alpha.Catalog value) {
      if (catalogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        catalog_ = value;
      } else {
        catalogBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If the caller does not have permission to update the
     * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCatalog(com.google.cloud.retail.v2alpha.Catalog.Builder builderForValue) {
      if (catalogBuilder_ == null) {
        catalog_ = builderForValue.build();
      } else {
        catalogBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If the caller does not have permission to update the
     * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCatalog(com.google.cloud.retail.v2alpha.Catalog value) {
      if (catalogBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && catalog_ != null
            && catalog_ != com.google.cloud.retail.v2alpha.Catalog.getDefaultInstance()) {
          getCatalogBuilder().mergeFrom(value);
        } else {
          catalog_ = value;
        }
      } else {
        catalogBuilder_.mergeFrom(value);
      }
      if (catalog_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If the caller does not have permission to update the
     * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCatalog() {
      bitField0_ = (bitField0_ & ~0x00000001);
      catalog_ = null;
      if (catalogBuilder_ != null) {
        catalogBuilder_.dispose();
        catalogBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If the caller does not have permission to update the
     * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2alpha.Catalog.Builder getCatalogBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCatalogFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If the caller does not have permission to update the
     * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2alpha.CatalogOrBuilder getCatalogOrBuilder() {
      if (catalogBuilder_ != null) {
        return catalogBuilder_.getMessageOrBuilder();
      } else {
        return catalog_ == null
            ? com.google.cloud.retail.v2alpha.Catalog.getDefaultInstance()
            : catalog_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If the caller does not have permission to update the
     * [Catalog][google.cloud.retail.v2alpha.Catalog], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Catalog][google.cloud.retail.v2alpha.Catalog] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2alpha.Catalog,
            com.google.cloud.retail.v2alpha.Catalog.Builder,
            com.google.cloud.retail.v2alpha.CatalogOrBuilder>
        getCatalogFieldBuilder() {
      if (catalogBuilder_ == null) {
        catalogBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.retail.v2alpha.Catalog,
                com.google.cloud.retail.v2alpha.Catalog.Builder,
                com.google.cloud.retail.v2alpha.CatalogOrBuilder>(
                getCatalog(), getParentForChildren(), isClean());
        catalog_ = null;
      }
      return catalogBuilder_;
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
     * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
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
     * Indicates which fields in the provided
     * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
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
     * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
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
     * Indicates which fields in the provided
     * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
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
     * Indicates which fields in the provided
     * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
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
     * Indicates which fields in the provided
     * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
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
     * Indicates which fields in the provided
     * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
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
     * Indicates which fields in the provided
     * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
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
     * [Catalog][google.cloud.retail.v2alpha.Catalog] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.UpdateCatalogRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.UpdateCatalogRequest)
  private static final com.google.cloud.retail.v2alpha.UpdateCatalogRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.UpdateCatalogRequest();
  }

  public static com.google.cloud.retail.v2alpha.UpdateCatalogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCatalogRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateCatalogRequest>() {
        @java.lang.Override
        public UpdateCatalogRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateCatalogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCatalogRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.UpdateCatalogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
