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

// [START datacatalog_v1beta1_generated_policytagmanagerserializationclient_exporttaxonomies_sync]
import com.google.cloud.datacatalog.v1beta1.ExportTaxonomiesRequest;
import com.google.cloud.datacatalog.v1beta1.ExportTaxonomiesResponse;
import com.google.cloud.datacatalog.v1beta1.LocationName;
import com.google.cloud.datacatalog.v1beta1.PolicyTagManagerSerializationClient;
import java.util.ArrayList;

public class SyncExportTaxonomies {

  public static void main(String[] args) throws Exception {
    syncExportTaxonomies();
  }

  public static void syncExportTaxonomies() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PolicyTagManagerSerializationClient policyTagManagerSerializationClient =
        PolicyTagManagerSerializationClient.create()) {
      ExportTaxonomiesRequest request =
          ExportTaxonomiesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .addAllTaxonomies(new ArrayList<String>())
              .build();
      ExportTaxonomiesResponse response =
          policyTagManagerSerializationClient.exportTaxonomies(request);
    }
  }
}
// [END datacatalog_v1beta1_generated_policytagmanagerserializationclient_exporttaxonomies_sync]
