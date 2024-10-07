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
// source: google/cloud/discoveryengine/v1/completion_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface CompleteQueryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.CompleteQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent data store resource name for which the completion is
   * performed, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/default_data_store`.
   * </pre>
   *
   * <code>
   * string data_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The dataStore.
   */
  java.lang.String getDataStore();
  /**
   *
   *
   * <pre>
   * Required. The parent data store resource name for which the completion is
   * performed, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/default_data_store`.
   * </pre>
   *
   * <code>
   * string data_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for dataStore.
   */
  com.google.protobuf.ByteString getDataStoreBytes();

  /**
   *
   *
   * <pre>
   * Required. The typeahead input used to fetch suggestions. Maximum length is
   * 128 characters.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. The typeahead input used to fetch suggestions. Maximum length is
   * 128 characters.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Specifies the autocomplete data model. This overrides any model specified
   * in the Configuration &gt; Autocomplete section of the Cloud console. Currently
   * supported values:
   *
   * * `document` - Using suggestions generated from user-imported documents.
   * * `search-history` - Using suggestions generated from the past history of
   * [SearchService.Search][google.cloud.discoveryengine.v1.SearchService.Search]
   * API calls. Do not use it when there is no traffic for Search API.
   * * `user-event` - Using suggestions generated from user-imported search
   * events.
   * * `document-completable` - Using suggestions taken directly from
   * user-imported document fields marked as completable.
   *
   * Default values:
   *
   * * `document` is the default model for regular dataStores.
   * * `search-history` is the default model for site search dataStores.
   * </pre>
   *
   * <code>string query_model = 3;</code>
   *
   * @return The queryModel.
   */
  java.lang.String getQueryModel();
  /**
   *
   *
   * <pre>
   * Specifies the autocomplete data model. This overrides any model specified
   * in the Configuration &gt; Autocomplete section of the Cloud console. Currently
   * supported values:
   *
   * * `document` - Using suggestions generated from user-imported documents.
   * * `search-history` - Using suggestions generated from the past history of
   * [SearchService.Search][google.cloud.discoveryengine.v1.SearchService.Search]
   * API calls. Do not use it when there is no traffic for Search API.
   * * `user-event` - Using suggestions generated from user-imported search
   * events.
   * * `document-completable` - Using suggestions taken directly from
   * user-imported document fields marked as completable.
   *
   * Default values:
   *
   * * `document` is the default model for regular dataStores.
   * * `search-history` is the default model for site search dataStores.
   * </pre>
   *
   * <code>string query_model = 3;</code>
   *
   * @return The bytes for queryModel.
   */
  com.google.protobuf.ByteString getQueryModelBytes();

  /**
   *
   *
   * <pre>
   * A unique identifier for tracking visitors. For example, this could be
   * implemented with an HTTP cookie, which should be able to uniquely identify
   * a visitor on a single device. This unique identifier should not change if
   * the visitor logs in or out of the website.
   *
   * This field should NOT have a fixed value such as `unknown_visitor`.
   *
   * This should be the same identifier as
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1.UserEvent.user_pseudo_id]
   * and
   * [SearchRequest.user_pseudo_id][google.cloud.discoveryengine.v1.SearchRequest.user_pseudo_id].
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string user_pseudo_id = 4;</code>
   *
   * @return The userPseudoId.
   */
  java.lang.String getUserPseudoId();
  /**
   *
   *
   * <pre>
   * A unique identifier for tracking visitors. For example, this could be
   * implemented with an HTTP cookie, which should be able to uniquely identify
   * a visitor on a single device. This unique identifier should not change if
   * the visitor logs in or out of the website.
   *
   * This field should NOT have a fixed value such as `unknown_visitor`.
   *
   * This should be the same identifier as
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1.UserEvent.user_pseudo_id]
   * and
   * [SearchRequest.user_pseudo_id][google.cloud.discoveryengine.v1.SearchRequest.user_pseudo_id].
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string user_pseudo_id = 4;</code>
   *
   * @return The bytes for userPseudoId.
   */
  com.google.protobuf.ByteString getUserPseudoIdBytes();

  /**
   *
   *
   * <pre>
   * Indicates if tail suggestions should be returned if there are no
   * suggestions that match the full query. Even if set to true, if there are
   * suggestions that match the full query, those are returned and no
   * tail suggestions are returned.
   * </pre>
   *
   * <code>bool include_tail_suggestions = 5;</code>
   *
   * @return The includeTailSuggestions.
   */
  boolean getIncludeTailSuggestions();
}
