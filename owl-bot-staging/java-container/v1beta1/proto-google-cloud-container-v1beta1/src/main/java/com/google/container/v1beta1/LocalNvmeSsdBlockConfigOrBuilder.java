// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface LocalNvmeSsdBlockConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.LocalNvmeSsdBlockConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number of local NVMe SSDs to use.  The limit for this value is dependent
   * upon the maximum number of disk available on a machine per zone. See:
   * https://cloud.google.com/compute/docs/disks/local-ssd
   * for more information.
   *
   * A zero (or unset) value has different meanings depending on machine type
   * being used:
   * 1. For pre-Gen3 machines, which support flexible numbers of local ssds,
   * zero (or unset) means to disable using local SSDs as ephemeral storage.
   * 2. For Gen3 machines which dictate a specific number of local ssds, zero
   * (or unset) means to use the default number of local ssds that goes with
   * that machine type. For example, for a c3-standard-8-lssd machine, 2 local
   * ssds would be provisioned. For c3-standard-8 (which doesn't support local
   * ssds), 0 will be provisioned. See
   * https://cloud.google.com/compute/docs/disks/local-ssd#choose_number_local_ssds
   * for more info.
   * </pre>
   *
   * <code>int32 local_ssd_count = 1;</code>
   * @return The localSsdCount.
   */
  int getLocalSsdCount();
}
