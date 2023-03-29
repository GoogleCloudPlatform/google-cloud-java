// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/import_config.proto

package com.google.cloud.retail.v2beta;

public final class ImportConfigProto {
  private ImportConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_GcsSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_BigQuerySource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ProductInlineSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ProductInlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_UserEventInlineSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_UserEventInlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ImportErrorsConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ImportErrorsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ImportProductsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ImportProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ImportUserEventsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ImportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ProductInputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ProductInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_UserEventInputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_UserEventInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_CompletionDataInputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompletionDataInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ImportMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ImportMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ImportProductsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ImportProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ImportUserEventsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ImportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_UserEventImportSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_UserEventImportSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_ImportCompletionDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ImportCompletionDataResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/retail/v2beta/import_conf" +
      "ig.proto\022\032google.cloud.retail.v2beta\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032(google/cloud/retail/v2" +
      "beta/product.proto\032+google/cloud/retail/" +
      "v2beta/user_event.proto\032 google/protobuf" +
      "/field_mask.proto\032\037google/protobuf/times" +
      "tamp.proto\032\027google/rpc/status.proto\032\026goo" +
      "gle/type/date.proto\"9\n\tGcsSource\022\027\n\ninpu" +
      "t_uris\030\001 \003(\tB\003\340A\002\022\023\n\013data_schema\030\002 \001(\t\"\274" +
      "\001\n\016BigQuerySource\022+\n\016partition_date\030\006 \001(" +
      "\0132\021.google.type.DateH\000\022\022\n\nproject_id\030\005 \001" +
      "(\t\022\027\n\ndataset_id\030\001 \001(\tB\003\340A\002\022\025\n\010table_id\030" +
      "\002 \001(\tB\003\340A\002\022\027\n\017gcs_staging_dir\030\003 \001(\t\022\023\n\013d" +
      "ata_schema\030\004 \001(\tB\013\n\tpartition\"Q\n\023Product" +
      "InlineSource\022:\n\010products\030\001 \003(\0132#.google." +
      "cloud.retail.v2beta.ProductB\003\340A\002\"X\n\025User" +
      "EventInlineSource\022?\n\013user_events\030\001 \003(\0132%" +
      ".google.cloud.retail.v2beta.UserEventB\003\340" +
      "A\002\"9\n\022ImportErrorsConfig\022\024\n\ngcs_prefix\030\001" +
      " \001(\tH\000B\r\n\013destination\"\204\004\n\025ImportProducts" +
      "Request\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\n\034retail." +
      "googleapis.com/Branch\022\026\n\nrequest_id\030\006 \001(" +
      "\tB\002\030\001\022I\n\014input_config\030\002 \001(\0132..google.clo" +
      "ud.retail.v2beta.ProductInputConfigB\003\340A\002" +
      "\022E\n\rerrors_config\030\003 \001(\0132..google.cloud.r" +
      "etail.v2beta.ImportErrorsConfig\022/\n\013updat" +
      "e_mask\030\004 \001(\0132\032.google.protobuf.FieldMask" +
      "\022a\n\023reconciliation_mode\030\005 \001(\0162D.google.c" +
      "loud.retail.v2beta.ImportProductsRequest" +
      ".ReconciliationMode\022!\n\031notification_pubs" +
      "ub_topic\030\007 \001(\t\"T\n\022ReconciliationMode\022#\n\037" +
      "RECONCILIATION_MODE_UNSPECIFIED\020\000\022\017\n\013INC" +
      "REMENTAL\020\001\022\010\n\004FULL\020\002\"\344\001\n\027ImportUserEvent" +
      "sRequest\0225\n\006parent\030\001 \001(\tB%\340A\002\372A\037\n\035retail" +
      ".googleapis.com/Catalog\022K\n\014input_config\030" +
      "\002 \001(\01320.google.cloud.retail.v2beta.UserE" +
      "ventInputConfigB\003\340A\002\022E\n\rerrors_config\030\003 " +
      "\001(\0132..google.cloud.retail.v2beta.ImportE" +
      "rrorsConfig\"\311\001\n\033ImportCompletionDataRequ" +
      "est\0225\n\006parent\030\001 \001(\tB%\340A\002\372A\037\n\035retail.goog" +
      "leapis.com/Catalog\022P\n\014input_config\030\002 \001(\013" +
      "25.google.cloud.retail.v2beta.Completion" +
      "DataInputConfigB\003\340A\002\022!\n\031notification_pub" +
      "sub_topic\030\003 \001(\t\"\365\001\n\022ProductInputConfig\022P" +
      "\n\025product_inline_source\030\001 \001(\0132/.google.c" +
      "loud.retail.v2beta.ProductInlineSourceH\000" +
      "\022;\n\ngcs_source\030\002 \001(\0132%.google.cloud.reta" +
      "il.v2beta.GcsSourceH\000\022F\n\020big_query_sourc" +
      "e\030\003 \001(\0132*.google.cloud.retail.v2beta.Big" +
      "QuerySourceH\000B\010\n\006source\"\213\002\n\024UserEventInp" +
      "utConfig\022Z\n\030user_event_inline_source\030\001 \001" +
      "(\01321.google.cloud.retail.v2beta.UserEven" +
      "tInlineSourceB\003\340A\002H\000\022@\n\ngcs_source\030\002 \001(\013" +
      "2%.google.cloud.retail.v2beta.GcsSourceB" +
      "\003\340A\002H\000\022K\n\020big_query_source\030\003 \001(\0132*.googl" +
      "e.cloud.retail.v2beta.BigQuerySourceB\003\340A" +
      "\002H\000B\010\n\006source\"r\n\031CompletionDataInputConf" +
      "ig\022K\n\020big_query_source\030\001 \001(\0132*.google.cl" +
      "oud.retail.v2beta.BigQuerySourceB\003\340A\002H\000B" +
      "\010\n\006source\"\333\001\n\016ImportMetadata\022/\n\013create_t" +
      "ime\030\001 \001(\0132\032.google.protobuf.Timestamp\022/\n" +
      "\013update_time\030\002 \001(\0132\032.google.protobuf.Tim" +
      "estamp\022\025\n\rsuccess_count\030\003 \001(\003\022\025\n\rfailure" +
      "_count\030\004 \001(\003\022\026\n\nrequest_id\030\005 \001(\tB\002\030\001\022!\n\031" +
      "notification_pubsub_topic\030\006 \001(\t\"\212\001\n\026Impo" +
      "rtProductsResponse\022)\n\rerror_samples\030\001 \003(" +
      "\0132\022.google.rpc.Status\022E\n\rerrors_config\030\002" +
      " \001(\0132..google.cloud.retail.v2beta.Import" +
      "ErrorsConfig\"\330\001\n\030ImportUserEventsRespons" +
      "e\022)\n\rerror_samples\030\001 \003(\0132\022.google.rpc.St" +
      "atus\022E\n\rerrors_config\030\002 \001(\0132..google.clo" +
      "ud.retail.v2beta.ImportErrorsConfig\022J\n\016i" +
      "mport_summary\030\003 \001(\01322.google.cloud.retai" +
      "l.v2beta.UserEventImportSummary\"T\n\026UserE" +
      "ventImportSummary\022\033\n\023joined_events_count" +
      "\030\001 \001(\003\022\035\n\025unjoined_events_count\030\002 \001(\003\"I\n" +
      "\034ImportCompletionDataResponse\022)\n\rerror_s" +
      "amples\030\001 \003(\0132\022.google.rpc.StatusB\320\001\n\036com" +
      ".google.cloud.retail.v2betaB\021ImportConfi" +
      "gProtoP\001Z6cloud.google.com/go/retail/api" +
      "v2beta/retailpb;retailpb\242\002\006RETAIL\252\002\032Goog" +
      "le.Cloud.Retail.V2Beta\312\002\032Google\\Cloud\\Re" +
      "tail\\V2beta\352\002\035Google::Cloud::Retail::V2b" +
      "etab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2beta.ProductProto.getDescriptor(),
          com.google.cloud.retail.v2beta.UserEventProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.type.DateProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2beta_GcsSource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_GcsSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_GcsSource_descriptor,
        new java.lang.String[] { "InputUris", "DataSchema", });
    internal_static_google_cloud_retail_v2beta_BigQuerySource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_BigQuerySource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_BigQuerySource_descriptor,
        new java.lang.String[] { "PartitionDate", "ProjectId", "DatasetId", "TableId", "GcsStagingDir", "DataSchema", "Partition", });
    internal_static_google_cloud_retail_v2beta_ProductInlineSource_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_ProductInlineSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ProductInlineSource_descriptor,
        new java.lang.String[] { "Products", });
    internal_static_google_cloud_retail_v2beta_UserEventInlineSource_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2beta_UserEventInlineSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_UserEventInlineSource_descriptor,
        new java.lang.String[] { "UserEvents", });
    internal_static_google_cloud_retail_v2beta_ImportErrorsConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2beta_ImportErrorsConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ImportErrorsConfig_descriptor,
        new java.lang.String[] { "GcsPrefix", "Destination", });
    internal_static_google_cloud_retail_v2beta_ImportProductsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2beta_ImportProductsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ImportProductsRequest_descriptor,
        new java.lang.String[] { "Parent", "RequestId", "InputConfig", "ErrorsConfig", "UpdateMask", "ReconciliationMode", "NotificationPubsubTopic", });
    internal_static_google_cloud_retail_v2beta_ImportUserEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2beta_ImportUserEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ImportUserEventsRequest_descriptor,
        new java.lang.String[] { "Parent", "InputConfig", "ErrorsConfig", });
    internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_descriptor,
        new java.lang.String[] { "Parent", "InputConfig", "NotificationPubsubTopic", });
    internal_static_google_cloud_retail_v2beta_ProductInputConfig_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_retail_v2beta_ProductInputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ProductInputConfig_descriptor,
        new java.lang.String[] { "ProductInlineSource", "GcsSource", "BigQuerySource", "Source", });
    internal_static_google_cloud_retail_v2beta_UserEventInputConfig_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_retail_v2beta_UserEventInputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_UserEventInputConfig_descriptor,
        new java.lang.String[] { "UserEventInlineSource", "GcsSource", "BigQuerySource", "Source", });
    internal_static_google_cloud_retail_v2beta_CompletionDataInputConfig_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_retail_v2beta_CompletionDataInputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_CompletionDataInputConfig_descriptor,
        new java.lang.String[] { "BigQuerySource", "Source", });
    internal_static_google_cloud_retail_v2beta_ImportMetadata_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_retail_v2beta_ImportMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ImportMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "UpdateTime", "SuccessCount", "FailureCount", "RequestId", "NotificationPubsubTopic", });
    internal_static_google_cloud_retail_v2beta_ImportProductsResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_retail_v2beta_ImportProductsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ImportProductsResponse_descriptor,
        new java.lang.String[] { "ErrorSamples", "ErrorsConfig", });
    internal_static_google_cloud_retail_v2beta_ImportUserEventsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_retail_v2beta_ImportUserEventsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ImportUserEventsResponse_descriptor,
        new java.lang.String[] { "ErrorSamples", "ErrorsConfig", "ImportSummary", });
    internal_static_google_cloud_retail_v2beta_UserEventImportSummary_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_retail_v2beta_UserEventImportSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_UserEventImportSummary_descriptor,
        new java.lang.String[] { "JoinedEventsCount", "UnjoinedEventsCount", });
    internal_static_google_cloud_retail_v2beta_ImportCompletionDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_retail_v2beta_ImportCompletionDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_ImportCompletionDataResponse_descriptor,
        new java.lang.String[] { "ErrorSamples", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.ProductProto.getDescriptor();
    com.google.cloud.retail.v2beta.UserEventProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
