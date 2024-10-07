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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface AnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.Annotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the annotation.
   * Format:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/assets/{asset}/annotations/{annotation}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name of the annotation.
   * Format:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/assets/{asset}/annotations/{annotation}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * User provided annotation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.UserSpecifiedAnnotation user_specified_annotation = 2;</code>
   *
   * @return Whether the userSpecifiedAnnotation field is set.
   */
  boolean hasUserSpecifiedAnnotation();
  /**
   *
   *
   * <pre>
   * User provided annotation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.UserSpecifiedAnnotation user_specified_annotation = 2;</code>
   *
   * @return The userSpecifiedAnnotation.
   */
  com.google.cloud.visionai.v1.UserSpecifiedAnnotation getUserSpecifiedAnnotation();
  /**
   *
   *
   * <pre>
   * User provided annotation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.UserSpecifiedAnnotation user_specified_annotation = 2;</code>
   */
  com.google.cloud.visionai.v1.UserSpecifiedAnnotationOrBuilder
      getUserSpecifiedAnnotationOrBuilder();
}
