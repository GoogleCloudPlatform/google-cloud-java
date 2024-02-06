// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/environment.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

/**
 * <pre>
 * The default set of packages to be staged on a pool of workers.
 * </pre>
 *
 * Protobuf enum {@code google.dataflow.v1beta3.DefaultPackageSet}
 */
public enum DefaultPackageSet
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The default set of packages to stage is unknown, or unspecified.
   * </pre>
   *
   * <code>DEFAULT_PACKAGE_SET_UNKNOWN = 0;</code>
   */
  DEFAULT_PACKAGE_SET_UNKNOWN(0),
  /**
   * <pre>
   * Indicates that no packages should be staged at the worker unless
   * explicitly specified by the job.
   * </pre>
   *
   * <code>DEFAULT_PACKAGE_SET_NONE = 1;</code>
   */
  DEFAULT_PACKAGE_SET_NONE(1),
  /**
   * <pre>
   * Stage packages typically useful to workers written in Java.
   * </pre>
   *
   * <code>DEFAULT_PACKAGE_SET_JAVA = 2;</code>
   */
  DEFAULT_PACKAGE_SET_JAVA(2),
  /**
   * <pre>
   * Stage packages typically useful to workers written in Python.
   * </pre>
   *
   * <code>DEFAULT_PACKAGE_SET_PYTHON = 3;</code>
   */
  DEFAULT_PACKAGE_SET_PYTHON(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The default set of packages to stage is unknown, or unspecified.
   * </pre>
   *
   * <code>DEFAULT_PACKAGE_SET_UNKNOWN = 0;</code>
   */
  public static final int DEFAULT_PACKAGE_SET_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * Indicates that no packages should be staged at the worker unless
   * explicitly specified by the job.
   * </pre>
   *
   * <code>DEFAULT_PACKAGE_SET_NONE = 1;</code>
   */
  public static final int DEFAULT_PACKAGE_SET_NONE_VALUE = 1;
  /**
   * <pre>
   * Stage packages typically useful to workers written in Java.
   * </pre>
   *
   * <code>DEFAULT_PACKAGE_SET_JAVA = 2;</code>
   */
  public static final int DEFAULT_PACKAGE_SET_JAVA_VALUE = 2;
  /**
   * <pre>
   * Stage packages typically useful to workers written in Python.
   * </pre>
   *
   * <code>DEFAULT_PACKAGE_SET_PYTHON = 3;</code>
   */
  public static final int DEFAULT_PACKAGE_SET_PYTHON_VALUE = 3;


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
  public static DefaultPackageSet valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DefaultPackageSet forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT_PACKAGE_SET_UNKNOWN;
      case 1: return DEFAULT_PACKAGE_SET_NONE;
      case 2: return DEFAULT_PACKAGE_SET_JAVA;
      case 3: return DEFAULT_PACKAGE_SET_PYTHON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DefaultPackageSet>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DefaultPackageSet> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DefaultPackageSet>() {
          public DefaultPackageSet findValueByNumber(int number) {
            return DefaultPackageSet.forNumber(number);
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
    return com.google.dataflow.v1beta3.EnvironmentProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final DefaultPackageSet[] VALUES = values();

  public static DefaultPackageSet valueOf(
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

  private DefaultPackageSet(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.DefaultPackageSet)
}

