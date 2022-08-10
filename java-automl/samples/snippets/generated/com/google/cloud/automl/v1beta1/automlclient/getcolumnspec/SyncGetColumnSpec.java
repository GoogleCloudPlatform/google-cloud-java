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

package com.google.cloud.automl.v1beta1.samples;

// [START automl_v1beta1_generated_automlclient_getcolumnspec_sync]
import com.google.cloud.automl.v1beta1.AutoMlClient;
import com.google.cloud.automl.v1beta1.ColumnSpec;
import com.google.cloud.automl.v1beta1.ColumnSpecName;
import com.google.cloud.automl.v1beta1.GetColumnSpecRequest;
import com.google.protobuf.FieldMask;

public class SyncGetColumnSpec {

  public static void main(String[] args) throws Exception {
    syncGetColumnSpec();
  }

  public static void syncGetColumnSpec() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AutoMlClient autoMlClient = AutoMlClient.create()) {
      GetColumnSpecRequest request =
          GetColumnSpecRequest.newBuilder()
              .setName(
                  ColumnSpecName.of(
                          "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                      .toString())
              .setFieldMask(FieldMask.newBuilder().build())
              .build();
      ColumnSpec response = autoMlClient.getColumnSpec(request);
    }
  }
}
// [END automl_v1beta1_generated_automlclient_getcolumnspec_sync]
