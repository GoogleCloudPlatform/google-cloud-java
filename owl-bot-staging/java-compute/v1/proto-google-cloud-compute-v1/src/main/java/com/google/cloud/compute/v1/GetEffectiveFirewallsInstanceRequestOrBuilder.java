// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface GetEffectiveFirewallsInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetEffectiveFirewallsInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the instance scoping this request.
   * </pre>
   *
   * <code>string instance = 18257045 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * Name of the instance scoping this request.
   * </pre>
   *
   * <code>string instance = 18257045 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * The name of the network interface to get the effective firewalls.
   * </pre>
   *
   * <code>string network_interface = 365387880 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The networkInterface.
   */
  java.lang.String getNetworkInterface();
  /**
   * <pre>
   * The name of the network interface to get the effective firewalls.
   * </pre>
   *
   * <code>string network_interface = 365387880 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for networkInterface.
   */
  com.google.protobuf.ByteString
      getNetworkInterfaceBytes();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();
}
