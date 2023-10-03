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
// source: google/cloud/aiplatform/v1/migration_service.proto

package com.google.cloud.aiplatform.v1;

public interface BatchMigrateResourcesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.BatchMigrateResourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The location of the migrated resource will live in.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The location of the migrated resource will live in.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The request messages specifying the resources to migrate.
   * They must be in the same location as the destination.
   * Up to 50 resources can be migrated in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.MigrateResourceRequest migrate_resource_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.MigrateResourceRequest>
      getMigrateResourceRequestsList();
  /**
   *
   *
   * <pre>
   * Required. The request messages specifying the resources to migrate.
   * They must be in the same location as the destination.
   * Up to 50 resources can be migrated in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.MigrateResourceRequest migrate_resource_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.MigrateResourceRequest getMigrateResourceRequests(int index);
  /**
   *
   *
   * <pre>
   * Required. The request messages specifying the resources to migrate.
   * They must be in the same location as the destination.
   * Up to 50 resources can be migrated in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.MigrateResourceRequest migrate_resource_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getMigrateResourceRequestsCount();
  /**
   *
   *
   * <pre>
   * Required. The request messages specifying the resources to migrate.
   * They must be in the same location as the destination.
   * Up to 50 resources can be migrated in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.MigrateResourceRequest migrate_resource_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.MigrateResourceRequestOrBuilder>
      getMigrateResourceRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The request messages specifying the resources to migrate.
   * They must be in the same location as the destination.
   * Up to 50 resources can be migrated in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.MigrateResourceRequest migrate_resource_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.MigrateResourceRequestOrBuilder
      getMigrateResourceRequestsOrBuilder(int index);
}
