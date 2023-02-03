/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/texttospeech/v1/cloud_tts.proto

package com.google.cloud.texttospeech.v1;

public final class TextToSpeechProto {
  private TextToSpeechProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_Voice_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_Voice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_SynthesisInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_SynthesisInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_AudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_AudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_CustomVoiceParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_CustomVoiceParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/texttospeech/v1/cloud_tts"
          + ".proto\022\034google.cloud.texttospeech.v1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\"/\n\021ListV"
          + "oicesRequest\022\032\n\rlanguage_code\030\001 \001(\tB\003\340A\001"
          + "\"I\n\022ListVoicesResponse\0223\n\006voices\030\001 \003(\0132#"
          + ".google.cloud.texttospeech.v1.Voice\"\224\001\n\005"
          + "Voice\022\026\n\016language_codes\030\001 \003(\t\022\014\n\004name\030\002 "
          + "\001(\t\022B\n\013ssml_gender\030\003 \001(\0162-.google.cloud."
          + "texttospeech.v1.SsmlVoiceGender\022!\n\031natur"
          + "al_sample_rate_hertz\030\004 \001(\005\"\351\001\n\027Synthesiz"
          + "eSpeechRequest\022@\n\005input\030\001 \001(\0132,.google.c"
          + "loud.texttospeech.v1.SynthesisInputB\003\340A\002"
          + "\022F\n\005voice\030\002 \001(\01322.google.cloud.texttospe"
          + "ech.v1.VoiceSelectionParamsB\003\340A\002\022D\n\014audi"
          + "o_config\030\003 \001(\0132).google.cloud.texttospee"
          + "ch.v1.AudioConfigB\003\340A\002\"@\n\016SynthesisInput"
          + "\022\016\n\004text\030\001 \001(\tH\000\022\016\n\004ssml\030\002 \001(\tH\000B\016\n\014inpu"
          + "t_source\"\313\001\n\024VoiceSelectionParams\022\032\n\rlan"
          + "guage_code\030\001 \001(\tB\003\340A\002\022\014\n\004name\030\002 \001(\t\022B\n\013s"
          + "sml_gender\030\003 \001(\0162-.google.cloud.texttosp"
          + "eech.v1.SsmlVoiceGender\022E\n\014custom_voice\030"
          + "\004 \001(\0132/.google.cloud.texttospeech.v1.Cus"
          + "tomVoiceParams\"\361\001\n\013AudioConfig\022H\n\016audio_"
          + "encoding\030\001 \001(\0162+.google.cloud.texttospee"
          + "ch.v1.AudioEncodingB\003\340A\002\022\035\n\rspeaking_rat"
          + "e\030\002 \001(\001B\006\340A\004\340A\001\022\025\n\005pitch\030\003 \001(\001B\006\340A\004\340A\001\022\036"
          + "\n\016volume_gain_db\030\004 \001(\001B\006\340A\004\340A\001\022\036\n\021sample"
          + "_rate_hertz\030\005 \001(\005B\003\340A\001\022\"\n\022effects_profil"
          + "e_id\030\006 \003(\tB\006\340A\004\340A\001\"\357\001\n\021CustomVoiceParams"
          + "\0222\n\005model\030\001 \001(\tB#\340A\002\372A\035\n\033automl.googleap"
          + "is.com/Model\022Z\n\016reported_usage\030\003 \001(\0162=.g"
          + "oogle.cloud.texttospeech.v1.CustomVoiceP"
          + "arams.ReportedUsageB\003\340A\001\"J\n\rReportedUsag"
          + "e\022\036\n\032REPORTED_USAGE_UNSPECIFIED\020\000\022\014\n\010REA"
          + "LTIME\020\001\022\013\n\007OFFLINE\020\002\"1\n\030SynthesizeSpeech"
          + "Response\022\025\n\raudio_content\030\001 \001(\014*W\n\017SsmlV"
          + "oiceGender\022!\n\035SSML_VOICE_GENDER_UNSPECIF"
          + "IED\020\000\022\010\n\004MALE\020\001\022\n\n\006FEMALE\020\002\022\013\n\007NEUTRAL\020\003"
          + "*i\n\rAudioEncoding\022\036\n\032AUDIO_ENCODING_UNSP"
          + "ECIFIED\020\000\022\014\n\010LINEAR16\020\001\022\007\n\003MP3\020\002\022\014\n\010OGG_"
          + "OPUS\020\003\022\t\n\005MULAW\020\005\022\010\n\004ALAW\020\0062\264\003\n\014TextToSp"
          + "eech\022\223\001\n\nListVoices\022/.google.cloud.textt"
          + "ospeech.v1.ListVoicesRequest\0320.google.cl"
          + "oud.texttospeech.v1.ListVoicesResponse\"\""
          + "\202\323\344\223\002\014\022\n/v1/voices\332A\rlanguage_code\022\274\001\n\020S"
          + "ynthesizeSpeech\0225.google.cloud.texttospe"
          + "ech.v1.SynthesizeSpeechRequest\0326.google."
          + "cloud.texttospeech.v1.SynthesizeSpeechRe"
          + "sponse\"9\202\323\344\223\002\030\"\023/v1/text:synthesize:\001*\332A"
          + "\030input,voice,audio_config\032O\312A\033texttospee"
          + "ch.googleapis.com\322A.https://www.googleap"
          + "is.com/auth/cloud-platformB\270\002\n com.googl"
          + "e.cloud.texttospeech.v1B\021TextToSpeechPro"
          + "toP\001ZDcloud.google.com/go/texttospeech/a"
          + "piv1/texttospeechpb;texttospeechpb\370\001\001\252\002\034"
          + "Google.Cloud.TextToSpeech.V1\312\002\034Google\\Cl"
          + "oud\\TextToSpeech\\V1\352\002\037Google::Cloud::Tex"
          + "tToSpeech::V1\352AU\n\033automl.googleapis.com/"
          + "Model\0226projects/{project}/locations/{loc"
          + "ation}/models/{model}b\006proto3"
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
    internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_descriptor,
            new java.lang.String[] {
              "LanguageCode",
            });
    internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_descriptor,
            new java.lang.String[] {
              "Voices",
            });
    internal_static_google_cloud_texttospeech_v1_Voice_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_texttospeech_v1_Voice_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_Voice_descriptor,
            new java.lang.String[] {
              "LanguageCodes", "Name", "SsmlGender", "NaturalSampleRateHertz",
            });
    internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_descriptor,
            new java.lang.String[] {
              "Input", "Voice", "AudioConfig",
            });
    internal_static_google_cloud_texttospeech_v1_SynthesisInput_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_texttospeech_v1_SynthesisInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_SynthesisInput_descriptor,
            new java.lang.String[] {
              "Text", "Ssml", "InputSource",
            });
    internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "LanguageCode", "Name", "SsmlGender", "CustomVoice",
            });
    internal_static_google_cloud_texttospeech_v1_AudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_texttospeech_v1_AudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_AudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SpeakingRate",
              "Pitch",
              "VolumeGainDb",
              "SampleRateHertz",
              "EffectsProfileId",
            });
    internal_static_google_cloud_texttospeech_v1_CustomVoiceParams_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_texttospeech_v1_CustomVoiceParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_CustomVoiceParams_descriptor,
            new java.lang.String[] {
              "Model", "ReportedUsage",
            });
    internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_descriptor,
            new java.lang.String[] {
              "AudioContent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
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
