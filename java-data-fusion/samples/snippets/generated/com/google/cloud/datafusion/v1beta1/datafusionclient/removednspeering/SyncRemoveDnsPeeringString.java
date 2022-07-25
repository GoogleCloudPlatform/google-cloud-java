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

package com.google.cloud.datafusion.v1beta1.samples;

// [START datafusion_v1beta1_generated_datafusionclient_removednspeering_string_sync]
import com.google.cloud.datafusion.v1beta1.DataFusionClient;
import com.google.cloud.datafusion.v1beta1.InstanceName;
import com.google.cloud.datafusion.v1beta1.RemoveDnsPeeringResponse;

public class SyncRemoveDnsPeeringString {

  public static void main(String[] args) throws Exception {
    syncRemoveDnsPeeringString();
  }

  public static void syncRemoveDnsPeeringString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataFusionClient dataFusionClient = DataFusionClient.create()) {
      String parent = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString();
      RemoveDnsPeeringResponse response = dataFusionClient.removeDnsPeering(parent);
    }
  }
}
// [END datafusion_v1beta1_generated_datafusionclient_removednspeering_string_sync]
