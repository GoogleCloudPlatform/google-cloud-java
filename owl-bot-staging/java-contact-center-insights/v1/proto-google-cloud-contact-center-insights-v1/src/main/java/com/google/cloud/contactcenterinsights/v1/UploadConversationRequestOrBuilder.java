// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contactcenterinsights.v1;

public interface UploadConversationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.UploadConversationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource of the conversation.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource of the conversation.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The conversation resource to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   * <pre>
   * Required. The conversation resource to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The conversation.
   */
  com.google.cloud.contactcenterinsights.v1.Conversation getConversation();
  /**
   * <pre>
   * Required. The conversation resource to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder getConversationOrBuilder();

  /**
   * <pre>
   * Optional. A unique ID for the new conversation. This ID will become the
   * final component of the conversation's resource name. If no ID is specified,
   * a server-generated ID will be used.
   *
   * This value should be 4-64 characters and must match the regular
   * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
   * </pre>
   *
   * <code>string conversation_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The conversationId.
   */
  java.lang.String getConversationId();
  /**
   * <pre>
   * Optional. A unique ID for the new conversation. This ID will become the
   * final component of the conversation's resource name. If no ID is specified,
   * a server-generated ID will be used.
   *
   * This value should be 4-64 characters and must match the regular
   * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
   * </pre>
   *
   * <code>string conversation_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for conversationId.
   */
  com.google.protobuf.ByteString
      getConversationIdBytes();

  /**
   * <pre>
   * Optional. DLP settings for transcript redaction. Will default to the config
   * specified in Settings.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.RedactionConfig redaction_config = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the redactionConfig field is set.
   */
  boolean hasRedactionConfig();
  /**
   * <pre>
   * Optional. DLP settings for transcript redaction. Will default to the config
   * specified in Settings.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.RedactionConfig redaction_config = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The redactionConfig.
   */
  com.google.cloud.contactcenterinsights.v1.RedactionConfig getRedactionConfig();
  /**
   * <pre>
   * Optional. DLP settings for transcript redaction. Will default to the config
   * specified in Settings.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.RedactionConfig redaction_config = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.contactcenterinsights.v1.RedactionConfigOrBuilder getRedactionConfigOrBuilder();

  /**
   * <pre>
   * Optional. Speech-to-Text configuration. Will default to the config
   * specified in Settings.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SpeechConfig speech_config = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the speechConfig field is set.
   */
  boolean hasSpeechConfig();
  /**
   * <pre>
   * Optional. Speech-to-Text configuration. Will default to the config
   * specified in Settings.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SpeechConfig speech_config = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The speechConfig.
   */
  com.google.cloud.contactcenterinsights.v1.SpeechConfig getSpeechConfig();
  /**
   * <pre>
   * Optional. Speech-to-Text configuration. Will default to the config
   * specified in Settings.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SpeechConfig speech_config = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.contactcenterinsights.v1.SpeechConfigOrBuilder getSpeechConfigOrBuilder();
}
