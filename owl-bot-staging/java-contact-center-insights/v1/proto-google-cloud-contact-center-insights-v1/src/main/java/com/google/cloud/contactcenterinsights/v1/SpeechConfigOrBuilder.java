// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contactcenterinsights.v1;

public interface SpeechConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.SpeechConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fully-qualified Speech Recognizer resource name.
   * Format:
   * `projects/{project_id}/locations/{location}/recognizer/{recognizer}`
   * </pre>
   *
   * <code>string speech_recognizer = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The speechRecognizer.
   */
  java.lang.String getSpeechRecognizer();
  /**
   * <pre>
   * The fully-qualified Speech Recognizer resource name.
   * Format:
   * `projects/{project_id}/locations/{location}/recognizer/{recognizer}`
   * </pre>
   *
   * <code>string speech_recognizer = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for speechRecognizer.
   */
  com.google.protobuf.ByteString
      getSpeechRecognizerBytes();
}
