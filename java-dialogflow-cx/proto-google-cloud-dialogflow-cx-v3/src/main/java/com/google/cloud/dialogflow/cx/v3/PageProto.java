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
// source: google/cloud/dialogflow/cx/v3/page.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public final class PageProto {
  private PageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Page_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Page_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Form_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Form_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_FillBehavior_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_FillBehavior_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_EventHandler_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_EventHandler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_TransitionRoute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_TransitionRoute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListPagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListPagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListPagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListPagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetPageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetPageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdatePageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdatePageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeletePageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeletePageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_KnowledgeConnectorSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_KnowledgeConnectorSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/cx/v3/page.pro"
          + "to\022\035google.cloud.dialogflow.cx.v3\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\0325google/clo"
          + "ud/dialogflow/cx/v3/advanced_settings.pr"
          + "oto\0329google/cloud/dialogflow/cx/v3/data_"
          + "store_connection.proto\032/google/cloud/dia"
          + "logflow/cx/v3/fulfillment.proto\032\033google/"
          + "protobuf/empty.proto\032 google/protobuf/fi"
          + "eld_mask.proto\032\034google/protobuf/struct.p"
          + "roto\"\315\005\n\004Page\022\014\n\004name\030\001 \001(\t\022\031\n\014display_n"
          + "ame\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\023 \001(\t\022E\n\021e"
          + "ntry_fulfillment\030\007 \001(\0132*.google.cloud.di"
          + "alogflow.cx.v3.Fulfillment\0221\n\004form\030\004 \001(\013"
          + "2#.google.cloud.dialogflow.cx.v3.Form\022T\n"
          + "\027transition_route_groups\030\013 \003(\tB3\372A0\n.dia"
          + "logflow.googleapis.com/TransitionRouteGr"
          + "oup\022I\n\021transition_routes\030\t \003(\0132..google."
          + "cloud.dialogflow.cx.v3.TransitionRoute\022C"
          + "\n\016event_handlers\030\n \003(\0132+.google.cloud.di"
          + "alogflow.cx.v3.EventHandler\022J\n\021advanced_"
          + "settings\030\r \001(\0132/.google.cloud.dialogflow"
          + ".cx.v3.AdvancedSettings\022d\n\034knowledge_con"
          + "nector_settings\030\022 \001(\01329.google.cloud.dia"
          + "logflow.cx.v3.KnowledgeConnectorSettings"
          + "B\003\340A\001:u\352Ar\n\036dialogflow.googleapis.com/Pa"
          + "ge\022Pprojects/{project}/locations/{locati"
          + "on}/agents/{agent}/flows/{flow}/pages/{p"
          + "age}\"\357\004\n\004Form\022A\n\nparameters\030\001 \003(\0132-.goog"
          + "le.cloud.dialogflow.cx.v3.Form.Parameter"
          + "\032\243\004\n\tParameter\022\031\n\014display_name\030\001 \001(\tB\003\340A"
          + "\002\022\020\n\010required\030\002 \001(\010\022A\n\013entity_type\030\003 \001(\t"
          + "B,\340A\002\372A&\n$dialogflow.googleapis.com/Enti"
          + "tyType\022\017\n\007is_list\030\004 \001(\010\022V\n\rfill_behavior"
          + "\030\007 \001(\0132:.google.cloud.dialogflow.cx.v3.F"
          + "orm.Parameter.FillBehaviorB\003\340A\002\022-\n\rdefau"
          + "lt_value\030\t \001(\0132\026.google.protobuf.Value\022\016"
          + "\n\006redact\030\013 \001(\010\022J\n\021advanced_settings\030\014 \001("
          + "\0132/.google.cloud.dialogflow.cx.v3.Advanc"
          + "edSettings\032\261\001\n\014FillBehavior\022S\n\032initial_p"
          + "rompt_fulfillment\030\003 \001(\0132*.google.cloud.d"
          + "ialogflow.cx.v3.FulfillmentB\003\340A\002\022L\n\027repr"
          + "ompt_event_handlers\030\005 \003(\0132+.google.cloud"
          + ".dialogflow.cx.v3.EventHandler\"\200\002\n\014Event"
          + "Handler\022\021\n\004name\030\006 \001(\tB\003\340A\003\022\022\n\005event\030\004 \001("
          + "\tB\003\340A\002\022G\n\023trigger_fulfillment\030\005 \001(\0132*.go"
          + "ogle.cloud.dialogflow.cx.v3.Fulfillment\022"
          + ":\n\013target_page\030\002 \001(\tB#\372A \n\036dialogflow.go"
          + "ogleapis.com/PageH\000\022:\n\013target_flow\030\003 \001(\t"
          + "B#\372A \n\036dialogflow.googleapis.com/FlowH\000B"
          + "\010\n\006target\"\323\002\n\017TransitionRoute\022\021\n\004name\030\006 "
          + "\001(\tB\003\340A\003\022\030\n\013description\030\010 \001(\tB\003\340A\001\0225\n\006in"
          + "tent\030\001 \001(\tB%\372A\"\n dialogflow.googleapis.c"
          + "om/Intent\022\021\n\tcondition\030\002 \001(\t\022G\n\023trigger_"
          + "fulfillment\030\003 \001(\0132*.google.cloud.dialogf"
          + "low.cx.v3.Fulfillment\022:\n\013target_page\030\004 \001"
          + "(\tB#\372A \n\036dialogflow.googleapis.com/PageH"
          + "\000\022:\n\013target_flow\030\005 \001(\tB#\372A \n\036dialogflow."
          + "googleapis.com/FlowH\000B\010\n\006target\"\210\001\n\020List"
          + "PagesRequest\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036di"
          + "alogflow.googleapis.com/Page\022\025\n\rlanguage"
          + "_code\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_t"
          + "oken\030\004 \001(\t\"`\n\021ListPagesResponse\0222\n\005pages"
          + "\030\001 \003(\0132#.google.cloud.dialogflow.cx.v3.P"
          + "age\022\027\n\017next_page_token\030\002 \001(\t\"]\n\016GetPageR"
          + "equest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogflow"
          + ".googleapis.com/Page\022\025\n\rlanguage_code\030\002 "
          + "\001(\t\"\232\001\n\021CreatePageRequest\0226\n\006parent\030\001 \001("
          + "\tB&\340A\002\372A \022\036dialogflow.googleapis.com/Pag"
          + "e\0226\n\004page\030\002 \001(\0132#.google.cloud.dialogflo"
          + "w.cx.v3.PageB\003\340A\002\022\025\n\rlanguage_code\030\003 \001(\t"
          + "\"\223\001\n\021UpdatePageRequest\0226\n\004page\030\001 \001(\0132#.g"
          + "oogle.cloud.dialogflow.cx.v3.PageB\003\340A\002\022\025"
          + "\n\rlanguage_code\030\002 \001(\t\022/\n\013update_mask\030\003 \001"
          + "(\0132\032.google.protobuf.FieldMask\"X\n\021Delete"
          + "PageRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialo"
          + "gflow.googleapis.com/Page\022\r\n\005force\030\002 \001(\010"
          + "\"\321\002\n\032KnowledgeConnectorSettings\022\017\n\007enabl"
          + "ed\030\001 \001(\010\022G\n\023trigger_fulfillment\030\003 \001(\0132*."
          + "google.cloud.dialogflow.cx.v3.Fulfillmen"
          + "t\022:\n\013target_page\030\004 \001(\tB#\372A \n\036dialogflow."
          + "googleapis.com/PageH\000\022:\n\013target_flow\030\005 \001"
          + "(\tB#\372A \n\036dialogflow.googleapis.com/FlowH"
          + "\000\022W\n\026data_store_connections\030\006 \003(\01322.goog"
          + "le.cloud.dialogflow.cx.v3.DataStoreConne"
          + "ctionB\003\340A\001B\010\n\006target2\224\010\n\005Pages\022\273\001\n\tListP"
          + "ages\022/.google.cloud.dialogflow.cx.v3.Lis"
          + "tPagesRequest\0320.google.cloud.dialogflow."
          + "cx.v3.ListPagesResponse\"K\332A\006parent\202\323\344\223\002<"
          + "\022:/v3/{parent=projects/*/locations/*/age"
          + "nts/*/flows/*}/pages\022\250\001\n\007GetPage\022-.googl"
          + "e.cloud.dialogflow.cx.v3.GetPageRequest\032"
          + "#.google.cloud.dialogflow.cx.v3.Page\"I\332A"
          + "\004name\202\323\344\223\002<\022:/v3/{name=projects/*/locati"
          + "ons/*/agents/*/flows/*/pages/*}\022\273\001\n\nCrea"
          + "tePage\0220.google.cloud.dialogflow.cx.v3.C"
          + "reatePageRequest\032#.google.cloud.dialogfl"
          + "ow.cx.v3.Page\"V\332A\013parent,page\202\323\344\223\002B\":/v3"
          + "/{parent=projects/*/locations/*/agents/*"
          + "/flows/*}/pages:\004page\022\305\001\n\nUpdatePage\0220.g"
          + "oogle.cloud.dialogflow.cx.v3.UpdatePageR"
          + "equest\032#.google.cloud.dialogflow.cx.v3.P"
          + "age\"`\332A\020page,update_mask\202\323\344\223\002G2?/v3/{pag"
          + "e.name=projects/*/locations/*/agents/*/f"
          + "lows/*/pages/*}:\004page\022\241\001\n\nDeletePage\0220.g"
          + "oogle.cloud.dialogflow.cx.v3.DeletePageR"
          + "equest\032\026.google.protobuf.Empty\"I\332A\004name\202"
          + "\323\344\223\002<*:/v3/{name=projects/*/locations/*/"
          + "agents/*/flows/*/pages/*}\032x\312A\031dialogflow"
          + ".googleapis.com\322AYhttps://www.googleapis"
          + ".com/auth/cloud-platform,https://www.goo"
          + "gleapis.com/auth/dialogflowB\257\001\n!com.goog"
          + "le.cloud.dialogflow.cx.v3B\tPageProtoP\001Z1"
          + "cloud.google.com/go/dialogflow/cx/apiv3/"
          + "cxpb;cxpb\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogf"
          + "low.Cx.V3\352\002!Google::Cloud::Dialogflow::C"
          + "X::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.DataStoreConnectionProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.FulfillmentProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_Page_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Page_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Page_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "EntryFulfillment",
              "Form",
              "TransitionRouteGroups",
              "TransitionRoutes",
              "EventHandlers",
              "AdvancedSettings",
              "KnowledgeConnectorSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Form_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Form_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Form_descriptor,
            new java.lang.String[] {
              "Parameters",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Form_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "Required",
              "EntityType",
              "IsList",
              "FillBehavior",
              "DefaultValue",
              "Redact",
              "AdvancedSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_FillBehavior_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_FillBehavior_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Form_Parameter_FillBehavior_descriptor,
            new java.lang.String[] {
              "InitialPromptFulfillment", "RepromptEventHandlers",
            });
    internal_static_google_cloud_dialogflow_cx_v3_EventHandler_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_EventHandler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_EventHandler_descriptor,
            new java.lang.String[] {
              "Name", "Event", "TriggerFulfillment", "TargetPage", "TargetFlow", "Target",
            });
    internal_static_google_cloud_dialogflow_cx_v3_TransitionRoute_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_TransitionRoute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_TransitionRoute_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "Intent",
              "Condition",
              "TriggerFulfillment",
              "TargetPage",
              "TargetFlow",
              "Target",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListPagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_ListPagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListPagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListPagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_ListPagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListPagesResponse_descriptor,
            new java.lang.String[] {
              "Pages", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetPageRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_GetPageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetPageRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreatePageRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Page", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdatePageRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_UpdatePageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdatePageRequest_descriptor,
            new java.lang.String[] {
              "Page", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeletePageRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_DeletePageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeletePageRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_cx_v3_KnowledgeConnectorSettings_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_KnowledgeConnectorSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_KnowledgeConnectorSettings_descriptor,
            new java.lang.String[] {
              "Enabled",
              "TriggerFulfillment",
              "TargetPage",
              "TargetFlow",
              "DataStoreConnections",
              "Target",
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.DataStoreConnectionProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.FulfillmentProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
