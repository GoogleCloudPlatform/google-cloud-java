// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/commerce/consumer/procurement/v1alpha1/order.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.commerce.consumer.procurement.v1alpha1;

public interface LineItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1alpha1.LineItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Line item ID.
   * </pre>
   *
   * <code>string line_item_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lineItemId.
   */
  java.lang.String getLineItemId();
  /**
   * <pre>
   * Output only. Line item ID.
   * </pre>
   *
   * <code>string line_item_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for lineItemId.
   */
  com.google.protobuf.ByteString
      getLineItemIdBytes();

  /**
   * <pre>
   * Output only. Current state and information of this item. It tells what,
   * e.g. which offer, is currently effective.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemInfo line_item_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the lineItemInfo field is set.
   */
  boolean hasLineItemInfo();
  /**
   * <pre>
   * Output only. Current state and information of this item. It tells what,
   * e.g. which offer, is currently effective.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemInfo line_item_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lineItemInfo.
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemInfo getLineItemInfo();
  /**
   * <pre>
   * Output only. Current state and information of this item. It tells what,
   * e.g. which offer, is currently effective.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemInfo line_item_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemInfoOrBuilder getLineItemInfoOrBuilder();

  /**
   * <pre>
   * Output only. A change made on the item which is pending and not yet
   * effective. Absence of this field indicates the line item is not undergoing
   * a change.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange pending_change = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the pendingChange field is set.
   */
  boolean hasPendingChange();
  /**
   * <pre>
   * Output only. A change made on the item which is pending and not yet
   * effective. Absence of this field indicates the line item is not undergoing
   * a change.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange pending_change = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pendingChange.
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange getPendingChange();
  /**
   * <pre>
   * Output only. A change made on the item which is pending and not yet
   * effective. Absence of this field indicates the line item is not undergoing
   * a change.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange pending_change = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChangeOrBuilder getPendingChangeOrBuilder();

  /**
   * <pre>
   * Output only. Changes made on the item that are not pending anymore which
   * might be because they already took effect, were reverted by the customer,
   * or were rejected by the partner. No more operations are allowed on these
   * changes.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange change_history = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange> 
      getChangeHistoryList();
  /**
   * <pre>
   * Output only. Changes made on the item that are not pending anymore which
   * might be because they already took effect, were reverted by the customer,
   * or were rejected by the partner. No more operations are allowed on these
   * changes.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange change_history = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange getChangeHistory(int index);
  /**
   * <pre>
   * Output only. Changes made on the item that are not pending anymore which
   * might be because they already took effect, were reverted by the customer,
   * or were rejected by the partner. No more operations are allowed on these
   * changes.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange change_history = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getChangeHistoryCount();
  /**
   * <pre>
   * Output only. Changes made on the item that are not pending anymore which
   * might be because they already took effect, were reverted by the customer,
   * or were rejected by the partner. No more operations are allowed on these
   * changes.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange change_history = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChangeOrBuilder> 
      getChangeHistoryOrBuilderList();
  /**
   * <pre>
   * Output only. Changes made on the item that are not pending anymore which
   * might be because they already took effect, were reverted by the customer,
   * or were rejected by the partner. No more operations are allowed on these
   * changes.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChange change_history = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChangeOrBuilder getChangeHistoryOrBuilder(
      int index);
}
