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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface DataRetentionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.DataRetentionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The number of days describing for how long to store event-based
   * records in airflow database. If the retention mechanism is enabled this
   * value must be a positive integer otherwise, value should be set to 0.
   * </pre>
   *
   * <code>
   * int32 airflow_database_retention_days = 1 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated
   *     google.cloud.orchestration.airflow.service.v1beta1.DataRetentionConfig.airflow_database_retention_days
   *     is deprecated. See
   *     google/cloud/orchestration/airflow/service/v1beta1/environments.proto;l=1889
   * @return The airflowDatabaseRetentionDays.
   */
  @java.lang.Deprecated
  int getAirflowDatabaseRetentionDays();

  /**
   *
   *
   * <pre>
   * Optional. The configuration settings for task logs retention
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.TaskLogsRetentionConfig task_logs_retention_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the taskLogsRetentionConfig field is set.
   */
  boolean hasTaskLogsRetentionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The configuration settings for task logs retention
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.TaskLogsRetentionConfig task_logs_retention_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The taskLogsRetentionConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.TaskLogsRetentionConfig
      getTaskLogsRetentionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The configuration settings for task logs retention
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.TaskLogsRetentionConfig task_logs_retention_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.TaskLogsRetentionConfigOrBuilder
      getTaskLogsRetentionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The retention policy for airflow metadata database.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.AirflowMetadataRetentionPolicyConfig airflow_metadata_retention_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the airflowMetadataRetentionConfig field is set.
   */
  boolean hasAirflowMetadataRetentionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The retention policy for airflow metadata database.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.AirflowMetadataRetentionPolicyConfig airflow_metadata_retention_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The airflowMetadataRetentionConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.AirflowMetadataRetentionPolicyConfig
      getAirflowMetadataRetentionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The retention policy for airflow metadata database.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.AirflowMetadataRetentionPolicyConfig airflow_metadata_retention_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1
          .AirflowMetadataRetentionPolicyConfigOrBuilder
      getAirflowMetadataRetentionConfigOrBuilder();
}
