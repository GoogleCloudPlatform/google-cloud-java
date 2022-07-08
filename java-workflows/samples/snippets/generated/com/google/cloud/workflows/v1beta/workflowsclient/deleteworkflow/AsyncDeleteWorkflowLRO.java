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

package com.google.cloud.workflows.v1beta.samples;

// [START workflows_v1beta_generated_workflowsclient_deleteworkflow_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.workflows.v1beta.DeleteWorkflowRequest;
import com.google.cloud.workflows.v1beta.OperationMetadata;
import com.google.cloud.workflows.v1beta.WorkflowName;
import com.google.cloud.workflows.v1beta.WorkflowsClient;
import com.google.protobuf.Empty;

public class AsyncDeleteWorkflowLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteWorkflowLRO();
  }

  public static void asyncDeleteWorkflowLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WorkflowsClient workflowsClient = WorkflowsClient.create()) {
      DeleteWorkflowRequest request =
          DeleteWorkflowRequest.newBuilder()
              .setName(WorkflowName.of("[PROJECT]", "[LOCATION]", "[WORKFLOW]").toString())
              .build();
      OperationFuture<Empty, OperationMetadata> future =
          workflowsClient.deleteWorkflowOperationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END workflows_v1beta_generated_workflowsclient_deleteworkflow_lro_async]
