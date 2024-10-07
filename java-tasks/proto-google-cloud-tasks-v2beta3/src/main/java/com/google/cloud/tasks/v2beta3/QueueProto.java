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
// source: google/cloud/tasks/v2beta3/queue.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tasks.v2beta3;

public final class QueueProto {
  private QueueProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_Queue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_Queue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_RateLimits_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_RateLimits_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_RetryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_RetryConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_StackdriverLoggingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_StackdriverLoggingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_QueueStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_QueueStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/tasks/v2beta3/queue.proto"
          + "\022\032google.cloud.tasks.v2beta3\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032\'google/cloud/tasks/v2beta3/tar"
          + "get.proto\032\036google/protobuf/duration.prot"
          + "o\032\037google/protobuf/timestamp.proto\"\234\007\n\005Q"
          + "ueue\022\014\n\004name\030\001 \001(\t\022O\n\025app_engine_http_qu"
          + "eue\030\003 \001(\0132..google.cloud.tasks.v2beta3.A"
          + "ppEngineHttpQueueH\000\022;\n\013http_target\030\r \001(\013"
          + "2&.google.cloud.tasks.v2beta3.HttpTarget"
          + "\022;\n\013rate_limits\030\004 \001(\0132&.google.cloud.tas"
          + "ks.v2beta3.RateLimits\022=\n\014retry_config\030\005 "
          + "\001(\0132\'.google.cloud.tasks.v2beta3.RetryCo"
          + "nfig\0226\n\005state\030\006 \001(\0162\'.google.cloud.tasks"
          + ".v2beta3.Queue.State\022.\n\npurge_time\030\007 \001(\013"
          + "2\032.google.protobuf.Timestamp\022+\n\010task_ttl"
          + "\030\010 \001(\0132\031.google.protobuf.Duration\0220\n\rtom"
          + "bstone_ttl\030\t \001(\0132\031.google.protobuf.Durat"
          + "ion\022X\n\032stackdriver_logging_config\030\n \001(\0132"
          + "4.google.cloud.tasks.v2beta3.Stackdriver"
          + "LoggingConfig\0229\n\004type\030\013 \001(\0162&.google.clo"
          + "ud.tasks.v2beta3.Queue.TypeB\003\340A\005\022:\n\005stat"
          + "s\030\014 \001(\0132&.google.cloud.tasks.v2beta3.Que"
          + "ueStatsB\003\340A\003\"E\n\005State\022\025\n\021STATE_UNSPECIFI"
          + "ED\020\000\022\013\n\007RUNNING\020\001\022\n\n\006PAUSED\020\002\022\014\n\010DISABLE"
          + "D\020\003\"0\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\010\n\004PUL"
          + "L\020\001\022\010\n\004PUSH\020\002:\\\352AY\n\037cloudtasks.googleapi"
          + "s.com/Queue\0226projects/{project}/location"
          + "s/{location}/queues/{queue}B\014\n\nqueue_typ"
          + "e\"j\n\nRateLimits\022!\n\031max_dispatches_per_se"
          + "cond\030\001 \001(\001\022\026\n\016max_burst_size\030\002 \001(\005\022!\n\031ma"
          + "x_concurrent_dispatches\030\003 \001(\005\"\321\001\n\013RetryC"
          + "onfig\022\024\n\014max_attempts\030\001 \001(\005\0225\n\022max_retry"
          + "_duration\030\002 \001(\0132\031.google.protobuf.Durati"
          + "on\022.\n\013min_backoff\030\003 \001(\0132\031.google.protobu"
          + "f.Duration\022.\n\013max_backoff\030\004 \001(\0132\031.google"
          + ".protobuf.Duration\022\025\n\rmax_doublings\030\005 \001("
          + "\005\"2\n\030StackdriverLoggingConfig\022\026\n\016samplin"
          + "g_ratio\030\001 \001(\001\"\350\001\n\nQueueStats\022\030\n\013tasks_co"
          + "unt\030\001 \001(\003B\003\340A\003\022F\n\035oldest_estimated_arriv"
          + "al_time\030\002 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003\022\'\n\032executed_last_minute_count\030\003 \001"
          + "(\003B\003\340A\003\022(\n\033concurrent_dispatches_count\030\004"
          + " \001(\003B\003\340A\003\022%\n\030effective_execution_rate\030\005 "
          + "\001(\001B\003\340A\003Bs\n\036com.google.cloud.tasks.v2bet"
          + "a3B\nQueueProtoP\001ZCcloud.google.com/go/cl"
          + "oudtasks/apiv2beta3/cloudtaskspb;cloudta"
          + "skspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.tasks.v2beta3.TargetProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_tasks_v2beta3_Queue_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta3_Queue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_Queue_descriptor,
            new java.lang.String[] {
              "Name",
              "AppEngineHttpQueue",
              "HttpTarget",
              "RateLimits",
              "RetryConfig",
              "State",
              "PurgeTime",
              "TaskTtl",
              "TombstoneTtl",
              "StackdriverLoggingConfig",
              "Type",
              "Stats",
              "QueueType",
            });
    internal_static_google_cloud_tasks_v2beta3_RateLimits_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta3_RateLimits_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_RateLimits_descriptor,
            new java.lang.String[] {
              "MaxDispatchesPerSecond", "MaxBurstSize", "MaxConcurrentDispatches",
            });
    internal_static_google_cloud_tasks_v2beta3_RetryConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2beta3_RetryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_RetryConfig_descriptor,
            new java.lang.String[] {
              "MaxAttempts", "MaxRetryDuration", "MinBackoff", "MaxBackoff", "MaxDoublings",
            });
    internal_static_google_cloud_tasks_v2beta3_StackdriverLoggingConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_tasks_v2beta3_StackdriverLoggingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_StackdriverLoggingConfig_descriptor,
            new java.lang.String[] {
              "SamplingRatio",
            });
    internal_static_google_cloud_tasks_v2beta3_QueueStats_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_tasks_v2beta3_QueueStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_QueueStats_descriptor,
            new java.lang.String[] {
              "TasksCount",
              "OldestEstimatedArrivalTime",
              "ExecutedLastMinuteCount",
              "ConcurrentDispatchesCount",
              "EffectiveExecutionRate",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.tasks.v2beta3.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
