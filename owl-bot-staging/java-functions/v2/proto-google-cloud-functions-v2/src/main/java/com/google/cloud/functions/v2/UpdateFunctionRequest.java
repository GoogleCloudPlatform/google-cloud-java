// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2/functions.proto

package com.google.cloud.functions.v2;

/**
 * <pre>
 * Request for the `UpdateFunction` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v2.UpdateFunctionRequest}
 */
public final class UpdateFunctionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v2.UpdateFunctionRequest)
    UpdateFunctionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateFunctionRequest.newBuilder() to construct.
  private UpdateFunctionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateFunctionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateFunctionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_UpdateFunctionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_UpdateFunctionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v2.UpdateFunctionRequest.class, com.google.cloud.functions.v2.UpdateFunctionRequest.Builder.class);
  }

  public static final int FUNCTION_FIELD_NUMBER = 1;
  private com.google.cloud.functions.v2.Function function_;
  /**
   * <pre>
   * Required. New version of the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the function field is set.
   */
  @java.lang.Override
  public boolean hasFunction() {
    return function_ != null;
  }
  /**
   * <pre>
   * Required. New version of the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The function.
   */
  @java.lang.Override
  public com.google.cloud.functions.v2.Function getFunction() {
    return function_ == null ? com.google.cloud.functions.v2.Function.getDefaultInstance() : function_;
  }
  /**
   * <pre>
   * Required. New version of the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.functions.v2.FunctionOrBuilder getFunctionOrBuilder() {
    return getFunction();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The list of fields to be updated.
   * If no field mask is provided, all provided fields in the request will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The list of fields to be updated.
   * If no field mask is provided, all provided fields in the request will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The list of fields to be updated.
   * If no field mask is provided, all provided fields in the request will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (function_ != null) {
      output.writeMessage(1, getFunction());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (function_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFunction());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.functions.v2.UpdateFunctionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v2.UpdateFunctionRequest other = (com.google.cloud.functions.v2.UpdateFunctionRequest) obj;

    if (hasFunction() != other.hasFunction()) return false;
    if (hasFunction()) {
      if (!getFunction()
          .equals(other.getFunction())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasFunction()) {
      hash = (37 * hash) + FUNCTION_FIELD_NUMBER;
      hash = (53 * hash) + getFunction().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v2.UpdateFunctionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.functions.v2.UpdateFunctionRequest prototype) {
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
   * Request for the `UpdateFunction` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v2.UpdateFunctionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v2.UpdateFunctionRequest)
      com.google.cloud.functions.v2.UpdateFunctionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_UpdateFunctionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_UpdateFunctionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v2.UpdateFunctionRequest.class, com.google.cloud.functions.v2.UpdateFunctionRequest.Builder.class);
    }

    // Construct using com.google.cloud.functions.v2.UpdateFunctionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (functionBuilder_ == null) {
        function_ = null;
      } else {
        function_ = null;
        functionBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.functions.v2.FunctionsProto.internal_static_google_cloud_functions_v2_UpdateFunctionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2.UpdateFunctionRequest getDefaultInstanceForType() {
      return com.google.cloud.functions.v2.UpdateFunctionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v2.UpdateFunctionRequest build() {
      com.google.cloud.functions.v2.UpdateFunctionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2.UpdateFunctionRequest buildPartial() {
      com.google.cloud.functions.v2.UpdateFunctionRequest result = new com.google.cloud.functions.v2.UpdateFunctionRequest(this);
      if (functionBuilder_ == null) {
        result.function_ = function_;
      } else {
        result.function_ = functionBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.functions.v2.UpdateFunctionRequest) {
        return mergeFrom((com.google.cloud.functions.v2.UpdateFunctionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v2.UpdateFunctionRequest other) {
      if (other == com.google.cloud.functions.v2.UpdateFunctionRequest.getDefaultInstance()) return this;
      if (other.hasFunction()) {
        mergeFunction(other.getFunction());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
              input.readMessage(
                  getFunctionFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private com.google.cloud.functions.v2.Function function_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v2.Function, com.google.cloud.functions.v2.Function.Builder, com.google.cloud.functions.v2.FunctionOrBuilder> functionBuilder_;
    /**
     * <pre>
     * Required. New version of the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the function field is set.
     */
    public boolean hasFunction() {
      return functionBuilder_ != null || function_ != null;
    }
    /**
     * <pre>
     * Required. New version of the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The function.
     */
    public com.google.cloud.functions.v2.Function getFunction() {
      if (functionBuilder_ == null) {
        return function_ == null ? com.google.cloud.functions.v2.Function.getDefaultInstance() : function_;
      } else {
        return functionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. New version of the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFunction(com.google.cloud.functions.v2.Function value) {
      if (functionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        function_ = value;
        onChanged();
      } else {
        functionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. New version of the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFunction(
        com.google.cloud.functions.v2.Function.Builder builderForValue) {
      if (functionBuilder_ == null) {
        function_ = builderForValue.build();
        onChanged();
      } else {
        functionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. New version of the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeFunction(com.google.cloud.functions.v2.Function value) {
      if (functionBuilder_ == null) {
        if (function_ != null) {
          function_ =
            com.google.cloud.functions.v2.Function.newBuilder(function_).mergeFrom(value).buildPartial();
        } else {
          function_ = value;
        }
        onChanged();
      } else {
        functionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. New version of the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearFunction() {
      if (functionBuilder_ == null) {
        function_ = null;
        onChanged();
      } else {
        function_ = null;
        functionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. New version of the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.functions.v2.Function.Builder getFunctionBuilder() {
      
      onChanged();
      return getFunctionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. New version of the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.functions.v2.FunctionOrBuilder getFunctionOrBuilder() {
      if (functionBuilder_ != null) {
        return functionBuilder_.getMessageOrBuilder();
      } else {
        return function_ == null ?
            com.google.cloud.functions.v2.Function.getDefaultInstance() : function_;
      }
    }
    /**
     * <pre>
     * Required. New version of the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v2.Function function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v2.Function, com.google.cloud.functions.v2.Function.Builder, com.google.cloud.functions.v2.FunctionOrBuilder> 
        getFunctionFieldBuilder() {
      if (functionBuilder_ == null) {
        functionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2.Function, com.google.cloud.functions.v2.Function.Builder, com.google.cloud.functions.v2.FunctionOrBuilder>(
                getFunction(),
                getParentForChildren(),
                isClean());
        function_ = null;
      }
      return functionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The list of fields to be updated.
     * If no field mask is provided, all provided fields in the request will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * The list of fields to be updated.
     * If no field mask is provided, all provided fields in the request will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The list of fields to be updated.
     * If no field mask is provided, all provided fields in the request will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated.
     * If no field mask is provided, all provided fields in the request will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated.
     * If no field mask is provided, all provided fields in the request will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated.
     * If no field mask is provided, all provided fields in the request will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated.
     * If no field mask is provided, all provided fields in the request will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The list of fields to be updated.
     * If no field mask is provided, all provided fields in the request will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The list of fields to be updated.
     * If no field mask is provided, all provided fields in the request will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v2.UpdateFunctionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v2.UpdateFunctionRequest)
  private static final com.google.cloud.functions.v2.UpdateFunctionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v2.UpdateFunctionRequest();
  }

  public static com.google.cloud.functions.v2.UpdateFunctionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFunctionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateFunctionRequest>() {
    @java.lang.Override
    public UpdateFunctionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateFunctionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFunctionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v2.UpdateFunctionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

