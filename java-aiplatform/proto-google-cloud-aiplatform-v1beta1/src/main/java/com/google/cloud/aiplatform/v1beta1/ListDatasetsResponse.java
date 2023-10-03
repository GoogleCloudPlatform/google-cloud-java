/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [DatasetService.ListDatasets][google.cloud.aiplatform.v1beta1.DatasetService.ListDatasets].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListDatasetsResponse}
 */
public final class ListDatasetsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListDatasetsResponse)
    ListDatasetsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDatasetsResponse.newBuilder() to construct.
  private ListDatasetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDatasetsResponse() {
    datasets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDatasetsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListDatasetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListDatasetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse.Builder.class);
  }

  public static final int DATASETS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Dataset> datasets_;
  /**
   *
   *
   * <pre>
   * A list of Datasets that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Dataset> getDatasetsList() {
    return datasets_;
  }
  /**
   *
   *
   * <pre>
   * A list of Datasets that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.DatasetOrBuilder>
      getDatasetsOrBuilderList() {
    return datasets_;
  }
  /**
   *
   *
   * <pre>
   * A list of Datasets that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
   */
  @java.lang.Override
  public int getDatasetsCount() {
    return datasets_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of Datasets that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Dataset getDatasets(int index) {
    return datasets_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of Datasets that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DatasetOrBuilder getDatasetsOrBuilder(int index) {
    return datasets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * The standard List next-page token.
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
   * The standard List next-page token.
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
    for (int i = 0; i < datasets_.size(); i++) {
      output.writeMessage(1, datasets_.get(i));
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
    for (int i = 0; i < datasets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, datasets_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse) obj;

    if (!getDatasetsList().equals(other.getDatasetsList())) return false;
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
    if (getDatasetsCount() > 0) {
      hash = (37 * hash) + DATASETS_FIELD_NUMBER;
      hash = (53 * hash) + getDatasetsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse prototype) {
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
   * Response message for
   * [DatasetService.ListDatasets][google.cloud.aiplatform.v1beta1.DatasetService.ListDatasets].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListDatasetsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListDatasetsResponse)
      com.google.cloud.aiplatform.v1beta1.ListDatasetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListDatasetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListDatasetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (datasetsBuilder_ == null) {
        datasets_ = java.util.Collections.emptyList();
      } else {
        datasets_ = null;
        datasetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListDatasetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse result) {
      if (datasetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          datasets_ = java.util.Collections.unmodifiableList(datasets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.datasets_ = datasets_;
      } else {
        result.datasets_ = datasetsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse.getDefaultInstance())
        return this;
      if (datasetsBuilder_ == null) {
        if (!other.datasets_.isEmpty()) {
          if (datasets_.isEmpty()) {
            datasets_ = other.datasets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatasetsIsMutable();
            datasets_.addAll(other.datasets_);
          }
          onChanged();
        }
      } else {
        if (!other.datasets_.isEmpty()) {
          if (datasetsBuilder_.isEmpty()) {
            datasetsBuilder_.dispose();
            datasetsBuilder_ = null;
            datasets_ = other.datasets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            datasetsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDatasetsFieldBuilder()
                    : null;
          } else {
            datasetsBuilder_.addAllMessages(other.datasets_);
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
                com.google.cloud.aiplatform.v1beta1.Dataset m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.Dataset.parser(), extensionRegistry);
                if (datasetsBuilder_ == null) {
                  ensureDatasetsIsMutable();
                  datasets_.add(m);
                } else {
                  datasetsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Dataset> datasets_ =
        java.util.Collections.emptyList();

    private void ensureDatasetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        datasets_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Dataset>(datasets_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Dataset,
            com.google.cloud.aiplatform.v1beta1.Dataset.Builder,
            com.google.cloud.aiplatform.v1beta1.DatasetOrBuilder>
        datasetsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Dataset> getDatasetsList() {
      if (datasetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(datasets_);
      } else {
        return datasetsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public int getDatasetsCount() {
      if (datasetsBuilder_ == null) {
        return datasets_.size();
      } else {
        return datasetsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Dataset getDatasets(int index) {
      if (datasetsBuilder_ == null) {
        return datasets_.get(index);
      } else {
        return datasetsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public Builder setDatasets(int index, com.google.cloud.aiplatform.v1beta1.Dataset value) {
      if (datasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatasetsIsMutable();
        datasets_.set(index, value);
        onChanged();
      } else {
        datasetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public Builder setDatasets(
        int index, com.google.cloud.aiplatform.v1beta1.Dataset.Builder builderForValue) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        datasets_.set(index, builderForValue.build());
        onChanged();
      } else {
        datasetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public Builder addDatasets(com.google.cloud.aiplatform.v1beta1.Dataset value) {
      if (datasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatasetsIsMutable();
        datasets_.add(value);
        onChanged();
      } else {
        datasetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public Builder addDatasets(int index, com.google.cloud.aiplatform.v1beta1.Dataset value) {
      if (datasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatasetsIsMutable();
        datasets_.add(index, value);
        onChanged();
      } else {
        datasetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public Builder addDatasets(
        com.google.cloud.aiplatform.v1beta1.Dataset.Builder builderForValue) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        datasets_.add(builderForValue.build());
        onChanged();
      } else {
        datasetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public Builder addDatasets(
        int index, com.google.cloud.aiplatform.v1beta1.Dataset.Builder builderForValue) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        datasets_.add(index, builderForValue.build());
        onChanged();
      } else {
        datasetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public Builder addAllDatasets(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Dataset> values) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, datasets_);
        onChanged();
      } else {
        datasetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public Builder clearDatasets() {
      if (datasetsBuilder_ == null) {
        datasets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        datasetsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public Builder removeDatasets(int index) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        datasets_.remove(index);
        onChanged();
      } else {
        datasetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Dataset.Builder getDatasetsBuilder(int index) {
      return getDatasetsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DatasetOrBuilder getDatasetsOrBuilder(int index) {
      if (datasetsBuilder_ == null) {
        return datasets_.get(index);
      } else {
        return datasetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.DatasetOrBuilder>
        getDatasetsOrBuilderList() {
      if (datasetsBuilder_ != null) {
        return datasetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(datasets_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Dataset.Builder addDatasetsBuilder() {
      return getDatasetsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Dataset.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Dataset.Builder addDatasetsBuilder(int index) {
      return getDatasetsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Dataset.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of Datasets that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Dataset datasets = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Dataset.Builder>
        getDatasetsBuilderList() {
      return getDatasetsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Dataset,
            com.google.cloud.aiplatform.v1beta1.Dataset.Builder,
            com.google.cloud.aiplatform.v1beta1.DatasetOrBuilder>
        getDatasetsFieldBuilder() {
      if (datasetsBuilder_ == null) {
        datasetsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Dataset,
                com.google.cloud.aiplatform.v1beta1.Dataset.Builder,
                com.google.cloud.aiplatform.v1beta1.DatasetOrBuilder>(
                datasets_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        datasets_ = null;
      }
      return datasetsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
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
     * The standard List next-page token.
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
     * The standard List next-page token.
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
     * The standard List next-page token.
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
     * The standard List next-page token.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListDatasetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListDatasetsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDatasetsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDatasetsResponse>() {
        @java.lang.Override
        public ListDatasetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDatasetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDatasetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListDatasetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
