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
// source: google/cloud/bigquery/migration/v2alpha/translation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.migration.v2alpha;

public final class TranslationServiceProto {
  private TranslationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationErrorDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationErrorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/bigquery/migration/v2alph"
          + "a/translation_service.proto\022\'google.clou"
          + "d.bigquery.migration.v2alpha\032\034google/api"
          + "/annotations.proto\032\027google/api/client.pr"
          + "oto\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\"\274\002\n\025TranslateQue"
          + "ryRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locat"
          + "ions.googleapis.com/Location\022w\n\016source_d"
          + "ialect\030\002 \001(\0162Z.google.cloud.bigquery.mig"
          + "ration.v2alpha.TranslateQueryRequest.Sql"
          + "TranslationSourceDialectB\003\340A\002\022\022\n\005query\030\003"
          + " \001(\tB\003\340A\002\"[\n\033SqlTranslationSourceDialect"
          + "\022.\n*SQL_TRANSLATION_SOURCE_DIALECT_UNSPE"
          + "CIFIED\020\000\022\014\n\010TERADATA\020\001\"\363\001\n\026TranslateQuer"
          + "yResponse\022\037\n\017translation_job\030\004 \001(\tB\006\340A\003\340"
          + "A\005\022\030\n\020translated_query\030\001 \001(\t\022L\n\006errors\030\002"
          + " \003(\0132<.google.cloud.bigquery.migration.v"
          + "2alpha.SqlTranslationError\022P\n\010warnings\030\003"
          + " \003(\0132>.google.cloud.bigquery.migration.v"
          + "2alpha.SqlTranslationWarning\"I\n\031SqlTrans"
          + "lationErrorDetail\022\013\n\003row\030\001 \001(\003\022\016\n\006column"
          + "\030\002 \001(\003\022\017\n\007message\030\003 \001(\t\"\323\002\n\023SqlTranslati"
          + "onError\022h\n\nerror_type\030\001 \001(\0162T.google.clo"
          + "ud.bigquery.migration.v2alpha.SqlTransla"
          + "tionError.SqlTranslationErrorType\022X\n\014err"
          + "or_detail\030\002 \001(\0132B.google.cloud.bigquery."
          + "migration.v2alpha.SqlTranslationErrorDet"
          + "ail\"x\n\027SqlTranslationErrorType\022*\n&SQL_TR"
          + "ANSLATION_ERROR_TYPE_UNSPECIFIED\020\000\022\023\n\017SQ"
          + "L_PARSE_ERROR\020\001\022\034\n\030UNSUPPORTED_SQL_FUNCT"
          + "ION\020\002\"s\n\025SqlTranslationWarning\022Z\n\016warnin"
          + "g_detail\030\001 \001(\0132B.google.cloud.bigquery.m"
          + "igration.v2alpha.SqlTranslationErrorDeta"
          + "il2\343\002\n\025SqlTranslationService\022\363\001\n\016Transla"
          + "teQuery\022>.google.cloud.bigquery.migratio"
          + "n.v2alpha.TranslateQueryRequest\032?.google"
          + ".cloud.bigquery.migration.v2alpha.Transl"
          + "ateQueryResponse\"`\332A\033parent,source_diale"
          + "ct,query\202\323\344\223\002<\"7/v2alpha/{parent=project"
          + "s/*/locations/*}:translateQuery:\001*\032T\312A b"
          + "igquerymigration.googleapis.com\322A.https:"
          + "//www.googleapis.com/auth/cloud-platform"
          + "B\347\001\n+com.google.cloud.bigquery.migration"
          + ".v2alphaB\027TranslationServiceProtoP\001ZIclo"
          + "ud.google.com/go/bigquery/migration/apiv"
          + "2alpha/migrationpb;migrationpb\252\002\'Google."
          + "Cloud.BigQuery.Migration.V2Alpha\312\002\'Googl"
          + "e\\Cloud\\BigQuery\\Migration\\V2alphab\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SourceDialect", "Query",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_TranslateQueryResponse_descriptor,
            new java.lang.String[] {
              "TranslationJob", "TranslatedQuery", "Errors", "Warnings",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationErrorDetail_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationErrorDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationErrorDetail_descriptor,
            new java.lang.String[] {
              "Row", "Column", "Message",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationError_descriptor,
            new java.lang.String[] {
              "ErrorType", "ErrorDetail",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_SqlTranslationWarning_descriptor,
            new java.lang.String[] {
              "WarningDetail",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
