// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface CompleteNodePoolUpgradeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.CompleteNodePoolUpgradeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name (project, location, cluster, node pool id) of the node pool to
   * complete upgrade.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, cluster, node pool id) of the node pool to
   * complete upgrade.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
