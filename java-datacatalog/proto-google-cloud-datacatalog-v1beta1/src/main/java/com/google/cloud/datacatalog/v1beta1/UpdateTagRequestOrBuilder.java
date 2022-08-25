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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

public interface UpdateTagRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.UpdateTagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The updated tag. The "name" field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tag field is set.
   */
  boolean hasTag();
  /**
   *
   *
   * <pre>
   * Required. The updated tag. The "name" field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tag.
   */
  com.google.cloud.datacatalog.v1beta1.Tag getTag();
  /**
   *
   *
   * <pre>
   * Required. The updated tag. The "name" field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.TagOrBuilder getTagOrBuilder();

  /**
   *
   *
   * <pre>
   * The fields to update on the Tag. If absent or empty, all modifiable fields
   * are updated. Currently the only modifiable field is the field `fields`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update on the Tag. If absent or empty, all modifiable fields
   * are updated. Currently the only modifiable field is the field `fields`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update on the Tag. If absent or empty, all modifiable fields
   * are updated. Currently the only modifiable field is the field `fields`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
