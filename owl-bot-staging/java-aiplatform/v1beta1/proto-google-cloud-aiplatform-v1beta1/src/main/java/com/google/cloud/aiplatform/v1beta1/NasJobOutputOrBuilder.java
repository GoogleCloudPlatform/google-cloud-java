// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/nas_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface NasJobOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.NasJobOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The output of this multi-trial Neural Architecture Search
   * (NAS) job.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NasJobOutput.MultiTrialJobOutput multi_trial_job_output = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the multiTrialJobOutput field is set.
   */
  boolean hasMultiTrialJobOutput();
  /**
   * <pre>
   * Output only. The output of this multi-trial Neural Architecture Search
   * (NAS) job.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NasJobOutput.MultiTrialJobOutput multi_trial_job_output = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The multiTrialJobOutput.
   */
  com.google.cloud.aiplatform.v1beta1.NasJobOutput.MultiTrialJobOutput getMultiTrialJobOutput();
  /**
   * <pre>
   * Output only. The output of this multi-trial Neural Architecture Search
   * (NAS) job.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NasJobOutput.MultiTrialJobOutput multi_trial_job_output = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.NasJobOutput.MultiTrialJobOutputOrBuilder getMultiTrialJobOutputOrBuilder();

  com.google.cloud.aiplatform.v1beta1.NasJobOutput.OutputCase getOutputCase();
}
