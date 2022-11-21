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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface AttachedDiskInitializeParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AttachedDiskInitializeParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The architecture of the attached disk. Valid values are arm64 or x86_64.
   * Check the Architecture enum for the list of possible values.
   * </pre>
   *
   * <code>optional string architecture = 302803283;</code>
   *
   * @return Whether the architecture field is set.
   */
  boolean hasArchitecture();
  /**
   *
   *
   * <pre>
   * The architecture of the attached disk. Valid values are arm64 or x86_64.
   * Check the Architecture enum for the list of possible values.
   * </pre>
   *
   * <code>optional string architecture = 302803283;</code>
   *
   * @return The architecture.
   */
  java.lang.String getArchitecture();
  /**
   *
   *
   * <pre>
   * The architecture of the attached disk. Valid values are arm64 or x86_64.
   * Check the Architecture enum for the list of possible values.
   * </pre>
   *
   * <code>optional string architecture = 302803283;</code>
   *
   * @return The bytes for architecture.
   */
  com.google.protobuf.ByteString getArchitectureBytes();

  /**
   *
   *
   * <pre>
   * An optional description. Provide this property when creating the disk.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description. Provide this property when creating the disk.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description. Provide this property when creating the disk.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
   * </pre>
   *
   * <code>optional string disk_name = 92807149;</code>
   *
   * @return Whether the diskName field is set.
   */
  boolean hasDiskName();
  /**
   *
   *
   * <pre>
   * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
   * </pre>
   *
   * <code>optional string disk_name = 92807149;</code>
   *
   * @return The diskName.
   */
  java.lang.String getDiskName();
  /**
   *
   *
   * <pre>
   * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
   * </pre>
   *
   * <code>optional string disk_name = 92807149;</code>
   *
   * @return The bytes for diskName.
   */
  com.google.protobuf.ByteString getDiskNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   *
   * @return Whether the diskSizeGb field is set.
   */
  boolean hasDiskSizeGb();
  /**
   *
   *
   * <pre>
   * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you specify this field when creating a VM, you can provide either the full or partial URL. For example, the following values are valid: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType If you specify this field when creating or updating an instance template or all-instances configuration, specify the type of the disk, not the URL. For example: pd-standard.
   * </pre>
   *
   * <code>optional string disk_type = 93009052;</code>
   *
   * @return Whether the diskType field is set.
   */
  boolean hasDiskType();
  /**
   *
   *
   * <pre>
   * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you specify this field when creating a VM, you can provide either the full or partial URL. For example, the following values are valid: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType If you specify this field when creating or updating an instance template or all-instances configuration, specify the type of the disk, not the URL. For example: pd-standard.
   * </pre>
   *
   * <code>optional string disk_type = 93009052;</code>
   *
   * @return The diskType.
   */
  java.lang.String getDiskType();
  /**
   *
   *
   * <pre>
   * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you specify this field when creating a VM, you can provide either the full or partial URL. For example, the following values are valid: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType If you specify this field when creating or updating an instance template or all-instances configuration, specify the type of the disk, not the URL. For example: pd-standard.
   * </pre>
   *
   * <code>optional string disk_type = 93009052;</code>
   *
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString getDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A list of publicly visible licenses. Reserved for Google's use.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @return A list containing the licenses.
   */
  java.util.List<java.lang.String> getLicensesList();
  /**
   *
   *
   * <pre>
   * A list of publicly visible licenses. Reserved for Google's use.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @return The count of licenses.
   */
  int getLicensesCount();
  /**
   *
   *
   * <pre>
   * A list of publicly visible licenses. Reserved for Google's use.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @param index The index of the element to return.
   * @return The licenses at the given index.
   */
  java.lang.String getLicenses(int index);
  /**
   *
   *
   * <pre>
   * A list of publicly visible licenses. Reserved for Google's use.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the licenses at the given index.
   */
  com.google.protobuf.ByteString getLicensesBytes(int index);

  /**
   *
   *
   * <pre>
   * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
   * Check the OnUpdateAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string on_update_action = 202451980;</code>
   *
   * @return Whether the onUpdateAction field is set.
   */
  boolean hasOnUpdateAction();
  /**
   *
   *
   * <pre>
   * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
   * Check the OnUpdateAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string on_update_action = 202451980;</code>
   *
   * @return The onUpdateAction.
   */
  java.lang.String getOnUpdateAction();
  /**
   *
   *
   * <pre>
   * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
   * Check the OnUpdateAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string on_update_action = 202451980;</code>
   *
   * @return The bytes for onUpdateAction.
   */
  com.google.protobuf.ByteString getOnUpdateActionBytes();

  /**
   *
   *
   * <pre>
   * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
   * </pre>
   *
   * <code>optional int64 provisioned_iops = 186769108;</code>
   *
   * @return Whether the provisionedIops field is set.
   */
  boolean hasProvisionedIops();
  /**
   *
   *
   * <pre>
   * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
   * </pre>
   *
   * <code>optional int64 provisioned_iops = 186769108;</code>
   *
   * @return The provisionedIops.
   */
  long getProvisionedIops();

  /**
   *
   *
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  int getResourceManagerTagsCount();
  /**
   *
   *
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  boolean containsResourceManagerTags(java.lang.String key);
  /** Use {@link #getResourceManagerTagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getResourceManagerTags();
  /**
   *
   *
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getResourceManagerTagsMap();
  /**
   *
   *
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */

  /* nullable */
  java.lang.String getResourceManagerTagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  java.lang.String getResourceManagerTagsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @return A list containing the resourcePolicies.
   */
  java.util.List<java.lang.String> getResourcePoliciesList();
  /**
   *
   *
   * <pre>
   * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @return The count of resourcePolicies.
   */
  int getResourcePoliciesCount();
  /**
   *
   *
   * <pre>
   * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @param index The index of the element to return.
   * @return The resourcePolicies at the given index.
   */
  java.lang.String getResourcePolicies(int index);
  /**
   *
   *
   * <pre>
   * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourcePolicies at the given index.
   */
  com.google.protobuf.ByteString getResourcePoliciesBytes(int index);

  /**
   *
   *
   * <pre>
   * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
   * </pre>
   *
   * <code>optional string source_image = 50443319;</code>
   *
   * @return Whether the sourceImage field is set.
   */
  boolean hasSourceImage();
  /**
   *
   *
   * <pre>
   * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
   * </pre>
   *
   * <code>optional string source_image = 50443319;</code>
   *
   * @return The sourceImage.
   */
  java.lang.String getSourceImage();
  /**
   *
   *
   * <pre>
   * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
   * </pre>
   *
   * <code>optional string source_image = 50443319;</code>
   *
   * @return The bytes for sourceImage.
   */
  com.google.protobuf.ByteString getSourceImageBytes();

  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. InstanceTemplate and InstancePropertiesPatch do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.CustomerEncryptionKey source_image_encryption_key = 381503659;
   * </code>
   *
   * @return Whether the sourceImageEncryptionKey field is set.
   */
  boolean hasSourceImageEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. InstanceTemplate and InstancePropertiesPatch do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.CustomerEncryptionKey source_image_encryption_key = 381503659;
   * </code>
   *
   * @return The sourceImageEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getSourceImageEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. InstanceTemplate and InstancePropertiesPatch do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.CustomerEncryptionKey source_image_encryption_key = 381503659;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getSourceImageEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
   * </pre>
   *
   * <code>optional string source_snapshot = 126061928;</code>
   *
   * @return Whether the sourceSnapshot field is set.
   */
  boolean hasSourceSnapshot();
  /**
   *
   *
   * <pre>
   * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
   * </pre>
   *
   * <code>optional string source_snapshot = 126061928;</code>
   *
   * @return The sourceSnapshot.
   */
  java.lang.String getSourceSnapshot();
  /**
   *
   *
   * <pre>
   * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
   * </pre>
   *
   * <code>optional string source_snapshot = 126061928;</code>
   *
   * @return The bytes for sourceSnapshot.
   */
  com.google.protobuf.ByteString getSourceSnapshotBytes();

  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source snapshot.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.CustomerEncryptionKey source_snapshot_encryption_key = 303679322;
   * </code>
   *
   * @return Whether the sourceSnapshotEncryptionKey field is set.
   */
  boolean hasSourceSnapshotEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source snapshot.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.CustomerEncryptionKey source_snapshot_encryption_key = 303679322;
   * </code>
   *
   * @return The sourceSnapshotEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getSourceSnapshotEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source snapshot.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.CustomerEncryptionKey source_snapshot_encryption_key = 303679322;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder
      getSourceSnapshotEncryptionKeyOrBuilder();
}
