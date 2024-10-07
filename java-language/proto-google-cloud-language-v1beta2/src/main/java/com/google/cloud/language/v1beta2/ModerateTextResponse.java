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
// source: google/cloud/language/v1beta2/language_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.language.v1beta2;

/**
 *
 *
 * <pre>
 * The document moderation response message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1beta2.ModerateTextResponse}
 */
public final class ModerateTextResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1beta2.ModerateTextResponse)
    ModerateTextResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ModerateTextResponse.newBuilder() to construct.
  private ModerateTextResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ModerateTextResponse() {
    moderationCategories_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ModerateTextResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.language.v1beta2.LanguageServiceProto
        .internal_static_google_cloud_language_v1beta2_ModerateTextResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1beta2.LanguageServiceProto
        .internal_static_google_cloud_language_v1beta2_ModerateTextResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1beta2.ModerateTextResponse.class,
            com.google.cloud.language.v1beta2.ModerateTextResponse.Builder.class);
  }

  public static final int MODERATION_CATEGORIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.language.v1beta2.ClassificationCategory>
      moderationCategories_;
  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.language.v1beta2.ClassificationCategory>
      getModerationCategoriesList() {
    return moderationCategories_;
  }
  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.language.v1beta2.ClassificationCategoryOrBuilder>
      getModerationCategoriesOrBuilderList() {
    return moderationCategories_;
  }
  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
   * </code>
   */
  @java.lang.Override
  public int getModerationCategoriesCount() {
    return moderationCategories_.size();
  }
  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.language.v1beta2.ClassificationCategory getModerationCategories(
      int index) {
    return moderationCategories_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Harmful and sensitive categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.language.v1beta2.ClassificationCategoryOrBuilder
      getModerationCategoriesOrBuilder(int index) {
    return moderationCategories_.get(index);
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
    for (int i = 0; i < moderationCategories_.size(); i++) {
      output.writeMessage(1, moderationCategories_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < moderationCategories_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, moderationCategories_.get(i));
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
    if (!(obj instanceof com.google.cloud.language.v1beta2.ModerateTextResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1beta2.ModerateTextResponse other =
        (com.google.cloud.language.v1beta2.ModerateTextResponse) obj;

    if (!getModerationCategoriesList().equals(other.getModerationCategoriesList())) return false;
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
    if (getModerationCategoriesCount() > 0) {
      hash = (37 * hash) + MODERATION_CATEGORIES_FIELD_NUMBER;
      hash = (53 * hash) + getModerationCategoriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse parseFrom(
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
      com.google.cloud.language.v1beta2.ModerateTextResponse prototype) {
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
   * The document moderation response message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1beta2.ModerateTextResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1beta2.ModerateTextResponse)
      com.google.cloud.language.v1beta2.ModerateTextResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto
          .internal_static_google_cloud_language_v1beta2_ModerateTextResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto
          .internal_static_google_cloud_language_v1beta2_ModerateTextResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1beta2.ModerateTextResponse.class,
              com.google.cloud.language.v1beta2.ModerateTextResponse.Builder.class);
    }

    // Construct using com.google.cloud.language.v1beta2.ModerateTextResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (moderationCategoriesBuilder_ == null) {
        moderationCategories_ = java.util.Collections.emptyList();
      } else {
        moderationCategories_ = null;
        moderationCategoriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto
          .internal_static_google_cloud_language_v1beta2_ModerateTextResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.language.v1beta2.ModerateTextResponse getDefaultInstanceForType() {
      return com.google.cloud.language.v1beta2.ModerateTextResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.language.v1beta2.ModerateTextResponse build() {
      com.google.cloud.language.v1beta2.ModerateTextResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.language.v1beta2.ModerateTextResponse buildPartial() {
      com.google.cloud.language.v1beta2.ModerateTextResponse result =
          new com.google.cloud.language.v1beta2.ModerateTextResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.language.v1beta2.ModerateTextResponse result) {
      if (moderationCategoriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          moderationCategories_ = java.util.Collections.unmodifiableList(moderationCategories_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.moderationCategories_ = moderationCategories_;
      } else {
        result.moderationCategories_ = moderationCategoriesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.language.v1beta2.ModerateTextResponse result) {
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
      if (other instanceof com.google.cloud.language.v1beta2.ModerateTextResponse) {
        return mergeFrom((com.google.cloud.language.v1beta2.ModerateTextResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1beta2.ModerateTextResponse other) {
      if (other == com.google.cloud.language.v1beta2.ModerateTextResponse.getDefaultInstance())
        return this;
      if (moderationCategoriesBuilder_ == null) {
        if (!other.moderationCategories_.isEmpty()) {
          if (moderationCategories_.isEmpty()) {
            moderationCategories_ = other.moderationCategories_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModerationCategoriesIsMutable();
            moderationCategories_.addAll(other.moderationCategories_);
          }
          onChanged();
        }
      } else {
        if (!other.moderationCategories_.isEmpty()) {
          if (moderationCategoriesBuilder_.isEmpty()) {
            moderationCategoriesBuilder_.dispose();
            moderationCategoriesBuilder_ = null;
            moderationCategories_ = other.moderationCategories_;
            bitField0_ = (bitField0_ & ~0x00000001);
            moderationCategoriesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getModerationCategoriesFieldBuilder()
                    : null;
          } else {
            moderationCategoriesBuilder_.addAllMessages(other.moderationCategories_);
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
                com.google.cloud.language.v1beta2.ClassificationCategory m =
                    input.readMessage(
                        com.google.cloud.language.v1beta2.ClassificationCategory.parser(),
                        extensionRegistry);
                if (moderationCategoriesBuilder_ == null) {
                  ensureModerationCategoriesIsMutable();
                  moderationCategories_.add(m);
                } else {
                  moderationCategoriesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.language.v1beta2.ClassificationCategory>
        moderationCategories_ = java.util.Collections.emptyList();

    private void ensureModerationCategoriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        moderationCategories_ =
            new java.util.ArrayList<com.google.cloud.language.v1beta2.ClassificationCategory>(
                moderationCategories_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.language.v1beta2.ClassificationCategory,
            com.google.cloud.language.v1beta2.ClassificationCategory.Builder,
            com.google.cloud.language.v1beta2.ClassificationCategoryOrBuilder>
        moderationCategoriesBuilder_;

    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.language.v1beta2.ClassificationCategory>
        getModerationCategoriesList() {
      if (moderationCategoriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(moderationCategories_);
      } else {
        return moderationCategoriesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public int getModerationCategoriesCount() {
      if (moderationCategoriesBuilder_ == null) {
        return moderationCategories_.size();
      } else {
        return moderationCategoriesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public com.google.cloud.language.v1beta2.ClassificationCategory getModerationCategories(
        int index) {
      if (moderationCategoriesBuilder_ == null) {
        return moderationCategories_.get(index);
      } else {
        return moderationCategoriesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public Builder setModerationCategories(
        int index, com.google.cloud.language.v1beta2.ClassificationCategory value) {
      if (moderationCategoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModerationCategoriesIsMutable();
        moderationCategories_.set(index, value);
        onChanged();
      } else {
        moderationCategoriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public Builder setModerationCategories(
        int index,
        com.google.cloud.language.v1beta2.ClassificationCategory.Builder builderForValue) {
      if (moderationCategoriesBuilder_ == null) {
        ensureModerationCategoriesIsMutable();
        moderationCategories_.set(index, builderForValue.build());
        onChanged();
      } else {
        moderationCategoriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public Builder addModerationCategories(
        com.google.cloud.language.v1beta2.ClassificationCategory value) {
      if (moderationCategoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModerationCategoriesIsMutable();
        moderationCategories_.add(value);
        onChanged();
      } else {
        moderationCategoriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public Builder addModerationCategories(
        int index, com.google.cloud.language.v1beta2.ClassificationCategory value) {
      if (moderationCategoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModerationCategoriesIsMutable();
        moderationCategories_.add(index, value);
        onChanged();
      } else {
        moderationCategoriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public Builder addModerationCategories(
        com.google.cloud.language.v1beta2.ClassificationCategory.Builder builderForValue) {
      if (moderationCategoriesBuilder_ == null) {
        ensureModerationCategoriesIsMutable();
        moderationCategories_.add(builderForValue.build());
        onChanged();
      } else {
        moderationCategoriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public Builder addModerationCategories(
        int index,
        com.google.cloud.language.v1beta2.ClassificationCategory.Builder builderForValue) {
      if (moderationCategoriesBuilder_ == null) {
        ensureModerationCategoriesIsMutable();
        moderationCategories_.add(index, builderForValue.build());
        onChanged();
      } else {
        moderationCategoriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public Builder addAllModerationCategories(
        java.lang.Iterable<? extends com.google.cloud.language.v1beta2.ClassificationCategory>
            values) {
      if (moderationCategoriesBuilder_ == null) {
        ensureModerationCategoriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, moderationCategories_);
        onChanged();
      } else {
        moderationCategoriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public Builder clearModerationCategories() {
      if (moderationCategoriesBuilder_ == null) {
        moderationCategories_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        moderationCategoriesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public Builder removeModerationCategories(int index) {
      if (moderationCategoriesBuilder_ == null) {
        ensureModerationCategoriesIsMutable();
        moderationCategories_.remove(index);
        onChanged();
      } else {
        moderationCategoriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public com.google.cloud.language.v1beta2.ClassificationCategory.Builder
        getModerationCategoriesBuilder(int index) {
      return getModerationCategoriesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public com.google.cloud.language.v1beta2.ClassificationCategoryOrBuilder
        getModerationCategoriesOrBuilder(int index) {
      if (moderationCategoriesBuilder_ == null) {
        return moderationCategories_.get(index);
      } else {
        return moderationCategoriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.language.v1beta2.ClassificationCategoryOrBuilder>
        getModerationCategoriesOrBuilderList() {
      if (moderationCategoriesBuilder_ != null) {
        return moderationCategoriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(moderationCategories_);
      }
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public com.google.cloud.language.v1beta2.ClassificationCategory.Builder
        addModerationCategoriesBuilder() {
      return getModerationCategoriesFieldBuilder()
          .addBuilder(
              com.google.cloud.language.v1beta2.ClassificationCategory.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public com.google.cloud.language.v1beta2.ClassificationCategory.Builder
        addModerationCategoriesBuilder(int index) {
      return getModerationCategoriesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.language.v1beta2.ClassificationCategory.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Harmful and sensitive categories representing the input document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.language.v1beta2.ClassificationCategory moderation_categories = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.language.v1beta2.ClassificationCategory.Builder>
        getModerationCategoriesBuilderList() {
      return getModerationCategoriesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.language.v1beta2.ClassificationCategory,
            com.google.cloud.language.v1beta2.ClassificationCategory.Builder,
            com.google.cloud.language.v1beta2.ClassificationCategoryOrBuilder>
        getModerationCategoriesFieldBuilder() {
      if (moderationCategoriesBuilder_ == null) {
        moderationCategoriesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.language.v1beta2.ClassificationCategory,
                com.google.cloud.language.v1beta2.ClassificationCategory.Builder,
                com.google.cloud.language.v1beta2.ClassificationCategoryOrBuilder>(
                moderationCategories_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        moderationCategories_ = null;
      }
      return moderationCategoriesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1beta2.ModerateTextResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1beta2.ModerateTextResponse)
  private static final com.google.cloud.language.v1beta2.ModerateTextResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1beta2.ModerateTextResponse();
  }

  public static com.google.cloud.language.v1beta2.ModerateTextResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModerateTextResponse> PARSER =
      new com.google.protobuf.AbstractParser<ModerateTextResponse>() {
        @java.lang.Override
        public ModerateTextResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModerateTextResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModerateTextResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.language.v1beta2.ModerateTextResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
