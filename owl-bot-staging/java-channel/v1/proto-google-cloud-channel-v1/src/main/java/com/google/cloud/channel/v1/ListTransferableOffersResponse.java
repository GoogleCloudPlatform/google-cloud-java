// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * Response message for [CloudChannelService.ListTransferableOffers][google.cloud.channel.v1.CloudChannelService.ListTransferableOffers].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ListTransferableOffersResponse}
 */
public final class ListTransferableOffersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ListTransferableOffersResponse)
    ListTransferableOffersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTransferableOffersResponse.newBuilder() to construct.
  private ListTransferableOffersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTransferableOffersResponse() {
    transferableOffers_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTransferableOffersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableOffersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableOffersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ListTransferableOffersResponse.class, com.google.cloud.channel.v1.ListTransferableOffersResponse.Builder.class);
  }

  public static final int TRANSFERABLE_OFFERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.channel.v1.TransferableOffer> transferableOffers_;
  /**
   * <pre>
   * Information about Offers for a customer that can be used for
   * transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.TransferableOffer> getTransferableOffersList() {
    return transferableOffers_;
  }
  /**
   * <pre>
   * Information about Offers for a customer that can be used for
   * transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.TransferableOfferOrBuilder> 
      getTransferableOffersOrBuilderList() {
    return transferableOffers_;
  }
  /**
   * <pre>
   * Information about Offers for a customer that can be used for
   * transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
   */
  @java.lang.Override
  public int getTransferableOffersCount() {
    return transferableOffers_.size();
  }
  /**
   * <pre>
   * Information about Offers for a customer that can be used for
   * transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.TransferableOffer getTransferableOffers(int index) {
    return transferableOffers_.get(index);
  }
  /**
   * <pre>
   * Information about Offers for a customer that can be used for
   * transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.TransferableOfferOrBuilder getTransferableOffersOrBuilder(
      int index) {
    return transferableOffers_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListTransferableOffersRequest.page_token][google.cloud.channel.v1.ListTransferableOffersRequest.page_token] to obtain
   * that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListTransferableOffersRequest.page_token][google.cloud.channel.v1.ListTransferableOffersRequest.page_token] to obtain
   * that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < transferableOffers_.size(); i++) {
      output.writeMessage(1, transferableOffers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < transferableOffers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, transferableOffers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.ListTransferableOffersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ListTransferableOffersResponse other = (com.google.cloud.channel.v1.ListTransferableOffersResponse) obj;

    if (!getTransferableOffersList()
        .equals(other.getTransferableOffersList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getTransferableOffersCount() > 0) {
      hash = (37 * hash) + TRANSFERABLE_OFFERS_FIELD_NUMBER;
      hash = (53 * hash) + getTransferableOffersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.ListTransferableOffersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.channel.v1.ListTransferableOffersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for [CloudChannelService.ListTransferableOffers][google.cloud.channel.v1.CloudChannelService.ListTransferableOffers].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ListTransferableOffersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ListTransferableOffersResponse)
      com.google.cloud.channel.v1.ListTransferableOffersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableOffersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableOffersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ListTransferableOffersResponse.class, com.google.cloud.channel.v1.ListTransferableOffersResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ListTransferableOffersResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (transferableOffersBuilder_ == null) {
        transferableOffers_ = java.util.Collections.emptyList();
      } else {
        transferableOffers_ = null;
        transferableOffersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableOffersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListTransferableOffersResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ListTransferableOffersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListTransferableOffersResponse build() {
      com.google.cloud.channel.v1.ListTransferableOffersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListTransferableOffersResponse buildPartial() {
      com.google.cloud.channel.v1.ListTransferableOffersResponse result = new com.google.cloud.channel.v1.ListTransferableOffersResponse(this);
      int from_bitField0_ = bitField0_;
      if (transferableOffersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          transferableOffers_ = java.util.Collections.unmodifiableList(transferableOffers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.transferableOffers_ = transferableOffers_;
      } else {
        result.transferableOffers_ = transferableOffersBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.channel.v1.ListTransferableOffersResponse) {
        return mergeFrom((com.google.cloud.channel.v1.ListTransferableOffersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ListTransferableOffersResponse other) {
      if (other == com.google.cloud.channel.v1.ListTransferableOffersResponse.getDefaultInstance()) return this;
      if (transferableOffersBuilder_ == null) {
        if (!other.transferableOffers_.isEmpty()) {
          if (transferableOffers_.isEmpty()) {
            transferableOffers_ = other.transferableOffers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTransferableOffersIsMutable();
            transferableOffers_.addAll(other.transferableOffers_);
          }
          onChanged();
        }
      } else {
        if (!other.transferableOffers_.isEmpty()) {
          if (transferableOffersBuilder_.isEmpty()) {
            transferableOffersBuilder_.dispose();
            transferableOffersBuilder_ = null;
            transferableOffers_ = other.transferableOffers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            transferableOffersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransferableOffersFieldBuilder() : null;
          } else {
            transferableOffersBuilder_.addAllMessages(other.transferableOffers_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10: {
              com.google.cloud.channel.v1.TransferableOffer m =
                  input.readMessage(
                      com.google.cloud.channel.v1.TransferableOffer.parser(),
                      extensionRegistry);
              if (transferableOffersBuilder_ == null) {
                ensureTransferableOffersIsMutable();
                transferableOffers_.add(m);
              } else {
                transferableOffersBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

              break;
            } // case 18
            default: {
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

    private java.util.List<com.google.cloud.channel.v1.TransferableOffer> transferableOffers_ =
      java.util.Collections.emptyList();
    private void ensureTransferableOffersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        transferableOffers_ = new java.util.ArrayList<com.google.cloud.channel.v1.TransferableOffer>(transferableOffers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.channel.v1.TransferableOffer, com.google.cloud.channel.v1.TransferableOffer.Builder, com.google.cloud.channel.v1.TransferableOfferOrBuilder> transferableOffersBuilder_;

    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.TransferableOffer> getTransferableOffersList() {
      if (transferableOffersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transferableOffers_);
      } else {
        return transferableOffersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public int getTransferableOffersCount() {
      if (transferableOffersBuilder_ == null) {
        return transferableOffers_.size();
      } else {
        return transferableOffersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableOffer getTransferableOffers(int index) {
      if (transferableOffersBuilder_ == null) {
        return transferableOffers_.get(index);
      } else {
        return transferableOffersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public Builder setTransferableOffers(
        int index, com.google.cloud.channel.v1.TransferableOffer value) {
      if (transferableOffersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferableOffersIsMutable();
        transferableOffers_.set(index, value);
        onChanged();
      } else {
        transferableOffersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public Builder setTransferableOffers(
        int index, com.google.cloud.channel.v1.TransferableOffer.Builder builderForValue) {
      if (transferableOffersBuilder_ == null) {
        ensureTransferableOffersIsMutable();
        transferableOffers_.set(index, builderForValue.build());
        onChanged();
      } else {
        transferableOffersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public Builder addTransferableOffers(com.google.cloud.channel.v1.TransferableOffer value) {
      if (transferableOffersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferableOffersIsMutable();
        transferableOffers_.add(value);
        onChanged();
      } else {
        transferableOffersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public Builder addTransferableOffers(
        int index, com.google.cloud.channel.v1.TransferableOffer value) {
      if (transferableOffersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferableOffersIsMutable();
        transferableOffers_.add(index, value);
        onChanged();
      } else {
        transferableOffersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public Builder addTransferableOffers(
        com.google.cloud.channel.v1.TransferableOffer.Builder builderForValue) {
      if (transferableOffersBuilder_ == null) {
        ensureTransferableOffersIsMutable();
        transferableOffers_.add(builderForValue.build());
        onChanged();
      } else {
        transferableOffersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public Builder addTransferableOffers(
        int index, com.google.cloud.channel.v1.TransferableOffer.Builder builderForValue) {
      if (transferableOffersBuilder_ == null) {
        ensureTransferableOffersIsMutable();
        transferableOffers_.add(index, builderForValue.build());
        onChanged();
      } else {
        transferableOffersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public Builder addAllTransferableOffers(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.TransferableOffer> values) {
      if (transferableOffersBuilder_ == null) {
        ensureTransferableOffersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transferableOffers_);
        onChanged();
      } else {
        transferableOffersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public Builder clearTransferableOffers() {
      if (transferableOffersBuilder_ == null) {
        transferableOffers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        transferableOffersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public Builder removeTransferableOffers(int index) {
      if (transferableOffersBuilder_ == null) {
        ensureTransferableOffersIsMutable();
        transferableOffers_.remove(index);
        onChanged();
      } else {
        transferableOffersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableOffer.Builder getTransferableOffersBuilder(
        int index) {
      return getTransferableOffersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableOfferOrBuilder getTransferableOffersOrBuilder(
        int index) {
      if (transferableOffersBuilder_ == null) {
        return transferableOffers_.get(index);  } else {
        return transferableOffersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.TransferableOfferOrBuilder> 
         getTransferableOffersOrBuilderList() {
      if (transferableOffersBuilder_ != null) {
        return transferableOffersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transferableOffers_);
      }
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableOffer.Builder addTransferableOffersBuilder() {
      return getTransferableOffersFieldBuilder().addBuilder(
          com.google.cloud.channel.v1.TransferableOffer.getDefaultInstance());
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableOffer.Builder addTransferableOffersBuilder(
        int index) {
      return getTransferableOffersFieldBuilder().addBuilder(
          index, com.google.cloud.channel.v1.TransferableOffer.getDefaultInstance());
    }
    /**
     * <pre>
     * Information about Offers for a customer that can be used for
     * transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableOffer transferable_offers = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.TransferableOffer.Builder> 
         getTransferableOffersBuilderList() {
      return getTransferableOffersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.channel.v1.TransferableOffer, com.google.cloud.channel.v1.TransferableOffer.Builder, com.google.cloud.channel.v1.TransferableOfferOrBuilder> 
        getTransferableOffersFieldBuilder() {
      if (transferableOffersBuilder_ == null) {
        transferableOffersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.TransferableOffer, com.google.cloud.channel.v1.TransferableOffer.Builder, com.google.cloud.channel.v1.TransferableOfferOrBuilder>(
                transferableOffers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        transferableOffers_ = null;
      }
      return transferableOffersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableOffersRequest.page_token][google.cloud.channel.v1.ListTransferableOffersRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableOffersRequest.page_token][google.cloud.channel.v1.ListTransferableOffersRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableOffersRequest.page_token][google.cloud.channel.v1.ListTransferableOffersRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableOffersRequest.page_token][google.cloud.channel.v1.ListTransferableOffersRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableOffersRequest.page_token][google.cloud.channel.v1.ListTransferableOffersRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ListTransferableOffersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ListTransferableOffersResponse)
  private static final com.google.cloud.channel.v1.ListTransferableOffersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ListTransferableOffersResponse();
  }

  public static com.google.cloud.channel.v1.ListTransferableOffersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTransferableOffersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTransferableOffersResponse>() {
    @java.lang.Override
    public ListTransferableOffersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTransferableOffersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTransferableOffersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ListTransferableOffersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

