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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface RecognitionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.RecognitionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Automatically detect decoding parameters.
   * Preferred for supported formats.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.AutoDetectDecodingConfig auto_decoding_config = 7;</code>
   *
   * @return Whether the autoDecodingConfig field is set.
   */
  boolean hasAutoDecodingConfig();
  /**
   *
   *
   * <pre>
   * Automatically detect decoding parameters.
   * Preferred for supported formats.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.AutoDetectDecodingConfig auto_decoding_config = 7;</code>
   *
   * @return The autoDecodingConfig.
   */
  com.google.cloud.speech.v2.AutoDetectDecodingConfig getAutoDecodingConfig();
  /**
   *
   *
   * <pre>
   * Automatically detect decoding parameters.
   * Preferred for supported formats.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.AutoDetectDecodingConfig auto_decoding_config = 7;</code>
   */
  com.google.cloud.speech.v2.AutoDetectDecodingConfigOrBuilder getAutoDecodingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Explicitly specified decoding parameters.
   * Required if using headerless PCM audio (linear16, mulaw, alaw).
   * </pre>
   *
   * <code>.google.cloud.speech.v2.ExplicitDecodingConfig explicit_decoding_config = 8;</code>
   *
   * @return Whether the explicitDecodingConfig field is set.
   */
  boolean hasExplicitDecodingConfig();
  /**
   *
   *
   * <pre>
   * Explicitly specified decoding parameters.
   * Required if using headerless PCM audio (linear16, mulaw, alaw).
   * </pre>
   *
   * <code>.google.cloud.speech.v2.ExplicitDecodingConfig explicit_decoding_config = 8;</code>
   *
   * @return The explicitDecodingConfig.
   */
  com.google.cloud.speech.v2.ExplicitDecodingConfig getExplicitDecodingConfig();
  /**
   *
   *
   * <pre>
   * Explicitly specified decoding parameters.
   * Required if using headerless PCM audio (linear16, mulaw, alaw).
   * </pre>
   *
   * <code>.google.cloud.speech.v2.ExplicitDecodingConfig explicit_decoding_config = 8;</code>
   */
  com.google.cloud.speech.v2.ExplicitDecodingConfigOrBuilder getExplicitDecodingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Which model to use for recognition requests. Select the model
   * best suited to your domain to get best results.
   *
   * Guidance for choosing which model to use can be found in the [Transcription
   * Models
   * Documentation](https://cloud.google.com/speech-to-text/v2/docs/transcription-model)
   * and the models supported in each region can be found in the [Table Of
   * Supported
   * Models](https://cloud.google.com/speech-to-text/v2/docs/speech-to-text-supported-languages).
   * </pre>
   *
   * <code>string model = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Optional. Which model to use for recognition requests. Select the model
   * best suited to your domain to get best results.
   *
   * Guidance for choosing which model to use can be found in the [Transcription
   * Models
   * Documentation](https://cloud.google.com/speech-to-text/v2/docs/transcription-model)
   * and the models supported in each region can be found in the [Table Of
   * Supported
   * Models](https://cloud.google.com/speech-to-text/v2/docs/speech-to-text-supported-languages).
   * </pre>
   *
   * <code>string model = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Optional. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Language tags are normalized to BCP-47 before they are used eg "en-us"
   * becomes "en-US".
   *
   * Supported languages for each model are listed in the [Table of Supported
   * Models](https://cloud.google.com/speech-to-text/v2/docs/speech-to-text-supported-languages).
   *
   * If additional languages are provided, recognition result will contain
   * recognition in the most likely language detected. The recognition result
   * will include the language tag of the language detected in the audio.
   * </pre>
   *
   * <code>repeated string language_codes = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the languageCodes.
   */
  java.util.List<java.lang.String> getLanguageCodesList();
  /**
   *
   *
   * <pre>
   * Optional. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Language tags are normalized to BCP-47 before they are used eg "en-us"
   * becomes "en-US".
   *
   * Supported languages for each model are listed in the [Table of Supported
   * Models](https://cloud.google.com/speech-to-text/v2/docs/speech-to-text-supported-languages).
   *
   * If additional languages are provided, recognition result will contain
   * recognition in the most likely language detected. The recognition result
   * will include the language tag of the language detected in the audio.
   * </pre>
   *
   * <code>repeated string language_codes = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of languageCodes.
   */
  int getLanguageCodesCount();
  /**
   *
   *
   * <pre>
   * Optional. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Language tags are normalized to BCP-47 before they are used eg "en-us"
   * becomes "en-US".
   *
   * Supported languages for each model are listed in the [Table of Supported
   * Models](https://cloud.google.com/speech-to-text/v2/docs/speech-to-text-supported-languages).
   *
   * If additional languages are provided, recognition result will contain
   * recognition in the most likely language detected. The recognition result
   * will include the language tag of the language detected in the audio.
   * </pre>
   *
   * <code>repeated string language_codes = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The languageCodes at the given index.
   */
  java.lang.String getLanguageCodes(int index);
  /**
   *
   *
   * <pre>
   * Optional. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Language tags are normalized to BCP-47 before they are used eg "en-us"
   * becomes "en-US".
   *
   * Supported languages for each model are listed in the [Table of Supported
   * Models](https://cloud.google.com/speech-to-text/v2/docs/speech-to-text-supported-languages).
   *
   * If additional languages are provided, recognition result will contain
   * recognition in the most likely language detected. The recognition result
   * will include the language tag of the language detected in the audio.
   * </pre>
   *
   * <code>repeated string language_codes = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the languageCodes at the given index.
   */
  com.google.protobuf.ByteString getLanguageCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * Speech recognition features to enable.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionFeatures features = 2;</code>
   *
   * @return Whether the features field is set.
   */
  boolean hasFeatures();
  /**
   *
   *
   * <pre>
   * Speech recognition features to enable.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionFeatures features = 2;</code>
   *
   * @return The features.
   */
  com.google.cloud.speech.v2.RecognitionFeatures getFeatures();
  /**
   *
   *
   * <pre>
   * Speech recognition features to enable.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionFeatures features = 2;</code>
   */
  com.google.cloud.speech.v2.RecognitionFeaturesOrBuilder getFeaturesOrBuilder();

  /**
   *
   *
   * <pre>
   * Speech adaptation context that weights recognizer predictions for specific
   * words and phrases.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.SpeechAdaptation adaptation = 6;</code>
   *
   * @return Whether the adaptation field is set.
   */
  boolean hasAdaptation();
  /**
   *
   *
   * <pre>
   * Speech adaptation context that weights recognizer predictions for specific
   * words and phrases.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.SpeechAdaptation adaptation = 6;</code>
   *
   * @return The adaptation.
   */
  com.google.cloud.speech.v2.SpeechAdaptation getAdaptation();
  /**
   *
   *
   * <pre>
   * Speech adaptation context that weights recognizer predictions for specific
   * words and phrases.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.SpeechAdaptation adaptation = 6;</code>
   */
  com.google.cloud.speech.v2.SpeechAdaptationOrBuilder getAdaptationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Use transcription normalization to automatically replace parts of
   * the transcript with phrases of your choosing. For StreamingRecognize, this
   * normalization only applies to stable partial transcripts (stability &gt; 0.8)
   * and final transcripts.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.TranscriptNormalization transcript_normalization = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the transcriptNormalization field is set.
   */
  boolean hasTranscriptNormalization();
  /**
   *
   *
   * <pre>
   * Optional. Use transcription normalization to automatically replace parts of
   * the transcript with phrases of your choosing. For StreamingRecognize, this
   * normalization only applies to stable partial transcripts (stability &gt; 0.8)
   * and final transcripts.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.TranscriptNormalization transcript_normalization = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The transcriptNormalization.
   */
  com.google.cloud.speech.v2.TranscriptNormalization getTranscriptNormalization();
  /**
   *
   *
   * <pre>
   * Optional. Use transcription normalization to automatically replace parts of
   * the transcript with phrases of your choosing. For StreamingRecognize, this
   * normalization only applies to stable partial transcripts (stability &gt; 0.8)
   * and final transcripts.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.TranscriptNormalization transcript_normalization = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.speech.v2.TranscriptNormalizationOrBuilder getTranscriptNormalizationOrBuilder();

  com.google.cloud.speech.v2.RecognitionConfig.DecodingConfigCase getDecodingConfigCase();
}
