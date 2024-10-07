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
// source: google/cloud/aiplatform/v1/vizier_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface ListStudiesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListStudiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Study> getStudiesList();
  /**
   *
   *
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Study getStudies(int index);
  /**
   *
   *
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  int getStudiesCount();
  /**
   *
   *
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.StudyOrBuilder> getStudiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  com.google.cloud.aiplatform.v1.StudyOrBuilder getStudiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Passes this token as the `page_token` field of the request for a
   * subsequent call.
   * If this field is omitted, there are no subsequent pages.
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
   * Passes this token as the `page_token` field of the request for a
   * subsequent call.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
