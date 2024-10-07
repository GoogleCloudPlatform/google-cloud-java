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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Response message for QueryEligibleBillingAccounts.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.QueryEligibleBillingAccountsResponse}
 */
public final class QueryEligibleBillingAccountsResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.QueryEligibleBillingAccountsResponse)
    QueryEligibleBillingAccountsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QueryEligibleBillingAccountsResponse.newBuilder() to construct.
  private QueryEligibleBillingAccountsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueryEligibleBillingAccountsResponse() {
    skuPurchaseGroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QueryEligibleBillingAccountsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_QueryEligibleBillingAccountsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_QueryEligibleBillingAccountsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse.class,
            com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse.Builder.class);
  }

  public static final int SKU_PURCHASE_GROUPS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.channel.v1.SkuPurchaseGroup> skuPurchaseGroups_;
  /**
   *
   *
   * <pre>
   * List of SKU purchase groups where each group represents a set of SKUs that
   * must be purchased using the same billing account. Each SKU from
   * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
   * group.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.SkuPurchaseGroup> getSkuPurchaseGroupsList() {
    return skuPurchaseGroups_;
  }
  /**
   *
   *
   * <pre>
   * List of SKU purchase groups where each group represents a set of SKUs that
   * must be purchased using the same billing account. Each SKU from
   * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
   * group.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.SkuPurchaseGroupOrBuilder>
      getSkuPurchaseGroupsOrBuilderList() {
    return skuPurchaseGroups_;
  }
  /**
   *
   *
   * <pre>
   * List of SKU purchase groups where each group represents a set of SKUs that
   * must be purchased using the same billing account. Each SKU from
   * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
   * group.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
   */
  @java.lang.Override
  public int getSkuPurchaseGroupsCount() {
    return skuPurchaseGroups_.size();
  }
  /**
   *
   *
   * <pre>
   * List of SKU purchase groups where each group represents a set of SKUs that
   * must be purchased using the same billing account. Each SKU from
   * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
   * group.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.SkuPurchaseGroup getSkuPurchaseGroups(int index) {
    return skuPurchaseGroups_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of SKU purchase groups where each group represents a set of SKUs that
   * must be purchased using the same billing account. Each SKU from
   * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
   * group.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.SkuPurchaseGroupOrBuilder getSkuPurchaseGroupsOrBuilder(
      int index) {
    return skuPurchaseGroups_.get(index);
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
    for (int i = 0; i < skuPurchaseGroups_.size(); i++) {
      output.writeMessage(1, skuPurchaseGroups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < skuPurchaseGroups_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, skuPurchaseGroups_.get(i));
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
    if (!(obj instanceof com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse other =
        (com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse) obj;

    if (!getSkuPurchaseGroupsList().equals(other.getSkuPurchaseGroupsList())) return false;
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
    if (getSkuPurchaseGroupsCount() > 0) {
      hash = (37 * hash) + SKU_PURCHASE_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getSkuPurchaseGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse parseFrom(
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
      com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse prototype) {
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
   * Response message for QueryEligibleBillingAccounts.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.QueryEligibleBillingAccountsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.QueryEligibleBillingAccountsResponse)
      com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_QueryEligibleBillingAccountsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_QueryEligibleBillingAccountsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse.class,
              com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (skuPurchaseGroupsBuilder_ == null) {
        skuPurchaseGroups_ = java.util.Collections.emptyList();
      } else {
        skuPurchaseGroups_ = null;
        skuPurchaseGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_QueryEligibleBillingAccountsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse build() {
      com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse buildPartial() {
      com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse result =
          new com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse result) {
      if (skuPurchaseGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          skuPurchaseGroups_ = java.util.Collections.unmodifiableList(skuPurchaseGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skuPurchaseGroups_ = skuPurchaseGroups_;
      } else {
        result.skuPurchaseGroups_ = skuPurchaseGroupsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse) {
        return mergeFrom((com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse other) {
      if (other
          == com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse.getDefaultInstance())
        return this;
      if (skuPurchaseGroupsBuilder_ == null) {
        if (!other.skuPurchaseGroups_.isEmpty()) {
          if (skuPurchaseGroups_.isEmpty()) {
            skuPurchaseGroups_ = other.skuPurchaseGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkuPurchaseGroupsIsMutable();
            skuPurchaseGroups_.addAll(other.skuPurchaseGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.skuPurchaseGroups_.isEmpty()) {
          if (skuPurchaseGroupsBuilder_.isEmpty()) {
            skuPurchaseGroupsBuilder_.dispose();
            skuPurchaseGroupsBuilder_ = null;
            skuPurchaseGroups_ = other.skuPurchaseGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            skuPurchaseGroupsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSkuPurchaseGroupsFieldBuilder()
                    : null;
          } else {
            skuPurchaseGroupsBuilder_.addAllMessages(other.skuPurchaseGroups_);
          }
        }
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
                com.google.cloud.channel.v1.SkuPurchaseGroup m =
                    input.readMessage(
                        com.google.cloud.channel.v1.SkuPurchaseGroup.parser(), extensionRegistry);
                if (skuPurchaseGroupsBuilder_ == null) {
                  ensureSkuPurchaseGroupsIsMutable();
                  skuPurchaseGroups_.add(m);
                } else {
                  skuPurchaseGroupsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.channel.v1.SkuPurchaseGroup> skuPurchaseGroups_ =
        java.util.Collections.emptyList();

    private void ensureSkuPurchaseGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        skuPurchaseGroups_ =
            new java.util.ArrayList<com.google.cloud.channel.v1.SkuPurchaseGroup>(
                skuPurchaseGroups_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.SkuPurchaseGroup,
            com.google.cloud.channel.v1.SkuPurchaseGroup.Builder,
            com.google.cloud.channel.v1.SkuPurchaseGroupOrBuilder>
        skuPurchaseGroupsBuilder_;

    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.SkuPurchaseGroup> getSkuPurchaseGroupsList() {
      if (skuPurchaseGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skuPurchaseGroups_);
      } else {
        return skuPurchaseGroupsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public int getSkuPurchaseGroupsCount() {
      if (skuPurchaseGroupsBuilder_ == null) {
        return skuPurchaseGroups_.size();
      } else {
        return skuPurchaseGroupsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuPurchaseGroup getSkuPurchaseGroups(int index) {
      if (skuPurchaseGroupsBuilder_ == null) {
        return skuPurchaseGroups_.get(index);
      } else {
        return skuPurchaseGroupsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public Builder setSkuPurchaseGroups(
        int index, com.google.cloud.channel.v1.SkuPurchaseGroup value) {
      if (skuPurchaseGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkuPurchaseGroupsIsMutable();
        skuPurchaseGroups_.set(index, value);
        onChanged();
      } else {
        skuPurchaseGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public Builder setSkuPurchaseGroups(
        int index, com.google.cloud.channel.v1.SkuPurchaseGroup.Builder builderForValue) {
      if (skuPurchaseGroupsBuilder_ == null) {
        ensureSkuPurchaseGroupsIsMutable();
        skuPurchaseGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        skuPurchaseGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public Builder addSkuPurchaseGroups(com.google.cloud.channel.v1.SkuPurchaseGroup value) {
      if (skuPurchaseGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkuPurchaseGroupsIsMutable();
        skuPurchaseGroups_.add(value);
        onChanged();
      } else {
        skuPurchaseGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public Builder addSkuPurchaseGroups(
        int index, com.google.cloud.channel.v1.SkuPurchaseGroup value) {
      if (skuPurchaseGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkuPurchaseGroupsIsMutable();
        skuPurchaseGroups_.add(index, value);
        onChanged();
      } else {
        skuPurchaseGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public Builder addSkuPurchaseGroups(
        com.google.cloud.channel.v1.SkuPurchaseGroup.Builder builderForValue) {
      if (skuPurchaseGroupsBuilder_ == null) {
        ensureSkuPurchaseGroupsIsMutable();
        skuPurchaseGroups_.add(builderForValue.build());
        onChanged();
      } else {
        skuPurchaseGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public Builder addSkuPurchaseGroups(
        int index, com.google.cloud.channel.v1.SkuPurchaseGroup.Builder builderForValue) {
      if (skuPurchaseGroupsBuilder_ == null) {
        ensureSkuPurchaseGroupsIsMutable();
        skuPurchaseGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        skuPurchaseGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public Builder addAllSkuPurchaseGroups(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.SkuPurchaseGroup> values) {
      if (skuPurchaseGroupsBuilder_ == null) {
        ensureSkuPurchaseGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, skuPurchaseGroups_);
        onChanged();
      } else {
        skuPurchaseGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public Builder clearSkuPurchaseGroups() {
      if (skuPurchaseGroupsBuilder_ == null) {
        skuPurchaseGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        skuPurchaseGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public Builder removeSkuPurchaseGroups(int index) {
      if (skuPurchaseGroupsBuilder_ == null) {
        ensureSkuPurchaseGroupsIsMutable();
        skuPurchaseGroups_.remove(index);
        onChanged();
      } else {
        skuPurchaseGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuPurchaseGroup.Builder getSkuPurchaseGroupsBuilder(
        int index) {
      return getSkuPurchaseGroupsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuPurchaseGroupOrBuilder getSkuPurchaseGroupsOrBuilder(
        int index) {
      if (skuPurchaseGroupsBuilder_ == null) {
        return skuPurchaseGroups_.get(index);
      } else {
        return skuPurchaseGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.SkuPurchaseGroupOrBuilder>
        getSkuPurchaseGroupsOrBuilderList() {
      if (skuPurchaseGroupsBuilder_ != null) {
        return skuPurchaseGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skuPurchaseGroups_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuPurchaseGroup.Builder addSkuPurchaseGroupsBuilder() {
      return getSkuPurchaseGroupsFieldBuilder()
          .addBuilder(com.google.cloud.channel.v1.SkuPurchaseGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuPurchaseGroup.Builder addSkuPurchaseGroupsBuilder(
        int index) {
      return getSkuPurchaseGroupsFieldBuilder()
          .addBuilder(index, com.google.cloud.channel.v1.SkuPurchaseGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of SKU purchase groups where each group represents a set of SKUs that
     * must be purchased using the same billing account. Each SKU from
     * [QueryEligibleBillingAccountsRequest.skus] will appear in exactly one SKU
     * group.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuPurchaseGroup sku_purchase_groups = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.SkuPurchaseGroup.Builder>
        getSkuPurchaseGroupsBuilderList() {
      return getSkuPurchaseGroupsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.SkuPurchaseGroup,
            com.google.cloud.channel.v1.SkuPurchaseGroup.Builder,
            com.google.cloud.channel.v1.SkuPurchaseGroupOrBuilder>
        getSkuPurchaseGroupsFieldBuilder() {
      if (skuPurchaseGroupsBuilder_ == null) {
        skuPurchaseGroupsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.channel.v1.SkuPurchaseGroup,
                com.google.cloud.channel.v1.SkuPurchaseGroup.Builder,
                com.google.cloud.channel.v1.SkuPurchaseGroupOrBuilder>(
                skuPurchaseGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        skuPurchaseGroups_ = null;
      }
      return skuPurchaseGroupsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.QueryEligibleBillingAccountsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.QueryEligibleBillingAccountsResponse)
  private static final com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse();
  }

  public static com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryEligibleBillingAccountsResponse> PARSER =
      new com.google.protobuf.AbstractParser<QueryEligibleBillingAccountsResponse>() {
        @java.lang.Override
        public QueryEligibleBillingAccountsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryEligibleBillingAccountsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryEligibleBillingAccountsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.QueryEligibleBillingAccountsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
