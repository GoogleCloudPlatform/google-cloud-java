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
// source: google/appengine/v1/domain_mapping.proto

// Protobuf Java Version: 3.25.5
package com.google.appengine.v1;

public interface SslSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.SslSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ID of the `AuthorizedCertificate` resource configuring SSL for the
   * application. Clearing this field will remove SSL support.
   *
   * By default, a managed certificate is automatically created for every
   * domain mapping. To omit SSL support or to configure SSL manually, specify
   * `SslManagementType.MANUAL` on a `CREATE` or `UPDATE` request. You must
   * be authorized to administer the `AuthorizedCertificate` resource to
   * manually map it to a `DomainMapping` resource.
   * Example: `12345`.
   * </pre>
   *
   * <code>string certificate_id = 1;</code>
   *
   * @return The certificateId.
   */
  java.lang.String getCertificateId();
  /**
   *
   *
   * <pre>
   * ID of the `AuthorizedCertificate` resource configuring SSL for the
   * application. Clearing this field will remove SSL support.
   *
   * By default, a managed certificate is automatically created for every
   * domain mapping. To omit SSL support or to configure SSL manually, specify
   * `SslManagementType.MANUAL` on a `CREATE` or `UPDATE` request. You must
   * be authorized to administer the `AuthorizedCertificate` resource to
   * manually map it to a `DomainMapping` resource.
   * Example: `12345`.
   * </pre>
   *
   * <code>string certificate_id = 1;</code>
   *
   * @return The bytes for certificateId.
   */
  com.google.protobuf.ByteString getCertificateIdBytes();

  /**
   *
   *
   * <pre>
   * SSL management type for this domain. If `AUTOMATIC`, a managed certificate
   * is automatically provisioned. If `MANUAL`, `certificate_id` must be
   * manually specified in order to configure SSL for this domain.
   * </pre>
   *
   * <code>.google.appengine.v1.SslSettings.SslManagementType ssl_management_type = 3;</code>
   *
   * @return The enum numeric value on the wire for sslManagementType.
   */
  int getSslManagementTypeValue();
  /**
   *
   *
   * <pre>
   * SSL management type for this domain. If `AUTOMATIC`, a managed certificate
   * is automatically provisioned. If `MANUAL`, `certificate_id` must be
   * manually specified in order to configure SSL for this domain.
   * </pre>
   *
   * <code>.google.appengine.v1.SslSettings.SslManagementType ssl_management_type = 3;</code>
   *
   * @return The sslManagementType.
   */
  com.google.appengine.v1.SslSettings.SslManagementType getSslManagementType();

  /**
   *
   *
   * <pre>
   * ID of the managed `AuthorizedCertificate` resource currently being
   * provisioned, if applicable. Until the new managed certificate has been
   * successfully provisioned, the previous SSL state will be preserved. Once
   * the provisioning process completes, the `certificate_id` field will reflect
   * the new managed certificate and this field will be left empty. To remove
   * SSL support while there is still a pending managed certificate, clear the
   * `certificate_id` field with an `UpdateDomainMappingRequest`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string pending_managed_certificate_id = 4;</code>
   *
   * @return The pendingManagedCertificateId.
   */
  java.lang.String getPendingManagedCertificateId();
  /**
   *
   *
   * <pre>
   * ID of the managed `AuthorizedCertificate` resource currently being
   * provisioned, if applicable. Until the new managed certificate has been
   * successfully provisioned, the previous SSL state will be preserved. Once
   * the provisioning process completes, the `certificate_id` field will reflect
   * the new managed certificate and this field will be left empty. To remove
   * SSL support while there is still a pending managed certificate, clear the
   * `certificate_id` field with an `UpdateDomainMappingRequest`.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string pending_managed_certificate_id = 4;</code>
   *
   * @return The bytes for pendingManagedCertificateId.
   */
  com.google.protobuf.ByteString getPendingManagedCertificateIdBytes();
}
