// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `GetNotificationChannelVerificationCode` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.GetNotificationChannelVerificationCodeResponse}
 */
public final class GetNotificationChannelVerificationCodeResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.GetNotificationChannelVerificationCodeResponse)
    GetNotificationChannelVerificationCodeResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetNotificationChannelVerificationCodeResponse.newBuilder() to construct.
  private GetNotificationChannelVerificationCodeResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetNotificationChannelVerificationCodeResponse() {
    code_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetNotificationChannelVerificationCodeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

              code_ = s;
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (expireTime_ != null) {
                subBuilder = expireTime_.toBuilder();
              }
              expireTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(expireTime_);
                expireTime_ = subBuilder.buildPartial();
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse.class,
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object code_;
  /**
   *
   *
   * <pre>
   * The verification code, which may be used to verify other channels
   * that have an equivalent identity (i.e. other channels of the same
   * type with the same fingerprint such as other email channels with
   * the same email address or other sms channels with the same number).
   * </pre>
   *
   * <code>string code = 1;</code>
   */
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The verification code, which may be used to verify other channels
   * that have an equivalent identity (i.e. other channels of the same
   * type with the same fingerprint such as other email channels with
   * the same email address or other sms channels with the same number).
   * </pre>
   *
   * <code>string code = 1;</code>
   */
  public com.google.protobuf.ByteString getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      code_ = b;
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
   * The expiration time associated with the code that was returned. If
   * an expiration was provided in the request, this is the minimum of the
   * requested expiration in the request and the max permitted expiration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  public boolean hasExpireTime() {
    return expireTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The expiration time associated with the code that was returned. If
   * an expiration was provided in the request, this is the minimum of the
   * requested expiration in the request and the max permitted expiration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getExpireTime() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
  }
  /**
   *
   *
   * <pre>
   * The expiration time associated with the code that was returned. If
   * an expiration was provided in the request, this is the minimum of the
   * requested expiration in the request and the max permitted expiration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
    return getExpireTime();
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
    if (!getCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, code_);
    }
    if (expireTime_ != null) {
      output.writeMessage(2, getExpireTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, code_);
    }
    if (expireTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExpireTime());
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
    if (!(obj instanceof com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse other =
        (com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse) obj;

    if (!getCode().equals(other.getCode())) return false;
    if (hasExpireTime() != other.hasExpireTime()) return false;
    if (hasExpireTime()) {
      if (!getExpireTime().equals(other.getExpireTime())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    if (hasExpireTime()) {
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parseFrom(
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
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse prototype) {
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
   * Protobuf type {@code google.monitoring.v3.GetNotificationChannelVerificationCodeResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.GetNotificationChannelVerificationCodeResponse)
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse.class,
              com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse.newBuilder()
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
      code_ = "";

      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse
        getDefaultInstanceForType() {
      return com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse build() {
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse buildPartial() {
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse result =
          new com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse(this);
      result.code_ = code_;
      if (expireTimeBuilder_ == null) {
        result.expireTime_ = expireTime_;
      } else {
        result.expireTime_ = expireTimeBuilder_.build();
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
      if (other
          instanceof com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse) {
        return mergeFrom(
            (com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse other) {
      if (other
          == com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse
              .getDefaultInstance()) return this;
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        onChanged();
      }
      if (other.hasExpireTime()) {
        mergeExpireTime(other.getExpireTime());
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
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object code_ = "";
    /**
     *
     *
     * <pre>
     * The verification code, which may be used to verify other channels
     * that have an equivalent identity (i.e. other channels of the same
     * type with the same fingerprint such as other email channels with
     * the same email address or other sms channels with the same number).
     * </pre>
     *
     * <code>string code = 1;</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The verification code, which may be used to verify other channels
     * that have an equivalent identity (i.e. other channels of the same
     * type with the same fingerprint such as other email channels with
     * the same email address or other sms channels with the same number).
     * </pre>
     *
     * <code>string code = 1;</code>
     */
    public com.google.protobuf.ByteString getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The verification code, which may be used to verify other channels
     * that have an equivalent identity (i.e. other channels of the same
     * type with the same fingerprint such as other email channels with
     * the same email address or other sms channels with the same number).
     * </pre>
     *
     * <code>string code = 1;</code>
     */
    public Builder setCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      code_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The verification code, which may be used to verify other channels
     * that have an equivalent identity (i.e. other channels of the same
     * type with the same fingerprint such as other email channels with
     * the same email address or other sms channels with the same number).
     * </pre>
     *
     * <code>string code = 1;</code>
     */
    public Builder clearCode() {

      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The verification code, which may be used to verify other channels
     * that have an equivalent identity (i.e. other channels of the same
     * type with the same fingerprint such as other email channels with
     * the same email address or other sms channels with the same number).
     * </pre>
     *
     * <code>string code = 1;</code>
     */
    public Builder setCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      code_ = value;
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
     * The expiration time associated with the code that was returned. If
     * an expiration was provided in the request, this is the minimum of the
     * requested expiration in the request and the max permitted expiration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public boolean hasExpireTime() {
      return expireTimeBuilder_ != null || expireTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The expiration time associated with the code that was returned. If
     * an expiration was provided in the request, this is the minimum of the
     * requested expiration in the request and the max permitted expiration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
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
     * The expiration time associated with the code that was returned. If
     * an expiration was provided in the request, this is the minimum of the
     * requested expiration in the request and the max permitted expiration.
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
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The expiration time associated with the code that was returned. If
     * an expiration was provided in the request, this is the minimum of the
     * requested expiration in the request and the max permitted expiration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireTimeBuilder_ == null) {
        expireTime_ = builderForValue.build();
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The expiration time associated with the code that was returned. If
     * an expiration was provided in the request, this is the minimum of the
     * requested expiration in the request and the max permitted expiration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (expireTime_ != null) {
          expireTime_ =
              com.google.protobuf.Timestamp.newBuilder(expireTime_).mergeFrom(value).buildPartial();
        } else {
          expireTime_ = value;
        }
        onChanged();
      } else {
        expireTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The expiration time associated with the code that was returned. If
     * an expiration was provided in the request, this is the minimum of the
     * requested expiration in the request and the max permitted expiration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder clearExpireTime() {
      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
        onChanged();
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The expiration time associated with the code that was returned. If
     * an expiration was provided in the request, this is the minimum of the
     * requested expiration in the request and the max permitted expiration.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {

      onChanged();
      return getExpireTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The expiration time associated with the code that was returned. If
     * an expiration was provided in the request, this is the minimum of the
     * requested expiration in the request and the max permitted expiration.
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
     * The expiration time associated with the code that was returned. If
     * an expiration was provided in the request, this is the minimum of the
     * requested expiration in the request and the max permitted expiration.
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.GetNotificationChannelVerificationCodeResponse)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.GetNotificationChannelVerificationCodeResponse)
  private static final com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse();
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNotificationChannelVerificationCodeResponse>
      PARSER =
          new com.google.protobuf.AbstractParser<GetNotificationChannelVerificationCodeResponse>() {
            @java.lang.Override
            public GetNotificationChannelVerificationCodeResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new GetNotificationChannelVerificationCodeResponse(input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<GetNotificationChannelVerificationCodeResponse>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNotificationChannelVerificationCodeResponse>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
