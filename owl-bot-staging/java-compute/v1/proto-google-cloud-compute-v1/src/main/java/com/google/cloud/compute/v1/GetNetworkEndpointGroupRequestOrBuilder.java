// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface GetNetworkEndpointGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetNetworkEndpointGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the network endpoint group. It should comply with RFC1035.
   * </pre>
   *
   * <code>string network_endpoint_group = 433907078 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The networkEndpointGroup.
   */
  java.lang.String getNetworkEndpointGroup();
  /**
   * <pre>
   * The name of the network endpoint group. It should comply with RFC1035.
   * </pre>
   *
   * <code>string network_endpoint_group = 433907078 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for networkEndpointGroup.
   */
  com.google.protobuf.ByteString
      getNetworkEndpointGroupBytes();

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
   * The name of the zone where the network endpoint group is located. It should comply with RFC1035.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the zone where the network endpoint group is located. It should comply with RFC1035.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();
}
