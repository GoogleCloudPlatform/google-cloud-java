// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface DistributionPolicyZoneConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DistributionPolicyZoneConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URL of the zone. The zone must exist in the region where the managed instance group is located.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   * @return Whether the zone field is set.
   */
  boolean hasZone();
  /**
   * <pre>
   * The URL of the zone. The zone must exist in the region where the managed instance group is located.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The URL of the zone. The zone must exist in the region where the managed instance group is located.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();
}
