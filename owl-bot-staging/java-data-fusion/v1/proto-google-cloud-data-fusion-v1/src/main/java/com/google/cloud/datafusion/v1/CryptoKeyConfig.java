// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1/datafusion.proto

package com.google.cloud.datafusion.v1;

/**
 * <pre>
 * The crypto key configuration. This field is used by the Customer-managed
 * encryption keys (CMEK) feature.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datafusion.v1.CryptoKeyConfig}
 */
public final class CryptoKeyConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datafusion.v1.CryptoKeyConfig)
    CryptoKeyConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CryptoKeyConfig.newBuilder() to construct.
  private CryptoKeyConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CryptoKeyConfig() {
    keyReference_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CryptoKeyConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datafusion.v1.Datafusion.internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datafusion.v1.Datafusion.internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datafusion.v1.CryptoKeyConfig.class, com.google.cloud.datafusion.v1.CryptoKeyConfig.Builder.class);
  }

  public static final int KEY_REFERENCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object keyReference_;
  /**
   * <pre>
   * The name of the key which is used to encrypt/decrypt customer data. For key
   * in Cloud KMS, the key should be in the format of
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string key_reference = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The keyReference.
   */
  @java.lang.Override
  public java.lang.String getKeyReference() {
    java.lang.Object ref = keyReference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyReference_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the key which is used to encrypt/decrypt customer data. For key
   * in Cloud KMS, the key should be in the format of
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string key_reference = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for keyReference.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyReferenceBytes() {
    java.lang.Object ref = keyReference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyReference_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyReference_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyReference_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyReference_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyReference_);
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
    if (!(obj instanceof com.google.cloud.datafusion.v1.CryptoKeyConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datafusion.v1.CryptoKeyConfig other = (com.google.cloud.datafusion.v1.CryptoKeyConfig) obj;

    if (!getKeyReference()
        .equals(other.getKeyReference())) return false;
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
    hash = (37 * hash) + KEY_REFERENCE_FIELD_NUMBER;
    hash = (53 * hash) + getKeyReference().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datafusion.v1.CryptoKeyConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.datafusion.v1.CryptoKeyConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The crypto key configuration. This field is used by the Customer-managed
   * encryption keys (CMEK) feature.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datafusion.v1.CryptoKeyConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datafusion.v1.CryptoKeyConfig)
      com.google.cloud.datafusion.v1.CryptoKeyConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datafusion.v1.Datafusion.internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datafusion.v1.Datafusion.internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datafusion.v1.CryptoKeyConfig.class, com.google.cloud.datafusion.v1.CryptoKeyConfig.Builder.class);
    }

    // Construct using com.google.cloud.datafusion.v1.CryptoKeyConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      keyReference_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datafusion.v1.Datafusion.internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1.CryptoKeyConfig getDefaultInstanceForType() {
      return com.google.cloud.datafusion.v1.CryptoKeyConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1.CryptoKeyConfig build() {
      com.google.cloud.datafusion.v1.CryptoKeyConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1.CryptoKeyConfig buildPartial() {
      com.google.cloud.datafusion.v1.CryptoKeyConfig result = new com.google.cloud.datafusion.v1.CryptoKeyConfig(this);
      result.keyReference_ = keyReference_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datafusion.v1.CryptoKeyConfig) {
        return mergeFrom((com.google.cloud.datafusion.v1.CryptoKeyConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datafusion.v1.CryptoKeyConfig other) {
      if (other == com.google.cloud.datafusion.v1.CryptoKeyConfig.getDefaultInstance()) return this;
      if (!other.getKeyReference().isEmpty()) {
        keyReference_ = other.keyReference_;
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
            case 10: {
              keyReference_ = input.readStringRequireUtf8();

              break;
            } // case 10
            default: {
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

    private java.lang.Object keyReference_ = "";
    /**
     * <pre>
     * The name of the key which is used to encrypt/decrypt customer data. For key
     * in Cloud KMS, the key should be in the format of
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
     * </pre>
     *
     * <code>string key_reference = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The keyReference.
     */
    public java.lang.String getKeyReference() {
      java.lang.Object ref = keyReference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyReference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the key which is used to encrypt/decrypt customer data. For key
     * in Cloud KMS, the key should be in the format of
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
     * </pre>
     *
     * <code>string key_reference = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for keyReference.
     */
    public com.google.protobuf.ByteString
        getKeyReferenceBytes() {
      java.lang.Object ref = keyReference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyReference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the key which is used to encrypt/decrypt customer data. For key
     * in Cloud KMS, the key should be in the format of
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
     * </pre>
     *
     * <code>string key_reference = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The keyReference to set.
     * @return This builder for chaining.
     */
    public Builder setKeyReference(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      keyReference_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the key which is used to encrypt/decrypt customer data. For key
     * in Cloud KMS, the key should be in the format of
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
     * </pre>
     *
     * <code>string key_reference = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyReference() {
      
      keyReference_ = getDefaultInstance().getKeyReference();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the key which is used to encrypt/decrypt customer data. For key
     * in Cloud KMS, the key should be in the format of
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
     * </pre>
     *
     * <code>string key_reference = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for keyReference to set.
     * @return This builder for chaining.
     */
    public Builder setKeyReferenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      keyReference_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.datafusion.v1.CryptoKeyConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datafusion.v1.CryptoKeyConfig)
  private static final com.google.cloud.datafusion.v1.CryptoKeyConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datafusion.v1.CryptoKeyConfig();
  }

  public static com.google.cloud.datafusion.v1.CryptoKeyConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CryptoKeyConfig>
      PARSER = new com.google.protobuf.AbstractParser<CryptoKeyConfig>() {
    @java.lang.Override
    public CryptoKeyConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<CryptoKeyConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CryptoKeyConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datafusion.v1.CryptoKeyConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

