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
// source: google/cloud/alloydb/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1;

/**
 *
 *
 * <pre>
 * View on Cluster. Pass this enum to rpcs that returns a cluster message to
 * control which subsets of fields to get.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.alloydb.v1.ClusterView}
 */
public enum ClusterView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * CLUSTER_VIEW_UNSPECIFIED Not specified, equivalent to BASIC.
   * </pre>
   *
   * <code>CLUSTER_VIEW_UNSPECIFIED = 0;</code>
   */
  CLUSTER_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * BASIC server responses include all the relevant cluster details, excluding
   * Cluster.ContinuousBackupInfo.EarliestRestorableTime and other view-specific
   * fields. The default value.
   * </pre>
   *
   * <code>CLUSTER_VIEW_BASIC = 1;</code>
   */
  CLUSTER_VIEW_BASIC(1),
  /**
   *
   *
   * <pre>
   * CONTINUOUS_BACKUP response returns all the fields from BASIC plus
   * the earliest restorable time if continuous backups are enabled.
   * May increase latency.
   * </pre>
   *
   * <code>CLUSTER_VIEW_CONTINUOUS_BACKUP = 2;</code>
   */
  CLUSTER_VIEW_CONTINUOUS_BACKUP(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * CLUSTER_VIEW_UNSPECIFIED Not specified, equivalent to BASIC.
   * </pre>
   *
   * <code>CLUSTER_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int CLUSTER_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * BASIC server responses include all the relevant cluster details, excluding
   * Cluster.ContinuousBackupInfo.EarliestRestorableTime and other view-specific
   * fields. The default value.
   * </pre>
   *
   * <code>CLUSTER_VIEW_BASIC = 1;</code>
   */
  public static final int CLUSTER_VIEW_BASIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * CONTINUOUS_BACKUP response returns all the fields from BASIC plus
   * the earliest restorable time if continuous backups are enabled.
   * May increase latency.
   * </pre>
   *
   * <code>CLUSTER_VIEW_CONTINUOUS_BACKUP = 2;</code>
   */
  public static final int CLUSTER_VIEW_CONTINUOUS_BACKUP_VALUE = 2;

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
  public static ClusterView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClusterView forNumber(int value) {
    switch (value) {
      case 0:
        return CLUSTER_VIEW_UNSPECIFIED;
      case 1:
        return CLUSTER_VIEW_BASIC;
      case 2:
        return CLUSTER_VIEW_CONTINUOUS_BACKUP;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClusterView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ClusterView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ClusterView>() {
        public ClusterView findValueByNumber(int number) {
          return ClusterView.forNumber(number);
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
    return com.google.cloud.alloydb.v1.ResourcesProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ClusterView[] VALUES = values();

  public static ClusterView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ClusterView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.alloydb.v1.ClusterView)
}
