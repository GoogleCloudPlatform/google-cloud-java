/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface JobPlacementOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.JobPlacement)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the cluster where the job will be submitted.
   * </pre>
   *
   * <code>string cluster_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   *
   *
   * <pre>
   * Required. The name of the cluster where the job will be submitted.
   * </pre>
   *
   * <code>string cluster_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString getClusterNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A cluster UUID generated by the Dataproc service when
   * the job is submitted.
   * </pre>
   *
   * <code>string cluster_uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterUuid.
   */
  java.lang.String getClusterUuid();
  /**
   *
   *
   * <pre>
   * Output only. A cluster UUID generated by the Dataproc service when
   * the job is submitted.
   * </pre>
   *
   * <code>string cluster_uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clusterUuid.
   */
  com.google.protobuf.ByteString getClusterUuidBytes();

  /**
   *
   *
   * <pre>
   * Optional. Cluster labels to identify a cluster where the job will be submitted.
   * </pre>
   *
   * <code>map&lt;string, string&gt; cluster_labels = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getClusterLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Cluster labels to identify a cluster where the job will be submitted.
   * </pre>
   *
   * <code>map&lt;string, string&gt; cluster_labels = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsClusterLabels(java.lang.String key);
  /** Use {@link #getClusterLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getClusterLabels();
  /**
   *
   *
   * <pre>
   * Optional. Cluster labels to identify a cluster where the job will be submitted.
   * </pre>
   *
   * <code>map&lt;string, string&gt; cluster_labels = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getClusterLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Cluster labels to identify a cluster where the job will be submitted.
   * </pre>
   *
   * <code>map&lt;string, string&gt; cluster_labels = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */

  /* nullable */
  java.lang.String getClusterLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Cluster labels to identify a cluster where the job will be submitted.
   * </pre>
   *
   * <code>map&lt;string, string&gt; cluster_labels = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getClusterLabelsOrThrow(java.lang.String key);
}
