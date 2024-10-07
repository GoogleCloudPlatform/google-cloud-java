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
// source: google/cloud/networkservices/v1/grpc_route.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkservices.v1;

public interface CreateGrpcRouteRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.CreateGrpcRouteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource of the GrpcRoute. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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
   * Required. The parent resource of the GrpcRoute. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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
   * Required. Short name of the GrpcRoute resource to be created.
   * </pre>
   *
   * <code>string grpc_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The grpcRouteId.
   */
  java.lang.String getGrpcRouteId();
  /**
   *
   *
   * <pre>
   * Required. Short name of the GrpcRoute resource to be created.
   * </pre>
   *
   * <code>string grpc_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for grpcRouteId.
   */
  com.google.protobuf.ByteString getGrpcRouteIdBytes();

  /**
   *
   *
   * <pre>
   * Required. GrpcRoute resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.GrpcRoute grpc_route = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the grpcRoute field is set.
   */
  boolean hasGrpcRoute();
  /**
   *
   *
   * <pre>
   * Required. GrpcRoute resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.GrpcRoute grpc_route = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The grpcRoute.
   */
  com.google.cloud.networkservices.v1.GrpcRoute getGrpcRoute();
  /**
   *
   *
   * <pre>
   * Required. GrpcRoute resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.GrpcRoute grpc_route = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.GrpcRouteOrBuilder getGrpcRouteOrBuilder();
}
