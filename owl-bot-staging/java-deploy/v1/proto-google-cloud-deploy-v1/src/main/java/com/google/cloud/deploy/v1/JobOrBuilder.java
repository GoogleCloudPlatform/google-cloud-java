// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface JobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.Job)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The ID of the Job.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. The ID of the Job.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. The current state of the Job.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current state of the Job.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Job.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.deploy.v1.Job.State getState();

  /**
   * <pre>
   * Output only. The name of the `JobRun` responsible for the most recent invocation of this
   * Job.
   * </pre>
   *
   * <code>string job_run = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The jobRun.
   */
  java.lang.String getJobRun();
  /**
   * <pre>
   * Output only. The name of the `JobRun` responsible for the most recent invocation of this
   * Job.
   * </pre>
   *
   * <code>string job_run = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for jobRun.
   */
  com.google.protobuf.ByteString
      getJobRunBytes();

  /**
   * <pre>
   * Output only. A deploy Job.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeployJob deploy_job = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the deployJob field is set.
   */
  boolean hasDeployJob();
  /**
   * <pre>
   * Output only. A deploy Job.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeployJob deploy_job = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The deployJob.
   */
  com.google.cloud.deploy.v1.DeployJob getDeployJob();
  /**
   * <pre>
   * Output only. A deploy Job.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeployJob deploy_job = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.deploy.v1.DeployJobOrBuilder getDeployJobOrBuilder();

  /**
   * <pre>
   * Output only. A verify Job.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.VerifyJob verify_job = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the verifyJob field is set.
   */
  boolean hasVerifyJob();
  /**
   * <pre>
   * Output only. A verify Job.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.VerifyJob verify_job = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The verifyJob.
   */
  com.google.cloud.deploy.v1.VerifyJob getVerifyJob();
  /**
   * <pre>
   * Output only. A verify Job.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.VerifyJob verify_job = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.deploy.v1.VerifyJobOrBuilder getVerifyJobOrBuilder();

  public com.google.cloud.deploy.v1.Job.JobTypeCase getJobTypeCase();
}
