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
// source: google/cloud/tasks/v2/target.proto

package com.google.cloud.tasks.v2;

public final class TargetProto {
  private TargetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_HttpRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_HttpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_HttpRequest_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_HttpRequest_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_AppEngineRouting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_AppEngineRouting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_OAuthToken_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_OAuthToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_OidcToken_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_OidcToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/tasks/v2/target.proto\022\025go"
          + "ogle.cloud.tasks.v2\032\037google/api/field_be"
          + "havior.proto\"\342\002\n\013HttpRequest\022\021\n\003url\030\001 \001("
          + "\tB\004\342A\001\002\0226\n\013http_method\030\002 \001(\0162!.google.cl"
          + "oud.tasks.v2.HttpMethod\022@\n\007headers\030\003 \003(\013"
          + "2/.google.cloud.tasks.v2.HttpRequest.Hea"
          + "dersEntry\022\014\n\004body\030\004 \001(\014\0228\n\013oauth_token\030\005"
          + " \001(\0132!.google.cloud.tasks.v2.OAuthTokenH"
          + "\000\0226\n\noidc_token\030\006 \001(\0132 .google.cloud.tas"
          + "ks.v2.OidcTokenH\000\032.\n\014HeadersEntry\022\013\n\003key"
          + "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\026\n\024authorizati"
          + "on_header\"\262\002\n\024AppEngineHttpRequest\0226\n\013ht"
          + "tp_method\030\001 \001(\0162!.google.cloud.tasks.v2."
          + "HttpMethod\022C\n\022app_engine_routing\030\002 \001(\0132\'"
          + ".google.cloud.tasks.v2.AppEngineRouting\022"
          + "\024\n\014relative_uri\030\003 \001(\t\022I\n\007headers\030\004 \003(\01328"
          + ".google.cloud.tasks.v2.AppEngineHttpRequ"
          + "est.HeadersEntry\022\014\n\004body\030\005 \001(\014\032.\n\014Header"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"T"
          + "\n\020AppEngineRouting\022\017\n\007service\030\001 \001(\t\022\017\n\007v"
          + "ersion\030\002 \001(\t\022\020\n\010instance\030\003 \001(\t\022\014\n\004host\030\004"
          + " \001(\t\":\n\nOAuthToken\022\035\n\025service_account_em"
          + "ail\030\001 \001(\t\022\r\n\005scope\030\002 \001(\t\"<\n\tOidcToken\022\035\n"
          + "\025service_account_email\030\001 \001(\t\022\020\n\010audience"
          + "\030\002 \001(\t*s\n\nHttpMethod\022\033\n\027HTTP_METHOD_UNSP"
          + "ECIFIED\020\000\022\010\n\004POST\020\001\022\007\n\003GET\020\002\022\010\n\004HEAD\020\003\022\007"
          + "\n\003PUT\020\004\022\n\n\006DELETE\020\005\022\t\n\005PATCH\020\006\022\013\n\007OPTION"
          + "S\020\007Bj\n\031com.google.cloud.tasks.v2B\013Target"
          + "ProtoP\001Z>cloud.google.com/go/cloudtasks/"
          + "apiv2/cloudtaskspb;cloudtaskspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_tasks_v2_HttpRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2_HttpRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_HttpRequest_descriptor,
            new java.lang.String[] {
              "Url",
              "HttpMethod",
              "Headers",
              "Body",
              "OauthToken",
              "OidcToken",
              "AuthorizationHeader",
            });
    internal_static_google_cloud_tasks_v2_HttpRequest_HeadersEntry_descriptor =
        internal_static_google_cloud_tasks_v2_HttpRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_tasks_v2_HttpRequest_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_HttpRequest_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_descriptor,
            new java.lang.String[] {
              "HttpMethod", "AppEngineRouting", "RelativeUri", "Headers", "Body",
            });
    internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_HeadersEntry_descriptor =
        internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_AppEngineHttpRequest_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_tasks_v2_AppEngineRouting_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2_AppEngineRouting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_AppEngineRouting_descriptor,
            new java.lang.String[] {
              "Service", "Version", "Instance", "Host",
            });
    internal_static_google_cloud_tasks_v2_OAuthToken_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_tasks_v2_OAuthToken_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_OAuthToken_descriptor,
            new java.lang.String[] {
              "ServiceAccountEmail", "Scope",
            });
    internal_static_google_cloud_tasks_v2_OidcToken_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_tasks_v2_OidcToken_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_OidcToken_descriptor,
            new java.lang.String[] {
              "ServiceAccountEmail", "Audience",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
