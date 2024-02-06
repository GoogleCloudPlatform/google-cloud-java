// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface GetRouteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetRouteRequest)
    com.google.protobuf.MessageOrBuilder {

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
   * Name of the Route resource to return.
   * </pre>
   *
   * <code>string route = 108704329 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The route.
   */
  java.lang.String getRoute();
  /**
   * <pre>
   * Name of the Route resource to return.
   * </pre>
   *
   * <code>string route = 108704329 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for route.
   */
  com.google.protobuf.ByteString
      getRouteBytes();
}
