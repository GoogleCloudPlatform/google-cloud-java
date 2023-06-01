// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/feature.proto

package com.google.cloud.aiplatform.v1beta1;

public final class FeatureProto {
  private FeatureProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/featur" +
      "e.proto\022\037google.cloud.aiplatform.v1beta1" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032>google/cloud/aipla" +
      "tform/v1beta1/feature_monitoring_stats.p" +
      "roto\032=google/cloud/aiplatform/v1beta1/fe" +
      "aturestore_monitoring.proto\032\037google/prot" +
      "obuf/timestamp.proto\"\267\n\n\007Feature\022\022\n\004name" +
      "\030\001 \001(\tB\004\342A\001\005\022\023\n\013description\030\002 \001(\t\022M\n\nval" +
      "ue_type\030\003 \001(\01622.google.cloud.aiplatform." +
      "v1beta1.Feature.ValueTypeB\005\342A\002\002\005\0225\n\013crea" +
      "te_time\030\004 \001(\0132\032.google.protobuf.Timestam" +
      "pB\004\342A\001\003\0225\n\013update_time\030\005 \001(\0132\032.google.pr" +
      "otobuf.TimestampB\004\342A\001\003\022J\n\006labels\030\006 \003(\01324" +
      ".google.cloud.aiplatform.v1beta1.Feature" +
      ".LabelsEntryB\004\342A\001\001\022\014\n\004etag\030\007 \001(\t\022`\n\021moni" +
      "toring_config\030\t \001(\0132=.google.cloud.aipla" +
      "tform.v1beta1.FeaturestoreMonitoringConf" +
      "igB\006\030\001\342A\001\001\022 \n\022disable_monitoring\030\014 \001(\010B\004" +
      "\342A\001\001\022T\n\020monitoring_stats\030\n \003(\01324.google." +
      "cloud.aiplatform.v1beta1.FeatureStatsAno" +
      "malyB\004\342A\001\003\022i\n\032monitoring_stats_anomalies" +
      "\030\013 \003(\0132?.google.cloud.aiplatform.v1beta1" +
      ".Feature.MonitoringStatsAnomalyB\004\342A\001\003\032\263\002" +
      "\n\026MonitoringStatsAnomaly\022b\n\tobjective\030\001 " +
      "\001(\0162I.google.cloud.aiplatform.v1beta1.Fe" +
      "ature.MonitoringStatsAnomaly.ObjectiveB\004" +
      "\342A\001\003\022Y\n\025feature_stats_anomaly\030\002 \001(\01324.go" +
      "ogle.cloud.aiplatform.v1beta1.FeatureSta" +
      "tsAnomalyB\004\342A\001\003\"Z\n\tObjective\022\031\n\025OBJECTIV" +
      "E_UNSPECIFIED\020\000\022\033\n\027IMPORT_FEATURE_ANALYS" +
      "IS\020\001\022\025\n\021SNAPSHOT_ANALYSIS\020\002\032-\n\013LabelsEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\244\001\n\tV" +
      "alueType\022\032\n\026VALUE_TYPE_UNSPECIFIED\020\000\022\010\n\004" +
      "BOOL\020\001\022\016\n\nBOOL_ARRAY\020\002\022\n\n\006DOUBLE\020\003\022\020\n\014DO" +
      "UBLE_ARRAY\020\004\022\t\n\005INT64\020\t\022\017\n\013INT64_ARRAY\020\n" +
      "\022\n\n\006STRING\020\013\022\020\n\014STRING_ARRAY\020\014\022\t\n\005BYTES\020" +
      "\r:\232\001\352A\226\001\n!aiplatform.googleapis.com/Feat" +
      "ure\022qprojects/{project}/locations/{locat" +
      "ion}/featurestores/{featurestore}/entity" +
      "Types/{entity_type}/features/{feature}B\343" +
      "\001\n#com.google.cloud.aiplatform.v1beta1B\014" +
      "FeatureProtoP\001ZCcloud.google.com/go/aipl" +
      "atform/apiv1beta1/aiplatformpb;aiplatfor" +
      "mpb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037" +
      "Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google" +
      "::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Feature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor,
        new java.lang.String[] { "Name", "Description", "ValueType", "CreateTime", "UpdateTime", "Labels", "Etag", "MonitoringConfig", "DisableMonitoring", "MonitoringStats", "MonitoringStatsAnomalies", });
    internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_descriptor,
        new java.lang.String[] { "Objective", "FeatureStatsAnomaly", });
    internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
