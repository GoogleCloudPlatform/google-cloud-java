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
// source: google/cloud/datacatalog/v1beta1/tags.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1beta1;

public interface TagFieldOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.TagField)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The display name of this field.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The display name of this field.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with double type.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with double type.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with string type.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with string type.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with string type.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with boolean type.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   *
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with boolean type.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   *
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with timestamp type.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 5;</code>
   *
   * @return Whether the timestampValue field is set.
   */
  boolean hasTimestampValue();
  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with timestamp type.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 5;</code>
   *
   * @return The timestampValue.
   */
  com.google.protobuf.Timestamp getTimestampValue();
  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with timestamp type.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with enum type. This value must be
   * one of the allowed values in the definition of this enum.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagField.EnumValue enum_value = 6;</code>
   *
   * @return Whether the enumValue field is set.
   */
  boolean hasEnumValue();
  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with enum type. This value must be
   * one of the allowed values in the definition of this enum.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagField.EnumValue enum_value = 6;</code>
   *
   * @return The enumValue.
   */
  com.google.cloud.datacatalog.v1beta1.TagField.EnumValue getEnumValue();
  /**
   *
   *
   * <pre>
   * Holds the value for a tag field with enum type. This value must be
   * one of the allowed values in the definition of this enum.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagField.EnumValue enum_value = 6;</code>
   */
  com.google.cloud.datacatalog.v1beta1.TagField.EnumValueOrBuilder getEnumValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The order of this field with respect to other fields in this
   * tag. It can be set in
   * [Tag][google.cloud.datacatalog.v1beta1.TagTemplateField.order]. For
   * example, a higher value can indicate a more important field. The value can
   * be negative. Multiple fields can have the same order, and field orders
   * within a tag do not have to be sequential.
   * </pre>
   *
   * <code>int32 order = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The order.
   */
  int getOrder();

  com.google.cloud.datacatalog.v1beta1.TagField.KindCase getKindCase();
}
