// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface HttpRequestContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.HttpRequestContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of HTTP request, such as `GET`, `POST`, etc.
   * </pre>
   *
   * <code>string method = 1;</code>
   */
  java.lang.String getMethod();
  /**
   *
   *
   * <pre>
   * The type of HTTP request, such as `GET`, `POST`, etc.
   * </pre>
   *
   * <code>string method = 1;</code>
   */
  com.google.protobuf.ByteString getMethodBytes();

  /**
   *
   *
   * <pre>
   * The URL of the request.
   * </pre>
   *
   * <code>string url = 2;</code>
   */
  java.lang.String getUrl();
  /**
   *
   *
   * <pre>
   * The URL of the request.
   * </pre>
   *
   * <code>string url = 2;</code>
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   * The user agent information that is provided with the request.
   * </pre>
   *
   * <code>string user_agent = 3;</code>
   */
  java.lang.String getUserAgent();
  /**
   *
   *
   * <pre>
   * The user agent information that is provided with the request.
   * </pre>
   *
   * <code>string user_agent = 3;</code>
   */
  com.google.protobuf.ByteString getUserAgentBytes();

  /**
   *
   *
   * <pre>
   * The referrer information that is provided with the request.
   * </pre>
   *
   * <code>string referrer = 4;</code>
   */
  java.lang.String getReferrer();
  /**
   *
   *
   * <pre>
   * The referrer information that is provided with the request.
   * </pre>
   *
   * <code>string referrer = 4;</code>
   */
  com.google.protobuf.ByteString getReferrerBytes();

  /**
   *
   *
   * <pre>
   * The HTTP response status code for the request.
   * </pre>
   *
   * <code>int32 response_status_code = 5;</code>
   */
  int getResponseStatusCode();

  /**
   *
   *
   * <pre>
   * The IP address from which the request originated.
   * This can be IPv4, IPv6, or a token which is derived from the
   * IP address, depending on the data that has been provided
   * in the error report.
   * </pre>
   *
   * <code>string remote_ip = 6;</code>
   */
  java.lang.String getRemoteIp();
  /**
   *
   *
   * <pre>
   * The IP address from which the request originated.
   * This can be IPv4, IPv6, or a token which is derived from the
   * IP address, depending on the data that has been provided
   * in the error report.
   * </pre>
   *
   * <code>string remote_ip = 6;</code>
   */
  com.google.protobuf.ByteString getRemoteIpBytes();
}
