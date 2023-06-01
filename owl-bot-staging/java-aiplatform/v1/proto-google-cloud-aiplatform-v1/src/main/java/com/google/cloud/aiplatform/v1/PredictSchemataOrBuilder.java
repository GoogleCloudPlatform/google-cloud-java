// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model.proto

package com.google.cloud.aiplatform.v1;

public interface PredictSchemataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.PredictSchemata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Points to a YAML file stored on Google Cloud Storage describing
   * the format of a single instance, which are used in
   * [PredictRequest.instances][google.cloud.aiplatform.v1.PredictRequest.instances],
   * [ExplainRequest.instances][google.cloud.aiplatform.v1.ExplainRequest.instances]
   * and
   * [BatchPredictionJob.input_config][google.cloud.aiplatform.v1.BatchPredictionJob.input_config].
   * The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * AutoML Models always have this field populated by Vertex AI.
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string instance_schema_uri = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The instanceSchemaUri.
   */
  java.lang.String getInstanceSchemaUri();
  /**
   * <pre>
   * Immutable. Points to a YAML file stored on Google Cloud Storage describing
   * the format of a single instance, which are used in
   * [PredictRequest.instances][google.cloud.aiplatform.v1.PredictRequest.instances],
   * [ExplainRequest.instances][google.cloud.aiplatform.v1.ExplainRequest.instances]
   * and
   * [BatchPredictionJob.input_config][google.cloud.aiplatform.v1.BatchPredictionJob.input_config].
   * The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * AutoML Models always have this field populated by Vertex AI.
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string instance_schema_uri = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for instanceSchemaUri.
   */
  com.google.protobuf.ByteString
      getInstanceSchemaUriBytes();

  /**
   * <pre>
   * Immutable. Points to a YAML file stored on Google Cloud Storage describing
   * the parameters of prediction and explanation via
   * [PredictRequest.parameters][google.cloud.aiplatform.v1.PredictRequest.parameters],
   * [ExplainRequest.parameters][google.cloud.aiplatform.v1.ExplainRequest.parameters]
   * and
   * [BatchPredictionJob.model_parameters][google.cloud.aiplatform.v1.BatchPredictionJob.model_parameters].
   * The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * AutoML Models always have this field populated by Vertex AI, if no
   * parameters are supported, then it is set to an empty string.
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string parameters_schema_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The parametersSchemaUri.
   */
  java.lang.String getParametersSchemaUri();
  /**
   * <pre>
   * Immutable. Points to a YAML file stored on Google Cloud Storage describing
   * the parameters of prediction and explanation via
   * [PredictRequest.parameters][google.cloud.aiplatform.v1.PredictRequest.parameters],
   * [ExplainRequest.parameters][google.cloud.aiplatform.v1.ExplainRequest.parameters]
   * and
   * [BatchPredictionJob.model_parameters][google.cloud.aiplatform.v1.BatchPredictionJob.model_parameters].
   * The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * AutoML Models always have this field populated by Vertex AI, if no
   * parameters are supported, then it is set to an empty string.
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string parameters_schema_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for parametersSchemaUri.
   */
  com.google.protobuf.ByteString
      getParametersSchemaUriBytes();

  /**
   * <pre>
   * Immutable. Points to a YAML file stored on Google Cloud Storage describing
   * the format of a single prediction produced by this Model, which are
   * returned via
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions],
   * [ExplainResponse.explanations][google.cloud.aiplatform.v1.ExplainResponse.explanations],
   * and
   * [BatchPredictionJob.output_config][google.cloud.aiplatform.v1.BatchPredictionJob.output_config].
   * The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * AutoML Models always have this field populated by Vertex AI.
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string prediction_schema_uri = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The predictionSchemaUri.
   */
  java.lang.String getPredictionSchemaUri();
  /**
   * <pre>
   * Immutable. Points to a YAML file stored on Google Cloud Storage describing
   * the format of a single prediction produced by this Model, which are
   * returned via
   * [PredictResponse.predictions][google.cloud.aiplatform.v1.PredictResponse.predictions],
   * [ExplainResponse.explanations][google.cloud.aiplatform.v1.ExplainResponse.explanations],
   * and
   * [BatchPredictionJob.output_config][google.cloud.aiplatform.v1.BatchPredictionJob.output_config].
   * The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * AutoML Models always have this field populated by Vertex AI.
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string prediction_schema_uri = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for predictionSchemaUri.
   */
  com.google.protobuf.ByteString
      getPredictionSchemaUriBytes();
}
