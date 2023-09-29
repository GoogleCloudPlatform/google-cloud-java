// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/training_pipeline.proto

package com.google.cloud.aiplatform.v1;

public interface TrainingPipelineOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.TrainingPipeline)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the TrainingPipeline.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the TrainingPipeline.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The user-defined name of this TrainingPipeline.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The user-defined name of this TrainingPipeline.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Specifies Vertex AI owned input data that may be used for training the
   * Model. The TrainingPipeline's
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]
   * should make clear whether this config is used and if there are any special
   * requirements on how it should be filled. If nothing about this config is
   * mentioned in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition],
   * then it should be assumed that the TrainingPipeline does not depend on this
   * configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.InputDataConfig input_data_config = 3;</code>
   * @return Whether the inputDataConfig field is set.
   */
  boolean hasInputDataConfig();
  /**
   * <pre>
   * Specifies Vertex AI owned input data that may be used for training the
   * Model. The TrainingPipeline's
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]
   * should make clear whether this config is used and if there are any special
   * requirements on how it should be filled. If nothing about this config is
   * mentioned in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition],
   * then it should be assumed that the TrainingPipeline does not depend on this
   * configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.InputDataConfig input_data_config = 3;</code>
   * @return The inputDataConfig.
   */
  com.google.cloud.aiplatform.v1.InputDataConfig getInputDataConfig();
  /**
   * <pre>
   * Specifies Vertex AI owned input data that may be used for training the
   * Model. The TrainingPipeline's
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]
   * should make clear whether this config is used and if there are any special
   * requirements on how it should be filled. If nothing about this config is
   * mentioned in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition],
   * then it should be assumed that the TrainingPipeline does not depend on this
   * configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.InputDataConfig input_data_config = 3;</code>
   */
  com.google.cloud.aiplatform.v1.InputDataConfigOrBuilder getInputDataConfigOrBuilder();

  /**
   * <pre>
   * Required. A Google Cloud Storage path to the YAML file that defines the
   * training task which is responsible for producing the model artifact, and
   * may also include additional auxiliary work. The definition files that can
   * be used here are found in
   * gs://google-cloud-aiplatform/schema/trainingjob/definition/.
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string training_task_definition = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The trainingTaskDefinition.
   */
  java.lang.String getTrainingTaskDefinition();
  /**
   * <pre>
   * Required. A Google Cloud Storage path to the YAML file that defines the
   * training task which is responsible for producing the model artifact, and
   * may also include additional auxiliary work. The definition files that can
   * be used here are found in
   * gs://google-cloud-aiplatform/schema/trainingjob/definition/.
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string training_task_definition = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for trainingTaskDefinition.
   */
  com.google.protobuf.ByteString
      getTrainingTaskDefinitionBytes();

  /**
   * <pre>
   * Required. The training task's parameter(s), as specified in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]'s
   * `inputs`.
   * </pre>
   *
   * <code>.google.protobuf.Value training_task_inputs = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the trainingTaskInputs field is set.
   */
  boolean hasTrainingTaskInputs();
  /**
   * <pre>
   * Required. The training task's parameter(s), as specified in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]'s
   * `inputs`.
   * </pre>
   *
   * <code>.google.protobuf.Value training_task_inputs = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The trainingTaskInputs.
   */
  com.google.protobuf.Value getTrainingTaskInputs();
  /**
   * <pre>
   * Required. The training task's parameter(s), as specified in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]'s
   * `inputs`.
   * </pre>
   *
   * <code>.google.protobuf.Value training_task_inputs = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ValueOrBuilder getTrainingTaskInputsOrBuilder();

  /**
   * <pre>
   * Output only. The metadata information as specified in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]'s
   * `metadata`. This metadata is an auxiliary runtime and final information
   * about the training task. While the pipeline is running this information is
   * populated only at a best effort basis. Only present if the
   * pipeline's
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]
   * contains `metadata` object.
   * </pre>
   *
   * <code>.google.protobuf.Value training_task_metadata = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the trainingTaskMetadata field is set.
   */
  boolean hasTrainingTaskMetadata();
  /**
   * <pre>
   * Output only. The metadata information as specified in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]'s
   * `metadata`. This metadata is an auxiliary runtime and final information
   * about the training task. While the pipeline is running this information is
   * populated only at a best effort basis. Only present if the
   * pipeline's
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]
   * contains `metadata` object.
   * </pre>
   *
   * <code>.google.protobuf.Value training_task_metadata = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The trainingTaskMetadata.
   */
  com.google.protobuf.Value getTrainingTaskMetadata();
  /**
   * <pre>
   * Output only. The metadata information as specified in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]'s
   * `metadata`. This metadata is an auxiliary runtime and final information
   * about the training task. While the pipeline is running this information is
   * populated only at a best effort basis. Only present if the
   * pipeline's
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]
   * contains `metadata` object.
   * </pre>
   *
   * <code>.google.protobuf.Value training_task_metadata = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ValueOrBuilder getTrainingTaskMetadataOrBuilder();

  /**
   * <pre>
   * Describes the Model that may be uploaded (via
   * [ModelService.UploadModel][google.cloud.aiplatform.v1.ModelService.UploadModel])
   * by this TrainingPipeline. The TrainingPipeline's
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]
   * should make clear whether this Model description should be populated, and
   * if there are any special requirements regarding how it should be filled. If
   * nothing is mentioned in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition],
   * then it should be assumed that this field should not be filled and the
   * training task either uploads the Model without a need of this information,
   * or that training task does not support uploading a Model as part of the
   * pipeline. When the Pipeline's state becomes `PIPELINE_STATE_SUCCEEDED` and
   * the trained Model had been uploaded into Vertex AI, then the
   * model_to_upload's resource [name][google.cloud.aiplatform.v1.Model.name] is
   * populated. The Model is always uploaded into the Project and Location in
   * which this pipeline is.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Model model_to_upload = 7;</code>
   * @return Whether the modelToUpload field is set.
   */
  boolean hasModelToUpload();
  /**
   * <pre>
   * Describes the Model that may be uploaded (via
   * [ModelService.UploadModel][google.cloud.aiplatform.v1.ModelService.UploadModel])
   * by this TrainingPipeline. The TrainingPipeline's
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]
   * should make clear whether this Model description should be populated, and
   * if there are any special requirements regarding how it should be filled. If
   * nothing is mentioned in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition],
   * then it should be assumed that this field should not be filled and the
   * training task either uploads the Model without a need of this information,
   * or that training task does not support uploading a Model as part of the
   * pipeline. When the Pipeline's state becomes `PIPELINE_STATE_SUCCEEDED` and
   * the trained Model had been uploaded into Vertex AI, then the
   * model_to_upload's resource [name][google.cloud.aiplatform.v1.Model.name] is
   * populated. The Model is always uploaded into the Project and Location in
   * which this pipeline is.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Model model_to_upload = 7;</code>
   * @return The modelToUpload.
   */
  com.google.cloud.aiplatform.v1.Model getModelToUpload();
  /**
   * <pre>
   * Describes the Model that may be uploaded (via
   * [ModelService.UploadModel][google.cloud.aiplatform.v1.ModelService.UploadModel])
   * by this TrainingPipeline. The TrainingPipeline's
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition]
   * should make clear whether this Model description should be populated, and
   * if there are any special requirements regarding how it should be filled. If
   * nothing is mentioned in the
   * [training_task_definition][google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition],
   * then it should be assumed that this field should not be filled and the
   * training task either uploads the Model without a need of this information,
   * or that training task does not support uploading a Model as part of the
   * pipeline. When the Pipeline's state becomes `PIPELINE_STATE_SUCCEEDED` and
   * the trained Model had been uploaded into Vertex AI, then the
   * model_to_upload's resource [name][google.cloud.aiplatform.v1.Model.name] is
   * populated. The Model is always uploaded into the Project and Location in
   * which this pipeline is.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Model model_to_upload = 7;</code>
   */
  com.google.cloud.aiplatform.v1.ModelOrBuilder getModelToUploadOrBuilder();

  /**
   * <pre>
   * Optional. The ID to use for the uploaded Model, which will become the final
   * component of the model resource name.
   *
   * This value may be up to 63 characters, and valid characters are
   * `[a-z0-9_-]`. The first character cannot be a number or hyphen.
   * </pre>
   *
   * <code>string model_id = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <pre>
   * Optional. The ID to use for the uploaded Model, which will become the final
   * component of the model resource name.
   *
   * This value may be up to 63 characters, and valid characters are
   * `[a-z0-9_-]`. The first character cannot be a number or hyphen.
   * </pre>
   *
   * <code>string model_id = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <pre>
   * Optional. When specify this field, the `model_to_upload` will not be
   * uploaded as a new model, instead, it will become a new version of this
   * `parent_model`.
   * </pre>
   *
   * <code>string parent_model = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The parentModel.
   */
  java.lang.String getParentModel();
  /**
   * <pre>
   * Optional. When specify this field, the `model_to_upload` will not be
   * uploaded as a new model, instead, it will become a new version of this
   * `parent_model`.
   * </pre>
   *
   * <code>string parent_model = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for parentModel.
   */
  com.google.protobuf.ByteString
      getParentModelBytes();

  /**
   * <pre>
   * Output only. The detailed state of the pipeline.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.PipelineState state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The detailed state of the pipeline.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.PipelineState state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.aiplatform.v1.PipelineState getState();

  /**
   * <pre>
   * Output only. Only populated when the pipeline's state is
   * `PIPELINE_STATE_FAILED` or `PIPELINE_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Output only. Only populated when the pipeline's state is
   * `PIPELINE_STATE_FAILED` or `PIPELINE_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * Output only. Only populated when the pipeline's state is
   * `PIPELINE_STATE_FAILED` or `PIPELINE_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * Output only. Time when the TrainingPipeline was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Time when the TrainingPipeline was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Time when the TrainingPipeline was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time when the TrainingPipeline for the first time entered the
   * `PIPELINE_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Output only. Time when the TrainingPipeline for the first time entered the
   * `PIPELINE_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Output only. Time when the TrainingPipeline for the first time entered the
   * `PIPELINE_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time when the TrainingPipeline entered any of the following
   * states: `PIPELINE_STATE_SUCCEEDED`, `PIPELINE_STATE_FAILED`,
   * `PIPELINE_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Output only. Time when the TrainingPipeline entered any of the following
   * states: `PIPELINE_STATE_SUCCEEDED`, `PIPELINE_STATE_FAILED`,
   * `PIPELINE_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Output only. Time when the TrainingPipeline entered any of the following
   * states: `PIPELINE_STATE_SUCCEEDED`, `PIPELINE_STATE_FAILED`,
   * `PIPELINE_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time when the TrainingPipeline was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Time when the TrainingPipeline was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Time when the TrainingPipeline was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * The labels with user-defined metadata to organize TrainingPipelines.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The labels with user-defined metadata to organize TrainingPipelines.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * The labels with user-defined metadata to organize TrainingPipelines.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The labels with user-defined metadata to organize TrainingPipelines.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The labels with user-defined metadata to organize TrainingPipelines.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Customer-managed encryption key spec for a TrainingPipeline. If set, this
   * TrainingPipeline will be secured by this key.
   *
   * Note: Model trained by this TrainingPipeline is also secured by this key if
   * [model_to_upload][google.cloud.aiplatform.v1.TrainingPipeline.encryption_spec]
   * is not set separately.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 18;</code>
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   * <pre>
   * Customer-managed encryption key spec for a TrainingPipeline. If set, this
   * TrainingPipeline will be secured by this key.
   *
   * Note: Model trained by this TrainingPipeline is also secured by this key if
   * [model_to_upload][google.cloud.aiplatform.v1.TrainingPipeline.encryption_spec]
   * is not set separately.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 18;</code>
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1.EncryptionSpec getEncryptionSpec();
  /**
   * <pre>
   * Customer-managed encryption key spec for a TrainingPipeline. If set, this
   * TrainingPipeline will be secured by this key.
   *
   * Note: Model trained by this TrainingPipeline is also secured by this key if
   * [model_to_upload][google.cloud.aiplatform.v1.TrainingPipeline.encryption_spec]
   * is not set separately.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 18;</code>
   */
  com.google.cloud.aiplatform.v1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();
}
