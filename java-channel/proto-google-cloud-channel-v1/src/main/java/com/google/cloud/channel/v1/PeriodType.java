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
 * Period Type.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.channel.v1.PeriodType}
 */
public enum PeriodType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>PERIOD_TYPE_UNSPECIFIED = 0;</code>
   */
  PERIOD_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Day.
   * </pre>
   *
   * <code>DAY = 1;</code>
   */
  DAY(1),
  /**
   *
   *
   * <pre>
   * Month.
   * </pre>
   *
   * <code>MONTH = 2;</code>
   */
  MONTH(2),
  /**
   *
   *
   * <pre>
   * Year.
   * </pre>
   *
   * <code>YEAR = 3;</code>
   */
  YEAR(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>PERIOD_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int PERIOD_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Day.
   * </pre>
   *
   * <code>DAY = 1;</code>
   */
  public static final int DAY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Month.
   * </pre>
   *
   * <code>MONTH = 2;</code>
   */
  public static final int MONTH_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Year.
   * </pre>
   *
   * <code>YEAR = 3;</code>
   */
  public static final int YEAR_VALUE = 3;

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
  public static PeriodType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PeriodType forNumber(int value) {
    switch (value) {
      case 0:
        return PERIOD_TYPE_UNSPECIFIED;
      case 1:
        return DAY;
      case 2:
        return MONTH;
      case 3:
        return YEAR;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PeriodType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PeriodType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<PeriodType>() {
        public PeriodType findValueByNumber(int number) {
          return PeriodType.forNumber(number);
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
    return com.google.cloud.channel.v1.OffersProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final PeriodType[] VALUES = values();

  public static PeriodType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PeriodType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.PeriodType)
}
