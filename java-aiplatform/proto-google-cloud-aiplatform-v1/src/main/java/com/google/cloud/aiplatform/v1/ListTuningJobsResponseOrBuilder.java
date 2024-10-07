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
// source: google/cloud/aiplatform/v1/genai_tuning_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface ListTuningJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListTuningJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of TuningJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TuningJob tuning_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.TuningJob> getTuningJobsList();
  /**
   *
   *
   * <pre>
   * List of TuningJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TuningJob tuning_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TuningJob getTuningJobs(int index);
  /**
   *
   *
   * <pre>
   * List of TuningJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TuningJob tuning_jobs = 1;</code>
   */
  int getTuningJobsCount();
  /**
   *
   *
   * <pre>
   * List of TuningJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TuningJob tuning_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TuningJobOrBuilder>
      getTuningJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of TuningJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TuningJob tuning_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TuningJobOrBuilder getTuningJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListTuningJobsRequest.page_token][google.cloud.aiplatform.v1.ListTuningJobsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListTuningJobsRequest.page_token][google.cloud.aiplatform.v1.ListTuningJobsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
