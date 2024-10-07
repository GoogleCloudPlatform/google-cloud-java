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
// source: google/cloud/deploy/v1/deliverypipeline_notification_payload.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Payload proto for "clouddeploy.googleapis.com/deliverypipeline_notification"
 * Platform Log event that describes the failure to send delivery pipeline
 * status change Pub/Sub notification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.DeliveryPipelineNotificationEvent}
 */
public final class DeliveryPipelineNotificationEvent extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.DeliveryPipelineNotificationEvent)
    DeliveryPipelineNotificationEventOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeliveryPipelineNotificationEvent.newBuilder() to construct.
  private DeliveryPipelineNotificationEvent(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeliveryPipelineNotificationEvent() {
    message_ = "";
    pipelineUid_ = "";
    deliveryPipeline_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeliveryPipelineNotificationEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.DeliveryPipelineNotificationPayloadProto
        .internal_static_google_cloud_deploy_v1_DeliveryPipelineNotificationEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.DeliveryPipelineNotificationPayloadProto
        .internal_static_google_cloud_deploy_v1_DeliveryPipelineNotificationEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent.class,
            com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   *
   *
   * <pre>
   * Debug message for when a notification fails to send.
   * </pre>
   *
   * <code>string message = 1;</code>
   *
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Debug message for when a notification fails to send.
   * </pre>
   *
   * <code>string message = 1;</code>
   *
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PIPELINE_UID_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pipelineUid_ = "";
  /**
   *
   *
   * <pre>
   * Unique identifier of the `DeliveryPipeline`.
   * </pre>
   *
   * <code>string pipeline_uid = 4;</code>
   *
   * @return The pipelineUid.
   */
  @java.lang.Override
  public java.lang.String getPipelineUid() {
    java.lang.Object ref = pipelineUid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pipelineUid_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Unique identifier of the `DeliveryPipeline`.
   * </pre>
   *
   * <code>string pipeline_uid = 4;</code>
   *
   * @return The bytes for pipelineUid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPipelineUidBytes() {
    java.lang.Object ref = pipelineUid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pipelineUid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELIVERY_PIPELINE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deliveryPipeline_ = "";
  /**
   *
   *
   * <pre>
   * The name of the `Delivery Pipeline`.
   * </pre>
   *
   * <code>string delivery_pipeline = 2;</code>
   *
   * @return The deliveryPipeline.
   */
  @java.lang.Override
  public java.lang.String getDeliveryPipeline() {
    java.lang.Object ref = deliveryPipeline_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deliveryPipeline_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the `Delivery Pipeline`.
   * </pre>
   *
   * <code>string delivery_pipeline = 2;</code>
   *
   * @return The bytes for deliveryPipeline.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeliveryPipelineBytes() {
    java.lang.Object ref = deliveryPipeline_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deliveryPipeline_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Type of this notification, e.g. for a Pub/Sub failure.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Type type = 3;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Type of this notification, e.g. for a Pub/Sub failure.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Type type = 3;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.Type getType() {
    com.google.cloud.deploy.v1.Type result = com.google.cloud.deploy.v1.Type.forNumber(type_);
    return result == null ? com.google.cloud.deploy.v1.Type.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deliveryPipeline_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deliveryPipeline_);
    }
    if (type_ != com.google.cloud.deploy.v1.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pipelineUid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pipelineUid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deliveryPipeline_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deliveryPipeline_);
    }
    if (type_ != com.google.cloud.deploy.v1.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pipelineUid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pipelineUid_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent other =
        (com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent) obj;

    if (!getMessage().equals(other.getMessage())) return false;
    if (!getPipelineUid().equals(other.getPipelineUid())) return false;
    if (!getDeliveryPipeline().equals(other.getDeliveryPipeline())) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + PIPELINE_UID_FIELD_NUMBER;
    hash = (53 * hash) + getPipelineUid().hashCode();
    hash = (37 * hash) + DELIVERY_PIPELINE_FIELD_NUMBER;
    hash = (53 * hash) + getDeliveryPipeline().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent parseFrom(
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
      com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent prototype) {
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
   * Payload proto for "clouddeploy.googleapis.com/deliverypipeline_notification"
   * Platform Log event that describes the failure to send delivery pipeline
   * status change Pub/Sub notification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.DeliveryPipelineNotificationEvent}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.DeliveryPipelineNotificationEvent)
      com.google.cloud.deploy.v1.DeliveryPipelineNotificationEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.DeliveryPipelineNotificationPayloadProto
          .internal_static_google_cloud_deploy_v1_DeliveryPipelineNotificationEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.DeliveryPipelineNotificationPayloadProto
          .internal_static_google_cloud_deploy_v1_DeliveryPipelineNotificationEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent.class,
              com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      message_ = "";
      pipelineUid_ = "";
      deliveryPipeline_ = "";
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.DeliveryPipelineNotificationPayloadProto
          .internal_static_google_cloud_deploy_v1_DeliveryPipelineNotificationEvent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent
        getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent build() {
      com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent buildPartial() {
      com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent result =
          new com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pipelineUid_ = pipelineUid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.deliveryPipeline_ = deliveryPipeline_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.type_ = type_;
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
      if (other instanceof com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent) {
        return mergeFrom((com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent other) {
      if (other
          == com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent.getDefaultInstance())
        return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPipelineUid().isEmpty()) {
        pipelineUid_ = other.pipelineUid_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDeliveryPipeline().isEmpty()) {
        deliveryPipeline_ = other.deliveryPipeline_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
                message_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                deliveryPipeline_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 18
            case 24:
              {
                type_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 24
            case 34:
              {
                pipelineUid_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.lang.Object message_ = "";
    /**
     *
     *
     * <pre>
     * Debug message for when a notification fails to send.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Debug message for when a notification fails to send.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Debug message for when a notification fails to send.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      message_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Debug message for when a notification fails to send.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Debug message for when a notification fails to send.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object pipelineUid_ = "";
    /**
     *
     *
     * <pre>
     * Unique identifier of the `DeliveryPipeline`.
     * </pre>
     *
     * <code>string pipeline_uid = 4;</code>
     *
     * @return The pipelineUid.
     */
    public java.lang.String getPipelineUid() {
      java.lang.Object ref = pipelineUid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pipelineUid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Unique identifier of the `DeliveryPipeline`.
     * </pre>
     *
     * <code>string pipeline_uid = 4;</code>
     *
     * @return The bytes for pipelineUid.
     */
    public com.google.protobuf.ByteString getPipelineUidBytes() {
      java.lang.Object ref = pipelineUid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pipelineUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Unique identifier of the `DeliveryPipeline`.
     * </pre>
     *
     * <code>string pipeline_uid = 4;</code>
     *
     * @param value The pipelineUid to set.
     * @return This builder for chaining.
     */
    public Builder setPipelineUid(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pipelineUid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Unique identifier of the `DeliveryPipeline`.
     * </pre>
     *
     * <code>string pipeline_uid = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPipelineUid() {
      pipelineUid_ = getDefaultInstance().getPipelineUid();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Unique identifier of the `DeliveryPipeline`.
     * </pre>
     *
     * <code>string pipeline_uid = 4;</code>
     *
     * @param value The bytes for pipelineUid to set.
     * @return This builder for chaining.
     */
    public Builder setPipelineUidBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pipelineUid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object deliveryPipeline_ = "";
    /**
     *
     *
     * <pre>
     * The name of the `Delivery Pipeline`.
     * </pre>
     *
     * <code>string delivery_pipeline = 2;</code>
     *
     * @return The deliveryPipeline.
     */
    public java.lang.String getDeliveryPipeline() {
      java.lang.Object ref = deliveryPipeline_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deliveryPipeline_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the `Delivery Pipeline`.
     * </pre>
     *
     * <code>string delivery_pipeline = 2;</code>
     *
     * @return The bytes for deliveryPipeline.
     */
    public com.google.protobuf.ByteString getDeliveryPipelineBytes() {
      java.lang.Object ref = deliveryPipeline_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deliveryPipeline_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the `Delivery Pipeline`.
     * </pre>
     *
     * <code>string delivery_pipeline = 2;</code>
     *
     * @param value The deliveryPipeline to set.
     * @return This builder for chaining.
     */
    public Builder setDeliveryPipeline(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deliveryPipeline_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the `Delivery Pipeline`.
     * </pre>
     *
     * <code>string delivery_pipeline = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeliveryPipeline() {
      deliveryPipeline_ = getDefaultInstance().getDeliveryPipeline();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the `Delivery Pipeline`.
     * </pre>
     *
     * <code>string delivery_pipeline = 2;</code>
     *
     * @param value The bytes for deliveryPipeline to set.
     * @return This builder for chaining.
     */
    public Builder setDeliveryPipelineBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deliveryPipeline_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Type of this notification, e.g. for a Pub/Sub failure.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Type type = 3;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Type of this notification, e.g. for a Pub/Sub failure.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Type type = 3;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of this notification, e.g. for a Pub/Sub failure.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Type type = 3;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.deploy.v1.Type getType() {
      com.google.cloud.deploy.v1.Type result = com.google.cloud.deploy.v1.Type.forNumber(type_);
      return result == null ? com.google.cloud.deploy.v1.Type.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Type of this notification, e.g. for a Pub/Sub failure.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Type type = 3;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.deploy.v1.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of this notification, e.g. for a Pub/Sub failure.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.Type type = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      type_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.DeliveryPipelineNotificationEvent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.DeliveryPipelineNotificationEvent)
  private static final com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent();
  }

  public static com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeliveryPipelineNotificationEvent> PARSER =
      new com.google.protobuf.AbstractParser<DeliveryPipelineNotificationEvent>() {
        @java.lang.Override
        public DeliveryPipelineNotificationEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeliveryPipelineNotificationEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeliveryPipelineNotificationEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.DeliveryPipelineNotificationEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
