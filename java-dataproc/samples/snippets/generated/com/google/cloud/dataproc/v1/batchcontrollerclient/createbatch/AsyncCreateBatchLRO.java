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

package com.google.cloud.dataproc.v1.samples;

// [START dataproc_v1_generated_batchcontrollerclient_createbatch_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.dataproc.v1.Batch;
import com.google.cloud.dataproc.v1.BatchControllerClient;
import com.google.cloud.dataproc.v1.BatchOperationMetadata;
import com.google.cloud.dataproc.v1.CreateBatchRequest;
import com.google.cloud.dataproc.v1.LocationName;

public class AsyncCreateBatchLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateBatchLRO();
  }

  public static void asyncCreateBatchLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (BatchControllerClient batchControllerClient = BatchControllerClient.create()) {
      CreateBatchRequest request =
          CreateBatchRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setBatch(Batch.newBuilder().build())
              .setBatchId("batchId-331744779")
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<Batch, BatchOperationMetadata> future =
          batchControllerClient.createBatchOperationCallable().futureCall(request);
      // Do something.
      Batch response = future.get();
    }
  }
}
// [END dataproc_v1_generated_batchcontrollerclient_createbatch_lro_async]
