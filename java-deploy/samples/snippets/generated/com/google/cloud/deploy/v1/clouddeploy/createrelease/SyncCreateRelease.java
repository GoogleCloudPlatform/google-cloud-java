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

package com.google.cloud.deploy.v1.samples;

// [START clouddeploy_v1_generated_CloudDeploy_CreateRelease_sync]
import com.google.cloud.deploy.v1.CloudDeployClient;
import com.google.cloud.deploy.v1.CreateReleaseRequest;
import com.google.cloud.deploy.v1.DeliveryPipelineName;
import com.google.cloud.deploy.v1.Release;
import java.util.ArrayList;

public class SyncCreateRelease {

  public static void main(String[] args) throws Exception {
    syncCreateRelease();
  }

  public static void syncCreateRelease() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudDeployClient cloudDeployClient = CloudDeployClient.create()) {
      CreateReleaseRequest request =
          CreateReleaseRequest.newBuilder()
              .setParent(
                  DeliveryPipelineName.of("[PROJECT]", "[LOCATION]", "[DELIVERY_PIPELINE]")
                      .toString())
              .setReleaseId("releaseId89607042")
              .setRelease(Release.newBuilder().build())
              .setRequestId("requestId693933066")
              .setValidateOnly(true)
              .addAllOverrideDeployPolicy(new ArrayList<String>())
              .build();
      Release response = cloudDeployClient.createReleaseAsync(request).get();
    }
  }
}
// [END clouddeploy_v1_generated_CloudDeploy_CreateRelease_sync]
