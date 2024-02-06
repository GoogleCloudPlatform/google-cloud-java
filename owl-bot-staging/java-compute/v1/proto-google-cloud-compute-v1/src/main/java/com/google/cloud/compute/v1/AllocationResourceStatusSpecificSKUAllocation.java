// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * Contains Properties set for the reservation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation}
 */
public final class AllocationResourceStatusSpecificSKUAllocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation)
    AllocationResourceStatusSpecificSKUAllocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllocationResourceStatusSpecificSKUAllocation.newBuilder() to construct.
  private AllocationResourceStatusSpecificSKUAllocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllocationResourceStatusSpecificSKUAllocation() {
    sourceInstanceTemplateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllocationResourceStatusSpecificSKUAllocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatusSpecificSKUAllocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatusSpecificSKUAllocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.class, com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.Builder.class);
  }

  private int bitField0_;
  public static final int SOURCE_INSTANCE_TEMPLATE_ID_FIELD_NUMBER = 111196154;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceInstanceTemplateId_ = "";
  /**
   * <pre>
   * ID of the instance template used to populate reservation properties.
   * </pre>
   *
   * <code>optional string source_instance_template_id = 111196154;</code>
   * @return Whether the sourceInstanceTemplateId field is set.
   */
  @java.lang.Override
  public boolean hasSourceInstanceTemplateId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * ID of the instance template used to populate reservation properties.
   * </pre>
   *
   * <code>optional string source_instance_template_id = 111196154;</code>
   * @return The sourceInstanceTemplateId.
   */
  @java.lang.Override
  public java.lang.String getSourceInstanceTemplateId() {
    java.lang.Object ref = sourceInstanceTemplateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceInstanceTemplateId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ID of the instance template used to populate reservation properties.
   * </pre>
   *
   * <code>optional string source_instance_template_id = 111196154;</code>
   * @return The bytes for sourceInstanceTemplateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceInstanceTemplateIdBytes() {
    java.lang.Object ref = sourceInstanceTemplateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceInstanceTemplateId_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 111196154, sourceInstanceTemplateId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(111196154, sourceInstanceTemplateId_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation other = (com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation) obj;

    if (hasSourceInstanceTemplateId() != other.hasSourceInstanceTemplateId()) return false;
    if (hasSourceInstanceTemplateId()) {
      if (!getSourceInstanceTemplateId()
          .equals(other.getSourceInstanceTemplateId())) return false;
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
    if (hasSourceInstanceTemplateId()) {
      hash = (37 * hash) + SOURCE_INSTANCE_TEMPLATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceInstanceTemplateId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation prototype) {
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
   * Contains Properties set for the reservation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation)
      com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatusSpecificSKUAllocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatusSpecificSKUAllocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.class, com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.newBuilder()
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
      sourceInstanceTemplateId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatusSpecificSKUAllocation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation build() {
      com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation buildPartial() {
      com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation result = new com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceInstanceTemplateId_ = sourceInstanceTemplateId_;
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
      if (other instanceof com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation) {
        return mergeFrom((com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation other) {
      if (other == com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.getDefaultInstance()) return this;
      if (other.hasSourceInstanceTemplateId()) {
        sourceInstanceTemplateId_ = other.sourceInstanceTemplateId_;
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
            case 889569234: {
              sourceInstanceTemplateId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 889569234
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

    private java.lang.Object sourceInstanceTemplateId_ = "";
    /**
     * <pre>
     * ID of the instance template used to populate reservation properties.
     * </pre>
     *
     * <code>optional string source_instance_template_id = 111196154;</code>
     * @return Whether the sourceInstanceTemplateId field is set.
     */
    public boolean hasSourceInstanceTemplateId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * ID of the instance template used to populate reservation properties.
     * </pre>
     *
     * <code>optional string source_instance_template_id = 111196154;</code>
     * @return The sourceInstanceTemplateId.
     */
    public java.lang.String getSourceInstanceTemplateId() {
      java.lang.Object ref = sourceInstanceTemplateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceInstanceTemplateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ID of the instance template used to populate reservation properties.
     * </pre>
     *
     * <code>optional string source_instance_template_id = 111196154;</code>
     * @return The bytes for sourceInstanceTemplateId.
     */
    public com.google.protobuf.ByteString
        getSourceInstanceTemplateIdBytes() {
      java.lang.Object ref = sourceInstanceTemplateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceInstanceTemplateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ID of the instance template used to populate reservation properties.
     * </pre>
     *
     * <code>optional string source_instance_template_id = 111196154;</code>
     * @param value The sourceInstanceTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceInstanceTemplateId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sourceInstanceTemplateId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the instance template used to populate reservation properties.
     * </pre>
     *
     * <code>optional string source_instance_template_id = 111196154;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceInstanceTemplateId() {
      sourceInstanceTemplateId_ = getDefaultInstance().getSourceInstanceTemplateId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the instance template used to populate reservation properties.
     * </pre>
     *
     * <code>optional string source_instance_template_id = 111196154;</code>
     * @param value The bytes for sourceInstanceTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceInstanceTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sourceInstanceTemplateId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation)
  private static final com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation();
  }

  public static com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllocationResourceStatusSpecificSKUAllocation>
      PARSER = new com.google.protobuf.AbstractParser<AllocationResourceStatusSpecificSKUAllocation>() {
    @java.lang.Override
    public AllocationResourceStatusSpecificSKUAllocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<AllocationResourceStatusSpecificSKUAllocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllocationResourceStatusSpecificSKUAllocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

