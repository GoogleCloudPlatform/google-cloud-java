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
// source: google/cloud/workstations/v1/workstations.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.workstations.v1;

/**
 *
 *
 * <pre>
 * Message for creating a CreateWorkstation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.workstations.v1.CreateWorkstationRequest}
 */
public final class CreateWorkstationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.workstations.v1.CreateWorkstationRequest)
    CreateWorkstationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWorkstationRequest.newBuilder() to construct.
  private CreateWorkstationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWorkstationRequest() {
    parent_ = "";
    workstationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateWorkstationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.workstations.v1.WorkstationsProto
        .internal_static_google_cloud_workstations_v1_CreateWorkstationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.workstations.v1.WorkstationsProto
        .internal_static_google_cloud_workstations_v1_CreateWorkstationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.workstations.v1.CreateWorkstationRequest.class,
            com.google.cloud.workstations.v1.CreateWorkstationRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKSTATION_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object workstationId_ = "";
  /**
   *
   *
   * <pre>
   * Required. ID to use for the workstation.
   * </pre>
   *
   * <code>string workstation_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The workstationId.
   */
  @java.lang.Override
  public java.lang.String getWorkstationId() {
    java.lang.Object ref = workstationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workstationId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. ID to use for the workstation.
   * </pre>
   *
   * <code>string workstation_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for workstationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWorkstationIdBytes() {
    java.lang.Object ref = workstationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      workstationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKSTATION_FIELD_NUMBER = 3;
  private com.google.cloud.workstations.v1.Workstation workstation_;
  /**
   *
   *
   * <pre>
   * Required. Workstation to create.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workstation field is set.
   */
  @java.lang.Override
  public boolean hasWorkstation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Workstation to create.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workstation.
   */
  @java.lang.Override
  public com.google.cloud.workstations.v1.Workstation getWorkstation() {
    return workstation_ == null
        ? com.google.cloud.workstations.v1.Workstation.getDefaultInstance()
        : workstation_;
  }
  /**
   *
   *
   * <pre>
   * Required. Workstation to create.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.workstations.v1.WorkstationOrBuilder getWorkstationOrBuilder() {
    return workstation_ == null
        ? com.google.cloud.workstations.v1.Workstation.getDefaultInstance()
        : workstation_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * Optional. If set, validate the request and preview the review, but do not
   * actually apply it.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workstationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, workstationId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getWorkstation());
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workstationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, workstationId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getWorkstation());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.workstations.v1.CreateWorkstationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.workstations.v1.CreateWorkstationRequest other =
        (com.google.cloud.workstations.v1.CreateWorkstationRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getWorkstationId().equals(other.getWorkstationId())) return false;
    if (hasWorkstation() != other.hasWorkstation()) return false;
    if (hasWorkstation()) {
      if (!getWorkstation().equals(other.getWorkstation())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    hash = (37 * hash) + WORKSTATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkstationId().hashCode();
    if (hasWorkstation()) {
      hash = (37 * hash) + WORKSTATION_FIELD_NUMBER;
      hash = (53 * hash) + getWorkstation().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest parseFrom(
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
      com.google.cloud.workstations.v1.CreateWorkstationRequest prototype) {
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
   * Message for creating a CreateWorkstation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.workstations.v1.CreateWorkstationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.workstations.v1.CreateWorkstationRequest)
      com.google.cloud.workstations.v1.CreateWorkstationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.workstations.v1.WorkstationsProto
          .internal_static_google_cloud_workstations_v1_CreateWorkstationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.workstations.v1.WorkstationsProto
          .internal_static_google_cloud_workstations_v1_CreateWorkstationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.workstations.v1.CreateWorkstationRequest.class,
              com.google.cloud.workstations.v1.CreateWorkstationRequest.Builder.class);
    }

    // Construct using com.google.cloud.workstations.v1.CreateWorkstationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWorkstationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      workstationId_ = "";
      workstation_ = null;
      if (workstationBuilder_ != null) {
        workstationBuilder_.dispose();
        workstationBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.workstations.v1.WorkstationsProto
          .internal_static_google_cloud_workstations_v1_CreateWorkstationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.workstations.v1.CreateWorkstationRequest getDefaultInstanceForType() {
      return com.google.cloud.workstations.v1.CreateWorkstationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.workstations.v1.CreateWorkstationRequest build() {
      com.google.cloud.workstations.v1.CreateWorkstationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.workstations.v1.CreateWorkstationRequest buildPartial() {
      com.google.cloud.workstations.v1.CreateWorkstationRequest result =
          new com.google.cloud.workstations.v1.CreateWorkstationRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.workstations.v1.CreateWorkstationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.workstationId_ = workstationId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.workstation_ =
            workstationBuilder_ == null ? workstation_ : workstationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.workstations.v1.CreateWorkstationRequest) {
        return mergeFrom((com.google.cloud.workstations.v1.CreateWorkstationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.workstations.v1.CreateWorkstationRequest other) {
      if (other == com.google.cloud.workstations.v1.CreateWorkstationRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWorkstationId().isEmpty()) {
        workstationId_ = other.workstationId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasWorkstation()) {
        mergeWorkstation(other.getWorkstation());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                workstationId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getWorkstationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object workstationId_ = "";
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation.
     * </pre>
     *
     * <code>string workstation_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The workstationId.
     */
    public java.lang.String getWorkstationId() {
      java.lang.Object ref = workstationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workstationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation.
     * </pre>
     *
     * <code>string workstation_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for workstationId.
     */
    public com.google.protobuf.ByteString getWorkstationIdBytes() {
      java.lang.Object ref = workstationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        workstationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation.
     * </pre>
     *
     * <code>string workstation_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The workstationId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkstationId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      workstationId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation.
     * </pre>
     *
     * <code>string workstation_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWorkstationId() {
      workstationId_ = getDefaultInstance().getWorkstationId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation.
     * </pre>
     *
     * <code>string workstation_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for workstationId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkstationIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      workstationId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.workstations.v1.Workstation workstation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workstations.v1.Workstation,
            com.google.cloud.workstations.v1.Workstation.Builder,
            com.google.cloud.workstations.v1.WorkstationOrBuilder>
        workstationBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Workstation to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the workstation field is set.
     */
    public boolean hasWorkstation() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The workstation.
     */
    public com.google.cloud.workstations.v1.Workstation getWorkstation() {
      if (workstationBuilder_ == null) {
        return workstation_ == null
            ? com.google.cloud.workstations.v1.Workstation.getDefaultInstance()
            : workstation_;
      } else {
        return workstationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkstation(com.google.cloud.workstations.v1.Workstation value) {
      if (workstationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workstation_ = value;
      } else {
        workstationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkstation(
        com.google.cloud.workstations.v1.Workstation.Builder builderForValue) {
      if (workstationBuilder_ == null) {
        workstation_ = builderForValue.build();
      } else {
        workstationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWorkstation(com.google.cloud.workstations.v1.Workstation value) {
      if (workstationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && workstation_ != null
            && workstation_ != com.google.cloud.workstations.v1.Workstation.getDefaultInstance()) {
          getWorkstationBuilder().mergeFrom(value);
        } else {
          workstation_ = value;
        }
      } else {
        workstationBuilder_.mergeFrom(value);
      }
      if (workstation_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWorkstation() {
      bitField0_ = (bitField0_ & ~0x00000004);
      workstation_ = null;
      if (workstationBuilder_ != null) {
        workstationBuilder_.dispose();
        workstationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workstations.v1.Workstation.Builder getWorkstationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getWorkstationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workstations.v1.WorkstationOrBuilder getWorkstationOrBuilder() {
      if (workstationBuilder_ != null) {
        return workstationBuilder_.getMessageOrBuilder();
      } else {
        return workstation_ == null
            ? com.google.cloud.workstations.v1.Workstation.getDefaultInstance()
            : workstation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.Workstation workstation = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workstations.v1.Workstation,
            com.google.cloud.workstations.v1.Workstation.Builder,
            com.google.cloud.workstations.v1.WorkstationOrBuilder>
        getWorkstationFieldBuilder() {
      if (workstationBuilder_ == null) {
        workstationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.workstations.v1.Workstation,
                com.google.cloud.workstations.v1.Workstation.Builder,
                com.google.cloud.workstations.v1.WorkstationOrBuilder>(
                getWorkstation(), getParentForChildren(), isClean());
        workstation_ = null;
      }
      return workstationBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Optional. If set, validate the request and preview the review, but do not
     * actually apply it.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * Optional. If set, validate the request and preview the review, but do not
     * actually apply it.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If set, validate the request and preview the review, but do not
     * actually apply it.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validateOnly_ = false;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.workstations.v1.CreateWorkstationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.workstations.v1.CreateWorkstationRequest)
  private static final com.google.cloud.workstations.v1.CreateWorkstationRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.workstations.v1.CreateWorkstationRequest();
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkstationRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateWorkstationRequest>() {
        @java.lang.Override
        public CreateWorkstationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateWorkstationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkstationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.workstations.v1.CreateWorkstationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
