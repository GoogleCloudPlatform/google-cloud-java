// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface DeletePerInstanceConfigsInstanceGroupManagerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DeletePerInstanceConfigsInstanceGroupManagerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the managed instance group. It should conform to RFC1035.
   * </pre>
   *
   * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceGroupManager.
   */
  java.lang.String getInstanceGroupManager();
  /**
   * <pre>
   * The name of the managed instance group. It should conform to RFC1035.
   * </pre>
   *
   * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceGroupManager.
   */
  com.google.protobuf.ByteString
      getInstanceGroupManagerBytes();

  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InstanceGroupManagersDeletePerInstanceConfigsReq instance_group_managers_delete_per_instance_configs_req_resource = 362427680 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the instanceGroupManagersDeletePerInstanceConfigsReqResource field is set.
   */
  boolean hasInstanceGroupManagersDeletePerInstanceConfigsReqResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InstanceGroupManagersDeletePerInstanceConfigsReq instance_group_managers_delete_per_instance_configs_req_resource = 362427680 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceGroupManagersDeletePerInstanceConfigsReqResource.
   */
  com.google.cloud.compute.v1.InstanceGroupManagersDeletePerInstanceConfigsReq getInstanceGroupManagersDeletePerInstanceConfigsReqResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InstanceGroupManagersDeletePerInstanceConfigsReq instance_group_managers_delete_per_instance_configs_req_resource = 362427680 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagersDeletePerInstanceConfigsReqOrBuilder getInstanceGroupManagersDeletePerInstanceConfigsReqResourceOrBuilder();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * The name of the zone where the managed instance group is located. It should conform to RFC1035.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "zone"];</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the zone where the managed instance group is located. It should conform to RFC1035.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "zone"];</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();
}
