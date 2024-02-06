// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

public interface ListEvaluationJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.EvaluationJob> 
      getEvaluationJobsList();
  /**
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.EvaluationJob getEvaluationJobs(int index);
  /**
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  int getEvaluationJobsCount();
  /**
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder> 
      getEvaluationJobsOrBuilderList();
  /**
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder getEvaluationJobsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
