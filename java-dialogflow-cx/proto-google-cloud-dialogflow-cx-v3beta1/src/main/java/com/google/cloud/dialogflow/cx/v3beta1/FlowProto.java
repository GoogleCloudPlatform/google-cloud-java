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
// source: google/cloud/dialogflow/cx/v3beta1/flow.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public final class FlowProto {
  private FlowProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/cx/v3beta1/flo"
          + "w.proto\022\"google.cloud.dialogflow.cx.v3be"
          + "ta1\032\034google/api/annotations.proto\032\027googl"
          + "e/api/client.proto\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032:"
          + "google/cloud/dialogflow/cx/v3beta1/advan"
          + "ced_settings.proto\0328google/cloud/dialogf"
          + "low/cx/v3beta1/import_strategy.proto\032-go"
          + "ogle/cloud/dialogflow/cx/v3beta1/page.pr"
          + "oto\032;google/cloud/dialogflow/cx/v3beta1/"
          + "validation_message.proto\032#google/longrun"
          + "ning/operations.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\032\034google/protobuf/struct.proto\032\037goog"
          + "le/protobuf/timestamp.proto\"\266\003\n\013NluSetti"
          + "ngs\022M\n\nmodel_type\030\001 \001(\01629.google.cloud.d"
          + "ialogflow.cx.v3beta1.NluSettings.ModelTy"
          + "pe\022 \n\030classification_threshold\030\003 \001(\002\022^\n\023"
          + "model_training_mode\030\004 \001(\0162A.google.cloud"
          + ".dialogflow.cx.v3beta1.NluSettings.Model"
          + "TrainingMode\"Y\n\tModelType\022\032\n\026MODEL_TYPE_"
          + "UNSPECIFIED\020\000\022\027\n\023MODEL_TYPE_STANDARD\020\001\022\027"
          + "\n\023MODEL_TYPE_ADVANCED\020\003\"{\n\021ModelTraining"
          + "Mode\022#\n\037MODEL_TRAINING_MODE_UNSPECIFIED\020"
          + "\000\022!\n\035MODEL_TRAINING_MODE_AUTOMATIC\020\001\022\036\n\032"
          + "MODEL_TRAINING_MODE_MANUAL\020\002\"\216\007\n\004Flow\022\014\n"
          + "\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023"
          + "\n\013description\030\003 \001(\t\022N\n\021transition_routes"
          + "\030\004 \003(\01323.google.cloud.dialogflow.cx.v3be"
          + "ta1.TransitionRoute\022H\n\016event_handlers\030\n "
          + "\003(\01320.google.cloud.dialogflow.cx.v3beta1"
          + ".EventHandler\022T\n\027transition_route_groups"
          + "\030\017 \003(\tB3\372A0\n.dialogflow.googleapis.com/T"
          + "ransitionRouteGroup\022E\n\014nlu_settings\030\013 \001("
          + "\0132/.google.cloud.dialogflow.cx.v3beta1.N"
          + "luSettings\022O\n\021advanced_settings\030\016 \001(\01324."
          + "google.cloud.dialogflow.cx.v3beta1.Advan"
          + "cedSettings\022i\n\034knowledge_connector_setti"
          + "ngs\030\022 \001(\0132>.google.cloud.dialogflow.cx.v"
          + "3beta1.KnowledgeConnectorSettingsB\003\340A\001\022d"
          + "\n\027multi_language_settings\030\034 \001(\0132>.google"
          + ".cloud.dialogflow.cx.v3beta1.Flow.MultiL"
          + "anguageSettingsB\003\340A\001\022\016\n\006locked\030\036 \001(\010\032u\n\025"
          + "MultiLanguageSettings\022,\n\037enable_multi_la"
          + "nguage_detection\030\001 \001(\010B\003\340A\001\022.\n!supported"
          + "_response_language_codes\030\002 \003(\tB\003\340A\001:h\352Ae"
          + "\n\036dialogflow.googleapis.com/Flow\022Cprojec"
          + "ts/{project}/locations/{location}/agents"
          + "/{agent}/flows/{flow}\"\237\001\n\021CreateFlowRequ"
          + "est\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036dialogflow."
          + "googleapis.com/Flow\022;\n\004flow\030\002 \001(\0132(.goog"
          + "le.cloud.dialogflow.cx.v3beta1.FlowB\003\340A\002"
          + "\022\025\n\rlanguage_code\030\003 \001(\t\"X\n\021DeleteFlowReq"
          + "uest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogflow.g"
          + "oogleapis.com/Flow\022\r\n\005force\030\002 \001(\010\"\210\001\n\020Li"
          + "stFlowsRequest\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036"
          + "dialogflow.googleapis.com/Flow\022\021\n\tpage_s"
          + "ize\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\025\n\rlanguag"
          + "e_code\030\004 \001(\t\"e\n\021ListFlowsResponse\0227\n\005flo"
          + "ws\030\001 \003(\0132(.google.cloud.dialogflow.cx.v3"
          + "beta1.Flow\022\027\n\017next_page_token\030\002 \001(\t\"]\n\016G"
          + "etFlowRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dia"
          + "logflow.googleapis.com/Flow\022\025\n\rlanguage_"
          + "code\030\002 \001(\t\"\230\001\n\021UpdateFlowRequest\022;\n\004flow"
          + "\030\001 \001(\0132(.google.cloud.dialogflow.cx.v3be"
          + "ta1.FlowB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.goo"
          + "gle.protobuf.FieldMask\022\025\n\rlanguage_code\030"
          + "\003 \001(\t\"H\n\020TrainFlowRequest\0224\n\004name\030\001 \001(\tB"
          + "&\340A\002\372A \n\036dialogflow.googleapis.com/Flow\""
          + "b\n\023ValidateFlowRequest\0224\n\004name\030\001 \001(\tB&\340A"
          + "\002\372A \n\036dialogflow.googleapis.com/Flow\022\025\n\r"
          + "language_code\030\002 \001(\t\"}\n\036GetFlowValidation"
          + "ResultRequest\022D\n\004name\030\001 \001(\tB6\340A\002\372A0\n.dia"
          + "logflow.googleapis.com/FlowValidationRes"
          + "ult\022\025\n\rlanguage_code\030\002 \001(\t\"\266\002\n\024FlowValid"
          + "ationResult\022\014\n\004name\030\001 \001(\t\022R\n\023validation_"
          + "messages\030\002 \003(\01325.google.cloud.dialogflow"
          + ".cx.v3beta1.ValidationMessage\022/\n\013update_"
          + "time\030\003 \001(\0132\032.google.protobuf.Timestamp:\212"
          + "\001\352A\206\001\n.dialogflow.googleapis.com/FlowVal"
          + "idationResult\022Tprojects/{project}/locati"
          + "ons/{location}/agents/{agent}/flows/{flo"
          + "w}/validationResult\"\374\002\n\021ImportFlowReques"
          + "t\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036dialogflow.go"
          + "ogleapis.com/Flow\022\022\n\010flow_uri\030\002 \001(\tH\000\022\026\n"
          + "\014flow_content\030\003 \001(\014H\000\022Y\n\rimport_option\030\004"
          + " \001(\0162B.google.cloud.dialogflow.cx.v3beta"
          + "1.ImportFlowRequest.ImportOption\022Y\n\024flow"
          + "_import_strategy\030\005 \001(\01326.google.cloud.di"
          + "alogflow.cx.v3beta1.FlowImportStrategyB\003"
          + "\340A\001\"E\n\014ImportOption\022\035\n\031IMPORT_OPTION_UNS"
          + "PECIFIED\020\000\022\010\n\004KEEP\020\001\022\014\n\010FALLBACK\020\002B\006\n\004fl"
          + "ow\"m\n\022FlowImportStrategy\022W\n\026global_impor"
          + "t_strategy\030\001 \001(\01622.google.cloud.dialogfl"
          + "ow.cx.v3beta1.ImportStrategyB\003\340A\001\"G\n\022Imp"
          + "ortFlowResponse\0221\n\004flow\030\001 \001(\tB#\372A \n\036dial"
          + "ogflow.googleapis.com/Flow\"\207\001\n\021ExportFlo"
          + "wRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogfl"
          + "ow.googleapis.com/Flow\022\025\n\010flow_uri\030\002 \001(\t"
          + "B\003\340A\001\022%\n\030include_referenced_flows\030\004 \001(\010B"
          + "\003\340A\001\"H\n\022ExportFlowResponse\022\022\n\010flow_uri\030\001"
          + " \001(\tH\000\022\026\n\014flow_content\030\002 \001(\014H\000B\006\n\004flow2\233"
          + "\021\n\005Flows\022\302\001\n\nCreateFlow\0225.google.cloud.d"
          + "ialogflow.cx.v3beta1.CreateFlowRequest\032("
          + ".google.cloud.dialogflow.cx.v3beta1.Flow"
          + "\"S\332A\013parent,flow\202\323\344\223\002?\"7/v3beta1/{parent"
          + "=projects/*/locations/*/agents/*}/flows:"
          + "\004flow\022\243\001\n\nDeleteFlow\0225.google.cloud.dial"
          + "ogflow.cx.v3beta1.DeleteFlowRequest\032\026.go"
          + "ogle.protobuf.Empty\"F\332A\004name\202\323\344\223\0029*7/v3b"
          + "eta1/{name=projects/*/locations/*/agents"
          + "/*/flows/*}\022\302\001\n\tListFlows\0224.google.cloud"
          + ".dialogflow.cx.v3beta1.ListFlowsRequest\032"
          + "5.google.cloud.dialogflow.cx.v3beta1.Lis"
          + "tFlowsResponse\"H\332A\006parent\202\323\344\223\0029\0227/v3beta"
          + "1/{parent=projects/*/locations/*/agents/"
          + "*}/flows\022\257\001\n\007GetFlow\0222.google.cloud.dial"
          + "ogflow.cx.v3beta1.GetFlowRequest\032(.googl"
          + "e.cloud.dialogflow.cx.v3beta1.Flow\"F\332A\004n"
          + "ame\202\323\344\223\0029\0227/v3beta1/{name=projects/*/loc"
          + "ations/*/agents/*/flows/*}\022\314\001\n\nUpdateFlo"
          + "w\0225.google.cloud.dialogflow.cx.v3beta1.U"
          + "pdateFlowRequest\032(.google.cloud.dialogfl"
          + "ow.cx.v3beta1.Flow\"]\332A\020flow,update_mask\202"
          + "\323\344\223\002D2</v3beta1/{flow.name=projects/*/lo"
          + "cations/*/agents/*/flows/*}:\004flow\022\344\001\n\tTr"
          + "ainFlow\0224.google.cloud.dialogflow.cx.v3b"
          + "eta1.TrainFlowRequest\032\035.google.longrunni"
          + "ng.Operation\"\201\001\312A/\n\025google.protobuf.Empt"
          + "y\022\026google.protobuf.Struct\332A\004name\202\323\344\223\002B\"="
          + "/v3beta1/{name=projects/*/locations/*/ag"
          + "ents/*/flows/*}:train:\001*\022\316\001\n\014ValidateFlo"
          + "w\0227.google.cloud.dialogflow.cx.v3beta1.V"
          + "alidateFlowRequest\0328.google.cloud.dialog"
          + "flow.cx.v3beta1.FlowValidationResult\"K\202\323"
          + "\344\223\002E\"@/v3beta1/{name=projects/*/location"
          + "s/*/agents/*/flows/*}:validate:\001*\022\360\001\n\027Ge"
          + "tFlowValidationResult\022B.google.cloud.dia"
          + "logflow.cx.v3beta1.GetFlowValidationResu"
          + "ltRequest\0328.google.cloud.dialogflow.cx.v"
          + "3beta1.FlowValidationResult\"W\332A\004name\202\323\344\223"
          + "\002J\022H/v3beta1/{name=projects/*/locations/"
          + "*/agents/*/flows/*/validationResult}\022\334\001\n"
          + "\nImportFlow\0225.google.cloud.dialogflow.cx"
          + ".v3beta1.ImportFlowRequest\032\035.google.long"
          + "running.Operation\"x\312A,\n\022ImportFlowRespon"
          + "se\022\026google.protobuf.Struct\202\323\344\223\002C\">/v3bet"
          + "a1/{parent=projects/*/locations/*/agents"
          + "/*}/flows:import:\001*\022\334\001\n\nExportFlow\0225.goo"
          + "gle.cloud.dialogflow.cx.v3beta1.ExportFl"
          + "owRequest\032\035.google.longrunning.Operation"
          + "\"x\312A,\n\022ExportFlowResponse\022\026google.protob"
          + "uf.Struct\202\323\344\223\002C\">/v3beta1/{name=projects"
          + "/*/locations/*/agents/*/flows/*}:export:"
          + "\001*\032x\312A\031dialogflow.googleapis.com\322AYhttps"
          + "://www.googleapis.com/auth/cloud-platfor"
          + "m,https://www.googleapis.com/auth/dialog"
          + "flowB\303\001\n&com.google.cloud.dialogflow.cx."
          + "v3beta1B\tFlowProtoP\001Z6cloud.google.com/g"
          + "o/dialogflow/cx/apiv3beta1/cxpb;cxpb\370\001\001\242"
          + "\002\002DF\252\002\"Google.Cloud.Dialogflow.Cx.V3Beta"
          + "1\352\002&Google::Cloud::Dialogflow::CX::V3bet"
          + "a1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettingsProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.ImportStrategyProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.ValidationMessageProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor,
            new java.lang.String[] {
              "ModelType", "ClassificationThreshold", "ModelTrainingMode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "TransitionRoutes",
              "EventHandlers",
              "TransitionRouteGroups",
              "NluSettings",
              "AdvancedSettings",
              "KnowledgeConnectorSettings",
              "MultiLanguageSettings",
              "Locked",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_descriptor,
            new java.lang.String[] {
              "EnableMultiLanguageDetection", "SupportedResponseLanguageCodes",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Flow", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_descriptor,
            new java.lang.String[] {
              "Flows", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_descriptor,
            new java.lang.String[] {
              "Flow", "UpdateMask", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_descriptor,
            new java.lang.String[] {
              "Name", "ValidationMessages", "UpdateTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FlowUri", "FlowContent", "ImportOption", "FlowImportStrategy", "Flow",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_descriptor,
            new java.lang.String[] {
              "GlobalImportStrategy",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_descriptor,
            new java.lang.String[] {
              "Flow",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "FlowUri", "IncludeReferencedFlows",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_descriptor,
            new java.lang.String[] {
              "FlowUri", "FlowContent", "Flow",
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
    com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettingsProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.ImportStrategyProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.ValidationMessageProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
