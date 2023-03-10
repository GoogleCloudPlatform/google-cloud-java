/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * The request message to search related account group memberships.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest}
 */
public final class SearchRelatedAccountGroupMembershipsRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest)
    SearchRelatedAccountGroupMembershipsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchRelatedAccountGroupMembershipsRequest.newBuilder() to construct.
  private SearchRelatedAccountGroupMembershipsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchRelatedAccountGroupMembershipsRequest() {
    project_ = "";
    hashedAccountId_ = com.google.protobuf.ByteString.EMPTY;
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchRelatedAccountGroupMembershipsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_SearchRelatedAccountGroupMembershipsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_SearchRelatedAccountGroupMembershipsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest.class,
            com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest.Builder
                .class);
  }

  public static final int PROJECT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object project_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the project to search related account group
   * memberships from. Specify the project name in the following format:
   * "projects/{project}".
   * </pre>
   *
   * <code>
   * string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the project to search related account group
   * memberships from. Specify the project name in the following format:
   * "projects/{project}".
   * </pre>
   *
   * <code>
   * string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASHED_ACCOUNT_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString hashedAccountId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Optional. The unique stable hashed user identifier we should search
   * connections to. The identifier should correspond to a `hashed_account_id`
   * provided in a previous `CreateAssessment` or `AnnotateAssessment` call.
   * </pre>
   *
   * <code>bytes hashed_account_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The hashedAccountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHashedAccountId() {
    return hashedAccountId_;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The maximum number of groups to return. The service might return
   * fewer than this value. If unspecified, at most 50 groups are returned. The
   * maximum value is 1000; values above 1000 are coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous
   * `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the
   * subsequent page.
   * When paginating, all other parameters provided to
   * `SearchRelatedAccountGroupMemberships` must match the call that provided
   * the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous
   * `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the
   * subsequent page.
   * When paginating, all other parameters provided to
   * `SearchRelatedAccountGroupMemberships` must match the call that provided
   * the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, project_);
    }
    if (!hashedAccountId_.isEmpty()) {
      output.writeBytes(2, hashedAccountId_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, project_);
    }
    if (!hashedAccountId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, hashedAccountId_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pageToken_);
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
        instanceof com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest other =
        (com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest) obj;

    if (!getProject().equals(other.getProject())) return false;
    if (!getHashedAccountId().equals(other.getHashedAccountId())) return false;
    if (getPageSize() != other.getPageSize()) return false;
    if (!getPageToken().equals(other.getPageToken())) return false;
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
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + HASHED_ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHashedAccountId().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
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
      com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest prototype) {
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
   * The request message to search related account group memberships.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest)
      com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_SearchRelatedAccountGroupMembershipsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_SearchRelatedAccountGroupMembershipsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest.class,
              com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      project_ = "";
      hashedAccountId_ = com.google.protobuf.ByteString.EMPTY;
      pageSize_ = 0;
      pageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_SearchRelatedAccountGroupMembershipsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
        getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest build() {
      com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
        buildPartial() {
      com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest result =
          new com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.project_ = project_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hashedAccountId_ = hashedAccountId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pageToken_ = pageToken_;
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
      if (other
          instanceof
          com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest) {
        return mergeFrom(
            (com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest other) {
      if (other
          == com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
              .getDefaultInstance()) return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getHashedAccountId() != com.google.protobuf.ByteString.EMPTY) {
        setHashedAccountId(other.getHashedAccountId());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000008;
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
                project_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                hashedAccountId_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                pageSize_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                pageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object project_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the project to search related account group
     * memberships from. Specify the project name in the following format:
     * "projects/{project}".
     * </pre>
     *
     * <code>
     * string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project to search related account group
     * memberships from. Specify the project name in the following format:
     * "projects/{project}".
     * </pre>
     *
     * <code>
     * string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project to search related account group
     * memberships from. Specify the project name in the following format:
     * "projects/{project}".
     * </pre>
     *
     * <code>
     * string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project to search related account group
     * memberships from. Specify the project name in the following format:
     * "projects/{project}".
     * </pre>
     *
     * <code>
     * string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the project to search related account group
     * memberships from. Specify the project name in the following format:
     * "projects/{project}".
     * </pre>
     *
     * <code>
     * string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString hashedAccountId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Optional. The unique stable hashed user identifier we should search
     * connections to. The identifier should correspond to a `hashed_account_id`
     * provided in a previous `CreateAssessment` or `AnnotateAssessment` call.
     * </pre>
     *
     * <code>bytes hashed_account_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The hashedAccountId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getHashedAccountId() {
      return hashedAccountId_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The unique stable hashed user identifier we should search
     * connections to. The identifier should correspond to a `hashed_account_id`
     * provided in a previous `CreateAssessment` or `AnnotateAssessment` call.
     * </pre>
     *
     * <code>bytes hashed_account_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The hashedAccountId to set.
     * @return This builder for chaining.
     */
    public Builder setHashedAccountId(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      hashedAccountId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The unique stable hashed user identifier we should search
     * connections to. The identifier should correspond to a `hashed_account_id`
     * provided in a previous `CreateAssessment` or `AnnotateAssessment` call.
     * </pre>
     *
     * <code>bytes hashed_account_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHashedAccountId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hashedAccountId_ = getDefaultInstance().getHashedAccountId();
      onChanged();
      return this;
    }

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of groups to return. The service might return
     * fewer than this value. If unspecified, at most 50 groups are returned. The
     * maximum value is 1000; values above 1000 are coerced to 1000.
     * </pre>
     *
     * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of groups to return. The service might return
     * fewer than this value. If unspecified, at most 50 groups are returned. The
     * maximum value is 1000; values above 1000 are coerced to 1000.
     * </pre>
     *
     * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of groups to return. The service might return
     * fewer than this value. If unspecified, at most 50 groups are returned. The
     * maximum value is 1000; values above 1000 are coerced to 1000.
     * </pre>
     *
     * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * Optional. A page token, received from a previous
     * `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the
     * subsequent page.
     * When paginating, all other parameters provided to
     * `SearchRelatedAccountGroupMemberships` must match the call that provided
     * the page token.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A page token, received from a previous
     * `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the
     * subsequent page.
     * When paginating, all other parameters provided to
     * `SearchRelatedAccountGroupMemberships` must match the call that provided
     * the page token.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A page token, received from a previous
     * `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the
     * subsequent page.
     * When paginating, all other parameters provided to
     * `SearchRelatedAccountGroupMemberships` must match the call that provided
     * the page token.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pageToken_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A page token, received from a previous
     * `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the
     * subsequent page.
     * When paginating, all other parameters provided to
     * `SearchRelatedAccountGroupMemberships` must match the call that provided
     * the page token.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A page token, received from a previous
     * `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the
     * subsequent page.
     * When paginating, all other parameters provided to
     * `SearchRelatedAccountGroupMemberships` must match the call that provided
     * the page token.
     * </pre>
     *
     * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest)
  private static final com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest();
  }

  public static com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchRelatedAccountGroupMembershipsRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<SearchRelatedAccountGroupMembershipsRequest>() {
            @java.lang.Override
            public SearchRelatedAccountGroupMembershipsRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<SearchRelatedAccountGroupMembershipsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchRelatedAccountGroupMembershipsRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
