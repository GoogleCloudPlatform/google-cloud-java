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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface HttpFaultAbortOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpFaultAbort)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
   * </pre>
   *
   * <code>optional uint32 http_status = 468949897;</code>
   *
   * @return Whether the httpStatus field is set.
   */
  boolean hasHttpStatus();
  /**
   *
   *
   * <pre>
   * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
   * </pre>
   *
   * <code>optional uint32 http_status = 468949897;</code>
   *
   * @return The httpStatus.
   */
  int getHttpStatus();

  /**
   *
   *
   * <pre>
   * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
   * </pre>
   *
   * <code>optional double percentage = 151909018;</code>
   *
   * @return Whether the percentage field is set.
   */
  boolean hasPercentage();
  /**
   *
   *
   * <pre>
   * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
   * </pre>
   *
   * <code>optional double percentage = 151909018;</code>
   *
   * @return The percentage.
   */
  double getPercentage();
}
