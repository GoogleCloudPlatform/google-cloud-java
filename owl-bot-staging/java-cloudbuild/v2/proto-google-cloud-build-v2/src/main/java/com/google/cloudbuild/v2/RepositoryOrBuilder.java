// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v2;

public interface RepositoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.Repository)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Resource name of the repository, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. Resource name of the repository, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Git Clone HTTPS URI.
   * </pre>
   *
   * <code>string remote_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The remoteUri.
   */
  java.lang.String getRemoteUri();
  /**
   * <pre>
   * Required. Git Clone HTTPS URI.
   * </pre>
   *
   * <code>string remote_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for remoteUri.
   */
  com.google.protobuf.ByteString
      getRemoteUriBytes();

  /**
   * <pre>
   * Output only. Server assigned timestamp for when the connection was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Server assigned timestamp for when the connection was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Server assigned timestamp for when the connection was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Server assigned timestamp for when the connection was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Server assigned timestamp for when the connection was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Server assigned timestamp for when the connection was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  int getAnnotationsCount();
  /**
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  boolean containsAnnotations(
      java.lang.String key);
  /**
   * Use {@link #getAnnotationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotations();
  /**
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotationsMap();
  /**
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  /* nullable */
java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Allows clients to store small amounts of arbitrary data.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  java.lang.String getAnnotationsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 7;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 7;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Output only. External ID of the webhook created for the repository.
   * </pre>
   *
   * <code>string webhook_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The webhookId.
   */
  java.lang.String getWebhookId();
  /**
   * <pre>
   * Output only. External ID of the webhook created for the repository.
   * </pre>
   *
   * <code>string webhook_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for webhookId.
   */
  com.google.protobuf.ByteString
      getWebhookIdBytes();
}
