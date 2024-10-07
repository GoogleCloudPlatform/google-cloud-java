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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.LicenseResourceRequirements}
 */
public final class LicenseResourceRequirements extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.LicenseResourceRequirements)
    LicenseResourceRequirementsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LicenseResourceRequirements.newBuilder() to construct.
  private LicenseResourceRequirements(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LicenseResourceRequirements() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LicenseResourceRequirements();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_LicenseResourceRequirements_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_LicenseResourceRequirements_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.LicenseResourceRequirements.class,
            com.google.cloud.compute.v1.LicenseResourceRequirements.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_GUEST_CPU_COUNT_FIELD_NUMBER = 477964836;
  private int minGuestCpuCount_ = 0;
  /**
   *
   *
   * <pre>
   * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
   * </pre>
   *
   * <code>optional int32 min_guest_cpu_count = 477964836;</code>
   *
   * @return Whether the minGuestCpuCount field is set.
   */
  @java.lang.Override
  public boolean hasMinGuestCpuCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
   * </pre>
   *
   * <code>optional int32 min_guest_cpu_count = 477964836;</code>
   *
   * @return The minGuestCpuCount.
   */
  @java.lang.Override
  public int getMinGuestCpuCount() {
    return minGuestCpuCount_;
  }

  public static final int MIN_MEMORY_MB_FIELD_NUMBER = 504785894;
  private int minMemoryMb_ = 0;
  /**
   *
   *
   * <pre>
   * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
   * </pre>
   *
   * <code>optional int32 min_memory_mb = 504785894;</code>
   *
   * @return Whether the minMemoryMb field is set.
   */
  @java.lang.Override
  public boolean hasMinMemoryMb() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
   * </pre>
   *
   * <code>optional int32 min_memory_mb = 504785894;</code>
   *
   * @return The minMemoryMb.
   */
  @java.lang.Override
  public int getMinMemoryMb() {
    return minMemoryMb_;
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
      output.writeInt32(477964836, minGuestCpuCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(504785894, minMemoryMb_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(477964836, minGuestCpuCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(504785894, minMemoryMb_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.LicenseResourceRequirements)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.LicenseResourceRequirements other =
        (com.google.cloud.compute.v1.LicenseResourceRequirements) obj;

    if (hasMinGuestCpuCount() != other.hasMinGuestCpuCount()) return false;
    if (hasMinGuestCpuCount()) {
      if (getMinGuestCpuCount() != other.getMinGuestCpuCount()) return false;
    }
    if (hasMinMemoryMb() != other.hasMinMemoryMb()) return false;
    if (hasMinMemoryMb()) {
      if (getMinMemoryMb() != other.getMinMemoryMb()) return false;
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
    if (hasMinGuestCpuCount()) {
      hash = (37 * hash) + MIN_GUEST_CPU_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMinGuestCpuCount();
    }
    if (hasMinMemoryMb()) {
      hash = (37 * hash) + MIN_MEMORY_MB_FIELD_NUMBER;
      hash = (53 * hash) + getMinMemoryMb();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements parseFrom(
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
      com.google.cloud.compute.v1.LicenseResourceRequirements prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.LicenseResourceRequirements}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.LicenseResourceRequirements)
      com.google.cloud.compute.v1.LicenseResourceRequirementsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LicenseResourceRequirements_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LicenseResourceRequirements_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.LicenseResourceRequirements.class,
              com.google.cloud.compute.v1.LicenseResourceRequirements.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.LicenseResourceRequirements.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      minGuestCpuCount_ = 0;
      minMemoryMb_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LicenseResourceRequirements_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LicenseResourceRequirements getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.LicenseResourceRequirements.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LicenseResourceRequirements build() {
      com.google.cloud.compute.v1.LicenseResourceRequirements result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LicenseResourceRequirements buildPartial() {
      com.google.cloud.compute.v1.LicenseResourceRequirements result =
          new com.google.cloud.compute.v1.LicenseResourceRequirements(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.LicenseResourceRequirements result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minGuestCpuCount_ = minGuestCpuCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minMemoryMb_ = minMemoryMb_;
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
      if (other instanceof com.google.cloud.compute.v1.LicenseResourceRequirements) {
        return mergeFrom((com.google.cloud.compute.v1.LicenseResourceRequirements) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.LicenseResourceRequirements other) {
      if (other == com.google.cloud.compute.v1.LicenseResourceRequirements.getDefaultInstance())
        return this;
      if (other.hasMinGuestCpuCount()) {
        setMinGuestCpuCount(other.getMinGuestCpuCount());
      }
      if (other.hasMinMemoryMb()) {
        setMinMemoryMb(other.getMinMemoryMb());
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
            case -471248608:
              {
                minGuestCpuCount_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case -471248608
            case -256680144:
              {
                minMemoryMb_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case -256680144
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

    private int minGuestCpuCount_;
    /**
     *
     *
     * <pre>
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * </pre>
     *
     * <code>optional int32 min_guest_cpu_count = 477964836;</code>
     *
     * @return Whether the minGuestCpuCount field is set.
     */
    @java.lang.Override
    public boolean hasMinGuestCpuCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * </pre>
     *
     * <code>optional int32 min_guest_cpu_count = 477964836;</code>
     *
     * @return The minGuestCpuCount.
     */
    @java.lang.Override
    public int getMinGuestCpuCount() {
      return minGuestCpuCount_;
    }
    /**
     *
     *
     * <pre>
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * </pre>
     *
     * <code>optional int32 min_guest_cpu_count = 477964836;</code>
     *
     * @param value The minGuestCpuCount to set.
     * @return This builder for chaining.
     */
    public Builder setMinGuestCpuCount(int value) {

      minGuestCpuCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * </pre>
     *
     * <code>optional int32 min_guest_cpu_count = 477964836;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinGuestCpuCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minGuestCpuCount_ = 0;
      onChanged();
      return this;
    }

    private int minMemoryMb_;
    /**
     *
     *
     * <pre>
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * </pre>
     *
     * <code>optional int32 min_memory_mb = 504785894;</code>
     *
     * @return Whether the minMemoryMb field is set.
     */
    @java.lang.Override
    public boolean hasMinMemoryMb() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * </pre>
     *
     * <code>optional int32 min_memory_mb = 504785894;</code>
     *
     * @return The minMemoryMb.
     */
    @java.lang.Override
    public int getMinMemoryMb() {
      return minMemoryMb_;
    }
    /**
     *
     *
     * <pre>
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * </pre>
     *
     * <code>optional int32 min_memory_mb = 504785894;</code>
     *
     * @param value The minMemoryMb to set.
     * @return This builder for chaining.
     */
    public Builder setMinMemoryMb(int value) {

      minMemoryMb_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * </pre>
     *
     * <code>optional int32 min_memory_mb = 504785894;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinMemoryMb() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minMemoryMb_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.LicenseResourceRequirements)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.LicenseResourceRequirements)
  private static final com.google.cloud.compute.v1.LicenseResourceRequirements DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.LicenseResourceRequirements();
  }

  public static com.google.cloud.compute.v1.LicenseResourceRequirements getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LicenseResourceRequirements> PARSER =
      new com.google.protobuf.AbstractParser<LicenseResourceRequirements>() {
        @java.lang.Override
        public LicenseResourceRequirements parsePartialFrom(
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

  public static com.google.protobuf.Parser<LicenseResourceRequirements> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LicenseResourceRequirements> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.LicenseResourceRequirements getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
