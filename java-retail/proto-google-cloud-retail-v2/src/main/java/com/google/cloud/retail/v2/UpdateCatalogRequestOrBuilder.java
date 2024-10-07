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
// source: google/cloud/retail/v2/catalog_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2;

public interface UpdateCatalogRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.UpdateCatalogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [Catalog][google.cloud.retail.v2.Catalog] to update.
   *
   * If the caller does not have permission to update the
   * [Catalog][google.cloud.retail.v2.Catalog], regardless of whether or not it
   * exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Catalog][google.cloud.retail.v2.Catalog] to update does not exist,
   * a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the catalog field is set.
   */
  boolean hasCatalog();
  /**
   *
   *
   * <pre>
   * Required. The [Catalog][google.cloud.retail.v2.Catalog] to update.
   *
   * If the caller does not have permission to update the
   * [Catalog][google.cloud.retail.v2.Catalog], regardless of whether or not it
   * exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Catalog][google.cloud.retail.v2.Catalog] to update does not exist,
   * a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The catalog.
   */
  com.google.cloud.retail.v2.Catalog getCatalog();
  /**
   *
   *
   * <pre>
   * Required. The [Catalog][google.cloud.retail.v2.Catalog] to update.
   *
   * If the caller does not have permission to update the
   * [Catalog][google.cloud.retail.v2.Catalog], regardless of whether or not it
   * exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Catalog][google.cloud.retail.v2.Catalog] to update does not exist,
   * a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Catalog catalog = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2.CatalogOrBuilder getCatalogOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Catalog][google.cloud.retail.v2.Catalog] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
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
   * Indicates which fields in the provided
   * [Catalog][google.cloud.retail.v2.Catalog] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
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
   * Indicates which fields in the provided
   * [Catalog][google.cloud.retail.v2.Catalog] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
