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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.videointelligence.v1;

/**
 *
 *
 * <pre>
 * Normalized bounding polygon for text (that might not be aligned with axis).
 * Contains list of the corner points in clockwise order starting from
 * top-left corner. For example, for a rectangular bounding box:
 * When the text is horizontal it might look like:
 *         0----1
 *         |    |
 *         3----2
 *
 * When it's clockwise rotated 180 degrees around the top-left corner it
 * becomes:
 *         2----3
 *         |    |
 *         1----0
 *
 * and the vertex order will still be (0, 1, 2, 3). Note that values can be less
 * than 0, or greater than 1 due to trignometric calculations for location of
 * the box.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1.NormalizedBoundingPoly}
 */
public final class NormalizedBoundingPoly extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1.NormalizedBoundingPoly)
    NormalizedBoundingPolyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NormalizedBoundingPoly.newBuilder() to construct.
  private NormalizedBoundingPoly(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NormalizedBoundingPoly() {
    vertices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NormalizedBoundingPoly();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_NormalizedBoundingPoly_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_NormalizedBoundingPoly_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.class,
            com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.Builder.class);
  }

  public static final int VERTICES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.videointelligence.v1.NormalizedVertex> vertices_;
  /**
   *
   *
   * <pre>
   * Normalized vertices of the bounding polygon.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.videointelligence.v1.NormalizedVertex> getVerticesList() {
    return vertices_;
  }
  /**
   *
   *
   * <pre>
   * Normalized vertices of the bounding polygon.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.videointelligence.v1.NormalizedVertexOrBuilder>
      getVerticesOrBuilderList() {
    return vertices_;
  }
  /**
   *
   *
   * <pre>
   * Normalized vertices of the bounding polygon.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
   */
  @java.lang.Override
  public int getVerticesCount() {
    return vertices_.size();
  }
  /**
   *
   *
   * <pre>
   * Normalized vertices of the bounding polygon.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1.NormalizedVertex getVertices(int index) {
    return vertices_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Normalized vertices of the bounding polygon.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1.NormalizedVertexOrBuilder getVerticesOrBuilder(
      int index) {
    return vertices_.get(index);
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
    for (int i = 0; i < vertices_.size(); i++) {
      output.writeMessage(1, vertices_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < vertices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, vertices_.get(i));
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1.NormalizedBoundingPoly)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1.NormalizedBoundingPoly other =
        (com.google.cloud.videointelligence.v1.NormalizedBoundingPoly) obj;

    if (!getVerticesList().equals(other.getVerticesList())) return false;
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
    if (getVerticesCount() > 0) {
      hash = (37 * hash) + VERTICES_FIELD_NUMBER;
      hash = (53 * hash) + getVerticesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly parseFrom(
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
      com.google.cloud.videointelligence.v1.NormalizedBoundingPoly prototype) {
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
   * Normalized bounding polygon for text (that might not be aligned with axis).
   * Contains list of the corner points in clockwise order starting from
   * top-left corner. For example, for a rectangular bounding box:
   * When the text is horizontal it might look like:
   *         0----1
   *         |    |
   *         3----2
   *
   * When it's clockwise rotated 180 degrees around the top-left corner it
   * becomes:
   *         2----3
   *         |    |
   *         1----0
   *
   * and the vertex order will still be (0, 1, 2, 3). Note that values can be less
   * than 0, or greater than 1 due to trignometric calculations for location of
   * the box.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1.NormalizedBoundingPoly}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1.NormalizedBoundingPoly)
      com.google.cloud.videointelligence.v1.NormalizedBoundingPolyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_NormalizedBoundingPoly_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_NormalizedBoundingPoly_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.class,
              com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (verticesBuilder_ == null) {
        vertices_ = java.util.Collections.emptyList();
      } else {
        vertices_ = null;
        verticesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_NormalizedBoundingPoly_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.NormalizedBoundingPoly
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.NormalizedBoundingPoly build() {
      com.google.cloud.videointelligence.v1.NormalizedBoundingPoly result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.NormalizedBoundingPoly buildPartial() {
      com.google.cloud.videointelligence.v1.NormalizedBoundingPoly result =
          new com.google.cloud.videointelligence.v1.NormalizedBoundingPoly(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.videointelligence.v1.NormalizedBoundingPoly result) {
      if (verticesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vertices_ = java.util.Collections.unmodifiableList(vertices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vertices_ = vertices_;
      } else {
        result.vertices_ = verticesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.videointelligence.v1.NormalizedBoundingPoly result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.videointelligence.v1.NormalizedBoundingPoly) {
        return mergeFrom((com.google.cloud.videointelligence.v1.NormalizedBoundingPoly) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1.NormalizedBoundingPoly other) {
      if (other
          == com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.getDefaultInstance())
        return this;
      if (verticesBuilder_ == null) {
        if (!other.vertices_.isEmpty()) {
          if (vertices_.isEmpty()) {
            vertices_ = other.vertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVerticesIsMutable();
            vertices_.addAll(other.vertices_);
          }
          onChanged();
        }
      } else {
        if (!other.vertices_.isEmpty()) {
          if (verticesBuilder_.isEmpty()) {
            verticesBuilder_.dispose();
            verticesBuilder_ = null;
            vertices_ = other.vertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            verticesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getVerticesFieldBuilder()
                    : null;
          } else {
            verticesBuilder_.addAllMessages(other.vertices_);
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
            case 10:
              {
                com.google.cloud.videointelligence.v1.NormalizedVertex m =
                    input.readMessage(
                        com.google.cloud.videointelligence.v1.NormalizedVertex.parser(),
                        extensionRegistry);
                if (verticesBuilder_ == null) {
                  ensureVerticesIsMutable();
                  vertices_.add(m);
                } else {
                  verticesBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.videointelligence.v1.NormalizedVertex> vertices_ =
        java.util.Collections.emptyList();

    private void ensureVerticesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vertices_ =
            new java.util.ArrayList<com.google.cloud.videointelligence.v1.NormalizedVertex>(
                vertices_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1.NormalizedVertex,
            com.google.cloud.videointelligence.v1.NormalizedVertex.Builder,
            com.google.cloud.videointelligence.v1.NormalizedVertexOrBuilder>
        verticesBuilder_;

    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1.NormalizedVertex>
        getVerticesList() {
      if (verticesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vertices_);
      } else {
        return verticesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public int getVerticesCount() {
      if (verticesBuilder_ == null) {
        return vertices_.size();
      } else {
        return verticesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedVertex getVertices(int index) {
      if (verticesBuilder_ == null) {
        return vertices_.get(index);
      } else {
        return verticesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public Builder setVertices(
        int index, com.google.cloud.videointelligence.v1.NormalizedVertex value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.set(index, value);
        onChanged();
      } else {
        verticesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public Builder setVertices(
        int index, com.google.cloud.videointelligence.v1.NormalizedVertex.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.set(index, builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public Builder addVertices(com.google.cloud.videointelligence.v1.NormalizedVertex value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.add(value);
        onChanged();
      } else {
        verticesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public Builder addVertices(
        int index, com.google.cloud.videointelligence.v1.NormalizedVertex value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.add(index, value);
        onChanged();
      } else {
        verticesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public Builder addVertices(
        com.google.cloud.videointelligence.v1.NormalizedVertex.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.add(builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public Builder addVertices(
        int index, com.google.cloud.videointelligence.v1.NormalizedVertex.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.add(index, builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public Builder addAllVertices(
        java.lang.Iterable<? extends com.google.cloud.videointelligence.v1.NormalizedVertex>
            values) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, vertices_);
        onChanged();
      } else {
        verticesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public Builder clearVertices() {
      if (verticesBuilder_ == null) {
        vertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        verticesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public Builder removeVertices(int index) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.remove(index);
        onChanged();
      } else {
        verticesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedVertex.Builder getVerticesBuilder(
        int index) {
      return getVerticesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedVertexOrBuilder getVerticesOrBuilder(
        int index) {
      if (verticesBuilder_ == null) {
        return vertices_.get(index);
      } else {
        return verticesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.videointelligence.v1.NormalizedVertexOrBuilder>
        getVerticesOrBuilderList() {
      if (verticesBuilder_ != null) {
        return verticesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vertices_);
      }
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedVertex.Builder addVerticesBuilder() {
      return getVerticesFieldBuilder()
          .addBuilder(com.google.cloud.videointelligence.v1.NormalizedVertex.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedVertex.Builder addVerticesBuilder(
        int index) {
      return getVerticesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.videointelligence.v1.NormalizedVertex.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Normalized vertices of the bounding polygon.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1.NormalizedVertex vertices = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1.NormalizedVertex.Builder>
        getVerticesBuilderList() {
      return getVerticesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1.NormalizedVertex,
            com.google.cloud.videointelligence.v1.NormalizedVertex.Builder,
            com.google.cloud.videointelligence.v1.NormalizedVertexOrBuilder>
        getVerticesFieldBuilder() {
      if (verticesBuilder_ == null) {
        verticesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.videointelligence.v1.NormalizedVertex,
                com.google.cloud.videointelligence.v1.NormalizedVertex.Builder,
                com.google.cloud.videointelligence.v1.NormalizedVertexOrBuilder>(
                vertices_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        vertices_ = null;
      }
      return verticesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1.NormalizedBoundingPoly)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1.NormalizedBoundingPoly)
  private static final com.google.cloud.videointelligence.v1.NormalizedBoundingPoly
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1.NormalizedBoundingPoly();
  }

  public static com.google.cloud.videointelligence.v1.NormalizedBoundingPoly getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NormalizedBoundingPoly> PARSER =
      new com.google.protobuf.AbstractParser<NormalizedBoundingPoly>() {
        @java.lang.Override
        public NormalizedBoundingPoly parsePartialFrom(
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

  public static com.google.protobuf.Parser<NormalizedBoundingPoly> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NormalizedBoundingPoly> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1.NormalizedBoundingPoly getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
