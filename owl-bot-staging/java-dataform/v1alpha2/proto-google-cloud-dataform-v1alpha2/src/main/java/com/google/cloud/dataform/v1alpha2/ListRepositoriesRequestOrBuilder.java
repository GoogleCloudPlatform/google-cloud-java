// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1alpha2;

public interface ListRepositoriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.ListRepositoriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The location in which to list repositories. Must be in the format
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The location in which to list repositories. Must be in the format
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. Maximum number of repositories to return. The server may return fewer
   * items than requested. If unspecified, the server will pick an appropriate
   * default.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. Page token received from a previous `ListRepositories` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListRepositories`
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. Page token received from a previous `ListRepositories` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListRepositories`
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. This field only supports ordering by `name`. If unspecified, the server
   * will choose the ordering. If specified, the default order is ascending for
   * the `name` field.
   * </pre>
   *
   * <code>string order_by = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. This field only supports ordering by `name`. If unspecified, the server
   * will choose the ordering. If specified, the default order is ascending for
   * the `name` field.
   * </pre>
   *
   * <code>string order_by = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Optional. Filter for the returned list.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. Filter for the returned list.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
