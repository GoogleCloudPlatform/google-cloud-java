/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/orchestration/airflow/service/v1beta1/operations.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public final class OperationsProto {
  private OperationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orchestration_airflow_service_v1beta1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orchestration_airflow_service_v1beta1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/cloud/orchestration/airflow/ser"
          + "vice/v1beta1/operations.proto\0222google.cl"
          + "oud.orchestration.airflow.service.v1beta"
          + "1\032\037google/protobuf/timestamp.proto\"\376\003\n\021O"
          + "perationMetadata\022Z\n\005state\030\001 \001(\0162K.google"
          + ".cloud.orchestration.airflow.service.v1b"
          + "eta1.OperationMetadata.State\022b\n\016operatio"
          + "n_type\030\002 \001(\0162J.google.cloud.orchestratio"
          + "n.airflow.service.v1beta1.OperationMetad"
          + "ata.Type\022\020\n\010resource\030\003 \001(\t\022\025\n\rresource_u"
          + "uid\030\004 \001(\t\022/\n\013create_time\030\005 \001(\0132\032.google."
          + "protobuf.Timestamp\022,\n\010end_time\030\006 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\"T\n\005State\022\025\n\021STA"
          + "TE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING"
          + "\020\002\022\016\n\nSUCCESSFUL\020\003\022\n\n\006FAILED\020\004\"K\n\004Type\022\024"
          + "\n\020TYPE_UNSPECIFIED\020\000\022\n\n\006CREATE\020\001\022\n\n\006DELE"
          + "TE\020\002\022\n\n\006UPDATE\020\003\022\t\n\005CHECK\020\004B\246\001\n6com.goog"
          + "le.cloud.orchestration.airflow.service.v"
          + "1beta1B\017OperationsProtoP\001ZYgoogle.golang"
          + ".org/genproto/googleapis/cloud/orchestra"
          + "tion/airflow/service/v1beta1;serviceb\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orchestration_airflow_service_v1beta1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orchestration_airflow_service_v1beta1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "State", "OperationType", "Resource", "ResourceUuid", "CreateTime", "EndTime",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
