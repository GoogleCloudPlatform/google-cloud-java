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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 *
 *
 * <pre>
 * Request message for the
 * [UpdatePhraseSet][google.cloud.speech.v2.Speech.UpdatePhraseSet] method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.UpdatePhraseSetRequest}
 */
public final class UpdatePhraseSetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.UpdatePhraseSetRequest)
    UpdatePhraseSetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdatePhraseSetRequest.newBuilder() to construct.
  private UpdatePhraseSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdatePhraseSetRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdatePhraseSetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdatePhraseSetRequest(
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
              com.google.cloud.speech.v2.PhraseSet.Builder subBuilder = null;
              if (phraseSet_ != null) {
                subBuilder = phraseSet_.toBuilder();
              }
              phraseSet_ =
                  input.readMessage(
                      com.google.cloud.speech.v2.PhraseSet.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(phraseSet_);
                phraseSet_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          case 32:
            {
              validateOnly_ = input.readBool();
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
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_UpdatePhraseSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_UpdatePhraseSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.UpdatePhraseSetRequest.class,
            com.google.cloud.speech.v2.UpdatePhraseSetRequest.Builder.class);
  }

  public static final int PHRASE_SET_FIELD_NUMBER = 1;
  private com.google.cloud.speech.v2.PhraseSet phraseSet_;
  /**
   *
   *
   * <pre>
   * Required. The PhraseSet to update.
   * The PhraseSet's `name` field is used to identify the PhraseSet to update.
   * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the phraseSet field is set.
   */
  @java.lang.Override
  public boolean hasPhraseSet() {
    return phraseSet_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The PhraseSet to update.
   * The PhraseSet's `name` field is used to identify the PhraseSet to update.
   * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The phraseSet.
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.PhraseSet getPhraseSet() {
    return phraseSet_ == null
        ? com.google.cloud.speech.v2.PhraseSet.getDefaultInstance()
        : phraseSet_;
  }
  /**
   *
   *
   * <pre>
   * Required. The PhraseSet to update.
   * The PhraseSet's `name` field is used to identify the PhraseSet to update.
   * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.PhraseSetOrBuilder getPhraseSetOrBuilder() {
    return getPhraseSet();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to update. If empty, all non-default valued fields are
   * considered for update. Use `*` to update the entire PhraseSet resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update. If empty, all non-default valued fields are
   * considered for update. Use `*` to update the entire PhraseSet resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update. If empty, all non-default valued fields are
   * considered for update. Use `*` to update the entire PhraseSet resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_;
  /**
   *
   *
   * <pre>
   * If set, validate the request and preview the updated PhraseSet, but do not
   * actually update it.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (phraseSet_ != null) {
      output.writeMessage(1, getPhraseSet());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (phraseSet_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPhraseSet());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.speech.v2.UpdatePhraseSetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.UpdatePhraseSetRequest other =
        (com.google.cloud.speech.v2.UpdatePhraseSetRequest) obj;

    if (hasPhraseSet() != other.hasPhraseSet()) return false;
    if (hasPhraseSet()) {
      if (!getPhraseSet().equals(other.getPhraseSet())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    if (hasPhraseSet()) {
      hash = (37 * hash) + PHRASE_SET_FIELD_NUMBER;
      hash = (53 * hash) + getPhraseSet().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.speech.v2.UpdatePhraseSetRequest prototype) {
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
   * Request message for the
   * [UpdatePhraseSet][google.cloud.speech.v2.Speech.UpdatePhraseSet] method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.UpdatePhraseSetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.UpdatePhraseSetRequest)
      com.google.cloud.speech.v2.UpdatePhraseSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_UpdatePhraseSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_UpdatePhraseSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.UpdatePhraseSetRequest.class,
              com.google.cloud.speech.v2.UpdatePhraseSetRequest.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.UpdatePhraseSetRequest.newBuilder()
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
      if (phraseSetBuilder_ == null) {
        phraseSet_ = null;
      } else {
        phraseSet_ = null;
        phraseSetBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_UpdatePhraseSetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.UpdatePhraseSetRequest getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.UpdatePhraseSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.UpdatePhraseSetRequest build() {
      com.google.cloud.speech.v2.UpdatePhraseSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.UpdatePhraseSetRequest buildPartial() {
      com.google.cloud.speech.v2.UpdatePhraseSetRequest result =
          new com.google.cloud.speech.v2.UpdatePhraseSetRequest(this);
      if (phraseSetBuilder_ == null) {
        result.phraseSet_ = phraseSet_;
      } else {
        result.phraseSet_ = phraseSetBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.speech.v2.UpdatePhraseSetRequest) {
        return mergeFrom((com.google.cloud.speech.v2.UpdatePhraseSetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.UpdatePhraseSetRequest other) {
      if (other == com.google.cloud.speech.v2.UpdatePhraseSetRequest.getDefaultInstance())
        return this;
      if (other.hasPhraseSet()) {
        mergePhraseSet(other.getPhraseSet());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
      com.google.cloud.speech.v2.UpdatePhraseSetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.speech.v2.UpdatePhraseSetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.speech.v2.PhraseSet phraseSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v2.PhraseSet,
            com.google.cloud.speech.v2.PhraseSet.Builder,
            com.google.cloud.speech.v2.PhraseSetOrBuilder>
        phraseSetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The PhraseSet to update.
     * The PhraseSet's `name` field is used to identify the PhraseSet to update.
     * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the phraseSet field is set.
     */
    public boolean hasPhraseSet() {
      return phraseSetBuilder_ != null || phraseSet_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The PhraseSet to update.
     * The PhraseSet's `name` field is used to identify the PhraseSet to update.
     * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The phraseSet.
     */
    public com.google.cloud.speech.v2.PhraseSet getPhraseSet() {
      if (phraseSetBuilder_ == null) {
        return phraseSet_ == null
            ? com.google.cloud.speech.v2.PhraseSet.getDefaultInstance()
            : phraseSet_;
      } else {
        return phraseSetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The PhraseSet to update.
     * The PhraseSet's `name` field is used to identify the PhraseSet to update.
     * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPhraseSet(com.google.cloud.speech.v2.PhraseSet value) {
      if (phraseSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        phraseSet_ = value;
        onChanged();
      } else {
        phraseSetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The PhraseSet to update.
     * The PhraseSet's `name` field is used to identify the PhraseSet to update.
     * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPhraseSet(com.google.cloud.speech.v2.PhraseSet.Builder builderForValue) {
      if (phraseSetBuilder_ == null) {
        phraseSet_ = builderForValue.build();
        onChanged();
      } else {
        phraseSetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The PhraseSet to update.
     * The PhraseSet's `name` field is used to identify the PhraseSet to update.
     * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePhraseSet(com.google.cloud.speech.v2.PhraseSet value) {
      if (phraseSetBuilder_ == null) {
        if (phraseSet_ != null) {
          phraseSet_ =
              com.google.cloud.speech.v2.PhraseSet.newBuilder(phraseSet_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          phraseSet_ = value;
        }
        onChanged();
      } else {
        phraseSetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The PhraseSet to update.
     * The PhraseSet's `name` field is used to identify the PhraseSet to update.
     * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPhraseSet() {
      if (phraseSetBuilder_ == null) {
        phraseSet_ = null;
        onChanged();
      } else {
        phraseSet_ = null;
        phraseSetBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The PhraseSet to update.
     * The PhraseSet's `name` field is used to identify the PhraseSet to update.
     * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v2.PhraseSet.Builder getPhraseSetBuilder() {

      onChanged();
      return getPhraseSetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The PhraseSet to update.
     * The PhraseSet's `name` field is used to identify the PhraseSet to update.
     * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v2.PhraseSetOrBuilder getPhraseSetOrBuilder() {
      if (phraseSetBuilder_ != null) {
        return phraseSetBuilder_.getMessageOrBuilder();
      } else {
        return phraseSet_ == null
            ? com.google.cloud.speech.v2.PhraseSet.getDefaultInstance()
            : phraseSet_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The PhraseSet to update.
     * The PhraseSet's `name` field is used to identify the PhraseSet to update.
     * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v2.PhraseSet,
            com.google.cloud.speech.v2.PhraseSet.Builder,
            com.google.cloud.speech.v2.PhraseSetOrBuilder>
        getPhraseSetFieldBuilder() {
      if (phraseSetBuilder_ == null) {
        phraseSetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.speech.v2.PhraseSet,
                com.google.cloud.speech.v2.PhraseSet.Builder,
                com.google.cloud.speech.v2.PhraseSetOrBuilder>(
                getPhraseSet(), getParentForChildren(), isClean());
        phraseSet_ = null;
      }
      return phraseSetBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire PhraseSet resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire PhraseSet resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire PhraseSet resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire PhraseSet resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire PhraseSet resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire PhraseSet resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire PhraseSet resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire PhraseSet resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update. If empty, all non-default valued fields are
     * considered for update. Use `*` to update the entire PhraseSet resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the updated PhraseSet, but do not
     * actually update it.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the updated PhraseSet, but do not
     * actually update it.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the updated PhraseSet, but do not
     * actually update it.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {

      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.UpdatePhraseSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.UpdatePhraseSetRequest)
  private static final com.google.cloud.speech.v2.UpdatePhraseSetRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.UpdatePhraseSetRequest();
  }

  public static com.google.cloud.speech.v2.UpdatePhraseSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePhraseSetRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdatePhraseSetRequest>() {
        @java.lang.Override
        public UpdatePhraseSetRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdatePhraseSetRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdatePhraseSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePhraseSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.UpdatePhraseSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
