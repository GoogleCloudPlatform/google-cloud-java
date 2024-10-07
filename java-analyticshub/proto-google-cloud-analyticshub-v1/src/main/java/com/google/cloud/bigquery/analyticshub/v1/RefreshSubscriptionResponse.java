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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.analyticshub.v1;

/**
 *
 *
 * <pre>
 * Message for response when you refresh a subscription.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse}
 */
public final class RefreshSubscriptionResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse)
    RefreshSubscriptionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RefreshSubscriptionResponse.newBuilder() to construct.
  private RefreshSubscriptionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RefreshSubscriptionResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RefreshSubscriptionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_RefreshSubscriptionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_RefreshSubscriptionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse.class,
            com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.analyticshub.v1.Subscription subscription_;
  /**
   *
   *
   * <pre>
   * The refreshed subscription resource.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
   *
   * @return Whether the subscription field is set.
   */
  @java.lang.Override
  public boolean hasSubscription() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The refreshed subscription resource.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
   *
   * @return The subscription.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.Subscription getSubscription() {
    return subscription_ == null
        ? com.google.cloud.bigquery.analyticshub.v1.Subscription.getDefaultInstance()
        : subscription_;
  }
  /**
   *
   *
   * <pre>
   * The refreshed subscription resource.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.SubscriptionOrBuilder
      getSubscriptionOrBuilder() {
    return subscription_ == null
        ? com.google.cloud.bigquery.analyticshub.v1.Subscription.getDefaultInstance()
        : subscription_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getSubscription());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSubscription());
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
    if (!(obj instanceof com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse other =
        (com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse) obj;

    if (hasSubscription() != other.hasSubscription()) return false;
    if (hasSubscription()) {
      if (!getSubscription().equals(other.getSubscription())) return false;
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
    if (hasSubscription()) {
      hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getSubscription().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse parseFrom(
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
      com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse prototype) {
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
   * Message for response when you refresh a subscription.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse)
      com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_RefreshSubscriptionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_RefreshSubscriptionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse.class,
              com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSubscriptionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      subscription_ = null;
      if (subscriptionBuilder_ != null) {
        subscriptionBuilder_.dispose();
        subscriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_RefreshSubscriptionResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse build() {
      com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse buildPartial() {
      com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse result =
          new com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscription_ =
            subscriptionBuilder_ == null ? subscription_ : subscriptionBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse) {
        return mergeFrom(
            (com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse other) {
      if (other
          == com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse
              .getDefaultInstance()) return this;
      if (other.hasSubscription()) {
        mergeSubscription(other.getSubscription());
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
                input.readMessage(getSubscriptionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.bigquery.analyticshub.v1.Subscription subscription_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.analyticshub.v1.Subscription,
            com.google.cloud.bigquery.analyticshub.v1.Subscription.Builder,
            com.google.cloud.bigquery.analyticshub.v1.SubscriptionOrBuilder>
        subscriptionBuilder_;
    /**
     *
     *
     * <pre>
     * The refreshed subscription resource.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
     *
     * @return Whether the subscription field is set.
     */
    public boolean hasSubscription() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The refreshed subscription resource.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
     *
     * @return The subscription.
     */
    public com.google.cloud.bigquery.analyticshub.v1.Subscription getSubscription() {
      if (subscriptionBuilder_ == null) {
        return subscription_ == null
            ? com.google.cloud.bigquery.analyticshub.v1.Subscription.getDefaultInstance()
            : subscription_;
      } else {
        return subscriptionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The refreshed subscription resource.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
     */
    public Builder setSubscription(com.google.cloud.bigquery.analyticshub.v1.Subscription value) {
      if (subscriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subscription_ = value;
      } else {
        subscriptionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The refreshed subscription resource.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
     */
    public Builder setSubscription(
        com.google.cloud.bigquery.analyticshub.v1.Subscription.Builder builderForValue) {
      if (subscriptionBuilder_ == null) {
        subscription_ = builderForValue.build();
      } else {
        subscriptionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The refreshed subscription resource.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
     */
    public Builder mergeSubscription(com.google.cloud.bigquery.analyticshub.v1.Subscription value) {
      if (subscriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && subscription_ != null
            && subscription_
                != com.google.cloud.bigquery.analyticshub.v1.Subscription.getDefaultInstance()) {
          getSubscriptionBuilder().mergeFrom(value);
        } else {
          subscription_ = value;
        }
      } else {
        subscriptionBuilder_.mergeFrom(value);
      }
      if (subscription_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The refreshed subscription resource.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
     */
    public Builder clearSubscription() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subscription_ = null;
      if (subscriptionBuilder_ != null) {
        subscriptionBuilder_.dispose();
        subscriptionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The refreshed subscription resource.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
     */
    public com.google.cloud.bigquery.analyticshub.v1.Subscription.Builder getSubscriptionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSubscriptionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The refreshed subscription resource.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
     */
    public com.google.cloud.bigquery.analyticshub.v1.SubscriptionOrBuilder
        getSubscriptionOrBuilder() {
      if (subscriptionBuilder_ != null) {
        return subscriptionBuilder_.getMessageOrBuilder();
      } else {
        return subscription_ == null
            ? com.google.cloud.bigquery.analyticshub.v1.Subscription.getDefaultInstance()
            : subscription_;
      }
    }
    /**
     *
     *
     * <pre>
     * The refreshed subscription resource.
     * </pre>
     *
     * <code>.google.cloud.bigquery.analyticshub.v1.Subscription subscription = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.analyticshub.v1.Subscription,
            com.google.cloud.bigquery.analyticshub.v1.Subscription.Builder,
            com.google.cloud.bigquery.analyticshub.v1.SubscriptionOrBuilder>
        getSubscriptionFieldBuilder() {
      if (subscriptionBuilder_ == null) {
        subscriptionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.analyticshub.v1.Subscription,
                com.google.cloud.bigquery.analyticshub.v1.Subscription.Builder,
                com.google.cloud.bigquery.analyticshub.v1.SubscriptionOrBuilder>(
                getSubscription(), getParentForChildren(), isClean());
        subscription_ = null;
      }
      return subscriptionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse)
  private static final com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse();
  }

  public static com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RefreshSubscriptionResponse> PARSER =
      new com.google.protobuf.AbstractParser<RefreshSubscriptionResponse>() {
        @java.lang.Override
        public RefreshSubscriptionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RefreshSubscriptionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RefreshSubscriptionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.RefreshSubscriptionResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
