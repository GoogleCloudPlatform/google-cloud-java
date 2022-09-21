// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

public interface ListAutoscalingPoliciesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ListAutoscalingPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Autoscaling policies list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AutoscalingPolicy policies = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.dataproc.v1.AutoscalingPolicy> 
      getPoliciesList();
  /**
   * <pre>
   * Output only. Autoscaling policies list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AutoscalingPolicy policies = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.AutoscalingPolicy getPolicies(int index);
  /**
   * <pre>
   * Output only. Autoscaling policies list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AutoscalingPolicy policies = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPoliciesCount();
  /**
   * <pre>
   * Output only. Autoscaling policies list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AutoscalingPolicy policies = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.AutoscalingPolicyOrBuilder> 
      getPoliciesOrBuilderList();
  /**
   * <pre>
   * Output only. Autoscaling policies list.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AutoscalingPolicy policies = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.AutoscalingPolicyOrBuilder getPoliciesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. This token is included in the response if there are more
   * results to fetch.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Output only. This token is included in the response if there are more
   * results to fetch.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
