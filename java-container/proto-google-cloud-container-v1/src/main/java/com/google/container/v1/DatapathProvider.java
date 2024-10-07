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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * The datapath provider selects the implementation of the Kubernetes networking
 * model for service resolution and network policy enforcement.
 * </pre>
 *
 * Protobuf enum {@code google.container.v1.DatapathProvider}
 */
public enum DatapathProvider implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>DATAPATH_PROVIDER_UNSPECIFIED = 0;</code>
   */
  DATAPATH_PROVIDER_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Use the IPTables implementation based on kube-proxy.
   * </pre>
   *
   * <code>LEGACY_DATAPATH = 1;</code>
   */
  LEGACY_DATAPATH(1),
  /**
   *
   *
   * <pre>
   * Use the eBPF based GKE Dataplane V2 with additional features. See the [GKE
   * Dataplane V2
   * documentation](https://cloud.google.com/kubernetes-engine/docs/how-to/dataplane-v2)
   * for more.
   * </pre>
   *
   * <code>ADVANCED_DATAPATH = 2;</code>
   */
  ADVANCED_DATAPATH(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>DATAPATH_PROVIDER_UNSPECIFIED = 0;</code>
   */
  public static final int DATAPATH_PROVIDER_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Use the IPTables implementation based on kube-proxy.
   * </pre>
   *
   * <code>LEGACY_DATAPATH = 1;</code>
   */
  public static final int LEGACY_DATAPATH_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Use the eBPF based GKE Dataplane V2 with additional features. See the [GKE
   * Dataplane V2
   * documentation](https://cloud.google.com/kubernetes-engine/docs/how-to/dataplane-v2)
   * for more.
   * </pre>
   *
   * <code>ADVANCED_DATAPATH = 2;</code>
   */
  public static final int ADVANCED_DATAPATH_VALUE = 2;

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
  public static DatapathProvider valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DatapathProvider forNumber(int value) {
    switch (value) {
      case 0:
        return DATAPATH_PROVIDER_UNSPECIFIED;
      case 1:
        return LEGACY_DATAPATH;
      case 2:
        return ADVANCED_DATAPATH;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DatapathProvider> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DatapathProvider> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<DatapathProvider>() {
        public DatapathProvider findValueByNumber(int number) {
          return DatapathProvider.forNumber(number);
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
    return com.google.container.v1.ClusterServiceProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final DatapathProvider[] VALUES = values();

  public static DatapathProvider valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DatapathProvider(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.container.v1.DatapathProvider)
}
