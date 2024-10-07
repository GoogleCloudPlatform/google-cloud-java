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
// source: google/cloud/aiplatform/v1/index.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface IndexDatapointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.IndexDatapoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique identifier of the datapoint.
   * </pre>
   *
   * <code>string datapoint_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The datapointId.
   */
  java.lang.String getDatapointId();
  /**
   *
   *
   * <pre>
   * Required. Unique identifier of the datapoint.
   * </pre>
   *
   * <code>string datapoint_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for datapointId.
   */
  com.google.protobuf.ByteString getDatapointIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Feature embedding vector for dense index. An array of numbers
   * with the length of [NearestNeighborSearchConfig.dimensions].
   * </pre>
   *
   * <code>repeated float feature_vector = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the featureVector.
   */
  java.util.List<java.lang.Float> getFeatureVectorList();
  /**
   *
   *
   * <pre>
   * Required. Feature embedding vector for dense index. An array of numbers
   * with the length of [NearestNeighborSearchConfig.dimensions].
   * </pre>
   *
   * <code>repeated float feature_vector = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of featureVector.
   */
  int getFeatureVectorCount();
  /**
   *
   *
   * <pre>
   * Required. Feature embedding vector for dense index. An array of numbers
   * with the length of [NearestNeighborSearchConfig.dimensions].
   * </pre>
   *
   * <code>repeated float feature_vector = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The featureVector at the given index.
   */
  float getFeatureVector(int index);

  /**
   *
   *
   * <pre>
   * Optional. Feature embedding vector for sparse index.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.IndexDatapoint.SparseEmbedding sparse_embedding = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparseEmbedding field is set.
   */
  boolean hasSparseEmbedding();
  /**
   *
   *
   * <pre>
   * Optional. Feature embedding vector for sparse index.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.IndexDatapoint.SparseEmbedding sparse_embedding = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparseEmbedding.
   */
  com.google.cloud.aiplatform.v1.IndexDatapoint.SparseEmbedding getSparseEmbedding();
  /**
   *
   *
   * <pre>
   * Optional. Feature embedding vector for sparse index.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.IndexDatapoint.SparseEmbedding sparse_embedding = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.IndexDatapoint.SparseEmbeddingOrBuilder
      getSparseEmbeddingOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses categorical tokens. See:
   * https://cloud.google.com/vertex-ai/docs/matching-engine/filtering
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.Restriction restricts = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.IndexDatapoint.Restriction> getRestrictsList();
  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses categorical tokens. See:
   * https://cloud.google.com/vertex-ai/docs/matching-engine/filtering
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.Restriction restricts = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.IndexDatapoint.Restriction getRestricts(int index);
  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses categorical tokens. See:
   * https://cloud.google.com/vertex-ai/docs/matching-engine/filtering
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.Restriction restricts = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getRestrictsCount();
  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses categorical tokens. See:
   * https://cloud.google.com/vertex-ai/docs/matching-engine/filtering
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.Restriction restricts = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.IndexDatapoint.RestrictionOrBuilder>
      getRestrictsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses categorical tokens. See:
   * https://cloud.google.com/vertex-ai/docs/matching-engine/filtering
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.Restriction restricts = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.IndexDatapoint.RestrictionOrBuilder getRestrictsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses numeric comparisons.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.NumericRestriction numeric_restricts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.IndexDatapoint.NumericRestriction>
      getNumericRestrictsList();
  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses numeric comparisons.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.NumericRestriction numeric_restricts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.IndexDatapoint.NumericRestriction getNumericRestricts(int index);
  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses numeric comparisons.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.NumericRestriction numeric_restricts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getNumericRestrictsCount();
  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses numeric comparisons.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.NumericRestriction numeric_restricts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.aiplatform.v1.IndexDatapoint.NumericRestrictionOrBuilder>
      getNumericRestrictsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. List of Restrict of the datapoint, used to perform "restricted
   * searches" where boolean rule are used to filter the subset of the database
   * eligible for matching. This uses numeric comparisons.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.IndexDatapoint.NumericRestriction numeric_restricts = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.IndexDatapoint.NumericRestrictionOrBuilder
      getNumericRestrictsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. CrowdingTag of the datapoint, the number of neighbors to return
   * in each crowding can be configured during query.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.IndexDatapoint.CrowdingTag crowding_tag = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the crowdingTag field is set.
   */
  boolean hasCrowdingTag();
  /**
   *
   *
   * <pre>
   * Optional. CrowdingTag of the datapoint, the number of neighbors to return
   * in each crowding can be configured during query.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.IndexDatapoint.CrowdingTag crowding_tag = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The crowdingTag.
   */
  com.google.cloud.aiplatform.v1.IndexDatapoint.CrowdingTag getCrowdingTag();
  /**
   *
   *
   * <pre>
   * Optional. CrowdingTag of the datapoint, the number of neighbors to return
   * in each crowding can be configured during query.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.IndexDatapoint.CrowdingTag crowding_tag = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.IndexDatapoint.CrowdingTagOrBuilder getCrowdingTagOrBuilder();
}
