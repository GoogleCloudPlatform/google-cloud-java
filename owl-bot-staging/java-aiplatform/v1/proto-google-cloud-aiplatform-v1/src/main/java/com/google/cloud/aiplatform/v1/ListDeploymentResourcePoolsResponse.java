// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/deployment_resource_pool_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Response message for ListDeploymentResourcePools method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse}
 */
public final class ListDeploymentResourcePoolsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse)
    ListDeploymentResourcePoolsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDeploymentResourcePoolsResponse.newBuilder() to construct.
  private ListDeploymentResourcePoolsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDeploymentResourcePoolsResponse() {
    deploymentResourcePools_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDeploymentResourcePoolsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse.class, com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse.Builder.class);
  }

  public static final int DEPLOYMENT_RESOURCE_POOLS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.DeploymentResourcePool> deploymentResourcePools_;
  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.DeploymentResourcePool> getDeploymentResourcePoolsList() {
    return deploymentResourcePools_;
  }
  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.DeploymentResourcePoolOrBuilder> 
      getDeploymentResourcePoolsOrBuilderList() {
    return deploymentResourcePools_;
  }
  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  @java.lang.Override
  public int getDeploymentResourcePoolsCount() {
    return deploymentResourcePools_.size();
  }
  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DeploymentResourcePool getDeploymentResourcePools(int index) {
    return deploymentResourcePools_.get(index);
  }
  /**
   * <pre>
   * The DeploymentResourcePools from the specified location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DeploymentResourcePoolOrBuilder getDeploymentResourcePoolsOrBuilder(
      int index) {
    return deploymentResourcePools_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < deploymentResourcePools_.size(); i++) {
      output.writeMessage(1, deploymentResourcePools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < deploymentResourcePools_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, deploymentResourcePools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse other = (com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse) obj;

    if (!getDeploymentResourcePoolsList()
        .equals(other.getDeploymentResourcePoolsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getDeploymentResourcePoolsCount() > 0) {
      hash = (37 * hash) + DEPLOYMENT_RESOURCE_POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getDeploymentResourcePoolsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse prototype) {
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
   * Response message for ListDeploymentResourcePools method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse)
      com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse.class, com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse.newBuilder()
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
      if (deploymentResourcePoolsBuilder_ == null) {
        deploymentResourcePools_ = java.util.Collections.emptyList();
      } else {
        deploymentResourcePools_ = null;
        deploymentResourcePoolsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.DeploymentResourcePoolServiceProto.internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse build() {
      com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse result = new com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse result) {
      if (deploymentResourcePoolsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          deploymentResourcePools_ = java.util.Collections.unmodifiableList(deploymentResourcePools_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.deploymentResourcePools_ = deploymentResourcePools_;
      } else {
        result.deploymentResourcePools_ = deploymentResourcePoolsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse.getDefaultInstance()) return this;
      if (deploymentResourcePoolsBuilder_ == null) {
        if (!other.deploymentResourcePools_.isEmpty()) {
          if (deploymentResourcePools_.isEmpty()) {
            deploymentResourcePools_ = other.deploymentResourcePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeploymentResourcePoolsIsMutable();
            deploymentResourcePools_.addAll(other.deploymentResourcePools_);
          }
          onChanged();
        }
      } else {
        if (!other.deploymentResourcePools_.isEmpty()) {
          if (deploymentResourcePoolsBuilder_.isEmpty()) {
            deploymentResourcePoolsBuilder_.dispose();
            deploymentResourcePoolsBuilder_ = null;
            deploymentResourcePools_ = other.deploymentResourcePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deploymentResourcePoolsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDeploymentResourcePoolsFieldBuilder() : null;
          } else {
            deploymentResourcePoolsBuilder_.addAllMessages(other.deploymentResourcePools_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10: {
              com.google.cloud.aiplatform.v1.DeploymentResourcePool m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1.DeploymentResourcePool.parser(),
                      extensionRegistry);
              if (deploymentResourcePoolsBuilder_ == null) {
                ensureDeploymentResourcePoolsIsMutable();
                deploymentResourcePools_.add(m);
              } else {
                deploymentResourcePoolsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.util.List<com.google.cloud.aiplatform.v1.DeploymentResourcePool> deploymentResourcePools_ =
      java.util.Collections.emptyList();
    private void ensureDeploymentResourcePoolsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deploymentResourcePools_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.DeploymentResourcePool>(deploymentResourcePools_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.DeploymentResourcePool, com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder, com.google.cloud.aiplatform.v1.DeploymentResourcePoolOrBuilder> deploymentResourcePoolsBuilder_;

    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.DeploymentResourcePool> getDeploymentResourcePoolsList() {
      if (deploymentResourcePoolsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(deploymentResourcePools_);
      } else {
        return deploymentResourcePoolsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public int getDeploymentResourcePoolsCount() {
      if (deploymentResourcePoolsBuilder_ == null) {
        return deploymentResourcePools_.size();
      } else {
        return deploymentResourcePoolsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DeploymentResourcePool getDeploymentResourcePools(int index) {
      if (deploymentResourcePoolsBuilder_ == null) {
        return deploymentResourcePools_.get(index);
      } else {
        return deploymentResourcePoolsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public Builder setDeploymentResourcePools(
        int index, com.google.cloud.aiplatform.v1.DeploymentResourcePool value) {
      if (deploymentResourcePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeploymentResourcePoolsIsMutable();
        deploymentResourcePools_.set(index, value);
        onChanged();
      } else {
        deploymentResourcePoolsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public Builder setDeploymentResourcePools(
        int index, com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder builderForValue) {
      if (deploymentResourcePoolsBuilder_ == null) {
        ensureDeploymentResourcePoolsIsMutable();
        deploymentResourcePools_.set(index, builderForValue.build());
        onChanged();
      } else {
        deploymentResourcePoolsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public Builder addDeploymentResourcePools(com.google.cloud.aiplatform.v1.DeploymentResourcePool value) {
      if (deploymentResourcePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeploymentResourcePoolsIsMutable();
        deploymentResourcePools_.add(value);
        onChanged();
      } else {
        deploymentResourcePoolsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public Builder addDeploymentResourcePools(
        int index, com.google.cloud.aiplatform.v1.DeploymentResourcePool value) {
      if (deploymentResourcePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeploymentResourcePoolsIsMutable();
        deploymentResourcePools_.add(index, value);
        onChanged();
      } else {
        deploymentResourcePoolsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public Builder addDeploymentResourcePools(
        com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder builderForValue) {
      if (deploymentResourcePoolsBuilder_ == null) {
        ensureDeploymentResourcePoolsIsMutable();
        deploymentResourcePools_.add(builderForValue.build());
        onChanged();
      } else {
        deploymentResourcePoolsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public Builder addDeploymentResourcePools(
        int index, com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder builderForValue) {
      if (deploymentResourcePoolsBuilder_ == null) {
        ensureDeploymentResourcePoolsIsMutable();
        deploymentResourcePools_.add(index, builderForValue.build());
        onChanged();
      } else {
        deploymentResourcePoolsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public Builder addAllDeploymentResourcePools(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.DeploymentResourcePool> values) {
      if (deploymentResourcePoolsBuilder_ == null) {
        ensureDeploymentResourcePoolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, deploymentResourcePools_);
        onChanged();
      } else {
        deploymentResourcePoolsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public Builder clearDeploymentResourcePools() {
      if (deploymentResourcePoolsBuilder_ == null) {
        deploymentResourcePools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deploymentResourcePoolsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public Builder removeDeploymentResourcePools(int index) {
      if (deploymentResourcePoolsBuilder_ == null) {
        ensureDeploymentResourcePoolsIsMutable();
        deploymentResourcePools_.remove(index);
        onChanged();
      } else {
        deploymentResourcePoolsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder getDeploymentResourcePoolsBuilder(
        int index) {
      return getDeploymentResourcePoolsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DeploymentResourcePoolOrBuilder getDeploymentResourcePoolsOrBuilder(
        int index) {
      if (deploymentResourcePoolsBuilder_ == null) {
        return deploymentResourcePools_.get(index);  } else {
        return deploymentResourcePoolsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.DeploymentResourcePoolOrBuilder> 
         getDeploymentResourcePoolsOrBuilderList() {
      if (deploymentResourcePoolsBuilder_ != null) {
        return deploymentResourcePoolsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(deploymentResourcePools_);
      }
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder addDeploymentResourcePoolsBuilder() {
      return getDeploymentResourcePoolsFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1.DeploymentResourcePool.getDefaultInstance());
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder addDeploymentResourcePoolsBuilder(
        int index) {
      return getDeploymentResourcePoolsFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1.DeploymentResourcePool.getDefaultInstance());
    }
    /**
     * <pre>
     * The DeploymentResourcePools from the specified location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DeploymentResourcePool deployment_resource_pools = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder> 
         getDeploymentResourcePoolsBuilderList() {
      return getDeploymentResourcePoolsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.DeploymentResourcePool, com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder, com.google.cloud.aiplatform.v1.DeploymentResourcePoolOrBuilder> 
        getDeploymentResourcePoolsFieldBuilder() {
      if (deploymentResourcePoolsBuilder_ == null) {
        deploymentResourcePoolsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.DeploymentResourcePool, com.google.cloud.aiplatform.v1.DeploymentResourcePool.Builder, com.google.cloud.aiplatform.v1.DeploymentResourcePoolOrBuilder>(
                deploymentResourcePools_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        deploymentResourcePools_ = null;
      }
      return deploymentResourcePoolsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse)
  private static final com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDeploymentResourcePoolsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDeploymentResourcePoolsResponse>() {
    @java.lang.Override
    public ListDeploymentResourcePoolsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDeploymentResourcePoolsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDeploymentResourcePoolsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListDeploymentResourcePoolsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

