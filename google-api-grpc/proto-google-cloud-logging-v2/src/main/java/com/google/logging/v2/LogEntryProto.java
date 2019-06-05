// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/log_entry.proto

package com.google.logging.v2;

public final class LogEntryProto {
  private LogEntryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_LogEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_LogEntry_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogEntry_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_LogEntryOperation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogEntryOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_LogEntrySourceLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogEntrySourceLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/logging/v2/log_entry.proto\022\021goo"
          + "gle.logging.v2\032\034google/api/annotations.p"
          + "roto\032#google/api/monitored_resource.prot"
          + "o\032&google/logging/type/http_request.prot"
          + "o\032&google/logging/type/log_severity.prot"
          + "o\032\031google/protobuf/any.proto\032\034google/pro"
          + "tobuf/struct.proto\032\037google/protobuf/time"
          + "stamp.proto\"\212\006\n\010LogEntry\022\020\n\010log_name\030\014 \001"
          + "(\t\022/\n\010resource\030\010 \001(\0132\035.google.api.Monito"
          + "redResource\022-\n\rproto_payload\030\002 \001(\0132\024.goo"
          + "gle.protobuf.AnyH\000\022\026\n\014text_payload\030\003 \001(\t"
          + "H\000\022/\n\014json_payload\030\006 \001(\0132\027.google.protob"
          + "uf.StructH\000\022-\n\ttimestamp\030\t \001(\0132\032.google."
          + "protobuf.Timestamp\0225\n\021receive_timestamp\030"
          + "\030 \001(\0132\032.google.protobuf.Timestamp\0222\n\010sev"
          + "erity\030\n \001(\0162 .google.logging.type.LogSev"
          + "erity\022\021\n\tinsert_id\030\004 \001(\t\0226\n\014http_request"
          + "\030\007 \001(\0132 .google.logging.type.HttpRequest"
          + "\0227\n\006labels\030\013 \003(\0132\'.google.logging.v2.Log"
          + "Entry.LabelsEntry\0227\n\010metadata\030\031 \001(\0132%.go"
          + "ogle.api.MonitoredResourceMetadata\0227\n\top"
          + "eration\030\017 \001(\0132$.google.logging.v2.LogEnt"
          + "ryOperation\022\r\n\005trace\030\026 \001(\t\022\017\n\007span_id\030\033 "
          + "\001(\t\022\025\n\rtrace_sampled\030\036 \001(\010\022B\n\017source_loc"
          + "ation\030\027 \001(\0132).google.logging.v2.LogEntry"
          + "SourceLocation\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\t\n\007payload\"N\n\021LogE"
          + "ntryOperation\022\n\n\002id\030\001 \001(\t\022\020\n\010producer\030\002 "
          + "\001(\t\022\r\n\005first\030\003 \001(\010\022\014\n\004last\030\004 \001(\010\"F\n\026LogE"
          + "ntrySourceLocation\022\014\n\004file\030\001 \001(\t\022\014\n\004line"
          + "\030\002 \001(\003\022\020\n\010function\030\003 \001(\tB\231\001\n\025com.google."
          + "logging.v2B\rLogEntryProtoP\001Z8google.gola"
          + "ng.org/genproto/googleapis/logging/v2;lo"
          + "gging\370\001\001\252\002\027Google.Cloud.Logging.V2\312\002\027Goo"
          + "gle\\Cloud\\Logging\\V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.logging.type.HttpRequestProto.getDescriptor(),
              com.google.logging.type.LogSeverityProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_logging_v2_LogEntry_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_v2_LogEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_LogEntry_descriptor,
            new java.lang.String[] {
              "LogName",
              "Resource",
              "ProtoPayload",
              "TextPayload",
              "JsonPayload",
              "Timestamp",
              "ReceiveTimestamp",
              "Severity",
              "InsertId",
              "HttpRequest",
              "Labels",
              "Metadata",
              "Operation",
              "Trace",
              "SpanId",
              "TraceSampled",
              "SourceLocation",
              "Payload",
            });
    internal_static_google_logging_v2_LogEntry_LabelsEntry_descriptor =
        internal_static_google_logging_v2_LogEntry_descriptor.getNestedTypes().get(0);
    internal_static_google_logging_v2_LogEntry_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_LogEntry_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_logging_v2_LogEntryOperation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_logging_v2_LogEntryOperation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_LogEntryOperation_descriptor,
            new java.lang.String[] {
              "Id", "Producer", "First", "Last",
            });
    internal_static_google_logging_v2_LogEntrySourceLocation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_logging_v2_LogEntrySourceLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_LogEntrySourceLocation_descriptor,
            new java.lang.String[] {
              "File", "Line", "Function",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.logging.type.HttpRequestProto.getDescriptor();
    com.google.logging.type.LogSeverityProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
