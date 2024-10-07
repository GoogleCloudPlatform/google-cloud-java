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
// source: google/cloud/talent/v4/job_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.talent.v4;

public interface BatchUpdateJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.BatchUpdateJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  java.util.List<com.google.cloud.talent.v4.JobResult> getJobResultsList();
  /**
   *
   *
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  com.google.cloud.talent.v4.JobResult getJobResults(int index);
  /**
   *
   *
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  int getJobResultsCount();
  /**
   *
   *
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4.JobResultOrBuilder>
      getJobResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  com.google.cloud.talent.v4.JobResultOrBuilder getJobResultsOrBuilder(int index);
}
