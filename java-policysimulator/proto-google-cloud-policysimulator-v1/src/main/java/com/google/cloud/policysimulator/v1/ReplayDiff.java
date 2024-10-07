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
// source: google/cloud/policysimulator/v1/simulator.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.policysimulator.v1;

/**
 *
 *
 * <pre>
 * The difference between the results of evaluating an access tuple under
 * the current (baseline) policies and under the proposed (simulated) policies.
 * This difference explains how a principal's access could change if the
 * proposed policies were applied.
 * </pre>
 *
 * Protobuf type {@code google.cloud.policysimulator.v1.ReplayDiff}
 */
public final class ReplayDiff extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.policysimulator.v1.ReplayDiff)
    ReplayDiffOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReplayDiff.newBuilder() to construct.
  private ReplayDiff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReplayDiff() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReplayDiff();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.policysimulator.v1.SimulatorProto
        .internal_static_google_cloud_policysimulator_v1_ReplayDiff_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.policysimulator.v1.SimulatorProto
        .internal_static_google_cloud_policysimulator_v1_ReplayDiff_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.policysimulator.v1.ReplayDiff.class,
            com.google.cloud.policysimulator.v1.ReplayDiff.Builder.class);
  }

  private int bitField0_;
  public static final int ACCESS_DIFF_FIELD_NUMBER = 2;
  private com.google.cloud.policysimulator.v1.AccessStateDiff accessDiff_;
  /**
   *
   *
   * <pre>
   * A summary and comparison of the principal's access under the current
   * (baseline) policies and the proposed (simulated) policies for a single
   * access tuple.
   *
   * The evaluation of the principal's access is reported in the
   * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
   * </pre>
   *
   * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
   *
   * @return Whether the accessDiff field is set.
   */
  @java.lang.Override
  public boolean hasAccessDiff() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * A summary and comparison of the principal's access under the current
   * (baseline) policies and the proposed (simulated) policies for a single
   * access tuple.
   *
   * The evaluation of the principal's access is reported in the
   * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
   * </pre>
   *
   * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
   *
   * @return The accessDiff.
   */
  @java.lang.Override
  public com.google.cloud.policysimulator.v1.AccessStateDiff getAccessDiff() {
    return accessDiff_ == null
        ? com.google.cloud.policysimulator.v1.AccessStateDiff.getDefaultInstance()
        : accessDiff_;
  }
  /**
   *
   *
   * <pre>
   * A summary and comparison of the principal's access under the current
   * (baseline) policies and the proposed (simulated) policies for a single
   * access tuple.
   *
   * The evaluation of the principal's access is reported in the
   * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
   * </pre>
   *
   * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.policysimulator.v1.AccessStateDiffOrBuilder getAccessDiffOrBuilder() {
    return accessDiff_ == null
        ? com.google.cloud.policysimulator.v1.AccessStateDiff.getDefaultInstance()
        : accessDiff_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAccessDiff());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAccessDiff());
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
    if (!(obj instanceof com.google.cloud.policysimulator.v1.ReplayDiff)) {
      return super.equals(obj);
    }
    com.google.cloud.policysimulator.v1.ReplayDiff other =
        (com.google.cloud.policysimulator.v1.ReplayDiff) obj;

    if (hasAccessDiff() != other.hasAccessDiff()) return false;
    if (hasAccessDiff()) {
      if (!getAccessDiff().equals(other.getAccessDiff())) return false;
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
    if (hasAccessDiff()) {
      hash = (37 * hash) + ACCESS_DIFF_FIELD_NUMBER;
      hash = (53 * hash) + getAccessDiff().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff parseFrom(
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

  public static Builder newBuilder(com.google.cloud.policysimulator.v1.ReplayDiff prototype) {
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
   * The difference between the results of evaluating an access tuple under
   * the current (baseline) policies and under the proposed (simulated) policies.
   * This difference explains how a principal's access could change if the
   * proposed policies were applied.
   * </pre>
   *
   * Protobuf type {@code google.cloud.policysimulator.v1.ReplayDiff}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.policysimulator.v1.ReplayDiff)
      com.google.cloud.policysimulator.v1.ReplayDiffOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.policysimulator.v1.SimulatorProto
          .internal_static_google_cloud_policysimulator_v1_ReplayDiff_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.policysimulator.v1.SimulatorProto
          .internal_static_google_cloud_policysimulator_v1_ReplayDiff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.policysimulator.v1.ReplayDiff.class,
              com.google.cloud.policysimulator.v1.ReplayDiff.Builder.class);
    }

    // Construct using com.google.cloud.policysimulator.v1.ReplayDiff.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAccessDiffFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      accessDiff_ = null;
      if (accessDiffBuilder_ != null) {
        accessDiffBuilder_.dispose();
        accessDiffBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.policysimulator.v1.SimulatorProto
          .internal_static_google_cloud_policysimulator_v1_ReplayDiff_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.policysimulator.v1.ReplayDiff getDefaultInstanceForType() {
      return com.google.cloud.policysimulator.v1.ReplayDiff.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.policysimulator.v1.ReplayDiff build() {
      com.google.cloud.policysimulator.v1.ReplayDiff result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.policysimulator.v1.ReplayDiff buildPartial() {
      com.google.cloud.policysimulator.v1.ReplayDiff result =
          new com.google.cloud.policysimulator.v1.ReplayDiff(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.policysimulator.v1.ReplayDiff result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessDiff_ = accessDiffBuilder_ == null ? accessDiff_ : accessDiffBuilder_.build();
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
      if (other instanceof com.google.cloud.policysimulator.v1.ReplayDiff) {
        return mergeFrom((com.google.cloud.policysimulator.v1.ReplayDiff) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.policysimulator.v1.ReplayDiff other) {
      if (other == com.google.cloud.policysimulator.v1.ReplayDiff.getDefaultInstance()) return this;
      if (other.hasAccessDiff()) {
        mergeAccessDiff(other.getAccessDiff());
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
            case 18:
              {
                input.readMessage(getAccessDiffFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.policysimulator.v1.AccessStateDiff accessDiff_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.policysimulator.v1.AccessStateDiff,
            com.google.cloud.policysimulator.v1.AccessStateDiff.Builder,
            com.google.cloud.policysimulator.v1.AccessStateDiffOrBuilder>
        accessDiffBuilder_;
    /**
     *
     *
     * <pre>
     * A summary and comparison of the principal's access under the current
     * (baseline) policies and the proposed (simulated) policies for a single
     * access tuple.
     *
     * The evaluation of the principal's access is reported in the
     * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
     * </pre>
     *
     * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
     *
     * @return Whether the accessDiff field is set.
     */
    public boolean hasAccessDiff() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * A summary and comparison of the principal's access under the current
     * (baseline) policies and the proposed (simulated) policies for a single
     * access tuple.
     *
     * The evaluation of the principal's access is reported in the
     * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
     * </pre>
     *
     * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
     *
     * @return The accessDiff.
     */
    public com.google.cloud.policysimulator.v1.AccessStateDiff getAccessDiff() {
      if (accessDiffBuilder_ == null) {
        return accessDiff_ == null
            ? com.google.cloud.policysimulator.v1.AccessStateDiff.getDefaultInstance()
            : accessDiff_;
      } else {
        return accessDiffBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A summary and comparison of the principal's access under the current
     * (baseline) policies and the proposed (simulated) policies for a single
     * access tuple.
     *
     * The evaluation of the principal's access is reported in the
     * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
     * </pre>
     *
     * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
     */
    public Builder setAccessDiff(com.google.cloud.policysimulator.v1.AccessStateDiff value) {
      if (accessDiffBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessDiff_ = value;
      } else {
        accessDiffBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A summary and comparison of the principal's access under the current
     * (baseline) policies and the proposed (simulated) policies for a single
     * access tuple.
     *
     * The evaluation of the principal's access is reported in the
     * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
     * </pre>
     *
     * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
     */
    public Builder setAccessDiff(
        com.google.cloud.policysimulator.v1.AccessStateDiff.Builder builderForValue) {
      if (accessDiffBuilder_ == null) {
        accessDiff_ = builderForValue.build();
      } else {
        accessDiffBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A summary and comparison of the principal's access under the current
     * (baseline) policies and the proposed (simulated) policies for a single
     * access tuple.
     *
     * The evaluation of the principal's access is reported in the
     * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
     * </pre>
     *
     * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
     */
    public Builder mergeAccessDiff(com.google.cloud.policysimulator.v1.AccessStateDiff value) {
      if (accessDiffBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && accessDiff_ != null
            && accessDiff_
                != com.google.cloud.policysimulator.v1.AccessStateDiff.getDefaultInstance()) {
          getAccessDiffBuilder().mergeFrom(value);
        } else {
          accessDiff_ = value;
        }
      } else {
        accessDiffBuilder_.mergeFrom(value);
      }
      if (accessDiff_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A summary and comparison of the principal's access under the current
     * (baseline) policies and the proposed (simulated) policies for a single
     * access tuple.
     *
     * The evaluation of the principal's access is reported in the
     * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
     * </pre>
     *
     * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
     */
    public Builder clearAccessDiff() {
      bitField0_ = (bitField0_ & ~0x00000001);
      accessDiff_ = null;
      if (accessDiffBuilder_ != null) {
        accessDiffBuilder_.dispose();
        accessDiffBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A summary and comparison of the principal's access under the current
     * (baseline) policies and the proposed (simulated) policies for a single
     * access tuple.
     *
     * The evaluation of the principal's access is reported in the
     * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
     * </pre>
     *
     * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
     */
    public com.google.cloud.policysimulator.v1.AccessStateDiff.Builder getAccessDiffBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccessDiffFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A summary and comparison of the principal's access under the current
     * (baseline) policies and the proposed (simulated) policies for a single
     * access tuple.
     *
     * The evaluation of the principal's access is reported in the
     * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
     * </pre>
     *
     * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
     */
    public com.google.cloud.policysimulator.v1.AccessStateDiffOrBuilder getAccessDiffOrBuilder() {
      if (accessDiffBuilder_ != null) {
        return accessDiffBuilder_.getMessageOrBuilder();
      } else {
        return accessDiff_ == null
            ? com.google.cloud.policysimulator.v1.AccessStateDiff.getDefaultInstance()
            : accessDiff_;
      }
    }
    /**
     *
     *
     * <pre>
     * A summary and comparison of the principal's access under the current
     * (baseline) policies and the proposed (simulated) policies for a single
     * access tuple.
     *
     * The evaluation of the principal's access is reported in the
     * [AccessState][google.cloud.policysimulator.v1.AccessState] field.
     * </pre>
     *
     * <code>.google.cloud.policysimulator.v1.AccessStateDiff access_diff = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.policysimulator.v1.AccessStateDiff,
            com.google.cloud.policysimulator.v1.AccessStateDiff.Builder,
            com.google.cloud.policysimulator.v1.AccessStateDiffOrBuilder>
        getAccessDiffFieldBuilder() {
      if (accessDiffBuilder_ == null) {
        accessDiffBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.policysimulator.v1.AccessStateDiff,
                com.google.cloud.policysimulator.v1.AccessStateDiff.Builder,
                com.google.cloud.policysimulator.v1.AccessStateDiffOrBuilder>(
                getAccessDiff(), getParentForChildren(), isClean());
        accessDiff_ = null;
      }
      return accessDiffBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.policysimulator.v1.ReplayDiff)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.policysimulator.v1.ReplayDiff)
  private static final com.google.cloud.policysimulator.v1.ReplayDiff DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.policysimulator.v1.ReplayDiff();
  }

  public static com.google.cloud.policysimulator.v1.ReplayDiff getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplayDiff> PARSER =
      new com.google.protobuf.AbstractParser<ReplayDiff>() {
        @java.lang.Override
        public ReplayDiff parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReplayDiff> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplayDiff> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.policysimulator.v1.ReplayDiff getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
