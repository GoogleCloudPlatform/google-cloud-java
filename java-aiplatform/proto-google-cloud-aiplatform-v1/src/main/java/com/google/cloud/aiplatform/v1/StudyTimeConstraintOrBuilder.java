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
// source: google/cloud/aiplatform/v1/study.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface StudyTimeConstraintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.StudyTimeConstraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Counts the wallclock time passed since the creation of this Study.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_duration = 1;</code>
   *
   * @return Whether the maxDuration field is set.
   */
  boolean hasMaxDuration();
  /**
   *
   *
   * <pre>
   * Counts the wallclock time passed since the creation of this Study.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_duration = 1;</code>
   *
   * @return The maxDuration.
   */
  com.google.protobuf.Duration getMaxDuration();
  /**
   *
   *
   * <pre>
   * Counts the wallclock time passed since the creation of this Study.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_duration = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Compares the wallclock time to this time. Must use UTC timezone.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Compares the wallclock time to this time. Must use UTC timezone.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Compares the wallclock time to this time. Must use UTC timezone.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  com.google.cloud.aiplatform.v1.StudyTimeConstraint.ConstraintCase getConstraintCase();
}
