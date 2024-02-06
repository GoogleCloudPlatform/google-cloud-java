// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

public interface ListAnnotationSpecSetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Parent of AnnotationSpecSet resource, format:
   * projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Parent of AnnotationSpecSet resource, format:
   * projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. Filter is not supported at this moment.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. Filter is not supported at this moment.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Optional. Requested page size. Server may return fewer results than
   * requested. Default value is 100.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by
   * [ListAnnotationSpecSetsResponse.next_page_token][google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse.next_page_token] of the previous
   * [DataLabelingService.ListAnnotationSpecSets] call.
   * Return first page if empty.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by
   * [ListAnnotationSpecSetsResponse.next_page_token][google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse.next_page_token] of the previous
   * [DataLabelingService.ListAnnotationSpecSets] call.
   * Return first page if empty.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
