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
// source: google/cloud/networkservices/v1/dep.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkservices.v1;

public interface CreateLbRouteExtensionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.CreateLbRouteExtensionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource of the `LbRouteExtension` resource. Must be
   * in the format `projects/{project}/locations/{location}`.
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
   * Required. The parent resource of the `LbRouteExtension` resource. Must be
   * in the format `projects/{project}/locations/{location}`.
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
   * Required. User-provided ID of the `LbRouteExtension` resource to be
   * created.
   * </pre>
   *
   * <code>string lb_route_extension_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The lbRouteExtensionId.
   */
  java.lang.String getLbRouteExtensionId();
  /**
   *
   *
   * <pre>
   * Required. User-provided ID of the `LbRouteExtension` resource to be
   * created.
   * </pre>
   *
   * <code>string lb_route_extension_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for lbRouteExtensionId.
   */
  com.google.protobuf.ByteString getLbRouteExtensionIdBytes();

  /**
   *
   *
   * <pre>
   * Required. `LbRouteExtension` resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.LbRouteExtension lb_route_extension = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the lbRouteExtension field is set.
   */
  boolean hasLbRouteExtension();
  /**
   *
   *
   * <pre>
   * Required. `LbRouteExtension` resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.LbRouteExtension lb_route_extension = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The lbRouteExtension.
   */
  com.google.cloud.networkservices.v1.LbRouteExtension getLbRouteExtension();
  /**
   *
   *
   * <pre>
   * Required. `LbRouteExtension` resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.LbRouteExtension lb_route_extension = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.LbRouteExtensionOrBuilder getLbRouteExtensionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server can ignore
   * the request if it has already been completed. The server guarantees
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, ignores the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server can ignore
   * the request if it has already been completed. The server guarantees
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, ignores the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
