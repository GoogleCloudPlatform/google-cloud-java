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
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface CreateFeaturestoreRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateFeaturestoreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create Featurestores.
   * Format:
   * `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location to create Featurestores.
   * Format:
   * `projects/{project}/locations/{location}`
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
   * Required. The Featurestore to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Featurestore featurestore = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the featurestore field is set.
   */
  boolean hasFeaturestore();
  /**
   *
   *
   * <pre>
   * Required. The Featurestore to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Featurestore featurestore = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The featurestore.
   */
  com.google.cloud.aiplatform.v1beta1.Featurestore getFeaturestore();
  /**
   *
   *
   * <pre>
   * Required. The Featurestore to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Featurestore featurestore = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreOrBuilder getFeaturestoreOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for this Featurestore, which will become the final
   * component of the Featurestore's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within the project and location.
   * </pre>
   *
   * <code>string featurestore_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The featurestoreId.
   */
  java.lang.String getFeaturestoreId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for this Featurestore, which will become the final
   * component of the Featurestore's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within the project and location.
   * </pre>
   *
   * <code>string featurestore_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for featurestoreId.
   */
  com.google.protobuf.ByteString getFeaturestoreIdBytes();
}
