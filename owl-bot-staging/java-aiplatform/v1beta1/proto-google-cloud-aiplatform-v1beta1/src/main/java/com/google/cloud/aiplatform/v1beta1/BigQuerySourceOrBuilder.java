// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/io.proto

package com.google.cloud.aiplatform.v1beta1;

public interface BigQuerySourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.BigQuerySource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. BigQuery URI to a table, up to 2000 characters long.
   * Accepted forms:
   *
   * *  BigQuery path. For example: `bq://projectId.bqDatasetId.bqTableId`.
   * </pre>
   *
   * <code>string input_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The inputUri.
   */
  java.lang.String getInputUri();
  /**
   * <pre>
   * Required. BigQuery URI to a table, up to 2000 characters long.
   * Accepted forms:
   *
   * *  BigQuery path. For example: `bq://projectId.bqDatasetId.bqTableId`.
   * </pre>
   *
   * <code>string input_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for inputUri.
   */
  com.google.protobuf.ByteString
      getInputUriBytes();
}
