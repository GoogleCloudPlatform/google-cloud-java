// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1/client_tls_policy.proto

package com.google.cloud.networksecurity.v1;

/**
 * <pre>
 * Request used by the CreateClientTlsPolicy method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest}
 */
public final class CreateClientTlsPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest)
    CreateClientTlsPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateClientTlsPolicyRequest.newBuilder() to construct.
  private CreateClientTlsPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateClientTlsPolicyRequest() {
    parent_ = "";
    clientTlsPolicyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateClientTlsPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networksecurity.v1.ClientTlsPolicyProto.internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networksecurity.v1.ClientTlsPolicyProto.internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest.class, com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent resource of the ClientTlsPolicy. Must be in
   * the format `projects/&#42;&#47;locations/{location}`.
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
   * Required. The parent resource of the ClientTlsPolicy. Must be in
   * the format `projects/&#42;&#47;locations/{location}`.
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

  public static final int CLIENT_TLS_POLICY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientTlsPolicyId_ = "";
  /**
   * <pre>
   * Required. Short name of the ClientTlsPolicy resource to be created. This value should
   * be 1-63 characters long, containing only letters, numbers, hyphens, and
   * underscores, and should not start with a number. E.g. "client_mtls_policy".
   * </pre>
   *
   * <code>string client_tls_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientTlsPolicyId.
   */
  @java.lang.Override
  public java.lang.String getClientTlsPolicyId() {
    java.lang.Object ref = clientTlsPolicyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientTlsPolicyId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Short name of the ClientTlsPolicy resource to be created. This value should
   * be 1-63 characters long, containing only letters, numbers, hyphens, and
   * underscores, and should not start with a number. E.g. "client_mtls_policy".
   * </pre>
   *
   * <code>string client_tls_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clientTlsPolicyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientTlsPolicyIdBytes() {
    java.lang.Object ref = clientTlsPolicyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientTlsPolicyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_TLS_POLICY_FIELD_NUMBER = 3;
  private com.google.cloud.networksecurity.v1.ClientTlsPolicy clientTlsPolicy_;
  /**
   * <pre>
   * Required. ClientTlsPolicy resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the clientTlsPolicy field is set.
   */
  @java.lang.Override
  public boolean hasClientTlsPolicy() {
    return clientTlsPolicy_ != null;
  }
  /**
   * <pre>
   * Required. ClientTlsPolicy resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientTlsPolicy.
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1.ClientTlsPolicy getClientTlsPolicy() {
    return clientTlsPolicy_ == null ? com.google.cloud.networksecurity.v1.ClientTlsPolicy.getDefaultInstance() : clientTlsPolicy_;
  }
  /**
   * <pre>
   * Required. ClientTlsPolicy resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1.ClientTlsPolicyOrBuilder getClientTlsPolicyOrBuilder() {
    return clientTlsPolicy_ == null ? com.google.cloud.networksecurity.v1.ClientTlsPolicy.getDefaultInstance() : clientTlsPolicy_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientTlsPolicyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientTlsPolicyId_);
    }
    if (clientTlsPolicy_ != null) {
      output.writeMessage(3, getClientTlsPolicy());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientTlsPolicyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientTlsPolicyId_);
    }
    if (clientTlsPolicy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getClientTlsPolicy());
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
    if (!(obj instanceof com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest other = (com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getClientTlsPolicyId()
        .equals(other.getClientTlsPolicyId())) return false;
    if (hasClientTlsPolicy() != other.hasClientTlsPolicy()) return false;
    if (hasClientTlsPolicy()) {
      if (!getClientTlsPolicy()
          .equals(other.getClientTlsPolicy())) return false;
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
    hash = (37 * hash) + CLIENT_TLS_POLICY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientTlsPolicyId().hashCode();
    if (hasClientTlsPolicy()) {
      hash = (37 * hash) + CLIENT_TLS_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getClientTlsPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest prototype) {
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
   * Request used by the CreateClientTlsPolicy method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest)
      com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networksecurity.v1.ClientTlsPolicyProto.internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networksecurity.v1.ClientTlsPolicyProto.internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest.class, com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest.newBuilder()
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
      parent_ = "";
      clientTlsPolicyId_ = "";
      clientTlsPolicy_ = null;
      if (clientTlsPolicyBuilder_ != null) {
        clientTlsPolicyBuilder_.dispose();
        clientTlsPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networksecurity.v1.ClientTlsPolicyProto.internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest build() {
      com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest buildPartial() {
      com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest result = new com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientTlsPolicyId_ = clientTlsPolicyId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.clientTlsPolicy_ = clientTlsPolicyBuilder_ == null
            ? clientTlsPolicy_
            : clientTlsPolicyBuilder_.build();
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
      if (other instanceof com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest) {
        return mergeFrom((com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest other) {
      if (other == com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClientTlsPolicyId().isEmpty()) {
        clientTlsPolicyId_ = other.clientTlsPolicyId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasClientTlsPolicy()) {
        mergeClientTlsPolicy(other.getClientTlsPolicy());
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
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              clientTlsPolicyId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getClientTlsPolicyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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
    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource of the ClientTlsPolicy. Must be in
     * the format `projects/&#42;&#47;locations/{location}`.
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
     * Required. The parent resource of the ClientTlsPolicy. Must be in
     * the format `projects/&#42;&#47;locations/{location}`.
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
     * Required. The parent resource of the ClientTlsPolicy. Must be in
     * the format `projects/&#42;&#47;locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource of the ClientTlsPolicy. Must be in
     * the format `projects/&#42;&#47;locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource of the ClientTlsPolicy. Must be in
     * the format `projects/&#42;&#47;locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object clientTlsPolicyId_ = "";
    /**
     * <pre>
     * Required. Short name of the ClientTlsPolicy resource to be created. This value should
     * be 1-63 characters long, containing only letters, numbers, hyphens, and
     * underscores, and should not start with a number. E.g. "client_mtls_policy".
     * </pre>
     *
     * <code>string client_tls_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The clientTlsPolicyId.
     */
    public java.lang.String getClientTlsPolicyId() {
      java.lang.Object ref = clientTlsPolicyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientTlsPolicyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Short name of the ClientTlsPolicy resource to be created. This value should
     * be 1-63 characters long, containing only letters, numbers, hyphens, and
     * underscores, and should not start with a number. E.g. "client_mtls_policy".
     * </pre>
     *
     * <code>string client_tls_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for clientTlsPolicyId.
     */
    public com.google.protobuf.ByteString
        getClientTlsPolicyIdBytes() {
      java.lang.Object ref = clientTlsPolicyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientTlsPolicyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Short name of the ClientTlsPolicy resource to be created. This value should
     * be 1-63 characters long, containing only letters, numbers, hyphens, and
     * underscores, and should not start with a number. E.g. "client_mtls_policy".
     * </pre>
     *
     * <code>string client_tls_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The clientTlsPolicyId to set.
     * @return This builder for chaining.
     */
    public Builder setClientTlsPolicyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientTlsPolicyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Short name of the ClientTlsPolicy resource to be created. This value should
     * be 1-63 characters long, containing only letters, numbers, hyphens, and
     * underscores, and should not start with a number. E.g. "client_mtls_policy".
     * </pre>
     *
     * <code>string client_tls_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientTlsPolicyId() {
      clientTlsPolicyId_ = getDefaultInstance().getClientTlsPolicyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Short name of the ClientTlsPolicy resource to be created. This value should
     * be 1-63 characters long, containing only letters, numbers, hyphens, and
     * underscores, and should not start with a number. E.g. "client_mtls_policy".
     * </pre>
     *
     * <code>string client_tls_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for clientTlsPolicyId to set.
     * @return This builder for chaining.
     */
    public Builder setClientTlsPolicyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientTlsPolicyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.networksecurity.v1.ClientTlsPolicy clientTlsPolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1.ClientTlsPolicy, com.google.cloud.networksecurity.v1.ClientTlsPolicy.Builder, com.google.cloud.networksecurity.v1.ClientTlsPolicyOrBuilder> clientTlsPolicyBuilder_;
    /**
     * <pre>
     * Required. ClientTlsPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the clientTlsPolicy field is set.
     */
    public boolean hasClientTlsPolicy() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. ClientTlsPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The clientTlsPolicy.
     */
    public com.google.cloud.networksecurity.v1.ClientTlsPolicy getClientTlsPolicy() {
      if (clientTlsPolicyBuilder_ == null) {
        return clientTlsPolicy_ == null ? com.google.cloud.networksecurity.v1.ClientTlsPolicy.getDefaultInstance() : clientTlsPolicy_;
      } else {
        return clientTlsPolicyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. ClientTlsPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setClientTlsPolicy(com.google.cloud.networksecurity.v1.ClientTlsPolicy value) {
      if (clientTlsPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientTlsPolicy_ = value;
      } else {
        clientTlsPolicyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ClientTlsPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setClientTlsPolicy(
        com.google.cloud.networksecurity.v1.ClientTlsPolicy.Builder builderForValue) {
      if (clientTlsPolicyBuilder_ == null) {
        clientTlsPolicy_ = builderForValue.build();
      } else {
        clientTlsPolicyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ClientTlsPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeClientTlsPolicy(com.google.cloud.networksecurity.v1.ClientTlsPolicy value) {
      if (clientTlsPolicyBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          clientTlsPolicy_ != null &&
          clientTlsPolicy_ != com.google.cloud.networksecurity.v1.ClientTlsPolicy.getDefaultInstance()) {
          getClientTlsPolicyBuilder().mergeFrom(value);
        } else {
          clientTlsPolicy_ = value;
        }
      } else {
        clientTlsPolicyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ClientTlsPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearClientTlsPolicy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      clientTlsPolicy_ = null;
      if (clientTlsPolicyBuilder_ != null) {
        clientTlsPolicyBuilder_.dispose();
        clientTlsPolicyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ClientTlsPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networksecurity.v1.ClientTlsPolicy.Builder getClientTlsPolicyBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getClientTlsPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. ClientTlsPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networksecurity.v1.ClientTlsPolicyOrBuilder getClientTlsPolicyOrBuilder() {
      if (clientTlsPolicyBuilder_ != null) {
        return clientTlsPolicyBuilder_.getMessageOrBuilder();
      } else {
        return clientTlsPolicy_ == null ?
            com.google.cloud.networksecurity.v1.ClientTlsPolicy.getDefaultInstance() : clientTlsPolicy_;
      }
    }
    /**
     * <pre>
     * Required. ClientTlsPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1.ClientTlsPolicy, com.google.cloud.networksecurity.v1.ClientTlsPolicy.Builder, com.google.cloud.networksecurity.v1.ClientTlsPolicyOrBuilder> 
        getClientTlsPolicyFieldBuilder() {
      if (clientTlsPolicyBuilder_ == null) {
        clientTlsPolicyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networksecurity.v1.ClientTlsPolicy, com.google.cloud.networksecurity.v1.ClientTlsPolicy.Builder, com.google.cloud.networksecurity.v1.ClientTlsPolicyOrBuilder>(
                getClientTlsPolicy(),
                getParentForChildren(),
                isClean());
        clientTlsPolicy_ = null;
      }
      return clientTlsPolicyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest)
  private static final com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest();
  }

  public static com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateClientTlsPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateClientTlsPolicyRequest>() {
    @java.lang.Override
    public CreateClientTlsPolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateClientTlsPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateClientTlsPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

