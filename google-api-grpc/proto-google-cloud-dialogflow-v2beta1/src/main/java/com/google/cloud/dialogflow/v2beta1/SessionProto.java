// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public final class SessionProto {
  private SessionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_QueryInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_QueryResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_TextInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TextInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EventInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EventInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Sentiment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Sentiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2beta1/sessio"
          + "n.proto\022\037google.cloud.dialogflow.v2beta1"
          + "\032\034google/api/annotations.proto\0322google/c"
          + "loud/dialogflow/v2beta1/audio_config.pro"
          + "to\032-google/cloud/dialogflow/v2beta1/cont"
          + "ext.proto\032,google/cloud/dialogflow/v2bet"
          + "a1/intent.proto\0329google/cloud/dialogflow"
          + "/v2beta1/session_entity_type.proto\032\034goog"
          + "le/protobuf/struct.proto\032\027google/rpc/sta"
          + "tus.proto\032\030google/type/latlng.proto\"\226\002\n\023"
          + "DetectIntentRequest\022\017\n\007session\030\001 \001(\t\022F\n\014"
          + "query_params\030\002 \001(\01320.google.cloud.dialog"
          + "flow.v2beta1.QueryParameters\022@\n\013query_in"
          + "put\030\003 \001(\0132+.google.cloud.dialogflow.v2be"
          + "ta1.QueryInput\022O\n\023output_audio_config\030\004 "
          + "\001(\01322.google.cloud.dialogflow.v2beta1.Ou"
          + "tputAudioConfig\022\023\n\013input_audio\030\005 \001(\014\"\323\002\n"
          + "\024DetectIntentResponse\022\023\n\013response_id\030\001 \001"
          + "(\t\022B\n\014query_result\030\002 \001(\0132,.google.cloud."
          + "dialogflow.v2beta1.QueryResult\022O\n\031altern"
          + "ative_query_results\030\005 \003(\0132,.google.cloud"
          + ".dialogflow.v2beta1.QueryResult\022*\n\016webho"
          + "ok_status\030\003 \001(\0132\022.google.rpc.Status\022\024\n\014o"
          + "utput_audio\030\004 \001(\014\022O\n\023output_audio_config"
          + "\030\006 \001(\01322.google.cloud.dialogflow.v2beta1"
          + ".OutputAudioConfig\"\251\003\n\017QueryParameters\022\021"
          + "\n\ttime_zone\030\001 \001(\t\022)\n\014geo_location\030\002 \001(\0132"
          + "\023.google.type.LatLng\022:\n\010contexts\030\003 \003(\0132("
          + ".google.cloud.dialogflow.v2beta1.Context"
          + "\022\026\n\016reset_contexts\030\004 \001(\010\022P\n\024session_enti"
          + "ty_types\030\005 \003(\01322.google.cloud.dialogflow"
          + ".v2beta1.SessionEntityType\022(\n\007payload\030\006 "
          + "\001(\0132\027.google.protobuf.Struct\022\034\n\024knowledg"
          + "e_base_names\030\014 \003(\t\022j\n!sentiment_analysis"
          + "_request_config\030\n \001(\0132?.google.cloud.dia"
          + "logflow.v2beta1.SentimentAnalysisRequest"
          + "Config\"\332\001\n\nQueryInput\022I\n\014audio_config\030\001 "
          + "\001(\01321.google.cloud.dialogflow.v2beta1.In"
          + "putAudioConfigH\000\022:\n\004text\030\002 \001(\0132*.google."
          + "cloud.dialogflow.v2beta1.TextInputH\000\022<\n\005"
          + "event\030\003 \001(\0132+.google.cloud.dialogflow.v2"
          + "beta1.EventInputH\000B\007\n\005input\"\362\005\n\013QueryRes"
          + "ult\022\022\n\nquery_text\030\001 \001(\t\022\025\n\rlanguage_code"
          + "\030\017 \001(\t\022%\n\035speech_recognition_confidence\030"
          + "\002 \001(\002\022\016\n\006action\030\003 \001(\t\022+\n\nparameters\030\004 \001("
          + "\0132\027.google.protobuf.Struct\022#\n\033all_requir"
          + "ed_params_present\030\005 \001(\010\022\030\n\020fulfillment_t"
          + "ext\030\006 \001(\t\022M\n\024fulfillment_messages\030\007 \003(\0132"
          + "/.google.cloud.dialogflow.v2beta1.Intent"
          + ".Message\022\026\n\016webhook_source\030\010 \001(\t\0220\n\017webh"
          + "ook_payload\030\t \001(\0132\027.google.protobuf.Stru"
          + "ct\022A\n\017output_contexts\030\n \003(\0132(.google.clo"
          + "ud.dialogflow.v2beta1.Context\0227\n\006intent\030"
          + "\013 \001(\0132\'.google.cloud.dialogflow.v2beta1."
          + "Intent\022#\n\033intent_detection_confidence\030\014 "
          + "\001(\002\0220\n\017diagnostic_info\030\016 \001(\0132\027.google.pr"
          + "otobuf.Struct\022[\n\031sentiment_analysis_resu"
          + "lt\030\021 \001(\01328.google.cloud.dialogflow.v2bet"
          + "a1.SentimentAnalysisResult\022L\n\021knowledge_"
          + "answers\030\022 \001(\01321.google.cloud.dialogflow."
          + "v2beta1.KnowledgeAnswers\"\206\003\n\020KnowledgeAn"
          + "swers\022I\n\007answers\030\001 \003(\01328.google.cloud.di"
          + "alogflow.v2beta1.KnowledgeAnswers.Answer"
          + "\032\246\002\n\006Answer\022\016\n\006source\030\001 \001(\t\022\024\n\014faq_quest"
          + "ion\030\002 \001(\t\022\016\n\006answer\030\003 \001(\t\022m\n\026match_confi"
          + "dence_level\030\004 \001(\0162M.google.cloud.dialogf"
          + "low.v2beta1.KnowledgeAnswers.Answer.Matc"
          + "hConfidenceLevel\022\030\n\020match_confidence\030\005 \001"
          + "(\002\"]\n\024MatchConfidenceLevel\022&\n\"MATCH_CONF"
          + "IDENCE_LEVEL_UNSPECIFIED\020\000\022\007\n\003LOW\020\001\022\n\n\006M"
          + "EDIUM\020\002\022\010\n\004HIGH\020\003\"\271\002\n\034StreamingDetectInt"
          + "entRequest\022\017\n\007session\030\001 \001(\t\022F\n\014query_par"
          + "ams\030\002 \001(\01320.google.cloud.dialogflow.v2be"
          + "ta1.QueryParameters\022@\n\013query_input\030\003 \001(\013"
          + "2+.google.cloud.dialogflow.v2beta1.Query"
          + "Input\022\030\n\020single_utterance\030\004 \001(\010\022O\n\023outpu"
          + "t_audio_config\030\005 \001(\01322.google.cloud.dial"
          + "ogflow.v2beta1.OutputAudioConfig\022\023\n\013inpu"
          + "t_audio\030\006 \001(\014\"\265\003\n\035StreamingDetectIntentR"
          + "esponse\022\023\n\013response_id\030\001 \001(\t\022W\n\022recognit"
          + "ion_result\030\002 \001(\0132;.google.cloud.dialogfl"
          + "ow.v2beta1.StreamingRecognitionResult\022B\n"
          + "\014query_result\030\003 \001(\0132,.google.cloud.dialo"
          + "gflow.v2beta1.QueryResult\022O\n\031alternative"
          + "_query_results\030\007 \003(\0132,.google.cloud.dial"
          + "ogflow.v2beta1.QueryResult\022*\n\016webhook_st"
          + "atus\030\004 \001(\0132\022.google.rpc.Status\022\024\n\014output"
          + "_audio\030\005 \001(\014\022O\n\023output_audio_config\030\006 \001("
          + "\01322.google.cloud.dialogflow.v2beta1.Outp"
          + "utAudioConfig\"\217\002\n\032StreamingRecognitionRe"
          + "sult\022]\n\014message_type\030\001 \001(\0162G.google.clou"
          + "d.dialogflow.v2beta1.StreamingRecognitio"
          + "nResult.MessageType\022\022\n\ntranscript\030\002 \001(\t\022"
          + "\020\n\010is_final\030\003 \001(\010\022\022\n\nconfidence\030\004 \001(\002\"X\n"
          + "\013MessageType\022\034\n\030MESSAGE_TYPE_UNSPECIFIED"
          + "\020\000\022\016\n\nTRANSCRIPT\020\001\022\033\n\027END_OF_SINGLE_UTTE"
          + "RANCE\020\002\"\261\001\n\020InputAudioConfig\022F\n\016audio_en"
          + "coding\030\001 \001(\0162..google.cloud.dialogflow.v"
          + "2beta1.AudioEncoding\022\031\n\021sample_rate_hert"
          + "z\030\002 \001(\005\022\025\n\rlanguage_code\030\003 \001(\t\022\024\n\014phrase"
          + "_hints\030\004 \003(\t\022\r\n\005model\030\007 \001(\t\"0\n\tTextInput"
          + "\022\014\n\004text\030\001 \001(\t\022\025\n\rlanguage_code\030\002 \001(\t\"^\n"
          + "\nEventInput\022\014\n\004name\030\001 \001(\t\022+\n\nparameters\030"
          + "\002 \001(\0132\027.google.protobuf.Struct\022\025\n\rlangua"
          + "ge_code\030\003 \001(\t\"F\n\036SentimentAnalysisReques"
          + "tConfig\022$\n\034analyze_query_text_sentiment\030"
          + "\001 \001(\010\"c\n\027SentimentAnalysisResult\022H\n\024quer"
          + "y_text_sentiment\030\001 \001(\0132*.google.cloud.di"
          + "alogflow.v2beta1.Sentiment\"-\n\tSentiment\022"
          + "\r\n\005score\030\001 \001(\002\022\021\n\tmagnitude\030\002 \001(\002*\373\001\n\rAu"
          + "dioEncoding\022\036\n\032AUDIO_ENCODING_UNSPECIFIE"
          + "D\020\000\022\034\n\030AUDIO_ENCODING_LINEAR_16\020\001\022\027\n\023AUD"
          + "IO_ENCODING_FLAC\020\002\022\030\n\024AUDIO_ENCODING_MUL"
          + "AW\020\003\022\026\n\022AUDIO_ENCODING_AMR\020\004\022\031\n\025AUDIO_EN"
          + "CODING_AMR_WB\020\005\022\033\n\027AUDIO_ENCODING_OGG_OP"
          + "US\020\006\022)\n%AUDIO_ENCODING_SPEEX_WITH_HEADER"
          + "_BYTE\020\0072\312\003\n\010Sessions\022\236\002\n\014DetectIntent\0224."
          + "google.cloud.dialogflow.v2beta1.DetectIn"
          + "tentRequest\0325.google.cloud.dialogflow.v2"
          + "beta1.DetectIntentResponse\"\240\001\202\323\344\223\002\231\001\";/v"
          + "2beta1/{session=projects/*/agent/session"
          + "s/*}:detectIntent:\001*ZW\"R/v2beta1/{sessio"
          + "n=projects/*/agent/environments/*/users/"
          + "*/sessions/*}:detectIntent:\001*\022\234\001\n\025Stream"
          + "ingDetectIntent\022=.google.cloud.dialogflo"
          + "w.v2beta1.StreamingDetectIntentRequest\032>"
          + ".google.cloud.dialogflow.v2beta1.Streami"
          + "ngDetectIntentResponse\"\000(\0010\001B\252\001\n#com.goo"
          + "gle.cloud.dialogflow.v2beta1B\014SessionPro"
          + "toP\001ZIgoogle.golang.org/genproto/googlea"
          + "pis/cloud/dialogflow/v2beta1;dialogflow\370"
          + "\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2beta"
          + "1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.AudioConfigProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_descriptor,
            new java.lang.String[] {
              "Session", "QueryParams", "QueryInput", "OutputAudioConfig", "InputAudio",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_descriptor,
            new java.lang.String[] {
              "ResponseId",
              "QueryResult",
              "AlternativeQueryResults",
              "WebhookStatus",
              "OutputAudio",
              "OutputAudioConfig",
            });
    internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor,
            new java.lang.String[] {
              "TimeZone",
              "GeoLocation",
              "Contexts",
              "ResetContexts",
              "SessionEntityTypes",
              "Payload",
              "KnowledgeBaseNames",
              "SentimentAnalysisRequestConfig",
            });
    internal_static_google_cloud_dialogflow_v2beta1_QueryInput_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_QueryInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_QueryInput_descriptor,
            new java.lang.String[] {
              "AudioConfig", "Text", "Event", "Input",
            });
    internal_static_google_cloud_dialogflow_v2beta1_QueryResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_QueryResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_QueryResult_descriptor,
            new java.lang.String[] {
              "QueryText",
              "LanguageCode",
              "SpeechRecognitionConfidence",
              "Action",
              "Parameters",
              "AllRequiredParamsPresent",
              "FulfillmentText",
              "FulfillmentMessages",
              "WebhookSource",
              "WebhookPayload",
              "OutputContexts",
              "Intent",
              "IntentDetectionConfidence",
              "DiagnosticInfo",
              "SentimentAnalysisResult",
              "KnowledgeAnswers",
            });
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_descriptor,
            new java.lang.String[] {
              "Answers",
            });
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_descriptor,
            new java.lang.String[] {
              "Source", "FaqQuestion", "Answer", "MatchConfidenceLevel", "MatchConfidence",
            });
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_descriptor,
            new java.lang.String[] {
              "Session",
              "QueryParams",
              "QueryInput",
              "SingleUtterance",
              "OutputAudioConfig",
              "InputAudio",
            });
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_descriptor,
            new java.lang.String[] {
              "ResponseId",
              "RecognitionResult",
              "QueryResult",
              "AlternativeQueryResults",
              "WebhookStatus",
              "OutputAudio",
              "OutputAudioConfig",
            });
    internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_descriptor,
            new java.lang.String[] {
              "MessageType", "Transcript", "IsFinal", "Confidence",
            });
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "LanguageCode", "PhraseHints", "Model",
            });
    internal_static_google_cloud_dialogflow_v2beta1_TextInput_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_TextInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_TextInput_descriptor,
            new java.lang.String[] {
              "Text", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EventInput_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2beta1_EventInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EventInput_descriptor,
            new java.lang.String[] {
              "Name", "Parameters", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_descriptor,
            new java.lang.String[] {
              "AnalyzeQueryTextSentiment",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_descriptor,
            new java.lang.String[] {
              "QueryTextSentiment",
            });
    internal_static_google_cloud_dialogflow_v2beta1_Sentiment_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_v2beta1_Sentiment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Sentiment_descriptor,
            new java.lang.String[] {
              "Score", "Magnitude",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
