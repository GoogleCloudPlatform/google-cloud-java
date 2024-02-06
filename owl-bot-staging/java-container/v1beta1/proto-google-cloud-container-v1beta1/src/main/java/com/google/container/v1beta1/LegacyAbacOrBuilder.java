// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface LegacyAbacOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.LegacyAbac)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether the ABAC authorizer is enabled for this cluster. When enabled,
   * identities in the system, including service accounts, nodes, and
   * controllers, will have statically granted permissions beyond those
   * provided by the RBAC configuration or IAM.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();
}
