// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/dataset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ExportDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExportDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All of the files that are exported in this export operation. For custom
   * code training export, only three (training, validation and test)
   * Cloud Storage paths in wildcard format are populated
   * (for example, gs://.../training-*).
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   * @return A list containing the exportedFiles.
   */
  java.util.List<java.lang.String>
      getExportedFilesList();
  /**
   * <pre>
   * All of the files that are exported in this export operation. For custom
   * code training export, only three (training, validation and test)
   * Cloud Storage paths in wildcard format are populated
   * (for example, gs://.../training-*).
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   * @return The count of exportedFiles.
   */
  int getExportedFilesCount();
  /**
   * <pre>
   * All of the files that are exported in this export operation. For custom
   * code training export, only three (training, validation and test)
   * Cloud Storage paths in wildcard format are populated
   * (for example, gs://.../training-*).
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   * @param index The index of the element to return.
   * @return The exportedFiles at the given index.
   */
  java.lang.String getExportedFiles(int index);
  /**
   * <pre>
   * All of the files that are exported in this export operation. For custom
   * code training export, only three (training, validation and test)
   * Cloud Storage paths in wildcard format are populated
   * (for example, gs://.../training-*).
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the exportedFiles at the given index.
   */
  com.google.protobuf.ByteString
      getExportedFilesBytes(int index);

  /**
   * <pre>
   * Only present for custom code training export use case. Records data stats,
   * i.e., train/validation/test item/annotation counts calculated during
   * the export operation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Model.DataStats data_stats = 2;</code>
   * @return Whether the dataStats field is set.
   */
  boolean hasDataStats();
  /**
   * <pre>
   * Only present for custom code training export use case. Records data stats,
   * i.e., train/validation/test item/annotation counts calculated during
   * the export operation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Model.DataStats data_stats = 2;</code>
   * @return The dataStats.
   */
  com.google.cloud.aiplatform.v1.Model.DataStats getDataStats();
  /**
   * <pre>
   * Only present for custom code training export use case. Records data stats,
   * i.e., train/validation/test item/annotation counts calculated during
   * the export operation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Model.DataStats data_stats = 2;</code>
   */
  com.google.cloud.aiplatform.v1.Model.DataStatsOrBuilder getDataStatsOrBuilder();
}
