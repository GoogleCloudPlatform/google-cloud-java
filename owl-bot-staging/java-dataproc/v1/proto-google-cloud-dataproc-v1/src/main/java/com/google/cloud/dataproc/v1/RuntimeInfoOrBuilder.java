// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

public interface RuntimeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.RuntimeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and
   * APIs) to their URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getEndpointsCount();
  /**
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and
   * APIs) to their URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean containsEndpoints(
      java.lang.String key);
  /**
   * Use {@link #getEndpointsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEndpoints();
  /**
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and
   * APIs) to their URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEndpointsMap();
  /**
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and
   * APIs) to their URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  /* nullable */
java.lang.String getEndpointsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and
   * APIs) to their URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getEndpointsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. A URI pointing to the location of the stdout and stderr of the
   * workload.
   * </pre>
   *
   * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The outputUri.
   */
  java.lang.String getOutputUri();
  /**
   * <pre>
   * Output only. A URI pointing to the location of the stdout and stderr of the
   * workload.
   * </pre>
   *
   * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for outputUri.
   */
  com.google.protobuf.ByteString
      getOutputUriBytes();

  /**
   * <pre>
   * Output only. A URI pointing to the location of the diagnostics tarball.
   * </pre>
   *
   * <code>string diagnostic_output_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The diagnosticOutputUri.
   */
  java.lang.String getDiagnosticOutputUri();
  /**
   * <pre>
   * Output only. A URI pointing to the location of the diagnostics tarball.
   * </pre>
   *
   * <code>string diagnostic_output_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for diagnosticOutputUri.
   */
  com.google.protobuf.ByteString
      getDiagnosticOutputUriBytes();

  /**
   * <pre>
   * Output only. Approximate workload resource usage, calculated when
   * the workload completes (see [Dataproc Serverless pricing]
   * (https://cloud.google.com/dataproc-serverless/pricing)).
   *
   * **Note:** This metric calculation may change in the future, for
   * example, to capture cumulative workload resource
   * consumption during workload execution (see the
   * [Dataproc Serverless release notes]
   * (https://cloud.google.com/dataproc-serverless/docs/release-notes)
   * for announcements, changes, fixes
   * and other Dataproc developments).
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.UsageMetrics approximate_usage = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approximateUsage field is set.
   */
  boolean hasApproximateUsage();
  /**
   * <pre>
   * Output only. Approximate workload resource usage, calculated when
   * the workload completes (see [Dataproc Serverless pricing]
   * (https://cloud.google.com/dataproc-serverless/pricing)).
   *
   * **Note:** This metric calculation may change in the future, for
   * example, to capture cumulative workload resource
   * consumption during workload execution (see the
   * [Dataproc Serverless release notes]
   * (https://cloud.google.com/dataproc-serverless/docs/release-notes)
   * for announcements, changes, fixes
   * and other Dataproc developments).
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.UsageMetrics approximate_usage = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approximateUsage.
   */
  com.google.cloud.dataproc.v1.UsageMetrics getApproximateUsage();
  /**
   * <pre>
   * Output only. Approximate workload resource usage, calculated when
   * the workload completes (see [Dataproc Serverless pricing]
   * (https://cloud.google.com/dataproc-serverless/pricing)).
   *
   * **Note:** This metric calculation may change in the future, for
   * example, to capture cumulative workload resource
   * consumption during workload execution (see the
   * [Dataproc Serverless release notes]
   * (https://cloud.google.com/dataproc-serverless/docs/release-notes)
   * for announcements, changes, fixes
   * and other Dataproc developments).
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.UsageMetrics approximate_usage = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.UsageMetricsOrBuilder getApproximateUsageOrBuilder();

  /**
   * <pre>
   * Output only. Snapshot of current workload resource usage.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.UsageSnapshot current_usage = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the currentUsage field is set.
   */
  boolean hasCurrentUsage();
  /**
   * <pre>
   * Output only. Snapshot of current workload resource usage.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.UsageSnapshot current_usage = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The currentUsage.
   */
  com.google.cloud.dataproc.v1.UsageSnapshot getCurrentUsage();
  /**
   * <pre>
   * Output only. Snapshot of current workload resource usage.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.UsageSnapshot current_usage = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataproc.v1.UsageSnapshotOrBuilder getCurrentUsageOrBuilder();
}
