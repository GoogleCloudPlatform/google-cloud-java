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

// [START eventarc_v1_generated_eventarcclient_getchannelconnection_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.eventarc.v1.ChannelConnection;
import com.google.cloud.eventarc.v1.ChannelConnectionName;
import com.google.cloud.eventarc.v1.EventarcClient;
import com.google.cloud.eventarc.v1.GetChannelConnectionRequest;

public class AsyncGetChannelConnection {

  public static void main(String[] args) throws Exception {
    asyncGetChannelConnection();
  }

  public static void asyncGetChannelConnection() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (EventarcClient eventarcClient = EventarcClient.create()) {
      GetChannelConnectionRequest request =
          GetChannelConnectionRequest.newBuilder()
              .setName(
                  ChannelConnectionName.of("[PROJECT]", "[LOCATION]", "[CHANNEL_CONNECTION]")
                      .toString())
              .build();
      ApiFuture<ChannelConnection> future =
          eventarcClient.getChannelConnectionCallable().futureCall(request);
      // Do something.
      ChannelConnection response = future.get();
    }
  }
}
// [END eventarc_v1_generated_eventarcclient_getchannelconnection_async]
