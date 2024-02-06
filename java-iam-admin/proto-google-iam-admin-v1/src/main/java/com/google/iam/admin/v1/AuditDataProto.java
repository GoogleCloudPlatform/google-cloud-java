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
// source: google/iam/admin/v1/audit_data.proto

// Protobuf Java Version: 3.25.2
package com.google.iam.admin.v1;

public final class AuditDataProto {
  private AuditDataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_admin_v1_AuditData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_admin_v1_AuditData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_admin_v1_AuditData_PermissionDelta_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_admin_v1_AuditData_PermissionDelta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/iam/admin/v1/audit_data.proto\022\023"
          + "google.iam.admin.v1\"\240\001\n\tAuditData\022H\n\020per"
          + "mission_delta\030\001 \001(\0132..google.iam.admin.v"
          + "1.AuditData.PermissionDelta\032I\n\017Permissio"
          + "nDelta\022\031\n\021added_permissions\030\001 \003(\t\022\033\n\023rem"
          + "oved_permissions\030\002 \003(\tB\230\001\n\027com.google.ia"
          + "m.admin.v1B\016AuditDataProtoP\001Z3cloud.goog"
          + "le.com/go/iam/admin/apiv1/adminpb;adminp"
          + "b\252\002\031Google.Cloud.Iam.Admin.V1\312\002\031Google\\C"
          + "loud\\Iam\\Admin\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_iam_admin_v1_AuditData_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_iam_admin_v1_AuditData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_admin_v1_AuditData_descriptor,
            new java.lang.String[] {
              "PermissionDelta",
            });
    internal_static_google_iam_admin_v1_AuditData_PermissionDelta_descriptor =
        internal_static_google_iam_admin_v1_AuditData_descriptor.getNestedTypes().get(0);
    internal_static_google_iam_admin_v1_AuditData_PermissionDelta_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_admin_v1_AuditData_PermissionDelta_descriptor,
            new java.lang.String[] {
              "AddedPermissions", "RemovedPermissions",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
