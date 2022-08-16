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

/**
 * A client to Cloud Functions API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= FunctionServiceClient =======================
 *
 * <p>Service Description: Google Cloud Functions is used to deploy functions that are executed by
 * Google in response to various events. Data connected with that event is passed to a function as
 * the input data.
 *
 * <p>A &#42;&#42;function&#42;&#42; is a resource which describes a function that should be
 * executed and how it is triggered.
 *
 * <p>Sample for FunctionServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (FunctionServiceClient functionServiceClient = FunctionServiceClient.create()) {
 *   FunctionName name = FunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]");
 *   Function response = functionServiceClient.getFunction(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.functions.v2beta;

import javax.annotation.Generated;
