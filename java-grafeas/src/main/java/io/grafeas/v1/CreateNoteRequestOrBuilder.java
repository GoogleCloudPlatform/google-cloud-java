/*
 * Copyright 2024 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/grafeas.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1;

public interface CreateNoteRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.CreateNoteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the note is to be created.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the note is to be created.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The ID to use for this note.
   * </pre>
   *
   * <code>string note_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The noteId.
   */
  java.lang.String getNoteId();
  /**
   *
   *
   * <pre>
   * The ID to use for this note.
   * </pre>
   *
   * <code>string note_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for noteId.
   */
  com.google.protobuf.ByteString getNoteIdBytes();

  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the note field is set.
   */
  boolean hasNote();
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The note.
   */
  io.grafeas.v1.Note getNote();
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  io.grafeas.v1.NoteOrBuilder getNoteOrBuilder();
}
