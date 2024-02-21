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
// source: google/cloud/aiplatform/v1/specialist_pool_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class SpecialistPoolServiceProto {
  private SpecialistPoolServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetSpecialistPoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetSpecialistPoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteSpecialistPoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteSpecialistPoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1/specialist_"
          + "pool_service.proto\022\032google.cloud.aiplatf"
          + "orm.v1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032*google/cloud/aiplatform/v1/operation."
          + "proto\0320google/cloud/aiplatform/v1/specia"
          + "list_pool.proto\032#google/longrunning/oper"
          + "ations.proto\032\033google/protobuf/empty.prot"
          + "o\032 google/protobuf/field_mask.proto\"\242\001\n\033"
          + "CreateSpecialistPoolRequest\0229\n\006parent\030\001 "
          + "\001(\tB)\340A\002\372A#\n!locations.googleapis.com/Lo"
          + "cation\022H\n\017specialist_pool\030\002 \001(\0132*.google"
          + ".cloud.aiplatform.v1.SpecialistPoolB\003\340A\002"
          + "\"w\n%CreateSpecialistPoolOperationMetadat"
          + "a\022N\n\020generic_metadata\030\001 \001(\01324.google.clo"
          + "ud.aiplatform.v1.GenericOperationMetadat"
          + "a\"Z\n\030GetSpecialistPoolRequest\022>\n\004name\030\001 "
          + "\001(\tB0\340A\002\372A*\n(aiplatform.googleapis.com/S"
          + "pecialistPool\"\255\001\n\032ListSpecialistPoolsReq"
          + "uest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations."
          + "googleapis.com/Location\022\021\n\tpage_size\030\002 \001"
          + "(\005\022\022\n\npage_token\030\003 \001(\t\022-\n\tread_mask\030\004 \001("
          + "\0132\032.google.protobuf.FieldMask\"|\n\033ListSpe"
          + "cialistPoolsResponse\022D\n\020specialist_pools"
          + "\030\001 \003(\0132*.google.cloud.aiplatform.v1.Spec"
          + "ialistPool\022\027\n\017next_page_token\030\002 \001(\t\"l\n\033D"
          + "eleteSpecialistPoolRequest\022>\n\004name\030\001 \001(\t"
          + "B0\340A\002\372A*\n(aiplatform.googleapis.com/Spec"
          + "ialistPool\022\r\n\005force\030\002 \001(\010\"\235\001\n\033UpdateSpec"
          + "ialistPoolRequest\022H\n\017specialist_pool\030\001 \001"
          + "(\0132*.google.cloud.aiplatform.v1.Speciali"
          + "stPoolB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.googl"
          + "e.protobuf.FieldMaskB\003\340A\002\"\302\001\n%UpdateSpec"
          + "ialistPoolOperationMetadata\022I\n\017specialis"
          + "t_pool\030\001 \001(\tB0\340A\003\372A*\n(aiplatform.googlea"
          + "pis.com/SpecialistPool\022N\n\020generic_metada"
          + "ta\030\002 \001(\01324.google.cloud.aiplatform.v1.Ge"
          + "nericOperationMetadata2\224\n\n\025SpecialistPoo"
          + "lService\022\220\002\n\024CreateSpecialistPool\0227.goog"
          + "le.cloud.aiplatform.v1.CreateSpecialistP"
          + "oolRequest\032\035.google.longrunning.Operatio"
          + "n\"\237\001\312A7\n\016SpecialistPool\022%CreateSpecialis"
          + "tPoolOperationMetadata\332A\026parent,speciali"
          + "st_pool\202\323\344\223\002F\"3/v1/{parent=projects/*/lo"
          + "cations/*}/specialistPools:\017specialist_p"
          + "ool\022\271\001\n\021GetSpecialistPool\0224.google.cloud"
          + ".aiplatform.v1.GetSpecialistPoolRequest\032"
          + "*.google.cloud.aiplatform.v1.SpecialistP"
          + "ool\"B\332A\004name\202\323\344\223\0025\0223/v1/{name=projects/*"
          + "/locations/*/specialistPools/*}\022\314\001\n\023List"
          + "SpecialistPools\0226.google.cloud.aiplatfor"
          + "m.v1.ListSpecialistPoolsRequest\0327.google"
          + ".cloud.aiplatform.v1.ListSpecialistPools"
          + "Response\"D\332A\006parent\202\323\344\223\0025\0223/v1/{parent=p"
          + "rojects/*/locations/*}/specialistPools\022\345"
          + "\001\n\024DeleteSpecialistPool\0227.google.cloud.a"
          + "iplatform.v1.DeleteSpecialistPoolRequest"
          + "\032\035.google.longrunning.Operation\"u\312A0\n\025go"
          + "ogle.protobuf.Empty\022\027DeleteOperationMeta"
          + "data\332A\004name\202\323\344\223\0025*3/v1/{name=projects/*/"
          + "locations/*/specialistPools/*}\022\245\002\n\024Updat"
          + "eSpecialistPool\0227.google.cloud.aiplatfor"
          + "m.v1.UpdateSpecialistPoolRequest\032\035.googl"
          + "e.longrunning.Operation\"\264\001\312A7\n\016Specialis"
          + "tPool\022%UpdateSpecialistPoolOperationMeta"
          + "data\332A\033specialist_pool,update_mask\202\323\344\223\002V"
          + "2C/v1/{specialist_pool.name=projects/*/l"
          + "ocations/*/specialistPools/*}:\017specialis"
          + "t_pool\032M\312A\031aiplatform.googleapis.com\322A.h"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tformB\330\001\n\036com.google.cloud.aiplatform.v1"
          + "B\032SpecialistPoolServiceProtoP\001Z>cloud.go"
          + "ogle.com/go/aiplatform/apiv1/aiplatformp"
          + "b;aiplatformpb\252\002\032Google.Cloud.AIPlatform"
          + ".V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Googl"
          + "e::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.SpecialistPoolProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SpecialistPool",
            });
    internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateSpecialistPoolOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_GetSpecialistPoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetSpecialistPoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetSpecialistPoolRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListSpecialistPoolsResponse_descriptor,
            new java.lang.String[] {
              "SpecialistPools", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteSpecialistPoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_DeleteSpecialistPoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteSpecialistPoolRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolRequest_descriptor,
            new java.lang.String[] {
              "SpecialistPool", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateSpecialistPoolOperationMetadata_descriptor,
            new java.lang.String[] {
              "SpecialistPool", "GenericMetadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.cloud.aiplatform.v1.SpecialistPoolProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
