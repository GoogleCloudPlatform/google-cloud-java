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
// source: google/cloud/automl/v1/classification.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1;

public interface ClassificationEvaluationMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.ClassificationEvaluationMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The Area Under Precision-Recall Curve metric. Micro-averaged
   * for the overall evaluation.
   * </pre>
   *
   * <code>float au_prc = 1;</code>
   *
   * @return The auPrc.
   */
  float getAuPrc();

  /**
   *
   *
   * <pre>
   * Output only. The Area Under Receiver Operating Characteristic curve metric.
   * Micro-averaged for the overall evaluation.
   * </pre>
   *
   * <code>float au_roc = 6;</code>
   *
   * @return The auRoc.
   */
  float getAuRoc();

  /**
   *
   *
   * <pre>
   * Output only. The Log Loss metric.
   * </pre>
   *
   * <code>float log_loss = 7;</code>
   *
   * @return The logLoss.
   */
  float getLogLoss();

  /**
   *
   *
   * <pre>
   * Output only. Metrics for each confidence_threshold in
   * 0.00,0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and
   * position_threshold = INT32_MAX_VALUE.
   * ROC and precision-recall curves, and other aggregated metrics are derived
   * from them. The confidence metrics entries may also be supplied for
   * additional values of position_threshold, but from these no aggregated
   * metrics are computed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entry = 3;
   * </code>
   */
  java.util.List<com.google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfidenceMetricsEntry>
      getConfidenceMetricsEntryList();
  /**
   *
   *
   * <pre>
   * Output only. Metrics for each confidence_threshold in
   * 0.00,0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and
   * position_threshold = INT32_MAX_VALUE.
   * ROC and precision-recall curves, and other aggregated metrics are derived
   * from them. The confidence metrics entries may also be supplied for
   * additional values of position_threshold, but from these no aggregated
   * metrics are computed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entry = 3;
   * </code>
   */
  com.google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfidenceMetricsEntry
      getConfidenceMetricsEntry(int index);
  /**
   *
   *
   * <pre>
   * Output only. Metrics for each confidence_threshold in
   * 0.00,0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and
   * position_threshold = INT32_MAX_VALUE.
   * ROC and precision-recall curves, and other aggregated metrics are derived
   * from them. The confidence metrics entries may also be supplied for
   * additional values of position_threshold, but from these no aggregated
   * metrics are computed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entry = 3;
   * </code>
   */
  int getConfidenceMetricsEntryCount();
  /**
   *
   *
   * <pre>
   * Output only. Metrics for each confidence_threshold in
   * 0.00,0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and
   * position_threshold = INT32_MAX_VALUE.
   * ROC and precision-recall curves, and other aggregated metrics are derived
   * from them. The confidence metrics entries may also be supplied for
   * additional values of position_threshold, but from these no aggregated
   * metrics are computed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entry = 3;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.automl.v1.ClassificationEvaluationMetrics
                  .ConfidenceMetricsEntryOrBuilder>
      getConfidenceMetricsEntryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Metrics for each confidence_threshold in
   * 0.00,0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and
   * position_threshold = INT32_MAX_VALUE.
   * ROC and precision-recall curves, and other aggregated metrics are derived
   * from them. The confidence metrics entries may also be supplied for
   * additional values of position_threshold, but from these no aggregated
   * metrics are computed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entry = 3;
   * </code>
   */
  com.google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfidenceMetricsEntryOrBuilder
      getConfidenceMetricsEntryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Confusion matrix of the evaluation.
   * Only set for MULTICLASS classification problems where number
   * of labels is no more than 10.
   * Only set for model level evaluation, not for evaluation per label.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfusionMatrix confusion_matrix = 4;
   * </code>
   *
   * @return Whether the confusionMatrix field is set.
   */
  boolean hasConfusionMatrix();
  /**
   *
   *
   * <pre>
   * Output only. Confusion matrix of the evaluation.
   * Only set for MULTICLASS classification problems where number
   * of labels is no more than 10.
   * Only set for model level evaluation, not for evaluation per label.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfusionMatrix confusion_matrix = 4;
   * </code>
   *
   * @return The confusionMatrix.
   */
  com.google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfusionMatrix getConfusionMatrix();
  /**
   *
   *
   * <pre>
   * Output only. Confusion matrix of the evaluation.
   * Only set for MULTICLASS classification problems where number
   * of labels is no more than 10.
   * Only set for model level evaluation, not for evaluation per label.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfusionMatrix confusion_matrix = 4;
   * </code>
   */
  com.google.cloud.automl.v1.ClassificationEvaluationMetrics.ConfusionMatrixOrBuilder
      getConfusionMatrixOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The annotation spec ids used for this evaluation.
   * </pre>
   *
   * <code>repeated string annotation_spec_id = 5;</code>
   *
   * @return A list containing the annotationSpecId.
   */
  java.util.List<java.lang.String> getAnnotationSpecIdList();
  /**
   *
   *
   * <pre>
   * Output only. The annotation spec ids used for this evaluation.
   * </pre>
   *
   * <code>repeated string annotation_spec_id = 5;</code>
   *
   * @return The count of annotationSpecId.
   */
  int getAnnotationSpecIdCount();
  /**
   *
   *
   * <pre>
   * Output only. The annotation spec ids used for this evaluation.
   * </pre>
   *
   * <code>repeated string annotation_spec_id = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The annotationSpecId at the given index.
   */
  java.lang.String getAnnotationSpecId(int index);
  /**
   *
   *
   * <pre>
   * Output only. The annotation spec ids used for this evaluation.
   * </pre>
   *
   * <code>repeated string annotation_spec_id = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the annotationSpecId at the given index.
   */
  com.google.protobuf.ByteString getAnnotationSpecIdBytes(int index);
}
