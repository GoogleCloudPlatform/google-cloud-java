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
// source: google/cloud/discoveryengine/v1/grounding.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface FactChunkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.FactChunk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Text content of the fact chunk. Can be at most 10K characters long.
   * </pre>
   *
   * <code>string chunk_text = 1;</code>
   *
   * @return The chunkText.
   */
  java.lang.String getChunkText();
  /**
   *
   *
   * <pre>
   * Text content of the fact chunk. Can be at most 10K characters long.
   * </pre>
   *
   * <code>string chunk_text = 1;</code>
   *
   * @return The bytes for chunkText.
   */
  com.google.protobuf.ByteString getChunkTextBytes();

  /**
   *
   *
   * <pre>
   * Source from which this fact chunk was retrieved. If it was retrieved
   * from the GroundingFacts provided in the request then this field will
   * contain the index of the specific fact from which this chunk was
   * retrieved.
   * </pre>
   *
   * <code>string source = 2;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * Source from which this fact chunk was retrieved. If it was retrieved
   * from the GroundingFacts provided in the request then this field will
   * contain the index of the specific fact from which this chunk was
   * retrieved.
   * </pre>
   *
   * <code>string source = 2;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * The index of this chunk. Currently, only used for the streaming mode.
   * </pre>
   *
   * <code>int32 index = 4;</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * More fine-grained information for the source reference.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_metadata = 3;</code>
   */
  int getSourceMetadataCount();
  /**
   *
   *
   * <pre>
   * More fine-grained information for the source reference.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_metadata = 3;</code>
   */
  boolean containsSourceMetadata(java.lang.String key);
  /** Use {@link #getSourceMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getSourceMetadata();
  /**
   *
   *
   * <pre>
   * More fine-grained information for the source reference.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_metadata = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getSourceMetadataMap();
  /**
   *
   *
   * <pre>
   * More fine-grained information for the source reference.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_metadata = 3;</code>
   */
  /* nullable */
  java.lang.String getSourceMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * More fine-grained information for the source reference.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_metadata = 3;</code>
   */
  java.lang.String getSourceMetadataOrThrow(java.lang.String key);
}
