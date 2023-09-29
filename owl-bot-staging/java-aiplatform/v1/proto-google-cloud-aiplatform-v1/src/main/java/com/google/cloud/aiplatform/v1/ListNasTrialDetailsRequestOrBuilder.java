// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListNasTrialDetailsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListNasTrialDetailsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the NasJob resource.
   * Format:
   * `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the NasJob resource.
   * Format:
   * `projects/{project}/locations/{location}/nasJobs/{nas_job}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListNasTrialDetailsResponse.next_page_token][google.cloud.aiplatform.v1.ListNasTrialDetailsResponse.next_page_token]
   * of the previous
   * [JobService.ListNasTrialDetails][google.cloud.aiplatform.v1.JobService.ListNasTrialDetails]
   * call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListNasTrialDetailsResponse.next_page_token][google.cloud.aiplatform.v1.ListNasTrialDetailsResponse.next_page_token]
   * of the previous
   * [JobService.ListNasTrialDetails][google.cloud.aiplatform.v1.JobService.ListNasTrialDetails]
   * call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
