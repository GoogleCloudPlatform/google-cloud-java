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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orchestration.airflow.service.v1;

public interface ScheduledSnapshotsConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Whether scheduled snapshots creation is enabled.
   * </pre>
   *
   * <code>bool enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage location for storing automatically created
   * snapshots.
   * </pre>
   *
   * <code>string snapshot_location = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The snapshotLocation.
   */
  java.lang.String getSnapshotLocation();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage location for storing automatically created
   * snapshots.
   * </pre>
   *
   * <code>string snapshot_location = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for snapshotLocation.
   */
  com.google.protobuf.ByteString getSnapshotLocationBytes();

  /**
   *
   *
   * <pre>
   * Optional. The cron expression representing the time when snapshots creation
   * mechanism runs. This field is subject to additional validation around
   * frequency of execution.
   * </pre>
   *
   * <code>string snapshot_creation_schedule = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The snapshotCreationSchedule.
   */
  java.lang.String getSnapshotCreationSchedule();
  /**
   *
   *
   * <pre>
   * Optional. The cron expression representing the time when snapshots creation
   * mechanism runs. This field is subject to additional validation around
   * frequency of execution.
   * </pre>
   *
   * <code>string snapshot_creation_schedule = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for snapshotCreationSchedule.
   */
  com.google.protobuf.ByteString getSnapshotCreationScheduleBytes();

  /**
   *
   *
   * <pre>
   * Optional. Time zone that sets the context to interpret
   * snapshot_creation_schedule.
   * </pre>
   *
   * <code>string time_zone = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Optional. Time zone that sets the context to interpret
   * snapshot_creation_schedule.
   * </pre>
   *
   * <code>string time_zone = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();
}
