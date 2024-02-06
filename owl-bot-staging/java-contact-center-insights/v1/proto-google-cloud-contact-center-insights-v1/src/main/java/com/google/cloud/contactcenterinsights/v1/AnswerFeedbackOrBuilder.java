// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contactcenterinsights.v1;

public interface AnswerFeedbackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.AnswerFeedback)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The correctness level of an answer.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
   * @return The enum numeric value on the wire for correctnessLevel.
   */
  int getCorrectnessLevelValue();
  /**
   * <pre>
   * The correctness level of an answer.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel correctness_level = 1;</code>
   * @return The correctnessLevel.
   */
  com.google.cloud.contactcenterinsights.v1.AnswerFeedback.CorrectnessLevel getCorrectnessLevel();

  /**
   * <pre>
   * Indicates whether an answer or item was clicked by the human agent.
   * </pre>
   *
   * <code>bool clicked = 2;</code>
   * @return The clicked.
   */
  boolean getClicked();

  /**
   * <pre>
   * Indicates whether an answer or item was displayed to the human agent in the
   * agent desktop UI.
   * </pre>
   *
   * <code>bool displayed = 3;</code>
   * @return The displayed.
   */
  boolean getDisplayed();
}
