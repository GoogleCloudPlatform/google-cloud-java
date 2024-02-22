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
// source: google/cloud/aiplatform/v1beta1/feature_registry_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface CreateFeatureGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create FeatureGroups.
   * Format:
   * `projects/{project}/locations/{location}'`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create FeatureGroups.
   * Format:
   * `projects/{project}/locations/{location}'`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The FeatureGroup to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the featureGroup field is set.
   */
  boolean hasFeatureGroup();
  /**
   *
   *
   * <pre>
   * Required. The FeatureGroup to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The featureGroup.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureGroup getFeatureGroup();
  /**
   *
   *
   * <pre>
   * Required. The FeatureGroup to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureGroupOrBuilder getFeatureGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for this FeatureGroup, which will become the final
   * component of the FeatureGroup's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within the project and location.
   * </pre>
   *
   * <code>string feature_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The featureGroupId.
   */
  java.lang.String getFeatureGroupId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for this FeatureGroup, which will become the final
   * component of the FeatureGroup's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within the project and location.
   * </pre>
   *
   * <code>string feature_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for featureGroupId.
   */
  com.google.protobuf.ByteString getFeatureGroupIdBytes();
}
