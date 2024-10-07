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
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1.pkg;

public interface VersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.package.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Used to correct mistakes in the version numbering scheme.
   * </pre>
   *
   * <code>int32 epoch = 1;</code>
   *
   * @return The epoch.
   */
  int getEpoch();

  /**
   *
   *
   * <pre>
   * Required only when version kind is NORMAL. The main part of the version
   * name.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required only when version kind is NORMAL. The main part of the version
   * name.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   *
   * @return The revision.
   */
  java.lang.String getRevision();
  /**
   *
   *
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   *
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString getRevisionBytes();

  /**
   *
   *
   * <pre>
   * Required. Distinguishes between sentinel MIN/MAX versions and normal
   * versions.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
   *
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   *
   *
   * <pre>
   * Required. Distinguishes between sentinel MIN/MAX versions and normal
   * versions.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
   *
   * @return The kind.
   */
  io.grafeas.v1beta1.pkg.Version.VersionKind getKind();
}
