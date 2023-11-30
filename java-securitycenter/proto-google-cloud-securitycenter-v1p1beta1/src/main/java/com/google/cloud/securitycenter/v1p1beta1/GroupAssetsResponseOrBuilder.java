/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/securitycenter/v1p1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1p1beta1;

public interface GroupAssetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1p1beta1.GroupAssetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Group results. There exists an element for each existing unique
   * combination of property/values. The element contains a count for the number
   * of times those specific property/values appear.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1p1beta1.GroupResult group_by_results = 1;</code>
   */
  java.util.List<com.google.cloud.securitycenter.v1p1beta1.GroupResult> getGroupByResultsList();
  /**
   *
   *
   * <pre>
   * Group results. There exists an element for each existing unique
   * combination of property/values. The element contains a count for the number
   * of times those specific property/values appear.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1p1beta1.GroupResult group_by_results = 1;</code>
   */
  com.google.cloud.securitycenter.v1p1beta1.GroupResult getGroupByResults(int index);
  /**
   *
   *
   * <pre>
   * Group results. There exists an element for each existing unique
   * combination of property/values. The element contains a count for the number
   * of times those specific property/values appear.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1p1beta1.GroupResult group_by_results = 1;</code>
   */
  int getGroupByResultsCount();
  /**
   *
   *
   * <pre>
   * Group results. There exists an element for each existing unique
   * combination of property/values. The element contains a count for the number
   * of times those specific property/values appear.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1p1beta1.GroupResult group_by_results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v1p1beta1.GroupResultOrBuilder>
      getGroupByResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Group results. There exists an element for each existing unique
   * combination of property/values. The element contains a count for the number
   * of times those specific property/values appear.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1p1beta1.GroupResult group_by_results = 1;</code>
   */
  com.google.cloud.securitycenter.v1p1beta1.GroupResultOrBuilder getGroupByResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Time used for executing the groupBy request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 2;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Time used for executing the groupBy request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 2;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Time used for executing the groupBy request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of results matching the query.
   * </pre>
   *
   * <code>int32 total_size = 4;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();
}
