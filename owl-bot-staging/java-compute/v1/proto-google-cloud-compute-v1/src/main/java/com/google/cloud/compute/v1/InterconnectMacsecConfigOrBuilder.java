// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface InterconnectMacsecConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectMacsecConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;</code>
   */
  java.util.List<com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey> 
      getPreSharedKeysList();
  /**
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;</code>
   */
  com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey getPreSharedKeys(int index);
  /**
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;</code>
   */
  int getPreSharedKeysCount();
  /**
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKeyOrBuilder> 
      getPreSharedKeysOrBuilderList();
  /**
   * <pre>
   * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK is generated for each key in the key chain. Google router automatically picks the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKey pre_shared_keys = 420308466;</code>
   */
  com.google.cloud.compute.v1.InterconnectMacsecConfigPreSharedKeyOrBuilder getPreSharedKeysOrBuilder(
      int index);
}
