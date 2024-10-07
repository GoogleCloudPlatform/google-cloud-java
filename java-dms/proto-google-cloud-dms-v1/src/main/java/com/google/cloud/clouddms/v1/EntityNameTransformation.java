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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Entity Name Transformation Types
 * </pre>
 *
 * Protobuf enum {@code google.cloud.clouddms.v1.EntityNameTransformation}
 */
public enum EntityNameTransformation implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Entity name transformation unspecified.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_UNSPECIFIED = 0;</code>
   */
  ENTITY_NAME_TRANSFORMATION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * No transformation.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_NO_TRANSFORMATION = 1;</code>
   */
  ENTITY_NAME_TRANSFORMATION_NO_TRANSFORMATION(1),
  /**
   *
   *
   * <pre>
   * Transform to lower case.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_LOWER_CASE = 2;</code>
   */
  ENTITY_NAME_TRANSFORMATION_LOWER_CASE(2),
  /**
   *
   *
   * <pre>
   * Transform to upper case.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_UPPER_CASE = 3;</code>
   */
  ENTITY_NAME_TRANSFORMATION_UPPER_CASE(3),
  /**
   *
   *
   * <pre>
   * Transform to capitalized case.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_CAPITALIZED_CASE = 4;</code>
   */
  ENTITY_NAME_TRANSFORMATION_CAPITALIZED_CASE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Entity name transformation unspecified.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_UNSPECIFIED = 0;</code>
   */
  public static final int ENTITY_NAME_TRANSFORMATION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * No transformation.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_NO_TRANSFORMATION = 1;</code>
   */
  public static final int ENTITY_NAME_TRANSFORMATION_NO_TRANSFORMATION_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Transform to lower case.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_LOWER_CASE = 2;</code>
   */
  public static final int ENTITY_NAME_TRANSFORMATION_LOWER_CASE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Transform to upper case.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_UPPER_CASE = 3;</code>
   */
  public static final int ENTITY_NAME_TRANSFORMATION_UPPER_CASE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Transform to capitalized case.
   * </pre>
   *
   * <code>ENTITY_NAME_TRANSFORMATION_CAPITALIZED_CASE = 4;</code>
   */
  public static final int ENTITY_NAME_TRANSFORMATION_CAPITALIZED_CASE_VALUE = 4;

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
  public static EntityNameTransformation valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EntityNameTransformation forNumber(int value) {
    switch (value) {
      case 0:
        return ENTITY_NAME_TRANSFORMATION_UNSPECIFIED;
      case 1:
        return ENTITY_NAME_TRANSFORMATION_NO_TRANSFORMATION;
      case 2:
        return ENTITY_NAME_TRANSFORMATION_LOWER_CASE;
      case 3:
        return ENTITY_NAME_TRANSFORMATION_UPPER_CASE;
      case 4:
        return ENTITY_NAME_TRANSFORMATION_CAPITALIZED_CASE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EntityNameTransformation>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<EntityNameTransformation>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EntityNameTransformation>() {
            public EntityNameTransformation findValueByNumber(int number) {
              return EntityNameTransformation.forNumber(number);
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
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto.getDescriptor()
        .getEnumTypes()
        .get(2);
  }

  private static final EntityNameTransformation[] VALUES = values();

  public static EntityNameTransformation valueOf(
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

  private EntityNameTransformation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.clouddms.v1.EntityNameTransformation)
}
