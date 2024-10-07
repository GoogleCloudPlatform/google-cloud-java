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
// source: google/monitoring/v3/common.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * Describes a time interval:
 *
 *   * Reads: A half-open time interval. It includes the end time but
 *     excludes the start time: `(startTime, endTime]`. The start time
 *     must be specified, must be earlier than the end time, and should be
 *     no older than the data retention period for the metric.
 *   * Writes: A closed time interval. It extends from the start time to the end
 *   time,
 *     and includes both: `[startTime, endTime]`. Valid time intervals
 *     depend on the
 *     [`MetricKind`](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors#MetricKind)
 *     of the metric value. The end time must not be earlier than the start
 *     time, and the end time must not be more than 25 hours in the past or more
 *     than five minutes in the future.
 *     * For `GAUGE` metrics, the `startTime` value is technically optional; if
 *       no value is specified, the start time defaults to the value of the
 *       end time, and the interval represents a single point in time. If both
 *       start and end times are specified, they must be identical. Such an
 *       interval is valid only for `GAUGE` metrics, which are point-in-time
 *       measurements. The end time of a new interval must be at least a
 *       millisecond after the end time of the previous interval.
 *     * For `DELTA` metrics, the start time and end time must specify a
 *       non-zero interval, with subsequent points specifying contiguous and
 *       non-overlapping intervals. For `DELTA` metrics, the start time of
 *       the next interval must be at least a millisecond after the end time
 *       of the previous interval.
 *     * For `CUMULATIVE` metrics, the start time and end time must specify a
 *       non-zero interval, with subsequent points specifying the same
 *       start time and increasing end times, until an event resets the
 *       cumulative value to zero and sets a new start time for the following
 *       points. The new start time must be at least a millisecond after the
 *       end time of the previous interval.
 *     * The start time of a new interval must be at least a millisecond after
 *     the
 *       end time of the previous interval because intervals are closed. If the
 *       start time of a new interval is the same as the end time of the
 *       previous interval, then data written at the new start time could
 *       overwrite data written at the previous end time.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.TimeInterval}
 */
