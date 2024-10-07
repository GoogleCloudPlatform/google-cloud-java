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
// source: google/cloud/dialogflow/cx/v3/entity_type.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_ConflictingResources_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_ConflictingResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/dialogflow/cx/v3/entity_t"
          + "ype.proto\022\035google.cloud.dialogflow.cx.v3"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032*goo"
          + "gle/cloud/dialogflow/cx/v3/inline.proto\032"
          + "#google/longrunning/operations.proto\032\033go"
          + "ogle/protobuf/empty.proto\032 google/protob"
          + "uf/field_mask.proto\"\232\006\n\nEntityType\022\014\n\004na"
          + "me\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022A\n\004k"
          + "ind\030\003 \001(\0162..google.cloud.dialogflow.cx.v"
          + "3.EntityType.KindB\003\340A\002\022X\n\023auto_expansion"
          + "_mode\030\004 \001(\0162;.google.cloud.dialogflow.cx"
          + ".v3.EntityType.AutoExpansionMode\022B\n\010enti"
          + "ties\030\005 \003(\01320.google.cloud.dialogflow.cx."
          + "v3.EntityType.Entity\022R\n\020excluded_phrases"
          + "\030\006 \003(\01328.google.cloud.dialogflow.cx.v3.E"
          + "ntityType.ExcludedPhrase\022\037\n\027enable_fuzzy"
          + "_extraction\030\007 \001(\010\022\016\n\006redact\030\t \001(\010\0323\n\006Ent"
          + "ity\022\022\n\005value\030\001 \001(\tB\003\340A\002\022\025\n\010synonyms\030\002 \003("
          + "\tB\003\340A\002\032$\n\016ExcludedPhrase\022\022\n\005value\030\001 \001(\tB"
          + "\003\340A\002\"J\n\004Kind\022\024\n\020KIND_UNSPECIFIED\020\000\022\014\n\010KI"
          + "ND_MAP\020\001\022\r\n\tKIND_LIST\020\002\022\017\n\013KIND_REGEXP\020\003"
          + "\"Y\n\021AutoExpansionMode\022#\n\037AUTO_EXPANSION_"
          + "MODE_UNSPECIFIED\020\000\022\037\n\033AUTO_EXPANSION_MOD"
          + "E_DEFAULT\020\001:{\352Ax\n$dialogflow.googleapis."
          + "com/EntityType\022Pprojects/{project}/locat"
          + "ions/{location}/agents/{agent}/entityTyp"
          + "es/{entity_type}\"\220\003\n\030ExportEntityTypesRe"
          + "quest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$dialogflo"
          + "w.googleapis.com/EntityType\022\031\n\014entity_ty"
          + "pes\030\002 \003(\tB\003\340A\002\022\037\n\020entity_types_uri\030\003 \001(\t"
          + "B\003\340A\001H\000\022*\n\033entity_types_content_inline\030\004"
          + " \001(\010B\003\340A\001H\000\022\\\n\013data_format\030\005 \001(\0162B.googl"
          + "e.cloud.dialogflow.cx.v3.ExportEntityTyp"
          + "esRequest.DataFormatB\003\340A\001\022\032\n\rlanguage_co"
          + "de\030\006 \001(\tB\003\340A\001\"E\n\nDataFormat\022\033\n\027DATA_FORM"
          + "AT_UNSPECIFIED\020\000\022\010\n\004BLOB\020\001\022\020\n\014JSON_PACKA"
          + "GE\020\005B\r\n\013destination\"\242\001\n\031ExportEntityType"
          + "sResponse\022\032\n\020entity_types_uri\030\001 \001(\tH\000\022P\n"
          + "\024entity_types_content\030\002 \001(\01320.google.clo"
          + "ud.dialogflow.cx.v3.InlineDestinationH\000B"
          + "\027\n\025exported_entity_types\"\033\n\031ExportEntity"
          + "TypesMetadata\"\353\003\n\030ImportEntityTypesReque"
          + "st\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$dialogflow.g"
          + "oogleapis.com/EntityType\022\032\n\020entity_types"
          + "_uri\030\002 \001(\tH\000\022K\n\024entity_types_content\030\003 \001"
          + "(\0132+.google.cloud.dialogflow.cx.v3.Inlin"
          + "eSourceH\000\022^\n\014merge_option\030\004 \001(\0162C.google"
          + ".cloud.dialogflow.cx.v3.ImportEntityType"
          + "sRequest.MergeOptionB\003\340A\002\022H\n\022target_enti"
          + "ty_type\030\005 \001(\tB,\340A\001\372A&\n$dialogflow.google"
          + "apis.com/EntityType\"n\n\013MergeOption\022\034\n\030ME"
          + "RGE_OPTION_UNSPECIFIED\020\000\022\013\n\007REPLACE\020\001\022\t\n"
          + "\005MERGE\020\002\022\n\n\006RENAME\020\003\022\023\n\017REPORT_CONFLICT\020"
          + "\004\022\010\n\004KEEP\020\005B\016\n\014entity_types\"\243\002\n\031ImportEn"
          + "tityTypesResponse\022?\n\014entity_types\030\001 \003(\tB"
          + ")\372A&\n$dialogflow.googleapis.com/EntityTy"
          + "pe\022l\n\025conflicting_resources\030\002 \001(\0132M.goog"
          + "le.cloud.dialogflow.cx.v3.ImportEntityTy"
          + "pesResponse.ConflictingResources\032W\n\024Conf"
          + "lictingResources\022!\n\031entity_type_display_"
          + "names\030\001 \003(\t\022\034\n\024entity_display_names\030\002 \003("
          + "\t\"\033\n\031ImportEntityTypesMetadata\"\224\001\n\026ListE"
          + "ntityTypesRequest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A"
          + "&\022$dialogflow.googleapis.com/EntityType\022"
          + "\025\n\rlanguage_code\030\002 \001(\t\022\021\n\tpage_size\030\003 \001("
          + "\005\022\022\n\npage_token\030\004 \001(\t\"s\n\027ListEntityTypes"
          + "Response\022?\n\014entity_types\030\001 \003(\0132).google."
          + "cloud.dialogflow.cx.v3.EntityType\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\"i\n\024GetEntityTypeReque"
          + "st\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$dialogflow.goo"
          + "gleapis.com/EntityType\022\025\n\rlanguage_code\030"
          + "\002 \001(\t\"\263\001\n\027CreateEntityTypeRequest\022<\n\006par"
          + "ent\030\001 \001(\tB,\340A\002\372A&\022$dialogflow.googleapis"
          + ".com/EntityType\022C\n\013entity_type\030\002 \001(\0132).g"
          + "oogle.cloud.dialogflow.cx.v3.EntityTypeB"
          + "\003\340A\002\022\025\n\rlanguage_code\030\003 \001(\t\"\246\001\n\027UpdateEn"
          + "tityTypeRequest\022C\n\013entity_type\030\001 \001(\0132).g"
          + "oogle.cloud.dialogflow.cx.v3.EntityTypeB"
          + "\003\340A\002\022\025\n\rlanguage_code\030\002 \001(\t\022/\n\013update_ma"
          + "sk\030\003 \001(\0132\032.google.protobuf.FieldMask\"d\n\027"
          + "DeleteEntityTypeRequest\022:\n\004name\030\001 \001(\tB,\340"
          + "A\002\372A&\n$dialogflow.googleapis.com/EntityT"
          + "ype\022\r\n\005force\030\002 \001(\0102\357\014\n\013EntityTypes\022\270\001\n\rG"
          + "etEntityType\0223.google.cloud.dialogflow.c"
          + "x.v3.GetEntityTypeRequest\032).google.cloud"
          + ".dialogflow.cx.v3.EntityType\"G\332A\004name\202\323\344"
          + "\223\002:\0228/v3/{name=projects/*/locations/*/ag"
          + "ents/*/entityTypes/*}\022\331\001\n\020CreateEntityTy"
          + "pe\0226.google.cloud.dialogflow.cx.v3.Creat"
          + "eEntityTypeRequest\032).google.cloud.dialog"
          + "flow.cx.v3.EntityType\"b\332A\022parent,entity_"
          + "type\202\323\344\223\002G\"8/v3/{parent=projects/*/locat"
          + "ions/*/agents/*}/entityTypes:\013entity_typ"
          + "e\022\352\001\n\020UpdateEntityType\0226.google.cloud.di"
          + "alogflow.cx.v3.UpdateEntityTypeRequest\032)"
          + ".google.cloud.dialogflow.cx.v3.EntityTyp"
          + "e\"s\332A\027entity_type,update_mask\202\323\344\223\002S2D/v3"
          + "/{entity_type.name=projects/*/locations/"
          + "*/agents/*/entityTypes/*}:\013entity_type\022\253"
          + "\001\n\020DeleteEntityType\0226.google.cloud.dialo"
          + "gflow.cx.v3.DeleteEntityTypeRequest\032\026.go"
          + "ogle.protobuf.Empty\"G\332A\004name\202\323\344\223\002:*8/v3/"
          + "{name=projects/*/locations/*/agents/*/en"
          + "tityTypes/*}\022\313\001\n\017ListEntityTypes\0225.googl"
          + "e.cloud.dialogflow.cx.v3.ListEntityTypes"
          + "Request\0326.google.cloud.dialogflow.cx.v3."
          + "ListEntityTypesResponse\"I\332A\006parent\202\323\344\223\002:"
          + "\0228/v3/{parent=projects/*/locations/*/age"
          + "nts/*}/entityTypes\022\361\001\n\021ExportEntityTypes"
          + "\0227.google.cloud.dialogflow.cx.v3.ExportE"
          + "ntityTypesRequest\032\035.google.longrunning.O"
          + "peration\"\203\001\312A6\n\031ExportEntityTypesRespons"
          + "e\022\031ExportEntityTypesMetadata\202\323\344\223\002D\"?/v3/"
          + "{parent=projects/*/locations/*/agents/*}"
          + "/entityTypes:export:\001*\022\361\001\n\021ImportEntityT"
          + "ypes\0227.google.cloud.dialogflow.cx.v3.Imp"
          + "ortEntityTypesRequest\032\035.google.longrunni"
          + "ng.Operation\"\203\001\312A6\n\031ImportEntityTypesRes"
          + "ponse\022\031ImportEntityTypesMetadata\202\323\344\223\002D\"?"
          + "/v3/{parent=projects/*/locations/*/agent"
          + "s/*}/entityTypes:import:\001*\032x\312A\031dialogflo"
          + "w.googleapis.com\322AYhttps://www.googleapi"
          + "s.com/auth/cloud-platform,https://www.go"
          + "ogleapis.com/auth/dialogflowB\265\001\n!com.goo"
          + "gle.cloud.dialogflow.cx.v3B\017EntityTypePr"
          + "otoP\001Z1cloud.google.com/go/dialogflow/cx"
          + "/apiv3/cxpb;cxpb\370\001\001\242\002\002DF\252\002\035Google.Cloud."
          + "Dialogflow.Cx.V3\352\002!Google::Cloud::Dialog"
          + "flow::CX::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.InlineProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Kind",
              "AutoExpansionMode",
              "Entities",
              "ExcludedPhrases",
              "EnableFuzzyExtraction",
              "Redact",
            });
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_descriptor,
            new java.lang.String[] {
              "Value", "Synonyms",
            });
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "EntityTypes",
              "EntityTypesUri",
              "EntityTypesContentInline",
              "DataFormat",
              "LanguageCode",
              "Destination",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypesUri", "EntityTypesContent", "ExportedEntityTypes",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportEntityTypesMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "EntityTypesUri",
              "EntityTypesContent",
              "MergeOption",
              "TargetEntityType",
              "EntityTypes",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes", "ConflictingResources",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_ConflictingResources_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_ConflictingResources_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesResponse_ConflictingResources_descriptor,
            new java.lang.String[] {
              "EntityTypeDisplayNames", "EntityDisplayNames",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ImportEntityTypesMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityType", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.InlineProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
