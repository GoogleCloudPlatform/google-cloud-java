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

package com.google.monitoring.metricsscope.v1.samples;

// [START monitoring_v1_generated_MetricsScopes_GetMetricsScope_async]
import com.google.api.core.ApiFuture;
import com.google.monitoring.metricsscope.v1.GetMetricsScopeRequest;
import com.google.monitoring.metricsscope.v1.MetricsScope;
import com.google.monitoring.metricsscope.v1.MetricsScopeName;
import com.google.monitoring.metricsscope.v1.MetricsScopesClient;

public class AsyncGetMetricsScope {

  public static void main(String[] args) throws Exception {
    asyncGetMetricsScope();
  }

  public static void asyncGetMetricsScope() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MetricsScopesClient metricsScopesClient = MetricsScopesClient.create()) {
      GetMetricsScopeRequest request =
          GetMetricsScopeRequest.newBuilder()
              .setName(MetricsScopeName.of("[METRICS_SCOPE]").toString())
              .build();
      ApiFuture<MetricsScope> future =
          metricsScopesClient.getMetricsScopeCallable().futureCall(request);
      // Do something.
      MetricsScope response = future.get();
    }
  }
}
// [END monitoring_v1_generated_MetricsScopes_GetMetricsScope_async]
