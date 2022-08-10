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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface CancelOperationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.CancelOperationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.CancelOperationRequest.project_id is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=2928
   * @return The projectId.
   */
  @java.lang.Deprecated
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.CancelOperationRequest.project_id is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=2928
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * operation resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @deprecated google.container.v1beta1.CancelOperationRequest.zone is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=2937
   * @return The zone.
   */
  @java.lang.Deprecated
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * operation resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @deprecated google.container.v1beta1.CancelOperationRequest.zone is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=2937
   * @return The bytes for zone.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The server-assigned `name` of the operation.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string operation_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.CancelOperationRequest.operation_id is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=2944
   * @return The operationId.
   */
  @java.lang.Deprecated
  java.lang.String getOperationId();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The server-assigned `name` of the operation.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string operation_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.CancelOperationRequest.operation_id is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=2944
   * @return The bytes for operationId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getOperationIdBytes();

  /**
   *
   *
   * <pre>
   * The name (project, location, operation id) of the operation to cancel.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;operations/&#42;`.
   * </pre>
   *
   * <code>string name = 4;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name (project, location, operation id) of the operation to cancel.
   * Specified in the format `projects/&#42;&#47;locations/&#42;&#47;operations/&#42;`.
   * </pre>
   *
   * <code>string name = 4;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
