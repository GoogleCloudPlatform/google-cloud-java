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
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [DatasetService.SearchDataItems][google.cloud.aiplatform.v1beta1.DatasetService.SearchDataItems].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.SearchDataItemsResponse}
 */
public final class SearchDataItemsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.SearchDataItemsResponse)
    SearchDataItemsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchDataItemsResponse.newBuilder() to construct.
  private SearchDataItemsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchDataItemsResponse() {
    dataItemViews_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchDataItemsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_SearchDataItemsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_SearchDataItemsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse.class,
            com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse.Builder.class);
  }

  public static final int DATA_ITEM_VIEWS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.DataItemView> dataItemViews_;
  /**
   *
   *
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.DataItemView> getDataItemViewsList() {
    return dataItemViews_;
  }
  /**
   *
   *
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.DataItemViewOrBuilder>
      getDataItemViewsOrBuilderList() {
    return dataItemViews_;
  }
  /**
   *
   *
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
   */
  @java.lang.Override
  public int getDataItemViewsCount() {
    return dataItemViews_.size();
  }
  /**
   *
   *
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DataItemView getDataItemViews(int index) {
    return dataItemViews_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The DataItemViews read.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DataItemViewOrBuilder getDataItemViewsOrBuilder(
      int index) {
    return dataItemViews_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [SearchDataItemsRequest.page_token][google.cloud.aiplatform.v1beta1.SearchDataItemsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [SearchDataItemsRequest.page_token][google.cloud.aiplatform.v1beta1.SearchDataItemsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < dataItemViews_.size(); i++) {
      output.writeMessage(1, dataItemViews_.get(i));
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
    for (int i = 0; i < dataItemViews_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, dataItemViews_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse other =
        (com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse) obj;

    if (!getDataItemViewsList().equals(other.getDataItemViewsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getDataItemViewsCount() > 0) {
      hash = (37 * hash) + DATA_ITEM_VIEWS_FIELD_NUMBER;
      hash = (53 * hash) + getDataItemViewsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse prototype) {
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
   * Response message for
   * [DatasetService.SearchDataItems][google.cloud.aiplatform.v1beta1.DatasetService.SearchDataItems].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.SearchDataItemsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.SearchDataItemsResponse)
      com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_SearchDataItemsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_SearchDataItemsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse.class,
              com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (dataItemViewsBuilder_ == null) {
        dataItemViews_ = java.util.Collections.emptyList();
      } else {
        dataItemViews_ = null;
        dataItemViewsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_SearchDataItemsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse build() {
      com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse result =
          new com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse result) {
      if (dataItemViewsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataItemViews_ = java.util.Collections.unmodifiableList(dataItemViews_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataItemViews_ = dataItemViews_;
      } else {
        result.dataItemViews_ = dataItemViewsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse.getDefaultInstance())
        return this;
      if (dataItemViewsBuilder_ == null) {
        if (!other.dataItemViews_.isEmpty()) {
          if (dataItemViews_.isEmpty()) {
            dataItemViews_ = other.dataItemViews_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataItemViewsIsMutable();
            dataItemViews_.addAll(other.dataItemViews_);
          }
          onChanged();
        }
      } else {
        if (!other.dataItemViews_.isEmpty()) {
          if (dataItemViewsBuilder_.isEmpty()) {
            dataItemViewsBuilder_.dispose();
            dataItemViewsBuilder_ = null;
            dataItemViews_ = other.dataItemViews_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataItemViewsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDataItemViewsFieldBuilder()
                    : null;
          } else {
            dataItemViewsBuilder_.addAllMessages(other.dataItemViews_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10:
              {
                com.google.cloud.aiplatform.v1beta1.DataItemView m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.DataItemView.parser(),
                        extensionRegistry);
                if (dataItemViewsBuilder_ == null) {
                  ensureDataItemViewsIsMutable();
                  dataItemViews_.add(m);
                } else {
                  dataItemViewsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.DataItemView> dataItemViews_ =
        java.util.Collections.emptyList();

    private void ensureDataItemViewsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataItemViews_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.DataItemView>(
                dataItemViews_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DataItemView,
            com.google.cloud.aiplatform.v1beta1.DataItemView.Builder,
            com.google.cloud.aiplatform.v1beta1.DataItemViewOrBuilder>
        dataItemViewsBuilder_;

    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.DataItemView> getDataItemViewsList() {
      if (dataItemViewsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataItemViews_);
      } else {
        return dataItemViewsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public int getDataItemViewsCount() {
      if (dataItemViewsBuilder_ == null) {
        return dataItemViews_.size();
      } else {
        return dataItemViewsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DataItemView getDataItemViews(int index) {
      if (dataItemViewsBuilder_ == null) {
        return dataItemViews_.get(index);
      } else {
        return dataItemViewsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public Builder setDataItemViews(
        int index, com.google.cloud.aiplatform.v1beta1.DataItemView value) {
      if (dataItemViewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataItemViewsIsMutable();
        dataItemViews_.set(index, value);
        onChanged();
      } else {
        dataItemViewsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public Builder setDataItemViews(
        int index, com.google.cloud.aiplatform.v1beta1.DataItemView.Builder builderForValue) {
      if (dataItemViewsBuilder_ == null) {
        ensureDataItemViewsIsMutable();
        dataItemViews_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataItemViewsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public Builder addDataItemViews(com.google.cloud.aiplatform.v1beta1.DataItemView value) {
      if (dataItemViewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataItemViewsIsMutable();
        dataItemViews_.add(value);
        onChanged();
      } else {
        dataItemViewsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public Builder addDataItemViews(
        int index, com.google.cloud.aiplatform.v1beta1.DataItemView value) {
      if (dataItemViewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataItemViewsIsMutable();
        dataItemViews_.add(index, value);
        onChanged();
      } else {
        dataItemViewsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public Builder addDataItemViews(
        com.google.cloud.aiplatform.v1beta1.DataItemView.Builder builderForValue) {
      if (dataItemViewsBuilder_ == null) {
        ensureDataItemViewsIsMutable();
        dataItemViews_.add(builderForValue.build());
        onChanged();
      } else {
        dataItemViewsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public Builder addDataItemViews(
        int index, com.google.cloud.aiplatform.v1beta1.DataItemView.Builder builderForValue) {
      if (dataItemViewsBuilder_ == null) {
        ensureDataItemViewsIsMutable();
        dataItemViews_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataItemViewsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public Builder addAllDataItemViews(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.DataItemView> values) {
      if (dataItemViewsBuilder_ == null) {
        ensureDataItemViewsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dataItemViews_);
        onChanged();
      } else {
        dataItemViewsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public Builder clearDataItemViews() {
      if (dataItemViewsBuilder_ == null) {
        dataItemViews_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataItemViewsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public Builder removeDataItemViews(int index) {
      if (dataItemViewsBuilder_ == null) {
        ensureDataItemViewsIsMutable();
        dataItemViews_.remove(index);
        onChanged();
      } else {
        dataItemViewsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DataItemView.Builder getDataItemViewsBuilder(
        int index) {
      return getDataItemViewsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DataItemViewOrBuilder getDataItemViewsOrBuilder(
        int index) {
      if (dataItemViewsBuilder_ == null) {
        return dataItemViews_.get(index);
      } else {
        return dataItemViewsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.DataItemViewOrBuilder>
        getDataItemViewsOrBuilderList() {
      if (dataItemViewsBuilder_ != null) {
        return dataItemViewsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataItemViews_);
      }
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DataItemView.Builder addDataItemViewsBuilder() {
      return getDataItemViewsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.DataItemView.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DataItemView.Builder addDataItemViewsBuilder(
        int index) {
      return getDataItemViewsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.DataItemView.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The DataItemViews read.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.DataItemView data_item_views = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.DataItemView.Builder>
        getDataItemViewsBuilderList() {
      return getDataItemViewsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DataItemView,
            com.google.cloud.aiplatform.v1beta1.DataItemView.Builder,
            com.google.cloud.aiplatform.v1beta1.DataItemViewOrBuilder>
        getDataItemViewsFieldBuilder() {
      if (dataItemViewsBuilder_ == null) {
        dataItemViewsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.DataItemView,
                com.google.cloud.aiplatform.v1beta1.DataItemView.Builder,
                com.google.cloud.aiplatform.v1beta1.DataItemViewOrBuilder>(
                dataItemViews_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dataItemViews_ = null;
      }
      return dataItemViewsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to
     * [SearchDataItemsRequest.page_token][google.cloud.aiplatform.v1beta1.SearchDataItemsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to
     * [SearchDataItemsRequest.page_token][google.cloud.aiplatform.v1beta1.SearchDataItemsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to
     * [SearchDataItemsRequest.page_token][google.cloud.aiplatform.v1beta1.SearchDataItemsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to
     * [SearchDataItemsRequest.page_token][google.cloud.aiplatform.v1beta1.SearchDataItemsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to
     * [SearchDataItemsRequest.page_token][google.cloud.aiplatform.v1beta1.SearchDataItemsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.SearchDataItemsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.SearchDataItemsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchDataItemsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchDataItemsResponse>() {
        @java.lang.Override
        public SearchDataItemsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchDataItemsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchDataItemsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.SearchDataItemsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
