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
// source: google/dataflow/v1beta3/templates.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Metadata describing a template.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.TemplateMetadata}
 */
public final class TemplateMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.TemplateMetadata)
    TemplateMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TemplateMetadata.newBuilder() to construct.
  private TemplateMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TemplateMetadata() {
    name_ = "";
    description_ = "";
    parameters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TemplateMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.TemplatesProto
        .internal_static_google_dataflow_v1beta3_TemplateMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.TemplatesProto
        .internal_static_google_dataflow_v1beta3_TemplateMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.TemplateMetadata.class,
            com.google.dataflow.v1beta3.TemplateMetadata.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the template.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the template.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   *
   *
   * <pre>
   * Optional. A description of the template.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. A description of the template.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMETERS_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private java.util.List<com.google.dataflow.v1beta3.ParameterMetadata> parameters_;
  /**
   *
   *
   * <pre>
   * The parameters for the template.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.dataflow.v1beta3.ParameterMetadata> getParametersList() {
    return parameters_;
  }
  /**
   *
   *
   * <pre>
   * The parameters for the template.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.dataflow.v1beta3.ParameterMetadataOrBuilder>
      getParametersOrBuilderList() {
    return parameters_;
  }
  /**
   *
   *
   * <pre>
   * The parameters for the template.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
   */
  @java.lang.Override
  public int getParametersCount() {
    return parameters_.size();
  }
  /**
   *
   *
   * <pre>
   * The parameters for the template.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.ParameterMetadata getParameters(int index) {
    return parameters_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The parameters for the template.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.ParameterMetadataOrBuilder getParametersOrBuilder(int index) {
    return parameters_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    for (int i = 0; i < parameters_.size(); i++) {
      output.writeMessage(3, parameters_.get(i));
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    for (int i = 0; i < parameters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, parameters_.get(i));
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
    if (!(obj instanceof com.google.dataflow.v1beta3.TemplateMetadata)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.TemplateMetadata other =
        (com.google.dataflow.v1beta3.TemplateMetadata) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (!getParametersList().equals(other.getParametersList())) return false;
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
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (getParametersCount() > 0) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParametersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.TemplateMetadata prototype) {
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
   * Metadata describing a template.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.TemplateMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.TemplateMetadata)
      com.google.dataflow.v1beta3.TemplateMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_TemplateMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_TemplateMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.TemplateMetadata.class,
              com.google.dataflow.v1beta3.TemplateMetadata.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.TemplateMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      description_ = "";
      if (parametersBuilder_ == null) {
        parameters_ = java.util.Collections.emptyList();
      } else {
        parameters_ = null;
        parametersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_TemplateMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.TemplateMetadata getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.TemplateMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.TemplateMetadata build() {
      com.google.dataflow.v1beta3.TemplateMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.TemplateMetadata buildPartial() {
      com.google.dataflow.v1beta3.TemplateMetadata result =
          new com.google.dataflow.v1beta3.TemplateMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.dataflow.v1beta3.TemplateMetadata result) {
      if (parametersBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          parameters_ = java.util.Collections.unmodifiableList(parameters_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.parameters_ = parameters_;
      } else {
        result.parameters_ = parametersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.dataflow.v1beta3.TemplateMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
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
      if (other instanceof com.google.dataflow.v1beta3.TemplateMetadata) {
        return mergeFrom((com.google.dataflow.v1beta3.TemplateMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.TemplateMetadata other) {
      if (other == com.google.dataflow.v1beta3.TemplateMetadata.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (parametersBuilder_ == null) {
        if (!other.parameters_.isEmpty()) {
          if (parameters_.isEmpty()) {
            parameters_ = other.parameters_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureParametersIsMutable();
            parameters_.addAll(other.parameters_);
          }
          onChanged();
        }
      } else {
        if (!other.parameters_.isEmpty()) {
          if (parametersBuilder_.isEmpty()) {
            parametersBuilder_.dispose();
            parametersBuilder_ = null;
            parameters_ = other.parameters_;
            bitField0_ = (bitField0_ & ~0x00000004);
            parametersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getParametersFieldBuilder()
                    : null;
          } else {
            parametersBuilder_.addAllMessages(other.parameters_);
          }
        }
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                description_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                com.google.dataflow.v1beta3.ParameterMetadata m =
                    input.readMessage(
                        com.google.dataflow.v1beta3.ParameterMetadata.parser(), extensionRegistry);
                if (parametersBuilder_ == null) {
                  ensureParametersIsMutable();
                  parameters_.add(m);
                } else {
                  parametersBuilder_.addMessage(m);
                }
                break;
              } // case 26
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the template.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the template.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the template.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the template.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the template.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * Optional. A description of the template.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A description of the template.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A description of the template.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A description of the template.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A description of the template.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<com.google.dataflow.v1beta3.ParameterMetadata> parameters_ =
        java.util.Collections.emptyList();

    private void ensureParametersIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        parameters_ =
            new java.util.ArrayList<com.google.dataflow.v1beta3.ParameterMetadata>(parameters_);
        bitField0_ |= 0x00000004;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.ParameterMetadata,
            com.google.dataflow.v1beta3.ParameterMetadata.Builder,
            com.google.dataflow.v1beta3.ParameterMetadataOrBuilder>
        parametersBuilder_;

    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public java.util.List<com.google.dataflow.v1beta3.ParameterMetadata> getParametersList() {
      if (parametersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parameters_);
      } else {
        return parametersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public int getParametersCount() {
      if (parametersBuilder_ == null) {
        return parameters_.size();
      } else {
        return parametersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public com.google.dataflow.v1beta3.ParameterMetadata getParameters(int index) {
      if (parametersBuilder_ == null) {
        return parameters_.get(index);
      } else {
        return parametersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public Builder setParameters(int index, com.google.dataflow.v1beta3.ParameterMetadata value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParametersIsMutable();
        parameters_.set(index, value);
        onChanged();
      } else {
        parametersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public Builder setParameters(
        int index, com.google.dataflow.v1beta3.ParameterMetadata.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.set(index, builderForValue.build());
        onChanged();
      } else {
        parametersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public Builder addParameters(com.google.dataflow.v1beta3.ParameterMetadata value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParametersIsMutable();
        parameters_.add(value);
        onChanged();
      } else {
        parametersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public Builder addParameters(int index, com.google.dataflow.v1beta3.ParameterMetadata value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParametersIsMutable();
        parameters_.add(index, value);
        onChanged();
      } else {
        parametersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public Builder addParameters(
        com.google.dataflow.v1beta3.ParameterMetadata.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.add(builderForValue.build());
        onChanged();
      } else {
        parametersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public Builder addParameters(
        int index, com.google.dataflow.v1beta3.ParameterMetadata.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.add(index, builderForValue.build());
        onChanged();
      } else {
        parametersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public Builder addAllParameters(
        java.lang.Iterable<? extends com.google.dataflow.v1beta3.ParameterMetadata> values) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, parameters_);
        onChanged();
      } else {
        parametersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public Builder clearParameters() {
      if (parametersBuilder_ == null) {
        parameters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        parametersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public Builder removeParameters(int index) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.remove(index);
        onChanged();
      } else {
        parametersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public com.google.dataflow.v1beta3.ParameterMetadata.Builder getParametersBuilder(int index) {
      return getParametersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public com.google.dataflow.v1beta3.ParameterMetadataOrBuilder getParametersOrBuilder(
        int index) {
      if (parametersBuilder_ == null) {
        return parameters_.get(index);
      } else {
        return parametersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public java.util.List<? extends com.google.dataflow.v1beta3.ParameterMetadataOrBuilder>
        getParametersOrBuilderList() {
      if (parametersBuilder_ != null) {
        return parametersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parameters_);
      }
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public com.google.dataflow.v1beta3.ParameterMetadata.Builder addParametersBuilder() {
      return getParametersFieldBuilder()
          .addBuilder(com.google.dataflow.v1beta3.ParameterMetadata.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public com.google.dataflow.v1beta3.ParameterMetadata.Builder addParametersBuilder(int index) {
      return getParametersFieldBuilder()
          .addBuilder(index, com.google.dataflow.v1beta3.ParameterMetadata.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The parameters for the template.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.ParameterMetadata parameters = 3;</code>
     */
    public java.util.List<com.google.dataflow.v1beta3.ParameterMetadata.Builder>
        getParametersBuilderList() {
      return getParametersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.ParameterMetadata,
            com.google.dataflow.v1beta3.ParameterMetadata.Builder,
            com.google.dataflow.v1beta3.ParameterMetadataOrBuilder>
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.dataflow.v1beta3.ParameterMetadata,
                com.google.dataflow.v1beta3.ParameterMetadata.Builder,
                com.google.dataflow.v1beta3.ParameterMetadataOrBuilder>(
                parameters_, ((bitField0_ & 0x00000004) != 0), getParentForChildren(), isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.TemplateMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.TemplateMetadata)
  private static final com.google.dataflow.v1beta3.TemplateMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.TemplateMetadata();
  }

  public static com.google.dataflow.v1beta3.TemplateMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TemplateMetadata> PARSER =
      new com.google.protobuf.AbstractParser<TemplateMetadata>() {
        @java.lang.Override
        public TemplateMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<TemplateMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TemplateMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.TemplateMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
