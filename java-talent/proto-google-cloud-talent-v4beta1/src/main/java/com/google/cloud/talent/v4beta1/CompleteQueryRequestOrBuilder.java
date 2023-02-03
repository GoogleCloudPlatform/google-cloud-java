/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/talent/v4beta1/completion_service.proto

package com.google.cloud.talent.v4beta1;

public interface CompleteQueryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CompleteQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of tenant the completion is performed within.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar".
   * If tenant id is unspecified, the default tenant is used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Resource name of tenant the completion is performed within.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar".
   * If tenant id is unspecified, the default tenant is used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The query used to generate suggestions.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. The query used to generate suggestions.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   *
   * @return A list containing the languageCodes.
   */
  java.util.List<java.lang.String> getLanguageCodesList();
  /**
   *
   *
   * <pre>
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   *
   * @return The count of languageCodes.
   */
  int getLanguageCodesCount();
  /**
   *
   *
   * <pre>
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The languageCodes at the given index.
   */
  java.lang.String getLanguageCodes(int index);
  /**
   *
   *
   * <pre>
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the languageCodes at the given index.
   */
  com.google.protobuf.ByteString getLanguageCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. Completion result count.
   * The maximum allowed page size is 10.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If provided, restricts completion to specified company.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/foo/tenants/bar/companies/baz".
   * If tenant id is unspecified, the default tenant is used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>string company = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The company.
   */
  java.lang.String getCompany();
  /**
   *
   *
   * <pre>
   * If provided, restricts completion to specified company.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/foo/tenants/bar/companies/baz".
   * If tenant id is unspecified, the default tenant is used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>string company = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for company.
   */
  com.google.protobuf.ByteString getCompanyBytes();

  /**
   *
   *
   * <pre>
   * The scope of the completion. The defaults is
   * [CompletionScope.PUBLIC][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope.PUBLIC].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope scope = 6;</code>
   *
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();
  /**
   *
   *
   * <pre>
   * The scope of the completion. The defaults is
   * [CompletionScope.PUBLIC][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope.PUBLIC].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope scope = 6;</code>
   *
   * @return The scope.
   */
  com.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope getScope();

  /**
   *
   *
   * <pre>
   * The completion topic. The default is
   * [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType type = 7;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The completion topic. The default is
   * [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType type = 7;</code>
   *
   * @return The type.
   */
  com.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType getType();
}
