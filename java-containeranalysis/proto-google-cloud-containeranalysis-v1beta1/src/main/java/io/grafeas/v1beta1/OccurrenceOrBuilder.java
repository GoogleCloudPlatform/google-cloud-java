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
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1;

public interface OccurrenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.Occurrence)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
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
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
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
   * Required. Immutable. The resource for which the occurrence applies.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Resource resource = 2;</code>
   *
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The resource for which the occurrence applies.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Resource resource = 2;</code>
   *
   * @return The resource.
   */
  io.grafeas.v1beta1.Resource getResource();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The resource for which the occurrence applies.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Resource resource = 2;</code>
   */
  io.grafeas.v1beta1.ResourceOrBuilder getResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The analysis note associated with this occurrence, in
   * the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be
   * used as a filter in list requests.
   * </pre>
   *
   * <code>string note_name = 3;</code>
   *
   * @return The noteName.
   */
  java.lang.String getNoteName();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The analysis note associated with this occurrence, in
   * the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be
   * used as a filter in list requests.
   * </pre>
   *
   * <code>string note_name = 3;</code>
   *
   * @return The bytes for noteName.
   */
  com.google.protobuf.ByteString getNoteNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. This explicitly denotes which of the occurrence details are
   * specified. This field can be used as a filter in list requests.
   * </pre>
   *
   * <code>.grafeas.v1beta1.NoteKind kind = 4;</code>
   *
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   *
   *
   * <pre>
   * Output only. This explicitly denotes which of the occurrence details are
   * specified. This field can be used as a filter in list requests.
   * </pre>
   *
   * <code>.grafeas.v1beta1.NoteKind kind = 4;</code>
   *
   * @return The kind.
   */
  io.grafeas.v1beta1.common.NoteKind getKind();

  /**
   *
   *
   * <pre>
   * A description of actions that can be taken to remedy the note.
   * </pre>
   *
   * <code>string remediation = 5;</code>
   *
   * @return The remediation.
   */
  java.lang.String getRemediation();
  /**
   *
   *
   * <pre>
   * A description of actions that can be taken to remedy the note.
   * </pre>
   *
   * <code>string remediation = 5;</code>
   *
   * @return The bytes for remediation.
   */
  com.google.protobuf.ByteString getRemediationBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes a security vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1beta1.vulnerability.Details vulnerability = 8;</code>
   *
   * @return Whether the vulnerability field is set.
   */
  boolean hasVulnerability();
  /**
   *
   *
   * <pre>
   * Describes a security vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1beta1.vulnerability.Details vulnerability = 8;</code>
   *
   * @return The vulnerability.
   */
  io.grafeas.v1beta1.vulnerability.Details getVulnerability();
  /**
   *
   *
   * <pre>
   * Describes a security vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1beta1.vulnerability.Details vulnerability = 8;</code>
   */
  io.grafeas.v1beta1.vulnerability.DetailsOrBuilder getVulnerabilityOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.Details build = 9;</code>
   *
   * @return Whether the build field is set.
   */
  boolean hasBuild();
  /**
   *
   *
   * <pre>
   * Describes a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.Details build = 9;</code>
   *
   * @return The build.
   */
  io.grafeas.v1beta1.build.Details getBuild();
  /**
   *
   *
   * <pre>
   * Describes a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.Details build = 9;</code>
   */
  io.grafeas.v1beta1.build.DetailsOrBuilder getBuildOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes how this resource derives from the basis in the associated
   * note.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Details derived_image = 10;</code>
   *
   * @return Whether the derivedImage field is set.
   */
  boolean hasDerivedImage();
  /**
   *
   *
   * <pre>
   * Describes how this resource derives from the basis in the associated
   * note.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Details derived_image = 10;</code>
   *
   * @return The derivedImage.
   */
  io.grafeas.v1beta1.image.Details getDerivedImage();
  /**
   *
   *
   * <pre>
   * Describes how this resource derives from the basis in the associated
   * note.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Details derived_image = 10;</code>
   */
  io.grafeas.v1beta1.image.DetailsOrBuilder getDerivedImageOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the installation of a package on the linked resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Details installation = 11;</code>
   *
   * @return Whether the installation field is set.
   */
  boolean hasInstallation();
  /**
   *
   *
   * <pre>
   * Describes the installation of a package on the linked resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Details installation = 11;</code>
   *
   * @return The installation.
   */
  io.grafeas.v1beta1.pkg.Details getInstallation();
  /**
   *
   *
   * <pre>
   * Describes the installation of a package on the linked resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Details installation = 11;</code>
   */
  io.grafeas.v1beta1.pkg.DetailsOrBuilder getInstallationOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the deployment of an artifact on a runtime.
   * </pre>
   *
   * <code>.grafeas.v1beta1.deployment.Details deployment = 12;</code>
   *
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   *
   *
   * <pre>
   * Describes the deployment of an artifact on a runtime.
   * </pre>
   *
   * <code>.grafeas.v1beta1.deployment.Details deployment = 12;</code>
   *
   * @return The deployment.
   */
  io.grafeas.v1beta1.deployment.Details getDeployment();
  /**
   *
   *
   * <pre>
   * Describes the deployment of an artifact on a runtime.
   * </pre>
   *
   * <code>.grafeas.v1beta1.deployment.Details deployment = 12;</code>
   */
  io.grafeas.v1beta1.deployment.DetailsOrBuilder getDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes when a resource was discovered.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Details discovered = 13;</code>
   *
   * @return Whether the discovered field is set.
   */
  boolean hasDiscovered();
  /**
   *
   *
   * <pre>
   * Describes when a resource was discovered.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Details discovered = 13;</code>
   *
   * @return The discovered.
   */
  io.grafeas.v1beta1.discovery.Details getDiscovered();
  /**
   *
   *
   * <pre>
   * Describes when a resource was discovered.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Details discovered = 13;</code>
   */
  io.grafeas.v1beta1.discovery.DetailsOrBuilder getDiscoveredOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes an attestation of an artifact.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Details attestation = 14;</code>
   *
   * @return Whether the attestation field is set.
   */
  boolean hasAttestation();
  /**
   *
   *
   * <pre>
   * Describes an attestation of an artifact.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Details attestation = 14;</code>
   *
   * @return The attestation.
   */
  io.grafeas.v1beta1.attestation.Details getAttestation();
  /**
   *
   *
   * <pre>
   * Describes an attestation of an artifact.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Details attestation = 14;</code>
   */
  io.grafeas.v1beta1.attestation.DetailsOrBuilder getAttestationOrBuilder();

  io.grafeas.v1beta1.Occurrence.DetailsCase getDetailsCase();
}
