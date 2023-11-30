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

public interface DeleteJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.DeleteJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The job name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The job name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * This field is used to manage the legacy App Engine Cron jobs using the
   * Cloud Scheduler API. If the field is set to true, the job in the __cron
   * queue with the corresponding name will be deleted instead.
   * </pre>
   *
   * <code>bool legacy_app_engine_cron = 2;</code>
   *
   * @return The legacyAppEngineCron.
   */
  boolean getLegacyAppEngineCron();
}
