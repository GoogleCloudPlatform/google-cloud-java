// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v1;

public interface PubsubConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.PubsubConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Name of the subscription. Format is
   * `projects/{project}/subscriptions/{subscription}`.
   * </pre>
   *
   * <code>string subscription = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   * <pre>
   * Output only. Name of the subscription. Format is
   * `projects/{project}/subscriptions/{subscription}`.
   * </pre>
   *
   * <code>string subscription = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();

  /**
   * <pre>
   * The name of the topic from which this subscription is receiving messages.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * The name of the topic from which this subscription is receiving messages.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * Service account that will make the push request.
   * </pre>
   *
   * <code>string service_account_email = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   * <pre>
   * Service account that will make the push request.
   * </pre>
   *
   * <code>string service_account_email = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString
      getServiceAccountEmailBytes();

  /**
   * <pre>
   * Potential issues with the underlying Pub/Sub subscription configuration.
   * Only populated on get requests.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PubsubConfig.State state = 4;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Potential issues with the underlying Pub/Sub subscription configuration.
   * Only populated on get requests.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PubsubConfig.State state = 4;</code>
   * @return The state.
   */
  com.google.cloudbuild.v1.PubsubConfig.State getState();
}
