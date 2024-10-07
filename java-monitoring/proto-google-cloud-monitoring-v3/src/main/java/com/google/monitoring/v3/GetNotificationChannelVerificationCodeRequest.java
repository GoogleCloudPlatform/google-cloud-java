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
// source: google/monitoring/v3/notification_service.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `GetNotificationChannelVerificationCode` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.GetNotificationChannelVerificationCodeRequest}
 */
public final class GetNotificationChannelVerificationCodeRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)
    GetNotificationChannelVerificationCodeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetNotificationChannelVerificationCodeRequest.newBuilder() to construct.
  private GetNotificationChannelVerificationCodeRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetNotificationChannelVerificationCodeRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetNotificationChannelVerificationCodeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.class,
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The notification channel for which a verification code is to be
   * generated and retrieved. This must name a channel that is already verified;
   * if the specified channel is not verified, the request will fail.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The notification channel for which a verification code is to be
   * generated and retrieved. This must name a channel that is already verified;
   * if the specified channel is not verified, the request will fail.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp expireTime_;
  /**
   *
   *
   * <pre>
   * The desired expiration time. If specified, the API will guarantee that
   * the returned code will not be valid after the specified timestamp;
   * however, the API cannot guarantee that the returned code will be
   * valid for at least as long as the requested time (the API puts an upper
   * bound on the amount of time for which a code may be valid). If omitted,
   * a default expiration will be used, which may be less than the max
   * permissible expiration (so specifying an expiration may extend the
   * code's lifetime over omitting an expiration, even though the API does
   * impose an upper limit on the maximum expiration that is permitted).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return Whether the expireTime field is set.
   */
  @java.lang.Override
  public boolean hasExpireTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The desired expiration time. If specified, the API will guarantee that
   * the returned code will not be valid after the specified timestamp;
   * however, the API cannot guarantee that the returned code will be
   * valid for at least as long as the requested time (the API puts an upper
   * bound on the amount of time for which a code may be valid). If omitted,
   * a default expiration will be used, which may be less than the max
   * permissible expiration (so specifying an expiration may extend the
   * code's lifetime over omitting an expiration, even though the API does
   * impose an upper limit on the maximum expiration that is permitted).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return The expireTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpireTime() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
  }
  /**
   *
   *
   * <pre>
   * The desired expiration time. If specified, the API will guarantee that
   * the returned code will not be valid after the specified timestamp;
   * however, the API cannot guarantee that the returned code will be
   * valid for at least as long as the requested time (the API puts an upper
   * bound on the amount of time for which a code may be valid). If omitted,
   * a default expiration will be used, which may be less than the max
   * permissible expiration (so specifying an expiration may extend the
   * code's lifetime over omitting an expiration, even though the API does
   * impose an upper limit on the maximum expiration that is permitted).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getExpireTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExpireTime());
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
    if (!(obj instanceof com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest other =
        (com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasExpireTime() != other.hasExpireTime()) return false;
    if (hasExpireTime()) {
      if (!getExpireTime().equals(other.getExpireTime())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasExpireTime()) {
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
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
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest prototype) {
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
   * The `GetNotificationChannelVerificationCode` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.GetNotificationChannelVerificationCodeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.class,
              com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.Builder.class);
    }

    // Construct using
    // com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getExpireTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      expireTime_ = null;
      if (expireTimeBuilder_ != null) {
        expireTimeBuilder_.dispose();
        expireTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest
        getDefaultInstanceForType() {
      return com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest build() {
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest buildPartial() {
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest result =
          new com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expireTime_ = expireTimeBuilder_ == null ? expireTime_ : expireTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest) {
        return mergeFrom(
            (com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest other) {
      if (other
          == com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExpireTime()) {
        mergeExpireTime(other.getExpireTime());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getExpireTimeFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The notification channel for which a verification code is to be
     * generated and retrieved. This must name a channel that is already verified;
     * if the specified channel is not verified, the request will fail.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The notification channel for which a verification code is to be
     * generated and retrieved. This must name a channel that is already verified;
     * if the specified channel is not verified, the request will fail.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The notification channel for which a verification code is to be
     * generated and retrieved. This must name a channel that is already verified;
     * if the specified channel is not verified, the request will fail.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The notification channel for which a verification code is to be
     * generated and retrieved. This must name a channel that is already verified;
     * if the specified channel is not verified, the request will fail.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The notification channel for which a verification code is to be
     * generated and retrieved. This must name a channel that is already verified;
     * if the specified channel is not verified, the request will fail.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expireTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        expireTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     *
     * @return Whether the expireTime field is set.
     */
    public boolean hasExpireTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     *
     * @return The expireTime.
     */
    public com.google.protobuf.Timestamp getExpireTime() {
      if (expireTimeBuilder_ == null) {
        return expireTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expireTime_;
      } else {
        return expireTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expireTime_ = value;
      } else {
        expireTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireTimeBuilder_ == null) {
        expireTime_ = builderForValue.build();
      } else {
        expireTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && expireTime_ != null
            && expireTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getExpireTimeBuilder().mergeFrom(value);
        } else {
          expireTime_ = value;
        }
      } else {
        expireTimeBuilder_.mergeFrom(value);
      }
      if (expireTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder clearExpireTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      expireTime_ = null;
      if (expireTimeBuilder_ != null) {
        expireTimeBuilder_.dispose();
        expireTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExpireTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
      if (expireTimeBuilder_ != null) {
        return expireTimeBuilder_.getMessageOrBuilder();
      } else {
        return expireTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expireTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getExpireTimeFieldBuilder() {
      if (expireTimeBuilder_ == null) {
        expireTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getExpireTime(), getParentForChildren(), isClean());
        expireTime_ = null;
      }
      return expireTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)
  private static final com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest();
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNotificationChannelVerificationCodeRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<GetNotificationChannelVerificationCodeRequest>() {
            @java.lang.Override
            public GetNotificationChannelVerificationCodeRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<GetNotificationChannelVerificationCodeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNotificationChannelVerificationCodeRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
