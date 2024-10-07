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
// source: google/cloud/channel/v1/offers.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Describes how the reseller will be billed.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.channel.v1.PaymentPlan}
 */
public enum PaymentPlan implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>PAYMENT_PLAN_UNSPECIFIED = 0;</code>
   */
  PAYMENT_PLAN_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Commitment.
   * </pre>
   *
   * <code>COMMITMENT = 1;</code>
   */
  COMMITMENT(1),
  /**
   *
   *
   * <pre>
   * No commitment.
   * </pre>
   *
   * <code>FLEXIBLE = 2;</code>
   */
  FLEXIBLE(2),
  /**
   *
   *
   * <pre>
   * Free.
   * </pre>
   *
   * <code>FREE = 3;</code>
   */
  FREE(3),
  /**
   *
   *
   * <pre>
   * Trial.
   * </pre>
   *
   * <code>TRIAL = 4;</code>
   */
  TRIAL(4),
  /**
   *
   *
   * <pre>
   * Price and ordering not available through API.
   * </pre>
   *
   * <code>OFFLINE = 5;</code>
   */
  OFFLINE(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>PAYMENT_PLAN_UNSPECIFIED = 0;</code>
   */
  public static final int PAYMENT_PLAN_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Commitment.
   * </pre>
   *
   * <code>COMMITMENT = 1;</code>
   */
  public static final int COMMITMENT_VALUE = 1;
  /**
   *
   *
   * <pre>
   * No commitment.
   * </pre>
   *
   * <code>FLEXIBLE = 2;</code>
   */
  public static final int FLEXIBLE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Free.
   * </pre>
   *
   * <code>FREE = 3;</code>
   */
  public static final int FREE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Trial.
   * </pre>
   *
   * <code>TRIAL = 4;</code>
   */
  public static final int TRIAL_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Price and ordering not available through API.
   * </pre>
   *
   * <code>OFFLINE = 5;</code>
   */
  public static final int OFFLINE_VALUE = 5;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PaymentPlan valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PaymentPlan forNumber(int value) {
    switch (value) {
      case 0:
        return PAYMENT_PLAN_UNSPECIFIED;
      case 1:
        return COMMITMENT;
      case 2:
        return FLEXIBLE;
      case 3:
        return FREE;
      case 4:
        return TRIAL;
      case 5:
        return OFFLINE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PaymentPlan> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PaymentPlan> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<PaymentPlan>() {
        public PaymentPlan findValueByNumber(int number) {
          return PaymentPlan.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.channel.v1.OffersProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final PaymentPlan[] VALUES = values();

  public static PaymentPlan valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PaymentPlan(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.PaymentPlan)
}
