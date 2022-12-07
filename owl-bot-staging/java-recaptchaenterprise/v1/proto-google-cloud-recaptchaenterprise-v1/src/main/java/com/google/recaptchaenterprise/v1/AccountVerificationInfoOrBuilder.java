// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface AccountVerificationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.AccountVerificationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Endpoints that can be used for identity verification.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.EndpointVerificationInfo endpoints = 1;</code>
   */
  java.util.List<com.google.recaptchaenterprise.v1.EndpointVerificationInfo> 
      getEndpointsList();
  /**
   * <pre>
   * Endpoints that can be used for identity verification.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.EndpointVerificationInfo endpoints = 1;</code>
   */
  com.google.recaptchaenterprise.v1.EndpointVerificationInfo getEndpoints(int index);
  /**
   * <pre>
   * Endpoints that can be used for identity verification.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.EndpointVerificationInfo endpoints = 1;</code>
   */
  int getEndpointsCount();
  /**
   * <pre>
   * Endpoints that can be used for identity verification.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.EndpointVerificationInfo endpoints = 1;</code>
   */
  java.util.List<? extends com.google.recaptchaenterprise.v1.EndpointVerificationInfoOrBuilder> 
      getEndpointsOrBuilderList();
  /**
   * <pre>
   * Endpoints that can be used for identity verification.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.EndpointVerificationInfo endpoints = 1;</code>
   */
  com.google.recaptchaenterprise.v1.EndpointVerificationInfoOrBuilder getEndpointsOrBuilder(
      int index);

  /**
   * <pre>
   * Language code preference for the verification message, set as a IETF BCP 47
   * language code.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Language code preference for the verification message, set as a IETF BCP 47
   * language code.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Output only. Result of the latest account verification challenge.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.AccountVerificationInfo.Result latest_verification_result = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for latestVerificationResult.
   */
  int getLatestVerificationResultValue();
  /**
   * <pre>
   * Output only. Result of the latest account verification challenge.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.AccountVerificationInfo.Result latest_verification_result = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The latestVerificationResult.
   */
  com.google.recaptchaenterprise.v1.AccountVerificationInfo.Result getLatestVerificationResult();

  /**
   * <pre>
   * Username of the account that is being verified. Deprecated. Customers
   * should now provide the hashed account ID field in Event.
   * </pre>
   *
   * <code>string username = 2 [deprecated = true];</code>
   * @deprecated google.cloud.recaptchaenterprise.v1.AccountVerificationInfo.username is deprecated.
   *     See google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto;l=374
   * @return The username.
   */
  @java.lang.Deprecated java.lang.String getUsername();
  /**
   * <pre>
   * Username of the account that is being verified. Deprecated. Customers
   * should now provide the hashed account ID field in Event.
   * </pre>
   *
   * <code>string username = 2 [deprecated = true];</code>
   * @deprecated google.cloud.recaptchaenterprise.v1.AccountVerificationInfo.username is deprecated.
   *     See google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto;l=374
   * @return The bytes for username.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getUsernameBytes();
}
