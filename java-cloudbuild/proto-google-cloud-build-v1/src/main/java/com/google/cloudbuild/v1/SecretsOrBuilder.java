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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.5
package com.google.cloudbuild.v1;

public interface SecretsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.Secrets)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Secrets in Secret Manager and associated secret environment variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.SecretManagerSecret secret_manager = 1;</code>
   */
  java.util.List<com.google.cloudbuild.v1.SecretManagerSecret> getSecretManagerList();
  /**
   *
   *
   * <pre>
   * Secrets in Secret Manager and associated secret environment variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.SecretManagerSecret secret_manager = 1;</code>
   */
  com.google.cloudbuild.v1.SecretManagerSecret getSecretManager(int index);
  /**
   *
   *
   * <pre>
   * Secrets in Secret Manager and associated secret environment variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.SecretManagerSecret secret_manager = 1;</code>
   */
  int getSecretManagerCount();
  /**
   *
   *
   * <pre>
   * Secrets in Secret Manager and associated secret environment variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.SecretManagerSecret secret_manager = 1;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.SecretManagerSecretOrBuilder>
      getSecretManagerOrBuilderList();
  /**
   *
   *
   * <pre>
   * Secrets in Secret Manager and associated secret environment variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.SecretManagerSecret secret_manager = 1;</code>
   */
  com.google.cloudbuild.v1.SecretManagerSecretOrBuilder getSecretManagerOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Secrets encrypted with KMS key and the associated secret environment
   * variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.InlineSecret inline = 2;</code>
   */
  java.util.List<com.google.cloudbuild.v1.InlineSecret> getInlineList();
  /**
   *
   *
   * <pre>
   * Secrets encrypted with KMS key and the associated secret environment
   * variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.InlineSecret inline = 2;</code>
   */
  com.google.cloudbuild.v1.InlineSecret getInline(int index);
  /**
   *
   *
   * <pre>
   * Secrets encrypted with KMS key and the associated secret environment
   * variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.InlineSecret inline = 2;</code>
   */
  int getInlineCount();
  /**
   *
   *
   * <pre>
   * Secrets encrypted with KMS key and the associated secret environment
   * variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.InlineSecret inline = 2;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.InlineSecretOrBuilder> getInlineOrBuilderList();
  /**
   *
   *
   * <pre>
   * Secrets encrypted with KMS key and the associated secret environment
   * variable.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.InlineSecret inline = 2;</code>
   */
  com.google.cloudbuild.v1.InlineSecretOrBuilder getInlineOrBuilder(int index);
}
