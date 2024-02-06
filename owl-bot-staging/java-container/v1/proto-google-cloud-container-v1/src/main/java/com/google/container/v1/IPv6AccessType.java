// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

/**
 * <pre>
 * Possible values for IPv6 access type
 * </pre>
 *
 * Protobuf enum {@code google.container.v1.IPv6AccessType}
 */
public enum IPv6AccessType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default value, will be defaulted as type external.
   * </pre>
   *
   * <code>IPV6_ACCESS_TYPE_UNSPECIFIED = 0;</code>
   */
  IPV6_ACCESS_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Access type internal (all v6 addresses are internal IPs)
   * </pre>
   *
   * <code>INTERNAL = 1;</code>
   */
  INTERNAL(1),
  /**
   * <pre>
   * Access type external (all v6 addresses are external IPs)
   * </pre>
   *
   * <code>EXTERNAL = 2;</code>
   */
  EXTERNAL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default value, will be defaulted as type external.
   * </pre>
   *
   * <code>IPV6_ACCESS_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int IPV6_ACCESS_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Access type internal (all v6 addresses are internal IPs)
   * </pre>
   *
   * <code>INTERNAL = 1;</code>
   */
  public static final int INTERNAL_VALUE = 1;
  /**
   * <pre>
   * Access type external (all v6 addresses are external IPs)
   * </pre>
   *
   * <code>EXTERNAL = 2;</code>
   */
  public static final int EXTERNAL_VALUE = 2;


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
  public static IPv6AccessType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IPv6AccessType forNumber(int value) {
    switch (value) {
      case 0: return IPV6_ACCESS_TYPE_UNSPECIFIED;
      case 1: return INTERNAL;
      case 2: return EXTERNAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IPv6AccessType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IPv6AccessType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IPv6AccessType>() {
          public IPv6AccessType findValueByNumber(int number) {
            return IPv6AccessType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final IPv6AccessType[] VALUES = values();

  public static IPv6AccessType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private IPv6AccessType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.container.v1.IPv6AccessType)
}

