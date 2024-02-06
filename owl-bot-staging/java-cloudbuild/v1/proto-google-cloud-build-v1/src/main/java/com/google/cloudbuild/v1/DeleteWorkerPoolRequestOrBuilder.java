// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v1;

public interface DeleteWorkerPoolRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.DeleteWorkerPoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the `WorkerPool` to delete.
   * Format:
   * `projects/{project}/locations/{location}/workerPools/{workerPool}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the `WorkerPool` to delete.
   * Format:
   * `projects/{project}/locations/{location}/workerPools/{workerPool}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. If provided, it must match the server's etag on the workerpool
   * for the request to be processed.
   * </pre>
   *
   * <code>string etag = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Optional. If provided, it must match the server's etag on the workerpool
   * for the request to be processed.
   * </pre>
   *
   * <code>string etag = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * If set to true, and the `WorkerPool` is not found, the request will succeed
   * but no action will be taken on the server.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();

  /**
   * <pre>
   * If set, validate the request and preview the response, but do not actually
   * post it.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
