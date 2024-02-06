// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface GetRouterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetRouterRequest)
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
   * Name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * Name of the Router resource to return.
   * </pre>
   *
   * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The router.
   */
  java.lang.String getRouter();
  /**
   * <pre>
   * Name of the Router resource to return.
   * </pre>
   *
   * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for router.
   */
  com.google.protobuf.ByteString
      getRouterBytes();
}
