// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/publisher_model.proto

package com.google.cloud.aiplatform.v1beta1;

public interface PublisherModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PublisherModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the PublisherModel.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the PublisherModel.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Immutable. The version ID of the PublisherModel.
   * A new version is committed when a new model version is uploaded under an
   * existing model id. It is an auto-incrementing decimal number in string
   * representation.
   * </pre>
   *
   * <code>string version_id = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The versionId.
   */
  java.lang.String getVersionId();
  /**
   * <pre>
   * Output only. Immutable. The version ID of the PublisherModel.
   * A new version is committed when a new model version is uploaded under an
   * existing model id. It is an auto-incrementing decimal number in string
   * representation.
   * </pre>
   *
   * <code>string version_id = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for versionId.
   */
  com.google.protobuf.ByteString
      getVersionIdBytes();

  /**
   * <pre>
   * Required. Indicates the open source category of the publisher model.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PublisherModel.OpenSourceCategory open_source_category = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for openSourceCategory.
   */
  int getOpenSourceCategoryValue();
  /**
   * <pre>
   * Required. Indicates the open source category of the publisher model.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PublisherModel.OpenSourceCategory open_source_category = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The openSourceCategory.
   */
  com.google.cloud.aiplatform.v1beta1.PublisherModel.OpenSourceCategory getOpenSourceCategory();

  /**
   * <pre>
   * Optional. Supported call-to-action options.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PublisherModel.CallToAction supported_actions = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the supportedActions field is set.
   */
  boolean hasSupportedActions();
  /**
   * <pre>
   * Optional. Supported call-to-action options.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PublisherModel.CallToAction supported_actions = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The supportedActions.
   */
  com.google.cloud.aiplatform.v1beta1.PublisherModel.CallToAction getSupportedActions();
  /**
   * <pre>
   * Optional. Supported call-to-action options.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PublisherModel.CallToAction supported_actions = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.aiplatform.v1beta1.PublisherModel.CallToActionOrBuilder getSupportedActionsOrBuilder();

  /**
   * <pre>
   * Optional. Additional information about the model's Frameworks.
   * </pre>
   *
   * <code>repeated string frameworks = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the frameworks.
   */
  java.util.List<java.lang.String>
      getFrameworksList();
  /**
   * <pre>
   * Optional. Additional information about the model's Frameworks.
   * </pre>
   *
   * <code>repeated string frameworks = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of frameworks.
   */
  int getFrameworksCount();
  /**
   * <pre>
   * Optional. Additional information about the model's Frameworks.
   * </pre>
   *
   * <code>repeated string frameworks = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The frameworks at the given index.
   */
  java.lang.String getFrameworks(int index);
  /**
   * <pre>
   * Optional. Additional information about the model's Frameworks.
   * </pre>
   *
   * <code>repeated string frameworks = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the frameworks at the given index.
   */
  com.google.protobuf.ByteString
      getFrameworksBytes(int index);

  /**
   * <pre>
   * Optional. Output only. Immutable. Used to indicate this model has a
   * publisher model and provide the template of the publisher model resource
   * name.
   * </pre>
   *
   * <code>string publisher_model_template = 30 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The publisherModelTemplate.
   */
  java.lang.String getPublisherModelTemplate();
  /**
   * <pre>
   * Optional. Output only. Immutable. Used to indicate this model has a
   * publisher model and provide the template of the publisher model resource
   * name.
   * </pre>
   *
   * <code>string publisher_model_template = 30 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for publisherModelTemplate.
   */
  com.google.protobuf.ByteString
      getPublisherModelTemplateBytes();

  /**
   * <pre>
   * Optional. The schemata that describes formats of the PublisherModel's
   * predictions and explanations as given and returned via
   * [PredictionService.Predict][google.cloud.aiplatform.v1beta1.PredictionService.Predict].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PredictSchemata predict_schemata = 31 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the predictSchemata field is set.
   */
  boolean hasPredictSchemata();
  /**
   * <pre>
   * Optional. The schemata that describes formats of the PublisherModel's
   * predictions and explanations as given and returned via
   * [PredictionService.Predict][google.cloud.aiplatform.v1beta1.PredictionService.Predict].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PredictSchemata predict_schemata = 31 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The predictSchemata.
   */
  com.google.cloud.aiplatform.v1beta1.PredictSchemata getPredictSchemata();
  /**
   * <pre>
   * Optional. The schemata that describes formats of the PublisherModel's
   * predictions and explanations as given and returned via
   * [PredictionService.Predict][google.cloud.aiplatform.v1beta1.PredictionService.Predict].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PredictSchemata predict_schemata = 31 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.aiplatform.v1beta1.PredictSchemataOrBuilder getPredictSchemataOrBuilder();
}
