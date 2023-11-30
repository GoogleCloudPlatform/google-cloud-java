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
// source: google/cloud/speech/v1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1;

public final class SpeechAdaptationProto {
  private SpeechAdaptationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_GetPhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_GetPhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_ListPhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_ListPhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_ListPhraseSetResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_ListPhraseSetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_CreateCustomClassRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_CreateCustomClassRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_GetCustomClassRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_GetCustomClassRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_ListCustomClassesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_ListCustomClassesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_ListCustomClassesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_ListCustomClassesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/speech/v1/cloud_speech_ad"
          + "aptation.proto\022\026google.cloud.speech.v1\032\034"
          + "google/api/annotations.proto\032\027google/api"
          + "/client.proto\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032%googl"
          + "e/cloud/speech/v1/resource.proto\032\033google"
          + "/protobuf/empty.proto\032 google/protobuf/f"
          + "ield_mask.proto\"\254\001\n\026CreatePhraseSetReque"
          + "st\0228\n\006parent\030\001 \001(\tB(\342A\001\002\372A!\022\037speech.goog"
          + "leapis.com/PhraseSet\022\033\n\rphrase_set_id\030\002 "
          + "\001(\tB\004\342A\001\002\022;\n\nphrase_set\030\003 \001(\0132!.google.c"
          + "loud.speech.v1.PhraseSetB\004\342A\001\002\"\206\001\n\026Updat"
          + "ePhraseSetRequest\022;\n\nphrase_set\030\001 \001(\0132!."
          + "google.cloud.speech.v1.PhraseSetB\004\342A\001\002\022/"
          + "\n\013update_mask\030\002 \001(\0132\032.google.protobuf.Fi"
          + "eldMask\"M\n\023GetPhraseSetRequest\0226\n\004name\030\001"
          + " \001(\tB(\342A\001\002\372A!\n\037speech.googleapis.com/Phr"
          + "aseSet\"w\n\024ListPhraseSetRequest\0228\n\006parent"
          + "\030\001 \001(\tB(\342A\001\002\372A!\022\037speech.googleapis.com/P"
          + "hraseSet\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_toke"
          + "n\030\003 \001(\t\"h\n\025ListPhraseSetResponse\0226\n\013phra"
          + "se_sets\030\001 \003(\0132!.google.cloud.speech.v1.P"
          + "hraseSet\022\027\n\017next_page_token\030\002 \001(\t\"P\n\026Del"
          + "etePhraseSetRequest\0226\n\004name\030\001 \001(\tB(\342A\001\002\372"
          + "A!\n\037speech.googleapis.com/PhraseSet\"\266\001\n\030"
          + "CreateCustomClassRequest\022:\n\006parent\030\001 \001(\t"
          + "B*\342A\001\002\372A#\022!speech.googleapis.com/CustomC"
          + "lass\022\035\n\017custom_class_id\030\002 \001(\tB\004\342A\001\002\022?\n\014c"
          + "ustom_class\030\003 \001(\0132#.google.cloud.speech."
          + "v1.CustomClassB\004\342A\001\002\"\214\001\n\030UpdateCustomCla"
          + "ssRequest\022?\n\014custom_class\030\001 \001(\0132#.google"
          + ".cloud.speech.v1.CustomClassB\004\342A\001\002\022/\n\013up"
          + "date_mask\030\002 \001(\0132\032.google.protobuf.FieldM"
          + "ask\"Q\n\025GetCustomClassRequest\0228\n\004name\030\001 \001"
          + "(\tB*\342A\001\002\372A#\n!speech.googleapis.com/Custo"
          + "mClass\"}\n\030ListCustomClassesRequest\022:\n\006pa"
          + "rent\030\001 \001(\tB*\342A\001\002\372A#\022!speech.googleapis.c"
          + "om/CustomClass\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npag"
          + "e_token\030\003 \001(\t\"q\n\031ListCustomClassesRespon"
          + "se\022;\n\016custom_classes\030\001 \003(\0132#.google.clou"
          + "d.speech.v1.CustomClass\022\027\n\017next_page_tok"
          + "en\030\002 \001(\t\"T\n\030DeleteCustomClassRequest\0228\n\004"
          + "name\030\001 \001(\tB*\342A\001\002\372A#\n!speech.googleapis.c"
          + "om/CustomClass2\216\017\n\nAdaptation\022\301\001\n\017Create"
          + "PhraseSet\022..google.cloud.speech.v1.Creat"
          + "ePhraseSetRequest\032!.google.cloud.speech."
          + "v1.PhraseSet\"[\332A\037parent,phrase_set,phras"
          + "e_set_id\202\323\344\223\0023\"./v1/{parent=projects/*/l"
          + "ocations/*}/phraseSets:\001*\022\235\001\n\014GetPhraseS"
          + "et\022+.google.cloud.speech.v1.GetPhraseSet"
          + "Request\032!.google.cloud.speech.v1.PhraseS"
          + "et\"=\332A\004name\202\323\344\223\0020\022./v1/{name=projects/*/"
          + "locations/*/phraseSets/*}\022\255\001\n\rListPhrase"
          + "Set\022,.google.cloud.speech.v1.ListPhraseS"
          + "etRequest\032-.google.cloud.speech.v1.ListP"
          + "hraseSetResponse\"?\332A\006parent\202\323\344\223\0020\022./v1/{"
          + "parent=projects/*/locations/*}/phraseSet"
          + "s\022\314\001\n\017UpdatePhraseSet\022..google.cloud.spe"
          + "ech.v1.UpdatePhraseSetRequest\032!.google.c"
          + "loud.speech.v1.PhraseSet\"f\332A\026phrase_set,"
          + "update_mask\202\323\344\223\002G29/v1/{phrase_set.name="
          + "projects/*/locations/*/phraseSets/*}:\nph"
          + "rase_set\022\230\001\n\017DeletePhraseSet\022..google.cl"
          + "oud.speech.v1.DeletePhraseSetRequest\032\026.g"
          + "oogle.protobuf.Empty\"=\332A\004name\202\323\344\223\0020*./v1"
          + "/{name=projects/*/locations/*/phraseSets"
          + "/*}\022\316\001\n\021CreateCustomClass\0220.google.cloud"
          + ".speech.v1.CreateCustomClassRequest\032#.go"
          + "ogle.cloud.speech.v1.CustomClass\"b\332A#par"
          + "ent,custom_class,custom_class_id\202\323\344\223\0026\"1"
          + "/v1/{parent=projects/*/locations/*}/cust"
          + "omClasses:\001*\022\246\001\n\016GetCustomClass\022-.google"
          + ".cloud.speech.v1.GetCustomClassRequest\032#"
          + ".google.cloud.speech.v1.CustomClass\"@\332A\004"
          + "name\202\323\344\223\0023\0221/v1/{name=projects/*/locatio"
          + "ns/*/customClasses/*}\022\274\001\n\021ListCustomClas"
          + "ses\0220.google.cloud.speech.v1.ListCustomC"
          + "lassesRequest\0321.google.cloud.speech.v1.L"
          + "istCustomClassesResponse\"B\332A\006parent\202\323\344\223\002"
          + "3\0221/v1/{parent=projects/*/locations/*}/c"
          + "ustomClasses\022\333\001\n\021UpdateCustomClass\0220.goo"
          + "gle.cloud.speech.v1.UpdateCustomClassReq"
          + "uest\032#.google.cloud.speech.v1.CustomClas"
          + "s\"o\332A\030custom_class,update_mask\202\323\344\223\002N2>/v"
          + "1/{custom_class.name=projects/*/location"
          + "s/*/customClasses/*}:\014custom_class\022\237\001\n\021D"
          + "eleteCustomClass\0220.google.cloud.speech.v"
          + "1.DeleteCustomClassRequest\032\026.google.prot"
          + "obuf.Empty\"@\332A\004name\202\323\344\223\0023*1/v1/{name=pro"
          + "jects/*/locations/*/customClasses/*}\032I\312A"
          + "\025speech.googleapis.com\322A.https://www.goo"
          + "gleapis.com/auth/cloud-platformBr\n\032com.g"
          + "oogle.cloud.speech.v1B\025SpeechAdaptationP"
          + "rotoP\001Z2cloud.google.com/go/speech/apiv1"
          + "/speechpb;speechpb\370\001\001\242\002\003GCSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.speech.v1.SpeechResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PhraseSetId", "PhraseSet",
            });
    internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_descriptor,
            new java.lang.String[] {
              "PhraseSet", "UpdateMask",
            });
    internal_static_google_cloud_speech_v1_GetPhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v1_GetPhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_GetPhraseSetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_speech_v1_ListPhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_speech_v1_ListPhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_ListPhraseSetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_speech_v1_ListPhraseSetResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_speech_v1_ListPhraseSetResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_ListPhraseSetResponse_descriptor,
            new java.lang.String[] {
              "PhraseSets", "NextPageToken",
            });
    internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_speech_v1_CreateCustomClassRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_speech_v1_CreateCustomClassRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_CreateCustomClassRequest_descriptor,
            new java.lang.String[] {
              "Parent", "CustomClassId", "CustomClass",
            });
    internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_descriptor,
            new java.lang.String[] {
              "CustomClass", "UpdateMask",
            });
    internal_static_google_cloud_speech_v1_GetCustomClassRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_speech_v1_GetCustomClassRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_GetCustomClassRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_speech_v1_ListCustomClassesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_speech_v1_ListCustomClassesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_ListCustomClassesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_speech_v1_ListCustomClassesResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_speech_v1_ListCustomClassesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_ListCustomClassesResponse_descriptor,
            new java.lang.String[] {
              "CustomClasses", "NextPageToken",
            });
    internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.speech.v1.SpeechResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
