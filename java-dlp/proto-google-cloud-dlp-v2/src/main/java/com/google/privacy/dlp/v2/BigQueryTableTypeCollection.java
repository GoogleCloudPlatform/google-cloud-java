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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Over time new types may be added. Currently VIEW, MATERIALIZED_VIEW,
 * and SNAPSHOT are not supported.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.BigQueryTableTypeCollection}
 */
public enum BigQueryTableTypeCollection implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>BIG_QUERY_COLLECTION_UNSPECIFIED = 0;</code>
   */
  BIG_QUERY_COLLECTION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Automatically generate profiles for all tables, even if the table type is
   * not yet fully supported for analysis. Profiles for unsupported tables will
   * be generated with errors to indicate their partial support. When full
   * support is added, the tables will automatically be profiled during the next
   * scheduled run.
   * </pre>
   *
   * <code>BIG_QUERY_COLLECTION_ALL_TYPES = 1;</code>
   */
  BIG_QUERY_COLLECTION_ALL_TYPES(1),
  /**
   *
   *
   * <pre>
   * Only those types fully supported will be profiled. Will expand
   * automatically as Cloud DLP adds support for new table types. Unsupported
   * table types will not have partial profiles generated.
   * </pre>
   *
   * <code>BIG_QUERY_COLLECTION_ONLY_SUPPORTED_TYPES = 2;</code>
   */
  BIG_QUERY_COLLECTION_ONLY_SUPPORTED_TYPES(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>BIG_QUERY_COLLECTION_UNSPECIFIED = 0;</code>
   */
  public static final int BIG_QUERY_COLLECTION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Automatically generate profiles for all tables, even if the table type is
   * not yet fully supported for analysis. Profiles for unsupported tables will
   * be generated with errors to indicate their partial support. When full
   * support is added, the tables will automatically be profiled during the next
   * scheduled run.
   * </pre>
   *
   * <code>BIG_QUERY_COLLECTION_ALL_TYPES = 1;</code>
   */
  public static final int BIG_QUERY_COLLECTION_ALL_TYPES_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Only those types fully supported will be profiled. Will expand
   * automatically as Cloud DLP adds support for new table types. Unsupported
   * table types will not have partial profiles generated.
   * </pre>
   *
   * <code>BIG_QUERY_COLLECTION_ONLY_SUPPORTED_TYPES = 2;</code>
   */
  public static final int BIG_QUERY_COLLECTION_ONLY_SUPPORTED_TYPES_VALUE = 2;

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
  public static BigQueryTableTypeCollection valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BigQueryTableTypeCollection forNumber(int value) {
    switch (value) {
      case 0:
        return BIG_QUERY_COLLECTION_UNSPECIFIED;
      case 1:
        return BIG_QUERY_COLLECTION_ALL_TYPES;
      case 2:
        return BIG_QUERY_COLLECTION_ONLY_SUPPORTED_TYPES;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BigQueryTableTypeCollection>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<BigQueryTableTypeCollection>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BigQueryTableTypeCollection>() {
            public BigQueryTableTypeCollection findValueByNumber(int number) {
              return BigQueryTableTypeCollection.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final BigQueryTableTypeCollection[] VALUES = values();

  public static BigQueryTableTypeCollection valueOf(
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

  private BigQueryTableTypeCollection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.BigQueryTableTypeCollection)
}
