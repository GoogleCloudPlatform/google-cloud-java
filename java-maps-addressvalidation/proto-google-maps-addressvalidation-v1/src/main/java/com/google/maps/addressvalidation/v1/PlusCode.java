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
// source: google/maps/addressvalidation/v1/geocode.proto

// Protobuf Java Version: 3.25.2
package com.google.maps.addressvalidation.v1;

/**
 *
 *
 * <pre>
 * Plus code (http://plus.codes) is a location reference with two formats:
 * global code defining a 14mx14m (1/8000th of a degree) or smaller rectangle,
 * and compound code, replacing the prefix with a reference location.
 * </pre>
 *
 * Protobuf type {@code google.maps.addressvalidation.v1.PlusCode}
 */
public final class PlusCode extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.addressvalidation.v1.PlusCode)
    PlusCodeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PlusCode.newBuilder() to construct.
  private PlusCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PlusCode() {
    globalCode_ = "";
    compoundCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PlusCode();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.addressvalidation.v1.GeocodeProto
        .internal_static_google_maps_addressvalidation_v1_PlusCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.addressvalidation.v1.GeocodeProto
        .internal_static_google_maps_addressvalidation_v1_PlusCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.addressvalidation.v1.PlusCode.class,
            com.google.maps.addressvalidation.v1.PlusCode.Builder.class);
  }

  public static final int GLOBAL_CODE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object globalCode_ = "";
  /**
   *
   *
   * <pre>
   * Place's global (full) code, such as "9FWM33GV+HQ", representing an
   * 1/8000 by 1/8000 degree area (~14 by 14 meters).
   * </pre>
   *
   * <code>string global_code = 1;</code>
   *
   * @return The globalCode.
   */
  @java.lang.Override
  public java.lang.String getGlobalCode() {
    java.lang.Object ref = globalCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      globalCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Place's global (full) code, such as "9FWM33GV+HQ", representing an
   * 1/8000 by 1/8000 degree area (~14 by 14 meters).
   * </pre>
   *
   * <code>string global_code = 1;</code>
   *
   * @return The bytes for globalCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGlobalCodeBytes() {
    java.lang.Object ref = globalCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      globalCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPOUND_CODE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object compoundCode_ = "";
  /**
   *
   *
   * <pre>
   * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing
   * the suffix of the global code and replacing the prefix with a formatted
   * name of a reference entity.
   * </pre>
   *
   * <code>string compound_code = 2;</code>
   *
   * @return The compoundCode.
   */
  @java.lang.Override
  public java.lang.String getCompoundCode() {
    java.lang.Object ref = compoundCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      compoundCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing
   * the suffix of the global code and replacing the prefix with a formatted
   * name of a reference entity.
   * </pre>
   *
   * <code>string compound_code = 2;</code>
   *
   * @return The bytes for compoundCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCompoundCodeBytes() {
    java.lang.Object ref = compoundCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      compoundCode_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(globalCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, globalCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(compoundCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, compoundCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(globalCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, globalCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(compoundCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, compoundCode_);
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
    if (!(obj instanceof com.google.maps.addressvalidation.v1.PlusCode)) {
      return super.equals(obj);
    }
    com.google.maps.addressvalidation.v1.PlusCode other =
        (com.google.maps.addressvalidation.v1.PlusCode) obj;

    if (!getGlobalCode().equals(other.getGlobalCode())) return false;
    if (!getCompoundCode().equals(other.getCompoundCode())) return false;
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
    hash = (37 * hash) + GLOBAL_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getGlobalCode().hashCode();
    hash = (37 * hash) + COMPOUND_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCompoundCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.addressvalidation.v1.PlusCode parseFrom(
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

  public static Builder newBuilder(com.google.maps.addressvalidation.v1.PlusCode prototype) {
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
   * Plus code (http://plus.codes) is a location reference with two formats:
   * global code defining a 14mx14m (1/8000th of a degree) or smaller rectangle,
   * and compound code, replacing the prefix with a reference location.
   * </pre>
   *
   * Protobuf type {@code google.maps.addressvalidation.v1.PlusCode}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.addressvalidation.v1.PlusCode)
      com.google.maps.addressvalidation.v1.PlusCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.addressvalidation.v1.GeocodeProto
          .internal_static_google_maps_addressvalidation_v1_PlusCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.addressvalidation.v1.GeocodeProto
          .internal_static_google_maps_addressvalidation_v1_PlusCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.addressvalidation.v1.PlusCode.class,
              com.google.maps.addressvalidation.v1.PlusCode.Builder.class);
    }

    // Construct using com.google.maps.addressvalidation.v1.PlusCode.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      globalCode_ = "";
      compoundCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.addressvalidation.v1.GeocodeProto
          .internal_static_google_maps_addressvalidation_v1_PlusCode_descriptor;
    }

    @java.lang.Override
    public com.google.maps.addressvalidation.v1.PlusCode getDefaultInstanceForType() {
      return com.google.maps.addressvalidation.v1.PlusCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.addressvalidation.v1.PlusCode build() {
      com.google.maps.addressvalidation.v1.PlusCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.addressvalidation.v1.PlusCode buildPartial() {
      com.google.maps.addressvalidation.v1.PlusCode result =
          new com.google.maps.addressvalidation.v1.PlusCode(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.addressvalidation.v1.PlusCode result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.globalCode_ = globalCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.compoundCode_ = compoundCode_;
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
      if (other instanceof com.google.maps.addressvalidation.v1.PlusCode) {
        return mergeFrom((com.google.maps.addressvalidation.v1.PlusCode) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.addressvalidation.v1.PlusCode other) {
      if (other == com.google.maps.addressvalidation.v1.PlusCode.getDefaultInstance()) return this;
      if (!other.getGlobalCode().isEmpty()) {
        globalCode_ = other.globalCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCompoundCode().isEmpty()) {
        compoundCode_ = other.compoundCode_;
        bitField0_ |= 0x00000002;
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
                globalCode_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                compoundCode_ = input.readStringRequireUtf8();
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

    private java.lang.Object globalCode_ = "";
    /**
     *
     *
     * <pre>
     * Place's global (full) code, such as "9FWM33GV+HQ", representing an
     * 1/8000 by 1/8000 degree area (~14 by 14 meters).
     * </pre>
     *
     * <code>string global_code = 1;</code>
     *
     * @return The globalCode.
     */
    public java.lang.String getGlobalCode() {
      java.lang.Object ref = globalCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        globalCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Place's global (full) code, such as "9FWM33GV+HQ", representing an
     * 1/8000 by 1/8000 degree area (~14 by 14 meters).
     * </pre>
     *
     * <code>string global_code = 1;</code>
     *
     * @return The bytes for globalCode.
     */
    public com.google.protobuf.ByteString getGlobalCodeBytes() {
      java.lang.Object ref = globalCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        globalCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Place's global (full) code, such as "9FWM33GV+HQ", representing an
     * 1/8000 by 1/8000 degree area (~14 by 14 meters).
     * </pre>
     *
     * <code>string global_code = 1;</code>
     *
     * @param value The globalCode to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      globalCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Place's global (full) code, such as "9FWM33GV+HQ", representing an
     * 1/8000 by 1/8000 degree area (~14 by 14 meters).
     * </pre>
     *
     * <code>string global_code = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGlobalCode() {
      globalCode_ = getDefaultInstance().getGlobalCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Place's global (full) code, such as "9FWM33GV+HQ", representing an
     * 1/8000 by 1/8000 degree area (~14 by 14 meters).
     * </pre>
     *
     * <code>string global_code = 1;</code>
     *
     * @param value The bytes for globalCode to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      globalCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object compoundCode_ = "";
    /**
     *
     *
     * <pre>
     * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing
     * the suffix of the global code and replacing the prefix with a formatted
     * name of a reference entity.
     * </pre>
     *
     * <code>string compound_code = 2;</code>
     *
     * @return The compoundCode.
     */
    public java.lang.String getCompoundCode() {
      java.lang.Object ref = compoundCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        compoundCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing
     * the suffix of the global code and replacing the prefix with a formatted
     * name of a reference entity.
     * </pre>
     *
     * <code>string compound_code = 2;</code>
     *
     * @return The bytes for compoundCode.
     */
    public com.google.protobuf.ByteString getCompoundCodeBytes() {
      java.lang.Object ref = compoundCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        compoundCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing
     * the suffix of the global code and replacing the prefix with a formatted
     * name of a reference entity.
     * </pre>
     *
     * <code>string compound_code = 2;</code>
     *
     * @param value The compoundCode to set.
     * @return This builder for chaining.
     */
    public Builder setCompoundCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      compoundCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing
     * the suffix of the global code and replacing the prefix with a formatted
     * name of a reference entity.
     * </pre>
     *
     * <code>string compound_code = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCompoundCode() {
      compoundCode_ = getDefaultInstance().getCompoundCode();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing
     * the suffix of the global code and replacing the prefix with a formatted
     * name of a reference entity.
     * </pre>
     *
     * <code>string compound_code = 2;</code>
     *
     * @param value The bytes for compoundCode to set.
     * @return This builder for chaining.
     */
    public Builder setCompoundCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      compoundCode_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.maps.addressvalidation.v1.PlusCode)
  }

  // @@protoc_insertion_point(class_scope:google.maps.addressvalidation.v1.PlusCode)
  private static final com.google.maps.addressvalidation.v1.PlusCode DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.addressvalidation.v1.PlusCode();
  }

  public static com.google.maps.addressvalidation.v1.PlusCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlusCode> PARSER =
      new com.google.protobuf.AbstractParser<PlusCode>() {
        @java.lang.Override
        public PlusCode parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlusCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlusCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.addressvalidation.v1.PlusCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
