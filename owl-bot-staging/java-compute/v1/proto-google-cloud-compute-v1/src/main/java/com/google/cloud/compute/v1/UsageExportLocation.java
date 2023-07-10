// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * The location in Cloud Storage and naming method of the daily usage report. Contains bucket_name and report_name prefix.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.UsageExportLocation}
 */
public final class UsageExportLocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.UsageExportLocation)
    UsageExportLocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UsageExportLocation.newBuilder() to construct.
  private UsageExportLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsageExportLocation() {
    bucketName_ = "";
    reportNamePrefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UsageExportLocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UsageExportLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UsageExportLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.UsageExportLocation.class, com.google.cloud.compute.v1.UsageExportLocation.Builder.class);
  }

  private int bitField0_;
  public static final int BUCKET_NAME_FIELD_NUMBER = 283610048;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bucketName_ = "";
  /**
   * <pre>
   * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
   * </pre>
   *
   * <code>optional string bucket_name = 283610048;</code>
   * @return Whether the bucketName field is set.
   */
  @java.lang.Override
  public boolean hasBucketName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
   * </pre>
   *
   * <code>optional string bucket_name = 283610048;</code>
   * @return The bucketName.
   */
  @java.lang.Override
  public java.lang.String getBucketName() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucketName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
   * </pre>
   *
   * <code>optional string bucket_name = 283610048;</code>
   * @return The bytes for bucketName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBucketNameBytes() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bucketName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPORT_NAME_PREFIX_FIELD_NUMBER = 320198715;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reportNamePrefix_ = "";
  /**
   * <pre>
   * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
   * </pre>
   *
   * <code>optional string report_name_prefix = 320198715;</code>
   * @return Whether the reportNamePrefix field is set.
   */
  @java.lang.Override
  public boolean hasReportNamePrefix() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
   * </pre>
   *
   * <code>optional string report_name_prefix = 320198715;</code>
   * @return The reportNamePrefix.
   */
  @java.lang.Override
  public java.lang.String getReportNamePrefix() {
    java.lang.Object ref = reportNamePrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reportNamePrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
   * </pre>
   *
   * <code>optional string report_name_prefix = 320198715;</code>
   * @return The bytes for reportNamePrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReportNamePrefixBytes() {
    java.lang.Object ref = reportNamePrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reportNamePrefix_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 283610048, bucketName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 320198715, reportNamePrefix_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(283610048, bucketName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(320198715, reportNamePrefix_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.UsageExportLocation)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.UsageExportLocation other = (com.google.cloud.compute.v1.UsageExportLocation) obj;

    if (hasBucketName() != other.hasBucketName()) return false;
    if (hasBucketName()) {
      if (!getBucketName()
          .equals(other.getBucketName())) return false;
    }
    if (hasReportNamePrefix() != other.hasReportNamePrefix()) return false;
    if (hasReportNamePrefix()) {
      if (!getReportNamePrefix()
          .equals(other.getReportNamePrefix())) return false;
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
    if (hasBucketName()) {
      hash = (37 * hash) + BUCKET_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getBucketName().hashCode();
    }
    if (hasReportNamePrefix()) {
      hash = (37 * hash) + REPORT_NAME_PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getReportNamePrefix().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UsageExportLocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.UsageExportLocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.UsageExportLocation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.UsageExportLocation prototype) {
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
   * The location in Cloud Storage and naming method of the daily usage report. Contains bucket_name and report_name prefix.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.UsageExportLocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.UsageExportLocation)
      com.google.cloud.compute.v1.UsageExportLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UsageExportLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UsageExportLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.UsageExportLocation.class, com.google.cloud.compute.v1.UsageExportLocation.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.UsageExportLocation.newBuilder()
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
      bucketName_ = "";
      reportNamePrefix_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UsageExportLocation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UsageExportLocation getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.UsageExportLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UsageExportLocation build() {
      com.google.cloud.compute.v1.UsageExportLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UsageExportLocation buildPartial() {
      com.google.cloud.compute.v1.UsageExportLocation result = new com.google.cloud.compute.v1.UsageExportLocation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.UsageExportLocation result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bucketName_ = bucketName_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reportNamePrefix_ = reportNamePrefix_;
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
      if (other instanceof com.google.cloud.compute.v1.UsageExportLocation) {
        return mergeFrom((com.google.cloud.compute.v1.UsageExportLocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.UsageExportLocation other) {
      if (other == com.google.cloud.compute.v1.UsageExportLocation.getDefaultInstance()) return this;
      if (other.hasBucketName()) {
        bucketName_ = other.bucketName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReportNamePrefix()) {
        reportNamePrefix_ = other.reportNamePrefix_;
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
            case -2026086910: {
              bucketName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -2026086910
            case -1733377574: {
              reportNamePrefix_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case -1733377574
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

    private java.lang.Object bucketName_ = "";
    /**
     * <pre>
     * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
     * </pre>
     *
     * <code>optional string bucket_name = 283610048;</code>
     * @return Whether the bucketName field is set.
     */
    public boolean hasBucketName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
     * </pre>
     *
     * <code>optional string bucket_name = 283610048;</code>
     * @return The bucketName.
     */
    public java.lang.String getBucketName() {
      java.lang.Object ref = bucketName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucketName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
     * </pre>
     *
     * <code>optional string bucket_name = 283610048;</code>
     * @return The bytes for bucketName.
     */
    public com.google.protobuf.ByteString
        getBucketNameBytes() {
      java.lang.Object ref = bucketName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bucketName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
     * </pre>
     *
     * <code>optional string bucket_name = 283610048;</code>
     * @param value The bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bucketName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
     * </pre>
     *
     * <code>optional string bucket_name = 283610048;</code>
     * @return This builder for chaining.
     */
    public Builder clearBucketName() {
      bucketName_ = getDefaultInstance().getBucketName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
     * </pre>
     *
     * <code>optional string bucket_name = 283610048;</code>
     * @param value The bytes for bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bucketName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object reportNamePrefix_ = "";
    /**
     * <pre>
     * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
     * </pre>
     *
     * <code>optional string report_name_prefix = 320198715;</code>
     * @return Whether the reportNamePrefix field is set.
     */
    public boolean hasReportNamePrefix() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
     * </pre>
     *
     * <code>optional string report_name_prefix = 320198715;</code>
     * @return The reportNamePrefix.
     */
    public java.lang.String getReportNamePrefix() {
      java.lang.Object ref = reportNamePrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reportNamePrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
     * </pre>
     *
     * <code>optional string report_name_prefix = 320198715;</code>
     * @return The bytes for reportNamePrefix.
     */
    public com.google.protobuf.ByteString
        getReportNamePrefixBytes() {
      java.lang.Object ref = reportNamePrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reportNamePrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
     * </pre>
     *
     * <code>optional string report_name_prefix = 320198715;</code>
     * @param value The reportNamePrefix to set.
     * @return This builder for chaining.
     */
    public Builder setReportNamePrefix(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reportNamePrefix_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
     * </pre>
     *
     * <code>optional string report_name_prefix = 320198715;</code>
     * @return This builder for chaining.
     */
    public Builder clearReportNamePrefix() {
      reportNamePrefix_ = getDefaultInstance().getReportNamePrefix();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
     * </pre>
     *
     * <code>optional string report_name_prefix = 320198715;</code>
     * @param value The bytes for reportNamePrefix to set.
     * @return This builder for chaining.
     */
    public Builder setReportNamePrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reportNamePrefix_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.UsageExportLocation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.UsageExportLocation)
  private static final com.google.cloud.compute.v1.UsageExportLocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.UsageExportLocation();
  }

  public static com.google.cloud.compute.v1.UsageExportLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsageExportLocation>
      PARSER = new com.google.protobuf.AbstractParser<UsageExportLocation>() {
    @java.lang.Override
    public UsageExportLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<UsageExportLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsageExportLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.UsageExportLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

