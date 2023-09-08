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
// source: google/cloud/recommendationengine/v1beta1/import.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface CatalogInlineSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.CatalogInlineSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.recommendationengine.v1beta1.CatalogItem> getCatalogItemsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.CatalogItem getCatalogItems(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getCatalogItemsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder>
      getCatalogItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder getCatalogItemsOrBuilder(
      int index);
}
