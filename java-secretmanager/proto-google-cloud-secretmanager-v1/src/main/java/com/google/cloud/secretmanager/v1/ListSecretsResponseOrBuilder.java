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
// source: google/cloud/secretmanager/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.secretmanager.v1;

public interface ListSecretsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1.ListSecretsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of [Secrets][google.cloud.secretmanager.v1.Secret] sorted in
   * reverse by create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secretmanager.v1.Secret secrets = 1;</code>
   */
  java.util.List<com.google.cloud.secretmanager.v1.Secret> getSecretsList();
  /**
   *
   *
   * <pre>
   * The list of [Secrets][google.cloud.secretmanager.v1.Secret] sorted in
   * reverse by create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secretmanager.v1.Secret secrets = 1;</code>
   */
  com.google.cloud.secretmanager.v1.Secret getSecrets(int index);
  /**
   *
   *
   * <pre>
   * The list of [Secrets][google.cloud.secretmanager.v1.Secret] sorted in
   * reverse by create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secretmanager.v1.Secret secrets = 1;</code>
   */
  int getSecretsCount();
  /**
   *
   *
   * <pre>
   * The list of [Secrets][google.cloud.secretmanager.v1.Secret] sorted in
   * reverse by create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secretmanager.v1.Secret secrets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.secretmanager.v1.SecretOrBuilder>
      getSecretsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of [Secrets][google.cloud.secretmanager.v1.Secret] sorted in
   * reverse by create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secretmanager.v1.Secret secrets = 1;</code>
   */
  com.google.cloud.secretmanager.v1.SecretOrBuilder getSecretsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. Pass this value in
   * [ListSecretsRequest.page_token][google.cloud.secretmanager.v1.ListSecretsRequest.page_token]
   * to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. Pass this value in
   * [ListSecretsRequest.page_token][google.cloud.secretmanager.v1.ListSecretsRequest.page_token]
   * to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of [Secrets][google.cloud.secretmanager.v1.Secret] but 0
   * when the
   * [ListSecretsRequest.filter][google.cloud.secretmanager.v1.ListSecretsRequest.filter]
   * field is set.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();
}
