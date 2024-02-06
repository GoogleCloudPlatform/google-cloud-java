// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/metadata.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface CreatePartitionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.CreatePartitionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Partition resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the partition field is set.
   */
  boolean hasPartition();
  /**
   * <pre>
   * Required. Partition resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The partition.
   */
  com.google.cloud.dataplex.v1.Partition getPartition();
  /**
   * <pre>
   * Required. Partition resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataplex.v1.PartitionOrBuilder getPartitionOrBuilder();

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
