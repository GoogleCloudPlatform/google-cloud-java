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
// source: google/cloud/resourcesettings/v1/resource_settings.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.resourcesettings.v1;

public final class ResourceSettingsProto {
  private ResourceSettingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcesettings_v1_Setting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcesettings_v1_Setting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcesettings_v1_SettingMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcesettings_v1_SettingMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcesettings_v1_Value_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcesettings_v1_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcesettings_v1_Value_StringSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcesettings_v1_Value_StringSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcesettings_v1_Value_EnumValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcesettings_v1_Value_EnumValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcesettings_v1_ListSettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcesettings_v1_ListSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcesettings_v1_GetSettingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcesettings_v1_GetSettingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/resourcesettings/v1/resou"
          + "rce_settings.proto\022 google.cloud.resourc"
          + "esettings.v1\032\034google/api/annotations.pro"
          + "to\032\027google/api/client.proto\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\"\267\003\n\007Setting\022\014\n\004name\030\001 \001(\t\022H\n\010met"
          + "adata\030\007 \001(\01321.google.cloud.resourcesetti"
          + "ngs.v1.SettingMetadataB\003\340A\003\022<\n\013local_val"
          + "ue\030\010 \001(\0132\'.google.cloud.resourcesettings"
          + ".v1.Value\022E\n\017effective_value\030\t \001(\0132\'.goo"
          + "gle.cloud.resourcesettings.v1.ValueB\003\340A\003"
          + "\022\014\n\004etag\030\n \001(\t:\300\001\352A\274\001\n\'resourcesettings."
          + "googleapis.com/Setting\0221projects/{projec"
          + "t_number}/settings/{setting_name}\022(folde"
          + "rs/{folder}/settings/{setting_name}\0224org"
          + "anizations/{organization}/settings/{sett"
          + "ing_name}\"\276\002\n\017SettingMetadata\022\024\n\014display"
          + "_name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022\021\n\tread"
          + "_only\030\003 \001(\010\022M\n\tdata_type\030\004 \001(\0162:.google."
          + "cloud.resourcesettings.v1.SettingMetadat"
          + "a.DataType\022>\n\rdefault_value\030\005 \001(\0132\'.goog"
          + "le.cloud.resourcesettings.v1.Value\"^\n\010Da"
          + "taType\022\031\n\025DATA_TYPE_UNSPECIFIED\020\000\022\013\n\007BOO"
          + "LEAN\020\001\022\n\n\006STRING\020\002\022\016\n\nSTRING_SET\020\003\022\016\n\nEN"
          + "UM_VALUE\020\004\"\222\002\n\005Value\022\027\n\rboolean_value\030\001 "
          + "\001(\010H\000\022\026\n\014string_value\030\002 \001(\tH\000\022M\n\020string_"
          + "set_value\030\003 \001(\01321.google.cloud.resources"
          + "ettings.v1.Value.StringSetH\000\022G\n\nenum_val"
          + "ue\030\004 \001(\01321.google.cloud.resourcesettings"
          + ".v1.Value.EnumValueH\000\032\033\n\tStringSet\022\016\n\006va"
          + "lues\030\001 \003(\t\032\032\n\tEnumValue\022\r\n\005value\030\001 \001(\tB\007"
          + "\n\005value\"\224\001\n\023ListSettingsRequest\022\031\n\006paren"
          + "t\030\001 \001(\tB\t\340A\002\372A\003\n\001*\022\021\n\tpage_size\030\002 \001(\005\022\022\n"
          + "\npage_token\030\003 \001(\t\022;\n\004view\030\004 \001(\0162-.google"
          + ".cloud.resourcesettings.v1.SettingView\"l"
          + "\n\024ListSettingsResponse\022;\n\010settings\030\001 \003(\013"
          + "2).google.cloud.resourcesettings.v1.Sett"
          + "ing\022\027\n\017next_page_token\030\002 \001(\t\"\217\001\n\021GetSett"
          + "ingRequest\022=\n\004name\030\001 \001(\tB/\340A\002\372A)\n\'resour"
          + "cesettings.googleapis.com/Setting\022;\n\004vie"
          + "w\030\002 \001(\0162-.google.cloud.resourcesettings."
          + "v1.SettingView\"W\n\024UpdateSettingRequest\022?"
          + "\n\007setting\030\001 \001(\0132).google.cloud.resources"
          + "ettings.v1.SettingB\003\340A\002*\203\001\n\013SettingView\022"
          + "\034\n\030SETTING_VIEW_UNSPECIFIED\020\000\022\026\n\022SETTING"
          + "_VIEW_BASIC\020\001\022 \n\034SETTING_VIEW_EFFECTIVE_"
          + "VALUE\020\002\022\034\n\030SETTING_VIEW_LOCAL_VALUE\020\0032\374\006"
          + "\n\027ResourceSettingsService\022\374\001\n\014ListSettin"
          + "gs\0225.google.cloud.resourcesettings.v1.Li"
          + "stSettingsRequest\0326.google.cloud.resourc"
          + "esettings.v1.ListSettingsResponse\"}\332A\006pa"
          + "rent\202\323\344\223\002n\022%/v1/{parent=organizations/*}"
          + "/settingsZ!\022\037/v1/{parent=folders/*}/sett"
          + "ingsZ\"\022 /v1/{parent=projects/*}/settings"
          + "\022\351\001\n\nGetSetting\0223.google.cloud.resources"
          + "ettings.v1.GetSettingRequest\032).google.cl"
          + "oud.resourcesettings.v1.Setting\"{\332A\004name"
          + "\202\323\344\223\002n\022%/v1/{name=organizations/*/settin"
          + "gs/*}Z!\022\037/v1/{name=folders/*/settings/*}"
          + "Z\"\022 /v1/{name=projects/*/settings/*}\022\235\002\n"
          + "\rUpdateSetting\0226.google.cloud.resourcese"
          + "ttings.v1.UpdateSettingRequest\032).google."
          + "cloud.resourcesettings.v1.Setting\"\250\001\202\323\344\223"
          + "\002\241\0012-/v1/{setting.name=organizations/*/s"
          + "ettings/*}:\007settingZ22\'/v1/{setting.name"
          + "=folders/*/settings/*}:\007settingZ32(/v1/{"
          + "setting.name=projects/*/settings/*}:\007set"
          + "ting\032V\210\002\001\312A\037resourcesettings.googleapis."
          + "com\322A.https://www.googleapis.com/auth/cl"
          + "oud-platformB\200\002\n$com.google.cloud.resour"
          + "cesettings.v1B\025ResourceSettingsProtoP\001ZP"
          + "cloud.google.com/go/resourcesettings/api"
          + "v1/resourcesettingspb;resourcesettingspb"
          + "\370\001\001\252\002 Google.Cloud.ResourceSettings.V1\312\002"
          + " Google\\Cloud\\ResourceSettings\\V1\352\002#Goog"
          + "le::Cloud::ResourceSettings::V1b\006proto3"
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
    internal_static_google_cloud_resourcesettings_v1_Setting_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_resourcesettings_v1_Setting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcesettings_v1_Setting_descriptor,
            new java.lang.String[] {
              "Name", "Metadata", "LocalValue", "EffectiveValue", "Etag",
            });
    internal_static_google_cloud_resourcesettings_v1_SettingMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_resourcesettings_v1_SettingMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcesettings_v1_SettingMetadata_descriptor,
            new java.lang.String[] {
              "DisplayName", "Description", "ReadOnly", "DataType", "DefaultValue",
            });
    internal_static_google_cloud_resourcesettings_v1_Value_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_resourcesettings_v1_Value_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcesettings_v1_Value_descriptor,
            new java.lang.String[] {
              "BooleanValue", "StringValue", "StringSetValue", "EnumValue", "Value",
            });
    internal_static_google_cloud_resourcesettings_v1_Value_StringSet_descriptor =
        internal_static_google_cloud_resourcesettings_v1_Value_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_resourcesettings_v1_Value_StringSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcesettings_v1_Value_StringSet_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_resourcesettings_v1_Value_EnumValue_descriptor =
        internal_static_google_cloud_resourcesettings_v1_Value_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_resourcesettings_v1_Value_EnumValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcesettings_v1_Value_EnumValue_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_cloud_resourcesettings_v1_ListSettingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_resourcesettings_v1_ListSettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcesettings_v1_ListSettingsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "View",
            });
    internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_descriptor,
            new java.lang.String[] {
              "Settings", "NextPageToken",
            });
    internal_static_google_cloud_resourcesettings_v1_GetSettingRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_resourcesettings_v1_GetSettingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcesettings_v1_GetSettingRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_descriptor,
            new java.lang.String[] {
              "Setting",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
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
