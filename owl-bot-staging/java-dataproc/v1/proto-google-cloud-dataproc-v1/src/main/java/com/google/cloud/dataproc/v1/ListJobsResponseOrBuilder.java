// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

public interface ListJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ListJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Jobs list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.Job jobs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.dataproc.v1.Job> 
      getJobsList();
  /**
   * <pre>
   * Output only. Jobs list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.Job jobs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.Job getJobs(int index);
  /**
   * <pre>
   * Output only. Jobs list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.Job jobs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getJobsCount();
  /**
   * <pre>
   * Output only. Jobs list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.Job jobs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.JobOrBuilder> 
      getJobsOrBuilderList();
  /**
   * <pre>
   * Output only. Jobs list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.Job jobs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.JobOrBuilder getJobsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. This token is included in the response if there are more results
   * to fetch. To fetch additional results, provide this value as the
   * `page_token` in a subsequent &lt;code&gt;ListJobsRequest&lt;/code&gt;.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Optional. This token is included in the response if there are more results
   * to fetch. To fetch additional results, provide this value as the
   * `page_token` in a subsequent &lt;code&gt;ListJobsRequest&lt;/code&gt;.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
