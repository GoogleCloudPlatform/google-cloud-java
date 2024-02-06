// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/confidentialcomputing/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.confidentialcomputing.v1;

public interface TpmAttestationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.confidentialcomputing.v1.TpmAttestation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TPM2 PCR Quotes generated by calling TPM2_Quote on each PCR bank.
   * </pre>
   *
   * <code>repeated .google.cloud.confidentialcomputing.v1.TpmAttestation.Quote quotes = 1;</code>
   */
  java.util.List<com.google.cloud.confidentialcomputing.v1.TpmAttestation.Quote> 
      getQuotesList();
  /**
   * <pre>
   * TPM2 PCR Quotes generated by calling TPM2_Quote on each PCR bank.
   * </pre>
   *
   * <code>repeated .google.cloud.confidentialcomputing.v1.TpmAttestation.Quote quotes = 1;</code>
   */
  com.google.cloud.confidentialcomputing.v1.TpmAttestation.Quote getQuotes(int index);
  /**
   * <pre>
   * TPM2 PCR Quotes generated by calling TPM2_Quote on each PCR bank.
   * </pre>
   *
   * <code>repeated .google.cloud.confidentialcomputing.v1.TpmAttestation.Quote quotes = 1;</code>
   */
  int getQuotesCount();
  /**
   * <pre>
   * TPM2 PCR Quotes generated by calling TPM2_Quote on each PCR bank.
   * </pre>
   *
   * <code>repeated .google.cloud.confidentialcomputing.v1.TpmAttestation.Quote quotes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.confidentialcomputing.v1.TpmAttestation.QuoteOrBuilder> 
      getQuotesOrBuilderList();
  /**
   * <pre>
   * TPM2 PCR Quotes generated by calling TPM2_Quote on each PCR bank.
   * </pre>
   *
   * <code>repeated .google.cloud.confidentialcomputing.v1.TpmAttestation.Quote quotes = 1;</code>
   */
  com.google.cloud.confidentialcomputing.v1.TpmAttestation.QuoteOrBuilder getQuotesOrBuilder(
      int index);

  /**
   * <pre>
   * The binary TCG Event Log containing events measured into the TPM by the
   * platform firmware and operating system. Formatted as described in the
   * "TCG PC Client Platform Firmware Profile Specification".
   * </pre>
   *
   * <code>bytes tcg_event_log = 2;</code>
   * @return The tcgEventLog.
   */
  com.google.protobuf.ByteString getTcgEventLog();

  /**
   * <pre>
   * An Event Log containing additional events measured into the TPM that are
   * not already present in the tcg_event_log. Formatted as described in the
   * "Canonical Event Log Format" TCG Specification.
   * </pre>
   *
   * <code>bytes canonical_event_log = 3;</code>
   * @return The canonicalEventLog.
   */
  com.google.protobuf.ByteString getCanonicalEventLog();

  /**
   * <pre>
   * DER-encoded X.509 certificate of the Attestation Key (otherwise known as
   * an AK or a TPM restricted signing key) used to generate the quotes.
   * </pre>
   *
   * <code>bytes ak_cert = 4;</code>
   * @return The akCert.
   */
  com.google.protobuf.ByteString getAkCert();

  /**
   * <pre>
   * List of DER-encoded X.509 certificates which, together with the ak_cert,
   * chain back to a trusted Root Certificate.
   * </pre>
   *
   * <code>repeated bytes cert_chain = 5;</code>
   * @return A list containing the certChain.
   */
  java.util.List<com.google.protobuf.ByteString> getCertChainList();
  /**
   * <pre>
   * List of DER-encoded X.509 certificates which, together with the ak_cert,
   * chain back to a trusted Root Certificate.
   * </pre>
   *
   * <code>repeated bytes cert_chain = 5;</code>
   * @return The count of certChain.
   */
  int getCertChainCount();
  /**
   * <pre>
   * List of DER-encoded X.509 certificates which, together with the ak_cert,
   * chain back to a trusted Root Certificate.
   * </pre>
   *
   * <code>repeated bytes cert_chain = 5;</code>
   * @param index The index of the element to return.
   * @return The certChain at the given index.
   */
  com.google.protobuf.ByteString getCertChain(int index);
}
