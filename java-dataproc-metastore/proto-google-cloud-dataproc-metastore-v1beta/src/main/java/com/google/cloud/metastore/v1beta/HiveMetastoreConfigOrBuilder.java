/*
 * Copyright 2020 Google LLC
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
   * override system defaults (some keys cannot be overridden).
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
   * override system defaults (some keys cannot be overridden).
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
   * override system defaults (some keys cannot be overridden).
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
   * override system defaults (some keys cannot be overridden).
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
   * override system defaults (some keys cannot be overridden).
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
}
