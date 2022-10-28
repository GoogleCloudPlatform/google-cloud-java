// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

package com.google.cloud.privatecatalog.v1beta1;

public interface SearchProductsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.privatecatalog.v1beta1.SearchProductsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the resource context. See [SearchCatalogsRequest.resource][google.cloud.privatecatalog.v1beta1.SearchCatalogsRequest.resource]
   * for details.
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   * <pre>
   * Required. The name of the resource context. See [SearchCatalogsRequest.resource][google.cloud.privatecatalog.v1beta1.SearchCatalogsRequest.resource]
   * for details.
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString
      getResourceBytes();

  /**
   * <pre>
   * The query to filter the products.
   * The supported queries are:
   * * List products of all catalogs: empty
   * * List products under a catalog: `parent=catalogs/{catalog}`
   * * Get a product by name:
   * `name=catalogs/{catalog}/products/{product}`
   * </pre>
   *
   * <code>string query = 2;</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * The query to filter the products.
   * The supported queries are:
   * * List products of all catalogs: empty
   * * List products under a catalog: `parent=catalogs/{catalog}`
   * * Get a product by name:
   * `name=catalogs/{catalog}/products/{product}`
   * </pre>
   *
   * <code>string query = 2;</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * The maximum number of entries that are requested.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A pagination token returned from a previous call to SearchProducts that
   * indicates where this listing should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A pagination token returned from a previous call to SearchProducts that
   * indicates where this listing should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
