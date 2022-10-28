// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * The response of listing views.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.ListViewsResponse}
 */
public final class ListViewsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.ListViewsResponse)
    ListViewsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListViewsResponse.newBuilder() to construct.
  private ListViewsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListViewsResponse() {
    views_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListViewsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_ListViewsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_ListViewsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.ListViewsResponse.class, com.google.cloud.contactcenterinsights.v1.ListViewsResponse.Builder.class);
  }

  public static final int VIEWS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.contactcenterinsights.v1.View> views_;
  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.contactcenterinsights.v1.View> getViewsList() {
    return views_;
  }
  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.contactcenterinsights.v1.ViewOrBuilder> 
      getViewsOrBuilderList() {
    return views_;
  }
  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  @java.lang.Override
  public int getViewsCount() {
    return views_.size();
  }
  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.View getViews(int index) {
    return views_.get(index);
  }
  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ViewOrBuilder getViewsOrBuilder(
      int index) {
    return views_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < views_.size(); i++) {
      output.writeMessage(1, views_.get(i));
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
    for (int i = 0; i < views_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, views_.get(i));
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.ListViewsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.ListViewsResponse other = (com.google.cloud.contactcenterinsights.v1.ListViewsResponse) obj;

    if (!getViewsList()
        .equals(other.getViewsList())) return false;
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
    if (getViewsCount() > 0) {
      hash = (37 * hash) + VIEWS_FIELD_NUMBER;
      hash = (53 * hash) + getViewsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.ListViewsResponse prototype) {
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
   * The response of listing views.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.ListViewsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.ListViewsResponse)
      com.google.cloud.contactcenterinsights.v1.ListViewsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_ListViewsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_ListViewsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.ListViewsResponse.class, com.google.cloud.contactcenterinsights.v1.ListViewsResponse.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.ListViewsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (viewsBuilder_ == null) {
        views_ = java.util.Collections.emptyList();
      } else {
        views_ = null;
        viewsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_ListViewsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ListViewsResponse getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.ListViewsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ListViewsResponse build() {
      com.google.cloud.contactcenterinsights.v1.ListViewsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ListViewsResponse buildPartial() {
      com.google.cloud.contactcenterinsights.v1.ListViewsResponse result = new com.google.cloud.contactcenterinsights.v1.ListViewsResponse(this);
      int from_bitField0_ = bitField0_;
      if (viewsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          views_ = java.util.Collections.unmodifiableList(views_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.views_ = views_;
      } else {
        result.views_ = viewsBuilder_.build();
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.ListViewsResponse) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.ListViewsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.ListViewsResponse other) {
      if (other == com.google.cloud.contactcenterinsights.v1.ListViewsResponse.getDefaultInstance()) return this;
      if (viewsBuilder_ == null) {
        if (!other.views_.isEmpty()) {
          if (views_.isEmpty()) {
            views_ = other.views_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureViewsIsMutable();
            views_.addAll(other.views_);
          }
          onChanged();
        }
      } else {
        if (!other.views_.isEmpty()) {
          if (viewsBuilder_.isEmpty()) {
            viewsBuilder_.dispose();
            viewsBuilder_ = null;
            views_ = other.views_;
            bitField0_ = (bitField0_ & ~0x00000001);
            viewsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getViewsFieldBuilder() : null;
          } else {
            viewsBuilder_.addAllMessages(other.views_);
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
              com.google.cloud.contactcenterinsights.v1.View m =
                  input.readMessage(
                      com.google.cloud.contactcenterinsights.v1.View.parser(),
                      extensionRegistry);
              if (viewsBuilder_ == null) {
                ensureViewsIsMutable();
                views_.add(m);
              } else {
                viewsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.contactcenterinsights.v1.View> views_ =
      java.util.Collections.emptyList();
    private void ensureViewsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        views_ = new java.util.ArrayList<com.google.cloud.contactcenterinsights.v1.View>(views_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.View, com.google.cloud.contactcenterinsights.v1.View.Builder, com.google.cloud.contactcenterinsights.v1.ViewOrBuilder> viewsBuilder_;

    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public java.util.List<com.google.cloud.contactcenterinsights.v1.View> getViewsList() {
      if (viewsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(views_);
      } else {
        return viewsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public int getViewsCount() {
      if (viewsBuilder_ == null) {
        return views_.size();
      } else {
        return viewsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.View getViews(int index) {
      if (viewsBuilder_ == null) {
        return views_.get(index);
      } else {
        return viewsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public Builder setViews(
        int index, com.google.cloud.contactcenterinsights.v1.View value) {
      if (viewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureViewsIsMutable();
        views_.set(index, value);
        onChanged();
      } else {
        viewsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public Builder setViews(
        int index, com.google.cloud.contactcenterinsights.v1.View.Builder builderForValue) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        views_.set(index, builderForValue.build());
        onChanged();
      } else {
        viewsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public Builder addViews(com.google.cloud.contactcenterinsights.v1.View value) {
      if (viewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureViewsIsMutable();
        views_.add(value);
        onChanged();
      } else {
        viewsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public Builder addViews(
        int index, com.google.cloud.contactcenterinsights.v1.View value) {
      if (viewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureViewsIsMutable();
        views_.add(index, value);
        onChanged();
      } else {
        viewsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public Builder addViews(
        com.google.cloud.contactcenterinsights.v1.View.Builder builderForValue) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        views_.add(builderForValue.build());
        onChanged();
      } else {
        viewsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public Builder addViews(
        int index, com.google.cloud.contactcenterinsights.v1.View.Builder builderForValue) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        views_.add(index, builderForValue.build());
        onChanged();
      } else {
        viewsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public Builder addAllViews(
        java.lang.Iterable<? extends com.google.cloud.contactcenterinsights.v1.View> values) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, views_);
        onChanged();
      } else {
        viewsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public Builder clearViews() {
      if (viewsBuilder_ == null) {
        views_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        viewsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public Builder removeViews(int index) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        views_.remove(index);
        onChanged();
      } else {
        viewsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.View.Builder getViewsBuilder(
        int index) {
      return getViewsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.ViewOrBuilder getViewsOrBuilder(
        int index) {
      if (viewsBuilder_ == null) {
        return views_.get(index);  } else {
        return viewsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.contactcenterinsights.v1.ViewOrBuilder> 
         getViewsOrBuilderList() {
      if (viewsBuilder_ != null) {
        return viewsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(views_);
      }
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.View.Builder addViewsBuilder() {
      return getViewsFieldBuilder().addBuilder(
          com.google.cloud.contactcenterinsights.v1.View.getDefaultInstance());
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.View.Builder addViewsBuilder(
        int index) {
      return getViewsFieldBuilder().addBuilder(
          index, com.google.cloud.contactcenterinsights.v1.View.getDefaultInstance());
    }
    /**
     * <pre>
     * The views that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
     */
    public java.util.List<com.google.cloud.contactcenterinsights.v1.View.Builder> 
         getViewsBuilderList() {
      return getViewsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.View, com.google.cloud.contactcenterinsights.v1.View.Builder, com.google.cloud.contactcenterinsights.v1.ViewOrBuilder> 
        getViewsFieldBuilder() {
      if (viewsBuilder_ == null) {
        viewsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.View, com.google.cloud.contactcenterinsights.v1.View.Builder, com.google.cloud.contactcenterinsights.v1.ViewOrBuilder>(
                views_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        views_ = null;
      }
      return viewsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.ListViewsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.ListViewsResponse)
  private static final com.google.cloud.contactcenterinsights.v1.ListViewsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.ListViewsResponse();
  }

  public static com.google.cloud.contactcenterinsights.v1.ListViewsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListViewsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListViewsResponse>() {
    @java.lang.Override
    public ListViewsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListViewsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListViewsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ListViewsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

