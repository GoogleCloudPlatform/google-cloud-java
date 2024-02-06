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
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 3.25.2
package com.google.iam.admin.v1;

/**
 *
 *
 * <pre>
 * The service account keys list response.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.ListServiceAccountKeysResponse}
 */
public final class ListServiceAccountKeysResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.ListServiceAccountKeysResponse)
    ListServiceAccountKeysResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListServiceAccountKeysResponse.newBuilder() to construct.
  private ListServiceAccountKeysResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListServiceAccountKeysResponse() {
    keys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListServiceAccountKeysResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_ListServiceAccountKeysResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_ListServiceAccountKeysResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.ListServiceAccountKeysResponse.class,
            com.google.iam.admin.v1.ListServiceAccountKeysResponse.Builder.class);
  }

  public static final int KEYS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.iam.admin.v1.ServiceAccountKey> keys_;
  /**
   *
   *
   * <pre>
   * The public keys for the service account.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.iam.admin.v1.ServiceAccountKey> getKeysList() {
    return keys_;
  }
  /**
   *
   *
   * <pre>
   * The public keys for the service account.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.iam.admin.v1.ServiceAccountKeyOrBuilder>
      getKeysOrBuilderList() {
    return keys_;
  }
  /**
   *
   *
   * <pre>
   * The public keys for the service account.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
   */
  @java.lang.Override
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   *
   *
   * <pre>
   * The public keys for the service account.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
   */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccountKey getKeys(int index) {
    return keys_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The public keys for the service account.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
   */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccountKeyOrBuilder getKeysOrBuilder(int index) {
    return keys_.get(index);
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
    for (int i = 0; i < keys_.size(); i++) {
      output.writeMessage(1, keys_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < keys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, keys_.get(i));
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
    if (!(obj instanceof com.google.iam.admin.v1.ListServiceAccountKeysResponse)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.ListServiceAccountKeysResponse other =
        (com.google.iam.admin.v1.ListServiceAccountKeysResponse) obj;

    if (!getKeysList().equals(other.getKeysList())) return false;
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
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse parseFrom(
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
      com.google.iam.admin.v1.ListServiceAccountKeysResponse prototype) {
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
   * The service account keys list response.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.ListServiceAccountKeysResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.ListServiceAccountKeysResponse)
      com.google.iam.admin.v1.ListServiceAccountKeysResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_ListServiceAccountKeysResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_ListServiceAccountKeysResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.ListServiceAccountKeysResponse.class,
              com.google.iam.admin.v1.ListServiceAccountKeysResponse.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.ListServiceAccountKeysResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
      } else {
        keys_ = null;
        keysBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_ListServiceAccountKeysResponse_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.ListServiceAccountKeysResponse getDefaultInstanceForType() {
      return com.google.iam.admin.v1.ListServiceAccountKeysResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.ListServiceAccountKeysResponse build() {
      com.google.iam.admin.v1.ListServiceAccountKeysResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.ListServiceAccountKeysResponse buildPartial() {
      com.google.iam.admin.v1.ListServiceAccountKeysResponse result =
          new com.google.iam.admin.v1.ListServiceAccountKeysResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.iam.admin.v1.ListServiceAccountKeysResponse result) {
      if (keysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keys_ = java.util.Collections.unmodifiableList(keys_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keys_ = keys_;
      } else {
        result.keys_ = keysBuilder_.build();
      }
    }

    private void buildPartial0(com.google.iam.admin.v1.ListServiceAccountKeysResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.iam.admin.v1.ListServiceAccountKeysResponse) {
        return mergeFrom((com.google.iam.admin.v1.ListServiceAccountKeysResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.ListServiceAccountKeysResponse other) {
      if (other == com.google.iam.admin.v1.ListServiceAccountKeysResponse.getDefaultInstance())
        return this;
      if (keysBuilder_ == null) {
        if (!other.keys_.isEmpty()) {
          if (keys_.isEmpty()) {
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeysIsMutable();
            keys_.addAll(other.keys_);
          }
          onChanged();
        }
      } else {
        if (!other.keys_.isEmpty()) {
          if (keysBuilder_.isEmpty()) {
            keysBuilder_.dispose();
            keysBuilder_ = null;
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keysBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getKeysFieldBuilder()
                    : null;
          } else {
            keysBuilder_.addAllMessages(other.keys_);
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
                com.google.iam.admin.v1.ServiceAccountKey m =
                    input.readMessage(
                        com.google.iam.admin.v1.ServiceAccountKey.parser(), extensionRegistry);
                if (keysBuilder_ == null) {
                  ensureKeysIsMutable();
                  keys_.add(m);
                } else {
                  keysBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.iam.admin.v1.ServiceAccountKey> keys_ =
        java.util.Collections.emptyList();

    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keys_ = new java.util.ArrayList<com.google.iam.admin.v1.ServiceAccountKey>(keys_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.iam.admin.v1.ServiceAccountKey,
            com.google.iam.admin.v1.ServiceAccountKey.Builder,
            com.google.iam.admin.v1.ServiceAccountKeyOrBuilder>
        keysBuilder_;

    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public java.util.List<com.google.iam.admin.v1.ServiceAccountKey> getKeysList() {
      if (keysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keys_);
      } else {
        return keysBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public int getKeysCount() {
      if (keysBuilder_ == null) {
        return keys_.size();
      } else {
        return keysBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public com.google.iam.admin.v1.ServiceAccountKey getKeys(int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);
      } else {
        return keysBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public Builder setKeys(int index, com.google.iam.admin.v1.ServiceAccountKey value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.set(index, value);
        onChanged();
      } else {
        keysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public Builder setKeys(
        int index, com.google.iam.admin.v1.ServiceAccountKey.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.set(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public Builder addKeys(com.google.iam.admin.v1.ServiceAccountKey value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(value);
        onChanged();
      } else {
        keysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public Builder addKeys(int index, com.google.iam.admin.v1.ServiceAccountKey value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(index, value);
        onChanged();
      } else {
        keysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public Builder addKeys(com.google.iam.admin.v1.ServiceAccountKey.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public Builder addKeys(
        int index, com.google.iam.admin.v1.ServiceAccountKey.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends com.google.iam.admin.v1.ServiceAccountKey> values) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, keys_);
        onChanged();
      } else {
        keysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public Builder clearKeys() {
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keysBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public Builder removeKeys(int index) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.remove(index);
        onChanged();
      } else {
        keysBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public com.google.iam.admin.v1.ServiceAccountKey.Builder getKeysBuilder(int index) {
      return getKeysFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public com.google.iam.admin.v1.ServiceAccountKeyOrBuilder getKeysOrBuilder(int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);
      } else {
        return keysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public java.util.List<? extends com.google.iam.admin.v1.ServiceAccountKeyOrBuilder>
        getKeysOrBuilderList() {
      if (keysBuilder_ != null) {
        return keysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keys_);
      }
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public com.google.iam.admin.v1.ServiceAccountKey.Builder addKeysBuilder() {
      return getKeysFieldBuilder()
          .addBuilder(com.google.iam.admin.v1.ServiceAccountKey.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public com.google.iam.admin.v1.ServiceAccountKey.Builder addKeysBuilder(int index) {
      return getKeysFieldBuilder()
          .addBuilder(index, com.google.iam.admin.v1.ServiceAccountKey.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The public keys for the service account.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.ServiceAccountKey keys = 1;</code>
     */
    public java.util.List<com.google.iam.admin.v1.ServiceAccountKey.Builder> getKeysBuilderList() {
      return getKeysFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.iam.admin.v1.ServiceAccountKey,
            com.google.iam.admin.v1.ServiceAccountKey.Builder,
            com.google.iam.admin.v1.ServiceAccountKeyOrBuilder>
        getKeysFieldBuilder() {
      if (keysBuilder_ == null) {
        keysBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.iam.admin.v1.ServiceAccountKey,
                com.google.iam.admin.v1.ServiceAccountKey.Builder,
                com.google.iam.admin.v1.ServiceAccountKeyOrBuilder>(
                keys_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        keys_ = null;
      }
      return keysBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.ListServiceAccountKeysResponse)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.ListServiceAccountKeysResponse)
  private static final com.google.iam.admin.v1.ListServiceAccountKeysResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.ListServiceAccountKeysResponse();
  }

  public static com.google.iam.admin.v1.ListServiceAccountKeysResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServiceAccountKeysResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListServiceAccountKeysResponse>() {
        @java.lang.Override
        public ListServiceAccountKeysResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListServiceAccountKeysResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServiceAccountKeysResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.ListServiceAccountKeysResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
