// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface CreateLakeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.CreateLakeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the lake location, of the form:
   * projects/{project_number}/locations/{location_id}
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the lake location, of the form:
   * projects/{project_number}/locations/{location_id}
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Lake identifier.
   * This ID will be used to generate names such as database and dataset names
   * when publishing metadata to Hive Metastore and BigQuery.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique within the customer project / location.
   * </pre>
   *
   * <code>string lake_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The lakeId.
   */
  java.lang.String getLakeId();
  /**
   * <pre>
   * Required. Lake identifier.
   * This ID will be used to generate names such as database and dataset names
   * when publishing metadata to Hive Metastore and BigQuery.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique within the customer project / location.
   * </pre>
   *
   * <code>string lake_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for lakeId.
   */
  com.google.protobuf.ByteString
      getLakeIdBytes();

  /**
   * <pre>
   * Required. Lake resource
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the lake field is set.
   */
  boolean hasLake();
  /**
   * <pre>
   * Required. Lake resource
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The lake.
   */
  com.google.cloud.dataplex.v1.Lake getLake();
  /**
   * <pre>
   * Required. Lake resource
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Lake lake = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataplex.v1.LakeOrBuilder getLakeOrBuilder();

  /**
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
