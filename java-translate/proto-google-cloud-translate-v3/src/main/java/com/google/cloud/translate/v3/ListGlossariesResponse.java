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
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

/**
 *
 *
 * <pre>
 * Response message for ListGlossaries.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.ListGlossariesResponse}
 */
public final class ListGlossariesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.ListGlossariesResponse)
    ListGlossariesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListGlossariesResponse.newBuilder() to construct.
  private ListGlossariesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListGlossariesResponse() {
    glossaries_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListGlossariesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.translate.v3.TranslationServiceProto
        .internal_static_google_cloud_translation_v3_ListGlossariesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.TranslationServiceProto
        .internal_static_google_cloud_translation_v3_ListGlossariesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.ListGlossariesResponse.class,
            com.google.cloud.translate.v3.ListGlossariesResponse.Builder.class);
  }

  public static final int GLOSSARIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.translate.v3.Glossary> glossaries_;
  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.translate.v3.Glossary> getGlossariesList() {
    return glossaries_;
  }
  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.translate.v3.GlossaryOrBuilder>
      getGlossariesOrBuilderList() {
    return glossaries_;
  }
  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  @java.lang.Override
  public int getGlossariesCount() {
    return glossaries_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.Glossary getGlossaries(int index) {
    return glossaries_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.GlossaryOrBuilder getGlossariesOrBuilder(int index) {
    return glossaries_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve a page of results. Pass this value in the
   * [ListGlossariesRequest.page_token] field in the subsequent call to
   * `ListGlossaries` method to retrieve the next page of results.
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
   * A token to retrieve a page of results. Pass this value in the
   * [ListGlossariesRequest.page_token] field in the subsequent call to
   * `ListGlossaries` method to retrieve the next page of results.
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
    for (int i = 0; i < glossaries_.size(); i++) {
      output.writeMessage(1, glossaries_.get(i));
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
    for (int i = 0; i < glossaries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, glossaries_.get(i));
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
    if (!(obj instanceof com.google.cloud.translate.v3.ListGlossariesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.ListGlossariesResponse other =
        (com.google.cloud.translate.v3.ListGlossariesResponse) obj;

    if (!getGlossariesList().equals(other.getGlossariesList())) return false;
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
    if (getGlossariesCount() > 0) {
      hash = (37 * hash) + GLOSSARIES_FIELD_NUMBER;
      hash = (53 * hash) + getGlossariesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.translate.v3.ListGlossariesResponse prototype) {
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
   * Response message for ListGlossaries.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.ListGlossariesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.ListGlossariesResponse)
      com.google.cloud.translate.v3.ListGlossariesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_ListGlossariesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_ListGlossariesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.ListGlossariesResponse.class,
              com.google.cloud.translate.v3.ListGlossariesResponse.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.ListGlossariesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (glossariesBuilder_ == null) {
        glossaries_ = java.util.Collections.emptyList();
      } else {
        glossaries_ = null;
        glossariesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_ListGlossariesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.ListGlossariesResponse getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.ListGlossariesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.ListGlossariesResponse build() {
      com.google.cloud.translate.v3.ListGlossariesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.ListGlossariesResponse buildPartial() {
      com.google.cloud.translate.v3.ListGlossariesResponse result =
          new com.google.cloud.translate.v3.ListGlossariesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.translate.v3.ListGlossariesResponse result) {
      if (glossariesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          glossaries_ = java.util.Collections.unmodifiableList(glossaries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.glossaries_ = glossaries_;
      } else {
        result.glossaries_ = glossariesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.translate.v3.ListGlossariesResponse result) {
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
      if (other instanceof com.google.cloud.translate.v3.ListGlossariesResponse) {
        return mergeFrom((com.google.cloud.translate.v3.ListGlossariesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.ListGlossariesResponse other) {
      if (other == com.google.cloud.translate.v3.ListGlossariesResponse.getDefaultInstance())
        return this;
      if (glossariesBuilder_ == null) {
        if (!other.glossaries_.isEmpty()) {
          if (glossaries_.isEmpty()) {
            glossaries_ = other.glossaries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGlossariesIsMutable();
            glossaries_.addAll(other.glossaries_);
          }
          onChanged();
        }
      } else {
        if (!other.glossaries_.isEmpty()) {
          if (glossariesBuilder_.isEmpty()) {
            glossariesBuilder_.dispose();
            glossariesBuilder_ = null;
            glossaries_ = other.glossaries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            glossariesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getGlossariesFieldBuilder()
                    : null;
          } else {
            glossariesBuilder_.addAllMessages(other.glossaries_);
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
                com.google.cloud.translate.v3.Glossary m =
                    input.readMessage(
                        com.google.cloud.translate.v3.Glossary.parser(), extensionRegistry);
                if (glossariesBuilder_ == null) {
                  ensureGlossariesIsMutable();
                  glossaries_.add(m);
                } else {
                  glossariesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.translate.v3.Glossary> glossaries_ =
        java.util.Collections.emptyList();

    private void ensureGlossariesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        glossaries_ = new java.util.ArrayList<com.google.cloud.translate.v3.Glossary>(glossaries_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.translate.v3.Glossary,
            com.google.cloud.translate.v3.Glossary.Builder,
            com.google.cloud.translate.v3.GlossaryOrBuilder>
        glossariesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public java.util.List<com.google.cloud.translate.v3.Glossary> getGlossariesList() {
      if (glossariesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(glossaries_);
      } else {
        return glossariesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public int getGlossariesCount() {
      if (glossariesBuilder_ == null) {
        return glossaries_.size();
      } else {
        return glossariesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public com.google.cloud.translate.v3.Glossary getGlossaries(int index) {
      if (glossariesBuilder_ == null) {
        return glossaries_.get(index);
      } else {
        return glossariesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public Builder setGlossaries(int index, com.google.cloud.translate.v3.Glossary value) {
      if (glossariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGlossariesIsMutable();
        glossaries_.set(index, value);
        onChanged();
      } else {
        glossariesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public Builder setGlossaries(
        int index, com.google.cloud.translate.v3.Glossary.Builder builderForValue) {
      if (glossariesBuilder_ == null) {
        ensureGlossariesIsMutable();
        glossaries_.set(index, builderForValue.build());
        onChanged();
      } else {
        glossariesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public Builder addGlossaries(com.google.cloud.translate.v3.Glossary value) {
      if (glossariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGlossariesIsMutable();
        glossaries_.add(value);
        onChanged();
      } else {
        glossariesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public Builder addGlossaries(int index, com.google.cloud.translate.v3.Glossary value) {
      if (glossariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGlossariesIsMutable();
        glossaries_.add(index, value);
        onChanged();
      } else {
        glossariesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public Builder addGlossaries(com.google.cloud.translate.v3.Glossary.Builder builderForValue) {
      if (glossariesBuilder_ == null) {
        ensureGlossariesIsMutable();
        glossaries_.add(builderForValue.build());
        onChanged();
      } else {
        glossariesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public Builder addGlossaries(
        int index, com.google.cloud.translate.v3.Glossary.Builder builderForValue) {
      if (glossariesBuilder_ == null) {
        ensureGlossariesIsMutable();
        glossaries_.add(index, builderForValue.build());
        onChanged();
      } else {
        glossariesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public Builder addAllGlossaries(
        java.lang.Iterable<? extends com.google.cloud.translate.v3.Glossary> values) {
      if (glossariesBuilder_ == null) {
        ensureGlossariesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, glossaries_);
        onChanged();
      } else {
        glossariesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public Builder clearGlossaries() {
      if (glossariesBuilder_ == null) {
        glossaries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        glossariesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public Builder removeGlossaries(int index) {
      if (glossariesBuilder_ == null) {
        ensureGlossariesIsMutable();
        glossaries_.remove(index);
        onChanged();
      } else {
        glossariesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public com.google.cloud.translate.v3.Glossary.Builder getGlossariesBuilder(int index) {
      return getGlossariesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public com.google.cloud.translate.v3.GlossaryOrBuilder getGlossariesOrBuilder(int index) {
      if (glossariesBuilder_ == null) {
        return glossaries_.get(index);
      } else {
        return glossariesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.translate.v3.GlossaryOrBuilder>
        getGlossariesOrBuilderList() {
      if (glossariesBuilder_ != null) {
        return glossariesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(glossaries_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public com.google.cloud.translate.v3.Glossary.Builder addGlossariesBuilder() {
      return getGlossariesFieldBuilder()
          .addBuilder(com.google.cloud.translate.v3.Glossary.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public com.google.cloud.translate.v3.Glossary.Builder addGlossariesBuilder(int index) {
      return getGlossariesFieldBuilder()
          .addBuilder(index, com.google.cloud.translate.v3.Glossary.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of glossaries for a project.
     * </pre>
     *
     * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
     */
    public java.util.List<com.google.cloud.translate.v3.Glossary.Builder>
        getGlossariesBuilderList() {
      return getGlossariesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.translate.v3.Glossary,
            com.google.cloud.translate.v3.Glossary.Builder,
            com.google.cloud.translate.v3.GlossaryOrBuilder>
        getGlossariesFieldBuilder() {
      if (glossariesBuilder_ == null) {
        glossariesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.translate.v3.Glossary,
                com.google.cloud.translate.v3.Glossary.Builder,
                com.google.cloud.translate.v3.GlossaryOrBuilder>(
                glossaries_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        glossaries_ = null;
      }
      return glossariesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve a page of results. Pass this value in the
     * [ListGlossariesRequest.page_token] field in the subsequent call to
     * `ListGlossaries` method to retrieve the next page of results.
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
     * A token to retrieve a page of results. Pass this value in the
     * [ListGlossariesRequest.page_token] field in the subsequent call to
     * `ListGlossaries` method to retrieve the next page of results.
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
     * A token to retrieve a page of results. Pass this value in the
     * [ListGlossariesRequest.page_token] field in the subsequent call to
     * `ListGlossaries` method to retrieve the next page of results.
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
     * A token to retrieve a page of results. Pass this value in the
     * [ListGlossariesRequest.page_token] field in the subsequent call to
     * `ListGlossaries` method to retrieve the next page of results.
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
     * A token to retrieve a page of results. Pass this value in the
     * [ListGlossariesRequest.page_token] field in the subsequent call to
     * `ListGlossaries` method to retrieve the next page of results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.ListGlossariesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.ListGlossariesResponse)
  private static final com.google.cloud.translate.v3.ListGlossariesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.ListGlossariesResponse();
  }

  public static com.google.cloud.translate.v3.ListGlossariesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListGlossariesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListGlossariesResponse>() {
        @java.lang.Override
        public ListGlossariesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListGlossariesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListGlossariesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.ListGlossariesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
