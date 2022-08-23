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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Request message for [CloudChannelService.CreateChannelPartnerLink][google.cloud.channel.v1.CloudChannelService.CreateChannelPartnerLink]
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.CreateChannelPartnerLinkRequest}
 */
public final class CreateChannelPartnerLinkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.CreateChannelPartnerLinkRequest)
    CreateChannelPartnerLinkRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateChannelPartnerLinkRequest.newBuilder() to construct.
  private CreateChannelPartnerLinkRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateChannelPartnerLinkRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateChannelPartnerLinkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateChannelPartnerLinkRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.channel.v1.ChannelPartnerLink.Builder subBuilder = null;
              if (channelPartnerLink_ != null) {
                subBuilder = channelPartnerLink_.toBuilder();
              }
              channelPartnerLink_ =
                  input.readMessage(
                      com.google.cloud.channel.v1.ChannelPartnerLink.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(channelPartnerLink_);
                channelPartnerLink_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CreateChannelPartnerLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CreateChannelPartnerLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest.class,
            com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Create a channel partner link for the provided reseller account's
   * resource name.
   * Parent uses the format: accounts/{account_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Create a channel partner link for the provided reseller account's
   * resource name.
   * Parent uses the format: accounts/{account_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_PARTNER_LINK_FIELD_NUMBER = 2;
  private com.google.cloud.channel.v1.ChannelPartnerLink channelPartnerLink_;
  /**
   *
   *
   * <pre>
   * Required. The channel partner link to create.
   * Either channel_partner_link.reseller_cloud_identity_id or domain can be
   * used to create a link.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the channelPartnerLink field is set.
   */
  @java.lang.Override
  public boolean hasChannelPartnerLink() {
    return channelPartnerLink_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The channel partner link to create.
   * Either channel_partner_link.reseller_cloud_identity_id or domain can be
   * used to create a link.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The channelPartnerLink.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ChannelPartnerLink getChannelPartnerLink() {
    return channelPartnerLink_ == null
        ? com.google.cloud.channel.v1.ChannelPartnerLink.getDefaultInstance()
        : channelPartnerLink_;
  }
  /**
   *
   *
   * <pre>
   * Required. The channel partner link to create.
   * Either channel_partner_link.reseller_cloud_identity_id or domain can be
   * used to create a link.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder getChannelPartnerLinkOrBuilder() {
    return getChannelPartnerLink();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (channelPartnerLink_ != null) {
      output.writeMessage(2, getChannelPartnerLink());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (channelPartnerLink_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getChannelPartnerLink());
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
    if (!(obj instanceof com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest other =
        (com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasChannelPartnerLink() != other.hasChannelPartnerLink()) return false;
    if (hasChannelPartnerLink()) {
      if (!getChannelPartnerLink().equals(other.getChannelPartnerLink())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasChannelPartnerLink()) {
      hash = (37 * hash) + CHANNEL_PARTNER_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getChannelPartnerLink().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parseFrom(
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
      com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest prototype) {
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
   * Request message for [CloudChannelService.CreateChannelPartnerLink][google.cloud.channel.v1.CloudChannelService.CreateChannelPartnerLink]
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.CreateChannelPartnerLinkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.CreateChannelPartnerLinkRequest)
      com.google.cloud.channel.v1.CreateChannelPartnerLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateChannelPartnerLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateChannelPartnerLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest.class,
              com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest.newBuilder()
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
      parent_ = "";

      if (channelPartnerLinkBuilder_ == null) {
        channelPartnerLink_ = null;
      } else {
        channelPartnerLink_ = null;
        channelPartnerLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateChannelPartnerLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest build() {
      com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest buildPartial() {
      com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest result =
          new com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest(this);
      result.parent_ = parent_;
      if (channelPartnerLinkBuilder_ == null) {
        result.channelPartnerLink_ = channelPartnerLink_;
      } else {
        result.channelPartnerLink_ = channelPartnerLinkBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest) {
        return mergeFrom((com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest other) {
      if (other == com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasChannelPartnerLink()) {
        mergeChannelPartnerLink(other.getChannelPartnerLink());
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
      com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Create a channel partner link for the provided reseller account's
     * resource name.
     * Parent uses the format: accounts/{account_id}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Create a channel partner link for the provided reseller account's
     * resource name.
     * Parent uses the format: accounts/{account_id}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Create a channel partner link for the provided reseller account's
     * resource name.
     * Parent uses the format: accounts/{account_id}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Create a channel partner link for the provided reseller account's
     * resource name.
     * Parent uses the format: accounts/{account_id}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Create a channel partner link for the provided reseller account's
     * resource name.
     * Parent uses the format: accounts/{account_id}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.channel.v1.ChannelPartnerLink channelPartnerLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.ChannelPartnerLink,
            com.google.cloud.channel.v1.ChannelPartnerLink.Builder,
            com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder>
        channelPartnerLinkBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The channel partner link to create.
     * Either channel_partner_link.reseller_cloud_identity_id or domain can be
     * used to create a link.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the channelPartnerLink field is set.
     */
    public boolean hasChannelPartnerLink() {
      return channelPartnerLinkBuilder_ != null || channelPartnerLink_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The channel partner link to create.
     * Either channel_partner_link.reseller_cloud_identity_id or domain can be
     * used to create a link.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The channelPartnerLink.
     */
    public com.google.cloud.channel.v1.ChannelPartnerLink getChannelPartnerLink() {
      if (channelPartnerLinkBuilder_ == null) {
        return channelPartnerLink_ == null
            ? com.google.cloud.channel.v1.ChannelPartnerLink.getDefaultInstance()
            : channelPartnerLink_;
      } else {
        return channelPartnerLinkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The channel partner link to create.
     * Either channel_partner_link.reseller_cloud_identity_id or domain can be
     * used to create a link.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setChannelPartnerLink(com.google.cloud.channel.v1.ChannelPartnerLink value) {
      if (channelPartnerLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channelPartnerLink_ = value;
        onChanged();
      } else {
        channelPartnerLinkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The channel partner link to create.
     * Either channel_partner_link.reseller_cloud_identity_id or domain can be
     * used to create a link.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setChannelPartnerLink(
        com.google.cloud.channel.v1.ChannelPartnerLink.Builder builderForValue) {
      if (channelPartnerLinkBuilder_ == null) {
        channelPartnerLink_ = builderForValue.build();
        onChanged();
      } else {
        channelPartnerLinkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The channel partner link to create.
     * Either channel_partner_link.reseller_cloud_identity_id or domain can be
     * used to create a link.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeChannelPartnerLink(com.google.cloud.channel.v1.ChannelPartnerLink value) {
      if (channelPartnerLinkBuilder_ == null) {
        if (channelPartnerLink_ != null) {
          channelPartnerLink_ =
              com.google.cloud.channel.v1.ChannelPartnerLink.newBuilder(channelPartnerLink_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          channelPartnerLink_ = value;
        }
        onChanged();
      } else {
        channelPartnerLinkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The channel partner link to create.
     * Either channel_partner_link.reseller_cloud_identity_id or domain can be
     * used to create a link.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearChannelPartnerLink() {
      if (channelPartnerLinkBuilder_ == null) {
        channelPartnerLink_ = null;
        onChanged();
      } else {
        channelPartnerLink_ = null;
        channelPartnerLinkBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The channel partner link to create.
     * Either channel_partner_link.reseller_cloud_identity_id or domain can be
     * used to create a link.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerLink.Builder getChannelPartnerLinkBuilder() {

      onChanged();
      return getChannelPartnerLinkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The channel partner link to create.
     * Either channel_partner_link.reseller_cloud_identity_id or domain can be
     * used to create a link.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder
        getChannelPartnerLinkOrBuilder() {
      if (channelPartnerLinkBuilder_ != null) {
        return channelPartnerLinkBuilder_.getMessageOrBuilder();
      } else {
        return channelPartnerLink_ == null
            ? com.google.cloud.channel.v1.ChannelPartnerLink.getDefaultInstance()
            : channelPartnerLink_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The channel partner link to create.
     * Either channel_partner_link.reseller_cloud_identity_id or domain can be
     * used to create a link.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.ChannelPartnerLink,
            com.google.cloud.channel.v1.ChannelPartnerLink.Builder,
            com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder>
        getChannelPartnerLinkFieldBuilder() {
      if (channelPartnerLinkBuilder_ == null) {
        channelPartnerLinkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.ChannelPartnerLink,
                com.google.cloud.channel.v1.ChannelPartnerLink.Builder,
                com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder>(
                getChannelPartnerLink(), getParentForChildren(), isClean());
        channelPartnerLink_ = null;
      }
      return channelPartnerLinkBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.CreateChannelPartnerLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.CreateChannelPartnerLinkRequest)
  private static final com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest();
  }

  public static com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateChannelPartnerLinkRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateChannelPartnerLinkRequest>() {
        @java.lang.Override
        public CreateChannelPartnerLinkRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateChannelPartnerLinkRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateChannelPartnerLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateChannelPartnerLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.CreateChannelPartnerLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
