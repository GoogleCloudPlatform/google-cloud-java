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
// source: google/cloud/automl/v1beta1/data_stats.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1beta1;

public interface ArrayStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ArrayStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Stats of all the values of all arrays, as if they were a single long
   * series of data. The type depends on the element type of the array.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataStats member_stats = 2;</code>
   *
   * @return Whether the memberStats field is set.
   */
  boolean hasMemberStats();
  /**
   *
   *
   * <pre>
   * Stats of all the values of all arrays, as if they were a single long
   * series of data. The type depends on the element type of the array.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataStats member_stats = 2;</code>
   *
   * @return The memberStats.
   */
  com.google.cloud.automl.v1beta1.DataStats getMemberStats();
  /**
   *
   *
   * <pre>
   * Stats of all the values of all arrays, as if they were a single long
   * series of data. The type depends on the element type of the array.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataStats member_stats = 2;</code>
   */
  com.google.cloud.automl.v1beta1.DataStatsOrBuilder getMemberStatsOrBuilder();
}
