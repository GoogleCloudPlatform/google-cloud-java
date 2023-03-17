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
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListTensorboardExperimentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListTensorboardExperimentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The TensorboardExperiments mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiments = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.TensorboardExperiment>
      getTensorboardExperimentsList();
  /**
   *
   *
   * <pre>
   * The TensorboardExperiments mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiments = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.TensorboardExperiment getTensorboardExperiments(int index);
  /**
   *
   *
   * <pre>
   * The TensorboardExperiments mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiments = 1;
   * </code>
   */
  int getTensorboardExperimentsCount();
  /**
   *
   *
   * <pre>
   * The TensorboardExperiments mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiments = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder>
      getTensorboardExperimentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The TensorboardExperiments mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardExperiment tensorboard_experiments = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.TensorboardExperimentOrBuilder getTensorboardExperimentsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListTensorboardExperimentsRequest.page_token][google.cloud.aiplatform.v1.ListTensorboardExperimentsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
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
   * A token, which can be sent as
   * [ListTensorboardExperimentsRequest.page_token][google.cloud.aiplatform.v1.ListTensorboardExperimentsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
