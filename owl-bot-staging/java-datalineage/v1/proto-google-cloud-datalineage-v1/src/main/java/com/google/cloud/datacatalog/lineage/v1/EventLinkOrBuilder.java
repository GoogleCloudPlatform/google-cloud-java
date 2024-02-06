// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.lineage.v1;

public interface EventLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.EventLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Reference to the source entity
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * Required. Reference to the source entity
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The source.
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReference getSource();
  /**
   * <pre>
   * Required. Reference to the source entity
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReferenceOrBuilder getSourceOrBuilder();

  /**
   * <pre>
   * Required. Reference to the target entity
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <pre>
   * Required. Reference to the target entity
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The target.
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReference getTarget();
  /**
   * <pre>
   * Required. Reference to the target entity
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.EntityReference target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReferenceOrBuilder getTargetOrBuilder();
}
