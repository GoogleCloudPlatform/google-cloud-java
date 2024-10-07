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
// source: google/cloud/datacatalog/v1beta1/policytagmanager.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1beta1;

public interface PolicyTagOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.PolicyTag)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Resource name of this policy tag, whose format is:
   * "projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{id}".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Resource name of this policy tag, whose format is:
   * "projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{id}".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. User defined name of this policy tag. It must: be unique within
   * the parent taxonomy; contain only unicode letters, numbers, underscores,
   * dashes and spaces; not start or end with spaces; and be at most 200 bytes
   * long when encoded in UTF-8.
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
   * Required. User defined name of this policy tag. It must: be unique within
   * the parent taxonomy; contain only unicode letters, numbers, underscores,
   * dashes and spaces; not start or end with spaces; and be at most 200 bytes
   * long when encoded in UTF-8.
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
   * Description of this policy tag. It must: contain only unicode characters,
   * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
   * long when encoded in UTF-8. If not set, defaults to an empty description.
   * If not set, defaults to an empty description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of this policy tag. It must: contain only unicode characters,
   * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
   * long when encoded in UTF-8. If not set, defaults to an empty description.
   * If not set, defaults to an empty description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Resource name of this policy tag's parent policy tag (e.g. for the
   * "LatLong" policy tag in the example above, this field contains the
   * resource name of the "Geolocation" policy tag). If empty, it means this
   * policy tag is a top level policy tag (e.g. this field is empty for the
   * "Geolocation" policy tag in the example above). If not set, defaults to an
   * empty string.
   * </pre>
   *
   * <code>string parent_policy_tag = 4;</code>
   *
   * @return The parentPolicyTag.
   */
  java.lang.String getParentPolicyTag();
  /**
   *
   *
   * <pre>
   * Resource name of this policy tag's parent policy tag (e.g. for the
   * "LatLong" policy tag in the example above, this field contains the
   * resource name of the "Geolocation" policy tag). If empty, it means this
   * policy tag is a top level policy tag (e.g. this field is empty for the
   * "Geolocation" policy tag in the example above). If not set, defaults to an
   * empty string.
   * </pre>
   *
   * <code>string parent_policy_tag = 4;</code>
   *
   * @return The bytes for parentPolicyTag.
   */
  com.google.protobuf.ByteString getParentPolicyTagBytes();

  /**
   *
   *
   * <pre>
   * Output only. Resource names of child policy tags of this policy tag.
   * </pre>
   *
   * <code>repeated string child_policy_tags = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the childPolicyTags.
   */
  java.util.List<java.lang.String> getChildPolicyTagsList();
  /**
   *
   *
   * <pre>
   * Output only. Resource names of child policy tags of this policy tag.
   * </pre>
   *
   * <code>repeated string child_policy_tags = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of childPolicyTags.
   */
  int getChildPolicyTagsCount();
  /**
   *
   *
   * <pre>
   * Output only. Resource names of child policy tags of this policy tag.
   * </pre>
   *
   * <code>repeated string child_policy_tags = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The childPolicyTags at the given index.
   */
  java.lang.String getChildPolicyTags(int index);
  /**
   *
   *
   * <pre>
   * Output only. Resource names of child policy tags of this policy tag.
   * </pre>
   *
   * <code>repeated string child_policy_tags = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the childPolicyTags at the given index.
   */
  com.google.protobuf.ByteString getChildPolicyTagsBytes(int index);
}
