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

package com.google.cloud.securitycenter.v1beta1.samples;

// [START securitycenter_v1beta1_generated_securitycentersettings_createsource_sync]
import com.google.cloud.securitycenter.v1beta1.SecurityCenterSettings;
import java.time.Duration;

public class SyncCreateSource {

  public static void main(String[] args) throws Exception {
    syncCreateSource();
  }

  public static void syncCreateSource() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    SecurityCenterSettings.Builder securityCenterSettingsBuilder =
        SecurityCenterSettings.newBuilder();
    securityCenterSettingsBuilder
        .createSourceSettings()
        .setRetrySettings(
            securityCenterSettingsBuilder
                .createSourceSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    SecurityCenterSettings securityCenterSettings = securityCenterSettingsBuilder.build();
  }
}
// [END securitycenter_v1beta1_generated_securitycentersettings_createsource_sync]
