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
// source: google/cloud/dataplex/v1/logs.proto

package com.google.cloud.dataplex.v1;

public interface JobEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.JobEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The log message.
   * </pre>
   *
   * <code>string message = 1;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * The log message.
   * </pre>
   *
   * <code>string message = 1;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * The unique id identifying the job.
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
   * The unique id identifying the job.
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
   * The time when the job started running.
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
   * The time when the job started running.
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
   * The time when the job started running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the job ended running.
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
   * The time when the job ended running.
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
   * The time when the job ended running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The job state on completion.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.JobEvent.State state = 5;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The job state on completion.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.JobEvent.State state = 5;</code>
   *
   * @return The state.
   */
  com.google.cloud.dataplex.v1.JobEvent.State getState();

  /**
   *
   *
   * <pre>
   * The number of retries.
   * </pre>
   *
   * <code>int32 retries = 6;</code>
   *
   * @return The retries.
   */
  int getRetries();

  /**
   *
   *
   * <pre>
   * The type of the job.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.JobEvent.Type type = 7;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the job.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.JobEvent.Type type = 7;</code>
   *
   * @return The type.
   */
  com.google.cloud.dataplex.v1.JobEvent.Type getType();

  /**
   *
   *
   * <pre>
   * The service used to execute the job.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.JobEvent.Service service = 8;</code>
   *
   * @return The enum numeric value on the wire for service.
   */
  int getServiceValue();
  /**
   *
   *
   * <pre>
   * The service used to execute the job.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.JobEvent.Service service = 8;</code>
   *
   * @return The service.
   */
  com.google.cloud.dataplex.v1.JobEvent.Service getService();

  /**
   *
   *
   * <pre>
   * The reference to the job within the service.
   * </pre>
   *
   * <code>string service_job = 9;</code>
   *
   * @return The serviceJob.
   */
  java.lang.String getServiceJob();
  /**
   *
   *
   * <pre>
   * The reference to the job within the service.
   * </pre>
   *
   * <code>string service_job = 9;</code>
   *
   * @return The bytes for serviceJob.
   */
  com.google.protobuf.ByteString getServiceJobBytes();
}
