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
// source: google/maps/routing/v2/fallback_info.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * Reasons for using fallback response.
 * </pre>
 *
 * Protobuf enum {@code google.maps.routing.v2.FallbackReason}
 */
public enum FallbackReason implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No fallback reason specified.
   * </pre>
   *
   * <code>FALLBACK_REASON_UNSPECIFIED = 0;</code>
   */
  FALLBACK_REASON_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * A server error happened while calculating routes with your preferred
   * routing mode, but we were able to return a result calculated by an
   * alternative mode.
   * </pre>
   *
   * <code>SERVER_ERROR = 1;</code>
   */
  SERVER_ERROR(1),
  /**
   *
   *
   * <pre>
   * We were not able to finish the calculation with your preferred routing mode
   * on time, but we were able to return a result calculated by an alternative
   * mode.
   * </pre>
   *
   * <code>LATENCY_EXCEEDED = 2;</code>
   */
  LATENCY_EXCEEDED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No fallback reason specified.
   * </pre>
   *
   * <code>FALLBACK_REASON_UNSPECIFIED = 0;</code>
   */
  public static final int FALLBACK_REASON_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * A server error happened while calculating routes with your preferred
   * routing mode, but we were able to return a result calculated by an
   * alternative mode.
   * </pre>
   *
   * <code>SERVER_ERROR = 1;</code>
   */
  public static final int SERVER_ERROR_VALUE = 1;
  /**
   *
   *
   * <pre>
   * We were not able to finish the calculation with your preferred routing mode
   * on time, but we were able to return a result calculated by an alternative
   * mode.
   * </pre>
   *
   * <code>LATENCY_EXCEEDED = 2;</code>
   */
  public static final int LATENCY_EXCEEDED_VALUE = 2;

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
  public static FallbackReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FallbackReason forNumber(int value) {
    switch (value) {
      case 0:
        return FALLBACK_REASON_UNSPECIFIED;
      case 1:
        return SERVER_ERROR;
      case 2:
        return LATENCY_EXCEEDED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FallbackReason> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<FallbackReason> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<FallbackReason>() {
        public FallbackReason findValueByNumber(int number) {
          return FallbackReason.forNumber(number);
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
    return com.google.maps.routing.v2.FallbackInfoProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final FallbackReason[] VALUES = values();

  public static FallbackReason valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FallbackReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routing.v2.FallbackReason)
}
