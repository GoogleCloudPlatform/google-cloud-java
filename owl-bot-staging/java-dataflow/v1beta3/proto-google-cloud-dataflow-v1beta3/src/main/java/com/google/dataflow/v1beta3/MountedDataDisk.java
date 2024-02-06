// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

/**
 * <pre>
 * Describes mounted data disk.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.MountedDataDisk}
 */
public final class MountedDataDisk extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.MountedDataDisk)
    MountedDataDiskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MountedDataDisk.newBuilder() to construct.
  private MountedDataDisk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MountedDataDisk() {
    dataDisk_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MountedDataDisk();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_MountedDataDisk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_MountedDataDisk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.MountedDataDisk.class, com.google.dataflow.v1beta3.MountedDataDisk.Builder.class);
  }

  public static final int DATA_DISK_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dataDisk_ = "";
  /**
   * <pre>
   * The name of the data disk.
   * This name is local to the Google Cloud Platform project and uniquely
   * identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * </pre>
   *
   * <code>string data_disk = 1;</code>
   * @return The dataDisk.
   */
  @java.lang.Override
  public java.lang.String getDataDisk() {
    java.lang.Object ref = dataDisk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataDisk_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the data disk.
   * This name is local to the Google Cloud Platform project and uniquely
   * identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * </pre>
   *
   * <code>string data_disk = 1;</code>
   * @return The bytes for dataDisk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataDiskBytes() {
    java.lang.Object ref = dataDisk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataDisk_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataDisk_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataDisk_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataDisk_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dataDisk_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.MountedDataDisk)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.MountedDataDisk other = (com.google.dataflow.v1beta3.MountedDataDisk) obj;

    if (!getDataDisk()
        .equals(other.getDataDisk())) return false;
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
    hash = (37 * hash) + DATA_DISK_FIELD_NUMBER;
    hash = (53 * hash) + getDataDisk().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.MountedDataDisk parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.MountedDataDisk parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.MountedDataDisk parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.dataflow.v1beta3.MountedDataDisk prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Describes mounted data disk.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.MountedDataDisk}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.MountedDataDisk)
      com.google.dataflow.v1beta3.MountedDataDiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_MountedDataDisk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_MountedDataDisk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.MountedDataDisk.class, com.google.dataflow.v1beta3.MountedDataDisk.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.MountedDataDisk.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataDisk_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_MountedDataDisk_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.MountedDataDisk getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.MountedDataDisk.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.MountedDataDisk build() {
      com.google.dataflow.v1beta3.MountedDataDisk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.MountedDataDisk buildPartial() {
      com.google.dataflow.v1beta3.MountedDataDisk result = new com.google.dataflow.v1beta3.MountedDataDisk(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.MountedDataDisk result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataDisk_ = dataDisk_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.dataflow.v1beta3.MountedDataDisk) {
        return mergeFrom((com.google.dataflow.v1beta3.MountedDataDisk)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.MountedDataDisk other) {
      if (other == com.google.dataflow.v1beta3.MountedDataDisk.getDefaultInstance()) return this;
      if (!other.getDataDisk().isEmpty()) {
        dataDisk_ = other.dataDisk_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              dataDisk_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
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

    private java.lang.Object dataDisk_ = "";
    /**
     * <pre>
     * The name of the data disk.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 1;</code>
     * @return The dataDisk.
     */
    public java.lang.String getDataDisk() {
      java.lang.Object ref = dataDisk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataDisk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the data disk.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 1;</code>
     * @return The bytes for dataDisk.
     */
    public com.google.protobuf.ByteString
        getDataDiskBytes() {
      java.lang.Object ref = dataDisk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataDisk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the data disk.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 1;</code>
     * @param value The dataDisk to set.
     * @return This builder for chaining.
     */
    public Builder setDataDisk(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataDisk_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the data disk.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataDisk() {
      dataDisk_ = getDefaultInstance().getDataDisk();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the data disk.
     * This name is local to the Google Cloud Platform project and uniquely
     * identifies the disk within that project, for example
     * "myproject-1014-104817-4c2-harness-0-disk-1".
     * </pre>
     *
     * <code>string data_disk = 1;</code>
     * @param value The bytes for dataDisk to set.
     * @return This builder for chaining.
     */
    public Builder setDataDiskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataDisk_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.MountedDataDisk)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.MountedDataDisk)
  private static final com.google.dataflow.v1beta3.MountedDataDisk DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.MountedDataDisk();
  }

  public static com.google.dataflow.v1beta3.MountedDataDisk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MountedDataDisk>
      PARSER = new com.google.protobuf.AbstractParser<MountedDataDisk>() {
    @java.lang.Override
    public MountedDataDisk parsePartialFrom(
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

  public static com.google.protobuf.Parser<MountedDataDisk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MountedDataDisk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.MountedDataDisk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

