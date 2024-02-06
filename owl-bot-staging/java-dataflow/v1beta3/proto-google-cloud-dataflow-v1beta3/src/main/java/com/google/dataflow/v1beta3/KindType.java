// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/jobs.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

/**
 * <pre>
 * Type of transform or stage operation.
 * </pre>
 *
 * Protobuf enum {@code google.dataflow.v1beta3.KindType}
 */
public enum KindType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unrecognized transform type.
   * </pre>
   *
   * <code>UNKNOWN_KIND = 0;</code>
   */
  UNKNOWN_KIND(0),
  /**
   * <pre>
   * ParDo transform.
   * </pre>
   *
   * <code>PAR_DO_KIND = 1;</code>
   */
  PAR_DO_KIND(1),
  /**
   * <pre>
   * Group By Key transform.
   * </pre>
   *
   * <code>GROUP_BY_KEY_KIND = 2;</code>
   */
  GROUP_BY_KEY_KIND(2),
  /**
   * <pre>
   * Flatten transform.
   * </pre>
   *
   * <code>FLATTEN_KIND = 3;</code>
   */
  FLATTEN_KIND(3),
  /**
   * <pre>
   * Read transform.
   * </pre>
   *
   * <code>READ_KIND = 4;</code>
   */
  READ_KIND(4),
  /**
   * <pre>
   * Write transform.
   * </pre>
   *
   * <code>WRITE_KIND = 5;</code>
   */
  WRITE_KIND(5),
  /**
   * <pre>
   * Constructs from a constant value, such as with Create.of.
   * </pre>
   *
   * <code>CONSTANT_KIND = 6;</code>
   */
  CONSTANT_KIND(6),
  /**
   * <pre>
   * Creates a Singleton view of a collection.
   * </pre>
   *
   * <code>SINGLETON_KIND = 7;</code>
   */
  SINGLETON_KIND(7),
  /**
   * <pre>
   * Opening or closing a shuffle session, often as part of a GroupByKey.
   * </pre>
   *
   * <code>SHUFFLE_KIND = 8;</code>
   */
  SHUFFLE_KIND(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unrecognized transform type.
   * </pre>
   *
   * <code>UNKNOWN_KIND = 0;</code>
   */
  public static final int UNKNOWN_KIND_VALUE = 0;
  /**
   * <pre>
   * ParDo transform.
   * </pre>
   *
   * <code>PAR_DO_KIND = 1;</code>
   */
  public static final int PAR_DO_KIND_VALUE = 1;
  /**
   * <pre>
   * Group By Key transform.
   * </pre>
   *
   * <code>GROUP_BY_KEY_KIND = 2;</code>
   */
  public static final int GROUP_BY_KEY_KIND_VALUE = 2;
  /**
   * <pre>
   * Flatten transform.
   * </pre>
   *
   * <code>FLATTEN_KIND = 3;</code>
   */
  public static final int FLATTEN_KIND_VALUE = 3;
  /**
   * <pre>
   * Read transform.
   * </pre>
   *
   * <code>READ_KIND = 4;</code>
   */
  public static final int READ_KIND_VALUE = 4;
  /**
   * <pre>
   * Write transform.
   * </pre>
   *
   * <code>WRITE_KIND = 5;</code>
   */
  public static final int WRITE_KIND_VALUE = 5;
  /**
   * <pre>
   * Constructs from a constant value, such as with Create.of.
   * </pre>
   *
   * <code>CONSTANT_KIND = 6;</code>
   */
  public static final int CONSTANT_KIND_VALUE = 6;
  /**
   * <pre>
   * Creates a Singleton view of a collection.
   * </pre>
   *
   * <code>SINGLETON_KIND = 7;</code>
   */
  public static final int SINGLETON_KIND_VALUE = 7;
  /**
   * <pre>
   * Opening or closing a shuffle session, often as part of a GroupByKey.
   * </pre>
   *
   * <code>SHUFFLE_KIND = 8;</code>
   */
  public static final int SHUFFLE_KIND_VALUE = 8;


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
  public static KindType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static KindType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_KIND;
      case 1: return PAR_DO_KIND;
      case 2: return GROUP_BY_KEY_KIND;
      case 3: return FLATTEN_KIND;
      case 4: return READ_KIND;
      case 5: return WRITE_KIND;
      case 6: return CONSTANT_KIND;
      case 7: return SINGLETON_KIND;
      case 8: return SHUFFLE_KIND;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<KindType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      KindType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<KindType>() {
          public KindType findValueByNumber(int number) {
            return KindType.forNumber(number);
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
    return com.google.dataflow.v1beta3.JobsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final KindType[] VALUES = values();

  public static KindType valueOf(
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

  private KindType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.KindType)
}

