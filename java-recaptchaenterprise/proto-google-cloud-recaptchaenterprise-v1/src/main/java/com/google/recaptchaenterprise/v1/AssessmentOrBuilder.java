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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.5
package com.google.recaptchaenterprise.v1;

public interface AssessmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.Assessment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Identifier. The resource name for the Assessment in the format
   * `projects/{project}/assessments/{assessment}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Identifier. The resource name for the Assessment in the format
   * `projects/{project}/assessments/{assessment}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The event being assessed.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Event event = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   *
   *
   * <pre>
   * Optional. The event being assessed.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Event event = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The event.
   */
  com.google.recaptchaenterprise.v1.Event getEvent();
  /**
   *
   *
   * <pre>
   * Optional. The event being assessed.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Event event = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1.EventOrBuilder getEventOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The risk analysis result for the event being assessed.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.RiskAnalysis risk_analysis = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the riskAnalysis field is set.
   */
  boolean hasRiskAnalysis();
  /**
   *
   *
   * <pre>
   * Output only. The risk analysis result for the event being assessed.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.RiskAnalysis risk_analysis = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The riskAnalysis.
   */
  com.google.recaptchaenterprise.v1.RiskAnalysis getRiskAnalysis();
  /**
   *
   *
   * <pre>
   * Output only. The risk analysis result for the event being assessed.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.RiskAnalysis risk_analysis = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.RiskAnalysisOrBuilder getRiskAnalysisOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Properties of the provided event token.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TokenProperties token_properties = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the tokenProperties field is set.
   */
  boolean hasTokenProperties();
  /**
   *
   *
   * <pre>
   * Output only. Properties of the provided event token.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TokenProperties token_properties = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The tokenProperties.
   */
  com.google.recaptchaenterprise.v1.TokenProperties getTokenProperties();
  /**
   *
   *
   * <pre>
   * Output only. Properties of the provided event token.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TokenProperties token_properties = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.TokenPropertiesOrBuilder getTokenPropertiesOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Account verification information for identity verification. The
   * assessment event must include a token and site key to use this feature.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AccountVerificationInfo account_verification = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the accountVerification field is set.
   */
  boolean hasAccountVerification();
  /**
   *
   *
   * <pre>
   * Optional. Account verification information for identity verification. The
   * assessment event must include a token and site key to use this feature.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AccountVerificationInfo account_verification = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The accountVerification.
   */
  com.google.recaptchaenterprise.v1.AccountVerificationInfo getAccountVerification();
  /**
   *
   *
   * <pre>
   * Optional. Account verification information for identity verification. The
   * assessment event must include a token and site key to use this feature.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AccountVerificationInfo account_verification = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1.AccountVerificationInfoOrBuilder
      getAccountVerificationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Assessment returned by account defender when an account
   * identifier is provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment account_defender_assessment = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the accountDefenderAssessment field is set.
   */
  boolean hasAccountDefenderAssessment();
  /**
   *
   *
   * <pre>
   * Output only. Assessment returned by account defender when an account
   * identifier is provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment account_defender_assessment = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The accountDefenderAssessment.
   */
  com.google.recaptchaenterprise.v1.AccountDefenderAssessment getAccountDefenderAssessment();
  /**
   *
   *
   * <pre>
   * Output only. Assessment returned by account defender when an account
   * identifier is provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment account_defender_assessment = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.AccountDefenderAssessmentOrBuilder
      getAccountDefenderAssessmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The private password leak verification field contains the
   * parameters that are used to to check for leaks privately without sharing
   * user credentials.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification private_password_leak_verification = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the privatePasswordLeakVerification field is set.
   */
  boolean hasPrivatePasswordLeakVerification();
  /**
   *
   *
   * <pre>
   * Optional. The private password leak verification field contains the
   * parameters that are used to to check for leaks privately without sharing
   * user credentials.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification private_password_leak_verification = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The privatePasswordLeakVerification.
   */
  com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerification
      getPrivatePasswordLeakVerification();
  /**
   *
   *
   * <pre>
   * Optional. The private password leak verification field contains the
   * parameters that are used to to check for leaks privately without sharing
   * user credentials.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification private_password_leak_verification = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1.PrivatePasswordLeakVerificationOrBuilder
      getPrivatePasswordLeakVerificationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Assessment returned when firewall policies belonging to the
   * project are evaluated using the field firewall_policy_evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment firewall_policy_assessment = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the firewallPolicyAssessment field is set.
   */
  boolean hasFirewallPolicyAssessment();
  /**
   *
   *
   * <pre>
   * Output only. Assessment returned when firewall policies belonging to the
   * project are evaluated using the field firewall_policy_evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment firewall_policy_assessment = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The firewallPolicyAssessment.
   */
  com.google.recaptchaenterprise.v1.FirewallPolicyAssessment getFirewallPolicyAssessment();
  /**
   *
   *
   * <pre>
   * Output only. Assessment returned when firewall policies belonging to the
   * project are evaluated using the field firewall_policy_evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment firewall_policy_assessment = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.FirewallPolicyAssessmentOrBuilder
      getFirewallPolicyAssessmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Assessment returned by Fraud Prevention when TransactionData
   * is provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment fraud_prevention_assessment = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the fraudPreventionAssessment field is set.
   */
  boolean hasFraudPreventionAssessment();
  /**
   *
   *
   * <pre>
   * Output only. Assessment returned by Fraud Prevention when TransactionData
   * is provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment fraud_prevention_assessment = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The fraudPreventionAssessment.
   */
  com.google.recaptchaenterprise.v1.FraudPreventionAssessment getFraudPreventionAssessment();
  /**
   *
   *
   * <pre>
   * Output only. Assessment returned by Fraud Prevention when TransactionData
   * is provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudPreventionAssessment fraud_prevention_assessment = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.FraudPreventionAssessmentOrBuilder
      getFraudPreventionAssessmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Fraud Signals specific to the users involved in a payment
   * transaction.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudSignals fraud_signals = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the fraudSignals field is set.
   */
  boolean hasFraudSignals();
  /**
   *
   *
   * <pre>
   * Output only. Fraud Signals specific to the users involved in a payment
   * transaction.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudSignals fraud_signals = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The fraudSignals.
   */
  com.google.recaptchaenterprise.v1.FraudSignals getFraudSignals();
  /**
   *
   *
   * <pre>
   * Output only. Fraud Signals specific to the users involved in a payment
   * transaction.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FraudSignals fraud_signals = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.FraudSignalsOrBuilder getFraudSignalsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Assessment returned when a site key, a token, and a phone
   * number as `user_id` are provided. Account defender and SMS toll fraud
   * protection need to be enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.PhoneFraudAssessment phone_fraud_assessment = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the phoneFraudAssessment field is set.
   */
  boolean hasPhoneFraudAssessment();
  /**
   *
   *
   * <pre>
   * Output only. Assessment returned when a site key, a token, and a phone
   * number as `user_id` are provided. Account defender and SMS toll fraud
   * protection need to be enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.PhoneFraudAssessment phone_fraud_assessment = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The phoneFraudAssessment.
   */
  com.google.recaptchaenterprise.v1.PhoneFraudAssessment getPhoneFraudAssessment();
  /**
   *
   *
   * <pre>
   * Output only. Assessment returned when a site key, a token, and a phone
   * number as `user_id` are provided. Account defender and SMS toll fraud
   * protection need to be enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.PhoneFraudAssessment phone_fraud_assessment = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.PhoneFraudAssessmentOrBuilder
      getPhoneFraudAssessmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The environment creating the assessment. This describes your
   * environment (the system invoking CreateAssessment), NOT the environment of
   * your user.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AssessmentEnvironment assessment_environment = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the assessmentEnvironment field is set.
   */
  boolean hasAssessmentEnvironment();
  /**
   *
   *
   * <pre>
   * Optional. The environment creating the assessment. This describes your
   * environment (the system invoking CreateAssessment), NOT the environment of
   * your user.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AssessmentEnvironment assessment_environment = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The assessmentEnvironment.
   */
  com.google.recaptchaenterprise.v1.AssessmentEnvironment getAssessmentEnvironment();
  /**
   *
   *
   * <pre>
   * Optional. The environment creating the assessment. This describes your
   * environment (the system invoking CreateAssessment), NOT the environment of
   * your user.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AssessmentEnvironment assessment_environment = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1.AssessmentEnvironmentOrBuilder
      getAssessmentEnvironmentOrBuilder();
}
