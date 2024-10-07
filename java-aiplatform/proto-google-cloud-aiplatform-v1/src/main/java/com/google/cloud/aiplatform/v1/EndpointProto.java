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
// source: google/cloud/aiplatform/v1/endpoint.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public final class EndpointProto {
  private EndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/aiplatform/v1/endpoint.pr"
          + "oto\022\032google.cloud.aiplatform.v1\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\0320google/cloud/aiplatform/v1/"
          + "encryption_spec.proto\032,google/cloud/aipl"
          + "atform/v1/explanation.proto\032#google/clou"
          + "d/aiplatform/v1/io.proto\0322google/cloud/a"
          + "iplatform/v1/machine_resources.proto\0323go"
          + "ogle/cloud/aiplatform/v1/service_network"
          + "ing.proto\032\037google/protobuf/timestamp.pro"
          + "to\"\251\n\n\010Endpoint\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014di"
          + "splay_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001"
          + "(\t\022G\n\017deployed_models\030\004 \003(\0132).google.clo"
          + "ud.aiplatform.v1.DeployedModelB\003\340A\003\022M\n\rt"
          + "raffic_split\030\005 \003(\01326.google.cloud.aiplat"
          + "form.v1.Endpoint.TrafficSplitEntry\022\014\n\004et"
          + "ag\030\006 \001(\t\022@\n\006labels\030\007 \003(\01320.google.cloud."
          + "aiplatform.v1.Endpoint.LabelsEntry\0224\n\013cr"
          + "eate_time\030\010 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\0224\n\013update_time\030\t \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\022C\n\017encryption_spe"
          + "c\030\n \001(\0132*.google.cloud.aiplatform.v1.Enc"
          + "ryptionSpec\0227\n\007network\030\r \001(\tB&\340A\001\372A \n\036co"
          + "mpute.googleapis.com/Network\022*\n\036enable_p"
          + "rivate_service_connect\030\021 \001(\010B\002\030\001\022d\n\036priv"
          + "ate_service_connect_config\030\025 \001(\01327.googl"
          + "e.cloud.aiplatform.v1.PrivateServiceConn"
          + "ectConfigB\003\340A\001\022g\n\037model_deployment_monit"
          + "oring_job\030\016 \001(\tB>\340A\003\372A8\n6aiplatform.goog"
          + "leapis.com/ModelDeploymentMonitoringJob\022"
          + "p\n\'predict_request_response_logging_conf"
          + "ig\030\022 \001(\0132?.google.cloud.aiplatform.v1.Pr"
          + "edictRequestResponseLoggingConfig\022\"\n\032ded"
          + "icated_endpoint_enabled\030\030 \001(\010\022#\n\026dedicat"
          + "ed_endpoint_dns\030\031 \001(\tB\003\340A\003\022\032\n\rsatisfies_"
          + "pzs\030\033 \001(\010B\003\340A\003\022\032\n\rsatisfies_pzi\030\034 \001(\010B\003\340"
          + "A\003\0323\n\021TrafficSplitEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005"
          + "value\030\002 \001(\005:\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 "
          + "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\265\001\352A\261\001\n\"aiplatfor"
          + "m.googleapis.com/Endpoint\022<projects/{pro"
          + "ject}/locations/{location}/endpoints/{en"
          + "dpoint}\022Mprojects/{project}/locations/{l"
          + "ocation}/publishers/{publisher}/models/{"
          + "model}\"\332\005\n\rDeployedModel\022M\n\023dedicated_re"
          + "sources\030\007 \001(\0132..google.cloud.aiplatform."
          + "v1.DedicatedResourcesH\000\022M\n\023automatic_res"
          + "ources\030\010 \001(\0132..google.cloud.aiplatform.v"
          + "1.AutomaticResourcesH\000\022Q\n\020shared_resourc"
          + "es\030\021 \001(\tB5\372A2\n0aiplatform.googleapis.com"
          + "/DeploymentResourcePoolH\000\022\017\n\002id\030\001 \001(\tB\003\340"
          + "A\005\0226\n\005model\030\002 \001(\tB\'\340A\002\372A!\n\037aiplatform.go"
          + "ogleapis.com/Model\022\035\n\020model_version_id\030\022"
          + " \001(\tB\003\340A\003\022\024\n\014display_name\030\003 \001(\t\0224\n\013creat"
          + "e_time\030\006 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\022E\n\020explanation_spec\030\t \001(\0132+.google"
          + ".cloud.aiplatform.v1.ExplanationSpec\022\034\n\024"
          + "disable_explanations\030\023 \001(\010\022\027\n\017service_ac"
          + "count\030\013 \001(\t\022!\n\031disable_container_logging"
          + "\030\017 \001(\010\022\035\n\025enable_access_logging\030\r \001(\010\022L\n"
          + "\021private_endpoints\030\016 \001(\0132,.google.cloud."
          + "aiplatform.v1.PrivateEndpointsB\003\340A\003B\026\n\024p"
          + "rediction_resources\"\217\001\n\020PrivateEndpoints"
          + "\022\035\n\020predict_http_uri\030\001 \001(\tB\003\340A\003\022\035\n\020expla"
          + "in_http_uri\030\002 \001(\tB\003\340A\003\022\034\n\017health_http_ur"
          + "i\030\003 \001(\tB\003\340A\003\022\037\n\022service_attachment\030\004 \001(\t"
          + "B\003\340A\003\"\234\001\n#PredictRequestResponseLoggingC"
          + "onfig\022\017\n\007enabled\030\001 \001(\010\022\025\n\rsampling_rate\030"
          + "\002 \001(\001\022M\n\024bigquery_destination\030\003 \001(\0132/.go"
          + "ogle.cloud.aiplatform.v1.BigQueryDestina"
          + "tionB\313\001\n\036com.google.cloud.aiplatform.v1B"
          + "\rEndpointProtoP\001Z>cloud.google.com/go/ai"
          + "platform/apiv1/aiplatformpb;aiplatformpb"
          + "\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\C"
          + "loud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPl"
          + "atform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ServiceNetworkingProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Endpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "DeployedModels",
              "TrafficSplit",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "EncryptionSpec",
              "Network",
              "EnablePrivateServiceConnect",
              "PrivateServiceConnectConfig",
              "ModelDeploymentMonitoringJob",
              "PredictRequestResponseLoggingConfig",
              "DedicatedEndpointEnabled",
              "DedicatedEndpointDns",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_DeployedModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor,
            new java.lang.String[] {
              "DedicatedResources",
              "AutomaticResources",
              "SharedResources",
              "Id",
              "Model",
              "ModelVersionId",
              "DisplayName",
              "CreateTime",
              "ExplanationSpec",
              "DisableExplanations",
              "ServiceAccount",
              "DisableContainerLogging",
              "EnableAccessLogging",
              "PrivateEndpoints",
              "PredictionResources",
            });
    internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_descriptor,
            new java.lang.String[] {
              "PredictHttpUri", "ExplainHttpUri", "HealthHttpUri", "ServiceAttachment",
            });
    internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor,
            new java.lang.String[] {
              "Enabled", "SamplingRate", "BigqueryDestination",
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
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ServiceNetworkingProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
