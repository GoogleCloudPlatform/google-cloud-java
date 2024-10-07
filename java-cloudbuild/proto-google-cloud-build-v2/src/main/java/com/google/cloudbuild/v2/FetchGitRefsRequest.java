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
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.5
package com.google.cloudbuild.v2;

/**
 *
 *
 * <pre>
 * Request for fetching git refs
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v2.FetchGitRefsRequest}
 */
public final class FetchGitRefsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v2.FetchGitRefsRequest)
    FetchGitRefsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FetchGitRefsRequest.newBuilder() to construct.
  private FetchGitRefsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchGitRefsRequest() {
    repository_ = "";
    refType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchGitRefsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v2.RepositoryManagerProto
        .internal_static_google_devtools_cloudbuild_v2_FetchGitRefsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v2.RepositoryManagerProto
        .internal_static_google_devtools_cloudbuild_v2_FetchGitRefsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v2.FetchGitRefsRequest.class,
            com.google.cloudbuild.v2.FetchGitRefsRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Type of refs
   * </pre>
   *
   * Protobuf enum {@code google.devtools.cloudbuild.v2.FetchGitRefsRequest.RefType}
   */
  public enum RefType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * No type specified.
     * </pre>
     *
     * <code>REF_TYPE_UNSPECIFIED = 0;</code>
     */
    REF_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * To fetch tags.
     * </pre>
     *
     * <code>TAG = 1;</code>
     */
    TAG(1),
    /**
     *
     *
     * <pre>
     * To fetch branches.
     * </pre>
     *
     * <code>BRANCH = 2;</code>
     */
    BRANCH(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * No type specified.
     * </pre>
     *
     * <code>REF_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int REF_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * To fetch tags.
     * </pre>
     *
     * <code>TAG = 1;</code>
     */
    public static final int TAG_VALUE = 1;
    /**
     *
     *
     * <pre>
     * To fetch branches.
     * </pre>
     *
     * <code>BRANCH = 2;</code>
     */
    public static final int BRANCH_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RefType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RefType forNumber(int value) {
      switch (value) {
        case 0:
          return REF_TYPE_UNSPECIFIED;
        case 1:
          return TAG;
        case 2:
          return BRANCH;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RefType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<RefType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RefType>() {
          public RefType findValueByNumber(int number) {
            return RefType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloudbuild.v2.FetchGitRefsRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final RefType[] VALUES = values();

    public static RefType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RefType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.cloudbuild.v2.FetchGitRefsRequest.RefType)
  }

  public static final int REPOSITORY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object repository_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the repository in the format
   * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>
   * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The repository.
   */
  @java.lang.Override
  public java.lang.String getRepository() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repository_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the repository in the format
   * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>
   * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for repository.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRepositoryBytes() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      repository_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REF_TYPE_FIELD_NUMBER = 2;
  private int refType_ = 0;
  /**
   *
   *
   * <pre>
   * Type of refs to fetch
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.FetchGitRefsRequest.RefType ref_type = 2;</code>
   *
   * @return The enum numeric value on the wire for refType.
   */
  @java.lang.Override
  public int getRefTypeValue() {
    return refType_;
  }
  /**
   *
   *
   * <pre>
   * Type of refs to fetch
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.FetchGitRefsRequest.RefType ref_type = 2;</code>
   *
   * @return The refType.
   */
  @java.lang.Override
  public com.google.cloudbuild.v2.FetchGitRefsRequest.RefType getRefType() {
    com.google.cloudbuild.v2.FetchGitRefsRequest.RefType result =
        com.google.cloudbuild.v2.FetchGitRefsRequest.RefType.forNumber(refType_);
    return result == null
        ? com.google.cloudbuild.v2.FetchGitRefsRequest.RefType.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repository_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, repository_);
    }
    if (refType_
        != com.google.cloudbuild.v2.FetchGitRefsRequest.RefType.REF_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, refType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repository_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, repository_);
    }
    if (refType_
        != com.google.cloudbuild.v2.FetchGitRefsRequest.RefType.REF_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, refType_);
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
    if (!(obj instanceof com.google.cloudbuild.v2.FetchGitRefsRequest)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v2.FetchGitRefsRequest other =
        (com.google.cloudbuild.v2.FetchGitRefsRequest) obj;

    if (!getRepository().equals(other.getRepository())) return false;
    if (refType_ != other.refType_) return false;
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
    hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
    hash = (53 * hash) + getRepository().hashCode();
    hash = (37 * hash) + REF_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + refType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v2.FetchGitRefsRequest prototype) {
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
   * Request for fetching git refs
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v2.FetchGitRefsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v2.FetchGitRefsRequest)
      com.google.cloudbuild.v2.FetchGitRefsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_FetchGitRefsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_FetchGitRefsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v2.FetchGitRefsRequest.class,
              com.google.cloudbuild.v2.FetchGitRefsRequest.Builder.class);
    }

    // Construct using com.google.cloudbuild.v2.FetchGitRefsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      repository_ = "";
      refType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_FetchGitRefsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.FetchGitRefsRequest getDefaultInstanceForType() {
      return com.google.cloudbuild.v2.FetchGitRefsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.FetchGitRefsRequest build() {
      com.google.cloudbuild.v2.FetchGitRefsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.FetchGitRefsRequest buildPartial() {
      com.google.cloudbuild.v2.FetchGitRefsRequest result =
          new com.google.cloudbuild.v2.FetchGitRefsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v2.FetchGitRefsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.repository_ = repository_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.refType_ = refType_;
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
      if (other instanceof com.google.cloudbuild.v2.FetchGitRefsRequest) {
        return mergeFrom((com.google.cloudbuild.v2.FetchGitRefsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v2.FetchGitRefsRequest other) {
      if (other == com.google.cloudbuild.v2.FetchGitRefsRequest.getDefaultInstance()) return this;
      if (!other.getRepository().isEmpty()) {
        repository_ = other.repository_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.refType_ != 0) {
        setRefTypeValue(other.getRefTypeValue());
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
                repository_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                refType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object repository_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the repository in the format
     * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The repository.
     */
    public java.lang.String getRepository() {
      java.lang.Object ref = repository_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repository_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the repository in the format
     * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for repository.
     */
    public com.google.protobuf.ByteString getRepositoryBytes() {
      java.lang.Object ref = repository_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        repository_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the repository in the format
     * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepository(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      repository_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the repository in the format
     * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRepository() {
      repository_ = getDefaultInstance().getRepository();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the repository in the format
     * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
     * </pre>
     *
     * <code>
     * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepositoryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      repository_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int refType_ = 0;
    /**
     *
     *
     * <pre>
     * Type of refs to fetch
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v2.FetchGitRefsRequest.RefType ref_type = 2;</code>
     *
     * @return The enum numeric value on the wire for refType.
     */
    @java.lang.Override
    public int getRefTypeValue() {
      return refType_;
    }
    /**
     *
     *
     * <pre>
     * Type of refs to fetch
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v2.FetchGitRefsRequest.RefType ref_type = 2;</code>
     *
     * @param value The enum numeric value on the wire for refType to set.
     * @return This builder for chaining.
     */
    public Builder setRefTypeValue(int value) {
      refType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of refs to fetch
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v2.FetchGitRefsRequest.RefType ref_type = 2;</code>
     *
     * @return The refType.
     */
    @java.lang.Override
    public com.google.cloudbuild.v2.FetchGitRefsRequest.RefType getRefType() {
      com.google.cloudbuild.v2.FetchGitRefsRequest.RefType result =
          com.google.cloudbuild.v2.FetchGitRefsRequest.RefType.forNumber(refType_);
      return result == null
          ? com.google.cloudbuild.v2.FetchGitRefsRequest.RefType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Type of refs to fetch
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v2.FetchGitRefsRequest.RefType ref_type = 2;</code>
     *
     * @param value The refType to set.
     * @return This builder for chaining.
     */
    public Builder setRefType(com.google.cloudbuild.v2.FetchGitRefsRequest.RefType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      refType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of refs to fetch
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v2.FetchGitRefsRequest.RefType ref_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRefType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      refType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v2.FetchGitRefsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v2.FetchGitRefsRequest)
  private static final com.google.cloudbuild.v2.FetchGitRefsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v2.FetchGitRefsRequest();
  }

  public static com.google.cloudbuild.v2.FetchGitRefsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchGitRefsRequest> PARSER =
      new com.google.protobuf.AbstractParser<FetchGitRefsRequest>() {
        @java.lang.Override
        public FetchGitRefsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchGitRefsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchGitRefsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v2.FetchGitRefsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
