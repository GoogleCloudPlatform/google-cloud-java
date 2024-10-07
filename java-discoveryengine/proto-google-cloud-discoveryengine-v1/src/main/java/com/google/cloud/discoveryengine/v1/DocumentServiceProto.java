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
// source: google/cloud/discoveryengine/v1/document_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public final class DocumentServiceProto {
  private DocumentServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_UrisMatcher_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_UrisMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_Matcher_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_Matcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_MatcherValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_MatcherValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/discoveryengine/v1/docume"
          + "nt_service.proto\022\037google.cloud.discovery"
          + "engine.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032.google/cloud/discoveryengine/v1/do"
          + "cument.proto\0323google/cloud/discoveryengi"
          + "ne/v1/import_config.proto\0322google/cloud/"
          + "discoveryengine/v1/purge_config.proto\032#g"
          + "oogle/longrunning/operations.proto\032\033goog"
          + "le/protobuf/empty.proto\032 google/protobuf"
          + "/field_mask.proto\032\037google/protobuf/times"
          + "tamp.proto\"S\n\022GetDocumentRequest\022=\n\004name"
          + "\030\001 \001(\tB/\340A\002\372A)\n\'discoveryengine.googleap"
          + "is.com/Document\"|\n\024ListDocumentsRequest\022"
          + "=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\n%discoveryengine"
          + ".googleapis.com/Branch\022\021\n\tpage_size\030\002 \001("
          + "\005\022\022\n\npage_token\030\003 \001(\t\"n\n\025ListDocumentsRe"
          + "sponse\022<\n\tdocuments\030\001 \003(\0132).google.cloud"
          + ".discoveryengine.v1.Document\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\"\262\001\n\025CreateDocumentRequest\022"
          + "=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\n%discoveryengine"
          + ".googleapis.com/Branch\022@\n\010document\030\002 \001(\013"
          + "2).google.cloud.discoveryengine.v1.Docum"
          + "entB\003\340A\002\022\030\n\013document_id\030\003 \001(\tB\003\340A\002\"\241\001\n\025U"
          + "pdateDocumentRequest\022@\n\010document\030\001 \001(\0132)"
          + ".google.cloud.discoveryengine.v1.Documen"
          + "tB\003\340A\002\022\025\n\rallow_missing\030\002 \001(\010\022/\n\013update_"
          + "mask\030\003 \001(\0132\032.google.protobuf.FieldMask\"V"
          + "\n\025DeleteDocumentRequest\022=\n\004name\030\001 \001(\tB/\340"
          + "A\002\372A)\n\'discoveryengine.googleapis.com/Do"
          + "cument\"\334\002\n BatchGetDocumentsMetadataRequ"
          + "est\022=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\n%discoveryen"
          + "gine.googleapis.com/Branch\022_\n\007matcher\030\002 "
          + "\001(\0132I.google.cloud.discoveryengine.v1.Ba"
          + "tchGetDocumentsMetadataRequest.MatcherB\003"
          + "\340A\002\032\033\n\013UrisMatcher\022\014\n\004uris\030\001 \003(\t\032{\n\007Matc"
          + "her\022e\n\014uris_matcher\030\001 \001(\0132M.google.cloud"
          + ".discoveryengine.v1.BatchGetDocumentsMet"
          + "adataRequest.UrisMatcherH\000B\t\n\007matcher\"\332\004"
          + "\n!BatchGetDocumentsMetadataResponse\022o\n\022d"
          + "ocuments_metadata\030\001 \003(\0132S.google.cloud.d"
          + "iscoveryengine.v1.BatchGetDocumentsMetad"
          + "ataResponse.DocumentMetadata\032\354\002\n\020Documen"
          + "tMetadata\022w\n\rmatcher_value\030\002 \001(\0132`.googl"
          + "e.cloud.discoveryengine.v1.BatchGetDocum"
          + "entsMetadataResponse.DocumentMetadata.Ma"
          + "tcherValue\022W\n\005state\030\003 \001(\0162H.google.cloud"
          + ".discoveryengine.v1.BatchGetDocumentsMet"
          + "adataResponse.State\0227\n\023last_refreshed_ti"
          + "me\030\004 \001(\0132\032.google.protobuf.Timestamp\022\035\n\025"
          + "data_ingestion_source\030\005 \001(\t\032.\n\014MatcherVa"
          + "lue\022\r\n\003uri\030\001 \001(\tH\000B\017\n\rmatcher_value\"U\n\005S"
          + "tate\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007INDEXED\020\001"
          + "\022\026\n\022NOT_IN_TARGET_SITE\020\002\022\020\n\014NOT_IN_INDEX"
          + "\020\0032\235\026\n\017DocumentService\022\234\002\n\013GetDocument\0223"
          + ".google.cloud.discoveryengine.v1.GetDocu"
          + "mentRequest\032).google.cloud.discoveryengi"
          + "ne.v1.Document\"\254\001\332A\004name\202\323\344\223\002\236\001\022E/v1/{na"
          + "me=projects/*/locations/*/dataStores/*/b"
          + "ranches/*/documents/*}ZU\022S/v1/{name=proj"
          + "ects/*/locations/*/collections/*/dataSto"
          + "res/*/branches/*/documents/*}\022\257\002\n\rListDo"
          + "cuments\0225.google.cloud.discoveryengine.v"
          + "1.ListDocumentsRequest\0326.google.cloud.di"
          + "scoveryengine.v1.ListDocumentsResponse\"\256"
          + "\001\332A\006parent\202\323\344\223\002\236\001\022E/v1/{parent=projects/"
          + "*/locations/*/dataStores/*/branches/*}/d"
          + "ocumentsZU\022S/v1/{parent=projects/*/locat"
          + "ions/*/collections/*/dataStores/*/branch"
          + "es/*}/documents\022\315\002\n\016CreateDocument\0226.goo"
          + "gle.cloud.discoveryengine.v1.CreateDocum"
          + "entRequest\032).google.cloud.discoveryengin"
          + "e.v1.Document\"\327\001\332A\033parent,document,docum"
          + "ent_id\202\323\344\223\002\262\001\"E/v1/{parent=projects/*/lo"
          + "cations/*/dataStores/*/branches/*}/docum"
          + "ents:\010documentZ_\"S/v1/{parent=projects/*"
          + "/locations/*/collections/*/dataStores/*/"
          + "branches/*}/documents:\010document\022\330\002\n\016Upda"
          + "teDocument\0226.google.cloud.discoveryengin"
          + "e.v1.UpdateDocumentRequest\032).google.clou"
          + "d.discoveryengine.v1.Document\"\342\001\332A\024docum"
          + "ent,update_mask\202\323\344\223\002\304\0012N/v1/{document.na"
          + "me=projects/*/locations/*/dataStores/*/b"
          + "ranches/*/documents/*}:\010documentZh2\\/v1/"
          + "{document.name=projects/*/locations/*/co"
          + "llections/*/dataStores/*/branches/*/docu"
          + "ments/*}:\010document\022\217\002\n\016DeleteDocument\0226."
          + "google.cloud.discoveryengine.v1.DeleteDo"
          + "cumentRequest\032\026.google.protobuf.Empty\"\254\001"
          + "\332A\004name\202\323\344\223\002\236\001*E/v1/{name=projects/*/loc"
          + "ations/*/dataStores/*/branches/*/documen"
          + "ts/*}ZU*S/v1/{name=projects/*/locations/"
          + "*/collections/*/dataStores/*/branches/*/"
          + "documents/*}\022\232\003\n\017ImportDocuments\0227.googl"
          + "e.cloud.discoveryengine.v1.ImportDocumen"
          + "tsRequest\032\035.google.longrunning.Operation"
          + "\"\256\002\312Ar\n7google.cloud.discoveryengine.v1."
          + "ImportDocumentsResponse\0227google.cloud.di"
          + "scoveryengine.v1.ImportDocumentsMetadata"
          + "\202\323\344\223\002\262\001\"L/v1/{parent=projects/*/location"
          + "s/*/dataStores/*/branches/*}/documents:i"
          + "mport:\001*Z_\"Z/v1/{parent=projects/*/locat"
          + "ions/*/collections/*/dataStores/*/branch"
          + "es/*}/documents:import:\001*\022\224\003\n\016PurgeDocum"
          + "ents\0226.google.cloud.discoveryengine.v1.P"
          + "urgeDocumentsRequest\032\035.google.longrunnin"
          + "g.Operation\"\252\002\312Ap\n6google.cloud.discover"
          + "yengine.v1.PurgeDocumentsResponse\0226googl"
          + "e.cloud.discoveryengine.v1.PurgeDocument"
          + "sMetadata\202\323\344\223\002\260\001\"K/v1/{parent=projects/*"
          + "/locations/*/dataStores/*/branches/*}/do"
          + "cuments:purge:\001*Z^\"Y/v1/{parent=projects"
          + "/*/locations/*/collections/*/dataStores/"
          + "*/branches/*}/documents:purge:\001*\022\363\002\n\031Bat"
          + "chGetDocumentsMetadata\022A.google.cloud.di"
          + "scoveryengine.v1.BatchGetDocumentsMetada"
          + "taRequest\032B.google.cloud.discoveryengine"
          + ".v1.BatchGetDocumentsMetadataResponse\"\316\001"
          + "\332A\006parent\202\323\344\223\002\276\001\022U/v1/{parent=projects/*"
          + "/locations/*/dataStores/*/branches/*}/ba"
          + "tchGetDocumentsMetadataZe\022c/v1/{parent=p"
          + "rojects/*/locations/*/collections/*/data"
          + "Stores/*/branches/*}/batchGetDocumentsMe"
          + "tadata\032R\312A\036discoveryengine.googleapis.co"
          + "m\322A.https://www.googleapis.com/auth/clou"
          + "d-platformB\207\002\n#com.google.cloud.discover"
          + "yengine.v1B\024DocumentServiceProtoP\001ZMclou"
          + "d.google.com/go/discoveryengine/apiv1/di"
          + "scoveryenginepb;discoveryenginepb\242\002\017DISC"
          + "OVERYENGINE\252\002\037Google.Cloud.DiscoveryEngi"
          + "ne.V1\312\002\037Google\\Cloud\\DiscoveryEngine\\V1\352"
          + "\002\"Google::Cloud::DiscoveryEngine::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.DocumentProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.ImportConfigProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.PurgeConfigProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Documents", "NextPageToken",
            });
    internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Document", "DocumentId",
            });
    internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Document", "AllowMissing", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Matcher",
            });
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_UrisMatcher_descriptor =
        internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_UrisMatcher_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_UrisMatcher_descriptor,
            new java.lang.String[] {
              "Uris",
            });
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_Matcher_descriptor =
        internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_Matcher_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataRequest_Matcher_descriptor,
            new java.lang.String[] {
              "UrisMatcher", "Matcher",
            });
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_descriptor,
            new java.lang.String[] {
              "DocumentsMetadata",
            });
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_descriptor,
            new java.lang.String[] {
              "MatcherValue", "State", "LastRefreshedTime", "DataIngestionSource",
            });
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_MatcherValue_descriptor =
        internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_MatcherValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_BatchGetDocumentsMetadataResponse_DocumentMetadata_MatcherValue_descriptor,
            new java.lang.String[] {
              "Uri", "MatcherValue",
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
    com.google.cloud.discoveryengine.v1.DocumentProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.ImportConfigProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.PurgeConfigProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
