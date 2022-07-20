/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface UpdateEntityTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The entity type to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entityType field is set.
   */
  boolean hasEntityType();
  /**
   *
   *
   * <pre>
   * Required. The entity type to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entityType.
   */
  com.google.cloud.dialogflow.v2beta1.EntityType getEntityType();
  /**
   *
   *
   * <pre>
   * Required. The entity type to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder getEntityTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
