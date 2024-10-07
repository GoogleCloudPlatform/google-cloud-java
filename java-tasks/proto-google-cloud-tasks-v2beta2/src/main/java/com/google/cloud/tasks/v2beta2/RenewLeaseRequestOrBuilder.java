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
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tasks.v2beta2;

public interface RenewLeaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.RenewLeaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
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
   * Required. The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
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
   * Required. The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
   * This restriction is to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the scheduleTime field is set.
   */
  boolean hasScheduleTime();
  /**
   *
   *
   * <pre>
   * Required. The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
   * This restriction is to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The scheduleTime.
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   *
   *
   * <pre>
   * Required. The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
   * This restriction is to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The desired new lease duration, starting from now.
   *
   *
   * The maximum lease duration is 1 week.
   * `lease_duration` will be truncated to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Duration lease_duration = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the leaseDuration field is set.
   */
  boolean hasLeaseDuration();
  /**
   *
   *
   * <pre>
   * Required. The desired new lease duration, starting from now.
   *
   *
   * The maximum lease duration is 1 week.
   * `lease_duration` will be truncated to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Duration lease_duration = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The leaseDuration.
   */
  com.google.protobuf.Duration getLeaseDuration();
  /**
   *
   *
   * <pre>
   * Required. The desired new lease duration, starting from now.
   *
   *
   * The maximum lease duration is 1 week.
   * `lease_duration` will be truncated to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Duration lease_duration = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getLeaseDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
   *
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   *
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 4;</code>
   *
   * @return The enum numeric value on the wire for responseView.
   */
  int getResponseViewValue();
  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
   *
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   *
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 4;</code>
   *
   * @return The responseView.
   */
  com.google.cloud.tasks.v2beta2.Task.View getResponseView();
}
