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
// source: google/cloud/channel/v1/repricing.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * A condition that applies the override if a line item SKU is found in the SKU
 * group.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.SkuGroupCondition}
 */
public final class SkuGroupCondition extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.SkuGroupCondition)
    SkuGroupConditionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SkuGroupCondition.newBuilder() to construct.
  private SkuGroupCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SkuGroupCondition() {
    skuGroup_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SkuGroupCondition();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.RepricingProto
        .internal_static_google_cloud_channel_v1_SkuGroupCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.RepricingProto
        .internal_static_google_cloud_channel_v1_SkuGroupCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.SkuGroupCondition.class,
            com.google.cloud.channel.v1.SkuGroupCondition.Builder.class);
  }

  public static final int SKU_GROUP_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object skuGroup_ = "";
  /**
   *
   *
   * <pre>
   * Specifies a SKU group (https://cloud.google.com/skus/sku-groups).
   * Resource name of SKU group. Format:
   * accounts/{account}/skuGroups/{sku_group}.
   * Example:
   * "accounts/C01234/skuGroups/3d50fd57-3157-4577-a5a9-a219b8490041".
   * </pre>
   *
   * <code>string sku_group = 1;</code>
   *
   * @return The skuGroup.
   */
  @java.lang.Override
  public java.lang.String getSkuGroup() {
    java.lang.Object ref = skuGroup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skuGroup_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies a SKU group (https://cloud.google.com/skus/sku-groups).
   * Resource name of SKU group. Format:
   * accounts/{account}/skuGroups/{sku_group}.
   * Example:
   * "accounts/C01234/skuGroups/3d50fd57-3157-4577-a5a9-a219b8490041".
   * </pre>
   *
   * <code>string sku_group = 1;</code>
   *
   * @return The bytes for skuGroup.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSkuGroupBytes() {
    java.lang.Object ref = skuGroup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      skuGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuGroup_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, skuGroup_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuGroup_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, skuGroup_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.SkuGroupCondition)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.SkuGroupCondition other =
        (com.google.cloud.channel.v1.SkuGroupCondition) obj;

    if (!getSkuGroup().equals(other.getSkuGroup())) return false;
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
    hash = (37 * hash) + SKU_GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getSkuGroup().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.SkuGroupCondition prototype) {
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
   * A condition that applies the override if a line item SKU is found in the SKU
   * group.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.SkuGroupCondition}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.SkuGroupCondition)
      com.google.cloud.channel.v1.SkuGroupConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.RepricingProto
          .internal_static_google_cloud_channel_v1_SkuGroupCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.RepricingProto
          .internal_static_google_cloud_channel_v1_SkuGroupCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.SkuGroupCondition.class,
              com.google.cloud.channel.v1.SkuGroupCondition.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.SkuGroupCondition.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      skuGroup_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.RepricingProto
          .internal_static_google_cloud_channel_v1_SkuGroupCondition_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.SkuGroupCondition getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.SkuGroupCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.SkuGroupCondition build() {
      com.google.cloud.channel.v1.SkuGroupCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.SkuGroupCondition buildPartial() {
      com.google.cloud.channel.v1.SkuGroupCondition result =
          new com.google.cloud.channel.v1.SkuGroupCondition(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.channel.v1.SkuGroupCondition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skuGroup_ = skuGroup_;
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
      if (other instanceof com.google.cloud.channel.v1.SkuGroupCondition) {
        return mergeFrom((com.google.cloud.channel.v1.SkuGroupCondition) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.SkuGroupCondition other) {
      if (other == com.google.cloud.channel.v1.SkuGroupCondition.getDefaultInstance()) return this;
      if (!other.getSkuGroup().isEmpty()) {
        skuGroup_ = other.skuGroup_;
        bitField0_ |= 0x00000001;
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
                skuGroup_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
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

    private java.lang.Object skuGroup_ = "";
    /**
     *
     *
     * <pre>
     * Specifies a SKU group (https://cloud.google.com/skus/sku-groups).
     * Resource name of SKU group. Format:
     * accounts/{account}/skuGroups/{sku_group}.
     * Example:
     * "accounts/C01234/skuGroups/3d50fd57-3157-4577-a5a9-a219b8490041".
     * </pre>
     *
     * <code>string sku_group = 1;</code>
     *
     * @return The skuGroup.
     */
    public java.lang.String getSkuGroup() {
      java.lang.Object ref = skuGroup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skuGroup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a SKU group (https://cloud.google.com/skus/sku-groups).
     * Resource name of SKU group. Format:
     * accounts/{account}/skuGroups/{sku_group}.
     * Example:
     * "accounts/C01234/skuGroups/3d50fd57-3157-4577-a5a9-a219b8490041".
     * </pre>
     *
     * <code>string sku_group = 1;</code>
     *
     * @return The bytes for skuGroup.
     */
    public com.google.protobuf.ByteString getSkuGroupBytes() {
      java.lang.Object ref = skuGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        skuGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a SKU group (https://cloud.google.com/skus/sku-groups).
     * Resource name of SKU group. Format:
     * accounts/{account}/skuGroups/{sku_group}.
     * Example:
     * "accounts/C01234/skuGroups/3d50fd57-3157-4577-a5a9-a219b8490041".
     * </pre>
     *
     * <code>string sku_group = 1;</code>
     *
     * @param value The skuGroup to set.
     * @return This builder for chaining.
     */
    public Builder setSkuGroup(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      skuGroup_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a SKU group (https://cloud.google.com/skus/sku-groups).
     * Resource name of SKU group. Format:
     * accounts/{account}/skuGroups/{sku_group}.
     * Example:
     * "accounts/C01234/skuGroups/3d50fd57-3157-4577-a5a9-a219b8490041".
     * </pre>
     *
     * <code>string sku_group = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSkuGroup() {
      skuGroup_ = getDefaultInstance().getSkuGroup();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a SKU group (https://cloud.google.com/skus/sku-groups).
     * Resource name of SKU group. Format:
     * accounts/{account}/skuGroups/{sku_group}.
     * Example:
     * "accounts/C01234/skuGroups/3d50fd57-3157-4577-a5a9-a219b8490041".
     * </pre>
     *
     * <code>string sku_group = 1;</code>
     *
     * @param value The bytes for skuGroup to set.
     * @return This builder for chaining.
     */
    public Builder setSkuGroupBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      skuGroup_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.SkuGroupCondition)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.SkuGroupCondition)
  private static final com.google.cloud.channel.v1.SkuGroupCondition DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.SkuGroupCondition();
  }

  public static com.google.cloud.channel.v1.SkuGroupCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkuGroupCondition> PARSER =
      new com.google.protobuf.AbstractParser<SkuGroupCondition>() {
        @java.lang.Override
        public SkuGroupCondition parsePartialFrom(
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

  public static com.google.protobuf.Parser<SkuGroupCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkuGroupCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.SkuGroupCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
