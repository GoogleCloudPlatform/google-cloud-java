// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface GetRegionHealthCheckServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetRegionHealthCheckServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the HealthCheckService to update. The name must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>string health_check_service = 408374747 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The healthCheckService.
   */
  java.lang.String getHealthCheckService();
  /**
   * <pre>
   * Name of the HealthCheckService to update. The name must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>string health_check_service = 408374747 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for healthCheckService.
   */
  com.google.protobuf.ByteString
      getHealthCheckServiceBytes();

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
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();
}
