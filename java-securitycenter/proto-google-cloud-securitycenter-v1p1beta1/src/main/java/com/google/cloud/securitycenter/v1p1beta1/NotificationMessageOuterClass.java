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
// source: google/cloud/securitycenter/v1p1beta1/notification_message.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1p1beta1;

public final class NotificationMessageOuterClass {
  private NotificationMessageOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/securitycenter/v1p1beta1/"
          + "notification_message.proto\022%google.cloud"
          + ".securitycenter.v1p1beta1\0323google/cloud/"
          + "securitycenter/v1p1beta1/finding.proto\0324"
          + "google/cloud/securitycenter/v1p1beta1/re"
          + "source.proto\"\306\001\n\023NotificationMessage\022 \n\030"
          + "notification_config_name\030\001 \001(\t\022A\n\007findin"
          + "g\030\002 \001(\0132..google.cloud.securitycenter.v1"
          + "p1beta1.FindingH\000\022A\n\010resource\030\003 \001(\0132/.go"
          + "ogle.cloud.securitycenter.v1p1beta1.Reso"
          + "urceB\007\n\005eventB\373\001\n)com.google.cloud.secur"
          + "itycenter.v1p1beta1P\001ZQcloud.google.com/"
          + "go/securitycenter/apiv1p1beta1/securityc"
          + "enterpb;securitycenterpb\252\002%Google.Cloud."
          + "SecurityCenter.V1P1Beta1\312\002%Google\\Cloud\\"
          + "SecurityCenter\\V1p1beta1\352\002(Google::Cloud"
          + "::SecurityCenter::V1p1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.securitycenter.v1p1beta1.FindingOuterClass.getDescriptor(),
              com.google.cloud.securitycenter.v1p1beta1.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_NotificationMessage_descriptor,
            new java.lang.String[] {
              "NotificationConfigName", "Finding", "Resource", "Event",
            });
    com.google.cloud.securitycenter.v1p1beta1.FindingOuterClass.getDescriptor();
    com.google.cloud.securitycenter.v1p1beta1.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
