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
// source: google/cloud/datacatalog/v1/bigquery.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Fields specific for BigQuery routines.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.BigQueryRoutineSpec}
 */
public final class BigQueryRoutineSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.BigQueryRoutineSpec)
    BigQueryRoutineSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BigQueryRoutineSpec.newBuilder() to construct.
  private BigQueryRoutineSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BigQueryRoutineSpec() {
    importedLibraries_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BigQueryRoutineSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.BigQueryProto
        .internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.BigQueryProto
        .internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.BigQueryRoutineSpec.class,
            com.google.cloud.datacatalog.v1.BigQueryRoutineSpec.Builder.class);
  }

  public static final int IMPORTED_LIBRARIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList importedLibraries_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Paths of the imported libraries.
   * </pre>
   *
   * <code>repeated string imported_libraries = 1;</code>
   *
   * @return A list containing the importedLibraries.
   */
  public com.google.protobuf.ProtocolStringList getImportedLibrariesList() {
    return importedLibraries_;
  }
  /**
   *
   *
   * <pre>
   * Paths of the imported libraries.
   * </pre>
   *
   * <code>repeated string imported_libraries = 1;</code>
   *
   * @return The count of importedLibraries.
   */
  public int getImportedLibrariesCount() {
    return importedLibraries_.size();
  }
  /**
   *
   *
   * <pre>
   * Paths of the imported libraries.
   * </pre>
   *
   * <code>repeated string imported_libraries = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The importedLibraries at the given index.
   */
  public java.lang.String getImportedLibraries(int index) {
    return importedLibraries_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Paths of the imported libraries.
   * </pre>
   *
   * <code>repeated string imported_libraries = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the importedLibraries at the given index.
   */
  public com.google.protobuf.ByteString getImportedLibrariesBytes(int index) {
    return importedLibraries_.getByteString(index);
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
    for (int i = 0; i < importedLibraries_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, importedLibraries_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < importedLibraries_.size(); i++) {
        dataSize += computeStringSizeNoTag(importedLibraries_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getImportedLibrariesList().size();
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.BigQueryRoutineSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.BigQueryRoutineSpec other =
        (com.google.cloud.datacatalog.v1.BigQueryRoutineSpec) obj;

    if (!getImportedLibrariesList().equals(other.getImportedLibrariesList())) return false;
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
    if (getImportedLibrariesCount() > 0) {
      hash = (37 * hash) + IMPORTED_LIBRARIES_FIELD_NUMBER;
      hash = (53 * hash) + getImportedLibrariesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.BigQueryRoutineSpec prototype) {
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
   * Fields specific for BigQuery routines.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.BigQueryRoutineSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.BigQueryRoutineSpec)
      com.google.cloud.datacatalog.v1.BigQueryRoutineSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.BigQueryProto
          .internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.BigQueryProto
          .internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.BigQueryRoutineSpec.class,
              com.google.cloud.datacatalog.v1.BigQueryRoutineSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.BigQueryRoutineSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      importedLibraries_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.BigQueryProto
          .internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryRoutineSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.BigQueryRoutineSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryRoutineSpec build() {
      com.google.cloud.datacatalog.v1.BigQueryRoutineSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryRoutineSpec buildPartial() {
      com.google.cloud.datacatalog.v1.BigQueryRoutineSpec result =
          new com.google.cloud.datacatalog.v1.BigQueryRoutineSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.BigQueryRoutineSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        importedLibraries_.makeImmutable();
        result.importedLibraries_ = importedLibraries_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.BigQueryRoutineSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.BigQueryRoutineSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.BigQueryRoutineSpec other) {
      if (other == com.google.cloud.datacatalog.v1.BigQueryRoutineSpec.getDefaultInstance())
        return this;
      if (!other.importedLibraries_.isEmpty()) {
        if (importedLibraries_.isEmpty()) {
          importedLibraries_ = other.importedLibraries_;
          bitField0_ |= 0x00000001;
        } else {
          ensureImportedLibrariesIsMutable();
          importedLibraries_.addAll(other.importedLibraries_);
        }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureImportedLibrariesIsMutable();
                importedLibraries_.add(s);
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

    private com.google.protobuf.LazyStringArrayList importedLibraries_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureImportedLibrariesIsMutable() {
      if (!importedLibraries_.isModifiable()) {
        importedLibraries_ = new com.google.protobuf.LazyStringArrayList(importedLibraries_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Paths of the imported libraries.
     * </pre>
     *
     * <code>repeated string imported_libraries = 1;</code>
     *
     * @return A list containing the importedLibraries.
     */
    public com.google.protobuf.ProtocolStringList getImportedLibrariesList() {
      importedLibraries_.makeImmutable();
      return importedLibraries_;
    }
    /**
     *
     *
     * <pre>
     * Paths of the imported libraries.
     * </pre>
     *
     * <code>repeated string imported_libraries = 1;</code>
     *
     * @return The count of importedLibraries.
     */
    public int getImportedLibrariesCount() {
      return importedLibraries_.size();
    }
    /**
     *
     *
     * <pre>
     * Paths of the imported libraries.
     * </pre>
     *
     * <code>repeated string imported_libraries = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The importedLibraries at the given index.
     */
    public java.lang.String getImportedLibraries(int index) {
      return importedLibraries_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Paths of the imported libraries.
     * </pre>
     *
     * <code>repeated string imported_libraries = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the importedLibraries at the given index.
     */
    public com.google.protobuf.ByteString getImportedLibrariesBytes(int index) {
      return importedLibraries_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Paths of the imported libraries.
     * </pre>
     *
     * <code>repeated string imported_libraries = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The importedLibraries to set.
     * @return This builder for chaining.
     */
    public Builder setImportedLibraries(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureImportedLibrariesIsMutable();
      importedLibraries_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Paths of the imported libraries.
     * </pre>
     *
     * <code>repeated string imported_libraries = 1;</code>
     *
     * @param value The importedLibraries to add.
     * @return This builder for chaining.
     */
    public Builder addImportedLibraries(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureImportedLibrariesIsMutable();
      importedLibraries_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Paths of the imported libraries.
     * </pre>
     *
     * <code>repeated string imported_libraries = 1;</code>
     *
     * @param values The importedLibraries to add.
     * @return This builder for chaining.
     */
    public Builder addAllImportedLibraries(java.lang.Iterable<java.lang.String> values) {
      ensureImportedLibrariesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, importedLibraries_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Paths of the imported libraries.
     * </pre>
     *
     * <code>repeated string imported_libraries = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImportedLibraries() {
      importedLibraries_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Paths of the imported libraries.
     * </pre>
     *
     * <code>repeated string imported_libraries = 1;</code>
     *
     * @param value The bytes of the importedLibraries to add.
     * @return This builder for chaining.
     */
    public Builder addImportedLibrariesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureImportedLibrariesIsMutable();
      importedLibraries_.add(value);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.BigQueryRoutineSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.BigQueryRoutineSpec)
  private static final com.google.cloud.datacatalog.v1.BigQueryRoutineSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.BigQueryRoutineSpec();
  }

  public static com.google.cloud.datacatalog.v1.BigQueryRoutineSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryRoutineSpec> PARSER =
      new com.google.protobuf.AbstractParser<BigQueryRoutineSpec>() {
        @java.lang.Override
        public BigQueryRoutineSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<BigQueryRoutineSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryRoutineSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.BigQueryRoutineSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
