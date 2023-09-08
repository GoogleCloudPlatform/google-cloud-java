/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/scheduler/v1beta1/cloudscheduler.proto

package com.google.cloud.scheduler.v1beta1;

public interface UpdateJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.UpdateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The new job properties.
   * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
   *
   * Output only fields cannot be modified using UpdateJob.
   * Any value specified for an output only field will be ignored.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   *
   *
   * <pre>
   * Required. The new job properties.
   * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
   *
   * Output only fields cannot be modified using UpdateJob.
   * Any value specified for an output only field will be ignored.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The job.
   */
  com.google.cloud.scheduler.v1beta1.Job getJob();
  /**
   *
   *
   * <pre>
   * Required. The new job properties.
   * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
   *
   * Output only fields cannot be modified using UpdateJob.
   * Any value specified for an output only field will be ignored.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.scheduler.v1beta1.JobOrBuilder getJobOrBuilder();

  /**
   *
   *
   * <pre>
   * A  mask used to specify which fields of the job are being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * A  mask used to specify which fields of the job are being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * A  mask used to specify which fields of the job are being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
