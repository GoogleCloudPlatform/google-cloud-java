// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface InterconnectDiagnosticsMacsecStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
   * </pre>
   *
   * <code>optional string ckn = 98566;</code>
   * @return Whether the ckn field is set.
   */
  boolean hasCkn();
  /**
   * <pre>
   * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
   * </pre>
   *
   * <code>optional string ckn = 98566;</code>
   * @return The ckn.
   */
  java.lang.String getCkn();
  /**
   * <pre>
   * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
   * </pre>
   *
   * <code>optional string ckn = 98566;</code>
   * @return The bytes for ckn.
   */
  com.google.protobuf.ByteString
      getCknBytes();

  /**
   * <pre>
   * Indicates whether or not MACsec is operational on this link.
   * </pre>
   *
   * <code>optional bool operational = 129704914;</code>
   * @return Whether the operational field is set.
   */
  boolean hasOperational();
  /**
   * <pre>
   * Indicates whether or not MACsec is operational on this link.
   * </pre>
   *
   * <code>optional bool operational = 129704914;</code>
   * @return The operational.
   */
  boolean getOperational();
}
