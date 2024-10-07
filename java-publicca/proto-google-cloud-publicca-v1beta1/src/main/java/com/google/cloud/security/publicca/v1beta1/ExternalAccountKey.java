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
// source: google/cloud/security/publicca/v1beta1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.security.publicca.v1beta1;

/**
 *
 *
 * <pre>
 * A representation of an ExternalAccountKey used for [external account
 * binding](https://tools.ietf.org/html/rfc8555#section-7.3.4) within ACME.
 * </pre>
 *
 * Protobuf type {@code google.cloud.security.publicca.v1beta1.ExternalAccountKey}
 */
public final class ExternalAccountKey extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.security.publicca.v1beta1.ExternalAccountKey)
    ExternalAccountKeyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExternalAccountKey.newBuilder() to construct.
  private ExternalAccountKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExternalAccountKey() {
    name_ = "";
    keyId_ = "";
    b64MacKey_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExternalAccountKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.security.publicca.v1beta1.ResourcesProto
        .internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.security.publicca.v1beta1.ResourcesProto
        .internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.class,
            com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Resource name.
   * projects/{project}/locations/{location}/externalAccountKeys/{key_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. Resource name.
   * projects/{project}/locations/{location}/externalAccountKeys/{key_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

  public static final int KEY_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object keyId_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Key ID.
   * It is generated by the PublicCertificateAuthorityService
   * when the ExternalAccountKey is created
   * </pre>
   *
   * <code>string key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The keyId.
   */
  @java.lang.Override
  public java.lang.String getKeyId() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Key ID.
   * It is generated by the PublicCertificateAuthorityService
   * when the ExternalAccountKey is created
   * </pre>
   *
   * <code>string key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for keyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyIdBytes() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int B64_MAC_KEY_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString b64MacKey_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Output only. Base64-URL-encoded HS256 key.
   * It is generated by the PublicCertificateAuthorityService
   * when the ExternalAccountKey is created
   * </pre>
   *
   * <code>bytes b64_mac_key = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The b64MacKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getB64MacKey() {
    return b64MacKey_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyId_);
    }
    if (!b64MacKey_.isEmpty()) {
      output.writeBytes(3, b64MacKey_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyId_);
    }
    if (!b64MacKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, b64MacKey_);
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
    if (!(obj instanceof com.google.cloud.security.publicca.v1beta1.ExternalAccountKey)) {
      return super.equals(obj);
    }
    com.google.cloud.security.publicca.v1beta1.ExternalAccountKey other =
        (com.google.cloud.security.publicca.v1beta1.ExternalAccountKey) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getKeyId().equals(other.getKeyId())) return false;
    if (!getB64MacKey().equals(other.getB64MacKey())) return false;
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
    hash = (37 * hash) + KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getKeyId().hashCode();
    hash = (37 * hash) + B64_MAC_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getB64MacKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey parseFrom(
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
      com.google.cloud.security.publicca.v1beta1.ExternalAccountKey prototype) {
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
   * A representation of an ExternalAccountKey used for [external account
   * binding](https://tools.ietf.org/html/rfc8555#section-7.3.4) within ACME.
   * </pre>
   *
   * Protobuf type {@code google.cloud.security.publicca.v1beta1.ExternalAccountKey}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.security.publicca.v1beta1.ExternalAccountKey)
      com.google.cloud.security.publicca.v1beta1.ExternalAccountKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.security.publicca.v1beta1.ResourcesProto
          .internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.security.publicca.v1beta1.ResourcesProto
          .internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.class,
              com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.Builder.class);
    }

    // Construct using com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      keyId_ = "";
      b64MacKey_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.security.publicca.v1beta1.ResourcesProto
          .internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.security.publicca.v1beta1.ExternalAccountKey
        getDefaultInstanceForType() {
      return com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.security.publicca.v1beta1.ExternalAccountKey build() {
      com.google.cloud.security.publicca.v1beta1.ExternalAccountKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.security.publicca.v1beta1.ExternalAccountKey buildPartial() {
      com.google.cloud.security.publicca.v1beta1.ExternalAccountKey result =
          new com.google.cloud.security.publicca.v1beta1.ExternalAccountKey(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.security.publicca.v1beta1.ExternalAccountKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.keyId_ = keyId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.b64MacKey_ = b64MacKey_;
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
      if (other instanceof com.google.cloud.security.publicca.v1beta1.ExternalAccountKey) {
        return mergeFrom((com.google.cloud.security.publicca.v1beta1.ExternalAccountKey) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.security.publicca.v1beta1.ExternalAccountKey other) {
      if (other
          == com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getKeyId().isEmpty()) {
        keyId_ = other.keyId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getB64MacKey() != com.google.protobuf.ByteString.EMPTY) {
        setB64MacKey(other.getB64MacKey());
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
                keyId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                b64MacKey_ = input.readBytes();
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Resource name.
     * projects/{project}/locations/{location}/externalAccountKeys/{key_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name.
     * projects/{project}/locations/{location}/externalAccountKeys/{key_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name.
     * projects/{project}/locations/{location}/externalAccountKeys/{key_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name.
     * projects/{project}/locations/{location}/externalAccountKeys/{key_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name.
     * projects/{project}/locations/{location}/externalAccountKeys/{key_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

    private java.lang.Object keyId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Key ID.
     * It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The keyId.
     */
    public java.lang.String getKeyId() {
      java.lang.Object ref = keyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Key ID.
     * It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for keyId.
     */
    public com.google.protobuf.ByteString getKeyIdBytes() {
      java.lang.Object ref = keyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Key ID.
     * It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      keyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Key ID.
     * It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyId() {
      keyId_ = getDefaultInstance().getKeyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Key ID.
     * It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created
     * </pre>
     *
     * <code>string key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      keyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString b64MacKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Output only. Base64-URL-encoded HS256 key.
     * It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created
     * </pre>
     *
     * <code>bytes b64_mac_key = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The b64MacKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getB64MacKey() {
      return b64MacKey_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Base64-URL-encoded HS256 key.
     * It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created
     * </pre>
     *
     * <code>bytes b64_mac_key = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The b64MacKey to set.
     * @return This builder for chaining.
     */
    public Builder setB64MacKey(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      b64MacKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Base64-URL-encoded HS256 key.
     * It is generated by the PublicCertificateAuthorityService
     * when the ExternalAccountKey is created
     * </pre>
     *
     * <code>bytes b64_mac_key = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearB64MacKey() {
      bitField0_ = (bitField0_ & ~0x00000004);
      b64MacKey_ = getDefaultInstance().getB64MacKey();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.security.publicca.v1beta1.ExternalAccountKey)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.security.publicca.v1beta1.ExternalAccountKey)
  private static final com.google.cloud.security.publicca.v1beta1.ExternalAccountKey
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.security.publicca.v1beta1.ExternalAccountKey();
  }

  public static com.google.cloud.security.publicca.v1beta1.ExternalAccountKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalAccountKey> PARSER =
      new com.google.protobuf.AbstractParser<ExternalAccountKey>() {
        @java.lang.Override
        public ExternalAccountKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExternalAccountKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalAccountKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.security.publicca.v1beta1.ExternalAccountKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
