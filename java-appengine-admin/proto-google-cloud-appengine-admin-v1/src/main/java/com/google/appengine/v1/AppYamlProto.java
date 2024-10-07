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
// source: google/appengine/v1/app_yaml.proto

// Protobuf Java Version: 3.25.5
package com.google.appengine.v1;

public final class AppYamlProto {
  private AppYamlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ApiConfigHandler_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ApiConfigHandler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ErrorHandler_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ErrorHandler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_UrlMap_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_UrlMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_StaticFilesHandler_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_StaticFilesHandler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_StaticFilesHandler_HttpHeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_StaticFilesHandler_HttpHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ScriptHandler_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ScriptHandler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ApiEndpointHandler_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ApiEndpointHandler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_HealthCheck_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_HealthCheck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ReadinessCheck_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ReadinessCheck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_LivenessCheck_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_LivenessCheck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Library_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Library_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/appengine/v1/app_yaml.proto\022\023go"
          + "ogle.appengine.v1\032\036google/protobuf/durat"
          + "ion.proto\"\340\001\n\020ApiConfigHandler\022=\n\020auth_f"
          + "ail_action\030\001 \001(\0162#.google.appengine.v1.A"
          + "uthFailAction\0224\n\005login\030\002 \001(\0162%.google.ap"
          + "pengine.v1.LoginRequirement\022\016\n\006script\030\003 "
          + "\001(\t\022:\n\016security_level\030\004 \001(\0162\".google.app"
          + "engine.v1.SecurityLevel\022\013\n\003url\030\005 \001(\t\"\217\002\n"
          + "\014ErrorHandler\022?\n\nerror_code\030\001 \001(\0162+.goog"
          + "le.appengine.v1.ErrorHandler.ErrorCode\022\023"
          + "\n\013static_file\030\002 \001(\t\022\021\n\tmime_type\030\003 \001(\t\"\225"
          + "\001\n\tErrorCode\022\032\n\026ERROR_CODE_UNSPECIFIED\020\000"
          + "\022\026\n\022ERROR_CODE_DEFAULT\020\000\022\031\n\025ERROR_CODE_O"
          + "VER_QUOTA\020\001\022\035\n\031ERROR_CODE_DOS_API_DENIAL"
          + "\020\002\022\026\n\022ERROR_CODE_TIMEOUT\020\003\032\002\020\001\"\315\005\n\006UrlMa"
          + "p\022\021\n\turl_regex\030\001 \001(\t\022?\n\014static_files\030\002 \001"
          + "(\0132\'.google.appengine.v1.StaticFilesHand"
          + "lerH\000\0224\n\006script\030\003 \001(\0132\".google.appengine"
          + ".v1.ScriptHandlerH\000\022?\n\014api_endpoint\030\004 \001("
          + "\0132\'.google.appengine.v1.ApiEndpointHandl"
          + "erH\000\022:\n\016security_level\030\005 \001(\0162\".google.ap"
          + "pengine.v1.SecurityLevel\0224\n\005login\030\006 \001(\0162"
          + "%.google.appengine.v1.LoginRequirement\022="
          + "\n\020auth_fail_action\030\007 \001(\0162#.google.appeng"
          + "ine.v1.AuthFailAction\022Y\n\033redirect_http_r"
          + "esponse_code\030\010 \001(\01624.google.appengine.v1"
          + ".UrlMap.RedirectHttpResponseCode\"\333\001\n\030Red"
          + "irectHttpResponseCode\022+\n\'REDIRECT_HTTP_R"
          + "ESPONSE_CODE_UNSPECIFIED\020\000\022#\n\037REDIRECT_H"
          + "TTP_RESPONSE_CODE_301\020\001\022#\n\037REDIRECT_HTTP"
          + "_RESPONSE_CODE_302\020\002\022#\n\037REDIRECT_HTTP_RE"
          + "SPONSE_CODE_303\020\003\022#\n\037REDIRECT_HTTP_RESPO"
          + "NSE_CODE_307\020\004B\016\n\014handler_type\"\300\002\n\022Stati"
          + "cFilesHandler\022\014\n\004path\030\001 \001(\t\022\031\n\021upload_pa"
          + "th_regex\030\002 \001(\t\022N\n\014http_headers\030\003 \003(\01328.g"
          + "oogle.appengine.v1.StaticFilesHandler.Ht"
          + "tpHeadersEntry\022\021\n\tmime_type\030\004 \001(\t\022-\n\nexp"
          + "iration\030\005 \001(\0132\031.google.protobuf.Duration"
          + "\022\035\n\025require_matching_file\030\006 \001(\010\022\034\n\024appli"
          + "cation_readable\030\007 \001(\010\0322\n\020HttpHeadersEntr"
          + "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"$\n\rScr"
          + "iptHandler\022\023\n\013script_path\030\001 \001(\t\")\n\022ApiEn"
          + "dpointHandler\022\023\n\013script_path\030\001 \001(\t\"\353\001\n\013H"
          + "ealthCheck\022\034\n\024disable_health_check\030\001 \001(\010"
          + "\022\014\n\004host\030\002 \001(\t\022\031\n\021healthy_threshold\030\003 \001("
          + "\r\022\033\n\023unhealthy_threshold\030\004 \001(\r\022\031\n\021restar"
          + "t_threshold\030\005 \001(\r\0221\n\016check_interval\030\006 \001("
          + "\0132\031.google.protobuf.Duration\022*\n\007timeout\030"
          + "\007 \001(\0132\031.google.protobuf.Duration\"\367\001\n\016Rea"
          + "dinessCheck\022\014\n\004path\030\001 \001(\t\022\014\n\004host\030\002 \001(\t\022"
          + "\031\n\021failure_threshold\030\003 \001(\r\022\031\n\021success_th"
          + "reshold\030\004 \001(\r\0221\n\016check_interval\030\005 \001(\0132\031."
          + "google.protobuf.Duration\022*\n\007timeout\030\006 \001("
          + "\0132\031.google.protobuf.Duration\0224\n\021app_star"
          + "t_timeout\030\007 \001(\0132\031.google.protobuf.Durati"
          + "on\"\362\001\n\rLivenessCheck\022\014\n\004path\030\001 \001(\t\022\014\n\004ho"
          + "st\030\002 \001(\t\022\031\n\021failure_threshold\030\003 \001(\r\022\031\n\021s"
          + "uccess_threshold\030\004 \001(\r\0221\n\016check_interval"
          + "\030\005 \001(\0132\031.google.protobuf.Duration\022*\n\007tim"
          + "eout\030\006 \001(\0132\031.google.protobuf.Duration\0220\n"
          + "\rinitial_delay\030\007 \001(\0132\031.google.protobuf.D"
          + "uration\"(\n\007Library\022\014\n\004name\030\001 \001(\t\022\017\n\007vers"
          + "ion\030\002 \001(\t*t\n\016AuthFailAction\022 \n\034AUTH_FAIL"
          + "_ACTION_UNSPECIFIED\020\000\022\035\n\031AUTH_FAIL_ACTIO"
          + "N_REDIRECT\020\001\022!\n\035AUTH_FAIL_ACTION_UNAUTHO"
          + "RIZED\020\002*b\n\020LoginRequirement\022\025\n\021LOGIN_UNS"
          + "PECIFIED\020\000\022\022\n\016LOGIN_OPTIONAL\020\001\022\017\n\013LOGIN_"
          + "ADMIN\020\002\022\022\n\016LOGIN_REQUIRED\020\003*y\n\rSecurityL"
          + "evel\022\026\n\022SECURE_UNSPECIFIED\020\000\022\022\n\016SECURE_D"
          + "EFAULT\020\000\022\020\n\014SECURE_NEVER\020\001\022\023\n\017SECURE_OPT"
          + "IONAL\020\002\022\021\n\rSECURE_ALWAYS\020\003\032\002\020\001B\275\001\n\027com.g"
          + "oogle.appengine.v1B\014AppYamlProtoP\001Z;clou"
          + "d.google.com/go/appengine/apiv1/appengin"
          + "epb;appenginepb\252\002\031Google.Cloud.AppEngine"
          + ".V1\312\002\031Google\\Cloud\\AppEngine\\V1\352\002\034Google"
          + "::Cloud::AppEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_appengine_v1_ApiConfigHandler_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_ApiConfigHandler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ApiConfigHandler_descriptor,
            new java.lang.String[] {
              "AuthFailAction", "Login", "Script", "SecurityLevel", "Url",
            });
    internal_static_google_appengine_v1_ErrorHandler_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_ErrorHandler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ErrorHandler_descriptor,
            new java.lang.String[] {
              "ErrorCode", "StaticFile", "MimeType",
            });
    internal_static_google_appengine_v1_UrlMap_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_appengine_v1_UrlMap_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_UrlMap_descriptor,
            new java.lang.String[] {
              "UrlRegex",
              "StaticFiles",
              "Script",
              "ApiEndpoint",
              "SecurityLevel",
              "Login",
              "AuthFailAction",
              "RedirectHttpResponseCode",
              "HandlerType",
            });
    internal_static_google_appengine_v1_StaticFilesHandler_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_appengine_v1_StaticFilesHandler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_StaticFilesHandler_descriptor,
            new java.lang.String[] {
              "Path",
              "UploadPathRegex",
              "HttpHeaders",
              "MimeType",
              "Expiration",
              "RequireMatchingFile",
              "ApplicationReadable",
            });
    internal_static_google_appengine_v1_StaticFilesHandler_HttpHeadersEntry_descriptor =
        internal_static_google_appengine_v1_StaticFilesHandler_descriptor.getNestedTypes().get(0);
    internal_static_google_appengine_v1_StaticFilesHandler_HttpHeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_StaticFilesHandler_HttpHeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_appengine_v1_ScriptHandler_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_appengine_v1_ScriptHandler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ScriptHandler_descriptor,
            new java.lang.String[] {
              "ScriptPath",
            });
    internal_static_google_appengine_v1_ApiEndpointHandler_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_appengine_v1_ApiEndpointHandler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ApiEndpointHandler_descriptor,
            new java.lang.String[] {
              "ScriptPath",
            });
    internal_static_google_appengine_v1_HealthCheck_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_appengine_v1_HealthCheck_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_HealthCheck_descriptor,
            new java.lang.String[] {
              "DisableHealthCheck",
              "Host",
              "HealthyThreshold",
              "UnhealthyThreshold",
              "RestartThreshold",
              "CheckInterval",
              "Timeout",
            });
    internal_static_google_appengine_v1_ReadinessCheck_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_appengine_v1_ReadinessCheck_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ReadinessCheck_descriptor,
            new java.lang.String[] {
              "Path",
              "Host",
              "FailureThreshold",
              "SuccessThreshold",
              "CheckInterval",
              "Timeout",
              "AppStartTimeout",
            });
    internal_static_google_appengine_v1_LivenessCheck_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_appengine_v1_LivenessCheck_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_LivenessCheck_descriptor,
            new java.lang.String[] {
              "Path",
              "Host",
              "FailureThreshold",
              "SuccessThreshold",
              "CheckInterval",
              "Timeout",
              "InitialDelay",
            });
    internal_static_google_appengine_v1_Library_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_appengine_v1_Library_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Library_descriptor,
            new java.lang.String[] {
              "Name", "Version",
            });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
