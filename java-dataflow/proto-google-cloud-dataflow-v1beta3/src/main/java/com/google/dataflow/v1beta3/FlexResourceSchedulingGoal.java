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
// source: google/dataflow/v1beta3/environment.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Specifies the resource to optimize for in Flexible Resource Scheduling.
 * </pre>
 *
 * Protobuf enum {@code google.dataflow.v1beta3.FlexResourceSchedulingGoal}
 */
public enum FlexResourceSchedulingGoal implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Run in the default mode.
   * </pre>
   *
   * <code>FLEXRS_UNSPECIFIED = 0;</code>
   */
  FLEXRS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Optimize for lower execution time.
   * </pre>
   *
   * <code>FLEXRS_SPEED_OPTIMIZED = 1;</code>
   */
  FLEXRS_SPEED_OPTIMIZED(1),
  /**
   *
   *
   * <pre>
   * Optimize for lower cost.
   * </pre>
   *
   * <code>FLEXRS_COST_OPTIMIZED = 2;</code>
   */
  FLEXRS_COST_OPTIMIZED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Run in the default mode.
   * </pre>
   *
   * <code>FLEXRS_UNSPECIFIED = 0;</code>
   */
  public static final int FLEXRS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Optimize for lower execution time.
   * </pre>
   *
   * <code>FLEXRS_SPEED_OPTIMIZED = 1;</code>
   */
  public static final int FLEXRS_SPEED_OPTIMIZED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Optimize for lower cost.
   * </pre>
   *
   * <code>FLEXRS_COST_OPTIMIZED = 2;</code>
   */
  public static final int FLEXRS_COST_OPTIMIZED_VALUE = 2;

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
  public static FlexResourceSchedulingGoal valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FlexResourceSchedulingGoal forNumber(int value) {
    switch (value) {
      case 0:
        return FLEXRS_UNSPECIFIED;
      case 1:
        return FLEXRS_SPEED_OPTIMIZED;
      case 2:
        return FLEXRS_COST_OPTIMIZED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FlexResourceSchedulingGoal>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<FlexResourceSchedulingGoal>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FlexResourceSchedulingGoal>() {
            public FlexResourceSchedulingGoal findValueByNumber(int number) {
              return FlexResourceSchedulingGoal.forNumber(number);
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
    return com.google.dataflow.v1beta3.EnvironmentProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final FlexResourceSchedulingGoal[] VALUES = values();

  public static FlexResourceSchedulingGoal valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FlexResourceSchedulingGoal(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.FlexResourceSchedulingGoal)
}
