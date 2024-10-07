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
// source: google/cloud/tasks/v2beta2/queue.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tasks.v2beta2;

public interface QueueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.Queue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Caller-specified and required in
   * [CreateQueue][google.cloud.tasks.v2beta2.CloudTasks.CreateQueue], after
   * which it becomes output only.
   *
   * The queue name.
   *
   * The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the queue's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Caller-specified and required in
   * [CreateQueue][google.cloud.tasks.v2beta2.CloudTasks.CreateQueue], after
   * which it becomes output only.
   *
   * The queue name.
   *
   * The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the queue's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * App Engine HTTP target.
   *
   * An App Engine queue is a queue that has an
   * [AppEngineHttpTarget][google.cloud.tasks.v2beta2.AppEngineHttpTarget].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineHttpTarget app_engine_http_target = 3;</code>
   *
   * @return Whether the appEngineHttpTarget field is set.
   */
  boolean hasAppEngineHttpTarget();
  /**
   *
   *
   * <pre>
   * App Engine HTTP target.
   *
   * An App Engine queue is a queue that has an
   * [AppEngineHttpTarget][google.cloud.tasks.v2beta2.AppEngineHttpTarget].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineHttpTarget app_engine_http_target = 3;</code>
   *
   * @return The appEngineHttpTarget.
   */
  com.google.cloud.tasks.v2beta2.AppEngineHttpTarget getAppEngineHttpTarget();
  /**
   *
   *
   * <pre>
   * App Engine HTTP target.
   *
   * An App Engine queue is a queue that has an
   * [AppEngineHttpTarget][google.cloud.tasks.v2beta2.AppEngineHttpTarget].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineHttpTarget app_engine_http_target = 3;</code>
   */
  com.google.cloud.tasks.v2beta2.AppEngineHttpTargetOrBuilder getAppEngineHttpTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * Pull target.
   *
   * A pull queue is a queue that has a
   * [PullTarget][google.cloud.tasks.v2beta2.PullTarget].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.PullTarget pull_target = 4;</code>
   *
   * @return Whether the pullTarget field is set.
   */
  boolean hasPullTarget();
  /**
   *
   *
   * <pre>
   * Pull target.
   *
   * A pull queue is a queue that has a
   * [PullTarget][google.cloud.tasks.v2beta2.PullTarget].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.PullTarget pull_target = 4;</code>
   *
   * @return The pullTarget.
   */
  com.google.cloud.tasks.v2beta2.PullTarget getPullTarget();
  /**
   *
   *
   * <pre>
   * Pull target.
   *
   * A pull queue is a queue that has a
   * [PullTarget][google.cloud.tasks.v2beta2.PullTarget].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.PullTarget pull_target = 4;</code>
   */
  com.google.cloud.tasks.v2beta2.PullTargetOrBuilder getPullTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * An http_target is used to override the target values for HTTP tasks.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.HttpTarget http_target = 17;</code>
   *
   * @return Whether the httpTarget field is set.
   */
  boolean hasHttpTarget();
  /**
   *
   *
   * <pre>
   * An http_target is used to override the target values for HTTP tasks.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.HttpTarget http_target = 17;</code>
   *
   * @return The httpTarget.
   */
  com.google.cloud.tasks.v2beta2.HttpTarget getHttpTarget();
  /**
   *
   *
   * <pre>
   * An http_target is used to override the target values for HTTP tasks.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.HttpTarget http_target = 17;</code>
   */
  com.google.cloud.tasks.v2beta2.HttpTargetOrBuilder getHttpTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * Rate limits for task dispatches.
   *
   * [rate_limits][google.cloud.tasks.v2beta2.Queue.rate_limits] and
   * [retry_config][google.cloud.tasks.v2beta2.Queue.retry_config] are related
   * because they both control task attempts however they control how tasks are
   * attempted in different ways:
   *
   * * [rate_limits][google.cloud.tasks.v2beta2.Queue.rate_limits] controls the
   * total rate of
   *   dispatches from a queue (i.e. all traffic dispatched from the
   *   queue, regardless of whether the dispatch is from a first
   *   attempt or a retry).
   * * [retry_config][google.cloud.tasks.v2beta2.Queue.retry_config] controls
   * what happens to
   *   particular a task after its first attempt fails. That is,
   *   [retry_config][google.cloud.tasks.v2beta2.Queue.retry_config] controls
   *   task retries (the second attempt, third attempt, etc).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.RateLimits rate_limits = 5;</code>
   *
   * @return Whether the rateLimits field is set.
   */
  boolean hasRateLimits();
  /**
   *
   *
   * <pre>
   * Rate limits for task dispatches.
   *
   * [rate_limits][google.cloud.tasks.v2beta2.Queue.rate_limits] and
   * [retry_config][google.cloud.tasks.v2beta2.Queue.retry_config] are related
   * because they both control task attempts however they control how tasks are
   * attempted in different ways:
   *
   * * [rate_limits][google.cloud.tasks.v2beta2.Queue.rate_limits] controls the
   * total rate of
   *   dispatches from a queue (i.e. all traffic dispatched from the
   *   queue, regardless of whether the dispatch is from a first
   *   attempt or a retry).
   * * [retry_config][google.cloud.tasks.v2beta2.Queue.retry_config] controls
   * what happens to
   *   particular a task after its first attempt fails. That is,
   *   [retry_config][google.cloud.tasks.v2beta2.Queue.retry_config] controls
   *   task retries (the second attempt, third attempt, etc).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.RateLimits rate_limits = 5;</code>
   *
   * @return The rateLimits.
   */
  com.google.cloud.tasks.v2beta2.RateLimits getRateLimits();
  /**
   *
   *
   * <pre>
   * Rate limits for task dispatches.
   *
   * [rate_limits][google.cloud.tasks.v2beta2.Queue.rate_limits] and
   * [retry_config][google.cloud.tasks.v2beta2.Queue.retry_config] are related
   * because they both control task attempts however they control how tasks are
   * attempted in different ways:
   *
   * * [rate_limits][google.cloud.tasks.v2beta2.Queue.rate_limits] controls the
   * total rate of
   *   dispatches from a queue (i.e. all traffic dispatched from the
   *   queue, regardless of whether the dispatch is from a first
   *   attempt or a retry).
   * * [retry_config][google.cloud.tasks.v2beta2.Queue.retry_config] controls
   * what happens to
   *   particular a task after its first attempt fails. That is,
   *   [retry_config][google.cloud.tasks.v2beta2.Queue.retry_config] controls
   *   task retries (the second attempt, third attempt, etc).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.RateLimits rate_limits = 5;</code>
   */
  com.google.cloud.tasks.v2beta2.RateLimitsOrBuilder getRateLimitsOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings that determine the retry behavior.
   *
   * * For tasks created using Cloud Tasks: the queue-level retry settings
   *   apply to all tasks in the queue that were created using Cloud Tasks.
   *   Retry settings cannot be set on individual tasks.
   * * For tasks created using the App Engine SDK: the queue-level retry
   *   settings apply to all tasks in the queue which do not have retry settings
   *   explicitly set on the task and were created by the App Engine SDK. See
   *   [App Engine
   *   documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.RetryConfig retry_config = 6;</code>
   *
   * @return Whether the retryConfig field is set.
   */
  boolean hasRetryConfig();
  /**
   *
   *
   * <pre>
   * Settings that determine the retry behavior.
   *
   * * For tasks created using Cloud Tasks: the queue-level retry settings
   *   apply to all tasks in the queue that were created using Cloud Tasks.
   *   Retry settings cannot be set on individual tasks.
   * * For tasks created using the App Engine SDK: the queue-level retry
   *   settings apply to all tasks in the queue which do not have retry settings
   *   explicitly set on the task and were created by the App Engine SDK. See
   *   [App Engine
   *   documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.RetryConfig retry_config = 6;</code>
   *
   * @return The retryConfig.
   */
  com.google.cloud.tasks.v2beta2.RetryConfig getRetryConfig();
  /**
   *
   *
   * <pre>
   * Settings that determine the retry behavior.
   *
   * * For tasks created using Cloud Tasks: the queue-level retry settings
   *   apply to all tasks in the queue that were created using Cloud Tasks.
   *   Retry settings cannot be set on individual tasks.
   * * For tasks created using the App Engine SDK: the queue-level retry
   *   settings apply to all tasks in the queue which do not have retry settings
   *   explicitly set on the task and were created by the App Engine SDK. See
   *   [App Engine
   *   documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.RetryConfig retry_config = 6;</code>
   */
  com.google.cloud.tasks.v2beta2.RetryConfigOrBuilder getRetryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of the queue.
   *
   * `state` can only be changed by called
   * [PauseQueue][google.cloud.tasks.v2beta2.CloudTasks.PauseQueue],
   * [ResumeQueue][google.cloud.tasks.v2beta2.CloudTasks.ResumeQueue], or
   * uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref).
   * [UpdateQueue][google.cloud.tasks.v2beta2.CloudTasks.UpdateQueue] cannot be
   * used to change `state`.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Queue.State state = 7;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the queue.
   *
   * `state` can only be changed by called
   * [PauseQueue][google.cloud.tasks.v2beta2.CloudTasks.PauseQueue],
   * [ResumeQueue][google.cloud.tasks.v2beta2.CloudTasks.ResumeQueue], or
   * uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref).
   * [UpdateQueue][google.cloud.tasks.v2beta2.CloudTasks.UpdateQueue] cannot be
   * used to change `state`.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Queue.State state = 7;</code>
   *
   * @return The state.
   */
  com.google.cloud.tasks.v2beta2.Queue.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The last time this queue was purged.
   *
   * All tasks that were [created][google.cloud.tasks.v2beta2.Task.create_time]
   * before this time were purged.
   *
   * A queue can be purged using
   * [PurgeQueue][google.cloud.tasks.v2beta2.CloudTasks.PurgeQueue], the [App
   * Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
   *
   * Purge time will be truncated to the nearest microsecond. Purge
   * time will be unset if the queue has never been purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp purge_time = 8;</code>
   *
   * @return Whether the purgeTime field is set.
   */
  boolean hasPurgeTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time this queue was purged.
   *
   * All tasks that were [created][google.cloud.tasks.v2beta2.Task.create_time]
   * before this time were purged.
   *
   * A queue can be purged using
   * [PurgeQueue][google.cloud.tasks.v2beta2.CloudTasks.PurgeQueue], the [App
   * Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
   *
   * Purge time will be truncated to the nearest microsecond. Purge
   * time will be unset if the queue has never been purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp purge_time = 8;</code>
   *
   * @return The purgeTime.
   */
  com.google.protobuf.Timestamp getPurgeTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time this queue was purged.
   *
   * All tasks that were [created][google.cloud.tasks.v2beta2.Task.create_time]
   * before this time were purged.
   *
   * A queue can be purged using
   * [PurgeQueue][google.cloud.tasks.v2beta2.CloudTasks.PurgeQueue], the [App
   * Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
   *
   * Purge time will be truncated to the nearest microsecond. Purge
   * time will be unset if the queue has never been purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp purge_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPurgeTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The maximum amount of time that a task will be retained in
   * this queue.
   *
   * Queues created by Cloud Tasks have a default `task_ttl` of 31 days.
   * After a task has lived for `task_ttl`, the task will be deleted
   * regardless of whether it was dispatched or not.
   *
   * The `task_ttl` for queues created via queue.yaml/xml is equal to the
   * maximum duration because there is a
   * [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for
   * these queues. To view the maximum valid duration, see the documentation for
   * [Duration][google.protobuf.Duration].
   * </pre>
   *
   * <code>.google.protobuf.Duration task_ttl = 9;</code>
   *
   * @return Whether the taskTtl field is set.
   */
  boolean hasTaskTtl();
  /**
   *
   *
   * <pre>
   * The maximum amount of time that a task will be retained in
   * this queue.
   *
   * Queues created by Cloud Tasks have a default `task_ttl` of 31 days.
   * After a task has lived for `task_ttl`, the task will be deleted
   * regardless of whether it was dispatched or not.
   *
   * The `task_ttl` for queues created via queue.yaml/xml is equal to the
   * maximum duration because there is a
   * [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for
   * these queues. To view the maximum valid duration, see the documentation for
   * [Duration][google.protobuf.Duration].
   * </pre>
   *
   * <code>.google.protobuf.Duration task_ttl = 9;</code>
   *
   * @return The taskTtl.
   */
  com.google.protobuf.Duration getTaskTtl();
  /**
   *
   *
   * <pre>
   * The maximum amount of time that a task will be retained in
   * this queue.
   *
   * Queues created by Cloud Tasks have a default `task_ttl` of 31 days.
   * After a task has lived for `task_ttl`, the task will be deleted
   * regardless of whether it was dispatched or not.
   *
   * The `task_ttl` for queues created via queue.yaml/xml is equal to the
   * maximum duration because there is a
   * [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for
   * these queues. To view the maximum valid duration, see the documentation for
   * [Duration][google.protobuf.Duration].
   * </pre>
   *
   * <code>.google.protobuf.Duration task_ttl = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getTaskTtlOrBuilder();

  /**
   *
   *
   * <pre>
   * The task tombstone time to live (TTL).
   *
   * After a task is deleted or completed, the task's tombstone is
   * retained for the length of time specified by `tombstone_ttl`.
   * The tombstone is used by task de-duplication; another task with the same
   * name can't be created until the tombstone has expired. For more information
   * about task de-duplication, see the documentation for
   * [CreateTaskRequest][google.cloud.tasks.v2beta2.CreateTaskRequest.task].
   *
   * Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration tombstone_ttl = 10;</code>
   *
   * @return Whether the tombstoneTtl field is set.
   */
  boolean hasTombstoneTtl();
  /**
   *
   *
   * <pre>
   * The task tombstone time to live (TTL).
   *
   * After a task is deleted or completed, the task's tombstone is
   * retained for the length of time specified by `tombstone_ttl`.
   * The tombstone is used by task de-duplication; another task with the same
   * name can't be created until the tombstone has expired. For more information
   * about task de-duplication, see the documentation for
   * [CreateTaskRequest][google.cloud.tasks.v2beta2.CreateTaskRequest.task].
   *
   * Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration tombstone_ttl = 10;</code>
   *
   * @return The tombstoneTtl.
   */
  com.google.protobuf.Duration getTombstoneTtl();
  /**
   *
   *
   * <pre>
   * The task tombstone time to live (TTL).
   *
   * After a task is deleted or completed, the task's tombstone is
   * retained for the length of time specified by `tombstone_ttl`.
   * The tombstone is used by task de-duplication; another task with the same
   * name can't be created until the tombstone has expired. For more information
   * about task de-duplication, see the documentation for
   * [CreateTaskRequest][google.cloud.tasks.v2beta2.CreateTaskRequest.task].
   *
   * Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration tombstone_ttl = 10;</code>
   */
  com.google.protobuf.DurationOrBuilder getTombstoneTtlOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The realtime, informational statistics for a queue. In order
   * to receive the statistics the caller should include this field in the
   * FieldMask.
   * </pre>
   *
   * <code>
   * .google.cloud.tasks.v2beta2.QueueStats stats = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   *
   *
   * <pre>
   * Output only. The realtime, informational statistics for a queue. In order
   * to receive the statistics the caller should include this field in the
   * FieldMask.
   * </pre>
   *
   * <code>
   * .google.cloud.tasks.v2beta2.QueueStats stats = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stats.
   */
  com.google.cloud.tasks.v2beta2.QueueStats getStats();
  /**
   *
   *
   * <pre>
   * Output only. The realtime, informational statistics for a queue. In order
   * to receive the statistics the caller should include this field in the
   * FieldMask.
   * </pre>
   *
   * <code>
   * .google.cloud.tasks.v2beta2.QueueStats stats = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.tasks.v2beta2.QueueStatsOrBuilder getStatsOrBuilder();

  com.google.cloud.tasks.v2beta2.Queue.TargetTypeCase getTargetTypeCase();
}
