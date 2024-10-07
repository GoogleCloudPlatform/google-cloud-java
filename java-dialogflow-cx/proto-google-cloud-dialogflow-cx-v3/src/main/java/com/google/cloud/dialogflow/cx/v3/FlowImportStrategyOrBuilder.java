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
// source: google/cloud/dialogflow/cx/v3/flow.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public interface FlowImportStrategyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.FlowImportStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Import strategy for resource conflict resolution, applied
   * globally throughout the flow. It will be applied for all display name
   * conflicts in the imported content. If not specified, 'CREATE_NEW' is
   * assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ImportStrategy global_import_strategy = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for globalImportStrategy.
   */
  int getGlobalImportStrategyValue();
  /**
   *
   *
   * <pre>
   * Optional. Import strategy for resource conflict resolution, applied
   * globally throughout the flow. It will be applied for all display name
   * conflicts in the imported content. If not specified, 'CREATE_NEW' is
   * assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ImportStrategy global_import_strategy = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The globalImportStrategy.
   */
  com.google.cloud.dialogflow.cx.v3.ImportStrategy getGlobalImportStrategy();
}
