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
 * Message for subscribing to a Data Exchange.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest}
 */
public final class SubscribeDataExchangeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest)
    SubscribeDataExchangeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SubscribeDataExchangeRequest.newBuilder() to construct.
  private SubscribeDataExchangeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubscribeDataExchangeRequest() {
    name_ = "";
    destination_ = "";
    subscription_ = "";
    subscriberContact_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SubscribeDataExchangeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeDataExchangeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeDataExchangeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest.class,
            com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Resource name of the Data Exchange.
   * e.g. `projects/publisherproject/locations/US/dataExchanges/123`
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
   * Required. Resource name of the Data Exchange.
   * e.g. `projects/publisherproject/locations/US/dataExchanges/123`
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

  public static final int DESTINATION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object destination_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource path of the Subscription.
   * e.g. `projects/subscriberproject/locations/US`
   * </pre>
   *
   * <code>
   * string destination = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The destination.
   */
  @java.lang.Override
  public java.lang.String getDestination() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destination_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource path of the Subscription.
   * e.g. `projects/subscriberproject/locations/US`
   * </pre>
   *
   * <code>
   * string destination = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for destination.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDestinationBytes() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      destination_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subscription_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the subscription to create.
   * e.g. `subscription1`
   * </pre>
   *
   * <code>string subscription = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The subscription.
   */
  @java.lang.Override
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the subscription to create.
   * e.g. `subscription1`
   * </pre>
   *
   * <code>string subscription = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for subscription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBSCRIBER_CONTACT_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subscriberContact_ = "";
  /**
   *
   *
   * <pre>
   * Email of the subscriber.
   * </pre>
   *
   * <code>string subscriber_contact = 3;</code>
   *
   * @return The subscriberContact.
   */
  @java.lang.Override
  public java.lang.String getSubscriberContact() {
    java.lang.Object ref = subscriberContact_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscriberContact_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Email of the subscriber.
   * </pre>
   *
   * <code>string subscriber_contact = 3;</code>
   *
   * @return The bytes for subscriberContact.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubscriberContactBytes() {
    java.lang.Object ref = subscriberContact_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subscriberContact_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destination_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destination_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriberContact_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subscriberContact_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, subscription_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destination_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destination_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriberContact_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subscriberContact_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, subscription_);
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
    if (!(obj instanceof com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest other =
        (com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDestination().equals(other.getDestination())) return false;
    if (!getSubscription().equals(other.getSubscription())) return false;
    if (!getSubscriberContact().equals(other.getSubscriberContact())) return false;
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
    hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
    hash = (53 * hash) + getDestination().hashCode();
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    hash = (37 * hash) + SUBSCRIBER_CONTACT_FIELD_NUMBER;
    hash = (53 * hash) + getSubscriberContact().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest parseFrom(
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
      com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest prototype) {
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
   * Message for subscribing to a Data Exchange.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest)
      com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeDataExchangeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeDataExchangeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest.class,
              com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      destination_ = "";
      subscription_ = "";
      subscriberContact_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_SubscribeDataExchangeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest build() {
      com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest buildPartial() {
      com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest result =
          new com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.destination_ = destination_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.subscription_ = subscription_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.subscriberContact_ = subscriberContact_;
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
      if (other instanceof com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest other) {
      if (other
          == com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDestination().isEmpty()) {
        destination_ = other.destination_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getSubscriberContact().isEmpty()) {
        subscriberContact_ = other.subscriberContact_;
        bitField0_ |= 0x00000008;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                destination_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                subscriberContact_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 26
            case 34:
              {
                subscription_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
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
     * Required. Resource name of the Data Exchange.
     * e.g. `projects/publisherproject/locations/US/dataExchanges/123`
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
     * Required. Resource name of the Data Exchange.
     * e.g. `projects/publisherproject/locations/US/dataExchanges/123`
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
     * Required. Resource name of the Data Exchange.
     * e.g. `projects/publisherproject/locations/US/dataExchanges/123`
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
     * Required. Resource name of the Data Exchange.
     * e.g. `projects/publisherproject/locations/US/dataExchanges/123`
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
     * Required. Resource name of the Data Exchange.
     * e.g. `projects/publisherproject/locations/US/dataExchanges/123`
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

    private java.lang.Object destination_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource path of the Subscription.
     * e.g. `projects/subscriberproject/locations/US`
     * </pre>
     *
     * <code>
     * string destination = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The destination.
     */
    public java.lang.String getDestination() {
      java.lang.Object ref = destination_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destination_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource path of the Subscription.
     * e.g. `projects/subscriberproject/locations/US`
     * </pre>
     *
     * <code>
     * string destination = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for destination.
     */
    public com.google.protobuf.ByteString getDestinationBytes() {
      java.lang.Object ref = destination_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        destination_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource path of the Subscription.
     * e.g. `projects/subscriberproject/locations/US`
     * </pre>
     *
     * <code>
     * string destination = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestination(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destination_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource path of the Subscription.
     * e.g. `projects/subscriberproject/locations/US`
     * </pre>
     *
     * <code>
     * string destination = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestination() {
      destination_ = getDefaultInstance().getDestination();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource path of the Subscription.
     * e.g. `projects/subscriberproject/locations/US`
     * </pre>
     *
     * <code>
     * string destination = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      destination_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object subscription_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the subscription to create.
     * e.g. `subscription1`
     * </pre>
     *
     * <code>string subscription = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The subscription.
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the subscription to create.
     * e.g. `subscription1`
     * </pre>
     *
     * <code>string subscription = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for subscription.
     */
    public com.google.protobuf.ByteString getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the subscription to create.
     * e.g. `subscription1`
     * </pre>
     *
     * <code>string subscription = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subscription_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the subscription to create.
     * e.g. `subscription1`
     * </pre>
     *
     * <code>string subscription = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubscription() {
      subscription_ = getDefaultInstance().getSubscription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the subscription to create.
     * e.g. `subscription1`
     * </pre>
     *
     * <code>string subscription = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subscription_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object subscriberContact_ = "";
    /**
     *
     *
     * <pre>
     * Email of the subscriber.
     * </pre>
     *
     * <code>string subscriber_contact = 3;</code>
     *
     * @return The subscriberContact.
     */
    public java.lang.String getSubscriberContact() {
      java.lang.Object ref = subscriberContact_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscriberContact_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email of the subscriber.
     * </pre>
     *
     * <code>string subscriber_contact = 3;</code>
     *
     * @return The bytes for subscriberContact.
     */
    public com.google.protobuf.ByteString getSubscriberContactBytes() {
      java.lang.Object ref = subscriberContact_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subscriberContact_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email of the subscriber.
     * </pre>
     *
     * <code>string subscriber_contact = 3;</code>
     *
     * @param value The subscriberContact to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriberContact(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subscriberContact_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email of the subscriber.
     * </pre>
     *
     * <code>string subscriber_contact = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubscriberContact() {
      subscriberContact_ = getDefaultInstance().getSubscriberContact();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email of the subscriber.
     * </pre>
     *
     * <code>string subscriber_contact = 3;</code>
     *
     * @param value The bytes for subscriberContact to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriberContactBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subscriberContact_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest)
  private static final com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest();
  }

  public static com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeDataExchangeRequest> PARSER =
      new com.google.protobuf.AbstractParser<SubscribeDataExchangeRequest>() {
        @java.lang.Override
        public SubscribeDataExchangeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscribeDataExchangeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeDataExchangeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.SubscribeDataExchangeRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
