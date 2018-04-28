// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public final class ReportErrorsServiceProto {
  private ReportErrorsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/devtools/clouderrorreporting/v1" +
      "beta1/report_errors_service.proto\022+googl" +
      "e.devtools.clouderrorreporting.v1beta1\032\034" +
      "google/api/annotations.proto\0328google/dev" +
      "tools/clouderrorreporting/v1beta1/common" +
      ".proto\032\037google/protobuf/timestamp.proto\"" +
      "\177\n\027ReportErrorEventRequest\022\024\n\014project_na" +
      "me\030\001 \001(\t\022N\n\005event\030\002 \001(\0132?.google.devtool" +
      "s.clouderrorreporting.v1beta1.ReportedEr" +
      "rorEvent\"\032\n\030ReportErrorEventResponse\"\367\001\n" +
      "\022ReportedErrorEvent\022.\n\nevent_time\030\001 \001(\0132" +
      "\032.google.protobuf.Timestamp\022T\n\017service_c" +
      "ontext\030\002 \001(\0132;.google.devtools.clouderro" +
      "rreporting.v1beta1.ServiceContext\022\017\n\007mes" +
      "sage\030\003 \001(\t\022J\n\007context\030\004 \001(\01329.google.dev" +
      "tools.clouderrorreporting.v1beta1.ErrorC" +
      "ontext2\370\001\n\023ReportErrorsService\022\340\001\n\020Repor" +
      "tErrorEvent\022D.google.devtools.clouderror" +
      "reporting.v1beta1.ReportErrorEventReques" +
      "t\032E.google.devtools.clouderrorreporting." +
      "v1beta1.ReportErrorEventResponse\"?\202\323\344\223\0029" +
      "\"0/v1beta1/{project_name=projects/*}/eve" +
      "nts:report:\005eventB\371\001\n/com.google.devtool" +
      "s.clouderrorreporting.v1beta1B\030ReportErr" +
      "orsServiceProtoP\001Z^google.golang.org/gen" +
      "proto/googleapis/devtools/clouderrorrepo" +
      "rting/v1beta1;clouderrorreporting\252\002#Goog" +
      "le.Cloud.ErrorReporting.V1Beta1\312\002#Google" +
      "\\Cloud\\ErrorReporting\\V1beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.devtools.clouderrorreporting.v1beta1.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor,
        new java.lang.String[] { "ProjectName", "Event", });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_descriptor,
        new java.lang.String[] { "EventTime", "ServiceContext", "Message", "Context", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.devtools.clouderrorreporting.v1beta1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
