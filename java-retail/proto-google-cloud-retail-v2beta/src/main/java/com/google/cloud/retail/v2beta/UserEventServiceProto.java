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
// source: google/cloud/retail/v2beta/user_event_service.proto

package com.google.cloud.retail.v2beta;

public final class UserEventServiceProto {
  private UserEventServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/retail/v2beta/user_event_"
          + "service.proto\022\032google.cloud.retail.v2bet"
          + "a\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/httpbody.proto\032\031go"
          + "ogle/api/resource.proto\032.google/cloud/re"
          + "tail/v2beta/import_config.proto\032-google/"
          + "cloud/retail/v2beta/purge_config.proto\032+"
          + "google/cloud/retail/v2beta/user_event.pr"
          + "oto\032#google/longrunning/operations.proto"
          + "\"\203\001\n\025WriteUserEventRequest\022\024\n\006parent\030\001 \001"
          + "(\tB\004\342A\001\002\022?\n\nuser_event\030\002 \001(\0132%.google.cl"
          + "oud.retail.v2beta.UserEventB\004\342A\001\002\022\023\n\013wri"
          + "te_async\030\003 \001(\010\"\241\001\n\027CollectUserEventReque"
          + "st\022\027\n\rprebuilt_rule\030\006 \001(\tH\000\022\024\n\006parent\030\001 "
          + "\001(\tB\004\342A\001\002\022\030\n\nuser_event\030\002 \001(\tB\004\342A\001\002\022\013\n\003u"
          + "ri\030\003 \001(\t\022\013\n\003ets\030\004 \001(\003\022\020\n\010raw_json\030\005 \001(\tB"
          + "\021\n\017conversion_rule\"\203\002\n\027RejoinUserEventsR"
          + "equest\022\024\n\006parent\030\001 \001(\tB\004\342A\001\002\022i\n\027user_eve"
          + "nt_rejoin_scope\030\002 \001(\0162H.google.cloud.ret"
          + "ail.v2beta.RejoinUserEventsRequest.UserE"
          + "ventRejoinScope\"g\n\024UserEventRejoinScope\022"
          + "\'\n#USER_EVENT_REJOIN_SCOPE_UNSPECIFIED\020\000"
          + "\022\021\n\rJOINED_EVENTS\020\001\022\023\n\017UNJOINED_EVENTS\020\002"
          + "\">\n\030RejoinUserEventsResponse\022\"\n\032rejoined"
          + "_user_events_count\030\001 \001(\003\"\032\n\030RejoinUserEv"
          + "entsMetadata2\373\t\n\020UserEventService\022\303\001\n\016Wr"
          + "iteUserEvent\0221.google.cloud.retail.v2bet"
          + "a.WriteUserEventRequest\032%.google.cloud.r"
          + "etail.v2beta.UserEvent\"W\202\323\344\223\002Q\"C/v2beta/"
          + "{parent=projects/*/locations/*/catalogs/"
          + "*}/userEvents:write:\nuser_event\022\254\001\n\020Coll"
          + "ectUserEvent\0223.google.cloud.retail.v2bet"
          + "a.CollectUserEventRequest\032\024.google.api.H"
          + "ttpBody\"M\202\323\344\223\002G\022E/v2beta/{parent=project"
          + "s/*/locations/*/catalogs/*}/userEvents:c"
          + "ollect\022\226\002\n\017PurgeUserEvents\0222.google.clou"
          + "d.retail.v2beta.PurgeUserEventsRequest\032\035"
          + ".google.longrunning.Operation\"\257\001\312A^\n2goo"
          + "gle.cloud.retail.v2beta.PurgeUserEventsR"
          + "esponse\022(google.cloud.retail.v2beta.Purg"
          + "eMetadata\202\323\344\223\002H\"C/v2beta/{parent=project"
          + "s/*/locations/*/catalogs/*}/userEvents:p"
          + "urge:\001*\022\233\002\n\020ImportUserEvents\0223.google.cl"
          + "oud.retail.v2beta.ImportUserEventsReques"
          + "t\032\035.google.longrunning.Operation\"\262\001\312A`\n3"
          + "google.cloud.retail.v2beta.ImportUserEve"
          + "ntsResponse\022)google.cloud.retail.v2beta."
          + "ImportMetadata\202\323\344\223\002I\"D/v2beta/{parent=pr"
          + "ojects/*/locations/*/catalogs/*}/userEve"
          + "nts:import:\001*\022\357\001\n\020RejoinUserEvents\0223.goo"
          + "gle.cloud.retail.v2beta.RejoinUserEvents"
          + "Request\032\035.google.longrunning.Operation\"\206"
          + "\001\312A4\n\030RejoinUserEventsResponse\022\030RejoinUs"
          + "erEventsMetadata\202\323\344\223\002I\"D/v2beta/{parent="
          + "projects/*/locations/*/catalogs/*}/userE"
          + "vents:rejoin:\001*\032I\312A\025retail.googleapis.co"
          + "m\322A.https://www.googleapis.com/auth/clou"
          + "d-platformB\324\001\n\036com.google.cloud.retail.v"
          + "2betaB\025UserEventServiceProtoP\001Z6cloud.go"
          + "ogle.com/go/retail/apiv2beta/retailpb;re"
          + "tailpb\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2"
          + "Beta\312\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Goog"
          + "le::Cloud::Retail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor(),
              com.google.cloud.retail.v2beta.PurgeConfigProto.getDescriptor(),
              com.google.cloud.retail.v2beta.UserEventProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent", "WriteAsync",
            });
    internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_descriptor,
            new java.lang.String[] {
              "PrebuiltRule", "Parent", "UserEvent", "Uri", "Ets", "RawJson", "ConversionRule",
            });
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEventRejoinScope",
            });
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor,
            new java.lang.String[] {
              "RejoinedUserEventsCount",
            });
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor();
    com.google.cloud.retail.v2beta.PurgeConfigProto.getDescriptor();
    com.google.cloud.retail.v2beta.UserEventProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
