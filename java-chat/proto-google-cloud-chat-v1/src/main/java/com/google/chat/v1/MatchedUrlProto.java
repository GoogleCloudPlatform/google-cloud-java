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
// source: google/chat/v1/matched_url.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

public final class MatchedUrlProto {
  private MatchedUrlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_MatchedUrl_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_MatchedUrl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/chat/v1/matched_url.proto\022\016goog"
          + "le.chat.v1\032\037google/api/field_behavior.pr"
          + "oto\"\036\n\nMatchedUrl\022\020\n\003url\030\002 \001(\tB\003\340A\003B\250\001\n\022"
          + "com.google.chat.v1B\017MatchedUrlProtoP\001Z,c"
          + "loud.google.com/go/chat/apiv1/chatpb;cha"
          + "tpb\242\002\013DYNAPIProto\252\002\023Google.Apps.Chat.V1\312"
          + "\002\023Google\\Apps\\Chat\\V1\352\002\026Google::Apps::Ch"
          + "at::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_chat_v1_MatchedUrl_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_chat_v1_MatchedUrl_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_MatchedUrl_descriptor,
            new java.lang.String[] {
              "Url",
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
