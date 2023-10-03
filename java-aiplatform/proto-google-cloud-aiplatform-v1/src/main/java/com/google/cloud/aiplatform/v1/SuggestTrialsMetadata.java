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
// source: google/cloud/aiplatform/v1/vizier_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Details of operations that perform Trials suggestion.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.SuggestTrialsMetadata}
 */
public final class SuggestTrialsMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.SuggestTrialsMetadata)
    SuggestTrialsMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SuggestTrialsMetadata.newBuilder() to construct.
  private SuggestTrialsMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SuggestTrialsMetadata() {
    clientId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SuggestTrialsMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1_SuggestTrialsMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1_SuggestTrialsMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.SuggestTrialsMetadata.class,
            com.google.cloud.aiplatform.v1.SuggestTrialsMetadata.Builder.class);
  }

  public static final int GENERIC_METADATA_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.GenericOperationMetadata genericMetadata_;
  /**
   *
   *
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   *
   * @return Whether the genericMetadata field is set.
   */
  @java.lang.Override
  public boolean hasGenericMetadata() {
    return genericMetadata_ != null;
  }
  /**
   *
   *
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   *
   * @return The genericMetadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GenericOperationMetadata getGenericMetadata() {
    return genericMetadata_ == null
        ? com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance()
        : genericMetadata_;
  }
  /**
   *
   *
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder
      getGenericMetadataOrBuilder() {
    return genericMetadata_ == null
        ? com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance()
        : genericMetadata_;
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
   *
   *
   * <pre>
   * The identifier of the client that is requesting the suggestion.
   *
   * If multiple SuggestTrialsRequests have the same `client_id`,
   * the service will return the identical suggested Trial if the Trial is
   * pending, and provide a new Trial if the last suggested Trial was completed.
   * </pre>
   *
   * <code>string client_id = 2;</code>
   *
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The identifier of the client that is requesting the suggestion.
   *
   * If multiple SuggestTrialsRequests have the same `client_id`,
   * the service will return the identical suggested Trial if the Trial is
   * pending, and provide a new Trial if the last suggested Trial was completed.
   * </pre>
   *
   * <code>string client_id = 2;</code>
   *
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      clientId_ = b;
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
    if (genericMetadata_ != null) {
      output.writeMessage(1, getGenericMetadata());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (genericMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGenericMetadata());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.SuggestTrialsMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.SuggestTrialsMetadata other =
        (com.google.cloud.aiplatform.v1.SuggestTrialsMetadata) obj;

    if (hasGenericMetadata() != other.hasGenericMetadata()) return false;
    if (hasGenericMetadata()) {
      if (!getGenericMetadata().equals(other.getGenericMetadata())) return false;
    }
    if (!getClientId().equals(other.getClientId())) return false;
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
    if (hasGenericMetadata()) {
      hash = (37 * hash) + GENERIC_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getGenericMetadata().hashCode();
    }
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.SuggestTrialsMetadata prototype) {
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
   * Details of operations that perform Trials suggestion.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.SuggestTrialsMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.SuggestTrialsMetadata)
      com.google.cloud.aiplatform.v1.SuggestTrialsMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1_SuggestTrialsMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1_SuggestTrialsMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.SuggestTrialsMetadata.class,
              com.google.cloud.aiplatform.v1.SuggestTrialsMetadata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.SuggestTrialsMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      genericMetadata_ = null;
      if (genericMetadataBuilder_ != null) {
        genericMetadataBuilder_.dispose();
        genericMetadataBuilder_ = null;
      }
      clientId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1_SuggestTrialsMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SuggestTrialsMetadata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.SuggestTrialsMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SuggestTrialsMetadata build() {
      com.google.cloud.aiplatform.v1.SuggestTrialsMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SuggestTrialsMetadata buildPartial() {
      com.google.cloud.aiplatform.v1.SuggestTrialsMetadata result =
          new com.google.cloud.aiplatform.v1.SuggestTrialsMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.SuggestTrialsMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.genericMetadata_ =
            genericMetadataBuilder_ == null ? genericMetadata_ : genericMetadataBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientId_ = clientId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.SuggestTrialsMetadata) {
        return mergeFrom((com.google.cloud.aiplatform.v1.SuggestTrialsMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.SuggestTrialsMetadata other) {
      if (other == com.google.cloud.aiplatform.v1.SuggestTrialsMetadata.getDefaultInstance())
        return this;
      if (other.hasGenericMetadata()) {
        mergeGenericMetadata(other.getGenericMetadata());
      }
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
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
                input.readMessage(getGenericMetadataFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                clientId_ = input.readStringRequireUtf8();
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

    private com.google.cloud.aiplatform.v1.GenericOperationMetadata genericMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.GenericOperationMetadata,
            com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder,
            com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder>
        genericMetadataBuilder_;
    /**
     *
     *
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     *
     * @return Whether the genericMetadata field is set.
     */
    public boolean hasGenericMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     *
     * @return The genericMetadata.
     */
    public com.google.cloud.aiplatform.v1.GenericOperationMetadata getGenericMetadata() {
      if (genericMetadataBuilder_ == null) {
        return genericMetadata_ == null
            ? com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance()
            : genericMetadata_;
      } else {
        return genericMetadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(
        com.google.cloud.aiplatform.v1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        genericMetadata_ = value;
      } else {
        genericMetadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(
        com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder builderForValue) {
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = builderForValue.build();
      } else {
        genericMetadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder mergeGenericMetadata(
        com.google.cloud.aiplatform.v1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && genericMetadata_ != null
            && genericMetadata_
                != com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance()) {
          getGenericMetadataBuilder().mergeFrom(value);
        } else {
          genericMetadata_ = value;
        }
      } else {
        genericMetadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder clearGenericMetadata() {
      bitField0_ = (bitField0_ & ~0x00000001);
      genericMetadata_ = null;
      if (genericMetadataBuilder_ != null) {
        genericMetadataBuilder_.dispose();
        genericMetadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder
        getGenericMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGenericMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder
        getGenericMetadataOrBuilder() {
      if (genericMetadataBuilder_ != null) {
        return genericMetadataBuilder_.getMessageOrBuilder();
      } else {
        return genericMetadata_ == null
            ? com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance()
            : genericMetadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.GenericOperationMetadata,
            com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder,
            com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder>
        getGenericMetadataFieldBuilder() {
      if (genericMetadataBuilder_ == null) {
        genericMetadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.GenericOperationMetadata,
                com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder,
                com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder>(
                getGenericMetadata(), getParentForChildren(), isClean());
        genericMetadata_ = null;
      }
      return genericMetadataBuilder_;
    }

    private java.lang.Object clientId_ = "";
    /**
     *
     *
     * <pre>
     * The identifier of the client that is requesting the suggestion.
     *
     * If multiple SuggestTrialsRequests have the same `client_id`,
     * the service will return the identical suggested Trial if the Trial is
     * pending, and provide a new Trial if the last suggested Trial was completed.
     * </pre>
     *
     * <code>string client_id = 2;</code>
     *
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The identifier of the client that is requesting the suggestion.
     *
     * If multiple SuggestTrialsRequests have the same `client_id`,
     * the service will return the identical suggested Trial if the Trial is
     * pending, and provide a new Trial if the last suggested Trial was completed.
     * </pre>
     *
     * <code>string client_id = 2;</code>
     *
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The identifier of the client that is requesting the suggestion.
     *
     * If multiple SuggestTrialsRequests have the same `client_id`,
     * the service will return the identical suggested Trial if the Trial is
     * pending, and provide a new Trial if the last suggested Trial was completed.
     * </pre>
     *
     * <code>string client_id = 2;</code>
     *
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      clientId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The identifier of the client that is requesting the suggestion.
     *
     * If multiple SuggestTrialsRequests have the same `client_id`,
     * the service will return the identical suggested Trial if the Trial is
     * pending, and provide a new Trial if the last suggested Trial was completed.
     * </pre>
     *
     * <code>string client_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The identifier of the client that is requesting the suggestion.
     *
     * If multiple SuggestTrialsRequests have the same `client_id`,
     * the service will return the identical suggested Trial if the Trial is
     * pending, and provide a new Trial if the last suggested Trial was completed.
     * </pre>
     *
     * <code>string client_id = 2;</code>
     *
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      clientId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.SuggestTrialsMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.SuggestTrialsMetadata)
  private static final com.google.cloud.aiplatform.v1.SuggestTrialsMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.SuggestTrialsMetadata();
  }

  public static com.google.cloud.aiplatform.v1.SuggestTrialsMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestTrialsMetadata> PARSER =
      new com.google.protobuf.AbstractParser<SuggestTrialsMetadata>() {
        @java.lang.Override
        public SuggestTrialsMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestTrialsMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestTrialsMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SuggestTrialsMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
