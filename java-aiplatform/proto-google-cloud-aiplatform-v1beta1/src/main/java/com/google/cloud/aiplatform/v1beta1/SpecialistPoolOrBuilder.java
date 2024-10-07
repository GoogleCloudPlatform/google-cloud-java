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
// source: google/cloud/aiplatform/v1beta1/specialist_pool.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface SpecialistPoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SpecialistPool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the SpecialistPool.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the SpecialistPool.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The user-defined name of the SpecialistPool.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * This field should be unique on project-level.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The user-defined name of the SpecialistPool.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * This field should be unique on project-level.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The number of managers in this SpecialistPool.
   * </pre>
   *
   * <code>int32 specialist_managers_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The specialistManagersCount.
   */
  int getSpecialistManagersCount();

  /**
   *
   *
   * <pre>
   * The email addresses of the managers in the SpecialistPool.
   * </pre>
   *
   * <code>repeated string specialist_manager_emails = 4;</code>
   *
   * @return A list containing the specialistManagerEmails.
   */
  java.util.List<java.lang.String> getSpecialistManagerEmailsList();
  /**
   *
   *
   * <pre>
   * The email addresses of the managers in the SpecialistPool.
   * </pre>
   *
   * <code>repeated string specialist_manager_emails = 4;</code>
   *
   * @return The count of specialistManagerEmails.
   */
  int getSpecialistManagerEmailsCount();
  /**
   *
   *
   * <pre>
   * The email addresses of the managers in the SpecialistPool.
   * </pre>
   *
   * <code>repeated string specialist_manager_emails = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The specialistManagerEmails at the given index.
   */
  java.lang.String getSpecialistManagerEmails(int index);
  /**
   *
   *
   * <pre>
   * The email addresses of the managers in the SpecialistPool.
   * </pre>
   *
   * <code>repeated string specialist_manager_emails = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the specialistManagerEmails at the given index.
   */
  com.google.protobuf.ByteString getSpecialistManagerEmailsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the pending data labeling jobs.
   * </pre>
   *
   * <code>
   * repeated string pending_data_labeling_jobs = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the pendingDataLabelingJobs.
   */
  java.util.List<java.lang.String> getPendingDataLabelingJobsList();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the pending data labeling jobs.
   * </pre>
   *
   * <code>
   * repeated string pending_data_labeling_jobs = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of pendingDataLabelingJobs.
   */
  int getPendingDataLabelingJobsCount();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the pending data labeling jobs.
   * </pre>
   *
   * <code>
   * repeated string pending_data_labeling_jobs = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The pendingDataLabelingJobs at the given index.
   */
  java.lang.String getPendingDataLabelingJobs(int index);
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the pending data labeling jobs.
   * </pre>
   *
   * <code>
   * repeated string pending_data_labeling_jobs = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the pendingDataLabelingJobs at the given index.
   */
  com.google.protobuf.ByteString getPendingDataLabelingJobsBytes(int index);

  /**
   *
   *
   * <pre>
   * The email addresses of workers in the SpecialistPool.
   * </pre>
   *
   * <code>repeated string specialist_worker_emails = 7;</code>
   *
   * @return A list containing the specialistWorkerEmails.
   */
  java.util.List<java.lang.String> getSpecialistWorkerEmailsList();
  /**
   *
   *
   * <pre>
   * The email addresses of workers in the SpecialistPool.
   * </pre>
   *
   * <code>repeated string specialist_worker_emails = 7;</code>
   *
   * @return The count of specialistWorkerEmails.
   */
  int getSpecialistWorkerEmailsCount();
  /**
   *
   *
   * <pre>
   * The email addresses of workers in the SpecialistPool.
   * </pre>
   *
   * <code>repeated string specialist_worker_emails = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The specialistWorkerEmails at the given index.
   */
  java.lang.String getSpecialistWorkerEmails(int index);
  /**
   *
   *
   * <pre>
   * The email addresses of workers in the SpecialistPool.
   * </pre>
   *
   * <code>repeated string specialist_worker_emails = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the specialistWorkerEmails at the given index.
   */
  com.google.protobuf.ByteString getSpecialistWorkerEmailsBytes(int index);
}
