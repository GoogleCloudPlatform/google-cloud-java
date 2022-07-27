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
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/image_object_detection.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

/**
 *
 *
 * <pre>
 * Prediction input format for Image Object Detection.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.aiplatform.v1beta1.schema.predict.instance.ImageObjectDetectionPredictionInstance}
 */
public final class ImageObjectDetectionPredictionInstance
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.predict.instance.ImageObjectDetectionPredictionInstance)
    ImageObjectDetectionPredictionInstanceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageObjectDetectionPredictionInstance.newBuilder() to construct.
  private ImageObjectDetectionPredictionInstance(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageObjectDetectionPredictionInstance() {
    content_ = "";
    mimeType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageObjectDetectionPredictionInstance();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImageObjectDetectionPredictionInstance(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              mimeType_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.predict.instance
        .ImageObjectDetectionPredictionInstanceProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.predict.instance
        .ImageObjectDetectionPredictionInstanceProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.predict.instance
                .ImageObjectDetectionPredictionInstance.class,
            com.google.cloud.aiplatform.v1beta1.schema.predict.instance
                .ImageObjectDetectionPredictionInstance.Builder.class);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object content_;
  /**
   *
   *
   * <pre>
   * The image bytes or Cloud Storage URI to make the prediction on.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The image bytes or Cloud Storage URI to make the prediction on.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object mimeType_;
  /**
   *
   *
   * <pre>
   * The MIME type of the content of the image. Only the images in below listed
   * MIME types are supported.
   * - image/jpeg
   * - image/gif
   * - image/png
   * - image/webp
   * - image/bmp
   * - image/tiff
   * - image/vnd.microsoft.icon
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The mimeType.
   */
  @java.lang.Override
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The MIME type of the content of the image. Only the images in below listed
   * MIME types are supported.
   * - image/jpeg
   * - image/gif
   * - image/png
   * - image/webp
   * - image/bmp
   * - image/tiff
   * - image/vnd.microsoft.icon
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The bytes for mimeType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mimeType_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, content_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mimeType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, content_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mimeType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj
        instanceof
        com.google.cloud.aiplatform.v1beta1.schema.predict.instance
            .ImageObjectDetectionPredictionInstance)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.predict.instance
            .ImageObjectDetectionPredictionInstance
        other =
            (com.google.cloud.aiplatform.v1beta1.schema.predict.instance
                    .ImageObjectDetectionPredictionInstance)
                obj;

    if (!getContent().equals(other.getContent())) return false;
    if (!getMimeType().equals(other.getMimeType())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.schema.predict.instance
              .ImageObjectDetectionPredictionInstance
          prototype) {
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
   * Prediction input format for Image Object Detection.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.aiplatform.v1beta1.schema.predict.instance.ImageObjectDetectionPredictionInstance}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.predict.instance.ImageObjectDetectionPredictionInstance)
      com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstanceProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstanceProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.predict.instance
                  .ImageObjectDetectionPredictionInstance.class,
              com.google.cloud.aiplatform.v1beta1.schema.predict.instance
                  .ImageObjectDetectionPredictionInstance.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.schema.predict.instance.ImageObjectDetectionPredictionInstance.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      content_ = "";

      mimeType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstanceProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageObjectDetectionPredictionInstance_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.instance
            .ImageObjectDetectionPredictionInstance
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.instance
            .ImageObjectDetectionPredictionInstance
        build() {
      com.google.cloud.aiplatform.v1beta1.schema.predict.instance
              .ImageObjectDetectionPredictionInstance
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.predict.instance
            .ImageObjectDetectionPredictionInstance
        buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.predict.instance
              .ImageObjectDetectionPredictionInstance
          result =
              new com.google.cloud.aiplatform.v1beta1.schema.predict.instance
                  .ImageObjectDetectionPredictionInstance(this);
      result.content_ = content_;
      result.mimeType_ = mimeType_;
      onBuilt();
      return result;
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
      if (other
          instanceof
          com.google.cloud.aiplatform.v1beta1.schema.predict.instance
              .ImageObjectDetectionPredictionInstance) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.schema.predict.instance
                    .ImageObjectDetectionPredictionInstance)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.schema.predict.instance
                .ImageObjectDetectionPredictionInstance
            other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.schema.predict.instance
              .ImageObjectDetectionPredictionInstance.getDefaultInstance()) return this;
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.aiplatform.v1beta1.schema.predict.instance
              .ImageObjectDetectionPredictionInstance
          parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.schema.predict.instance
                    .ImageObjectDetectionPredictionInstance)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     *
     *
     * <pre>
     * The image bytes or Cloud Storage URI to make the prediction on.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The image bytes or Cloud Storage URI to make the prediction on.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The image bytes or Cloud Storage URI to make the prediction on.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      content_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The image bytes or Cloud Storage URI to make the prediction on.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {

      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The image bytes or Cloud Storage URI to make the prediction on.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      content_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     *
     *
     * <pre>
     * The MIME type of the content of the image. Only the images in below listed
     * MIME types are supported.
     * - image/jpeg
     * - image/gif
     * - image/png
     * - image/webp
     * - image/bmp
     * - image/tiff
     * - image/vnd.microsoft.icon
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @return The mimeType.
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The MIME type of the content of the image. Only the images in below listed
     * MIME types are supported.
     * - image/jpeg
     * - image/gif
     * - image/png
     * - image/webp
     * - image/bmp
     * - image/tiff
     * - image/vnd.microsoft.icon
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @return The bytes for mimeType.
     */
    public com.google.protobuf.ByteString getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The MIME type of the content of the image. Only the images in below listed
     * MIME types are supported.
     * - image/jpeg
     * - image/gif
     * - image/png
     * - image/webp
     * - image/bmp
     * - image/tiff
     * - image/vnd.microsoft.icon
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mimeType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MIME type of the content of the image. Only the images in below listed
     * MIME types are supported.
     * - image/jpeg
     * - image/gif
     * - image/png
     * - image/webp
     * - image/bmp
     * - image/tiff
     * - image/vnd.microsoft.icon
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {

      mimeType_ = getDefaultInstance().getMimeType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MIME type of the content of the image. Only the images in below listed
     * MIME types are supported.
     * - image/jpeg
     * - image/gif
     * - image/png
     * - image/webp
     * - image/bmp
     * - image/tiff
     * - image/vnd.microsoft.icon
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @param value The bytes for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      mimeType_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.predict.instance.ImageObjectDetectionPredictionInstance)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.instance.ImageObjectDetectionPredictionInstance)
  private static final com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.schema.predict.instance
            .ImageObjectDetectionPredictionInstance();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageObjectDetectionPredictionInstance> PARSER =
      new com.google.protobuf.AbstractParser<ImageObjectDetectionPredictionInstance>() {
        @java.lang.Override
        public ImageObjectDetectionPredictionInstance parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImageObjectDetectionPredictionInstance(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImageObjectDetectionPredictionInstance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageObjectDetectionPredictionInstance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.predict.instance
          .ImageObjectDetectionPredictionInstance
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
