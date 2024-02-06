// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1beta;

public interface DataplexConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.DataplexConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1beta.Lake&gt; lake_resources = 1;</code>
   */
  int getLakeResourcesCount();
  /**
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1beta.Lake&gt; lake_resources = 1;</code>
   */
  boolean containsLakeResources(
      java.lang.String key);
  /**
   * Use {@link #getLakeResourcesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.metastore.v1beta.Lake>
  getLakeResources();
  /**
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1beta.Lake&gt; lake_resources = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.metastore.v1beta.Lake>
  getLakeResourcesMap();
  /**
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1beta.Lake&gt; lake_resources = 1;</code>
   */
  /* nullable */
com.google.cloud.metastore.v1beta.Lake getLakeResourcesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.metastore.v1beta.Lake defaultValue);
  /**
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1beta.Lake&gt; lake_resources = 1;</code>
   */
  com.google.cloud.metastore.v1beta.Lake getLakeResourcesOrThrow(
      java.lang.String key);
}
