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
// source: google/cloud/apihub/v1/provisioning_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.apihub.v1;

public final class ProvisioningServiceProto {
  private ProvisioningServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apihub_v1_CreateApiHubInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apihub_v1_CreateApiHubInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apihub_v1_GetApiHubInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apihub_v1_GetApiHubInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apihub_v1_LookupApiHubInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apihub_v1_LookupApiHubInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apihub_v1_LookupApiHubInstanceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apihub_v1_LookupApiHubInstanceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/apihub/v1/provisioning_se"
          + "rvice.proto\022\026google.cloud.apihub.v1\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032*google/c"
          + "loud/apihub/v1/common_fields.proto\032#goog"
          + "le/longrunning/operations.proto\"\301\001\n\033Crea"
          + "teApiHubInstanceRequest\0229\n\006parent\030\001 \001(\tB"
          + ")\340A\002\372A#\n!locations.googleapis.com/Locati"
          + "on\022 \n\023api_hub_instance_id\030\002 \001(\tB\003\340A\001\022E\n\020"
          + "api_hub_instance\030\003 \001(\0132&.google.cloud.ap"
          + "ihub.v1.ApiHubInstanceB\003\340A\002\"V\n\030GetApiHub"
          + "InstanceRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$a"
          + "pihub.googleapis.com/ApiHubInstance\"[\n\033L"
          + "ookupApiHubInstanceRequest\022<\n\006parent\030\001 \001"
          + "(\tB,\340A\002\372A&\022$apihub.googleapis.com/ApiHub"
          + "Instance\"`\n\034LookupApiHubInstanceResponse"
          + "\022@\n\020api_hub_instance\030\001 \001(\0132&.google.clou"
          + "d.apihub.v1.ApiHubInstance2\357\005\n\014Provision"
          + "ing\022\216\002\n\024CreateApiHubInstance\0223.google.cl"
          + "oud.apihub.v1.CreateApiHubInstanceReques"
          + "t\032\035.google.longrunning.Operation\"\241\001\312A#\n\016"
          + "ApiHubInstance\022\021OperationMetadata\332A+pare"
          + "nt,api_hub_instance,api_hub_instance_id\202"
          + "\323\344\223\002G\"3/v1/{parent=projects/*/locations/"
          + "*}/apiHubInstances:\020api_hub_instance\022\261\001\n"
          + "\021GetApiHubInstance\0220.google.cloud.apihub"
          + ".v1.GetApiHubInstanceRequest\032&.google.cl"
          + "oud.apihub.v1.ApiHubInstance\"B\332A\004name\202\323\344"
          + "\223\0025\0223/v1/{name=projects/*/locations/*/ap"
          + "iHubInstances/*}\022\316\001\n\024LookupApiHubInstanc"
          + "e\0223.google.cloud.apihub.v1.LookupApiHubI"
          + "nstanceRequest\0324.google.cloud.apihub.v1."
          + "LookupApiHubInstanceResponse\"K\332A\006parent\202"
          + "\323\344\223\002<\022:/v1/{parent=projects/*/locations/"
          + "*}/apiHubInstances:lookup\032I\312A\025apihub.goo"
          + "gleapis.com\322A.https://www.googleapis.com"
          + "/auth/cloud-platformB\272\001\n\032com.google.clou"
          + "d.apihub.v1B\030ProvisioningServiceProtoP\001Z"
          + "2cloud.google.com/go/apihub/apiv1/apihub"
          + "pb;apihubpb\252\002\026Google.Cloud.ApiHub.V1\312\002\026G"
          + "oogle\\Cloud\\ApiHub\\V1\352\002\031Google::Cloud::A"
          + "piHub::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.apihub.v1.CommonFieldsProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_apihub_v1_CreateApiHubInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_apihub_v1_CreateApiHubInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apihub_v1_CreateApiHubInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ApiHubInstanceId", "ApiHubInstance",
            });
    internal_static_google_cloud_apihub_v1_GetApiHubInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_apihub_v1_GetApiHubInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apihub_v1_GetApiHubInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_apihub_v1_LookupApiHubInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_apihub_v1_LookupApiHubInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apihub_v1_LookupApiHubInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_apihub_v1_LookupApiHubInstanceResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_apihub_v1_LookupApiHubInstanceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apihub_v1_LookupApiHubInstanceResponse_descriptor,
            new java.lang.String[] {
              "ApiHubInstance",
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
    com.google.cloud.apihub.v1.CommonFieldsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
