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
// source: google/shopping/merchant/inventories/v1beta/localinventory.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.inventories.v1beta;

public interface ListLocalInventoriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.inventories.v1beta.ListLocalInventoriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `LocalInventory` resources for the given product from the specified
   * account.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.inventories.v1beta.LocalInventory local_inventories = 1;
   * </code>
   */
  java.util.List<com.google.shopping.merchant.inventories.v1beta.LocalInventory>
      getLocalInventoriesList();
  /**
   *
   *
   * <pre>
   * The `LocalInventory` resources for the given product from the specified
   * account.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.inventories.v1beta.LocalInventory local_inventories = 1;
   * </code>
   */
  com.google.shopping.merchant.inventories.v1beta.LocalInventory getLocalInventories(int index);
  /**
   *
   *
   * <pre>
   * The `LocalInventory` resources for the given product from the specified
   * account.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.inventories.v1beta.LocalInventory local_inventories = 1;
   * </code>
   */
  int getLocalInventoriesCount();
  /**
   *
   *
   * <pre>
   * The `LocalInventory` resources for the given product from the specified
   * account.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.inventories.v1beta.LocalInventory local_inventories = 1;
   * </code>
   */
  java.util.List<? extends com.google.shopping.merchant.inventories.v1beta.LocalInventoryOrBuilder>
      getLocalInventoriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The `LocalInventory` resources for the given product from the specified
   * account.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.inventories.v1beta.LocalInventory local_inventories = 1;
   * </code>
   */
  com.google.shopping.merchant.inventories.v1beta.LocalInventoryOrBuilder
      getLocalInventoriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `pageToken` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `pageToken` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
