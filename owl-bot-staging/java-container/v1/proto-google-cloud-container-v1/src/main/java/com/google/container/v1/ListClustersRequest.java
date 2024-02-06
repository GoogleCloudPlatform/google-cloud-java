// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

/**
 * <pre>
 * ListClustersRequest lists clusters.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.ListClustersRequest}
 */
public final class ListClustersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.ListClustersRequest)
    ListClustersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListClustersRequest.newBuilder() to construct.
  private ListClustersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListClustersRequest() {
    projectId_ = "";
    zone_ = "";
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListClustersRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListClustersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListClustersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.ListClustersRequest.class, com.google.container.v1.ListClustersRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object projectId_ = "";
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   * @deprecated google.container.v1.ListClustersRequest.project_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3021
   * @return The projectId.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   * @deprecated google.container.v1.ListClustersRequest.project_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3021
   * @return The bytes for projectId.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object zone_ = "";
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides, or "-" for all zones. This field has been deprecated and
   * replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   * @deprecated google.container.v1.ListClustersRequest.zone is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3027
   * @return The zone.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides, or "-" for all zones. This field has been deprecated and
   * replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   * @deprecated google.container.v1.ListClustersRequest.zone is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3027
   * @return The bytes for zone.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * The parent (project and location) where the clusters will be listed.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * Location "-" matches all zones and all regions.
   * </pre>
   *
   * <code>string parent = 4;</code>
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
   * The parent (project and location) where the clusters will be listed.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * Location "-" matches all zones and all regions.
   * </pre>
   *
   * <code>string parent = 4;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parent_);
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
    if (!(obj instanceof com.google.container.v1.ListClustersRequest)) {
      return super.equals(obj);
    }
    com.google.container.v1.ListClustersRequest other = (com.google.container.v1.ListClustersRequest) obj;

    if (!getProjectId()
        .equals(other.getProjectId())) return false;
    if (!getZone()
        .equals(other.getZone())) return false;
    if (!getParent()
        .equals(other.getParent())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.ListClustersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.ListClustersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.ListClustersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.ListClustersRequest prototype) {
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
   * ListClustersRequest lists clusters.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.ListClustersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.ListClustersRequest)
      com.google.container.v1.ListClustersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListClustersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListClustersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.ListClustersRequest.class, com.google.container.v1.ListClustersRequest.Builder.class);
    }

    // Construct using com.google.container.v1.ListClustersRequest.newBuilder()
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
      projectId_ = "";
      zone_ = "";
      parent_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListClustersRequest_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.ListClustersRequest getDefaultInstanceForType() {
      return com.google.container.v1.ListClustersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.ListClustersRequest build() {
      com.google.container.v1.ListClustersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.ListClustersRequest buildPartial() {
      com.google.container.v1.ListClustersRequest result = new com.google.container.v1.ListClustersRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.ListClustersRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectId_ = projectId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.zone_ = zone_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.parent_ = parent_;
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
      if (other instanceof com.google.container.v1.ListClustersRequest) {
        return mergeFrom((com.google.container.v1.ListClustersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.ListClustersRequest other) {
      if (other == com.google.container.v1.ListClustersRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000004;
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
              projectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              zone_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 34: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * Deprecated. The Google Developers Console [project ID or project
     * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
     * This field has been deprecated and replaced by the parent field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.project_id is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3021
     * @return The projectId.
     */
    @java.lang.Deprecated public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Deprecated. The Google Developers Console [project ID or project
     * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
     * This field has been deprecated and replaced by the parent field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.project_id is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3021
     * @return The bytes for projectId.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Deprecated. The Google Developers Console [project ID or project
     * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
     * This field has been deprecated and replaced by the parent field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.project_id is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3021
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setProjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecated. The Google Developers Console [project ID or project
     * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
     * This field has been deprecated and replaced by the parent field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.project_id is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3021
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearProjectId() {
      projectId_ = getDefaultInstance().getProjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecated. The Google Developers Console [project ID or project
     * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
     * This field has been deprecated and replaced by the parent field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.project_id is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3021
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     * <pre>
     * Deprecated. The name of the Google Compute Engine
     * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
     * cluster resides, or "-" for all zones. This field has been deprecated and
     * replaced by the parent field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.zone is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3027
     * @return The zone.
     */
    @java.lang.Deprecated public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Deprecated. The name of the Google Compute Engine
     * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
     * cluster resides, or "-" for all zones. This field has been deprecated and
     * replaced by the parent field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.zone is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3027
     * @return The bytes for zone.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Deprecated. The name of the Google Compute Engine
     * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
     * cluster resides, or "-" for all zones. This field has been deprecated and
     * replaced by the parent field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.zone is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3027
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setZone(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      zone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecated. The name of the Google Compute Engine
     * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
     * cluster resides, or "-" for all zones. This field has been deprecated and
     * replaced by the parent field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.zone is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3027
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearZone() {
      zone_ = getDefaultInstance().getZone();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecated. The name of the Google Compute Engine
     * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
     * cluster resides, or "-" for all zones. This field has been deprecated and
     * replaced by the parent field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true];</code>
     * @deprecated google.container.v1.ListClustersRequest.zone is deprecated.
     *     See google/container/v1/cluster_service.proto;l=3027
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      zone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The parent (project and location) where the clusters will be listed.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * Location "-" matches all zones and all regions.
     * </pre>
     *
     * <code>string parent = 4;</code>
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
     * The parent (project and location) where the clusters will be listed.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * Location "-" matches all zones and all regions.
     * </pre>
     *
     * <code>string parent = 4;</code>
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
     * The parent (project and location) where the clusters will be listed.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * Location "-" matches all zones and all regions.
     * </pre>
     *
     * <code>string parent = 4;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent (project and location) where the clusters will be listed.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * Location "-" matches all zones and all regions.
     * </pre>
     *
     * <code>string parent = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent (project and location) where the clusters will be listed.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * Location "-" matches all zones and all regions.
     * </pre>
     *
     * <code>string parent = 4;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1.ListClustersRequest)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.ListClustersRequest)
  private static final com.google.container.v1.ListClustersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.ListClustersRequest();
  }

  public static com.google.container.v1.ListClustersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListClustersRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListClustersRequest>() {
    @java.lang.Override
    public ListClustersRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListClustersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListClustersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.ListClustersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

