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
// source: google/cloud/scheduler/v1beta1/target.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.scheduler.v1beta1;

public interface HttpTargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.HttpTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The full URI path that the request will be sent to. This string
   * must begin with either "http://" or "https://". Some examples of
   * valid values for [uri][google.cloud.scheduler.v1beta1.HttpTarget.uri] are:
   * `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will
   * encode some characters for safety and compatibility. The maximum allowed
   * URL length is 2083 characters after encoding.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Required. The full URI path that the request will be sent to. This string
   * must begin with either "http://" or "https://". Some examples of
   * valid values for [uri][google.cloud.scheduler.v1beta1.HttpTarget.uri] are:
   * `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will
   * encode some characters for safety and compatibility. The maximum allowed
   * URL length is 2083 characters after encoding.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Which HTTP method to use for the request.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.HttpMethod http_method = 2;</code>
   *
   * @return The enum numeric value on the wire for httpMethod.
   */
  int getHttpMethodValue();
  /**
   *
   *
   * <pre>
   * Which HTTP method to use for the request.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.HttpMethod http_method = 2;</code>
   *
   * @return The httpMethod.
   */
  com.google.cloud.scheduler.v1beta1.HttpMethod getHttpMethod();

  /**
   *
   *
   * <pre>
   * The user can specify HTTP request headers to send with the job's
   * HTTP request. This map contains the header field names and
   * values. Repeated headers are not supported, but a header value can
   * contain commas. These headers represent a subset of the headers
   * that will accompany the job's HTTP request. Some HTTP request
   * headers will be ignored or replaced. A partial list of headers that
   * will be ignored or replaced is below:
   * - Host: This will be computed by Cloud Scheduler and derived from
   * [uri][google.cloud.scheduler.v1beta1.HttpTarget.uri].
   * * `Content-Length`: This will be computed by Cloud Scheduler.
   * * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`.
   * * `X-Google-*`: Google internal use only.
   * * `X-AppEngine-*`: Google internal use only.
   * * `X-CloudScheduler`: This header will be set to true.
   * * `X-CloudScheduler-JobName`: This header will contain the job name.
   * * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in
   * the unix-cron format, this header will contain the job schedule as an
   * offset of UTC parsed according to RFC3339.
   *
   * The total size of headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  int getHeadersCount();
  /**
   *
   *
   * <pre>
   * The user can specify HTTP request headers to send with the job's
   * HTTP request. This map contains the header field names and
   * values. Repeated headers are not supported, but a header value can
   * contain commas. These headers represent a subset of the headers
   * that will accompany the job's HTTP request. Some HTTP request
   * headers will be ignored or replaced. A partial list of headers that
   * will be ignored or replaced is below:
   * - Host: This will be computed by Cloud Scheduler and derived from
   * [uri][google.cloud.scheduler.v1beta1.HttpTarget.uri].
   * * `Content-Length`: This will be computed by Cloud Scheduler.
   * * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`.
   * * `X-Google-*`: Google internal use only.
   * * `X-AppEngine-*`: Google internal use only.
   * * `X-CloudScheduler`: This header will be set to true.
   * * `X-CloudScheduler-JobName`: This header will contain the job name.
   * * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in
   * the unix-cron format, this header will contain the job schedule as an
   * offset of UTC parsed according to RFC3339.
   *
   * The total size of headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  boolean containsHeaders(java.lang.String key);
  /** Use {@link #getHeadersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getHeaders();
  /**
   *
   *
   * <pre>
   * The user can specify HTTP request headers to send with the job's
   * HTTP request. This map contains the header field names and
   * values. Repeated headers are not supported, but a header value can
   * contain commas. These headers represent a subset of the headers
   * that will accompany the job's HTTP request. Some HTTP request
   * headers will be ignored or replaced. A partial list of headers that
   * will be ignored or replaced is below:
   * - Host: This will be computed by Cloud Scheduler and derived from
   * [uri][google.cloud.scheduler.v1beta1.HttpTarget.uri].
   * * `Content-Length`: This will be computed by Cloud Scheduler.
   * * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`.
   * * `X-Google-*`: Google internal use only.
   * * `X-AppEngine-*`: Google internal use only.
   * * `X-CloudScheduler`: This header will be set to true.
   * * `X-CloudScheduler-JobName`: This header will contain the job name.
   * * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in
   * the unix-cron format, this header will contain the job schedule as an
   * offset of UTC parsed according to RFC3339.
   *
   * The total size of headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getHeadersMap();
  /**
   *
   *
   * <pre>
   * The user can specify HTTP request headers to send with the job's
   * HTTP request. This map contains the header field names and
   * values. Repeated headers are not supported, but a header value can
   * contain commas. These headers represent a subset of the headers
   * that will accompany the job's HTTP request. Some HTTP request
   * headers will be ignored or replaced. A partial list of headers that
   * will be ignored or replaced is below:
   * - Host: This will be computed by Cloud Scheduler and derived from
   * [uri][google.cloud.scheduler.v1beta1.HttpTarget.uri].
   * * `Content-Length`: This will be computed by Cloud Scheduler.
   * * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`.
   * * `X-Google-*`: Google internal use only.
   * * `X-AppEngine-*`: Google internal use only.
   * * `X-CloudScheduler`: This header will be set to true.
   * * `X-CloudScheduler-JobName`: This header will contain the job name.
   * * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in
   * the unix-cron format, this header will contain the job schedule as an
   * offset of UTC parsed according to RFC3339.
   *
   * The total size of headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  /* nullable */
  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The user can specify HTTP request headers to send with the job's
   * HTTP request. This map contains the header field names and
   * values. Repeated headers are not supported, but a header value can
   * contain commas. These headers represent a subset of the headers
   * that will accompany the job's HTTP request. Some HTTP request
   * headers will be ignored or replaced. A partial list of headers that
   * will be ignored or replaced is below:
   * - Host: This will be computed by Cloud Scheduler and derived from
   * [uri][google.cloud.scheduler.v1beta1.HttpTarget.uri].
   * * `Content-Length`: This will be computed by Cloud Scheduler.
   * * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`.
   * * `X-Google-*`: Google internal use only.
   * * `X-AppEngine-*`: Google internal use only.
   * * `X-CloudScheduler`: This header will be set to true.
   * * `X-CloudScheduler-JobName`: This header will contain the job name.
   * * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in
   * the unix-cron format, this header will contain the job schedule as an
   * offset of UTC parsed according to RFC3339.
   *
   * The total size of headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  java.lang.String getHeadersOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * HTTP request body. A request body is allowed only if the HTTP
   * method is POST, PUT, or PATCH. It is an error to set body on a job with an
   * incompatible [HttpMethod][google.cloud.scheduler.v1beta1.HttpMethod].
   * </pre>
   *
   * <code>bytes body = 4;</code>
   *
   * @return The body.
   */
  com.google.protobuf.ByteString getBody();

  /**
   *
   *
   * <pre>
   * If specified, an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2)
   * will be generated and attached as an `Authorization` header in the HTTP
   * request.
   *
   * This type of authorization should generally only be used when calling
   * Google APIs hosted on *.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.OAuthToken oauth_token = 5;</code>
   *
   * @return Whether the oauthToken field is set.
   */
  boolean hasOauthToken();
  /**
   *
   *
   * <pre>
   * If specified, an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2)
   * will be generated and attached as an `Authorization` header in the HTTP
   * request.
   *
   * This type of authorization should generally only be used when calling
   * Google APIs hosted on *.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.OAuthToken oauth_token = 5;</code>
   *
   * @return The oauthToken.
   */
  com.google.cloud.scheduler.v1beta1.OAuthToken getOauthToken();
  /**
   *
   *
   * <pre>
   * If specified, an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2)
   * will be generated and attached as an `Authorization` header in the HTTP
   * request.
   *
   * This type of authorization should generally only be used when calling
   * Google APIs hosted on *.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.OAuthToken oauth_token = 5;</code>
   */
  com.google.cloud.scheduler.v1beta1.OAuthTokenOrBuilder getOauthTokenOrBuilder();

  /**
   *
   *
   * <pre>
   * If specified, an
   * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
   * token will be generated and attached as an `Authorization` header in the
   * HTTP request.
   *
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.OidcToken oidc_token = 6;</code>
   *
   * @return Whether the oidcToken field is set.
   */
  boolean hasOidcToken();
  /**
   *
   *
   * <pre>
   * If specified, an
   * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
   * token will be generated and attached as an `Authorization` header in the
   * HTTP request.
   *
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.OidcToken oidc_token = 6;</code>
   *
   * @return The oidcToken.
   */
  com.google.cloud.scheduler.v1beta1.OidcToken getOidcToken();
  /**
   *
   *
   * <pre>
   * If specified, an
   * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
   * token will be generated and attached as an `Authorization` header in the
   * HTTP request.
   *
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.OidcToken oidc_token = 6;</code>
   */
  com.google.cloud.scheduler.v1beta1.OidcTokenOrBuilder getOidcTokenOrBuilder();

  com.google.cloud.scheduler.v1beta1.HttpTarget.AuthorizationHeaderCase
      getAuthorizationHeaderCase();
}
