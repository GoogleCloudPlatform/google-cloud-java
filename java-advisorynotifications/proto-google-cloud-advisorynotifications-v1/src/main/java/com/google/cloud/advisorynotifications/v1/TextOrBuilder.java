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
// source: google/cloud/advisorynotifications/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.advisorynotifications.v1;

public interface TextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.advisorynotifications.v1.Text)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The English copy.
   * </pre>
   *
   * <code>string en_text = 1;</code>
   *
   * @return The enText.
   */
  java.lang.String getEnText();
  /**
   *
   *
   * <pre>
   * The English copy.
   * </pre>
   *
   * <code>string en_text = 1;</code>
   *
   * @return The bytes for enText.
   */
  com.google.protobuf.ByteString getEnTextBytes();

  /**
   *
   *
   * <pre>
   * The requested localized copy (if applicable).
   * </pre>
   *
   * <code>string localized_text = 2;</code>
   *
   * @return The localizedText.
   */
  java.lang.String getLocalizedText();
  /**
   *
   *
   * <pre>
   * The requested localized copy (if applicable).
   * </pre>
   *
   * <code>string localized_text = 2;</code>
   *
   * @return The bytes for localizedText.
   */
  com.google.protobuf.ByteString getLocalizedTextBytes();

  /**
   *
   *
   * <pre>
   * Status of the localization.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.LocalizationState localization_state = 3;</code>
   *
   * @return The enum numeric value on the wire for localizationState.
   */
  int getLocalizationStateValue();
  /**
   *
   *
   * <pre>
   * Status of the localization.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.LocalizationState localization_state = 3;</code>
   *
   * @return The localizationState.
   */
  com.google.cloud.advisorynotifications.v1.LocalizationState getLocalizationState();
}
