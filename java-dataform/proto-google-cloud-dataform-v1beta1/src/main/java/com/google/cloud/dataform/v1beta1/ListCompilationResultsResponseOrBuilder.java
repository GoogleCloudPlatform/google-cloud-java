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
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataform.v1beta1;

public interface ListCompilationResultsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.ListCompilationResultsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of compilation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CompilationResult compilation_results = 1;</code>
   */
  java.util.List<com.google.cloud.dataform.v1beta1.CompilationResult> getCompilationResultsList();
  /**
   *
   *
   * <pre>
   * List of compilation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CompilationResult compilation_results = 1;</code>
   */
  com.google.cloud.dataform.v1beta1.CompilationResult getCompilationResults(int index);
  /**
   *
   *
   * <pre>
   * List of compilation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CompilationResult compilation_results = 1;</code>
   */
  int getCompilationResultsCount();
  /**
   *
   *
   * <pre>
   * List of compilation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CompilationResult compilation_results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataform.v1beta1.CompilationResultOrBuilder>
      getCompilationResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of compilation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CompilationResult compilation_results = 1;</code>
   */
  com.google.cloud.dataform.v1beta1.CompilationResultOrBuilder getCompilationResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Locations which could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * Locations which could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * Locations which could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * Locations which could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
