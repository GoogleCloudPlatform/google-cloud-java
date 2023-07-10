// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A request message for GlobalPublicDelegatedPrefixes.Get. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest}
 */
public final class GetGlobalPublicDelegatedPrefixeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest)
    GetGlobalPublicDelegatedPrefixeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGlobalPublicDelegatedPrefixeRequest.newBuilder() to construct.
  private GetGlobalPublicDelegatedPrefixeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGlobalPublicDelegatedPrefixeRequest() {
    project_ = "";
    publicDelegatedPrefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGlobalPublicDelegatedPrefixeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetGlobalPublicDelegatedPrefixeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetGlobalPublicDelegatedPrefixeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest.class, com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 227560217;
  @SuppressWarnings("serial")
  private volatile java.lang.Object project_ = "";
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLIC_DELEGATED_PREFIX_FIELD_NUMBER = 204238440;
  @SuppressWarnings("serial")
  private volatile java.lang.Object publicDelegatedPrefix_ = "";
  /**
   * <pre>
   * Name of the PublicDelegatedPrefix resource to return.
   * </pre>
   *
   * <code>string public_delegated_prefix = 204238440 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The publicDelegatedPrefix.
   */
  @java.lang.Override
  public java.lang.String getPublicDelegatedPrefix() {
    java.lang.Object ref = publicDelegatedPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publicDelegatedPrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the PublicDelegatedPrefix resource to return.
   * </pre>
   *
   * <code>string public_delegated_prefix = 204238440 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for publicDelegatedPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPublicDelegatedPrefixBytes() {
    java.lang.Object ref = publicDelegatedPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publicDelegatedPrefix_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicDelegatedPrefix_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 204238440, publicDelegatedPrefix_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicDelegatedPrefix_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(204238440, publicDelegatedPrefix_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest other = (com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest) obj;

    if (!getProject()
        .equals(other.getProject())) return false;
    if (!getPublicDelegatedPrefix()
        .equals(other.getPublicDelegatedPrefix())) return false;
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
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + PUBLIC_DELEGATED_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getPublicDelegatedPrefix().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest prototype) {
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
   * A request message for GlobalPublicDelegatedPrefixes.Get. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest)
      com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetGlobalPublicDelegatedPrefixeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetGlobalPublicDelegatedPrefixeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest.class, com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest.newBuilder()
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
      project_ = "";
      publicDelegatedPrefix_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetGlobalPublicDelegatedPrefixeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest build() {
      com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest buildPartial() {
      com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest result = new com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.project_ = project_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.publicDelegatedPrefix_ = publicDelegatedPrefix_;
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
      if (other instanceof com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest) {
        return mergeFrom((com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest other) {
      if (other == com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest.getDefaultInstance()) return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPublicDelegatedPrefix().isEmpty()) {
        publicDelegatedPrefix_ = other.publicDelegatedPrefix_;
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
            case 1633907522: {
              publicDelegatedPrefix_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 1633907522
            case 1820481738: {
              project_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 1820481738
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

    private java.lang.Object project_ = "";
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString
        getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object publicDelegatedPrefix_ = "";
    /**
     * <pre>
     * Name of the PublicDelegatedPrefix resource to return.
     * </pre>
     *
     * <code>string public_delegated_prefix = 204238440 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The publicDelegatedPrefix.
     */
    public java.lang.String getPublicDelegatedPrefix() {
      java.lang.Object ref = publicDelegatedPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publicDelegatedPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the PublicDelegatedPrefix resource to return.
     * </pre>
     *
     * <code>string public_delegated_prefix = 204238440 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for publicDelegatedPrefix.
     */
    public com.google.protobuf.ByteString
        getPublicDelegatedPrefixBytes() {
      java.lang.Object ref = publicDelegatedPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publicDelegatedPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the PublicDelegatedPrefix resource to return.
     * </pre>
     *
     * <code>string public_delegated_prefix = 204238440 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The publicDelegatedPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setPublicDelegatedPrefix(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      publicDelegatedPrefix_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the PublicDelegatedPrefix resource to return.
     * </pre>
     *
     * <code>string public_delegated_prefix = 204238440 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPublicDelegatedPrefix() {
      publicDelegatedPrefix_ = getDefaultInstance().getPublicDelegatedPrefix();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the PublicDelegatedPrefix resource to return.
     * </pre>
     *
     * <code>string public_delegated_prefix = 204238440 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for publicDelegatedPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setPublicDelegatedPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      publicDelegatedPrefix_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest)
  private static final com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest();
  }

  public static com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGlobalPublicDelegatedPrefixeRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetGlobalPublicDelegatedPrefixeRequest>() {
    @java.lang.Override
    public GetGlobalPublicDelegatedPrefixeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetGlobalPublicDelegatedPrefixeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGlobalPublicDelegatedPrefixeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GetGlobalPublicDelegatedPrefixeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

