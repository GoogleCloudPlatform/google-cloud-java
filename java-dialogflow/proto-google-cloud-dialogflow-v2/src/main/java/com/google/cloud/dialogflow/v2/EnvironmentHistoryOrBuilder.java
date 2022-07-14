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
// source: google/cloud/dialogflow/v2/environment.proto

package com.google.cloud.dialogflow.v2;

public interface EnvironmentHistoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.EnvironmentHistory)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the environment this history is for.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *    ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * The environment ID for the default environment is `-`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Output only. The name of the environment this history is for.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *    ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * The environment ID for the default environment is `-`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Output only. The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EnvironmentHistory.Entry entries = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.EnvironmentHistory.Entry> getEntriesList();
  /**
   *
   *
   * <pre>
   * Output only. The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EnvironmentHistory.Entry entries = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EnvironmentHistory.Entry getEntries(int index);
  /**
   *
   *
   * <pre>
   * Output only. The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EnvironmentHistory.Entry entries = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getEntriesCount();
  /**
   *
   *
   * <pre>
   * Output only. The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EnvironmentHistory.Entry entries = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.EnvironmentHistory.EntryOrBuilder>
      getEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EnvironmentHistory.Entry entries = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EnvironmentHistory.EntryOrBuilder getEntriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Output only. Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
