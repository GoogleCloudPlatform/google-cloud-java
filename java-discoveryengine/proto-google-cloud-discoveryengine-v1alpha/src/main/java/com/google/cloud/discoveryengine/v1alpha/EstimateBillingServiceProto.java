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
// source: google/cloud/discoveryengine/v1alpha/estimate_billing_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public final class EstimateBillingServiceProto {
  private EstimateBillingServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_EstimatorUriPattern_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_EstimatorUriPattern_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_FileDataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_FileDataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/cloud/discoveryengine/v1alpha/e"
          + "stimate_billing_service.proto\022$google.cl"
          + "oud.discoveryengine.v1alpha\032\034google/api/"
          + "annotations.proto\032\027google/api/client.pro"
          + "to\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\0328google/cloud/dis"
          + "coveryengine/v1alpha/import_config.proto"
          + "\032#google/longrunning/operations.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\"\370\005\n\027Estim"
          + "ateDataSizeRequest\022n\n\023website_data_sourc"
          + "e\030\002 \001(\0132O.google.cloud.discoveryengine.v"
          + "1alpha.EstimateDataSizeRequest.WebsiteDa"
          + "taSourceH\000\022h\n\020file_data_source\030\003 \001(\0132L.g"
          + "oogle.cloud.discoveryengine.v1alpha.Esti"
          + "mateDataSizeRequest.FileDataSourceH\000\022A\n\010"
          + "location\030\001 \001(\tB/\340A\002\372A)\n\'discoveryengine."
          + "googleapis.com/Location\032\373\001\n\021WebsiteDataS"
          + "ource\022\210\001\n\026estimator_uri_patterns\030\001 \003(\0132c"
          + ".google.cloud.discoveryengine.v1alpha.Es"
          + "timateDataSizeRequest.WebsiteDataSource."
          + "EstimatorUriPatternB\003\340A\002\032[\n\023EstimatorUri"
          + "Pattern\022\034\n\024provided_uri_pattern\030\001 \001(\t\022\023\n"
          + "\013exact_match\030\002 \001(\010\022\021\n\texclusive\030\003 \001(\010\032\262\001"
          + "\n\016FileDataSource\022E\n\ngcs_source\030\001 \001(\0132/.g"
          + "oogle.cloud.discoveryengine.v1alpha.GcsS"
          + "ourceH\000\022O\n\017bigquery_source\030\002 \001(\01324.googl"
          + "e.cloud.discoveryengine.v1alpha.BigQuery"
          + "SourceH\000B\010\n\006sourceB\r\n\013data_source\"K\n\030Est"
          + "imateDataSizeResponse\022\027\n\017data_size_bytes"
          + "\030\001 \001(\003\022\026\n\016document_count\030\002 \001(\003\"K\n\030Estima"
          + "teDataSizeMetadata\022/\n\013create_time\030\001 \001(\0132"
          + "\032.google.protobuf.Timestamp2\251\003\n\026Estimate"
          + "BillingService\022\272\002\n\020EstimateDataSize\022=.go"
          + "ogle.cloud.discoveryengine.v1alpha.Estim"
          + "ateDataSizeRequest\032\035.google.longrunning."
          + "Operation\"\307\001\312A~\n=google.cloud.discoverye"
          + "ngine.v1alpha.EstimateDataSizeResponse\022="
          + "google.cloud.discoveryengine.v1alpha.Est"
          + "imateDataSizeMetadata\202\323\344\223\002@\";/v1alpha/{l"
          + "ocation=projects/*/locations/*}:estimate"
          + "DataSize:\001*\032R\312A\036discoveryengine.googleap"
          + "is.com\322A.https://www.googleapis.com/auth"
          + "/cloud-platformB\247\002\n(com.google.cloud.dis"
          + "coveryengine.v1alphaB\033EstimateBillingSer"
          + "viceProtoP\001ZRcloud.google.com/go/discove"
          + "ryengine/apiv1alpha/discoveryenginepb;di"
          + "scoveryenginepb\242\002\017DISCOVERYENGINE\252\002$Goog"
          + "le.Cloud.DiscoveryEngine.V1Alpha\312\002$Googl"
          + "e\\Cloud\\DiscoveryEngine\\V1alpha\352\002\'Google"
          + "::Cloud::DiscoveryEngine::V1alphab\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.ImportConfigProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_descriptor,
            new java.lang.String[] {
              "WebsiteDataSource", "FileDataSource", "Location", "DataSource",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_descriptor,
            new java.lang.String[] {
              "EstimatorUriPatterns",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_EstimatorUriPattern_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_EstimatorUriPattern_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_WebsiteDataSource_EstimatorUriPattern_descriptor,
            new java.lang.String[] {
              "ProvidedUriPattern", "ExactMatch", "Exclusive",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_FileDataSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_FileDataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeRequest_FileDataSource_descriptor,
            new java.lang.String[] {
              "GcsSource", "BigquerySource", "Source",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeResponse_descriptor,
            new java.lang.String[] {
              "DataSizeBytes", "DocumentCount",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_EstimateDataSizeMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
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
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.ImportConfigProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
