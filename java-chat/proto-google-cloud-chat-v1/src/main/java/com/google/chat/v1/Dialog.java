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
// source: google/chat/v1/message.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * Wrapper around the card body of the dialog.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.Dialog}
 */
public final class Dialog extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.Dialog)
    DialogOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Dialog.newBuilder() to construct.
  private Dialog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Dialog() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Dialog();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_Dialog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_Dialog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.Dialog.class, com.google.chat.v1.Dialog.Builder.class);
  }

  private int bitField0_;
  public static final int BODY_FIELD_NUMBER = 1;
  private com.google.apps.card.v1.Card body_;
  /**
   *
   *
   * <pre>
   * Input only. Body of the dialog, which is rendered in a modal.
   * Google Chat apps don't support the following card entities:
   * `DateTimePicker`, `OnChangeAction`.
   * </pre>
   *
   * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return Whether the body field is set.
   */
  @java.lang.Override
  public boolean hasBody() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Input only. Body of the dialog, which is rendered in a modal.
   * Google Chat apps don't support the following card entities:
   * `DateTimePicker`, `OnChangeAction`.
   * </pre>
   *
   * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The body.
   */
  @java.lang.Override
  public com.google.apps.card.v1.Card getBody() {
    return body_ == null ? com.google.apps.card.v1.Card.getDefaultInstance() : body_;
  }
  /**
   *
   *
   * <pre>
   * Input only. Body of the dialog, which is rendered in a modal.
   * Google Chat apps don't support the following card entities:
   * `DateTimePicker`, `OnChangeAction`.
   * </pre>
   *
   * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.apps.card.v1.CardOrBuilder getBodyOrBuilder() {
    return body_ == null ? com.google.apps.card.v1.Card.getDefaultInstance() : body_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getBody());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getBody());
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
    if (!(obj instanceof com.google.chat.v1.Dialog)) {
      return super.equals(obj);
    }
    com.google.chat.v1.Dialog other = (com.google.chat.v1.Dialog) obj;

    if (hasBody() != other.hasBody()) return false;
    if (hasBody()) {
      if (!getBody().equals(other.getBody())) return false;
    }
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
    if (hasBody()) {
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.Dialog parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Dialog parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Dialog parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Dialog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Dialog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Dialog parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Dialog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Dialog parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.Dialog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Dialog parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.Dialog parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Dialog parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.Dialog prototype) {
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
   * Wrapper around the card body of the dialog.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.Dialog}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.Dialog)
      com.google.chat.v1.DialogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_Dialog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.MessageProto
          .internal_static_google_chat_v1_Dialog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.Dialog.class, com.google.chat.v1.Dialog.Builder.class);
    }

    // Construct using com.google.chat.v1.Dialog.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getBodyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      body_ = null;
      if (bodyBuilder_ != null) {
        bodyBuilder_.dispose();
        bodyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_Dialog_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.Dialog getDefaultInstanceForType() {
      return com.google.chat.v1.Dialog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.Dialog build() {
      com.google.chat.v1.Dialog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.Dialog buildPartial() {
      com.google.chat.v1.Dialog result = new com.google.chat.v1.Dialog(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.Dialog result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.body_ = bodyBuilder_ == null ? body_ : bodyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.chat.v1.Dialog) {
        return mergeFrom((com.google.chat.v1.Dialog) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.Dialog other) {
      if (other == com.google.chat.v1.Dialog.getDefaultInstance()) return this;
      if (other.hasBody()) {
        mergeBody(other.getBody());
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
                input.readMessage(getBodyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.apps.card.v1.Card body_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.card.v1.Card,
            com.google.apps.card.v1.Card.Builder,
            com.google.apps.card.v1.CardOrBuilder>
        bodyBuilder_;
    /**
     *
     *
     * <pre>
     * Input only. Body of the dialog, which is rendered in a modal.
     * Google Chat apps don't support the following card entities:
     * `DateTimePicker`, `OnChangeAction`.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return Whether the body field is set.
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Input only. Body of the dialog, which is rendered in a modal.
     * Google Chat apps don't support the following card entities:
     * `DateTimePicker`, `OnChangeAction`.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return The body.
     */
    public com.google.apps.card.v1.Card getBody() {
      if (bodyBuilder_ == null) {
        return body_ == null ? com.google.apps.card.v1.Card.getDefaultInstance() : body_;
      } else {
        return bodyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Input only. Body of the dialog, which is rendered in a modal.
     * Google Chat apps don't support the following card entities:
     * `DateTimePicker`, `OnChangeAction`.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder setBody(com.google.apps.card.v1.Card value) {
      if (bodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        body_ = value;
      } else {
        bodyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Body of the dialog, which is rendered in a modal.
     * Google Chat apps don't support the following card entities:
     * `DateTimePicker`, `OnChangeAction`.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder setBody(com.google.apps.card.v1.Card.Builder builderForValue) {
      if (bodyBuilder_ == null) {
        body_ = builderForValue.build();
      } else {
        bodyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Body of the dialog, which is rendered in a modal.
     * Google Chat apps don't support the following card entities:
     * `DateTimePicker`, `OnChangeAction`.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder mergeBody(com.google.apps.card.v1.Card value) {
      if (bodyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && body_ != null
            && body_ != com.google.apps.card.v1.Card.getDefaultInstance()) {
          getBodyBuilder().mergeFrom(value);
        } else {
          body_ = value;
        }
      } else {
        bodyBuilder_.mergeFrom(value);
      }
      if (body_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Body of the dialog, which is rendered in a modal.
     * Google Chat apps don't support the following card entities:
     * `DateTimePicker`, `OnChangeAction`.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public Builder clearBody() {
      bitField0_ = (bitField0_ & ~0x00000001);
      body_ = null;
      if (bodyBuilder_ != null) {
        bodyBuilder_.dispose();
        bodyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Body of the dialog, which is rendered in a modal.
     * Google Chat apps don't support the following card entities:
     * `DateTimePicker`, `OnChangeAction`.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public com.google.apps.card.v1.Card.Builder getBodyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBodyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Input only. Body of the dialog, which is rendered in a modal.
     * Google Chat apps don't support the following card entities:
     * `DateTimePicker`, `OnChangeAction`.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    public com.google.apps.card.v1.CardOrBuilder getBodyOrBuilder() {
      if (bodyBuilder_ != null) {
        return bodyBuilder_.getMessageOrBuilder();
      } else {
        return body_ == null ? com.google.apps.card.v1.Card.getDefaultInstance() : body_;
      }
    }
    /**
     *
     *
     * <pre>
     * Input only. Body of the dialog, which is rendered in a modal.
     * Google Chat apps don't support the following card entities:
     * `DateTimePicker`, `OnChangeAction`.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card body = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.card.v1.Card,
            com.google.apps.card.v1.Card.Builder,
            com.google.apps.card.v1.CardOrBuilder>
        getBodyFieldBuilder() {
      if (bodyBuilder_ == null) {
        bodyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.apps.card.v1.Card,
                com.google.apps.card.v1.Card.Builder,
                com.google.apps.card.v1.CardOrBuilder>(
                getBody(), getParentForChildren(), isClean());
        body_ = null;
      }
      return bodyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.Dialog)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.Dialog)
  private static final com.google.chat.v1.Dialog DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.Dialog();
  }

  public static com.google.chat.v1.Dialog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Dialog> PARSER =
      new com.google.protobuf.AbstractParser<Dialog>() {
        @java.lang.Override
        public Dialog parsePartialFrom(
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

  public static com.google.protobuf.Parser<Dialog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Dialog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.Dialog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
