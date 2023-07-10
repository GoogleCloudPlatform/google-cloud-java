// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetRegionTargetTcpProxyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetRegionTargetTcpProxyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * Name of the TargetTcpProxy resource to return.
   * </pre>
   *
   * <code>string target_tcp_proxy = 503065442 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The targetTcpProxy.
   */
  java.lang.String getTargetTcpProxy();
  /**
   * <pre>
   * Name of the TargetTcpProxy resource to return.
   * </pre>
   *
   * <code>string target_tcp_proxy = 503065442 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for targetTcpProxy.
   */
  com.google.protobuf.ByteString
      getTargetTcpProxyBytes();
}
