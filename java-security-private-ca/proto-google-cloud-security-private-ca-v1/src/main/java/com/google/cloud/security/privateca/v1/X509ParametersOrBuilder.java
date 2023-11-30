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

public interface X509ParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.X509Parameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Indicates the intended use for keys that correspond to a
   * certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.KeyUsage key_usage = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the keyUsage field is set.
   */
  boolean hasKeyUsage();
  /**
   *
   *
   * <pre>
   * Optional. Indicates the intended use for keys that correspond to a
   * certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.KeyUsage key_usage = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The keyUsage.
   */
  com.google.cloud.security.privateca.v1.KeyUsage getKeyUsage();
  /**
   *
   *
   * <pre>
   * Optional. Indicates the intended use for keys that correspond to a
   * certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.KeyUsage key_usage = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.KeyUsageOrBuilder getKeyUsageOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Describes options in this
   * [X509Parameters][google.cloud.security.privateca.v1.X509Parameters] that
   * are relevant in a CA certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.X509Parameters.CaOptions ca_options = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the caOptions field is set.
   */
  boolean hasCaOptions();
  /**
   *
   *
   * <pre>
   * Optional. Describes options in this
   * [X509Parameters][google.cloud.security.privateca.v1.X509Parameters] that
   * are relevant in a CA certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.X509Parameters.CaOptions ca_options = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The caOptions.
   */
  com.google.cloud.security.privateca.v1.X509Parameters.CaOptions getCaOptions();
  /**
   *
   *
   * <pre>
   * Optional. Describes options in this
   * [X509Parameters][google.cloud.security.privateca.v1.X509Parameters] that
   * are relevant in a CA certificate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.X509Parameters.CaOptions ca_options = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.X509Parameters.CaOptionsOrBuilder getCaOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Describes the X.509 certificate policy object identifiers, per
   * https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId policy_ids = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.security.privateca.v1.ObjectId> getPolicyIdsList();
  /**
   *
   *
   * <pre>
   * Optional. Describes the X.509 certificate policy object identifiers, per
   * https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId policy_ids = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.ObjectId getPolicyIds(int index);
  /**
   *
   *
   * <pre>
   * Optional. Describes the X.509 certificate policy object identifiers, per
   * https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId policy_ids = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPolicyIdsCount();
  /**
   *
   *
   * <pre>
   * Optional. Describes the X.509 certificate policy object identifiers, per
   * https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId policy_ids = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.security.privateca.v1.ObjectIdOrBuilder>
      getPolicyIdsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Describes the X.509 certificate policy object identifiers, per
   * https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId policy_ids = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.ObjectIdOrBuilder getPolicyIdsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint
   * addresses that appear in the "Authority Information Access" extension in
   * the certificate.
   * </pre>
   *
   * <code>repeated string aia_ocsp_servers = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the aiaOcspServers.
   */
  java.util.List<java.lang.String> getAiaOcspServersList();
  /**
   *
   *
   * <pre>
   * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint
   * addresses that appear in the "Authority Information Access" extension in
   * the certificate.
   * </pre>
   *
   * <code>repeated string aia_ocsp_servers = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of aiaOcspServers.
   */
  int getAiaOcspServersCount();
  /**
   *
   *
   * <pre>
   * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint
   * addresses that appear in the "Authority Information Access" extension in
   * the certificate.
   * </pre>
   *
   * <code>repeated string aia_ocsp_servers = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The aiaOcspServers at the given index.
   */
  java.lang.String getAiaOcspServers(int index);
  /**
   *
   *
   * <pre>
   * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint
   * addresses that appear in the "Authority Information Access" extension in
   * the certificate.
   * </pre>
   *
   * <code>repeated string aia_ocsp_servers = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the aiaOcspServers at the given index.
   */
  com.google.protobuf.ByteString getAiaOcspServersBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Describes the X.509 name constraints extension.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.X509Parameters.NameConstraints name_constraints = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the nameConstraints field is set.
   */
  boolean hasNameConstraints();
  /**
   *
   *
   * <pre>
   * Optional. Describes the X.509 name constraints extension.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.X509Parameters.NameConstraints name_constraints = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The nameConstraints.
   */
  com.google.cloud.security.privateca.v1.X509Parameters.NameConstraints getNameConstraints();
  /**
   *
   *
   * <pre>
   * Optional. Describes the X.509 name constraints extension.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1.X509Parameters.NameConstraints name_constraints = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.X509Parameters.NameConstraintsOrBuilder
      getNameConstraintsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Describes custom X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.X509Extension additional_extensions = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.security.privateca.v1.X509Extension>
      getAdditionalExtensionsList();
  /**
   *
   *
   * <pre>
   * Optional. Describes custom X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.X509Extension additional_extensions = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.X509Extension getAdditionalExtensions(int index);
  /**
   *
   *
   * <pre>
   * Optional. Describes custom X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.X509Extension additional_extensions = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAdditionalExtensionsCount();
  /**
   *
   *
   * <pre>
   * Optional. Describes custom X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.X509Extension additional_extensions = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.security.privateca.v1.X509ExtensionOrBuilder>
      getAdditionalExtensionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Describes custom X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.X509Extension additional_extensions = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.X509ExtensionOrBuilder getAdditionalExtensionsOrBuilder(
      int index);
}
