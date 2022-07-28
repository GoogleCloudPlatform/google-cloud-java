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
// source: google/dataflow/v1beta3/streaming.proto

package com.google.dataflow.v1beta3;

public interface StreamingComputationRangesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.StreamingComputationRanges)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ID of the computation.
   * </pre>
   *
   * <code>string computation_id = 1;</code>
   *
   * @return The computationId.
   */
  java.lang.String getComputationId();
  /**
   *
   *
   * <pre>
   * The ID of the computation.
   * </pre>
   *
   * <code>string computation_id = 1;</code>
   *
   * @return The bytes for computationId.
   */
  com.google.protobuf.ByteString getComputationIdBytes();

  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  java.util.List<com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment> getRangeAssignmentsList();
  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment getRangeAssignments(int index);
  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  int getRangeAssignmentsCount();
  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder>
      getRangeAssignmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder getRangeAssignmentsOrBuilder(
      int index);
}
