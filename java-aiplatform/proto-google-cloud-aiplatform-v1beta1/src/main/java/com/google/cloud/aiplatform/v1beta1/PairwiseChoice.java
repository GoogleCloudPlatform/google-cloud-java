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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Pairwise prediction autorater preference.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1beta1.PairwiseChoice}
 */
public enum PairwiseChoice implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified prediction choice.
   * </pre>
   *
   * <code>PAIRWISE_CHOICE_UNSPECIFIED = 0;</code>
   */
  PAIRWISE_CHOICE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Baseline prediction wins
   * </pre>
   *
   * <code>BASELINE = 1;</code>
   */
  BASELINE(1),
  /**
   *
   *
   * <pre>
   * Candidate prediction wins
   * </pre>
   *
   * <code>CANDIDATE = 2;</code>
   */
  CANDIDATE(2),
  /**
   *
   *
   * <pre>
   * Winner cannot be determined
   * </pre>
   *
   * <code>TIE = 3;</code>
   */
  TIE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified prediction choice.
   * </pre>
   *
   * <code>PAIRWISE_CHOICE_UNSPECIFIED = 0;</code>
   */
  public static final int PAIRWISE_CHOICE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Baseline prediction wins
   * </pre>
   *
   * <code>BASELINE = 1;</code>
   */
  public static final int BASELINE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Candidate prediction wins
   * </pre>
   *
   * <code>CANDIDATE = 2;</code>
   */
  public static final int CANDIDATE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Winner cannot be determined
   * </pre>
   *
   * <code>TIE = 3;</code>
   */
  public static final int TIE_VALUE = 3;

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
  public static PairwiseChoice valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PairwiseChoice forNumber(int value) {
    switch (value) {
      case 0:
        return PAIRWISE_CHOICE_UNSPECIFIED;
      case 1:
        return BASELINE;
      case 2:
        return CANDIDATE;
      case 3:
        return TIE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PairwiseChoice> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PairwiseChoice> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<PairwiseChoice>() {
        public PairwiseChoice findValueByNumber(int number) {
          return PairwiseChoice.forNumber(number);
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
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final PairwiseChoice[] VALUES = values();

  public static PairwiseChoice valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PairwiseChoice(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.PairwiseChoice)
}
