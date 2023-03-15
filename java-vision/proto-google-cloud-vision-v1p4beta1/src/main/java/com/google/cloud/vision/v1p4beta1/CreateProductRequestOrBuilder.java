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
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

package com.google.cloud.vision.v1p4beta1;

public interface CreateProductRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.CreateProductRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project in which the Product should be created.
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID`.
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
   * Required. The project in which the Product should be created.
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID`.
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
   * Required. The product to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   *
   *
   * <pre>
   * Required. The product to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The product.
   */
  com.google.cloud.vision.v1p4beta1.Product getProduct();
  /**
   *
   *
   * <pre>
   * Required. The product to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.vision.v1p4beta1.ProductOrBuilder getProductOrBuilder();

  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this Product. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_id = 3;</code>
   *
   * @return The productId.
   */
  java.lang.String getProductId();
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this Product. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_id = 3;</code>
   *
   * @return The bytes for productId.
   */
  com.google.protobuf.ByteString getProductIdBytes();
}
