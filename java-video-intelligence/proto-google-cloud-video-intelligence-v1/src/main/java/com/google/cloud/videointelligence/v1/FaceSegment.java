/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.videointelligence.v1;

/**
 *
 *
 * <pre>
 * Video segment level annotation results for face detection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1.FaceSegment}
 */
public final class FaceSegment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1.FaceSegment)
    FaceSegmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FaceSegment.newBuilder() to construct.
  private FaceSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FaceSegment() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FaceSegment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_FaceSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_FaceSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1.FaceSegment.class,
            com.google.cloud.videointelligence.v1.FaceSegment.Builder.class);
  }

  public static final int SEGMENT_FIELD_NUMBER = 1;
  private com.google.cloud.videointelligence.v1.VideoSegment segment_;
  /**
   *
   *
   * <pre>
   * Video segment where a face was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   *
   * @return Whether the segment field is set.
   */
  @java.lang.Override
  public boolean hasSegment() {
    return segment_ != null;
  }
  /**
   *
   *
   * <pre>
   * Video segment where a face was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   *
   * @return The segment.
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1.VideoSegment getSegment() {
    return segment_ == null
        ? com.google.cloud.videointelligence.v1.VideoSegment.getDefaultInstance()
        : segment_;
  }
  /**
   *
   *
   * <pre>
   * Video segment where a face was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder getSegmentOrBuilder() {
    return segment_ == null
        ? com.google.cloud.videointelligence.v1.VideoSegment.getDefaultInstance()
        : segment_;
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
    if (segment_ != null) {
      output.writeMessage(1, getSegment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (segment_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSegment());
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1.FaceSegment)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1.FaceSegment other =
        (com.google.cloud.videointelligence.v1.FaceSegment) obj;

    if (hasSegment() != other.hasSegment()) return false;
    if (hasSegment()) {
      if (!getSegment().equals(other.getSegment())) return false;
    }
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
    if (hasSegment()) {
      hash = (37 * hash) + SEGMENT_FIELD_NUMBER;
      hash = (53 * hash) + getSegment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment parseFrom(
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

  public static Builder newBuilder(com.google.cloud.videointelligence.v1.FaceSegment prototype) {
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
   * Video segment level annotation results for face detection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1.FaceSegment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1.FaceSegment)
      com.google.cloud.videointelligence.v1.FaceSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_FaceSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_FaceSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1.FaceSegment.class,
              com.google.cloud.videointelligence.v1.FaceSegment.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1.FaceSegment.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      segment_ = null;
      if (segmentBuilder_ != null) {
        segmentBuilder_.dispose();
        segmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_FaceSegment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.FaceSegment getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1.FaceSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.FaceSegment build() {
      com.google.cloud.videointelligence.v1.FaceSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.FaceSegment buildPartial() {
      com.google.cloud.videointelligence.v1.FaceSegment result =
          new com.google.cloud.videointelligence.v1.FaceSegment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1.FaceSegment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.segment_ = segmentBuilder_ == null ? segment_ : segmentBuilder_.build();
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
      if (other instanceof com.google.cloud.videointelligence.v1.FaceSegment) {
        return mergeFrom((com.google.cloud.videointelligence.v1.FaceSegment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1.FaceSegment other) {
      if (other == com.google.cloud.videointelligence.v1.FaceSegment.getDefaultInstance())
        return this;
      if (other.hasSegment()) {
        mergeSegment(other.getSegment());
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
                input.readMessage(getSegmentFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.videointelligence.v1.VideoSegment segment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1.VideoSegment,
            com.google.cloud.videointelligence.v1.VideoSegment.Builder,
            com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder>
        segmentBuilder_;
    /**
     *
     *
     * <pre>
     * Video segment where a face was detected.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
     *
     * @return Whether the segment field is set.
     */
    public boolean hasSegment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Video segment where a face was detected.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
     *
     * @return The segment.
     */
    public com.google.cloud.videointelligence.v1.VideoSegment getSegment() {
      if (segmentBuilder_ == null) {
        return segment_ == null
            ? com.google.cloud.videointelligence.v1.VideoSegment.getDefaultInstance()
            : segment_;
      } else {
        return segmentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Video segment where a face was detected.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
     */
    public Builder setSegment(com.google.cloud.videointelligence.v1.VideoSegment value) {
      if (segmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        segment_ = value;
      } else {
        segmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Video segment where a face was detected.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
     */
    public Builder setSegment(
        com.google.cloud.videointelligence.v1.VideoSegment.Builder builderForValue) {
      if (segmentBuilder_ == null) {
        segment_ = builderForValue.build();
      } else {
        segmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Video segment where a face was detected.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
     */
    public Builder mergeSegment(com.google.cloud.videointelligence.v1.VideoSegment value) {
      if (segmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && segment_ != null
            && segment_
                != com.google.cloud.videointelligence.v1.VideoSegment.getDefaultInstance()) {
          getSegmentBuilder().mergeFrom(value);
        } else {
          segment_ = value;
        }
      } else {
        segmentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Video segment where a face was detected.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
     */
    public Builder clearSegment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      segment_ = null;
      if (segmentBuilder_ != null) {
        segmentBuilder_.dispose();
        segmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Video segment where a face was detected.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
     */
    public com.google.cloud.videointelligence.v1.VideoSegment.Builder getSegmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSegmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Video segment where a face was detected.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
     */
    public com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder getSegmentOrBuilder() {
      if (segmentBuilder_ != null) {
        return segmentBuilder_.getMessageOrBuilder();
      } else {
        return segment_ == null
            ? com.google.cloud.videointelligence.v1.VideoSegment.getDefaultInstance()
            : segment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Video segment where a face was detected.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1.VideoSegment,
            com.google.cloud.videointelligence.v1.VideoSegment.Builder,
            com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder>
        getSegmentFieldBuilder() {
      if (segmentBuilder_ == null) {
        segmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.videointelligence.v1.VideoSegment,
                com.google.cloud.videointelligence.v1.VideoSegment.Builder,
                com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder>(
                getSegment(), getParentForChildren(), isClean());
        segment_ = null;
      }
      return segmentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1.FaceSegment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1.FaceSegment)
  private static final com.google.cloud.videointelligence.v1.FaceSegment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1.FaceSegment();
  }

  public static com.google.cloud.videointelligence.v1.FaceSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FaceSegment> PARSER =
      new com.google.protobuf.AbstractParser<FaceSegment>() {
        @java.lang.Override
        public FaceSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<FaceSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FaceSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1.FaceSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
