// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetInterconnectRemoteLocationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetInterconnectRemoteLocationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the interconnect remote location to return.
   * </pre>
   *
   * <code>string interconnect_remote_location = 290153949 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The interconnectRemoteLocation.
   */
  java.lang.String getInterconnectRemoteLocation();
  /**
   * <pre>
   * Name of the interconnect remote location to return.
   * </pre>
   *
   * <code>string interconnect_remote_location = 290153949 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for interconnectRemoteLocation.
   */
  com.google.protobuf.ByteString
      getInterconnectRemoteLocationBytes();

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
}
