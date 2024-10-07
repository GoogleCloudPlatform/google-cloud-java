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
// source: google/cloud/discoveryengine/v1alpha/sample_query_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public final class SampleQueryServiceProto {
  private SampleQueryServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GetSampleQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GetSampleQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CreateSampleQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CreateSampleQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateSampleQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateSampleQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteSampleQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteSampleQueryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/discoveryengine/v1alpha/s"
          + "ample_query_service.proto\022$google.cloud."
          + "discoveryengine.v1alpha\032\034google/api/anno"
          + "tations.proto\032\027google/api/client.proto\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\0328google/cloud/discove"
          + "ryengine/v1alpha/import_config.proto\0327go"
          + "ogle/cloud/discoveryengine/v1alpha/sampl"
          + "e_query.proto\032#google/longrunning/operat"
          + "ions.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\"Y\n\025Get"
          + "SampleQueryRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372A,"
          + "\n*discoveryengine.googleapis.com/SampleQ"
          + "uery\"\210\001\n\030ListSampleQueriesRequest\022E\n\006par"
          + "ent\030\001 \001(\tB5\340A\002\372A/\n-discoveryengine.googl"
          + "eapis.com/SampleQuerySet\022\021\n\tpage_size\030\002 "
          + "\001(\005\022\022\n\npage_token\030\003 \001(\t\"\177\n\031ListSampleQue"
          + "riesResponse\022I\n\016sample_queries\030\001 \003(\01321.g"
          + "oogle.cloud.discoveryengine.v1alpha.Samp"
          + "leQuery\022\027\n\017next_page_token\030\002 \001(\t\"\315\001\n\030Cre"
          + "ateSampleQueryRequest\022E\n\006parent\030\001 \001(\tB5\340"
          + "A\002\372A/\n-discoveryengine.googleapis.com/Sa"
          + "mpleQuerySet\022L\n\014sample_query\030\002 \001(\01321.goo"
          + "gle.cloud.discoveryengine.v1alpha.Sample"
          + "QueryB\003\340A\002\022\034\n\017sample_query_id\030\003 \001(\tB\003\340A\002"
          + "\"\231\001\n\030UpdateSampleQueryRequest\022L\n\014sample_"
          + "query\030\001 \001(\01321.google.cloud.discoveryengi"
          + "ne.v1alpha.SampleQueryB\003\340A\002\022/\n\013update_ma"
          + "sk\030\002 \001(\0132\032.google.protobuf.FieldMask\"\\\n\030"
          + "DeleteSampleQueryRequest\022@\n\004name\030\001 \001(\tB2"
          + "\340A\002\372A,\n*discoveryengine.googleapis.com/S"
          + "ampleQuery2\375\014\n\022SampleQueryService\022\331\001\n\016Ge"
          + "tSampleQuery\022;.google.cloud.discoveryeng"
          + "ine.v1alpha.GetSampleQueryRequest\0321.goog"
          + "le.cloud.discoveryengine.v1alpha.SampleQ"
          + "uery\"W\332A\004name\202\323\344\223\002J\022H/v1alpha/{name=proj"
          + "ects/*/locations/*/sampleQuerySets/*/sam"
          + "pleQueries/*}\022\357\001\n\021ListSampleQueries\022>.go"
          + "ogle.cloud.discoveryengine.v1alpha.ListS"
          + "ampleQueriesRequest\032?.google.cloud.disco"
          + "veryengine.v1alpha.ListSampleQueriesResp"
          + "onse\"Y\332A\006parent\202\323\344\223\002J\022H/v1alpha/{parent="
          + "projects/*/locations/*/sampleQuerySets/*"
          + "}/sampleQueries\022\215\002\n\021CreateSampleQuery\022>."
          + "google.cloud.discoveryengine.v1alpha.Cre"
          + "ateSampleQueryRequest\0321.google.cloud.dis"
          + "coveryengine.v1alpha.SampleQuery\"\204\001\332A#pa"
          + "rent,sample_query,sample_query_id\202\323\344\223\002X\""
          + "H/v1alpha/{parent=projects/*/locations/*"
          + "/sampleQuerySets/*}/sampleQueries:\014sampl"
          + "e_query\022\217\002\n\021UpdateSampleQuery\022>.google.c"
          + "loud.discoveryengine.v1alpha.UpdateSampl"
          + "eQueryRequest\0321.google.cloud.discoveryen"
          + "gine.v1alpha.SampleQuery\"\206\001\332A\030sample_que"
          + "ry,update_mask\202\323\344\223\002e2U/v1alpha/{sample_q"
          + "uery.name=projects/*/locations/*/sampleQ"
          + "uerySets/*/sampleQueries/*}:\014sample_quer"
          + "y\022\304\001\n\021DeleteSampleQuery\022>.google.cloud.d"
          + "iscoveryengine.v1alpha.DeleteSampleQuery"
          + "Request\032\026.google.protobuf.Empty\"W\332A\004name"
          + "\202\323\344\223\002J*H/v1alpha/{name=projects/*/locati"
          + "ons/*/sampleQuerySets/*/sampleQueries/*}"
          + "\022\333\002\n\023ImportSampleQueries\022@.google.cloud."
          + "discoveryengine.v1alpha.ImportSampleQuer"
          + "iesRequest\032\035.google.longrunning.Operatio"
          + "n\"\342\001\312A\204\001\n@google.cloud.discoveryengine.v"
          + "1alpha.ImportSampleQueriesResponse\022@goog"
          + "le.cloud.discoveryengine.v1alpha.ImportS"
          + "ampleQueriesMetadata\202\323\344\223\002T\"O/v1alpha/{pa"
          + "rent=projects/*/locations/*/sampleQueryS"
          + "ets/*}/sampleQueries:import:\001*\032R\312A\036disco"
          + "veryengine.googleapis.com\322A.https://www."
          + "googleapis.com/auth/cloud-platformB\243\002\n(c"
          + "om.google.cloud.discoveryengine.v1alphaB"
          + "\027SampleQueryServiceProtoP\001ZRcloud.google"
          + ".com/go/discoveryengine/apiv1alpha/disco"
          + "veryenginepb;discoveryenginepb\242\002\017DISCOVE"
          + "RYENGINE\252\002$Google.Cloud.DiscoveryEngine."
          + "V1Alpha\312\002$Google\\Cloud\\DiscoveryEngine\\V"
          + "1alpha\352\002\'Google::Cloud::DiscoveryEngine:"
          + ":V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.ImportConfigProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.SampleQueryProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GetSampleQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_GetSampleQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GetSampleQueryRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListSampleQueriesResponse_descriptor,
            new java.lang.String[] {
              "SampleQueries", "NextPageToken",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CreateSampleQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_CreateSampleQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CreateSampleQueryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SampleQuery", "SampleQueryId",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateSampleQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateSampleQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_UpdateSampleQueryRequest_descriptor,
            new java.lang.String[] {
              "SampleQuery", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteSampleQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteSampleQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_DeleteSampleQueryRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.cloud.discoveryengine.v1alpha.ImportConfigProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.SampleQueryProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
