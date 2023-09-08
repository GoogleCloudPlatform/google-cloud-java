/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/retail/v2beta/catalog.proto

package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * Merchant Center Feed filter criterion.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.MerchantCenterFeedFilter}
 */
public final class MerchantCenterFeedFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.MerchantCenterFeedFilter)
    MerchantCenterFeedFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MerchantCenterFeedFilter.newBuilder() to construct.
  private MerchantCenterFeedFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MerchantCenterFeedFilter() {
    primaryFeedName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MerchantCenterFeedFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2beta.CatalogProto
        .internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.CatalogProto
        .internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.MerchantCenterFeedFilter.class,
            com.google.cloud.retail.v2beta.MerchantCenterFeedFilter.Builder.class);
  }

  public static final int PRIMARY_FEED_ID_FIELD_NUMBER = 1;
  private long primaryFeedId_ = 0L;
  /**
   *
   *
   * <pre>
   * Merchant Center primary feed ID.
   * </pre>
   *
   * <code>int64 primary_feed_id = 1;</code>
   *
   * @return The primaryFeedId.
   */
  @java.lang.Override
  public long getPrimaryFeedId() {
    return primaryFeedId_;
  }

  public static final int PRIMARY_FEED_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object primaryFeedName_ = "";
  /**
   *
   *
   * <pre>
   * Merchant Center primary feed name. The name is used for the display
   * purposes only.
   * </pre>
   *
   * <code>string primary_feed_name = 2;</code>
   *
   * @return The primaryFeedName.
   */
  @java.lang.Override
  public java.lang.String getPrimaryFeedName() {
    java.lang.Object ref = primaryFeedName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      primaryFeedName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Merchant Center primary feed name. The name is used for the display
   * purposes only.
   * </pre>
   *
   * <code>string primary_feed_name = 2;</code>
   *
   * @return The bytes for primaryFeedName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrimaryFeedNameBytes() {
    java.lang.Object ref = primaryFeedName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      primaryFeedName_ = b;
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
    if (primaryFeedId_ != 0L) {
      output.writeInt64(1, primaryFeedId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryFeedName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, primaryFeedName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (primaryFeedId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, primaryFeedId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryFeedName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, primaryFeedName_);
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.MerchantCenterFeedFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.MerchantCenterFeedFilter other =
        (com.google.cloud.retail.v2beta.MerchantCenterFeedFilter) obj;

    if (getPrimaryFeedId() != other.getPrimaryFeedId()) return false;
    if (!getPrimaryFeedName().equals(other.getPrimaryFeedName())) return false;
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
    hash = (37 * hash) + PRIMARY_FEED_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getPrimaryFeedId());
    hash = (37 * hash) + PRIMARY_FEED_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPrimaryFeedName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter parseFrom(
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
      com.google.cloud.retail.v2beta.MerchantCenterFeedFilter prototype) {
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
   * Merchant Center Feed filter criterion.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.MerchantCenterFeedFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.MerchantCenterFeedFilter)
      com.google.cloud.retail.v2beta.MerchantCenterFeedFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2beta.CatalogProto
          .internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.CatalogProto
          .internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.MerchantCenterFeedFilter.class,
              com.google.cloud.retail.v2beta.MerchantCenterFeedFilter.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.MerchantCenterFeedFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      primaryFeedId_ = 0L;
      primaryFeedName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2beta.CatalogProto
          .internal_static_google_cloud_retail_v2beta_MerchantCenterFeedFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.MerchantCenterFeedFilter getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.MerchantCenterFeedFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.MerchantCenterFeedFilter build() {
      com.google.cloud.retail.v2beta.MerchantCenterFeedFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.MerchantCenterFeedFilter buildPartial() {
      com.google.cloud.retail.v2beta.MerchantCenterFeedFilter result =
          new com.google.cloud.retail.v2beta.MerchantCenterFeedFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2beta.MerchantCenterFeedFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.primaryFeedId_ = primaryFeedId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.primaryFeedName_ = primaryFeedName_;
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
      if (other instanceof com.google.cloud.retail.v2beta.MerchantCenterFeedFilter) {
        return mergeFrom((com.google.cloud.retail.v2beta.MerchantCenterFeedFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.MerchantCenterFeedFilter other) {
      if (other == com.google.cloud.retail.v2beta.MerchantCenterFeedFilter.getDefaultInstance())
        return this;
      if (other.getPrimaryFeedId() != 0L) {
        setPrimaryFeedId(other.getPrimaryFeedId());
      }
      if (!other.getPrimaryFeedName().isEmpty()) {
        primaryFeedName_ = other.primaryFeedName_;
        bitField0_ |= 0x00000002;
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
            case 8:
              {
                primaryFeedId_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                primaryFeedName_ = input.readStringRequireUtf8();
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

    private long primaryFeedId_;
    /**
     *
     *
     * <pre>
     * Merchant Center primary feed ID.
     * </pre>
     *
     * <code>int64 primary_feed_id = 1;</code>
     *
     * @return The primaryFeedId.
     */
    @java.lang.Override
    public long getPrimaryFeedId() {
      return primaryFeedId_;
    }
    /**
     *
     *
     * <pre>
     * Merchant Center primary feed ID.
     * </pre>
     *
     * <code>int64 primary_feed_id = 1;</code>
     *
     * @param value The primaryFeedId to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryFeedId(long value) {

      primaryFeedId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Merchant Center primary feed ID.
     * </pre>
     *
     * <code>int64 primary_feed_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrimaryFeedId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      primaryFeedId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object primaryFeedName_ = "";
    /**
     *
     *
     * <pre>
     * Merchant Center primary feed name. The name is used for the display
     * purposes only.
     * </pre>
     *
     * <code>string primary_feed_name = 2;</code>
     *
     * @return The primaryFeedName.
     */
    public java.lang.String getPrimaryFeedName() {
      java.lang.Object ref = primaryFeedName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        primaryFeedName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Merchant Center primary feed name. The name is used for the display
     * purposes only.
     * </pre>
     *
     * <code>string primary_feed_name = 2;</code>
     *
     * @return The bytes for primaryFeedName.
     */
    public com.google.protobuf.ByteString getPrimaryFeedNameBytes() {
      java.lang.Object ref = primaryFeedName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        primaryFeedName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Merchant Center primary feed name. The name is used for the display
     * purposes only.
     * </pre>
     *
     * <code>string primary_feed_name = 2;</code>
     *
     * @param value The primaryFeedName to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryFeedName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      primaryFeedName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Merchant Center primary feed name. The name is used for the display
     * purposes only.
     * </pre>
     *
     * <code>string primary_feed_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrimaryFeedName() {
      primaryFeedName_ = getDefaultInstance().getPrimaryFeedName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Merchant Center primary feed name. The name is used for the display
     * purposes only.
     * </pre>
     *
     * <code>string primary_feed_name = 2;</code>
     *
     * @param value The bytes for primaryFeedName to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryFeedNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      primaryFeedName_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.MerchantCenterFeedFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.MerchantCenterFeedFilter)
  private static final com.google.cloud.retail.v2beta.MerchantCenterFeedFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.MerchantCenterFeedFilter();
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterFeedFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MerchantCenterFeedFilter> PARSER =
      new com.google.protobuf.AbstractParser<MerchantCenterFeedFilter>() {
        @java.lang.Override
        public MerchantCenterFeedFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<MerchantCenterFeedFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MerchantCenterFeedFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.MerchantCenterFeedFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
