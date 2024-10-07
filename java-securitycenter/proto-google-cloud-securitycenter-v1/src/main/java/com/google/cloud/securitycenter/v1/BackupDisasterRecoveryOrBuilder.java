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
// source: google/cloud/securitycenter/v1/backup_disaster_recovery.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1;

public interface BackupDisasterRecoveryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.BackupDisasterRecovery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of a Backup and DR template which comprises one or more backup
   * policies. See the [Backup and DR
   * documentation](https://cloud.google.com/backup-disaster-recovery/docs/concepts/backup-plan#temp)
   * for more information. For example, `snap-ov`.
   * </pre>
   *
   * <code>string backup_template = 1;</code>
   *
   * @return The backupTemplate.
   */
  java.lang.String getBackupTemplate();
  /**
   *
   *
   * <pre>
   * The name of a Backup and DR template which comprises one or more backup
   * policies. See the [Backup and DR
   * documentation](https://cloud.google.com/backup-disaster-recovery/docs/concepts/backup-plan#temp)
   * for more information. For example, `snap-ov`.
   * </pre>
   *
   * <code>string backup_template = 1;</code>
   *
   * @return The bytes for backupTemplate.
   */
  com.google.protobuf.ByteString getBackupTemplateBytes();

  /**
   *
   *
   * <pre>
   * The names of Backup and DR policies that are associated with a template
   * and that define when to run a backup, how frequently to run a backup, and
   * how long to retain the backup image. For example, `onvaults`.
   * </pre>
   *
   * <code>repeated string policies = 2;</code>
   *
   * @return A list containing the policies.
   */
  java.util.List<java.lang.String> getPoliciesList();
  /**
   *
   *
   * <pre>
   * The names of Backup and DR policies that are associated with a template
   * and that define when to run a backup, how frequently to run a backup, and
   * how long to retain the backup image. For example, `onvaults`.
   * </pre>
   *
   * <code>repeated string policies = 2;</code>
   *
   * @return The count of policies.
   */
  int getPoliciesCount();
  /**
   *
   *
   * <pre>
   * The names of Backup and DR policies that are associated with a template
   * and that define when to run a backup, how frequently to run a backup, and
   * how long to retain the backup image. For example, `onvaults`.
   * </pre>
   *
   * <code>repeated string policies = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The policies at the given index.
   */
  java.lang.String getPolicies(int index);
  /**
   *
   *
   * <pre>
   * The names of Backup and DR policies that are associated with a template
   * and that define when to run a backup, how frequently to run a backup, and
   * how long to retain the backup image. For example, `onvaults`.
   * </pre>
   *
   * <code>repeated string policies = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the policies at the given index.
   */
  com.google.protobuf.ByteString getPoliciesBytes(int index);

  /**
   *
   *
   * <pre>
   * The name of a Backup and DR host, which is managed by the backup and
   * recovery appliance and known to the management console. The host can be of
   * type Generic (for example, Compute Engine, SQL Server, Oracle DB, SMB file
   * system, etc.), vCenter, or an ESX server. See the [Backup and DR
   * documentation on
   * hosts](https://cloud.google.com/backup-disaster-recovery/docs/configuration/manage-hosts-and-their-applications)
   * for more information. For example, `centos7-01`.
   * </pre>
   *
   * <code>string host = 3;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * The name of a Backup and DR host, which is managed by the backup and
   * recovery appliance and known to the management console. The host can be of
   * type Generic (for example, Compute Engine, SQL Server, Oracle DB, SMB file
   * system, etc.), vCenter, or an ESX server. See the [Backup and DR
   * documentation on
   * hosts](https://cloud.google.com/backup-disaster-recovery/docs/configuration/manage-hosts-and-their-applications)
   * for more information. For example, `centos7-01`.
   * </pre>
   *
   * <code>string host = 3;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * The names of Backup and DR applications. An application is a VM, database,
   * or file system on a managed host monitored by a backup and recovery
   * appliance. For example, `centos7-01-vol00`, `centos7-01-vol01`,
   * `centos7-01-vol02`.
   * </pre>
   *
   * <code>repeated string applications = 4;</code>
   *
   * @return A list containing the applications.
   */
  java.util.List<java.lang.String> getApplicationsList();
  /**
   *
   *
   * <pre>
   * The names of Backup and DR applications. An application is a VM, database,
   * or file system on a managed host monitored by a backup and recovery
   * appliance. For example, `centos7-01-vol00`, `centos7-01-vol01`,
   * `centos7-01-vol02`.
   * </pre>
   *
   * <code>repeated string applications = 4;</code>
   *
   * @return The count of applications.
   */
  int getApplicationsCount();
  /**
   *
   *
   * <pre>
   * The names of Backup and DR applications. An application is a VM, database,
   * or file system on a managed host monitored by a backup and recovery
   * appliance. For example, `centos7-01-vol00`, `centos7-01-vol01`,
   * `centos7-01-vol02`.
   * </pre>
   *
   * <code>repeated string applications = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The applications at the given index.
   */
  java.lang.String getApplications(int index);
  /**
   *
   *
   * <pre>
   * The names of Backup and DR applications. An application is a VM, database,
   * or file system on a managed host monitored by a backup and recovery
   * appliance. For example, `centos7-01-vol00`, `centos7-01-vol01`,
   * `centos7-01-vol02`.
   * </pre>
   *
   * <code>repeated string applications = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the applications at the given index.
   */
  com.google.protobuf.ByteString getApplicationsBytes(int index);

  /**
   *
   *
   * <pre>
   * The name of the Backup and DR storage pool that the backup and recovery
   * appliance is storing data in. The storage pool could be of type Cloud,
   * Primary, Snapshot, or OnVault. See the [Backup and DR documentation on
   * storage
   * pools](https://cloud.google.com/backup-disaster-recovery/docs/concepts/storage-pools).
   * For example, `DiskPoolOne`.
   * </pre>
   *
   * <code>string storage_pool = 5;</code>
   *
   * @return The storagePool.
   */
  java.lang.String getStoragePool();
  /**
   *
   *
   * <pre>
   * The name of the Backup and DR storage pool that the backup and recovery
   * appliance is storing data in. The storage pool could be of type Cloud,
   * Primary, Snapshot, or OnVault. See the [Backup and DR documentation on
   * storage
   * pools](https://cloud.google.com/backup-disaster-recovery/docs/concepts/storage-pools).
   * For example, `DiskPoolOne`.
   * </pre>
   *
   * <code>string storage_pool = 5;</code>
   *
   * @return The bytes for storagePool.
   */
  com.google.protobuf.ByteString getStoragePoolBytes();

  /**
   *
   *
   * <pre>
   * The names of Backup and DR advanced policy options of a policy applying to
   * an application. See the [Backup and DR documentation on policy
   * options](https://cloud.google.com/backup-disaster-recovery/docs/create-plan/policy-settings).
   * For example, `skipofflineappsincongrp, nounmap`.
   * </pre>
   *
   * <code>repeated string policy_options = 6;</code>
   *
   * @return A list containing the policyOptions.
   */
  java.util.List<java.lang.String> getPolicyOptionsList();
  /**
   *
   *
   * <pre>
   * The names of Backup and DR advanced policy options of a policy applying to
   * an application. See the [Backup and DR documentation on policy
   * options](https://cloud.google.com/backup-disaster-recovery/docs/create-plan/policy-settings).
   * For example, `skipofflineappsincongrp, nounmap`.
   * </pre>
   *
   * <code>repeated string policy_options = 6;</code>
   *
   * @return The count of policyOptions.
   */
  int getPolicyOptionsCount();
  /**
   *
   *
   * <pre>
   * The names of Backup and DR advanced policy options of a policy applying to
   * an application. See the [Backup and DR documentation on policy
   * options](https://cloud.google.com/backup-disaster-recovery/docs/create-plan/policy-settings).
   * For example, `skipofflineappsincongrp, nounmap`.
   * </pre>
   *
   * <code>repeated string policy_options = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The policyOptions at the given index.
   */
  java.lang.String getPolicyOptions(int index);
  /**
   *
   *
   * <pre>
   * The names of Backup and DR advanced policy options of a policy applying to
   * an application. See the [Backup and DR documentation on policy
   * options](https://cloud.google.com/backup-disaster-recovery/docs/create-plan/policy-settings).
   * For example, `skipofflineappsincongrp, nounmap`.
   * </pre>
   *
   * <code>repeated string policy_options = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the policyOptions at the given index.
   */
  com.google.protobuf.ByteString getPolicyOptionsBytes(int index);

  /**
   *
   *
   * <pre>
   * The name of the Backup and DR resource profile that specifies the storage
   * media for backups of application and VM data. See the [Backup and DR
   * documentation on
   * profiles](https://cloud.google.com/backup-disaster-recovery/docs/concepts/backup-plan#profile).
   * For example, `GCP`.
   * </pre>
   *
   * <code>string profile = 7;</code>
   *
   * @return The profile.
   */
  java.lang.String getProfile();
  /**
   *
   *
   * <pre>
   * The name of the Backup and DR resource profile that specifies the storage
   * media for backups of application and VM data. See the [Backup and DR
   * documentation on
   * profiles](https://cloud.google.com/backup-disaster-recovery/docs/concepts/backup-plan#profile).
   * For example, `GCP`.
   * </pre>
   *
   * <code>string profile = 7;</code>
   *
   * @return The bytes for profile.
   */
  com.google.protobuf.ByteString getProfileBytes();

  /**
   *
   *
   * <pre>
   * The name of the Backup and DR appliance that captures, moves, and manages
   * the lifecycle of backup data. For example, `backup-server-57137`.
   * </pre>
   *
   * <code>string appliance = 8;</code>
   *
   * @return The appliance.
   */
  java.lang.String getAppliance();
  /**
   *
   *
   * <pre>
   * The name of the Backup and DR appliance that captures, moves, and manages
   * the lifecycle of backup data. For example, `backup-server-57137`.
   * </pre>
   *
   * <code>string appliance = 8;</code>
   *
   * @return The bytes for appliance.
   */
  com.google.protobuf.ByteString getApplianceBytes();

  /**
   *
   *
   * <pre>
   * The backup type of the Backup and DR image.
   * For example, `Snapshot`, `Remote Snapshot`, `OnVault`.
   * </pre>
   *
   * <code>string backup_type = 9;</code>
   *
   * @return The backupType.
   */
  java.lang.String getBackupType();
  /**
   *
   *
   * <pre>
   * The backup type of the Backup and DR image.
   * For example, `Snapshot`, `Remote Snapshot`, `OnVault`.
   * </pre>
   *
   * <code>string backup_type = 9;</code>
   *
   * @return The bytes for backupType.
   */
  com.google.protobuf.ByteString getBackupTypeBytes();

  /**
   *
   *
   * <pre>
   * The timestamp at which the Backup and DR backup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp backup_create_time = 10;</code>
   *
   * @return Whether the backupCreateTime field is set.
   */
  boolean hasBackupCreateTime();
  /**
   *
   *
   * <pre>
   * The timestamp at which the Backup and DR backup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp backup_create_time = 10;</code>
   *
   * @return The backupCreateTime.
   */
  com.google.protobuf.Timestamp getBackupCreateTime();
  /**
   *
   *
   * <pre>
   * The timestamp at which the Backup and DR backup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp backup_create_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getBackupCreateTimeOrBuilder();
}
