// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * A request message for BackendServices.TestIamPermissions. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest}
 */
public final class TestIamPermissionsBackendServiceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest)
    TestIamPermissionsBackendServiceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestIamPermissionsBackendServiceRequest.newBuilder() to construct.
  private TestIamPermissionsBackendServiceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestIamPermissionsBackendServiceRequest() {
    project_ = "";
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TestIamPermissionsBackendServiceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TestIamPermissionsBackendServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TestIamPermissionsBackendServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest.class, com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_FIELD_NUMBER = 227560217;
  @SuppressWarnings("serial")
  private volatile java.lang.Object project_ = "";
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 195806222;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resource_ = "";
  /**
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEST_PERMISSIONS_REQUEST_RESOURCE_FIELD_NUMBER = 439214758;
  private com.google.cloud.compute.v1.TestPermissionsRequest testPermissionsRequestResource_;
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the testPermissionsRequestResource field is set.
   */
  @java.lang.Override
  public boolean hasTestPermissionsRequestResource() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The testPermissionsRequestResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.TestPermissionsRequest getTestPermissionsRequestResource() {
    return testPermissionsRequestResource_ == null ? com.google.cloud.compute.v1.TestPermissionsRequest.getDefaultInstance() : testPermissionsRequestResource_;
  }
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder getTestPermissionsRequestResourceOrBuilder() {
    return testPermissionsRequestResource_ == null ? com.google.cloud.compute.v1.TestPermissionsRequest.getDefaultInstance() : testPermissionsRequestResource_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(439214758, getTestPermissionsRequestResource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(439214758, getTestPermissionsRequestResource());
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
    if (!(obj instanceof com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest other = (com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest) obj;

    if (!getProject()
        .equals(other.getProject())) return false;
    if (!getResource()
        .equals(other.getResource())) return false;
    if (hasTestPermissionsRequestResource() != other.hasTestPermissionsRequestResource()) return false;
    if (hasTestPermissionsRequestResource()) {
      if (!getTestPermissionsRequestResource()
          .equals(other.getTestPermissionsRequestResource())) return false;
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
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    if (hasTestPermissionsRequestResource()) {
      hash = (37 * hash) + TEST_PERMISSIONS_REQUEST_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getTestPermissionsRequestResource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest prototype) {
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
   * A request message for BackendServices.TestIamPermissions. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest)
      com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TestIamPermissionsBackendServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TestIamPermissionsBackendServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest.class, com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest.newBuilder()
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
        getTestPermissionsRequestResourceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      project_ = "";
      resource_ = "";
      testPermissionsRequestResource_ = null;
      if (testPermissionsRequestResourceBuilder_ != null) {
        testPermissionsRequestResourceBuilder_.dispose();
        testPermissionsRequestResourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TestIamPermissionsBackendServiceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest build() {
      com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest buildPartial() {
      com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest result = new com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.project_ = project_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resource_ = resource_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.testPermissionsRequestResource_ = testPermissionsRequestResourceBuilder_ == null
            ? testPermissionsRequestResource_
            : testPermissionsRequestResourceBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest) {
        return mergeFrom((com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest other) {
      if (other == com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest.getDefaultInstance()) return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasTestPermissionsRequestResource()) {
        mergeTestPermissionsRequestResource(other.getTestPermissionsRequestResource());
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
            case 1566449778: {
              resource_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 1566449778
            case 1820481738: {
              project_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 1820481738
            case -781249230: {
              input.readMessage(
                  getTestPermissionsRequestResourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case -781249230
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

    private java.lang.Object project_ = "";
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString
        getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resource_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      resource_ = getDefaultInstance().getResource();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resource_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.TestPermissionsRequest testPermissionsRequestResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.TestPermissionsRequest, com.google.cloud.compute.v1.TestPermissionsRequest.Builder, com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder> testPermissionsRequestResourceBuilder_;
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the testPermissionsRequestResource field is set.
     */
    public boolean hasTestPermissionsRequestResource() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The testPermissionsRequestResource.
     */
    public com.google.cloud.compute.v1.TestPermissionsRequest getTestPermissionsRequestResource() {
      if (testPermissionsRequestResourceBuilder_ == null) {
        return testPermissionsRequestResource_ == null ? com.google.cloud.compute.v1.TestPermissionsRequest.getDefaultInstance() : testPermissionsRequestResource_;
      } else {
        return testPermissionsRequestResourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTestPermissionsRequestResource(com.google.cloud.compute.v1.TestPermissionsRequest value) {
      if (testPermissionsRequestResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        testPermissionsRequestResource_ = value;
      } else {
        testPermissionsRequestResourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTestPermissionsRequestResource(
        com.google.cloud.compute.v1.TestPermissionsRequest.Builder builderForValue) {
      if (testPermissionsRequestResourceBuilder_ == null) {
        testPermissionsRequestResource_ = builderForValue.build();
      } else {
        testPermissionsRequestResourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTestPermissionsRequestResource(com.google.cloud.compute.v1.TestPermissionsRequest value) {
      if (testPermissionsRequestResourceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          testPermissionsRequestResource_ != null &&
          testPermissionsRequestResource_ != com.google.cloud.compute.v1.TestPermissionsRequest.getDefaultInstance()) {
          getTestPermissionsRequestResourceBuilder().mergeFrom(value);
        } else {
          testPermissionsRequestResource_ = value;
        }
      } else {
        testPermissionsRequestResourceBuilder_.mergeFrom(value);
      }
      if (testPermissionsRequestResource_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTestPermissionsRequestResource() {
      bitField0_ = (bitField0_ & ~0x00000004);
      testPermissionsRequestResource_ = null;
      if (testPermissionsRequestResourceBuilder_ != null) {
        testPermissionsRequestResourceBuilder_.dispose();
        testPermissionsRequestResourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.compute.v1.TestPermissionsRequest.Builder getTestPermissionsRequestResourceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTestPermissionsRequestResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder getTestPermissionsRequestResourceOrBuilder() {
      if (testPermissionsRequestResourceBuilder_ != null) {
        return testPermissionsRequestResourceBuilder_.getMessageOrBuilder();
      } else {
        return testPermissionsRequestResource_ == null ?
            com.google.cloud.compute.v1.TestPermissionsRequest.getDefaultInstance() : testPermissionsRequestResource_;
      }
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.TestPermissionsRequest, com.google.cloud.compute.v1.TestPermissionsRequest.Builder, com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder> 
        getTestPermissionsRequestResourceFieldBuilder() {
      if (testPermissionsRequestResourceBuilder_ == null) {
        testPermissionsRequestResourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.TestPermissionsRequest, com.google.cloud.compute.v1.TestPermissionsRequest.Builder, com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder>(
                getTestPermissionsRequestResource(),
                getParentForChildren(),
                isClean());
        testPermissionsRequestResource_ = null;
      }
      return testPermissionsRequestResourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest)
  private static final com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest();
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestIamPermissionsBackendServiceRequest>
      PARSER = new com.google.protobuf.AbstractParser<TestIamPermissionsBackendServiceRequest>() {
    @java.lang.Override
    public TestIamPermissionsBackendServiceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TestIamPermissionsBackendServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestIamPermissionsBackendServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.TestIamPermissionsBackendServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

