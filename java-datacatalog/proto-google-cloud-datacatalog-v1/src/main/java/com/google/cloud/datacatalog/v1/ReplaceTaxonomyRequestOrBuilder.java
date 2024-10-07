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
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

public interface ReplaceTaxonomyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ReplaceTaxonomyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the taxonomy to update.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the taxonomy to update.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Taxonomy to update along with its child policy tags.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the serializedTaxonomy field is set.
   */
  boolean hasSerializedTaxonomy();
  /**
   *
   *
   * <pre>
   * Required. Taxonomy to update along with its child policy tags.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The serializedTaxonomy.
   */
  com.google.cloud.datacatalog.v1.SerializedTaxonomy getSerializedTaxonomy();
  /**
   *
   *
   * <pre>
   * Required. Taxonomy to update along with its child policy tags.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SerializedTaxonomy serialized_taxonomy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder getSerializedTaxonomyOrBuilder();
}
