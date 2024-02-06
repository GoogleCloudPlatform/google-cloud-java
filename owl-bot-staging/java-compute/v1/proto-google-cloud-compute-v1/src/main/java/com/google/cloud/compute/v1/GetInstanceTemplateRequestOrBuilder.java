// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface GetInstanceTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetInstanceTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the instance template.
   * </pre>
   *
   * <code>string instance_template = 309248228 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceTemplate.
   */
  java.lang.String getInstanceTemplate();
  /**
   * <pre>
   * The name of the instance template.
   * </pre>
   *
   * <code>string instance_template = 309248228 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceTemplate.
   */
  com.google.protobuf.ByteString
      getInstanceTemplateBytes();

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
