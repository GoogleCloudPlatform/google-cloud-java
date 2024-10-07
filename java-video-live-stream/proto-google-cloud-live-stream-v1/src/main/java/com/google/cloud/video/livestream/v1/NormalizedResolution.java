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
// source: google/cloud/video/livestream/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.video.livestream.v1;

/**
 *
 *
 * <pre>
 * Normalized resolution.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.livestream.v1.NormalizedResolution}
 */
public final class NormalizedResolution extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.livestream.v1.NormalizedResolution)
    NormalizedResolutionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NormalizedResolution.newBuilder() to construct.
  private NormalizedResolution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NormalizedResolution() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NormalizedResolution();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_NormalizedResolution_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_NormalizedResolution_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.livestream.v1.NormalizedResolution.class,
            com.google.cloud.video.livestream.v1.NormalizedResolution.Builder.class);
  }

  public static final int W_FIELD_NUMBER = 1;
  private double w_ = 0D;
  /**
   *
   *
   * <pre>
   * Optional. Normalized width. Valid range is [0.0, 1.0]. Default is 0.
   * </pre>
   *
   * <code>double w = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The w.
   */
  @java.lang.Override
  public double getW() {
    return w_;
  }

  public static final int H_FIELD_NUMBER = 2;
  private double h_ = 0D;
  /**
   *
   *
   * <pre>
   * Optional. Normalized height. Valid range is [0.0, 1.0]. Default is 0.
   * </pre>
   *
   * <code>double h = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The h.
   */
  @java.lang.Override
  public double getH() {
    return h_;
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
    if (java.lang.Double.doubleToRawLongBits(w_) != 0) {
      output.writeDouble(1, w_);
    }
    if (java.lang.Double.doubleToRawLongBits(h_) != 0) {
      output.writeDouble(2, h_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(w_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, w_);
    }
    if (java.lang.Double.doubleToRawLongBits(h_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, h_);
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
    if (!(obj instanceof com.google.cloud.video.livestream.v1.NormalizedResolution)) {
      return super.equals(obj);
    }
    com.google.cloud.video.livestream.v1.NormalizedResolution other =
        (com.google.cloud.video.livestream.v1.NormalizedResolution) obj;

    if (java.lang.Double.doubleToLongBits(getW())
        != java.lang.Double.doubleToLongBits(other.getW())) return false;
    if (java.lang.Double.doubleToLongBits(getH())
        != java.lang.Double.doubleToLongBits(other.getH())) return false;
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
    hash = (37 * hash) + W_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getW()));
    hash = (37 * hash) + H_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getH()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution parseFrom(
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
      com.google.cloud.video.livestream.v1.NormalizedResolution prototype) {
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
   * Normalized resolution.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.livestream.v1.NormalizedResolution}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.livestream.v1.NormalizedResolution)
      com.google.cloud.video.livestream.v1.NormalizedResolutionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_NormalizedResolution_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_NormalizedResolution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.livestream.v1.NormalizedResolution.class,
              com.google.cloud.video.livestream.v1.NormalizedResolution.Builder.class);
    }

    // Construct using com.google.cloud.video.livestream.v1.NormalizedResolution.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      w_ = 0D;
      h_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_NormalizedResolution_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.NormalizedResolution getDefaultInstanceForType() {
      return com.google.cloud.video.livestream.v1.NormalizedResolution.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.NormalizedResolution build() {
      com.google.cloud.video.livestream.v1.NormalizedResolution result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.NormalizedResolution buildPartial() {
      com.google.cloud.video.livestream.v1.NormalizedResolution result =
          new com.google.cloud.video.livestream.v1.NormalizedResolution(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.livestream.v1.NormalizedResolution result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.w_ = w_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.h_ = h_;
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
      if (other instanceof com.google.cloud.video.livestream.v1.NormalizedResolution) {
        return mergeFrom((com.google.cloud.video.livestream.v1.NormalizedResolution) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.livestream.v1.NormalizedResolution other) {
      if (other == com.google.cloud.video.livestream.v1.NormalizedResolution.getDefaultInstance())
        return this;
      if (other.getW() != 0D) {
        setW(other.getW());
      }
      if (other.getH() != 0D) {
        setH(other.getH());
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
            case 9:
              {
                w_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 17:
              {
                h_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
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

    private double w_;
    /**
     *
     *
     * <pre>
     * Optional. Normalized width. Valid range is [0.0, 1.0]. Default is 0.
     * </pre>
     *
     * <code>double w = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The w.
     */
    @java.lang.Override
    public double getW() {
      return w_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Normalized width. Valid range is [0.0, 1.0]. Default is 0.
     * </pre>
     *
     * <code>double w = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The w to set.
     * @return This builder for chaining.
     */
    public Builder setW(double value) {

      w_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Normalized width. Valid range is [0.0, 1.0]. Default is 0.
     * </pre>
     *
     * <code>double w = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearW() {
      bitField0_ = (bitField0_ & ~0x00000001);
      w_ = 0D;
      onChanged();
      return this;
    }

    private double h_;
    /**
     *
     *
     * <pre>
     * Optional. Normalized height. Valid range is [0.0, 1.0]. Default is 0.
     * </pre>
     *
     * <code>double h = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The h.
     */
    @java.lang.Override
    public double getH() {
      return h_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Normalized height. Valid range is [0.0, 1.0]. Default is 0.
     * </pre>
     *
     * <code>double h = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The h to set.
     * @return This builder for chaining.
     */
    public Builder setH(double value) {

      h_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Normalized height. Valid range is [0.0, 1.0]. Default is 0.
     * </pre>
     *
     * <code>double h = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearH() {
      bitField0_ = (bitField0_ & ~0x00000002);
      h_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.livestream.v1.NormalizedResolution)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.livestream.v1.NormalizedResolution)
  private static final com.google.cloud.video.livestream.v1.NormalizedResolution DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.livestream.v1.NormalizedResolution();
  }

  public static com.google.cloud.video.livestream.v1.NormalizedResolution getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NormalizedResolution> PARSER =
      new com.google.protobuf.AbstractParser<NormalizedResolution>() {
        @java.lang.Override
        public NormalizedResolution parsePartialFrom(
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

  public static com.google.protobuf.Parser<NormalizedResolution> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NormalizedResolution> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.livestream.v1.NormalizedResolution getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
