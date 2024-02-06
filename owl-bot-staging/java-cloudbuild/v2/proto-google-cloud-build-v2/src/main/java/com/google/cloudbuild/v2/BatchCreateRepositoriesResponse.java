// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v2;

/**
 * <pre>
 * Message for response of creating repositories in batch.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v2.BatchCreateRepositoriesResponse}
 */
public final class BatchCreateRepositoriesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v2.BatchCreateRepositoriesResponse)
    BatchCreateRepositoriesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchCreateRepositoriesResponse.newBuilder() to construct.
  private BatchCreateRepositoriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchCreateRepositoriesResponse() {
    repositories_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchCreateRepositoriesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v2.BatchCreateRepositoriesResponse.class, com.google.cloudbuild.v2.BatchCreateRepositoriesResponse.Builder.class);
  }

  public static final int REPOSITORIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloudbuild.v2.Repository> repositories_;
  /**
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloudbuild.v2.Repository> getRepositoriesList() {
    return repositories_;
  }
  /**
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloudbuild.v2.RepositoryOrBuilder> 
      getRepositoriesOrBuilderList() {
    return repositories_;
  }
  /**
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public int getRepositoriesCount() {
    return repositories_.size();
  }
  /**
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v2.Repository getRepositories(int index) {
    return repositories_.get(index);
  }
  /**
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v2.RepositoryOrBuilder getRepositoriesOrBuilder(
      int index) {
    return repositories_.get(index);
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
    for (int i = 0; i < repositories_.size(); i++) {
      output.writeMessage(1, repositories_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < repositories_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, repositories_.get(i));
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
    if (!(obj instanceof com.google.cloudbuild.v2.BatchCreateRepositoriesResponse)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v2.BatchCreateRepositoriesResponse other = (com.google.cloudbuild.v2.BatchCreateRepositoriesResponse) obj;

    if (!getRepositoriesList()
        .equals(other.getRepositoriesList())) return false;
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
    if (getRepositoriesCount() > 0) {
      hash = (37 * hash) + REPOSITORIES_FIELD_NUMBER;
      hash = (53 * hash) + getRepositoriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v2.BatchCreateRepositoriesResponse prototype) {
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
   * Message for response of creating repositories in batch.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v2.BatchCreateRepositoriesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v2.BatchCreateRepositoriesResponse)
      com.google.cloudbuild.v2.BatchCreateRepositoriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v2.BatchCreateRepositoriesResponse.class, com.google.cloudbuild.v2.BatchCreateRepositoriesResponse.Builder.class);
    }

    // Construct using com.google.cloudbuild.v2.BatchCreateRepositoriesResponse.newBuilder()
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
      if (repositoriesBuilder_ == null) {
        repositories_ = java.util.Collections.emptyList();
      } else {
        repositories_ = null;
        repositoriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_BatchCreateRepositoriesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.BatchCreateRepositoriesResponse getDefaultInstanceForType() {
      return com.google.cloudbuild.v2.BatchCreateRepositoriesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.BatchCreateRepositoriesResponse build() {
      com.google.cloudbuild.v2.BatchCreateRepositoriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.BatchCreateRepositoriesResponse buildPartial() {
      com.google.cloudbuild.v2.BatchCreateRepositoriesResponse result = new com.google.cloudbuild.v2.BatchCreateRepositoriesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloudbuild.v2.BatchCreateRepositoriesResponse result) {
      if (repositoriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          repositories_ = java.util.Collections.unmodifiableList(repositories_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.repositories_ = repositories_;
      } else {
        result.repositories_ = repositoriesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloudbuild.v2.BatchCreateRepositoriesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloudbuild.v2.BatchCreateRepositoriesResponse) {
        return mergeFrom((com.google.cloudbuild.v2.BatchCreateRepositoriesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v2.BatchCreateRepositoriesResponse other) {
      if (other == com.google.cloudbuild.v2.BatchCreateRepositoriesResponse.getDefaultInstance()) return this;
      if (repositoriesBuilder_ == null) {
        if (!other.repositories_.isEmpty()) {
          if (repositories_.isEmpty()) {
            repositories_ = other.repositories_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRepositoriesIsMutable();
            repositories_.addAll(other.repositories_);
          }
          onChanged();
        }
      } else {
        if (!other.repositories_.isEmpty()) {
          if (repositoriesBuilder_.isEmpty()) {
            repositoriesBuilder_.dispose();
            repositoriesBuilder_ = null;
            repositories_ = other.repositories_;
            bitField0_ = (bitField0_ & ~0x00000001);
            repositoriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRepositoriesFieldBuilder() : null;
          } else {
            repositoriesBuilder_.addAllMessages(other.repositories_);
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
              com.google.cloudbuild.v2.Repository m =
                  input.readMessage(
                      com.google.cloudbuild.v2.Repository.parser(),
                      extensionRegistry);
              if (repositoriesBuilder_ == null) {
                ensureRepositoriesIsMutable();
                repositories_.add(m);
              } else {
                repositoriesBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private java.util.List<com.google.cloudbuild.v2.Repository> repositories_ =
      java.util.Collections.emptyList();
    private void ensureRepositoriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        repositories_ = new java.util.ArrayList<com.google.cloudbuild.v2.Repository>(repositories_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloudbuild.v2.Repository, com.google.cloudbuild.v2.Repository.Builder, com.google.cloudbuild.v2.RepositoryOrBuilder> repositoriesBuilder_;

    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public java.util.List<com.google.cloudbuild.v2.Repository> getRepositoriesList() {
      if (repositoriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(repositories_);
      } else {
        return repositoriesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public int getRepositoriesCount() {
      if (repositoriesBuilder_ == null) {
        return repositories_.size();
      } else {
        return repositoriesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public com.google.cloudbuild.v2.Repository getRepositories(int index) {
      if (repositoriesBuilder_ == null) {
        return repositories_.get(index);
      } else {
        return repositoriesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder setRepositories(
        int index, com.google.cloudbuild.v2.Repository value) {
      if (repositoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRepositoriesIsMutable();
        repositories_.set(index, value);
        onChanged();
      } else {
        repositoriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder setRepositories(
        int index, com.google.cloudbuild.v2.Repository.Builder builderForValue) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        repositories_.set(index, builderForValue.build());
        onChanged();
      } else {
        repositoriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addRepositories(com.google.cloudbuild.v2.Repository value) {
      if (repositoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRepositoriesIsMutable();
        repositories_.add(value);
        onChanged();
      } else {
        repositoriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addRepositories(
        int index, com.google.cloudbuild.v2.Repository value) {
      if (repositoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRepositoriesIsMutable();
        repositories_.add(index, value);
        onChanged();
      } else {
        repositoriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addRepositories(
        com.google.cloudbuild.v2.Repository.Builder builderForValue) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        repositories_.add(builderForValue.build());
        onChanged();
      } else {
        repositoriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addRepositories(
        int index, com.google.cloudbuild.v2.Repository.Builder builderForValue) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        repositories_.add(index, builderForValue.build());
        onChanged();
      } else {
        repositoriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder addAllRepositories(
        java.lang.Iterable<? extends com.google.cloudbuild.v2.Repository> values) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, repositories_);
        onChanged();
      } else {
        repositoriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder clearRepositories() {
      if (repositoriesBuilder_ == null) {
        repositories_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        repositoriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public Builder removeRepositories(int index) {
      if (repositoriesBuilder_ == null) {
        ensureRepositoriesIsMutable();
        repositories_.remove(index);
        onChanged();
      } else {
        repositoriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public com.google.cloudbuild.v2.Repository.Builder getRepositoriesBuilder(
        int index) {
      return getRepositoriesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public com.google.cloudbuild.v2.RepositoryOrBuilder getRepositoriesOrBuilder(
        int index) {
      if (repositoriesBuilder_ == null) {
        return repositories_.get(index);  } else {
        return repositoriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public java.util.List<? extends com.google.cloudbuild.v2.RepositoryOrBuilder> 
         getRepositoriesOrBuilderList() {
      if (repositoriesBuilder_ != null) {
        return repositoriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(repositories_);
      }
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public com.google.cloudbuild.v2.Repository.Builder addRepositoriesBuilder() {
      return getRepositoriesFieldBuilder().addBuilder(
          com.google.cloudbuild.v2.Repository.getDefaultInstance());
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public com.google.cloudbuild.v2.Repository.Builder addRepositoriesBuilder(
        int index) {
      return getRepositoriesFieldBuilder().addBuilder(
          index, com.google.cloudbuild.v2.Repository.getDefaultInstance());
    }
    /**
     * <pre>
     * Repository resources created.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
     */
    public java.util.List<com.google.cloudbuild.v2.Repository.Builder> 
         getRepositoriesBuilderList() {
      return getRepositoriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloudbuild.v2.Repository, com.google.cloudbuild.v2.Repository.Builder, com.google.cloudbuild.v2.RepositoryOrBuilder> 
        getRepositoriesFieldBuilder() {
      if (repositoriesBuilder_ == null) {
        repositoriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloudbuild.v2.Repository, com.google.cloudbuild.v2.Repository.Builder, com.google.cloudbuild.v2.RepositoryOrBuilder>(
                repositories_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        repositories_ = null;
      }
      return repositoriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v2.BatchCreateRepositoriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v2.BatchCreateRepositoriesResponse)
  private static final com.google.cloudbuild.v2.BatchCreateRepositoriesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v2.BatchCreateRepositoriesResponse();
  }

  public static com.google.cloudbuild.v2.BatchCreateRepositoriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateRepositoriesResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchCreateRepositoriesResponse>() {
    @java.lang.Override
    public BatchCreateRepositoriesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateRepositoriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateRepositoriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v2.BatchCreateRepositoriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

