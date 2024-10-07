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
// source: google/maps/areainsights/v1/area_insights_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.areainsights.v1;

/**
 *
 *
 * <pre>
 * Price level of the place.
 * </pre>
 *
 * Protobuf enum {@code google.maps.areainsights.v1.PriceLevel}
 */
public enum PriceLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Place price level is unspecified or unknown.
   * </pre>
   *
   * <code>PRICE_LEVEL_UNSPECIFIED = 0;</code>
   */
  PRICE_LEVEL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Place provides free services.
   * </pre>
   *
   * <code>PRICE_LEVEL_FREE = 1;</code>
   */
  PRICE_LEVEL_FREE(1),
  /**
   *
   *
   * <pre>
   * Place provides inexpensive services.
   * </pre>
   *
   * <code>PRICE_LEVEL_INEXPENSIVE = 2;</code>
   */
  PRICE_LEVEL_INEXPENSIVE(2),
  /**
   *
   *
   * <pre>
   * Place provides moderately priced services.
   * </pre>
   *
   * <code>PRICE_LEVEL_MODERATE = 3;</code>
   */
  PRICE_LEVEL_MODERATE(3),
  /**
   *
   *
   * <pre>
   * Place provides expensive services.
   * </pre>
   *
   * <code>PRICE_LEVEL_EXPENSIVE = 4;</code>
   */
  PRICE_LEVEL_EXPENSIVE(4),
  /**
   *
   *
   * <pre>
   * Place provides very expensive services.
   * </pre>
   *
   * <code>PRICE_LEVEL_VERY_EXPENSIVE = 5;</code>
   */
  PRICE_LEVEL_VERY_EXPENSIVE(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Place price level is unspecified or unknown.
   * </pre>
   *
   * <code>PRICE_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int PRICE_LEVEL_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Place provides free services.
   * </pre>
   *
   * <code>PRICE_LEVEL_FREE = 1;</code>
   */
  public static final int PRICE_LEVEL_FREE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Place provides inexpensive services.
   * </pre>
   *
   * <code>PRICE_LEVEL_INEXPENSIVE = 2;</code>
   */
  public static final int PRICE_LEVEL_INEXPENSIVE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Place provides moderately priced services.
   * </pre>
   *
   * <code>PRICE_LEVEL_MODERATE = 3;</code>
   */
  public static final int PRICE_LEVEL_MODERATE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Place provides expensive services.
   * </pre>
   *
   * <code>PRICE_LEVEL_EXPENSIVE = 4;</code>
   */
  public static final int PRICE_LEVEL_EXPENSIVE_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Place provides very expensive services.
   * </pre>
   *
   * <code>PRICE_LEVEL_VERY_EXPENSIVE = 5;</code>
   */
  public static final int PRICE_LEVEL_VERY_EXPENSIVE_VALUE = 5;

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
  public static PriceLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PriceLevel forNumber(int value) {
    switch (value) {
      case 0:
        return PRICE_LEVEL_UNSPECIFIED;
      case 1:
        return PRICE_LEVEL_FREE;
      case 2:
        return PRICE_LEVEL_INEXPENSIVE;
      case 3:
        return PRICE_LEVEL_MODERATE;
      case 4:
        return PRICE_LEVEL_EXPENSIVE;
      case 5:
        return PRICE_LEVEL_VERY_EXPENSIVE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PriceLevel> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PriceLevel> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<PriceLevel>() {
        public PriceLevel findValueByNumber(int number) {
          return PriceLevel.forNumber(number);
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
    return com.google.maps.areainsights.v1.AreaInsightsServiceProto.getDescriptor()
        .getEnumTypes()
        .get(2);
  }

  private static final PriceLevel[] VALUES = values();

  public static PriceLevel valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PriceLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.areainsights.v1.PriceLevel)
}
