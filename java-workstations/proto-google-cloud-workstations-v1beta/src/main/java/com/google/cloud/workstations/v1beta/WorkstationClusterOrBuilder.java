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
// source: google/cloud/workstations/v1beta/workstations.proto

package com.google.cloud.workstations.v1beta;

public interface WorkstationClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1beta.WorkstationCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full name of this resource.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Full name of this resource.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Human-readable name for this resource.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human-readable name for this resource.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identified for this resource.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identified for this resource.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this resource is currently being updated to
   * match its intended state.
   * </pre>
   *
   * <code>bool reconciling = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was soft-deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was soft-deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was soft-deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Checksum computed by the server. May be sent on update and delete requests
   * to ensure that the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 9;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Checksum computed by the server. May be sent on update and delete requests
   * to ensure that the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 9;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Name of the Compute Engine network in which instances associated
   * with this cluster will be created.
   * </pre>
   *
   * <code>string network = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Immutable. Name of the Compute Engine network in which instances associated
   * with this cluster will be created.
   * </pre>
   *
   * <code>string network = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Name of the Compute Engine subnetwork in which instances
   * associated with this cluster will be created. Must be part of the
   * subnetwork specified for this cluster.
   * </pre>
   *
   * <code>string subnetwork = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Immutable. Name of the Compute Engine subnetwork in which instances
   * associated with this cluster will be created. Must be part of the
   * subnetwork specified for this cluster.
   * </pre>
   *
   * <code>string subnetwork = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Configuration for private cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationCluster.PrivateClusterConfig private_cluster_config = 12;
   * </code>
   *
   * @return Whether the privateClusterConfig field is set.
   */
  boolean hasPrivateClusterConfig();
  /**
   *
   *
   * <pre>
   * Configuration for private cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationCluster.PrivateClusterConfig private_cluster_config = 12;
   * </code>
   *
   * @return The privateClusterConfig.
   */
  com.google.cloud.workstations.v1beta.WorkstationCluster.PrivateClusterConfig
      getPrivateClusterConfig();
  /**
   *
   *
   * <pre>
   * Configuration for private cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationCluster.PrivateClusterConfig private_cluster_config = 12;
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationCluster.PrivateClusterConfigOrBuilder
      getPrivateClusterConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Whether this resource is in degraded mode, in which case it
   * may require user action to restore full functionality. Details can be found
   * in the `conditions` field.
   * </pre>
   *
   * <code>bool degraded = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The degraded.
   */
  boolean getDegraded();

  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.rpc.Status> getConditionsList();
  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.Status getConditions(int index);
  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.StatusOrBuilder getConditionsOrBuilder(int index);
}
