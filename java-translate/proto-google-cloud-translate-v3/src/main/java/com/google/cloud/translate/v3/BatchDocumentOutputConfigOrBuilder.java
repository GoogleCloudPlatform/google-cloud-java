/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface BatchDocumentOutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.BatchDocumentOutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud Storage destination for output content.
   * For every single input document (for example, gs://a/b/c.[extension]), we
   * generate at most 2 * n output files. (n is the # of target_language_codes
   * in the BatchTranslateDocumentRequest).
   * While the input documents are being processed, we write/update an index
   * file `index.csv` under `gcs_destination.output_uri_prefix` (for example,
   * gs://translation_output/index.csv) The index file is generated/updated as
   * new files are being translated. The format is:
   * input_document,target_language_code,translation_output,error_output,
   * glossary_translation_output,glossary_error_output
   * `input_document` is one file we matched using gcs_source.input_uri.
   * `target_language_code` is provided in the request.
   * `translation_output` contains the translations. (details provided below)
   * `error_output` contains the error message during processing of the file.
   * Both translations_file and errors_file could be empty strings if we have
   * no content to output.
   * `glossary_translation_output` and `glossary_error_output` are the
   * translated output/error when we apply glossaries. They could also be
   * empty if we have no content to output.
   * Once a row is present in index.csv, the input/output matching never
   * changes. Callers should also expect all the content in input_file are
   * processed and ready to be consumed (that is, no partial output file is
   * written).
   * Since index.csv will be keeping updated during the process, please make
   * sure there is no custom retention policy applied on the output bucket
   * that may avoid file updating.
   * (https://cloud.google.com/storage/docs/bucket-lock?hl=en#retention-policy)
   * The naming format of translation output files follows (for target
   * language code [trg]): `translation_output`:
   * gs://translation_output/a_b_c_[trg]_translation.[extension]
   * `glossary_translation_output`:
   * gs://translation_test/a_b_c_[trg]_glossary_translation.[extension] The
   * output document will maintain the same file format as the input document.
   * The naming format of error output files follows (for target language code
   * [trg]): `error_output`: gs://translation_test/a_b_c_[trg]_errors.txt
   * `glossary_error_output`:
   * gs://translation_test/a_b_c_[trg]_glossary_translation.txt The error
   * output is a txt file containing error details.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage destination for output content.
   * For every single input document (for example, gs://a/b/c.[extension]), we
   * generate at most 2 * n output files. (n is the # of target_language_codes
   * in the BatchTranslateDocumentRequest).
   * While the input documents are being processed, we write/update an index
   * file `index.csv` under `gcs_destination.output_uri_prefix` (for example,
   * gs://translation_output/index.csv) The index file is generated/updated as
   * new files are being translated. The format is:
   * input_document,target_language_code,translation_output,error_output,
   * glossary_translation_output,glossary_error_output
   * `input_document` is one file we matched using gcs_source.input_uri.
   * `target_language_code` is provided in the request.
   * `translation_output` contains the translations. (details provided below)
   * `error_output` contains the error message during processing of the file.
   * Both translations_file and errors_file could be empty strings if we have
   * no content to output.
   * `glossary_translation_output` and `glossary_error_output` are the
   * translated output/error when we apply glossaries. They could also be
   * empty if we have no content to output.
   * Once a row is present in index.csv, the input/output matching never
   * changes. Callers should also expect all the content in input_file are
   * processed and ready to be consumed (that is, no partial output file is
   * written).
   * Since index.csv will be keeping updated during the process, please make
   * sure there is no custom retention policy applied on the output bucket
   * that may avoid file updating.
   * (https://cloud.google.com/storage/docs/bucket-lock?hl=en#retention-policy)
   * The naming format of translation output files follows (for target
   * language code [trg]): `translation_output`:
   * gs://translation_output/a_b_c_[trg]_translation.[extension]
   * `glossary_translation_output`:
   * gs://translation_test/a_b_c_[trg]_glossary_translation.[extension] The
   * output document will maintain the same file format as the input document.
   * The naming format of error output files follows (for target language code
   * [trg]): `error_output`: gs://translation_test/a_b_c_[trg]_errors.txt
   * `glossary_error_output`:
   * gs://translation_test/a_b_c_[trg]_glossary_translation.txt The error
   * output is a txt file containing error details.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.translate.v3.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage destination for output content.
   * For every single input document (for example, gs://a/b/c.[extension]), we
   * generate at most 2 * n output files. (n is the # of target_language_codes
   * in the BatchTranslateDocumentRequest).
   * While the input documents are being processed, we write/update an index
   * file `index.csv` under `gcs_destination.output_uri_prefix` (for example,
   * gs://translation_output/index.csv) The index file is generated/updated as
   * new files are being translated. The format is:
   * input_document,target_language_code,translation_output,error_output,
   * glossary_translation_output,glossary_error_output
   * `input_document` is one file we matched using gcs_source.input_uri.
   * `target_language_code` is provided in the request.
   * `translation_output` contains the translations. (details provided below)
   * `error_output` contains the error message during processing of the file.
   * Both translations_file and errors_file could be empty strings if we have
   * no content to output.
   * `glossary_translation_output` and `glossary_error_output` are the
   * translated output/error when we apply glossaries. They could also be
   * empty if we have no content to output.
   * Once a row is present in index.csv, the input/output matching never
   * changes. Callers should also expect all the content in input_file are
   * processed and ready to be consumed (that is, no partial output file is
   * written).
   * Since index.csv will be keeping updated during the process, please make
   * sure there is no custom retention policy applied on the output bucket
   * that may avoid file updating.
   * (https://cloud.google.com/storage/docs/bucket-lock?hl=en#retention-policy)
   * The naming format of translation output files follows (for target
   * language code [trg]): `translation_output`:
   * gs://translation_output/a_b_c_[trg]_translation.[extension]
   * `glossary_translation_output`:
   * gs://translation_test/a_b_c_[trg]_glossary_translation.[extension] The
   * output document will maintain the same file format as the input document.
   * The naming format of error output files follows (for target language code
   * [trg]): `error_output`: gs://translation_test/a_b_c_[trg]_errors.txt
   * `glossary_error_output`:
   * gs://translation_test/a_b_c_[trg]_glossary_translation.txt The error
   * output is a txt file containing error details.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.translate.v3.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  public com.google.cloud.translate.v3.BatchDocumentOutputConfig.DestinationCase
      getDestinationCase();
}
