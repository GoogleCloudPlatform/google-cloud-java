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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * SSH configuration for Azure resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureSshConfig}
 */
public final class AzureSshConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AzureSshConfig)
    AzureSshConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AzureSshConfig.newBuilder() to construct.
  private AzureSshConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AzureSshConfig() {
    authorizedKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AzureSshConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureSshConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureSshConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AzureSshConfig.class,
            com.google.cloud.gkemulticloud.v1.AzureSshConfig.Builder.class);
  }

  public static final int AUTHORIZED_KEY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object authorizedKey_ = "";
  /**
   *
   *
   * <pre>
   * Required. The SSH public key data for VMs managed by Anthos. This accepts
   * the authorized_keys file format used in OpenSSH according to the sshd(8)
   * manual page.
   * </pre>
   *
   * <code>string authorized_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The authorizedKey.
   */
  @java.lang.Override
  public java.lang.String getAuthorizedKey() {
    java.lang.Object ref = authorizedKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authorizedKey_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The SSH public key data for VMs managed by Anthos. This accepts
   * the authorized_keys file format used in OpenSSH according to the sshd(8)
   * manual page.
   * </pre>
   *
   * <code>string authorized_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for authorizedKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAuthorizedKeyBytes() {
    java.lang.Object ref = authorizedKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      authorizedKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authorizedKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, authorizedKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authorizedKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, authorizedKey_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AzureSshConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AzureSshConfig other =
        (com.google.cloud.gkemulticloud.v1.AzureSshConfig) obj;

    if (!getAuthorizedKey().equals(other.getAuthorizedKey())) return false;
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
    hash = (37 * hash) + AUTHORIZED_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getAuthorizedKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.AzureSshConfig prototype) {
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
   * SSH configuration for Azure resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureSshConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AzureSshConfig)
      com.google.cloud.gkemulticloud.v1.AzureSshConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureSshConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureSshConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AzureSshConfig.class,
              com.google.cloud.gkemulticloud.v1.AzureSshConfig.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AzureSshConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      authorizedKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureSshConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureSshConfig getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AzureSshConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureSshConfig build() {
      com.google.cloud.gkemulticloud.v1.AzureSshConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureSshConfig buildPartial() {
      com.google.cloud.gkemulticloud.v1.AzureSshConfig result =
          new com.google.cloud.gkemulticloud.v1.AzureSshConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.AzureSshConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authorizedKey_ = authorizedKey_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AzureSshConfig) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AzureSshConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AzureSshConfig other) {
      if (other == com.google.cloud.gkemulticloud.v1.AzureSshConfig.getDefaultInstance())
        return this;
      if (!other.getAuthorizedKey().isEmpty()) {
        authorizedKey_ = other.authorizedKey_;
        bitField0_ |= 0x00000001;
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
                authorizedKey_ = input.readStringRequireUtf8();
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

    private java.lang.Object authorizedKey_ = "";
    /**
     *
     *
     * <pre>
     * Required. The SSH public key data for VMs managed by Anthos. This accepts
     * the authorized_keys file format used in OpenSSH according to the sshd(8)
     * manual page.
     * </pre>
     *
     * <code>string authorized_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The authorizedKey.
     */
    public java.lang.String getAuthorizedKey() {
      java.lang.Object ref = authorizedKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authorizedKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key data for VMs managed by Anthos. This accepts
     * the authorized_keys file format used in OpenSSH according to the sshd(8)
     * manual page.
     * </pre>
     *
     * <code>string authorized_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for authorizedKey.
     */
    public com.google.protobuf.ByteString getAuthorizedKeyBytes() {
      java.lang.Object ref = authorizedKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        authorizedKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key data for VMs managed by Anthos. This accepts
     * the authorized_keys file format used in OpenSSH according to the sshd(8)
     * manual page.
     * </pre>
     *
     * <code>string authorized_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The authorizedKey to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizedKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      authorizedKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key data for VMs managed by Anthos. This accepts
     * the authorized_keys file format used in OpenSSH according to the sshd(8)
     * manual page.
     * </pre>
     *
     * <code>string authorized_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAuthorizedKey() {
      authorizedKey_ = getDefaultInstance().getAuthorizedKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key data for VMs managed by Anthos. This accepts
     * the authorized_keys file format used in OpenSSH according to the sshd(8)
     * manual page.
     * </pre>
     *
     * <code>string authorized_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for authorizedKey to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizedKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      authorizedKey_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AzureSshConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AzureSshConfig)
  private static final com.google.cloud.gkemulticloud.v1.AzureSshConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AzureSshConfig();
  }

  public static com.google.cloud.gkemulticloud.v1.AzureSshConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AzureSshConfig> PARSER =
      new com.google.protobuf.AbstractParser<AzureSshConfig>() {
        @java.lang.Override
        public AzureSshConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AzureSshConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AzureSshConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureSshConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
