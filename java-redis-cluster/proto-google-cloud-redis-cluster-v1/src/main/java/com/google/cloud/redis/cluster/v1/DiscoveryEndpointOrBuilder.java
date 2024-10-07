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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.redis.cluster.v1;

public interface DiscoveryEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.cluster.v1.DiscoveryEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Address of the exposed Redis endpoint used by clients to
   * connect to the service. The address could be either IP or hostname.
   * </pre>
   *
   * <code>string address = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   *
   *
   * <pre>
   * Output only. Address of the exposed Redis endpoint used by clients to
   * connect to the service. The address could be either IP or hostname.
   * </pre>
   *
   * <code>string address = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString getAddressBytes();

  /**
   *
   *
   * <pre>
   * Output only. The port number of the exposed Redis endpoint.
   * </pre>
   *
   * <code>int32 port = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Output only. Customer configuration for where the endpoint is created and
   * accessed from.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.PscConfig psc_config = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the pscConfig field is set.
   */
  boolean hasPscConfig();
  /**
   *
   *
   * <pre>
   * Output only. Customer configuration for where the endpoint is created and
   * accessed from.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.PscConfig psc_config = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pscConfig.
   */
  com.google.cloud.redis.cluster.v1.PscConfig getPscConfig();
  /**
   *
   *
   * <pre>
   * Output only. Customer configuration for where the endpoint is created and
   * accessed from.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.PscConfig psc_config = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscConfigOrBuilder getPscConfigOrBuilder();
}
