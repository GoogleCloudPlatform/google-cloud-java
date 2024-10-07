/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicehealth/v1/event_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.servicehealth.v1;

public interface EventImpactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicehealth.v1.EventImpact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud product impacted by the event.
   * </pre>
   *
   * <code>.google.cloud.servicehealth.v1.Product product = 1;</code>
   *
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   *
   *
   * <pre>
   * Google Cloud product impacted by the event.
   * </pre>
   *
   * <code>.google.cloud.servicehealth.v1.Product product = 1;</code>
   *
   * @return The product.
   */
  com.google.cloud.servicehealth.v1.Product getProduct();
  /**
   *
   *
   * <pre>
   * Google Cloud product impacted by the event.
   * </pre>
   *
   * <code>.google.cloud.servicehealth.v1.Product product = 1;</code>
   */
  com.google.cloud.servicehealth.v1.ProductOrBuilder getProductOrBuilder();

  /**
   *
   *
   * <pre>
   * Location impacted by the event.
   * </pre>
   *
   * <code>.google.cloud.servicehealth.v1.Location location = 2;</code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * Location impacted by the event.
   * </pre>
   *
   * <code>.google.cloud.servicehealth.v1.Location location = 2;</code>
   *
   * @return The location.
   */
  com.google.cloud.servicehealth.v1.Location getLocation();
  /**
   *
   *
   * <pre>
   * Location impacted by the event.
   * </pre>
   *
   * <code>.google.cloud.servicehealth.v1.Location location = 2;</code>
   */
  com.google.cloud.servicehealth.v1.LocationOrBuilder getLocationOrBuilder();
}
