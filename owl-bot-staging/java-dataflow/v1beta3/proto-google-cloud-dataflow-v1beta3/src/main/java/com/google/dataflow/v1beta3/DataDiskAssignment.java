// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

/**
 * <pre>
 * Data disk assignment for a given VM instance.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.DataDiskAssignment}
 */
public final class DataDiskAssignment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.DataDiskAssignment)
    DataDiskAssignmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataDiskAssignment.newBuilder() to construct.
  private DataDiskAssignment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataDiskAssignment() {
    vmInstance_ = "";
    dataDisks_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataDiskAssignment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_DataDiskAssignment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_DataDiskAssignment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.DataDiskAssignment.class, com.google.dataflow.v1beta3.DataDiskAssignment.Builder.class);
  }

  public static final int VM_INSTANCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object vmInstance_ = "";
  /**
   * <pre>
   * VM instance name the data disks mounted to, for example
   * "myproject-1014-104817-4c2-harness-0".
   * </pre>
   *
   * <code>string vm_instance = 1;</code>
   * @return The vmInstance.
   */
  @java.lang.Override
  public java.lang.String getVmInstance() {
    java.lang.Object ref = vmInstance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vmInstance_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * VM instance name the data disks mounted to, for example
   * "myproject-1014-104817-4c2-harness-0".
   * </pre>
   *
   * <code>string vm_instance = 1;</code>
   * @return The bytes for vmInstance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVmInstanceBytes() {
    java.lang.Object ref = vmInstance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vmInstance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_DISKS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList dataDisks_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Mounted data disks. The order is important a data disk's 0-based index in
   * this list defines which persistent directory the disk is mounted to, for
   * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
   * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
   * </pre>
   *
   * <code>repeated string data_disks = 2;</code>
   * @return A list containing the dataDisks.
   */
  public com.google.protobuf.ProtocolStringList
      getDataDisksList() {
    return dataDisks_;
  }
  /**
   * <pre>
   * Mounted data disks. The order is important a data disk's 0-based index in
   * this list defines which persistent directory the disk is mounted to, for
   * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
   * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
   * </pre>
   *
   * <code>repeated string data_disks = 2;</code>
   * @return The count of dataDisks.
   */
  public int getDataDisksCount() {
    return dataDisks_.size();
  }
  /**
   * <pre>
   * Mounted data disks. The order is important a data disk's 0-based index in
   * this list defines which persistent directory the disk is mounted to, for
   * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
   * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
   * </pre>
   *
   * <code>repeated string data_disks = 2;</code>
   * @param index The index of the element to return.
   * @return The dataDisks at the given index.
   */
  public java.lang.String getDataDisks(int index) {
    return dataDisks_.get(index);
  }
  /**
   * <pre>
   * Mounted data disks. The order is important a data disk's 0-based index in
   * this list defines which persistent directory the disk is mounted to, for
   * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
   * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
   * </pre>
   *
   * <code>repeated string data_disks = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dataDisks at the given index.
   */
  public com.google.protobuf.ByteString
      getDataDisksBytes(int index) {
    return dataDisks_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmInstance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vmInstance_);
    }
    for (int i = 0; i < dataDisks_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dataDisks_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmInstance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vmInstance_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dataDisks_.size(); i++) {
        dataSize += computeStringSizeNoTag(dataDisks_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDataDisksList().size();
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
    if (!(obj instanceof com.google.dataflow.v1beta3.DataDiskAssignment)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.DataDiskAssignment other = (com.google.dataflow.v1beta3.DataDiskAssignment) obj;

    if (!getVmInstance()
        .equals(other.getVmInstance())) return false;
    if (!getDataDisksList()
        .equals(other.getDataDisksList())) return false;
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
    hash = (37 * hash) + VM_INSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getVmInstance().hashCode();
    if (getDataDisksCount() > 0) {
      hash = (37 * hash) + DATA_DISKS_FIELD_NUMBER;
      hash = (53 * hash) + getDataDisksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.DataDiskAssignment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.DataDiskAssignment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.DataDiskAssignment parseFrom(
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
  public static Builder newBuilder(com.google.dataflow.v1beta3.DataDiskAssignment prototype) {
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
   * Data disk assignment for a given VM instance.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.DataDiskAssignment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.DataDiskAssignment)
      com.google.dataflow.v1beta3.DataDiskAssignmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_DataDiskAssignment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_DataDiskAssignment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.DataDiskAssignment.class, com.google.dataflow.v1beta3.DataDiskAssignment.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.DataDiskAssignment.newBuilder()
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
      vmInstance_ = "";
      dataDisks_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.dataflow.v1beta3.StreamingProto.internal_static_google_dataflow_v1beta3_DataDiskAssignment_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.DataDiskAssignment getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.DataDiskAssignment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.DataDiskAssignment build() {
      com.google.dataflow.v1beta3.DataDiskAssignment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.DataDiskAssignment buildPartial() {
      com.google.dataflow.v1beta3.DataDiskAssignment result = new com.google.dataflow.v1beta3.DataDiskAssignment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.DataDiskAssignment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vmInstance_ = vmInstance_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        dataDisks_.makeImmutable();
        result.dataDisks_ = dataDisks_;
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
      if (other instanceof com.google.dataflow.v1beta3.DataDiskAssignment) {
        return mergeFrom((com.google.dataflow.v1beta3.DataDiskAssignment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.DataDiskAssignment other) {
      if (other == com.google.dataflow.v1beta3.DataDiskAssignment.getDefaultInstance()) return this;
      if (!other.getVmInstance().isEmpty()) {
        vmInstance_ = other.vmInstance_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.dataDisks_.isEmpty()) {
        if (dataDisks_.isEmpty()) {
          dataDisks_ = other.dataDisks_;
          bitField0_ |= 0x00000002;
        } else {
          ensureDataDisksIsMutable();
          dataDisks_.addAll(other.dataDisks_);
        }
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
              vmInstance_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDataDisksIsMutable();
              dataDisks_.add(s);
              break;
            } // case 18
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

    private java.lang.Object vmInstance_ = "";
    /**
     * <pre>
     * VM instance name the data disks mounted to, for example
     * "myproject-1014-104817-4c2-harness-0".
     * </pre>
     *
     * <code>string vm_instance = 1;</code>
     * @return The vmInstance.
     */
    public java.lang.String getVmInstance() {
      java.lang.Object ref = vmInstance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vmInstance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * VM instance name the data disks mounted to, for example
     * "myproject-1014-104817-4c2-harness-0".
     * </pre>
     *
     * <code>string vm_instance = 1;</code>
     * @return The bytes for vmInstance.
     */
    public com.google.protobuf.ByteString
        getVmInstanceBytes() {
      java.lang.Object ref = vmInstance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vmInstance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * VM instance name the data disks mounted to, for example
     * "myproject-1014-104817-4c2-harness-0".
     * </pre>
     *
     * <code>string vm_instance = 1;</code>
     * @param value The vmInstance to set.
     * @return This builder for chaining.
     */
    public Builder setVmInstance(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      vmInstance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * VM instance name the data disks mounted to, for example
     * "myproject-1014-104817-4c2-harness-0".
     * </pre>
     *
     * <code>string vm_instance = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVmInstance() {
      vmInstance_ = getDefaultInstance().getVmInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * VM instance name the data disks mounted to, for example
     * "myproject-1014-104817-4c2-harness-0".
     * </pre>
     *
     * <code>string vm_instance = 1;</code>
     * @param value The bytes for vmInstance to set.
     * @return This builder for chaining.
     */
    public Builder setVmInstanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      vmInstance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList dataDisks_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDataDisksIsMutable() {
      if (!dataDisks_.isModifiable()) {
        dataDisks_ = new com.google.protobuf.LazyStringArrayList(dataDisks_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Mounted data disks. The order is important a data disk's 0-based index in
     * this list defines which persistent directory the disk is mounted to, for
     * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
     * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
     * </pre>
     *
     * <code>repeated string data_disks = 2;</code>
     * @return A list containing the dataDisks.
     */
    public com.google.protobuf.ProtocolStringList
        getDataDisksList() {
      dataDisks_.makeImmutable();
      return dataDisks_;
    }
    /**
     * <pre>
     * Mounted data disks. The order is important a data disk's 0-based index in
     * this list defines which persistent directory the disk is mounted to, for
     * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
     * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
     * </pre>
     *
     * <code>repeated string data_disks = 2;</code>
     * @return The count of dataDisks.
     */
    public int getDataDisksCount() {
      return dataDisks_.size();
    }
    /**
     * <pre>
     * Mounted data disks. The order is important a data disk's 0-based index in
     * this list defines which persistent directory the disk is mounted to, for
     * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
     * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
     * </pre>
     *
     * <code>repeated string data_disks = 2;</code>
     * @param index The index of the element to return.
     * @return The dataDisks at the given index.
     */
    public java.lang.String getDataDisks(int index) {
      return dataDisks_.get(index);
    }
    /**
     * <pre>
     * Mounted data disks. The order is important a data disk's 0-based index in
     * this list defines which persistent directory the disk is mounted to, for
     * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
     * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
     * </pre>
     *
     * <code>repeated string data_disks = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the dataDisks at the given index.
     */
    public com.google.protobuf.ByteString
        getDataDisksBytes(int index) {
      return dataDisks_.getByteString(index);
    }
    /**
     * <pre>
     * Mounted data disks. The order is important a data disk's 0-based index in
     * this list defines which persistent directory the disk is mounted to, for
     * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
     * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
     * </pre>
     *
     * <code>repeated string data_disks = 2;</code>
     * @param index The index to set the value at.
     * @param value The dataDisks to set.
     * @return This builder for chaining.
     */
    public Builder setDataDisks(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDataDisksIsMutable();
      dataDisks_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mounted data disks. The order is important a data disk's 0-based index in
     * this list defines which persistent directory the disk is mounted to, for
     * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
     * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
     * </pre>
     *
     * <code>repeated string data_disks = 2;</code>
     * @param value The dataDisks to add.
     * @return This builder for chaining.
     */
    public Builder addDataDisks(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDataDisksIsMutable();
      dataDisks_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mounted data disks. The order is important a data disk's 0-based index in
     * this list defines which persistent directory the disk is mounted to, for
     * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
     * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
     * </pre>
     *
     * <code>repeated string data_disks = 2;</code>
     * @param values The dataDisks to add.
     * @return This builder for chaining.
     */
    public Builder addAllDataDisks(
        java.lang.Iterable<java.lang.String> values) {
      ensureDataDisksIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dataDisks_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mounted data disks. The order is important a data disk's 0-based index in
     * this list defines which persistent directory the disk is mounted to, for
     * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
     * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
     * </pre>
     *
     * <code>repeated string data_disks = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataDisks() {
      dataDisks_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mounted data disks. The order is important a data disk's 0-based index in
     * this list defines which persistent directory the disk is mounted to, for
     * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
     * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
     * </pre>
     *
     * <code>repeated string data_disks = 2;</code>
     * @param value The bytes of the dataDisks to add.
     * @return This builder for chaining.
     */
    public Builder addDataDisksBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDataDisksIsMutable();
      dataDisks_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.DataDiskAssignment)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.DataDiskAssignment)
  private static final com.google.dataflow.v1beta3.DataDiskAssignment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.DataDiskAssignment();
  }

  public static com.google.dataflow.v1beta3.DataDiskAssignment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataDiskAssignment>
      PARSER = new com.google.protobuf.AbstractParser<DataDiskAssignment>() {
    @java.lang.Override
    public DataDiskAssignment parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataDiskAssignment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataDiskAssignment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.DataDiskAssignment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

