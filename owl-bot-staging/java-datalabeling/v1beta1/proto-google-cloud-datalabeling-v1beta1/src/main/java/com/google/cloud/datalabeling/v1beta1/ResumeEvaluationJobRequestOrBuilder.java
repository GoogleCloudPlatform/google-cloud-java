// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

public interface ResumeEvaluationJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the evaluation job that is going to be resumed. Format:
   *
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/evaluationJobs/&lt;var&gt;{evaluation_job_id}&lt;/var&gt;"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the evaluation job that is going to be resumed. Format:
   *
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/evaluationJobs/&lt;var&gt;{evaluation_job_id}&lt;/var&gt;"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
