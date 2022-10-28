// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/operation.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Metadata for the given [google.longrunning.Operation][google.longrunning.Operation] during a
 * [google.appengine.v1.CreateVersionRequest][google.appengine.v1.CreateVersionRequest].
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.CreateVersionMetadataV1}
 */
public final class CreateVersionMetadataV1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.CreateVersionMetadataV1)
    CreateVersionMetadataV1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateVersionMetadataV1.newBuilder() to construct.
  private CreateVersionMetadataV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateVersionMetadataV1() {
    cloudBuildId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateVersionMetadataV1();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.OperationProto.internal_static_google_appengine_v1_CreateVersionMetadataV1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.OperationProto.internal_static_google_appengine_v1_CreateVersionMetadataV1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.CreateVersionMetadataV1.class, com.google.appengine.v1.CreateVersionMetadataV1.Builder.class);
  }

  public static final int CLOUD_BUILD_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object cloudBuildId_;
  /**
   * <pre>
   * The Cloud Build ID if one was created as part of the version create.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string cloud_build_id = 1;</code>
   * @return The cloudBuildId.
   */
  @java.lang.Override
  public java.lang.String getCloudBuildId() {
    java.lang.Object ref = cloudBuildId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cloudBuildId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Cloud Build ID if one was created as part of the version create.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string cloud_build_id = 1;</code>
   * @return The bytes for cloudBuildId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCloudBuildIdBytes() {
    java.lang.Object ref = cloudBuildId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cloudBuildId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cloudBuildId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cloudBuildId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cloudBuildId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cloudBuildId_);
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
    if (!(obj instanceof com.google.appengine.v1.CreateVersionMetadataV1)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.CreateVersionMetadataV1 other = (com.google.appengine.v1.CreateVersionMetadataV1) obj;

    if (!getCloudBuildId()
        .equals(other.getCloudBuildId())) return false;
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
    hash = (37 * hash) + CLOUD_BUILD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCloudBuildId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.CreateVersionMetadataV1 parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.CreateVersionMetadataV1 prototype) {
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
   * Metadata for the given [google.longrunning.Operation][google.longrunning.Operation] during a
   * [google.appengine.v1.CreateVersionRequest][google.appengine.v1.CreateVersionRequest].
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.CreateVersionMetadataV1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.CreateVersionMetadataV1)
      com.google.appengine.v1.CreateVersionMetadataV1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.OperationProto.internal_static_google_appengine_v1_CreateVersionMetadataV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.OperationProto.internal_static_google_appengine_v1_CreateVersionMetadataV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.CreateVersionMetadataV1.class, com.google.appengine.v1.CreateVersionMetadataV1.Builder.class);
    }

    // Construct using com.google.appengine.v1.CreateVersionMetadataV1.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      cloudBuildId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.OperationProto.internal_static_google_appengine_v1_CreateVersionMetadataV1_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateVersionMetadataV1 getDefaultInstanceForType() {
      return com.google.appengine.v1.CreateVersionMetadataV1.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateVersionMetadataV1 build() {
      com.google.appengine.v1.CreateVersionMetadataV1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateVersionMetadataV1 buildPartial() {
      com.google.appengine.v1.CreateVersionMetadataV1 result = new com.google.appengine.v1.CreateVersionMetadataV1(this);
      result.cloudBuildId_ = cloudBuildId_;
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
      if (other instanceof com.google.appengine.v1.CreateVersionMetadataV1) {
        return mergeFrom((com.google.appengine.v1.CreateVersionMetadataV1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.CreateVersionMetadataV1 other) {
      if (other == com.google.appengine.v1.CreateVersionMetadataV1.getDefaultInstance()) return this;
      if (!other.getCloudBuildId().isEmpty()) {
        cloudBuildId_ = other.cloudBuildId_;
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
              cloudBuildId_ = input.readStringRequireUtf8();

              break;
            } // case 10
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

    private java.lang.Object cloudBuildId_ = "";
    /**
     * <pre>
     * The Cloud Build ID if one was created as part of the version create.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @return The cloudBuildId.
     */
    public java.lang.String getCloudBuildId() {
      java.lang.Object ref = cloudBuildId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cloudBuildId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Cloud Build ID if one was created as part of the version create.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @return The bytes for cloudBuildId.
     */
    public com.google.protobuf.ByteString
        getCloudBuildIdBytes() {
      java.lang.Object ref = cloudBuildId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cloudBuildId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Cloud Build ID if one was created as part of the version create.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @param value The cloudBuildId to set.
     * @return This builder for chaining.
     */
    public Builder setCloudBuildId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cloudBuildId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud Build ID if one was created as part of the version create.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCloudBuildId() {
      
      cloudBuildId_ = getDefaultInstance().getCloudBuildId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud Build ID if one was created as part of the version create.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>string cloud_build_id = 1;</code>
     * @param value The bytes for cloudBuildId to set.
     * @return This builder for chaining.
     */
    public Builder setCloudBuildIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cloudBuildId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.CreateVersionMetadataV1)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.CreateVersionMetadataV1)
  private static final com.google.appengine.v1.CreateVersionMetadataV1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.CreateVersionMetadataV1();
  }

  public static com.google.appengine.v1.CreateVersionMetadataV1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateVersionMetadataV1>
      PARSER = new com.google.protobuf.AbstractParser<CreateVersionMetadataV1>() {
    @java.lang.Override
    public CreateVersionMetadataV1 parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateVersionMetadataV1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateVersionMetadataV1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.CreateVersionMetadataV1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

