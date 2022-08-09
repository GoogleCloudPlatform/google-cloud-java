/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Certificate Authority API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= CertificateAuthorityServiceClient =======================
 *
 * <p>Service Description: [Certificate Authority
 * Service][google.cloud.security.privateca.v1.CertificateAuthorityService] manages private
 * certificate authorities and issued certificates.
 *
 * <p>Sample for CertificateAuthorityServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (CertificateAuthorityServiceClient certificateAuthorityServiceClient =
 *     CertificateAuthorityServiceClient.create()) {
 *   CaPoolName parent = CaPoolName.of("[PROJECT]", "[LOCATION]", "[CA_POOL]");
 *   Certificate certificate = Certificate.newBuilder().build();
 *   String certificateId = "certificateId-644529902";
 *   Certificate response =
 *       certificateAuthorityServiceClient.createCertificate(parent, certificate, certificateId);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.security.privateca.v1;

import javax.annotation.Generated;
