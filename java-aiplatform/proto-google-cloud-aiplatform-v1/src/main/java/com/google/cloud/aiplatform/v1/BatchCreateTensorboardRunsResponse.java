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
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [TensorboardService.BatchCreateTensorboardRuns][google.cloud.aiplatform.v1.TensorboardService.BatchCreateTensorboardRuns].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse}
 */
public final class BatchCreateTensorboardRunsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse)
    BatchCreateTensorboardRunsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateTensorboardRunsResponse.newBuilder() to construct.
  private BatchCreateTensorboardRunsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateTensorboardRunsResponse() {
    tensorboardRuns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCreateTensorboardRunsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardRunsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardRunsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse.class,
            com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse.Builder.class);
  }

  public static final int TENSORBOARD_RUNS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1.TensorboardRun> tensorboardRuns_;
  /**
   *
   *
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.TensorboardRun> getTensorboardRunsList() {
    return tensorboardRuns_;
  }
  /**
   *
   *
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder>
      getTensorboardRunsOrBuilderList() {
    return tensorboardRuns_;
  }
  /**
   *
   *
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public int getTensorboardRunsCount() {
    return tensorboardRuns_.size();
  }
  /**
   *
   *
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardRun getTensorboardRuns(int index) {
    return tensorboardRuns_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder getTensorboardRunsOrBuilder(
      int index) {
    return tensorboardRuns_.get(index);
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
    for (int i = 0; i < tensorboardRuns_.size(); i++) {
      output.writeMessage(1, tensorboardRuns_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tensorboardRuns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, tensorboardRuns_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse other =
        (com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse) obj;

    if (!getTensorboardRunsList().equals(other.getTensorboardRunsList())) return false;
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
    if (getTensorboardRunsCount() > 0) {
      hash = (37 * hash) + TENSORBOARD_RUNS_FIELD_NUMBER;
      hash = (53 * hash) + getTensorboardRunsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse prototype) {
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
   * [TensorboardService.BatchCreateTensorboardRuns][google.cloud.aiplatform.v1.TensorboardService.BatchCreateTensorboardRuns].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse)
      com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardRunsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardRunsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse.class,
              com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tensorboardRunsBuilder_ == null) {
        tensorboardRuns_ = java.util.Collections.emptyList();
      } else {
        tensorboardRuns_ = null;
        tensorboardRunsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1_BatchCreateTensorboardRunsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse build() {
      com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse result =
          new com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse(this);
      int from_bitField0_ = bitField0_;
      if (tensorboardRunsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tensorboardRuns_ = java.util.Collections.unmodifiableList(tensorboardRuns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tensorboardRuns_ = tensorboardRuns_;
      } else {
        result.tensorboardRuns_ = tensorboardRunsBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse.getDefaultInstance())
        return this;
      if (tensorboardRunsBuilder_ == null) {
        if (!other.tensorboardRuns_.isEmpty()) {
          if (tensorboardRuns_.isEmpty()) {
            tensorboardRuns_ = other.tensorboardRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTensorboardRunsIsMutable();
            tensorboardRuns_.addAll(other.tensorboardRuns_);
          }
          onChanged();
        }
      } else {
        if (!other.tensorboardRuns_.isEmpty()) {
          if (tensorboardRunsBuilder_.isEmpty()) {
            tensorboardRunsBuilder_.dispose();
            tensorboardRunsBuilder_ = null;
            tensorboardRuns_ = other.tensorboardRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tensorboardRunsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTensorboardRunsFieldBuilder()
                    : null;
          } else {
            tensorboardRunsBuilder_.addAllMessages(other.tensorboardRuns_);
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
                com.google.cloud.aiplatform.v1.TensorboardRun m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.TensorboardRun.parser(), extensionRegistry);
                if (tensorboardRunsBuilder_ == null) {
                  ensureTensorboardRunsIsMutable();
                  tensorboardRuns_.add(m);
                } else {
                  tensorboardRunsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1.TensorboardRun> tensorboardRuns_ =
        java.util.Collections.emptyList();

    private void ensureTensorboardRunsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tensorboardRuns_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.TensorboardRun>(
                tensorboardRuns_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TensorboardRun,
            com.google.cloud.aiplatform.v1.TensorboardRun.Builder,
            com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder>
        tensorboardRunsBuilder_;

    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.TensorboardRun> getTensorboardRunsList() {
      if (tensorboardRunsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tensorboardRuns_);
      } else {
        return tensorboardRunsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public int getTensorboardRunsCount() {
      if (tensorboardRunsBuilder_ == null) {
        return tensorboardRuns_.size();
      } else {
        return tensorboardRunsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardRun getTensorboardRuns(int index) {
      if (tensorboardRunsBuilder_ == null) {
        return tensorboardRuns_.get(index);
      } else {
        return tensorboardRunsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder setTensorboardRuns(
        int index, com.google.cloud.aiplatform.v1.TensorboardRun value) {
      if (tensorboardRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.set(index, value);
        onChanged();
      } else {
        tensorboardRunsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder setTensorboardRuns(
        int index, com.google.cloud.aiplatform.v1.TensorboardRun.Builder builderForValue) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.set(index, builderForValue.build());
        onChanged();
      } else {
        tensorboardRunsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addTensorboardRuns(com.google.cloud.aiplatform.v1.TensorboardRun value) {
      if (tensorboardRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.add(value);
        onChanged();
      } else {
        tensorboardRunsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addTensorboardRuns(
        int index, com.google.cloud.aiplatform.v1.TensorboardRun value) {
      if (tensorboardRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.add(index, value);
        onChanged();
      } else {
        tensorboardRunsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addTensorboardRuns(
        com.google.cloud.aiplatform.v1.TensorboardRun.Builder builderForValue) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.add(builderForValue.build());
        onChanged();
      } else {
        tensorboardRunsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addTensorboardRuns(
        int index, com.google.cloud.aiplatform.v1.TensorboardRun.Builder builderForValue) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.add(index, builderForValue.build());
        onChanged();
      } else {
        tensorboardRunsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addAllTensorboardRuns(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.TensorboardRun> values) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tensorboardRuns_);
        onChanged();
      } else {
        tensorboardRunsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder clearTensorboardRuns() {
      if (tensorboardRunsBuilder_ == null) {
        tensorboardRuns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tensorboardRunsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder removeTensorboardRuns(int index) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.remove(index);
        onChanged();
      } else {
        tensorboardRunsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardRun.Builder getTensorboardRunsBuilder(
        int index) {
      return getTensorboardRunsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder getTensorboardRunsOrBuilder(
        int index) {
      if (tensorboardRunsBuilder_ == null) {
        return tensorboardRuns_.get(index);
      } else {
        return tensorboardRunsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder>
        getTensorboardRunsOrBuilderList() {
      if (tensorboardRunsBuilder_ != null) {
        return tensorboardRunsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tensorboardRuns_);
      }
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardRun.Builder addTensorboardRunsBuilder() {
      return getTensorboardRunsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.TensorboardRun.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardRun.Builder addTensorboardRunsBuilder(
        int index) {
      return getTensorboardRunsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1.TensorboardRun.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The created TensorboardRuns.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.TensorboardRun.Builder>
        getTensorboardRunsBuilderList() {
      return getTensorboardRunsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TensorboardRun,
            com.google.cloud.aiplatform.v1.TensorboardRun.Builder,
            com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder>
        getTensorboardRunsFieldBuilder() {
      if (tensorboardRunsBuilder_ == null) {
        tensorboardRunsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.TensorboardRun,
                com.google.cloud.aiplatform.v1.TensorboardRun.Builder,
                com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder>(
                tensorboardRuns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tensorboardRuns_ = null;
      }
      return tensorboardRunsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse)
  private static final com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse();
  }

  public static com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateTensorboardRunsResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateTensorboardRunsResponse>() {
        @java.lang.Override
        public BatchCreateTensorboardRunsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateTensorboardRunsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateTensorboardRunsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
