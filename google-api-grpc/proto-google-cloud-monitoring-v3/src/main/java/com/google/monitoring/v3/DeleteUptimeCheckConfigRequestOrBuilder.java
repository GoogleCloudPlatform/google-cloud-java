// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime_service.proto

package com.google.monitoring.v3;

public interface DeleteUptimeCheckConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.DeleteUptimeCheckConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The uptime check configuration to delete. The format
   *   is `projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The uptime check configuration to delete. The format
   *   is `projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
