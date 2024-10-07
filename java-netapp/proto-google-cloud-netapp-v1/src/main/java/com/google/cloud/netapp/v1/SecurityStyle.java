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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * The security style of the volume, can be either UNIX or NTFS.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.netapp.v1.SecurityStyle}
 */
public enum SecurityStyle implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * SecurityStyle is unspecified
   * </pre>
   *
   * <code>SECURITY_STYLE_UNSPECIFIED = 0;</code>
   */
  SECURITY_STYLE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * SecurityStyle uses NTFS
   * </pre>
   *
   * <code>NTFS = 1;</code>
   */
  NTFS(1),
  /**
   *
   *
   * <pre>
   * SecurityStyle uses UNIX
   * </pre>
   *
   * <code>UNIX = 2;</code>
   */
  UNIX(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * SecurityStyle is unspecified
   * </pre>
   *
   * <code>SECURITY_STYLE_UNSPECIFIED = 0;</code>
   */
  public static final int SECURITY_STYLE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * SecurityStyle uses NTFS
   * </pre>
   *
   * <code>NTFS = 1;</code>
   */
  public static final int NTFS_VALUE = 1;
  /**
   *
   *
   * <pre>
   * SecurityStyle uses UNIX
   * </pre>
   *
   * <code>UNIX = 2;</code>
   */
  public static final int UNIX_VALUE = 2;

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
  public static SecurityStyle valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SecurityStyle forNumber(int value) {
    switch (value) {
      case 0:
        return SECURITY_STYLE_UNSPECIFIED;
      case 1:
        return NTFS;
      case 2:
        return UNIX;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SecurityStyle> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SecurityStyle> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SecurityStyle>() {
        public SecurityStyle findValueByNumber(int number) {
          return SecurityStyle.forNumber(number);
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
    return com.google.cloud.netapp.v1.VolumeProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final SecurityStyle[] VALUES = values();

  public static SecurityStyle valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SecurityStyle(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.netapp.v1.SecurityStyle)
}
