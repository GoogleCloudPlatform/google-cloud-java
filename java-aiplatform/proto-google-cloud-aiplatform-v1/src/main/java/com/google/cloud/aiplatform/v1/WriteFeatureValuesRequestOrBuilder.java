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
// source: google/cloud/aiplatform/v1/featurestore_online_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface WriteFeatureValuesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.WriteFeatureValuesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType for the entities being
   * written. Value format:
   * `projects/{project}/locations/{location}/featurestores/
   * {featurestore}/entityTypes/{entityType}`. For example,
   * for a machine learning model predicting user clicks on a website, an
   * EntityType ID could be `user`.
   * </pre>
   *
   * <code>
   * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The entityType.
   */
  java.lang.String getEntityType();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType for the entities being
   * written. Value format:
   * `projects/{project}/locations/{location}/featurestores/
   * {featurestore}/entityTypes/{entityType}`. For example,
   * for a machine learning model predicting user clicks on a website, an
   * EntityType ID could be `user`.
   * </pre>
   *
   * <code>
   * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for entityType.
   */
  com.google.protobuf.ByteString getEntityTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. The entities to be written. Up to 100,000 feature values can be
   * written across all `payloads`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteFeatureValuesPayload payloads = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.WriteFeatureValuesPayload> getPayloadsList();
  /**
   *
   *
   * <pre>
   * Required. The entities to be written. Up to 100,000 feature values can be
   * written across all `payloads`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteFeatureValuesPayload payloads = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.WriteFeatureValuesPayload getPayloads(int index);
  /**
   *
   *
   * <pre>
   * Required. The entities to be written. Up to 100,000 feature values can be
   * written across all `payloads`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteFeatureValuesPayload payloads = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getPayloadsCount();
  /**
   *
   *
   * <pre>
   * Required. The entities to be written. Up to 100,000 feature values can be
   * written across all `payloads`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteFeatureValuesPayload payloads = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.WriteFeatureValuesPayloadOrBuilder>
      getPayloadsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The entities to be written. Up to 100,000 feature values can be
   * written across all `payloads`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteFeatureValuesPayload payloads = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.WriteFeatureValuesPayloadOrBuilder getPayloadsOrBuilder(int index);
}
