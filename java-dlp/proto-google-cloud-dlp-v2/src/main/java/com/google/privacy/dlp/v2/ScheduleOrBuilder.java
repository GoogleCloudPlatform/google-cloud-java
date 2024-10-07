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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface ScheduleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.Schedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * With this option a job is started on a regular periodic basis. For
   * example: every day (86400 seconds).
   *
   * A scheduled start time will be skipped if the previous
   * execution has not ended when its scheduled time occurs.
   *
   * This value must be set to a time duration greater than or equal
   * to 1 day and can be no longer than 60 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
   *
   * @return Whether the recurrencePeriodDuration field is set.
   */
  boolean hasRecurrencePeriodDuration();
  /**
   *
   *
   * <pre>
   * With this option a job is started on a regular periodic basis. For
   * example: every day (86400 seconds).
   *
   * A scheduled start time will be skipped if the previous
   * execution has not ended when its scheduled time occurs.
   *
   * This value must be set to a time duration greater than or equal
   * to 1 day and can be no longer than 60 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
   *
   * @return The recurrencePeriodDuration.
   */
  com.google.protobuf.Duration getRecurrencePeriodDuration();
  /**
   *
   *
   * <pre>
   * With this option a job is started on a regular periodic basis. For
   * example: every day (86400 seconds).
   *
   * A scheduled start time will be skipped if the previous
   * execution has not ended when its scheduled time occurs.
   *
   * This value must be set to a time duration greater than or equal
   * to 1 day and can be no longer than 60 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getRecurrencePeriodDurationOrBuilder();

  com.google.privacy.dlp.v2.Schedule.OptionCase getOptionCase();
}
