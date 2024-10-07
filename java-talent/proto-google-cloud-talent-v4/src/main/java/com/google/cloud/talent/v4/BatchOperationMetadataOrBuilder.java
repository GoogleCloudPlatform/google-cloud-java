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
// source: google/cloud/talent/v4/common.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.talent.v4;

public interface BatchOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.BatchOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The state of a long running operation.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.BatchOperationMetadata.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of a long running operation.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.BatchOperationMetadata.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.talent.v4.BatchOperationMetadata.State getState();

  /**
   *
   *
   * <pre>
   * More detailed information about operation state.
   * </pre>
   *
   * <code>string state_description = 2;</code>
   *
   * @return The stateDescription.
   */
  java.lang.String getStateDescription();
  /**
   *
   *
   * <pre>
   * More detailed information about operation state.
   * </pre>
   *
   * <code>string state_description = 2;</code>
   *
   * @return The bytes for stateDescription.
   */
  com.google.protobuf.ByteString getStateDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Count of successful item(s) inside an operation.
   * </pre>
   *
   * <code>int32 success_count = 3;</code>
   *
   * @return The successCount.
   */
  int getSuccessCount();

  /**
   *
   *
   * <pre>
   * Count of failed item(s) inside an operation.
   * </pre>
   *
   * <code>int32 failure_count = 4;</code>
   *
   * @return The failureCount.
   */
  int getFailureCount();

  /**
   *
   *
   * <pre>
   * Count of total item(s) inside an operation.
   * </pre>
   *
   * <code>int32 total_count = 5;</code>
   *
   * @return The totalCount.
   */
  int getTotalCount();

  /**
   *
   *
   * <pre>
   * The time when the batch operation is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time when the batch operation is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time when the batch operation is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the batch operation status is updated. The metadata and the
   * [update_time][google.cloud.talent.v4.BatchOperationMetadata.update_time] is
   * refreshed every minute otherwise cached data is returned.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The time when the batch operation status is updated. The metadata and the
   * [update_time][google.cloud.talent.v4.BatchOperationMetadata.update_time] is
   * refreshed every minute otherwise cached data is returned.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The time when the batch operation status is updated. The metadata and the
   * [update_time][google.cloud.talent.v4.BatchOperationMetadata.update_time] is
   * refreshed every minute otherwise cached data is returned.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the batch operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to `true`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time when the batch operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to `true`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time when the batch operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to `true`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
