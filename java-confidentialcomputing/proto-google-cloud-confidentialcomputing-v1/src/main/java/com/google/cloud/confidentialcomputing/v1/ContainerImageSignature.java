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
// source: google/cloud/confidentialcomputing/v1/service.proto

package com.google.cloud.confidentialcomputing.v1;

/**
 *
 *
 * <pre>
 * ContainerImageSignature holds necessary metadata to verify a container image
 * signature.
 * </pre>
 *
 * Protobuf type {@code google.cloud.confidentialcomputing.v1.ContainerImageSignature}
 */
public final class ContainerImageSignature extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.confidentialcomputing.v1.ContainerImageSignature)
    ContainerImageSignatureOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ContainerImageSignature.newBuilder() to construct.
  private ContainerImageSignature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ContainerImageSignature() {
    payload_ = com.google.protobuf.ByteString.EMPTY;
    signature_ = com.google.protobuf.ByteString.EMPTY;
    publicKey_ = com.google.protobuf.ByteString.EMPTY;
    sigAlg_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ContainerImageSignature();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.confidentialcomputing.v1.ContainerImageSignature.class,
            com.google.cloud.confidentialcomputing.v1.ContainerImageSignature.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Required. The binary signature payload following the SimpleSigning format
   * https://github.com/sigstore/cosign/blob/main/specs/SIGNATURE_SPEC.md#simple-signing.
   * This payload includes the container image digest.
   * </pre>
   *
   * <code>bytes payload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Required. A signature over the payload.
   * The container image digest is incorporated into the signature as follows:
   * 1. Generate a SimpleSigning format payload that includes the container
   * image digest.
   * 2. Generate a signature over SHA256 digest of the payload.
   * The signature generation process can be represented as follows:
   * `Sign(sha256(SimpleSigningPayload(sha256(Image Manifest))))`
   * </pre>
   *
   * <code>bytes signature = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Required. An associated public key used to verify the signature.
   * </pre>
   *
   * <code>bytes public_key = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The publicKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPublicKey() {
    return publicKey_;
  }

  public static final int SIG_ALG_FIELD_NUMBER = 4;
  private int sigAlg_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The algorithm used to produce the container image signature.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.SigningAlgorithm sig_alg = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for sigAlg.
   */
  @java.lang.Override
  public int getSigAlgValue() {
    return sigAlg_;
  }
  /**
   *
   *
   * <pre>
   * Required. The algorithm used to produce the container image signature.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.SigningAlgorithm sig_alg = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sigAlg.
   */
  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.SigningAlgorithm getSigAlg() {
    com.google.cloud.confidentialcomputing.v1.SigningAlgorithm result =
        com.google.cloud.confidentialcomputing.v1.SigningAlgorithm.forNumber(sigAlg_);
    return result == null
        ? com.google.cloud.confidentialcomputing.v1.SigningAlgorithm.UNRECOGNIZED
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
    if (!payload_.isEmpty()) {
      output.writeBytes(1, payload_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(2, signature_);
    }
    if (!publicKey_.isEmpty()) {
      output.writeBytes(3, publicKey_);
    }
    if (sigAlg_
        != com.google.cloud.confidentialcomputing.v1.SigningAlgorithm.SIGNING_ALGORITHM_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, sigAlg_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, payload_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, signature_);
    }
    if (!publicKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, publicKey_);
    }
    if (sigAlg_
        != com.google.cloud.confidentialcomputing.v1.SigningAlgorithm.SIGNING_ALGORITHM_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, sigAlg_);
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
    if (!(obj instanceof com.google.cloud.confidentialcomputing.v1.ContainerImageSignature)) {
      return super.equals(obj);
    }
    com.google.cloud.confidentialcomputing.v1.ContainerImageSignature other =
        (com.google.cloud.confidentialcomputing.v1.ContainerImageSignature) obj;

    if (!getPayload().equals(other.getPayload())) return false;
    if (!getSignature().equals(other.getSignature())) return false;
    if (!getPublicKey().equals(other.getPublicKey())) return false;
    if (sigAlg_ != other.sigAlg_) return false;
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
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + PUBLIC_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPublicKey().hashCode();
    hash = (37 * hash) + SIG_ALG_FIELD_NUMBER;
    hash = (53 * hash) + sigAlg_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature parseFrom(
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
      com.google.cloud.confidentialcomputing.v1.ContainerImageSignature prototype) {
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
   * ContainerImageSignature holds necessary metadata to verify a container image
   * signature.
   * </pre>
   *
   * Protobuf type {@code google.cloud.confidentialcomputing.v1.ContainerImageSignature}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.confidentialcomputing.v1.ContainerImageSignature)
      com.google.cloud.confidentialcomputing.v1.ContainerImageSignatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.confidentialcomputing.v1.ContainerImageSignature.class,
              com.google.cloud.confidentialcomputing.v1.ContainerImageSignature.Builder.class);
    }

    // Construct using
    // com.google.cloud.confidentialcomputing.v1.ContainerImageSignature.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      payload_ = com.google.protobuf.ByteString.EMPTY;
      signature_ = com.google.protobuf.ByteString.EMPTY;
      publicKey_ = com.google.protobuf.ByteString.EMPTY;
      sigAlg_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.ContainerImageSignature
        getDefaultInstanceForType() {
      return com.google.cloud.confidentialcomputing.v1.ContainerImageSignature.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.ContainerImageSignature build() {
      com.google.cloud.confidentialcomputing.v1.ContainerImageSignature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.ContainerImageSignature buildPartial() {
      com.google.cloud.confidentialcomputing.v1.ContainerImageSignature result =
          new com.google.cloud.confidentialcomputing.v1.ContainerImageSignature(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.confidentialcomputing.v1.ContainerImageSignature result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.payload_ = payload_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.signature_ = signature_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.publicKey_ = publicKey_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sigAlg_ = sigAlg_;
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
      if (other instanceof com.google.cloud.confidentialcomputing.v1.ContainerImageSignature) {
        return mergeFrom((com.google.cloud.confidentialcomputing.v1.ContainerImageSignature) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.confidentialcomputing.v1.ContainerImageSignature other) {
      if (other
          == com.google.cloud.confidentialcomputing.v1.ContainerImageSignature.getDefaultInstance())
        return this;
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (other.getPublicKey() != com.google.protobuf.ByteString.EMPTY) {
        setPublicKey(other.getPublicKey());
      }
      if (other.sigAlg_ != 0) {
        setSigAlgValue(other.getSigAlgValue());
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
                payload_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                signature_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                publicKey_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                sigAlg_ = input.readEnum();
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

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Required. The binary signature payload following the SimpleSigning format
     * https://github.com/sigstore/cosign/blob/main/specs/SIGNATURE_SPEC.md#simple-signing.
     * This payload includes the container image digest.
     * </pre>
     *
     * <code>bytes payload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     *
     *
     * <pre>
     * Required. The binary signature payload following the SimpleSigning format
     * https://github.com/sigstore/cosign/blob/main/specs/SIGNATURE_SPEC.md#simple-signing.
     * This payload includes the container image digest.
     * </pre>
     *
     * <code>bytes payload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      payload_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The binary signature payload following the SimpleSigning format
     * https://github.com/sigstore/cosign/blob/main/specs/SIGNATURE_SPEC.md#simple-signing.
     * This payload includes the container image digest.
     * </pre>
     *
     * <code>bytes payload = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000001);
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Required. A signature over the payload.
     * The container image digest is incorporated into the signature as follows:
     * 1. Generate a SimpleSigning format payload that includes the container
     * image digest.
     * 2. Generate a signature over SHA256 digest of the payload.
     * The signature generation process can be represented as follows:
     * `Sign(sha256(SimpleSigningPayload(sha256(Image Manifest))))`
     * </pre>
     *
     * <code>bytes signature = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     *
     *
     * <pre>
     * Required. A signature over the payload.
     * The container image digest is incorporated into the signature as follows:
     * 1. Generate a SimpleSigning format payload that includes the container
     * image digest.
     * 2. Generate a signature over SHA256 digest of the payload.
     * The signature generation process can be represented as follows:
     * `Sign(sha256(SimpleSigningPayload(sha256(Image Manifest))))`
     * </pre>
     *
     * <code>bytes signature = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      signature_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A signature over the payload.
     * The container image digest is incorporated into the signature as follows:
     * 1. Generate a SimpleSigning format payload that includes the container
     * image digest.
     * 2. Generate a signature over SHA256 digest of the payload.
     * The signature generation process can be represented as follows:
     * `Sign(sha256(SimpleSigningPayload(sha256(Image Manifest))))`
     * </pre>
     *
     * <code>bytes signature = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000002);
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Required. An associated public key used to verify the signature.
     * </pre>
     *
     * <code>bytes public_key = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The publicKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPublicKey() {
      return publicKey_;
    }
    /**
     *
     *
     * <pre>
     * Required. An associated public key used to verify the signature.
     * </pre>
     *
     * <code>bytes public_key = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The publicKey to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKey(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      publicKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. An associated public key used to verify the signature.
     * </pre>
     *
     * <code>bytes public_key = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPublicKey() {
      bitField0_ = (bitField0_ & ~0x00000004);
      publicKey_ = getDefaultInstance().getPublicKey();
      onChanged();
      return this;
    }

    private int sigAlg_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The algorithm used to produce the container image signature.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.SigningAlgorithm sig_alg = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for sigAlg.
     */
    @java.lang.Override
    public int getSigAlgValue() {
      return sigAlg_;
    }
    /**
     *
     *
     * <pre>
     * Required. The algorithm used to produce the container image signature.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.SigningAlgorithm sig_alg = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for sigAlg to set.
     * @return This builder for chaining.
     */
    public Builder setSigAlgValue(int value) {
      sigAlg_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The algorithm used to produce the container image signature.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.SigningAlgorithm sig_alg = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The sigAlg.
     */
    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.SigningAlgorithm getSigAlg() {
      com.google.cloud.confidentialcomputing.v1.SigningAlgorithm result =
          com.google.cloud.confidentialcomputing.v1.SigningAlgorithm.forNumber(sigAlg_);
      return result == null
          ? com.google.cloud.confidentialcomputing.v1.SigningAlgorithm.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The algorithm used to produce the container image signature.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.SigningAlgorithm sig_alg = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The sigAlg to set.
     * @return This builder for chaining.
     */
    public Builder setSigAlg(com.google.cloud.confidentialcomputing.v1.SigningAlgorithm value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      sigAlg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The algorithm used to produce the container image signature.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.SigningAlgorithm sig_alg = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSigAlg() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sigAlg_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.confidentialcomputing.v1.ContainerImageSignature)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.confidentialcomputing.v1.ContainerImageSignature)
  private static final com.google.cloud.confidentialcomputing.v1.ContainerImageSignature
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.confidentialcomputing.v1.ContainerImageSignature();
  }

  public static com.google.cloud.confidentialcomputing.v1.ContainerImageSignature
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContainerImageSignature> PARSER =
      new com.google.protobuf.AbstractParser<ContainerImageSignature>() {
        @java.lang.Override
        public ContainerImageSignature parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContainerImageSignature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContainerImageSignature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.ContainerImageSignature
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
