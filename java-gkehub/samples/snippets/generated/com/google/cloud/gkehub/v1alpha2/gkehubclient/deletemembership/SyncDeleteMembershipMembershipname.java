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

package com.google.cloud.gkehub.v1alpha2.samples;

// [START gkehub_v1alpha2_generated_gkehubclient_deletemembership_membershipname_sync]
import com.google.cloud.gkehub.v1alpha2.GkeHubClient;
import com.google.cloud.gkehub.v1alpha2.MembershipName;
import com.google.protobuf.Empty;

public class SyncDeleteMembershipMembershipname {

  public static void main(String[] args) throws Exception {
    syncDeleteMembershipMembershipname();
  }

  public static void syncDeleteMembershipMembershipname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (GkeHubClient gkeHubClient = GkeHubClient.create()) {
      MembershipName name = MembershipName.of("[PROJECT]", "[LOCATION]", "[MEMBERSHIP]");
      gkeHubClient.deleteMembershipAsync(name).get();
    }
  }
}
// [END gkehub_v1alpha2_generated_gkehubclient_deletemembership_membershipname_sync]
