// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1beta1;

public interface RepositoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.Repository)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The repository's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The repository's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. The repository's user-friendly name.
   * </pre>
   *
   * <code>string display_name = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Optional. The repository's user-friendly name.
   * </pre>
   *
   * <code>string display_name = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Optional. If set, configures this repository to be linked to a Git remote.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.Repository.GitRemoteSettings git_remote_settings = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the gitRemoteSettings field is set.
   */
  boolean hasGitRemoteSettings();
  /**
   * <pre>
   * Optional. If set, configures this repository to be linked to a Git remote.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.Repository.GitRemoteSettings git_remote_settings = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The gitRemoteSettings.
   */
  com.google.cloud.dataform.v1beta1.Repository.GitRemoteSettings getGitRemoteSettings();
  /**
   * <pre>
   * Optional. If set, configures this repository to be linked to a Git remote.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.Repository.GitRemoteSettings git_remote_settings = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataform.v1beta1.Repository.GitRemoteSettingsOrBuilder getGitRemoteSettingsOrBuilder();

  /**
   * <pre>
   * Optional. The name of the Secret Manager secret version to be used to
   * interpolate variables into the .npmrc file for package installation
   * operations. Must be in the format `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`. The
   * file itself must be in a JSON format.
   * </pre>
   *
   * <code>string npmrc_environment_variables_secret_version = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The npmrcEnvironmentVariablesSecretVersion.
   */
  java.lang.String getNpmrcEnvironmentVariablesSecretVersion();
  /**
   * <pre>
   * Optional. The name of the Secret Manager secret version to be used to
   * interpolate variables into the .npmrc file for package installation
   * operations. Must be in the format `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`. The
   * file itself must be in a JSON format.
   * </pre>
   *
   * <code>string npmrc_environment_variables_secret_version = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for npmrcEnvironmentVariablesSecretVersion.
   */
  com.google.protobuf.ByteString
      getNpmrcEnvironmentVariablesSecretVersionBytes();

  /**
   * <pre>
   * Optional. If set, fields of `workspace_compilation_overrides` override the
   * default compilation settings that are specified in dataform.json when
   * creating workspace-scoped compilation results. See documentation for
   * `WorkspaceCompilationOverrides` for more information.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.Repository.WorkspaceCompilationOverrides workspace_compilation_overrides = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the workspaceCompilationOverrides field is set.
   */
  boolean hasWorkspaceCompilationOverrides();
  /**
   * <pre>
   * Optional. If set, fields of `workspace_compilation_overrides` override the
   * default compilation settings that are specified in dataform.json when
   * creating workspace-scoped compilation results. See documentation for
   * `WorkspaceCompilationOverrides` for more information.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.Repository.WorkspaceCompilationOverrides workspace_compilation_overrides = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The workspaceCompilationOverrides.
   */
  com.google.cloud.dataform.v1beta1.Repository.WorkspaceCompilationOverrides getWorkspaceCompilationOverrides();
  /**
   * <pre>
   * Optional. If set, fields of `workspace_compilation_overrides` override the
   * default compilation settings that are specified in dataform.json when
   * creating workspace-scoped compilation results. See documentation for
   * `WorkspaceCompilationOverrides` for more information.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.Repository.WorkspaceCompilationOverrides workspace_compilation_overrides = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataform.v1beta1.Repository.WorkspaceCompilationOverridesOrBuilder getWorkspaceCompilationOverridesOrBuilder();

  /**
   * <pre>
   * Optional. Repository user labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. Repository user labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. Repository user labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. Repository user labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Repository user labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. Input only. If set to true, the authenticated user will be
   * granted the roles/dataform.admin role on the created repository. To modify
   * access to the created repository later apply setIamPolicy from
   * https://cloud.google.com/dataform/reference/rest#rest-resource:-v1beta1.projects.locations.repositories
   * </pre>
   *
   * <code>bool set_authenticated_user_admin = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The setAuthenticatedUserAdmin.
   */
  boolean getSetAuthenticatedUserAdmin();

  /**
   * <pre>
   * Optional. The service account to run workflow invocations under.
   * </pre>
   *
   * <code>string service_account = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   * <pre>
   * Optional. The service account to run workflow invocations under.
   * </pre>
   *
   * <code>string service_account = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString
      getServiceAccountBytes();
}