public final class TimeInterval extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.TimeInterval)
    TimeIntervalOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TimeInterval.newBuilder() to construct.
  private TimeInterval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TimeInterval() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TimeInterval();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.CommonProto
        .internal_static_google_monitoring_v3_TimeInterval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.CommonProto
        .internal_static_google_monitoring_v3_TimeInterval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.TimeInterval.class,
            com.google.monitoring.v3.TimeInterval.Builder.class);
  }

  private int bitField0_;
  public static final int END_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp endTime_;
  /**
   *
   *
   * <pre>
   * Required. The end of the time interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  @java.lang.Override
  public boolean hasEndTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The end of the time interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndTime() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }
  /**
   *
   *
   * <pre>
   * Required. The end of the time interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }

  public static final int START_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp startTime_;
  /**
   *
   *
   * <pre>
   * Optional. The beginning of the time interval.  The default value
   * for the start time is the end time. The start time must not be
   * later than the end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The beginning of the time interval.  The default value
   * for the start time is the end time. The start time must not be
   * later than the end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The beginning of the time interval.  The default value
   * for the start time is the end time. The start time must not be
   * later than the end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(1, getStartTime());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEndTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStartTime());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEndTime());
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
    if (!(obj instanceof com.google.monitoring.v3.TimeInterval)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.TimeInterval other = (com.google.monitoring.v3.TimeInterval) obj;

    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime().equals(other.getEndTime())) return false;
    }
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
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
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TimeInterval parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.TimeInterval prototype) {
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
   * Describes a time interval:
   *
   *   * Reads: A half-open time interval. It includes the end time but
   *     excludes the start time: `(startTime, endTime]`. The start time
   *     must be specified, must be earlier than the end time, and should be
   *     no older than the data retention period for the metric.
   *   * Writes: A closed time interval. It extends from the start time to the end
   *   time,
   *     and includes both: `[startTime, endTime]`. Valid time intervals
   *     depend on the
   *     [`MetricKind`](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors#MetricKind)
   *     of the metric value. The end time must not be earlier than the start
   *     time, and the end time must not be more than 25 hours in the past or more
   *     than five minutes in the future.
   *     * For `GAUGE` metrics, the `startTime` value is technically optional; if
   *       no value is specified, the start time defaults to the value of the
   *       end time, and the interval represents a single point in time. If both
   *       start and end times are specified, they must be identical. Such an
   *       interval is valid only for `GAUGE` metrics, which are point-in-time
   *       measurements. The end time of a new interval must be at least a
   *       millisecond after the end time of the previous interval.
   *     * For `DELTA` metrics, the start time and end time must specify a
   *       non-zero interval, with subsequent points specifying contiguous and
   *       non-overlapping intervals. For `DELTA` metrics, the start time of
   *       the next interval must be at least a millisecond after the end time
   *       of the previous interval.
   *     * For `CUMULATIVE` metrics, the start time and end time must specify a
   *       non-zero interval, with subsequent points specifying the same
   *       start time and increasing end times, until an event resets the
   *       cumulative value to zero and sets a new start time for the following
   *       points. The new start time must be at least a millisecond after the
   *       end time of the previous interval.
   *     * The start time of a new interval must be at least a millisecond after
   *     the
   *       end time of the previous interval because intervals are closed. If the
   *       start time of a new interval is the same as the end time of the
   *       previous interval, then data written at the new start time could
   *       overwrite data written at the previous end time.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.TimeInterval}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.TimeInterval)
      com.google.monitoring.v3.TimeIntervalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.CommonProto
          .internal_static_google_monitoring_v3_TimeInterval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.CommonProto
          .internal_static_google_monitoring_v3_TimeInterval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.TimeInterval.class,
              com.google.monitoring.v3.TimeInterval.Builder.class);
    }

    // Construct using com.google.monitoring.v3.TimeInterval.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEndTimeFieldBuilder();
        getStartTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.CommonProto
          .internal_static_google_monitoring_v3_TimeInterval_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.TimeInterval getDefaultInstanceForType() {
      return com.google.monitoring.v3.TimeInterval.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.TimeInterval build() {
      com.google.monitoring.v3.TimeInterval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.TimeInterval buildPartial() {
      com.google.monitoring.v3.TimeInterval result =
          new com.google.monitoring.v3.TimeInterval(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.v3.TimeInterval result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endTime_ = endTimeBuilder_ == null ? endTime_ : endTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startTime_ = startTimeBuilder_ == null ? startTime_ : startTimeBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.monitoring.v3.TimeInterval) {
        return mergeFrom((com.google.monitoring.v3.TimeInterval) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.TimeInterval other) {
      if (other == com.google.monitoring.v3.TimeInterval.getDefaultInstance()) return this;
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
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
                input.readMessage(getStartTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEndTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.protobuf.Timestamp endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        endTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     *
     * @return Whether the endTime field is set.
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     *
     * @return The endTime.
     */
    public com.google.protobuf.Timestamp getEndTime() {
      if (endTimeBuilder_ == null) {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      } else {
        return endTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTime_ = value;
      } else {
        endTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && endTime_ != null
            && endTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getEndTimeBuilder().mergeFrom(value);
        } else {
          endTime_ = value;
        }
      } else {
        endTimeBuilder_.mergeFrom(value);
      }
      if (endTime_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder clearEndTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
      if (endTimeBuilder_ != null) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        endTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getEndTime(), getParentForChildren(), isClean());
        endTime_ = null;
      }
      return endTimeBuilder_;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        startTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     *
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     *
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
      } else {
        startTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && startTime_ != null
            && startTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStartTimeBuilder().mergeFrom(value);
        } else {
          startTime_ = value;
        }
      } else {
        startTimeBuilder_.mergeFrom(value);
      }
      if (startTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStartTime(), getParentForChildren(), isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.TimeInterval)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.TimeInterval)
  private static final com.google.monitoring.v3.TimeInterval DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.TimeInterval();
  }

  public static com.google.monitoring.v3.TimeInterval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeInterval> PARSER =
      new com.google.protobuf.AbstractParser<TimeInterval>() {
        @java.lang.Override
        public TimeInterval parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimeInterval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeInterval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.TimeInterval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
