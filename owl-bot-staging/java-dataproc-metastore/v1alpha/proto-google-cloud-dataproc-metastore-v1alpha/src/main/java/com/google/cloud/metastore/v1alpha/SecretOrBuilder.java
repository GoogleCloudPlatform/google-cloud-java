// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1alpha/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1alpha;

public interface SecretOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.Secret)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The relative resource name of a Secret Manager secret version, in the
   * following form:
   *
   * `projects/{project_number}/secrets/{secret_id}/versions/{version_id}`.
   * </pre>
   *
   * <code>string cloud_secret = 2;</code>
   * @return Whether the cloudSecret field is set.
   */
  boolean hasCloudSecret();
  /**
   * <pre>
   * The relative resource name of a Secret Manager secret version, in the
   * following form:
   *
   * `projects/{project_number}/secrets/{secret_id}/versions/{version_id}`.
   * </pre>
   *
   * <code>string cloud_secret = 2;</code>
   * @return The cloudSecret.
   */
  java.lang.String getCloudSecret();
  /**
   * <pre>
   * The relative resource name of a Secret Manager secret version, in the
   * following form:
   *
   * `projects/{project_number}/secrets/{secret_id}/versions/{version_id}`.
   * </pre>
   *
   * <code>string cloud_secret = 2;</code>
   * @return The bytes for cloudSecret.
   */
  com.google.protobuf.ByteString
      getCloudSecretBytes();

  com.google.cloud.metastore.v1alpha.Secret.ValueCase getValueCase();
}
