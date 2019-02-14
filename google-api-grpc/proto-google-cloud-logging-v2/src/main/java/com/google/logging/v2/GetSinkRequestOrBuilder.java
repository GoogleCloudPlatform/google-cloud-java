// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface GetSinkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.GetSinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the sink:
   *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
   *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
   * Example: `"projects/my-project-id/sinks/my-sink-id"`.
   * </pre>
   *
   * <code>string sink_name = 1;</code>
   */
  java.lang.String getSinkName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the sink:
   *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
   *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
   * Example: `"projects/my-project-id/sinks/my-sink-id"`.
   * </pre>
   *
   * <code>string sink_name = 1;</code>
   */
  com.google.protobuf.ByteString getSinkNameBytes();
}
