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
// source: google/cloud/aiplatform/v1/migration_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface SearchMigratableResourcesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SearchMigratableResourcesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.MigratableResource> getMigratableResourcesList();
  /**
   *
   *
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  com.google.cloud.aiplatform.v1.MigratableResource getMigratableResources(int index);
  /**
   *
   *
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  int getMigratableResourcesCount();
  /**
   *
   *
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder>
      getMigratableResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder getMigratableResourcesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The standard next-page token.
   * The migratable_resources may not fill page_size in
   * SearchMigratableResourcesRequest even when there are subsequent pages.
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
   * The standard next-page token.
   * The migratable_resources may not fill page_size in
   * SearchMigratableResourcesRequest even when there are subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
