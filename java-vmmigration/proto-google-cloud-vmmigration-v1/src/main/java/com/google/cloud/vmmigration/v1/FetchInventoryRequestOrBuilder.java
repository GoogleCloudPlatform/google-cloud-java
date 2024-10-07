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
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vmmigration.v1;

public interface FetchInventoryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.FetchInventoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Source.
   * </pre>
   *
   * <code>
   * string source = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * Required. The name of the Source.
   * </pre>
   *
   * <code>
   * string source = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * If this flag is set to true, the source will be queried instead of using
   * cached results. Using this flag will make the call slower.
   * </pre>
   *
   * <code>bool force_refresh = 2;</code>
   *
   * @return The forceRefresh.
   */
  boolean getForceRefresh();
}
