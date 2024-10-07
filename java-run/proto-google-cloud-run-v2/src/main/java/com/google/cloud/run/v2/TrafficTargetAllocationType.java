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
// source: google/cloud/run/v2/traffic_target.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * The type of instance allocation.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.run.v2.TrafficTargetAllocationType}
 */
public enum TrafficTargetAllocationType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified instance allocation type.
   * </pre>
   *
   * <code>TRAFFIC_TARGET_ALLOCATION_TYPE_UNSPECIFIED = 0;</code>
   */
  TRAFFIC_TARGET_ALLOCATION_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Allocates instances to the Service's latest ready Revision.
   * </pre>
   *
   * <code>TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST = 1;</code>
   */
  TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST(1),
  /**
   *
   *
   * <pre>
   * Allocates instances to a Revision by name.
   * </pre>
   *
   * <code>TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION = 2;</code>
   */
  TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified instance allocation type.
   * </pre>
   *
   * <code>TRAFFIC_TARGET_ALLOCATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TRAFFIC_TARGET_ALLOCATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Allocates instances to the Service's latest ready Revision.
   * </pre>
   *
   * <code>TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST = 1;</code>
   */
  public static final int TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Allocates instances to a Revision by name.
   * </pre>
   *
   * <code>TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION = 2;</code>
   */
  public static final int TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION_VALUE = 2;

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
  public static TrafficTargetAllocationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TrafficTargetAllocationType forNumber(int value) {
    switch (value) {
      case 0:
        return TRAFFIC_TARGET_ALLOCATION_TYPE_UNSPECIFIED;
      case 1:
        return TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST;
      case 2:
        return TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TrafficTargetAllocationType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TrafficTargetAllocationType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TrafficTargetAllocationType>() {
            public TrafficTargetAllocationType findValueByNumber(int number) {
              return TrafficTargetAllocationType.forNumber(number);
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
    return com.google.cloud.run.v2.TrafficTargetProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TrafficTargetAllocationType[] VALUES = values();

  public static TrafficTargetAllocationType valueOf(
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

  private TrafficTargetAllocationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.run.v2.TrafficTargetAllocationType)
}
