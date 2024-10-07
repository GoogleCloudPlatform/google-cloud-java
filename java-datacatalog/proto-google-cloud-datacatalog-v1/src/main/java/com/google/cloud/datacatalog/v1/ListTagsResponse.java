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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [ListTags][google.cloud.datacatalog.v1.DataCatalog.ListTags].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.ListTagsResponse}
 */
public final class ListTagsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.ListTagsResponse)
    ListTagsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTagsResponse.newBuilder() to construct.
  private ListTagsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTagsResponse() {
    tags_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListTagsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_ListTagsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_ListTagsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.ListTagsResponse.class,
            com.google.cloud.datacatalog.v1.ListTagsResponse.Builder.class);
  }

  public static final int TAGS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datacatalog.v1.Tag> tags_;
  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datacatalog.v1.Tag> getTagsList() {
    return tags_;
  }
  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datacatalog.v1.TagOrBuilder>
      getTagsOrBuilderList() {
    return tags_;
  }
  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  @java.lang.Override
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.Tag getTags(int index) {
    return tags_.get(index);
  }
  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.TagOrBuilder getTagsOrBuilder(int index) {
    return tags_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Pagination token of the next results page. Empty if there are
   * no more items in results.
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
   * Pagination token of the next results page. Empty if there are
   * no more items in results.
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
    for (int i = 0; i < tags_.size(); i++) {
      output.writeMessage(1, tags_.get(i));
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
    for (int i = 0; i < tags_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, tags_.get(i));
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.ListTagsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.ListTagsResponse other =
        (com.google.cloud.datacatalog.v1.ListTagsResponse) obj;

    if (!getTagsList().equals(other.getTagsList())) return false;
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
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.ListTagsResponse prototype) {
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
   * [ListTags][google.cloud.datacatalog.v1.DataCatalog.ListTags].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.ListTagsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.ListTagsResponse)
      com.google.cloud.datacatalog.v1.ListTagsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ListTagsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ListTagsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.ListTagsResponse.class,
              com.google.cloud.datacatalog.v1.ListTagsResponse.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.ListTagsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
      } else {
        tags_ = null;
        tagsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ListTagsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ListTagsResponse getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.ListTagsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ListTagsResponse build() {
      com.google.cloud.datacatalog.v1.ListTagsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ListTagsResponse buildPartial() {
      com.google.cloud.datacatalog.v1.ListTagsResponse result =
          new com.google.cloud.datacatalog.v1.ListTagsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.datacatalog.v1.ListTagsResponse result) {
      if (tagsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tags_ = java.util.Collections.unmodifiableList(tags_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tags_ = tags_;
      } else {
        result.tags_ = tagsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.ListTagsResponse result) {
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
      if (other instanceof com.google.cloud.datacatalog.v1.ListTagsResponse) {
        return mergeFrom((com.google.cloud.datacatalog.v1.ListTagsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.ListTagsResponse other) {
      if (other == com.google.cloud.datacatalog.v1.ListTagsResponse.getDefaultInstance())
        return this;
      if (tagsBuilder_ == null) {
        if (!other.tags_.isEmpty()) {
          if (tags_.isEmpty()) {
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTagsIsMutable();
            tags_.addAll(other.tags_);
          }
          onChanged();
        }
      } else {
        if (!other.tags_.isEmpty()) {
          if (tagsBuilder_.isEmpty()) {
            tagsBuilder_.dispose();
            tagsBuilder_ = null;
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tagsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTagsFieldBuilder()
                    : null;
          } else {
            tagsBuilder_.addAllMessages(other.tags_);
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
                com.google.cloud.datacatalog.v1.Tag m =
                    input.readMessage(
                        com.google.cloud.datacatalog.v1.Tag.parser(), extensionRegistry);
                if (tagsBuilder_ == null) {
                  ensureTagsIsMutable();
                  tags_.add(m);
                } else {
                  tagsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.datacatalog.v1.Tag> tags_ =
        java.util.Collections.emptyList();

    private void ensureTagsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tags_ = new java.util.ArrayList<com.google.cloud.datacatalog.v1.Tag>(tags_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Tag,
            com.google.cloud.datacatalog.v1.Tag.Builder,
            com.google.cloud.datacatalog.v1.TagOrBuilder>
        tagsBuilder_;

    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1.Tag> getTagsList() {
      if (tagsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tags_);
      } else {
        return tagsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public int getTagsCount() {
      if (tagsBuilder_ == null) {
        return tags_.size();
      } else {
        return tagsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.Tag getTags(int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);
      } else {
        return tagsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public Builder setTags(int index, com.google.cloud.datacatalog.v1.Tag value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.set(index, value);
        onChanged();
      } else {
        tagsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public Builder setTags(int index, com.google.cloud.datacatalog.v1.Tag.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.set(index, builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public Builder addTags(com.google.cloud.datacatalog.v1.Tag value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.add(value);
        onChanged();
      } else {
        tagsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public Builder addTags(int index, com.google.cloud.datacatalog.v1.Tag value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.add(index, value);
        onChanged();
      } else {
        tagsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public Builder addTags(com.google.cloud.datacatalog.v1.Tag.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.add(builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public Builder addTags(int index, com.google.cloud.datacatalog.v1.Tag.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.add(index, builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public Builder addAllTags(
        java.lang.Iterable<? extends com.google.cloud.datacatalog.v1.Tag> values) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tags_);
        onChanged();
      } else {
        tagsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public Builder clearTags() {
      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tagsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public Builder removeTags(int index) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.remove(index);
        onChanged();
      } else {
        tagsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.Tag.Builder getTagsBuilder(int index) {
      return getTagsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.TagOrBuilder getTagsOrBuilder(int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);
      } else {
        return tagsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datacatalog.v1.TagOrBuilder>
        getTagsOrBuilderList() {
      if (tagsBuilder_ != null) {
        return tagsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tags_);
      }
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.Tag.Builder addTagsBuilder() {
      return getTagsFieldBuilder()
          .addBuilder(com.google.cloud.datacatalog.v1.Tag.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.Tag.Builder addTagsBuilder(int index) {
      return getTagsFieldBuilder()
          .addBuilder(index, com.google.cloud.datacatalog.v1.Tag.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Tag][google.cloud.datacatalog.v1.Tag] details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1.Tag.Builder> getTagsBuilderList() {
      return getTagsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Tag,
            com.google.cloud.datacatalog.v1.Tag.Builder,
            com.google.cloud.datacatalog.v1.TagOrBuilder>
        getTagsFieldBuilder() {
      if (tagsBuilder_ == null) {
        tagsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datacatalog.v1.Tag,
                com.google.cloud.datacatalog.v1.Tag.Builder,
                com.google.cloud.datacatalog.v1.TagOrBuilder>(
                tags_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        tags_ = null;
      }
      return tagsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Pagination token of the next results page. Empty if there are
     * no more items in results.
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
     * Pagination token of the next results page. Empty if there are
     * no more items in results.
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
     * Pagination token of the next results page. Empty if there are
     * no more items in results.
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
     * Pagination token of the next results page. Empty if there are
     * no more items in results.
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
     * Pagination token of the next results page. Empty if there are
     * no more items in results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.ListTagsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.ListTagsResponse)
  private static final com.google.cloud.datacatalog.v1.ListTagsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.ListTagsResponse();
  }

  public static com.google.cloud.datacatalog.v1.ListTagsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTagsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListTagsResponse>() {
        @java.lang.Override
        public ListTagsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTagsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTagsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.ListTagsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
