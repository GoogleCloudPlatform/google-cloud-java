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

package com.google.cloud.tasks.v2beta3.samples;

// [START cloudtasks_v2beta3_generated_cloudtasksclient_gettask_string_sync]
import com.google.cloud.tasks.v2beta3.CloudTasksClient;
import com.google.cloud.tasks.v2beta3.Task;
import com.google.cloud.tasks.v2beta3.TaskName;

public class SyncGetTaskString {

  public static void main(String[] args) throws Exception {
    syncGetTaskString();
  }

  public static void syncGetTaskString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
      String name = TaskName.of("[PROJECT]", "[LOCATION]", "[QUEUE]", "[TASK]").toString();
      Task response = cloudTasksClient.getTask(name);
    }
  }
}
// [END cloudtasks_v2beta3_generated_cloudtasksclient_gettask_string_sync]
