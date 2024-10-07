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
// source: google/cloud/policytroubleshooter/iam/v3/troubleshooter.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.policytroubleshooter.iam.v3;

public interface ConditionExplanationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policytroubleshooter.iam.v3.ConditionExplanation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Value of the condition.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 1;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * Value of the condition.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 1;</code>
   *
   * @return The value.
   */
  com.google.protobuf.Value getValue();
  /**
   *
   *
   * <pre>
   * Value of the condition.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 1;</code>
   */
  com.google.protobuf.ValueOrBuilder getValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Any errors that prevented complete evaluation of the condition expression.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  java.util.List<com.google.rpc.Status> getErrorsList();
  /**
   *
   *
   * <pre>
   * Any errors that prevented complete evaluation of the condition expression.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  com.google.rpc.Status getErrors(int index);
  /**
   *
   *
   * <pre>
   * Any errors that prevented complete evaluation of the condition expression.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Any errors that prevented complete evaluation of the condition expression.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Any errors that prevented complete evaluation of the condition expression.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The value of each statement of the condition expression. The value can be
   * `true`, `false`, or `null`. The value is `null` if the statement can't be
   * evaluated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.ConditionExplanation.EvaluationState evaluation_states = 2;
   * </code>
   */
  java.util.List<com.google.cloud.policytroubleshooter.iam.v3.ConditionExplanation.EvaluationState>
      getEvaluationStatesList();
  /**
   *
   *
   * <pre>
   * The value of each statement of the condition expression. The value can be
   * `true`, `false`, or `null`. The value is `null` if the statement can't be
   * evaluated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.ConditionExplanation.EvaluationState evaluation_states = 2;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.ConditionExplanation.EvaluationState
      getEvaluationStates(int index);
  /**
   *
   *
   * <pre>
   * The value of each statement of the condition expression. The value can be
   * `true`, `false`, or `null`. The value is `null` if the statement can't be
   * evaluated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.ConditionExplanation.EvaluationState evaluation_states = 2;
   * </code>
   */
  int getEvaluationStatesCount();
  /**
   *
   *
   * <pre>
   * The value of each statement of the condition expression. The value can be
   * `true`, `false`, or `null`. The value is `null` if the statement can't be
   * evaluated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.ConditionExplanation.EvaluationState evaluation_states = 2;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.policytroubleshooter.iam.v3.ConditionExplanation
                  .EvaluationStateOrBuilder>
      getEvaluationStatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The value of each statement of the condition expression. The value can be
   * `true`, `false`, or `null`. The value is `null` if the statement can't be
   * evaluated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.ConditionExplanation.EvaluationState evaluation_states = 2;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.ConditionExplanation.EvaluationStateOrBuilder
      getEvaluationStatesOrBuilder(int index);
}
