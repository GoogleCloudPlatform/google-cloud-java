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
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.speech.v2;

public interface BatchRecognizeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.BatchRecognizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Recognizer to use during recognition. The
   * expected format is
   * `projects/{project}/locations/{location}/recognizers/{recognizer}`. The
   * {recognizer} segment may be set to `_` to use an empty implicit Recognizer.
   * </pre>
   *
   * <code>
   * string recognizer = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The recognizer.
   */
  java.lang.String getRecognizer();
  /**
   *
   *
   * <pre>
   * Required. The name of the Recognizer to use during recognition. The
   * expected format is
   * `projects/{project}/locations/{location}/recognizers/{recognizer}`. The
   * {recognizer} segment may be set to `_` to use an empty implicit Recognizer.
   * </pre>
   *
   * <code>
   * string recognizer = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for recognizer.
   */
  com.google.protobuf.ByteString getRecognizerBytes();

  /**
   *
   *
   * <pre>
   * Features and audio metadata to use for the Automatic Speech Recognition.
   * This field in combination with the
   * [config_mask][google.cloud.speech.v2.BatchRecognizeRequest.config_mask]
   * field can be used to override parts of the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the Recognizer resource.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionConfig config = 4;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Features and audio metadata to use for the Automatic Speech Recognition.
   * This field in combination with the
   * [config_mask][google.cloud.speech.v2.BatchRecognizeRequest.config_mask]
   * field can be used to override parts of the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the Recognizer resource.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionConfig config = 4;</code>
   *
   * @return The config.
   */
  com.google.cloud.speech.v2.RecognitionConfig getConfig();
  /**
   *
   *
   * <pre>
   * Features and audio metadata to use for the Automatic Speech Recognition.
   * This field in combination with the
   * [config_mask][google.cloud.speech.v2.BatchRecognizeRequest.config_mask]
   * field can be used to override parts of the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the Recognizer resource.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionConfig config = 4;</code>
   */
  com.google.cloud.speech.v2.RecognitionConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields in
   * [config][google.cloud.speech.v2.BatchRecognizeRequest.config] that override
   * the values in the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the recognizer during this recognition request. If no mask is provided,
   * all given fields in
   * [config][google.cloud.speech.v2.BatchRecognizeRequest.config] override the
   * values in the recognizer for this recognition request. If a mask is
   * provided, only the fields listed in the mask override the config in the
   * recognizer for this recognition request. If a wildcard (`*`) is provided,
   * [config][google.cloud.speech.v2.BatchRecognizeRequest.config] completely
   * overrides and replaces the config in the recognizer for this recognition
   * request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask config_mask = 5;</code>
   *
   * @return Whether the configMask field is set.
   */
  boolean hasConfigMask();
  /**
   *
   *
   * <pre>
   * The list of fields in
   * [config][google.cloud.speech.v2.BatchRecognizeRequest.config] that override
   * the values in the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the recognizer during this recognition request. If no mask is provided,
   * all given fields in
   * [config][google.cloud.speech.v2.BatchRecognizeRequest.config] override the
   * values in the recognizer for this recognition request. If a mask is
   * provided, only the fields listed in the mask override the config in the
   * recognizer for this recognition request. If a wildcard (`*`) is provided,
   * [config][google.cloud.speech.v2.BatchRecognizeRequest.config] completely
   * overrides and replaces the config in the recognizer for this recognition
   * request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask config_mask = 5;</code>
   *
   * @return The configMask.
   */
  com.google.protobuf.FieldMask getConfigMask();
  /**
   *
   *
   * <pre>
   * The list of fields in
   * [config][google.cloud.speech.v2.BatchRecognizeRequest.config] that override
   * the values in the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the recognizer during this recognition request. If no mask is provided,
   * all given fields in
   * [config][google.cloud.speech.v2.BatchRecognizeRequest.config] override the
   * values in the recognizer for this recognition request. If a mask is
   * provided, only the fields listed in the mask override the config in the
   * recognizer for this recognition request. If a wildcard (`*`) is provided,
   * [config][google.cloud.speech.v2.BatchRecognizeRequest.config] completely
   * overrides and replaces the config in the recognizer for this recognition
   * request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask config_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getConfigMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Audio files with file metadata for ASR.
   * The maximum number of files allowed to be specified is 15.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.BatchRecognizeFileMetadata files = 3;</code>
   */
  java.util.List<com.google.cloud.speech.v2.BatchRecognizeFileMetadata> getFilesList();
  /**
   *
   *
   * <pre>
   * Audio files with file metadata for ASR.
   * The maximum number of files allowed to be specified is 15.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.BatchRecognizeFileMetadata files = 3;</code>
   */
  com.google.cloud.speech.v2.BatchRecognizeFileMetadata getFiles(int index);
  /**
   *
   *
   * <pre>
   * Audio files with file metadata for ASR.
   * The maximum number of files allowed to be specified is 15.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.BatchRecognizeFileMetadata files = 3;</code>
   */
  int getFilesCount();
  /**
   *
   *
   * <pre>
   * Audio files with file metadata for ASR.
   * The maximum number of files allowed to be specified is 15.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.BatchRecognizeFileMetadata files = 3;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v2.BatchRecognizeFileMetadataOrBuilder>
      getFilesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Audio files with file metadata for ASR.
   * The maximum number of files allowed to be specified is 15.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.BatchRecognizeFileMetadata files = 3;</code>
   */
  com.google.cloud.speech.v2.BatchRecognizeFileMetadataOrBuilder getFilesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Configuration options for where to output the transcripts of each file.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionOutputConfig recognition_output_config = 6;</code>
   *
   * @return Whether the recognitionOutputConfig field is set.
   */
  boolean hasRecognitionOutputConfig();
  /**
   *
   *
   * <pre>
   * Configuration options for where to output the transcripts of each file.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionOutputConfig recognition_output_config = 6;</code>
   *
   * @return The recognitionOutputConfig.
   */
  com.google.cloud.speech.v2.RecognitionOutputConfig getRecognitionOutputConfig();
  /**
   *
   *
   * <pre>
   * Configuration options for where to output the transcripts of each file.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionOutputConfig recognition_output_config = 6;</code>
   */
  com.google.cloud.speech.v2.RecognitionOutputConfigOrBuilder getRecognitionOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Processing strategy to use for this request.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.BatchRecognizeRequest.ProcessingStrategy processing_strategy = 7;
   * </code>
   *
   * @return The enum numeric value on the wire for processingStrategy.
   */
  int getProcessingStrategyValue();
  /**
   *
   *
   * <pre>
   * Processing strategy to use for this request.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.BatchRecognizeRequest.ProcessingStrategy processing_strategy = 7;
   * </code>
   *
   * @return The processingStrategy.
   */
  com.google.cloud.speech.v2.BatchRecognizeRequest.ProcessingStrategy getProcessingStrategy();
}
