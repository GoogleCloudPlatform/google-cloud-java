// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datastream.v1;

public interface PrivateConnectivityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.PrivateConnectivity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A reference to a private connection resource.
   * Format: `projects/{project}/locations/{location}/privateConnections/{name}`
   * </pre>
   *
   * <code>string private_connection = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The privateConnection.
   */
  java.lang.String getPrivateConnection();
  /**
   * <pre>
   * Required. A reference to a private connection resource.
   * Format: `projects/{project}/locations/{location}/privateConnections/{name}`
   * </pre>
   *
   * <code>string private_connection = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for privateConnection.
   */
  com.google.protobuf.ByteString
      getPrivateConnectionBytes();
}
