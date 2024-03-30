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
// source: google/cloud/aiplatform/v1/featurestore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface FeaturestoreOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Featurestore)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Name of the Featurestore. Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Name of the Featurestore. Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Featurestore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Featurestore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Featurestore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Featurestore was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Featurestore was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Featurestore was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * Featurestore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Featurestore(System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * Featurestore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Featurestore(System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * Featurestore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Featurestore(System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * Featurestore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Featurestore(System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * Featurestore.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Featurestore(System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Config for online storage resources. The field should not
   * co-exist with the field of `OnlineStoreReplicationConfig`. If both of it
   * and OnlineStoreReplicationConfig are unset, the feature store will not have
   * an online store and cannot be used for online serving.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Featurestore.OnlineServingConfig online_serving_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the onlineServingConfig field is set.
   */
  boolean hasOnlineServingConfig();
  /**
   *
   *
   * <pre>
   * Optional. Config for online storage resources. The field should not
   * co-exist with the field of `OnlineStoreReplicationConfig`. If both of it
   * and OnlineStoreReplicationConfig are unset, the feature store will not have
   * an online store and cannot be used for online serving.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Featurestore.OnlineServingConfig online_serving_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The onlineServingConfig.
   */
  com.google.cloud.aiplatform.v1.Featurestore.OnlineServingConfig getOnlineServingConfig();
  /**
   *
   *
   * <pre>
   * Optional. Config for online storage resources. The field should not
   * co-exist with the field of `OnlineStoreReplicationConfig`. If both of it
   * and OnlineStoreReplicationConfig are unset, the feature store will not have
   * an online store and cannot be used for online serving.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Featurestore.OnlineServingConfig online_serving_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.Featurestore.OnlineServingConfigOrBuilder
      getOnlineServingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the featurestore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Featurestore.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the featurestore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Featurestore.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1.Featurestore.State getState();

  /**
   *
   *
   * <pre>
   * Optional. TTL in days for feature values that will be stored in online
   * serving storage. The Feature Store online storage periodically removes
   * obsolete feature values older than `online_storage_ttl_days` since the
   * feature generation time. Note that `online_storage_ttl_days` should be less
   * than or equal to `offline_storage_ttl_days` for each EntityType under a
   * featurestore. If not set, default to 4000 days
   * </pre>
   *
   * <code>int32 online_storage_ttl_days = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The onlineStorageTtlDays.
   */
  int getOnlineStorageTtlDays();

  /**
   *
   *
   * <pre>
   * Optional. Customer-managed encryption key spec for data storage. If set,
   * both of the online and offline data storage will be secured by this key.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Optional. Customer-managed encryption key spec for data storage. If set,
   * both of the online and offline data storage will be secured by this key.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Optional. Customer-managed encryption key spec for data storage. If set,
   * both of the online and offline data storage will be secured by this key.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();
}
