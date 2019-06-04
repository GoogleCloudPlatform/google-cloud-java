// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for listing sources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1beta1.ListSourcesResponse}
 */
public final class ListSourcesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1beta1.ListSourcesResponse)
    ListSourcesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSourcesResponse.newBuilder() to construct.
  private ListSourcesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSourcesResponse() {
    sources_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSourcesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListSourcesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sources_ =
                    new java.util.ArrayList<com.google.cloud.securitycenter.v1beta1.Source>();
                mutable_bitField0_ |= 0x00000001;
              }
              sources_.add(
                  input.readMessage(
                      com.google.cloud.securitycenter.v1beta1.Source.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        sources_ = java.util.Collections.unmodifiableList(sources_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1beta1_ListSourcesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1beta1_ListSourcesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1beta1.ListSourcesResponse.class,
            com.google.cloud.securitycenter.v1beta1.ListSourcesResponse.Builder.class);
  }

  public static final int SOURCES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.securitycenter.v1beta1.Source> sources_;
  /**
   *
   *
   * <pre>
   * Sources belonging to the requested parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
   */
  public java.util.List<com.google.cloud.securitycenter.v1beta1.Source> getSourcesList() {
    return sources_;
  }
  /**
   *
   *
   * <pre>
   * Sources belonging to the requested parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.securitycenter.v1beta1.SourceOrBuilder>
      getSourcesOrBuilderList() {
    return sources_;
  }
  /**
   *
   *
   * <pre>
   * Sources belonging to the requested parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
   */
  public int getSourcesCount() {
    return sources_.size();
  }
  /**
   *
   *
   * <pre>
   * Sources belonging to the requested parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
   */
  public com.google.cloud.securitycenter.v1beta1.Source getSources(int index) {
    return sources_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Sources belonging to the requested parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
   */
  public com.google.cloud.securitycenter.v1beta1.SourceOrBuilder getSourcesOrBuilder(int index) {
    return sources_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
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
    for (int i = 0; i < sources_.size(); i++) {
      output.writeMessage(1, sources_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sources_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, sources_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.securitycenter.v1beta1.ListSourcesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1beta1.ListSourcesResponse other =
        (com.google.cloud.securitycenter.v1beta1.ListSourcesResponse) obj;

    if (!getSourcesList().equals(other.getSourcesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSourcesCount() > 0) {
      hash = (37 * hash) + SOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getSourcesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parseFrom(
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
      com.google.cloud.securitycenter.v1beta1.ListSourcesResponse prototype) {
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
   * Response message for listing sources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1beta1.ListSourcesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1beta1.ListSourcesResponse)
      com.google.cloud.securitycenter.v1beta1.ListSourcesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1beta1_ListSourcesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1beta1_ListSourcesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1beta1.ListSourcesResponse.class,
              com.google.cloud.securitycenter.v1beta1.ListSourcesResponse.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1beta1.ListSourcesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSourcesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sourcesBuilder_ == null) {
        sources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sourcesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1beta1_ListSourcesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.ListSourcesResponse getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1beta1.ListSourcesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.ListSourcesResponse build() {
      com.google.cloud.securitycenter.v1beta1.ListSourcesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.ListSourcesResponse buildPartial() {
      com.google.cloud.securitycenter.v1beta1.ListSourcesResponse result =
          new com.google.cloud.securitycenter.v1beta1.ListSourcesResponse(this);
      int from_bitField0_ = bitField0_;
      if (sourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sources_ = java.util.Collections.unmodifiableList(sources_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sources_ = sources_;
      } else {
        result.sources_ = sourcesBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v1beta1.ListSourcesResponse) {
        return mergeFrom((com.google.cloud.securitycenter.v1beta1.ListSourcesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1beta1.ListSourcesResponse other) {
      if (other == com.google.cloud.securitycenter.v1beta1.ListSourcesResponse.getDefaultInstance())
        return this;
      if (sourcesBuilder_ == null) {
        if (!other.sources_.isEmpty()) {
          if (sources_.isEmpty()) {
            sources_ = other.sources_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSourcesIsMutable();
            sources_.addAll(other.sources_);
          }
          onChanged();
        }
      } else {
        if (!other.sources_.isEmpty()) {
          if (sourcesBuilder_.isEmpty()) {
            sourcesBuilder_.dispose();
            sourcesBuilder_ = null;
            sources_ = other.sources_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sourcesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSourcesFieldBuilder()
                    : null;
          } else {
            sourcesBuilder_.addAllMessages(other.sources_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.securitycenter.v1beta1.ListSourcesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.securitycenter.v1beta1.ListSourcesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.securitycenter.v1beta1.Source> sources_ =
        java.util.Collections.emptyList();

    private void ensureSourcesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sources_ =
            new java.util.ArrayList<com.google.cloud.securitycenter.v1beta1.Source>(sources_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securitycenter.v1beta1.Source,
            com.google.cloud.securitycenter.v1beta1.Source.Builder,
            com.google.cloud.securitycenter.v1beta1.SourceOrBuilder>
        sourcesBuilder_;

    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public java.util.List<com.google.cloud.securitycenter.v1beta1.Source> getSourcesList() {
      if (sourcesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sources_);
      } else {
        return sourcesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public int getSourcesCount() {
      if (sourcesBuilder_ == null) {
        return sources_.size();
      } else {
        return sourcesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public com.google.cloud.securitycenter.v1beta1.Source getSources(int index) {
      if (sourcesBuilder_ == null) {
        return sources_.get(index);
      } else {
        return sourcesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public Builder setSources(int index, com.google.cloud.securitycenter.v1beta1.Source value) {
      if (sourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourcesIsMutable();
        sources_.set(index, value);
        onChanged();
      } else {
        sourcesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public Builder setSources(
        int index, com.google.cloud.securitycenter.v1beta1.Source.Builder builderForValue) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        sources_.set(index, builderForValue.build());
        onChanged();
      } else {
        sourcesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public Builder addSources(com.google.cloud.securitycenter.v1beta1.Source value) {
      if (sourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourcesIsMutable();
        sources_.add(value);
        onChanged();
      } else {
        sourcesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public Builder addSources(int index, com.google.cloud.securitycenter.v1beta1.Source value) {
      if (sourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourcesIsMutable();
        sources_.add(index, value);
        onChanged();
      } else {
        sourcesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public Builder addSources(
        com.google.cloud.securitycenter.v1beta1.Source.Builder builderForValue) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        sources_.add(builderForValue.build());
        onChanged();
      } else {
        sourcesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public Builder addSources(
        int index, com.google.cloud.securitycenter.v1beta1.Source.Builder builderForValue) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        sources_.add(index, builderForValue.build());
        onChanged();
      } else {
        sourcesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public Builder addAllSources(
        java.lang.Iterable<? extends com.google.cloud.securitycenter.v1beta1.Source> values) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, sources_);
        onChanged();
      } else {
        sourcesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public Builder clearSources() {
      if (sourcesBuilder_ == null) {
        sources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sourcesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public Builder removeSources(int index) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        sources_.remove(index);
        onChanged();
      } else {
        sourcesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public com.google.cloud.securitycenter.v1beta1.Source.Builder getSourcesBuilder(int index) {
      return getSourcesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public com.google.cloud.securitycenter.v1beta1.SourceOrBuilder getSourcesOrBuilder(int index) {
      if (sourcesBuilder_ == null) {
        return sources_.get(index);
      } else {
        return sourcesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.securitycenter.v1beta1.SourceOrBuilder>
        getSourcesOrBuilderList() {
      if (sourcesBuilder_ != null) {
        return sourcesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sources_);
      }
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public com.google.cloud.securitycenter.v1beta1.Source.Builder addSourcesBuilder() {
      return getSourcesFieldBuilder()
          .addBuilder(com.google.cloud.securitycenter.v1beta1.Source.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public com.google.cloud.securitycenter.v1beta1.Source.Builder addSourcesBuilder(int index) {
      return getSourcesFieldBuilder()
          .addBuilder(index, com.google.cloud.securitycenter.v1beta1.Source.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Sources belonging to the requested parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1beta1.Source sources = 1;</code>
     */
    public java.util.List<com.google.cloud.securitycenter.v1beta1.Source.Builder>
        getSourcesBuilderList() {
      return getSourcesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securitycenter.v1beta1.Source,
            com.google.cloud.securitycenter.v1beta1.Source.Builder,
            com.google.cloud.securitycenter.v1beta1.SourceOrBuilder>
        getSourcesFieldBuilder() {
      if (sourcesBuilder_ == null) {
        sourcesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.securitycenter.v1beta1.Source,
                com.google.cloud.securitycenter.v1beta1.Source.Builder,
                com.google.cloud.securitycenter.v1beta1.SourceOrBuilder>(
                sources_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        sources_ = null;
      }
      return sourcesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1beta1.ListSourcesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1beta1.ListSourcesResponse)
  private static final com.google.cloud.securitycenter.v1beta1.ListSourcesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1beta1.ListSourcesResponse();
  }

  public static com.google.cloud.securitycenter.v1beta1.ListSourcesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSourcesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSourcesResponse>() {
        @java.lang.Override
        public ListSourcesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListSourcesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListSourcesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSourcesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1beta1.ListSourcesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
