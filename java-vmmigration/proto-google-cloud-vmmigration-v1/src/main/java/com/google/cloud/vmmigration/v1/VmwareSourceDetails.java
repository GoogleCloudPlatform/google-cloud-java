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
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vmmigration.v1;

/**
 *
 *
 * <pre>
 * VmwareSourceDetails message describes a specific source details for the
 * vmware source type.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmmigration.v1.VmwareSourceDetails}
 */
public final class VmwareSourceDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmmigration.v1.VmwareSourceDetails)
    VmwareSourceDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VmwareSourceDetails.newBuilder() to construct.
  private VmwareSourceDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VmwareSourceDetails() {
    username_ = "";
    password_ = "";
    vcenterIp_ = "";
    thumbprint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VmwareSourceDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_VmwareSourceDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_VmwareSourceDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmmigration.v1.VmwareSourceDetails.class,
            com.google.cloud.vmmigration.v1.VmwareSourceDetails.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object username_ = "";
  /**
   *
   *
   * <pre>
   * The credentials username.
   * </pre>
   *
   * <code>string username = 1;</code>
   *
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The credentials username.
   * </pre>
   *
   * <code>string username = 1;</code>
   *
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSWORD_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object password_ = "";
  /**
   *
   *
   * <pre>
   * Input only. The credentials password. This is write only and can not be
   * read in a GET operation.
   * </pre>
   *
   * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The password.
   */
  @java.lang.Override
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Input only. The credentials password. This is write only and can not be
   * read in a GET operation.
   * </pre>
   *
   * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VCENTER_IP_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object vcenterIp_ = "";
  /**
   *
   *
   * <pre>
   * The ip address of the vcenter this Source represents.
   * </pre>
   *
   * <code>string vcenter_ip = 3;</code>
   *
   * @return The vcenterIp.
   */
  @java.lang.Override
  public java.lang.String getVcenterIp() {
    java.lang.Object ref = vcenterIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vcenterIp_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ip address of the vcenter this Source represents.
   * </pre>
   *
   * <code>string vcenter_ip = 3;</code>
   *
   * @return The bytes for vcenterIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVcenterIpBytes() {
    java.lang.Object ref = vcenterIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      vcenterIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THUMBPRINT_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object thumbprint_ = "";
  /**
   *
   *
   * <pre>
   * The thumbprint representing the certificate for the vcenter.
   * </pre>
   *
   * <code>string thumbprint = 4;</code>
   *
   * @return The thumbprint.
   */
  @java.lang.Override
  public java.lang.String getThumbprint() {
    java.lang.Object ref = thumbprint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      thumbprint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The thumbprint representing the certificate for the vcenter.
   * </pre>
   *
   * <code>string thumbprint = 4;</code>
   *
   * @return The bytes for thumbprint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getThumbprintBytes() {
    java.lang.Object ref = thumbprint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      thumbprint_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, password_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vcenterIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, vcenterIp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thumbprint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, thumbprint_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, password_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vcenterIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, vcenterIp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thumbprint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, thumbprint_);
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
    if (!(obj instanceof com.google.cloud.vmmigration.v1.VmwareSourceDetails)) {
      return super.equals(obj);
    }
    com.google.cloud.vmmigration.v1.VmwareSourceDetails other =
        (com.google.cloud.vmmigration.v1.VmwareSourceDetails) obj;

    if (!getUsername().equals(other.getUsername())) return false;
    if (!getPassword().equals(other.getPassword())) return false;
    if (!getVcenterIp().equals(other.getVcenterIp())) return false;
    if (!getThumbprint().equals(other.getThumbprint())) return false;
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
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (37 * hash) + VCENTER_IP_FIELD_NUMBER;
    hash = (53 * hash) + getVcenterIp().hashCode();
    hash = (37 * hash) + THUMBPRINT_FIELD_NUMBER;
    hash = (53 * hash) + getThumbprint().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vmmigration.v1.VmwareSourceDetails prototype) {
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
   * VmwareSourceDetails message describes a specific source details for the
   * vmware source type.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmmigration.v1.VmwareSourceDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmmigration.v1.VmwareSourceDetails)
      com.google.cloud.vmmigration.v1.VmwareSourceDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_VmwareSourceDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_VmwareSourceDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmmigration.v1.VmwareSourceDetails.class,
              com.google.cloud.vmmigration.v1.VmwareSourceDetails.Builder.class);
    }

    // Construct using com.google.cloud.vmmigration.v1.VmwareSourceDetails.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      username_ = "";
      password_ = "";
      vcenterIp_ = "";
      thumbprint_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_VmwareSourceDetails_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmwareSourceDetails getDefaultInstanceForType() {
      return com.google.cloud.vmmigration.v1.VmwareSourceDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmwareSourceDetails build() {
      com.google.cloud.vmmigration.v1.VmwareSourceDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmwareSourceDetails buildPartial() {
      com.google.cloud.vmmigration.v1.VmwareSourceDetails result =
          new com.google.cloud.vmmigration.v1.VmwareSourceDetails(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmmigration.v1.VmwareSourceDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.username_ = username_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.password_ = password_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.vcenterIp_ = vcenterIp_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.thumbprint_ = thumbprint_;
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
      if (other instanceof com.google.cloud.vmmigration.v1.VmwareSourceDetails) {
        return mergeFrom((com.google.cloud.vmmigration.v1.VmwareSourceDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmmigration.v1.VmwareSourceDetails other) {
      if (other == com.google.cloud.vmmigration.v1.VmwareSourceDetails.getDefaultInstance())
        return this;
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getVcenterIp().isEmpty()) {
        vcenterIp_ = other.vcenterIp_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getThumbprint().isEmpty()) {
        thumbprint_ = other.thumbprint_;
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
                username_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                password_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                vcenterIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                thumbprint_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
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

    private java.lang.Object username_ = "";
    /**
     *
     *
     * <pre>
     * The credentials username.
     * </pre>
     *
     * <code>string username = 1;</code>
     *
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The credentials username.
     * </pre>
     *
     * <code>string username = 1;</code>
     *
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The credentials username.
     * </pre>
     *
     * <code>string username = 1;</code>
     *
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      username_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The credentials username.
     * </pre>
     *
     * <code>string username = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      username_ = getDefaultInstance().getUsername();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The credentials username.
     * </pre>
     *
     * <code>string username = 1;</code>
     *
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      username_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     *
     *
     * <pre>
     * Input only. The credentials password. This is write only and can not be
     * read in a GET operation.
     * </pre>
     *
     * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return The password.
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Input only. The credentials password. This is write only and can not be
     * read in a GET operation.
     * </pre>
     *
     * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Input only. The credentials password. This is write only and can not be
     * read in a GET operation.
     * </pre>
     *
     * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      password_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. The credentials password. This is write only and can not be
     * read in a GET operation.
     * </pre>
     *
     * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      password_ = getDefaultInstance().getPassword();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. The credentials password. This is write only and can not be
     * read in a GET operation.
     * </pre>
     *
     * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      password_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object vcenterIp_ = "";
    /**
     *
     *
     * <pre>
     * The ip address of the vcenter this Source represents.
     * </pre>
     *
     * <code>string vcenter_ip = 3;</code>
     *
     * @return The vcenterIp.
     */
    public java.lang.String getVcenterIp() {
      java.lang.Object ref = vcenterIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vcenterIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ip address of the vcenter this Source represents.
     * </pre>
     *
     * <code>string vcenter_ip = 3;</code>
     *
     * @return The bytes for vcenterIp.
     */
    public com.google.protobuf.ByteString getVcenterIpBytes() {
      java.lang.Object ref = vcenterIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        vcenterIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ip address of the vcenter this Source represents.
     * </pre>
     *
     * <code>string vcenter_ip = 3;</code>
     *
     * @param value The vcenterIp to set.
     * @return This builder for chaining.
     */
    public Builder setVcenterIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      vcenterIp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ip address of the vcenter this Source represents.
     * </pre>
     *
     * <code>string vcenter_ip = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVcenterIp() {
      vcenterIp_ = getDefaultInstance().getVcenterIp();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ip address of the vcenter this Source represents.
     * </pre>
     *
     * <code>string vcenter_ip = 3;</code>
     *
     * @param value The bytes for vcenterIp to set.
     * @return This builder for chaining.
     */
    public Builder setVcenterIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      vcenterIp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object thumbprint_ = "";
    /**
     *
     *
     * <pre>
     * The thumbprint representing the certificate for the vcenter.
     * </pre>
     *
     * <code>string thumbprint = 4;</code>
     *
     * @return The thumbprint.
     */
    public java.lang.String getThumbprint() {
      java.lang.Object ref = thumbprint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        thumbprint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The thumbprint representing the certificate for the vcenter.
     * </pre>
     *
     * <code>string thumbprint = 4;</code>
     *
     * @return The bytes for thumbprint.
     */
    public com.google.protobuf.ByteString getThumbprintBytes() {
      java.lang.Object ref = thumbprint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        thumbprint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The thumbprint representing the certificate for the vcenter.
     * </pre>
     *
     * <code>string thumbprint = 4;</code>
     *
     * @param value The thumbprint to set.
     * @return This builder for chaining.
     */
    public Builder setThumbprint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      thumbprint_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The thumbprint representing the certificate for the vcenter.
     * </pre>
     *
     * <code>string thumbprint = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThumbprint() {
      thumbprint_ = getDefaultInstance().getThumbprint();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The thumbprint representing the certificate for the vcenter.
     * </pre>
     *
     * <code>string thumbprint = 4;</code>
     *
     * @param value The bytes for thumbprint to set.
     * @return This builder for chaining.
     */
    public Builder setThumbprintBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      thumbprint_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vmmigration.v1.VmwareSourceDetails)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmmigration.v1.VmwareSourceDetails)
  private static final com.google.cloud.vmmigration.v1.VmwareSourceDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmmigration.v1.VmwareSourceDetails();
  }

  public static com.google.cloud.vmmigration.v1.VmwareSourceDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VmwareSourceDetails> PARSER =
      new com.google.protobuf.AbstractParser<VmwareSourceDetails>() {
        @java.lang.Override
        public VmwareSourceDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<VmwareSourceDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VmwareSourceDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmmigration.v1.VmwareSourceDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
