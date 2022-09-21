// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

public interface InstantiateInlineWorkflowTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.InstantiateInlineWorkflowTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the region or location, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.workflowTemplates,instantiateinline`, the resource
   *   name of the region has the following format:
   *   `projects/{project_id}/regions/{region}`
   * * For `projects.locations.workflowTemplates.instantiateinline`, the
   *   resource name of the location has the following format:
   *   `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the region or location, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.workflowTemplates,instantiateinline`, the resource
   *   name of the region has the following format:
   *   `projects/{project_id}/regions/{region}`
   * * For `projects.locations.workflowTemplates.instantiateinline`, the
   *   resource name of the location has the following format:
   *   `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The workflow template to instantiate.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the template field is set.
   */
  boolean hasTemplate();
  /**
   * <pre>
   * Required. The workflow template to instantiate.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The template.
   */
  com.google.cloud.dataproc.v1.WorkflowTemplate getTemplate();
  /**
   * <pre>
   * Required. The workflow template to instantiate.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder getTemplateOrBuilder();

  /**
   * <pre>
   * Optional. A tag that prevents multiple concurrent workflow
   * instances with the same tag from running. This mitigates risk of
   * concurrent instances started due to retries.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The tag must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A tag that prevents multiple concurrent workflow
   * instances with the same tag from running. This mitigates risk of
   * concurrent instances started due to retries.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The tag must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
