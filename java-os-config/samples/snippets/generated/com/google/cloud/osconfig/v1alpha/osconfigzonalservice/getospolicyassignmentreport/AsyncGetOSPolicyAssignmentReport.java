/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.osconfig.v1alpha.samples;

// [START osconfig_v1alpha_generated_OsConfigZonalService_GetOSPolicyAssignmentReport_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest;
import com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReport;
import com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReportName;
import com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient;

public class AsyncGetOSPolicyAssignmentReport {

  public static void main(String[] args) throws Exception {
    asyncGetOSPolicyAssignmentReport();
  }

  public static void asyncGetOSPolicyAssignmentReport() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (OsConfigZonalServiceClient osConfigZonalServiceClient =
        OsConfigZonalServiceClient.create()) {
      GetOSPolicyAssignmentReportRequest request =
          GetOSPolicyAssignmentReportRequest.newBuilder()
              .setName(
                  OSPolicyAssignmentReportName.of(
                          "[PROJECT]", "[LOCATION]", "[INSTANCE]", "[ASSIGNMENT]")
                      .toString())
              .build();
      ApiFuture<OSPolicyAssignmentReport> future =
          osConfigZonalServiceClient.getOSPolicyAssignmentReportCallable().futureCall(request);
      // Do something.
      OSPolicyAssignmentReport response = future.get();
    }
  }
}
// [END osconfig_v1alpha_generated_OsConfigZonalService_GetOSPolicyAssignmentReport_async]
