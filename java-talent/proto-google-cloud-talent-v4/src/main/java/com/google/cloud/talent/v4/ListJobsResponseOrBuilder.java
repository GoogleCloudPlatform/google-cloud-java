/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/talent/v4/job_service.proto

package com.google.cloud.talent.v4;

public interface ListJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.ListJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   *
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Job jobs = 1;</code>
   */
  java.util.List<com.google.cloud.talent.v4.Job> getJobsList();
  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   *
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Job jobs = 1;</code>
   */
  com.google.cloud.talent.v4.Job getJobs(int index);
  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   *
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Job jobs = 1;</code>
   */
  int getJobsCount();
  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   *
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Job jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4.JobOrBuilder> getJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   *
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.Job jobs = 1;</code>
   */
  com.google.cloud.talent.v4.JobOrBuilder getJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.ResponseMetadata metadata = 3;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.ResponseMetadata metadata = 3;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.talent.v4.ResponseMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.ResponseMetadata metadata = 3;</code>
   */
  com.google.cloud.talent.v4.ResponseMetadataOrBuilder getMetadataOrBuilder();
}
