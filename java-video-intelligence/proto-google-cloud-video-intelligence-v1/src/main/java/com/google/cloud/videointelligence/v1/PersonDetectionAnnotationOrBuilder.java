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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.videointelligence.v1;

public interface PersonDetectionAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.PersonDetectionAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.Track> getTracksList();
  /**
   *
   *
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 1;</code>
   */
  com.google.cloud.videointelligence.v1.Track getTracks(int index);
  /**
   *
   *
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 1;</code>
   */
  int getTracksCount();
  /**
   *
   *
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.TrackOrBuilder>
      getTracksOrBuilderList();
  /**
   *
   *
   * <pre>
   * The detected tracks of a person.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 1;</code>
   */
  com.google.cloud.videointelligence.v1.TrackOrBuilder getTracksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
