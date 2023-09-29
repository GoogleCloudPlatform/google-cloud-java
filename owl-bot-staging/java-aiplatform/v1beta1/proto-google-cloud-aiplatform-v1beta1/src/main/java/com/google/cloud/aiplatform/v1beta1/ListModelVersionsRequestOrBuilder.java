// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListModelVersionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListModelVersionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the model to list versions for.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the model to list versions for.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [next_page_token][google.cloud.aiplatform.v1beta1.ListModelVersionsResponse.next_page_token]
   * of the previous
   * [ListModelVersions][google.cloud.aiplatform.v1beta1.ModelService.ListModelVersions]
   * call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [next_page_token][google.cloud.aiplatform.v1beta1.ListModelVersionsResponse.next_page_token]
   * of the previous
   * [ListModelVersions][google.cloud.aiplatform.v1beta1.ModelService.ListModelVersions]
   * call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * An expression for filtering the results of the request. For field names
   * both snake_case and camelCase are supported.
   *
   *   * `labels` supports general map functions that is:
   *     * `labels.key=value` - key:value equality
   *     * `labels.key:* or labels:key - key existence
   *     * A key including a space must be quoted. `labels."a key"`.
   *
   * Some examples:
   *
   *   * `labels.myKey="myValue"`
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * An expression for filtering the results of the request. For field names
   * both snake_case and camelCase are supported.
   *
   *   * `labels` supports general map functions that is:
   *     * `labels.key=value` - key:value equality
   *     * `labels.key:* or labels:key - key existence
   *     * A key including a space must be quoted. `labels."a key"`.
   *
   * Some examples:
   *
   *   * `labels.myKey="myValue"`
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();

  /**
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   * Supported fields:
   *
   *   * `create_time`
   *   * `update_time`
   *
   * Example: `update_time asc, create_time desc`.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   * Supported fields:
   *
   *   * `create_time`
   *   * `update_time`
   *
   * Example: `update_time asc, create_time desc`.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();
}
