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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

/**
 *
 *
 * <pre>
 * A request to get a particular `AccessLevel`.
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.GetAccessLevelRequest}
 */
public final class GetAccessLevelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.GetAccessLevelRequest)
    GetAccessLevelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetAccessLevelRequest.newBuilder() to construct.
  private GetAccessLevelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetAccessLevelRequest() {
    name_ = "";
    accessLevelFormat_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetAccessLevelRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetAccessLevelRequest(
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

              name_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              accessLevelFormat_ = rawValue;
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
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_GetAccessLevelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_GetAccessLevelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest.class,
            com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. Resource name for the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel].
   * Format:
   * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
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
   * Required. Resource name for the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel].
   * Format:
   * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
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

  public static final int ACCESS_LEVEL_FORMAT_FIELD_NUMBER = 2;
  private int accessLevelFormat_;
  /**
   *
   *
   * <pre>
   * Whether to return `BasicLevels` in the Cloud Common Expression
   * Language rather than as `BasicLevels`. Defaults to AS_DEFINED, where
   * [Access Levels] [google.identity.accesscontextmanager.v1.AccessLevel]
   * are returned as `BasicLevels` or `CustomLevels` based on how they were
   * created. If set to CEL, all [Access Levels]
   * [google.identity.accesscontextmanager.v1.AccessLevel] are returned as
   * `CustomLevels`. In the CEL case, `BasicLevels` are translated to equivalent
   * `CustomLevels`.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.LevelFormat access_level_format = 2;</code>
   *
   * @return The enum numeric value on the wire for accessLevelFormat.
   */
  @java.lang.Override
  public int getAccessLevelFormatValue() {
    return accessLevelFormat_;
  }
  /**
   *
   *
   * <pre>
   * Whether to return `BasicLevels` in the Cloud Common Expression
   * Language rather than as `BasicLevels`. Defaults to AS_DEFINED, where
   * [Access Levels] [google.identity.accesscontextmanager.v1.AccessLevel]
   * are returned as `BasicLevels` or `CustomLevels` based on how they were
   * created. If set to CEL, all [Access Levels]
   * [google.identity.accesscontextmanager.v1.AccessLevel] are returned as
   * `CustomLevels`. In the CEL case, `BasicLevels` are translated to equivalent
   * `CustomLevels`.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.LevelFormat access_level_format = 2;</code>
   *
   * @return The accessLevelFormat.
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.LevelFormat getAccessLevelFormat() {
    @SuppressWarnings("deprecation")
    com.google.identity.accesscontextmanager.v1.LevelFormat result =
        com.google.identity.accesscontextmanager.v1.LevelFormat.valueOf(accessLevelFormat_);
    return result == null
        ? com.google.identity.accesscontextmanager.v1.LevelFormat.UNRECOGNIZED
        : result;
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
    if (accessLevelFormat_
        != com.google.identity.accesscontextmanager.v1.LevelFormat.LEVEL_FORMAT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, accessLevelFormat_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (accessLevelFormat_
        != com.google.identity.accesscontextmanager.v1.LevelFormat.LEVEL_FORMAT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, accessLevelFormat_);
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
    if (!(obj instanceof com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest other =
        (com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (accessLevelFormat_ != other.accessLevelFormat_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ACCESS_LEVEL_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + accessLevelFormat_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parseFrom(
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
      com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest prototype) {
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
   * A request to get a particular `AccessLevel`.
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.GetAccessLevelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.GetAccessLevelRequest)
      com.google.identity.accesscontextmanager.v1.GetAccessLevelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_GetAccessLevelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_GetAccessLevelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest.class,
              com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest.Builder.class);
    }

    // Construct using
    // com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest.newBuilder()
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
      name_ = "";

      accessLevelFormat_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_GetAccessLevelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest
        getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest build() {
      com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest buildPartial() {
      com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest result =
          new com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest(this);
      result.name_ = name_;
      result.accessLevelFormat_ = accessLevelFormat_;
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
      if (other instanceof com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest) {
        return mergeFrom((com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest other) {
      if (other
          == com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.accessLevelFormat_ != 0) {
        setAccessLevelFormatValue(other.getAccessLevelFormatValue());
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
      com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name for the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel].
     * Format:
     * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
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
     * Required. Resource name for the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel].
     * Format:
     * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
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
     * Required. Resource name for the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel].
     * Format:
     * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name for the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel].
     * Format:
     * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name for the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel].
     * Format:
     * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
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
      onChanged();
      return this;
    }

    private int accessLevelFormat_ = 0;
    /**
     *
     *
     * <pre>
     * Whether to return `BasicLevels` in the Cloud Common Expression
     * Language rather than as `BasicLevels`. Defaults to AS_DEFINED, where
     * [Access Levels] [google.identity.accesscontextmanager.v1.AccessLevel]
     * are returned as `BasicLevels` or `CustomLevels` based on how they were
     * created. If set to CEL, all [Access Levels]
     * [google.identity.accesscontextmanager.v1.AccessLevel] are returned as
     * `CustomLevels`. In the CEL case, `BasicLevels` are translated to equivalent
     * `CustomLevels`.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.v1.LevelFormat access_level_format = 2;</code>
     *
     * @return The enum numeric value on the wire for accessLevelFormat.
     */
    @java.lang.Override
    public int getAccessLevelFormatValue() {
      return accessLevelFormat_;
    }
    /**
     *
     *
     * <pre>
     * Whether to return `BasicLevels` in the Cloud Common Expression
     * Language rather than as `BasicLevels`. Defaults to AS_DEFINED, where
     * [Access Levels] [google.identity.accesscontextmanager.v1.AccessLevel]
     * are returned as `BasicLevels` or `CustomLevels` based on how they were
     * created. If set to CEL, all [Access Levels]
     * [google.identity.accesscontextmanager.v1.AccessLevel] are returned as
     * `CustomLevels`. In the CEL case, `BasicLevels` are translated to equivalent
     * `CustomLevels`.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.v1.LevelFormat access_level_format = 2;</code>
     *
     * @param value The enum numeric value on the wire for accessLevelFormat to set.
     * @return This builder for chaining.
     */
    public Builder setAccessLevelFormatValue(int value) {

      accessLevelFormat_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to return `BasicLevels` in the Cloud Common Expression
     * Language rather than as `BasicLevels`. Defaults to AS_DEFINED, where
     * [Access Levels] [google.identity.accesscontextmanager.v1.AccessLevel]
     * are returned as `BasicLevels` or `CustomLevels` based on how they were
     * created. If set to CEL, all [Access Levels]
     * [google.identity.accesscontextmanager.v1.AccessLevel] are returned as
     * `CustomLevels`. In the CEL case, `BasicLevels` are translated to equivalent
     * `CustomLevels`.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.v1.LevelFormat access_level_format = 2;</code>
     *
     * @return The accessLevelFormat.
     */
    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.LevelFormat getAccessLevelFormat() {
      @SuppressWarnings("deprecation")
      com.google.identity.accesscontextmanager.v1.LevelFormat result =
          com.google.identity.accesscontextmanager.v1.LevelFormat.valueOf(accessLevelFormat_);
      return result == null
          ? com.google.identity.accesscontextmanager.v1.LevelFormat.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Whether to return `BasicLevels` in the Cloud Common Expression
     * Language rather than as `BasicLevels`. Defaults to AS_DEFINED, where
     * [Access Levels] [google.identity.accesscontextmanager.v1.AccessLevel]
     * are returned as `BasicLevels` or `CustomLevels` based on how they were
     * created. If set to CEL, all [Access Levels]
     * [google.identity.accesscontextmanager.v1.AccessLevel] are returned as
     * `CustomLevels`. In the CEL case, `BasicLevels` are translated to equivalent
     * `CustomLevels`.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.v1.LevelFormat access_level_format = 2;</code>
     *
     * @param value The accessLevelFormat to set.
     * @return This builder for chaining.
     */
    public Builder setAccessLevelFormat(
        com.google.identity.accesscontextmanager.v1.LevelFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }

      accessLevelFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to return `BasicLevels` in the Cloud Common Expression
     * Language rather than as `BasicLevels`. Defaults to AS_DEFINED, where
     * [Access Levels] [google.identity.accesscontextmanager.v1.AccessLevel]
     * are returned as `BasicLevels` or `CustomLevels` based on how they were
     * created. If set to CEL, all [Access Levels]
     * [google.identity.accesscontextmanager.v1.AccessLevel] are returned as
     * `CustomLevels`. In the CEL case, `BasicLevels` are translated to equivalent
     * `CustomLevels`.
     * </pre>
     *
     * <code>.google.identity.accesscontextmanager.v1.LevelFormat access_level_format = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccessLevelFormat() {

      accessLevelFormat_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.GetAccessLevelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.GetAccessLevelRequest)
  private static final com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest();
  }

  public static com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAccessLevelRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetAccessLevelRequest>() {
        @java.lang.Override
        public GetAccessLevelRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetAccessLevelRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetAccessLevelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAccessLevelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.GetAccessLevelRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
