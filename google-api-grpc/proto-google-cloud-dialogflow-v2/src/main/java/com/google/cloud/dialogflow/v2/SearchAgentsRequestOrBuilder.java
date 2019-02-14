// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/agent.proto

package com.google.cloud.dialogflow.v2;

public interface SearchAgentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SearchAgentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project to list agents from.
   * Format: `projects/&lt;Project ID or '-'&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project to list agents from.
   * Format: `projects/&lt;Project ID or '-'&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of items to return in a single page. By
   * default 100 and at most 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
