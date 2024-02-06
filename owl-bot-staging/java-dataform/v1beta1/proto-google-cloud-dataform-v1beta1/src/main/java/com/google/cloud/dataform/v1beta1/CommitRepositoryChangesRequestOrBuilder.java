// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1beta1;

public interface CommitRepositoryChangesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The repository's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The repository's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The changes to commit to the repository.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.CommitMetadata commit_metadata = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the commitMetadata field is set.
   */
  boolean hasCommitMetadata();
  /**
   * <pre>
   * Required. The changes to commit to the repository.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.CommitMetadata commit_metadata = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The commitMetadata.
   */
  com.google.cloud.dataform.v1beta1.CommitMetadata getCommitMetadata();
  /**
   * <pre>
   * Required. The changes to commit to the repository.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.CommitMetadata commit_metadata = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataform.v1beta1.CommitMetadataOrBuilder getCommitMetadataOrBuilder();

  /**
   * <pre>
   * Optional. The commit SHA which must be the repository's current HEAD before
   * applying this commit; otherwise this request will fail. If unset, no
   * validation on the current HEAD commit SHA is performed.
   * </pre>
   *
   * <code>string required_head_commit_sha = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requiredHeadCommitSha.
   */
  java.lang.String getRequiredHeadCommitSha();
  /**
   * <pre>
   * Optional. The commit SHA which must be the repository's current HEAD before
   * applying this commit; otherwise this request will fail. If unset, no
   * validation on the current HEAD commit SHA is performed.
   * </pre>
   *
   * <code>string required_head_commit_sha = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requiredHeadCommitSha.
   */
  com.google.protobuf.ByteString
      getRequiredHeadCommitShaBytes();

  /**
   * <pre>
   * A map to the path of the file to the operation. The path is the full file
   * path including filename, from repository root.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation&gt; file_operations = 3;</code>
   */
  int getFileOperationsCount();
  /**
   * <pre>
   * A map to the path of the file to the operation. The path is the full file
   * path including filename, from repository root.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation&gt; file_operations = 3;</code>
   */
  boolean containsFileOperations(
      java.lang.String key);
  /**
   * Use {@link #getFileOperationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation>
  getFileOperations();
  /**
   * <pre>
   * A map to the path of the file to the operation. The path is the full file
   * path including filename, from repository root.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation&gt; file_operations = 3;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation>
  getFileOperationsMap();
  /**
   * <pre>
   * A map to the path of the file to the operation. The path is the full file
   * path including filename, from repository root.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation&gt; file_operations = 3;</code>
   */
  /* nullable */
com.google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation getFileOperationsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation defaultValue);
  /**
   * <pre>
   * A map to the path of the file to the operation. The path is the full file
   * path including filename, from repository root.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation&gt; file_operations = 3;</code>
   */
  com.google.cloud.dataform.v1beta1.CommitRepositoryChangesRequest.FileOperation getFileOperationsOrThrow(
      java.lang.String key);
}
