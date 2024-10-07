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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Include to use an existing data crypto key wrapped by KMS.
 * The wrapped key must be a 128-, 192-, or 256-bit key.
 * Authorization requires the following IAM permissions when sending a request
 * to perform a crypto transformation using a KMS-wrapped crypto key:
 * dlp.kms.encrypt
 *
 * For more information, see [Creating a wrapped key]
 * (https://cloud.google.com/sensitive-data-protection/docs/create-wrapped-key).
 *
 * Note: When you use Cloud KMS for cryptographic operations,
 * [charges apply](https://cloud.google.com/kms/pricing).
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.KmsWrappedCryptoKey}
 */
public final class KmsWrappedCryptoKey extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.KmsWrappedCryptoKey)
    KmsWrappedCryptoKeyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use KmsWrappedCryptoKey.newBuilder() to construct.
  private KmsWrappedCryptoKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private KmsWrappedCryptoKey() {
    wrappedKey_ = com.google.protobuf.ByteString.EMPTY;
    cryptoKeyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new KmsWrappedCryptoKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.KmsWrappedCryptoKey.class,
            com.google.privacy.dlp.v2.KmsWrappedCryptoKey.Builder.class);
  }

  public static final int WRAPPED_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString wrappedKey_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Required. The wrapped data crypto key.
   * </pre>
   *
   * <code>bytes wrapped_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The wrappedKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWrappedKey() {
    return wrappedKey_;
  }

  public static final int CRYPTO_KEY_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cryptoKeyName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the KMS CryptoKey to use for unwrapping.
   * </pre>
   *
   * <code>string crypto_key_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The cryptoKeyName.
   */
  @java.lang.Override
  public java.lang.String getCryptoKeyName() {
    java.lang.Object ref = cryptoKeyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cryptoKeyName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the KMS CryptoKey to use for unwrapping.
   * </pre>
   *
   * <code>string crypto_key_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for cryptoKeyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCryptoKeyNameBytes() {
    java.lang.Object ref = cryptoKeyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cryptoKeyName_ = b;
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
    if (!wrappedKey_.isEmpty()) {
      output.writeBytes(1, wrappedKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cryptoKeyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cryptoKeyName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!wrappedKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, wrappedKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cryptoKeyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cryptoKeyName_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.KmsWrappedCryptoKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.KmsWrappedCryptoKey other =
        (com.google.privacy.dlp.v2.KmsWrappedCryptoKey) obj;

    if (!getWrappedKey().equals(other.getWrappedKey())) return false;
    if (!getCryptoKeyName().equals(other.getCryptoKeyName())) return false;
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
    hash = (37 * hash) + WRAPPED_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getWrappedKey().hashCode();
    hash = (37 * hash) + CRYPTO_KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getCryptoKeyName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.KmsWrappedCryptoKey prototype) {
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
   * Include to use an existing data crypto key wrapped by KMS.
   * The wrapped key must be a 128-, 192-, or 256-bit key.
   * Authorization requires the following IAM permissions when sending a request
   * to perform a crypto transformation using a KMS-wrapped crypto key:
   * dlp.kms.encrypt
   *
   * For more information, see [Creating a wrapped key]
   * (https://cloud.google.com/sensitive-data-protection/docs/create-wrapped-key).
   *
   * Note: When you use Cloud KMS for cryptographic operations,
   * [charges apply](https://cloud.google.com/kms/pricing).
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.KmsWrappedCryptoKey}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.KmsWrappedCryptoKey)
      com.google.privacy.dlp.v2.KmsWrappedCryptoKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.KmsWrappedCryptoKey.class,
              com.google.privacy.dlp.v2.KmsWrappedCryptoKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.KmsWrappedCryptoKey.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      wrappedKey_ = com.google.protobuf.ByteString.EMPTY;
      cryptoKeyName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_KmsWrappedCryptoKey_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.KmsWrappedCryptoKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.KmsWrappedCryptoKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.KmsWrappedCryptoKey build() {
      com.google.privacy.dlp.v2.KmsWrappedCryptoKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.KmsWrappedCryptoKey buildPartial() {
      com.google.privacy.dlp.v2.KmsWrappedCryptoKey result =
          new com.google.privacy.dlp.v2.KmsWrappedCryptoKey(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.KmsWrappedCryptoKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wrappedKey_ = wrappedKey_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cryptoKeyName_ = cryptoKeyName_;
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
      if (other instanceof com.google.privacy.dlp.v2.KmsWrappedCryptoKey) {
        return mergeFrom((com.google.privacy.dlp.v2.KmsWrappedCryptoKey) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.KmsWrappedCryptoKey other) {
      if (other == com.google.privacy.dlp.v2.KmsWrappedCryptoKey.getDefaultInstance()) return this;
      if (other.getWrappedKey() != com.google.protobuf.ByteString.EMPTY) {
        setWrappedKey(other.getWrappedKey());
      }
      if (!other.getCryptoKeyName().isEmpty()) {
        cryptoKeyName_ = other.cryptoKeyName_;
        bitField0_ |= 0x00000002;
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
                wrappedKey_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                cryptoKeyName_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.ByteString wrappedKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Required. The wrapped data crypto key.
     * </pre>
     *
     * <code>bytes wrapped_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The wrappedKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getWrappedKey() {
      return wrappedKey_;
    }
    /**
     *
     *
     * <pre>
     * Required. The wrapped data crypto key.
     * </pre>
     *
     * <code>bytes wrapped_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The wrappedKey to set.
     * @return This builder for chaining.
     */
    public Builder setWrappedKey(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      wrappedKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The wrapped data crypto key.
     * </pre>
     *
     * <code>bytes wrapped_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWrappedKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      wrappedKey_ = getDefaultInstance().getWrappedKey();
      onChanged();
      return this;
    }

    private java.lang.Object cryptoKeyName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the KMS CryptoKey to use for unwrapping.
     * </pre>
     *
     * <code>string crypto_key_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The cryptoKeyName.
     */
    public java.lang.String getCryptoKeyName() {
      java.lang.Object ref = cryptoKeyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cryptoKeyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the KMS CryptoKey to use for unwrapping.
     * </pre>
     *
     * <code>string crypto_key_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for cryptoKeyName.
     */
    public com.google.protobuf.ByteString getCryptoKeyNameBytes() {
      java.lang.Object ref = cryptoKeyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cryptoKeyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the KMS CryptoKey to use for unwrapping.
     * </pre>
     *
     * <code>string crypto_key_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The cryptoKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setCryptoKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cryptoKeyName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the KMS CryptoKey to use for unwrapping.
     * </pre>
     *
     * <code>string crypto_key_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCryptoKeyName() {
      cryptoKeyName_ = getDefaultInstance().getCryptoKeyName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the KMS CryptoKey to use for unwrapping.
     * </pre>
     *
     * <code>string crypto_key_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for cryptoKeyName to set.
     * @return This builder for chaining.
     */
    public Builder setCryptoKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      cryptoKeyName_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.KmsWrappedCryptoKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.KmsWrappedCryptoKey)
  private static final com.google.privacy.dlp.v2.KmsWrappedCryptoKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.KmsWrappedCryptoKey();
  }

  public static com.google.privacy.dlp.v2.KmsWrappedCryptoKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KmsWrappedCryptoKey> PARSER =
      new com.google.protobuf.AbstractParser<KmsWrappedCryptoKey>() {
        @java.lang.Override
        public KmsWrappedCryptoKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<KmsWrappedCryptoKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KmsWrappedCryptoKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.KmsWrappedCryptoKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
