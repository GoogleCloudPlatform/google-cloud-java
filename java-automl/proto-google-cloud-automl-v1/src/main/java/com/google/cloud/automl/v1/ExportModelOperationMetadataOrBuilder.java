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
// source: google/cloud/automl/v1/operations.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1;

public interface ExportModelOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.ExportModelOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Information further describing the output of this model
   * export.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ExportModelOperationMetadata.ExportModelOutputInfo output_info = 2;
   * </code>
   *
   * @return Whether the outputInfo field is set.
   */
  boolean hasOutputInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information further describing the output of this model
   * export.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ExportModelOperationMetadata.ExportModelOutputInfo output_info = 2;
   * </code>
   *
   * @return The outputInfo.
   */
  com.google.cloud.automl.v1.ExportModelOperationMetadata.ExportModelOutputInfo getOutputInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information further describing the output of this model
   * export.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ExportModelOperationMetadata.ExportModelOutputInfo output_info = 2;
   * </code>
   */
  com.google.cloud.automl.v1.ExportModelOperationMetadata.ExportModelOutputInfoOrBuilder
      getOutputInfoOrBuilder();
}
