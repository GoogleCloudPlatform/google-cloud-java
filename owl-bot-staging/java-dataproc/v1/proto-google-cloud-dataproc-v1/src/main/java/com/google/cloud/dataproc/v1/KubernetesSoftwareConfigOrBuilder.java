// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

public interface KubernetesSoftwareConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.KubernetesSoftwareConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The components that should be installed in this Dataproc cluster. The key
   * must be a string from the KubernetesComponent enumeration. The value is
   * the version of the software to be installed.
   * At least one entry must be specified.
   * </pre>
   *
   * <code>map&lt;string, string&gt; component_version = 1;</code>
   */
  int getComponentVersionCount();
  /**
   * <pre>
   * The components that should be installed in this Dataproc cluster. The key
   * must be a string from the KubernetesComponent enumeration. The value is
   * the version of the software to be installed.
   * At least one entry must be specified.
   * </pre>
   *
   * <code>map&lt;string, string&gt; component_version = 1;</code>
   */
  boolean containsComponentVersion(
      java.lang.String key);
  /**
   * Use {@link #getComponentVersionMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getComponentVersion();
  /**
   * <pre>
   * The components that should be installed in this Dataproc cluster. The key
   * must be a string from the KubernetesComponent enumeration. The value is
   * the version of the software to be installed.
   * At least one entry must be specified.
   * </pre>
   *
   * <code>map&lt;string, string&gt; component_version = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getComponentVersionMap();
  /**
   * <pre>
   * The components that should be installed in this Dataproc cluster. The key
   * must be a string from the KubernetesComponent enumeration. The value is
   * the version of the software to be installed.
   * At least one entry must be specified.
   * </pre>
   *
   * <code>map&lt;string, string&gt; component_version = 1;</code>
   */

  /* nullable */
java.lang.String getComponentVersionOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The components that should be installed in this Dataproc cluster. The key
   * must be a string from the KubernetesComponent enumeration. The value is
   * the version of the software to be installed.
   * At least one entry must be specified.
   * </pre>
   *
   * <code>map&lt;string, string&gt; component_version = 1;</code>
   */

  java.lang.String getComponentVersionOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `spark:spark.kubernetes.container.image`. The following are supported
   * prefixes and their mappings:
   * * spark:  `spark-defaults.conf`
   * For more information, see [Cluster
   * properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `spark:spark.kubernetes.container.image`. The following are supported
   * prefixes and their mappings:
   * * spark:  `spark-defaults.conf`
   * For more information, see [Cluster
   * properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */
  boolean containsProperties(
      java.lang.String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getProperties();
  /**
   * <pre>
   * The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `spark:spark.kubernetes.container.image`. The following are supported
   * prefixes and their mappings:
   * * spark:  `spark-defaults.conf`
   * For more information, see [Cluster
   * properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPropertiesMap();
  /**
   * <pre>
   * The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `spark:spark.kubernetes.container.image`. The following are supported
   * prefixes and their mappings:
   * * spark:  `spark-defaults.conf`
   * For more information, see [Cluster
   * properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  /* nullable */
java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `spark:spark.kubernetes.container.image`. The following are supported
   * prefixes and their mappings:
   * * spark:  `spark-defaults.conf`
   * For more information, see [Cluster
   * properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  java.lang.String getPropertiesOrThrow(
      java.lang.String key);
}
