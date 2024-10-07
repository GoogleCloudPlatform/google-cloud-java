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
// source: google/analytics/data/v1beta/analytics_data_api.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.data.v1beta;

/**
 *
 *
 * <pre>
 * The batch response containing multiple pivot reports.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1beta.BatchRunPivotReportsResponse}
 */
public final class BatchRunPivotReportsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1beta.BatchRunPivotReportsResponse)
    BatchRunPivotReportsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchRunPivotReportsResponse.newBuilder() to construct.
  private BatchRunPivotReportsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchRunPivotReportsResponse() {
    pivotReports_ = java.util.Collections.emptyList();
    kind_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchRunPivotReportsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1beta.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1beta.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1beta.BatchRunPivotReportsResponse.class,
            com.google.analytics.data.v1beta.BatchRunPivotReportsResponse.Builder.class);
  }

  public static final int PIVOT_REPORTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.data.v1beta.RunPivotReportResponse> pivotReports_;
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1beta.RunPivotReportResponse>
      getPivotReportsList() {
    return pivotReports_;
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1beta.RunPivotReportResponseOrBuilder>
      getPivotReportsOrBuilderList() {
    return pivotReports_;
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public int getPivotReportsCount() {
    return pivotReports_.size();
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1beta.RunPivotReportResponse getPivotReports(int index) {
    return pivotReports_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1beta.RunPivotReportResponseOrBuilder getPivotReportsOrBuilder(
      int index) {
    return pivotReports_.get(index);
  }

  public static final int KIND_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";
  /**
   *
   *
   * <pre>
   * Identifies what kind of resource this message is. This `kind` is always the
   * fixed string "analyticsData#batchRunPivotReports". Useful to distinguish
   * between response types in JSON.
   * </pre>
   *
   * <code>string kind = 2;</code>
   *
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Identifies what kind of resource this message is. This `kind` is always the
   * fixed string "analyticsData#batchRunPivotReports". Useful to distinguish
   * between response types in JSON.
   * </pre>
   *
   * <code>string kind = 2;</code>
   *
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < pivotReports_.size(); i++) {
      output.writeMessage(1, pivotReports_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kind_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < pivotReports_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, pivotReports_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kind_);
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
    if (!(obj instanceof com.google.analytics.data.v1beta.BatchRunPivotReportsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1beta.BatchRunPivotReportsResponse other =
        (com.google.analytics.data.v1beta.BatchRunPivotReportsResponse) obj;

    if (!getPivotReportsList().equals(other.getPivotReportsList())) return false;
    if (!getKind().equals(other.getKind())) return false;
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
    if (getPivotReportsCount() > 0) {
      hash = (37 * hash) + PIVOT_REPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getPivotReportsList().hashCode();
    }
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.analytics.data.v1beta.BatchRunPivotReportsResponse prototype) {
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
   * The batch response containing multiple pivot reports.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1beta.BatchRunPivotReportsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1beta.BatchRunPivotReportsResponse)
      com.google.analytics.data.v1beta.BatchRunPivotReportsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1beta.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1beta.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1beta.BatchRunPivotReportsResponse.class,
              com.google.analytics.data.v1beta.BatchRunPivotReportsResponse.Builder.class);
    }

    // Construct using com.google.analytics.data.v1beta.BatchRunPivotReportsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (pivotReportsBuilder_ == null) {
        pivotReports_ = java.util.Collections.emptyList();
      } else {
        pivotReports_ = null;
        pivotReportsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1beta.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.BatchRunPivotReportsResponse
        getDefaultInstanceForType() {
      return com.google.analytics.data.v1beta.BatchRunPivotReportsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.BatchRunPivotReportsResponse build() {
      com.google.analytics.data.v1beta.BatchRunPivotReportsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.BatchRunPivotReportsResponse buildPartial() {
      com.google.analytics.data.v1beta.BatchRunPivotReportsResponse result =
          new com.google.analytics.data.v1beta.BatchRunPivotReportsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.analytics.data.v1beta.BatchRunPivotReportsResponse result) {
      if (pivotReportsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pivotReports_ = java.util.Collections.unmodifiableList(pivotReports_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pivotReports_ = pivotReports_;
      } else {
        result.pivotReports_ = pivotReportsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.analytics.data.v1beta.BatchRunPivotReportsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.kind_ = kind_;
      }
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
      if (other instanceof com.google.analytics.data.v1beta.BatchRunPivotReportsResponse) {
        return mergeFrom((com.google.analytics.data.v1beta.BatchRunPivotReportsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1beta.BatchRunPivotReportsResponse other) {
      if (other
          == com.google.analytics.data.v1beta.BatchRunPivotReportsResponse.getDefaultInstance())
        return this;
      if (pivotReportsBuilder_ == null) {
        if (!other.pivotReports_.isEmpty()) {
          if (pivotReports_.isEmpty()) {
            pivotReports_ = other.pivotReports_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePivotReportsIsMutable();
            pivotReports_.addAll(other.pivotReports_);
          }
          onChanged();
        }
      } else {
        if (!other.pivotReports_.isEmpty()) {
          if (pivotReportsBuilder_.isEmpty()) {
            pivotReportsBuilder_.dispose();
            pivotReportsBuilder_ = null;
            pivotReports_ = other.pivotReports_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pivotReportsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPivotReportsFieldBuilder()
                    : null;
          } else {
            pivotReportsBuilder_.addAllMessages(other.pivotReports_);
          }
        }
      }
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                com.google.analytics.data.v1beta.RunPivotReportResponse m =
                    input.readMessage(
                        com.google.analytics.data.v1beta.RunPivotReportResponse.parser(),
                        extensionRegistry);
                if (pivotReportsBuilder_ == null) {
                  ensurePivotReportsIsMutable();
                  pivotReports_.add(m);
                } else {
                  pivotReportsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                kind_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.analytics.data.v1beta.RunPivotReportResponse> pivotReports_ =
        java.util.Collections.emptyList();

    private void ensurePivotReportsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pivotReports_ =
            new java.util.ArrayList<com.google.analytics.data.v1beta.RunPivotReportResponse>(
                pivotReports_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1beta.RunPivotReportResponse,
            com.google.analytics.data.v1beta.RunPivotReportResponse.Builder,
            com.google.analytics.data.v1beta.RunPivotReportResponseOrBuilder>
        pivotReportsBuilder_;

    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1beta.RunPivotReportResponse>
        getPivotReportsList() {
      if (pivotReportsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pivotReports_);
      } else {
        return pivotReportsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public int getPivotReportsCount() {
      if (pivotReportsBuilder_ == null) {
        return pivotReports_.size();
      } else {
        return pivotReportsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunPivotReportResponse getPivotReports(int index) {
      if (pivotReportsBuilder_ == null) {
        return pivotReports_.get(index);
      } else {
        return pivotReportsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public Builder setPivotReports(
        int index, com.google.analytics.data.v1beta.RunPivotReportResponse value) {
      if (pivotReportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotReportsIsMutable();
        pivotReports_.set(index, value);
        onChanged();
      } else {
        pivotReportsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public Builder setPivotReports(
        int index,
        com.google.analytics.data.v1beta.RunPivotReportResponse.Builder builderForValue) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        pivotReports_.set(index, builderForValue.build());
        onChanged();
      } else {
        pivotReportsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public Builder addPivotReports(com.google.analytics.data.v1beta.RunPivotReportResponse value) {
      if (pivotReportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotReportsIsMutable();
        pivotReports_.add(value);
        onChanged();
      } else {
        pivotReportsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public Builder addPivotReports(
        int index, com.google.analytics.data.v1beta.RunPivotReportResponse value) {
      if (pivotReportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotReportsIsMutable();
        pivotReports_.add(index, value);
        onChanged();
      } else {
        pivotReportsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public Builder addPivotReports(
        com.google.analytics.data.v1beta.RunPivotReportResponse.Builder builderForValue) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        pivotReports_.add(builderForValue.build());
        onChanged();
      } else {
        pivotReportsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public Builder addPivotReports(
        int index,
        com.google.analytics.data.v1beta.RunPivotReportResponse.Builder builderForValue) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        pivotReports_.add(index, builderForValue.build());
        onChanged();
      } else {
        pivotReportsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public Builder addAllPivotReports(
        java.lang.Iterable<? extends com.google.analytics.data.v1beta.RunPivotReportResponse>
            values) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, pivotReports_);
        onChanged();
      } else {
        pivotReportsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public Builder clearPivotReports() {
      if (pivotReportsBuilder_ == null) {
        pivotReports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pivotReportsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public Builder removePivotReports(int index) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        pivotReports_.remove(index);
        onChanged();
      } else {
        pivotReportsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunPivotReportResponse.Builder getPivotReportsBuilder(
        int index) {
      return getPivotReportsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunPivotReportResponseOrBuilder
        getPivotReportsOrBuilder(int index) {
      if (pivotReportsBuilder_ == null) {
        return pivotReports_.get(index);
      } else {
        return pivotReportsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public java.util.List<
            ? extends com.google.analytics.data.v1beta.RunPivotReportResponseOrBuilder>
        getPivotReportsOrBuilderList() {
      if (pivotReportsBuilder_ != null) {
        return pivotReportsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pivotReports_);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunPivotReportResponse.Builder
        addPivotReportsBuilder() {
      return getPivotReportsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1beta.RunPivotReportResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunPivotReportResponse.Builder addPivotReportsBuilder(
        int index) {
      return getPivotReportsFieldBuilder()
          .addBuilder(
              index, com.google.analytics.data.v1beta.RunPivotReportResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunPivotReportResponse pivot_reports = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1beta.RunPivotReportResponse.Builder>
        getPivotReportsBuilderList() {
      return getPivotReportsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1beta.RunPivotReportResponse,
            com.google.analytics.data.v1beta.RunPivotReportResponse.Builder,
            com.google.analytics.data.v1beta.RunPivotReportResponseOrBuilder>
        getPivotReportsFieldBuilder() {
      if (pivotReportsBuilder_ == null) {
        pivotReportsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1beta.RunPivotReportResponse,
                com.google.analytics.data.v1beta.RunPivotReportResponse.Builder,
                com.google.analytics.data.v1beta.RunPivotReportResponseOrBuilder>(
                pivotReports_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        pivotReports_ = null;
      }
      return pivotReportsBuilder_;
    }

    private java.lang.Object kind_ = "";
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunPivotReports". Useful to distinguish
     * between response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunPivotReports". Useful to distinguish
     * between response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunPivotReports". Useful to distinguish
     * between response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kind_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunPivotReports". Useful to distinguish
     * between response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunPivotReports". Useful to distinguish
     * between response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      kind_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1beta.BatchRunPivotReportsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1beta.BatchRunPivotReportsResponse)
  private static final com.google.analytics.data.v1beta.BatchRunPivotReportsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1beta.BatchRunPivotReportsResponse();
  }

  public static com.google.analytics.data.v1beta.BatchRunPivotReportsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRunPivotReportsResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchRunPivotReportsResponse>() {
        @java.lang.Override
        public BatchRunPivotReportsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchRunPivotReportsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRunPivotReportsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1beta.BatchRunPivotReportsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
