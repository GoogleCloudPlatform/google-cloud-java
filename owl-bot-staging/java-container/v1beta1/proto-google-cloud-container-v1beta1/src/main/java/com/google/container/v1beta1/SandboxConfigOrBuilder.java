// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface SandboxConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.SandboxConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of the sandbox to use for the node (e.g. 'gvisor')
   * </pre>
   *
   * <code>string sandbox_type = 1 [deprecated = true];</code>
   * @deprecated google.container.v1beta1.SandboxConfig.sandbox_type is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=1004
   * @return The sandboxType.
   */
  @java.lang.Deprecated java.lang.String getSandboxType();
  /**
   * <pre>
   * Type of the sandbox to use for the node (e.g. 'gvisor')
   * </pre>
   *
   * <code>string sandbox_type = 1 [deprecated = true];</code>
   * @deprecated google.container.v1beta1.SandboxConfig.sandbox_type is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=1004
   * @return The bytes for sandboxType.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getSandboxTypeBytes();

  /**
   * <pre>
   * Type of the sandbox to use for the node.
   * </pre>
   *
   * <code>.google.container.v1beta1.SandboxConfig.Type type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the sandbox to use for the node.
   * </pre>
   *
   * <code>.google.container.v1beta1.SandboxConfig.Type type = 2;</code>
   * @return The type.
   */
  com.google.container.v1beta1.SandboxConfig.Type getType();
}
