// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface GetTargetInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetTargetInstanceRequest)
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
   * Name of the TargetInstance resource to return.
   * </pre>
   *
   * <code>string target_instance = 289769347 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The targetInstance.
   */
  java.lang.String getTargetInstance();
  /**
   * <pre>
   * Name of the TargetInstance resource to return.
   * </pre>
   *
   * <code>string target_instance = 289769347 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for targetInstance.
   */
  com.google.protobuf.ByteString
      getTargetInstanceBytes();

  /**
   * <pre>
   * Name of the zone scoping this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * Name of the zone scoping this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();
}
