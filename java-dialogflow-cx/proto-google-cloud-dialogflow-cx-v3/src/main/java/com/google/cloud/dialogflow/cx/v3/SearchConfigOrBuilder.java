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
// source: google/cloud/dialogflow/cx/v3/session.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public interface SearchConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.SearchConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Boosting configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.BoostSpecs boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.BoostSpecs> getBoostSpecsList();
  /**
   *
   *
   * <pre>
   * Optional. Boosting configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.BoostSpecs boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.BoostSpecs getBoostSpecs(int index);
  /**
   *
   *
   * <pre>
   * Optional. Boosting configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.BoostSpecs boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getBoostSpecsCount();
  /**
   *
   *
   * <pre>
   * Optional. Boosting configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.BoostSpecs boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.BoostSpecsOrBuilder>
      getBoostSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Boosting configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.BoostSpecs boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.BoostSpecsOrBuilder getBoostSpecsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Filter configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.FilterSpecs filter_specs = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.FilterSpecs> getFilterSpecsList();
  /**
   *
   *
   * <pre>
   * Optional. Filter configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.FilterSpecs filter_specs = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.FilterSpecs getFilterSpecs(int index);
  /**
   *
   *
   * <pre>
   * Optional. Filter configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.FilterSpecs filter_specs = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getFilterSpecsCount();
  /**
   *
   *
   * <pre>
   * Optional. Filter configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.FilterSpecs filter_specs = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.FilterSpecsOrBuilder>
      getFilterSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Filter configuration for the datastores.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3.FilterSpecs filter_specs = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.FilterSpecsOrBuilder getFilterSpecsOrBuilder(int index);
}
