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
// source: google/cloud/aiplatform/v1beta1/extension.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface AuthConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.AuthConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Config for API key auth.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthConfig.ApiKeyConfig api_key_config = 2;</code>
   *
   * @return Whether the apiKeyConfig field is set.
   */
  boolean hasApiKeyConfig();
  /**
   *
   *
   * <pre>
   * Config for API key auth.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthConfig.ApiKeyConfig api_key_config = 2;</code>
   *
   * @return The apiKeyConfig.
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.ApiKeyConfig getApiKeyConfig();
  /**
   *
   *
   * <pre>
   * Config for API key auth.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthConfig.ApiKeyConfig api_key_config = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.ApiKeyConfigOrBuilder getApiKeyConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for HTTP Basic auth.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AuthConfig.HttpBasicAuthConfig http_basic_auth_config = 3;
   * </code>
   *
   * @return Whether the httpBasicAuthConfig field is set.
   */
  boolean hasHttpBasicAuthConfig();
  /**
   *
   *
   * <pre>
   * Config for HTTP Basic auth.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AuthConfig.HttpBasicAuthConfig http_basic_auth_config = 3;
   * </code>
   *
   * @return The httpBasicAuthConfig.
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.HttpBasicAuthConfig getHttpBasicAuthConfig();
  /**
   *
   *
   * <pre>
   * Config for HTTP Basic auth.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AuthConfig.HttpBasicAuthConfig http_basic_auth_config = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.HttpBasicAuthConfigOrBuilder
      getHttpBasicAuthConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for Google Service Account auth.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AuthConfig.GoogleServiceAccountConfig google_service_account_config = 4;
   * </code>
   *
   * @return Whether the googleServiceAccountConfig field is set.
   */
  boolean hasGoogleServiceAccountConfig();
  /**
   *
   *
   * <pre>
   * Config for Google Service Account auth.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AuthConfig.GoogleServiceAccountConfig google_service_account_config = 4;
   * </code>
   *
   * @return The googleServiceAccountConfig.
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.GoogleServiceAccountConfig
      getGoogleServiceAccountConfig();
  /**
   *
   *
   * <pre>
   * Config for Google Service Account auth.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AuthConfig.GoogleServiceAccountConfig google_service_account_config = 4;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.GoogleServiceAccountConfigOrBuilder
      getGoogleServiceAccountConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for user oauth.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthConfig.OauthConfig oauth_config = 5;</code>
   *
   * @return Whether the oauthConfig field is set.
   */
  boolean hasOauthConfig();
  /**
   *
   *
   * <pre>
   * Config for user oauth.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthConfig.OauthConfig oauth_config = 5;</code>
   *
   * @return The oauthConfig.
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.OauthConfig getOauthConfig();
  /**
   *
   *
   * <pre>
   * Config for user oauth.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthConfig.OauthConfig oauth_config = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.OauthConfigOrBuilder getOauthConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for user OIDC auth.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthConfig.OidcConfig oidc_config = 7;</code>
   *
   * @return Whether the oidcConfig field is set.
   */
  boolean hasOidcConfig();
  /**
   *
   *
   * <pre>
   * Config for user OIDC auth.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthConfig.OidcConfig oidc_config = 7;</code>
   *
   * @return The oidcConfig.
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.OidcConfig getOidcConfig();
  /**
   *
   *
   * <pre>
   * Config for user OIDC auth.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthConfig.OidcConfig oidc_config = 7;</code>
   */
  com.google.cloud.aiplatform.v1beta1.AuthConfig.OidcConfigOrBuilder getOidcConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Type of auth scheme.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthType auth_type = 101;</code>
   *
   * @return The enum numeric value on the wire for authType.
   */
  int getAuthTypeValue();
  /**
   *
   *
   * <pre>
   * Type of auth scheme.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AuthType auth_type = 101;</code>
   *
   * @return The authType.
   */
  com.google.cloud.aiplatform.v1beta1.AuthType getAuthType();

  com.google.cloud.aiplatform.v1beta1.AuthConfig.AuthConfigCase getAuthConfigCase();
}
