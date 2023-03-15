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
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

/**
 *
 *
 * <pre>
 * Annotation progress for a single video.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress}
 */
public final class VideoAnnotationProgress extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress)
    VideoAnnotationProgressOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VideoAnnotationProgress.newBuilder() to construct.
  private VideoAnnotationProgress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoAnnotationProgress() {
    inputUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoAnnotationProgress();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p1beta1_VideoAnnotationProgress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p1beta1_VideoAnnotationProgress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress.class,
            com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress.Builder.class);
  }

  public static final int INPUT_URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object inputUri_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The inputUri.
   */
  @java.lang.Override
  public java.lang.String getInputUri() {
    java.lang.Object ref = inputUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The bytes for inputUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInputUriBytes() {
    java.lang.Object ref = inputUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      inputUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROGRESS_PERCENT_FIELD_NUMBER = 2;
  private int progressPercent_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. Approximate percentage processed thus far. Guaranteed to be
   * 100 when fully processed.
   * </pre>
   *
   * <code>int32 progress_percent = 2;</code>
   *
   * @return The progressPercent.
   */
  @java.lang.Override
  public int getProgressPercent() {
    return progressPercent_;
  }

  public static final int START_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp startTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time of the most recent update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time of the most recent update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time of the most recent update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inputUri_);
    }
    if (progressPercent_ != 0) {
      output.writeInt32(2, progressPercent_);
    }
    if (startTime_ != null) {
      output.writeMessage(3, getStartTime());
    }
    if (updateTime_ != null) {
      output.writeMessage(4, getUpdateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inputUri_);
    }
    if (progressPercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, progressPercent_);
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStartTime());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getUpdateTime());
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress other =
        (com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress) obj;

    if (!getInputUri().equals(other.getInputUri())) return false;
    if (getProgressPercent() != other.getProgressPercent()) return false;
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
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
    hash = (37 * hash) + INPUT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getInputUri().hashCode();
    hash = (37 * hash) + PROGRESS_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getProgressPercent();
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress parseFrom(
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
      com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress prototype) {
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
   * Annotation progress for a single video.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress)
      com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p1beta1_VideoAnnotationProgress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p1beta1_VideoAnnotationProgress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress.class,
              com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress.Builder.class);
    }

    // Construct using
    // com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      inputUri_ = "";
      progressPercent_ = 0;
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p1beta1_VideoAnnotationProgress_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress build() {
      com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress buildPartial() {
      com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress result =
          new com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inputUri_ = inputUri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.progressPercent_ = progressPercent_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.startTime_ = startTimeBuilder_ == null ? startTime_ : startTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.updateTime_ = updateTimeBuilder_ == null ? updateTime_ : updateTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress) {
        return mergeFrom(
            (com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress other) {
      if (other
          == com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress
              .getDefaultInstance()) return this;
      if (!other.getInputUri().isEmpty()) {
        inputUri_ = other.inputUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getProgressPercent() != 0) {
        setProgressPercent(other.getProgressPercent());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
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
                inputUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                progressPercent_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(getStartTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                input.readMessage(getUpdateTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object inputUri_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @return The inputUri.
     */
    public java.lang.String getInputUri() {
      java.lang.Object ref = inputUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @return The bytes for inputUri.
     */
    public com.google.protobuf.ByteString getInputUriBytes() {
      java.lang.Object ref = inputUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        inputUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @param value The inputUri to set.
     * @return This builder for chaining.
     */
    public Builder setInputUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      inputUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInputUri() {
      inputUri_ = getDefaultInstance().getInputUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @param value The bytes for inputUri to set.
     * @return This builder for chaining.
     */
    public Builder setInputUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      inputUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int progressPercent_;
    /**
     *
     *
     * <pre>
     * Output only. Approximate percentage processed thus far. Guaranteed to be
     * 100 when fully processed.
     * </pre>
     *
     * <code>int32 progress_percent = 2;</code>
     *
     * @return The progressPercent.
     */
    @java.lang.Override
    public int getProgressPercent() {
      return progressPercent_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Approximate percentage processed thus far. Guaranteed to be
     * 100 when fully processed.
     * </pre>
     *
     * <code>int32 progress_percent = 2;</code>
     *
     * @param value The progressPercent to set.
     * @return This builder for chaining.
     */
    public Builder setProgressPercent(int value) {

      progressPercent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Approximate percentage processed thus far. Guaranteed to be
     * 100 when fully processed.
     * </pre>
     *
     * <code>int32 progress_percent = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProgressPercent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      progressPercent_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        startTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     *
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     *
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
      } else {
        startTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && startTime_ != null
            && startTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStartTimeBuilder().mergeFrom(value);
        } else {
          startTime_ = value;
        }
      } else {
        startTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStartTime(), getParentForChildren(), isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)
            && updateTime_ != null
            && updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdateTimeBuilder().mergeFrom(value);
        } else {
          updateTime_ = value;
        }
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder clearUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress)
  private static final com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress();
  }

  public static com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoAnnotationProgress> PARSER =
      new com.google.protobuf.AbstractParser<VideoAnnotationProgress>() {
        @java.lang.Override
        public VideoAnnotationProgress parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoAnnotationProgress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoAnnotationProgress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p1beta1.VideoAnnotationProgress
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
