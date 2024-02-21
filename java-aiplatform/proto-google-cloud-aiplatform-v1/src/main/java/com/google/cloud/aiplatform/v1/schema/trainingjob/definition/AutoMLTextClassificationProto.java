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
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_text_classification.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLTextClassificationProto {
  private AutoMLTextClassificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nYgoogle/cloud/aiplatform/v1/schema/trai"
          + "ningjob/definition/automl_text_classific"
          + "ation.proto\0228google.cloud.aiplatform.v1."
          + "schema.trainingjob.definition\"\204\001\n\030AutoMl"
          + "TextClassification\022h\n\006inputs\030\001 \001(\0132X.goo"
          + "gle.cloud.aiplatform.v1.schema.trainingj"
          + "ob.definition.AutoMlTextClassificationIn"
          + "puts\"5\n\036AutoMlTextClassificationInputs\022\023"
          + "\n\013multi_label\030\001 \001(\010B\364\002\n<com.google.cloud"
          + ".aiplatform.v1.schema.trainingjob.defini"
          + "tionB\035AutoMLTextClassificationProtoP\001Z\\c"
          + "loud.google.com/go/aiplatform/apiv1/sche"
          + "ma/trainingjob/definition/definitionpb;d"
          + "efinitionpb\252\0028Google.Cloud.AIPlatform.V1"
          + ".Schema.TrainingJob.Definition\312\0028Google\\"
          + "Cloud\\AIPlatform\\V1\\Schema\\TrainingJob\\D"
          + "efinition\352\002>Google::Cloud::AIPlatform::V"
          + "1::Schema::TrainingJob::Definitionb\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor,
            new java.lang.String[] {
              "MultiLabel",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
