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
// source: google/cloud/apihub/v1/runtime_project_attachment_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.apihub.v1;

public interface LookupRuntimeProjectAttachmentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.LookupRuntimeProjectAttachmentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Runtime project attachment for a project if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.RuntimeProjectAttachment runtime_project_attachment = 1;</code>
   *
   * @return Whether the runtimeProjectAttachment field is set.
   */
  boolean hasRuntimeProjectAttachment();
  /**
   *
   *
   * <pre>
   * Runtime project attachment for a project if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.RuntimeProjectAttachment runtime_project_attachment = 1;</code>
   *
   * @return The runtimeProjectAttachment.
   */
  com.google.cloud.apihub.v1.RuntimeProjectAttachment getRuntimeProjectAttachment();
  /**
   *
   *
   * <pre>
   * Runtime project attachment for a project if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.RuntimeProjectAttachment runtime_project_attachment = 1;</code>
   */
  com.google.cloud.apihub.v1.RuntimeProjectAttachmentOrBuilder
      getRuntimeProjectAttachmentOrBuilder();
}
