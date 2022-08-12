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

package com.google.cloud.datastream.v1alpha1.samples;

// [START datastream_v1alpha1_generated_datastreamclient_createroute_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datastream.v1alpha1.CreateRouteRequest;
import com.google.cloud.datastream.v1alpha1.DatastreamClient;
import com.google.cloud.datastream.v1alpha1.PrivateConnectionName;
import com.google.cloud.datastream.v1alpha1.Route;
import com.google.longrunning.Operation;

public class AsyncCreateRoute {

  public static void main(String[] args) throws Exception {
    asyncCreateRoute();
  }

  public static void asyncCreateRoute() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DatastreamClient datastreamClient = DatastreamClient.create()) {
      CreateRouteRequest request =
          CreateRouteRequest.newBuilder()
              .setParent(
                  PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]")
                      .toString())
              .setRouteId("routeId1385647428")
              .setRoute(Route.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future = datastreamClient.createRouteCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END datastream_v1alpha1_generated_datastreamclient_createroute_async]
