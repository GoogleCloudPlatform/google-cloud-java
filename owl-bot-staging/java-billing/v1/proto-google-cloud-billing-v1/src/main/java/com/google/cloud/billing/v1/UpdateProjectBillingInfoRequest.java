// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/v1/cloud_billing.proto

package com.google.cloud.billing.v1;

/**
 * <pre>
 * Request message for `UpdateProjectBillingInfo`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.v1.UpdateProjectBillingInfoRequest}
 */
public final class UpdateProjectBillingInfoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.v1.UpdateProjectBillingInfoRequest)
    UpdateProjectBillingInfoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateProjectBillingInfoRequest.newBuilder() to construct.
  private UpdateProjectBillingInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateProjectBillingInfoRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateProjectBillingInfoRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest.class, com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. The resource name of the project associated with the billing information
   * that you want to update. For example, `projects/tokyo-rain-123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the project associated with the billing information
   * that you want to update. For example, `projects/tokyo-rain-123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_BILLING_INFO_FIELD_NUMBER = 2;
  private com.google.cloud.billing.v1.ProjectBillingInfo projectBillingInfo_;
  /**
   * <pre>
   * The new billing information for the project. Read-only fields are ignored;
   * thus, you can leave empty all fields except `billing_account_name`.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
   * @return Whether the projectBillingInfo field is set.
   */
  @java.lang.Override
  public boolean hasProjectBillingInfo() {
    return projectBillingInfo_ != null;
  }
  /**
   * <pre>
   * The new billing information for the project. Read-only fields are ignored;
   * thus, you can leave empty all fields except `billing_account_name`.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
   * @return The projectBillingInfo.
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.ProjectBillingInfo getProjectBillingInfo() {
    return projectBillingInfo_ == null ? com.google.cloud.billing.v1.ProjectBillingInfo.getDefaultInstance() : projectBillingInfo_;
  }
  /**
   * <pre>
   * The new billing information for the project. Read-only fields are ignored;
   * thus, you can leave empty all fields except `billing_account_name`.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.ProjectBillingInfoOrBuilder getProjectBillingInfoOrBuilder() {
    return getProjectBillingInfo();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (projectBillingInfo_ != null) {
      output.writeMessage(2, getProjectBillingInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (projectBillingInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProjectBillingInfo());
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
    if (!(obj instanceof com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest other = (com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasProjectBillingInfo() != other.hasProjectBillingInfo()) return false;
    if (hasProjectBillingInfo()) {
      if (!getProjectBillingInfo()
          .equals(other.getProjectBillingInfo())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasProjectBillingInfo()) {
      hash = (37 * hash) + PROJECT_BILLING_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getProjectBillingInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest prototype) {
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
   * Request message for `UpdateProjectBillingInfo`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.v1.UpdateProjectBillingInfoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.v1.UpdateProjectBillingInfoRequest)
      com.google.cloud.billing.v1.UpdateProjectBillingInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest.class, com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest.Builder.class);
    }

    // Construct using com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (projectBillingInfoBuilder_ == null) {
        projectBillingInfo_ = null;
      } else {
        projectBillingInfo_ = null;
        projectBillingInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_UpdateProjectBillingInfoRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest getDefaultInstanceForType() {
      return com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest build() {
      com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest buildPartial() {
      com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest result = new com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest(this);
      result.name_ = name_;
      if (projectBillingInfoBuilder_ == null) {
        result.projectBillingInfo_ = projectBillingInfo_;
      } else {
        result.projectBillingInfo_ = projectBillingInfoBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest) {
        return mergeFrom((com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest other) {
      if (other == com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasProjectBillingInfo()) {
        mergeProjectBillingInfo(other.getProjectBillingInfo());
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
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getProjectBillingInfoFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The resource name of the project associated with the billing information
     * that you want to update. For example, `projects/tokyo-rain-123`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the project associated with the billing information
     * that you want to update. For example, `projects/tokyo-rain-123`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the project associated with the billing information
     * that you want to update. For example, `projects/tokyo-rain-123`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the project associated with the billing information
     * that you want to update. For example, `projects/tokyo-rain-123`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the project associated with the billing information
     * that you want to update. For example, `projects/tokyo-rain-123`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.billing.v1.ProjectBillingInfo projectBillingInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.billing.v1.ProjectBillingInfo, com.google.cloud.billing.v1.ProjectBillingInfo.Builder, com.google.cloud.billing.v1.ProjectBillingInfoOrBuilder> projectBillingInfoBuilder_;
    /**
     * <pre>
     * The new billing information for the project. Read-only fields are ignored;
     * thus, you can leave empty all fields except `billing_account_name`.
     * </pre>
     *
     * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
     * @return Whether the projectBillingInfo field is set.
     */
    public boolean hasProjectBillingInfo() {
      return projectBillingInfoBuilder_ != null || projectBillingInfo_ != null;
    }
    /**
     * <pre>
     * The new billing information for the project. Read-only fields are ignored;
     * thus, you can leave empty all fields except `billing_account_name`.
     * </pre>
     *
     * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
     * @return The projectBillingInfo.
     */
    public com.google.cloud.billing.v1.ProjectBillingInfo getProjectBillingInfo() {
      if (projectBillingInfoBuilder_ == null) {
        return projectBillingInfo_ == null ? com.google.cloud.billing.v1.ProjectBillingInfo.getDefaultInstance() : projectBillingInfo_;
      } else {
        return projectBillingInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The new billing information for the project. Read-only fields are ignored;
     * thus, you can leave empty all fields except `billing_account_name`.
     * </pre>
     *
     * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
     */
    public Builder setProjectBillingInfo(com.google.cloud.billing.v1.ProjectBillingInfo value) {
      if (projectBillingInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        projectBillingInfo_ = value;
        onChanged();
      } else {
        projectBillingInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new billing information for the project. Read-only fields are ignored;
     * thus, you can leave empty all fields except `billing_account_name`.
     * </pre>
     *
     * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
     */
    public Builder setProjectBillingInfo(
        com.google.cloud.billing.v1.ProjectBillingInfo.Builder builderForValue) {
      if (projectBillingInfoBuilder_ == null) {
        projectBillingInfo_ = builderForValue.build();
        onChanged();
      } else {
        projectBillingInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The new billing information for the project. Read-only fields are ignored;
     * thus, you can leave empty all fields except `billing_account_name`.
     * </pre>
     *
     * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
     */
    public Builder mergeProjectBillingInfo(com.google.cloud.billing.v1.ProjectBillingInfo value) {
      if (projectBillingInfoBuilder_ == null) {
        if (projectBillingInfo_ != null) {
          projectBillingInfo_ =
            com.google.cloud.billing.v1.ProjectBillingInfo.newBuilder(projectBillingInfo_).mergeFrom(value).buildPartial();
        } else {
          projectBillingInfo_ = value;
        }
        onChanged();
      } else {
        projectBillingInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new billing information for the project. Read-only fields are ignored;
     * thus, you can leave empty all fields except `billing_account_name`.
     * </pre>
     *
     * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
     */
    public Builder clearProjectBillingInfo() {
      if (projectBillingInfoBuilder_ == null) {
        projectBillingInfo_ = null;
        onChanged();
      } else {
        projectBillingInfo_ = null;
        projectBillingInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The new billing information for the project. Read-only fields are ignored;
     * thus, you can leave empty all fields except `billing_account_name`.
     * </pre>
     *
     * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
     */
    public com.google.cloud.billing.v1.ProjectBillingInfo.Builder getProjectBillingInfoBuilder() {
      
      onChanged();
      return getProjectBillingInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The new billing information for the project. Read-only fields are ignored;
     * thus, you can leave empty all fields except `billing_account_name`.
     * </pre>
     *
     * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
     */
    public com.google.cloud.billing.v1.ProjectBillingInfoOrBuilder getProjectBillingInfoOrBuilder() {
      if (projectBillingInfoBuilder_ != null) {
        return projectBillingInfoBuilder_.getMessageOrBuilder();
      } else {
        return projectBillingInfo_ == null ?
            com.google.cloud.billing.v1.ProjectBillingInfo.getDefaultInstance() : projectBillingInfo_;
      }
    }
    /**
     * <pre>
     * The new billing information for the project. Read-only fields are ignored;
     * thus, you can leave empty all fields except `billing_account_name`.
     * </pre>
     *
     * <code>.google.cloud.billing.v1.ProjectBillingInfo project_billing_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.billing.v1.ProjectBillingInfo, com.google.cloud.billing.v1.ProjectBillingInfo.Builder, com.google.cloud.billing.v1.ProjectBillingInfoOrBuilder> 
        getProjectBillingInfoFieldBuilder() {
      if (projectBillingInfoBuilder_ == null) {
        projectBillingInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.billing.v1.ProjectBillingInfo, com.google.cloud.billing.v1.ProjectBillingInfo.Builder, com.google.cloud.billing.v1.ProjectBillingInfoOrBuilder>(
                getProjectBillingInfo(),
                getParentForChildren(),
                isClean());
        projectBillingInfo_ = null;
      }
      return projectBillingInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.billing.v1.UpdateProjectBillingInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.v1.UpdateProjectBillingInfoRequest)
  private static final com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest();
  }

  public static com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateProjectBillingInfoRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateProjectBillingInfoRequest>() {
    @java.lang.Override
    public UpdateProjectBillingInfoRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateProjectBillingInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateProjectBillingInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

