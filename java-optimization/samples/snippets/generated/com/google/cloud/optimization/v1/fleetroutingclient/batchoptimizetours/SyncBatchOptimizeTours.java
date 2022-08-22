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

package com.google.cloud.optimization.v1.samples;

// [START optimization_v1_generated_fleetroutingclient_batchoptimizetours_sync]
import com.google.cloud.optimization.v1.BatchOptimizeToursRequest;
import com.google.cloud.optimization.v1.BatchOptimizeToursResponse;
import com.google.cloud.optimization.v1.FleetRoutingClient;
import java.util.ArrayList;

public class SyncBatchOptimizeTours {

  public static void main(String[] args) throws Exception {
    syncBatchOptimizeTours();
  }

  public static void syncBatchOptimizeTours() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (FleetRoutingClient fleetRoutingClient = FleetRoutingClient.create()) {
      BatchOptimizeToursRequest request =
          BatchOptimizeToursRequest.newBuilder()
              .setParent("parent-995424086")
              .addAllModelConfigs(new ArrayList<BatchOptimizeToursRequest.AsyncModelConfig>())
              .build();
      BatchOptimizeToursResponse response =
          fleetRoutingClient.batchOptimizeToursAsync(request).get();
    }
  }
}
// [END optimization_v1_generated_fleetroutingclient_batchoptimizetours_sync]
