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
// source: google/devtools/containeranalysis/v1beta1/attestation/attestation.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1.attestation;

public interface PgpSignedAttestationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.attestation.PgpSignedAttestation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The raw content of the signature, as output by GNU Privacy Guard
   * (GPG) or equivalent. Since this message only supports attached signatures,
   * the payload that was signed must be attached. While the signature format
   * supported is dependent on the verification implementation, currently only
   * ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than
   * `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor
   * --output=signature.gpg payload.json` will create the signature content
   * expected in this field in `signature.gpg` for the `payload.json`
   * attestation payload.
   * </pre>
   *
   * <code>string signature = 1;</code>
   *
   * @return The signature.
   */
  java.lang.String getSignature();
  /**
   *
   *
   * <pre>
   * Required. The raw content of the signature, as output by GNU Privacy Guard
   * (GPG) or equivalent. Since this message only supports attached signatures,
   * the payload that was signed must be attached. While the signature format
   * supported is dependent on the verification implementation, currently only
   * ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than
   * `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor
   * --output=signature.gpg payload.json` will create the signature content
   * expected in this field in `signature.gpg` for the `payload.json`
   * attestation payload.
   * </pre>
   *
   * <code>string signature = 1;</code>
   *
   * @return The bytes for signature.
   */
  com.google.protobuf.ByteString getSignatureBytes();

  /**
   *
   *
   * <pre>
   * Type (for example schema) of the attestation payload that was signed.
   * The verifier must ensure that the provided type is one that the verifier
   * supports, and that the attestation payload is a valid instantiation of that
   * type (for example by validating a JSON schema).
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.PgpSignedAttestation.ContentType content_type = 3;</code>
   *
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   *
   *
   * <pre>
   * Type (for example schema) of the attestation payload that was signed.
   * The verifier must ensure that the provided type is one that the verifier
   * supports, and that the attestation payload is a valid instantiation of that
   * type (for example by validating a JSON schema).
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.PgpSignedAttestation.ContentType content_type = 3;</code>
   *
   * @return The contentType.
   */
  io.grafeas.v1beta1.attestation.PgpSignedAttestation.ContentType getContentType();

  /**
   *
   *
   * <pre>
   * The cryptographic fingerprint of the key used to generate the signature,
   * as output by, e.g. `gpg --list-keys`. This should be the version 4, full
   * 160-bit fingerprint, expressed as a 40 character hexidecimal string. See
   * https://tools.ietf.org/html/rfc4880#section-12.2 for details.
   * Implementations may choose to acknowledge "LONG", "SHORT", or other
   * abbreviated key IDs, but only the full fingerprint is guaranteed to work.
   * In gpg, the full fingerprint can be retrieved from the `fpr` field
   * returned when calling --list-keys with --with-colons.  For example:
   * ```
   * gpg --with-colons --with-fingerprint --force-v4-certs &#92;
   *     --list-keys attester&#64;example.com
   * tru::1:1513631572:0:3:1:5
   * pub:...&lt;SNIP&gt;...
   * fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB:
   * ```
   * Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
   * </pre>
   *
   * <code>string pgp_key_id = 2;</code>
   *
   * @return Whether the pgpKeyId field is set.
   */
  boolean hasPgpKeyId();
  /**
   *
   *
   * <pre>
   * The cryptographic fingerprint of the key used to generate the signature,
   * as output by, e.g. `gpg --list-keys`. This should be the version 4, full
   * 160-bit fingerprint, expressed as a 40 character hexidecimal string. See
   * https://tools.ietf.org/html/rfc4880#section-12.2 for details.
   * Implementations may choose to acknowledge "LONG", "SHORT", or other
   * abbreviated key IDs, but only the full fingerprint is guaranteed to work.
   * In gpg, the full fingerprint can be retrieved from the `fpr` field
   * returned when calling --list-keys with --with-colons.  For example:
   * ```
   * gpg --with-colons --with-fingerprint --force-v4-certs &#92;
   *     --list-keys attester&#64;example.com
   * tru::1:1513631572:0:3:1:5
   * pub:...&lt;SNIP&gt;...
   * fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB:
   * ```
   * Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
   * </pre>
   *
   * <code>string pgp_key_id = 2;</code>
   *
   * @return The pgpKeyId.
   */
  java.lang.String getPgpKeyId();
  /**
   *
   *
   * <pre>
   * The cryptographic fingerprint of the key used to generate the signature,
   * as output by, e.g. `gpg --list-keys`. This should be the version 4, full
   * 160-bit fingerprint, expressed as a 40 character hexidecimal string. See
   * https://tools.ietf.org/html/rfc4880#section-12.2 for details.
   * Implementations may choose to acknowledge "LONG", "SHORT", or other
   * abbreviated key IDs, but only the full fingerprint is guaranteed to work.
   * In gpg, the full fingerprint can be retrieved from the `fpr` field
   * returned when calling --list-keys with --with-colons.  For example:
   * ```
   * gpg --with-colons --with-fingerprint --force-v4-certs &#92;
   *     --list-keys attester&#64;example.com
   * tru::1:1513631572:0:3:1:5
   * pub:...&lt;SNIP&gt;...
   * fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB:
   * ```
   * Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
   * </pre>
   *
   * <code>string pgp_key_id = 2;</code>
   *
   * @return The bytes for pgpKeyId.
   */
  com.google.protobuf.ByteString getPgpKeyIdBytes();

  io.grafeas.v1beta1.attestation.PgpSignedAttestation.KeyIdCase getKeyIdCase();
}
