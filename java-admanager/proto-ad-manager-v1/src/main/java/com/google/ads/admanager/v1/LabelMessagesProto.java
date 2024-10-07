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
// source: google/ads/admanager/v1/label_messages.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class LabelMessagesProto {
  private LabelMessagesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_Label_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_Label_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/admanager/v1/label_messages"
          + ".proto\022\027google.ads.admanager.v1\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\"v\n\005Label\022\021\n\004name\030\001 \001(\tB\003\340A\010:"
          + "Z\352AW\n\036admanager.googleapis.com/Label\022&ne"
          + "tworks/{network_code}/labels/{label}*\006la"
          + "bels2\005labelB\251\001\n\033com.google.ads.admanager"
          + ".v1B\022LabelMessagesProtoP\001Z@google.golang"
          + ".org/genproto/googleapis/ads/admanager/v"
          + "1;admanager\252\002\027Google.Ads.AdManager.V1\312\002\027"
          + "Google\\Ads\\AdManager\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_Label_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_Label_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_Label_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
