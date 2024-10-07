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
// source: google/devtools/artifactregistry/v1/repository.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.artifactregistry.v1;

public interface UpdateRepositoryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.UpdateRepositoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The repository that replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
   *
   * @return Whether the repository field is set.
   */
  boolean hasRepository();
  /**
   *
   *
   * <pre>
   * The repository that replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
   *
   * @return The repository.
   */
  com.google.devtools.artifactregistry.v1.Repository getRepository();
  /**
   *
   *
   * <pre>
   * The repository that replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.RepositoryOrBuilder getRepositoryOrBuilder();

  /**
   *
   *
   * <pre>
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
