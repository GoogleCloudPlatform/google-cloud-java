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
// source: google/cloud/retail/v2beta/import_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2beta;

public interface UserEventInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.UserEventInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Inline source for the input content for UserEvents.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.UserEventInlineSource user_event_inline_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userEventInlineSource field is set.
   */
  boolean hasUserEventInlineSource();
  /**
   *
   *
   * <pre>
   * Required. The Inline source for the input content for UserEvents.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.UserEventInlineSource user_event_inline_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userEventInlineSource.
   */
  com.google.cloud.retail.v2beta.UserEventInlineSource getUserEventInlineSource();
  /**
   *
   *
   * <pre>
   * Required. The Inline source for the input content for UserEvents.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.UserEventInlineSource user_event_inline_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2beta.UserEventInlineSourceOrBuilder getUserEventInlineSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.GcsSource gcs_source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.GcsSource gcs_source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.retail.v2beta.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.GcsSource gcs_source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2beta.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. BigQuery input source.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.BigQuerySource big_query_source = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the bigQuerySource field is set.
   */
  boolean hasBigQuerySource();
  /**
   *
   *
   * <pre>
   * Required. BigQuery input source.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.BigQuerySource big_query_source = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bigQuerySource.
   */
  com.google.cloud.retail.v2beta.BigQuerySource getBigQuerySource();
  /**
   *
   *
   * <pre>
   * Required. BigQuery input source.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.BigQuerySource big_query_source = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2beta.BigQuerySourceOrBuilder getBigQuerySourceOrBuilder();

  com.google.cloud.retail.v2beta.UserEventInputConfig.SourceCase getSourceCase();
}
