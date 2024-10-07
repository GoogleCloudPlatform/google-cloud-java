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
// source: google/cloud/securitycenter/v2/securitycenter_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

/**
 *
 *
 * <pre>
 * Request message for creating a mute config.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v2.CreateMuteConfigRequest}
 */
public final class CreateMuteConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v2.CreateMuteConfigRequest)
    CreateMuteConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateMuteConfigRequest.newBuilder() to construct.
  private CreateMuteConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateMuteConfigRequest() {
    parent_ = "";
    muteConfigId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateMuteConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
        .internal_static_google_cloud_securitycenter_v2_CreateMuteConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
        .internal_static_google_cloud_securitycenter_v2_CreateMuteConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v2.CreateMuteConfigRequest.class,
            com.google.cloud.securitycenter.v2.CreateMuteConfigRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Resource name of the new mute configs's parent. Its format is
   * `organizations/[organization_id]/locations/[location_id]`,
   * `folders/[folder_id]/locations/[location_id]`, or
   * `projects/[project_id]/locations/[location_id]`.
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
   * Required. Resource name of the new mute configs's parent. Its format is
   * `organizations/[organization_id]/locations/[location_id]`,
   * `folders/[folder_id]/locations/[location_id]`, or
   * `projects/[project_id]/locations/[location_id]`.
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

  public static final int MUTE_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.securitycenter.v2.MuteConfig muteConfig_;
  /**
   *
   *
   * <pre>
   * Required. The mute config being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the muteConfig field is set.
   */
  @java.lang.Override
  public boolean hasMuteConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The mute config being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The muteConfig.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v2.MuteConfig getMuteConfig() {
    return muteConfig_ == null
        ? com.google.cloud.securitycenter.v2.MuteConfig.getDefaultInstance()
        : muteConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The mute config being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v2.MuteConfigOrBuilder getMuteConfigOrBuilder() {
    return muteConfig_ == null
        ? com.google.cloud.securitycenter.v2.MuteConfig.getDefaultInstance()
        : muteConfig_;
  }

  public static final int MUTE_CONFIG_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object muteConfigId_ = "";
  /**
   *
   *
   * <pre>
   * Required. Unique identifier provided by the client within the parent scope.
   * It must consist of only lowercase letters, numbers, and hyphens, must start
   * with a letter, must end with either a letter or a number, and must be 63
   * characters or less.
   * </pre>
   *
   * <code>string mute_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The muteConfigId.
   */
  @java.lang.Override
  public java.lang.String getMuteConfigId() {
    java.lang.Object ref = muteConfigId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      muteConfigId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Unique identifier provided by the client within the parent scope.
   * It must consist of only lowercase letters, numbers, and hyphens, must start
   * with a letter, must end with either a letter or a number, and must be 63
   * characters or less.
   * </pre>
   *
   * <code>string mute_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for muteConfigId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMuteConfigIdBytes() {
    java.lang.Object ref = muteConfigId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      muteConfigId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getMuteConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(muteConfigId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, muteConfigId_);
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMuteConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(muteConfigId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, muteConfigId_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v2.CreateMuteConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v2.CreateMuteConfigRequest other =
        (com.google.cloud.securitycenter.v2.CreateMuteConfigRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasMuteConfig() != other.hasMuteConfig()) return false;
    if (hasMuteConfig()) {
      if (!getMuteConfig().equals(other.getMuteConfig())) return false;
    }
    if (!getMuteConfigId().equals(other.getMuteConfigId())) return false;
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
    if (hasMuteConfig()) {
      hash = (37 * hash) + MUTE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getMuteConfig().hashCode();
    }
    hash = (37 * hash) + MUTE_CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMuteConfigId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest parseFrom(
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
      com.google.cloud.securitycenter.v2.CreateMuteConfigRequest prototype) {
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
   * Request message for creating a mute config.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v2.CreateMuteConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v2.CreateMuteConfigRequest)
      com.google.cloud.securitycenter.v2.CreateMuteConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
          .internal_static_google_cloud_securitycenter_v2_CreateMuteConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
          .internal_static_google_cloud_securitycenter_v2_CreateMuteConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v2.CreateMuteConfigRequest.class,
              com.google.cloud.securitycenter.v2.CreateMuteConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v2.CreateMuteConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMuteConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      muteConfig_ = null;
      if (muteConfigBuilder_ != null) {
        muteConfigBuilder_.dispose();
        muteConfigBuilder_ = null;
      }
      muteConfigId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v2.SecuritycenterServiceProto
          .internal_static_google_cloud_securitycenter_v2_CreateMuteConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.CreateMuteConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v2.CreateMuteConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.CreateMuteConfigRequest build() {
      com.google.cloud.securitycenter.v2.CreateMuteConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.CreateMuteConfigRequest buildPartial() {
      com.google.cloud.securitycenter.v2.CreateMuteConfigRequest result =
          new com.google.cloud.securitycenter.v2.CreateMuteConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v2.CreateMuteConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.muteConfig_ = muteConfigBuilder_ == null ? muteConfig_ : muteConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.muteConfigId_ = muteConfigId_;
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
      if (other instanceof com.google.cloud.securitycenter.v2.CreateMuteConfigRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v2.CreateMuteConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v2.CreateMuteConfigRequest other) {
      if (other == com.google.cloud.securitycenter.v2.CreateMuteConfigRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMuteConfig()) {
        mergeMuteConfig(other.getMuteConfig());
      }
      if (!other.getMuteConfigId().isEmpty()) {
        muteConfigId_ = other.muteConfigId_;
        bitField0_ |= 0x00000004;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getMuteConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                muteConfigId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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
     * Required. Resource name of the new mute configs's parent. Its format is
     * `organizations/[organization_id]/locations/[location_id]`,
     * `folders/[folder_id]/locations/[location_id]`, or
     * `projects/[project_id]/locations/[location_id]`.
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
     * Required. Resource name of the new mute configs's parent. Its format is
     * `organizations/[organization_id]/locations/[location_id]`,
     * `folders/[folder_id]/locations/[location_id]`, or
     * `projects/[project_id]/locations/[location_id]`.
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
     * Required. Resource name of the new mute configs's parent. Its format is
     * `organizations/[organization_id]/locations/[location_id]`,
     * `folders/[folder_id]/locations/[location_id]`, or
     * `projects/[project_id]/locations/[location_id]`.
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
     * Required. Resource name of the new mute configs's parent. Its format is
     * `organizations/[organization_id]/locations/[location_id]`,
     * `folders/[folder_id]/locations/[location_id]`, or
     * `projects/[project_id]/locations/[location_id]`.
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
     * Required. Resource name of the new mute configs's parent. Its format is
     * `organizations/[organization_id]/locations/[location_id]`,
     * `folders/[folder_id]/locations/[location_id]`, or
     * `projects/[project_id]/locations/[location_id]`.
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

    private com.google.cloud.securitycenter.v2.MuteConfig muteConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v2.MuteConfig,
            com.google.cloud.securitycenter.v2.MuteConfig.Builder,
            com.google.cloud.securitycenter.v2.MuteConfigOrBuilder>
        muteConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The mute config being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the muteConfig field is set.
     */
    public boolean hasMuteConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The mute config being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The muteConfig.
     */
    public com.google.cloud.securitycenter.v2.MuteConfig getMuteConfig() {
      if (muteConfigBuilder_ == null) {
        return muteConfig_ == null
            ? com.google.cloud.securitycenter.v2.MuteConfig.getDefaultInstance()
            : muteConfig_;
      } else {
        return muteConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The mute config being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMuteConfig(com.google.cloud.securitycenter.v2.MuteConfig value) {
      if (muteConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        muteConfig_ = value;
      } else {
        muteConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The mute config being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMuteConfig(
        com.google.cloud.securitycenter.v2.MuteConfig.Builder builderForValue) {
      if (muteConfigBuilder_ == null) {
        muteConfig_ = builderForValue.build();
      } else {
        muteConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The mute config being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMuteConfig(com.google.cloud.securitycenter.v2.MuteConfig value) {
      if (muteConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && muteConfig_ != null
            && muteConfig_ != com.google.cloud.securitycenter.v2.MuteConfig.getDefaultInstance()) {
          getMuteConfigBuilder().mergeFrom(value);
        } else {
          muteConfig_ = value;
        }
      } else {
        muteConfigBuilder_.mergeFrom(value);
      }
      if (muteConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The mute config being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMuteConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      muteConfig_ = null;
      if (muteConfigBuilder_ != null) {
        muteConfigBuilder_.dispose();
        muteConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The mute config being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v2.MuteConfig.Builder getMuteConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMuteConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The mute config being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v2.MuteConfigOrBuilder getMuteConfigOrBuilder() {
      if (muteConfigBuilder_ != null) {
        return muteConfigBuilder_.getMessageOrBuilder();
      } else {
        return muteConfig_ == null
            ? com.google.cloud.securitycenter.v2.MuteConfig.getDefaultInstance()
            : muteConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The mute config being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v2.MuteConfig mute_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v2.MuteConfig,
            com.google.cloud.securitycenter.v2.MuteConfig.Builder,
            com.google.cloud.securitycenter.v2.MuteConfigOrBuilder>
        getMuteConfigFieldBuilder() {
      if (muteConfigBuilder_ == null) {
        muteConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securitycenter.v2.MuteConfig,
                com.google.cloud.securitycenter.v2.MuteConfig.Builder,
                com.google.cloud.securitycenter.v2.MuteConfigOrBuilder>(
                getMuteConfig(), getParentForChildren(), isClean());
        muteConfig_ = null;
      }
      return muteConfigBuilder_;
    }

    private java.lang.Object muteConfigId_ = "";
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of only lowercase letters, numbers, and hyphens, must start
     * with a letter, must end with either a letter or a number, and must be 63
     * characters or less.
     * </pre>
     *
     * <code>string mute_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The muteConfigId.
     */
    public java.lang.String getMuteConfigId() {
      java.lang.Object ref = muteConfigId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        muteConfigId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of only lowercase letters, numbers, and hyphens, must start
     * with a letter, must end with either a letter or a number, and must be 63
     * characters or less.
     * </pre>
     *
     * <code>string mute_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for muteConfigId.
     */
    public com.google.protobuf.ByteString getMuteConfigIdBytes() {
      java.lang.Object ref = muteConfigId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        muteConfigId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of only lowercase letters, numbers, and hyphens, must start
     * with a letter, must end with either a letter or a number, and must be 63
     * characters or less.
     * </pre>
     *
     * <code>string mute_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The muteConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setMuteConfigId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      muteConfigId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of only lowercase letters, numbers, and hyphens, must start
     * with a letter, must end with either a letter or a number, and must be 63
     * characters or less.
     * </pre>
     *
     * <code>string mute_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMuteConfigId() {
      muteConfigId_ = getDefaultInstance().getMuteConfigId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of only lowercase letters, numbers, and hyphens, must start
     * with a letter, must end with either a letter or a number, and must be 63
     * characters or less.
     * </pre>
     *
     * <code>string mute_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for muteConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setMuteConfigIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      muteConfigId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v2.CreateMuteConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v2.CreateMuteConfigRequest)
  private static final com.google.cloud.securitycenter.v2.CreateMuteConfigRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v2.CreateMuteConfigRequest();
  }

  public static com.google.cloud.securitycenter.v2.CreateMuteConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMuteConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateMuteConfigRequest>() {
        @java.lang.Override
        public CreateMuteConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMuteConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMuteConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v2.CreateMuteConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
