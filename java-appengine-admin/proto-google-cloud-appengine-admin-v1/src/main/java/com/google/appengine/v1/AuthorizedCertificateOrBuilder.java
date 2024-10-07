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
// source: google/appengine/v1/certificate.proto

// Protobuf Java Version: 3.25.5
package com.google.appengine.v1;

public interface AuthorizedCertificateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.AuthorizedCertificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full path to the `AuthorizedCertificate` resource in the API. Example:
   * `apps/myapp/authorizedCertificates/12345`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Full path to the `AuthorizedCertificate` resource in the API. Example:
   * `apps/myapp/authorizedCertificates/12345`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Relative name of the certificate. This is a unique value autogenerated
   * on `AuthorizedCertificate` resource creation. Example: `12345`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Relative name of the certificate. This is a unique value autogenerated
   * on `AuthorizedCertificate` resource creation. Example: `12345`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The user-specified display name of the certificate. This is not
   * guaranteed to be unique. Example: `My Certificate`.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The user-specified display name of the certificate. This is not
   * guaranteed to be unique. Example: `My Certificate`.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Topmost applicable domains of this certificate. This certificate
   * applies to these domains and their subdomains. Example: `example.com`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated string domain_names = 4;</code>
   *
   * @return A list containing the domainNames.
   */
  java.util.List<java.lang.String> getDomainNamesList();
  /**
   *
   *
   * <pre>
   * Topmost applicable domains of this certificate. This certificate
   * applies to these domains and their subdomains. Example: `example.com`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated string domain_names = 4;</code>
   *
   * @return The count of domainNames.
   */
  int getDomainNamesCount();
  /**
   *
   *
   * <pre>
   * Topmost applicable domains of this certificate. This certificate
   * applies to these domains and their subdomains. Example: `example.com`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated string domain_names = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The domainNames at the given index.
   */
  java.lang.String getDomainNames(int index);
  /**
   *
   *
   * <pre>
   * Topmost applicable domains of this certificate. This certificate
   * applies to these domains and their subdomains. Example: `example.com`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated string domain_names = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the domainNames at the given index.
   */
  com.google.protobuf.ByteString getDomainNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * The time when this certificate expires. To update the renewal time on this
   * certificate, upload an SSL certificate with a different expiration time
   * using [`AuthorizedCertificates.UpdateAuthorizedCertificate`]().
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 5;</code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * The time when this certificate expires. To update the renewal time on this
   * certificate, upload an SSL certificate with a different expiration time
   * using [`AuthorizedCertificates.UpdateAuthorizedCertificate`]().
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 5;</code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * The time when this certificate expires. To update the renewal time on this
   * certificate, upload an SSL certificate with a different expiration time
   * using [`AuthorizedCertificates.UpdateAuthorizedCertificate`]().
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The SSL certificate serving the `AuthorizedCertificate` resource. This
   * must be obtained independently from a certificate authority.
   * </pre>
   *
   * <code>.google.appengine.v1.CertificateRawData certificate_raw_data = 6;</code>
   *
   * @return Whether the certificateRawData field is set.
   */
  boolean hasCertificateRawData();
  /**
   *
   *
   * <pre>
   * The SSL certificate serving the `AuthorizedCertificate` resource. This
   * must be obtained independently from a certificate authority.
   * </pre>
   *
   * <code>.google.appengine.v1.CertificateRawData certificate_raw_data = 6;</code>
   *
   * @return The certificateRawData.
   */
  com.google.appengine.v1.CertificateRawData getCertificateRawData();
  /**
   *
   *
   * <pre>
   * The SSL certificate serving the `AuthorizedCertificate` resource. This
   * must be obtained independently from a certificate authority.
   * </pre>
   *
   * <code>.google.appengine.v1.CertificateRawData certificate_raw_data = 6;</code>
   */
  com.google.appengine.v1.CertificateRawDataOrBuilder getCertificateRawDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Only applicable if this certificate is managed by App Engine. Managed
   * certificates are tied to the lifecycle of a `DomainMapping` and cannot be
   * updated or deleted via the `AuthorizedCertificates` API. If this
   * certificate is manually administered by the user, this field will be empty.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.appengine.v1.ManagedCertificate managed_certificate = 7;</code>
   *
   * @return Whether the managedCertificate field is set.
   */
  boolean hasManagedCertificate();
  /**
   *
   *
   * <pre>
   * Only applicable if this certificate is managed by App Engine. Managed
   * certificates are tied to the lifecycle of a `DomainMapping` and cannot be
   * updated or deleted via the `AuthorizedCertificates` API. If this
   * certificate is manually administered by the user, this field will be empty.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.appengine.v1.ManagedCertificate managed_certificate = 7;</code>
   *
   * @return The managedCertificate.
   */
  com.google.appengine.v1.ManagedCertificate getManagedCertificate();
  /**
   *
   *
   * <pre>
   * Only applicable if this certificate is managed by App Engine. Managed
   * certificates are tied to the lifecycle of a `DomainMapping` and cannot be
   * updated or deleted via the `AuthorizedCertificates` API. If this
   * certificate is manually administered by the user, this field will be empty.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.appengine.v1.ManagedCertificate managed_certificate = 7;</code>
   */
  com.google.appengine.v1.ManagedCertificateOrBuilder getManagedCertificateOrBuilder();

  /**
   *
   *
   * <pre>
   * The full paths to user visible Domain Mapping resources that have this
   * certificate mapped. Example: `apps/myapp/domainMappings/example.com`.
   *
   * This may not represent the full list of mapped domain mappings if the user
   * does not have `VIEWER` permissions on all of the applications that have
   * this certificate mapped. See `domain_mappings_count` for a complete count.
   *
   * Only returned by `GET` or `LIST` requests when specifically requested by
   * the `view=FULL_CERTIFICATE` option.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated string visible_domain_mappings = 8;</code>
   *
   * @return A list containing the visibleDomainMappings.
   */
  java.util.List<java.lang.String> getVisibleDomainMappingsList();
  /**
   *
   *
   * <pre>
   * The full paths to user visible Domain Mapping resources that have this
   * certificate mapped. Example: `apps/myapp/domainMappings/example.com`.
   *
   * This may not represent the full list of mapped domain mappings if the user
   * does not have `VIEWER` permissions on all of the applications that have
   * this certificate mapped. See `domain_mappings_count` for a complete count.
   *
   * Only returned by `GET` or `LIST` requests when specifically requested by
   * the `view=FULL_CERTIFICATE` option.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated string visible_domain_mappings = 8;</code>
   *
   * @return The count of visibleDomainMappings.
   */
  int getVisibleDomainMappingsCount();
  /**
   *
   *
   * <pre>
   * The full paths to user visible Domain Mapping resources that have this
   * certificate mapped. Example: `apps/myapp/domainMappings/example.com`.
   *
   * This may not represent the full list of mapped domain mappings if the user
   * does not have `VIEWER` permissions on all of the applications that have
   * this certificate mapped. See `domain_mappings_count` for a complete count.
   *
   * Only returned by `GET` or `LIST` requests when specifically requested by
   * the `view=FULL_CERTIFICATE` option.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated string visible_domain_mappings = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The visibleDomainMappings at the given index.
   */
  java.lang.String getVisibleDomainMappings(int index);
  /**
   *
   *
   * <pre>
   * The full paths to user visible Domain Mapping resources that have this
   * certificate mapped. Example: `apps/myapp/domainMappings/example.com`.
   *
   * This may not represent the full list of mapped domain mappings if the user
   * does not have `VIEWER` permissions on all of the applications that have
   * this certificate mapped. See `domain_mappings_count` for a complete count.
   *
   * Only returned by `GET` or `LIST` requests when specifically requested by
   * the `view=FULL_CERTIFICATE` option.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>repeated string visible_domain_mappings = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the visibleDomainMappings at the given index.
   */
  com.google.protobuf.ByteString getVisibleDomainMappingsBytes(int index);

  /**
   *
   *
   * <pre>
   * Aggregate count of the domain mappings with this certificate mapped. This
   * count includes domain mappings on applications for which the user does not
   * have `VIEWER` permissions.
   *
   * Only returned by `GET` or `LIST` requests when specifically requested by
   * the `view=FULL_CERTIFICATE` option.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>int32 domain_mappings_count = 9;</code>
   *
   * @return The domainMappingsCount.
   */
  int getDomainMappingsCount();
}
