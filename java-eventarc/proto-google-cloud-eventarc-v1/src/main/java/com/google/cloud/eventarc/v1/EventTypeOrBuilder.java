/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/eventarc/v1/discovery.proto

package com.google.cloud.eventarc.v1;

public interface EventTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.EventType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The full name of the event type (for example,
   * "google.cloud.storage.object.v1.finalized"). In the form of
   * {provider-specific-prefix}.{resource}.{version}.{verb}. Types MUST be
   * versioned and event schemas are guaranteed to remain backward compatible
   * within one version. Note that event type versions and API versions do not
   * need to match.
   * </pre>
   *
   * <code>string type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Output only. The full name of the event type (for example,
   * "google.cloud.storage.object.v1.finalized"). In the form of
   * {provider-specific-prefix}.{resource}.{version}.{verb}. Types MUST be
   * versioned and event schemas are guaranteed to remain backward compatible
   * within one version. Note that event type versions and API versions do not
   * need to match.
   * </pre>
   *
   * <code>string type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Human friendly description of what the event type is about.
   * For example "Bucket created in Cloud Storage".
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Output only. Human friendly description of what the event type is about.
   * For example "Bucket created in Cloud Storage".
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Filtering attributes for the event type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.FilteringAttribute filtering_attributes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.eventarc.v1.FilteringAttribute> getFilteringAttributesList();
  /**
   *
   *
   * <pre>
   * Output only. Filtering attributes for the event type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.FilteringAttribute filtering_attributes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.eventarc.v1.FilteringAttribute getFilteringAttributes(int index);
  /**
   *
   *
   * <pre>
   * Output only. Filtering attributes for the event type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.FilteringAttribute filtering_attributes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getFilteringAttributesCount();
  /**
   *
   *
   * <pre>
   * Output only. Filtering attributes for the event type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.FilteringAttribute filtering_attributes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.eventarc.v1.FilteringAttributeOrBuilder>
      getFilteringAttributesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Filtering attributes for the event type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.FilteringAttribute filtering_attributes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.eventarc.v1.FilteringAttributeOrBuilder getFilteringAttributesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. URI for the event schema.
   * For example
   * "https://github.com/googleapis/google-cloudevents/blob/master/proto/google/events/cloud/storage/v1/events.proto"
   * </pre>
   *
   * <code>string event_schema_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The eventSchemaUri.
   */
  java.lang.String getEventSchemaUri();
  /**
   *
   *
   * <pre>
   * Output only. URI for the event schema.
   * For example
   * "https://github.com/googleapis/google-cloudevents/blob/master/proto/google/events/cloud/storage/v1/events.proto"
   * </pre>
   *
   * <code>string event_schema_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for eventSchemaUri.
   */
  com.google.protobuf.ByteString getEventSchemaUriBytes();
}
