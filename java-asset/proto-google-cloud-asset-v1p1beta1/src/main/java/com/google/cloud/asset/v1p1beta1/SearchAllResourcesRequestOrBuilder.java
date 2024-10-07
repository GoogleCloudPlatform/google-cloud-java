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
// source: google/cloud/asset/v1p1beta1/asset_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.asset.v1p1beta1;

public interface SearchAllResourcesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p1beta1.SearchAllResourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative name of an asset. The search is limited to the
   * resources within the `scope`. The allowed value must be:
   *
   * * Organization number (such as "organizations/123")
   * * Folder number (such as "folders/1234")
   * * Project number (such as "projects/12345")
   * * Project ID (such as "projects/abc")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Required. The relative name of an asset. The search is limited to the
   * resources within the `scope`. The allowed value must be:
   *
   * * Organization number (such as "organizations/123")
   * * Folder number (such as "folders/1234")
   * * Project number (such as "projects/12345")
   * * Project ID (such as "projects/abc")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The query statement.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional. The query statement.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the assetTypes.
   */
  java.util.List<java.lang.String> getAssetTypesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of assetTypes.
   */
  int getAssetTypesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The assetTypes at the given index.
   */
  java.lang.String getAssetTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assetTypes at the given index.
   */
  com.google.protobuf.ByteString getAssetTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The page size for search result pagination. Page size is capped
   * at 500 even if a larger value is given. If set to zero, server will pick an
   * appropriate default. Returned results may be fewer than requested. When
   * this happens, there could be more results as long as `next_page_token` is
   * returned.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method.  `page_token` must be the value of
   * `next_page_token` from the previous response. The values of all other
   * method parameters, must be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method.  `page_token` must be the value of
   * `next_page_token` from the previous response. The values of all other
   * method parameters, must be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A comma separated list of fields specifying the sorting order of
   * the results. The default order is ascending. Add ` DESC` after the field
   * name to indicate descending order. Redundant space characters are ignored.
   * For example, `  location DESC ,  name  `.
   * </pre>
   *
   * <code>string order_by = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. A comma separated list of fields specifying the sorting order of
   * the results. The default order is ascending. Add ` DESC` after the field
   * name to indicate descending order. Redundant space characters are ignored.
   * For example, `  location DESC ,  name  `.
   * </pre>
   *
   * <code>string order_by = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
