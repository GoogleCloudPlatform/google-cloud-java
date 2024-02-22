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
// source: google/cloud/aiplatform/v1beta1/custom_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ContainerSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ContainerSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The URI of a container image in the Container Registry that is to
   * be run on each worker replica.
   * </pre>
   *
   * <code>string image_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The imageUri.
   */
  java.lang.String getImageUri();
  /**
   *
   *
   * <pre>
   * Required. The URI of a container image in the Container Registry that is to
   * be run on each worker replica.
   * </pre>
   *
   * <code>string image_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for imageUri.
   */
  com.google.protobuf.ByteString getImageUriBytes();

  /**
   *
   *
   * <pre>
   * The command to be invoked when the container is started.
   * It overrides the entrypoint instruction in Dockerfile when provided.
   * </pre>
   *
   * <code>repeated string command = 2;</code>
   *
   * @return A list containing the command.
   */
  java.util.List<java.lang.String> getCommandList();
  /**
   *
   *
   * <pre>
   * The command to be invoked when the container is started.
   * It overrides the entrypoint instruction in Dockerfile when provided.
   * </pre>
   *
   * <code>repeated string command = 2;</code>
   *
   * @return The count of command.
   */
  int getCommandCount();
  /**
   *
   *
   * <pre>
   * The command to be invoked when the container is started.
   * It overrides the entrypoint instruction in Dockerfile when provided.
   * </pre>
   *
   * <code>repeated string command = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The command at the given index.
   */
  java.lang.String getCommand(int index);
  /**
   *
   *
   * <pre>
   * The command to be invoked when the container is started.
   * It overrides the entrypoint instruction in Dockerfile when provided.
   * </pre>
   *
   * <code>repeated string command = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the command at the given index.
   */
  com.google.protobuf.ByteString getCommandBytes(int index);

  /**
   *
   *
   * <pre>
   * The arguments to be passed when starting the container.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @return A list containing the args.
   */
  java.util.List<java.lang.String> getArgsList();
  /**
   *
   *
   * <pre>
   * The arguments to be passed when starting the container.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @return The count of args.
   */
  int getArgsCount();
  /**
   *
   *
   * <pre>
   * The arguments to be passed when starting the container.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  java.lang.String getArgs(int index);
  /**
   *
   *
   * <pre>
   * The arguments to be passed when starting the container.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the args at the given index.
   */
  com.google.protobuf.ByteString getArgsBytes(int index);

  /**
   *
   *
   * <pre>
   * Environment variables to be passed to the container.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 4;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.EnvVar> getEnvList();
  /**
   *
   *
   * <pre>
   * Environment variables to be passed to the container.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 4;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EnvVar getEnv(int index);
  /**
   *
   *
   * <pre>
   * Environment variables to be passed to the container.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 4;</code>
   */
  int getEnvCount();
  /**
   *
   *
   * <pre>
   * Environment variables to be passed to the container.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 4;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.EnvVarOrBuilder>
      getEnvOrBuilderList();
  /**
   *
   *
   * <pre>
   * Environment variables to be passed to the container.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 4;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EnvVarOrBuilder getEnvOrBuilder(int index);
}
