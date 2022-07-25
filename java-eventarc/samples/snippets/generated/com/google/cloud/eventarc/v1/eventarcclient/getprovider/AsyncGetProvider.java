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

package com.google.cloud.eventarc.v1.samples;

// [START eventarc_v1_generated_eventarcclient_getprovider_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.eventarc.v1.EventarcClient;
import com.google.cloud.eventarc.v1.GetProviderRequest;
import com.google.cloud.eventarc.v1.Provider;
import com.google.cloud.eventarc.v1.ProviderName;

public class AsyncGetProvider {

  public static void main(String[] args) throws Exception {
    asyncGetProvider();
  }

  public static void asyncGetProvider() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (EventarcClient eventarcClient = EventarcClient.create()) {
      GetProviderRequest request =
          GetProviderRequest.newBuilder()
              .setName(ProviderName.of("[PROJECT]", "[LOCATION]", "[PROVIDER]").toString())
              .build();
      ApiFuture<Provider> future = eventarcClient.getProviderCallable().futureCall(request);
      // Do something.
      Provider response = future.get();
    }
  }
}
// [END eventarc_v1_generated_eventarcclient_getprovider_async]
