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
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

public interface CpuUtilizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.CpuUtilization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Period of time over which CPU utilization is calculated.
   * </pre>
   *
   * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
   *
   * @return Whether the aggregationWindowLength field is set.
   */
  boolean hasAggregationWindowLength();
  /**
   *
   *
   * <pre>
   * Period of time over which CPU utilization is calculated.
   * </pre>
   *
   * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
   *
   * @return The aggregationWindowLength.
   */
  com.google.protobuf.Duration getAggregationWindowLength();
  /**
   *
   *
   * <pre>
   * Period of time over which CPU utilization is calculated.
   * </pre>
   *
   * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getAggregationWindowLengthOrBuilder();

  /**
   *
   *
   * <pre>
   * Target CPU utilization ratio to maintain when scaling. Must be between 0
   * and 1.
   * </pre>
   *
   * <code>double target_utilization = 2;</code>
   *
   * @return The targetUtilization.
   */
  double getTargetUtilization();
}
