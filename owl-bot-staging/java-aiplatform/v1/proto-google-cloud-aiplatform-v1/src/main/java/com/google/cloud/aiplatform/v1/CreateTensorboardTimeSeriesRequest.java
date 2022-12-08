// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Request message for [TensorboardService.CreateTensorboardTimeSeries][google.cloud.aiplatform.v1.TensorboardService.CreateTensorboardTimeSeries].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest}
 */
public final class CreateTensorboardTimeSeriesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest)
    CreateTensorboardTimeSeriesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTensorboardTimeSeriesRequest.newBuilder() to construct.
  private CreateTensorboardTimeSeriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTensorboardTimeSeriesRequest() {
    parent_ = "";
    tensorboardTimeSeriesId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTensorboardTimeSeriesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardTimeSeriesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardTimeSeriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest.class, com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The resource name of the TensorboardRun to create the
   * TensorboardTimeSeries in.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
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
   * Required. The resource name of the TensorboardRun to create the
   * TensorboardTimeSeries in.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
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

  public static final int TENSORBOARD_TIME_SERIES_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object tensorboardTimeSeriesId_;
  /**
   * <pre>
   * Optional. The user specified unique ID to use for the TensorboardTimeSeries, which
   * will become the final component of the TensorboardTimeSeries's resource
   * name.
   * This value should match "[a-z0-9][a-z0-9-]{0, 127}"
   * </pre>
   *
   * <code>string tensorboard_time_series_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The tensorboardTimeSeriesId.
   */
  @java.lang.Override
  public java.lang.String getTensorboardTimeSeriesId() {
    java.lang.Object ref = tensorboardTimeSeriesId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tensorboardTimeSeriesId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The user specified unique ID to use for the TensorboardTimeSeries, which
   * will become the final component of the TensorboardTimeSeries's resource
   * name.
   * This value should match "[a-z0-9][a-z0-9-]{0, 127}"
   * </pre>
   *
   * <code>string tensorboard_time_series_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for tensorboardTimeSeriesId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTensorboardTimeSeriesIdBytes() {
    java.lang.Object ref = tensorboardTimeSeriesId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tensorboardTimeSeriesId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENSORBOARD_TIME_SERIES_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboardTimeSeries_;
  /**
   * <pre>
   * Required. The TensorboardTimeSeries to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tensorboardTimeSeries field is set.
   */
  @java.lang.Override
  public boolean hasTensorboardTimeSeries() {
    return tensorboardTimeSeries_ != null;
  }
  /**
   * <pre>
   * Required. The TensorboardTimeSeries to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tensorboardTimeSeries.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardTimeSeries getTensorboardTimeSeries() {
    return tensorboardTimeSeries_ == null ? com.google.cloud.aiplatform.v1.TensorboardTimeSeries.getDefaultInstance() : tensorboardTimeSeries_;
  }
  /**
   * <pre>
   * Required. The TensorboardTimeSeries to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder getTensorboardTimeSeriesOrBuilder() {
    return getTensorboardTimeSeries();
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
    if (tensorboardTimeSeries_ != null) {
      output.writeMessage(2, getTensorboardTimeSeries());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tensorboardTimeSeriesId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tensorboardTimeSeriesId_);
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
    if (tensorboardTimeSeries_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTensorboardTimeSeries());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tensorboardTimeSeriesId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tensorboardTimeSeriesId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest other = (com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getTensorboardTimeSeriesId()
        .equals(other.getTensorboardTimeSeriesId())) return false;
    if (hasTensorboardTimeSeries() != other.hasTensorboardTimeSeries()) return false;
    if (hasTensorboardTimeSeries()) {
      if (!getTensorboardTimeSeries()
          .equals(other.getTensorboardTimeSeries())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + TENSORBOARD_TIME_SERIES_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTensorboardTimeSeriesId().hashCode();
    if (hasTensorboardTimeSeries()) {
      hash = (37 * hash) + TENSORBOARD_TIME_SERIES_FIELD_NUMBER;
      hash = (53 * hash) + getTensorboardTimeSeries().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest prototype) {
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
   * Request message for [TensorboardService.CreateTensorboardTimeSeries][google.cloud.aiplatform.v1.TensorboardService.CreateTensorboardTimeSeries].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest)
      com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardTimeSeriesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardTimeSeriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest.class, com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      tensorboardTimeSeriesId_ = "";

      if (tensorboardTimeSeriesBuilder_ == null) {
        tensorboardTimeSeries_ = null;
      } else {
        tensorboardTimeSeries_ = null;
        tensorboardTimeSeriesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1_CreateTensorboardTimeSeriesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest build() {
      com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest buildPartial() {
      com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest result = new com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest(this);
      result.parent_ = parent_;
      result.tensorboardTimeSeriesId_ = tensorboardTimeSeriesId_;
      if (tensorboardTimeSeriesBuilder_ == null) {
        result.tensorboardTimeSeries_ = tensorboardTimeSeries_;
      } else {
        result.tensorboardTimeSeries_ = tensorboardTimeSeriesBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest other) {
      if (other == com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getTensorboardTimeSeriesId().isEmpty()) {
        tensorboardTimeSeriesId_ = other.tensorboardTimeSeriesId_;
        onChanged();
      }
      if (other.hasTensorboardTimeSeries()) {
        mergeTensorboardTimeSeries(other.getTensorboardTimeSeries());
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

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTensorboardTimeSeriesFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              tensorboardTimeSeriesId_ = input.readStringRequireUtf8();

              break;
            } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the TensorboardRun to create the
     * TensorboardTimeSeries in.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
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
     * Required. The resource name of the TensorboardRun to create the
     * TensorboardTimeSeries in.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
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
     * Required. The resource name of the TensorboardRun to create the
     * TensorboardTimeSeries in.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the TensorboardRun to create the
     * TensorboardTimeSeries in.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the TensorboardRun to create the
     * TensorboardTimeSeries in.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tensorboardTimeSeriesId_ = "";
    /**
     * <pre>
     * Optional. The user specified unique ID to use for the TensorboardTimeSeries, which
     * will become the final component of the TensorboardTimeSeries's resource
     * name.
     * This value should match "[a-z0-9][a-z0-9-]{0, 127}"
     * </pre>
     *
     * <code>string tensorboard_time_series_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The tensorboardTimeSeriesId.
     */
    public java.lang.String getTensorboardTimeSeriesId() {
      java.lang.Object ref = tensorboardTimeSeriesId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tensorboardTimeSeriesId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The user specified unique ID to use for the TensorboardTimeSeries, which
     * will become the final component of the TensorboardTimeSeries's resource
     * name.
     * This value should match "[a-z0-9][a-z0-9-]{0, 127}"
     * </pre>
     *
     * <code>string tensorboard_time_series_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for tensorboardTimeSeriesId.
     */
    public com.google.protobuf.ByteString
        getTensorboardTimeSeriesIdBytes() {
      java.lang.Object ref = tensorboardTimeSeriesId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tensorboardTimeSeriesId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The user specified unique ID to use for the TensorboardTimeSeries, which
     * will become the final component of the TensorboardTimeSeries's resource
     * name.
     * This value should match "[a-z0-9][a-z0-9-]{0, 127}"
     * </pre>
     *
     * <code>string tensorboard_time_series_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The tensorboardTimeSeriesId to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboardTimeSeriesId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tensorboardTimeSeriesId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The user specified unique ID to use for the TensorboardTimeSeries, which
     * will become the final component of the TensorboardTimeSeries's resource
     * name.
     * This value should match "[a-z0-9][a-z0-9-]{0, 127}"
     * </pre>
     *
     * <code>string tensorboard_time_series_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearTensorboardTimeSeriesId() {
      
      tensorboardTimeSeriesId_ = getDefaultInstance().getTensorboardTimeSeriesId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The user specified unique ID to use for the TensorboardTimeSeries, which
     * will become the final component of the TensorboardTimeSeries's resource
     * name.
     * This value should match "[a-z0-9][a-z0-9-]{0, 127}"
     * </pre>
     *
     * <code>string tensorboard_time_series_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for tensorboardTimeSeriesId to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboardTimeSeriesIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tensorboardTimeSeriesId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboardTimeSeries_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.TensorboardTimeSeries, com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder, com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder> tensorboardTimeSeriesBuilder_;
    /**
     * <pre>
     * Required. The TensorboardTimeSeries to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the tensorboardTimeSeries field is set.
     */
    public boolean hasTensorboardTimeSeries() {
      return tensorboardTimeSeriesBuilder_ != null || tensorboardTimeSeries_ != null;
    }
    /**
     * <pre>
     * Required. The TensorboardTimeSeries to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tensorboardTimeSeries.
     */
    public com.google.cloud.aiplatform.v1.TensorboardTimeSeries getTensorboardTimeSeries() {
      if (tensorboardTimeSeriesBuilder_ == null) {
        return tensorboardTimeSeries_ == null ? com.google.cloud.aiplatform.v1.TensorboardTimeSeries.getDefaultInstance() : tensorboardTimeSeries_;
      } else {
        return tensorboardTimeSeriesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The TensorboardTimeSeries to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTensorboardTimeSeries(com.google.cloud.aiplatform.v1.TensorboardTimeSeries value) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensorboardTimeSeries_ = value;
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardTimeSeries to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTensorboardTimeSeries(
        com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder builderForValue) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        tensorboardTimeSeries_ = builderForValue.build();
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardTimeSeries to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTensorboardTimeSeries(com.google.cloud.aiplatform.v1.TensorboardTimeSeries value) {
      if (tensorboardTimeSeriesBuilder_ == null) {
        if (tensorboardTimeSeries_ != null) {
          tensorboardTimeSeries_ =
            com.google.cloud.aiplatform.v1.TensorboardTimeSeries.newBuilder(tensorboardTimeSeries_).mergeFrom(value).buildPartial();
        } else {
          tensorboardTimeSeries_ = value;
        }
        onChanged();
      } else {
        tensorboardTimeSeriesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardTimeSeries to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTensorboardTimeSeries() {
      if (tensorboardTimeSeriesBuilder_ == null) {
        tensorboardTimeSeries_ = null;
        onChanged();
      } else {
        tensorboardTimeSeries_ = null;
        tensorboardTimeSeriesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardTimeSeries to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder getTensorboardTimeSeriesBuilder() {
      
      onChanged();
      return getTensorboardTimeSeriesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The TensorboardTimeSeries to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder getTensorboardTimeSeriesOrBuilder() {
      if (tensorboardTimeSeriesBuilder_ != null) {
        return tensorboardTimeSeriesBuilder_.getMessageOrBuilder();
      } else {
        return tensorboardTimeSeries_ == null ?
            com.google.cloud.aiplatform.v1.TensorboardTimeSeries.getDefaultInstance() : tensorboardTimeSeries_;
      }
    }
    /**
     * <pre>
     * Required. The TensorboardTimeSeries to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.TensorboardTimeSeries, com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder, com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder> 
        getTensorboardTimeSeriesFieldBuilder() {
      if (tensorboardTimeSeriesBuilder_ == null) {
        tensorboardTimeSeriesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TensorboardTimeSeries, com.google.cloud.aiplatform.v1.TensorboardTimeSeries.Builder, com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder>(
                getTensorboardTimeSeries(),
                getParentForChildren(),
                isClean());
        tensorboardTimeSeries_ = null;
      }
      return tensorboardTimeSeriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest)
  private static final com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest();
  }

  public static com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTensorboardTimeSeriesRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTensorboardTimeSeriesRequest>() {
    @java.lang.Override
    public CreateTensorboardTimeSeriesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTensorboardTimeSeriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTensorboardTimeSeriesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

