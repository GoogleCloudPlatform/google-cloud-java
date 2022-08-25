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
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] specifies how
 * cryptographic operations are performed. For more information, see [Protection
 * levels] (https://cloud.google.com/kms/docs/algorithms#protection_levels).
 * </pre>
 *
 * Protobuf enum {@code google.cloud.kms.v1.ProtectionLevel}
 */
public enum ProtectionLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>PROTECTION_LEVEL_UNSPECIFIED = 0;</code>
   */
  PROTECTION_LEVEL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Crypto operations are performed in software.
   * </pre>
   *
   * <code>SOFTWARE = 1;</code>
   */
  SOFTWARE(1),
  /**
   *
   *
   * <pre>
   * Crypto operations are performed in a Hardware Security Module.
   * </pre>
   *
   * <code>HSM = 2;</code>
   */
  HSM(2),
  /**
   *
   *
   * <pre>
   * Crypto operations are performed by an external key manager.
   * </pre>
   *
   * <code>EXTERNAL = 3;</code>
   */
  EXTERNAL(3),
  /**
   *
   *
   * <pre>
   * Crypto operations are performed in an EKM-over-VPC backend.
   * </pre>
   *
   * <code>EXTERNAL_VPC = 4;</code>
   */
  EXTERNAL_VPC(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>PROTECTION_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int PROTECTION_LEVEL_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Crypto operations are performed in software.
   * </pre>
   *
   * <code>SOFTWARE = 1;</code>
   */
  public static final int SOFTWARE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Crypto operations are performed in a Hardware Security Module.
   * </pre>
   *
   * <code>HSM = 2;</code>
   */
  public static final int HSM_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Crypto operations are performed by an external key manager.
   * </pre>
   *
   * <code>EXTERNAL = 3;</code>
   */
  public static final int EXTERNAL_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Crypto operations are performed in an EKM-over-VPC backend.
   * </pre>
   *
   * <code>EXTERNAL_VPC = 4;</code>
   */
  public static final int EXTERNAL_VPC_VALUE = 4;

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
  public static ProtectionLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProtectionLevel forNumber(int value) {
    switch (value) {
      case 0:
        return PROTECTION_LEVEL_UNSPECIFIED;
      case 1:
        return SOFTWARE;
      case 2:
        return HSM;
      case 3:
        return EXTERNAL;
      case 4:
        return EXTERNAL_VPC;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProtectionLevel> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ProtectionLevel> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ProtectionLevel>() {
        public ProtectionLevel findValueByNumber(int number) {
          return ProtectionLevel.forNumber(number);
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
    return com.google.cloud.kms.v1.KmsResourcesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ProtectionLevel[] VALUES = values();

  public static ProtectionLevel valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ProtectionLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.kms.v1.ProtectionLevel)
}
