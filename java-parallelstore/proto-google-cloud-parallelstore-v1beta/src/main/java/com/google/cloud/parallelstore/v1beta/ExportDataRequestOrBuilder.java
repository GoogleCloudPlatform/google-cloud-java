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
// source: google/cloud/parallelstore/v1beta/parallelstore.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.parallelstore.v1beta;

public interface ExportDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.parallelstore.v1beta.ExportDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Parallelstore source.
   * </pre>
   *
   * <code>.google.cloud.parallelstore.v1beta.SourceParallelstore source_parallelstore = 2;</code>
   *
   * @return Whether the sourceParallelstore field is set.
   */
  boolean hasSourceParallelstore();
  /**
   *
   *
   * <pre>
   * Parallelstore source.
   * </pre>
   *
   * <code>.google.cloud.parallelstore.v1beta.SourceParallelstore source_parallelstore = 2;</code>
   *
   * @return The sourceParallelstore.
   */
  com.google.cloud.parallelstore.v1beta.SourceParallelstore getSourceParallelstore();
  /**
   *
   *
   * <pre>
   * Parallelstore source.
   * </pre>
   *
   * <code>.google.cloud.parallelstore.v1beta.SourceParallelstore source_parallelstore = 2;</code>
   */
  com.google.cloud.parallelstore.v1beta.SourceParallelstoreOrBuilder
      getSourceParallelstoreOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Storage destination.
   * </pre>
   *
   * <code>.google.cloud.parallelstore.v1beta.DestinationGcsBucket destination_gcs_bucket = 3;
   * </code>
   *
   * @return Whether the destinationGcsBucket field is set.
   */
  boolean hasDestinationGcsBucket();
  /**
   *
   *
   * <pre>
   * Cloud Storage destination.
   * </pre>
   *
   * <code>.google.cloud.parallelstore.v1beta.DestinationGcsBucket destination_gcs_bucket = 3;
   * </code>
   *
   * @return The destinationGcsBucket.
   */
  com.google.cloud.parallelstore.v1beta.DestinationGcsBucket getDestinationGcsBucket();
  /**
   *
   *
   * <pre>
   * Cloud Storage destination.
   * </pre>
   *
   * <code>.google.cloud.parallelstore.v1beta.DestinationGcsBucket destination_gcs_bucket = 3;
   * </code>
   */
  com.google.cloud.parallelstore.v1beta.DestinationGcsBucketOrBuilder
      getDestinationGcsBucketOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Name of the resource.
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
   * Required. Name of the resource.
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
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-specified Service Account (SA) credentials to be used when
   * performing the transfer.
   * Use one of the following formats:
   *
   * * `{EMAIL_ADDRESS_OR_UNIQUE_ID}`
   * * `projects/{PROJECT_ID_OR_NUMBER}/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}`
   * * `projects/-/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}`
   *
   * If unspecified, the Parallelstore service agent is used:
   * `service-&lt;PROJECT_NUMBER&gt;&#64;gcp-sa-parallelstore.iam.gserviceaccount.com`
   * </pre>
   *
   * <code>
   * string service_account = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Optional. User-specified Service Account (SA) credentials to be used when
   * performing the transfer.
   * Use one of the following formats:
   *
   * * `{EMAIL_ADDRESS_OR_UNIQUE_ID}`
   * * `projects/{PROJECT_ID_OR_NUMBER}/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}`
   * * `projects/-/serviceAccounts/{EMAIL_ADDRESS_OR_UNIQUE_ID}`
   *
   * If unspecified, the Parallelstore service agent is used:
   * `service-&lt;PROJECT_NUMBER&gt;&#64;gcp-sa-parallelstore.iam.gserviceaccount.com`
   * </pre>
   *
   * <code>
   * string service_account = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  com.google.cloud.parallelstore.v1beta.ExportDataRequest.SourceCase getSourceCase();

  com.google.cloud.parallelstore.v1beta.ExportDataRequest.DestinationCase getDestinationCase();
}
