// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public interface QueryParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.QueryParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time zone of this conversational query from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris. If not provided, the time zone specified in
   * agent settings is used.
   * </pre>
   *
   * <code>string time_zone = 1;</code>
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   * <pre>
   * The time zone of this conversational query from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris. If not provided, the time zone specified in
   * agent settings is used.
   * </pre>
   *
   * <code>string time_zone = 1;</code>
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString
      getTimeZoneBytes();

  /**
   * <pre>
   * The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   * @return Whether the geoLocation field is set.
   */
  boolean hasGeoLocation();
  /**
   * <pre>
   * The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   * @return The geoLocation.
   */
  com.google.type.LatLng getGeoLocation();
  /**
   * <pre>
   * The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   */
  com.google.type.LatLngOrBuilder getGeoLocationOrBuilder();

  /**
   * <pre>
   * The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Context> 
      getContextsList();
  /**
   * <pre>
   * The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Context getContexts(int index);
  /**
   * <pre>
   * The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  int getContextsCount();
  /**
   * <pre>
   * The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ContextOrBuilder> 
      getContextsOrBuilderList();
  /**
   * <pre>
   * The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getContextsOrBuilder(
      int index);

  /**
   * <pre>
   * Specifies whether to delete all contexts in the current session
   * before the new ones are activated.
   * </pre>
   *
   * <code>bool reset_contexts = 4;</code>
   * @return The resetContexts.
   */
  boolean getResetContexts();

  /**
   * <pre>
   * Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.SessionEntityType> 
      getSessionEntityTypesList();
  /**
   * <pre>
   * Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SessionEntityType getSessionEntityTypes(int index);
  /**
   * <pre>
   * Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;</code>
   */
  int getSessionEntityTypesCount();
  /**
   * <pre>
   * Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.SessionEntityTypeOrBuilder> 
      getSessionEntityTypesOrBuilderList();
  /**
   * <pre>
   * Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SessionEntityTypeOrBuilder getSessionEntityTypesOrBuilder(
      int index);

  /**
   * <pre>
   * This field can be used to pass custom data to your webhook.
   * Arbitrary JSON objects are supported.
   * If supplied, the value is used to populate the
   * `WebhookRequest.original_detect_intent_request.payload`
   * field sent to your webhook.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 6;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * This field can be used to pass custom data to your webhook.
   * Arbitrary JSON objects are supported.
   * If supplied, the value is used to populate the
   * `WebhookRequest.original_detect_intent_request.payload`
   * field sent to your webhook.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 6;</code>
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   * <pre>
   * This field can be used to pass custom data to your webhook.
   * Arbitrary JSON objects are supported.
   * If supplied, the value is used to populate the
   * `WebhookRequest.original_detect_intent_request.payload`
   * field sent to your webhook.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * KnowledgeBases to get alternative results from. If not set, the
   * KnowledgeBases enabled in the agent (through UI) will be used.
   * Format:  `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>repeated string knowledge_base_names = 12;</code>
   * @return A list containing the knowledgeBaseNames.
   */
  java.util.List<java.lang.String>
      getKnowledgeBaseNamesList();
  /**
   * <pre>
   * KnowledgeBases to get alternative results from. If not set, the
   * KnowledgeBases enabled in the agent (through UI) will be used.
   * Format:  `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>repeated string knowledge_base_names = 12;</code>
   * @return The count of knowledgeBaseNames.
   */
  int getKnowledgeBaseNamesCount();
  /**
   * <pre>
   * KnowledgeBases to get alternative results from. If not set, the
   * KnowledgeBases enabled in the agent (through UI) will be used.
   * Format:  `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>repeated string knowledge_base_names = 12;</code>
   * @param index The index of the element to return.
   * @return The knowledgeBaseNames at the given index.
   */
  java.lang.String getKnowledgeBaseNames(int index);
  /**
   * <pre>
   * KnowledgeBases to get alternative results from. If not set, the
   * KnowledgeBases enabled in the agent (through UI) will be used.
   * Format:  `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>repeated string knowledge_base_names = 12;</code>
   * @param index The index of the value to return.
   * @return The bytes of the knowledgeBaseNames at the given index.
   */
  com.google.protobuf.ByteString
      getKnowledgeBaseNamesBytes(int index);

  /**
   * <pre>
   * Configures the type of sentiment analysis to perform. If not
   * provided, sentiment analysis is not performed.
   * Note: Sentiment Analysis is only currently available for Essentials Edition
   * agents.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig sentiment_analysis_request_config = 10;</code>
   * @return Whether the sentimentAnalysisRequestConfig field is set.
   */
  boolean hasSentimentAnalysisRequestConfig();
  /**
   * <pre>
   * Configures the type of sentiment analysis to perform. If not
   * provided, sentiment analysis is not performed.
   * Note: Sentiment Analysis is only currently available for Essentials Edition
   * agents.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig sentiment_analysis_request_config = 10;</code>
   * @return The sentimentAnalysisRequestConfig.
   */
  com.google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig getSentimentAnalysisRequestConfig();
  /**
   * <pre>
   * Configures the type of sentiment analysis to perform. If not
   * provided, sentiment analysis is not performed.
   * Note: Sentiment Analysis is only currently available for Essentials Edition
   * agents.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig sentiment_analysis_request_config = 10;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfigOrBuilder getSentimentAnalysisRequestConfigOrBuilder();

  /**
   * <pre>
   * For mega agent query, directly specify which sub agents to query.
   * If any specified sub agent is not linked to the mega agent, an error will
   * be returned. If empty, Dialogflow will decide which sub agents to query.
   * If specified for a non-mega-agent query, will be silently ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SubAgent sub_agents = 13;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.SubAgent> 
      getSubAgentsList();
  /**
   * <pre>
   * For mega agent query, directly specify which sub agents to query.
   * If any specified sub agent is not linked to the mega agent, an error will
   * be returned. If empty, Dialogflow will decide which sub agents to query.
   * If specified for a non-mega-agent query, will be silently ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SubAgent sub_agents = 13;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SubAgent getSubAgents(int index);
  /**
   * <pre>
   * For mega agent query, directly specify which sub agents to query.
   * If any specified sub agent is not linked to the mega agent, an error will
   * be returned. If empty, Dialogflow will decide which sub agents to query.
   * If specified for a non-mega-agent query, will be silently ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SubAgent sub_agents = 13;</code>
   */
  int getSubAgentsCount();
  /**
   * <pre>
   * For mega agent query, directly specify which sub agents to query.
   * If any specified sub agent is not linked to the mega agent, an error will
   * be returned. If empty, Dialogflow will decide which sub agents to query.
   * If specified for a non-mega-agent query, will be silently ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SubAgent sub_agents = 13;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.SubAgentOrBuilder> 
      getSubAgentsOrBuilderList();
  /**
   * <pre>
   * For mega agent query, directly specify which sub agents to query.
   * If any specified sub agent is not linked to the mega agent, an error will
   * be returned. If empty, Dialogflow will decide which sub agents to query.
   * If specified for a non-mega-agent query, will be silently ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SubAgent sub_agents = 13;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SubAgentOrBuilder getSubAgentsOrBuilder(
      int index);

  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */
  int getWebhookHeadersCount();
  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */
  boolean containsWebhookHeaders(
      java.lang.String key);
  /**
   * Use {@link #getWebhookHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getWebhookHeaders();
  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getWebhookHeadersMap();
  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */

  /* nullable */
java.lang.String getWebhookHeadersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */

  java.lang.String getWebhookHeadersOrThrow(
      java.lang.String key);
}
