// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_profile.proto

package com.google.cloud.dialogflow.v2;

public interface CreateConversationProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.CreateConversationProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project to create a conversation profile for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project to create a conversation profile for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The conversation profile to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the conversationProfile field is set.
   */
  boolean hasConversationProfile();
  /**
   * <pre>
   * Required. The conversation profile to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The conversationProfile.
   */
  com.google.cloud.dialogflow.v2.ConversationProfile getConversationProfile();
  /**
   * <pre>
   * Required. The conversation profile to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.v2.ConversationProfileOrBuilder getConversationProfileOrBuilder();
}
