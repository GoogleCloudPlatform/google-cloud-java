/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface SearchIndexEndpointRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.SearchIndexEndpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An image-only query.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ImageQuery image_query = 2;</code>
   *
   * @return Whether the imageQuery field is set.
   */
  boolean hasImageQuery();
  /**
   *
   *
   * <pre>
   * An image-only query.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ImageQuery image_query = 2;</code>
   *
   * @return The imageQuery.
   */
  com.google.cloud.visionai.v1.ImageQuery getImageQuery();
  /**
   *
   *
   * <pre>
   * An image-only query.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ImageQuery image_query = 2;</code>
   */
  com.google.cloud.visionai.v1.ImageQueryOrBuilder getImageQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * A text-only query.
   * </pre>
   *
   * <code>string text_query = 3;</code>
   *
   * @return Whether the textQuery field is set.
   */
  boolean hasTextQuery();
  /**
   *
   *
   * <pre>
   * A text-only query.
   * </pre>
   *
   * <code>string text_query = 3;</code>
   *
   * @return The textQuery.
   */
  java.lang.String getTextQuery();
  /**
   *
   *
   * <pre>
   * A text-only query.
   * </pre>
   *
   * <code>string text_query = 3;</code>
   *
   * @return The bytes for textQuery.
   */
  com.google.protobuf.ByteString getTextQueryBytes();

  /**
   *
   *
   * <pre>
   * Required. The index endpoint to search.
   * Format:
   * `projects/{project_id}/locations/{location_id}/indexEndpoints/{index_endpoint_id}'
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The indexEndpoint.
   */
  java.lang.String getIndexEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The index endpoint to search.
   * Format:
   * `projects/{project_id}/locations/{location_id}/indexEndpoints/{index_endpoint_id}'
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for indexEndpoint.
   */
  com.google.protobuf.ByteString getIndexEndpointBytes();

  /**
   *
   *
   * <pre>
   * Criteria applied to search results.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria criteria = 4;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.Criteria> getCriteriaList();
  /**
   *
   *
   * <pre>
   * Criteria applied to search results.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria criteria = 4;</code>
   */
  com.google.cloud.visionai.v1.Criteria getCriteria(int index);
  /**
   *
   *
   * <pre>
   * Criteria applied to search results.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria criteria = 4;</code>
   */
  int getCriteriaCount();
  /**
   *
   *
   * <pre>
   * Criteria applied to search results.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria criteria = 4;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.CriteriaOrBuilder>
      getCriteriaOrBuilderList();
  /**
   *
   *
   * <pre>
   * Criteria applied to search results.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria criteria = 4;</code>
   */
  com.google.cloud.visionai.v1.CriteriaOrBuilder getCriteriaOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Criteria to exclude from search results.
   * Note that `fetch_matched_annotations` will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria exclusion_criteria = 7;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.Criteria> getExclusionCriteriaList();
  /**
   *
   *
   * <pre>
   * Criteria to exclude from search results.
   * Note that `fetch_matched_annotations` will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria exclusion_criteria = 7;</code>
   */
  com.google.cloud.visionai.v1.Criteria getExclusionCriteria(int index);
  /**
   *
   *
   * <pre>
   * Criteria to exclude from search results.
   * Note that `fetch_matched_annotations` will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria exclusion_criteria = 7;</code>
   */
  int getExclusionCriteriaCount();
  /**
   *
   *
   * <pre>
   * Criteria to exclude from search results.
   * Note that `fetch_matched_annotations` will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria exclusion_criteria = 7;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.CriteriaOrBuilder>
      getExclusionCriteriaOrBuilderList();
  /**
   *
   *
   * <pre>
   * Criteria to exclude from search results.
   * Note that `fetch_matched_annotations` will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Criteria exclusion_criteria = 7;</code>
   */
  com.google.cloud.visionai.v1.CriteriaOrBuilder getExclusionCriteriaOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Requested page size. API may return fewer results than requested.
   * If negative, INVALID_ARGUMENT error will be returned.
   * If unspecified or 0, API will pick a default size, which is 10.
   * If the requested page size is larger than the maximum size, API will pick
   * the maximum size, which is 100.
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The continuation token to fetch the next page. If empty, it means it is
   * fetching the first page.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The continuation token to fetch the next page. If empty, it means it is
   * fetching the first page.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  com.google.cloud.visionai.v1.SearchIndexEndpointRequest.QueryCase getQueryCase();
}
