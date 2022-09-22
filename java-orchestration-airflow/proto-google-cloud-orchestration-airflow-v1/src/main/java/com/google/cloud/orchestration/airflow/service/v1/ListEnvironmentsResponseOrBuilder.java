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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1;

public interface ListEnvironmentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.ListEnvironmentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of environments returned by a ListEnvironmentsRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.Environment environments = 1;
   * </code>
   */
  java.util.List<com.google.cloud.orchestration.airflow.service.v1.Environment>
      getEnvironmentsList();
  /**
   *
   *
   * <pre>
   * The list of environments returned by a ListEnvironmentsRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.Environment environments = 1;
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.Environment getEnvironments(int index);
  /**
   *
   *
   * <pre>
   * The list of environments returned by a ListEnvironmentsRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.Environment environments = 1;
   * </code>
   */
  int getEnvironmentsCount();
  /**
   *
   *
   * <pre>
   * The list of environments returned by a ListEnvironmentsRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.Environment environments = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.orchestration.airflow.service.v1.EnvironmentOrBuilder>
      getEnvironmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of environments returned by a ListEnvironmentsRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.Environment environments = 1;
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.EnvironmentOrBuilder getEnvironmentsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The page token used to query for the next page if one exists.
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
   * The page token used to query for the next page if one exists.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
