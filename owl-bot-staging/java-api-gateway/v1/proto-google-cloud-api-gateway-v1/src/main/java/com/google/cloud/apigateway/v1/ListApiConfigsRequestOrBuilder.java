// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigateway/v1/apigateway.proto

package com.google.cloud.apigateway.v1;

public interface ListApiConfigsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigateway.v1.ListApiConfigsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Parent resource of the API Config, of the form:
   * `projects/&#42;&#47;locations/global/apis/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Parent resource of the API Config, of the form:
   * `projects/&#42;&#47;locations/global/apis/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Filter.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Filter.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Order by parameters.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Order by parameters.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();
}
