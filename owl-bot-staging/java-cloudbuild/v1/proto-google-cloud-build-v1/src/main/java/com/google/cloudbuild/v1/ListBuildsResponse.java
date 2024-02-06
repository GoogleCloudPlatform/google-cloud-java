// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v1;

/**
 * <pre>
 * Response including listed builds.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.ListBuildsResponse}
 */
public final class ListBuildsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.ListBuildsResponse)
    ListBuildsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListBuildsResponse.newBuilder() to construct.
  private ListBuildsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListBuildsResponse() {
    builds_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListBuildsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ListBuildsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ListBuildsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.ListBuildsResponse.class, com.google.cloudbuild.v1.ListBuildsResponse.Builder.class);
  }

  public static final int BUILDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloudbuild.v1.Build> builds_;
  /**
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloudbuild.v1.Build> getBuildsList() {
    return builds_;
  }
  /**
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloudbuild.v1.BuildOrBuilder> 
      getBuildsOrBuilderList() {
    return builds_;
  }
  /**
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  @java.lang.Override
  public int getBuildsCount() {
    return builds_.size();
  }
  /**
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.Build getBuilds(int index) {
    return builds_.get(index);
  }
  /**
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.BuildOrBuilder getBuildsOrBuilder(
      int index) {
    return builds_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to receive the next page of results.
   * This will be absent if the end of the response list has been reached.
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
   * Token to receive the next page of results.
   * This will be absent if the end of the response list has been reached.
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
    for (int i = 0; i < builds_.size(); i++) {
      output.writeMessage(1, builds_.get(i));
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
    for (int i = 0; i < builds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, builds_.get(i));
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
    if (!(obj instanceof com.google.cloudbuild.v1.ListBuildsResponse)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.ListBuildsResponse other = (com.google.cloudbuild.v1.ListBuildsResponse) obj;

    if (!getBuildsList()
        .equals(other.getBuildsList())) return false;
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
    if (getBuildsCount() > 0) {
      hash = (37 * hash) + BUILDS_FIELD_NUMBER;
      hash = (53 * hash) + getBuildsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListBuildsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.ListBuildsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.ListBuildsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v1.ListBuildsResponse prototype) {
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
   * Response including listed builds.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.ListBuildsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.ListBuildsResponse)
      com.google.cloudbuild.v1.ListBuildsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ListBuildsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ListBuildsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.ListBuildsResponse.class, com.google.cloudbuild.v1.ListBuildsResponse.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.ListBuildsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (buildsBuilder_ == null) {
        builds_ = java.util.Collections.emptyList();
      } else {
        builds_ = null;
        buildsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_ListBuildsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ListBuildsResponse getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.ListBuildsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ListBuildsResponse build() {
      com.google.cloudbuild.v1.ListBuildsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ListBuildsResponse buildPartial() {
      com.google.cloudbuild.v1.ListBuildsResponse result = new com.google.cloudbuild.v1.ListBuildsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloudbuild.v1.ListBuildsResponse result) {
      if (buildsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          builds_ = java.util.Collections.unmodifiableList(builds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.builds_ = builds_;
      } else {
        result.builds_ = buildsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloudbuild.v1.ListBuildsResponse result) {
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
      if (other instanceof com.google.cloudbuild.v1.ListBuildsResponse) {
        return mergeFrom((com.google.cloudbuild.v1.ListBuildsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.ListBuildsResponse other) {
      if (other == com.google.cloudbuild.v1.ListBuildsResponse.getDefaultInstance()) return this;
      if (buildsBuilder_ == null) {
        if (!other.builds_.isEmpty()) {
          if (builds_.isEmpty()) {
            builds_ = other.builds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBuildsIsMutable();
            builds_.addAll(other.builds_);
          }
          onChanged();
        }
      } else {
        if (!other.builds_.isEmpty()) {
          if (buildsBuilder_.isEmpty()) {
            buildsBuilder_.dispose();
            buildsBuilder_ = null;
            builds_ = other.builds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            buildsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBuildsFieldBuilder() : null;
          } else {
            buildsBuilder_.addAllMessages(other.builds_);
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
            case 10: {
              com.google.cloudbuild.v1.Build m =
                  input.readMessage(
                      com.google.cloudbuild.v1.Build.parser(),
                      extensionRegistry);
              if (buildsBuilder_ == null) {
                ensureBuildsIsMutable();
                builds_.add(m);
              } else {
                buildsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.util.List<com.google.cloudbuild.v1.Build> builds_ =
      java.util.Collections.emptyList();
    private void ensureBuildsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        builds_ = new java.util.ArrayList<com.google.cloudbuild.v1.Build>(builds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloudbuild.v1.Build, com.google.cloudbuild.v1.Build.Builder, com.google.cloudbuild.v1.BuildOrBuilder> buildsBuilder_;

    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public java.util.List<com.google.cloudbuild.v1.Build> getBuildsList() {
      if (buildsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(builds_);
      } else {
        return buildsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public int getBuildsCount() {
      if (buildsBuilder_ == null) {
        return builds_.size();
      } else {
        return buildsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public com.google.cloudbuild.v1.Build getBuilds(int index) {
      if (buildsBuilder_ == null) {
        return builds_.get(index);
      } else {
        return buildsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public Builder setBuilds(
        int index, com.google.cloudbuild.v1.Build value) {
      if (buildsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBuildsIsMutable();
        builds_.set(index, value);
        onChanged();
      } else {
        buildsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public Builder setBuilds(
        int index, com.google.cloudbuild.v1.Build.Builder builderForValue) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        builds_.set(index, builderForValue.build());
        onChanged();
      } else {
        buildsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public Builder addBuilds(com.google.cloudbuild.v1.Build value) {
      if (buildsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBuildsIsMutable();
        builds_.add(value);
        onChanged();
      } else {
        buildsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public Builder addBuilds(
        int index, com.google.cloudbuild.v1.Build value) {
      if (buildsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBuildsIsMutable();
        builds_.add(index, value);
        onChanged();
      } else {
        buildsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public Builder addBuilds(
        com.google.cloudbuild.v1.Build.Builder builderForValue) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        builds_.add(builderForValue.build());
        onChanged();
      } else {
        buildsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public Builder addBuilds(
        int index, com.google.cloudbuild.v1.Build.Builder builderForValue) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        builds_.add(index, builderForValue.build());
        onChanged();
      } else {
        buildsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public Builder addAllBuilds(
        java.lang.Iterable<? extends com.google.cloudbuild.v1.Build> values) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, builds_);
        onChanged();
      } else {
        buildsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public Builder clearBuilds() {
      if (buildsBuilder_ == null) {
        builds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        buildsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public Builder removeBuilds(int index) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        builds_.remove(index);
        onChanged();
      } else {
        buildsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public com.google.cloudbuild.v1.Build.Builder getBuildsBuilder(
        int index) {
      return getBuildsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public com.google.cloudbuild.v1.BuildOrBuilder getBuildsOrBuilder(
        int index) {
      if (buildsBuilder_ == null) {
        return builds_.get(index);  } else {
        return buildsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public java.util.List<? extends com.google.cloudbuild.v1.BuildOrBuilder> 
         getBuildsOrBuilderList() {
      if (buildsBuilder_ != null) {
        return buildsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(builds_);
      }
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public com.google.cloudbuild.v1.Build.Builder addBuildsBuilder() {
      return getBuildsFieldBuilder().addBuilder(
          com.google.cloudbuild.v1.Build.getDefaultInstance());
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public com.google.cloudbuild.v1.Build.Builder addBuildsBuilder(
        int index) {
      return getBuildsFieldBuilder().addBuilder(
          index, com.google.cloudbuild.v1.Build.getDefaultInstance());
    }
    /**
     * <pre>
     * Builds will be sorted by `create_time`, descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
     */
    public java.util.List<com.google.cloudbuild.v1.Build.Builder> 
         getBuildsBuilderList() {
      return getBuildsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloudbuild.v1.Build, com.google.cloudbuild.v1.Build.Builder, com.google.cloudbuild.v1.BuildOrBuilder> 
        getBuildsFieldBuilder() {
      if (buildsBuilder_ == null) {
        buildsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloudbuild.v1.Build, com.google.cloudbuild.v1.Build.Builder, com.google.cloudbuild.v1.BuildOrBuilder>(
                builds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        builds_ = null;
      }
      return buildsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to receive the next page of results.
     * This will be absent if the end of the response list has been reached.
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
     * Token to receive the next page of results.
     * This will be absent if the end of the response list has been reached.
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
     * Token to receive the next page of results.
     * This will be absent if the end of the response list has been reached.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to receive the next page of results.
     * This will be absent if the end of the response list has been reached.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to receive the next page of results.
     * This will be absent if the end of the response list has been reached.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.ListBuildsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.ListBuildsResponse)
  private static final com.google.cloudbuild.v1.ListBuildsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.ListBuildsResponse();
  }

  public static com.google.cloudbuild.v1.ListBuildsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBuildsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListBuildsResponse>() {
    @java.lang.Override
    public ListBuildsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListBuildsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBuildsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.ListBuildsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

