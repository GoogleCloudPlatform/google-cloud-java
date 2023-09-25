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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * How a resource is encrypted.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.EncryptionStatus}
 */
public enum EncryptionStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>ENCRYPTION_STATUS_UNSPECIFIED = 0;</code>
   */
  ENCRYPTION_STATUS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Google manages server-side encryption keys on your behalf.
   * </pre>
   *
   * <code>ENCRYPTION_GOOGLE_MANAGED = 1;</code>
   */
  ENCRYPTION_GOOGLE_MANAGED(1),
  /**
   *
   *
   * <pre>
   * Customer provides the key.
   * </pre>
   *
   * <code>ENCRYPTION_CUSTOMER_MANAGED = 2;</code>
   */
  ENCRYPTION_CUSTOMER_MANAGED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>ENCRYPTION_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int ENCRYPTION_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Google manages server-side encryption keys on your behalf.
   * </pre>
   *
   * <code>ENCRYPTION_GOOGLE_MANAGED = 1;</code>
   */
  public static final int ENCRYPTION_GOOGLE_MANAGED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Customer provides the key.
   * </pre>
   *
   * <code>ENCRYPTION_CUSTOMER_MANAGED = 2;</code>
   */
  public static final int ENCRYPTION_CUSTOMER_MANAGED_VALUE = 2;

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
  public static EncryptionStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EncryptionStatus forNumber(int value) {
    switch (value) {
      case 0:
        return ENCRYPTION_STATUS_UNSPECIFIED;
      case 1:
        return ENCRYPTION_GOOGLE_MANAGED;
      case 2:
        return ENCRYPTION_CUSTOMER_MANAGED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EncryptionStatus> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<EncryptionStatus> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<EncryptionStatus>() {
        public EncryptionStatus findValueByNumber(int number) {
          return EncryptionStatus.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(11);
  }

  private static final EncryptionStatus[] VALUES = values();

  public static EncryptionStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EncryptionStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.EncryptionStatus)
}
