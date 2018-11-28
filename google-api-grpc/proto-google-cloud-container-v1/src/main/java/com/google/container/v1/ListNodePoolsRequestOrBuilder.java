// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface ListNodePoolsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.ListNodePoolsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://developers.google.com/console/help/new/#projectnumber).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://developers.google.com/console/help/new/#projectnumber).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getClusterId();
  /**
   * <pre>
   * Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * The parent (project, location, cluster id) where the node pools will be
   * listed. Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string parent = 5;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent (project, location, cluster id) where the node pools will be
   * listed. Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string parent = 5;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
