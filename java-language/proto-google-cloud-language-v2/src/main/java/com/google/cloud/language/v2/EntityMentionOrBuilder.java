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
// source: google/cloud/language/v2/language_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.language.v2;

public interface EntityMentionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v2.EntityMention)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The mention text.
   * </pre>
   *
   * <code>.google.cloud.language.v2.TextSpan text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * The mention text.
   * </pre>
   *
   * <code>.google.cloud.language.v2.TextSpan text = 1;</code>
   *
   * @return The text.
   */
  com.google.cloud.language.v2.TextSpan getText();
  /**
   *
   *
   * <pre>
   * The mention text.
   * </pre>
   *
   * <code>.google.cloud.language.v2.TextSpan text = 1;</code>
   */
  com.google.cloud.language.v2.TextSpanOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.language.v2.EntityMention.Type type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.language.v2.EntityMention.Type type = 2;</code>
   *
   * @return The type.
   */
  com.google.cloud.language.v2.EntityMention.Type getType();

  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v2.AnnotateTextRequest.Features.extract_entity_sentiment]
   * is set to true, this field will contain the sentiment expressed for this
   * mention of the entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v2.Sentiment sentiment = 3;</code>
   *
   * @return Whether the sentiment field is set.
   */
  boolean hasSentiment();
  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v2.AnnotateTextRequest.Features.extract_entity_sentiment]
   * is set to true, this field will contain the sentiment expressed for this
   * mention of the entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v2.Sentiment sentiment = 3;</code>
   *
   * @return The sentiment.
   */
  com.google.cloud.language.v2.Sentiment getSentiment();
  /**
   *
   *
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v2.AnnotateTextRequest.Features.extract_entity_sentiment]
   * is set to true, this field will contain the sentiment expressed for this
   * mention of the entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v2.Sentiment sentiment = 3;</code>
   */
  com.google.cloud.language.v2.SentimentOrBuilder getSentimentOrBuilder();

  /**
   *
   *
   * <pre>
   * Probability score associated with the entity.
   *
   * The score shows the probability of the entity mention being the entity
   * type. The score is in (0, 1] range.
   * </pre>
   *
   * <code>float probability = 4;</code>
   *
   * @return The probability.
   */
  float getProbability();
}
