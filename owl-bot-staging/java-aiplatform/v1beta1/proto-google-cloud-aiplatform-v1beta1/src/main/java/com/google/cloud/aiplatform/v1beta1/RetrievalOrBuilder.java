// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/tool.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface RetrievalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Retrieval)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.VertexAISearch vertex_ai_search = 2;</code>
   * @return Whether the vertexAiSearch field is set.
   */
  boolean hasVertexAiSearch();
  /**
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.VertexAISearch vertex_ai_search = 2;</code>
   * @return The vertexAiSearch.
   */
  com.google.cloud.aiplatform.v1beta1.VertexAISearch getVertexAiSearch();
  /**
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.VertexAISearch vertex_ai_search = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.VertexAISearchOrBuilder getVertexAiSearchOrBuilder();

  /**
   * <pre>
   * Optional. Disable using the result from this tool in detecting grounding
   * attribution. This does not affect how the result is given to the model for
   * generation.
   * </pre>
   *
   * <code>bool disable_attribution = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The disableAttribution.
   */
  boolean getDisableAttribution();

  com.google.cloud.aiplatform.v1beta1.Retrieval.SourceCase getSourceCase();
}
