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
// source: google/cloud/retail/v2alpha/common.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * Fulfillment information, such as the store IDs for in-store pickup or region
 * IDs for different shipping methods.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.FulfillmentInfo}
 */
public final class FulfillmentInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.FulfillmentInfo)
    FulfillmentInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FulfillmentInfo.newBuilder() to construct.
  private FulfillmentInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FulfillmentInfo() {
    type_ = "";
    placeIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FulfillmentInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2alpha.CommonProto
        .internal_static_google_cloud_retail_v2alpha_FulfillmentInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.CommonProto
        .internal_static_google_cloud_retail_v2alpha_FulfillmentInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.FulfillmentInfo.class,
            com.google.cloud.retail.v2alpha.FulfillmentInfo.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   *
   *
   * <pre>
   * The fulfillment type, including commonly used types (such as pickup in
   * store and same day delivery), and custom types. Customers have to map
   * custom types to their display names before rendering UI.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The fulfillment type, including commonly used types (such as pickup in
   * store and same day delivery), and custom types. Customers have to map
   * custom types to their display names before rendering UI.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLACE_IDS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList placeIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
   * such as the store IDs for
   * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
   * or the region IDs for
   * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
   *
   * A maximum of 3000 values are allowed. Each value must be a string with a
   * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
   * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string place_ids = 2;</code>
   *
   * @return A list containing the placeIds.
   */
  public com.google.protobuf.ProtocolStringList getPlaceIdsList() {
    return placeIds_;
  }
  /**
   *
   *
   * <pre>
   * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
   * such as the store IDs for
   * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
   * or the region IDs for
   * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
   *
   * A maximum of 3000 values are allowed. Each value must be a string with a
   * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
   * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string place_ids = 2;</code>
   *
   * @return The count of placeIds.
   */
  public int getPlaceIdsCount() {
    return placeIds_.size();
  }
  /**
   *
   *
   * <pre>
   * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
   * such as the store IDs for
   * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
   * or the region IDs for
   * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
   *
   * A maximum of 3000 values are allowed. Each value must be a string with a
   * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
   * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string place_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The placeIds at the given index.
   */
  public java.lang.String getPlaceIds(int index) {
    return placeIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
   * such as the store IDs for
   * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
   * or the region IDs for
   * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
   *
   * A maximum of 3000 values are allowed. Each value must be a string with a
   * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
   * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string place_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the placeIds at the given index.
   */
  public com.google.protobuf.ByteString getPlaceIdsBytes(int index) {
    return placeIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    for (int i = 0; i < placeIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, placeIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < placeIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(placeIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPlaceIdsList().size();
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
    if (!(obj instanceof com.google.cloud.retail.v2alpha.FulfillmentInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.FulfillmentInfo other =
        (com.google.cloud.retail.v2alpha.FulfillmentInfo) obj;

    if (!getType().equals(other.getType())) return false;
    if (!getPlaceIdsList().equals(other.getPlaceIdsList())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (getPlaceIdsCount() > 0) {
      hash = (37 * hash) + PLACE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getPlaceIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2alpha.FulfillmentInfo prototype) {
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
   * Fulfillment information, such as the store IDs for in-store pickup or region
   * IDs for different shipping methods.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.FulfillmentInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.FulfillmentInfo)
      com.google.cloud.retail.v2alpha.FulfillmentInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2alpha.CommonProto
          .internal_static_google_cloud_retail_v2alpha_FulfillmentInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.CommonProto
          .internal_static_google_cloud_retail_v2alpha_FulfillmentInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.FulfillmentInfo.class,
              com.google.cloud.retail.v2alpha.FulfillmentInfo.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2alpha.FulfillmentInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = "";
      placeIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.CommonProto
          .internal_static_google_cloud_retail_v2alpha_FulfillmentInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.FulfillmentInfo getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.FulfillmentInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.FulfillmentInfo build() {
      com.google.cloud.retail.v2alpha.FulfillmentInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.FulfillmentInfo buildPartial() {
      com.google.cloud.retail.v2alpha.FulfillmentInfo result =
          new com.google.cloud.retail.v2alpha.FulfillmentInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2alpha.FulfillmentInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        placeIds_.makeImmutable();
        result.placeIds_ = placeIds_;
      }
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
      if (other instanceof com.google.cloud.retail.v2alpha.FulfillmentInfo) {
        return mergeFrom((com.google.cloud.retail.v2alpha.FulfillmentInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2alpha.FulfillmentInfo other) {
      if (other == com.google.cloud.retail.v2alpha.FulfillmentInfo.getDefaultInstance())
        return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.placeIds_.isEmpty()) {
        if (placeIds_.isEmpty()) {
          placeIds_ = other.placeIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensurePlaceIdsIsMutable();
          placeIds_.addAll(other.placeIds_);
        }
        onChanged();
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
                type_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensurePlaceIdsIsMutable();
                placeIds_.add(s);
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

    private java.lang.Object type_ = "";
    /**
     *
     *
     * <pre>
     * The fulfillment type, including commonly used types (such as pickup in
     * store and same day delivery), and custom types. Customers have to map
     * custom types to their display names before rendering UI.
     *
     * Supported values:
     *
     * * "pickup-in-store"
     * * "ship-to-store"
     * * "same-day-delivery"
     * * "next-day-delivery"
     * * "custom-type-1"
     * * "custom-type-2"
     * * "custom-type-3"
     * * "custom-type-4"
     * * "custom-type-5"
     *
     * If this field is set to an invalid value other than these, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The fulfillment type, including commonly used types (such as pickup in
     * store and same day delivery), and custom types. Customers have to map
     * custom types to their display names before rendering UI.
     *
     * Supported values:
     *
     * * "pickup-in-store"
     * * "ship-to-store"
     * * "same-day-delivery"
     * * "next-day-delivery"
     * * "custom-type-1"
     * * "custom-type-2"
     * * "custom-type-3"
     * * "custom-type-4"
     * * "custom-type-5"
     *
     * If this field is set to an invalid value other than these, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The fulfillment type, including commonly used types (such as pickup in
     * store and same day delivery), and custom types. Customers have to map
     * custom types to their display names before rendering UI.
     *
     * Supported values:
     *
     * * "pickup-in-store"
     * * "ship-to-store"
     * * "same-day-delivery"
     * * "next-day-delivery"
     * * "custom-type-1"
     * * "custom-type-2"
     * * "custom-type-3"
     * * "custom-type-4"
     * * "custom-type-5"
     *
     * If this field is set to an invalid value other than these, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The fulfillment type, including commonly used types (such as pickup in
     * store and same day delivery), and custom types. Customers have to map
     * custom types to their display names before rendering UI.
     *
     * Supported values:
     *
     * * "pickup-in-store"
     * * "ship-to-store"
     * * "same-day-delivery"
     * * "next-day-delivery"
     * * "custom-type-1"
     * * "custom-type-2"
     * * "custom-type-3"
     * * "custom-type-4"
     * * "custom-type-5"
     *
     * If this field is set to an invalid value other than these, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The fulfillment type, including commonly used types (such as pickup in
     * store and same day delivery), and custom types. Customers have to map
     * custom types to their display names before rendering UI.
     *
     * Supported values:
     *
     * * "pickup-in-store"
     * * "ship-to-store"
     * * "same-day-delivery"
     * * "next-day-delivery"
     * * "custom-type-1"
     * * "custom-type-2"
     * * "custom-type-3"
     * * "custom-type-4"
     * * "custom-type-5"
     *
     * If this field is set to an invalid value other than these, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string type = 1;</code>
     *
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList placeIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensurePlaceIdsIsMutable() {
      if (!placeIds_.isModifiable()) {
        placeIds_ = new com.google.protobuf.LazyStringArrayList(placeIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
     * such as the store IDs for
     * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
     * or the region IDs for
     * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
     *
     * A maximum of 3000 values are allowed. Each value must be a string with a
     * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
     * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>repeated string place_ids = 2;</code>
     *
     * @return A list containing the placeIds.
     */
    public com.google.protobuf.ProtocolStringList getPlaceIdsList() {
      placeIds_.makeImmutable();
      return placeIds_;
    }
    /**
     *
     *
     * <pre>
     * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
     * such as the store IDs for
     * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
     * or the region IDs for
     * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
     *
     * A maximum of 3000 values are allowed. Each value must be a string with a
     * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
     * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>repeated string place_ids = 2;</code>
     *
     * @return The count of placeIds.
     */
    public int getPlaceIdsCount() {
      return placeIds_.size();
    }
    /**
     *
     *
     * <pre>
     * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
     * such as the store IDs for
     * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
     * or the region IDs for
     * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
     *
     * A maximum of 3000 values are allowed. Each value must be a string with a
     * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
     * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>repeated string place_ids = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The placeIds at the given index.
     */
    public java.lang.String getPlaceIds(int index) {
      return placeIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
     * such as the store IDs for
     * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
     * or the region IDs for
     * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
     *
     * A maximum of 3000 values are allowed. Each value must be a string with a
     * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
     * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>repeated string place_ids = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the placeIds at the given index.
     */
    public com.google.protobuf.ByteString getPlaceIdsBytes(int index) {
      return placeIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
     * such as the store IDs for
     * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
     * or the region IDs for
     * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
     *
     * A maximum of 3000 values are allowed. Each value must be a string with a
     * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
     * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>repeated string place_ids = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The placeIds to set.
     * @return This builder for chaining.
     */
    public Builder setPlaceIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePlaceIdsIsMutable();
      placeIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
     * such as the store IDs for
     * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
     * or the region IDs for
     * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
     *
     * A maximum of 3000 values are allowed. Each value must be a string with a
     * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
     * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>repeated string place_ids = 2;</code>
     *
     * @param value The placeIds to add.
     * @return This builder for chaining.
     */
    public Builder addPlaceIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePlaceIdsIsMutable();
      placeIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
     * such as the store IDs for
     * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
     * or the region IDs for
     * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
     *
     * A maximum of 3000 values are allowed. Each value must be a string with a
     * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
     * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>repeated string place_ids = 2;</code>
     *
     * @param values The placeIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllPlaceIds(java.lang.Iterable<java.lang.String> values) {
      ensurePlaceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, placeIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
     * such as the store IDs for
     * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
     * or the region IDs for
     * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
     *
     * A maximum of 3000 values are allowed. Each value must be a string with a
     * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
     * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>repeated string place_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPlaceIds() {
      placeIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IDs for this [type][google.cloud.retail.v2alpha.FulfillmentInfo.type],
     * such as the store IDs for
     * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2alpha.FulfillmentInfo.type]
     * or the region IDs for
     * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2alpha.FulfillmentInfo.type].
     *
     * A maximum of 3000 values are allowed. Each value must be a string with a
     * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
     * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
     * returned.
     * </pre>
     *
     * <code>repeated string place_ids = 2;</code>
     *
     * @param value The bytes of the placeIds to add.
     * @return This builder for chaining.
     */
    public Builder addPlaceIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePlaceIdsIsMutable();
      placeIds_.add(value);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.FulfillmentInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.FulfillmentInfo)
  private static final com.google.cloud.retail.v2alpha.FulfillmentInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.FulfillmentInfo();
  }

  public static com.google.cloud.retail.v2alpha.FulfillmentInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FulfillmentInfo> PARSER =
      new com.google.protobuf.AbstractParser<FulfillmentInfo>() {
        @java.lang.Override
        public FulfillmentInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<FulfillmentInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FulfillmentInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.FulfillmentInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
