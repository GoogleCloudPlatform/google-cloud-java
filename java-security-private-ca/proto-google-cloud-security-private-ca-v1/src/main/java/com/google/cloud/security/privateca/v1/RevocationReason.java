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
// source: google/cloud/security/privateca/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.security.privateca.v1;

/**
 *
 *
 * <pre>
 * A [RevocationReason][google.cloud.security.privateca.v1.RevocationReason]
 * indicates whether a
 * [Certificate][google.cloud.security.privateca.v1.Certificate] has been
 * revoked, and the reason for revocation. These correspond to standard
 * revocation reasons from RFC 5280. Note that the enum labels and values in
 * this definition are not the same ASN.1 values defined in RFC 5280. These
 * values will be translated to the correct ASN.1 values when a CRL is created.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.security.privateca.v1.RevocationReason}
 */
public enum RevocationReason implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default unspecified value. This value does indicate that a
   * [Certificate][google.cloud.security.privateca.v1.Certificate] has been
   * revoked, but that a reason has not been recorded.
   * </pre>
   *
   * <code>REVOCATION_REASON_UNSPECIFIED = 0;</code>
   */
  REVOCATION_REASON_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Key material for this
   * [Certificate][google.cloud.security.privateca.v1.Certificate] may have
   * leaked.
   * </pre>
   *
   * <code>KEY_COMPROMISE = 1;</code>
   */
  KEY_COMPROMISE(1),
  /**
   *
   *
   * <pre>
   * The key material for a certificate authority in the issuing path may have
   * leaked.
   * </pre>
   *
   * <code>CERTIFICATE_AUTHORITY_COMPROMISE = 2;</code>
   */
  CERTIFICATE_AUTHORITY_COMPROMISE(2),
  /**
   *
   *
   * <pre>
   * The subject or other attributes in this
   * [Certificate][google.cloud.security.privateca.v1.Certificate] have changed.
   * </pre>
   *
   * <code>AFFILIATION_CHANGED = 3;</code>
   */
  AFFILIATION_CHANGED(3),
  /**
   *
   *
   * <pre>
   * This [Certificate][google.cloud.security.privateca.v1.Certificate] has been
   * superseded.
   * </pre>
   *
   * <code>SUPERSEDED = 4;</code>
   */
  SUPERSEDED(4),
  /**
   *
   *
   * <pre>
   * This [Certificate][google.cloud.security.privateca.v1.Certificate] or
   * entities in the issuing path have ceased to operate.
   * </pre>
   *
   * <code>CESSATION_OF_OPERATION = 5;</code>
   */
  CESSATION_OF_OPERATION(5),
  /**
   *
   *
   * <pre>
   * This [Certificate][google.cloud.security.privateca.v1.Certificate] should
   * not be considered valid, it is expected that it may become valid in the
   * future.
   * </pre>
   *
   * <code>CERTIFICATE_HOLD = 6;</code>
   */
  CERTIFICATE_HOLD(6),
  /**
   *
   *
   * <pre>
   * This [Certificate][google.cloud.security.privateca.v1.Certificate] no
   * longer has permission to assert the listed attributes.
   * </pre>
   *
   * <code>PRIVILEGE_WITHDRAWN = 7;</code>
   */
  PRIVILEGE_WITHDRAWN(7),
  /**
   *
   *
   * <pre>
   * The authority which determines appropriate attributes for a
   * [Certificate][google.cloud.security.privateca.v1.Certificate] may have been
   * compromised.
   * </pre>
   *
   * <code>ATTRIBUTE_AUTHORITY_COMPROMISE = 8;</code>
   */
  ATTRIBUTE_AUTHORITY_COMPROMISE(8),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default unspecified value. This value does indicate that a
   * [Certificate][google.cloud.security.privateca.v1.Certificate] has been
   * revoked, but that a reason has not been recorded.
   * </pre>
   *
   * <code>REVOCATION_REASON_UNSPECIFIED = 0;</code>
   */
  public static final int REVOCATION_REASON_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Key material for this
   * [Certificate][google.cloud.security.privateca.v1.Certificate] may have
   * leaked.
   * </pre>
   *
   * <code>KEY_COMPROMISE = 1;</code>
   */
  public static final int KEY_COMPROMISE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The key material for a certificate authority in the issuing path may have
   * leaked.
   * </pre>
   *
   * <code>CERTIFICATE_AUTHORITY_COMPROMISE = 2;</code>
   */
  public static final int CERTIFICATE_AUTHORITY_COMPROMISE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The subject or other attributes in this
   * [Certificate][google.cloud.security.privateca.v1.Certificate] have changed.
   * </pre>
   *
   * <code>AFFILIATION_CHANGED = 3;</code>
   */
  public static final int AFFILIATION_CHANGED_VALUE = 3;
  /**
   *
   *
   * <pre>
   * This [Certificate][google.cloud.security.privateca.v1.Certificate] has been
   * superseded.
   * </pre>
   *
   * <code>SUPERSEDED = 4;</code>
   */
  public static final int SUPERSEDED_VALUE = 4;
  /**
   *
   *
   * <pre>
   * This [Certificate][google.cloud.security.privateca.v1.Certificate] or
   * entities in the issuing path have ceased to operate.
   * </pre>
   *
   * <code>CESSATION_OF_OPERATION = 5;</code>
   */
  public static final int CESSATION_OF_OPERATION_VALUE = 5;
  /**
   *
   *
   * <pre>
   * This [Certificate][google.cloud.security.privateca.v1.Certificate] should
   * not be considered valid, it is expected that it may become valid in the
   * future.
   * </pre>
   *
   * <code>CERTIFICATE_HOLD = 6;</code>
   */
  public static final int CERTIFICATE_HOLD_VALUE = 6;
  /**
   *
   *
   * <pre>
   * This [Certificate][google.cloud.security.privateca.v1.Certificate] no
   * longer has permission to assert the listed attributes.
   * </pre>
   *
   * <code>PRIVILEGE_WITHDRAWN = 7;</code>
   */
  public static final int PRIVILEGE_WITHDRAWN_VALUE = 7;
  /**
   *
   *
   * <pre>
   * The authority which determines appropriate attributes for a
   * [Certificate][google.cloud.security.privateca.v1.Certificate] may have been
   * compromised.
   * </pre>
   *
   * <code>ATTRIBUTE_AUTHORITY_COMPROMISE = 8;</code>
   */
  public static final int ATTRIBUTE_AUTHORITY_COMPROMISE_VALUE = 8;

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
  public static RevocationReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RevocationReason forNumber(int value) {
    switch (value) {
      case 0:
        return REVOCATION_REASON_UNSPECIFIED;
      case 1:
        return KEY_COMPROMISE;
      case 2:
        return CERTIFICATE_AUTHORITY_COMPROMISE;
      case 3:
        return AFFILIATION_CHANGED;
      case 4:
        return SUPERSEDED;
      case 5:
        return CESSATION_OF_OPERATION;
      case 6:
        return CERTIFICATE_HOLD;
      case 7:
        return PRIVILEGE_WITHDRAWN;
      case 8:
        return ATTRIBUTE_AUTHORITY_COMPROMISE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RevocationReason> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RevocationReason> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<RevocationReason>() {
        public RevocationReason findValueByNumber(int number) {
          return RevocationReason.forNumber(number);
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
    return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final RevocationReason[] VALUES = values();

  public static RevocationReason valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RevocationReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.security.privateca.v1.RevocationReason)
}
