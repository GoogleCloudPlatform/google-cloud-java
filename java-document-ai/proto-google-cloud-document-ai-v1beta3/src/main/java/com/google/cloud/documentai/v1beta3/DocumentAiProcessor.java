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
// source: google/cloud/documentai/v1beta3/processor.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1beta3;

public final class DocumentAiProcessor {
  private DocumentAiProcessor() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Processor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Processor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/documentai/v1beta3/proces"
          + "sor.proto\022\037google.cloud.documentai.v1bet"
          + "a3\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\0325google/cloud/doc"
          + "umentai/v1beta3/document_schema.proto\0320g"
          + "oogle/cloud/documentai/v1beta3/evaluatio"
          + "n.proto\032\037google/protobuf/timestamp.proto"
          + "\"\372\010\n\020ProcessorVersion\022\014\n\004name\030\001 \001(\t\022\024\n\014d"
          + "isplay_name\030\002 \001(\t\022H\n\017document_schema\030\014 \001"
          + "(\0132/.google.cloud.documentai.v1beta3.Doc"
          + "umentSchema\022F\n\005state\030\006 \001(\01627.google.clou"
          + "d.documentai.v1beta3.ProcessorVersion.St"
          + "ate\022/\n\013create_time\030\007 \001(\0132\032.google.protob"
          + "uf.Timestamp\022O\n\021latest_evaluation\030\010 \001(\0132"
          + "4.google.cloud.documentai.v1beta3.Evalua"
          + "tionReference\022\024\n\014kms_key_name\030\t \001(\t\022\034\n\024k"
          + "ms_key_version_name\030\n \001(\t\022\033\n\016google_mana"
          + "ged\030\013 \001(\010B\003\340A\003\022[\n\020deprecation_info\030\r \001(\013"
          + "2A.google.cloud.documentai.v1beta3.Proce"
          + "ssorVersion.DeprecationInfo\022T\n\nmodel_typ"
          + "e\030\017 \001(\0162;.google.cloud.documentai.v1beta"
          + "3.ProcessorVersion.ModelTypeB\003\340A\003\032\237\001\n\017De"
          + "precationInfo\0224\n\020deprecation_time\030\001 \001(\0132"
          + "\032.google.protobuf.Timestamp\022V\n\035replaceme"
          + "nt_processor_version\030\002 \001(\tB/\372A,\n*documen"
          + "tai.googleapis.com/ProcessorVersion\"\223\001\n\005"
          + "State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010DEPLOYED"
          + "\020\001\022\r\n\tDEPLOYING\020\002\022\016\n\nUNDEPLOYED\020\003\022\017\n\013UND"
          + "EPLOYING\020\004\022\014\n\010CREATING\020\005\022\014\n\010DELETING\020\006\022\n"
          + "\n\006FAILED\020\007\022\r\n\tIMPORTING\020\010\"Y\n\tModelType\022\032"
          + "\n\026MODEL_TYPE_UNSPECIFIED\020\000\022\031\n\025MODEL_TYPE"
          + "_GENERATIVE\020\001\022\025\n\021MODEL_TYPE_CUSTOM\020\002:\226\001\352"
          + "A\222\001\n*documentai.googleapis.com/Processor"
          + "Version\022dprojects/{project}/locations/{l"
          + "ocation}/processors/{processor}/processo"
          + "rVersions/{processor_version}\"r\n\025Process"
          + "orVersionAlias\022\r\n\005alias\030\001 \001(\t\022J\n\021process"
          + "or_version\030\002 \001(\tB/\372A,\n*documentai.google"
          + "apis.com/ProcessorVersion\"\222\005\n\tProcessor\022"
          + "\024\n\004name\030\001 \001(\tB\006\340A\005\340A\003\022\014\n\004type\030\002 \001(\t\022\024\n\014d"
          + "isplay_name\030\003 \001(\t\022D\n\005state\030\004 \001(\01620.googl"
          + "e.cloud.documentai.v1beta3.Processor.Sta"
          + "teB\003\340A\003\022R\n\031default_processor_version\030\t \001"
          + "(\tB/\372A,\n*documentai.googleapis.com/Proce"
          + "ssorVersion\022^\n\031processor_version_aliases"
          + "\030\n \003(\01326.google.cloud.documentai.v1beta3"
          + ".ProcessorVersionAliasB\003\340A\003\022 \n\020process_e"
          + "ndpoint\030\006 \001(\tB\006\340A\003\340A\005\022/\n\013create_time\030\007 \001"
          + "(\0132\032.google.protobuf.Timestamp\022\024\n\014kms_ke"
          + "y_name\030\010 \001(\t\"~\n\005State\022\025\n\021STATE_UNSPECIFI"
          + "ED\020\000\022\013\n\007ENABLED\020\001\022\014\n\010DISABLED\020\002\022\014\n\010ENABL"
          + "ING\020\003\022\r\n\tDISABLING\020\004\022\014\n\010CREATING\020\005\022\n\n\006FA"
          + "ILED\020\006\022\014\n\010DELETING\020\007:h\352Ae\n#documentai.go"
          + "ogleapis.com/Processor\022>projects/{projec"
          + "t}/locations/{location}/processors/{proc"
          + "essor}B\352\001\n#com.google.cloud.documentai.v"
          + "1beta3B\023DocumentAiProcessorP\001ZCcloud.goo"
          + "gle.com/go/documentai/apiv1beta3/documen"
          + "taipb;documentaipb\252\002\037Google.Cloud.Docume"
          + "ntAI.V1Beta3\312\002\037Google\\Cloud\\DocumentAI\\V"
          + "1beta3\352\002\"Google::Cloud::DocumentAI::V1be"
          + "ta3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema.getDescriptor(),
              com.google.cloud.documentai.v1beta3.DocumentAiEvaluation.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "DocumentSchema",
              "State",
              "CreateTime",
              "LatestEvaluation",
              "KmsKeyName",
              "KmsKeyVersionName",
              "GoogleManaged",
              "DeprecationInfo",
              "ModelType",
            });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_descriptor =
        internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_descriptor,
            new java.lang.String[] {
              "DeprecationTime", "ReplacementProcessorVersion",
            });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_descriptor,
            new java.lang.String[] {
              "Alias", "ProcessorVersion",
            });
    internal_static_google_cloud_documentai_v1beta3_Processor_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta3_Processor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Processor_descriptor,
            new java.lang.String[] {
              "Name",
              "Type",
              "DisplayName",
              "State",
              "DefaultProcessorVersion",
              "ProcessorVersionAliases",
              "ProcessEndpoint",
              "CreateTime",
              "KmsKeyName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema.getDescriptor();
    com.google.cloud.documentai.v1beta3.DocumentAiEvaluation.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
