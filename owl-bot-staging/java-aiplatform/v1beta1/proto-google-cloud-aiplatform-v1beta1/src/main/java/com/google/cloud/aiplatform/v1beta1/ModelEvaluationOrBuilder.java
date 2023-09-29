// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_evaluation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ModelEvaluationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelEvaluation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the ModelEvaluation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the ModelEvaluation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The display name of the ModelEvaluation.
   * </pre>
   *
   * <code>string display_name = 10;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The display name of the ModelEvaluation.
   * </pre>
   *
   * <code>string display_name = 10;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Points to a YAML file stored on Google Cloud Storage describing the
   * [metrics][google.cloud.aiplatform.v1beta1.ModelEvaluation.metrics] of this
   * ModelEvaluation. The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * </pre>
   *
   * <code>string metrics_schema_uri = 2;</code>
   * @return The metricsSchemaUri.
   */
  java.lang.String getMetricsSchemaUri();
  /**
   * <pre>
   * Points to a YAML file stored on Google Cloud Storage describing the
   * [metrics][google.cloud.aiplatform.v1beta1.ModelEvaluation.metrics] of this
   * ModelEvaluation. The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * </pre>
   *
   * <code>string metrics_schema_uri = 2;</code>
   * @return The bytes for metricsSchemaUri.
   */
  com.google.protobuf.ByteString
      getMetricsSchemaUriBytes();

  /**
   * <pre>
   * Evaluation metrics of the Model. The schema of the metrics is stored in
   * [metrics_schema_uri][google.cloud.aiplatform.v1beta1.ModelEvaluation.metrics_schema_uri]
   * </pre>
   *
   * <code>.google.protobuf.Value metrics = 3;</code>
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   * <pre>
   * Evaluation metrics of the Model. The schema of the metrics is stored in
   * [metrics_schema_uri][google.cloud.aiplatform.v1beta1.ModelEvaluation.metrics_schema_uri]
   * </pre>
   *
   * <code>.google.protobuf.Value metrics = 3;</code>
   * @return The metrics.
   */
  com.google.protobuf.Value getMetrics();
  /**
   * <pre>
   * Evaluation metrics of the Model. The schema of the metrics is stored in
   * [metrics_schema_uri][google.cloud.aiplatform.v1beta1.ModelEvaluation.metrics_schema_uri]
   * </pre>
   *
   * <code>.google.protobuf.Value metrics = 3;</code>
   */
  com.google.protobuf.ValueOrBuilder getMetricsOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when this ModelEvaluation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this ModelEvaluation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this ModelEvaluation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * All possible
   * [dimensions][google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.Slice.dimension]
   * of ModelEvaluationSlices. The dimensions can be used as the filter of the
   * [ModelService.ListModelEvaluationSlices][google.cloud.aiplatform.v1beta1.ModelService.ListModelEvaluationSlices]
   * request, in the form of `slice.dimension = &lt;dimension&gt;`.
   * </pre>
   *
   * <code>repeated string slice_dimensions = 5;</code>
   * @return A list containing the sliceDimensions.
   */
  java.util.List<java.lang.String>
      getSliceDimensionsList();
  /**
   * <pre>
   * All possible
   * [dimensions][google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.Slice.dimension]
   * of ModelEvaluationSlices. The dimensions can be used as the filter of the
   * [ModelService.ListModelEvaluationSlices][google.cloud.aiplatform.v1beta1.ModelService.ListModelEvaluationSlices]
   * request, in the form of `slice.dimension = &lt;dimension&gt;`.
   * </pre>
   *
   * <code>repeated string slice_dimensions = 5;</code>
   * @return The count of sliceDimensions.
   */
  int getSliceDimensionsCount();
  /**
   * <pre>
   * All possible
   * [dimensions][google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.Slice.dimension]
   * of ModelEvaluationSlices. The dimensions can be used as the filter of the
   * [ModelService.ListModelEvaluationSlices][google.cloud.aiplatform.v1beta1.ModelService.ListModelEvaluationSlices]
   * request, in the form of `slice.dimension = &lt;dimension&gt;`.
   * </pre>
   *
   * <code>repeated string slice_dimensions = 5;</code>
   * @param index The index of the element to return.
   * @return The sliceDimensions at the given index.
   */
  java.lang.String getSliceDimensions(int index);
  /**
   * <pre>
   * All possible
   * [dimensions][google.cloud.aiplatform.v1beta1.ModelEvaluationSlice.Slice.dimension]
   * of ModelEvaluationSlices. The dimensions can be used as the filter of the
   * [ModelService.ListModelEvaluationSlices][google.cloud.aiplatform.v1beta1.ModelService.ListModelEvaluationSlices]
   * request, in the form of `slice.dimension = &lt;dimension&gt;`.
   * </pre>
   *
   * <code>repeated string slice_dimensions = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the sliceDimensions at the given index.
   */
  com.google.protobuf.ByteString
      getSliceDimensionsBytes(int index);

  /**
   * <pre>
   * Aggregated explanation metrics for the Model's prediction output over the
   * data this ModelEvaluation uses. This field is populated only if the Model
   * is evaluated with explanations, and only for AutoML tabular Models.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelExplanation model_explanation = 8;</code>
   * @return Whether the modelExplanation field is set.
   */
  boolean hasModelExplanation();
  /**
   * <pre>
   * Aggregated explanation metrics for the Model's prediction output over the
   * data this ModelEvaluation uses. This field is populated only if the Model
   * is evaluated with explanations, and only for AutoML tabular Models.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelExplanation model_explanation = 8;</code>
   * @return The modelExplanation.
   */
  com.google.cloud.aiplatform.v1beta1.ModelExplanation getModelExplanation();
  /**
   * <pre>
   * Aggregated explanation metrics for the Model's prediction output over the
   * data this ModelEvaluation uses. This field is populated only if the Model
   * is evaluated with explanations, and only for AutoML tabular Models.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelExplanation model_explanation = 8;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelExplanationOrBuilder getModelExplanationOrBuilder();

  /**
   * <pre>
   * Describes the values of
   * [ExplanationSpec][google.cloud.aiplatform.v1beta1.ExplanationSpec] that are
   * used for explaining the predicted values on the evaluated data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation.ModelEvaluationExplanationSpec explanation_specs = 9;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelEvaluation.ModelEvaluationExplanationSpec> 
      getExplanationSpecsList();
  /**
   * <pre>
   * Describes the values of
   * [ExplanationSpec][google.cloud.aiplatform.v1beta1.ExplanationSpec] that are
   * used for explaining the predicted values on the evaluated data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation.ModelEvaluationExplanationSpec explanation_specs = 9;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluation.ModelEvaluationExplanationSpec getExplanationSpecs(int index);
  /**
   * <pre>
   * Describes the values of
   * [ExplanationSpec][google.cloud.aiplatform.v1beta1.ExplanationSpec] that are
   * used for explaining the predicted values on the evaluated data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation.ModelEvaluationExplanationSpec explanation_specs = 9;</code>
   */
  int getExplanationSpecsCount();
  /**
   * <pre>
   * Describes the values of
   * [ExplanationSpec][google.cloud.aiplatform.v1beta1.ExplanationSpec] that are
   * used for explaining the predicted values on the evaluated data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation.ModelEvaluationExplanationSpec explanation_specs = 9;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelEvaluation.ModelEvaluationExplanationSpecOrBuilder> 
      getExplanationSpecsOrBuilderList();
  /**
   * <pre>
   * Describes the values of
   * [ExplanationSpec][google.cloud.aiplatform.v1beta1.ExplanationSpec] that are
   * used for explaining the predicted values on the evaluated data.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation.ModelEvaluationExplanationSpec explanation_specs = 9;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluation.ModelEvaluationExplanationSpecOrBuilder getExplanationSpecsOrBuilder(
      int index);

  /**
   * <pre>
   * The metadata of the ModelEvaluation.
   * For the ModelEvaluation uploaded from Managed Pipeline, metadata contains a
   * structured value with keys of "pipeline_job_id", "evaluation_dataset_type",
   * "evaluation_dataset_path".
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 11;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * The metadata of the ModelEvaluation.
   * For the ModelEvaluation uploaded from Managed Pipeline, metadata contains a
   * structured value with keys of "pipeline_job_id", "evaluation_dataset_type",
   * "evaluation_dataset_path".
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 11;</code>
   * @return The metadata.
   */
  com.google.protobuf.Value getMetadata();
  /**
   * <pre>
   * The metadata of the ModelEvaluation.
   * For the ModelEvaluation uploaded from Managed Pipeline, metadata contains a
   * structured value with keys of "pipeline_job_id", "evaluation_dataset_type",
   * "evaluation_dataset_path".
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 11;</code>
   */
  com.google.protobuf.ValueOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Specify the configuration for bias detection.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelEvaluation.BiasConfig bias_configs = 12;</code>
   * @return Whether the biasConfigs field is set.
   */
  boolean hasBiasConfigs();
  /**
   * <pre>
   * Specify the configuration for bias detection.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelEvaluation.BiasConfig bias_configs = 12;</code>
   * @return The biasConfigs.
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluation.BiasConfig getBiasConfigs();
  /**
   * <pre>
   * Specify the configuration for bias detection.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelEvaluation.BiasConfig bias_configs = 12;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluation.BiasConfigOrBuilder getBiasConfigsOrBuilder();
}
