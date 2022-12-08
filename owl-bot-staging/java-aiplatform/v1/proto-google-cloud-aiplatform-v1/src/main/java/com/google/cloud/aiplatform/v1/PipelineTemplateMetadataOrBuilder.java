// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/pipeline_job.proto

package com.google.cloud.aiplatform.v1;

public interface PipelineTemplateMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.PipelineTemplateMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The version_name in artifact registry.
   * Will always be presented in output if the [PipelineJob.template_uri][google.cloud.aiplatform.v1.PipelineJob.template_uri] is
   * from supported template registry.
   * Format is "sha256:abcdef123456...".
   * </pre>
   *
   * <code>string version = 3;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The version_name in artifact registry.
   * Will always be presented in output if the [PipelineJob.template_uri][google.cloud.aiplatform.v1.PipelineJob.template_uri] is
   * from supported template registry.
   * Format is "sha256:abcdef123456...".
   * </pre>
   *
   * <code>string version = 3;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
