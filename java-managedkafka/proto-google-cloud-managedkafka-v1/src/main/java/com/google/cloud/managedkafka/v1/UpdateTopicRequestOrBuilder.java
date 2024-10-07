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
// source: google/cloud/managedkafka/v1/managed_kafka.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.managedkafka.v1;

public interface UpdateTopicRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedkafka.v1.UpdateTopicRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Topic resource by the update. The fields specified in the update_mask are
   * relative to the resource, not the full request. A field will be overwritten
   * if it is in the mask. The mask is required and a value of * will update all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Topic resource by the update. The fields specified in the update_mask are
   * relative to the resource, not the full request. A field will be overwritten
   * if it is in the mask. The mask is required and a value of * will update all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Topic resource by the update. The fields specified in the update_mask are
   * relative to the resource, not the full request. A field will be overwritten
   * if it is in the mask. The mask is required and a value of * will update all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The topic to update. Its `name` field must be populated.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Topic topic = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   *
   *
   * <pre>
   * Required. The topic to update. Its `name` field must be populated.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Topic topic = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The topic.
   */
  com.google.cloud.managedkafka.v1.Topic getTopic();
  /**
   *
   *
   * <pre>
   * Required. The topic to update. Its `name` field must be populated.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Topic topic = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.managedkafka.v1.TopicOrBuilder getTopicOrBuilder();
}
