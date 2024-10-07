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
// source: google/cloud/support/v2/case_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.support.v2;

/**
 *
 *
 * <pre>
 * The response message for the ListCases endpoint.
 * </pre>
 *
 * Protobuf type {@code google.cloud.support.v2.ListCasesResponse}
 */
public final class ListCasesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.support.v2.ListCasesResponse)
    ListCasesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListCasesResponse.newBuilder() to construct.
  private ListCasesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListCasesResponse() {
    cases_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListCasesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.support.v2.CaseServiceProto
        .internal_static_google_cloud_support_v2_ListCasesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.support.v2.CaseServiceProto
        .internal_static_google_cloud_support_v2_ListCasesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.support.v2.ListCasesResponse.class,
            com.google.cloud.support.v2.ListCasesResponse.Builder.class);
  }

  public static final int CASES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.support.v2.Case> cases_;
  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.support.v2.Case> getCasesList() {
    return cases_;
  }
  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.support.v2.CaseOrBuilder>
      getCasesOrBuilderList() {
    return cases_;
  }
  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  @java.lang.Override
  public int getCasesCount() {
    return cases_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.support.v2.Case getCases(int index) {
    return cases_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of cases associated with the Google Cloud Resource, after any
   * filters have been applied.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.support.v2.CaseOrBuilder getCasesOrBuilder(int index) {
    return cases_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. This should be set in the
   * `page_token` field of the subsequent `ListCasesRequest` message that is
   * issued. If unspecified, there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. This should be set in the
   * `page_token` field of the subsequent `ListCasesRequest` message that is
   * issued. If unspecified, there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < cases_.size(); i++) {
      output.writeMessage(1, cases_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cases_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, cases_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.support.v2.ListCasesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.support.v2.ListCasesResponse other =
        (com.google.cloud.support.v2.ListCasesResponse) obj;

    if (!getCasesList().equals(other.getCasesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getCasesCount() > 0) {
      hash = (37 * hash) + CASES_FIELD_NUMBER;
      hash = (53 * hash) + getCasesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.support.v2.ListCasesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.support.v2.ListCasesResponse prototype) {
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
   * The response message for the ListCases endpoint.
   * </pre>
   *
   * Protobuf type {@code google.cloud.support.v2.ListCasesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.support.v2.ListCasesResponse)
      com.google.cloud.support.v2.ListCasesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.support.v2.CaseServiceProto
          .internal_static_google_cloud_support_v2_ListCasesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.support.v2.CaseServiceProto
          .internal_static_google_cloud_support_v2_ListCasesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.support.v2.ListCasesResponse.class,
              com.google.cloud.support.v2.ListCasesResponse.Builder.class);
    }

    // Construct using com.google.cloud.support.v2.ListCasesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (casesBuilder_ == null) {
        cases_ = java.util.Collections.emptyList();
      } else {
        cases_ = null;
        casesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.support.v2.CaseServiceProto
          .internal_static_google_cloud_support_v2_ListCasesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.support.v2.ListCasesResponse getDefaultInstanceForType() {
      return com.google.cloud.support.v2.ListCasesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.support.v2.ListCasesResponse build() {
      com.google.cloud.support.v2.ListCasesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.support.v2.ListCasesResponse buildPartial() {
      com.google.cloud.support.v2.ListCasesResponse result =
          new com.google.cloud.support.v2.ListCasesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.support.v2.ListCasesResponse result) {
      if (casesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cases_ = java.util.Collections.unmodifiableList(cases_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cases_ = cases_;
      } else {
        result.cases_ = casesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.support.v2.ListCasesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.support.v2.ListCasesResponse) {
        return mergeFrom((com.google.cloud.support.v2.ListCasesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.support.v2.ListCasesResponse other) {
      if (other == com.google.cloud.support.v2.ListCasesResponse.getDefaultInstance()) return this;
      if (casesBuilder_ == null) {
        if (!other.cases_.isEmpty()) {
          if (cases_.isEmpty()) {
            cases_ = other.cases_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCasesIsMutable();
            cases_.addAll(other.cases_);
          }
          onChanged();
        }
      } else {
        if (!other.cases_.isEmpty()) {
          if (casesBuilder_.isEmpty()) {
            casesBuilder_.dispose();
            casesBuilder_ = null;
            cases_ = other.cases_;
            bitField0_ = (bitField0_ & ~0x00000001);
            casesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCasesFieldBuilder()
                    : null;
          } else {
            casesBuilder_.addAllMessages(other.cases_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.support.v2.Case m =
                    input.readMessage(com.google.cloud.support.v2.Case.parser(), extensionRegistry);
                if (casesBuilder_ == null) {
                  ensureCasesIsMutable();
                  cases_.add(m);
                } else {
                  casesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.support.v2.Case> cases_ =
        java.util.Collections.emptyList();

    private void ensureCasesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cases_ = new java.util.ArrayList<com.google.cloud.support.v2.Case>(cases_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.support.v2.Case,
            com.google.cloud.support.v2.Case.Builder,
            com.google.cloud.support.v2.CaseOrBuilder>
        casesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public java.util.List<com.google.cloud.support.v2.Case> getCasesList() {
      if (casesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cases_);
      } else {
        return casesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public int getCasesCount() {
      if (casesBuilder_ == null) {
        return cases_.size();
      } else {
        return casesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public com.google.cloud.support.v2.Case getCases(int index) {
      if (casesBuilder_ == null) {
        return cases_.get(index);
      } else {
        return casesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public Builder setCases(int index, com.google.cloud.support.v2.Case value) {
      if (casesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCasesIsMutable();
        cases_.set(index, value);
        onChanged();
      } else {
        casesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public Builder setCases(int index, com.google.cloud.support.v2.Case.Builder builderForValue) {
      if (casesBuilder_ == null) {
        ensureCasesIsMutable();
        cases_.set(index, builderForValue.build());
        onChanged();
      } else {
        casesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public Builder addCases(com.google.cloud.support.v2.Case value) {
      if (casesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCasesIsMutable();
        cases_.add(value);
        onChanged();
      } else {
        casesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public Builder addCases(int index, com.google.cloud.support.v2.Case value) {
      if (casesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCasesIsMutable();
        cases_.add(index, value);
        onChanged();
      } else {
        casesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public Builder addCases(com.google.cloud.support.v2.Case.Builder builderForValue) {
      if (casesBuilder_ == null) {
        ensureCasesIsMutable();
        cases_.add(builderForValue.build());
        onChanged();
      } else {
        casesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public Builder addCases(int index, com.google.cloud.support.v2.Case.Builder builderForValue) {
      if (casesBuilder_ == null) {
        ensureCasesIsMutable();
        cases_.add(index, builderForValue.build());
        onChanged();
      } else {
        casesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public Builder addAllCases(
        java.lang.Iterable<? extends com.google.cloud.support.v2.Case> values) {
      if (casesBuilder_ == null) {
        ensureCasesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, cases_);
        onChanged();
      } else {
        casesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public Builder clearCases() {
      if (casesBuilder_ == null) {
        cases_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        casesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public Builder removeCases(int index) {
      if (casesBuilder_ == null) {
        ensureCasesIsMutable();
        cases_.remove(index);
        onChanged();
      } else {
        casesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public com.google.cloud.support.v2.Case.Builder getCasesBuilder(int index) {
      return getCasesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public com.google.cloud.support.v2.CaseOrBuilder getCasesOrBuilder(int index) {
      if (casesBuilder_ == null) {
        return cases_.get(index);
      } else {
        return casesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.support.v2.CaseOrBuilder>
        getCasesOrBuilderList() {
      if (casesBuilder_ != null) {
        return casesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cases_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public com.google.cloud.support.v2.Case.Builder addCasesBuilder() {
      return getCasesFieldBuilder()
          .addBuilder(com.google.cloud.support.v2.Case.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public com.google.cloud.support.v2.Case.Builder addCasesBuilder(int index) {
      return getCasesFieldBuilder()
          .addBuilder(index, com.google.cloud.support.v2.Case.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of cases associated with the Google Cloud Resource, after any
     * filters have been applied.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Case cases = 1;</code>
     */
    public java.util.List<com.google.cloud.support.v2.Case.Builder> getCasesBuilderList() {
      return getCasesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.support.v2.Case,
            com.google.cloud.support.v2.Case.Builder,
            com.google.cloud.support.v2.CaseOrBuilder>
        getCasesFieldBuilder() {
      if (casesBuilder_ == null) {
        casesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.support.v2.Case,
                com.google.cloud.support.v2.Case.Builder,
                com.google.cloud.support.v2.CaseOrBuilder>(
                cases_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        cases_ = null;
      }
      return casesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of the subsequent `ListCasesRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of the subsequent `ListCasesRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of the subsequent `ListCasesRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of the subsequent `ListCasesRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of the subsequent `ListCasesRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.support.v2.ListCasesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.support.v2.ListCasesResponse)
  private static final com.google.cloud.support.v2.ListCasesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.support.v2.ListCasesResponse();
  }

  public static com.google.cloud.support.v2.ListCasesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCasesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListCasesResponse>() {
        @java.lang.Override
        public ListCasesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCasesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCasesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.support.v2.ListCasesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
