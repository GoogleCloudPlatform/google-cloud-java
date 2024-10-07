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
// source: google/cloud/discoveryengine/v1alpha/user_event_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public final class UserEventServiceProto {
  private UserEventServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_WriteUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_WriteUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/discoveryengine/v1alpha/u"
          + "ser_event_service.proto\022$google.cloud.di"
          + "scoveryengine.v1alpha\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/httpbody.proto\032\031google/api/resource.pr"
          + "oto\0328google/cloud/discoveryengine/v1alph"
          + "a/import_config.proto\0327google/cloud/disc"
          + "overyengine/v1alpha/purge_config.proto\0325"
          + "google/cloud/discoveryengine/v1alpha/use"
          + "r_event.proto\032#google/longrunning/operat"
          + "ions.proto\"\314\001\n\025WriteUserEventRequest\022@\n\006"
          + "parent\030\001 \001(\tB0\340A\002\372A*\n(discoveryengine.go"
          + "ogleapis.com/DataStore\022M\n\nuser_event\030\002 \001"
          + "(\0132/.google.cloud.discoveryengine.v1alph"
          + "a.UserEventB\003\340A\002H\000\210\001\001\022\023\n\013write_async\030\003 \001"
          + "(\010B\r\n\013_user_event\"\250\001\n\027CollectUserEventRe"
          + "quest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(discovery"
          + "engine.googleapis.com/DataStore\022\027\n\nuser_"
          + "event\030\002 \001(\tB\003\340A\002\022\020\n\003uri\030\003 \001(\tH\000\210\001\001\022\020\n\003et"
          + "s\030\004 \001(\003H\001\210\001\001B\006\n\004_uriB\006\n\004_ets2\217\r\n\020UserEve"
          + "ntService\022\211\003\n\016WriteUserEvent\022;.google.cl"
          + "oud.discoveryengine.v1alpha.WriteUserEve"
          + "ntRequest\032/.google.cloud.discoveryengine"
          + ".v1alpha.UserEvent\"\210\002\202\323\344\223\002\201\002\"F/v1alpha/{"
          + "parent=projects/*/locations/*/dataStores"
          + "/*}/userEvents:write:\nuser_eventZb\"T/v1a"
          + "lpha/{parent=projects/*/locations/*/coll"
          + "ections/*/dataStores/*}/userEvents:write"
          + ":\nuser_eventZG\"9/v1alpha/{parent=project"
          + "s/*/locations/*}/userEvents:write:\nuser_"
          + "event\022\324\002\n\020CollectUserEvent\022=.google.clou"
          + "d.discoveryengine.v1alpha.CollectUserEve"
          + "ntRequest\032\024.google.api.HttpBody\"\352\001\202\323\344\223\002\343"
          + "\001\022H/v1alpha/{parent=projects/*/locations"
          + "/*/dataStores/*}/userEvents:collectZX\022V/"
          + "v1alpha/{parent=projects/*/locations/*/c"
          + "ollections/*/dataStores/*}/userEvents:co"
          + "llectZ=\022;/v1alpha/{parent=projects/*/loc"
          + "ations/*}/userEvents:collect\022\235\003\n\017PurgeUs"
          + "erEvents\022<.google.cloud.discoveryengine."
          + "v1alpha.PurgeUserEventsRequest\032\035.google."
          + "longrunning.Operation\"\254\002\312A|\n<google.clou"
          + "d.discoveryengine.v1alpha.PurgeUserEvent"
          + "sResponse\022<google.cloud.discoveryengine."
          + "v1alpha.PurgeUserEventsMetadata\202\323\344\223\002\246\001\"F"
          + "/v1alpha/{parent=projects/*/locations/*/"
          + "dataStores/*}/userEvents:purge:\001*ZY\"T/v1"
          + "alpha/{parent=projects/*/locations/*/col"
          + "lections/*/dataStores/*}/userEvents:purg"
          + "e:\001*\022\243\003\n\020ImportUserEvents\022=.google.cloud"
          + ".discoveryengine.v1alpha.ImportUserEvent"
          + "sRequest\032\035.google.longrunning.Operation\""
          + "\260\002\312A~\n=google.cloud.discoveryengine.v1al"
          + "pha.ImportUserEventsResponse\022=google.clo"
          + "ud.discoveryengine.v1alpha.ImportUserEve"
          + "ntsMetadata\202\323\344\223\002\250\001\"G/v1alpha/{parent=pro"
          + "jects/*/locations/*/dataStores/*}/userEv"
          + "ents:import:\001*ZZ\"U/v1alpha/{parent=proje"
          + "cts/*/locations/*/collections/*/dataStor"
          + "es/*}/userEvents:import:\001*\032R\312A\036discovery"
          + "engine.googleapis.com\322A.https://www.goog"
          + "leapis.com/auth/cloud-platformB\241\002\n(com.g"
          + "oogle.cloud.discoveryengine.v1alphaB\025Use"
          + "rEventServiceProtoP\001ZRcloud.google.com/g"
          + "o/discoveryengine/apiv1alpha/discoveryen"
          + "ginepb;discoveryenginepb\242\002\017DISCOVERYENGI"
          + "NE\252\002$Google.Cloud.DiscoveryEngine.V1Alph"
          + "a\312\002$Google\\Cloud\\DiscoveryEngine\\V1alpha"
          + "\352\002\'Google::Cloud::DiscoveryEngine::V1alp"
          + "hab\006proto3"
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
              com.google.cloud.discoveryengine.v1alpha.ImportConfigProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.PurgeConfigProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.UserEventProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_WriteUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_WriteUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_WriteUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent", "WriteAsync",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CollectUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent", "Uri", "Ets",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.ImportConfigProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.PurgeConfigProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.UserEventProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
