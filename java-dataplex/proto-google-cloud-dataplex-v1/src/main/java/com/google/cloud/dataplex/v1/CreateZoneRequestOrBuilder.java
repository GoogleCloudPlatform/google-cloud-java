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
// source: google/cloud/dataplex/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

public interface CreateZoneRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.CreateZoneRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent lake:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent lake:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Zone identifier.
   * This ID will be used to generate names such as database and dataset names
   * when publishing metadata to Hive Metastore and BigQuery.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique across all lakes from all locations in a project.
   * * Must not be one of the reserved IDs (i.e. "default", "global-temp")
   * </pre>
   *
   * <code>string zone_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The zoneId.
   */
  java.lang.String getZoneId();
  /**
   *
   *
   * <pre>
   * Required. Zone identifier.
   * This ID will be used to generate names such as database and dataset names
   * when publishing metadata to Hive Metastore and BigQuery.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique across all lakes from all locations in a project.
   * * Must not be one of the reserved IDs (i.e. "default", "global-temp")
   * </pre>
   *
   * <code>string zone_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for zoneId.
   */
  com.google.protobuf.ByteString getZoneIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Zone resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the zone field is set.
   */
  boolean hasZone();
  /**
   *
   *
   * <pre>
   * Required. Zone resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The zone.
   */
  com.google.cloud.dataplex.v1.Zone getZone();
  /**
   *
   *
   * <pre>
   * Required. Zone resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataplex.v1.ZoneOrBuilder getZoneOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
