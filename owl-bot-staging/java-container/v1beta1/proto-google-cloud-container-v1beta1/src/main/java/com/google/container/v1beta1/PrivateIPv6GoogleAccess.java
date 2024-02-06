// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

/**
 * <pre>
 * PrivateIPv6GoogleAccess controls whether and how the pods can communicate
 * with Google Services through gRPC over IPv6.
 * </pre>
 *
 * Protobuf enum {@code google.container.v1beta1.PrivateIPv6GoogleAccess}
 */
public enum PrivateIPv6GoogleAccess
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default value. Same as DISABLED
   * </pre>
   *
   * <code>PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED = 0;</code>
   */
  PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED(0),
  /**
   * <pre>
   * No private access to or from Google Services
   * </pre>
   *
   * <code>PRIVATE_IPV6_GOOGLE_ACCESS_DISABLED = 1;</code>
   */
  PRIVATE_IPV6_GOOGLE_ACCESS_DISABLED(1),
  /**
   * <pre>
   * Enables private IPv6 access to Google Services from GKE
   * </pre>
   *
   * <code>PRIVATE_IPV6_GOOGLE_ACCESS_TO_GOOGLE = 2;</code>
   */
  PRIVATE_IPV6_GOOGLE_ACCESS_TO_GOOGLE(2),
  /**
   * <pre>
   * Enables private IPv6 access to and from Google Services
   * </pre>
   *
   * <code>PRIVATE_IPV6_GOOGLE_ACCESS_BIDIRECTIONAL = 3;</code>
   */
  PRIVATE_IPV6_GOOGLE_ACCESS_BIDIRECTIONAL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default value. Same as DISABLED
   * </pre>
   *
   * <code>PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED = 0;</code>
   */
  public static final int PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * No private access to or from Google Services
   * </pre>
   *
   * <code>PRIVATE_IPV6_GOOGLE_ACCESS_DISABLED = 1;</code>
   */
  public static final int PRIVATE_IPV6_GOOGLE_ACCESS_DISABLED_VALUE = 1;
  /**
   * <pre>
   * Enables private IPv6 access to Google Services from GKE
   * </pre>
   *
   * <code>PRIVATE_IPV6_GOOGLE_ACCESS_TO_GOOGLE = 2;</code>
   */
  public static final int PRIVATE_IPV6_GOOGLE_ACCESS_TO_GOOGLE_VALUE = 2;
  /**
   * <pre>
   * Enables private IPv6 access to and from Google Services
   * </pre>
   *
   * <code>PRIVATE_IPV6_GOOGLE_ACCESS_BIDIRECTIONAL = 3;</code>
   */
  public static final int PRIVATE_IPV6_GOOGLE_ACCESS_BIDIRECTIONAL_VALUE = 3;


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
  public static PrivateIPv6GoogleAccess valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PrivateIPv6GoogleAccess forNumber(int value) {
    switch (value) {
      case 0: return PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED;
      case 1: return PRIVATE_IPV6_GOOGLE_ACCESS_DISABLED;
      case 2: return PRIVATE_IPV6_GOOGLE_ACCESS_TO_GOOGLE;
      case 3: return PRIVATE_IPV6_GOOGLE_ACCESS_BIDIRECTIONAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PrivateIPv6GoogleAccess>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PrivateIPv6GoogleAccess> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PrivateIPv6GoogleAccess>() {
          public PrivateIPv6GoogleAccess findValueByNumber(int number) {
            return PrivateIPv6GoogleAccess.forNumber(number);
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
    return com.google.container.v1beta1.ClusterServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final PrivateIPv6GoogleAccess[] VALUES = values();

  public static PrivateIPv6GoogleAccess valueOf(
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

  private PrivateIPv6GoogleAccess(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.container.v1beta1.PrivateIPv6GoogleAccess)
}

