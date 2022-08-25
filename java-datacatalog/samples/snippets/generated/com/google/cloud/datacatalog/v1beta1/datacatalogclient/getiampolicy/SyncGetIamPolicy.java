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

package com.google.cloud.datacatalog.v1beta1.samples;

// [START datacatalog_v1beta1_generated_datacatalogclient_getiampolicy_sync]
import com.google.cloud.datacatalog.v1beta1.DataCatalogClient;
import com.google.cloud.datacatalog.v1beta1.EntryName;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.GetPolicyOptions;
import com.google.iam.v1.Policy;

public class SyncGetIamPolicy {

  public static void main(String[] args) throws Exception {
    syncGetIamPolicy();
  }

  public static void syncGetIamPolicy() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
      GetIamPolicyRequest request =
          GetIamPolicyRequest.newBuilder()
              .setResource(
                  EntryName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]", "[ENTRY]").toString())
              .setOptions(GetPolicyOptions.newBuilder().build())
              .build();
      Policy response = dataCatalogClient.getIamPolicy(request);
    }
  }
}
// [END datacatalog_v1beta1_generated_datacatalogclient_getiampolicy_sync]
