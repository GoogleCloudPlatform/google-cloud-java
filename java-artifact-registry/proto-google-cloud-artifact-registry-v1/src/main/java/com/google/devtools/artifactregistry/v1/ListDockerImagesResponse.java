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
// source: google/devtools/artifactregistry/v1/artifact.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.artifactregistry.v1;

/**
 *
 *
 * <pre>
 * The response from listing docker images.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1.ListDockerImagesResponse}
 */
public final class ListDockerImagesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1.ListDockerImagesResponse)
    ListDockerImagesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDockerImagesResponse.newBuilder() to construct.
  private ListDockerImagesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDockerImagesResponse() {
    dockerImages_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDockerImagesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.artifactregistry.v1.ArtifactProto
        .internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1.ArtifactProto
        .internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1.ListDockerImagesResponse.class,
            com.google.devtools.artifactregistry.v1.ListDockerImagesResponse.Builder.class);
  }

  public static final int DOCKER_IMAGES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.devtools.artifactregistry.v1.DockerImage> dockerImages_;
  /**
   *
   *
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.artifactregistry.v1.DockerImage> getDockerImagesList() {
    return dockerImages_;
  }
  /**
   *
   *
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.artifactregistry.v1.DockerImageOrBuilder>
      getDockerImagesOrBuilderList() {
    return dockerImages_;
  }
  /**
   *
   *
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  @java.lang.Override
  public int getDockerImagesCount() {
    return dockerImages_.size();
  }
  /**
   *
   *
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.DockerImage getDockerImages(int index) {
    return dockerImages_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The docker images returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.DockerImageOrBuilder getDockerImagesOrBuilder(
      int index) {
    return dockerImages_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * The token to retrieve the next page of artifacts, or empty if there are no
   * more artifacts to return.
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
   * The token to retrieve the next page of artifacts, or empty if there are no
   * more artifacts to return.
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
    for (int i = 0; i < dockerImages_.size(); i++) {
      output.writeMessage(1, dockerImages_.get(i));
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
    for (int i = 0; i < dockerImages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, dockerImages_.get(i));
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1.ListDockerImagesResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1.ListDockerImagesResponse other =
        (com.google.devtools.artifactregistry.v1.ListDockerImagesResponse) obj;

    if (!getDockerImagesList().equals(other.getDockerImagesList())) return false;
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
    if (getDockerImagesCount() > 0) {
      hash = (37 * hash) + DOCKER_IMAGES_FIELD_NUMBER;
      hash = (53 * hash) + getDockerImagesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse parseFrom(
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
      com.google.devtools.artifactregistry.v1.ListDockerImagesResponse prototype) {
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
   * The response from listing docker images.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1.ListDockerImagesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1.ListDockerImagesResponse)
      com.google.devtools.artifactregistry.v1.ListDockerImagesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1.ArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1.ArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1.ListDockerImagesResponse.class,
              com.google.devtools.artifactregistry.v1.ListDockerImagesResponse.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1.ListDockerImagesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (dockerImagesBuilder_ == null) {
        dockerImages_ = java.util.Collections.emptyList();
      } else {
        dockerImages_ = null;
        dockerImagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1.ArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ListDockerImagesResponse
        getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1.ListDockerImagesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ListDockerImagesResponse build() {
      com.google.devtools.artifactregistry.v1.ListDockerImagesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ListDockerImagesResponse buildPartial() {
      com.google.devtools.artifactregistry.v1.ListDockerImagesResponse result =
          new com.google.devtools.artifactregistry.v1.ListDockerImagesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.devtools.artifactregistry.v1.ListDockerImagesResponse result) {
      if (dockerImagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dockerImages_ = java.util.Collections.unmodifiableList(dockerImages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dockerImages_ = dockerImages_;
      } else {
        result.dockerImages_ = dockerImagesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.devtools.artifactregistry.v1.ListDockerImagesResponse result) {
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
      if (other instanceof com.google.devtools.artifactregistry.v1.ListDockerImagesResponse) {
        return mergeFrom((com.google.devtools.artifactregistry.v1.ListDockerImagesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.devtools.artifactregistry.v1.ListDockerImagesResponse other) {
      if (other
          == com.google.devtools.artifactregistry.v1.ListDockerImagesResponse.getDefaultInstance())
        return this;
      if (dockerImagesBuilder_ == null) {
        if (!other.dockerImages_.isEmpty()) {
          if (dockerImages_.isEmpty()) {
            dockerImages_ = other.dockerImages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDockerImagesIsMutable();
            dockerImages_.addAll(other.dockerImages_);
          }
          onChanged();
        }
      } else {
        if (!other.dockerImages_.isEmpty()) {
          if (dockerImagesBuilder_.isEmpty()) {
            dockerImagesBuilder_.dispose();
            dockerImagesBuilder_ = null;
            dockerImages_ = other.dockerImages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dockerImagesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDockerImagesFieldBuilder()
                    : null;
          } else {
            dockerImagesBuilder_.addAllMessages(other.dockerImages_);
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
                com.google.devtools.artifactregistry.v1.DockerImage m =
                    input.readMessage(
                        com.google.devtools.artifactregistry.v1.DockerImage.parser(),
                        extensionRegistry);
                if (dockerImagesBuilder_ == null) {
                  ensureDockerImagesIsMutable();
                  dockerImages_.add(m);
                } else {
                  dockerImagesBuilder_.addMessage(m);
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

    private java.util.List<com.google.devtools.artifactregistry.v1.DockerImage> dockerImages_ =
        java.util.Collections.emptyList();

    private void ensureDockerImagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dockerImages_ =
            new java.util.ArrayList<com.google.devtools.artifactregistry.v1.DockerImage>(
                dockerImages_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.artifactregistry.v1.DockerImage,
            com.google.devtools.artifactregistry.v1.DockerImage.Builder,
            com.google.devtools.artifactregistry.v1.DockerImageOrBuilder>
        dockerImagesBuilder_;

    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public java.util.List<com.google.devtools.artifactregistry.v1.DockerImage>
        getDockerImagesList() {
      if (dockerImagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dockerImages_);
      } else {
        return dockerImagesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public int getDockerImagesCount() {
      if (dockerImagesBuilder_ == null) {
        return dockerImages_.size();
      } else {
        return dockerImagesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.DockerImage getDockerImages(int index) {
      if (dockerImagesBuilder_ == null) {
        return dockerImages_.get(index);
      } else {
        return dockerImagesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public Builder setDockerImages(
        int index, com.google.devtools.artifactregistry.v1.DockerImage value) {
      if (dockerImagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDockerImagesIsMutable();
        dockerImages_.set(index, value);
        onChanged();
      } else {
        dockerImagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public Builder setDockerImages(
        int index, com.google.devtools.artifactregistry.v1.DockerImage.Builder builderForValue) {
      if (dockerImagesBuilder_ == null) {
        ensureDockerImagesIsMutable();
        dockerImages_.set(index, builderForValue.build());
        onChanged();
      } else {
        dockerImagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public Builder addDockerImages(com.google.devtools.artifactregistry.v1.DockerImage value) {
      if (dockerImagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDockerImagesIsMutable();
        dockerImages_.add(value);
        onChanged();
      } else {
        dockerImagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public Builder addDockerImages(
        int index, com.google.devtools.artifactregistry.v1.DockerImage value) {
      if (dockerImagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDockerImagesIsMutable();
        dockerImages_.add(index, value);
        onChanged();
      } else {
        dockerImagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public Builder addDockerImages(
        com.google.devtools.artifactregistry.v1.DockerImage.Builder builderForValue) {
      if (dockerImagesBuilder_ == null) {
        ensureDockerImagesIsMutable();
        dockerImages_.add(builderForValue.build());
        onChanged();
      } else {
        dockerImagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public Builder addDockerImages(
        int index, com.google.devtools.artifactregistry.v1.DockerImage.Builder builderForValue) {
      if (dockerImagesBuilder_ == null) {
        ensureDockerImagesIsMutable();
        dockerImages_.add(index, builderForValue.build());
        onChanged();
      } else {
        dockerImagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public Builder addAllDockerImages(
        java.lang.Iterable<? extends com.google.devtools.artifactregistry.v1.DockerImage> values) {
      if (dockerImagesBuilder_ == null) {
        ensureDockerImagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dockerImages_);
        onChanged();
      } else {
        dockerImagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public Builder clearDockerImages() {
      if (dockerImagesBuilder_ == null) {
        dockerImages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dockerImagesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public Builder removeDockerImages(int index) {
      if (dockerImagesBuilder_ == null) {
        ensureDockerImagesIsMutable();
        dockerImages_.remove(index);
        onChanged();
      } else {
        dockerImagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.DockerImage.Builder getDockerImagesBuilder(
        int index) {
      return getDockerImagesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.DockerImageOrBuilder getDockerImagesOrBuilder(
        int index) {
      if (dockerImagesBuilder_ == null) {
        return dockerImages_.get(index);
      } else {
        return dockerImagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.artifactregistry.v1.DockerImageOrBuilder>
        getDockerImagesOrBuilderList() {
      if (dockerImagesBuilder_ != null) {
        return dockerImagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dockerImages_);
      }
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.DockerImage.Builder addDockerImagesBuilder() {
      return getDockerImagesFieldBuilder()
          .addBuilder(com.google.devtools.artifactregistry.v1.DockerImage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.DockerImage.Builder addDockerImagesBuilder(
        int index) {
      return getDockerImagesFieldBuilder()
          .addBuilder(
              index, com.google.devtools.artifactregistry.v1.DockerImage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The docker images returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.DockerImage docker_images = 1;</code>
     */
    public java.util.List<com.google.devtools.artifactregistry.v1.DockerImage.Builder>
        getDockerImagesBuilderList() {
      return getDockerImagesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.artifactregistry.v1.DockerImage,
            com.google.devtools.artifactregistry.v1.DockerImage.Builder,
            com.google.devtools.artifactregistry.v1.DockerImageOrBuilder>
        getDockerImagesFieldBuilder() {
      if (dockerImagesBuilder_ == null) {
        dockerImagesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.devtools.artifactregistry.v1.DockerImage,
                com.google.devtools.artifactregistry.v1.DockerImage.Builder,
                com.google.devtools.artifactregistry.v1.DockerImageOrBuilder>(
                dockerImages_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        dockerImages_ = null;
      }
      return dockerImagesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
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
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
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
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
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
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
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
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
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

    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1.ListDockerImagesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1.ListDockerImagesResponse)
  private static final com.google.devtools.artifactregistry.v1.ListDockerImagesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1.ListDockerImagesResponse();
  }

  public static com.google.devtools.artifactregistry.v1.ListDockerImagesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDockerImagesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDockerImagesResponse>() {
        @java.lang.Override
        public ListDockerImagesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDockerImagesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDockerImagesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.ListDockerImagesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
