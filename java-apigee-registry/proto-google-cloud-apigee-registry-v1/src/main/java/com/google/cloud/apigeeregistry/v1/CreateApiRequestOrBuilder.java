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
// source: google/cloud/apigeeregistry/v1/registry_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.apigeeregistry.v1;

public interface CreateApiRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.CreateApiRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of APIs.
   * Format: `projects/&#42;&#47;locations/&#42;`
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
   * Required. The parent, which owns this collection of APIs.
   * Format: `projects/&#42;&#47;locations/&#42;`
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
   * Required. The API to create.
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the api field is set.
   */
  boolean hasApi();
  /**
   *
   *
   * <pre>
   * Required. The API to create.
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The api.
   */
  com.google.cloud.apigeeregistry.v1.Api getApi();
  /**
   *
   *
   * <pre>
   * Required. The API to create.
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.apigeeregistry.v1.ApiOrBuilder getApiOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the API, which will become the final component of
   * the API's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   *
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The apiId.
   */
  java.lang.String getApiId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the API, which will become the final component of
   * the API's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   *
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for apiId.
   */
  com.google.protobuf.ByteString getApiIdBytes();
}
