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
// source: google/dataflow/v1beta3/templates.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

public interface InvalidTemplateParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.InvalidTemplateParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Describes all parameter violations in a template request.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.InvalidTemplateParameters.ParameterViolation parameter_violations = 1;
   * </code>
   */
  java.util.List<com.google.dataflow.v1beta3.InvalidTemplateParameters.ParameterViolation>
      getParameterViolationsList();
  /**
   *
   *
   * <pre>
   * Describes all parameter violations in a template request.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.InvalidTemplateParameters.ParameterViolation parameter_violations = 1;
   * </code>
   */
  com.google.dataflow.v1beta3.InvalidTemplateParameters.ParameterViolation getParameterViolations(
      int index);
  /**
   *
   *
   * <pre>
   * Describes all parameter violations in a template request.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.InvalidTemplateParameters.ParameterViolation parameter_violations = 1;
   * </code>
   */
  int getParameterViolationsCount();
  /**
   *
   *
   * <pre>
   * Describes all parameter violations in a template request.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.InvalidTemplateParameters.ParameterViolation parameter_violations = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.dataflow.v1beta3.InvalidTemplateParameters.ParameterViolationOrBuilder>
      getParameterViolationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Describes all parameter violations in a template request.
   * </pre>
   *
   * <code>
   * repeated .google.dataflow.v1beta3.InvalidTemplateParameters.ParameterViolation parameter_violations = 1;
   * </code>
   */
  com.google.dataflow.v1beta3.InvalidTemplateParameters.ParameterViolationOrBuilder
      getParameterViolationsOrBuilder(int index);
}
