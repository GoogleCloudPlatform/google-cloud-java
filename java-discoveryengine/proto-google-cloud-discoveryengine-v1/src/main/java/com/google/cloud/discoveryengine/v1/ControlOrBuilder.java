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
// source: google/cloud/discoveryengine/v1/control.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface ControlOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.Control)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Defines a boost-type control
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.BoostAction boost_action = 6;</code>
   *
   * @return Whether the boostAction field is set.
   */
  boolean hasBoostAction();
  /**
   *
   *
   * <pre>
   * Defines a boost-type control
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.BoostAction boost_action = 6;</code>
   *
   * @return The boostAction.
   */
  com.google.cloud.discoveryengine.v1.Control.BoostAction getBoostAction();
  /**
   *
   *
   * <pre>
   * Defines a boost-type control
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.BoostAction boost_action = 6;</code>
   */
  com.google.cloud.discoveryengine.v1.Control.BoostActionOrBuilder getBoostActionOrBuilder();

  /**
   *
   *
   * <pre>
   * Defines a filter-type control
   * Currently not supported by Recommendation
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.FilterAction filter_action = 7;</code>
   *
   * @return Whether the filterAction field is set.
   */
  boolean hasFilterAction();
  /**
   *
   *
   * <pre>
   * Defines a filter-type control
   * Currently not supported by Recommendation
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.FilterAction filter_action = 7;</code>
   *
   * @return The filterAction.
   */
  com.google.cloud.discoveryengine.v1.Control.FilterAction getFilterAction();
  /**
   *
   *
   * <pre>
   * Defines a filter-type control
   * Currently not supported by Recommendation
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.FilterAction filter_action = 7;</code>
   */
  com.google.cloud.discoveryengine.v1.Control.FilterActionOrBuilder getFilterActionOrBuilder();

  /**
   *
   *
   * <pre>
   * Defines a redirect-type control.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.RedirectAction redirect_action = 9;</code>
   *
   * @return Whether the redirectAction field is set.
   */
  boolean hasRedirectAction();
  /**
   *
   *
   * <pre>
   * Defines a redirect-type control.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.RedirectAction redirect_action = 9;</code>
   *
   * @return The redirectAction.
   */
  com.google.cloud.discoveryengine.v1.Control.RedirectAction getRedirectAction();
  /**
   *
   *
   * <pre>
   * Defines a redirect-type control.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.RedirectAction redirect_action = 9;</code>
   */
  com.google.cloud.discoveryengine.v1.Control.RedirectActionOrBuilder getRedirectActionOrBuilder();

  /**
   *
   *
   * <pre>
   * Treats a group of terms as synonyms of one another.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.SynonymsAction synonyms_action = 10;</code>
   *
   * @return Whether the synonymsAction field is set.
   */
  boolean hasSynonymsAction();
  /**
   *
   *
   * <pre>
   * Treats a group of terms as synonyms of one another.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.SynonymsAction synonyms_action = 10;</code>
   *
   * @return The synonymsAction.
   */
  com.google.cloud.discoveryengine.v1.Control.SynonymsAction getSynonymsAction();
  /**
   *
   *
   * <pre>
   * Treats a group of terms as synonyms of one another.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Control.SynonymsAction synonyms_action = 10;</code>
   */
  com.google.cloud.discoveryengine.v1.Control.SynonymsActionOrBuilder getSynonymsActionOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. Fully qualified name
   * `projects/&#42;&#47;locations/global/dataStore/&#42;&#47;controls/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. Fully qualified name
   * `projects/&#42;&#47;locations/global/dataStore/&#42;&#47;controls/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Human readable name. The identifier used in UI views.
   *
   * Must be UTF-8 encoded string. Length limit is 128 characters.
   * Otherwise an INVALID ARGUMENT error is thrown.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Human readable name. The identifier used in UI views.
   *
   * Must be UTF-8 encoded string. Length limit is 128 characters.
   * Otherwise an INVALID ARGUMENT error is thrown.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. List of all
   * [ServingConfig][google.cloud.discoveryengine.v1.ServingConfig] IDs this
   * control is attached to. May take up to 10 minutes to update after changes.
   * </pre>
   *
   * <code>
   * repeated string associated_serving_config_ids = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the associatedServingConfigIds.
   */
  java.util.List<java.lang.String> getAssociatedServingConfigIdsList();
  /**
   *
   *
   * <pre>
   * Output only. List of all
   * [ServingConfig][google.cloud.discoveryengine.v1.ServingConfig] IDs this
   * control is attached to. May take up to 10 minutes to update after changes.
   * </pre>
   *
   * <code>
   * repeated string associated_serving_config_ids = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of associatedServingConfigIds.
   */
  int getAssociatedServingConfigIdsCount();
  /**
   *
   *
   * <pre>
   * Output only. List of all
   * [ServingConfig][google.cloud.discoveryengine.v1.ServingConfig] IDs this
   * control is attached to. May take up to 10 minutes to update after changes.
   * </pre>
   *
   * <code>
   * repeated string associated_serving_config_ids = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The associatedServingConfigIds at the given index.
   */
  java.lang.String getAssociatedServingConfigIds(int index);
  /**
   *
   *
   * <pre>
   * Output only. List of all
   * [ServingConfig][google.cloud.discoveryengine.v1.ServingConfig] IDs this
   * control is attached to. May take up to 10 minutes to update after changes.
   * </pre>
   *
   * <code>
   * repeated string associated_serving_config_ids = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the associatedServingConfigIds at the given index.
   */
  com.google.protobuf.ByteString getAssociatedServingConfigIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. Immutable. What solution the control belongs to.
   *
   * Must be compatible with vertical of resource.
   * Otherwise an INVALID ARGUMENT error is thrown.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SolutionType solution_type = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for solutionType.
   */
  int getSolutionTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. What solution the control belongs to.
   *
   * Must be compatible with vertical of resource.
   * Otherwise an INVALID ARGUMENT error is thrown.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SolutionType solution_type = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The solutionType.
   */
  com.google.cloud.discoveryengine.v1.SolutionType getSolutionType();

  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only applies to
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * Currently only allow one use case per control.
   * Must be set when solution_type is
   * [SolutionType.SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchUseCase use_cases = 8;</code>
   *
   * @return A list containing the useCases.
   */
  java.util.List<com.google.cloud.discoveryengine.v1.SearchUseCase> getUseCasesList();
  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only applies to
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * Currently only allow one use case per control.
   * Must be set when solution_type is
   * [SolutionType.SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchUseCase use_cases = 8;</code>
   *
   * @return The count of useCases.
   */
  int getUseCasesCount();
  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only applies to
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * Currently only allow one use case per control.
   * Must be set when solution_type is
   * [SolutionType.SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchUseCase use_cases = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The useCases at the given index.
   */
  com.google.cloud.discoveryengine.v1.SearchUseCase getUseCases(int index);
  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only applies to
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * Currently only allow one use case per control.
   * Must be set when solution_type is
   * [SolutionType.SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchUseCase use_cases = 8;</code>
   *
   * @return A list containing the enum numeric values on the wire for useCases.
   */
  java.util.List<java.lang.Integer> getUseCasesValueList();
  /**
   *
   *
   * <pre>
   * Specifies the use case for the control.
   * Affects what condition fields can be set.
   * Only applies to
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * Currently only allow one use case per control.
   * Must be set when solution_type is
   * [SolutionType.SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.SearchUseCase use_cases = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of useCases at the given index.
   */
  int getUseCasesValue(int index);

  /**
   *
   *
   * <pre>
   * Determines when the associated action will trigger.
   *
   * Omit to always apply the action.
   * Currently only a single condition may be specified.
   * Otherwise an INVALID ARGUMENT error is thrown.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.Condition conditions = 5;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1.Condition> getConditionsList();
  /**
   *
   *
   * <pre>
   * Determines when the associated action will trigger.
   *
   * Omit to always apply the action.
   * Currently only a single condition may be specified.
   * Otherwise an INVALID ARGUMENT error is thrown.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.Condition conditions = 5;</code>
   */
  com.google.cloud.discoveryengine.v1.Condition getConditions(int index);
  /**
   *
   *
   * <pre>
   * Determines when the associated action will trigger.
   *
   * Omit to always apply the action.
   * Currently only a single condition may be specified.
   * Otherwise an INVALID ARGUMENT error is thrown.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.Condition conditions = 5;</code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * Determines when the associated action will trigger.
   *
   * Omit to always apply the action.
   * Currently only a single condition may be specified.
   * Otherwise an INVALID ARGUMENT error is thrown.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.Condition conditions = 5;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1.ConditionOrBuilder>
      getConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Determines when the associated action will trigger.
   *
   * Omit to always apply the action.
   * Currently only a single condition may be specified.
   * Otherwise an INVALID ARGUMENT error is thrown.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.Condition conditions = 5;</code>
   */
  com.google.cloud.discoveryengine.v1.ConditionOrBuilder getConditionsOrBuilder(int index);

  com.google.cloud.discoveryengine.v1.Control.ActionCase getActionCase();
}
