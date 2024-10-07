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
// source: google/apps/meet/v2/service.proto

// Protobuf Java Version: 3.25.5
package com.google.apps.meet.v2;

public interface ListTranscriptEntriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.meet.v2.ListTranscriptEntriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of TranscriptEntries in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2.TranscriptEntry transcript_entries = 1;</code>
   */
  java.util.List<com.google.apps.meet.v2.TranscriptEntry> getTranscriptEntriesList();
  /**
   *
   *
   * <pre>
   * List of TranscriptEntries in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2.TranscriptEntry transcript_entries = 1;</code>
   */
  com.google.apps.meet.v2.TranscriptEntry getTranscriptEntries(int index);
  /**
   *
   *
   * <pre>
   * List of TranscriptEntries in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2.TranscriptEntry transcript_entries = 1;</code>
   */
  int getTranscriptEntriesCount();
  /**
   *
   *
   * <pre>
   * List of TranscriptEntries in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2.TranscriptEntry transcript_entries = 1;</code>
   */
  java.util.List<? extends com.google.apps.meet.v2.TranscriptEntryOrBuilder>
      getTranscriptEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of TranscriptEntries in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2.TranscriptEntry transcript_entries = 1;</code>
   */
  com.google.apps.meet.v2.TranscriptEntryOrBuilder getTranscriptEntriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to be circulated back for further List call if current List doesn't
   * include all the transcript entries. Unset if all entries are returned.
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
   * Token to be circulated back for further List call if current List doesn't
   * include all the transcript entries. Unset if all entries are returned.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
