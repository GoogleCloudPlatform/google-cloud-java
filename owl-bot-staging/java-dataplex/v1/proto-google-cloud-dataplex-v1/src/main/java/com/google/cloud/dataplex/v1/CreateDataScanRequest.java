// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/datascans.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

/**
 * <pre>
 * Create dataScan request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.CreateDataScanRequest}
 */
public final class CreateDataScanRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.CreateDataScanRequest)
    CreateDataScanRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDataScanRequest.newBuilder() to construct.
  private CreateDataScanRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDataScanRequest() {
    parent_ = "";
    dataScanId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDataScanRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.CreateDataScanRequest.class, com.google.cloud.dataplex.v1.CreateDataScanRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The resource name of the parent location:
   * `projects/{project}/locations/{location_id}`
   * where `project` refers to a *project_id* or *project_number* and
   * `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the parent location:
   * `projects/{project}/locations/{location_id}`
   * where `project` refers to a *project_id* or *project_number* and
   * `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_SCAN_FIELD_NUMBER = 2;
  private com.google.cloud.dataplex.v1.DataScan dataScan_;
  /**
   * <pre>
   * Required. DataScan resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dataScan field is set.
   */
  @java.lang.Override
  public boolean hasDataScan() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. DataScan resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dataScan.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataScan getDataScan() {
    return dataScan_ == null ? com.google.cloud.dataplex.v1.DataScan.getDefaultInstance() : dataScan_;
  }
  /**
   * <pre>
   * Required. DataScan resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataScanOrBuilder getDataScanOrBuilder() {
    return dataScan_ == null ? com.google.cloud.dataplex.v1.DataScan.getDefaultInstance() : dataScan_;
  }

  public static final int DATA_SCAN_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dataScanId_ = "";
  /**
   * <pre>
   * Required. DataScan identifier.
   *
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique within the customer project / location.
   * </pre>
   *
   * <code>string data_scan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dataScanId.
   */
  @java.lang.Override
  public java.lang.String getDataScanId() {
    java.lang.Object ref = dataScanId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataScanId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. DataScan identifier.
   *
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique within the customer project / location.
   * </pre>
   *
   * <code>string data_scan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for dataScanId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataScanIdBytes() {
    java.lang.Object ref = dataScanId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataScanId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;
  /**
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is `false`.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getDataScan());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataScanId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dataScanId_);
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDataScan());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataScanId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dataScanId_);
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.CreateDataScanRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.CreateDataScanRequest other = (com.google.cloud.dataplex.v1.CreateDataScanRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasDataScan() != other.hasDataScan()) return false;
    if (hasDataScan()) {
      if (!getDataScan()
          .equals(other.getDataScan())) return false;
    }
    if (!getDataScanId()
        .equals(other.getDataScanId())) return false;
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasDataScan()) {
      hash = (37 * hash) + DATA_SCAN_FIELD_NUMBER;
      hash = (53 * hash) + getDataScan().hashCode();
    }
    hash = (37 * hash) + DATA_SCAN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDataScanId().hashCode();
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.CreateDataScanRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataplex.v1.CreateDataScanRequest prototype) {
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
   * Create dataScan request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.CreateDataScanRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.CreateDataScanRequest)
      com.google.cloud.dataplex.v1.CreateDataScanRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.CreateDataScanRequest.class, com.google.cloud.dataplex.v1.CreateDataScanRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.CreateDataScanRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDataScanFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      dataScan_ = null;
      if (dataScanBuilder_ != null) {
        dataScanBuilder_.dispose();
        dataScanBuilder_ = null;
      }
      dataScanId_ = "";
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateDataScanRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.CreateDataScanRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateDataScanRequest build() {
      com.google.cloud.dataplex.v1.CreateDataScanRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateDataScanRequest buildPartial() {
      com.google.cloud.dataplex.v1.CreateDataScanRequest result = new com.google.cloud.dataplex.v1.CreateDataScanRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.CreateDataScanRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataScan_ = dataScanBuilder_ == null
            ? dataScan_
            : dataScanBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dataScanId_ = dataScanId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.dataplex.v1.CreateDataScanRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.CreateDataScanRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.CreateDataScanRequest other) {
      if (other == com.google.cloud.dataplex.v1.CreateDataScanRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDataScan()) {
        mergeDataScan(other.getDataScan());
      }
      if (!other.getDataScanId().isEmpty()) {
        dataScanId_ = other.dataScanId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDataScanFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              dataScanId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              validateOnly_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the parent location:
     * `projects/{project}/locations/{location_id}`
     * where `project` refers to a *project_id* or *project_number* and
     * `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the parent location:
     * `projects/{project}/locations/{location_id}`
     * where `project` refers to a *project_id* or *project_number* and
     * `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the parent location:
     * `projects/{project}/locations/{location_id}`
     * where `project` refers to a *project_id* or *project_number* and
     * `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the parent location:
     * `projects/{project}/locations/{location_id}`
     * where `project` refers to a *project_id* or *project_number* and
     * `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the parent location:
     * `projects/{project}/locations/{location_id}`
     * where `project` refers to a *project_id* or *project_number* and
     * `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dataplex.v1.DataScan dataScan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.DataScan, com.google.cloud.dataplex.v1.DataScan.Builder, com.google.cloud.dataplex.v1.DataScanOrBuilder> dataScanBuilder_;
    /**
     * <pre>
     * Required. DataScan resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the dataScan field is set.
     */
    public boolean hasDataScan() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. DataScan resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The dataScan.
     */
    public com.google.cloud.dataplex.v1.DataScan getDataScan() {
      if (dataScanBuilder_ == null) {
        return dataScan_ == null ? com.google.cloud.dataplex.v1.DataScan.getDefaultInstance() : dataScan_;
      } else {
        return dataScanBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. DataScan resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDataScan(com.google.cloud.dataplex.v1.DataScan value) {
      if (dataScanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataScan_ = value;
      } else {
        dataScanBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. DataScan resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDataScan(
        com.google.cloud.dataplex.v1.DataScan.Builder builderForValue) {
      if (dataScanBuilder_ == null) {
        dataScan_ = builderForValue.build();
      } else {
        dataScanBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. DataScan resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeDataScan(com.google.cloud.dataplex.v1.DataScan value) {
      if (dataScanBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          dataScan_ != null &&
          dataScan_ != com.google.cloud.dataplex.v1.DataScan.getDefaultInstance()) {
          getDataScanBuilder().mergeFrom(value);
        } else {
          dataScan_ = value;
        }
      } else {
        dataScanBuilder_.mergeFrom(value);
      }
      if (dataScan_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. DataScan resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearDataScan() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataScan_ = null;
      if (dataScanBuilder_ != null) {
        dataScanBuilder_.dispose();
        dataScanBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. DataScan resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataplex.v1.DataScan.Builder getDataScanBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataScanFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. DataScan resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataplex.v1.DataScanOrBuilder getDataScanOrBuilder() {
      if (dataScanBuilder_ != null) {
        return dataScanBuilder_.getMessageOrBuilder();
      } else {
        return dataScan_ == null ?
            com.google.cloud.dataplex.v1.DataScan.getDefaultInstance() : dataScan_;
      }
    }
    /**
     * <pre>
     * Required. DataScan resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.DataScan data_scan = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.DataScan, com.google.cloud.dataplex.v1.DataScan.Builder, com.google.cloud.dataplex.v1.DataScanOrBuilder> 
        getDataScanFieldBuilder() {
      if (dataScanBuilder_ == null) {
        dataScanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.DataScan, com.google.cloud.dataplex.v1.DataScan.Builder, com.google.cloud.dataplex.v1.DataScanOrBuilder>(
                getDataScan(),
                getParentForChildren(),
                isClean());
        dataScan_ = null;
      }
      return dataScanBuilder_;
    }

    private java.lang.Object dataScanId_ = "";
    /**
     * <pre>
     * Required. DataScan identifier.
     *
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string data_scan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The dataScanId.
     */
    public java.lang.String getDataScanId() {
      java.lang.Object ref = dataScanId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataScanId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. DataScan identifier.
     *
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string data_scan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for dataScanId.
     */
    public com.google.protobuf.ByteString
        getDataScanIdBytes() {
      java.lang.Object ref = dataScanId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataScanId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. DataScan identifier.
     *
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string data_scan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The dataScanId to set.
     * @return This builder for chaining.
     */
    public Builder setDataScanId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataScanId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. DataScan identifier.
     *
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string data_scan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearDataScanId() {
      dataScanId_ = getDefaultInstance().getDataScanId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. DataScan identifier.
     *
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must end with a number or a letter.
     * * Must be between 1-63 characters.
     * * Must be unique within the customer project / location.
     * </pre>
     *
     * <code>string data_scan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for dataScanId to set.
     * @return This builder for chaining.
     */
    public Builder setDataScanIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataScanId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is `false`.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is `false`.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is `false`.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validateOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.CreateDataScanRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.CreateDataScanRequest)
  private static final com.google.cloud.dataplex.v1.CreateDataScanRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.CreateDataScanRequest();
  }

  public static com.google.cloud.dataplex.v1.CreateDataScanRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDataScanRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateDataScanRequest>() {
    @java.lang.Override
    public CreateDataScanRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDataScanRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDataScanRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.CreateDataScanRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

