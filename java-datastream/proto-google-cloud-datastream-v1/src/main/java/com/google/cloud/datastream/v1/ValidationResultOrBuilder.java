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
// source: google/cloud/datastream/v1/datastream_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datastream.v1;

public interface ValidationResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.ValidationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  java.util.List<com.google.cloud.datastream.v1.Validation> getValidationsList();
  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  com.google.cloud.datastream.v1.Validation getValidations(int index);
  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  int getValidationsCount();
  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1.ValidationOrBuilder>
      getValidationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  com.google.cloud.datastream.v1.ValidationOrBuilder getValidationsOrBuilder(int index);
}
