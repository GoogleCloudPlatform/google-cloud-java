// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface GetModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.GetModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Model resource.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   * In order to retrieve a specific version of the model, also provide
   * the version ID or version alias.
   *   Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * If no version ID or alias is specified, the "default" version will be
   * returned. The "default" version alias is created for the first version of
   * the model, and can be moved to other versions later on. There will be
   * exactly one default version.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the Model resource.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   * In order to retrieve a specific version of the model, also provide
   * the version ID or version alias.
   *   Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * If no version ID or alias is specified, the "default" version will be
   * returned. The "default" version alias is created for the first version of
   * the model, and can be moved to other versions later on. There will be
   * exactly one default version.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
