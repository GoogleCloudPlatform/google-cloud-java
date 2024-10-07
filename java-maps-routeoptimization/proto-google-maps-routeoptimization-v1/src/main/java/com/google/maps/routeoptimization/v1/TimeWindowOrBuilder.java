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
// source: google/maps/routeoptimization/v1/route_optimization_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.routeoptimization.v1;

public interface TimeWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routeoptimization.v1.TimeWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The hard time window start time. If unspecified it will be set to
   * `ShipmentModel.global_start_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The hard time window start time. If unspecified it will be set to
   * `ShipmentModel.global_start_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The hard time window start time. If unspecified it will be set to
   * `ShipmentModel.global_start_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The hard time window end time. If unspecified it will be set to
   * `ShipmentModel.global_end_time`.
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
   * The hard time window end time. If unspecified it will be set to
   * `ShipmentModel.global_end_time`.
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
   * The hard time window end time. If unspecified it will be set to
   * `ShipmentModel.global_end_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The soft start time of the time window.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp soft_start_time = 3;</code>
   *
   * @return Whether the softStartTime field is set.
   */
  boolean hasSoftStartTime();
  /**
   *
   *
   * <pre>
   * The soft start time of the time window.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp soft_start_time = 3;</code>
   *
   * @return The softStartTime.
   */
  com.google.protobuf.Timestamp getSoftStartTime();
  /**
   *
   *
   * <pre>
   * The soft start time of the time window.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp soft_start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSoftStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The soft end time of the time window.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp soft_end_time = 4;</code>
   *
   * @return Whether the softEndTime field is set.
   */
  boolean hasSoftEndTime();
  /**
   *
   *
   * <pre>
   * The soft end time of the time window.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp soft_end_time = 4;</code>
   *
   * @return The softEndTime.
   */
  com.google.protobuf.Timestamp getSoftEndTime();
  /**
   *
   *
   * <pre>
   * The soft end time of the time window.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp soft_end_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSoftEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A cost per hour added to other costs in the model if the event occurs
   * before soft_start_time, computed as:
   *
   * ```
   *    max(0, soft_start_time - t.seconds)
   *                           * cost_per_hour_before_soft_start_time / 3600,
   * t being the time of the event.
   * ```
   *
   * This cost must be positive, and the field can only be set if
   * soft_start_time has been set.
   * </pre>
   *
   * <code>optional double cost_per_hour_before_soft_start_time = 5;</code>
   *
   * @return Whether the costPerHourBeforeSoftStartTime field is set.
   */
  boolean hasCostPerHourBeforeSoftStartTime();
  /**
   *
   *
   * <pre>
   * A cost per hour added to other costs in the model if the event occurs
   * before soft_start_time, computed as:
   *
   * ```
   *    max(0, soft_start_time - t.seconds)
   *                           * cost_per_hour_before_soft_start_time / 3600,
   * t being the time of the event.
   * ```
   *
   * This cost must be positive, and the field can only be set if
   * soft_start_time has been set.
   * </pre>
   *
   * <code>optional double cost_per_hour_before_soft_start_time = 5;</code>
   *
   * @return The costPerHourBeforeSoftStartTime.
   */
  double getCostPerHourBeforeSoftStartTime();

  /**
   *
   *
   * <pre>
   * A cost per hour added to other costs in the model if the event occurs after
   * `soft_end_time`, computed as:
   *
   * ```
   *    max(0, t.seconds - soft_end_time.seconds)
   *                     * cost_per_hour_after_soft_end_time / 3600,
   * t being the time of the event.
   * ```
   *
   * This cost must be positive, and the field can only be set if
   * `soft_end_time` has been set.
   * </pre>
   *
   * <code>optional double cost_per_hour_after_soft_end_time = 6;</code>
   *
   * @return Whether the costPerHourAfterSoftEndTime field is set.
   */
  boolean hasCostPerHourAfterSoftEndTime();
  /**
   *
   *
   * <pre>
   * A cost per hour added to other costs in the model if the event occurs after
   * `soft_end_time`, computed as:
   *
   * ```
   *    max(0, t.seconds - soft_end_time.seconds)
   *                     * cost_per_hour_after_soft_end_time / 3600,
   * t being the time of the event.
   * ```
   *
   * This cost must be positive, and the field can only be set if
   * `soft_end_time` has been set.
   * </pre>
   *
   * <code>optional double cost_per_hour_after_soft_end_time = 6;</code>
   *
   * @return The costPerHourAfterSoftEndTime.
   */
  double getCostPerHourAfterSoftEndTime();
}
