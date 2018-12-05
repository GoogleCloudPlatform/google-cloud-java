// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

/**
 *
 *
 * <pre>
 * Bucketized representation of likelihood.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.videointelligence.v1.Likelihood}
 */
public enum Likelihood implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified likelihood.
   * </pre>
   *
   * <code>LIKELIHOOD_UNSPECIFIED = 0;</code>
   */
  LIKELIHOOD_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Very unlikely.
   * </pre>
   *
   * <code>VERY_UNLIKELY = 1;</code>
   */
  VERY_UNLIKELY(1),
  /**
   *
   *
   * <pre>
   * Unlikely.
   * </pre>
   *
   * <code>UNLIKELY = 2;</code>
   */
  UNLIKELY(2),
  /**
   *
   *
   * <pre>
   * Possible.
   * </pre>
   *
   * <code>POSSIBLE = 3;</code>
   */
  POSSIBLE(3),
  /**
   *
   *
   * <pre>
   * Likely.
   * </pre>
   *
   * <code>LIKELY = 4;</code>
   */
  LIKELY(4),
  /**
   *
   *
   * <pre>
   * Very likely.
   * </pre>
   *
   * <code>VERY_LIKELY = 5;</code>
   */
  VERY_LIKELY(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified likelihood.
   * </pre>
   *
   * <code>LIKELIHOOD_UNSPECIFIED = 0;</code>
   */
  public static final int LIKELIHOOD_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Very unlikely.
   * </pre>
   *
   * <code>VERY_UNLIKELY = 1;</code>
   */
  public static final int VERY_UNLIKELY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Unlikely.
   * </pre>
   *
   * <code>UNLIKELY = 2;</code>
   */
  public static final int UNLIKELY_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Possible.
   * </pre>
   *
   * <code>POSSIBLE = 3;</code>
   */
  public static final int POSSIBLE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Likely.
   * </pre>
   *
   * <code>LIKELY = 4;</code>
   */
  public static final int LIKELY_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Very likely.
   * </pre>
   *
   * <code>VERY_LIKELY = 5;</code>
   */
  public static final int VERY_LIKELY_VALUE = 5;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /** @deprecated Use {@link #forNumber(int)} instead. */
  @java.lang.Deprecated
  public static Likelihood valueOf(int value) {
    return forNumber(value);
  }

  public static Likelihood forNumber(int value) {
    switch (value) {
      case 0:
        return LIKELIHOOD_UNSPECIFIED;
      case 1:
        return VERY_UNLIKELY;
      case 2:
        return UNLIKELY;
      case 3:
        return POSSIBLE;
      case 4:
        return LIKELY;
      case 5:
        return VERY_LIKELY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Likelihood> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Likelihood> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Likelihood>() {
        public Likelihood findValueByNumber(int number) {
          return Likelihood.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.getDescriptor()
        .getEnumTypes()
        .get(2);
  }

  private static final Likelihood[] VALUES = values();

  public static Likelihood valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Likelihood(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.videointelligence.v1.Likelihood)
}
