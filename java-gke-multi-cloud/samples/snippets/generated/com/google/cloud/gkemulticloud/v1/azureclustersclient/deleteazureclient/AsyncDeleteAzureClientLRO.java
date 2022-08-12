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

package com.google.cloud.gkemulticloud.v1.samples;

// [START gkemulticloud_v1_generated_azureclustersclient_deleteazureclient_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.gkemulticloud.v1.AzureClientName;
import com.google.cloud.gkemulticloud.v1.AzureClustersClient;
import com.google.cloud.gkemulticloud.v1.DeleteAzureClientRequest;
import com.google.cloud.gkemulticloud.v1.OperationMetadata;
import com.google.protobuf.Empty;

public class AsyncDeleteAzureClientLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteAzureClientLRO();
  }

  public static void asyncDeleteAzureClientLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AzureClustersClient azureClustersClient = AzureClustersClient.create()) {
      DeleteAzureClientRequest request =
          DeleteAzureClientRequest.newBuilder()
              .setName(AzureClientName.of("[PROJECT]", "[LOCATION]", "[AZURE_CLIENT]").toString())
              .setAllowMissing(true)
              .setValidateOnly(true)
              .build();
      OperationFuture<Empty, OperationMetadata> future =
          azureClustersClient.deleteAzureClientOperationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END gkemulticloud_v1_generated_azureclustersclient_deleteazureclient_lro_async]
