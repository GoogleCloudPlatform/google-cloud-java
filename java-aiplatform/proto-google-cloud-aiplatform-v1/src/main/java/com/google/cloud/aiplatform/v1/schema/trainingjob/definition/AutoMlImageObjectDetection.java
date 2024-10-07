/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source:
// google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_image_object_detection.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

/**
 *
 *
 * <pre>
 * A TrainingJob that trains and uploads an AutoML Image Object Detection Model.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection}
 */
public final class AutoMlImageObjectDetection extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection)
    AutoMlImageObjectDetectionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoMlImageObjectDetection.newBuilder() to construct.
  private AutoMlImageObjectDetection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoMlImageObjectDetection() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoMlImageObjectDetection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.schema.trainingjob.definition
        .AutoMLImageObjectDetectionProto
        .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.schema.trainingjob.definition
        .AutoMLImageObjectDetectionProto
        .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
                .class,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
                .Builder.class);
  }

  private int bitField0_;
  public static final int INPUTS_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetectionInputs
      inputs_;
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
   * </code>
   *
   * @return Whether the inputs field is set.
   */
  @java.lang.Override
  public boolean hasInputs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
   * </code>
   *
   * @return The inputs.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetectionInputs
      getInputs() {
    return inputs_ == null
        ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionInputs.getDefaultInstance()
        : inputs_;
  }
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetectionInputsOrBuilder
      getInputsOrBuilder() {
    return inputs_ == null
        ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionInputs.getDefaultInstance()
        : inputs_;
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetectionMetadata
      metadata_;
  /**
   *
   *
   * <pre>
   * The metadata information
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
   * </code>
   *
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The metadata information
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
   * </code>
   *
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetectionMetadata
      getMetadata() {
    return metadata_ == null
        ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionMetadata.getDefaultInstance()
        : metadata_;
  }
  /**
   *
   *
   * <pre>
   * The metadata information
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetectionMetadataOrBuilder
      getMetadataOrBuilder() {
    return metadata_ == null
        ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionMetadata.getDefaultInstance()
        : metadata_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getInputs());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInputs());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetadata());
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
    if (!(obj
        instanceof
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection other =
        (com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection)
            obj;

    if (hasInputs() != other.hasInputs()) return false;
    if (hasInputs()) {
      if (!getInputs().equals(other.getInputs())) return false;
    }
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata().equals(other.getMetadata())) return false;
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

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
          prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A TrainingJob that trains and uploads an AutoML Image Object Detection Model.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection)
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMLImageObjectDetectionProto
          .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMLImageObjectDetectionProto
          .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                  .AutoMlImageObjectDetection.class,
              com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                  .AutoMlImageObjectDetection.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getInputsFieldBuilder();
        getMetadataFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      inputs_ = null;
      if (inputsBuilder_ != null) {
        inputsBuilder_.dispose();
        inputsBuilder_ = null;
      }
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMLImageObjectDetectionProto
          .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
        build() {
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
        buildPartial() {
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
          result =
              new com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                  .AutoMlImageObjectDetection(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
            result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inputs_ = inputsBuilder_ == null ? inputs_ : inputsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = metadataBuilder_ == null ? metadata_ : metadataBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other
          instanceof
          com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                    .AutoMlImageObjectDetection)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
            other) {
      if (other
          == com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
              .getDefaultInstance()) return this;
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
            case 10:
              {
                input.readMessage(getInputsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getMetadataFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
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

    private com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionInputs
        inputs_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputs,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputs.Builder,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputsOrBuilder>
        inputsBuilder_;
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
     * </code>
     *
     * @return Whether the inputs field is set.
     */
    public boolean hasInputs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
     * </code>
     *
     * @return The inputs.
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionInputs
        getInputs() {
      if (inputsBuilder_ == null) {
        return inputs_ == null
            ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputs.getDefaultInstance()
            : inputs_;
      } else {
        return inputsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
     * </code>
     */
    public Builder setInputs(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputs
            value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputs_ = value;
      } else {
        inputsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
     * </code>
     */
    public Builder setInputs(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputs.Builder
            builderForValue) {
      if (inputsBuilder_ == null) {
        inputs_ = builderForValue.build();
      } else {
        inputsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
     * </code>
     */
    public Builder mergeInputs(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputs
            value) {
      if (inputsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && inputs_ != null
            && inputs_
                != com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                    .AutoMlImageObjectDetectionInputs.getDefaultInstance()) {
          getInputsBuilder().mergeFrom(value);
        } else {
          inputs_ = value;
        }
      } else {
        inputsBuilder_.mergeFrom(value);
      }
      if (inputs_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
     * </code>
     */
    public Builder clearInputs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      inputs_ = null;
      if (inputsBuilder_ != null) {
        inputsBuilder_.dispose();
        inputsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionInputs.Builder
        getInputsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInputsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionInputsOrBuilder
        getInputsOrBuilder() {
      if (inputsBuilder_ != null) {
        return inputsBuilder_.getMessageOrBuilder();
      } else {
        return inputs_ == null
            ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputs.getDefaultInstance()
            : inputs_;
      }
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs inputs = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputs,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputs.Builder,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionInputsOrBuilder>
        getInputsFieldBuilder() {
      if (inputsBuilder_ == null) {
        inputsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                    .AutoMlImageObjectDetectionInputs,
                com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                    .AutoMlImageObjectDetectionInputs.Builder,
                com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                    .AutoMlImageObjectDetectionInputsOrBuilder>(
                getInputs(), getParentForChildren(), isClean());
        inputs_ = null;
      }
      return inputsBuilder_;
    }

    private com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionMetadata
        metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadata,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadata.Builder,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadataOrBuilder>
        metadataBuilder_;
    /**
     *
     *
     * <pre>
     * The metadata information
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
     * </code>
     *
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The metadata information
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
     * </code>
     *
     * @return The metadata.
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionMetadata
        getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null
            ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadata.getDefaultInstance()
            : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The metadata information
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
     * </code>
     */
    public Builder setMetadata(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadata
            value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metadata information
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
     * </code>
     */
    public Builder setMetadata(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadata.Builder
            builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metadata information
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
     * </code>
     */
    public Builder mergeMetadata(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadata
            value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && metadata_ != null
            && metadata_
                != com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                    .AutoMlImageObjectDetectionMetadata.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      if (metadata_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metadata information
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
     * </code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metadata information
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
     * </code>
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionMetadata.Builder
        getMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The metadata information
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
     * </code>
     */
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetectionMetadataOrBuilder
        getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null
            ? com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadata.getDefaultInstance()
            : metadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * The metadata information
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata metadata = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadata,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadata.Builder,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                .AutoMlImageObjectDetectionMetadataOrBuilder>
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                    .AutoMlImageObjectDetectionMetadata,
                com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                    .AutoMlImageObjectDetectionMetadata.Builder,
                com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                    .AutoMlImageObjectDetectionMetadataOrBuilder>(
                getMetadata(), getParentForChildren(), isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection)
  private static final com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1.schema.trainingjob.definition
            .AutoMlImageObjectDetection();
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlImageObjectDetection
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlImageObjectDetection> PARSER =
      new com.google.protobuf.AbstractParser<AutoMlImageObjectDetection>() {
        @java.lang.Override
        public AutoMlImageObjectDetection parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoMlImageObjectDetection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlImageObjectDetection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageObjectDetection
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
