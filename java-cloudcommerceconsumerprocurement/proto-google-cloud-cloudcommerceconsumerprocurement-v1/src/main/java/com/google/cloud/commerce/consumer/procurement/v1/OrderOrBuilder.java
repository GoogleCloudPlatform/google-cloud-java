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
// source: google/cloud/commerce/consumer/procurement/v1/order.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.commerce.consumer.procurement.v1;

public interface OrderOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1.Order)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the order.
   * Has the form
   * `billingAccounts/{billing_account}/orders/{order}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the order.
   * Has the form
   * `billingAccounts/{billing_account}/orders/{order}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The user-specified name of the order.
   * </pre>
   *
   * <code>string display_name = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The user-specified name of the order.
   * </pre>
   *
   * <code>string display_name = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The items being purchased.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem line_items = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.commerce.consumer.procurement.v1.LineItem> getLineItemsList();
  /**
   *
   *
   * <pre>
   * Output only. The items being purchased.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem line_items = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItem getLineItems(int index);
  /**
   *
   *
   * <pre>
   * Output only. The items being purchased.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem line_items = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getLineItemsCount();
  /**
   *
   *
   * <pre>
   * Output only. The items being purchased.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem line_items = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.commerce.consumer.procurement.v1.LineItemOrBuilder>
      getLineItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The items being purchased.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem line_items = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItemOrBuilder getLineItemsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. Line items that were cancelled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem cancelled_line_items = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.commerce.consumer.procurement.v1.LineItem>
      getCancelledLineItemsList();
  /**
   *
   *
   * <pre>
   * Output only. Line items that were cancelled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem cancelled_line_items = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItem getCancelledLineItems(int index);
  /**
   *
   *
   * <pre>
   * Output only. Line items that were cancelled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem cancelled_line_items = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getCancelledLineItemsCount();
  /**
   *
   *
   * <pre>
   * Output only. Line items that were cancelled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem cancelled_line_items = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.commerce.consumer.procurement.v1.LineItemOrBuilder>
      getCancelledLineItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Line items that were cancelled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.commerce.consumer.procurement.v1.LineItem cancelled_line_items = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItemOrBuilder
      getCancelledLineItemsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The weak etag of the order.
   * </pre>
   *
   * <code>string etag = 11;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * The weak etag of the order.
   * </pre>
   *
   * <code>string etag = 11;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
