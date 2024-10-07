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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface InterconnectAttachmentsScopedListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectAttachmentsScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of interconnect attachments contained in this scope.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectAttachment interconnect_attachments = 425388415;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.InterconnectAttachment>
      getInterconnectAttachmentsList();
  /**
   *
   *
   * <pre>
   * A list of interconnect attachments contained in this scope.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectAttachment interconnect_attachments = 425388415;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectAttachment getInterconnectAttachments(int index);
  /**
   *
   *
   * <pre>
   * A list of interconnect attachments contained in this scope.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectAttachment interconnect_attachments = 425388415;
   * </code>
   */
  int getInterconnectAttachmentsCount();
  /**
   *
   *
   * <pre>
   * A list of interconnect attachments contained in this scope.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectAttachment interconnect_attachments = 425388415;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InterconnectAttachmentOrBuilder>
      getInterconnectAttachmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of interconnect attachments contained in this scope.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectAttachment interconnect_attachments = 425388415;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectAttachmentOrBuilder getInterconnectAttachmentsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
