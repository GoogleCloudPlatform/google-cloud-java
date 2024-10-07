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
// source: google/cloud/commerce/consumer/procurement/v1/procurement_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.commerce.consumer.procurement.v1;

public interface CancelOrderRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1.CancelOrderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the order.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the order.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The weak etag, which can be optionally populated, of the order
   * that this cancel request is based on. Validation checking will only happen
   * if the invoker supplies this field.
   * </pre>
   *
   * <code>string etag = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. The weak etag, which can be optionally populated, of the order
   * that this cancel request is based on. Validation checking will only happen
   * if the invoker supplies this field.
   * </pre>
   *
   * <code>string etag = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. Cancellation policy of this request.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.CancelOrderRequest.CancellationPolicy cancellation_policy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for cancellationPolicy.
   */
  int getCancellationPolicyValue();
  /**
   *
   *
   * <pre>
   * Optional. Cancellation policy of this request.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.CancelOrderRequest.CancellationPolicy cancellation_policy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The cancellationPolicy.
   */
  com.google.cloud.commerce.consumer.procurement.v1.CancelOrderRequest.CancellationPolicy
      getCancellationPolicy();
}
