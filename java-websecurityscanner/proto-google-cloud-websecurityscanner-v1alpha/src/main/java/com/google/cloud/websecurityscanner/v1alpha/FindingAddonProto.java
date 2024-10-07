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
// source: google/cloud/websecurityscanner/v1alpha/finding_addon.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.websecurityscanner.v1alpha;

public final class FindingAddonProto {
  private FindingAddonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_ViolatingResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ViolatingResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_Header_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_Xss_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_Xss_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/websecurityscanner/v1alph"
          + "a/finding_addon.proto\022\'google.cloud.webs"
          + "ecurityscanner.v1alpha\"Q\n\017OutdatedLibrar"
          + "y\022\024\n\014library_name\030\001 \001(\t\022\017\n\007version\030\002 \001(\t"
          + "\022\027\n\017learn_more_urls\030\003 \003(\t\"?\n\021ViolatingRe"
          + "source\022\024\n\014content_type\030\001 \001(\t\022\024\n\014resource"
          + "_url\030\002 \001(\t\"/\n\024VulnerableParameters\022\027\n\017pa"
          + "rameter_names\030\001 \003(\t\"\352\001\n\021VulnerableHeader"
          + "s\022R\n\007headers\030\001 \003(\0132A.google.cloud.websec"
          + "urityscanner.v1alpha.VulnerableHeaders.H"
          + "eader\022Z\n\017missing_headers\030\002 \003(\0132A.google."
          + "cloud.websecurityscanner.v1alpha.Vulnera"
          + "bleHeaders.Header\032%\n\006Header\022\014\n\004name\030\001 \001("
          + "\t\022\r\n\005value\030\002 \001(\t\"2\n\003Xss\022\024\n\014stack_traces\030"
          + "\001 \003(\t\022\025\n\rerror_message\030\002 \001(\tB\237\001\n+com.goo"
          + "gle.cloud.websecurityscanner.v1alphaB\021Fi"
          + "ndingAddonProtoP\001Z[cloud.google.com/go/w"
          + "ebsecurityscanner/apiv1alpha/websecurity"
          + "scannerpb;websecurityscannerpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_OutdatedLibrary_descriptor,
            new java.lang.String[] {
              "LibraryName", "Version", "LearnMoreUrls",
            });
    internal_static_google_cloud_websecurityscanner_v1alpha_ViolatingResource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_websecurityscanner_v1alpha_ViolatingResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_ViolatingResource_descriptor,
            new java.lang.String[] {
              "ContentType", "ResourceUrl",
            });
    internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableParameters_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableParameters_descriptor,
            new java.lang.String[] {
              "ParameterNames",
            });
    internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_descriptor,
            new java.lang.String[] {
              "Headers", "MissingHeaders",
            });
    internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_Header_descriptor =
        internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_Header_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_VulnerableHeaders_Header_descriptor,
            new java.lang.String[] {
              "Name", "Value",
            });
    internal_static_google_cloud_websecurityscanner_v1alpha_Xss_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_websecurityscanner_v1alpha_Xss_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_Xss_descriptor,
            new java.lang.String[] {
              "StackTraces", "ErrorMessage",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
