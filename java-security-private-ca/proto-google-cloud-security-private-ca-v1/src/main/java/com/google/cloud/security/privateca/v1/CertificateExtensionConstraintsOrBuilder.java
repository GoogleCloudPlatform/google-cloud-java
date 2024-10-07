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

public interface CertificateExtensionConstraintsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.CertificateExtensionConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A set of named X.509 extensions. Will be combined with
   * [additional_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.additional_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.CertificateExtensionConstraints.KnownCertificateExtension known_extensions = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the knownExtensions.
   */
  java.util.List<
          com.google.cloud.security.privateca.v1.CertificateExtensionConstraints
              .KnownCertificateExtension>
      getKnownExtensionsList();
  /**
   *
   *
   * <pre>
   * Optional. A set of named X.509 extensions. Will be combined with
   * [additional_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.additional_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.CertificateExtensionConstraints.KnownCertificateExtension known_extensions = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of knownExtensions.
   */
  int getKnownExtensionsCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of named X.509 extensions. Will be combined with
   * [additional_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.additional_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.CertificateExtensionConstraints.KnownCertificateExtension known_extensions = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The knownExtensions at the given index.
   */
  com.google.cloud.security.privateca.v1.CertificateExtensionConstraints.KnownCertificateExtension
      getKnownExtensions(int index);
  /**
   *
   *
   * <pre>
   * Optional. A set of named X.509 extensions. Will be combined with
   * [additional_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.additional_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.CertificateExtensionConstraints.KnownCertificateExtension known_extensions = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for knownExtensions.
   */
  java.util.List<java.lang.Integer> getKnownExtensionsValueList();
  /**
   *
   *
   * <pre>
   * Optional. A set of named X.509 extensions. Will be combined with
   * [additional_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.additional_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.CertificateExtensionConstraints.KnownCertificateExtension known_extensions = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of knownExtensions at the given index.
   */
  int getKnownExtensionsValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. A set of [ObjectIds][google.cloud.security.privateca.v1.ObjectId]
   * identifying custom X.509 extensions. Will be combined with
   * [known_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.known_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId additional_extensions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.security.privateca.v1.ObjectId> getAdditionalExtensionsList();
  /**
   *
   *
   * <pre>
   * Optional. A set of [ObjectIds][google.cloud.security.privateca.v1.ObjectId]
   * identifying custom X.509 extensions. Will be combined with
   * [known_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.known_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId additional_extensions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.ObjectId getAdditionalExtensions(int index);
  /**
   *
   *
   * <pre>
   * Optional. A set of [ObjectIds][google.cloud.security.privateca.v1.ObjectId]
   * identifying custom X.509 extensions. Will be combined with
   * [known_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.known_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId additional_extensions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAdditionalExtensionsCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of [ObjectIds][google.cloud.security.privateca.v1.ObjectId]
   * identifying custom X.509 extensions. Will be combined with
   * [known_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.known_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId additional_extensions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.security.privateca.v1.ObjectIdOrBuilder>
      getAdditionalExtensionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. A set of [ObjectIds][google.cloud.security.privateca.v1.ObjectId]
   * identifying custom X.509 extensions. Will be combined with
   * [known_extensions][google.cloud.security.privateca.v1.CertificateExtensionConstraints.known_extensions]
   * to determine the full set of X.509 extensions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1.ObjectId additional_extensions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1.ObjectIdOrBuilder getAdditionalExtensionsOrBuilder(
      int index);
}
