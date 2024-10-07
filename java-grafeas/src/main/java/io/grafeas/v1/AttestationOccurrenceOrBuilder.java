/*
 * Copyright 2024 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/attestation.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1;

public interface AttestationOccurrenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.AttestationOccurrence)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The serialized payload that is verified by one or more
   * `signatures`.
   * </pre>
   *
   * <code>bytes serialized_payload = 1;</code>
   *
   * @return The serializedPayload.
   */
  com.google.protobuf.ByteString getSerializedPayload();

  /**
   *
   *
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Signature signatures = 2;</code>
   */
  java.util.List<io.grafeas.v1.Signature> getSignaturesList();
  /**
   *
   *
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Signature signatures = 2;</code>
   */
  io.grafeas.v1.Signature getSignatures(int index);
  /**
   *
   *
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Signature signatures = 2;</code>
   */
  int getSignaturesCount();
  /**
   *
   *
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Signature signatures = 2;</code>
   */
  java.util.List<? extends io.grafeas.v1.SignatureOrBuilder> getSignaturesOrBuilderList();
  /**
   *
   *
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Signature signatures = 2;</code>
   */
  io.grafeas.v1.SignatureOrBuilder getSignaturesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * One or more JWTs encoding a self-contained attestation.
   * Each JWT encodes the payload that it verifies within the JWT itself.
   * Verifier implementation SHOULD ignore the `serialized_payload` field
   * when verifying these JWTs.
   * If only JWTs are present on this AttestationOccurrence, then the
   * `serialized_payload` SHOULD be left empty.
   * Each JWT SHOULD encode a claim specific to the `resource_uri` of this
   * Occurrence, but this is not validated by Grafeas metadata API
   * implementations.  The JWT itself is opaque to Grafeas.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Jwt jwts = 3;</code>
   */
  java.util.List<io.grafeas.v1.Jwt> getJwtsList();
  /**
   *
   *
   * <pre>
   * One or more JWTs encoding a self-contained attestation.
   * Each JWT encodes the payload that it verifies within the JWT itself.
   * Verifier implementation SHOULD ignore the `serialized_payload` field
   * when verifying these JWTs.
   * If only JWTs are present on this AttestationOccurrence, then the
   * `serialized_payload` SHOULD be left empty.
   * Each JWT SHOULD encode a claim specific to the `resource_uri` of this
   * Occurrence, but this is not validated by Grafeas metadata API
   * implementations.  The JWT itself is opaque to Grafeas.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Jwt jwts = 3;</code>
   */
  io.grafeas.v1.Jwt getJwts(int index);
  /**
   *
   *
   * <pre>
   * One or more JWTs encoding a self-contained attestation.
   * Each JWT encodes the payload that it verifies within the JWT itself.
   * Verifier implementation SHOULD ignore the `serialized_payload` field
   * when verifying these JWTs.
   * If only JWTs are present on this AttestationOccurrence, then the
   * `serialized_payload` SHOULD be left empty.
   * Each JWT SHOULD encode a claim specific to the `resource_uri` of this
   * Occurrence, but this is not validated by Grafeas metadata API
   * implementations.  The JWT itself is opaque to Grafeas.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Jwt jwts = 3;</code>
   */
  int getJwtsCount();
  /**
   *
   *
   * <pre>
   * One or more JWTs encoding a self-contained attestation.
   * Each JWT encodes the payload that it verifies within the JWT itself.
   * Verifier implementation SHOULD ignore the `serialized_payload` field
   * when verifying these JWTs.
   * If only JWTs are present on this AttestationOccurrence, then the
   * `serialized_payload` SHOULD be left empty.
   * Each JWT SHOULD encode a claim specific to the `resource_uri` of this
   * Occurrence, but this is not validated by Grafeas metadata API
   * implementations.  The JWT itself is opaque to Grafeas.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Jwt jwts = 3;</code>
   */
  java.util.List<? extends io.grafeas.v1.JwtOrBuilder> getJwtsOrBuilderList();
  /**
   *
   *
   * <pre>
   * One or more JWTs encoding a self-contained attestation.
   * Each JWT encodes the payload that it verifies within the JWT itself.
   * Verifier implementation SHOULD ignore the `serialized_payload` field
   * when verifying these JWTs.
   * If only JWTs are present on this AttestationOccurrence, then the
   * `serialized_payload` SHOULD be left empty.
   * Each JWT SHOULD encode a claim specific to the `resource_uri` of this
   * Occurrence, but this is not validated by Grafeas metadata API
   * implementations.  The JWT itself is opaque to Grafeas.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Jwt jwts = 3;</code>
   */
  io.grafeas.v1.JwtOrBuilder getJwtsOrBuilder(int index);
}
