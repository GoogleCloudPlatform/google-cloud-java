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
// source: google/cloud/security/privateca/v1/service.proto

package com.google.cloud.security.privateca.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [CertificateAuthorityService.FetchCertificateAuthorityCsr][google.cloud.security.privateca.v1.CertificateAuthorityService.FetchCertificateAuthorityCsr].
 * </pre>
 *
 * Protobuf type {@code google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse}
 */
public final class FetchCertificateAuthorityCsrResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse)
    FetchCertificateAuthorityCsrResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FetchCertificateAuthorityCsrResponse.newBuilder() to construct.
  private FetchCertificateAuthorityCsrResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchCertificateAuthorityCsrResponse() {
    pemCsr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchCertificateAuthorityCsrResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.security.privateca.v1.PrivateCaProto
        .internal_static_google_cloud_security_privateca_v1_FetchCertificateAuthorityCsrResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.security.privateca.v1.PrivateCaProto
        .internal_static_google_cloud_security_privateca_v1_FetchCertificateAuthorityCsrResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse.class,
            com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse.Builder
                .class);
  }

  public static final int PEM_CSR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pemCsr_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The PEM-encoded signed certificate signing request (CSR).
   * </pre>
   *
   * <code>string pem_csr = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The pemCsr.
   */
  @java.lang.Override
  public java.lang.String getPemCsr() {
    java.lang.Object ref = pemCsr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pemCsr_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The PEM-encoded signed certificate signing request (CSR).
   * </pre>
   *
   * <code>string pem_csr = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for pemCsr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPemCsrBytes() {
    java.lang.Object ref = pemCsr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pemCsr_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pemCsr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pemCsr_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pemCsr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pemCsr_);
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
    if (!(obj
        instanceof com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse other =
        (com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse) obj;

    if (!getPemCsr().equals(other.getPemCsr())) return false;
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
    hash = (37 * hash) + PEM_CSR_FIELD_NUMBER;
    hash = (53 * hash) + getPemCsr().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      parseFrom(
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
      com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse prototype) {
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
   * Response message for
   * [CertificateAuthorityService.FetchCertificateAuthorityCsr][google.cloud.security.privateca.v1.CertificateAuthorityService.FetchCertificateAuthorityCsr].
   * </pre>
   *
   * Protobuf type {@code google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse)
      com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.security.privateca.v1.PrivateCaProto
          .internal_static_google_cloud_security_privateca_v1_FetchCertificateAuthorityCsrResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.security.privateca.v1.PrivateCaProto
          .internal_static_google_cloud_security_privateca_v1_FetchCertificateAuthorityCsrResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse.class,
              com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pemCsr_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.security.privateca.v1.PrivateCaProto
          .internal_static_google_cloud_security_privateca_v1_FetchCertificateAuthorityCsrResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
        getDefaultInstanceForType() {
      return com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse build() {
      com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
        buildPartial() {
      com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse result =
          new com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pemCsr_ = pemCsr_;
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
      if (other
          instanceof com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse) {
        return mergeFrom(
            (com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse other) {
      if (other
          == com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
              .getDefaultInstance()) return this;
      if (!other.getPemCsr().isEmpty()) {
        pemCsr_ = other.pemCsr_;
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
                pemCsr_ = input.readStringRequireUtf8();
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

    private java.lang.Object pemCsr_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The PEM-encoded signed certificate signing request (CSR).
     * </pre>
     *
     * <code>string pem_csr = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The pemCsr.
     */
    public java.lang.String getPemCsr() {
      java.lang.Object ref = pemCsr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pemCsr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The PEM-encoded signed certificate signing request (CSR).
     * </pre>
     *
     * <code>string pem_csr = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for pemCsr.
     */
    public com.google.protobuf.ByteString getPemCsrBytes() {
      java.lang.Object ref = pemCsr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pemCsr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The PEM-encoded signed certificate signing request (CSR).
     * </pre>
     *
     * <code>string pem_csr = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The pemCsr to set.
     * @return This builder for chaining.
     */
    public Builder setPemCsr(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pemCsr_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The PEM-encoded signed certificate signing request (CSR).
     * </pre>
     *
     * <code>string pem_csr = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPemCsr() {
      pemCsr_ = getDefaultInstance().getPemCsr();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The PEM-encoded signed certificate signing request (CSR).
     * </pre>
     *
     * <code>string pem_csr = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for pemCsr to set.
     * @return This builder for chaining.
     */
    public Builder setPemCsrBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pemCsr_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse)
  private static final com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse();
  }

  public static com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchCertificateAuthorityCsrResponse> PARSER =
      new com.google.protobuf.AbstractParser<FetchCertificateAuthorityCsrResponse>() {
        @java.lang.Override
        public FetchCertificateAuthorityCsrResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchCertificateAuthorityCsrResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchCertificateAuthorityCsrResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.security.privateca.v1.FetchCertificateAuthorityCsrResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
