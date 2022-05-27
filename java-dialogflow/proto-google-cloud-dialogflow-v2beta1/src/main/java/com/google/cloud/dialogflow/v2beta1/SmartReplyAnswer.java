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
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Represents a smart reply answer.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.SmartReplyAnswer}
 */
public final class SmartReplyAnswer extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.SmartReplyAnswer)
    SmartReplyAnswerOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SmartReplyAnswer.newBuilder() to construct.
  private SmartReplyAnswer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SmartReplyAnswer() {
    reply_ = "";
    answerRecord_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SmartReplyAnswer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SmartReplyAnswer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              reply_ = s;
              break;
            }
          case 21:
            {
              confidence_ = input.readFloat();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              answerRecord_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2beta1_SmartReplyAnswer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2beta1_SmartReplyAnswer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer.class,
            com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer.Builder.class);
  }

  public static final int REPLY_FIELD_NUMBER = 1;
  private volatile java.lang.Object reply_;
  /**
   *
   *
   * <pre>
   * The content of the reply.
   * </pre>
   *
   * <code>string reply = 1;</code>
   *
   * @return The reply.
   */
  @java.lang.Override
  public java.lang.String getReply() {
    java.lang.Object ref = reply_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reply_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The content of the reply.
   * </pre>
   *
   * <code>string reply = 1;</code>
   *
   * @return The bytes for reply.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReplyBytes() {
    java.lang.Object ref = reply_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      reply_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private float confidence_;
  /**
   *
   *
   * <pre>
   * Smart reply confidence.
   * The system's confidence score that this reply is a good match for
   * this conversation, as a value from 0.0 (completely uncertain) to 1.0
   * (completely certain).
   * </pre>
   *
   * <code>float confidence = 2;</code>
   *
   * @return The confidence.
   */
  @java.lang.Override
  public float getConfidence() {
    return confidence_;
  }

  public static final int ANSWER_RECORD_FIELD_NUMBER = 3;
  private volatile java.lang.Object answerRecord_;
  /**
   *
   *
   * <pre>
   * The name of answer record, in the format of
   * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
   * ID&gt;"
   * </pre>
   *
   * <code>string answer_record = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The answerRecord.
   */
  @java.lang.Override
  public java.lang.String getAnswerRecord() {
    java.lang.Object ref = answerRecord_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      answerRecord_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of answer record, in the format of
   * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
   * ID&gt;"
   * </pre>
   *
   * <code>string answer_record = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for answerRecord.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAnswerRecordBytes() {
    java.lang.Object ref = answerRecord_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      answerRecord_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reply_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reply_);
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      output.writeFloat(2, confidence_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(answerRecord_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, answerRecord_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reply_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reply_);
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, confidence_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(answerRecord_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, answerRecord_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer other =
        (com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer) obj;

    if (!getReply().equals(other.getReply())) return false;
    if (java.lang.Float.floatToIntBits(getConfidence())
        != java.lang.Float.floatToIntBits(other.getConfidence())) return false;
    if (!getAnswerRecord().equals(other.getAnswerRecord())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REPLY_FIELD_NUMBER;
    hash = (53 * hash) + getReply().hashCode();
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidence());
    hash = (37 * hash) + ANSWER_RECORD_FIELD_NUMBER;
    hash = (53 * hash) + getAnswerRecord().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer prototype) {
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
   * Represents a smart reply answer.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.SmartReplyAnswer}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.SmartReplyAnswer)
      com.google.cloud.dialogflow.v2beta1.SmartReplyAnswerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_SmartReplyAnswer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_SmartReplyAnswer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer.class,
              com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      reply_ = "";

      confidence_ = 0F;

      answerRecord_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_SmartReplyAnswer_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer build() {
      com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer buildPartial() {
      com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer result =
          new com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer(this);
      result.reply_ = reply_;
      result.confidence_ = confidence_;
      result.answerRecord_ = answerRecord_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer other) {
      if (other == com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer.getDefaultInstance())
        return this;
      if (!other.getReply().isEmpty()) {
        reply_ = other.reply_;
        onChanged();
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
      }
      if (!other.getAnswerRecord().isEmpty()) {
        answerRecord_ = other.answerRecord_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object reply_ = "";
    /**
     *
     *
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     *
     * @return The reply.
     */
    public java.lang.String getReply() {
      java.lang.Object ref = reply_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reply_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     *
     * @return The bytes for reply.
     */
    public com.google.protobuf.ByteString getReplyBytes() {
      java.lang.Object ref = reply_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reply_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     *
     * @param value The reply to set.
     * @return This builder for chaining.
     */
    public Builder setReply(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      reply_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReply() {

      reply_ = getDefaultInstance().getReply();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The content of the reply.
     * </pre>
     *
     * <code>string reply = 1;</code>
     *
     * @param value The bytes for reply to set.
     * @return This builder for chaining.
     */
    public Builder setReplyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      reply_ = value;
      onChanged();
      return this;
    }

    private float confidence_;
    /**
     *
     *
     * <pre>
     * Smart reply confidence.
     * The system's confidence score that this reply is a good match for
     * this conversation, as a value from 0.0 (completely uncertain) to 1.0
     * (completely certain).
     * </pre>
     *
     * <code>float confidence = 2;</code>
     *
     * @return The confidence.
     */
    @java.lang.Override
    public float getConfidence() {
      return confidence_;
    }
    /**
     *
     *
     * <pre>
     * Smart reply confidence.
     * The system's confidence score that this reply is a good match for
     * this conversation, as a value from 0.0 (completely uncertain) to 1.0
     * (completely certain).
     * </pre>
     *
     * <code>float confidence = 2;</code>
     *
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(float value) {

      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Smart reply confidence.
     * The system's confidence score that this reply is a good match for
     * this conversation, as a value from 0.0 (completely uncertain) to 1.0
     * (completely certain).
     * </pre>
     *
     * <code>float confidence = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {

      confidence_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object answerRecord_ = "";
    /**
     *
     *
     * <pre>
     * The name of answer record, in the format of
     * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
     * ID&gt;"
     * </pre>
     *
     * <code>string answer_record = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The answerRecord.
     */
    public java.lang.String getAnswerRecord() {
      java.lang.Object ref = answerRecord_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        answerRecord_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of answer record, in the format of
     * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
     * ID&gt;"
     * </pre>
     *
     * <code>string answer_record = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for answerRecord.
     */
    public com.google.protobuf.ByteString getAnswerRecordBytes() {
      java.lang.Object ref = answerRecord_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        answerRecord_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of answer record, in the format of
     * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
     * ID&gt;"
     * </pre>
     *
     * <code>string answer_record = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The answerRecord to set.
     * @return This builder for chaining.
     */
    public Builder setAnswerRecord(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      answerRecord_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of answer record, in the format of
     * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
     * ID&gt;"
     * </pre>
     *
     * <code>string answer_record = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAnswerRecord() {

      answerRecord_ = getDefaultInstance().getAnswerRecord();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of answer record, in the format of
     * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
     * ID&gt;"
     * </pre>
     *
     * <code>string answer_record = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for answerRecord to set.
     * @return This builder for chaining.
     */
    public Builder setAnswerRecordBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      answerRecord_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.SmartReplyAnswer)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SmartReplyAnswer)
  private static final com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer();
  }

  public static com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmartReplyAnswer> PARSER =
      new com.google.protobuf.AbstractParser<SmartReplyAnswer>() {
        @java.lang.Override
        public SmartReplyAnswer parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SmartReplyAnswer(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SmartReplyAnswer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmartReplyAnswer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
