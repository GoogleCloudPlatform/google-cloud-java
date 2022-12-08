// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/unmanaged_container_model.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Contains model information necessary to perform batch prediction without
 * requiring a full model import.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.UnmanagedContainerModel}
 */
public final class UnmanagedContainerModel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.UnmanagedContainerModel)
    UnmanagedContainerModelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnmanagedContainerModel.newBuilder() to construct.
  private UnmanagedContainerModel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnmanagedContainerModel() {
    artifactUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnmanagedContainerModel();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.UnmanagedContainerModelProto.internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.UnmanagedContainerModelProto.internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.UnmanagedContainerModel.class, com.google.cloud.aiplatform.v1.UnmanagedContainerModel.Builder.class);
  }

  public static final int ARTIFACT_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object artifactUri_;
  /**
   * <pre>
   * The path to the directory containing the Model artifact and any of its
   * supporting files.
   * </pre>
   *
   * <code>string artifact_uri = 1;</code>
   * @return The artifactUri.
   */
  @java.lang.Override
  public java.lang.String getArtifactUri() {
    java.lang.Object ref = artifactUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      artifactUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The path to the directory containing the Model artifact and any of its
   * supporting files.
   * </pre>
   *
   * <code>string artifact_uri = 1;</code>
   * @return The bytes for artifactUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArtifactUriBytes() {
    java.lang.Object ref = artifactUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      artifactUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREDICT_SCHEMATA_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.PredictSchemata predictSchemata_;
  /**
   * <pre>
   * Contains the schemata used in Model's predictions and explanations
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
   * @return Whether the predictSchemata field is set.
   */
  @java.lang.Override
  public boolean hasPredictSchemata() {
    return predictSchemata_ != null;
  }
  /**
   * <pre>
   * Contains the schemata used in Model's predictions and explanations
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
   * @return The predictSchemata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.PredictSchemata getPredictSchemata() {
    return predictSchemata_ == null ? com.google.cloud.aiplatform.v1.PredictSchemata.getDefaultInstance() : predictSchemata_;
  }
  /**
   * <pre>
   * Contains the schemata used in Model's predictions and explanations
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.PredictSchemataOrBuilder getPredictSchemataOrBuilder() {
    return getPredictSchemata();
  }

  public static final int CONTAINER_SPEC_FIELD_NUMBER = 3;
  private com.google.cloud.aiplatform.v1.ModelContainerSpec containerSpec_;
  /**
   * <pre>
   * Input only. The specification of the container that is to be used when deploying
   * this Model.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return Whether the containerSpec field is set.
   */
  @java.lang.Override
  public boolean hasContainerSpec() {
    return containerSpec_ != null;
  }
  /**
   * <pre>
   * Input only. The specification of the container that is to be used when deploying
   * this Model.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The containerSpec.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ModelContainerSpec getContainerSpec() {
    return containerSpec_ == null ? com.google.cloud.aiplatform.v1.ModelContainerSpec.getDefaultInstance() : containerSpec_;
  }
  /**
   * <pre>
   * Input only. The specification of the container that is to be used when deploying
   * this Model.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ModelContainerSpecOrBuilder getContainerSpecOrBuilder() {
    return getContainerSpec();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifactUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, artifactUri_);
    }
    if (predictSchemata_ != null) {
      output.writeMessage(2, getPredictSchemata());
    }
    if (containerSpec_ != null) {
      output.writeMessage(3, getContainerSpec());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifactUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, artifactUri_);
    }
    if (predictSchemata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPredictSchemata());
    }
    if (containerSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getContainerSpec());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.UnmanagedContainerModel)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.UnmanagedContainerModel other = (com.google.cloud.aiplatform.v1.UnmanagedContainerModel) obj;

    if (!getArtifactUri()
        .equals(other.getArtifactUri())) return false;
    if (hasPredictSchemata() != other.hasPredictSchemata()) return false;
    if (hasPredictSchemata()) {
      if (!getPredictSchemata()
          .equals(other.getPredictSchemata())) return false;
    }
    if (hasContainerSpec() != other.hasContainerSpec()) return false;
    if (hasContainerSpec()) {
      if (!getContainerSpec()
          .equals(other.getContainerSpec())) return false;
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
    hash = (37 * hash) + ARTIFACT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getArtifactUri().hashCode();
    if (hasPredictSchemata()) {
      hash = (37 * hash) + PREDICT_SCHEMATA_FIELD_NUMBER;
      hash = (53 * hash) + getPredictSchemata().hashCode();
    }
    if (hasContainerSpec()) {
      hash = (37 * hash) + CONTAINER_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getContainerSpec().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.UnmanagedContainerModel prototype) {
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
   * Contains model information necessary to perform batch prediction without
   * requiring a full model import.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.UnmanagedContainerModel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.UnmanagedContainerModel)
      com.google.cloud.aiplatform.v1.UnmanagedContainerModelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.UnmanagedContainerModelProto.internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.UnmanagedContainerModelProto.internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.UnmanagedContainerModel.class, com.google.cloud.aiplatform.v1.UnmanagedContainerModel.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.UnmanagedContainerModel.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      artifactUri_ = "";

      if (predictSchemataBuilder_ == null) {
        predictSchemata_ = null;
      } else {
        predictSchemata_ = null;
        predictSchemataBuilder_ = null;
      }
      if (containerSpecBuilder_ == null) {
        containerSpec_ = null;
      } else {
        containerSpec_ = null;
        containerSpecBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.UnmanagedContainerModelProto.internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UnmanagedContainerModel getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.UnmanagedContainerModel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UnmanagedContainerModel build() {
      com.google.cloud.aiplatform.v1.UnmanagedContainerModel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UnmanagedContainerModel buildPartial() {
      com.google.cloud.aiplatform.v1.UnmanagedContainerModel result = new com.google.cloud.aiplatform.v1.UnmanagedContainerModel(this);
      result.artifactUri_ = artifactUri_;
      if (predictSchemataBuilder_ == null) {
        result.predictSchemata_ = predictSchemata_;
      } else {
        result.predictSchemata_ = predictSchemataBuilder_.build();
      }
      if (containerSpecBuilder_ == null) {
        result.containerSpec_ = containerSpec_;
      } else {
        result.containerSpec_ = containerSpecBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.UnmanagedContainerModel) {
        return mergeFrom((com.google.cloud.aiplatform.v1.UnmanagedContainerModel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.UnmanagedContainerModel other) {
      if (other == com.google.cloud.aiplatform.v1.UnmanagedContainerModel.getDefaultInstance()) return this;
      if (!other.getArtifactUri().isEmpty()) {
        artifactUri_ = other.artifactUri_;
        onChanged();
      }
      if (other.hasPredictSchemata()) {
        mergePredictSchemata(other.getPredictSchemata());
      }
      if (other.hasContainerSpec()) {
        mergeContainerSpec(other.getContainerSpec());
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
              artifactUri_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPredictSchemataFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getContainerSpecFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object artifactUri_ = "";
    /**
     * <pre>
     * The path to the directory containing the Model artifact and any of its
     * supporting files.
     * </pre>
     *
     * <code>string artifact_uri = 1;</code>
     * @return The artifactUri.
     */
    public java.lang.String getArtifactUri() {
      java.lang.Object ref = artifactUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        artifactUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The path to the directory containing the Model artifact and any of its
     * supporting files.
     * </pre>
     *
     * <code>string artifact_uri = 1;</code>
     * @return The bytes for artifactUri.
     */
    public com.google.protobuf.ByteString
        getArtifactUriBytes() {
      java.lang.Object ref = artifactUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        artifactUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The path to the directory containing the Model artifact and any of its
     * supporting files.
     * </pre>
     *
     * <code>string artifact_uri = 1;</code>
     * @param value The artifactUri to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      artifactUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path to the directory containing the Model artifact and any of its
     * supporting files.
     * </pre>
     *
     * <code>string artifact_uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearArtifactUri() {
      
      artifactUri_ = getDefaultInstance().getArtifactUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path to the directory containing the Model artifact and any of its
     * supporting files.
     * </pre>
     *
     * <code>string artifact_uri = 1;</code>
     * @param value The bytes for artifactUri to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      artifactUri_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.PredictSchemata predictSchemata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.PredictSchemata, com.google.cloud.aiplatform.v1.PredictSchemata.Builder, com.google.cloud.aiplatform.v1.PredictSchemataOrBuilder> predictSchemataBuilder_;
    /**
     * <pre>
     * Contains the schemata used in Model's predictions and explanations
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
     * @return Whether the predictSchemata field is set.
     */
    public boolean hasPredictSchemata() {
      return predictSchemataBuilder_ != null || predictSchemata_ != null;
    }
    /**
     * <pre>
     * Contains the schemata used in Model's predictions and explanations
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
     * @return The predictSchemata.
     */
    public com.google.cloud.aiplatform.v1.PredictSchemata getPredictSchemata() {
      if (predictSchemataBuilder_ == null) {
        return predictSchemata_ == null ? com.google.cloud.aiplatform.v1.PredictSchemata.getDefaultInstance() : predictSchemata_;
      } else {
        return predictSchemataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Contains the schemata used in Model's predictions and explanations
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
     */
    public Builder setPredictSchemata(com.google.cloud.aiplatform.v1.PredictSchemata value) {
      if (predictSchemataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        predictSchemata_ = value;
        onChanged();
      } else {
        predictSchemataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contains the schemata used in Model's predictions and explanations
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
     */
    public Builder setPredictSchemata(
        com.google.cloud.aiplatform.v1.PredictSchemata.Builder builderForValue) {
      if (predictSchemataBuilder_ == null) {
        predictSchemata_ = builderForValue.build();
        onChanged();
      } else {
        predictSchemataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Contains the schemata used in Model's predictions and explanations
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
     */
    public Builder mergePredictSchemata(com.google.cloud.aiplatform.v1.PredictSchemata value) {
      if (predictSchemataBuilder_ == null) {
        if (predictSchemata_ != null) {
          predictSchemata_ =
            com.google.cloud.aiplatform.v1.PredictSchemata.newBuilder(predictSchemata_).mergeFrom(value).buildPartial();
        } else {
          predictSchemata_ = value;
        }
        onChanged();
      } else {
        predictSchemataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contains the schemata used in Model's predictions and explanations
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
     */
    public Builder clearPredictSchemata() {
      if (predictSchemataBuilder_ == null) {
        predictSchemata_ = null;
        onChanged();
      } else {
        predictSchemata_ = null;
        predictSchemataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Contains the schemata used in Model's predictions and explanations
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.PredictSchemata.Builder getPredictSchemataBuilder() {
      
      onChanged();
      return getPredictSchemataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains the schemata used in Model's predictions and explanations
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.PredictSchemataOrBuilder getPredictSchemataOrBuilder() {
      if (predictSchemataBuilder_ != null) {
        return predictSchemataBuilder_.getMessageOrBuilder();
      } else {
        return predictSchemata_ == null ?
            com.google.cloud.aiplatform.v1.PredictSchemata.getDefaultInstance() : predictSchemata_;
      }
    }
    /**
     * <pre>
     * Contains the schemata used in Model's predictions and explanations
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.PredictSchemata predict_schemata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.PredictSchemata, com.google.cloud.aiplatform.v1.PredictSchemata.Builder, com.google.cloud.aiplatform.v1.PredictSchemataOrBuilder> 
        getPredictSchemataFieldBuilder() {
      if (predictSchemataBuilder_ == null) {
        predictSchemataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.PredictSchemata, com.google.cloud.aiplatform.v1.PredictSchemata.Builder, com.google.cloud.aiplatform.v1.PredictSchemataOrBuilder>(
                getPredictSchemata(),
                getParentForChildren(),
                isClean());
        predictSchemata_ = null;
      }
      return predictSchemataBuilder_;
    }

    private com.google.cloud.aiplatform.v1.ModelContainerSpec containerSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.ModelContainerSpec, com.google.cloud.aiplatform.v1.ModelContainerSpec.Builder, com.google.cloud.aiplatform.v1.ModelContainerSpecOrBuilder> containerSpecBuilder_;
    /**
     * <pre>
     * Input only. The specification of the container that is to be used when deploying
     * this Model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     * @return Whether the containerSpec field is set.
     */
    public boolean hasContainerSpec() {
      return containerSpecBuilder_ != null || containerSpec_ != null;
    }
    /**
     * <pre>
     * Input only. The specification of the container that is to be used when deploying
     * this Model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     * @return The containerSpec.
     */
    public com.google.cloud.aiplatform.v1.ModelContainerSpec getContainerSpec() {
      if (containerSpecBuilder_ == null) {
        return containerSpec_ == null ? com.google.cloud.aiplatform.v1.ModelContainerSpec.getDefaultInstance() : containerSpec_;
      } else {
        return containerSpecBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Input only. The specification of the container that is to be used when deploying
     * this Model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder setContainerSpec(com.google.cloud.aiplatform.v1.ModelContainerSpec value) {
      if (containerSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        containerSpec_ = value;
        onChanged();
      } else {
        containerSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Input only. The specification of the container that is to be used when deploying
     * this Model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder setContainerSpec(
        com.google.cloud.aiplatform.v1.ModelContainerSpec.Builder builderForValue) {
      if (containerSpecBuilder_ == null) {
        containerSpec_ = builderForValue.build();
        onChanged();
      } else {
        containerSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Input only. The specification of the container that is to be used when deploying
     * this Model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder mergeContainerSpec(com.google.cloud.aiplatform.v1.ModelContainerSpec value) {
      if (containerSpecBuilder_ == null) {
        if (containerSpec_ != null) {
          containerSpec_ =
            com.google.cloud.aiplatform.v1.ModelContainerSpec.newBuilder(containerSpec_).mergeFrom(value).buildPartial();
        } else {
          containerSpec_ = value;
        }
        onChanged();
      } else {
        containerSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Input only. The specification of the container that is to be used when deploying
     * this Model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder clearContainerSpec() {
      if (containerSpecBuilder_ == null) {
        containerSpec_ = null;
        onChanged();
      } else {
        containerSpec_ = null;
        containerSpecBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Input only. The specification of the container that is to be used when deploying
     * this Model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1.ModelContainerSpec.Builder getContainerSpecBuilder() {
      
      onChanged();
      return getContainerSpecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Input only. The specification of the container that is to be used when deploying
     * this Model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1.ModelContainerSpecOrBuilder getContainerSpecOrBuilder() {
      if (containerSpecBuilder_ != null) {
        return containerSpecBuilder_.getMessageOrBuilder();
      } else {
        return containerSpec_ == null ?
            com.google.cloud.aiplatform.v1.ModelContainerSpec.getDefaultInstance() : containerSpec_;
      }
    }
    /**
     * <pre>
     * Input only. The specification of the container that is to be used when deploying
     * this Model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.ModelContainerSpec, com.google.cloud.aiplatform.v1.ModelContainerSpec.Builder, com.google.cloud.aiplatform.v1.ModelContainerSpecOrBuilder> 
        getContainerSpecFieldBuilder() {
      if (containerSpecBuilder_ == null) {
        containerSpecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ModelContainerSpec, com.google.cloud.aiplatform.v1.ModelContainerSpec.Builder, com.google.cloud.aiplatform.v1.ModelContainerSpecOrBuilder>(
                getContainerSpec(),
                getParentForChildren(),
                isClean());
        containerSpec_ = null;
      }
      return containerSpecBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.UnmanagedContainerModel)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.UnmanagedContainerModel)
  private static final com.google.cloud.aiplatform.v1.UnmanagedContainerModel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.UnmanagedContainerModel();
  }

  public static com.google.cloud.aiplatform.v1.UnmanagedContainerModel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnmanagedContainerModel>
      PARSER = new com.google.protobuf.AbstractParser<UnmanagedContainerModel>() {
    @java.lang.Override
    public UnmanagedContainerModel parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnmanagedContainerModel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnmanagedContainerModel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.UnmanagedContainerModel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

