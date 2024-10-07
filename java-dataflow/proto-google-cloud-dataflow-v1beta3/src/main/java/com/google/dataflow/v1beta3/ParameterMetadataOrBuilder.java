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

public interface ParameterMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.ParameterMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parameter.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the parameter.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The label to display for the parameter.
   * </pre>
   *
   * <code>string label = 2;</code>
   *
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   *
   *
   * <pre>
   * Required. The label to display for the parameter.
   * </pre>
   *
   * <code>string label = 2;</code>
   *
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString getLabelBytes();

  /**
   *
   *
   * <pre>
   * Required. The help text to display for the parameter.
   * </pre>
   *
   * <code>string help_text = 3;</code>
   *
   * @return The helpText.
   */
  java.lang.String getHelpText();
  /**
   *
   *
   * <pre>
   * Required. The help text to display for the parameter.
   * </pre>
   *
   * <code>string help_text = 3;</code>
   *
   * @return The bytes for helpText.
   */
  com.google.protobuf.ByteString getHelpTextBytes();

  /**
   *
   *
   * <pre>
   * Optional. Whether the parameter is optional. Defaults to false.
   * </pre>
   *
   * <code>bool is_optional = 4;</code>
   *
   * @return The isOptional.
   */
  boolean getIsOptional();

  /**
   *
   *
   * <pre>
   * Optional. Regexes that the parameter must match.
   * </pre>
   *
   * <code>repeated string regexes = 5;</code>
   *
   * @return A list containing the regexes.
   */
  java.util.List<java.lang.String> getRegexesList();
  /**
   *
   *
   * <pre>
   * Optional. Regexes that the parameter must match.
   * </pre>
   *
   * <code>repeated string regexes = 5;</code>
   *
   * @return The count of regexes.
   */
  int getRegexesCount();
  /**
   *
   *
   * <pre>
   * Optional. Regexes that the parameter must match.
   * </pre>
   *
   * <code>repeated string regexes = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The regexes at the given index.
   */
  java.lang.String getRegexes(int index);
  /**
   *
   *
   * <pre>
   * Optional. Regexes that the parameter must match.
   * </pre>
   *
   * <code>repeated string regexes = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the regexes at the given index.
   */
  com.google.protobuf.ByteString getRegexesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The type of the parameter.
   * Used for selecting input picker.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ParameterType param_type = 6;</code>
   *
   * @return The enum numeric value on the wire for paramType.
   */
  int getParamTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The type of the parameter.
   * Used for selecting input picker.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ParameterType param_type = 6;</code>
   *
   * @return The paramType.
   */
  com.google.dataflow.v1beta3.ParameterType getParamType();

  /**
   *
   *
   * <pre>
   * Optional. Additional metadata for describing this parameter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_metadata = 7;</code>
   */
  int getCustomMetadataCount();
  /**
   *
   *
   * <pre>
   * Optional. Additional metadata for describing this parameter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_metadata = 7;</code>
   */
  boolean containsCustomMetadata(java.lang.String key);
  /** Use {@link #getCustomMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getCustomMetadata();
  /**
   *
   *
   * <pre>
   * Optional. Additional metadata for describing this parameter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_metadata = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getCustomMetadataMap();
  /**
   *
   *
   * <pre>
   * Optional. Additional metadata for describing this parameter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_metadata = 7;</code>
   */
  /* nullable */
  java.lang.String getCustomMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Additional metadata for describing this parameter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; custom_metadata = 7;</code>
   */
  java.lang.String getCustomMetadataOrThrow(java.lang.String key);
}
