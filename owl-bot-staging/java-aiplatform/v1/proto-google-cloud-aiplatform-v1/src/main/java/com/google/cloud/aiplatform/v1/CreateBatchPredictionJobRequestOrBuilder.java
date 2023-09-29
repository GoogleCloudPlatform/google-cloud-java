// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

public interface CreateBatchPredictionJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreateBatchPredictionJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location to create the
   * BatchPredictionJob in. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the Location to create the
   * BatchPredictionJob in. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The BatchPredictionJob to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob batch_prediction_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the batchPredictionJob field is set.
   */
  boolean hasBatchPredictionJob();
  /**
   * <pre>
   * Required. The BatchPredictionJob to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob batch_prediction_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The batchPredictionJob.
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJob getBatchPredictionJob();
  /**
   * <pre>
   * Required. The BatchPredictionJob to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob batch_prediction_job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJobOrBuilder getBatchPredictionJobOrBuilder();
}
