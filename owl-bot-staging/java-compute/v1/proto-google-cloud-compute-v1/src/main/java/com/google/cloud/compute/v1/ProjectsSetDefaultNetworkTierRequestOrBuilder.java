// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ProjectsSetDefaultNetworkTierRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Default network tier to be set.
   * Check the NetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_tier = 517397843;</code>
   * @return Whether the networkTier field is set.
   */
  boolean hasNetworkTier();
  /**
   * <pre>
   * Default network tier to be set.
   * Check the NetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_tier = 517397843;</code>
   * @return The networkTier.
   */
  java.lang.String getNetworkTier();
  /**
   * <pre>
   * Default network tier to be set.
   * Check the NetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_tier = 517397843;</code>
   * @return The bytes for networkTier.
   */
  com.google.protobuf.ByteString
      getNetworkTierBytes();
}
