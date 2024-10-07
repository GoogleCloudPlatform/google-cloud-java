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
// source: google/cloud/channel/v1/reports_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * The result of a [RunReportJob][] operation. Contains the name to use in
 * [FetchReportResultsRequest.report_job][google.cloud.channel.v1.FetchReportResultsRequest.report_job]
 * and the status of the operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ReportJob}
 */
@java.lang.Deprecated
public final class ReportJob extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ReportJob)
    ReportJobOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReportJob.newBuilder() to construct.
  private ReportJob(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReportJob() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReportJob();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ReportsServiceProto
        .internal_static_google_cloud_channel_v1_ReportJob_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ReportsServiceProto
        .internal_static_google_cloud_channel_v1_ReportJob_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ReportJob.class,
            com.google.cloud.channel.v1.ReportJob.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of a report job.
   * Name uses the format:
   * `accounts/{account_id}/reportJobs/{report_job_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of a report job.
   * Name uses the format:
   * `accounts/{account_id}/reportJobs/{report_job_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPORT_STATUS_FIELD_NUMBER = 2;
  private com.google.cloud.channel.v1.ReportStatus reportStatus_;
  /**
   *
   *
   * <pre>
   * The current status of report generation.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
   *
   * @return Whether the reportStatus field is set.
   */
  @java.lang.Override
  public boolean hasReportStatus() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The current status of report generation.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
   *
   * @return The reportStatus.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ReportStatus getReportStatus() {
    return reportStatus_ == null
        ? com.google.cloud.channel.v1.ReportStatus.getDefaultInstance()
        : reportStatus_;
  }
  /**
   *
   *
   * <pre>
   * The current status of report generation.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ReportStatusOrBuilder getReportStatusOrBuilder() {
    return reportStatus_ == null
        ? com.google.cloud.channel.v1.ReportStatus.getDefaultInstance()
        : reportStatus_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getReportStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReportStatus());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.channel.v1.ReportJob)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ReportJob other = (com.google.cloud.channel.v1.ReportJob) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasReportStatus() != other.hasReportStatus()) return false;
    if (hasReportStatus()) {
      if (!getReportStatus().equals(other.getReportStatus())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasReportStatus()) {
      hash = (37 * hash) + REPORT_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getReportStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ReportJob parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ReportJob parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ReportJob parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.channel.v1.ReportJob prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The result of a [RunReportJob][] operation. Contains the name to use in
   * [FetchReportResultsRequest.report_job][google.cloud.channel.v1.FetchReportResultsRequest.report_job]
   * and the status of the operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ReportJob}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ReportJob)
      com.google.cloud.channel.v1.ReportJobOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ReportsServiceProto
          .internal_static_google_cloud_channel_v1_ReportJob_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ReportsServiceProto
          .internal_static_google_cloud_channel_v1_ReportJob_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ReportJob.class,
              com.google.cloud.channel.v1.ReportJob.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ReportJob.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getReportStatusFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      reportStatus_ = null;
      if (reportStatusBuilder_ != null) {
        reportStatusBuilder_.dispose();
        reportStatusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ReportsServiceProto
          .internal_static_google_cloud_channel_v1_ReportJob_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ReportJob getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ReportJob.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ReportJob build() {
      com.google.cloud.channel.v1.ReportJob result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ReportJob buildPartial() {
      com.google.cloud.channel.v1.ReportJob result =
          new com.google.cloud.channel.v1.ReportJob(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.channel.v1.ReportJob result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reportStatus_ =
            reportStatusBuilder_ == null ? reportStatus_ : reportStatusBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.channel.v1.ReportJob) {
        return mergeFrom((com.google.cloud.channel.v1.ReportJob) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ReportJob other) {
      if (other == com.google.cloud.channel.v1.ReportJob.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReportStatus()) {
        mergeReportStatus(other.getReportStatus());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getReportStatusFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of a report job.
     * Name uses the format:
     * `accounts/{account_id}/reportJobs/{report_job_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of a report job.
     * Name uses the format:
     * `accounts/{account_id}/reportJobs/{report_job_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of a report job.
     * Name uses the format:
     * `accounts/{account_id}/reportJobs/{report_job_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of a report job.
     * Name uses the format:
     * `accounts/{account_id}/reportJobs/{report_job_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of a report job.
     * Name uses the format:
     * `accounts/{account_id}/reportJobs/{report_job_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.channel.v1.ReportStatus reportStatus_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.ReportStatus,
            com.google.cloud.channel.v1.ReportStatus.Builder,
            com.google.cloud.channel.v1.ReportStatusOrBuilder>
        reportStatusBuilder_;
    /**
     *
     *
     * <pre>
     * The current status of report generation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
     *
     * @return Whether the reportStatus field is set.
     */
    public boolean hasReportStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The current status of report generation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
     *
     * @return The reportStatus.
     */
    public com.google.cloud.channel.v1.ReportStatus getReportStatus() {
      if (reportStatusBuilder_ == null) {
        return reportStatus_ == null
            ? com.google.cloud.channel.v1.ReportStatus.getDefaultInstance()
            : reportStatus_;
      } else {
        return reportStatusBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The current status of report generation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
     */
    public Builder setReportStatus(com.google.cloud.channel.v1.ReportStatus value) {
      if (reportStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reportStatus_ = value;
      } else {
        reportStatusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current status of report generation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
     */
    public Builder setReportStatus(
        com.google.cloud.channel.v1.ReportStatus.Builder builderForValue) {
      if (reportStatusBuilder_ == null) {
        reportStatus_ = builderForValue.build();
      } else {
        reportStatusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current status of report generation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
     */
    public Builder mergeReportStatus(com.google.cloud.channel.v1.ReportStatus value) {
      if (reportStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && reportStatus_ != null
            && reportStatus_ != com.google.cloud.channel.v1.ReportStatus.getDefaultInstance()) {
          getReportStatusBuilder().mergeFrom(value);
        } else {
          reportStatus_ = value;
        }
      } else {
        reportStatusBuilder_.mergeFrom(value);
      }
      if (reportStatus_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current status of report generation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
     */
    public Builder clearReportStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reportStatus_ = null;
      if (reportStatusBuilder_ != null) {
        reportStatusBuilder_.dispose();
        reportStatusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current status of report generation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
     */
    public com.google.cloud.channel.v1.ReportStatus.Builder getReportStatusBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReportStatusFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The current status of report generation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
     */
    public com.google.cloud.channel.v1.ReportStatusOrBuilder getReportStatusOrBuilder() {
      if (reportStatusBuilder_ != null) {
        return reportStatusBuilder_.getMessageOrBuilder();
      } else {
        return reportStatus_ == null
            ? com.google.cloud.channel.v1.ReportStatus.getDefaultInstance()
            : reportStatus_;
      }
    }
    /**
     *
     *
     * <pre>
     * The current status of report generation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.ReportStatus report_status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.ReportStatus,
            com.google.cloud.channel.v1.ReportStatus.Builder,
            com.google.cloud.channel.v1.ReportStatusOrBuilder>
        getReportStatusFieldBuilder() {
      if (reportStatusBuilder_ == null) {
        reportStatusBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.ReportStatus,
                com.google.cloud.channel.v1.ReportStatus.Builder,
                com.google.cloud.channel.v1.ReportStatusOrBuilder>(
                getReportStatus(), getParentForChildren(), isClean());
        reportStatus_ = null;
      }
      return reportStatusBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ReportJob)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ReportJob)
  private static final com.google.cloud.channel.v1.ReportJob DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ReportJob();
  }

  public static com.google.cloud.channel.v1.ReportJob getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportJob> PARSER =
      new com.google.protobuf.AbstractParser<ReportJob>() {
        @java.lang.Override
        public ReportJob parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ReportJob> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportJob> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ReportJob getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
