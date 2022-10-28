// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 * <pre>
 * Response message for
 * [KeyManagementService.ListKeyRings][google.cloud.kms.v1.KeyManagementService.ListKeyRings].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.ListKeyRingsResponse}
 */
public final class ListKeyRingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.ListKeyRingsResponse)
    ListKeyRingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListKeyRingsResponse.newBuilder() to construct.
  private ListKeyRingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListKeyRingsResponse() {
    keyRings_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListKeyRingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListKeyRingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListKeyRingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.ListKeyRingsResponse.class, com.google.cloud.kms.v1.ListKeyRingsResponse.Builder.class);
  }

  public static final int KEY_RINGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.kms.v1.KeyRing> keyRings_;
  /**
   * <pre>
   * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.kms.v1.KeyRing> getKeyRingsList() {
    return keyRings_;
  }
  /**
   * <pre>
   * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.kms.v1.KeyRingOrBuilder> 
      getKeyRingsOrBuilderList() {
    return keyRings_;
  }
  /**
   * <pre>
   * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
   */
  @java.lang.Override
  public int getKeyRingsCount() {
    return keyRings_.size();
  }
  /**
   * <pre>
   * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.KeyRing getKeyRings(int index) {
    return keyRings_.get(index);
  }
  /**
   * <pre>
   * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.KeyRingOrBuilder getKeyRingsOrBuilder(
      int index) {
    return keyRings_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListKeyRingsRequest.page_token][google.cloud.kms.v1.ListKeyRingsRequest.page_token]
   * to retrieve the next page of results.
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
   * A token to retrieve next page of results. Pass this value in
   * [ListKeyRingsRequest.page_token][google.cloud.kms.v1.ListKeyRingsRequest.page_token]
   * to retrieve the next page of results.
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

  public static final int TOTAL_SIZE_FIELD_NUMBER = 3;
  private int totalSize_;
  /**
   * <pre>
   * The total number of [KeyRings][google.cloud.kms.v1.KeyRing] that matched
   * the query.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   * @return The totalSize.
   */
  @java.lang.Override
  public int getTotalSize() {
    return totalSize_;
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
    for (int i = 0; i < keyRings_.size(); i++) {
      output.writeMessage(1, keyRings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      output.writeInt32(3, totalSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < keyRings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, keyRings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalSize_);
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
    if (!(obj instanceof com.google.cloud.kms.v1.ListKeyRingsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.ListKeyRingsResponse other = (com.google.cloud.kms.v1.ListKeyRingsResponse) obj;

    if (!getKeyRingsList()
        .equals(other.getKeyRingsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (getTotalSize()
        != other.getTotalSize()) return false;
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
    if (getKeyRingsCount() > 0) {
      hash = (37 * hash) + KEY_RINGS_FIELD_NUMBER;
      hash = (53 * hash) + getKeyRingsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.ListKeyRingsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.kms.v1.ListKeyRingsResponse prototype) {
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
   * Response message for
   * [KeyManagementService.ListKeyRings][google.cloud.kms.v1.KeyManagementService.ListKeyRings].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.ListKeyRingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.ListKeyRingsResponse)
      com.google.cloud.kms.v1.ListKeyRingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListKeyRingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListKeyRingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.ListKeyRingsResponse.class, com.google.cloud.kms.v1.ListKeyRingsResponse.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.ListKeyRingsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyRingsBuilder_ == null) {
        keyRings_ = java.util.Collections.emptyList();
      } else {
        keyRings_ = null;
        keyRingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      totalSize_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_ListKeyRingsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.ListKeyRingsResponse getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.ListKeyRingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.ListKeyRingsResponse build() {
      com.google.cloud.kms.v1.ListKeyRingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.ListKeyRingsResponse buildPartial() {
      com.google.cloud.kms.v1.ListKeyRingsResponse result = new com.google.cloud.kms.v1.ListKeyRingsResponse(this);
      int from_bitField0_ = bitField0_;
      if (keyRingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keyRings_ = java.util.Collections.unmodifiableList(keyRings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keyRings_ = keyRings_;
      } else {
        result.keyRings_ = keyRingsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.totalSize_ = totalSize_;
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
      if (other instanceof com.google.cloud.kms.v1.ListKeyRingsResponse) {
        return mergeFrom((com.google.cloud.kms.v1.ListKeyRingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.ListKeyRingsResponse other) {
      if (other == com.google.cloud.kms.v1.ListKeyRingsResponse.getDefaultInstance()) return this;
      if (keyRingsBuilder_ == null) {
        if (!other.keyRings_.isEmpty()) {
          if (keyRings_.isEmpty()) {
            keyRings_ = other.keyRings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeyRingsIsMutable();
            keyRings_.addAll(other.keyRings_);
          }
          onChanged();
        }
      } else {
        if (!other.keyRings_.isEmpty()) {
          if (keyRingsBuilder_.isEmpty()) {
            keyRingsBuilder_.dispose();
            keyRingsBuilder_ = null;
            keyRings_ = other.keyRings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keyRingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeyRingsFieldBuilder() : null;
          } else {
            keyRingsBuilder_.addAllMessages(other.keyRings_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      if (other.getTotalSize() != 0) {
        setTotalSize(other.getTotalSize());
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
              com.google.cloud.kms.v1.KeyRing m =
                  input.readMessage(
                      com.google.cloud.kms.v1.KeyRing.parser(),
                      extensionRegistry);
              if (keyRingsBuilder_ == null) {
                ensureKeyRingsIsMutable();
                keyRings_.add(m);
              } else {
                keyRingsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              totalSize_ = input.readInt32();

              break;
            } // case 24
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

    private java.util.List<com.google.cloud.kms.v1.KeyRing> keyRings_ =
      java.util.Collections.emptyList();
    private void ensureKeyRingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keyRings_ = new java.util.ArrayList<com.google.cloud.kms.v1.KeyRing>(keyRings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.kms.v1.KeyRing, com.google.cloud.kms.v1.KeyRing.Builder, com.google.cloud.kms.v1.KeyRingOrBuilder> keyRingsBuilder_;

    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public java.util.List<com.google.cloud.kms.v1.KeyRing> getKeyRingsList() {
      if (keyRingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keyRings_);
      } else {
        return keyRingsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public int getKeyRingsCount() {
      if (keyRingsBuilder_ == null) {
        return keyRings_.size();
      } else {
        return keyRingsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public com.google.cloud.kms.v1.KeyRing getKeyRings(int index) {
      if (keyRingsBuilder_ == null) {
        return keyRings_.get(index);
      } else {
        return keyRingsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public Builder setKeyRings(
        int index, com.google.cloud.kms.v1.KeyRing value) {
      if (keyRingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyRingsIsMutable();
        keyRings_.set(index, value);
        onChanged();
      } else {
        keyRingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public Builder setKeyRings(
        int index, com.google.cloud.kms.v1.KeyRing.Builder builderForValue) {
      if (keyRingsBuilder_ == null) {
        ensureKeyRingsIsMutable();
        keyRings_.set(index, builderForValue.build());
        onChanged();
      } else {
        keyRingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public Builder addKeyRings(com.google.cloud.kms.v1.KeyRing value) {
      if (keyRingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyRingsIsMutable();
        keyRings_.add(value);
        onChanged();
      } else {
        keyRingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public Builder addKeyRings(
        int index, com.google.cloud.kms.v1.KeyRing value) {
      if (keyRingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyRingsIsMutable();
        keyRings_.add(index, value);
        onChanged();
      } else {
        keyRingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public Builder addKeyRings(
        com.google.cloud.kms.v1.KeyRing.Builder builderForValue) {
      if (keyRingsBuilder_ == null) {
        ensureKeyRingsIsMutable();
        keyRings_.add(builderForValue.build());
        onChanged();
      } else {
        keyRingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public Builder addKeyRings(
        int index, com.google.cloud.kms.v1.KeyRing.Builder builderForValue) {
      if (keyRingsBuilder_ == null) {
        ensureKeyRingsIsMutable();
        keyRings_.add(index, builderForValue.build());
        onChanged();
      } else {
        keyRingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public Builder addAllKeyRings(
        java.lang.Iterable<? extends com.google.cloud.kms.v1.KeyRing> values) {
      if (keyRingsBuilder_ == null) {
        ensureKeyRingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keyRings_);
        onChanged();
      } else {
        keyRingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public Builder clearKeyRings() {
      if (keyRingsBuilder_ == null) {
        keyRings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keyRingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public Builder removeKeyRings(int index) {
      if (keyRingsBuilder_ == null) {
        ensureKeyRingsIsMutable();
        keyRings_.remove(index);
        onChanged();
      } else {
        keyRingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public com.google.cloud.kms.v1.KeyRing.Builder getKeyRingsBuilder(
        int index) {
      return getKeyRingsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public com.google.cloud.kms.v1.KeyRingOrBuilder getKeyRingsOrBuilder(
        int index) {
      if (keyRingsBuilder_ == null) {
        return keyRings_.get(index);  } else {
        return keyRingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.kms.v1.KeyRingOrBuilder> 
         getKeyRingsOrBuilderList() {
      if (keyRingsBuilder_ != null) {
        return keyRingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keyRings_);
      }
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public com.google.cloud.kms.v1.KeyRing.Builder addKeyRingsBuilder() {
      return getKeyRingsFieldBuilder().addBuilder(
          com.google.cloud.kms.v1.KeyRing.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public com.google.cloud.kms.v1.KeyRing.Builder addKeyRingsBuilder(
        int index) {
      return getKeyRingsFieldBuilder().addBuilder(
          index, com.google.cloud.kms.v1.KeyRing.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of [KeyRings][google.cloud.kms.v1.KeyRing].
     * </pre>
     *
     * <code>repeated .google.cloud.kms.v1.KeyRing key_rings = 1;</code>
     */
    public java.util.List<com.google.cloud.kms.v1.KeyRing.Builder> 
         getKeyRingsBuilderList() {
      return getKeyRingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.kms.v1.KeyRing, com.google.cloud.kms.v1.KeyRing.Builder, com.google.cloud.kms.v1.KeyRingOrBuilder> 
        getKeyRingsFieldBuilder() {
      if (keyRingsBuilder_ == null) {
        keyRingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.kms.v1.KeyRing, com.google.cloud.kms.v1.KeyRing.Builder, com.google.cloud.kms.v1.KeyRingOrBuilder>(
                keyRings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        keyRings_ = null;
      }
      return keyRingsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results. Pass this value in
     * [ListKeyRingsRequest.page_token][google.cloud.kms.v1.ListKeyRingsRequest.page_token]
     * to retrieve the next page of results.
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
     * A token to retrieve next page of results. Pass this value in
     * [ListKeyRingsRequest.page_token][google.cloud.kms.v1.ListKeyRingsRequest.page_token]
     * to retrieve the next page of results.
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
     * A token to retrieve next page of results. Pass this value in
     * [ListKeyRingsRequest.page_token][google.cloud.kms.v1.ListKeyRingsRequest.page_token]
     * to retrieve the next page of results.
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
     * A token to retrieve next page of results. Pass this value in
     * [ListKeyRingsRequest.page_token][google.cloud.kms.v1.ListKeyRingsRequest.page_token]
     * to retrieve the next page of results.
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
     * A token to retrieve next page of results. Pass this value in
     * [ListKeyRingsRequest.page_token][google.cloud.kms.v1.ListKeyRingsRequest.page_token]
     * to retrieve the next page of results.
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

    private int totalSize_ ;
    /**
     * <pre>
     * The total number of [KeyRings][google.cloud.kms.v1.KeyRing] that matched
     * the query.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @return The totalSize.
     */
    @java.lang.Override
    public int getTotalSize() {
      return totalSize_;
    }
    /**
     * <pre>
     * The total number of [KeyRings][google.cloud.kms.v1.KeyRing] that matched
     * the query.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(int value) {
      
      totalSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of [KeyRings][google.cloud.kms.v1.KeyRing] that matched
     * the query.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {
      
      totalSize_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.ListKeyRingsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.ListKeyRingsResponse)
  private static final com.google.cloud.kms.v1.ListKeyRingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.ListKeyRingsResponse();
  }

  public static com.google.cloud.kms.v1.ListKeyRingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListKeyRingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListKeyRingsResponse>() {
    @java.lang.Override
    public ListKeyRingsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListKeyRingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListKeyRingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.ListKeyRingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

