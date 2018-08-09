// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

/**
 * <pre>
 * The entity-level sentiment analysis response message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1.AnalyzeEntitySentimentResponse}
 */
public  final class AnalyzeEntitySentimentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1.AnalyzeEntitySentimentResponse)
    AnalyzeEntitySentimentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnalyzeEntitySentimentResponse.newBuilder() to construct.
  private AnalyzeEntitySentimentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnalyzeEntitySentimentResponse() {
    entities_ = java.util.Collections.emptyList();
    language_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnalyzeEntitySentimentResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              entities_ = new java.util.ArrayList<com.google.cloud.language.v1.Entity>();
              mutable_bitField0_ |= 0x00000001;
            }
            entities_.add(
                input.readMessage(com.google.cloud.language.v1.Entity.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            language_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        entities_ = java.util.Collections.unmodifiableList(entities_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.class, com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ENTITIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.language.v1.Entity> entities_;
  /**
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  public java.util.List<com.google.cloud.language.v1.Entity> getEntitiesList() {
    return entities_;
  }
  /**
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.language.v1.EntityOrBuilder> 
      getEntitiesOrBuilderList() {
    return entities_;
  }
  /**
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  public int getEntitiesCount() {
    return entities_.size();
  }
  /**
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  public com.google.cloud.language.v1.Entity getEntities(int index) {
    return entities_.get(index);
  }
  /**
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  public com.google.cloud.language.v1.EntityOrBuilder getEntitiesOrBuilder(
      int index) {
    return entities_.get(index);
  }

  public static final int LANGUAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object language_;
  /**
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
   * </pre>
   *
   * <code>string language = 2;</code>
   */
  public java.lang.String getLanguage() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      language_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
   * </pre>
   *
   * <code>string language = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLanguageBytes() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      language_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < entities_.size(); i++) {
      output.writeMessage(1, entities_.get(i));
    }
    if (!getLanguageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, language_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, entities_.get(i));
    }
    if (!getLanguageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, language_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.language.v1.AnalyzeEntitySentimentResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1.AnalyzeEntitySentimentResponse other = (com.google.cloud.language.v1.AnalyzeEntitySentimentResponse) obj;

    boolean result = true;
    result = result && getEntitiesList()
        .equals(other.getEntitiesList());
    result = result && getLanguage()
        .equals(other.getLanguage());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getEntitiesCount() > 0) {
      hash = (37 * hash) + ENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntitiesList().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.language.v1.AnalyzeEntitySentimentResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * The entity-level sentiment analysis response message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1.AnalyzeEntitySentimentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1.AnalyzeEntitySentimentResponse)
      com.google.cloud.language.v1.AnalyzeEntitySentimentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.class, com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.Builder.class);
    }

    // Construct using com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getEntitiesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        entitiesBuilder_.clear();
      }
      language_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_descriptor;
    }

    public com.google.cloud.language.v1.AnalyzeEntitySentimentResponse getDefaultInstanceForType() {
      return com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.getDefaultInstance();
    }

    public com.google.cloud.language.v1.AnalyzeEntitySentimentResponse build() {
      com.google.cloud.language.v1.AnalyzeEntitySentimentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.language.v1.AnalyzeEntitySentimentResponse buildPartial() {
      com.google.cloud.language.v1.AnalyzeEntitySentimentResponse result = new com.google.cloud.language.v1.AnalyzeEntitySentimentResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (entitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          entities_ = java.util.Collections.unmodifiableList(entities_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entities_ = entities_;
      } else {
        result.entities_ = entitiesBuilder_.build();
      }
      result.language_ = language_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.language.v1.AnalyzeEntitySentimentResponse) {
        return mergeFrom((com.google.cloud.language.v1.AnalyzeEntitySentimentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1.AnalyzeEntitySentimentResponse other) {
      if (other == com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.getDefaultInstance()) return this;
      if (entitiesBuilder_ == null) {
        if (!other.entities_.isEmpty()) {
          if (entities_.isEmpty()) {
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntitiesIsMutable();
            entities_.addAll(other.entities_);
          }
          onChanged();
        }
      } else {
        if (!other.entities_.isEmpty()) {
          if (entitiesBuilder_.isEmpty()) {
            entitiesBuilder_.dispose();
            entitiesBuilder_ = null;
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entitiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntitiesFieldBuilder() : null;
          } else {
            entitiesBuilder_.addAllMessages(other.entities_);
          }
        }
      }
      if (!other.getLanguage().isEmpty()) {
        language_ = other.language_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.language.v1.AnalyzeEntitySentimentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.language.v1.Entity> entities_ =
      java.util.Collections.emptyList();
    private void ensureEntitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        entities_ = new java.util.ArrayList<com.google.cloud.language.v1.Entity>(entities_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.language.v1.Entity, com.google.cloud.language.v1.Entity.Builder, com.google.cloud.language.v1.EntityOrBuilder> entitiesBuilder_;

    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public java.util.List<com.google.cloud.language.v1.Entity> getEntitiesList() {
      if (entitiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entities_);
      } else {
        return entitiesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public int getEntitiesCount() {
      if (entitiesBuilder_ == null) {
        return entities_.size();
      } else {
        return entitiesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.Entity getEntities(int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);
      } else {
        return entitiesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder setEntities(
        int index, com.google.cloud.language.v1.Entity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.set(index, value);
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder setEntities(
        int index, com.google.cloud.language.v1.Entity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.set(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(com.google.cloud.language.v1.Entity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(
        int index, com.google.cloud.language.v1.Entity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(index, value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(
        com.google.cloud.language.v1.Entity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(
        int index, com.google.cloud.language.v1.Entity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addAllEntities(
        java.lang.Iterable<? extends com.google.cloud.language.v1.Entity> values) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entities_);
        onChanged();
      } else {
        entitiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder clearEntities() {
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entitiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder removeEntities(int index) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.remove(index);
        onChanged();
      } else {
        entitiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.Entity.Builder getEntitiesBuilder(
        int index) {
      return getEntitiesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.EntityOrBuilder getEntitiesOrBuilder(
        int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);  } else {
        return entitiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.language.v1.EntityOrBuilder> 
         getEntitiesOrBuilderList() {
      if (entitiesBuilder_ != null) {
        return entitiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entities_);
      }
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.Entity.Builder addEntitiesBuilder() {
      return getEntitiesFieldBuilder().addBuilder(
          com.google.cloud.language.v1.Entity.getDefaultInstance());
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.Entity.Builder addEntitiesBuilder(
        int index) {
      return getEntitiesFieldBuilder().addBuilder(
          index, com.google.cloud.language.v1.Entity.getDefaultInstance());
    }
    /**
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public java.util.List<com.google.cloud.language.v1.Entity.Builder> 
         getEntitiesBuilderList() {
      return getEntitiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.language.v1.Entity, com.google.cloud.language.v1.Entity.Builder, com.google.cloud.language.v1.EntityOrBuilder> 
        getEntitiesFieldBuilder() {
      if (entitiesBuilder_ == null) {
        entitiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.language.v1.Entity, com.google.cloud.language.v1.Entity.Builder, com.google.cloud.language.v1.EntityOrBuilder>(
                entities_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        entities_ = null;
      }
      return entitiesBuilder_;
    }

    private java.lang.Object language_ = "";
    /**
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        language_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     */
    public Builder setLanguage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      language_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     */
    public Builder clearLanguage() {
      
      language_ = getDefaultInstance().getLanguage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     */
    public Builder setLanguageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      language_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1.AnalyzeEntitySentimentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1.AnalyzeEntitySentimentResponse)
  private static final com.google.cloud.language.v1.AnalyzeEntitySentimentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1.AnalyzeEntitySentimentResponse();
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalyzeEntitySentimentResponse>
      PARSER = new com.google.protobuf.AbstractParser<AnalyzeEntitySentimentResponse>() {
    public AnalyzeEntitySentimentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnalyzeEntitySentimentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnalyzeEntitySentimentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalyzeEntitySentimentResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.language.v1.AnalyzeEntitySentimentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

