// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 * <pre>
 * The response message for [TestCases.ListTestCaseResults][google.cloud.dialogflow.cx.v3beta1.TestCases.ListTestCaseResults].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse}
 */
public final class ListTestCaseResultsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse)
    ListTestCaseResultsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTestCaseResultsResponse.newBuilder() to construct.
  private ListTestCaseResultsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTestCaseResultsResponse() {
    testCaseResults_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTestCaseResultsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListTestCaseResultsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListTestCaseResultsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse.Builder.class);
  }

  public static final int TEST_CASE_RESULTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult> testCaseResults_;
  /**
   * <pre>
   * The list of test case results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult> getTestCaseResultsList() {
    return testCaseResults_;
  }
  /**
   * <pre>
   * The list of test case results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TestCaseResultOrBuilder> 
      getTestCaseResultsOrBuilderList() {
    return testCaseResults_;
  }
  /**
   * <pre>
   * The list of test case results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
   */
  @java.lang.Override
  public int getTestCaseResultsCount() {
    return testCaseResults_.size();
  }
  /**
   * <pre>
   * The list of test case results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult getTestCaseResults(int index) {
    return testCaseResults_.get(index);
  }
  /**
   * <pre>
   * The list of test case results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.TestCaseResultOrBuilder getTestCaseResultsOrBuilder(
      int index) {
    return testCaseResults_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < testCaseResults_.size(); i++) {
      output.writeMessage(1, testCaseResults_.get(i));
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
    for (int i = 0; i < testCaseResults_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, testCaseResults_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse other = (com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse) obj;

    if (!getTestCaseResultsList()
        .equals(other.getTestCaseResultsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getTestCaseResultsCount() > 0) {
      hash = (37 * hash) + TEST_CASE_RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getTestCaseResultsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse prototype) {
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
   * The response message for [TestCases.ListTestCaseResults][google.cloud.dialogflow.cx.v3beta1.TestCases.ListTestCaseResults].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse)
      com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListTestCaseResultsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListTestCaseResultsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (testCaseResultsBuilder_ == null) {
        testCaseResults_ = java.util.Collections.emptyList();
      } else {
        testCaseResults_ = null;
        testCaseResultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListTestCaseResultsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse build() {
      com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse result = new com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse(this);
      int from_bitField0_ = bitField0_;
      if (testCaseResultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          testCaseResults_ = java.util.Collections.unmodifiableList(testCaseResults_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.testCaseResults_ = testCaseResults_;
      } else {
        result.testCaseResults_ = testCaseResultsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse.getDefaultInstance()) return this;
      if (testCaseResultsBuilder_ == null) {
        if (!other.testCaseResults_.isEmpty()) {
          if (testCaseResults_.isEmpty()) {
            testCaseResults_ = other.testCaseResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTestCaseResultsIsMutable();
            testCaseResults_.addAll(other.testCaseResults_);
          }
          onChanged();
        }
      } else {
        if (!other.testCaseResults_.isEmpty()) {
          if (testCaseResultsBuilder_.isEmpty()) {
            testCaseResultsBuilder_.dispose();
            testCaseResultsBuilder_ = null;
            testCaseResults_ = other.testCaseResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
            testCaseResultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTestCaseResultsFieldBuilder() : null;
          } else {
            testCaseResultsBuilder_.addAllMessages(other.testCaseResults_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10: {
              com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult m =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.parser(),
                      extensionRegistry);
              if (testCaseResultsBuilder_ == null) {
                ensureTestCaseResultsIsMutable();
                testCaseResults_.add(m);
              } else {
                testCaseResultsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

              break;
            } // case 18
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult> testCaseResults_ =
      java.util.Collections.emptyList();
    private void ensureTestCaseResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        testCaseResults_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult>(testCaseResults_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResultOrBuilder> testCaseResultsBuilder_;

    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult> getTestCaseResultsList() {
      if (testCaseResultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(testCaseResults_);
      } else {
        return testCaseResultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public int getTestCaseResultsCount() {
      if (testCaseResultsBuilder_ == null) {
        return testCaseResults_.size();
      } else {
        return testCaseResultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult getTestCaseResults(int index) {
      if (testCaseResultsBuilder_ == null) {
        return testCaseResults_.get(index);
      } else {
        return testCaseResultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public Builder setTestCaseResults(
        int index, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult value) {
      if (testCaseResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestCaseResultsIsMutable();
        testCaseResults_.set(index, value);
        onChanged();
      } else {
        testCaseResultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public Builder setTestCaseResults(
        int index, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder builderForValue) {
      if (testCaseResultsBuilder_ == null) {
        ensureTestCaseResultsIsMutable();
        testCaseResults_.set(index, builderForValue.build());
        onChanged();
      } else {
        testCaseResultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public Builder addTestCaseResults(com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult value) {
      if (testCaseResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestCaseResultsIsMutable();
        testCaseResults_.add(value);
        onChanged();
      } else {
        testCaseResultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public Builder addTestCaseResults(
        int index, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult value) {
      if (testCaseResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestCaseResultsIsMutable();
        testCaseResults_.add(index, value);
        onChanged();
      } else {
        testCaseResultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public Builder addTestCaseResults(
        com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder builderForValue) {
      if (testCaseResultsBuilder_ == null) {
        ensureTestCaseResultsIsMutable();
        testCaseResults_.add(builderForValue.build());
        onChanged();
      } else {
        testCaseResultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public Builder addTestCaseResults(
        int index, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder builderForValue) {
      if (testCaseResultsBuilder_ == null) {
        ensureTestCaseResultsIsMutable();
        testCaseResults_.add(index, builderForValue.build());
        onChanged();
      } else {
        testCaseResultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public Builder addAllTestCaseResults(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult> values) {
      if (testCaseResultsBuilder_ == null) {
        ensureTestCaseResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, testCaseResults_);
        onChanged();
      } else {
        testCaseResultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public Builder clearTestCaseResults() {
      if (testCaseResultsBuilder_ == null) {
        testCaseResults_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        testCaseResultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public Builder removeTestCaseResults(int index) {
      if (testCaseResultsBuilder_ == null) {
        ensureTestCaseResultsIsMutable();
        testCaseResults_.remove(index);
        onChanged();
      } else {
        testCaseResultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder getTestCaseResultsBuilder(
        int index) {
      return getTestCaseResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestCaseResultOrBuilder getTestCaseResultsOrBuilder(
        int index) {
      if (testCaseResultsBuilder_ == null) {
        return testCaseResults_.get(index);  } else {
        return testCaseResultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TestCaseResultOrBuilder> 
         getTestCaseResultsOrBuilderList() {
      if (testCaseResultsBuilder_ != null) {
        return testCaseResultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(testCaseResults_);
      }
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder addTestCaseResultsBuilder() {
      return getTestCaseResultsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder addTestCaseResultsBuilder(
        int index) {
      return getTestCaseResultsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of test case results.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestCaseResult test_case_results = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder> 
         getTestCaseResultsBuilderList() {
      return getTestCaseResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResultOrBuilder> 
        getTestCaseResultsFieldBuilder() {
      if (testCaseResultsBuilder_ == null) {
        testCaseResultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResult.Builder, com.google.cloud.dialogflow.cx.v3beta1.TestCaseResultOrBuilder>(
                testCaseResults_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        testCaseResults_ = null;
      }
      return testCaseResultsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse)
  private static final com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTestCaseResultsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTestCaseResultsResponse>() {
    @java.lang.Override
    public ListTestCaseResultsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTestCaseResultsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTestCaseResultsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

