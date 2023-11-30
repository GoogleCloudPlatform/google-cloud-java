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
// source: google/cloud/redis/cluster/v1beta1/cloud_redis_cluster.proto

package com.google.cloud.redis.cluster.v1beta1;

/**
 *
 *
 * <pre>
 * Available mode of in-transit encryption.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.redis.cluster.v1beta1.TransitEncryptionMode}
 */
public enum TransitEncryptionMode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * In-transit encryption not set.
   * </pre>
   *
   * <code>TRANSIT_ENCRYPTION_MODE_UNSPECIFIED = 0;</code>
   */
  TRANSIT_ENCRYPTION_MODE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * In-transit encryption disabled.
   * </pre>
   *
   * <code>TRANSIT_ENCRYPTION_MODE_DISABLED = 1;</code>
   */
  TRANSIT_ENCRYPTION_MODE_DISABLED(1),
  /**
   *
   *
   * <pre>
   * Use server managed encryption for in-transit encryption.
   * </pre>
   *
   * <code>TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION = 2;</code>
   */
  TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * In-transit encryption not set.
   * </pre>
   *
   * <code>TRANSIT_ENCRYPTION_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int TRANSIT_ENCRYPTION_MODE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * In-transit encryption disabled.
   * </pre>
   *
   * <code>TRANSIT_ENCRYPTION_MODE_DISABLED = 1;</code>
   */
  public static final int TRANSIT_ENCRYPTION_MODE_DISABLED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Use server managed encryption for in-transit encryption.
   * </pre>
   *
   * <code>TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION = 2;</code>
   */
  public static final int TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION_VALUE = 2;

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
  public static TransitEncryptionMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransitEncryptionMode forNumber(int value) {
    switch (value) {
      case 0:
        return TRANSIT_ENCRYPTION_MODE_UNSPECIFIED;
      case 1:
        return TRANSIT_ENCRYPTION_MODE_DISABLED;
      case 2:
        return TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransitEncryptionMode>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TransitEncryptionMode>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TransitEncryptionMode>() {
            public TransitEncryptionMode findValueByNumber(int number) {
              return TransitEncryptionMode.forNumber(number);
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
    return com.google.cloud.redis.cluster.v1beta1.CloudRedisClusterProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final TransitEncryptionMode[] VALUES = values();

  public static TransitEncryptionMode valueOf(
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

  private TransitEncryptionMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.redis.cluster.v1beta1.TransitEncryptionMode)
}
