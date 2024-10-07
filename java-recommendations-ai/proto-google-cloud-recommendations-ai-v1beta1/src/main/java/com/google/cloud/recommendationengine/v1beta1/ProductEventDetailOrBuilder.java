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
// source: google/cloud/recommendationengine/v1beta1/user_event.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.recommendationengine.v1beta1;

public interface ProductEventDetailOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.ProductEventDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required for `search` events. Other event types should not set this field.
   * The user's search query as UTF-8 encoded text with a length limit of 5 KiB.
   * </pre>
   *
   * <code>string search_query = 1;</code>
   *
   * @return The searchQuery.
   */
  java.lang.String getSearchQuery();
  /**
   *
   *
   * <pre>
   * Required for `search` events. Other event types should not set this field.
   * The user's search query as UTF-8 encoded text with a length limit of 5 KiB.
   * </pre>
   *
   * <code>string search_query = 1;</code>
   *
   * @return The bytes for searchQuery.
   */
  com.google.protobuf.ByteString getSearchQueryBytes();

  /**
   *
   *
   * <pre>
   * Required for `category-page-view` events. Other event types should not set
   * this field.
   * The categories associated with a category page.
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * categories : ["Sales", "2017 Black Friday Deals"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchy page_categories = 2;
   * </code>
   */
  java.util.List<com.google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchy>
      getPageCategoriesList();
  /**
   *
   *
   * <pre>
   * Required for `category-page-view` events. Other event types should not set
   * this field.
   * The categories associated with a category page.
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * categories : ["Sales", "2017 Black Friday Deals"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchy page_categories = 2;
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchy getPageCategories(
      int index);
  /**
   *
   *
   * <pre>
   * Required for `category-page-view` events. Other event types should not set
   * this field.
   * The categories associated with a category page.
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * categories : ["Sales", "2017 Black Friday Deals"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchy page_categories = 2;
   * </code>
   */
  int getPageCategoriesCount();
  /**
   *
   *
   * <pre>
   * Required for `category-page-view` events. Other event types should not set
   * this field.
   * The categories associated with a category page.
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * categories : ["Sales", "2017 Black Friday Deals"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchy page_categories = 2;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchyOrBuilder>
      getPageCategoriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required for `category-page-view` events. Other event types should not set
   * this field.
   * The categories associated with a category page.
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * categories : ["Sales", "2017 Black Friday Deals"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchy page_categories = 2;
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchyOrBuilder
      getPageCategoriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The main product details related to the event.
   *
   * This field is required for the following event types:
   *
   * * `add-to-cart`
   * * `add-to-list`
   * * `checkout-start`
   * * `detail-page-view`
   * * `purchase-complete`
   * * `refund`
   * * `remove-from-cart`
   * * `remove-from-list`
   *
   * This field is optional for the following event types:
   *
   * * `page-visit`
   * * `shopping-cart-page-view` - note that 'product_details' should be set for
   *   this unless the shopping cart is empty.
   *
   * This field is not allowed for the following event types:
   *
   * * `category-page-view`
   * * `home-page-view`
   * * `search`
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.ProductDetail product_details = 3;
   * </code>
   */
  java.util.List<com.google.cloud.recommendationengine.v1beta1.ProductDetail>
      getProductDetailsList();
  /**
   *
   *
   * <pre>
   * The main product details related to the event.
   *
   * This field is required for the following event types:
   *
   * * `add-to-cart`
   * * `add-to-list`
   * * `checkout-start`
   * * `detail-page-view`
   * * `purchase-complete`
   * * `refund`
   * * `remove-from-cart`
   * * `remove-from-list`
   *
   * This field is optional for the following event types:
   *
   * * `page-visit`
   * * `shopping-cart-page-view` - note that 'product_details' should be set for
   *   this unless the shopping cart is empty.
   *
   * This field is not allowed for the following event types:
   *
   * * `category-page-view`
   * * `home-page-view`
   * * `search`
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.ProductDetail product_details = 3;
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.ProductDetail getProductDetails(int index);
  /**
   *
   *
   * <pre>
   * The main product details related to the event.
   *
   * This field is required for the following event types:
   *
   * * `add-to-cart`
   * * `add-to-list`
   * * `checkout-start`
   * * `detail-page-view`
   * * `purchase-complete`
   * * `refund`
   * * `remove-from-cart`
   * * `remove-from-list`
   *
   * This field is optional for the following event types:
   *
   * * `page-visit`
   * * `shopping-cart-page-view` - note that 'product_details' should be set for
   *   this unless the shopping cart is empty.
   *
   * This field is not allowed for the following event types:
   *
   * * `category-page-view`
   * * `home-page-view`
   * * `search`
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.ProductDetail product_details = 3;
   * </code>
   */
  int getProductDetailsCount();
  /**
   *
   *
   * <pre>
   * The main product details related to the event.
   *
   * This field is required for the following event types:
   *
   * * `add-to-cart`
   * * `add-to-list`
   * * `checkout-start`
   * * `detail-page-view`
   * * `purchase-complete`
   * * `refund`
   * * `remove-from-cart`
   * * `remove-from-list`
   *
   * This field is optional for the following event types:
   *
   * * `page-visit`
   * * `shopping-cart-page-view` - note that 'product_details' should be set for
   *   this unless the shopping cart is empty.
   *
   * This field is not allowed for the following event types:
   *
   * * `category-page-view`
   * * `home-page-view`
   * * `search`
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.ProductDetail product_details = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.recommendationengine.v1beta1.ProductDetailOrBuilder>
      getProductDetailsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The main product details related to the event.
   *
   * This field is required for the following event types:
   *
   * * `add-to-cart`
   * * `add-to-list`
   * * `checkout-start`
   * * `detail-page-view`
   * * `purchase-complete`
   * * `refund`
   * * `remove-from-cart`
   * * `remove-from-list`
   *
   * This field is optional for the following event types:
   *
   * * `page-visit`
   * * `shopping-cart-page-view` - note that 'product_details' should be set for
   *   this unless the shopping cart is empty.
   *
   * This field is not allowed for the following event types:
   *
   * * `category-page-view`
   * * `home-page-view`
   * * `search`
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.ProductDetail product_details = 3;
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.ProductDetailOrBuilder getProductDetailsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Required for `add-to-list` and `remove-from-list` events. The id or name of
   * the list that the item is being added to or removed from. Other event types
   * should not set this field.
   * </pre>
   *
   * <code>string list_id = 4;</code>
   *
   * @return The listId.
   */
  java.lang.String getListId();
  /**
   *
   *
   * <pre>
   * Required for `add-to-list` and `remove-from-list` events. The id or name of
   * the list that the item is being added to or removed from. Other event types
   * should not set this field.
   * </pre>
   *
   * <code>string list_id = 4;</code>
   *
   * @return The bytes for listId.
   */
  com.google.protobuf.ByteString getListIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The id or name of the associated shopping cart. This id is used
   * to associate multiple items added or present in the cart before purchase.
   *
   * This can only be set for `add-to-cart`, `remove-from-cart`,
   * `checkout-start`, `purchase-complete`, or `shopping-cart-page-view` events.
   * </pre>
   *
   * <code>string cart_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The cartId.
   */
  java.lang.String getCartId();
  /**
   *
   *
   * <pre>
   * Optional. The id or name of the associated shopping cart. This id is used
   * to associate multiple items added or present in the cart before purchase.
   *
   * This can only be set for `add-to-cart`, `remove-from-cart`,
   * `checkout-start`, `purchase-complete`, or `shopping-cart-page-view` events.
   * </pre>
   *
   * <code>string cart_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for cartId.
   */
  com.google.protobuf.ByteString getCartIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. A transaction represents the entire purchase transaction.
   * Required for `purchase-complete` events. Optional for `checkout-start`
   * events. Other event types should not set this field.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.PurchaseTransaction purchase_transaction = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the purchaseTransaction field is set.
   */
  boolean hasPurchaseTransaction();
  /**
   *
   *
   * <pre>
   * Optional. A transaction represents the entire purchase transaction.
   * Required for `purchase-complete` events. Optional for `checkout-start`
   * events. Other event types should not set this field.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.PurchaseTransaction purchase_transaction = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The purchaseTransaction.
   */
  com.google.cloud.recommendationengine.v1beta1.PurchaseTransaction getPurchaseTransaction();
  /**
   *
   *
   * <pre>
   * Optional. A transaction represents the entire purchase transaction.
   * Required for `purchase-complete` events. Optional for `checkout-start`
   * events. Other event types should not set this field.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.PurchaseTransaction purchase_transaction = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.PurchaseTransactionOrBuilder
      getPurchaseTransactionOrBuilder();
}
