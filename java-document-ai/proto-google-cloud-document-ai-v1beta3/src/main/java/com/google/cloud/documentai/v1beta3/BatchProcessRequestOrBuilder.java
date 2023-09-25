/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface BatchProcessRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.BatchProcessRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of
   * [Processor][google.cloud.documentai.v1beta3.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion].
   * Format: `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of
   * [Processor][google.cloud.documentai.v1beta3.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion].
   * Format: `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig>
      getInputConfigsList();
  /**
   *
   *
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig getInputConfigs(
      int index);
  /**
   *
   *
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getInputConfigsCount();
  /**
   *
   *
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<
          ? extends
              com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfigOrBuilder>
      getInputConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfigOrBuilder
      getInputConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfig output_config = 3 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.documentai.v1beta3.BatchProcessRequest.output_config is deprecated.
   *     See google/cloud/documentai/v1beta3/document_processor_service.proto;l=524
   * @return Whether the outputConfig field is set.
   */
  @java.lang.Deprecated
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfig output_config = 3 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.documentai.v1beta3.BatchProcessRequest.output_config is deprecated.
   *     See google/cloud/documentai/v1beta3/document_processor_service.proto;l=524
   * @return The outputConfig.
   */
  @java.lang.Deprecated
  com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfig output_config = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfigOrBuilder
      getOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The input documents for the
   * [BatchProcessDocuments][google.cloud.documentai.v1beta3.DocumentProcessorService.BatchProcessDocuments]
   * method.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig input_documents = 5;</code>
   *
   * @return Whether the inputDocuments field is set.
   */
  boolean hasInputDocuments();
  /**
   *
   *
   * <pre>
   * The input documents for the
   * [BatchProcessDocuments][google.cloud.documentai.v1beta3.DocumentProcessorService.BatchProcessDocuments]
   * method.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig input_documents = 5;</code>
   *
   * @return The inputDocuments.
   */
  com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig getInputDocuments();
  /**
   *
   *
   * <pre>
   * The input documents for the
   * [BatchProcessDocuments][google.cloud.documentai.v1beta3.DocumentProcessorService.BatchProcessDocuments]
   * method.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig input_documents = 5;</code>
   */
  com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfigOrBuilder
      getInputDocumentsOrBuilder();

  /**
   *
   *
   * <pre>
   * The output configuration for the
   * [BatchProcessDocuments][google.cloud.documentai.v1beta3.DocumentProcessorService.BatchProcessDocuments]
   * method.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentOutputConfig document_output_config = 6;</code>
   *
   * @return Whether the documentOutputConfig field is set.
   */
  boolean hasDocumentOutputConfig();
  /**
   *
   *
   * <pre>
   * The output configuration for the
   * [BatchProcessDocuments][google.cloud.documentai.v1beta3.DocumentProcessorService.BatchProcessDocuments]
   * method.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentOutputConfig document_output_config = 6;</code>
   *
   * @return The documentOutputConfig.
   */
  com.google.cloud.documentai.v1beta3.DocumentOutputConfig getDocumentOutputConfig();
  /**
   *
   *
   * <pre>
   * The output configuration for the
   * [BatchProcessDocuments][google.cloud.documentai.v1beta3.DocumentProcessorService.BatchProcessDocuments]
   * method.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentOutputConfig document_output_config = 6;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentOutputConfigOrBuilder
      getDocumentOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether human review should be skipped for this request. Default to
   * `false`.
   * </pre>
   *
   * <code>bool skip_human_review = 4;</code>
   *
   * @return The skipHumanReview.
   */
  boolean getSkipHumanReview();

  /**
   *
   *
   * <pre>
   * Inference-time options for the process API
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessOptions process_options = 7;</code>
   *
   * @return Whether the processOptions field is set.
   */
  boolean hasProcessOptions();
  /**
   *
   *
   * <pre>
   * Inference-time options for the process API
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessOptions process_options = 7;</code>
   *
   * @return The processOptions.
   */
  com.google.cloud.documentai.v1beta3.ProcessOptions getProcessOptions();
  /**
   *
   *
   * <pre>
   * Inference-time options for the process API
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessOptions process_options = 7;</code>
   */
  com.google.cloud.documentai.v1beta3.ProcessOptionsOrBuilder getProcessOptionsOrBuilder();
}
