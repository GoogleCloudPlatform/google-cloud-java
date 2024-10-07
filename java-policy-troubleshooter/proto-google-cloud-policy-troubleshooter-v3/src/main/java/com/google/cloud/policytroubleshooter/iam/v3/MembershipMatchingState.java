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
// source: google/cloud/policytroubleshooter/iam/v3/troubleshooter.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.policytroubleshooter.iam.v3;

/**
 *
 *
 * <pre>
 * Whether the principal in the request matches the principal in the policy.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.policytroubleshooter.iam.v3.MembershipMatchingState}
 */
public enum MembershipMatchingState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>MEMBERSHIP_MATCHING_STATE_UNSPECIFIED = 0;</code>
   */
  MEMBERSHIP_MATCHING_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The principal in the request matches the principal in the policy. The
   * principal can be included directly or indirectly:
   *
   * * A principal is included directly if that principal is listed in the
   *   role binding.
   * * A principal is included indirectly if that principal is in a Google
   *   group, Google Workspace account, or Cloud Identity domain that is listed
   *   in the policy.
   * </pre>
   *
   * <code>MEMBERSHIP_MATCHED = 1;</code>
   */
  MEMBERSHIP_MATCHED(1),
  /**
   *
   *
   * <pre>
   * The principal in the request doesn't match the principal in the policy.
   * </pre>
   *
   * <code>MEMBERSHIP_NOT_MATCHED = 2;</code>
   */
  MEMBERSHIP_NOT_MATCHED(2),
  /**
   *
   *
   * <pre>
   * The principal in the policy is a group or domain, and the sender of the
   * request doesn't have permission to view whether the principal in the
   * request is a member of the group or domain.
   * </pre>
   *
   * <code>MEMBERSHIP_UNKNOWN_INFO = 3;</code>
   */
  MEMBERSHIP_UNKNOWN_INFO(3),
  /**
   *
   *
   * <pre>
   * The principal is an unsupported type.
   * </pre>
   *
   * <code>MEMBERSHIP_UNKNOWN_UNSUPPORTED = 4;</code>
   */
  MEMBERSHIP_UNKNOWN_UNSUPPORTED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>MEMBERSHIP_MATCHING_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int MEMBERSHIP_MATCHING_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The principal in the request matches the principal in the policy. The
   * principal can be included directly or indirectly:
   *
   * * A principal is included directly if that principal is listed in the
   *   role binding.
   * * A principal is included indirectly if that principal is in a Google
   *   group, Google Workspace account, or Cloud Identity domain that is listed
   *   in the policy.
   * </pre>
   *
   * <code>MEMBERSHIP_MATCHED = 1;</code>
   */
  public static final int MEMBERSHIP_MATCHED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The principal in the request doesn't match the principal in the policy.
   * </pre>
   *
   * <code>MEMBERSHIP_NOT_MATCHED = 2;</code>
   */
  public static final int MEMBERSHIP_NOT_MATCHED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The principal in the policy is a group or domain, and the sender of the
   * request doesn't have permission to view whether the principal in the
   * request is a member of the group or domain.
   * </pre>
   *
   * <code>MEMBERSHIP_UNKNOWN_INFO = 3;</code>
   */
  public static final int MEMBERSHIP_UNKNOWN_INFO_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The principal is an unsupported type.
   * </pre>
   *
   * <code>MEMBERSHIP_UNKNOWN_UNSUPPORTED = 4;</code>
   */
  public static final int MEMBERSHIP_UNKNOWN_UNSUPPORTED_VALUE = 4;

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
  public static MembershipMatchingState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MembershipMatchingState forNumber(int value) {
    switch (value) {
      case 0:
        return MEMBERSHIP_MATCHING_STATE_UNSPECIFIED;
      case 1:
        return MEMBERSHIP_MATCHED;
      case 2:
        return MEMBERSHIP_NOT_MATCHED;
      case 3:
        return MEMBERSHIP_UNKNOWN_INFO;
      case 4:
        return MEMBERSHIP_UNKNOWN_UNSUPPORTED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MembershipMatchingState>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<MembershipMatchingState>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MembershipMatchingState>() {
            public MembershipMatchingState findValueByNumber(int number) {
              return MembershipMatchingState.forNumber(number);
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
    return com.google.cloud.policytroubleshooter.iam.v3.TroubleshooterProto.getDescriptor()
        .getEnumTypes()
        .get(4);
  }

  private static final MembershipMatchingState[] VALUES = values();

  public static MembershipMatchingState valueOf(
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

  private MembershipMatchingState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.policytroubleshooter.iam.v3.MembershipMatchingState)
}
