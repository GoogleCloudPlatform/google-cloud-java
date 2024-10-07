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
// source: google/cloud/talent/v4/company.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.talent.v4;

public final class CompanyProto {
  private CompanyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_Company_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_Company_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_Company_DerivedInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_Company_DerivedInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/talent/v4/company.proto\022\026"
          + "google.cloud.talent.v4\032\037google/api/field"
          + "_behavior.proto\032\031google/api/resource.pro"
          + "to\032#google/cloud/talent/v4/common.proto\""
          + "\310\004\n\007Company\022\014\n\004name\030\001 \001(\t\022\031\n\014display_nam"
          + "e\030\002 \001(\tB\003\340A\002\022\030\n\013external_id\030\003 \001(\tB\003\340A\002\0221"
          + "\n\004size\030\004 \001(\0162#.google.cloud.talent.v4.Co"
          + "mpanySize\022\034\n\024headquarters_address\030\005 \001(\t\022"
          + "\025\n\rhiring_agency\030\006 \001(\010\022\020\n\010eeo_text\030\007 \001(\t"
          + "\022\023\n\013website_uri\030\010 \001(\t\022\027\n\017career_site_uri"
          + "\030\t \001(\t\022\021\n\timage_uri\030\n \001(\t\0224\n(keyword_sea"
          + "rchable_job_custom_attributes\030\013 \003(\tB\002\030\001\022"
          + "F\n\014derived_info\030\014 \001(\0132+.google.cloud.tal"
          + "ent.v4.Company.DerivedInfoB\003\340A\003\022\026\n\tsuspe"
          + "nded\030\r \001(\010B\003\340A\003\032N\n\013DerivedInfo\022?\n\025headqu"
          + "arters_location\030\001 \001(\0132 .google.cloud.tal"
          + "ent.v4.Location:Y\352AV\n\033jobs.googleapis.co"
          + "m/Company\0227projects/{project}/tenants/{t"
          + "enant}/companies/{company}Bf\n\032com.google"
          + ".cloud.talent.v4B\014CompanyProtoP\001Z2cloud."
          + "google.com/go/talent/apiv4/talentpb;tale"
          + "ntpb\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4.CommonProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4_Company_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_Company_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_Company_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "ExternalId",
              "Size",
              "HeadquartersAddress",
              "HiringAgency",
              "EeoText",
              "WebsiteUri",
              "CareerSiteUri",
              "ImageUri",
              "KeywordSearchableJobCustomAttributes",
              "DerivedInfo",
              "Suspended",
            });
    internal_static_google_cloud_talent_v4_Company_DerivedInfo_descriptor =
        internal_static_google_cloud_talent_v4_Company_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4_Company_DerivedInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_Company_DerivedInfo_descriptor,
            new java.lang.String[] {
              "HeadquartersLocation",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
