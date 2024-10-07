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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface UrlMapsValidateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UrlMapsValidateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the load balancer type(s) this validation request is for. Use EXTERNAL_MANAGED for global external Application Load Balancers and regional external Application Load Balancers. Use EXTERNAL for classic Application Load Balancers. Use INTERNAL_MANAGED for internal Application Load Balancers. For more information, refer to Choosing a load balancer. If unspecified, the load balancing scheme will be inferred from the backend service resources this URL map references. If that can not be inferred (for example, this URL map only references backend buckets, or this Url map is for rewrites and redirects only and doesn't reference any backends), EXTERNAL will be used as the default type. If specified, the scheme(s) must not conflict with the load balancing scheme of the backend service resources this Url map references.
   * Check the LoadBalancingSchemes enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string load_balancing_schemes = 6308527;</code>
   *
   * @return A list containing the loadBalancingSchemes.
   */
  java.util.List<java.lang.String> getLoadBalancingSchemesList();
  /**
   *
   *
   * <pre>
   * Specifies the load balancer type(s) this validation request is for. Use EXTERNAL_MANAGED for global external Application Load Balancers and regional external Application Load Balancers. Use EXTERNAL for classic Application Load Balancers. Use INTERNAL_MANAGED for internal Application Load Balancers. For more information, refer to Choosing a load balancer. If unspecified, the load balancing scheme will be inferred from the backend service resources this URL map references. If that can not be inferred (for example, this URL map only references backend buckets, or this Url map is for rewrites and redirects only and doesn't reference any backends), EXTERNAL will be used as the default type. If specified, the scheme(s) must not conflict with the load balancing scheme of the backend service resources this Url map references.
   * Check the LoadBalancingSchemes enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string load_balancing_schemes = 6308527;</code>
   *
   * @return The count of loadBalancingSchemes.
   */
  int getLoadBalancingSchemesCount();
  /**
   *
   *
   * <pre>
   * Specifies the load balancer type(s) this validation request is for. Use EXTERNAL_MANAGED for global external Application Load Balancers and regional external Application Load Balancers. Use EXTERNAL for classic Application Load Balancers. Use INTERNAL_MANAGED for internal Application Load Balancers. For more information, refer to Choosing a load balancer. If unspecified, the load balancing scheme will be inferred from the backend service resources this URL map references. If that can not be inferred (for example, this URL map only references backend buckets, or this Url map is for rewrites and redirects only and doesn't reference any backends), EXTERNAL will be used as the default type. If specified, the scheme(s) must not conflict with the load balancing scheme of the backend service resources this Url map references.
   * Check the LoadBalancingSchemes enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string load_balancing_schemes = 6308527;</code>
   *
   * @param index The index of the element to return.
   * @return The loadBalancingSchemes at the given index.
   */
  java.lang.String getLoadBalancingSchemes(int index);
  /**
   *
   *
   * <pre>
   * Specifies the load balancer type(s) this validation request is for. Use EXTERNAL_MANAGED for global external Application Load Balancers and regional external Application Load Balancers. Use EXTERNAL for classic Application Load Balancers. Use INTERNAL_MANAGED for internal Application Load Balancers. For more information, refer to Choosing a load balancer. If unspecified, the load balancing scheme will be inferred from the backend service resources this URL map references. If that can not be inferred (for example, this URL map only references backend buckets, or this Url map is for rewrites and redirects only and doesn't reference any backends), EXTERNAL will be used as the default type. If specified, the scheme(s) must not conflict with the load balancing scheme of the backend service resources this Url map references.
   * Check the LoadBalancingSchemes enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string load_balancing_schemes = 6308527;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the loadBalancingSchemes at the given index.
   */
  com.google.protobuf.ByteString getLoadBalancingSchemesBytes(int index);

  /**
   *
   *
   * <pre>
   * Content of the UrlMap to be validated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UrlMap resource = 195806222;</code>
   *
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   *
   *
   * <pre>
   * Content of the UrlMap to be validated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UrlMap resource = 195806222;</code>
   *
   * @return The resource.
   */
  com.google.cloud.compute.v1.UrlMap getResource();
  /**
   *
   *
   * <pre>
   * Content of the UrlMap to be validated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UrlMap resource = 195806222;</code>
   */
  com.google.cloud.compute.v1.UrlMapOrBuilder getResourceOrBuilder();
}
