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
// source: google/cloud/aiplatform/v1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Format of the data in the Feature View.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1.FeatureViewDataFormat}
 */
public enum FeatureViewDataFormat implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not set. Will be treated as the KeyValue format.
   * </pre>
   *
   * <code>FEATURE_VIEW_DATA_FORMAT_UNSPECIFIED = 0;</code>
   */
  FEATURE_VIEW_DATA_FORMAT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Return response data in key-value format.
   * </pre>
   *
   * <code>KEY_VALUE = 1;</code>
   */
  KEY_VALUE(1),
  /**
   *
   *
   * <pre>
   * Return response data in proto Struct format.
   * </pre>
   *
   * <code>PROTO_STRUCT = 2;</code>
   */
  PROTO_STRUCT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not set. Will be treated as the KeyValue format.
   * </pre>
   *
   * <code>FEATURE_VIEW_DATA_FORMAT_UNSPECIFIED = 0;</code>
   */
  public static final int FEATURE_VIEW_DATA_FORMAT_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Return response data in key-value format.
   * </pre>
   *
   * <code>KEY_VALUE = 1;</code>
   */
  public static final int KEY_VALUE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Return response data in proto Struct format.
   * </pre>
   *
   * <code>PROTO_STRUCT = 2;</code>
   */
  public static final int PROTO_STRUCT_VALUE = 2;

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
  public static FeatureViewDataFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FeatureViewDataFormat forNumber(int value) {
    switch (value) {
      case 0:
        return FEATURE_VIEW_DATA_FORMAT_UNSPECIFIED;
      case 1:
        return KEY_VALUE;
      case 2:
        return PROTO_STRUCT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FeatureViewDataFormat>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<FeatureViewDataFormat>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FeatureViewDataFormat>() {
            public FeatureViewDataFormat findValueByNumber(int number) {
              return FeatureViewDataFormat.forNumber(number);
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
    return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final FeatureViewDataFormat[] VALUES = values();

  public static FeatureViewDataFormat valueOf(
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

  private FeatureViewDataFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.FeatureViewDataFormat)
}
