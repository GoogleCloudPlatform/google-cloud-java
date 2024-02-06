// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ShieldedInstanceIdentityEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ShieldedInstanceIdentityEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A PEM-encoded X.509 certificate. This field can be empty.
   * </pre>
   *
   * <code>optional string ek_cert = 450178589;</code>
   * @return Whether the ekCert field is set.
   */
  boolean hasEkCert();
  /**
   * <pre>
   * A PEM-encoded X.509 certificate. This field can be empty.
   * </pre>
   *
   * <code>optional string ek_cert = 450178589;</code>
   * @return The ekCert.
   */
  java.lang.String getEkCert();
  /**
   * <pre>
   * A PEM-encoded X.509 certificate. This field can be empty.
   * </pre>
   *
   * <code>optional string ek_cert = 450178589;</code>
   * @return The bytes for ekCert.
   */
  com.google.protobuf.ByteString
      getEkCertBytes();

  /**
   * <pre>
   * A PEM-encoded public key.
   * </pre>
   *
   * <code>optional string ek_pub = 308947940;</code>
   * @return Whether the ekPub field is set.
   */
  boolean hasEkPub();
  /**
   * <pre>
   * A PEM-encoded public key.
   * </pre>
   *
   * <code>optional string ek_pub = 308947940;</code>
   * @return The ekPub.
   */
  java.lang.String getEkPub();
  /**
   * <pre>
   * A PEM-encoded public key.
   * </pre>
   *
   * <code>optional string ek_pub = 308947940;</code>
   * @return The bytes for ekPub.
   */
  com.google.protobuf.ByteString
      getEkPubBytes();
}
