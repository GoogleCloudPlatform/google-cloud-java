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
// source: google/dataflow/v1beta3/environment.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

public interface SdkHarnessContainerImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.SdkHarnessContainerImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A docker container image that resides in Google Container Registry.
   * </pre>
   *
   * <code>string container_image = 1;</code>
   *
   * @return The containerImage.
   */
  java.lang.String getContainerImage();
  /**
   *
   *
   * <pre>
   * A docker container image that resides in Google Container Registry.
   * </pre>
   *
   * <code>string container_image = 1;</code>
   *
   * @return The bytes for containerImage.
   */
  com.google.protobuf.ByteString getContainerImageBytes();

  /**
   *
   *
   * <pre>
   * If true, recommends the Dataflow service to use only one core per SDK
   * container instance with this image. If false (or unset) recommends using
   * more than one core per SDK container instance with this image for
   * efficiency. Note that Dataflow service may choose to override this property
   * if needed.
   * </pre>
   *
   * <code>bool use_single_core_per_container = 2;</code>
   *
   * @return The useSingleCorePerContainer.
   */
  boolean getUseSingleCorePerContainer();

  /**
   *
   *
   * <pre>
   * Environment ID for the Beam runner API proto Environment that corresponds
   * to the current SDK Harness.
   * </pre>
   *
   * <code>string environment_id = 3;</code>
   *
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   *
   *
   * <pre>
   * Environment ID for the Beam runner API proto Environment that corresponds
   * to the current SDK Harness.
   * </pre>
   *
   * <code>string environment_id = 3;</code>
   *
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString getEnvironmentIdBytes();

  /**
   *
   *
   * <pre>
   * The set of capabilities enumerated in the above Environment proto. See also
   * https://github.com/apache/beam/blob/master/model/pipeline/src/main/proto/beam_runner_api.proto
   * </pre>
   *
   * <code>repeated string capabilities = 4;</code>
   *
   * @return A list containing the capabilities.
   */
  java.util.List<java.lang.String> getCapabilitiesList();
  /**
   *
   *
   * <pre>
   * The set of capabilities enumerated in the above Environment proto. See also
   * https://github.com/apache/beam/blob/master/model/pipeline/src/main/proto/beam_runner_api.proto
   * </pre>
   *
   * <code>repeated string capabilities = 4;</code>
   *
   * @return The count of capabilities.
   */
  int getCapabilitiesCount();
  /**
   *
   *
   * <pre>
   * The set of capabilities enumerated in the above Environment proto. See also
   * https://github.com/apache/beam/blob/master/model/pipeline/src/main/proto/beam_runner_api.proto
   * </pre>
   *
   * <code>repeated string capabilities = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The capabilities at the given index.
   */
  java.lang.String getCapabilities(int index);
  /**
   *
   *
   * <pre>
   * The set of capabilities enumerated in the above Environment proto. See also
   * https://github.com/apache/beam/blob/master/model/pipeline/src/main/proto/beam_runner_api.proto
   * </pre>
   *
   * <code>repeated string capabilities = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the capabilities at the given index.
   */
  com.google.protobuf.ByteString getCapabilitiesBytes(int index);
}
