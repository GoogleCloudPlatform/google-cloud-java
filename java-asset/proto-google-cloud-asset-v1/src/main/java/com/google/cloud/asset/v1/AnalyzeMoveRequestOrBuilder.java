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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.asset.v1;

public interface AnalyzeMoveRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AnalyzeMoveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the resource to perform the analysis against.
   * Only Google Cloud projects are supported as of today. Hence, this can only
   * be a project ID (such as "projects/my-project-id") or a project number
   * (such as "projects/12345").
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Required. Name of the resource to perform the analysis against.
   * Only Google Cloud projects are supported as of today. Hence, this can only
   * be a project ID (such as "projects/my-project-id") or a project number
   * (such as "projects/12345").
   * </pre>
   *
   * <code>
   * string resource = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * Required. Name of the Google Cloud folder or organization to reparent the
   * target resource. The analysis will be performed against hypothetically
   * moving the resource to this specified desitination parent. This can only be
   * a folder number (such as "folders/123") or an organization number (such as
   * "organizations/123").
   * </pre>
   *
   * <code>
   * string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The destinationParent.
   */
  java.lang.String getDestinationParent();
  /**
   *
   *
   * <pre>
   * Required. Name of the Google Cloud folder or organization to reparent the
   * target resource. The analysis will be performed against hypothetically
   * moving the resource to this specified desitination parent. This can only be
   * a folder number (such as "folders/123") or an organization number (such as
   * "organizations/123").
   * </pre>
   *
   * <code>
   * string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for destinationParent.
   */
  com.google.protobuf.ByteString getDestinationParentBytes();

  /**
   *
   *
   * <pre>
   * Analysis view indicating what information should be included in the
   * analysis response. If unspecified, the default view is FULL.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView view = 3;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Analysis view indicating what information should be included in the
   * analysis response. If unspecified, the default view is FULL.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView view = 3;</code>
   *
   * @return The view.
   */
  com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView getView();
}
