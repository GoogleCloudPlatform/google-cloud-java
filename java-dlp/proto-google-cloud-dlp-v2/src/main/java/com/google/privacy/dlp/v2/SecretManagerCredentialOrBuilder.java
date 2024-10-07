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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface SecretManagerCredentialOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.SecretManagerCredential)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The username.
   * </pre>
   *
   * <code>string username = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   *
   *
   * <pre>
   * Required. The username.
   * </pre>
   *
   * <code>string username = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString getUsernameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the Secret Manager resource that stores the password,
   * in the form `projects/project-id/secrets/secret-name/versions/version`.
   * </pre>
   *
   * <code>string password_secret_version_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The passwordSecretVersionName.
   */
  java.lang.String getPasswordSecretVersionName();
  /**
   *
   *
   * <pre>
   * Required. The name of the Secret Manager resource that stores the password,
   * in the form `projects/project-id/secrets/secret-name/versions/version`.
   * </pre>
   *
   * <code>string password_secret_version_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for passwordSecretVersionName.
   */
  com.google.protobuf.ByteString getPasswordSecretVersionNameBytes();
}
