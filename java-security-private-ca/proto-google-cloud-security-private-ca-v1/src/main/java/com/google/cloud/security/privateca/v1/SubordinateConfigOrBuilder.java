/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/security/privateca/v1/resources.proto

package com.google.cloud.security.privateca.v1;

public interface SubordinateConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.SubordinateConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. This can refer to a
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * that was used to create a subordinate
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority].
   * This field is used for information and usability purposes only. The
   * resource name is in the format
   * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;&#47;certificateAuthorities/&#42;`.
   * </pre>
   *
   * <code>
   * string certificate_authority = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the certificateAuthority field is set.
   */
  boolean hasCertificateAuthority();
  /**
   *
   *
   * <pre>
   * Required. This can refer to a
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * that was used to create a subordinate
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority].
   * This field is used for information and usability purposes only. The
   * resource name is in the format
   * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;&#47;certificateAuthorities/&#42;`.
   * </pre>
   *
   * <code>
   * string certificate_authority = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The certificateAuthority.
   */
  java.lang.String getCertificateAuthority();
  /**
   *
   *
   * <pre>
   * Required. This can refer to a
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * that was used to create a subordinate
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority].
   * This field is used for information and usability purposes only. The
   * resource name is in the format
   * `projects/&#42;&#47;locations/&#42;&#47;caPools/&#42;&#47;certificateAuthorities/&#42;`.
   * </pre>
   *
   * <code>
   * string certificate_authority = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for certificateAuthority.
   */
  com.google.protobuf.ByteString getCertificateAuthorityBytes();

  /**
   *
   *
   * <pre>
   * Required. Contains the PEM certificate chain for the issuers of this
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority],
   * but not pem certificate for this CA itself.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.SubordinateConfig.SubordinateConfigChain pem_issuer_chain = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the pemIssuerChain field is set.
   */
  boolean hasPemIssuerChain();
  /**
   *
   *
   * <pre>
   * Required. Contains the PEM certificate chain for the issuers of this
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority],
   * but not pem certificate for this CA itself.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.SubordinateConfig.SubordinateConfigChain pem_issuer_chain = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The pemIssuerChain.
   */
  com.google.cloud.security.privateca.v1.SubordinateConfig.SubordinateConfigChain
      getPemIssuerChain();
  /**
   *
   *
   * <pre>
   * Required. Contains the PEM certificate chain for the issuers of this
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority],
   * but not pem certificate for this CA itself.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.SubordinateConfig.SubordinateConfigChain pem_issuer_chain = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.security.privateca.v1.SubordinateConfig.SubordinateConfigChainOrBuilder
      getPemIssuerChainOrBuilder();

  com.google.cloud.security.privateca.v1.SubordinateConfig.SubordinateConfigCase
      getSubordinateConfigCase();
}
