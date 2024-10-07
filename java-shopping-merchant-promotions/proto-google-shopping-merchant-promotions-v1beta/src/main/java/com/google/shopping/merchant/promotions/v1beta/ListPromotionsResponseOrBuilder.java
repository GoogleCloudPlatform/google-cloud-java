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
// source: google/shopping/merchant/promotions/v1beta/promotions.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.promotions.v1beta;

public interface ListPromotionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.promotions.v1beta.ListPromotionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The processed promotions from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.promotions.v1beta.Promotion promotions = 1;</code>
   */
  java.util.List<com.google.shopping.merchant.promotions.v1beta.Promotion> getPromotionsList();
  /**
   *
   *
   * <pre>
   * The processed promotions from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.promotions.v1beta.Promotion promotions = 1;</code>
   */
  com.google.shopping.merchant.promotions.v1beta.Promotion getPromotions(int index);
  /**
   *
   *
   * <pre>
   * The processed promotions from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.promotions.v1beta.Promotion promotions = 1;</code>
   */
  int getPromotionsCount();
  /**
   *
   *
   * <pre>
   * The processed promotions from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.promotions.v1beta.Promotion promotions = 1;</code>
   */
  java.util.List<? extends com.google.shopping.merchant.promotions.v1beta.PromotionOrBuilder>
      getPromotionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The processed promotions from the specified account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.promotions.v1beta.Promotion promotions = 1;</code>
   */
  com.google.shopping.merchant.promotions.v1beta.PromotionOrBuilder getPromotionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
