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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.migrationcenter.v1;

public interface VmwarePlatformDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.VmwarePlatformDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * vCenter version.
   * </pre>
   *
   * <code>string vcenter_version = 1;</code>
   *
   * @return The vcenterVersion.
   */
  java.lang.String getVcenterVersion();
  /**
   *
   *
   * <pre>
   * vCenter version.
   * </pre>
   *
   * <code>string vcenter_version = 1;</code>
   *
   * @return The bytes for vcenterVersion.
   */
  com.google.protobuf.ByteString getVcenterVersionBytes();

  /**
   *
   *
   * <pre>
   * ESX version.
   * </pre>
   *
   * <code>string esx_version = 2;</code>
   *
   * @return The esxVersion.
   */
  java.lang.String getEsxVersion();
  /**
   *
   *
   * <pre>
   * ESX version.
   * </pre>
   *
   * <code>string esx_version = 2;</code>
   *
   * @return The bytes for esxVersion.
   */
  com.google.protobuf.ByteString getEsxVersionBytes();

  /**
   *
   *
   * <pre>
   * VMware os enum -
   * https://vdc-repo.vmware.com/vmwb-repository/dcr-public/da47f910-60ac-438b-8b9b-6122f4d14524/16b7274a-bf8b-4b4c-a05e-746f2aa93c8c/doc/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html.
   * </pre>
   *
   * <code>string osid = 3;</code>
   *
   * @return The osid.
   */
  java.lang.String getOsid();
  /**
   *
   *
   * <pre>
   * VMware os enum -
   * https://vdc-repo.vmware.com/vmwb-repository/dcr-public/da47f910-60ac-438b-8b9b-6122f4d14524/16b7274a-bf8b-4b4c-a05e-746f2aa93c8c/doc/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html.
   * </pre>
   *
   * <code>string osid = 3;</code>
   *
   * @return The bytes for osid.
   */
  com.google.protobuf.ByteString getOsidBytes();

  /**
   *
   *
   * <pre>
   * Folder name in vCenter where asset resides.
   * </pre>
   *
   * <code>string vcenter_folder = 4;</code>
   *
   * @return The vcenterFolder.
   */
  java.lang.String getVcenterFolder();
  /**
   *
   *
   * <pre>
   * Folder name in vCenter where asset resides.
   * </pre>
   *
   * <code>string vcenter_folder = 4;</code>
   *
   * @return The bytes for vcenterFolder.
   */
  com.google.protobuf.ByteString getVcenterFolderBytes();

  /**
   *
   *
   * <pre>
   * vCenter URI used in collection.
   * </pre>
   *
   * <code>string vcenter_uri = 5;</code>
   *
   * @return The vcenterUri.
   */
  java.lang.String getVcenterUri();
  /**
   *
   *
   * <pre>
   * vCenter URI used in collection.
   * </pre>
   *
   * <code>string vcenter_uri = 5;</code>
   *
   * @return The bytes for vcenterUri.
   */
  com.google.protobuf.ByteString getVcenterUriBytes();

  /**
   *
   *
   * <pre>
   * vCenter VM ID.
   * </pre>
   *
   * <code>string vcenter_vm_id = 6;</code>
   *
   * @return The vcenterVmId.
   */
  java.lang.String getVcenterVmId();
  /**
   *
   *
   * <pre>
   * vCenter VM ID.
   * </pre>
   *
   * <code>string vcenter_vm_id = 6;</code>
   *
   * @return The bytes for vcenterVmId.
   */
  com.google.protobuf.ByteString getVcenterVmIdBytes();
}
