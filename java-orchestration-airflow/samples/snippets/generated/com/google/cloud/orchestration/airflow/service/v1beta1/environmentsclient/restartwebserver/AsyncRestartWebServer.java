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

package com.google.cloud.orchestration.airflow.service.v1beta1.samples;

// [START service_v1beta1_generated_environmentsclient_restartwebserver_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsClient;
import com.google.cloud.orchestration.airflow.service.v1beta1.RestartWebServerRequest;
import com.google.longrunning.Operation;

public class AsyncRestartWebServer {

  public static void main(String[] args) throws Exception {
    asyncRestartWebServer();
  }

  public static void asyncRestartWebServer() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
      RestartWebServerRequest request =
          RestartWebServerRequest.newBuilder().setName("name3373707").build();
      ApiFuture<Operation> future =
          environmentsClient.restartWebServerCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END service_v1beta1_generated_environmentsclient_restartwebserver_async]
