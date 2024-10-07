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
// source: google/cloud/vision/v1/product_search_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vision.v1;

public interface UpdateProductSetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.UpdateProductSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the productSet field is set.
   */
  boolean hasProductSet();
  /**
   *
   *
   * <pre>
   * Required. The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The productSet.
   */
  com.google.cloud.vision.v1.ProductSet getProductSet();
  /**
   *
   *
   * <pre>
   * Required. The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1.ProductSet product_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.vision.v1.ProductSetOrBuilder getProductSetOrBuilder();

  /**
   *
   *
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
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
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
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
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
