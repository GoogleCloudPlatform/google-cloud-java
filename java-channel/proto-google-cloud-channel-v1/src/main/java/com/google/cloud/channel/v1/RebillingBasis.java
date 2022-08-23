/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/channel/v1/repricing.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Specifies the different costs that the modified bill can be based on.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.channel.v1.RebillingBasis}
 */
public enum RebillingBasis implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>REBILLING_BASIS_UNSPECIFIED = 0;</code>
   */
  REBILLING_BASIS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Use the list cost, also known as the MSRP.
   * </pre>
   *
   * <code>COST_AT_LIST = 1;</code>
   */
  COST_AT_LIST(1),
  /**
   *
   *
   * <pre>
   * Pass through all discounts except the Reseller Program Discount. If this is
   * the default cost base and no adjustments are specified, the output cost
   * will be exactly what the customer would see if they viewed the bill in the
   * Google Cloud Console.
   * </pre>
   *
   * <code>DIRECT_CUSTOMER_COST = 2;</code>
   */
  DIRECT_CUSTOMER_COST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>REBILLING_BASIS_UNSPECIFIED = 0;</code>
   */
  public static final int REBILLING_BASIS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Use the list cost, also known as the MSRP.
   * </pre>
   *
   * <code>COST_AT_LIST = 1;</code>
   */
  public static final int COST_AT_LIST_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Pass through all discounts except the Reseller Program Discount. If this is
   * the default cost base and no adjustments are specified, the output cost
   * will be exactly what the customer would see if they viewed the bill in the
   * Google Cloud Console.
   * </pre>
   *
   * <code>DIRECT_CUSTOMER_COST = 2;</code>
   */
  public static final int DIRECT_CUSTOMER_COST_VALUE = 2;

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
  public static RebillingBasis valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RebillingBasis forNumber(int value) {
    switch (value) {
      case 0:
        return REBILLING_BASIS_UNSPECIFIED;
      case 1:
        return COST_AT_LIST;
      case 2:
        return DIRECT_CUSTOMER_COST;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RebillingBasis> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RebillingBasis> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<RebillingBasis>() {
        public RebillingBasis findValueByNumber(int number) {
          return RebillingBasis.forNumber(number);
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
    return com.google.cloud.channel.v1.RepricingProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RebillingBasis[] VALUES = values();

  public static RebillingBasis valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RebillingBasis(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.RebillingBasis)
}
