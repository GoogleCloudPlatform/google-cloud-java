// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface GceClusterConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.GceClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The zone where the Compute Engine cluster will be located.
   * On a create request, it is required in the "global" region. If omitted
   * in a non-global Cloud Dataproc region, the service will pick a zone in the
   * corresponding Compute Engine region. On a get request, zone will
   * always be present.
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]`
   * * `projects/[project_id]/zones/[zone]`
   * * `us-central1-f`
   * </pre>
   *
   * <code>string zone_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getZoneUri();
  /**
   *
   *
   * <pre>
   * Optional. The zone where the Compute Engine cluster will be located.
   * On a create request, it is required in the "global" region. If omitted
   * in a non-global Cloud Dataproc region, the service will pick a zone in the
   * corresponding Compute Engine region. On a get request, zone will
   * always be present.
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]`
   * * `projects/[project_id]/zones/[zone]`
   * * `us-central1-f`
   * </pre>
   *
   * <code>string zone_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getZoneUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine network to be used for machine
   * communications. Cannot be specified with subnetwork_uri. If neither
   * `network_uri` nor `subnetwork_uri` is specified, the "default" network of
   * the project is used, if it exists. Cannot be a "Custom Subnet Network" (see
   * [Using Subnetworks](/compute/docs/subnetworks) for more information).
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default`
   * * `projects/[project_id]/regions/global/default`
   * * `default`
   * </pre>
   *
   * <code>string network_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getNetworkUri();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine network to be used for machine
   * communications. Cannot be specified with subnetwork_uri. If neither
   * `network_uri` nor `subnetwork_uri` is specified, the "default" network of
   * the project is used, if it exists. Cannot be a "Custom Subnet Network" (see
   * [Using Subnetworks](/compute/docs/subnetworks) for more information).
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default`
   * * `projects/[project_id]/regions/global/default`
   * * `default`
   * </pre>
   *
   * <code>string network_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getNetworkUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine subnetwork to be used for machine
   * communications. Cannot be specified with network_uri.
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * * `sub0`
   * </pre>
   *
   * <code>string subnetwork_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getSubnetworkUri();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine subnetwork to be used for machine
   * communications. Cannot be specified with network_uri.
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
   * * `sub0`
   * </pre>
   *
   * <code>string subnetwork_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getSubnetworkUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. If true, all instances in the cluster will only have internal IP
   * addresses. By default, clusters are not restricted to internal IP
   * addresses, and will have ephemeral external IP addresses assigned to each
   * instance. This `internal_ip_only` restriction can only be enabled for
   * subnetwork enabled networks, and all off-cluster dependencies must be
   * configured to be accessible without external IP addresses.
   * </pre>
   *
   * <code>bool internal_ip_only = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean getInternalIpOnly();

  /**
   *
   *
   * <pre>
   * Optional. The service account of the instances. Defaults to the default
   * Compute Engine service account. Custom service accounts need
   * permissions equivalent to the following IAM roles:
   * * roles/logging.logWriter
   * * roles/storage.objectAdmin
   * (see
   * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts
   * for more information).
   * Example: `[account_id]&#64;[project_id].iam.gserviceaccount.com`
   * </pre>
   *
   * <code>string service_account = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Optional. The service account of the instances. Defaults to the default
   * Compute Engine service account. Custom service accounts need
   * permissions equivalent to the following IAM roles:
   * * roles/logging.logWriter
   * * roles/storage.objectAdmin
   * (see
   * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts
   * for more information).
   * Example: `[account_id]&#64;[project_id].iam.gserviceaccount.com`
   * </pre>
   *
   * <code>string service_account = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Optional. The URIs of service account scopes to be included in
   * Compute Engine instances. The following base set of scopes is always
   * included:
   * * https://www.googleapis.com/auth/cloud.useraccounts.readonly
   * * https://www.googleapis.com/auth/devstorage.read_write
   * * https://www.googleapis.com/auth/logging.write
   * If no scopes are specified, the following defaults are also provided:
   * * https://www.googleapis.com/auth/bigquery
   * * https://www.googleapis.com/auth/bigtable.admin.table
   * * https://www.googleapis.com/auth/bigtable.data
   * * https://www.googleapis.com/auth/devstorage.full_control
   * </pre>
   *
   * <code>repeated string service_account_scopes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<java.lang.String> getServiceAccountScopesList();
  /**
   *
   *
   * <pre>
   * Optional. The URIs of service account scopes to be included in
   * Compute Engine instances. The following base set of scopes is always
   * included:
   * * https://www.googleapis.com/auth/cloud.useraccounts.readonly
   * * https://www.googleapis.com/auth/devstorage.read_write
   * * https://www.googleapis.com/auth/logging.write
   * If no scopes are specified, the following defaults are also provided:
   * * https://www.googleapis.com/auth/bigquery
   * * https://www.googleapis.com/auth/bigtable.admin.table
   * * https://www.googleapis.com/auth/bigtable.data
   * * https://www.googleapis.com/auth/devstorage.full_control
   * </pre>
   *
   * <code>repeated string service_account_scopes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getServiceAccountScopesCount();
  /**
   *
   *
   * <pre>
   * Optional. The URIs of service account scopes to be included in
   * Compute Engine instances. The following base set of scopes is always
   * included:
   * * https://www.googleapis.com/auth/cloud.useraccounts.readonly
   * * https://www.googleapis.com/auth/devstorage.read_write
   * * https://www.googleapis.com/auth/logging.write
   * If no scopes are specified, the following defaults are also provided:
   * * https://www.googleapis.com/auth/bigquery
   * * https://www.googleapis.com/auth/bigtable.admin.table
   * * https://www.googleapis.com/auth/bigtable.data
   * * https://www.googleapis.com/auth/devstorage.full_control
   * </pre>
   *
   * <code>repeated string service_account_scopes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getServiceAccountScopes(int index);
  /**
   *
   *
   * <pre>
   * Optional. The URIs of service account scopes to be included in
   * Compute Engine instances. The following base set of scopes is always
   * included:
   * * https://www.googleapis.com/auth/cloud.useraccounts.readonly
   * * https://www.googleapis.com/auth/devstorage.read_write
   * * https://www.googleapis.com/auth/logging.write
   * If no scopes are specified, the following defaults are also provided:
   * * https://www.googleapis.com/auth/bigquery
   * * https://www.googleapis.com/auth/bigtable.admin.table
   * * https://www.googleapis.com/auth/bigtable.data
   * * https://www.googleapis.com/auth/devstorage.full_control
   * </pre>
   *
   * <code>repeated string service_account_scopes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.ByteString getServiceAccountScopesBytes(int index);

  /**
   *
   *
   * <pre>
   * The Compute Engine tags to add to all instances (see
   * [Tagging instances](/compute/docs/label-or-tag-resources#tags)).
   * </pre>
   *
   * <code>repeated string tags = 4;</code>
   */
  java.util.List<java.lang.String> getTagsList();
  /**
   *
   *
   * <pre>
   * The Compute Engine tags to add to all instances (see
   * [Tagging instances](/compute/docs/label-or-tag-resources#tags)).
   * </pre>
   *
   * <code>repeated string tags = 4;</code>
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * The Compute Engine tags to add to all instances (see
   * [Tagging instances](/compute/docs/label-or-tag-resources#tags)).
   * </pre>
   *
   * <code>repeated string tags = 4;</code>
   */
  java.lang.String getTags(int index);
  /**
   *
   *
   * <pre>
   * The Compute Engine tags to add to all instances (see
   * [Tagging instances](/compute/docs/label-or-tag-resources#tags)).
   * </pre>
   *
   * <code>repeated string tags = 4;</code>
   */
  com.google.protobuf.ByteString getTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * The Compute Engine metadata entries to add to all instances (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * The Compute Engine metadata entries to add to all instances (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * The Compute Engine metadata entries to add to all instances (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * The Compute Engine metadata entries to add to all instances (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  java.lang.String getMetadataOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The Compute Engine metadata entries to add to all instances (see
   * [Project and instance
   * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);
}
