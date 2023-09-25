/*
 * Copyright 2023 Google LLC
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
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

/**
 *
 *
 * <pre>
 * Service Account Key Origin.
 * </pre>
 *
 * Protobuf enum {@code google.iam.admin.v1.ServiceAccountKeyOrigin}
 */
public enum ServiceAccountKeyOrigin implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified key origin.
   * </pre>
   *
   * <code>ORIGIN_UNSPECIFIED = 0;</code>
   */
  ORIGIN_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Key is provided by user.
   * </pre>
   *
   * <code>USER_PROVIDED = 1;</code>
   */
  USER_PROVIDED(1),
  /**
   *
   *
   * <pre>
   * Key is provided by Google.
   * </pre>
   *
   * <code>GOOGLE_PROVIDED = 2;</code>
   */
  GOOGLE_PROVIDED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified key origin.
   * </pre>
   *
   * <code>ORIGIN_UNSPECIFIED = 0;</code>
   */
  public static final int ORIGIN_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Key is provided by user.
   * </pre>
   *
   * <code>USER_PROVIDED = 1;</code>
   */
  public static final int USER_PROVIDED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Key is provided by Google.
   * </pre>
   *
   * <code>GOOGLE_PROVIDED = 2;</code>
   */
  public static final int GOOGLE_PROVIDED_VALUE = 2;

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
  public static ServiceAccountKeyOrigin valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ServiceAccountKeyOrigin forNumber(int value) {
    switch (value) {
      case 0:
        return ORIGIN_UNSPECIFIED;
      case 1:
        return USER_PROVIDED;
      case 2:
        return GOOGLE_PROVIDED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceAccountKeyOrigin>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ServiceAccountKeyOrigin>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ServiceAccountKeyOrigin>() {
            public ServiceAccountKeyOrigin findValueByNumber(int number) {
              return ServiceAccountKeyOrigin.forNumber(number);
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
    return com.google.iam.admin.v1.Iam.getDescriptor().getEnumTypes().get(3);
  }

  private static final ServiceAccountKeyOrigin[] VALUES = values();

  public static ServiceAccountKeyOrigin valueOf(
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

  private ServiceAccountKeyOrigin(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.iam.admin.v1.ServiceAccountKeyOrigin)
}
