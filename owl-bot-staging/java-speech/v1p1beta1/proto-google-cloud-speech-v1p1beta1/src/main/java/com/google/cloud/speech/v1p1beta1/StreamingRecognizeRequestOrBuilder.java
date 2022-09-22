// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface StreamingRecognizeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.StreamingRecognizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request. The first `StreamingRecognizeRequest` message must contain a
   * `streaming_config`  message.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
   * @return Whether the streamingConfig field is set.
   */
  boolean hasStreamingConfig();
  /**
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request. The first `StreamingRecognizeRequest` message must contain a
   * `streaming_config`  message.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
   * @return The streamingConfig.
   */
  com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig getStreamingConfig();
  /**
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request. The first `StreamingRecognizeRequest` message must contain a
   * `streaming_config`  message.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.StreamingRecognitionConfig streaming_config = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.StreamingRecognitionConfigOrBuilder getStreamingConfigOrBuilder();

  /**
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `StreamingRecognizeRequest` messages. The first
   * `StreamingRecognizeRequest` message must not contain `audio_content` data
   * and all subsequent `StreamingRecognizeRequest` messages must contain
   * `audio_content` data. The audio bytes must be encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
   * pure binary representation (not base64). See
   * [content limits](https://cloud.google.com/speech-to-text/quotas#content).
   * </pre>
   *
   * <code>bytes audio_content = 2;</code>
   * @return Whether the audioContent field is set.
   */
  boolean hasAudioContent();
  /**
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `StreamingRecognizeRequest` messages. The first
   * `StreamingRecognizeRequest` message must not contain `audio_content` data
   * and all subsequent `StreamingRecognizeRequest` messages must contain
   * `audio_content` data. The audio bytes must be encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, proto buffers use a
   * pure binary representation (not base64). See
   * [content limits](https://cloud.google.com/speech-to-text/quotas#content).
   * </pre>
   *
   * <code>bytes audio_content = 2;</code>
   * @return The audioContent.
   */
  com.google.protobuf.ByteString getAudioContent();

  public com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest.StreamingRequestCase getStreamingRequestCase();
}
