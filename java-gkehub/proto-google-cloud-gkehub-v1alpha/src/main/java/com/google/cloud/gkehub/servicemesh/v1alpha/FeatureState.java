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
// source: google/cloud/gkehub/v1alpha/servicemesh/servicemesh.proto

package com.google.cloud.gkehub.servicemesh.v1alpha;

/**
 *
 *
 * <pre>
 * **Service Mesh**: State for the whole Hub, as analyzed by the Service Mesh
 * Hub Controller.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.servicemesh.v1alpha.FeatureState}
 */
public final class FeatureState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.servicemesh.v1alpha.FeatureState)
    FeatureStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FeatureState.newBuilder() to construct.
  private FeatureState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FeatureState() {
    analysisMessages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FeatureState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.servicemesh.v1alpha.ServiceMeshProto
        .internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.servicemesh.v1alpha.ServiceMeshProto
        .internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState.class,
            com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState.Builder.class);
  }

  public static final int ANALYSIS_MESSAGES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage>
      analysisMessages_;
  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage>
      getAnalysisMessagesList() {
    return analysisMessages_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder>
      getAnalysisMessagesOrBuilderList() {
    return analysisMessages_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public int getAnalysisMessagesCount() {
    return analysisMessages_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage getAnalysisMessages(
      int index) {
    return analysisMessages_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder
      getAnalysisMessagesOrBuilder(int index) {
    return analysisMessages_.get(index);
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
    for (int i = 0; i < analysisMessages_.size(); i++) {
      output.writeMessage(1, analysisMessages_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < analysisMessages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, analysisMessages_.get(i));
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
    if (!(obj instanceof com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState other =
        (com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState) obj;

    if (!getAnalysisMessagesList().equals(other.getAnalysisMessagesList())) return false;
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
    if (getAnalysisMessagesCount() > 0) {
      hash = (37 * hash) + ANALYSIS_MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getAnalysisMessagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState parseFrom(
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
      com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState prototype) {
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
   * **Service Mesh**: State for the whole Hub, as analyzed by the Service Mesh
   * Hub Controller.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.servicemesh.v1alpha.FeatureState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.servicemesh.v1alpha.FeatureState)
      com.google.cloud.gkehub.servicemesh.v1alpha.FeatureStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.servicemesh.v1alpha.ServiceMeshProto
          .internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.servicemesh.v1alpha.ServiceMeshProto
          .internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState.class,
              com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (analysisMessagesBuilder_ == null) {
        analysisMessages_ = java.util.Collections.emptyList();
      } else {
        analysisMessages_ = null;
        analysisMessagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.servicemesh.v1alpha.ServiceMeshProto
          .internal_static_google_cloud_gkehub_servicemesh_v1alpha_FeatureState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState build() {
      com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState buildPartial() {
      com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState result =
          new com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState result) {
      if (analysisMessagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          analysisMessages_ = java.util.Collections.unmodifiableList(analysisMessages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.analysisMessages_ = analysisMessages_;
      } else {
        result.analysisMessages_ = analysisMessagesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState result) {
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
      if (other instanceof com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState) {
        return mergeFrom((com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState other) {
      if (other == com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState.getDefaultInstance())
        return this;
      if (analysisMessagesBuilder_ == null) {
        if (!other.analysisMessages_.isEmpty()) {
          if (analysisMessages_.isEmpty()) {
            analysisMessages_ = other.analysisMessages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnalysisMessagesIsMutable();
            analysisMessages_.addAll(other.analysisMessages_);
          }
          onChanged();
        }
      } else {
        if (!other.analysisMessages_.isEmpty()) {
          if (analysisMessagesBuilder_.isEmpty()) {
            analysisMessagesBuilder_.dispose();
            analysisMessagesBuilder_ = null;
            analysisMessages_ = other.analysisMessages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            analysisMessagesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAnalysisMessagesFieldBuilder()
                    : null;
          } else {
            analysisMessagesBuilder_.addAllMessages(other.analysisMessages_);
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
                com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage m =
                    input.readMessage(
                        com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.parser(),
                        extensionRegistry);
                if (analysisMessagesBuilder_ == null) {
                  ensureAnalysisMessagesIsMutable();
                  analysisMessages_.add(m);
                } else {
                  analysisMessagesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage>
        analysisMessages_ = java.util.Collections.emptyList();

    private void ensureAnalysisMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        analysisMessages_ =
            new java.util.ArrayList<com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage>(
                analysisMessages_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage,
            com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder,
            com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder>
        analysisMessagesBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage>
        getAnalysisMessagesList() {
      if (analysisMessagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(analysisMessages_);
      } else {
        return analysisMessagesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getAnalysisMessagesCount() {
      if (analysisMessagesBuilder_ == null) {
        return analysisMessages_.size();
      } else {
        return analysisMessagesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage getAnalysisMessages(
        int index) {
      if (analysisMessagesBuilder_ == null) {
        return analysisMessages_.get(index);
      } else {
        return analysisMessagesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setAnalysisMessages(
        int index, com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage value) {
      if (analysisMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysisMessagesIsMutable();
        analysisMessages_.set(index, value);
        onChanged();
      } else {
        analysisMessagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setAnalysisMessages(
        int index,
        com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder builderForValue) {
      if (analysisMessagesBuilder_ == null) {
        ensureAnalysisMessagesIsMutable();
        analysisMessages_.set(index, builderForValue.build());
        onChanged();
      } else {
        analysisMessagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAnalysisMessages(
        com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage value) {
      if (analysisMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysisMessagesIsMutable();
        analysisMessages_.add(value);
        onChanged();
      } else {
        analysisMessagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAnalysisMessages(
        int index, com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage value) {
      if (analysisMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysisMessagesIsMutable();
        analysisMessages_.add(index, value);
        onChanged();
      } else {
        analysisMessagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAnalysisMessages(
        com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder builderForValue) {
      if (analysisMessagesBuilder_ == null) {
        ensureAnalysisMessagesIsMutable();
        analysisMessages_.add(builderForValue.build());
        onChanged();
      } else {
        analysisMessagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAnalysisMessages(
        int index,
        com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder builderForValue) {
      if (analysisMessagesBuilder_ == null) {
        ensureAnalysisMessagesIsMutable();
        analysisMessages_.add(index, builderForValue.build());
        onChanged();
      } else {
        analysisMessagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllAnalysisMessages(
        java.lang.Iterable<? extends com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage>
            values) {
      if (analysisMessagesBuilder_ == null) {
        ensureAnalysisMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, analysisMessages_);
        onChanged();
      } else {
        analysisMessagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearAnalysisMessages() {
      if (analysisMessagesBuilder_ == null) {
        analysisMessages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        analysisMessagesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeAnalysisMessages(int index) {
      if (analysisMessagesBuilder_ == null) {
        ensureAnalysisMessagesIsMutable();
        analysisMessages_.remove(index);
        onChanged();
      } else {
        analysisMessagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder
        getAnalysisMessagesBuilder(int index) {
      return getAnalysisMessagesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder
        getAnalysisMessagesOrBuilder(int index) {
      if (analysisMessagesBuilder_ == null) {
        return analysisMessages_.get(index);
      } else {
        return analysisMessagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder>
        getAnalysisMessagesOrBuilderList() {
      if (analysisMessagesBuilder_ != null) {
        return analysisMessagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(analysisMessages_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder
        addAnalysisMessagesBuilder() {
      return getAnalysisMessagesFieldBuilder()
          .addBuilder(
              com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder
        addAnalysisMessagesBuilder(int index) {
      return getAnalysisMessagesFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Results of running Service Mesh analyzers.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder>
        getAnalysisMessagesBuilderList() {
      return getAnalysisMessagesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage,
            com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder,
            com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder>
        getAnalysisMessagesFieldBuilder() {
      if (analysisMessagesBuilder_ == null) {
        analysisMessagesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage,
                com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage.Builder,
                com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder>(
                analysisMessages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        analysisMessages_ = null;
      }
      return analysisMessagesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.servicemesh.v1alpha.FeatureState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.servicemesh.v1alpha.FeatureState)
  private static final com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState();
  }

  public static com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureState> PARSER =
      new com.google.protobuf.AbstractParser<FeatureState>() {
        @java.lang.Override
        public FeatureState parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.servicemesh.v1alpha.FeatureState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
