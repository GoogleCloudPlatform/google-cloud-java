// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/metadata.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface GetPartitionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.GetPartitionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the partition:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}/partitions/{partition_value_path}`.
   * The {partition_value_path} segment consists of an ordered sequence of
   * partition values separated by "/". All values must be provided.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the partition:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}/partitions/{partition_value_path}`.
   * The {partition_value_path} segment consists of an ordered sequence of
   * partition values separated by "/". All values must be provided.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
