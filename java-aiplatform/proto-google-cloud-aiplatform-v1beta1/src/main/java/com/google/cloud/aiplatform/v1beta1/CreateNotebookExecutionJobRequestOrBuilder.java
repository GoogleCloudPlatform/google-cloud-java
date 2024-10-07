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
// source: google/cloud/aiplatform/v1beta1/notebook_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface CreateNotebookExecutionJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateNotebookExecutionJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the
   * NotebookExecutionJob. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the
   * NotebookExecutionJob. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The NotebookExecutionJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookExecutionJob notebook_execution_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the notebookExecutionJob field is set.
   */
  boolean hasNotebookExecutionJob();
  /**
   *
   *
   * <pre>
   * Required. The NotebookExecutionJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookExecutionJob notebook_execution_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The notebookExecutionJob.
   */
  com.google.cloud.aiplatform.v1beta1.NotebookExecutionJob getNotebookExecutionJob();
  /**
   *
   *
   * <pre>
   * Required. The NotebookExecutionJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookExecutionJob notebook_execution_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.NotebookExecutionJobOrBuilder
      getNotebookExecutionJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. User specified ID for the NotebookExecutionJob.
   * </pre>
   *
   * <code>string notebook_execution_job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The notebookExecutionJobId.
   */
  java.lang.String getNotebookExecutionJobId();
  /**
   *
   *
   * <pre>
   * Optional. User specified ID for the NotebookExecutionJob.
   * </pre>
   *
   * <code>string notebook_execution_job_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for notebookExecutionJobId.
   */
  com.google.protobuf.ByteString getNotebookExecutionJobIdBytes();
}
