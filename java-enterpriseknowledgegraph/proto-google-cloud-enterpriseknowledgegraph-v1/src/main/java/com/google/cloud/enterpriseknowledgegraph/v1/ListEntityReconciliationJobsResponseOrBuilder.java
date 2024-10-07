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
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.enterpriseknowledgegraph.v1;

public interface ListEntityReconciliationJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.enterpriseknowledgegraph.v1.ListEntityReconciliationJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of EntityReconciliationJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_jobs = 1;
   * </code>
   */
  java.util.List<com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob>
      getEntityReconciliationJobsList();
  /**
   *
   *
   * <pre>
   * A list of EntityReconciliationJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_jobs = 1;
   * </code>
   */
  com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob getEntityReconciliationJobs(
      int index);
  /**
   *
   *
   * <pre>
   * A list of EntityReconciliationJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_jobs = 1;
   * </code>
   */
  int getEntityReconciliationJobsCount();
  /**
   *
   *
   * <pre>
   * A list of EntityReconciliationJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_jobs = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJobOrBuilder>
      getEntityReconciliationJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of EntityReconciliationJobs that matches the specified filter in the
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_jobs = 1;
   * </code>
   */
  com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJobOrBuilder
      getEntityReconciliationJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The standard List next-page token.
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
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
