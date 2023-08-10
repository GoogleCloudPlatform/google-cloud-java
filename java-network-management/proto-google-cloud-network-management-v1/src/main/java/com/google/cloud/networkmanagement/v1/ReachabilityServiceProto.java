/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/networkmanagement/v1/reachability.proto

package com.google.cloud.networkmanagement.v1;

public final class ReachabilityServiceProto {
  private ReachabilityServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkmanagement_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/networkmanagement/v1/reac"
          + "hability.proto\022!google.cloud.networkmana"
          + "gement.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\0329google/cloud/networkm"
          + "anagement/v1/connectivity_test.proto\032#go"
          + "ogle/longrunning/operations.proto\032 googl"
          + "e/protobuf/field_mask.proto\032\037google/prot"
          + "obuf/timestamp.proto\"}\n\034ListConnectivity"
          + "TestsRequest\022\024\n\006parent\030\001 \001(\tB\004\342A\001\002\022\021\n\tpa"
          + "ge_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006fil"
          + "ter\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"\225\001\n\035ListConn"
          + "ectivityTestsResponse\022F\n\tresources\030\001 \003(\013"
          + "23.google.cloud.networkmanagement.v1.Con"
          + "nectivityTest\022\027\n\017next_page_token\030\002 \001(\t\022\023"
          + "\n\013unreachable\030\003 \003(\t\"0\n\032GetConnectivityTe"
          + "stRequest\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\"\231\001\n\035Create"
          + "ConnectivityTestRequest\022\024\n\006parent\030\001 \001(\tB"
          + "\004\342A\001\002\022\025\n\007test_id\030\002 \001(\tB\004\342A\001\002\022K\n\010resource"
          + "\030\003 \001(\01323.google.cloud.networkmanagement."
          + "v1.ConnectivityTestB\004\342A\001\002\"\243\001\n\035UpdateConn"
          + "ectivityTestRequest\0225\n\013update_mask\030\001 \001(\013"
          + "2\032.google.protobuf.FieldMaskB\004\342A\001\002\022K\n\010re"
          + "source\030\002 \001(\01323.google.cloud.networkmanag"
          + "ement.v1.ConnectivityTestB\004\342A\001\002\"3\n\035Delet"
          + "eConnectivityTestRequest\022\022\n\004name\030\001 \001(\tB\004"
          + "\342A\001\002\"2\n\034RerunConnectivityTestRequest\022\022\n\004"
          + "name\030\001 \001(\tB\004\342A\001\002\"\326\001\n\021OperationMetadata\022/"
          + "\n\013create_time\030\001 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022,\n\010end_time\030\002 \001(\0132\032.google.proto"
          + "buf.Timestamp\022\016\n\006target\030\003 \001(\t\022\014\n\004verb\030\004 "
          + "\001(\t\022\025\n\rstatus_detail\030\005 \001(\t\022\030\n\020cancel_req"
          + "uested\030\006 \001(\010\022\023\n\013api_version\030\007 \001(\t2\226\r\n\023Re"
          + "achabilityService\022\347\001\n\025ListConnectivityTe"
          + "sts\022?.google.cloud.networkmanagement.v1."
          + "ListConnectivityTestsRequest\032@.google.cl"
          + "oud.networkmanagement.v1.ListConnectivit"
          + "yTestsResponse\"K\332A\006parent\202\323\344\223\002<\022:/v1/{pa"
          + "rent=projects/*/locations/global}/connec"
          + "tivityTests\022\324\001\n\023GetConnectivityTest\022=.go"
          + "ogle.cloud.networkmanagement.v1.GetConne"
          + "ctivityTestRequest\0323.google.cloud.networ"
          + "kmanagement.v1.ConnectivityTest\"I\332A\004name"
          + "\202\323\344\223\002<\022:/v1/{name=projects/*/locations/g"
          + "lobal/connectivityTests/*}\022\254\002\n\026CreateCon"
          + "nectivityTest\022@.google.cloud.networkmana"
          + "gement.v1.CreateConnectivityTestRequest\032"
          + "\035.google.longrunning.Operation\"\260\001\312AG\n2go"
          + "ogle.cloud.networkmanagement.v1.Connecti"
          + "vityTest\022\021OperationMetadata\332A\027parent,tes"
          + "t_id,resource\202\323\344\223\002F\":/v1/{parent=project"
          + "s/*/locations/global}/connectivityTests:"
          + "\010resource\022\262\002\n\026UpdateConnectivityTest\022@.g"
          + "oogle.cloud.networkmanagement.v1.UpdateC"
          + "onnectivityTestRequest\032\035.google.longrunn"
          + "ing.Operation\"\266\001\312AG\n2google.cloud.networ"
          + "kmanagement.v1.ConnectivityTest\022\021Operati"
          + "onMetadata\332A\024update_mask,resource\202\323\344\223\002O2"
          + "C/v1/{resource.name=projects/*/locations"
          + "/global/connectivityTests/*}:\010resource\022\217"
          + "\002\n\025RerunConnectivityTest\022?.google.cloud."
          + "networkmanagement.v1.RerunConnectivityTe"
          + "stRequest\032\035.google.longrunning.Operation"
          + "\"\225\001\312AG\n2google.cloud.networkmanagement.v"
          + "1.ConnectivityTest\022\021OperationMetadata\202\323\344"
          + "\223\002E\"@/v1/{name=projects/*/locations/glob"
          + "al/connectivityTests/*}:rerun:\001*\022\361\001\n\026Del"
          + "eteConnectivityTest\022@.google.cloud.netwo"
          + "rkmanagement.v1.DeleteConnectivityTestRe"
          + "quest\032\035.google.longrunning.Operation\"v\312A"
          + "*\n\025google.protobuf.Empty\022\021OperationMetad"
          + "ata\332A\004name\202\323\344\223\002<*:/v1/{name=projects/*/l"
          + "ocations/global/connectivityTests/*}\032T\312A"
          + " networkmanagement.googleapis.com\322A.http"
          + "s://www.googleapis.com/auth/cloud-platfo"
          + "rmB\207\002\n%com.google.cloud.networkmanagemen"
          + "t.v1B\030ReachabilityServiceProtoP\001ZScloud."
          + "google.com/go/networkmanagement/apiv1/ne"
          + "tworkmanagementpb;networkmanagementpb\252\002!"
          + "Google.Cloud.NetworkManagement.V1\312\002!Goog"
          + "le\\Cloud\\NetworkManagement\\V1\352\002$Google::"
          + "Cloud::NetworkManagement::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.networkmanagement.v1.TestOuterClass.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_ListConnectivityTestsResponse_descriptor,
            new java.lang.String[] {
              "Resources", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_GetConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_CreateConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TestId", "Resource",
            });
    internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_UpdateConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Resource",
            });
    internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_DeleteConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_RerunConnectivityTestRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkmanagement_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_networkmanagement_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkmanagement_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.networkmanagement.v1.TestOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
