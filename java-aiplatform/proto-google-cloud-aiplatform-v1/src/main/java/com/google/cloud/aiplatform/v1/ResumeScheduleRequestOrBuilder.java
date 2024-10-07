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
// source: google/cloud/aiplatform/v1/schedule_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface ResumeScheduleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ResumeScheduleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Schedule resource to be resumed.
   * Format:
   * `projects/{project}/locations/{location}/schedules/{schedule}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the Schedule resource to be resumed.
   * Format:
   * `projects/{project}/locations/{location}/schedules/{schedule}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Whether to backfill missed runs when the schedule is resumed from
   * PAUSED state. If set to true, all missed runs will be scheduled. New runs
   * will be scheduled after the backfill is complete. This will also update
   * [Schedule.catch_up][google.cloud.aiplatform.v1.Schedule.catch_up] field.
   * Default to false.
   * </pre>
   *
   * <code>bool catch_up = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The catchUp.
   */
  boolean getCatchUp();
}
