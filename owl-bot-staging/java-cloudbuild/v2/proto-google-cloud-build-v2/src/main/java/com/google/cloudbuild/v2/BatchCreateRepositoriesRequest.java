// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v2;

/**
 * <pre>
 * Message for creating repositoritories in batch.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v2.BatchCreateRepositoriesRequest}
 */
public final class BatchCreateRepositoriesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v2.BatchCreateRepositoriesRequest)
    BatchCreateRepositoriesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchCreateRepositoriesRequest.newBuilder() to construct.
  private BatchCreateRepositoriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchCreateRepositoriesRequest() {
    parent_ = "";
    requests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchCreateRepositoriesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v2.BatchCreateRepositoriesRequest.class, com.google.cloudbuild.v2.BatchCreateRepositoriesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The connection to contain all the repositories being created.
   * Format: projects/&#42;&#47;locations/&#42;&#47;connections/&#42;
   * The parent field in the CreateRepositoryRequest messages
   * must either be empty or match this field.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The connection to contain all the repositories being created.
   * Format: projects/&#42;&#47;locations/&#42;&#47;connections/&#42;
   * The parent field in the CreateRepositoryRequest messages
   * must either be empty or match this field.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUESTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloudbuild.v2.CreateRepositoryRequest> requests_;
  /**
   * <pre>
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloudbuild.v2.CreateRepositoryRequest> getRequestsList() {
    return requests_;
  }
  /**
   * <pre>
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder> 
      getRequestsOrBuilderList() {
    return requests_;
  }
  /**
   * <pre>
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getRequestsCount() {
    return requests_.size();
  }
  /**
   * <pre>
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v2.CreateRepositoryRequest getRequests(int index) {
    return requests_.get(index);
  }
  /**
   * <pre>
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder getRequestsOrBuilder(
      int index) {
    return requests_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < requests_.size(); i++) {
      output.writeMessage(2, requests_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    for (int i = 0; i < requests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, requests_.get(i));
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
    if (!(obj instanceof com.google.cloudbuild.v2.BatchCreateRepositoriesRequest)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v2.BatchCreateRepositoriesRequest other = (com.google.cloudbuild.v2.BatchCreateRepositoriesRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getRequestsList()
        .equals(other.getRequestsList())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getRequestsCount() > 0) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v2.BatchCreateRepositoriesRequest prototype) {
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
   * Message for creating repositoritories in batch.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v2.BatchCreateRepositoriesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v2.BatchCreateRepositoriesRequest)
      com.google.cloudbuild.v2.BatchCreateRepositoriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v2.BatchCreateRepositoriesRequest.class, com.google.cloudbuild.v2.BatchCreateRepositoriesRequest.Builder.class);
    }

    // Construct using com.google.cloudbuild.v2.BatchCreateRepositoriesRequest.newBuilder()
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
      parent_ = "";
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
      } else {
        requests_ = null;
        requestsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.BatchCreateRepositoriesRequest getDefaultInstanceForType() {
      return com.google.cloudbuild.v2.BatchCreateRepositoriesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.BatchCreateRepositoriesRequest build() {
      com.google.cloudbuild.v2.BatchCreateRepositoriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.BatchCreateRepositoriesRequest buildPartial() {
      com.google.cloudbuild.v2.BatchCreateRepositoriesRequest result = new com.google.cloudbuild.v2.BatchCreateRepositoriesRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloudbuild.v2.BatchCreateRepositoriesRequest result) {
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          requests_ = java.util.Collections.unmodifiableList(requests_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.requests_ = requests_;
      } else {
        result.requests_ = requestsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloudbuild.v2.BatchCreateRepositoriesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
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
      if (other instanceof com.google.cloudbuild.v2.BatchCreateRepositoriesRequest) {
        return mergeFrom((com.google.cloudbuild.v2.BatchCreateRepositoriesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v2.BatchCreateRepositoriesRequest other) {
      if (other == com.google.cloudbuild.v2.BatchCreateRepositoriesRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (requestsBuilder_ == null) {
        if (!other.requests_.isEmpty()) {
          if (requests_.isEmpty()) {
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRequestsIsMutable();
            requests_.addAll(other.requests_);
          }
          onChanged();
        }
      } else {
        if (!other.requests_.isEmpty()) {
          if (requestsBuilder_.isEmpty()) {
            requestsBuilder_.dispose();
            requestsBuilder_ = null;
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000002);
            requestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRequestsFieldBuilder() : null;
          } else {
            requestsBuilder_.addAllMessages(other.requests_);
          }
        }
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.cloudbuild.v2.CreateRepositoryRequest m =
                  input.readMessage(
                      com.google.cloudbuild.v2.CreateRepositoryRequest.parser(),
                      extensionRegistry);
              if (requestsBuilder_ == null) {
                ensureRequestsIsMutable();
                requests_.add(m);
              } else {
                requestsBuilder_.addMessage(m);
              }
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The connection to contain all the repositories being created.
     * Format: projects/&#42;&#47;locations/&#42;&#47;connections/&#42;
     * The parent field in the CreateRepositoryRequest messages
     * must either be empty or match this field.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The connection to contain all the repositories being created.
     * Format: projects/&#42;&#47;locations/&#42;&#47;connections/&#42;
     * The parent field in the CreateRepositoryRequest messages
     * must either be empty or match this field.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The connection to contain all the repositories being created.
     * Format: projects/&#42;&#47;locations/&#42;&#47;connections/&#42;
     * The parent field in the CreateRepositoryRequest messages
     * must either be empty or match this field.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The connection to contain all the repositories being created.
     * Format: projects/&#42;&#47;locations/&#42;&#47;connections/&#42;
     * The parent field in the CreateRepositoryRequest messages
     * must either be empty or match this field.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The connection to contain all the repositories being created.
     * Format: projects/&#42;&#47;locations/&#42;&#47;connections/&#42;
     * The parent field in the CreateRepositoryRequest messages
     * must either be empty or match this field.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloudbuild.v2.CreateRepositoryRequest> requests_ =
      java.util.Collections.emptyList();
    private void ensureRequestsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        requests_ = new java.util.ArrayList<com.google.cloudbuild.v2.CreateRepositoryRequest>(requests_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloudbuild.v2.CreateRepositoryRequest, com.google.cloudbuild.v2.CreateRepositoryRequest.Builder, com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder> requestsBuilder_;

    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloudbuild.v2.CreateRepositoryRequest> getRequestsList() {
      if (requestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requests_);
      } else {
        return requestsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getRequestsCount() {
      if (requestsBuilder_ == null) {
        return requests_.size();
      } else {
        return requestsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloudbuild.v2.CreateRepositoryRequest getRequests(int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRequests(
        int index, com.google.cloudbuild.v2.CreateRepositoryRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.set(index, value);
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRequests(
        int index, com.google.cloudbuild.v2.CreateRepositoryRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addRequests(com.google.cloudbuild.v2.CreateRepositoryRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addRequests(
        int index, com.google.cloudbuild.v2.CreateRepositoryRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(index, value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addRequests(
        com.google.cloudbuild.v2.CreateRepositoryRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addRequests(
        int index, com.google.cloudbuild.v2.CreateRepositoryRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllRequests(
        java.lang.Iterable<? extends com.google.cloudbuild.v2.CreateRepositoryRequest> values) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, requests_);
        onChanged();
      } else {
        requestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearRequests() {
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeRequests(int index) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.remove(index);
        onChanged();
      } else {
        requestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloudbuild.v2.CreateRepositoryRequest.Builder getRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder getRequestsOrBuilder(
        int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);  } else {
        return requestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder> 
         getRequestsOrBuilderList() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requests_);
      }
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloudbuild.v2.CreateRepositoryRequest.Builder addRequestsBuilder() {
      return getRequestsFieldBuilder().addBuilder(
          com.google.cloudbuild.v2.CreateRepositoryRequest.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloudbuild.v2.CreateRepositoryRequest.Builder addRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().addBuilder(
          index, com.google.cloudbuild.v2.CreateRepositoryRequest.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The request messages specifying the repositories to create.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloudbuild.v2.CreateRepositoryRequest.Builder> 
         getRequestsBuilderList() {
      return getRequestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloudbuild.v2.CreateRepositoryRequest, com.google.cloudbuild.v2.CreateRepositoryRequest.Builder, com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder> 
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloudbuild.v2.CreateRepositoryRequest, com.google.cloudbuild.v2.CreateRepositoryRequest.Builder, com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder>(
                requests_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        requests_ = null;
      }
      return requestsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v2.BatchCreateRepositoriesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v2.BatchCreateRepositoriesRequest)
  private static final com.google.cloudbuild.v2.BatchCreateRepositoriesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v2.BatchCreateRepositoriesRequest();
  }

  public static com.google.cloudbuild.v2.BatchCreateRepositoriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateRepositoriesRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchCreateRepositoriesRequest>() {
    @java.lang.Override
    public BatchCreateRepositoriesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateRepositoriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateRepositoriesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v2.BatchCreateRepositoriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

