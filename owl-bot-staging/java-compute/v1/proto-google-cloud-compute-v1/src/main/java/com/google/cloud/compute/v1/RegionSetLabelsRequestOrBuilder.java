// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface RegionSetLabelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionSetLabelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. Make a get() request to the resource to get the latest fingerprint.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   * @return Whether the labelFingerprint field is set.
   */
  boolean hasLabelFingerprint();
  /**
   * <pre>
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. Make a get() request to the resource to get the latest fingerprint.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   * @return The labelFingerprint.
   */
  java.lang.String getLabelFingerprint();
  /**
   * <pre>
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. Make a get() request to the resource to get the latest fingerprint.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   * @return The bytes for labelFingerprint.
   */
  com.google.protobuf.ByteString
      getLabelFingerprintBytes();

  /**
   * <pre>
   * The labels to set for this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The labels to set for this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
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
   * The labels to set for this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The labels to set for this resource.
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
   * <pre>
   * The labels to set for this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
