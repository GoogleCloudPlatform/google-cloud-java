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
// source: google/cloud/websecurityscanner/v1/scan_run.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.websecurityscanner.v1;

public final class ScanRunProto {
  private ScanRunProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1_ScanRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanRun_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/websecurityscanner/v1/sca"
          + "n_run.proto\022\"google.cloud.websecuritysca"
          + "nner.v1\032=google/cloud/websecurityscanner"
          + "/v1/scan_run_error_trace.proto\032?google/c"
          + "loud/websecurityscanner/v1/scan_run_warn"
          + "ing_trace.proto\032\037google/protobuf/timesta"
          + "mp.proto\"\320\005\n\007ScanRun\022\014\n\004name\030\001 \001(\t\022S\n\017ex"
          + "ecution_state\030\002 \001(\0162:.google.cloud.webse"
          + "curityscanner.v1.ScanRun.ExecutionState\022"
          + "M\n\014result_state\030\003 \001(\01627.google.cloud.web"
          + "securityscanner.v1.ScanRun.ResultState\022."
          + "\n\nstart_time\030\004 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022,\n\010end_time\030\005 \001(\0132\032.google.protob"
          + "uf.Timestamp\022\032\n\022urls_crawled_count\030\006 \001(\003"
          + "\022\031\n\021urls_tested_count\030\007 \001(\003\022\033\n\023has_vulne"
          + "rabilities\030\010 \001(\010\022\030\n\020progress_percent\030\t \001"
          + "(\005\022J\n\013error_trace\030\n \001(\01325.google.cloud.w"
          + "ebsecurityscanner.v1.ScanRunErrorTrace\022O"
          + "\n\016warning_traces\030\013 \003(\01327.google.cloud.we"
          + "bsecurityscanner.v1.ScanRunWarningTrace\""
          + "Y\n\016ExecutionState\022\037\n\033EXECUTION_STATE_UNS"
          + "PECIFIED\020\000\022\n\n\006QUEUED\020\001\022\014\n\010SCANNING\020\002\022\014\n\010"
          + "FINISHED\020\003\"O\n\013ResultState\022\034\n\030RESULT_STAT"
          + "E_UNSPECIFIED\020\000\022\013\n\007SUCCESS\020\001\022\t\n\005ERROR\020\002\022"
          + "\n\n\006KILLED\020\003B\202\002\n&com.google.cloud.websecu"
          + "rityscanner.v1B\014ScanRunProtoP\001ZVcloud.go"
          + "ogle.com/go/websecurityscanner/apiv1/web"
          + "securityscannerpb;websecurityscannerpb\252\002"
          + "\"Google.Cloud.WebSecurityScanner.V1\312\002\"Go"
          + "ogle\\Cloud\\WebSecurityScanner\\V1\352\002%Googl"
          + "e::Cloud::WebSecurityScanner::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.websecurityscanner.v1.ScanRunErrorTraceProto.getDescriptor(),
              com.google.cloud.websecurityscanner.v1.ScanRunWarningTraceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_websecurityscanner_v1_ScanRun_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1_ScanRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1_ScanRun_descriptor,
            new java.lang.String[] {
              "Name",
              "ExecutionState",
              "ResultState",
              "StartTime",
              "EndTime",
              "UrlsCrawledCount",
              "UrlsTestedCount",
              "HasVulnerabilities",
              "ProgressPercent",
              "ErrorTrace",
              "WarningTraces",
            });
    com.google.cloud.websecurityscanner.v1.ScanRunErrorTraceProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1.ScanRunWarningTraceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
