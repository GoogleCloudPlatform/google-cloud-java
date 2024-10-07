/*
 * Copyright 2024 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/image.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * A set of properties that uniquely identify a given Docker image.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.Fingerprint}
 */
public final class Fingerprint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.Fingerprint)
    FingerprintOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Fingerprint.newBuilder() to construct.
  private Fingerprint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Fingerprint() {
    v1Name_ = "";
    v2Blob_ = com.google.protobuf.LazyStringArrayList.emptyList();
    v2Name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Fingerprint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Image.internal_static_grafeas_v1_Fingerprint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Image.internal_static_grafeas_v1_Fingerprint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.Fingerprint.class, io.grafeas.v1.Fingerprint.Builder.class);
  }

  public static final int V1_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object v1Name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The layer ID of the final layer in the Docker image's v1
   * representation.
   * </pre>
   *
   * <code>string v1_name = 1;</code>
   *
   * @return The v1Name.
   */
  @java.lang.Override
  public java.lang.String getV1Name() {
    java.lang.Object ref = v1Name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      v1Name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The layer ID of the final layer in the Docker image's v1
   * representation.
   * </pre>
   *
   * <code>string v1_name = 1;</code>
   *
   * @return The bytes for v1Name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getV1NameBytes() {
    java.lang.Object ref = v1Name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      v1Name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int V2_BLOB_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList v2Blob_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Required. The ordered list of v2 blobs that represent a given image.
   * </pre>
   *
   * <code>repeated string v2_blob = 2;</code>
   *
   * @return A list containing the v2Blob.
   */
  public com.google.protobuf.ProtocolStringList getV2BlobList() {
    return v2Blob_;
  }
  /**
   *
   *
   * <pre>
   * Required. The ordered list of v2 blobs that represent a given image.
   * </pre>
   *
   * <code>repeated string v2_blob = 2;</code>
   *
   * @return The count of v2Blob.
   */
  public int getV2BlobCount() {
    return v2Blob_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The ordered list of v2 blobs that represent a given image.
   * </pre>
   *
   * <code>repeated string v2_blob = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The v2Blob at the given index.
   */
  public java.lang.String getV2Blob(int index) {
    return v2Blob_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The ordered list of v2 blobs that represent a given image.
   * </pre>
   *
   * <code>repeated string v2_blob = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the v2Blob at the given index.
   */
  public com.google.protobuf.ByteString getV2BlobBytes(int index) {
    return v2Blob_.getByteString(index);
  }

  public static final int V2_NAME_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object v2Name_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The name of the image's v2 blobs computed via:
   *   [bottom] := v2_blob[bottom]
   *   [N] := sha256(v2_blob[N] + " " + v2_name[N+1])
   * Only the name of the final blob is kept.
   * </pre>
   *
   * <code>string v2_name = 3;</code>
   *
   * @return The v2Name.
   */
  @java.lang.Override
  public java.lang.String getV2Name() {
    java.lang.Object ref = v2Name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      v2Name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The name of the image's v2 blobs computed via:
   *   [bottom] := v2_blob[bottom]
   *   [N] := sha256(v2_blob[N] + " " + v2_name[N+1])
   * Only the name of the final blob is kept.
   * </pre>
   *
   * <code>string v2_name = 3;</code>
   *
   * @return The bytes for v2Name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getV2NameBytes() {
    java.lang.Object ref = v2Name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      v2Name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(v1Name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, v1Name_);
    }
    for (int i = 0; i < v2Blob_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, v2Blob_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(v2Name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, v2Name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(v1Name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, v1Name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < v2Blob_.size(); i++) {
        dataSize += computeStringSizeNoTag(v2Blob_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getV2BlobList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(v2Name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, v2Name_);
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
    if (!(obj instanceof io.grafeas.v1.Fingerprint)) {
      return super.equals(obj);
    }
    io.grafeas.v1.Fingerprint other = (io.grafeas.v1.Fingerprint) obj;

    if (!getV1Name().equals(other.getV1Name())) return false;
    if (!getV2BlobList().equals(other.getV2BlobList())) return false;
    if (!getV2Name().equals(other.getV2Name())) return false;
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
    hash = (37 * hash) + V1_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getV1Name().hashCode();
    if (getV2BlobCount() > 0) {
      hash = (37 * hash) + V2_BLOB_FIELD_NUMBER;
      hash = (53 * hash) + getV2BlobList().hashCode();
    }
    hash = (37 * hash) + V2_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getV2Name().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.Fingerprint parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Fingerprint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Fingerprint parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Fingerprint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Fingerprint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Fingerprint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Fingerprint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Fingerprint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Fingerprint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Fingerprint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Fingerprint parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Fingerprint parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.Fingerprint prototype) {
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
   * A set of properties that uniquely identify a given Docker image.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.Fingerprint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.Fingerprint)
      io.grafeas.v1.FingerprintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Image.internal_static_grafeas_v1_Fingerprint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Image.internal_static_grafeas_v1_Fingerprint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.Fingerprint.class, io.grafeas.v1.Fingerprint.Builder.class);
    }

    // Construct using io.grafeas.v1.Fingerprint.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      v1Name_ = "";
      v2Blob_ = com.google.protobuf.LazyStringArrayList.emptyList();
      v2Name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Image.internal_static_grafeas_v1_Fingerprint_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.Fingerprint getDefaultInstanceForType() {
      return io.grafeas.v1.Fingerprint.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.Fingerprint build() {
      io.grafeas.v1.Fingerprint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.Fingerprint buildPartial() {
      io.grafeas.v1.Fingerprint result = new io.grafeas.v1.Fingerprint(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.Fingerprint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.v1Name_ = v1Name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        v2Blob_.makeImmutable();
        result.v2Blob_ = v2Blob_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.v2Name_ = v2Name_;
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
      if (other instanceof io.grafeas.v1.Fingerprint) {
        return mergeFrom((io.grafeas.v1.Fingerprint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.Fingerprint other) {
      if (other == io.grafeas.v1.Fingerprint.getDefaultInstance()) return this;
      if (!other.getV1Name().isEmpty()) {
        v1Name_ = other.v1Name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.v2Blob_.isEmpty()) {
        if (v2Blob_.isEmpty()) {
          v2Blob_ = other.v2Blob_;
          bitField0_ |= 0x00000002;
        } else {
          ensureV2BlobIsMutable();
          v2Blob_.addAll(other.v2Blob_);
        }
        onChanged();
      }
      if (!other.getV2Name().isEmpty()) {
        v2Name_ = other.v2Name_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                v1Name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureV2BlobIsMutable();
                v2Blob_.add(s);
                break;
              } // case 18
            case 26:
              {
                v2Name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
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

    private java.lang.Object v1Name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The layer ID of the final layer in the Docker image's v1
     * representation.
     * </pre>
     *
     * <code>string v1_name = 1;</code>
     *
     * @return The v1Name.
     */
    public java.lang.String getV1Name() {
      java.lang.Object ref = v1Name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        v1Name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The layer ID of the final layer in the Docker image's v1
     * representation.
     * </pre>
     *
     * <code>string v1_name = 1;</code>
     *
     * @return The bytes for v1Name.
     */
    public com.google.protobuf.ByteString getV1NameBytes() {
      java.lang.Object ref = v1Name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        v1Name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The layer ID of the final layer in the Docker image's v1
     * representation.
     * </pre>
     *
     * <code>string v1_name = 1;</code>
     *
     * @param value The v1Name to set.
     * @return This builder for chaining.
     */
    public Builder setV1Name(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      v1Name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The layer ID of the final layer in the Docker image's v1
     * representation.
     * </pre>
     *
     * <code>string v1_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearV1Name() {
      v1Name_ = getDefaultInstance().getV1Name();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The layer ID of the final layer in the Docker image's v1
     * representation.
     * </pre>
     *
     * <code>string v1_name = 1;</code>
     *
     * @param value The bytes for v1Name to set.
     * @return This builder for chaining.
     */
    public Builder setV1NameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      v1Name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList v2Blob_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureV2BlobIsMutable() {
      if (!v2Blob_.isModifiable()) {
        v2Blob_ = new com.google.protobuf.LazyStringArrayList(v2Blob_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Required. The ordered list of v2 blobs that represent a given image.
     * </pre>
     *
     * <code>repeated string v2_blob = 2;</code>
     *
     * @return A list containing the v2Blob.
     */
    public com.google.protobuf.ProtocolStringList getV2BlobList() {
      v2Blob_.makeImmutable();
      return v2Blob_;
    }
    /**
     *
     *
     * <pre>
     * Required. The ordered list of v2 blobs that represent a given image.
     * </pre>
     *
     * <code>repeated string v2_blob = 2;</code>
     *
     * @return The count of v2Blob.
     */
    public int getV2BlobCount() {
      return v2Blob_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The ordered list of v2 blobs that represent a given image.
     * </pre>
     *
     * <code>repeated string v2_blob = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The v2Blob at the given index.
     */
    public java.lang.String getV2Blob(int index) {
      return v2Blob_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The ordered list of v2 blobs that represent a given image.
     * </pre>
     *
     * <code>repeated string v2_blob = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the v2Blob at the given index.
     */
    public com.google.protobuf.ByteString getV2BlobBytes(int index) {
      return v2Blob_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The ordered list of v2 blobs that represent a given image.
     * </pre>
     *
     * <code>repeated string v2_blob = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The v2Blob to set.
     * @return This builder for chaining.
     */
    public Builder setV2Blob(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureV2BlobIsMutable();
      v2Blob_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ordered list of v2 blobs that represent a given image.
     * </pre>
     *
     * <code>repeated string v2_blob = 2;</code>
     *
     * @param value The v2Blob to add.
     * @return This builder for chaining.
     */
    public Builder addV2Blob(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureV2BlobIsMutable();
      v2Blob_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ordered list of v2 blobs that represent a given image.
     * </pre>
     *
     * <code>repeated string v2_blob = 2;</code>
     *
     * @param values The v2Blob to add.
     * @return This builder for chaining.
     */
    public Builder addAllV2Blob(java.lang.Iterable<java.lang.String> values) {
      ensureV2BlobIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, v2Blob_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ordered list of v2 blobs that represent a given image.
     * </pre>
     *
     * <code>repeated string v2_blob = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearV2Blob() {
      v2Blob_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ordered list of v2 blobs that represent a given image.
     * </pre>
     *
     * <code>repeated string v2_blob = 2;</code>
     *
     * @param value The bytes of the v2Blob to add.
     * @return This builder for chaining.
     */
    public Builder addV2BlobBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureV2BlobIsMutable();
      v2Blob_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object v2Name_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The name of the image's v2 blobs computed via:
     *   [bottom] := v2_blob[bottom]
     *   [N] := sha256(v2_blob[N] + " " + v2_name[N+1])
     * Only the name of the final blob is kept.
     * </pre>
     *
     * <code>string v2_name = 3;</code>
     *
     * @return The v2Name.
     */
    public java.lang.String getV2Name() {
      java.lang.Object ref = v2Name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        v2Name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the image's v2 blobs computed via:
     *   [bottom] := v2_blob[bottom]
     *   [N] := sha256(v2_blob[N] + " " + v2_name[N+1])
     * Only the name of the final blob is kept.
     * </pre>
     *
     * <code>string v2_name = 3;</code>
     *
     * @return The bytes for v2Name.
     */
    public com.google.protobuf.ByteString getV2NameBytes() {
      java.lang.Object ref = v2Name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        v2Name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the image's v2 blobs computed via:
     *   [bottom] := v2_blob[bottom]
     *   [N] := sha256(v2_blob[N] + " " + v2_name[N+1])
     * Only the name of the final blob is kept.
     * </pre>
     *
     * <code>string v2_name = 3;</code>
     *
     * @param value The v2Name to set.
     * @return This builder for chaining.
     */
    public Builder setV2Name(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      v2Name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the image's v2 blobs computed via:
     *   [bottom] := v2_blob[bottom]
     *   [N] := sha256(v2_blob[N] + " " + v2_name[N+1])
     * Only the name of the final blob is kept.
     * </pre>
     *
     * <code>string v2_name = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearV2Name() {
      v2Name_ = getDefaultInstance().getV2Name();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the image's v2 blobs computed via:
     *   [bottom] := v2_blob[bottom]
     *   [N] := sha256(v2_blob[N] + " " + v2_name[N+1])
     * Only the name of the final blob is kept.
     * </pre>
     *
     * <code>string v2_name = 3;</code>
     *
     * @param value The bytes for v2Name to set.
     * @return This builder for chaining.
     */
    public Builder setV2NameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      v2Name_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.Fingerprint)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.Fingerprint)
  private static final io.grafeas.v1.Fingerprint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.Fingerprint();
  }

  public static io.grafeas.v1.Fingerprint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Fingerprint> PARSER =
      new com.google.protobuf.AbstractParser<Fingerprint>() {
        @java.lang.Override
        public Fingerprint parsePartialFrom(
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

  public static com.google.protobuf.Parser<Fingerprint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Fingerprint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.Fingerprint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
