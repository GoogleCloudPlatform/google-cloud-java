// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

public interface EntityReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.EntityReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. [Fully Qualified Name
   * (FQN)](https://cloud.google.com/data-catalog/docs/fully-qualified-names)
   * of the entity.
   * </pre>
   *
   * <code>string fully_qualified_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The fullyQualifiedName.
   */
  java.lang.String getFullyQualifiedName();
  /**
   * <pre>
   * Required. [Fully Qualified Name
   * (FQN)](https://cloud.google.com/data-catalog/docs/fully-qualified-names)
   * of the entity.
   * </pre>
   *
   * <code>string fully_qualified_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for fullyQualifiedName.
   */
  com.google.protobuf.ByteString
      getFullyQualifiedNameBytes();
}
