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
// source: google/cloud/dialogflow/cx/v3/data_store_connection.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public interface DataStoreConnectionSignalsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Diagnostic info related to the rewriter model call.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.RewriterModelCallSignals rewriter_model_call_signals = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the rewriterModelCallSignals field is set.
   */
  boolean hasRewriterModelCallSignals();
  /**
   *
   *
   * <pre>
   * Optional. Diagnostic info related to the rewriter model call.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.RewriterModelCallSignals rewriter_model_call_signals = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The rewriterModelCallSignals.
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.RewriterModelCallSignals
      getRewriterModelCallSignals();
  /**
   *
   *
   * <pre>
   * Optional. Diagnostic info related to the rewriter model call.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.RewriterModelCallSignals rewriter_model_call_signals = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.RewriterModelCallSignalsOrBuilder
      getRewriterModelCallSignalsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Rewritten string query used for search.
   * </pre>
   *
   * <code>string rewritten_query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The rewrittenQuery.
   */
  java.lang.String getRewrittenQuery();
  /**
   *
   *
   * <pre>
   * Optional. Rewritten string query used for search.
   * </pre>
   *
   * <code>string rewritten_query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for rewrittenQuery.
   */
  com.google.protobuf.ByteString getRewrittenQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. Search snippets included in the answer generation prompt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippet search_snippets = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippet>
      getSearchSnippetsList();
  /**
   *
   *
   * <pre>
   * Optional. Search snippets included in the answer generation prompt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippet search_snippets = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippet getSearchSnippets(
      int index);
  /**
   *
   *
   * <pre>
   * Optional. Search snippets included in the answer generation prompt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippet search_snippets = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getSearchSnippetsCount();
  /**
   *
   *
   * <pre>
   * Optional. Search snippets included in the answer generation prompt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippet search_snippets = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippetOrBuilder>
      getSearchSnippetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Search snippets included in the answer generation prompt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippet search_snippets = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippetOrBuilder
      getSearchSnippetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Diagnostic info related to the answer generation model call.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerGenerationModelCallSignals answer_generation_model_call_signals = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the answerGenerationModelCallSignals field is set.
   */
  boolean hasAnswerGenerationModelCallSignals();
  /**
   *
   *
   * <pre>
   * Optional. Diagnostic info related to the answer generation model call.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerGenerationModelCallSignals answer_generation_model_call_signals = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The answerGenerationModelCallSignals.
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerGenerationModelCallSignals
      getAnswerGenerationModelCallSignals();
  /**
   *
   *
   * <pre>
   * Optional. Diagnostic info related to the answer generation model call.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerGenerationModelCallSignals answer_generation_model_call_signals = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals
          .AnswerGenerationModelCallSignalsOrBuilder
      getAnswerGenerationModelCallSignalsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The final compiled answer.
   * </pre>
   *
   * <code>string answer = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The answer.
   */
  java.lang.String getAnswer();
  /**
   *
   *
   * <pre>
   * Optional. The final compiled answer.
   * </pre>
   *
   * <code>string answer = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for answer.
   */
  com.google.protobuf.ByteString getAnswerBytes();

  /**
   *
   *
   * <pre>
   * Optional. Answer parts with relevant citations.
   * Concatenation of texts should add up the `answer` (not counting
   * whitespaces).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerPart answer_parts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerPart>
      getAnswerPartsList();
  /**
   *
   *
   * <pre>
   * Optional. Answer parts with relevant citations.
   * Concatenation of texts should add up the `answer` (not counting
   * whitespaces).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerPart answer_parts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerPart getAnswerParts(int index);
  /**
   *
   *
   * <pre>
   * Optional. Answer parts with relevant citations.
   * Concatenation of texts should add up the `answer` (not counting
   * whitespaces).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerPart answer_parts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnswerPartsCount();
  /**
   *
   *
   * <pre>
   * Optional. Answer parts with relevant citations.
   * Concatenation of texts should add up the `answer` (not counting
   * whitespaces).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerPart answer_parts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerPartOrBuilder>
      getAnswerPartsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Answer parts with relevant citations.
   * Concatenation of texts should add up the `answer` (not counting
   * whitespaces).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerPart answer_parts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.AnswerPartOrBuilder
      getAnswerPartsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Snippets cited by the answer generation model from the most to
   * least relevant.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippet cited_snippets = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippet>
      getCitedSnippetsList();
  /**
   *
   *
   * <pre>
   * Optional. Snippets cited by the answer generation model from the most to
   * least relevant.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippet cited_snippets = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippet getCitedSnippets(
      int index);
  /**
   *
   *
   * <pre>
   * Optional. Snippets cited by the answer generation model from the most to
   * least relevant.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippet cited_snippets = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getCitedSnippetsCount();
  /**
   *
   *
   * <pre>
   * Optional. Snippets cited by the answer generation model from the most to
   * least relevant.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippet cited_snippets = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippetOrBuilder>
      getCitedSnippetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Snippets cited by the answer generation model from the most to
   * least relevant.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippet cited_snippets = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippetOrBuilder
      getCitedSnippetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Grounding signals.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.GroundingSignals grounding_signals = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the groundingSignals field is set.
   */
  boolean hasGroundingSignals();
  /**
   *
   *
   * <pre>
   * Optional. Grounding signals.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.GroundingSignals grounding_signals = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The groundingSignals.
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.GroundingSignals
      getGroundingSignals();
  /**
   *
   *
   * <pre>
   * Optional. Grounding signals.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.GroundingSignals grounding_signals = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.GroundingSignalsOrBuilder
      getGroundingSignalsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Safety check result.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SafetySignals safety_signals = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the safetySignals field is set.
   */
  boolean hasSafetySignals();
  /**
   *
   *
   * <pre>
   * Optional. Safety check result.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SafetySignals safety_signals = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The safetySignals.
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SafetySignals getSafetySignals();
  /**
   *
   *
   * <pre>
   * Optional. Safety check result.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SafetySignals safety_signals = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SafetySignalsOrBuilder
      getSafetySignalsOrBuilder();
}
