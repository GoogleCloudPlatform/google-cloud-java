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
// source: google/cloud/websecurityscanner/v1beta/scan_run_error_trace.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.websecurityscanner.v1beta;

public final class ScanRunErrorTraceProto {
  private ScanRunErrorTraceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_ScanRunErrorTrace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_ScanRunErrorTrace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/websecurityscanner/v1beta"
          + "/scan_run_error_trace.proto\022&google.clou"
          + "d.websecurityscanner.v1beta\032>google/clou"
          + "d/websecurityscanner/v1beta/scan_config_"
          + "error.proto\"\225\003\n\021ScanRunErrorTrace\022L\n\004cod"
          + "e\030\001 \001(\0162>.google.cloud.websecurityscanne"
          + "r.v1beta.ScanRunErrorTrace.Code\022R\n\021scan_"
          + "config_error\030\002 \001(\01327.google.cloud.websec"
          + "urityscanner.v1beta.ScanConfigError\022#\n\033m"
          + "ost_common_http_error_code\030\003 \001(\005\"\270\001\n\004Cod"
          + "e\022\024\n\020CODE_UNSPECIFIED\020\000\022\022\n\016INTERNAL_ERRO"
          + "R\020\001\022\025\n\021SCAN_CONFIG_ISSUE\020\002\022\037\n\033AUTHENTICA"
          + "TION_CONFIG_ISSUE\020\003\022\034\n\030TIMED_OUT_WHILE_S"
          + "CANNING\020\004\022\026\n\022TOO_MANY_REDIRECTS\020\005\022\030\n\024TOO"
          + "_MANY_HTTP_ERRORS\020\006B\240\002\n*com.google.cloud"
          + ".websecurityscanner.v1betaB\026ScanRunError"
          + "TraceProtoP\001ZZcloud.google.com/go/websec"
          + "urityscanner/apiv1beta/websecurityscanne"
          + "rpb;websecurityscannerpb\252\002&Google.Cloud."
          + "WebSecurityScanner.V1Beta\312\002&Google\\Cloud"
          + "\\WebSecurityScanner\\V1beta\352\002)Google::Clo"
          + "ud::WebSecurityScanner::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.websecurityscanner.v1beta.ScanConfigErrorProto.getDescriptor(),
            });
    internal_static_google_cloud_websecurityscanner_v1beta_ScanRunErrorTrace_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanRunErrorTrace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_ScanRunErrorTrace_descriptor,
            new java.lang.String[] {
              "Code", "ScanConfigError", "MostCommonHttpErrorCode",
            });
    com.google.cloud.websecurityscanner.v1beta.ScanConfigErrorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
