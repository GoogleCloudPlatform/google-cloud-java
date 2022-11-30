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
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [FeaturestoreService.ListFeatures][google.cloud.aiplatform.v1beta1.FeaturestoreService.ListFeatures].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListFeaturesResponse}
 */
public final class ListFeaturesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListFeaturesResponse)
    ListFeaturesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListFeaturesResponse.newBuilder() to construct.
  private ListFeaturesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListFeaturesResponse() {
    features_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListFeaturesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListFeaturesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListFeaturesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse.Builder.class);
  }

  public static final int FEATURES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Feature> features_;
  /**
   *
   *
   * <pre>
   * The Features matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Feature> getFeaturesList() {
    return features_;
  }
  /**
   *
   *
   * <pre>
   * The Features matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
      getFeaturesOrBuilderList() {
    return features_;
  }
  /**
   *
   *
   * <pre>
   * The Features matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public int getFeaturesCount() {
    return features_.size();
  }
  /**
   *
   *
   * <pre>
   * The Features matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Feature getFeatures(int index) {
    return features_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The Features matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder getFeaturesOrBuilder(int index) {
    return features_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token, which can be sent as [ListFeaturesRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeaturesRequest.page_token] to
   * retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as [ListFeaturesRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeaturesRequest.page_token] to
   * retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < features_.size(); i++) {
      output.writeMessage(1, features_.get(i));
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
    for (int i = 0; i < features_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, features_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse) obj;

    if (!getFeaturesList().equals(other.getFeaturesList())) return false;
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
    if (getFeaturesCount() > 0) {
      hash = (37 * hash) + FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getFeaturesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse prototype) {
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
   * Response message for [FeaturestoreService.ListFeatures][google.cloud.aiplatform.v1beta1.FeaturestoreService.ListFeatures].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListFeaturesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListFeaturesResponse)
      com.google.cloud.aiplatform.v1beta1.ListFeaturesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListFeaturesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListFeaturesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (featuresBuilder_ == null) {
        features_ = java.util.Collections.emptyList();
      } else {
        features_ = null;
        featuresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListFeaturesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse(this);
      int from_bitField0_ = bitField0_;
      if (featuresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          features_ = java.util.Collections.unmodifiableList(features_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.features_ = features_;
      } else {
        result.features_ = featuresBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse.getDefaultInstance())
        return this;
      if (featuresBuilder_ == null) {
        if (!other.features_.isEmpty()) {
          if (features_.isEmpty()) {
            features_ = other.features_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFeaturesIsMutable();
            features_.addAll(other.features_);
          }
          onChanged();
        }
      } else {
        if (!other.features_.isEmpty()) {
          if (featuresBuilder_.isEmpty()) {
            featuresBuilder_.dispose();
            featuresBuilder_ = null;
            features_ = other.features_;
            bitField0_ = (bitField0_ & ~0x00000001);
            featuresBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFeaturesFieldBuilder()
                    : null;
          } else {
            featuresBuilder_.addAllMessages(other.features_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.aiplatform.v1beta1.Feature m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.Feature.parser(), extensionRegistry);
                if (featuresBuilder_ == null) {
                  ensureFeaturesIsMutable();
                  features_.add(m);
                } else {
                  featuresBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Feature> features_ =
        java.util.Collections.emptyList();

    private void ensureFeaturesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        features_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Feature>(features_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Feature,
            com.google.cloud.aiplatform.v1beta1.Feature.Builder,
            com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
        featuresBuilder_;

    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Feature> getFeaturesList() {
      if (featuresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(features_);
      } else {
        return featuresBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public int getFeaturesCount() {
      if (featuresBuilder_ == null) {
        return features_.size();
      } else {
        return featuresBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Feature getFeatures(int index) {
      if (featuresBuilder_ == null) {
        return features_.get(index);
      } else {
        return featuresBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder setFeatures(int index, com.google.cloud.aiplatform.v1beta1.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.set(index, value);
        onChanged();
      } else {
        featuresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder setFeatures(
        int index, com.google.cloud.aiplatform.v1beta1.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.set(index, builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addFeatures(com.google.cloud.aiplatform.v1beta1.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.add(value);
        onChanged();
      } else {
        featuresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addFeatures(int index, com.google.cloud.aiplatform.v1beta1.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.add(index, value);
        onChanged();
      } else {
        featuresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addFeatures(
        com.google.cloud.aiplatform.v1beta1.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.add(builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addFeatures(
        int index, com.google.cloud.aiplatform.v1beta1.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.add(index, builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder addAllFeatures(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Feature> values) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, features_);
        onChanged();
      } else {
        featuresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder clearFeatures() {
      if (featuresBuilder_ == null) {
        features_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        featuresBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public Builder removeFeatures(int index) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.remove(index);
        onChanged();
      } else {
        featuresBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Feature.Builder getFeaturesBuilder(int index) {
      return getFeaturesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder getFeaturesOrBuilder(int index) {
      if (featuresBuilder_ == null) {
        return features_.get(index);
      } else {
        return featuresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
        getFeaturesOrBuilderList() {
      if (featuresBuilder_ != null) {
        return featuresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(features_);
      }
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Feature.Builder addFeaturesBuilder() {
      return getFeaturesFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Feature.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Feature.Builder addFeaturesBuilder(int index) {
      return getFeaturesFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Feature.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The Features matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Feature features = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Feature.Builder>
        getFeaturesBuilderList() {
      return getFeaturesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Feature,
            com.google.cloud.aiplatform.v1beta1.Feature.Builder,
            com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>
        getFeaturesFieldBuilder() {
      if (featuresBuilder_ == null) {
        featuresBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Feature,
                com.google.cloud.aiplatform.v1beta1.Feature.Builder,
                com.google.cloud.aiplatform.v1beta1.FeatureOrBuilder>(
                features_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        features_ = null;
      }
      return featuresBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListFeaturesRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeaturesRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as [ListFeaturesRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeaturesRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as [ListFeaturesRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeaturesRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListFeaturesRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeaturesRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListFeaturesRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeaturesRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListFeaturesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListFeaturesResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFeaturesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListFeaturesResponse>() {
        @java.lang.Override
        public ListFeaturesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListFeaturesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFeaturesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListFeaturesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
