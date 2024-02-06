// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface ImportEntriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ImportEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Target entry group for ingested entries.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Target entry group for ingested entries.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Path to a Cloud Storage bucket that contains a dump ready for ingestion.
   * </pre>
   *
   * <code>string gcs_bucket_path = 2;</code>
   * @return Whether the gcsBucketPath field is set.
   */
  boolean hasGcsBucketPath();
  /**
   * <pre>
   * Path to a Cloud Storage bucket that contains a dump ready for ingestion.
   * </pre>
   *
   * <code>string gcs_bucket_path = 2;</code>
   * @return The gcsBucketPath.
   */
  java.lang.String getGcsBucketPath();
  /**
   * <pre>
   * Path to a Cloud Storage bucket that contains a dump ready for ingestion.
   * </pre>
   *
   * <code>string gcs_bucket_path = 2;</code>
   * @return The bytes for gcsBucketPath.
   */
  com.google.protobuf.ByteString
      getGcsBucketPathBytes();

  /**
   * <pre>
   * Optional. (Optional) Dataplex task job id, if specified will be used as
   * part of ImportEntries LRO ID
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * Optional. (Optional) Dataplex task job id, if specified will be used as
   * part of ImportEntries LRO ID
   * </pre>
   *
   * <code>string job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  com.google.cloud.datacatalog.v1.ImportEntriesRequest.SourceCase getSourceCase();
}
