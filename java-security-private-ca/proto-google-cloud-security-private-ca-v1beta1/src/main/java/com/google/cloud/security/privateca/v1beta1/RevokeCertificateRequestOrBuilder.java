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
// source: google/cloud/security/privateca/v1beta1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.security.privateca.v1beta1;

public interface RevokeCertificateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1beta1.RevokeCertificateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name for this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] in the
   * format `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;&#47;certificates/&#42;`.
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
   * Required. The resource name for this [Certificate][google.cloud.security.privateca.v1beta1.Certificate] in the
   * format `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;&#47;certificates/&#42;`.
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
   * Required. The [RevocationReason][google.cloud.security.privateca.v1beta1.RevocationReason] for revoking this certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.RevocationReason reason = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for reason.
   */
  int getReasonValue();
  /**
   *
   *
   * <pre>
   * Required. The [RevocationReason][google.cloud.security.privateca.v1beta1.RevocationReason] for revoking this certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.RevocationReason reason = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The reason.
   */
  com.google.cloud.security.privateca.v1beta1.RevocationReason getReason();

  /**
   *
   *
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that if you must
   * retry your request, the server will know to ignore the request if it has
   * already been completed. The server will guarantee that for at least 60
   * minutes since the first request.
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
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An ID to identify requests. Specify a unique request ID so that if you must
   * retry your request, the server will know to ignore the request if it has
   * already been completed. The server will guarantee that for at least 60
   * minutes since the first request.
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
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
