/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.gkeconnect.gateway.v1.samples;

// [START connectgateway_v1_generated_GatewayControl_GenerateCredentials_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.gkeconnect.gateway.v1.GatewayControlClient;
import com.google.cloud.gkeconnect.gateway.v1.GenerateCredentialsRequest;
import com.google.cloud.gkeconnect.gateway.v1.GenerateCredentialsResponse;

public class AsyncGenerateCredentials {

  public static void main(String[] args) throws Exception {
    asyncGenerateCredentials();
  }

  public static void asyncGenerateCredentials() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (GatewayControlClient gatewayControlClient = GatewayControlClient.create()) {
      GenerateCredentialsRequest request =
          GenerateCredentialsRequest.newBuilder()
              .setName("name3373707")
              .setForceUseAgent(true)
              .setVersion("version351608024")
              .setKubernetesNamespace("kubernetesNamespace-1862862667")
              .build();
      ApiFuture<GenerateCredentialsResponse> future =
          gatewayControlClient.generateCredentialsCallable().futureCall(request);
      // Do something.
      GenerateCredentialsResponse response = future.get();
    }
  }
}
// [END connectgateway_v1_generated_GatewayControl_GenerateCredentials_async]
