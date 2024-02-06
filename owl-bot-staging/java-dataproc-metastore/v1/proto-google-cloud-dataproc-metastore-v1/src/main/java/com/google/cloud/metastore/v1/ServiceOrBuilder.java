// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1;

public interface ServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configuration information specific to running Hive metastore
   * software as the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.HiveMetastoreConfig hive_metastore_config = 5;</code>
   * @return Whether the hiveMetastoreConfig field is set.
   */
  boolean hasHiveMetastoreConfig();
  /**
   * <pre>
   * Configuration information specific to running Hive metastore
   * software as the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.HiveMetastoreConfig hive_metastore_config = 5;</code>
   * @return The hiveMetastoreConfig.
   */
  com.google.cloud.metastore.v1.HiveMetastoreConfig getHiveMetastoreConfig();
  /**
   * <pre>
   * Configuration information specific to running Hive metastore
   * software as the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.HiveMetastoreConfig hive_metastore_config = 5;</code>
   */
  com.google.cloud.metastore.v1.HiveMetastoreConfigOrBuilder getHiveMetastoreConfigOrBuilder();

  /**
   * <pre>
   * Immutable. The relative resource name of the metastore service, in the
   * following format:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The relative resource name of the metastore service, in the
   * following format:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The time when the metastore service was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time when the metastore service was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time when the metastore service was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time when the metastore service was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time when the metastore service was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time when the metastore service was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * User-defined labels for the metastore service.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * User-defined labels for the metastore service.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * User-defined labels for the metastore service.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * User-defined labels for the metastore service.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * User-defined labels for the metastore service.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Immutable. The relative resource name of the VPC network on which the
   * instance can be accessed. It is specified in the following form:
   *
   * `projects/{project_number}/global/networks/{network_id}`.
   * </pre>
   *
   * <code>string network = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * Immutable. The relative resource name of the VPC network on which the
   * instance can be accessed. It is specified in the following form:
   *
   * `projects/{project_number}/global/networks/{network_id}`.
   * </pre>
   *
   * <code>string network = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * Output only. The URI of the endpoint used to access the metastore service.
   * </pre>
   *
   * <code>string endpoint_uri = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endpointUri.
   */
  java.lang.String getEndpointUri();
  /**
   * <pre>
   * Output only. The URI of the endpoint used to access the metastore service.
   * </pre>
   *
   * <code>string endpoint_uri = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for endpointUri.
   */
  com.google.protobuf.ByteString
      getEndpointUriBytes();

  /**
   * <pre>
   * The TCP port at which the metastore service is reached. Default: 9083.
   * </pre>
   *
   * <code>int32 port = 9;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <pre>
   * Output only. The current state of the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current state of the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.metastore.v1.Service.State getState();

  /**
   * <pre>
   * Output only. Additional information about the current state of the
   * metastore service, if available.
   * </pre>
   *
   * <code>string state_message = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();
  /**
   * <pre>
   * Output only. Additional information about the current state of the
   * metastore service, if available.
   * </pre>
   *
   * <code>string state_message = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString
      getStateMessageBytes();

  /**
   * <pre>
   * Output only. A Cloud Storage URI (starting with `gs://`) that specifies
   * where artifacts related to the metastore service are stored.
   * </pre>
   *
   * <code>string artifact_gcs_uri = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The artifactGcsUri.
   */
  java.lang.String getArtifactGcsUri();
  /**
   * <pre>
   * Output only. A Cloud Storage URI (starting with `gs://`) that specifies
   * where artifacts related to the metastore service are stored.
   * </pre>
   *
   * <code>string artifact_gcs_uri = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for artifactGcsUri.
   */
  com.google.protobuf.ByteString
      getArtifactGcsUriBytes();

  /**
   * <pre>
   * The tier of the service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service.Tier tier = 13;</code>
   * @return The enum numeric value on the wire for tier.
   */
  int getTierValue();
  /**
   * <pre>
   * The tier of the service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service.Tier tier = 13;</code>
   * @return The tier.
   */
  com.google.cloud.metastore.v1.Service.Tier getTier();

  /**
   * <pre>
   * The one hour maintenance window of the metastore service. This specifies
   * when the service can be restarted for maintenance purposes in UTC time.
   * Maintenance window is not needed for services with the SPANNER
   * database type.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.MaintenanceWindow maintenance_window = 15;</code>
   * @return Whether the maintenanceWindow field is set.
   */
  boolean hasMaintenanceWindow();
  /**
   * <pre>
   * The one hour maintenance window of the metastore service. This specifies
   * when the service can be restarted for maintenance purposes in UTC time.
   * Maintenance window is not needed for services with the SPANNER
   * database type.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.MaintenanceWindow maintenance_window = 15;</code>
   * @return The maintenanceWindow.
   */
  com.google.cloud.metastore.v1.MaintenanceWindow getMaintenanceWindow();
  /**
   * <pre>
   * The one hour maintenance window of the metastore service. This specifies
   * when the service can be restarted for maintenance purposes in UTC time.
   * Maintenance window is not needed for services with the SPANNER
   * database type.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.MaintenanceWindow maintenance_window = 15;</code>
   */
  com.google.cloud.metastore.v1.MaintenanceWindowOrBuilder getMaintenanceWindowOrBuilder();

  /**
   * <pre>
   * Output only. The globally unique resource identifier of the metastore
   * service.
   * </pre>
   *
   * <code>string uid = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Output only. The globally unique resource identifier of the metastore
   * service.
   * </pre>
   *
   * <code>string uid = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <pre>
   * Output only. The metadata management activities of the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.MetadataManagementActivity metadata_management_activity = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the metadataManagementActivity field is set.
   */
  boolean hasMetadataManagementActivity();
  /**
   * <pre>
   * Output only. The metadata management activities of the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.MetadataManagementActivity metadata_management_activity = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The metadataManagementActivity.
   */
  com.google.cloud.metastore.v1.MetadataManagementActivity getMetadataManagementActivity();
  /**
   * <pre>
   * Output only. The metadata management activities of the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.MetadataManagementActivity metadata_management_activity = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.metastore.v1.MetadataManagementActivityOrBuilder getMetadataManagementActivityOrBuilder();

  /**
   * <pre>
   * Immutable. The release channel of the service.
   * If unspecified, defaults to `STABLE`.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service.ReleaseChannel release_channel = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for releaseChannel.
   */
  int getReleaseChannelValue();
  /**
   * <pre>
   * Immutable. The release channel of the service.
   * If unspecified, defaults to `STABLE`.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service.ReleaseChannel release_channel = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The releaseChannel.
   */
  com.google.cloud.metastore.v1.Service.ReleaseChannel getReleaseChannel();

  /**
   * <pre>
   * Immutable. Information used to configure the Dataproc Metastore service to
   * encrypt customer data at rest. Cannot be updated.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.EncryptionConfig encryption_config = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();
  /**
   * <pre>
   * Immutable. Information used to configure the Dataproc Metastore service to
   * encrypt customer data at rest. Cannot be updated.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.EncryptionConfig encryption_config = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The encryptionConfig.
   */
  com.google.cloud.metastore.v1.EncryptionConfig getEncryptionConfig();
  /**
   * <pre>
   * Immutable. Information used to configure the Dataproc Metastore service to
   * encrypt customer data at rest. Cannot be updated.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.EncryptionConfig encryption_config = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.metastore.v1.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();

  /**
   * <pre>
   * The configuration specifying the network settings for the
   * Dataproc Metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.NetworkConfig network_config = 21;</code>
   * @return Whether the networkConfig field is set.
   */
  boolean hasNetworkConfig();
  /**
   * <pre>
   * The configuration specifying the network settings for the
   * Dataproc Metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.NetworkConfig network_config = 21;</code>
   * @return The networkConfig.
   */
  com.google.cloud.metastore.v1.NetworkConfig getNetworkConfig();
  /**
   * <pre>
   * The configuration specifying the network settings for the
   * Dataproc Metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.NetworkConfig network_config = 21;</code>
   */
  com.google.cloud.metastore.v1.NetworkConfigOrBuilder getNetworkConfigOrBuilder();

  /**
   * <pre>
   * Immutable. The database type that the Metastore service stores its data.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service.DatabaseType database_type = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for databaseType.
   */
  int getDatabaseTypeValue();
  /**
   * <pre>
   * Immutable. The database type that the Metastore service stores its data.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service.DatabaseType database_type = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The databaseType.
   */
  com.google.cloud.metastore.v1.Service.DatabaseType getDatabaseType();

  /**
   * <pre>
   * The configuration specifying telemetry settings for the Dataproc Metastore
   * service. If unspecified defaults to `JSON`.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.TelemetryConfig telemetry_config = 23;</code>
   * @return Whether the telemetryConfig field is set.
   */
  boolean hasTelemetryConfig();
  /**
   * <pre>
   * The configuration specifying telemetry settings for the Dataproc Metastore
   * service. If unspecified defaults to `JSON`.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.TelemetryConfig telemetry_config = 23;</code>
   * @return The telemetryConfig.
   */
  com.google.cloud.metastore.v1.TelemetryConfig getTelemetryConfig();
  /**
   * <pre>
   * The configuration specifying telemetry settings for the Dataproc Metastore
   * service. If unspecified defaults to `JSON`.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.TelemetryConfig telemetry_config = 23;</code>
   */
  com.google.cloud.metastore.v1.TelemetryConfigOrBuilder getTelemetryConfigOrBuilder();

  /**
   * <pre>
   * Scaling configuration of the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.ScalingConfig scaling_config = 24;</code>
   * @return Whether the scalingConfig field is set.
   */
  boolean hasScalingConfig();
  /**
   * <pre>
   * Scaling configuration of the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.ScalingConfig scaling_config = 24;</code>
   * @return The scalingConfig.
   */
  com.google.cloud.metastore.v1.ScalingConfig getScalingConfig();
  /**
   * <pre>
   * Scaling configuration of the metastore service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.ScalingConfig scaling_config = 24;</code>
   */
  com.google.cloud.metastore.v1.ScalingConfigOrBuilder getScalingConfigOrBuilder();

  com.google.cloud.metastore.v1.Service.MetastoreConfigCase getMetastoreConfigCase();
}
