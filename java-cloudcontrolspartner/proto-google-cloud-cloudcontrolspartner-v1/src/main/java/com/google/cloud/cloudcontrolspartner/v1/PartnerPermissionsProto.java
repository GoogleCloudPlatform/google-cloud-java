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
// source: google/cloud/cloudcontrolspartner/v1/partner_permissions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.cloudcontrolspartner.v1;

public final class PartnerPermissionsProto {
  private PartnerPermissionsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_PartnerPermissions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_PartnerPermissions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_GetPartnerPermissionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_GetPartnerPermissionsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/cloudcontrolspartner/v1/p"
          + "artner_permissions.proto\022$google.cloud.c"
          + "loudcontrolspartner.v1\032\037google/api/field"
          + "_behavior.proto\032\031google/api/resource.pro"
          + "to\"\265\004\n\022PartnerPermissions\022\021\n\004name\030\001 \001(\tB"
          + "\003\340A\010\022`\n\023partner_permissions\030\002 \003(\0162C.goog"
          + "le.cloud.cloudcontrolspartner.v1.Partner"
          + "Permissions.Permission\"\372\001\n\nPermission\022\032\n"
          + "\026PERMISSION_UNSPECIFIED\020\000\0221\n-ACCESS_TRAN"
          + "SPARENCY_AND_EMERGENCY_ACCESS_LOGS\020\001\022 \n\034"
          + "ASSURED_WORKLOADS_MONITORING\020\002\022\034\n\030ACCESS"
          + "_APPROVAL_REQUESTS\020\003\022+\n\'ASSURED_WORKLOAD"
          + "S_EKM_CONNECTION_STATUS\020\004\0220\n,ACCESS_TRAN"
          + "SPARENCY_LOGS_SUPPORT_CASE_VIEWER\020\005:\254\001\352A"
          + "\250\001\n6cloudcontrolspartner.googleapis.com/"
          + "PartnerPermissions\022norganizations/{organ"
          + "ization}/locations/{location}/customers/"
          + "{customer}/workloads/{workload}/partnerP"
          + "ermissions\"l\n\034GetPartnerPermissionsReque"
          + "st\022L\n\004name\030\001 \001(\tB>\340A\002\372A8\n6cloudcontrolsp"
          + "artner.googleapis.com/PartnerPermissions"
          + "B\233\002\n(com.google.cloud.cloudcontrolspartn"
          + "er.v1B\027PartnerPermissionsProtoP\001Z\\cloud."
          + "google.com/go/cloudcontrolspartner/apiv1"
          + "/cloudcontrolspartnerpb;cloudcontrolspar"
          + "tnerpb\252\002$Google.Cloud.CloudControlsPartn"
          + "er.V1\312\002$Google\\Cloud\\CloudControlsPartne"
          + "r\\V1\352\002\'Google::Cloud::CloudControlsPartn"
          + "er::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_PartnerPermissions_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1_PartnerPermissions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_PartnerPermissions_descriptor,
            new java.lang.String[] {
              "Name", "PartnerPermissions",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_GetPartnerPermissionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_cloudcontrolspartner_v1_GetPartnerPermissionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_GetPartnerPermissionsRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
