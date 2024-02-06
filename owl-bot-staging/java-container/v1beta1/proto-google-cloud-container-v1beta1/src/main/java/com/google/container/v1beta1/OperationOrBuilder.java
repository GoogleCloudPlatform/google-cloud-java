// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface OperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.Operation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The server-assigned ID for the operation.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The server-assigned ID for the operation.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * operation is taking place. This field is deprecated, use location instead.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   * @deprecated google.container.v1beta1.Operation.zone is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=2840
   * @return The zone.
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * operation is taking place. This field is deprecated, use location instead.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   * @deprecated google.container.v1beta1.Operation.zone is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=2840
   * @return The bytes for zone.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.google.container.v1beta1.Operation.Type operation_type = 3;</code>
   * @return The enum numeric value on the wire for operationType.
   */
  int getOperationTypeValue();
  /**
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.google.container.v1beta1.Operation.Type operation_type = 3;</code>
   * @return The operationType.
   */
  com.google.container.v1beta1.Operation.Type getOperationType();

  /**
   * <pre>
   * The current status of the operation.
   * </pre>
   *
   * <code>.google.container.v1beta1.Operation.Status status = 4;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The current status of the operation.
   * </pre>
   *
   * <code>.google.container.v1beta1.Operation.Status status = 4;</code>
   * @return The status.
   */
  com.google.container.v1beta1.Operation.Status getStatus();

  /**
   * <pre>
   * Detailed operation progress, if available.
   * </pre>
   *
   * <code>string detail = 8;</code>
   * @return The detail.
   */
  java.lang.String getDetail();
  /**
   * <pre>
   * Detailed operation progress, if available.
   * </pre>
   *
   * <code>string detail = 8;</code>
   * @return The bytes for detail.
   */
  com.google.protobuf.ByteString
      getDetailBytes();

  /**
   * <pre>
   * Output only. If an error has occurred, a textual description of the error.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>string status_message = 5 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @deprecated google.container.v1beta1.Operation.status_message is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=2853
   * @return The statusMessage.
   */
  @java.lang.Deprecated java.lang.String getStatusMessage();
  /**
   * <pre>
   * Output only. If an error has occurred, a textual description of the error.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>string status_message = 5 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @deprecated google.container.v1beta1.Operation.status_message is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=2853
   * @return The bytes for statusMessage.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getStatusMessageBytes();

  /**
   * <pre>
   * Server-defined URI for the operation. Example:
   * `https://container.googleapis.com/v1alpha1/projects/123/locations/us-central1/operations/operation-123`.
   * </pre>
   *
   * <code>string self_link = 6;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * Server-defined URI for the operation. Example:
   * `https://container.googleapis.com/v1alpha1/projects/123/locations/us-central1/operations/operation-123`.
   * </pre>
   *
   * <code>string self_link = 6;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();

  /**
   * <pre>
   * Server-defined URI for the target of the operation. The format of this is a
   * URI to the resource being modified (such as a cluster, node pool, or node).
   * For node pool repairs, there may be multiple nodes being repaired, but only
   * one will be the target.
   *
   * Examples:
   *
   * -
   * ##
   * `https://container.googleapis.com/v1/projects/123/locations/us-central1/clusters/my-cluster`
   *
   * ##
   * `https://container.googleapis.com/v1/projects/123/zones/us-central1-c/clusters/my-cluster/nodePools/my-np`
   *
   * `https://container.googleapis.com/v1/projects/123/zones/us-central1-c/clusters/my-cluster/nodePools/my-np/node/my-node`
   * </pre>
   *
   * <code>string target_link = 7;</code>
   * @return The targetLink.
   */
  java.lang.String getTargetLink();
  /**
   * <pre>
   * Server-defined URI for the target of the operation. The format of this is a
   * URI to the resource being modified (such as a cluster, node pool, or node).
   * For node pool repairs, there may be multiple nodes being repaired, but only
   * one will be the target.
   *
   * Examples:
   *
   * -
   * ##
   * `https://container.googleapis.com/v1/projects/123/locations/us-central1/clusters/my-cluster`
   *
   * ##
   * `https://container.googleapis.com/v1/projects/123/zones/us-central1-c/clusters/my-cluster/nodePools/my-np`
   *
   * `https://container.googleapis.com/v1/projects/123/zones/us-central1-c/clusters/my-cluster/nodePools/my-np/node/my-node`
   * </pre>
   *
   * <code>string target_link = 7;</code>
   * @return The bytes for targetLink.
   */
  com.google.protobuf.ByteString
      getTargetLinkBytes();

  /**
   * <pre>
   * [Output only] The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available)
   * or
   * [region](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available)
   * in which the cluster resides.
   * </pre>
   *
   * <code>string location = 9;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * [Output only] The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available)
   * or
   * [region](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available)
   * in which the cluster resides.
   * </pre>
   *
   * <code>string location = 9;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * [Output only] The time the operation started, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string start_time = 10;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * [Output only] The time the operation started, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string start_time = 10;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * [Output only] The time the operation completed, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string end_time = 11;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * [Output only] The time the operation completed, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string end_time = 11;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   * Output only. [Output only] Progress information for an operation.
   * </pre>
   *
   * <code>.google.container.v1beta1.OperationProgress progress = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the progress field is set.
   */
  boolean hasProgress();
  /**
   * <pre>
   * Output only. [Output only] Progress information for an operation.
   * </pre>
   *
   * <code>.google.container.v1beta1.OperationProgress progress = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The progress.
   */
  com.google.container.v1beta1.OperationProgress getProgress();
  /**
   * <pre>
   * Output only. [Output only] Progress information for an operation.
   * </pre>
   *
   * <code>.google.container.v1beta1.OperationProgress progress = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.container.v1beta1.OperationProgressOrBuilder getProgressOrBuilder();

  /**
   * <pre>
   * Which conditions caused the current cluster state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition cluster_conditions = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.google.container.v1beta1.StatusCondition> 
      getClusterConditionsList();
  /**
   * <pre>
   * Which conditions caused the current cluster state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition cluster_conditions = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.container.v1beta1.StatusCondition getClusterConditions(int index);
  /**
   * <pre>
   * Which conditions caused the current cluster state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition cluster_conditions = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getClusterConditionsCount();
  /**
   * <pre>
   * Which conditions caused the current cluster state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition cluster_conditions = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.google.container.v1beta1.StatusConditionOrBuilder> 
      getClusterConditionsOrBuilderList();
  /**
   * <pre>
   * Which conditions caused the current cluster state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition cluster_conditions = 13 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.container.v1beta1.StatusConditionOrBuilder getClusterConditionsOrBuilder(
      int index);

  /**
   * <pre>
   * Which conditions caused the current node pool state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition nodepool_conditions = 14 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.google.container.v1beta1.StatusCondition> 
      getNodepoolConditionsList();
  /**
   * <pre>
   * Which conditions caused the current node pool state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition nodepool_conditions = 14 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.container.v1beta1.StatusCondition getNodepoolConditions(int index);
  /**
   * <pre>
   * Which conditions caused the current node pool state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition nodepool_conditions = 14 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getNodepoolConditionsCount();
  /**
   * <pre>
   * Which conditions caused the current node pool state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition nodepool_conditions = 14 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.google.container.v1beta1.StatusConditionOrBuilder> 
      getNodepoolConditionsOrBuilderList();
  /**
   * <pre>
   * Which conditions caused the current node pool state.
   * Deprecated. Use field error instead.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.StatusCondition nodepool_conditions = 14 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.container.v1beta1.StatusConditionOrBuilder getNodepoolConditionsOrBuilder(
      int index);

  /**
   * <pre>
   * The error result of the operation in case of failure.
   * </pre>
   *
   * <code>.google.rpc.Status error = 15;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * The error result of the operation in case of failure.
   * </pre>
   *
   * <code>.google.rpc.Status error = 15;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * The error result of the operation in case of failure.
   * </pre>
   *
   * <code>.google.rpc.Status error = 15;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}
