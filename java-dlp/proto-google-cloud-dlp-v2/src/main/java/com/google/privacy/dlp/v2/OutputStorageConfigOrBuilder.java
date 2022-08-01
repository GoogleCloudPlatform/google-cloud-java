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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface OutputStorageConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.OutputStorageConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Store findings in an existing table or a new table in an existing
   * dataset. If table_id is not set a new one will be generated
   * for you with the following format:
   * dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for
   * generating the date details.
   * For Inspect, each column in an existing output table must have the same
   * name, type, and mode of a field in the `Finding` object.
   * For Risk, an existing output table should be the output of a previous
   * Risk analysis job run on the same source table, with the same privacy
   * metric and quasi-identifiers. Risk jobs that analyze the same table but
   * compute a different privacy metric, or use different sets of
   * quasi-identifiers, cannot store their results in the same table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   *
   * @return Whether the table field is set.
   */
  boolean hasTable();
  /**
   *
   *
   * <pre>
   * Store findings in an existing table or a new table in an existing
   * dataset. If table_id is not set a new one will be generated
   * for you with the following format:
   * dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for
   * generating the date details.
   * For Inspect, each column in an existing output table must have the same
   * name, type, and mode of a field in the `Finding` object.
   * For Risk, an existing output table should be the output of a previous
   * Risk analysis job run on the same source table, with the same privacy
   * metric and quasi-identifiers. Risk jobs that analyze the same table but
   * compute a different privacy metric, or use different sets of
   * quasi-identifiers, cannot store their results in the same table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   *
   * @return The table.
   */
  com.google.privacy.dlp.v2.BigQueryTable getTable();
  /**
   *
   *
   * <pre>
   * Store findings in an existing table or a new table in an existing
   * dataset. If table_id is not set a new one will be generated
   * for you with the following format:
   * dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for
   * generating the date details.
   * For Inspect, each column in an existing output table must have the same
   * name, type, and mode of a field in the `Finding` object.
   * For Risk, an existing output table should be the output of a previous
   * Risk analysis job run on the same source table, with the same privacy
   * metric and quasi-identifiers. Risk jobs that analyze the same table but
   * compute a different privacy metric, or use different sets of
   * quasi-identifiers, cannot store their results in the same table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   */
  com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableOrBuilder();

  /**
   *
   *
   * <pre>
   * Schema used for writing the findings for Inspect jobs. This field is only
   * used for Inspect and must be unspecified for Risk jobs. Columns are derived
   * from the `Finding` object. If appending to an existing table, any columns
   * from the predefined schema that are missing will be added. No columns in
   * the existing table will be deleted.
   * If unspecified, then all available columns will be used for a new table or
   * an (existing) table with no schema, and no changes will be made to an
   * existing table that has a schema.
   * Only for use with external storage.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.OutputStorageConfig.OutputSchema output_schema = 3;</code>
   *
   * @return The enum numeric value on the wire for outputSchema.
   */
  int getOutputSchemaValue();
  /**
   *
   *
   * <pre>
   * Schema used for writing the findings for Inspect jobs. This field is only
   * used for Inspect and must be unspecified for Risk jobs. Columns are derived
   * from the `Finding` object. If appending to an existing table, any columns
   * from the predefined schema that are missing will be added. No columns in
   * the existing table will be deleted.
   * If unspecified, then all available columns will be used for a new table or
   * an (existing) table with no schema, and no changes will be made to an
   * existing table that has a schema.
   * Only for use with external storage.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.OutputStorageConfig.OutputSchema output_schema = 3;</code>
   *
   * @return The outputSchema.
   */
  com.google.privacy.dlp.v2.OutputStorageConfig.OutputSchema getOutputSchema();

  public com.google.privacy.dlp.v2.OutputStorageConfig.TypeCase getTypeCase();
}
