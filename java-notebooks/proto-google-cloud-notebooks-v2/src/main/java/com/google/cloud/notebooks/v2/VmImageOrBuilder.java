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
// source: google/cloud/notebooks/v2/gce_setup.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.notebooks.v2;

public interface VmImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v2.VmImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Google Cloud project that this VM image belongs
   * to. Format: `{project_id}`
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Required. The name of the Google Cloud project that this VM image belongs
   * to. Format: `{project_id}`
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Optional. Use VM image name to find the image.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Optional. Use VM image name to find the image.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optional. Use VM image name to find the image.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Use this VM image family to find the image; the newest image in
   * this family will be used.
   * </pre>
   *
   * <code>string family = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the family field is set.
   */
  boolean hasFamily();
  /**
   *
   *
   * <pre>
   * Optional. Use this VM image family to find the image; the newest image in
   * this family will be used.
   * </pre>
   *
   * <code>string family = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The family.
   */
  java.lang.String getFamily();
  /**
   *
   *
   * <pre>
   * Optional. Use this VM image family to find the image; the newest image in
   * this family will be used.
   * </pre>
   *
   * <code>string family = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for family.
   */
  com.google.protobuf.ByteString getFamilyBytes();

  com.google.cloud.notebooks.v2.VmImage.ImageCase getImageCase();
}
