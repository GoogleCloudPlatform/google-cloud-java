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
// source: google/cloud/discoveryengine/v1alpha/common.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public interface GuidedSearchSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.GuidedSearchSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether or not to enable and include refinement attributes in gudied search
   * result.
   * </pre>
   *
   * <code>bool enable_refinement_attributes = 1;</code>
   *
   * @return The enableRefinementAttributes.
   */
  boolean getEnableRefinementAttributes();

  /**
   *
   *
   * <pre>
   * Whether or not to enable and include related questions in search response.
   * </pre>
   *
   * <code>bool enable_related_questions = 2;</code>
   *
   * @return The enableRelatedQuestions.
   */
  boolean getEnableRelatedQuestions();

  /**
   *
   *
   * <pre>
   * Max number of related questions to be returned. The valid range is [1, 5].
   * If enable_related_questions is true, the default value is 3.
   * </pre>
   *
   * <code>int32 max_related_questions = 3;</code>
   *
   * @return The maxRelatedQuestions.
   */
  int getMaxRelatedQuestions();
}
