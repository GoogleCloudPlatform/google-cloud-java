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
// source: google/dataflow/v1beta3/jobs.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Describes the overall state of a [google.dataflow.v1beta3.Job][google.dataflow.v1beta3.Job].
 * </pre>
 *
 * Protobuf enum {@code google.dataflow.v1beta3.JobState}
 */
public enum JobState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The job's run state isn't specified.
   * </pre>
   *
   * <code>JOB_STATE_UNKNOWN = 0;</code>
   */
  JOB_STATE_UNKNOWN(0),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_STOPPED` indicates that the job has not
   * yet started to run.
   * </pre>
   *
   * <code>JOB_STATE_STOPPED = 1;</code>
   */
  JOB_STATE_STOPPED(1),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_RUNNING` indicates that the job is currently running.
   * </pre>
   *
   * <code>JOB_STATE_RUNNING = 2;</code>
   */
  JOB_STATE_RUNNING(2),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_DONE` indicates that the job has successfully completed.
   * This is a terminal job state.  This state may be set by the Cloud Dataflow
   * service, as a transition from `JOB_STATE_RUNNING`. It may also be set via a
   * Cloud Dataflow `UpdateJob` call, if the job has not yet reached a terminal
   * state.
   * </pre>
   *
   * <code>JOB_STATE_DONE = 3;</code>
   */
  JOB_STATE_DONE(3),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_FAILED` indicates that the job has failed.  This is a
   * terminal job state.  This state may only be set by the Cloud Dataflow
   * service, and only as a transition from `JOB_STATE_RUNNING`.
   * </pre>
   *
   * <code>JOB_STATE_FAILED = 4;</code>
   */
  JOB_STATE_FAILED(4),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_CANCELLED` indicates that the job has been explicitly
   * cancelled. This is a terminal job state. This state may only be
   * set via a Cloud Dataflow `UpdateJob` call, and only if the job has not
   * yet reached another terminal state.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLED = 5;</code>
   */
  JOB_STATE_CANCELLED(5),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_UPDATED` indicates that the job was successfully updated,
   * meaning that this job was stopped and another job was started, inheriting
   * state from this one. This is a terminal job state. This state may only be
   * set by the Cloud Dataflow service, and only as a transition from
   * `JOB_STATE_RUNNING`.
   * </pre>
   *
   * <code>JOB_STATE_UPDATED = 6;</code>
   */
  JOB_STATE_UPDATED(6),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_DRAINING` indicates that the job is in the process of draining.
   * A draining job has stopped pulling from its input sources and is processing
   * any data that remains in-flight. This state may be set via a Cloud Dataflow
   * `UpdateJob` call, but only as a transition from `JOB_STATE_RUNNING`. Jobs
   * that are draining may only transition to `JOB_STATE_DRAINED`,
   * `JOB_STATE_CANCELLED`, or `JOB_STATE_FAILED`.
   * </pre>
   *
   * <code>JOB_STATE_DRAINING = 7;</code>
   */
  JOB_STATE_DRAINING(7),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_DRAINED` indicates that the job has been drained.
   * A drained job terminated by stopping pulling from its input sources and
   * processing any data that remained in-flight when draining was requested.
   * This state is a terminal state, may only be set by the Cloud Dataflow
   * service, and only as a transition from `JOB_STATE_DRAINING`.
   * </pre>
   *
   * <code>JOB_STATE_DRAINED = 8;</code>
   */
  JOB_STATE_DRAINED(8),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_PENDING` indicates that the job has been created but is not yet
   * running.  Jobs that are pending may only transition to `JOB_STATE_RUNNING`,
   * or `JOB_STATE_FAILED`.
   * </pre>
   *
   * <code>JOB_STATE_PENDING = 9;</code>
   */
  JOB_STATE_PENDING(9),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_CANCELLING` indicates that the job has been explicitly cancelled
   * and is in the process of stopping.  Jobs that are cancelling may only
   * transition to `JOB_STATE_CANCELLED` or `JOB_STATE_FAILED`.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLING = 10;</code>
   */
  JOB_STATE_CANCELLING(10),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_QUEUED` indicates that the job has been created but is being
   * delayed until launch. Jobs that are queued may only transition to
   * `JOB_STATE_PENDING` or `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>JOB_STATE_QUEUED = 11;</code>
   */
  JOB_STATE_QUEUED(11),
  /**
   *
   *
   * <pre>
   * `JOB_STATE_RESOURCE_CLEANING_UP` indicates that the batch job's associated
   * resources are currently being cleaned up after a successful run.
   * Currently, this is an opt-in feature, please reach out to Cloud support
   * team if you are interested.
   * </pre>
   *
   * <code>JOB_STATE_RESOURCE_CLEANING_UP = 12;</code>
   */
  JOB_STATE_RESOURCE_CLEANING_UP(12),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The job's run state isn't specified.
   * </pre>
   *
   * <code>JOB_STATE_UNKNOWN = 0;</code>
   */
  public static final int JOB_STATE_UNKNOWN_VALUE = 0;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_STOPPED` indicates that the job has not
   * yet started to run.
   * </pre>
   *
   * <code>JOB_STATE_STOPPED = 1;</code>
   */
  public static final int JOB_STATE_STOPPED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_RUNNING` indicates that the job is currently running.
   * </pre>
   *
   * <code>JOB_STATE_RUNNING = 2;</code>
   */
  public static final int JOB_STATE_RUNNING_VALUE = 2;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_DONE` indicates that the job has successfully completed.
   * This is a terminal job state.  This state may be set by the Cloud Dataflow
   * service, as a transition from `JOB_STATE_RUNNING`. It may also be set via a
   * Cloud Dataflow `UpdateJob` call, if the job has not yet reached a terminal
   * state.
   * </pre>
   *
   * <code>JOB_STATE_DONE = 3;</code>
   */
  public static final int JOB_STATE_DONE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_FAILED` indicates that the job has failed.  This is a
   * terminal job state.  This state may only be set by the Cloud Dataflow
   * service, and only as a transition from `JOB_STATE_RUNNING`.
   * </pre>
   *
   * <code>JOB_STATE_FAILED = 4;</code>
   */
  public static final int JOB_STATE_FAILED_VALUE = 4;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_CANCELLED` indicates that the job has been explicitly
   * cancelled. This is a terminal job state. This state may only be
   * set via a Cloud Dataflow `UpdateJob` call, and only if the job has not
   * yet reached another terminal state.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLED = 5;</code>
   */
  public static final int JOB_STATE_CANCELLED_VALUE = 5;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_UPDATED` indicates that the job was successfully updated,
   * meaning that this job was stopped and another job was started, inheriting
   * state from this one. This is a terminal job state. This state may only be
   * set by the Cloud Dataflow service, and only as a transition from
   * `JOB_STATE_RUNNING`.
   * </pre>
   *
   * <code>JOB_STATE_UPDATED = 6;</code>
   */
  public static final int JOB_STATE_UPDATED_VALUE = 6;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_DRAINING` indicates that the job is in the process of draining.
   * A draining job has stopped pulling from its input sources and is processing
   * any data that remains in-flight. This state may be set via a Cloud Dataflow
   * `UpdateJob` call, but only as a transition from `JOB_STATE_RUNNING`. Jobs
   * that are draining may only transition to `JOB_STATE_DRAINED`,
   * `JOB_STATE_CANCELLED`, or `JOB_STATE_FAILED`.
   * </pre>
   *
   * <code>JOB_STATE_DRAINING = 7;</code>
   */
  public static final int JOB_STATE_DRAINING_VALUE = 7;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_DRAINED` indicates that the job has been drained.
   * A drained job terminated by stopping pulling from its input sources and
   * processing any data that remained in-flight when draining was requested.
   * This state is a terminal state, may only be set by the Cloud Dataflow
   * service, and only as a transition from `JOB_STATE_DRAINING`.
   * </pre>
   *
   * <code>JOB_STATE_DRAINED = 8;</code>
   */
  public static final int JOB_STATE_DRAINED_VALUE = 8;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_PENDING` indicates that the job has been created but is not yet
   * running.  Jobs that are pending may only transition to `JOB_STATE_RUNNING`,
   * or `JOB_STATE_FAILED`.
   * </pre>
   *
   * <code>JOB_STATE_PENDING = 9;</code>
   */
  public static final int JOB_STATE_PENDING_VALUE = 9;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_CANCELLING` indicates that the job has been explicitly cancelled
   * and is in the process of stopping.  Jobs that are cancelling may only
   * transition to `JOB_STATE_CANCELLED` or `JOB_STATE_FAILED`.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLING = 10;</code>
   */
  public static final int JOB_STATE_CANCELLING_VALUE = 10;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_QUEUED` indicates that the job has been created but is being
   * delayed until launch. Jobs that are queued may only transition to
   * `JOB_STATE_PENDING` or `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>JOB_STATE_QUEUED = 11;</code>
   */
  public static final int JOB_STATE_QUEUED_VALUE = 11;
  /**
   *
   *
   * <pre>
   * `JOB_STATE_RESOURCE_CLEANING_UP` indicates that the batch job's associated
   * resources are currently being cleaned up after a successful run.
   * Currently, this is an opt-in feature, please reach out to Cloud support
   * team if you are interested.
   * </pre>
   *
   * <code>JOB_STATE_RESOURCE_CLEANING_UP = 12;</code>
   */
  public static final int JOB_STATE_RESOURCE_CLEANING_UP_VALUE = 12;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static JobState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JobState forNumber(int value) {
    switch (value) {
      case 0:
        return JOB_STATE_UNKNOWN;
      case 1:
        return JOB_STATE_STOPPED;
      case 2:
        return JOB_STATE_RUNNING;
      case 3:
        return JOB_STATE_DONE;
      case 4:
        return JOB_STATE_FAILED;
      case 5:
        return JOB_STATE_CANCELLED;
      case 6:
        return JOB_STATE_UPDATED;
      case 7:
        return JOB_STATE_DRAINING;
      case 8:
        return JOB_STATE_DRAINED;
      case 9:
        return JOB_STATE_PENDING;
      case 10:
        return JOB_STATE_CANCELLING;
      case 11:
        return JOB_STATE_QUEUED;
      case 12:
        return JOB_STATE_RESOURCE_CLEANING_UP;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<JobState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<JobState>() {
        public JobState findValueByNumber(int number) {
          return JobState.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.dataflow.v1beta3.JobsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final JobState[] VALUES = values();

  public static JobState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.JobState)
}
