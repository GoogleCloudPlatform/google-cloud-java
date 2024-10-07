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
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.5
package com.google.cloudbuild.v2;

public interface BatchCreateRepositoriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.BatchCreateRepositoriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The connection to contain all the repositories being created.
   * Format: projects/&#42;&#47;locations/&#42;&#47;connections/&#42;
   * The parent field in the CreateRepositoryRequest messages
   * must either be empty or match this field.
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
   * Required. The connection to contain all the repositories being created.
   * Format: projects/&#42;&#47;locations/&#42;&#47;connections/&#42;
   * The parent field in the CreateRepositoryRequest messages
   * must either be empty or match this field.
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
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloudbuild.v2.CreateRepositoryRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloudbuild.v2.CreateRepositoryRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The request messages specifying the repositories to create.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.cloudbuild.v2.CreateRepositoryRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder getRequestsOrBuilder(int index);
}
