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
// source: grafeas/v1/slsa_provenance.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1;

public interface SlsaProvenanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.SlsaProvenance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * required
   * </pre>
   *
   * <code>.grafeas.v1.SlsaProvenance.SlsaBuilder builder = 1;</code>
   *
   * @return Whether the builder field is set.
   */
  boolean hasBuilder();
  /**
   *
   *
   * <pre>
   * required
   * </pre>
   *
   * <code>.grafeas.v1.SlsaProvenance.SlsaBuilder builder = 1;</code>
   *
   * @return The builder.
   */
  io.grafeas.v1.SlsaProvenance.SlsaBuilder getBuilder();
  /**
   *
   *
   * <pre>
   * required
   * </pre>
   *
   * <code>.grafeas.v1.SlsaProvenance.SlsaBuilder builder = 1;</code>
   */
  io.grafeas.v1.SlsaProvenance.SlsaBuilderOrBuilder getBuilderOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifies the configuration used for the build.
   * When combined with materials, this SHOULD fully describe the build,
   * such that re-running this recipe results in bit-for-bit identical output
   * (if the build is reproducible).
   * </pre>
   *
   * <code>.grafeas.v1.SlsaProvenance.SlsaRecipe recipe = 2;</code>
   *
   * @return Whether the recipe field is set.
   */
  boolean hasRecipe();
  /**
   *
   *
   * <pre>
   * Identifies the configuration used for the build.
   * When combined with materials, this SHOULD fully describe the build,
   * such that re-running this recipe results in bit-for-bit identical output
   * (if the build is reproducible).
   * </pre>
   *
   * <code>.grafeas.v1.SlsaProvenance.SlsaRecipe recipe = 2;</code>
   *
   * @return The recipe.
   */
  io.grafeas.v1.SlsaProvenance.SlsaRecipe getRecipe();
  /**
   *
   *
   * <pre>
   * Identifies the configuration used for the build.
   * When combined with materials, this SHOULD fully describe the build,
   * such that re-running this recipe results in bit-for-bit identical output
   * (if the build is reproducible).
   * </pre>
   *
   * <code>.grafeas.v1.SlsaProvenance.SlsaRecipe recipe = 2;</code>
   */
  io.grafeas.v1.SlsaProvenance.SlsaRecipeOrBuilder getRecipeOrBuilder();

  /**
   * <code>.grafeas.v1.SlsaProvenance.SlsaMetadata metadata = 3;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.grafeas.v1.SlsaProvenance.SlsaMetadata metadata = 3;</code>
   *
   * @return The metadata.
   */
  io.grafeas.v1.SlsaProvenance.SlsaMetadata getMetadata();
  /** <code>.grafeas.v1.SlsaProvenance.SlsaMetadata metadata = 3;</code> */
  io.grafeas.v1.SlsaProvenance.SlsaMetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The collection of artifacts that influenced the build including sources,
   * dependencies, build tools, base images, and so on. This is considered to be
   * incomplete unless metadata.completeness.materials is true. Unset or null is
   * equivalent to empty.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SlsaProvenance.Material materials = 4;</code>
   */
  java.util.List<io.grafeas.v1.SlsaProvenance.Material> getMaterialsList();
  /**
   *
   *
   * <pre>
   * The collection of artifacts that influenced the build including sources,
   * dependencies, build tools, base images, and so on. This is considered to be
   * incomplete unless metadata.completeness.materials is true. Unset or null is
   * equivalent to empty.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SlsaProvenance.Material materials = 4;</code>
   */
  io.grafeas.v1.SlsaProvenance.Material getMaterials(int index);
  /**
   *
   *
   * <pre>
   * The collection of artifacts that influenced the build including sources,
   * dependencies, build tools, base images, and so on. This is considered to be
   * incomplete unless metadata.completeness.materials is true. Unset or null is
   * equivalent to empty.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SlsaProvenance.Material materials = 4;</code>
   */
  int getMaterialsCount();
  /**
   *
   *
   * <pre>
   * The collection of artifacts that influenced the build including sources,
   * dependencies, build tools, base images, and so on. This is considered to be
   * incomplete unless metadata.completeness.materials is true. Unset or null is
   * equivalent to empty.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SlsaProvenance.Material materials = 4;</code>
   */
  java.util.List<? extends io.grafeas.v1.SlsaProvenance.MaterialOrBuilder>
      getMaterialsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The collection of artifacts that influenced the build including sources,
   * dependencies, build tools, base images, and so on. This is considered to be
   * incomplete unless metadata.completeness.materials is true. Unset or null is
   * equivalent to empty.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SlsaProvenance.Material materials = 4;</code>
   */
  io.grafeas.v1.SlsaProvenance.MaterialOrBuilder getMaterialsOrBuilder(int index);
}
