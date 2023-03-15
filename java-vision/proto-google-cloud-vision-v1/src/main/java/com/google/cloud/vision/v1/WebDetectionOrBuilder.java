/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/vision/v1/web_detection.proto

package com.google.cloud.vision.v1;

public interface WebDetectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.WebDetection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deduced entities from similar images on the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebEntity web_entities = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1.WebDetection.WebEntity> getWebEntitiesList();
  /**
   *
   *
   * <pre>
   * Deduced entities from similar images on the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebEntity web_entities = 1;</code>
   */
  com.google.cloud.vision.v1.WebDetection.WebEntity getWebEntities(int index);
  /**
   *
   *
   * <pre>
   * Deduced entities from similar images on the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebEntity web_entities = 1;</code>
   */
  int getWebEntitiesCount();
  /**
   *
   *
   * <pre>
   * Deduced entities from similar images on the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebEntity web_entities = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.WebDetection.WebEntityOrBuilder>
      getWebEntitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Deduced entities from similar images on the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebEntity web_entities = 1;</code>
   */
  com.google.cloud.vision.v1.WebDetection.WebEntityOrBuilder getWebEntitiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Fully matching images from the Internet.
   * Can include resized copies of the query image.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage full_matching_images = 2;</code>
   */
  java.util.List<com.google.cloud.vision.v1.WebDetection.WebImage> getFullMatchingImagesList();
  /**
   *
   *
   * <pre>
   * Fully matching images from the Internet.
   * Can include resized copies of the query image.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage full_matching_images = 2;</code>
   */
  com.google.cloud.vision.v1.WebDetection.WebImage getFullMatchingImages(int index);
  /**
   *
   *
   * <pre>
   * Fully matching images from the Internet.
   * Can include resized copies of the query image.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage full_matching_images = 2;</code>
   */
  int getFullMatchingImagesCount();
  /**
   *
   *
   * <pre>
   * Fully matching images from the Internet.
   * Can include resized copies of the query image.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage full_matching_images = 2;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.WebDetection.WebImageOrBuilder>
      getFullMatchingImagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Fully matching images from the Internet.
   * Can include resized copies of the query image.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage full_matching_images = 2;</code>
   */
  com.google.cloud.vision.v1.WebDetection.WebImageOrBuilder getFullMatchingImagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Partial matching images from the Internet.
   * Those images are similar enough to share some key-point features. For
   * example an original image will likely have partial matching for its crops.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage partial_matching_images = 3;
   * </code>
   */
  java.util.List<com.google.cloud.vision.v1.WebDetection.WebImage> getPartialMatchingImagesList();
  /**
   *
   *
   * <pre>
   * Partial matching images from the Internet.
   * Those images are similar enough to share some key-point features. For
   * example an original image will likely have partial matching for its crops.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage partial_matching_images = 3;
   * </code>
   */
  com.google.cloud.vision.v1.WebDetection.WebImage getPartialMatchingImages(int index);
  /**
   *
   *
   * <pre>
   * Partial matching images from the Internet.
   * Those images are similar enough to share some key-point features. For
   * example an original image will likely have partial matching for its crops.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage partial_matching_images = 3;
   * </code>
   */
  int getPartialMatchingImagesCount();
  /**
   *
   *
   * <pre>
   * Partial matching images from the Internet.
   * Those images are similar enough to share some key-point features. For
   * example an original image will likely have partial matching for its crops.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage partial_matching_images = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.WebDetection.WebImageOrBuilder>
      getPartialMatchingImagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Partial matching images from the Internet.
   * Those images are similar enough to share some key-point features. For
   * example an original image will likely have partial matching for its crops.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage partial_matching_images = 3;
   * </code>
   */
  com.google.cloud.vision.v1.WebDetection.WebImageOrBuilder getPartialMatchingImagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Web pages containing the matching images from the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebPage pages_with_matching_images = 4;
   * </code>
   */
  java.util.List<com.google.cloud.vision.v1.WebDetection.WebPage> getPagesWithMatchingImagesList();
  /**
   *
   *
   * <pre>
   * Web pages containing the matching images from the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebPage pages_with_matching_images = 4;
   * </code>
   */
  com.google.cloud.vision.v1.WebDetection.WebPage getPagesWithMatchingImages(int index);
  /**
   *
   *
   * <pre>
   * Web pages containing the matching images from the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebPage pages_with_matching_images = 4;
   * </code>
   */
  int getPagesWithMatchingImagesCount();
  /**
   *
   *
   * <pre>
   * Web pages containing the matching images from the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebPage pages_with_matching_images = 4;
   * </code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.WebDetection.WebPageOrBuilder>
      getPagesWithMatchingImagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Web pages containing the matching images from the Internet.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebPage pages_with_matching_images = 4;
   * </code>
   */
  com.google.cloud.vision.v1.WebDetection.WebPageOrBuilder getPagesWithMatchingImagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The visually similar image results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage visually_similar_images = 6;
   * </code>
   */
  java.util.List<com.google.cloud.vision.v1.WebDetection.WebImage> getVisuallySimilarImagesList();
  /**
   *
   *
   * <pre>
   * The visually similar image results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage visually_similar_images = 6;
   * </code>
   */
  com.google.cloud.vision.v1.WebDetection.WebImage getVisuallySimilarImages(int index);
  /**
   *
   *
   * <pre>
   * The visually similar image results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage visually_similar_images = 6;
   * </code>
   */
  int getVisuallySimilarImagesCount();
  /**
   *
   *
   * <pre>
   * The visually similar image results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage visually_similar_images = 6;
   * </code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.WebDetection.WebImageOrBuilder>
      getVisuallySimilarImagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The visually similar image results.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebImage visually_similar_images = 6;
   * </code>
   */
  com.google.cloud.vision.v1.WebDetection.WebImageOrBuilder getVisuallySimilarImagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The service's best guess as to the topic of the request image.
   * Inferred from similar images on the open web.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebLabel best_guess_labels = 8;</code>
   */
  java.util.List<com.google.cloud.vision.v1.WebDetection.WebLabel> getBestGuessLabelsList();
  /**
   *
   *
   * <pre>
   * The service's best guess as to the topic of the request image.
   * Inferred from similar images on the open web.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebLabel best_guess_labels = 8;</code>
   */
  com.google.cloud.vision.v1.WebDetection.WebLabel getBestGuessLabels(int index);
  /**
   *
   *
   * <pre>
   * The service's best guess as to the topic of the request image.
   * Inferred from similar images on the open web.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebLabel best_guess_labels = 8;</code>
   */
  int getBestGuessLabelsCount();
  /**
   *
   *
   * <pre>
   * The service's best guess as to the topic of the request image.
   * Inferred from similar images on the open web.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebLabel best_guess_labels = 8;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.WebDetection.WebLabelOrBuilder>
      getBestGuessLabelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The service's best guess as to the topic of the request image.
   * Inferred from similar images on the open web.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.WebDetection.WebLabel best_guess_labels = 8;</code>
   */
  com.google.cloud.vision.v1.WebDetection.WebLabelOrBuilder getBestGuessLabelsOrBuilder(int index);
}
