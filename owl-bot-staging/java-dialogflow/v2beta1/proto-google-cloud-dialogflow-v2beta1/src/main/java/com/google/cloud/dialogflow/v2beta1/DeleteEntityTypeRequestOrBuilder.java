// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface DeleteEntityTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the entity type to delete.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/entityTypes/&lt;Entity
   *   Type ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the entity type to delete.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/entityTypes/&lt;Entity
   *   Type ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
