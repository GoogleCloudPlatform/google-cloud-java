/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/dataset_service.proto

package com.google.cloud.aiplatform.v1;

public interface SearchDataItemsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SearchDataItemsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A comma-separated list of data item fields to order by, sorted in
   * ascending order. Use "desc" after a field name for descending.
   * </pre>
   *
   * <code>string order_by_data_item = 12;</code>
   *
   * @return Whether the orderByDataItem field is set.
   */
  boolean hasOrderByDataItem();
  /**
   *
   *
   * <pre>
   * A comma-separated list of data item fields to order by, sorted in
   * ascending order. Use "desc" after a field name for descending.
   * </pre>
   *
   * <code>string order_by_data_item = 12;</code>
   *
   * @return The orderByDataItem.
   */
  java.lang.String getOrderByDataItem();
  /**
   *
   *
   * <pre>
   * A comma-separated list of data item fields to order by, sorted in
   * ascending order. Use "desc" after a field name for descending.
   * </pre>
   *
   * <code>string order_by_data_item = 12;</code>
   *
   * @return The bytes for orderByDataItem.
   */
  com.google.protobuf.ByteString getOrderByDataItemBytes();

  /**
   *
   *
   * <pre>
   * Expression that allows ranking results based on annotation's property.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SearchDataItemsRequest.OrderByAnnotation order_by_annotation = 13;
   * </code>
   *
   * @return Whether the orderByAnnotation field is set.
   */
  boolean hasOrderByAnnotation();
  /**
   *
   *
   * <pre>
   * Expression that allows ranking results based on annotation's property.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SearchDataItemsRequest.OrderByAnnotation order_by_annotation = 13;
   * </code>
   *
   * @return The orderByAnnotation.
   */
  com.google.cloud.aiplatform.v1.SearchDataItemsRequest.OrderByAnnotation getOrderByAnnotation();
  /**
   *
   *
   * <pre>
   * Expression that allows ranking results based on annotation's property.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SearchDataItemsRequest.OrderByAnnotation order_by_annotation = 13;
   * </code>
   */
  com.google.cloud.aiplatform.v1.SearchDataItemsRequest.OrderByAnnotationOrBuilder
      getOrderByAnnotationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Dataset from which to search DataItems.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * string dataset = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Dataset from which to search DataItems.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * string dataset = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * The resource name of a SavedQuery(annotation set in UI).
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}/savedQueries/{saved_query}`
   * All of the search will be done in the context of this SavedQuery.
   * </pre>
   *
   * <code>string saved_query = 2 [deprecated = true, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1.SearchDataItemsRequest.saved_query is deprecated. See
   *     google/cloud/aiplatform/v1/dataset_service.proto;l=437
   * @return The savedQuery.
   */
  @java.lang.Deprecated
  java.lang.String getSavedQuery();
  /**
   *
   *
   * <pre>
   * The resource name of a SavedQuery(annotation set in UI).
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}/savedQueries/{saved_query}`
   * All of the search will be done in the context of this SavedQuery.
   * </pre>
   *
   * <code>string saved_query = 2 [deprecated = true, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1.SearchDataItemsRequest.saved_query is deprecated. See
   *     google/cloud/aiplatform/v1/dataset_service.proto;l=437
   * @return The bytes for savedQuery.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getSavedQueryBytes();

  /**
   *
   *
   * <pre>
   * The resource name of a DataLabelingJob.
   * Format:
   * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * If this field is set, all of the search will be done in the context of
   * this DataLabelingJob.
   * </pre>
   *
   * <code>string data_labeling_job = 3;</code>
   *
   * @return The dataLabelingJob.
   */
  java.lang.String getDataLabelingJob();
  /**
   *
   *
   * <pre>
   * The resource name of a DataLabelingJob.
   * Format:
   * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * If this field is set, all of the search will be done in the context of
   * this DataLabelingJob.
   * </pre>
   *
   * <code>string data_labeling_job = 3;</code>
   *
   * @return The bytes for dataLabelingJob.
   */
  com.google.protobuf.ByteString getDataLabelingJobBytes();

  /**
   *
   *
   * <pre>
   * An expression for filtering the DataItem that will be returned.
   *   * `data_item_id` - for = or !=.
   *   * `labeled` - for = or !=.
   *   * `has_annotation(ANNOTATION_SPEC_ID)` - true only for DataItem that
   *     have at least one annotation with annotation_spec_id =
   *     `ANNOTATION_SPEC_ID` in the context of SavedQuery or DataLabelingJob.
   * For example:
   * * `data_item=1`
   * * `has_annotation(5)`
   * </pre>
   *
   * <code>string data_item_filter = 4;</code>
   *
   * @return The dataItemFilter.
   */
  java.lang.String getDataItemFilter();
  /**
   *
   *
   * <pre>
   * An expression for filtering the DataItem that will be returned.
   *   * `data_item_id` - for = or !=.
   *   * `labeled` - for = or !=.
   *   * `has_annotation(ANNOTATION_SPEC_ID)` - true only for DataItem that
   *     have at least one annotation with annotation_spec_id =
   *     `ANNOTATION_SPEC_ID` in the context of SavedQuery or DataLabelingJob.
   * For example:
   * * `data_item=1`
   * * `has_annotation(5)`
   * </pre>
   *
   * <code>string data_item_filter = 4;</code>
   *
   * @return The bytes for dataItemFilter.
   */
  com.google.protobuf.ByteString getDataItemFilterBytes();

  /**
   *
   *
   * <pre>
   * An expression for filtering the Annotations that will be returned per
   * DataItem.
   *   * `annotation_spec_id` - for = or !=.
   * </pre>
   *
   * <code>string annotations_filter = 5 [deprecated = true];</code>
   *
   * @deprecated google.cloud.aiplatform.v1.SearchDataItemsRequest.annotations_filter is deprecated.
   *     See google/cloud/aiplatform/v1/dataset_service.proto;l=468
   * @return The annotationsFilter.
   */
  @java.lang.Deprecated
  java.lang.String getAnnotationsFilter();
  /**
   *
   *
   * <pre>
   * An expression for filtering the Annotations that will be returned per
   * DataItem.
   *   * `annotation_spec_id` - for = or !=.
   * </pre>
   *
   * <code>string annotations_filter = 5 [deprecated = true];</code>
   *
   * @deprecated google.cloud.aiplatform.v1.SearchDataItemsRequest.annotations_filter is deprecated.
   *     See google/cloud/aiplatform/v1/dataset_service.proto;l=468
   * @return The bytes for annotationsFilter.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getAnnotationsFilterBytes();

  /**
   *
   *
   * <pre>
   * An expression that specifies what Annotations will be returned per
   * DataItem. Annotations satisfied either of the conditions will be returned.
   *   * `annotation_spec_id` - for = or !=.
   * Must specify `saved_query_id=` - saved query id that annotations should
   * belong to.
   * </pre>
   *
   * <code>repeated string annotation_filters = 11;</code>
   *
   * @return A list containing the annotationFilters.
   */
  java.util.List<java.lang.String> getAnnotationFiltersList();
  /**
   *
   *
   * <pre>
   * An expression that specifies what Annotations will be returned per
   * DataItem. Annotations satisfied either of the conditions will be returned.
   *   * `annotation_spec_id` - for = or !=.
   * Must specify `saved_query_id=` - saved query id that annotations should
   * belong to.
   * </pre>
   *
   * <code>repeated string annotation_filters = 11;</code>
   *
   * @return The count of annotationFilters.
   */
  int getAnnotationFiltersCount();
  /**
   *
   *
   * <pre>
   * An expression that specifies what Annotations will be returned per
   * DataItem. Annotations satisfied either of the conditions will be returned.
   *   * `annotation_spec_id` - for = or !=.
   * Must specify `saved_query_id=` - saved query id that annotations should
   * belong to.
   * </pre>
   *
   * <code>repeated string annotation_filters = 11;</code>
   *
   * @param index The index of the element to return.
   * @return The annotationFilters at the given index.
   */
  java.lang.String getAnnotationFilters(int index);
  /**
   *
   *
   * <pre>
   * An expression that specifies what Annotations will be returned per
   * DataItem. Annotations satisfied either of the conditions will be returned.
   *   * `annotation_spec_id` - for = or !=.
   * Must specify `saved_query_id=` - saved query id that annotations should
   * belong to.
   * </pre>
   *
   * <code>repeated string annotation_filters = 11;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the annotationFilters at the given index.
   */
  com.google.protobuf.ByteString getAnnotationFiltersBytes(int index);

  /**
   *
   *
   * <pre>
   * Mask specifying which fields of
   * [DataItemView][google.cloud.aiplatform.v1.DataItemView] to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   *
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields of
   * [DataItemView][google.cloud.aiplatform.v1.DataItemView] to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   *
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields of
   * [DataItemView][google.cloud.aiplatform.v1.DataItemView] to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If set, only up to this many of Annotations will be returned per
   * DataItemView. The maximum value is 1000. If not set, the maximum value will
   * be used.
   * </pre>
   *
   * <code>int32 annotations_limit = 7;</code>
   *
   * @return The annotationsLimit.
   */
  int getAnnotationsLimit();

  /**
   *
   *
   * <pre>
   * Requested page size. Server may return fewer results than requested.
   * Default and maximum page size is 100.
   * </pre>
   *
   * <code>int32 page_size = 8;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   * </pre>
   *
   * <code>string order_by = 9 [deprecated = true];</code>
   *
   * @deprecated google.cloud.aiplatform.v1.SearchDataItemsRequest.order_by is deprecated. See
   *     google/cloud/aiplatform/v1/dataset_service.proto;l=492
   * @return The orderBy.
   */
  @java.lang.Deprecated
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   * </pre>
   *
   * <code>string order_by = 9 [deprecated = true];</code>
   *
   * @deprecated google.cloud.aiplatform.v1.SearchDataItemsRequest.order_by is deprecated. See
   *     google/cloud/aiplatform/v1/dataset_service.proto;l=492
   * @return The bytes for orderBy.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return
   * Typically obtained via
   * [SearchDataItemsResponse.next_page_token][google.cloud.aiplatform.v1.SearchDataItemsResponse.next_page_token]
   * of the previous
   * [DatasetService.SearchDataItems][google.cloud.aiplatform.v1.DatasetService.SearchDataItems]
   * call.
   * </pre>
   *
   * <code>string page_token = 10;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return
   * Typically obtained via
   * [SearchDataItemsResponse.next_page_token][google.cloud.aiplatform.v1.SearchDataItemsResponse.next_page_token]
   * of the previous
   * [DatasetService.SearchDataItems][google.cloud.aiplatform.v1.DatasetService.SearchDataItems]
   * call.
   * </pre>
   *
   * <code>string page_token = 10;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  public com.google.cloud.aiplatform.v1.SearchDataItemsRequest.OrderCase getOrderCase();
}
