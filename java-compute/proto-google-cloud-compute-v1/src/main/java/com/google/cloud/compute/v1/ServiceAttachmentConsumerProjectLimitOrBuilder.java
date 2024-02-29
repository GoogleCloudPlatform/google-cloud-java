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

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ServiceAttachmentConsumerProjectLimitOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The value of the limit to set.
   * </pre>
   *
   * <code>optional uint32 connection_limit = 131403546;</code>
   *
   * @return Whether the connectionLimit field is set.
   */
  boolean hasConnectionLimit();
  /**
   *
   *
   * <pre>
   * The value of the limit to set.
   * </pre>
   *
   * <code>optional uint32 connection_limit = 131403546;</code>
   *
   * @return The connectionLimit.
   */
  int getConnectionLimit();

  /**
   *
   *
   * <pre>
   * The network URL for the network to set the limit for.
   * </pre>
   *
   * <code>optional string network_url = 207194078;</code>
   *
   * @return Whether the networkUrl field is set.
   */
  boolean hasNetworkUrl();
  /**
   *
   *
   * <pre>
   * The network URL for the network to set the limit for.
   * </pre>
   *
   * <code>optional string network_url = 207194078;</code>
   *
   * @return The networkUrl.
   */
  java.lang.String getNetworkUrl();
  /**
   *
   *
   * <pre>
   * The network URL for the network to set the limit for.
   * </pre>
   *
   * <code>optional string network_url = 207194078;</code>
   *
   * @return The bytes for networkUrl.
   */
  com.google.protobuf.ByteString getNetworkUrlBytes();

  /**
   *
   *
   * <pre>
   * The project id or number for the project to set the limit for.
   * </pre>
   *
   * <code>optional string project_id_or_num = 349783336;</code>
   *
   * @return Whether the projectIdOrNum field is set.
   */
  boolean hasProjectIdOrNum();
  /**
   *
   *
   * <pre>
   * The project id or number for the project to set the limit for.
   * </pre>
   *
   * <code>optional string project_id_or_num = 349783336;</code>
   *
   * @return The projectIdOrNum.
   */
  java.lang.String getProjectIdOrNum();
  /**
   *
   *
   * <pre>
   * The project id or number for the project to set the limit for.
   * </pre>
   *
   * <code>optional string project_id_or_num = 349783336;</code>
   *
   * @return The bytes for projectIdOrNum.
   */
  com.google.protobuf.ByteString getProjectIdOrNumBytes();
}
