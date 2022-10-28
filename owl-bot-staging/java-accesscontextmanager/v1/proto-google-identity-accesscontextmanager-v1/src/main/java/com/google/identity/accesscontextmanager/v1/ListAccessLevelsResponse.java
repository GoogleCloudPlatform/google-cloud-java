// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

/**
 * <pre>
 * A response to `ListAccessLevelsRequest`.
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.ListAccessLevelsResponse}
 */
public final class ListAccessLevelsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.ListAccessLevelsResponse)
    ListAccessLevelsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAccessLevelsResponse.newBuilder() to construct.
  private ListAccessLevelsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAccessLevelsResponse() {
    accessLevels_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAccessLevelsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_ListAccessLevelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_ListAccessLevelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse.class, com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse.Builder.class);
  }

  public static final int ACCESS_LEVELS_FIELD_NUMBER = 1;
  private java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel> accessLevels_;
  /**
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel> getAccessLevelsList() {
    return accessLevels_;
  }
  /**
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder> 
      getAccessLevelsOrBuilderList() {
    return accessLevels_;
  }
  /**
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public int getAccessLevelsCount() {
    return accessLevels_.size();
  }
  /**
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessLevel getAccessLevels(int index) {
    return accessLevels_.get(index);
  }
  /**
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder getAccessLevelsOrBuilder(
      int index) {
    return accessLevels_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The pagination token to retrieve the next page of results. If the value is
   * empty, no further results remain.
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
   * The pagination token to retrieve the next page of results. If the value is
   * empty, no further results remain.
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
    for (int i = 0; i < accessLevels_.size(); i++) {
      output.writeMessage(1, accessLevels_.get(i));
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
    for (int i = 0; i < accessLevels_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, accessLevels_.get(i));
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
    if (!(obj instanceof com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse other = (com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse) obj;

    if (!getAccessLevelsList()
        .equals(other.getAccessLevelsList())) return false;
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
    if (getAccessLevelsCount() > 0) {
      hash = (37 * hash) + ACCESS_LEVELS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessLevelsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse parseFrom(
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
  public static Builder newBuilder(com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse prototype) {
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
   * A response to `ListAccessLevelsRequest`.
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.ListAccessLevelsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.ListAccessLevelsResponse)
      com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_ListAccessLevelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_ListAccessLevelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse.class, com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse.Builder.class);
    }

    // Construct using com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (accessLevelsBuilder_ == null) {
        accessLevels_ = java.util.Collections.emptyList();
      } else {
        accessLevels_ = null;
        accessLevelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_ListAccessLevelsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse build() {
      com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse buildPartial() {
      com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse result = new com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse(this);
      int from_bitField0_ = bitField0_;
      if (accessLevelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accessLevels_ = java.util.Collections.unmodifiableList(accessLevels_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accessLevels_ = accessLevels_;
      } else {
        result.accessLevels_ = accessLevelsBuilder_.build();
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
      if (other instanceof com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse) {
        return mergeFrom((com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse other) {
      if (other == com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse.getDefaultInstance()) return this;
      if (accessLevelsBuilder_ == null) {
        if (!other.accessLevels_.isEmpty()) {
          if (accessLevels_.isEmpty()) {
            accessLevels_ = other.accessLevels_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccessLevelsIsMutable();
            accessLevels_.addAll(other.accessLevels_);
          }
          onChanged();
        }
      } else {
        if (!other.accessLevels_.isEmpty()) {
          if (accessLevelsBuilder_.isEmpty()) {
            accessLevelsBuilder_.dispose();
            accessLevelsBuilder_ = null;
            accessLevels_ = other.accessLevels_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accessLevelsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccessLevelsFieldBuilder() : null;
          } else {
            accessLevelsBuilder_.addAllMessages(other.accessLevels_);
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
              com.google.identity.accesscontextmanager.v1.AccessLevel m =
                  input.readMessage(
                      com.google.identity.accesscontextmanager.v1.AccessLevel.parser(),
                      extensionRegistry);
              if (accessLevelsBuilder_ == null) {
                ensureAccessLevelsIsMutable();
                accessLevels_.add(m);
              } else {
                accessLevelsBuilder_.addMessage(m);
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

    private java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel> accessLevels_ =
      java.util.Collections.emptyList();
    private void ensureAccessLevelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accessLevels_ = new java.util.ArrayList<com.google.identity.accesscontextmanager.v1.AccessLevel>(accessLevels_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.identity.accesscontextmanager.v1.AccessLevel, com.google.identity.accesscontextmanager.v1.AccessLevel.Builder, com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder> accessLevelsBuilder_;

    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel> getAccessLevelsList() {
      if (accessLevelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accessLevels_);
      } else {
        return accessLevelsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public int getAccessLevelsCount() {
      if (accessLevelsBuilder_ == null) {
        return accessLevels_.size();
      } else {
        return accessLevelsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel getAccessLevels(int index) {
      if (accessLevelsBuilder_ == null) {
        return accessLevels_.get(index);
      } else {
        return accessLevelsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder setAccessLevels(
        int index, com.google.identity.accesscontextmanager.v1.AccessLevel value) {
      if (accessLevelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessLevelsIsMutable();
        accessLevels_.set(index, value);
        onChanged();
      } else {
        accessLevelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder setAccessLevels(
        int index, com.google.identity.accesscontextmanager.v1.AccessLevel.Builder builderForValue) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        accessLevels_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessLevelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAccessLevels(com.google.identity.accesscontextmanager.v1.AccessLevel value) {
      if (accessLevelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessLevelsIsMutable();
        accessLevels_.add(value);
        onChanged();
      } else {
        accessLevelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAccessLevels(
        int index, com.google.identity.accesscontextmanager.v1.AccessLevel value) {
      if (accessLevelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessLevelsIsMutable();
        accessLevels_.add(index, value);
        onChanged();
      } else {
        accessLevelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAccessLevels(
        com.google.identity.accesscontextmanager.v1.AccessLevel.Builder builderForValue) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        accessLevels_.add(builderForValue.build());
        onChanged();
      } else {
        accessLevelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAccessLevels(
        int index, com.google.identity.accesscontextmanager.v1.AccessLevel.Builder builderForValue) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        accessLevels_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessLevelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder addAllAccessLevels(
        java.lang.Iterable<? extends com.google.identity.accesscontextmanager.v1.AccessLevel> values) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accessLevels_);
        onChanged();
      } else {
        accessLevelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder clearAccessLevels() {
      if (accessLevelsBuilder_ == null) {
        accessLevels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accessLevelsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public Builder removeAccessLevels(int index) {
      if (accessLevelsBuilder_ == null) {
        ensureAccessLevelsIsMutable();
        accessLevels_.remove(index);
        onChanged();
      } else {
        accessLevelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel.Builder getAccessLevelsBuilder(
        int index) {
      return getAccessLevelsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder getAccessLevelsOrBuilder(
        int index) {
      if (accessLevelsBuilder_ == null) {
        return accessLevels_.get(index);  } else {
        return accessLevelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public java.util.List<? extends com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder> 
         getAccessLevelsOrBuilderList() {
      if (accessLevelsBuilder_ != null) {
        return accessLevelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accessLevels_);
      }
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel.Builder addAccessLevelsBuilder() {
      return getAccessLevelsFieldBuilder().addBuilder(
          com.google.identity.accesscontextmanager.v1.AccessLevel.getDefaultInstance());
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel.Builder addAccessLevelsBuilder(
        int index) {
      return getAccessLevelsFieldBuilder().addBuilder(
          index, com.google.identity.accesscontextmanager.v1.AccessLevel.getDefaultInstance());
    }
    /**
     * <pre>
     * List of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
     */
    public java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel.Builder> 
         getAccessLevelsBuilderList() {
      return getAccessLevelsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.identity.accesscontextmanager.v1.AccessLevel, com.google.identity.accesscontextmanager.v1.AccessLevel.Builder, com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder> 
        getAccessLevelsFieldBuilder() {
      if (accessLevelsBuilder_ == null) {
        accessLevelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.AccessLevel, com.google.identity.accesscontextmanager.v1.AccessLevel.Builder, com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>(
                accessLevels_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accessLevels_ = null;
      }
      return accessLevelsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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
     * The pagination token to retrieve the next page of results. If the value is
     * empty, no further results remain.
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


    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.ListAccessLevelsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.ListAccessLevelsResponse)
  private static final com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse();
  }

  public static com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAccessLevelsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAccessLevelsResponse>() {
    @java.lang.Override
    public ListAccessLevelsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAccessLevelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAccessLevelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.ListAccessLevelsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

