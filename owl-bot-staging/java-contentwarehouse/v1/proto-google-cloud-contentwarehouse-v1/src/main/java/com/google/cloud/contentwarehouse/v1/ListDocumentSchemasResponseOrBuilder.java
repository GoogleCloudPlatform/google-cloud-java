// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/document_schema_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

public interface ListDocumentSchemasResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.DocumentSchema> 
      getDocumentSchemasList();
  /**
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.DocumentSchema getDocumentSchemas(int index);
  /**
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  int getDocumentSchemasCount();
  /**
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder> 
      getDocumentSchemasOrBuilderList();
  /**
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder getDocumentSchemasOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
