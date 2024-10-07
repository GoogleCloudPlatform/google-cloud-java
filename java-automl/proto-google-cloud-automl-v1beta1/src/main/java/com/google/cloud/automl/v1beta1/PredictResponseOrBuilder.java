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
// source: google/cloud/automl/v1beta1/prediction_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1beta1;

public interface PredictResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.PredictResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Prediction result.
   * Translation and Text Sentiment will return precisely one payload.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.AnnotationPayload> getPayloadList();
  /**
   *
   *
   * <pre>
   * Prediction result.
   * Translation and Text Sentiment will return precisely one payload.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  com.google.cloud.automl.v1beta1.AnnotationPayload getPayload(int index);
  /**
   *
   *
   * <pre>
   * Prediction result.
   * Translation and Text Sentiment will return precisely one payload.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  int getPayloadCount();
  /**
   *
   *
   * <pre>
   * Prediction result.
   * Translation and Text Sentiment will return precisely one payload.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.AnnotationPayloadOrBuilder>
      getPayloadOrBuilderList();
  /**
   *
   *
   * <pre>
   * Prediction result.
   * Translation and Text Sentiment will return precisely one payload.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.AnnotationPayload payload = 1;</code>
   */
  com.google.cloud.automl.v1beta1.AnnotationPayloadOrBuilder getPayloadOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The preprocessed example that AutoML actually makes prediction on.
   * Empty if AutoML does not preprocess the input example.
   * * For Text Extraction:
   *   If the input is a .pdf file, the OCR'ed text will be provided in
   *   [document_text][google.cloud.automl.v1beta1.Document.document_text].
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ExamplePayload preprocessed_input = 3;</code>
   *
   * @return Whether the preprocessedInput field is set.
   */
  boolean hasPreprocessedInput();
  /**
   *
   *
   * <pre>
   * The preprocessed example that AutoML actually makes prediction on.
   * Empty if AutoML does not preprocess the input example.
   * * For Text Extraction:
   *   If the input is a .pdf file, the OCR'ed text will be provided in
   *   [document_text][google.cloud.automl.v1beta1.Document.document_text].
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ExamplePayload preprocessed_input = 3;</code>
   *
   * @return The preprocessedInput.
   */
  com.google.cloud.automl.v1beta1.ExamplePayload getPreprocessedInput();
  /**
   *
   *
   * <pre>
   * The preprocessed example that AutoML actually makes prediction on.
   * Empty if AutoML does not preprocess the input example.
   * * For Text Extraction:
   *   If the input is a .pdf file, the OCR'ed text will be provided in
   *   [document_text][google.cloud.automl.v1beta1.Document.document_text].
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ExamplePayload preprocessed_input = 3;</code>
   */
  com.google.cloud.automl.v1beta1.ExamplePayloadOrBuilder getPreprocessedInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional domain-specific prediction response metadata.
   *
   * * For Image Object Detection:
   *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
   *      image could have been returned.
   *
   * * For Text Sentiment:
   *  `sentiment_score` - (float, deprecated) A value between -1 and 1,
   *      -1 maps to least positive sentiment, while 1 maps to the most positive
   *      one and the higher the score, the more positive the sentiment in the
   *      document is. Yet these values are relative to the training data, so
   *      e.g. if all data was positive then -1 will be also positive (though
   *      the least).
   *      The sentiment_score shouldn't be confused with "score" or "magnitude"
   *      from the previous Natural Language Sentiment Analysis API.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Additional domain-specific prediction response metadata.
   *
   * * For Image Object Detection:
   *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
   *      image could have been returned.
   *
   * * For Text Sentiment:
   *  `sentiment_score` - (float, deprecated) A value between -1 and 1,
   *      -1 maps to least positive sentiment, while 1 maps to the most positive
   *      one and the higher the score, the more positive the sentiment in the
   *      document is. Yet these values are relative to the training data, so
   *      e.g. if all data was positive then -1 will be also positive (though
   *      the least).
   *      The sentiment_score shouldn't be confused with "score" or "magnitude"
   *      from the previous Natural Language Sentiment Analysis API.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Additional domain-specific prediction response metadata.
   *
   * * For Image Object Detection:
   *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
   *      image could have been returned.
   *
   * * For Text Sentiment:
   *  `sentiment_score` - (float, deprecated) A value between -1 and 1,
   *      -1 maps to least positive sentiment, while 1 maps to the most positive
   *      one and the higher the score, the more positive the sentiment in the
   *      document is. Yet these values are relative to the training data, so
   *      e.g. if all data was positive then -1 will be also positive (though
   *      the least).
   *      The sentiment_score shouldn't be confused with "score" or "magnitude"
   *      from the previous Natural Language Sentiment Analysis API.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Additional domain-specific prediction response metadata.
   *
   * * For Image Object Detection:
   *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
   *      image could have been returned.
   *
   * * For Text Sentiment:
   *  `sentiment_score` - (float, deprecated) A value between -1 and 1,
   *      -1 maps to least positive sentiment, while 1 maps to the most positive
   *      one and the higher the score, the more positive the sentiment in the
   *      document is. Yet these values are relative to the training data, so
   *      e.g. if all data was positive then -1 will be also positive (though
   *      the least).
   *      The sentiment_score shouldn't be confused with "score" or "magnitude"
   *      from the previous Natural Language Sentiment Analysis API.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Additional domain-specific prediction response metadata.
   *
   * * For Image Object Detection:
   *  `max_bounding_box_count` - (int64) At most that many bounding boxes per
   *      image could have been returned.
   *
   * * For Text Sentiment:
   *  `sentiment_score` - (float, deprecated) A value between -1 and 1,
   *      -1 maps to least positive sentiment, while 1 maps to the most positive
   *      one and the higher the score, the more positive the sentiment in the
   *      document is. Yet these values are relative to the training data, so
   *      e.g. if all data was positive then -1 will be also positive (though
   *      the least).
   *      The sentiment_score shouldn't be confused with "score" or "magnitude"
   *      from the previous Natural Language Sentiment Analysis API.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 2;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);
}
