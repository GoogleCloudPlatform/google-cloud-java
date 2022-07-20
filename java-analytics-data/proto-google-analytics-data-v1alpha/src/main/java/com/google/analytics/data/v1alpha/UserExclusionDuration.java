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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * Enumerates options for how long an exclusion will last if a user matches
 * the `userExclusionCriteria`.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.data.v1alpha.UserExclusionDuration}
 */
public enum UserExclusionDuration implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified exclusion duration. Do not specify.
   * </pre>
   *
   * <code>USER_EXCLUSION_DURATION_UNSPECIFIED = 0;</code>
   */
  USER_EXCLUSION_DURATION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Temporarily exclude users from the segment during periods when the
   * user meets the `userExclusionCriteria` condition.
   * </pre>
   *
   * <code>USER_EXCLUSION_TEMPORARY = 1;</code>
   */
  USER_EXCLUSION_TEMPORARY(1),
  /**
   *
   *
   * <pre>
   * Permanently exclude users from the segment if the user ever meets the
   * `userExclusionCriteria` condition.
   * </pre>
   *
   * <code>USER_EXCLUSION_PERMANENT = 2;</code>
   */
  USER_EXCLUSION_PERMANENT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified exclusion duration. Do not specify.
   * </pre>
   *
   * <code>USER_EXCLUSION_DURATION_UNSPECIFIED = 0;</code>
   */
  public static final int USER_EXCLUSION_DURATION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Temporarily exclude users from the segment during periods when the
   * user meets the `userExclusionCriteria` condition.
   * </pre>
   *
   * <code>USER_EXCLUSION_TEMPORARY = 1;</code>
   */
  public static final int USER_EXCLUSION_TEMPORARY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Permanently exclude users from the segment if the user ever meets the
   * `userExclusionCriteria` condition.
   * </pre>
   *
   * <code>USER_EXCLUSION_PERMANENT = 2;</code>
   */
  public static final int USER_EXCLUSION_PERMANENT_VALUE = 2;

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
  public static UserExclusionDuration valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UserExclusionDuration forNumber(int value) {
    switch (value) {
      case 0:
        return USER_EXCLUSION_DURATION_UNSPECIFIED;
      case 1:
        return USER_EXCLUSION_TEMPORARY;
      case 2:
        return USER_EXCLUSION_PERMANENT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UserExclusionDuration>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<UserExclusionDuration>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UserExclusionDuration>() {
            public UserExclusionDuration findValueByNumber(int number) {
              return UserExclusionDuration.forNumber(number);
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
    return com.google.analytics.data.v1alpha.ReportingApiProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final UserExclusionDuration[] VALUES = values();

  public static UserExclusionDuration valueOf(
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

  private UserExclusionDuration(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.data.v1alpha.UserExclusionDuration)
}
