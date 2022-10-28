// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * Request Message for UnregisterSubscriber.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.UnregisterSubscriberRequest}
 */
public final class UnregisterSubscriberRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.UnregisterSubscriberRequest)
    UnregisterSubscriberRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnregisterSubscriberRequest.newBuilder() to construct.
  private UnregisterSubscriberRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnregisterSubscriberRequest() {
    account_ = "";
    serviceAccount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnregisterSubscriberRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UnregisterSubscriberRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UnregisterSubscriberRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.UnregisterSubscriberRequest.class, com.google.cloud.channel.v1.UnregisterSubscriberRequest.Builder.class);
  }

  public static final int ACCOUNT_FIELD_NUMBER = 1;
  private volatile java.lang.Object account_;
  /**
   * <pre>
   * Required. Resource name of the account.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The account.
   */
  @java.lang.Override
  public java.lang.String getAccount() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      account_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Resource name of the account.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for account.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountBytes() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      account_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_ACCOUNT_FIELD_NUMBER = 2;
  private volatile java.lang.Object serviceAccount_;
  /**
   * <pre>
   * Required. Service account to unregister from subscriber access to the topic.
   * </pre>
   *
   * <code>string service_account = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The serviceAccount.
   */
  @java.lang.Override
  public java.lang.String getServiceAccount() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAccount_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Service account to unregister from subscriber access to the topic.
   * </pre>
   *
   * <code>string service_account = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for serviceAccount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceAccountBytes() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceAccount_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(account_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, account_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceAccount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(account_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, account_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceAccount_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.UnregisterSubscriberRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.UnregisterSubscriberRequest other = (com.google.cloud.channel.v1.UnregisterSubscriberRequest) obj;

    if (!getAccount()
        .equals(other.getAccount())) return false;
    if (!getServiceAccount()
        .equals(other.getServiceAccount())) return false;
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
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount().hashCode();
    hash = (37 * hash) + SERVICE_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAccount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.channel.v1.UnregisterSubscriberRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request Message for UnregisterSubscriber.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.UnregisterSubscriberRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.UnregisterSubscriberRequest)
      com.google.cloud.channel.v1.UnregisterSubscriberRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UnregisterSubscriberRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UnregisterSubscriberRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.UnregisterSubscriberRequest.class, com.google.cloud.channel.v1.UnregisterSubscriberRequest.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.UnregisterSubscriberRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      account_ = "";

      serviceAccount_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UnregisterSubscriberRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.UnregisterSubscriberRequest getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.UnregisterSubscriberRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.UnregisterSubscriberRequest build() {
      com.google.cloud.channel.v1.UnregisterSubscriberRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.UnregisterSubscriberRequest buildPartial() {
      com.google.cloud.channel.v1.UnregisterSubscriberRequest result = new com.google.cloud.channel.v1.UnregisterSubscriberRequest(this);
      result.account_ = account_;
      result.serviceAccount_ = serviceAccount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.channel.v1.UnregisterSubscriberRequest) {
        return mergeFrom((com.google.cloud.channel.v1.UnregisterSubscriberRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.UnregisterSubscriberRequest other) {
      if (other == com.google.cloud.channel.v1.UnregisterSubscriberRequest.getDefaultInstance()) return this;
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        onChanged();
      }
      if (!other.getServiceAccount().isEmpty()) {
        serviceAccount_ = other.serviceAccount_;
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
            case 10: {
              account_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              serviceAccount_ = input.readStringRequireUtf8();

              break;
            } // case 18
            default: {
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

    private java.lang.Object account_ = "";
    /**
     * <pre>
     * Required. Resource name of the account.
     * </pre>
     *
     * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The account.
     */
    public java.lang.String getAccount() {
      java.lang.Object ref = account_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        account_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the account.
     * </pre>
     *
     * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for account.
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      java.lang.Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the account.
     * </pre>
     *
     * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The account to set.
     * @return This builder for chaining.
     */
    public Builder setAccount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      account_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the account.
     * </pre>
     *
     * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccount() {
      
      account_ = getDefaultInstance().getAccount();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the account.
     * </pre>
     *
     * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for account to set.
     * @return This builder for chaining.
     */
    public Builder setAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      account_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serviceAccount_ = "";
    /**
     * <pre>
     * Required. Service account to unregister from subscriber access to the topic.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The serviceAccount.
     */
    public java.lang.String getServiceAccount() {
      java.lang.Object ref = serviceAccount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAccount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Service account to unregister from subscriber access to the topic.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for serviceAccount.
     */
    public com.google.protobuf.ByteString
        getServiceAccountBytes() {
      java.lang.Object ref = serviceAccount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceAccount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Service account to unregister from subscriber access to the topic.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The serviceAccount to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceAccount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Service account to unregister from subscriber access to the topic.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceAccount() {
      
      serviceAccount_ = getDefaultInstance().getServiceAccount();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Service account to unregister from subscriber access to the topic.
     * </pre>
     *
     * <code>string service_account = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for serviceAccount to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceAccount_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.UnregisterSubscriberRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.UnregisterSubscriberRequest)
  private static final com.google.cloud.channel.v1.UnregisterSubscriberRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.UnregisterSubscriberRequest();
  }

  public static com.google.cloud.channel.v1.UnregisterSubscriberRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnregisterSubscriberRequest>
      PARSER = new com.google.protobuf.AbstractParser<UnregisterSubscriberRequest>() {
    @java.lang.Override
    public UnregisterSubscriberRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnregisterSubscriberRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnregisterSubscriberRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.UnregisterSubscriberRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

