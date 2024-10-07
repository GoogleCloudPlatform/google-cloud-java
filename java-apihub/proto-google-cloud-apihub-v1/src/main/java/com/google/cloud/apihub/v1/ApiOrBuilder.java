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
// source: google/cloud/apihub/v1/common_fields.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.apihub.v1;

public interface ApiOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.Api)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The name of the API resource in the API Hub.
   *
   * Format:
   * `projects/{project}/locations/{location}/apis/{api}`
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
   * Identifier. The name of the API resource in the API Hub.
   *
   * Format:
   * `projects/{project}/locations/{location}/apis/{api}`
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
   * Required. The display name of the API resource.
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
   * Required. The display name of the API resource.
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
   * Optional. The description of the API resource.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of the API resource.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The documentation for the API resource.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Documentation documentation = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the documentation field is set.
   */
  boolean hasDocumentation();
  /**
   *
   *
   * <pre>
   * Optional. The documentation for the API resource.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Documentation documentation = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The documentation.
   */
  com.google.cloud.apihub.v1.Documentation getDocumentation();
  /**
   *
   *
   * <pre>
   * Optional. The documentation for the API resource.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Documentation documentation = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.DocumentationOrBuilder getDocumentationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Owner details for the API resource.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Owner owner = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   *
   *
   * <pre>
   * Optional. Owner details for the API resource.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Owner owner = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The owner.
   */
  com.google.cloud.apihub.v1.Owner getOwner();
  /**
   *
   *
   * <pre>
   * Optional. Owner details for the API resource.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Owner owner = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.apihub.v1.OwnerOrBuilder getOwnerOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The list of versions present in an API resource.
   * Note: An API resource can be associated with more than 1 version.
   * Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * </pre>
   *
   * <code>
   * repeated string versions = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the versions.
   */
  java.util.List<java.lang.String> getVersionsList();
  /**
   *
   *
   * <pre>
   * Output only. The list of versions present in an API resource.
   * Note: An API resource can be associated with more than 1 version.
   * Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * </pre>
   *
   * <code>
   * repeated string versions = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of versions.
   */
  int getVersionsCount();
  /**
   *
   *
   * <pre>
   * Output only. The list of versions present in an API resource.
   * Note: An API resource can be associated with more than 1 version.
   * Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * </pre>
   *
   * <code>
   * repeated string versions = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The versions at the given index.
   */
  java.lang.String getVersions(int index);
  /**
   *
   *
   * <pre>
   * Output only. The list of versions present in an API resource.
   * Note: An API resource can be associated with more than 1 version.
   * Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * </pre>
   *
   * <code>
   * repeated string versions = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the versions at the given index.
   */
  com.google.protobuf.ByteString getVersionsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The time at which the API resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the API resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the API resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the API resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the API resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the API resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The target users for the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-target-user`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues target_user = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the targetUser field is set.
   */
  boolean hasTargetUser();
  /**
   *
   *
   * <pre>
   * Optional. The target users for the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-target-user`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues target_user = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The targetUser.
   */
  com.google.cloud.apihub.v1.AttributeValues getTargetUser();
  /**
   *
   *
   * <pre>
   * Optional. The target users for the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-target-user`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues target_user = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValuesOrBuilder getTargetUserOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The team owning the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-team`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues team = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the team field is set.
   */
  boolean hasTeam();
  /**
   *
   *
   * <pre>
   * Optional. The team owning the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-team`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues team = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The team.
   */
  com.google.cloud.apihub.v1.AttributeValues getTeam();
  /**
   *
   *
   * <pre>
   * Optional. The team owning the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-team`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues team = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValuesOrBuilder getTeamOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The business unit owning the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-business-unit`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues business_unit = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the businessUnit field is set.
   */
  boolean hasBusinessUnit();
  /**
   *
   *
   * <pre>
   * Optional. The business unit owning the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-business-unit`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues business_unit = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The businessUnit.
   */
  com.google.cloud.apihub.v1.AttributeValues getBusinessUnit();
  /**
   *
   *
   * <pre>
   * Optional. The business unit owning the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-business-unit`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues business_unit = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValuesOrBuilder getBusinessUnitOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The maturity level of the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-maturity-level`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues maturity_level = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maturityLevel field is set.
   */
  boolean hasMaturityLevel();
  /**
   *
   *
   * <pre>
   * Optional. The maturity level of the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-maturity-level`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues maturity_level = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maturityLevel.
   */
  com.google.cloud.apihub.v1.AttributeValues getMaturityLevel();
  /**
   *
   *
   * <pre>
   * Optional. The maturity level of the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-maturity-level`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues maturity_level = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValuesOrBuilder getMaturityLevelOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * resource. The key is the attribute name. It will be of the format:
   * `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAttributesCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * resource. The key is the attribute name. It will be of the format:
   * `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAttributes(java.lang.String key);
  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.apihub.v1.AttributeValues> getAttributes();
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * resource. The key is the attribute name. It will be of the format:
   * `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.apihub.v1.AttributeValues> getAttributesMap();
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * resource. The key is the attribute name. It will be of the format:
   * `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  com.google.cloud.apihub.v1.AttributeValues getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.apihub.v1.AttributeValues defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * resource. The key is the attribute name. It will be of the format:
   * `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValues getAttributesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The style of the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-style`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues api_style = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the apiStyle field is set.
   */
  boolean hasApiStyle();
  /**
   *
   *
   * <pre>
   * Optional. The style of the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-style`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues api_style = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The apiStyle.
   */
  com.google.cloud.apihub.v1.AttributeValues getApiStyle();
  /**
   *
   *
   * <pre>
   * Optional. The style of the API.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-style`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues api_style = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValuesOrBuilder getApiStyleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The selected version for an API resource.
   * This can be used when special handling is needed on client side for
   * particular version of the API. Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * </pre>
   *
   * <code>
   * string selected_version = 15 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The selectedVersion.
   */
  java.lang.String getSelectedVersion();
  /**
   *
   *
   * <pre>
   * Optional. The selected version for an API resource.
   * This can be used when special handling is needed on client side for
   * particular version of the API. Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * </pre>
   *
   * <code>
   * string selected_version = 15 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for selectedVersion.
   */
  com.google.protobuf.ByteString getSelectedVersionBytes();
}
