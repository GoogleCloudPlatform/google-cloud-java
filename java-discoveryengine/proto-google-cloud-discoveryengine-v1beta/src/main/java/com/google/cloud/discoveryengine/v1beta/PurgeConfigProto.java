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
// source: google/cloud/discoveryengine/v1beta/purge_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

public final class PurgeConfigProto {
  private PurgeConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeErrorConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeErrorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/discoveryengine/v1beta/pu"
          + "rge_config.proto\022#google.cloud.discovery"
          + "engine.v1beta\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\0327googl"
          + "e/cloud/discoveryengine/v1beta/import_co"
          + "nfig.proto\032\037google/protobuf/timestamp.pr"
          + "oto\032\027google/rpc/status.proto\"~\n\026PurgeUse"
          + "rEventsRequest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n("
          + "discoveryengine.googleapis.com/DataStore"
          + "\022\023\n\006filter\030\002 \001(\tB\003\340A\002\022\r\n\005force\030\003 \001(\010\".\n\027"
          + "PurgeUserEventsResponse\022\023\n\013purge_count\030\001"
          + " \001(\003\"\251\001\n\027PurgeUserEventsMetadata\022/\n\013crea"
          + "te_time\030\001 \001(\0132\032.google.protobuf.Timestam"
          + "p\022/\n\013update_time\030\002 \001(\0132\032.google.protobuf"
          + ".Timestamp\022\025\n\rsuccess_count\030\003 \001(\003\022\025\n\rfai"
          + "lure_count\030\004 \001(\003\"7\n\020PurgeErrorConfig\022\024\n\n"
          + "gcs_prefix\030\001 \001(\tH\000B\r\n\013destination\"\315\003\n\025Pu"
          + "rgeDocumentsRequest\022D\n\ngcs_source\030\005 \001(\0132"
          + "..google.cloud.discoveryengine.v1beta.Gc"
          + "sSourceH\000\022`\n\rinline_source\030\006 \001(\0132G.googl"
          + "e.cloud.discoveryengine.v1beta.PurgeDocu"
          + "mentsRequest.InlineSourceH\000\022=\n\006parent\030\001 "
          + "\001(\tB-\340A\002\372A\'\n%discoveryengine.googleapis."
          + "com/Branch\022\023\n\006filter\030\002 \001(\tB\003\340A\002\022K\n\014error"
          + "_config\030\007 \001(\01325.google.cloud.discoveryen"
          + "gine.v1beta.PurgeErrorConfig\022\r\n\005force\030\003 "
          + "\001(\010\032R\n\014InlineSource\022B\n\tdocuments\030\001 \003(\tB/"
          + "\340A\002\372A)\n\'discoveryengine.googleapis.com/D"
          + "ocumentB\010\n\006source\"q\n\026PurgeDocumentsRespo"
          + "nse\022\023\n\013purge_count\030\001 \001(\003\022B\n\014purge_sample"
          + "\030\002 \003(\tB,\372A)\n\'discoveryengine.googleapis."
          + "com/Document\"\277\001\n\026PurgeDocumentsMetadata\022"
          + "/\n\013create_time\030\001 \001(\0132\032.google.protobuf.T"
          + "imestamp\022/\n\013update_time\030\002 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\022\025\n\rsuccess_count\030\003 \001(\003"
          + "\022\025\n\rfailure_count\030\004 \001(\003\022\025\n\rignored_count"
          + "\030\005 \001(\003\"i\n%PurgeSuggestionDenyListEntries"
          + "Request\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(discove"
          + "ryengine.googleapis.com/DataStore\"h\n&Pur"
          + "geSuggestionDenyListEntriesResponse\022\023\n\013p"
          + "urge_count\030\001 \001(\003\022)\n\rerror_samples\030\002 \003(\0132"
          + "\022.google.rpc.Status\"\212\001\n&PurgeSuggestionD"
          + "enyListEntriesMetadata\022/\n\013create_time\030\001 "
          + "\001(\0132\032.google.protobuf.Timestamp\022/\n\013updat"
          + "e_time\030\002 \001(\0132\032.google.protobuf.Timestamp"
          + "\"e\n!PurgeCompletionSuggestionsRequest\022@\n"
          + "\006parent\030\001 \001(\tB0\340A\002\372A*\n(discoveryengine.g"
          + "oogleapis.com/DataStore\"h\n\"PurgeCompleti"
          + "onSuggestionsResponse\022\027\n\017purge_succeeded"
          + "\030\001 \001(\010\022)\n\rerror_samples\030\002 \003(\0132\022.google.r"
          + "pc.Status\"\206\001\n\"PurgeCompletionSuggestions"
          + "Metadata\022/\n\013create_time\030\001 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\022/\n\013update_time\030\002 \001(\0132\032"
          + ".google.protobuf.TimestampB\227\002\n\'com.googl"
          + "e.cloud.discoveryengine.v1betaB\020PurgeCon"
          + "figProtoP\001ZQcloud.google.com/go/discover"
          + "yengine/apiv1beta/discoveryenginepb;disc"
          + "overyenginepb\242\002\017DISCOVERYENGINE\252\002#Google"
          + ".Cloud.DiscoveryEngine.V1Beta\312\002#Google\\C"
          + "loud\\DiscoveryEngine\\V1beta\352\002&Google::Cl"
          + "oud::DiscoveryEngine::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "Force",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsResponse_descriptor,
            new java.lang.String[] {
              "PurgeCount",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeUserEventsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeErrorConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeErrorConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeErrorConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_descriptor,
            new java.lang.String[] {
              "GcsSource", "InlineSource", "Parent", "Filter", "ErrorConfig", "Force", "Source",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "Documents",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsResponse_descriptor,
            new java.lang.String[] {
              "PurgeCount", "PurgeSample",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeDocumentsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount", "IgnoredCount",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesResponse_descriptor,
            new java.lang.String[] {
              "PurgeCount", "ErrorSamples",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeSuggestionDenyListEntriesMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsResponse_descriptor,
            new java.lang.String[] {
              "PurgeSucceeded", "ErrorSamples",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PurgeCompletionSuggestionsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
