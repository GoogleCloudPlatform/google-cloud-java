// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface UpdateCryptoKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.UpdateCryptoKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 1;</code>
   */
  boolean hasCryptoKey();
  /**
   *
   *
   * <pre>
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 1;</code>
   */
  com.google.cloud.kms.v1.CryptoKey getCryptoKey();
  /**
   *
   *
   * <pre>
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 1;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyOrBuilder getCryptoKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
