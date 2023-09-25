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
// source: google/cloud/documentai/v1beta1/document_understanding.proto

package com.google.cloud.documentai.v1beta1;

public interface ProcessDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta1.ProcessDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Information about the input file.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta1.InputConfig input_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Required. Information about the input file.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta1.InputConfig input_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.documentai.v1beta1.InputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Required. Information about the input file.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta1.InputConfig input_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.documentai.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The desired output location.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta1.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired output location.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta1.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The outputConfig.
   */
  com.google.cloud.documentai.v1beta1.OutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired output location.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta1.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.documentai.v1beta1.OutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies a known document type for deeper structure detection. Valid
   * values are currently "general" and "invoice". If not provided, "general"&#92;
   * is used as default. If any other value is given, the request is rejected.
   * </pre>
   *
   * <code>string document_type = 3;</code>
   *
   * @return The documentType.
   */
  java.lang.String getDocumentType();
  /**
   *
   *
   * <pre>
   * Specifies a known document type for deeper structure detection. Valid
   * values are currently "general" and "invoice". If not provided, "general"&#92;
   * is used as default. If any other value is given, the request is rejected.
   * </pre>
   *
   * <code>string document_type = 3;</code>
   *
   * @return The bytes for documentType.
   */
  com.google.protobuf.ByteString getDocumentTypeBytes();

  /**
   *
   *
   * <pre>
   * Controls table extraction behavior. If not specified, the system will
   * decide reasonable defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.TableExtractionParams table_extraction_params = 4;
   * </code>
   *
   * @return Whether the tableExtractionParams field is set.
   */
  boolean hasTableExtractionParams();
  /**
   *
   *
   * <pre>
   * Controls table extraction behavior. If not specified, the system will
   * decide reasonable defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.TableExtractionParams table_extraction_params = 4;
   * </code>
   *
   * @return The tableExtractionParams.
   */
  com.google.cloud.documentai.v1beta1.TableExtractionParams getTableExtractionParams();
  /**
   *
   *
   * <pre>
   * Controls table extraction behavior. If not specified, the system will
   * decide reasonable defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.TableExtractionParams table_extraction_params = 4;
   * </code>
   */
  com.google.cloud.documentai.v1beta1.TableExtractionParamsOrBuilder
      getTableExtractionParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Controls form extraction behavior. If not specified, the system will
   * decide reasonable defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.FormExtractionParams form_extraction_params = 5;</code>
   *
   * @return Whether the formExtractionParams field is set.
   */
  boolean hasFormExtractionParams();
  /**
   *
   *
   * <pre>
   * Controls form extraction behavior. If not specified, the system will
   * decide reasonable defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.FormExtractionParams form_extraction_params = 5;</code>
   *
   * @return The formExtractionParams.
   */
  com.google.cloud.documentai.v1beta1.FormExtractionParams getFormExtractionParams();
  /**
   *
   *
   * <pre>
   * Controls form extraction behavior. If not specified, the system will
   * decide reasonable defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.FormExtractionParams form_extraction_params = 5;</code>
   */
  com.google.cloud.documentai.v1beta1.FormExtractionParamsOrBuilder
      getFormExtractionParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Controls entity extraction behavior. If not specified, the system will
   * decide reasonable defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.EntityExtractionParams entity_extraction_params = 6;
   * </code>
   *
   * @return Whether the entityExtractionParams field is set.
   */
  boolean hasEntityExtractionParams();
  /**
   *
   *
   * <pre>
   * Controls entity extraction behavior. If not specified, the system will
   * decide reasonable defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.EntityExtractionParams entity_extraction_params = 6;
   * </code>
   *
   * @return The entityExtractionParams.
   */
  com.google.cloud.documentai.v1beta1.EntityExtractionParams getEntityExtractionParams();
  /**
   *
   *
   * <pre>
   * Controls entity extraction behavior. If not specified, the system will
   * decide reasonable defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.EntityExtractionParams entity_extraction_params = 6;
   * </code>
   */
  com.google.cloud.documentai.v1beta1.EntityExtractionParamsOrBuilder
      getEntityExtractionParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Controls OCR behavior. If not specified, the system will decide reasonable
   * defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.OcrParams ocr_params = 7;</code>
   *
   * @return Whether the ocrParams field is set.
   */
  boolean hasOcrParams();
  /**
   *
   *
   * <pre>
   * Controls OCR behavior. If not specified, the system will decide reasonable
   * defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.OcrParams ocr_params = 7;</code>
   *
   * @return The ocrParams.
   */
  com.google.cloud.documentai.v1beta1.OcrParams getOcrParams();
  /**
   *
   *
   * <pre>
   * Controls OCR behavior. If not specified, the system will decide reasonable
   * defaults.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.OcrParams ocr_params = 7;</code>
   */
  com.google.cloud.documentai.v1beta1.OcrParamsOrBuilder getOcrParamsOrBuilder();
}
