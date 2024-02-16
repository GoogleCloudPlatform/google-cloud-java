/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.alloydb.v1.stub;

import static com.google.cloud.alloydb.v1.AlloyDBAdminClient.ListBackupsPagedResponse;
import static com.google.cloud.alloydb.v1.AlloyDBAdminClient.ListClustersPagedResponse;
import static com.google.cloud.alloydb.v1.AlloyDBAdminClient.ListInstancesPagedResponse;
import static com.google.cloud.alloydb.v1.AlloyDBAdminClient.ListLocationsPagedResponse;
import static com.google.cloud.alloydb.v1.AlloyDBAdminClient.ListSupportedDatabaseFlagsPagedResponse;
import static com.google.cloud.alloydb.v1.AlloyDBAdminClient.ListUsersPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.alloydb.v1.Backup;
import com.google.cloud.alloydb.v1.BatchCreateInstancesRequest;
import com.google.cloud.alloydb.v1.BatchCreateInstancesResponse;
import com.google.cloud.alloydb.v1.Cluster;
import com.google.cloud.alloydb.v1.ConnectionInfo;
import com.google.cloud.alloydb.v1.CreateBackupRequest;
import com.google.cloud.alloydb.v1.CreateClusterRequest;
import com.google.cloud.alloydb.v1.CreateInstanceRequest;
import com.google.cloud.alloydb.v1.CreateSecondaryClusterRequest;
import com.google.cloud.alloydb.v1.CreateSecondaryInstanceRequest;
import com.google.cloud.alloydb.v1.CreateUserRequest;
import com.google.cloud.alloydb.v1.DeleteBackupRequest;
import com.google.cloud.alloydb.v1.DeleteClusterRequest;
import com.google.cloud.alloydb.v1.DeleteInstanceRequest;
import com.google.cloud.alloydb.v1.DeleteUserRequest;
import com.google.cloud.alloydb.v1.FailoverInstanceRequest;
import com.google.cloud.alloydb.v1.GenerateClientCertificateRequest;
import com.google.cloud.alloydb.v1.GenerateClientCertificateResponse;
import com.google.cloud.alloydb.v1.GetBackupRequest;
import com.google.cloud.alloydb.v1.GetClusterRequest;
import com.google.cloud.alloydb.v1.GetConnectionInfoRequest;
import com.google.cloud.alloydb.v1.GetInstanceRequest;
import com.google.cloud.alloydb.v1.GetUserRequest;
import com.google.cloud.alloydb.v1.InjectFaultRequest;
import com.google.cloud.alloydb.v1.Instance;
import com.google.cloud.alloydb.v1.ListBackupsRequest;
import com.google.cloud.alloydb.v1.ListBackupsResponse;
import com.google.cloud.alloydb.v1.ListClustersRequest;
import com.google.cloud.alloydb.v1.ListClustersResponse;
import com.google.cloud.alloydb.v1.ListInstancesRequest;
import com.google.cloud.alloydb.v1.ListInstancesResponse;
import com.google.cloud.alloydb.v1.ListSupportedDatabaseFlagsRequest;
import com.google.cloud.alloydb.v1.ListSupportedDatabaseFlagsResponse;
import com.google.cloud.alloydb.v1.ListUsersRequest;
import com.google.cloud.alloydb.v1.ListUsersResponse;
import com.google.cloud.alloydb.v1.OperationMetadata;
import com.google.cloud.alloydb.v1.PromoteClusterRequest;
import com.google.cloud.alloydb.v1.RestartInstanceRequest;
import com.google.cloud.alloydb.v1.RestoreClusterRequest;
import com.google.cloud.alloydb.v1.UpdateBackupRequest;
import com.google.cloud.alloydb.v1.UpdateClusterRequest;
import com.google.cloud.alloydb.v1.UpdateInstanceRequest;
import com.google.cloud.alloydb.v1.UpdateUserRequest;
import com.google.cloud.alloydb.v1.User;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the AlloyDBAdmin service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class AlloyDBAdminStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<ListClustersRequest, ListClustersPagedResponse> listClustersPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listClustersPagedCallable()");
  }

  public UnaryCallable<ListClustersRequest, ListClustersResponse> listClustersCallable() {
    throw new UnsupportedOperationException("Not implemented: listClustersCallable()");
  }

  public UnaryCallable<GetClusterRequest, Cluster> getClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: getClusterCallable()");
  }

  public OperationCallable<CreateClusterRequest, Cluster, OperationMetadata>
      createClusterOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createClusterOperationCallable()");
  }

  public UnaryCallable<CreateClusterRequest, Operation> createClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: createClusterCallable()");
  }

  public OperationCallable<UpdateClusterRequest, Cluster, OperationMetadata>
      updateClusterOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateClusterOperationCallable()");
  }

  public UnaryCallable<UpdateClusterRequest, Operation> updateClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: updateClusterCallable()");
  }

  public OperationCallable<DeleteClusterRequest, Empty, OperationMetadata>
      deleteClusterOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteClusterOperationCallable()");
  }

  public UnaryCallable<DeleteClusterRequest, Operation> deleteClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteClusterCallable()");
  }

  public OperationCallable<PromoteClusterRequest, Cluster, OperationMetadata>
      promoteClusterOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: promoteClusterOperationCallable()");
  }

  public UnaryCallable<PromoteClusterRequest, Operation> promoteClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: promoteClusterCallable()");
  }

  public OperationCallable<RestoreClusterRequest, Cluster, OperationMetadata>
      restoreClusterOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreClusterOperationCallable()");
  }

  public UnaryCallable<RestoreClusterRequest, Operation> restoreClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreClusterCallable()");
  }

  public OperationCallable<CreateSecondaryClusterRequest, Cluster, OperationMetadata>
      createSecondaryClusterOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createSecondaryClusterOperationCallable()");
  }

  public UnaryCallable<CreateSecondaryClusterRequest, Operation> createSecondaryClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: createSecondaryClusterCallable()");
  }

  public UnaryCallable<ListInstancesRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstancesPagedCallable()");
  }

  public UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstancesCallable()");
  }

  public UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: getInstanceCallable()");
  }

  public OperationCallable<CreateInstanceRequest, Instance, OperationMetadata>
      createInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createInstanceOperationCallable()");
  }

  public UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: createInstanceCallable()");
  }

  public OperationCallable<CreateSecondaryInstanceRequest, Instance, OperationMetadata>
      createSecondaryInstanceOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createSecondaryInstanceOperationCallable()");
  }

  public UnaryCallable<CreateSecondaryInstanceRequest, Operation>
      createSecondaryInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: createSecondaryInstanceCallable()");
  }

  public OperationCallable<
          BatchCreateInstancesRequest, BatchCreateInstancesResponse, OperationMetadata>
      batchCreateInstancesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchCreateInstancesOperationCallable()");
  }

  public UnaryCallable<BatchCreateInstancesRequest, Operation> batchCreateInstancesCallable() {
    throw new UnsupportedOperationException("Not implemented: batchCreateInstancesCallable()");
  }

  public OperationCallable<UpdateInstanceRequest, Instance, OperationMetadata>
      updateInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateInstanceOperationCallable()");
  }

  public UnaryCallable<UpdateInstanceRequest, Operation> updateInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: updateInstanceCallable()");
  }

  public OperationCallable<DeleteInstanceRequest, Empty, OperationMetadata>
      deleteInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceOperationCallable()");
  }

  public UnaryCallable<DeleteInstanceRequest, Operation> deleteInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceCallable()");
  }

  public OperationCallable<FailoverInstanceRequest, Instance, OperationMetadata>
      failoverInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: failoverInstanceOperationCallable()");
  }

  public UnaryCallable<FailoverInstanceRequest, Operation> failoverInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: failoverInstanceCallable()");
  }

  public OperationCallable<InjectFaultRequest, Instance, OperationMetadata>
      injectFaultOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: injectFaultOperationCallable()");
  }

  public UnaryCallable<InjectFaultRequest, Operation> injectFaultCallable() {
    throw new UnsupportedOperationException("Not implemented: injectFaultCallable()");
  }

  public OperationCallable<RestartInstanceRequest, Instance, OperationMetadata>
      restartInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: restartInstanceOperationCallable()");
  }

  public UnaryCallable<RestartInstanceRequest, Operation> restartInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: restartInstanceCallable()");
  }

  public UnaryCallable<ListBackupsRequest, ListBackupsPagedResponse> listBackupsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listBackupsPagedCallable()");
  }

  public UnaryCallable<ListBackupsRequest, ListBackupsResponse> listBackupsCallable() {
    throw new UnsupportedOperationException("Not implemented: listBackupsCallable()");
  }

  public UnaryCallable<GetBackupRequest, Backup> getBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: getBackupCallable()");
  }

  public OperationCallable<CreateBackupRequest, Backup, OperationMetadata>
      createBackupOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createBackupOperationCallable()");
  }

  public UnaryCallable<CreateBackupRequest, Operation> createBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: createBackupCallable()");
  }

  public OperationCallable<UpdateBackupRequest, Backup, OperationMetadata>
      updateBackupOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateBackupOperationCallable()");
  }

  public UnaryCallable<UpdateBackupRequest, Operation> updateBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: updateBackupCallable()");
  }

  public OperationCallable<DeleteBackupRequest, Empty, OperationMetadata>
      deleteBackupOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteBackupOperationCallable()");
  }

  public UnaryCallable<DeleteBackupRequest, Operation> deleteBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteBackupCallable()");
  }

  public UnaryCallable<ListSupportedDatabaseFlagsRequest, ListSupportedDatabaseFlagsPagedResponse>
      listSupportedDatabaseFlagsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listSupportedDatabaseFlagsPagedCallable()");
  }

  public UnaryCallable<ListSupportedDatabaseFlagsRequest, ListSupportedDatabaseFlagsResponse>
      listSupportedDatabaseFlagsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listSupportedDatabaseFlagsCallable()");
  }

  public UnaryCallable<GenerateClientCertificateRequest, GenerateClientCertificateResponse>
      generateClientCertificateCallable() {
    throw new UnsupportedOperationException("Not implemented: generateClientCertificateCallable()");
  }

  public UnaryCallable<GetConnectionInfoRequest, ConnectionInfo> getConnectionInfoCallable() {
    throw new UnsupportedOperationException("Not implemented: getConnectionInfoCallable()");
  }

  public UnaryCallable<ListUsersRequest, ListUsersPagedResponse> listUsersPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listUsersPagedCallable()");
  }

  public UnaryCallable<ListUsersRequest, ListUsersResponse> listUsersCallable() {
    throw new UnsupportedOperationException("Not implemented: listUsersCallable()");
  }

  public UnaryCallable<GetUserRequest, User> getUserCallable() {
    throw new UnsupportedOperationException("Not implemented: getUserCallable()");
  }

  public UnaryCallable<CreateUserRequest, User> createUserCallable() {
    throw new UnsupportedOperationException("Not implemented: createUserCallable()");
  }

  public UnaryCallable<UpdateUserRequest, User> updateUserCallable() {
    throw new UnsupportedOperationException("Not implemented: updateUserCallable()");
  }

  public UnaryCallable<DeleteUserRequest, Empty> deleteUserCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteUserCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  @Override
  public abstract void close();
}
