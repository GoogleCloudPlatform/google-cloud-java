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
// source: google/cloud/security/privateca/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.security.privateca.v1;

public interface CertificateTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.CertificateTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]
   * in the format `projects/&#42;&#47;locations/&#42;&#47;certificateTemplates/&#42;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name for this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]
   * in the format `projects/&#42;&#47;locations/&#42;&#47;certificateTemplates/&#42;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum lifetime allowed for issued
   * [Certificates][google.cloud.security.privateca.v1.Certificate] that use
   * this template. If the issuing
   * [CaPool][google.cloud.security.privateca.v1.CaPool] resource's
   * [IssuancePolicy][google.cloud.security.privateca.v1.CaPool.IssuancePolicy]
   * specifies a
   * [maximum_lifetime][google.cloud.security.privateca.v1.CaPool.IssuancePolicy.maximum_lifetime]
   * the minimum of the two durations will be the maximum lifetime for issued
   * [Certificates][google.cloud.security.privateca.v1.Certificate]. Note that
   * if the issuing
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * expires before a
   * [Certificate][google.cloud.security.privateca.v1.Certificate]'s requested
   * maximum_lifetime, the effective lifetime will be explicitly truncated
   *  to match it.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_lifetime = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maximumLifetime field is set.
   */
  boolean hasMaximumLifetime();
  /**
   *
   *
   * <pre>
   * Optional. The maximum lifetime allowed for issued
   * [Certificates][google.cloud.security.privateca.v1.Certificate] that use
   * this template. If the issuing
   * [CaPool][google.cloud.security.privateca.v1.CaPool] resource's
   * [IssuancePolicy][google.cloud.security.privateca.v1.CaPool.IssuancePolicy]
   * specifies a
   * [maximum_lifetime][google.cloud.security.privateca.v1.CaPool.IssuancePolicy.maximum_lifetime]
   * the minimum of the two durations will be the maximum lifetime for issued
   * [Certificates][google.cloud.security.privateca.v1.Certificate]. Note that
   * if the issuing
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * expires before a
   * [Certificate][google.cloud.security.privateca.v1.Certificate]'s requested
   * maximum_lifetime, the effective lifetime will be explicitly truncated
   *  to match it.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_lifetime = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maximumLifetime.
   */
  com.google.protobuf.Duration getMaximumLifetime();
  /**
   *
   *
   * <pre>
   * Optional. The maximum lifetime allowed for issued
   * [Certificates][google.cloud.security.privateca.v1.Certificate] that use
   * this template. If the issuing
   * [CaPool][google.cloud.security.privateca.v1.CaPool] resource's
   * [IssuancePolicy][google.cloud.security.privateca.v1.CaPool.IssuancePolicy]
   * specifies a
   * [maximum_lifetime][google.cloud.security.privateca.v1.CaPool.IssuancePolicy.maximum_lifetime]
   * the minimum of the two durations will be the maximum lifetime for issued
   * [Certificates][google.cloud.security.privateca.v1.Certificate]. Note that
   * if the issuing
   * [CertificateAuthority][google.cloud.security.privateca.v1.CertificateAuthority]
   * expires before a
   * [Certificate][google.cloud.security.privateca.v1.Certificate]'s requested
   * maximum_lifetime, the effective lifetime will be explicitly truncated
   *  to match it.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_lifetime = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getMaximumLifetimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A set of X.509 values that will be applied to all issued
   * certificates that use this template. If the certificate request includes
   * conflicting values for the same properties, they will be overwritten by the
   * values defined here. If the issuing
   * [CaPool][google.cloud.security.privateca.v1.CaPool]'s
   * [IssuancePolicy][google.cloud.security.privateca.v1.CaPool.IssuancePolicy]
   * defines conflicting
   * [baseline_values][google.cloud.security.privateca.v1.CaPool.IssuancePolicy.baseline_values]
   * for the same properties, the certificate issuance request will fail.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.X509Parameters predefined_values = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the predefinedValues field is set.
   */
  boolean hasPredefinedValues();
  /**
   *
   *
   * <pre>
   * Optional. A set of X.509 values that will be applied to all issued
   * certificates that use this template. If the certificate request includes
   * conflicting values for the same properties, they will be overwritten by the
   * values defined here. If the issuing
   * [CaPool][google.cloud.security.privateca.v1.CaPool]'s
   * [IssuancePolicy][google.cloud.security.privateca.v1.CaPool.IssuancePolicy]
   * defines conflicting
   * [baseline_values][google.cloud.security.privateca.v1.CaPool.IssuancePolicy.baseline_values]
   * for the same properties, the certificate issuance request will fail.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.X509Parameters predefined_values = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The predefinedValues.
   */
  com.google.cloud.security.privateca.v1.X509Parameters getPredefinedValues();
  /**
   *
   *
   * <pre>
   * Optional. A set of X.509 values that will be applied to all issued
   * certificates that use this template. If the certificate request includes
   * conflicting values for the same properties, they will be overwritten by the
   * values defined here. If the issuing
   * [CaPool][google.cloud.security.privateca.v1.CaPool]'s
   * [IssuancePolicy][google.cloud.security.privateca.v1.CaPool.IssuancePolicy]
   * defines conflicting
   * [baseline_values][google.cloud.security.privateca.v1.CaPool.IssuancePolicy.baseline_values]
   * for the same properties, the certificate issuance request will fail.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.X509Parameters predefined_values = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.X509ParametersOrBuilder getPredefinedValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Describes constraints on identities that may be appear in
   * [Certificates][google.cloud.security.privateca.v1.Certificate] issued using
   * this template. If this is omitted, then this template will not add
   * restrictions on a certificate's identity.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.CertificateIdentityConstraints identity_constraints = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the identityConstraints field is set.
   */
  boolean hasIdentityConstraints();
  /**
   *
   *
   * <pre>
   * Optional. Describes constraints on identities that may be appear in
   * [Certificates][google.cloud.security.privateca.v1.Certificate] issued using
   * this template. If this is omitted, then this template will not add
   * restrictions on a certificate's identity.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.CertificateIdentityConstraints identity_constraints = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The identityConstraints.
   */
  com.google.cloud.security.privateca.v1.CertificateIdentityConstraints getIdentityConstraints();
  /**
   *
   *
   * <pre>
   * Optional. Describes constraints on identities that may be appear in
   * [Certificates][google.cloud.security.privateca.v1.Certificate] issued using
   * this template. If this is omitted, then this template will not add
   * restrictions on a certificate's identity.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.CertificateIdentityConstraints identity_constraints = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.CertificateIdentityConstraintsOrBuilder
      getIdentityConstraintsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Describes the set of X.509 extensions that may appear in a
   * [Certificate][google.cloud.security.privateca.v1.Certificate] issued using
   * this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate].
   * If a certificate request sets extensions that don't appear in the
   * [passthrough_extensions][google.cloud.security.privateca.v1.CertificateTemplate.passthrough_extensions],
   * those extensions will be dropped. If the issuing
   * [CaPool][google.cloud.security.privateca.v1.CaPool]'s
   * [IssuancePolicy][google.cloud.security.privateca.v1.CaPool.IssuancePolicy]
   * defines
   * [baseline_values][google.cloud.security.privateca.v1.CaPool.IssuancePolicy.baseline_values]
   * that don't appear here, the certificate issuance request will fail. If this
   * is omitted, then this template will not add restrictions on a certificate's
   * X.509 extensions. These constraints do not apply to X.509 extensions set in
   * this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]'s
   * [predefined_values][google.cloud.security.privateca.v1.CertificateTemplate.predefined_values].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.CertificateExtensionConstraints passthrough_extensions = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the passthroughExtensions field is set.
   */
  boolean hasPassthroughExtensions();
  /**
   *
   *
   * <pre>
   * Optional. Describes the set of X.509 extensions that may appear in a
   * [Certificate][google.cloud.security.privateca.v1.Certificate] issued using
   * this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate].
   * If a certificate request sets extensions that don't appear in the
   * [passthrough_extensions][google.cloud.security.privateca.v1.CertificateTemplate.passthrough_extensions],
   * those extensions will be dropped. If the issuing
   * [CaPool][google.cloud.security.privateca.v1.CaPool]'s
   * [IssuancePolicy][google.cloud.security.privateca.v1.CaPool.IssuancePolicy]
   * defines
   * [baseline_values][google.cloud.security.privateca.v1.CaPool.IssuancePolicy.baseline_values]
   * that don't appear here, the certificate issuance request will fail. If this
   * is omitted, then this template will not add restrictions on a certificate's
   * X.509 extensions. These constraints do not apply to X.509 extensions set in
   * this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]'s
   * [predefined_values][google.cloud.security.privateca.v1.CertificateTemplate.predefined_values].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.CertificateExtensionConstraints passthrough_extensions = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The passthroughExtensions.
   */
  com.google.cloud.security.privateca.v1.CertificateExtensionConstraints getPassthroughExtensions();
  /**
   *
   *
   * <pre>
   * Optional. Describes the set of X.509 extensions that may appear in a
   * [Certificate][google.cloud.security.privateca.v1.Certificate] issued using
   * this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate].
   * If a certificate request sets extensions that don't appear in the
   * [passthrough_extensions][google.cloud.security.privateca.v1.CertificateTemplate.passthrough_extensions],
   * those extensions will be dropped. If the issuing
   * [CaPool][google.cloud.security.privateca.v1.CaPool]'s
   * [IssuancePolicy][google.cloud.security.privateca.v1.CaPool.IssuancePolicy]
   * defines
   * [baseline_values][google.cloud.security.privateca.v1.CaPool.IssuancePolicy.baseline_values]
   * that don't appear here, the certificate issuance request will fail. If this
   * is omitted, then this template will not add restrictions on a certificate's
   * X.509 extensions. These constraints do not apply to X.509 extensions set in
   * this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]'s
   * [predefined_values][google.cloud.security.privateca.v1.CertificateTemplate.predefined_values].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.CertificateExtensionConstraints passthrough_extensions = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.CertificateExtensionConstraintsOrBuilder
      getPassthroughExtensionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A human-readable description of scenarios this template is
   * intended for.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. A human-readable description of scenarios this template is
   * intended for.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]
   * was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]
   * was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]
   * was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]
   * was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]
   * was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this
   * [CertificateTemplate][google.cloud.security.privateca.v1.CertificateTemplate]
   * was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
