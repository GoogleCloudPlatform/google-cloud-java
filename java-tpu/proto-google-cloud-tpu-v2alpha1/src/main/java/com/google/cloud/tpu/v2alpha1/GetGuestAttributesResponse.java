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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tpu.v2alpha1;

/**
 *
 *
 * <pre>
 * Response for
 * [GetGuestAttributes][google.cloud.tpu.v2alpha1.Tpu.GetGuestAttributes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.GetGuestAttributesResponse}
 */
public final class GetGuestAttributesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.GetGuestAttributesResponse)
    GetGuestAttributesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetGuestAttributesResponse.newBuilder() to construct.
  private GetGuestAttributesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetGuestAttributesResponse() {
    guestAttributes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetGuestAttributesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto
        .internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto
        .internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse.class,
            com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse.Builder.class);
  }

  public static final int GUEST_ATTRIBUTES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.tpu.v2alpha1.GuestAttributes> guestAttributes_;
  /**
   *
   *
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.tpu.v2alpha1.GuestAttributes> getGuestAttributesList() {
    return guestAttributes_;
  }
  /**
   *
   *
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.tpu.v2alpha1.GuestAttributesOrBuilder>
      getGuestAttributesOrBuilderList() {
    return guestAttributes_;
  }
  /**
   *
   *
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  @java.lang.Override
  public int getGuestAttributesCount() {
    return guestAttributes_.size();
  }
  /**
   *
   *
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.GuestAttributes getGuestAttributes(int index) {
    return guestAttributes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.GuestAttributesOrBuilder getGuestAttributesOrBuilder(
      int index) {
    return guestAttributes_.get(index);
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
    for (int i = 0; i < guestAttributes_.size(); i++) {
      output.writeMessage(1, guestAttributes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < guestAttributes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, guestAttributes_.get(i));
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
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse other =
        (com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse) obj;

    if (!getGuestAttributesList().equals(other.getGuestAttributesList())) return false;
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
    if (getGuestAttributesCount() > 0) {
      hash = (37 * hash) + GUEST_ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getGuestAttributesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse parseFrom(
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
      com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse prototype) {
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
   * Response for
   * [GetGuestAttributes][google.cloud.tpu.v2alpha1.Tpu.GetGuestAttributes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.GetGuestAttributesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.GetGuestAttributesResponse)
      com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse.class,
              com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (guestAttributesBuilder_ == null) {
        guestAttributes_ = java.util.Collections.emptyList();
      } else {
        guestAttributes_ = null;
        guestAttributesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_GetGuestAttributesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse build() {
      com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse buildPartial() {
      com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse result =
          new com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse result) {
      if (guestAttributesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          guestAttributes_ = java.util.Collections.unmodifiableList(guestAttributes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.guestAttributes_ = guestAttributes_;
      } else {
        result.guestAttributes_ = guestAttributesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse result) {
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
      if (other instanceof com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse other) {
      if (other == com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse.getDefaultInstance())
        return this;
      if (guestAttributesBuilder_ == null) {
        if (!other.guestAttributes_.isEmpty()) {
          if (guestAttributes_.isEmpty()) {
            guestAttributes_ = other.guestAttributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGuestAttributesIsMutable();
            guestAttributes_.addAll(other.guestAttributes_);
          }
          onChanged();
        }
      } else {
        if (!other.guestAttributes_.isEmpty()) {
          if (guestAttributesBuilder_.isEmpty()) {
            guestAttributesBuilder_.dispose();
            guestAttributesBuilder_ = null;
            guestAttributes_ = other.guestAttributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            guestAttributesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getGuestAttributesFieldBuilder()
                    : null;
          } else {
            guestAttributesBuilder_.addAllMessages(other.guestAttributes_);
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
                com.google.cloud.tpu.v2alpha1.GuestAttributes m =
                    input.readMessage(
                        com.google.cloud.tpu.v2alpha1.GuestAttributes.parser(), extensionRegistry);
                if (guestAttributesBuilder_ == null) {
                  ensureGuestAttributesIsMutable();
                  guestAttributes_.add(m);
                } else {
                  guestAttributesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.tpu.v2alpha1.GuestAttributes> guestAttributes_ =
        java.util.Collections.emptyList();

    private void ensureGuestAttributesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        guestAttributes_ =
            new java.util.ArrayList<com.google.cloud.tpu.v2alpha1.GuestAttributes>(
                guestAttributes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.tpu.v2alpha1.GuestAttributes,
            com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder,
            com.google.cloud.tpu.v2alpha1.GuestAttributesOrBuilder>
        guestAttributesBuilder_;

    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public java.util.List<com.google.cloud.tpu.v2alpha1.GuestAttributes> getGuestAttributesList() {
      if (guestAttributesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(guestAttributes_);
      } else {
        return guestAttributesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public int getGuestAttributesCount() {
      if (guestAttributesBuilder_ == null) {
        return guestAttributes_.size();
      } else {
        return guestAttributesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public com.google.cloud.tpu.v2alpha1.GuestAttributes getGuestAttributes(int index) {
      if (guestAttributesBuilder_ == null) {
        return guestAttributes_.get(index);
      } else {
        return guestAttributesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public Builder setGuestAttributes(
        int index, com.google.cloud.tpu.v2alpha1.GuestAttributes value) {
      if (guestAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuestAttributesIsMutable();
        guestAttributes_.set(index, value);
        onChanged();
      } else {
        guestAttributesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public Builder setGuestAttributes(
        int index, com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder builderForValue) {
      if (guestAttributesBuilder_ == null) {
        ensureGuestAttributesIsMutable();
        guestAttributes_.set(index, builderForValue.build());
        onChanged();
      } else {
        guestAttributesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public Builder addGuestAttributes(com.google.cloud.tpu.v2alpha1.GuestAttributes value) {
      if (guestAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuestAttributesIsMutable();
        guestAttributes_.add(value);
        onChanged();
      } else {
        guestAttributesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public Builder addGuestAttributes(
        int index, com.google.cloud.tpu.v2alpha1.GuestAttributes value) {
      if (guestAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuestAttributesIsMutable();
        guestAttributes_.add(index, value);
        onChanged();
      } else {
        guestAttributesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public Builder addGuestAttributes(
        com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder builderForValue) {
      if (guestAttributesBuilder_ == null) {
        ensureGuestAttributesIsMutable();
        guestAttributes_.add(builderForValue.build());
        onChanged();
      } else {
        guestAttributesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public Builder addGuestAttributes(
        int index, com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder builderForValue) {
      if (guestAttributesBuilder_ == null) {
        ensureGuestAttributesIsMutable();
        guestAttributes_.add(index, builderForValue.build());
        onChanged();
      } else {
        guestAttributesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public Builder addAllGuestAttributes(
        java.lang.Iterable<? extends com.google.cloud.tpu.v2alpha1.GuestAttributes> values) {
      if (guestAttributesBuilder_ == null) {
        ensureGuestAttributesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, guestAttributes_);
        onChanged();
      } else {
        guestAttributesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public Builder clearGuestAttributes() {
      if (guestAttributesBuilder_ == null) {
        guestAttributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        guestAttributesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public Builder removeGuestAttributes(int index) {
      if (guestAttributesBuilder_ == null) {
        ensureGuestAttributesIsMutable();
        guestAttributes_.remove(index);
        onChanged();
      } else {
        guestAttributesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder getGuestAttributesBuilder(
        int index) {
      return getGuestAttributesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public com.google.cloud.tpu.v2alpha1.GuestAttributesOrBuilder getGuestAttributesOrBuilder(
        int index) {
      if (guestAttributesBuilder_ == null) {
        return guestAttributes_.get(index);
      } else {
        return guestAttributesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.tpu.v2alpha1.GuestAttributesOrBuilder>
        getGuestAttributesOrBuilderList() {
      if (guestAttributesBuilder_ != null) {
        return guestAttributesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(guestAttributes_);
      }
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder addGuestAttributesBuilder() {
      return getGuestAttributesFieldBuilder()
          .addBuilder(com.google.cloud.tpu.v2alpha1.GuestAttributes.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder addGuestAttributesBuilder(
        int index) {
      return getGuestAttributesFieldBuilder()
          .addBuilder(index, com.google.cloud.tpu.v2alpha1.GuestAttributes.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The guest attributes for the TPU workers.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributes guest_attributes = 1;</code>
     */
    public java.util.List<com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder>
        getGuestAttributesBuilderList() {
      return getGuestAttributesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.tpu.v2alpha1.GuestAttributes,
            com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder,
            com.google.cloud.tpu.v2alpha1.GuestAttributesOrBuilder>
        getGuestAttributesFieldBuilder() {
      if (guestAttributesBuilder_ == null) {
        guestAttributesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.tpu.v2alpha1.GuestAttributes,
                com.google.cloud.tpu.v2alpha1.GuestAttributes.Builder,
                com.google.cloud.tpu.v2alpha1.GuestAttributesOrBuilder>(
                guestAttributes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        guestAttributes_ = null;
      }
      return guestAttributesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.GetGuestAttributesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.GetGuestAttributesResponse)
  private static final com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse();
  }

  public static com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGuestAttributesResponse> PARSER =
      new com.google.protobuf.AbstractParser<GetGuestAttributesResponse>() {
        @java.lang.Override
        public GetGuestAttributesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetGuestAttributesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGuestAttributesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.GetGuestAttributesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
