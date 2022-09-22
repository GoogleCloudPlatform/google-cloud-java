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
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

public interface CreateSpokeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.CreateSpokeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource.
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
   * Required. The parent resource.
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
   * Required. Unique id for the spoke to create.
   * </pre>
   *
   * <code>string spoke_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The spokeId.
   */
  java.lang.String getSpokeId();
  /**
   *
   *
   * <pre>
   * Required. Unique id for the spoke to create.
   * </pre>
   *
   * <code>string spoke_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for spokeId.
   */
  com.google.protobuf.ByteString getSpokeIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The initial values for a new spoke.
   * </pre>
   *
   * <code>
   * .google.cloud.networkconnectivity.v1.Spoke spoke = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the spoke field is set.
   */
  boolean hasSpoke();
  /**
   *
   *
   * <pre>
   * Required. The initial values for a new spoke.
   * </pre>
   *
   * <code>
   * .google.cloud.networkconnectivity.v1.Spoke spoke = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The spoke.
   */
  com.google.cloud.networkconnectivity.v1.Spoke getSpoke();
  /**
   *
   *
   * <pre>
   * Required. The initial values for a new spoke.
   * </pre>
   *
   * <code>
   * .google.cloud.networkconnectivity.v1.Spoke spoke = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkconnectivity.v1.SpokeOrBuilder getSpokeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A unique request ID (optional). If you specify this ID, you can use it
   * in cases when you need to retry your request. When you need to retry, this
   * ID lets the server know that it can ignore the request if it has already
   * been completed. The server guarantees that for at least 60 minutes after
   * the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check to see whether the original operation
   * was received. If it was, the server ignores the second request. This
   * behavior prevents clients from mistakenly creating duplicate commitments.
   * The request ID must be a valid UUID, with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A unique request ID (optional). If you specify this ID, you can use it
   * in cases when you need to retry your request. When you need to retry, this
   * ID lets the server know that it can ignore the request if it has already
   * been completed. The server guarantees that for at least 60 minutes after
   * the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check to see whether the original operation
   * was received. If it was, the server ignores the second request. This
   * behavior prevents clients from mistakenly creating duplicate commitments.
   * The request ID must be a valid UUID, with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
