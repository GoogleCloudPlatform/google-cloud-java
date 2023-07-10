// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetRegionTargetHttpsProxyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetRegionTargetHttpsProxyRequest)
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
   * Name of the TargetHttpsProxy resource to return.
   * </pre>
   *
   * <code>string target_https_proxy = 52336748 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The targetHttpsProxy.
   */
  java.lang.String getTargetHttpsProxy();
  /**
   * <pre>
   * Name of the TargetHttpsProxy resource to return.
   * </pre>
   *
   * <code>string target_https_proxy = 52336748 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for targetHttpsProxy.
   */
  com.google.protobuf.ByteString
      getTargetHttpsProxyBytes();
}
