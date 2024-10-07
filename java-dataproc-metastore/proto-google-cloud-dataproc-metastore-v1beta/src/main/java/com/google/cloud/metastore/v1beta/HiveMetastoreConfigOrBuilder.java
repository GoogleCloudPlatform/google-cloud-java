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
// source: google/cloud/metastore/v1beta/metastore.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.metastore.v1beta;

public interface HiveMetastoreConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.HiveMetastoreConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The Hive metastore schema version.
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Immutable. The Hive metastore schema version.
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * Hive metastore (configured in `hive-site.xml`). The mappings
   * override system defaults (some keys cannot be overridden). These
   * overrides are also applied to auxiliary versions and can be further
   * customized in the auxiliary version's `AuxiliaryVersionConfig`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  int getConfigOverridesCount();
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * Hive metastore (configured in `hive-site.xml`). The mappings
   * override system defaults (some keys cannot be overridden). These
   * overrides are also applied to auxiliary versions and can be further
   * customized in the auxiliary version's `AuxiliaryVersionConfig`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  boolean containsConfigOverrides(java.lang.String key);
  /** Use {@link #getConfigOverridesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getConfigOverrides();
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * Hive metastore (configured in `hive-site.xml`). The mappings
   * override system defaults (some keys cannot be overridden). These
   * overrides are also applied to auxiliary versions and can be further
   * customized in the auxiliary version's `AuxiliaryVersionConfig`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getConfigOverridesMap();
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * Hive metastore (configured in `hive-site.xml`). The mappings
   * override system defaults (some keys cannot be overridden). These
   * overrides are also applied to auxiliary versions and can be further
   * customized in the auxiliary version's `AuxiliaryVersionConfig`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  /* nullable */
  java.lang.String getConfigOverridesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore configuration key-value pairs to apply to the
   * Hive metastore (configured in `hive-site.xml`). The mappings
   * override system defaults (some keys cannot be overridden). These
   * overrides are also applied to auxiliary versions and can be further
   * customized in the auxiliary version's `AuxiliaryVersionConfig`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; config_overrides = 2;</code>
   */
  java.lang.String getConfigOverridesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Information used to configure the Hive metastore service as a service
   * principal in a Kerberos realm. To disable Kerberos, use the `UpdateService`
   * method and specify this field's path
   * (`hive_metastore_config.kerberos_config`) in the request's `update_mask`
   * while omitting this field from the request's `service`.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.KerberosConfig kerberos_config = 3;</code>
   *
   * @return Whether the kerberosConfig field is set.
   */
  boolean hasKerberosConfig();
  /**
   *
   *
   * <pre>
   * Information used to configure the Hive metastore service as a service
   * principal in a Kerberos realm. To disable Kerberos, use the `UpdateService`
   * method and specify this field's path
   * (`hive_metastore_config.kerberos_config`) in the request's `update_mask`
   * while omitting this field from the request's `service`.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.KerberosConfig kerberos_config = 3;</code>
   *
   * @return The kerberosConfig.
   */
  com.google.cloud.metastore.v1beta.KerberosConfig getKerberosConfig();
  /**
   *
   *
   * <pre>
   * Information used to configure the Hive metastore service as a service
   * principal in a Kerberos realm. To disable Kerberos, use the `UpdateService`
   * method and specify this field's path
   * (`hive_metastore_config.kerberos_config`) in the request's `update_mask`
   * while omitting this field from the request's `service`.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.KerberosConfig kerberos_config = 3;</code>
   */
  com.google.cloud.metastore.v1beta.KerberosConfigOrBuilder getKerberosConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The protocol to use for the metastore service endpoint. If unspecified,
   * defaults to `THRIFT`.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1beta.HiveMetastoreConfig.EndpointProtocol endpoint_protocol = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for endpointProtocol.
   */
  int getEndpointProtocolValue();
  /**
   *
   *
   * <pre>
   * The protocol to use for the metastore service endpoint. If unspecified,
   * defaults to `THRIFT`.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1beta.HiveMetastoreConfig.EndpointProtocol endpoint_protocol = 4;
   * </code>
   *
   * @return The endpointProtocol.
   */
  com.google.cloud.metastore.v1beta.HiveMetastoreConfig.EndpointProtocol getEndpointProtocol();

  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore version to the auxiliary version
   * configuration. When specified, a secondary Hive metastore service is
   * created along with the primary service. All auxiliary versions must be less
   * than the service's primary version. The key is the auxiliary service name
   * and it must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])?. This
   * means that the first character must be a lowercase letter, and all the
   * following characters must be hyphens, lowercase letters, or digits, except
   * the last character, which cannot be a hyphen.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.metastore.v1beta.AuxiliaryVersionConfig&gt; auxiliary_versions = 5;
   * </code>
   */
  int getAuxiliaryVersionsCount();
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore version to the auxiliary version
   * configuration. When specified, a secondary Hive metastore service is
   * created along with the primary service. All auxiliary versions must be less
   * than the service's primary version. The key is the auxiliary service name
   * and it must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])?. This
   * means that the first character must be a lowercase letter, and all the
   * following characters must be hyphens, lowercase letters, or digits, except
   * the last character, which cannot be a hyphen.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.metastore.v1beta.AuxiliaryVersionConfig&gt; auxiliary_versions = 5;
   * </code>
   */
  boolean containsAuxiliaryVersions(java.lang.String key);
  /** Use {@link #getAuxiliaryVersionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.metastore.v1beta.AuxiliaryVersionConfig>
      getAuxiliaryVersions();
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore version to the auxiliary version
   * configuration. When specified, a secondary Hive metastore service is
   * created along with the primary service. All auxiliary versions must be less
   * than the service's primary version. The key is the auxiliary service name
   * and it must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])?. This
   * means that the first character must be a lowercase letter, and all the
   * following characters must be hyphens, lowercase letters, or digits, except
   * the last character, which cannot be a hyphen.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.metastore.v1beta.AuxiliaryVersionConfig&gt; auxiliary_versions = 5;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.metastore.v1beta.AuxiliaryVersionConfig>
      getAuxiliaryVersionsMap();
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore version to the auxiliary version
   * configuration. When specified, a secondary Hive metastore service is
   * created along with the primary service. All auxiliary versions must be less
   * than the service's primary version. The key is the auxiliary service name
   * and it must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])?. This
   * means that the first character must be a lowercase letter, and all the
   * following characters must be hyphens, lowercase letters, or digits, except
   * the last character, which cannot be a hyphen.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.metastore.v1beta.AuxiliaryVersionConfig&gt; auxiliary_versions = 5;
   * </code>
   */
  /* nullable */
  com.google.cloud.metastore.v1beta.AuxiliaryVersionConfig getAuxiliaryVersionsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.metastore.v1beta.AuxiliaryVersionConfig defaultValue);
  /**
   *
   *
   * <pre>
   * A mapping of Hive metastore version to the auxiliary version
   * configuration. When specified, a secondary Hive metastore service is
   * created along with the primary service. All auxiliary versions must be less
   * than the service's primary version. The key is the auxiliary service name
   * and it must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])?. This
   * means that the first character must be a lowercase letter, and all the
   * following characters must be hyphens, lowercase letters, or digits, except
   * the last character, which cannot be a hyphen.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.metastore.v1beta.AuxiliaryVersionConfig&gt; auxiliary_versions = 5;
   * </code>
   */
  com.google.cloud.metastore.v1beta.AuxiliaryVersionConfig getAuxiliaryVersionsOrThrow(
      java.lang.String key);
}
