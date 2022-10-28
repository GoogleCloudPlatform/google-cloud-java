// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface SecurityConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.SecurityConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Kerberos related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the kerberosConfig field is set.
   */
  boolean hasKerberosConfig();
  /**
   * <pre>
   * Optional. Kerberos related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The kerberosConfig.
   */
  com.google.cloud.dataproc.v1.KerberosConfig getKerberosConfig();
  /**
   * <pre>
   * Optional. Kerberos related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.KerberosConfigOrBuilder getKerberosConfigOrBuilder();

  /**
   * <pre>
   * Optional. Identity related configuration, including service account based
   * secure multi-tenancy user mappings.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.IdentityConfig identity_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the identityConfig field is set.
   */
  boolean hasIdentityConfig();
  /**
   * <pre>
   * Optional. Identity related configuration, including service account based
   * secure multi-tenancy user mappings.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.IdentityConfig identity_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The identityConfig.
   */
  com.google.cloud.dataproc.v1.IdentityConfig getIdentityConfig();
  /**
   * <pre>
   * Optional. Identity related configuration, including service account based
   * secure multi-tenancy user mappings.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.IdentityConfig identity_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.IdentityConfigOrBuilder getIdentityConfigOrBuilder();
}
