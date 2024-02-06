// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface TargetSslProxiesSetCertificateMapRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetSslProxiesSetCertificateMapRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URL of the Certificate Map to associate with this TargetSslProxy. Accepted format is //certificatemanager.googleapis.com/projects/{project }/locations/{location}/certificateMaps/{resourceName}.
   * </pre>
   *
   * <code>optional string certificate_map = 156463796;</code>
   * @return Whether the certificateMap field is set.
   */
  boolean hasCertificateMap();
  /**
   * <pre>
   * URL of the Certificate Map to associate with this TargetSslProxy. Accepted format is //certificatemanager.googleapis.com/projects/{project }/locations/{location}/certificateMaps/{resourceName}.
   * </pre>
   *
   * <code>optional string certificate_map = 156463796;</code>
   * @return The certificateMap.
   */
  java.lang.String getCertificateMap();
  /**
   * <pre>
   * URL of the Certificate Map to associate with this TargetSslProxy. Accepted format is //certificatemanager.googleapis.com/projects/{project }/locations/{location}/certificateMaps/{resourceName}.
   * </pre>
   *
   * <code>optional string certificate_map = 156463796;</code>
   * @return The bytes for certificateMap.
   */
  com.google.protobuf.ByteString
      getCertificateMapBytes();
}
