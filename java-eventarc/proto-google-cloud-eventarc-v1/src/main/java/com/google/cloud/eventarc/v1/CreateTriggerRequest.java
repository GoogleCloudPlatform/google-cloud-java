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
// source: google/cloud/eventarc/v1/eventarc.proto

package com.google.cloud.eventarc.v1;

/**
 *
 *
 * <pre>
 * The request message for the CreateTrigger method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.eventarc.v1.CreateTriggerRequest}
 */
public final class CreateTriggerRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.eventarc.v1.CreateTriggerRequest)
    CreateTriggerRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateTriggerRequest.newBuilder() to construct.
  private CreateTriggerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateTriggerRequest() {
    parent_ = "";
    triggerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateTriggerRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.eventarc.v1.EventarcProto
        .internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.eventarc.v1.EventarcProto
        .internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.eventarc.v1.CreateTriggerRequest.class,
            com.google.cloud.eventarc.v1.CreateTriggerRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent collection in which to add this trigger.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. The parent collection in which to add this trigger.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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

  public static final int TRIGGER_FIELD_NUMBER = 2;
  private com.google.cloud.eventarc.v1.Trigger trigger_;
  /**
   *
   *
   * <pre>
   * Required. The trigger to create.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the trigger field is set.
   */
  @java.lang.Override
  public boolean hasTrigger() {
    return trigger_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The trigger to create.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The trigger.
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.Trigger getTrigger() {
    return trigger_ == null ? com.google.cloud.eventarc.v1.Trigger.getDefaultInstance() : trigger_;
  }
  /**
   *
   *
   * <pre>
   * Required. The trigger to create.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.TriggerOrBuilder getTriggerOrBuilder() {
    return trigger_ == null ? com.google.cloud.eventarc.v1.Trigger.getDefaultInstance() : trigger_;
  }

  public static final int TRIGGER_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object triggerId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The user-provided ID to be assigned to the trigger.
   * </pre>
   *
   * <code>string trigger_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The triggerId.
   */
  @java.lang.Override
  public java.lang.String getTriggerId() {
    java.lang.Object ref = triggerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      triggerId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The user-provided ID to be assigned to the trigger.
   * </pre>
   *
   * <code>string trigger_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for triggerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTriggerIdBytes() {
    java.lang.Object ref = triggerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      triggerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * Required. If set, validate the request and preview the review, but do not
   * post it.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (trigger_ != null) {
      output.writeMessage(2, getTrigger());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(triggerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, triggerId_);
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (trigger_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTrigger());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(triggerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, triggerId_);
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.eventarc.v1.CreateTriggerRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.eventarc.v1.CreateTriggerRequest other =
        (com.google.cloud.eventarc.v1.CreateTriggerRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasTrigger() != other.hasTrigger()) return false;
    if (hasTrigger()) {
      if (!getTrigger().equals(other.getTrigger())) return false;
    }
    if (!getTriggerId().equals(other.getTriggerId())) return false;
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasTrigger()) {
      hash = (37 * hash) + TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getTrigger().hashCode();
    }
    hash = (37 * hash) + TRIGGER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTriggerId().hashCode();
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.eventarc.v1.CreateTriggerRequest prototype) {
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
   * The request message for the CreateTrigger method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.eventarc.v1.CreateTriggerRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.eventarc.v1.CreateTriggerRequest)
      com.google.cloud.eventarc.v1.CreateTriggerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.eventarc.v1.CreateTriggerRequest.class,
              com.google.cloud.eventarc.v1.CreateTriggerRequest.Builder.class);
    }

    // Construct using com.google.cloud.eventarc.v1.CreateTriggerRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      trigger_ = null;
      if (triggerBuilder_ != null) {
        triggerBuilder_.dispose();
        triggerBuilder_ = null;
      }
      triggerId_ = "";
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CreateTriggerRequest getDefaultInstanceForType() {
      return com.google.cloud.eventarc.v1.CreateTriggerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CreateTriggerRequest build() {
      com.google.cloud.eventarc.v1.CreateTriggerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CreateTriggerRequest buildPartial() {
      com.google.cloud.eventarc.v1.CreateTriggerRequest result =
          new com.google.cloud.eventarc.v1.CreateTriggerRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.eventarc.v1.CreateTriggerRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.trigger_ = triggerBuilder_ == null ? trigger_ : triggerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.triggerId_ = triggerId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.eventarc.v1.CreateTriggerRequest) {
        return mergeFrom((com.google.cloud.eventarc.v1.CreateTriggerRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.eventarc.v1.CreateTriggerRequest other) {
      if (other == com.google.cloud.eventarc.v1.CreateTriggerRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasTrigger()) {
        mergeTrigger(other.getTrigger());
      }
      if (!other.getTriggerId().isEmpty()) {
        triggerId_ = other.triggerId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getTriggerFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                triggerId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent collection in which to add this trigger.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The parent collection in which to add this trigger.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The parent collection in which to add this trigger.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent collection in which to add this trigger.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent collection in which to add this trigger.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.eventarc.v1.Trigger trigger_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.Trigger,
            com.google.cloud.eventarc.v1.Trigger.Builder,
            com.google.cloud.eventarc.v1.TriggerOrBuilder>
        triggerBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The trigger to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the trigger field is set.
     */
    public boolean hasTrigger() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The trigger to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The trigger.
     */
    public com.google.cloud.eventarc.v1.Trigger getTrigger() {
      if (triggerBuilder_ == null) {
        return trigger_ == null
            ? com.google.cloud.eventarc.v1.Trigger.getDefaultInstance()
            : trigger_;
      } else {
        return triggerBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The trigger to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTrigger(com.google.cloud.eventarc.v1.Trigger value) {
      if (triggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        trigger_ = value;
      } else {
        triggerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The trigger to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTrigger(com.google.cloud.eventarc.v1.Trigger.Builder builderForValue) {
      if (triggerBuilder_ == null) {
        trigger_ = builderForValue.build();
      } else {
        triggerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The trigger to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTrigger(com.google.cloud.eventarc.v1.Trigger value) {
      if (triggerBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && trigger_ != null
            && trigger_ != com.google.cloud.eventarc.v1.Trigger.getDefaultInstance()) {
          getTriggerBuilder().mergeFrom(value);
        } else {
          trigger_ = value;
        }
      } else {
        triggerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The trigger to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTrigger() {
      bitField0_ = (bitField0_ & ~0x00000002);
      trigger_ = null;
      if (triggerBuilder_ != null) {
        triggerBuilder_.dispose();
        triggerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The trigger to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.eventarc.v1.Trigger.Builder getTriggerBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTriggerFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The trigger to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.eventarc.v1.TriggerOrBuilder getTriggerOrBuilder() {
      if (triggerBuilder_ != null) {
        return triggerBuilder_.getMessageOrBuilder();
      } else {
        return trigger_ == null
            ? com.google.cloud.eventarc.v1.Trigger.getDefaultInstance()
            : trigger_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The trigger to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.Trigger,
            com.google.cloud.eventarc.v1.Trigger.Builder,
            com.google.cloud.eventarc.v1.TriggerOrBuilder>
        getTriggerFieldBuilder() {
      if (triggerBuilder_ == null) {
        triggerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.eventarc.v1.Trigger,
                com.google.cloud.eventarc.v1.Trigger.Builder,
                com.google.cloud.eventarc.v1.TriggerOrBuilder>(
                getTrigger(), getParentForChildren(), isClean());
        trigger_ = null;
      }
      return triggerBuilder_;
    }

    private java.lang.Object triggerId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the trigger.
     * </pre>
     *
     * <code>string trigger_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The triggerId.
     */
    public java.lang.String getTriggerId() {
      java.lang.Object ref = triggerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        triggerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the trigger.
     * </pre>
     *
     * <code>string trigger_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for triggerId.
     */
    public com.google.protobuf.ByteString getTriggerIdBytes() {
      java.lang.Object ref = triggerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        triggerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the trigger.
     * </pre>
     *
     * <code>string trigger_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The triggerId to set.
     * @return This builder for chaining.
     */
    public Builder setTriggerId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      triggerId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the trigger.
     * </pre>
     *
     * <code>string trigger_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTriggerId() {
      triggerId_ = getDefaultInstance().getTriggerId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the trigger.
     * </pre>
     *
     * <code>string trigger_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for triggerId to set.
     * @return This builder for chaining.
     */
    public Builder setTriggerIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      triggerId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Required. If set, validate the request and preview the review, but do not
     * post it.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * Required. If set, validate the request and preview the review, but do not
     * post it.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. If set, validate the request and preview the review, but do not
     * post it.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.eventarc.v1.CreateTriggerRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.CreateTriggerRequest)
  private static final com.google.cloud.eventarc.v1.CreateTriggerRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.eventarc.v1.CreateTriggerRequest();
  }

  public static com.google.cloud.eventarc.v1.CreateTriggerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTriggerRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateTriggerRequest>() {
        @java.lang.Override
        public CreateTriggerRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTriggerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTriggerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.eventarc.v1.CreateTriggerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
