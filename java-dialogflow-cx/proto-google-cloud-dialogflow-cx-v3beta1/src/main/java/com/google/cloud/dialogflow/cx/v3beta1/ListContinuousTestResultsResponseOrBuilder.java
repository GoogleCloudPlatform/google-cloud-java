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
// source: google/cloud/dialogflow/cx/v3beta1/environment.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ListContinuousTestResultsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ListContinuousTestResultsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult>
      getContinuousTestResultsList();
  /**
   *
   *
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult getContinuousTestResults(int index);
  /**
   *
   *
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;
   * </code>
   */
  int getContinuousTestResultsCount();
  /**
   *
   *
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResultOrBuilder>
      getContinuousTestResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of continuous test results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ContinuousTestResult continuous_test_results = 1;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ContinuousTestResultOrBuilder
      getContinuousTestResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
