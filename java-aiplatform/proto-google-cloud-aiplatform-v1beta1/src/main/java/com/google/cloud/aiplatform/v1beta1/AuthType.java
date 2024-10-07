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
// source: google/cloud/aiplatform/v1beta1/extension.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Type of Auth.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1beta1.AuthType}
 */
public enum AuthType implements com.google.protobuf.ProtocolMessageEnum {
  /** <code>AUTH_TYPE_UNSPECIFIED = 0;</code> */
  AUTH_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * No Auth.
   * </pre>
   *
   * <code>NO_AUTH = 1;</code>
   */
  NO_AUTH(1),
  /**
   *
   *
   * <pre>
   * API Key Auth.
   * </pre>
   *
   * <code>API_KEY_AUTH = 2;</code>
   */
  API_KEY_AUTH(2),
  /**
   *
   *
   * <pre>
   * HTTP Basic Auth.
   * </pre>
   *
   * <code>HTTP_BASIC_AUTH = 3;</code>
   */
  HTTP_BASIC_AUTH(3),
  /**
   *
   *
   * <pre>
   * Google Service Account Auth.
   * </pre>
   *
   * <code>GOOGLE_SERVICE_ACCOUNT_AUTH = 4;</code>
   */
  GOOGLE_SERVICE_ACCOUNT_AUTH(4),
  /**
   *
   *
   * <pre>
   * OAuth auth.
   * </pre>
   *
   * <code>OAUTH = 6;</code>
   */
  OAUTH(6),
  /**
   *
   *
   * <pre>
   * OpenID Connect (OIDC) Auth.
   * </pre>
   *
   * <code>OIDC_AUTH = 8;</code>
   */
  OIDC_AUTH(8),
  UNRECOGNIZED(-1),
  ;

  /** <code>AUTH_TYPE_UNSPECIFIED = 0;</code> */
  public static final int AUTH_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * No Auth.
   * </pre>
   *
   * <code>NO_AUTH = 1;</code>
   */
  public static final int NO_AUTH_VALUE = 1;
  /**
   *
   *
   * <pre>
   * API Key Auth.
   * </pre>
   *
   * <code>API_KEY_AUTH = 2;</code>
   */
  public static final int API_KEY_AUTH_VALUE = 2;
  /**
   *
   *
   * <pre>
   * HTTP Basic Auth.
   * </pre>
   *
   * <code>HTTP_BASIC_AUTH = 3;</code>
   */
  public static final int HTTP_BASIC_AUTH_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Google Service Account Auth.
   * </pre>
   *
   * <code>GOOGLE_SERVICE_ACCOUNT_AUTH = 4;</code>
   */
  public static final int GOOGLE_SERVICE_ACCOUNT_AUTH_VALUE = 4;
  /**
   *
   *
   * <pre>
   * OAuth auth.
   * </pre>
   *
   * <code>OAUTH = 6;</code>
   */
  public static final int OAUTH_VALUE = 6;
  /**
   *
   *
   * <pre>
   * OpenID Connect (OIDC) Auth.
   * </pre>
   *
   * <code>OIDC_AUTH = 8;</code>
   */
  public static final int OIDC_AUTH_VALUE = 8;

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
  public static AuthType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AuthType forNumber(int value) {
    switch (value) {
      case 0:
        return AUTH_TYPE_UNSPECIFIED;
      case 1:
        return NO_AUTH;
      case 2:
        return API_KEY_AUTH;
      case 3:
        return HTTP_BASIC_AUTH;
      case 4:
        return GOOGLE_SERVICE_ACCOUNT_AUTH;
      case 6:
        return OAUTH;
      case 8:
        return OIDC_AUTH;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AuthType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AuthType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<AuthType>() {
        public AuthType findValueByNumber(int number) {
          return AuthType.forNumber(number);
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
    return com.google.cloud.aiplatform.v1beta1.ExtensionProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final AuthType[] VALUES = values();

  public static AuthType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AuthType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.AuthType)
}
