// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface GetNodeTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetNodeTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the node template to return.
   * </pre>
   *
   * <code>string node_template = 323154455 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nodeTemplate.
   */
  java.lang.String getNodeTemplate();
  /**
   * <pre>
   * Name of the node template to return.
   * </pre>
   *
   * <code>string node_template = 323154455 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for nodeTemplate.
   */
  com.google.protobuf.ByteString
      getNodeTemplateBytes();

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
   * The name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * The name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();
}
