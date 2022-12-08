// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_image_segmentation.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

/**
 * <pre>
 * A TrainingJob that trains and uploads an AutoML Image Segmentation Model.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation}
 */
public final class AutoMlImageSegmentation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation)
    AutoMlImageSegmentationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoMlImageSegmentation.newBuilder() to construct.
  private AutoMlImageSegmentation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoMlImageSegmentation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutoMlImageSegmentation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLImageSegmentationProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLImageSegmentationProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation.class, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation.Builder.class);
  }

  public static final int INPUTS_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs_;
  /**
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
   * @return Whether the inputs field is set.
   */
  @java.lang.Override
  public boolean hasInputs() {
    return inputs_ != null;
  }
  /**
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
   * @return The inputs.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs getInputs() {
    return inputs_ == null ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.getDefaultInstance() : inputs_;
  }
  /**
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputsOrBuilder getInputsOrBuilder() {
    return getInputs();
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata_;
  /**
   * <pre>
   * The metadata information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <pre>
   * The metadata information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata getMetadata() {
    return metadata_ == null ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * The metadata information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadataOrBuilder getMetadataOrBuilder() {
    return getMetadata();
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
    if (inputs_ != null) {
      output.writeMessage(1, getInputs());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inputs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInputs());
    }
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadata());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation other = (com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation) obj;

    if (hasInputs() != other.hasInputs()) return false;
    if (hasInputs()) {
      if (!getInputs()
          .equals(other.getInputs())) return false;
    }
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    if (hasInputs()) {
      hash = (37 * hash) + INPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getInputs().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation prototype) {
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
   * A TrainingJob that trains and uploads an AutoML Image Segmentation Model.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation)
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLImageSegmentationProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLImageSegmentationProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation.class, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (inputsBuilder_ == null) {
        inputs_ = null;
      } else {
        inputs_ = null;
        inputsBuilder_ = null;
      }
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLImageSegmentationProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation build() {
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation buildPartial() {
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation result = new com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation(this);
      if (inputsBuilder_ == null) {
        result.inputs_ = inputs_;
      } else {
        result.inputs_ = inputsBuilder_.build();
      }
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation) {
        return mergeFrom((com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation other) {
      if (other == com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation.getDefaultInstance()) return this;
      if (other.hasInputs()) {
        mergeInputs(other.getInputs());
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
                  getInputsFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMetadataFieldBuilder().getBuilder(),
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

    private com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.Builder, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputsOrBuilder> inputsBuilder_;
    /**
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
     * @return Whether the inputs field is set.
     */
    public boolean hasInputs() {
      return inputsBuilder_ != null || inputs_ != null;
    }
    /**
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
     * @return The inputs.
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs getInputs() {
      if (inputsBuilder_ == null) {
        return inputs_ == null ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.getDefaultInstance() : inputs_;
      } else {
        return inputsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
     */
    public Builder setInputs(com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputs_ = value;
        onChanged();
      } else {
        inputsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
     */
    public Builder setInputs(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        inputs_ = builderForValue.build();
        onChanged();
      } else {
        inputsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
     */
    public Builder mergeInputs(com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs value) {
      if (inputsBuilder_ == null) {
        if (inputs_ != null) {
          inputs_ =
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.newBuilder(inputs_).mergeFrom(value).buildPartial();
        } else {
          inputs_ = value;
        }
        onChanged();
      } else {
        inputsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
     */
    public Builder clearInputs() {
      if (inputsBuilder_ == null) {
        inputs_ = null;
        onChanged();
      } else {
        inputs_ = null;
        inputsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.Builder getInputsBuilder() {
      
      onChanged();
      return getInputsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputsOrBuilder getInputsOrBuilder() {
      if (inputsBuilder_ != null) {
        return inputsBuilder_.getMessageOrBuilder();
      } else {
        return inputs_ == null ?
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.getDefaultInstance() : inputs_;
      }
    }
    /**
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs inputs = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.Builder, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputsOrBuilder> 
        getInputsFieldBuilder() {
      if (inputsBuilder_ == null) {
        inputsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.Builder, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputsOrBuilder>(
                getInputs(),
                getParentForChildren(),
                isClean());
        inputs_ = null;
      }
      return inputsBuilder_;
    }

    private com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.Builder, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadataOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * The metadata information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     * <pre>
     * The metadata information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
     * @return The metadata.
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The metadata information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
     */
    public Builder setMetadata(com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The metadata information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
     */
    public Builder setMetadata(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The metadata information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
     */
    public Builder mergeMetadata(com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.newBuilder(metadata_).mergeFrom(value).buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The metadata information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The metadata information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.Builder getMetadataBuilder() {
      
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The metadata information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * The metadata information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.Builder, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.Builder, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationMetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation)
  private static final com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation();
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlImageSegmentation>
      PARSER = new com.google.protobuf.AbstractParser<AutoMlImageSegmentation>() {
    @java.lang.Override
    public AutoMlImageSegmentation parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoMlImageSegmentation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlImageSegmentation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

