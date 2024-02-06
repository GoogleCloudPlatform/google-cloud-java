// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface SetLabelsGlobalForwardingRuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SetLabelsGlobalForwardingRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the globalSetLabelsRequestResource field is set.
   */
  boolean hasGlobalSetLabelsRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The globalSetLabelsRequestResource.
   */
  com.google.cloud.compute.v1.GlobalSetLabelsRequest getGlobalSetLabelsRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.compute.v1.GlobalSetLabelsRequestOrBuilder getGlobalSetLabelsRequestResourceOrBuilder();

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
}
