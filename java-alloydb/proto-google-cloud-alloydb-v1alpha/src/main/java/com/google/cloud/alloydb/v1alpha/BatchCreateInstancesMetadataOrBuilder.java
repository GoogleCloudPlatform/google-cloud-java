/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/alloydb/v1alpha/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1alpha;

public interface BatchCreateInstancesMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.BatchCreateInstancesMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The instances being created in the API call. Each string in this list
   * is the server defined resource path for target instances in the request
   * and for the format of each string, see the comment on the Instance.name
   * field.
   * </pre>
   *
   * <code>repeated string instance_targets = 1;</code>
   *
   * @return A list containing the instanceTargets.
   */
  java.util.List<java.lang.String> getInstanceTargetsList();
  /**
   *
   *
   * <pre>
   * The instances being created in the API call. Each string in this list
   * is the server defined resource path for target instances in the request
   * and for the format of each string, see the comment on the Instance.name
   * field.
   * </pre>
   *
   * <code>repeated string instance_targets = 1;</code>
   *
   * @return The count of instanceTargets.
   */
  int getInstanceTargetsCount();
  /**
   *
   *
   * <pre>
   * The instances being created in the API call. Each string in this list
   * is the server defined resource path for target instances in the request
   * and for the format of each string, see the comment on the Instance.name
   * field.
   * </pre>
   *
   * <code>repeated string instance_targets = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The instanceTargets at the given index.
   */
  java.lang.String getInstanceTargets(int index);
  /**
   *
   *
   * <pre>
   * The instances being created in the API call. Each string in this list
   * is the server defined resource path for target instances in the request
   * and for the format of each string, see the comment on the Instance.name
   * field.
   * </pre>
   *
   * <code>repeated string instance_targets = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the instanceTargets at the given index.
   */
  com.google.protobuf.ByteString getInstanceTargetsBytes(int index);

  /**
   *
   *
   * <pre>
   * A map representing state of the instances involved in the
   * BatchCreateInstances operation during the operation execution.
   * The instance state will be in STATE_UNSPECIFIED state if the instance has
   * not yet been picked up for processing.
   * The key of the map is the name of the instance resource.
   * For the format, see the comment on the Instance.name field.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus&gt; instance_statuses = 2;
   * </code>
   */
  int getInstanceStatusesCount();
  /**
   *
   *
   * <pre>
   * A map representing state of the instances involved in the
   * BatchCreateInstances operation during the operation execution.
   * The instance state will be in STATE_UNSPECIFIED state if the instance has
   * not yet been picked up for processing.
   * The key of the map is the name of the instance resource.
   * For the format, see the comment on the Instance.name field.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus&gt; instance_statuses = 2;
   * </code>
   */
  boolean containsInstanceStatuses(java.lang.String key);
  /** Use {@link #getInstanceStatusesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus>
      getInstanceStatuses();
  /**
   *
   *
   * <pre>
   * A map representing state of the instances involved in the
   * BatchCreateInstances operation during the operation execution.
   * The instance state will be in STATE_UNSPECIFIED state if the instance has
   * not yet been picked up for processing.
   * The key of the map is the name of the instance resource.
   * For the format, see the comment on the Instance.name field.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus&gt; instance_statuses = 2;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus>
      getInstanceStatusesMap();
  /**
   *
   *
   * <pre>
   * A map representing state of the instances involved in the
   * BatchCreateInstances operation during the operation execution.
   * The instance state will be in STATE_UNSPECIFIED state if the instance has
   * not yet been picked up for processing.
   * The key of the map is the name of the instance resource.
   * For the format, see the comment on the Instance.name field.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus&gt; instance_statuses = 2;
   * </code>
   */
  /* nullable */
  com.google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus getInstanceStatusesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus defaultValue);
  /**
   *
   *
   * <pre>
   * A map representing state of the instances involved in the
   * BatchCreateInstances operation during the operation execution.
   * The instance state will be in STATE_UNSPECIFIED state if the instance has
   * not yet been picked up for processing.
   * The key of the map is the name of the instance resource.
   * For the format, see the comment on the Instance.name field.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus&gt; instance_statuses = 2;
   * </code>
   */
  com.google.cloud.alloydb.v1alpha.BatchCreateInstanceStatus getInstanceStatusesOrThrow(
      java.lang.String key);
}
