// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/vizier_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface SuggestTrialsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SuggestTrialsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project and location that the Study belongs to.
   * Format: `projects/{project}/locations/{location}/studies/{study}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project and location that the Study belongs to.
   * Format: `projects/{project}/locations/{location}/studies/{study}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The number of suggestions requested. It must be positive.
   * </pre>
   *
   * <code>int32 suggestion_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The suggestionCount.
   */
  int getSuggestionCount();

  /**
   * <pre>
   * Required. The identifier of the client that is requesting the suggestion.
   *
   * If multiple SuggestTrialsRequests have the same `client_id`,
   * the service will return the identical suggested Trial if the Trial is
   * pending, and provide a new Trial if the last suggested Trial was completed.
   * </pre>
   *
   * <code>string client_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * Required. The identifier of the client that is requesting the suggestion.
   *
   * If multiple SuggestTrialsRequests have the same `client_id`,
   * the service will return the identical suggested Trial if the Trial is
   * pending, and provide a new Trial if the last suggested Trial was completed.
   * </pre>
   *
   * <code>string client_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();
}
