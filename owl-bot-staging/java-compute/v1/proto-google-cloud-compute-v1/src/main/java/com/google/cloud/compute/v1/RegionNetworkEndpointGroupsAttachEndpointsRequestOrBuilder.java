// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface RegionNetworkEndpointGroupsAttachEndpointsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionNetworkEndpointGroupsAttachEndpointsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NetworkEndpoint> 
      getNetworkEndpointsList();
  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  com.google.cloud.compute.v1.NetworkEndpoint getNetworkEndpoints(int index);
  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  int getNetworkEndpointsCount();
  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NetworkEndpointOrBuilder> 
      getNetworkEndpointsOrBuilderList();
  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  com.google.cloud.compute.v1.NetworkEndpointOrBuilder getNetworkEndpointsOrBuilder(
      int index);
}
