// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1beta;

public interface GetMetadataImportRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.GetMetadataImportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The relative resource name of the metadata import to retrieve, in
   * the following form:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{import_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The relative resource name of the metadata import to retrieve, in
   * the following form:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{import_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
