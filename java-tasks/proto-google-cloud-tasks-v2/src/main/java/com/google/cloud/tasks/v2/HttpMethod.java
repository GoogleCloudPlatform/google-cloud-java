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
// source: google/cloud/tasks/v2/target.proto

package com.google.cloud.tasks.v2;

/**
 *
 *
 * <pre>
 * The HTTP method used to deliver the task.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.tasks.v2.HttpMethod}
 */
public enum HttpMethod implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * HTTP method unspecified
   * </pre>
   *
   * <code>HTTP_METHOD_UNSPECIFIED = 0;</code>
   */
  HTTP_METHOD_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * HTTP POST
   * </pre>
   *
   * <code>POST = 1;</code>
   */
  POST(1),
  /**
   *
   *
   * <pre>
   * HTTP GET
   * </pre>
   *
   * <code>GET = 2;</code>
   */
  GET(2),
  /**
   *
   *
   * <pre>
   * HTTP HEAD
   * </pre>
   *
   * <code>HEAD = 3;</code>
   */
  HEAD(3),
  /**
   *
   *
   * <pre>
   * HTTP PUT
   * </pre>
   *
   * <code>PUT = 4;</code>
   */
  PUT(4),
  /**
   *
   *
   * <pre>
   * HTTP DELETE
   * </pre>
   *
   * <code>DELETE = 5;</code>
   */
  DELETE(5),
  /**
   *
   *
   * <pre>
   * HTTP PATCH
   * </pre>
   *
   * <code>PATCH = 6;</code>
   */
  PATCH(6),
  /**
   *
   *
   * <pre>
   * HTTP OPTIONS
   * </pre>
   *
   * <code>OPTIONS = 7;</code>
   */
  OPTIONS(7),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * HTTP method unspecified
   * </pre>
   *
   * <code>HTTP_METHOD_UNSPECIFIED = 0;</code>
   */
  public static final int HTTP_METHOD_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * HTTP POST
   * </pre>
   *
   * <code>POST = 1;</code>
   */
  public static final int POST_VALUE = 1;
  /**
   *
   *
   * <pre>
   * HTTP GET
   * </pre>
   *
   * <code>GET = 2;</code>
   */
  public static final int GET_VALUE = 2;
  /**
   *
   *
   * <pre>
   * HTTP HEAD
   * </pre>
   *
   * <code>HEAD = 3;</code>
   */
  public static final int HEAD_VALUE = 3;
  /**
   *
   *
   * <pre>
   * HTTP PUT
   * </pre>
   *
   * <code>PUT = 4;</code>
   */
  public static final int PUT_VALUE = 4;
  /**
   *
   *
   * <pre>
   * HTTP DELETE
   * </pre>
   *
   * <code>DELETE = 5;</code>
   */
  public static final int DELETE_VALUE = 5;
  /**
   *
   *
   * <pre>
   * HTTP PATCH
   * </pre>
   *
   * <code>PATCH = 6;</code>
   */
  public static final int PATCH_VALUE = 6;
  /**
   *
   *
   * <pre>
   * HTTP OPTIONS
   * </pre>
   *
   * <code>OPTIONS = 7;</code>
   */
  public static final int OPTIONS_VALUE = 7;

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
  public static HttpMethod valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HttpMethod forNumber(int value) {
    switch (value) {
      case 0:
        return HTTP_METHOD_UNSPECIFIED;
      case 1:
        return POST;
      case 2:
        return GET;
      case 3:
        return HEAD;
      case 4:
        return PUT;
      case 5:
        return DELETE;
      case 6:
        return PATCH;
      case 7:
        return OPTIONS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HttpMethod> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<HttpMethod> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<HttpMethod>() {
        public HttpMethod findValueByNumber(int number) {
          return HttpMethod.forNumber(number);
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
    return com.google.cloud.tasks.v2.TargetProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final HttpMethod[] VALUES = values();

  public static HttpMethod valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private HttpMethod(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.tasks.v2.HttpMethod)
}
