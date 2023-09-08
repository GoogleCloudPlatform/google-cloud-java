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
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface SpeechAdaptationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.SpeechAdaptationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether there was a timeout when applying speech adaptation. If true,
   * adaptation had no effect in the response transcript.
   * </pre>
   *
   * <code>bool adaptation_timeout = 1;</code>
   *
   * @return The adaptationTimeout.
   */
  boolean getAdaptationTimeout();

  /**
   *
   *
   * <pre>
   * If set, returns a message specifying which part of the speech adaptation
   * request timed out.
   * </pre>
   *
   * <code>string timeout_message = 4;</code>
   *
   * @return The timeoutMessage.
   */
  java.lang.String getTimeoutMessage();
  /**
   *
   *
   * <pre>
   * If set, returns a message specifying which part of the speech adaptation
   * request timed out.
   * </pre>
   *
   * <code>string timeout_message = 4;</code>
   *
   * @return The bytes for timeoutMessage.
   */
  com.google.protobuf.ByteString getTimeoutMessageBytes();
}
