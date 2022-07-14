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
// source: google/cloud/automl/v1/service.proto

package com.google.cloud.automl.v1;

public interface ListModelsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.ListModelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the project, from which to list the models.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the project, from which to list the models.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * An expression for filtering the results of the request.
   *   * `model_metadata` - for existence of the case (e.g.
   *             `video_classification_model_metadata:*`).
   *   * `dataset_id` - for = or !=. Some examples of using the filter are:
   *   * `image_classification_model_metadata:*` --&gt; The model has
   *                                      `image_classification_model_metadata`.
   *   * `dataset_id=5` --&gt; The model was created from a dataset with ID 5.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * An expression for filtering the results of the request.
   *   * `model_metadata` - for existence of the case (e.g.
   *             `video_classification_model_metadata:*`).
   *   * `dataset_id` - for = or !=. Some examples of using the filter are:
   *   * `image_classification_model_metadata:*` --&gt; The model has
   *                                      `image_classification_model_metadata`.
   *   * `dataset_id=5` --&gt; The model was created from a dataset with ID 5.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Requested page size.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return
   * Typically obtained via
   * [ListModelsResponse.next_page_token][google.cloud.automl.v1.ListModelsResponse.next_page_token] of the previous
   * [AutoMl.ListModels][google.cloud.automl.v1.AutoMl.ListModels] call.
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
   * A token identifying a page of results for the server to return
   * Typically obtained via
   * [ListModelsResponse.next_page_token][google.cloud.automl.v1.ListModelsResponse.next_page_token] of the previous
   * [AutoMl.ListModels][google.cloud.automl.v1.AutoMl.ListModels] call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
