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
// source: google/cloud/retail/v2beta/catalog_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2beta;

public interface BatchRemoveCatalogAttributesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Catalog attributes that were deleted. Only pre-loaded [catalog
   * attributes][google.cloud.retail.v2beta.CatalogAttribute] that are
   * neither [in
   * use][google.cloud.retail.v2beta.CatalogAttribute.in_use] by
   * products nor predefined can be deleted.
   * </pre>
   *
   * <code>repeated string deleted_catalog_attributes = 1;</code>
   *
   * @return A list containing the deletedCatalogAttributes.
   */
  java.util.List<java.lang.String> getDeletedCatalogAttributesList();
  /**
   *
   *
   * <pre>
   * Catalog attributes that were deleted. Only pre-loaded [catalog
   * attributes][google.cloud.retail.v2beta.CatalogAttribute] that are
   * neither [in
   * use][google.cloud.retail.v2beta.CatalogAttribute.in_use] by
   * products nor predefined can be deleted.
   * </pre>
   *
   * <code>repeated string deleted_catalog_attributes = 1;</code>
   *
   * @return The count of deletedCatalogAttributes.
   */
  int getDeletedCatalogAttributesCount();
  /**
   *
   *
   * <pre>
   * Catalog attributes that were deleted. Only pre-loaded [catalog
   * attributes][google.cloud.retail.v2beta.CatalogAttribute] that are
   * neither [in
   * use][google.cloud.retail.v2beta.CatalogAttribute.in_use] by
   * products nor predefined can be deleted.
   * </pre>
   *
   * <code>repeated string deleted_catalog_attributes = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The deletedCatalogAttributes at the given index.
   */
  java.lang.String getDeletedCatalogAttributes(int index);
  /**
   *
   *
   * <pre>
   * Catalog attributes that were deleted. Only pre-loaded [catalog
   * attributes][google.cloud.retail.v2beta.CatalogAttribute] that are
   * neither [in
   * use][google.cloud.retail.v2beta.CatalogAttribute.in_use] by
   * products nor predefined can be deleted.
   * </pre>
   *
   * <code>repeated string deleted_catalog_attributes = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the deletedCatalogAttributes at the given index.
   */
  com.google.protobuf.ByteString getDeletedCatalogAttributesBytes(int index);

  /**
   *
   *
   * <pre>
   * Catalog attributes that were reset. [Catalog
   * attributes][google.cloud.retail.v2beta.CatalogAttribute] that are either
   * [in use][google.cloud.retail.v2beta.CatalogAttribute.in_use] by products or
   * are predefined attributes cannot be deleted; however, their configuration
   * properties will reset to default values upon removal request.
   * </pre>
   *
   * <code>repeated string reset_catalog_attributes = 2;</code>
   *
   * @return A list containing the resetCatalogAttributes.
   */
  java.util.List<java.lang.String> getResetCatalogAttributesList();
  /**
   *
   *
   * <pre>
   * Catalog attributes that were reset. [Catalog
   * attributes][google.cloud.retail.v2beta.CatalogAttribute] that are either
   * [in use][google.cloud.retail.v2beta.CatalogAttribute.in_use] by products or
   * are predefined attributes cannot be deleted; however, their configuration
   * properties will reset to default values upon removal request.
   * </pre>
   *
   * <code>repeated string reset_catalog_attributes = 2;</code>
   *
   * @return The count of resetCatalogAttributes.
   */
  int getResetCatalogAttributesCount();
  /**
   *
   *
   * <pre>
   * Catalog attributes that were reset. [Catalog
   * attributes][google.cloud.retail.v2beta.CatalogAttribute] that are either
   * [in use][google.cloud.retail.v2beta.CatalogAttribute.in_use] by products or
   * are predefined attributes cannot be deleted; however, their configuration
   * properties will reset to default values upon removal request.
   * </pre>
   *
   * <code>repeated string reset_catalog_attributes = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The resetCatalogAttributes at the given index.
   */
  java.lang.String getResetCatalogAttributes(int index);
  /**
   *
   *
   * <pre>
   * Catalog attributes that were reset. [Catalog
   * attributes][google.cloud.retail.v2beta.CatalogAttribute] that are either
   * [in use][google.cloud.retail.v2beta.CatalogAttribute.in_use] by products or
   * are predefined attributes cannot be deleted; however, their configuration
   * properties will reset to default values upon removal request.
   * </pre>
   *
   * <code>repeated string reset_catalog_attributes = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resetCatalogAttributes at the given index.
   */
  com.google.protobuf.ByteString getResetCatalogAttributesBytes(int index);
}
