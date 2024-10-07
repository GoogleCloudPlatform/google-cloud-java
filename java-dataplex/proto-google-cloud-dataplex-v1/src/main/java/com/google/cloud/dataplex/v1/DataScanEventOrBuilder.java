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
// source: google/cloud/dataplex/v1/logs.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

public interface DataScanEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DataScanEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The data source of the data scan
   * </pre>
   *
   * <code>string data_source = 1;</code>
   *
   * @return The dataSource.
   */
  java.lang.String getDataSource();
  /**
   *
   *
   * <pre>
   * The data source of the data scan
   * </pre>
   *
   * <code>string data_source = 1;</code>
   *
   * @return The bytes for dataSource.
   */
  com.google.protobuf.ByteString getDataSourceBytes();

  /**
   *
   *
   * <pre>
   * The identifier of the specific data scan job this log entry is for.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   *
   *
   * <pre>
   * The identifier of the specific data scan job this log entry is for.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString getJobIdBytes();

  /**
   *
   *
   * <pre>
   * The time when the data scan job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 12;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time when the data scan job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 12;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time when the data scan job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 12;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the data scan job started to run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The time when the data scan job started to run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The time when the data scan job started to run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the data scan job finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time when the data scan job finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time when the data scan job finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The type of the data scan.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.ScanType type = 5;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the data scan.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.ScanType type = 5;</code>
   *
   * @return The type.
   */
  com.google.cloud.dataplex.v1.DataScanEvent.ScanType getType();

  /**
   *
   *
   * <pre>
   * The status of the data scan job.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.State state = 6;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The status of the data scan job.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.State state = 6;</code>
   *
   * @return The state.
   */
  com.google.cloud.dataplex.v1.DataScanEvent.State getState();

  /**
   *
   *
   * <pre>
   * The message describing the data scan job event.
   * </pre>
   *
   * <code>string message = 7;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * The message describing the data scan job event.
   * </pre>
   *
   * <code>string message = 7;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * A version identifier of the spec which was used to execute this job.
   * </pre>
   *
   * <code>string spec_version = 8;</code>
   *
   * @return The specVersion.
   */
  java.lang.String getSpecVersion();
  /**
   *
   *
   * <pre>
   * A version identifier of the spec which was used to execute this job.
   * </pre>
   *
   * <code>string spec_version = 8;</code>
   *
   * @return The bytes for specVersion.
   */
  com.google.protobuf.ByteString getSpecVersionBytes();

  /**
   *
   *
   * <pre>
   * The trigger type of the data scan job.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.Trigger trigger = 9;</code>
   *
   * @return The enum numeric value on the wire for trigger.
   */
  int getTriggerValue();
  /**
   *
   *
   * <pre>
   * The trigger type of the data scan job.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.Trigger trigger = 9;</code>
   *
   * @return The trigger.
   */
  com.google.cloud.dataplex.v1.DataScanEvent.Trigger getTrigger();

  /**
   *
   *
   * <pre>
   * The scope of the data scan (e.g. full, incremental).
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.Scope scope = 10;</code>
   *
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();
  /**
   *
   *
   * <pre>
   * The scope of the data scan (e.g. full, incremental).
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.Scope scope = 10;</code>
   *
   * @return The scope.
   */
  com.google.cloud.dataplex.v1.DataScanEvent.Scope getScope();

  /**
   *
   *
   * <pre>
   * Data profile result for data profile type data scan.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.DataProfileResult data_profile = 101;</code>
   *
   * @return Whether the dataProfile field is set.
   */
  boolean hasDataProfile();
  /**
   *
   *
   * <pre>
   * Data profile result for data profile type data scan.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.DataProfileResult data_profile = 101;</code>
   *
   * @return The dataProfile.
   */
  com.google.cloud.dataplex.v1.DataScanEvent.DataProfileResult getDataProfile();
  /**
   *
   *
   * <pre>
   * Data profile result for data profile type data scan.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.DataProfileResult data_profile = 101;</code>
   */
  com.google.cloud.dataplex.v1.DataScanEvent.DataProfileResultOrBuilder getDataProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * Data quality result for data quality type data scan.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.DataQualityResult data_quality = 102;</code>
   *
   * @return Whether the dataQuality field is set.
   */
  boolean hasDataQuality();
  /**
   *
   *
   * <pre>
   * Data quality result for data quality type data scan.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.DataQualityResult data_quality = 102;</code>
   *
   * @return The dataQuality.
   */
  com.google.cloud.dataplex.v1.DataScanEvent.DataQualityResult getDataQuality();
  /**
   *
   *
   * <pre>
   * Data quality result for data quality type data scan.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanEvent.DataQualityResult data_quality = 102;</code>
   */
  com.google.cloud.dataplex.v1.DataScanEvent.DataQualityResultOrBuilder getDataQualityOrBuilder();

  /**
   *
   *
   * <pre>
   * Applied configs for data profile type data scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanEvent.DataProfileAppliedConfigs data_profile_configs = 201;
   * </code>
   *
   * @return Whether the dataProfileConfigs field is set.
   */
  boolean hasDataProfileConfigs();
  /**
   *
   *
   * <pre>
   * Applied configs for data profile type data scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanEvent.DataProfileAppliedConfigs data_profile_configs = 201;
   * </code>
   *
   * @return The dataProfileConfigs.
   */
  com.google.cloud.dataplex.v1.DataScanEvent.DataProfileAppliedConfigs getDataProfileConfigs();
  /**
   *
   *
   * <pre>
   * Applied configs for data profile type data scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanEvent.DataProfileAppliedConfigs data_profile_configs = 201;
   * </code>
   */
  com.google.cloud.dataplex.v1.DataScanEvent.DataProfileAppliedConfigsOrBuilder
      getDataProfileConfigsOrBuilder();

  /**
   *
   *
   * <pre>
   * Applied configs for data quality type data scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanEvent.DataQualityAppliedConfigs data_quality_configs = 202;
   * </code>
   *
   * @return Whether the dataQualityConfigs field is set.
   */
  boolean hasDataQualityConfigs();
  /**
   *
   *
   * <pre>
   * Applied configs for data quality type data scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanEvent.DataQualityAppliedConfigs data_quality_configs = 202;
   * </code>
   *
   * @return The dataQualityConfigs.
   */
  com.google.cloud.dataplex.v1.DataScanEvent.DataQualityAppliedConfigs getDataQualityConfigs();
  /**
   *
   *
   * <pre>
   * Applied configs for data quality type data scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanEvent.DataQualityAppliedConfigs data_quality_configs = 202;
   * </code>
   */
  com.google.cloud.dataplex.v1.DataScanEvent.DataQualityAppliedConfigsOrBuilder
      getDataQualityConfigsOrBuilder();

  /**
   *
   *
   * <pre>
   * The result of post scan actions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanEvent.PostScanActionsResult post_scan_actions_result = 11;
   * </code>
   *
   * @return Whether the postScanActionsResult field is set.
   */
  boolean hasPostScanActionsResult();
  /**
   *
   *
   * <pre>
   * The result of post scan actions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanEvent.PostScanActionsResult post_scan_actions_result = 11;
   * </code>
   *
   * @return The postScanActionsResult.
   */
  com.google.cloud.dataplex.v1.DataScanEvent.PostScanActionsResult getPostScanActionsResult();
  /**
   *
   *
   * <pre>
   * The result of post scan actions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanEvent.PostScanActionsResult post_scan_actions_result = 11;
   * </code>
   */
  com.google.cloud.dataplex.v1.DataScanEvent.PostScanActionsResultOrBuilder
      getPostScanActionsResultOrBuilder();

  com.google.cloud.dataplex.v1.DataScanEvent.ResultCase getResultCase();

  com.google.cloud.dataplex.v1.DataScanEvent.AppliedConfigsCase getAppliedConfigsCase();
}
