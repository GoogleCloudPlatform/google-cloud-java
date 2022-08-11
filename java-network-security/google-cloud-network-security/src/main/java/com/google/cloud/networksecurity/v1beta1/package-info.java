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
 * A client to Network Security API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= NetworkSecurityClient =======================
 *
 * <p>Service Description: Network Security API provides resources to configure authentication and
 * authorization policies. Refer to per API resource documentation for more information.
 *
 * <p>Sample for NetworkSecurityClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (NetworkSecurityClient networkSecurityClient = NetworkSecurityClient.create()) {
 *   AuthorizationPolicyName name =
 *       AuthorizationPolicyName.of("[PROJECT]", "[LOCATION]", "[AUTHORIZATION_POLICY]");
 *   AuthorizationPolicy response = networkSecurityClient.getAuthorizationPolicy(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.networksecurity.v1beta1;

import javax.annotation.Generated;
