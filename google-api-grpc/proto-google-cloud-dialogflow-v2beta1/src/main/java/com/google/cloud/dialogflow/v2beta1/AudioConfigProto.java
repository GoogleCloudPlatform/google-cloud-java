// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/dialogflow/v2beta1/audio_"
          + "config.proto\022\037google.cloud.dialogflow.v2"
          + "beta1\032\034google/api/annotations.proto\"\375\001\n\020"
          + "InputAudioConfig\022F\n\016audio_encoding\030\001 \001(\016"
          + "2..google.cloud.dialogflow.v2beta1.Audio"
          + "Encoding\022\031\n\021sample_rate_hertz\030\002 \001(\005\022\025\n\rl"
          + "anguage_code\030\003 \001(\t\022\024\n\014phrase_hints\030\004 \003(\t"
          + "\022\r\n\005model\030\007 \001(\t\022J\n\rmodel_variant\030\n \001(\01623"
          + ".google.cloud.dialogflow.v2beta1.SpeechM"
          + "odelVariant\"k\n\024VoiceSelectionParams\022\014\n\004n"
          + "ame\030\001 \001(\t\022E\n\013ssml_gender\030\002 \001(\01620.google."
          + "cloud.dialogflow.v2beta1.SsmlVoiceGender"
          + "\"\270\001\n\026SynthesizeSpeechConfig\022\025\n\rspeaking_"
          + "rate\030\001 \001(\001\022\r\n\005pitch\030\002 \001(\001\022\026\n\016volume_gain"
          + "_db\030\003 \001(\001\022\032\n\022effects_profile_id\030\005 \003(\t\022D\n"
          + "\005voice\030\004 \001(\01325.google.cloud.dialogflow.v"
          + "2beta1.VoiceSelectionParams\"\327\001\n\021OutputAu"
          + "dioConfig\022L\n\016audio_encoding\030\001 \001(\01624.goog"
          + "le.cloud.dialogflow.v2beta1.OutputAudioE"
          + "ncoding\022\031\n\021sample_rate_hertz\030\002 \001(\005\022Y\n\030sy"
          + "nthesize_speech_config\030\003 \001(\01327.google.cl"
          + "oud.dialogflow.v2beta1.SynthesizeSpeechC"
          + "onfig*\373\001\n\rAudioEncoding\022\036\n\032AUDIO_ENCODIN"
          + "G_UNSPECIFIED\020\000\022\034\n\030AUDIO_ENCODING_LINEAR"
          + "_16\020\001\022\027\n\023AUDIO_ENCODING_FLAC\020\002\022\030\n\024AUDIO_"
          + "ENCODING_MULAW\020\003\022\026\n\022AUDIO_ENCODING_AMR\020\004"
          + "\022\031\n\025AUDIO_ENCODING_AMR_WB\020\005\022\033\n\027AUDIO_ENC"
          + "ODING_OGG_OPUS\020\006\022)\n%AUDIO_ENCODING_SPEEX"
          + "_WITH_HEADER_BYTE\020\007*v\n\022SpeechModelVarian"
          + "t\022$\n SPEECH_MODEL_VARIANT_UNSPECIFIED\020\000\022"
          + "\026\n\022USE_BEST_AVAILABLE\020\001\022\020\n\014USE_STANDARD\020"
          + "\002\022\020\n\014USE_ENHANCED\020\003*\215\001\n\017SsmlVoiceGender\022"
          + "!\n\035SSML_VOICE_GENDER_UNSPECIFIED\020\000\022\032\n\026SS"
          + "ML_VOICE_GENDER_MALE\020\001\022\034\n\030SSML_VOICE_GEN"
          + "DER_FEMALE\020\002\022\035\n\031SSML_VOICE_GENDER_NEUTRA"
          + "L\020\003*\244\001\n\023OutputAudioEncoding\022%\n!OUTPUT_AU"
          + "DIO_ENCODING_UNSPECIFIED\020\000\022#\n\037OUTPUT_AUD"
          + "IO_ENCODING_LINEAR_16\020\001\022\035\n\031OUTPUT_AUDIO_"
          + "ENCODING_MP3\020\002\022\"\n\036OUTPUT_AUDIO_ENCODING_"
          + "OGG_OPUS\020\003B\256\001\n#com.google.cloud.dialogfl"
          + "ow.v2beta1B\020AudioConfigProtoP\001ZIgoogle.g"
          + "olang.org/genproto/googleapis/cloud/dial"
          + "ogflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Goog"
          + "le.Cloud.Dialogflow.V2beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "LanguageCode",
              "PhraseHints",
              "Model",
              "ModelVariant",
            });
    internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
