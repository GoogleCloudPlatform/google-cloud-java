// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface SetIamPolicyDiskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SetIamPolicyDiskRequest)
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
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString
      getResourceBytes();

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

  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the zoneSetPolicyRequestResource field is set.
   */
  boolean hasZoneSetPolicyRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The zoneSetPolicyRequestResource.
   */
  com.google.cloud.compute.v1.ZoneSetPolicyRequest getZoneSetPolicyRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.compute.v1.ZoneSetPolicyRequestOrBuilder getZoneSetPolicyRequestResourceOrBuilder();
}
