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
// source: google/cloud/talent/v4beta1/event.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.talent.v4beta1;

public interface JobEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.JobEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The type of the event (see
   * [JobEventType][google.cloud.talent.v4beta1.JobEvent.JobEventType]).
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.JobEvent.JobEventType type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The type of the event (see
   * [JobEventType][google.cloud.talent.v4beta1.JobEvent.JobEventType]).
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.JobEvent.JobEventType type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.talent.v4beta1.JobEvent.JobEventType getType();

  /**
   *
   *
   * <pre>
   * Required. The [job name(s)][google.cloud.talent.v4beta1.Job.name]
   * associated with this event. For example, if this is an
   * [impression][google.cloud.talent.v4beta1.JobEvent.JobEventType.IMPRESSION]
   * event, this field contains the identifiers of all jobs shown to the job
   * seeker. If this was a
   * [view][google.cloud.talent.v4beta1.JobEvent.JobEventType.VIEW] event, this
   * field contains the identifier of the viewed job.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/foo/tenants/bar/jobs/baz".
   * </pre>
   *
   * <code>repeated string jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the jobs.
   */
  java.util.List<java.lang.String> getJobsList();
  /**
   *
   *
   * <pre>
   * Required. The [job name(s)][google.cloud.talent.v4beta1.Job.name]
   * associated with this event. For example, if this is an
   * [impression][google.cloud.talent.v4beta1.JobEvent.JobEventType.IMPRESSION]
   * event, this field contains the identifiers of all jobs shown to the job
   * seeker. If this was a
   * [view][google.cloud.talent.v4beta1.JobEvent.JobEventType.VIEW] event, this
   * field contains the identifier of the viewed job.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/foo/tenants/bar/jobs/baz".
   * </pre>
   *
   * <code>repeated string jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of jobs.
   */
  int getJobsCount();
  /**
   *
   *
   * <pre>
   * Required. The [job name(s)][google.cloud.talent.v4beta1.Job.name]
   * associated with this event. For example, if this is an
   * [impression][google.cloud.talent.v4beta1.JobEvent.JobEventType.IMPRESSION]
   * event, this field contains the identifiers of all jobs shown to the job
   * seeker. If this was a
   * [view][google.cloud.talent.v4beta1.JobEvent.JobEventType.VIEW] event, this
   * field contains the identifier of the viewed job.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/foo/tenants/bar/jobs/baz".
   * </pre>
   *
   * <code>repeated string jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The jobs at the given index.
   */
  java.lang.String getJobs(int index);
  /**
   *
   *
   * <pre>
   * Required. The [job name(s)][google.cloud.talent.v4beta1.Job.name]
   * associated with this event. For example, if this is an
   * [impression][google.cloud.talent.v4beta1.JobEvent.JobEventType.IMPRESSION]
   * event, this field contains the identifiers of all jobs shown to the job
   * seeker. If this was a
   * [view][google.cloud.talent.v4beta1.JobEvent.JobEventType.VIEW] event, this
   * field contains the identifier of the viewed job.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/foo/tenants/bar/jobs/baz".
   * </pre>
   *
   * <code>repeated string jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the jobs at the given index.
   */
  com.google.protobuf.ByteString getJobsBytes(int index);

  /**
   *
   *
   * <pre>
   * The [profile name][google.cloud.talent.v4beta1.Profile.name] associated
   * with this client event.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}",
   * for example, "projects/foo/tenants/bar/profiles/baz".
   * </pre>
   *
   * <code>string profile = 3;</code>
   *
   * @return The profile.
   */
  java.lang.String getProfile();
  /**
   *
   *
   * <pre>
   * The [profile name][google.cloud.talent.v4beta1.Profile.name] associated
   * with this client event.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}",
   * for example, "projects/foo/tenants/bar/profiles/baz".
   * </pre>
   *
   * <code>string profile = 3;</code>
   *
   * @return The bytes for profile.
   */
  com.google.protobuf.ByteString getProfileBytes();
}
