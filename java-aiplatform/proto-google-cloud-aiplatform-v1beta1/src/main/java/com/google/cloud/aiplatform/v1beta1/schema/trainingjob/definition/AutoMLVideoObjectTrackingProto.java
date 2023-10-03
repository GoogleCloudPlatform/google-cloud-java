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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_video_object_tracking.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLVideoObjectTrackingProto {
  private AutoMLVideoObjectTrackingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n`google/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_video_obj"
          + "ect_tracking.proto\022=google.cloud.aiplatf"
          + "orm.v1beta1.schema.trainingjob.definitio"
          + "n\"\213\001\n\031AutoMlVideoObjectTracking\022n\n\006input"
          + "s\030\001 \001(\0132^.google.cloud.aiplatform.v1beta"
          + "1.schema.trainingjob.definition.AutoMlVi"
          + "deoObjectTrackingInputs\"\352\002\n\037AutoMlVideoO"
          + "bjectTrackingInputs\022|\n\nmodel_type\030\001 \001(\0162"
          + "h.google.cloud.aiplatform.v1beta1.schema"
          + ".trainingjob.definition.AutoMlVideoObjec"
          + "tTrackingInputs.ModelType\"\310\001\n\tModelType\022"
          + "\032\n\026MODEL_TYPE_UNSPECIFIED\020\000\022\t\n\005CLOUD\020\001\022\026"
          + "\n\022MOBILE_VERSATILE_1\020\002\022\034\n\030MOBILE_CORAL_V"
          + "ERSATILE_1\020\003\022\036\n\032MOBILE_CORAL_LOW_LATENCY"
          + "_1\020\004\022\035\n\031MOBILE_JETSON_VERSATILE_1\020\005\022\037\n\033M"
          + "OBILE_JETSON_LOW_LATENCY_1\020\006B\216\003\nAcom.goo"
          + "gle.cloud.aiplatform.v1beta1.schema.trai"
          + "ningjob.definitionB\036AutoMLVideoObjectTra"
          + "ckingProtoP\001Zacloud.google.com/go/aiplat"
          + "form/apiv1beta1/schema/trainingjob/defin"
          + "ition/definitionpb;definitionpb\252\002=Google"
          + ".Cloud.AIPlatform.V1Beta1.Schema.Trainin"
          + "gJob.Definition\312\002=Google\\Cloud\\AIPlatfor"
          + "m\\V1beta1\\Schema\\TrainingJob\\Definition\352"
          + "\002CGoogle::Cloud::AIPlatform::V1beta1::Sc"
          + "hema::TrainingJob::Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor,
            new java.lang.String[] {
              "ModelType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
