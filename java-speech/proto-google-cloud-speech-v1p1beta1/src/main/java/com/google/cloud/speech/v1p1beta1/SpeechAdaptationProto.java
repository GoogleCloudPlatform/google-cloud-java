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
// source: google/cloud/speech/v1p1beta1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1p1beta1;

public final class SpeechAdaptationProto {
  private SpeechAdaptationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_GetPhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_GetPhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_DeletePhraseSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_DeletePhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_GetCustomClassRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_GetCustomClassRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1p1beta1_DeleteCustomClassRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_DeleteCustomClassRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/speech/v1p1beta1/cloud_sp"
          + "eech_adaptation.proto\022\035google.cloud.spee"
          + "ch.v1p1beta1\032\034google/api/annotations.pro"
          + "to\032\027google/api/client.proto\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032,google/cloud/speech/v1p1beta1/r"
          + "esource.proto\032\033google/protobuf/empty.pro"
          + "to\032 google/protobuf/field_mask.proto\"\263\001\n"
          + "\026CreatePhraseSetRequest\0228\n\006parent\030\001 \001(\tB"
          + "(\342A\001\002\372A!\022\037speech.googleapis.com/PhraseSe"
          + "t\022\033\n\rphrase_set_id\030\002 \001(\tB\004\342A\001\002\022B\n\nphrase"
          + "_set\030\003 \001(\0132(.google.cloud.speech.v1p1bet"
          + "a1.PhraseSetB\004\342A\001\002\"\215\001\n\026UpdatePhraseSetRe"
          + "quest\022B\n\nphrase_set\030\001 \001(\0132(.google.cloud"
          + ".speech.v1p1beta1.PhraseSetB\004\342A\001\002\022/\n\013upd"
          + "ate_mask\030\002 \001(\0132\032.google.protobuf.FieldMa"
          + "sk\"M\n\023GetPhraseSetRequest\0226\n\004name\030\001 \001(\tB"
          + "(\342A\001\002\372A!\n\037speech.googleapis.com/PhraseSe"
          + "t\"w\n\024ListPhraseSetRequest\0228\n\006parent\030\001 \001("
          + "\tB(\342A\001\002\372A!\022\037speech.googleapis.com/Phrase"
          + "Set\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001"
          + "(\t\"o\n\025ListPhraseSetResponse\022=\n\013phrase_se"
          + "ts\030\001 \003(\0132(.google.cloud.speech.v1p1beta1"
          + ".PhraseSet\022\027\n\017next_page_token\030\002 \001(\t\"P\n\026D"
          + "eletePhraseSetRequest\0226\n\004name\030\001 \001(\tB(\342A\001"
          + "\002\372A!\n\037speech.googleapis.com/PhraseSet\"\275\001"
          + "\n\030CreateCustomClassRequest\022:\n\006parent\030\001 \001"
          + "(\tB*\342A\001\002\372A#\022!speech.googleapis.com/Custo"
          + "mClass\022\035\n\017custom_class_id\030\002 \001(\tB\004\342A\001\002\022F\n"
          + "\014custom_class\030\003 \001(\0132*.google.cloud.speec"
          + "h.v1p1beta1.CustomClassB\004\342A\001\002\"\223\001\n\030Update"
          + "CustomClassRequest\022F\n\014custom_class\030\001 \001(\013"
          + "2*.google.cloud.speech.v1p1beta1.CustomC"
          + "lassB\004\342A\001\002\022/\n\013update_mask\030\002 \001(\0132\032.google"
          + ".protobuf.FieldMask\"Q\n\025GetCustomClassReq"
          + "uest\0228\n\004name\030\001 \001(\tB*\342A\001\002\372A#\n!speech.goog"
          + "leapis.com/CustomClass\"}\n\030ListCustomClas"
          + "sesRequest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\022!spe"
          + "ech.googleapis.com/CustomClass\022\021\n\tpage_s"
          + "ize\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"x\n\031ListCus"
          + "tomClassesResponse\022B\n\016custom_classes\030\001 \003"
          + "(\0132*.google.cloud.speech.v1p1beta1.Custo"
          + "mClass\022\027\n\017next_page_token\030\002 \001(\t\"T\n\030Delet"
          + "eCustomClassRequest\0228\n\004name\030\001 \001(\tB*\342A\001\002\372"
          + "A#\n!speech.googleapis.com/CustomClass2\322\020"
          + "\n\nAdaptation\022\326\001\n\017CreatePhraseSet\0225.googl"
          + "e.cloud.speech.v1p1beta1.CreatePhraseSet"
          + "Request\032(.google.cloud.speech.v1p1beta1."
          + "PhraseSet\"b\332A\037parent,phrase_set,phrase_s"
          + "et_id\202\323\344\223\002:\"5/v1p1beta1/{parent=projects"
          + "/*/locations/*}/phraseSets:\001*\022\262\001\n\014GetPhr"
          + "aseSet\0222.google.cloud.speech.v1p1beta1.G"
          + "etPhraseSetRequest\032(.google.cloud.speech"
          + ".v1p1beta1.PhraseSet\"D\332A\004name\202\323\344\223\0027\0225/v1"
          + "p1beta1/{name=projects/*/locations/*/phr"
          + "aseSets/*}\022\302\001\n\rListPhraseSet\0223.google.cl"
          + "oud.speech.v1p1beta1.ListPhraseSetReques"
          + "t\0324.google.cloud.speech.v1p1beta1.ListPh"
          + "raseSetResponse\"F\332A\006parent\202\323\344\223\0027\0225/v1p1b"
          + "eta1/{parent=projects/*/locations/*}/phr"
          + "aseSets\022\341\001\n\017UpdatePhraseSet\0225.google.clo"
          + "ud.speech.v1p1beta1.UpdatePhraseSetReque"
          + "st\032(.google.cloud.speech.v1p1beta1.Phras"
          + "eSet\"m\332A\026phrase_set,update_mask\202\323\344\223\002N2@/"
          + "v1p1beta1/{phrase_set.name=projects/*/lo"
          + "cations/*/phraseSets/*}:\nphrase_set\022\246\001\n\017"
          + "DeletePhraseSet\0225.google.cloud.speech.v1"
          + "p1beta1.DeletePhraseSetRequest\032\026.google."
          + "protobuf.Empty\"D\332A\004name\202\323\344\223\0027*5/v1p1beta"
          + "1/{name=projects/*/locations/*/phraseSet"
          + "s/*}\022\343\001\n\021CreateCustomClass\0227.google.clou"
          + "d.speech.v1p1beta1.CreateCustomClassRequ"
          + "est\032*.google.cloud.speech.v1p1beta1.Cust"
          + "omClass\"i\332A#parent,custom_class,custom_c"
          + "lass_id\202\323\344\223\002=\"8/v1p1beta1/{parent=projec"
          + "ts/*/locations/*}/customClasses:\001*\022\273\001\n\016G"
          + "etCustomClass\0224.google.cloud.speech.v1p1"
          + "beta1.GetCustomClassRequest\032*.google.clo"
          + "ud.speech.v1p1beta1.CustomClass\"G\332A\004name"
          + "\202\323\344\223\002:\0228/v1p1beta1/{name=projects/*/loca"
          + "tions/*/customClasses/*}\022\321\001\n\021ListCustomC"
          + "lasses\0227.google.cloud.speech.v1p1beta1.L"
          + "istCustomClassesRequest\0328.google.cloud.s"
          + "peech.v1p1beta1.ListCustomClassesRespons"
          + "e\"I\332A\006parent\202\323\344\223\002:\0228/v1p1beta1/{parent=p"
          + "rojects/*/locations/*}/customClasses\022\360\001\n"
          + "\021UpdateCustomClass\0227.google.cloud.speech"
          + ".v1p1beta1.UpdateCustomClassRequest\032*.go"
          + "ogle.cloud.speech.v1p1beta1.CustomClass\""
          + "v\332A\030custom_class,update_mask\202\323\344\223\002U2E/v1p"
          + "1beta1/{custom_class.name=projects/*/loc"
          + "ations/*/customClasses/*}:\014custom_class\022"
          + "\255\001\n\021DeleteCustomClass\0227.google.cloud.spe"
          + "ech.v1p1beta1.DeleteCustomClassRequest\032\026"
          + ".google.protobuf.Empty\"G\332A\004name\202\323\344\223\002:*8/"
          + "v1p1beta1/{name=projects/*/locations/*/c"
          + "ustomClasses/*}\032I\312A\025speech.googleapis.co"
          + "m\322A.https://www.googleapis.com/auth/clou"
          + "d-platformB\200\001\n!com.google.cloud.speech.v"
          + "1p1beta1B\025SpeechAdaptationProtoP\001Z9cloud"
          + ".google.com/go/speech/apiv1p1beta1/speec"
          + "hpb;speechpb\370\001\001\242\002\003GCSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.speech.v1p1beta1.SpeechResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PhraseSetId", "PhraseSet",
            });
    internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_descriptor,
            new java.lang.String[] {
              "PhraseSet", "UpdateMask",
            });
    internal_static_google_cloud_speech_v1p1beta1_GetPhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v1p1beta1_GetPhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_GetPhraseSetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_descriptor,
            new java.lang.String[] {
              "PhraseSets", "NextPageToken",
            });
    internal_static_google_cloud_speech_v1p1beta1_DeletePhraseSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_speech_v1p1beta1_DeletePhraseSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_DeletePhraseSetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor,
            new java.lang.String[] {
              "Parent", "CustomClassId", "CustomClass",
            });
    internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor,
            new java.lang.String[] {
              "CustomClass", "UpdateMask",
            });
    internal_static_google_cloud_speech_v1p1beta1_GetCustomClassRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_speech_v1p1beta1_GetCustomClassRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_GetCustomClassRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_descriptor,
            new java.lang.String[] {
              "CustomClasses", "NextPageToken",
            });
    internal_static_google_cloud_speech_v1p1beta1_DeleteCustomClassRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_speech_v1p1beta1_DeleteCustomClassRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1p1beta1_DeleteCustomClassRequest_descriptor,
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
    com.google.cloud.speech.v1p1beta1.SpeechResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
