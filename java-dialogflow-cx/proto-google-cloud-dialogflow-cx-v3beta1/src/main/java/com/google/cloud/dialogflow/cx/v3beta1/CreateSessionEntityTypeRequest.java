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
// source: google/cloud/dialogflow/cx/v3beta1/session_entity_type.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * The request message for
 * [SessionEntityTypes.CreateSessionEntityType][google.cloud.dialogflow.cx.v3beta1.SessionEntityTypes.CreateSessionEntityType].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest}
 */
public final class CreateSessionEntityTypeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest)
    CreateSessionEntityTypeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSessionEntityTypeRequest.newBuilder() to construct.
  private CreateSessionEntityTypeRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSessionEntityTypeRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSessionEntityTypeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest.class,
            com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The session to create a session entity type for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment.
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
   * Required. The session to create a session entity type for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment.
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

  public static final int SESSION_ENTITY_TYPE_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType sessionEntityType_;
  /**
   *
   *
   * <pre>
   * Required. The session entity type to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the sessionEntityType field is set.
   */
  @java.lang.Override
  public boolean hasSessionEntityType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The session entity type to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sessionEntityType.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType getSessionEntityType() {
    return sessionEntityType_ == null
        ? com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.getDefaultInstance()
        : sessionEntityType_;
  }
  /**
   *
   *
   * <pre>
   * Required. The session entity type to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder
      getSessionEntityTypeOrBuilder() {
    return sessionEntityType_ == null
        ? com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.getDefaultInstance()
        : sessionEntityType_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSessionEntityType());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSessionEntityType());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest other =
        (com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasSessionEntityType() != other.hasSessionEntityType()) return false;
    if (hasSessionEntityType()) {
      if (!getSessionEntityType().equals(other.getSessionEntityType())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSessionEntityType()) {
      hash = (37 * hash) + SESSION_ENTITY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getSessionEntityType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest prototype) {
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
   * The request message for
   * [SessionEntityTypes.CreateSessionEntityType][google.cloud.dialogflow.cx.v3beta1.SessionEntityTypes.CreateSessionEntityType].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest)
      com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest.class,
              com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSessionEntityTypeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      sessionEntityType_ = null;
      if (sessionEntityTypeBuilder_ != null) {
        sessionEntityTypeBuilder_.dispose();
        sessionEntityTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest build() {
      com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest result =
          new com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sessionEntityType_ =
            sessionEntityTypeBuilder_ == null
                ? sessionEntityType_
                : sessionEntityTypeBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest) {
        return mergeFrom(
            (com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest other) {
      if (other
          == com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSessionEntityType()) {
        mergeSessionEntityType(other.getSessionEntityType());
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
                input.readMessage(
                    getSessionEntityTypeFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The session to create a session entity type for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment.
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
     * Required. The session to create a session entity type for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment.
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
     * Required. The session to create a session entity type for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment.
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
     * Required. The session to create a session entity type for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment.
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
     * Required. The session to create a session entity type for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment.
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

    private com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType sessionEntityType_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType,
            com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder>
        sessionEntityTypeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The session entity type to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the sessionEntityType field is set.
     */
    public boolean hasSessionEntityType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The session entity type to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The sessionEntityType.
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType getSessionEntityType() {
      if (sessionEntityTypeBuilder_ == null) {
        return sessionEntityType_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.getDefaultInstance()
            : sessionEntityType_;
      } else {
        return sessionEntityTypeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The session entity type to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSessionEntityType(
        com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType value) {
      if (sessionEntityTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sessionEntityType_ = value;
      } else {
        sessionEntityTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The session entity type to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSessionEntityType(
        com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder builderForValue) {
      if (sessionEntityTypeBuilder_ == null) {
        sessionEntityType_ = builderForValue.build();
      } else {
        sessionEntityTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The session entity type to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSessionEntityType(
        com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType value) {
      if (sessionEntityTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && sessionEntityType_ != null
            && sessionEntityType_
                != com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.getDefaultInstance()) {
          getSessionEntityTypeBuilder().mergeFrom(value);
        } else {
          sessionEntityType_ = value;
        }
      } else {
        sessionEntityTypeBuilder_.mergeFrom(value);
      }
      if (sessionEntityType_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The session entity type to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSessionEntityType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sessionEntityType_ = null;
      if (sessionEntityTypeBuilder_ != null) {
        sessionEntityTypeBuilder_.dispose();
        sessionEntityTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The session entity type to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder
        getSessionEntityTypeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSessionEntityTypeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The session entity type to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder
        getSessionEntityTypeOrBuilder() {
      if (sessionEntityTypeBuilder_ != null) {
        return sessionEntityTypeBuilder_.getMessageOrBuilder();
      } else {
        return sessionEntityType_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.getDefaultInstance()
            : sessionEntityType_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The session entity type to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType,
            com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder>
        getSessionEntityTypeFieldBuilder() {
      if (sessionEntityTypeBuilder_ == null) {
        sessionEntityTypeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType,
                com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder,
                com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder>(
                getSessionEntityType(), getParentForChildren(), isClean());
        sessionEntityType_ = null;
      }
      return sessionEntityTypeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest)
  private static final com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSessionEntityTypeRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSessionEntityTypeRequest>() {
        @java.lang.Override
        public CreateSessionEntityTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSessionEntityTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSessionEntityTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.CreateSessionEntityTypeRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
