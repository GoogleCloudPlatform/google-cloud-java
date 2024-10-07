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
// source: google/cloud/securitycenter/v1p1beta1/run_asset_discovery_response.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1p1beta1;

public final class RunAssetDiscoveryResponseOuterClass {
  private RunAssetDiscoveryResponseOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/cloud/securitycenter/v1p1beta1/"
          + "run_asset_discovery_response.proto\022%goog"
          + "le.cloud.securitycenter.v1p1beta1\032\036googl"
          + "e/protobuf/duration.proto\"\356\001\n\031RunAssetDi"
          + "scoveryResponse\022U\n\005state\030\001 \001(\0162F.google."
          + "cloud.securitycenter.v1p1beta1.RunAssetD"
          + "iscoveryResponse.State\022+\n\010duration\030\002 \001(\013"
          + "2\031.google.protobuf.Duration\"M\n\005State\022\025\n\021"
          + "STATE_UNSPECIFIED\020\000\022\r\n\tCOMPLETED\020\001\022\016\n\nSU"
          + "PERSEDED\020\002\022\016\n\nTERMINATED\020\003B\373\001\n)com.googl"
          + "e.cloud.securitycenter.v1p1beta1P\001ZQclou"
          + "d.google.com/go/securitycenter/apiv1p1be"
          + "ta1/securitycenterpb;securitycenterpb\252\002%"
          + "Google.Cloud.SecurityCenter.V1P1Beta1\312\002%"
          + "Google\\Cloud\\SecurityCenter\\V1p1beta1\352\002("
          + "Google::Cloud::SecurityCenter::V1p1beta1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_RunAssetDiscoveryResponse_descriptor,
            new java.lang.String[] {
              "State", "Duration",
            });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
