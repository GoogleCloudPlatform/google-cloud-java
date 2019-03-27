// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

public interface GetJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.GetJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The resource name of the job to retrieve.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/api-test-project/tenants/foo/jobs/1234".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/jobs/1234".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required.
   * The resource name of the job to retrieve.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/api-test-project/tenants/foo/jobs/1234".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/jobs/1234".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
