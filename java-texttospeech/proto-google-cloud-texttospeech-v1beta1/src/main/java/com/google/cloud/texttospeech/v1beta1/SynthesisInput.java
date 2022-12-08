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
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

package com.google.cloud.texttospeech.v1beta1;

/**
 *
 *
 * <pre>
 * Contains text input to be synthesized. Either `text` or `ssml` must be
 * supplied. Supplying both or neither returns
 * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. The input size is limited to 5000
 * bytes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1beta1.SynthesisInput}
 */
public final class SynthesisInput extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1beta1.SynthesisInput)
    SynthesisInputOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SynthesisInput.newBuilder() to construct.
  private SynthesisInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SynthesisInput() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SynthesisInput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1beta1.SynthesisInput.class,
            com.google.cloud.texttospeech.v1beta1.SynthesisInput.Builder.class);
  }

  private int inputSourceCase_ = 0;
  private java.lang.Object inputSource_;

  public enum InputSourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TEXT(1),
    SSML(2),
    INPUTSOURCE_NOT_SET(0);
    private final int value;

    private InputSourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InputSourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static InputSourceCase forNumber(int value) {
      switch (value) {
        case 1:
          return TEXT;
        case 2:
          return SSML;
        case 0:
          return INPUTSOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public InputSourceCase getInputSourceCase() {
    return InputSourceCase.forNumber(inputSourceCase_);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The raw text to be synthesized.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  public boolean hasText() {
    return inputSourceCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The raw text to be synthesized.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The text.
   */
  public java.lang.String getText() {
    java.lang.Object ref = "";
    if (inputSourceCase_ == 1) {
      ref = inputSource_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (inputSourceCase_ == 1) {
        inputSource_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The raw text to be synthesized.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The bytes for text.
   */
  public com.google.protobuf.ByteString getTextBytes() {
    java.lang.Object ref = "";
    if (inputSourceCase_ == 1) {
      ref = inputSource_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (inputSourceCase_ == 1) {
        inputSource_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSML_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * The SSML document to be synthesized. The SSML document must be valid
   * and well-formed. Otherwise the RPC will fail and return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
   * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
   * </pre>
   *
   * <code>string ssml = 2;</code>
   *
   * @return Whether the ssml field is set.
   */
  public boolean hasSsml() {
    return inputSourceCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * The SSML document to be synthesized. The SSML document must be valid
   * and well-formed. Otherwise the RPC will fail and return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
   * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
   * </pre>
   *
   * <code>string ssml = 2;</code>
   *
   * @return The ssml.
   */
  public java.lang.String getSsml() {
    java.lang.Object ref = "";
    if (inputSourceCase_ == 2) {
      ref = inputSource_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (inputSourceCase_ == 2) {
        inputSource_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The SSML document to be synthesized. The SSML document must be valid
   * and well-formed. Otherwise the RPC will fail and return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
   * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
   * </pre>
   *
   * <code>string ssml = 2;</code>
   *
   * @return The bytes for ssml.
   */
  public com.google.protobuf.ByteString getSsmlBytes() {
    java.lang.Object ref = "";
    if (inputSourceCase_ == 2) {
      ref = inputSource_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (inputSourceCase_ == 2) {
        inputSource_ = b;
      }
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
    if (inputSourceCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inputSource_);
    }
    if (inputSourceCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, inputSource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inputSourceCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inputSource_);
    }
    if (inputSourceCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, inputSource_);
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
    if (!(obj instanceof com.google.cloud.texttospeech.v1beta1.SynthesisInput)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1beta1.SynthesisInput other =
        (com.google.cloud.texttospeech.v1beta1.SynthesisInput) obj;

    if (!getInputSourceCase().equals(other.getInputSourceCase())) return false;
    switch (inputSourceCase_) {
      case 1:
        if (!getText().equals(other.getText())) return false;
        break;
      case 2:
        if (!getSsml().equals(other.getSsml())) return false;
        break;
      case 0:
      default:
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
    switch (inputSourceCase_) {
      case 1:
        hash = (37 * hash) + TEXT_FIELD_NUMBER;
        hash = (53 * hash) + getText().hashCode();
        break;
      case 2:
        hash = (37 * hash) + SSML_FIELD_NUMBER;
        hash = (53 * hash) + getSsml().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput parseFrom(
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

  public static Builder newBuilder(com.google.cloud.texttospeech.v1beta1.SynthesisInput prototype) {
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
   * Contains text input to be synthesized. Either `text` or `ssml` must be
   * supplied. Supplying both or neither returns
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. The input size is limited to 5000
   * bytes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1beta1.SynthesisInput}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1beta1.SynthesisInput)
      com.google.cloud.texttospeech.v1beta1.SynthesisInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1beta1.SynthesisInput.class,
              com.google.cloud.texttospeech.v1beta1.SynthesisInput.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1beta1.SynthesisInput.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      inputSourceCase_ = 0;
      inputSource_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.SynthesisInput getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1beta1.SynthesisInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.SynthesisInput build() {
      com.google.cloud.texttospeech.v1beta1.SynthesisInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.SynthesisInput buildPartial() {
      com.google.cloud.texttospeech.v1beta1.SynthesisInput result =
          new com.google.cloud.texttospeech.v1beta1.SynthesisInput(this);
      if (inputSourceCase_ == 1) {
        result.inputSource_ = inputSource_;
      }
      if (inputSourceCase_ == 2) {
        result.inputSource_ = inputSource_;
      }
      result.inputSourceCase_ = inputSourceCase_;
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
      if (other instanceof com.google.cloud.texttospeech.v1beta1.SynthesisInput) {
        return mergeFrom((com.google.cloud.texttospeech.v1beta1.SynthesisInput) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1beta1.SynthesisInput other) {
      if (other == com.google.cloud.texttospeech.v1beta1.SynthesisInput.getDefaultInstance())
        return this;
      switch (other.getInputSourceCase()) {
        case TEXT:
          {
            inputSourceCase_ = 1;
            inputSource_ = other.inputSource_;
            onChanged();
            break;
          }
        case SSML:
          {
            inputSourceCase_ = 2;
            inputSource_ = other.inputSource_;
            onChanged();
            break;
          }
        case INPUTSOURCE_NOT_SET:
          {
            break;
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
                java.lang.String s = input.readStringRequireUtf8();
                inputSourceCase_ = 1;
                inputSource_ = s;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                inputSourceCase_ = 2;
                inputSource_ = s;
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

    private int inputSourceCase_ = 0;
    private java.lang.Object inputSource_;

    public InputSourceCase getInputSourceCase() {
      return InputSourceCase.forNumber(inputSourceCase_);
    }

    public Builder clearInputSource() {
      inputSourceCase_ = 0;
      inputSource_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The raw text to be synthesized.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return inputSourceCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The raw text to be synthesized.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      java.lang.Object ref = "";
      if (inputSourceCase_ == 1) {
        ref = inputSource_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (inputSourceCase_ == 1) {
          inputSource_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The raw text to be synthesized.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTextBytes() {
      java.lang.Object ref = "";
      if (inputSourceCase_ == 1) {
        ref = inputSource_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (inputSourceCase_ == 1) {
          inputSource_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The raw text to be synthesized.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      inputSourceCase_ = 1;
      inputSource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The raw text to be synthesized.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearText() {
      if (inputSourceCase_ == 1) {
        inputSourceCase_ = 0;
        inputSource_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The raw text to be synthesized.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      inputSourceCase_ = 1;
      inputSource_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSML document to be synthesized. The SSML document must be valid
     * and well-formed. Otherwise the RPC will fail and return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
     * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
     * </pre>
     *
     * <code>string ssml = 2;</code>
     *
     * @return Whether the ssml field is set.
     */
    @java.lang.Override
    public boolean hasSsml() {
      return inputSourceCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * The SSML document to be synthesized. The SSML document must be valid
     * and well-formed. Otherwise the RPC will fail and return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
     * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
     * </pre>
     *
     * <code>string ssml = 2;</code>
     *
     * @return The ssml.
     */
    @java.lang.Override
    public java.lang.String getSsml() {
      java.lang.Object ref = "";
      if (inputSourceCase_ == 2) {
        ref = inputSource_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (inputSourceCase_ == 2) {
          inputSource_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The SSML document to be synthesized. The SSML document must be valid
     * and well-formed. Otherwise the RPC will fail and return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
     * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
     * </pre>
     *
     * <code>string ssml = 2;</code>
     *
     * @return The bytes for ssml.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSsmlBytes() {
      java.lang.Object ref = "";
      if (inputSourceCase_ == 2) {
        ref = inputSource_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (inputSourceCase_ == 2) {
          inputSource_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The SSML document to be synthesized. The SSML document must be valid
     * and well-formed. Otherwise the RPC will fail and return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
     * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
     * </pre>
     *
     * <code>string ssml = 2;</code>
     *
     * @param value The ssml to set.
     * @return This builder for chaining.
     */
    public Builder setSsml(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      inputSourceCase_ = 2;
      inputSource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The SSML document to be synthesized. The SSML document must be valid
     * and well-formed. Otherwise the RPC will fail and return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
     * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
     * </pre>
     *
     * <code>string ssml = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSsml() {
      if (inputSourceCase_ == 2) {
        inputSourceCase_ = 0;
        inputSource_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The SSML document to be synthesized. The SSML document must be valid
     * and well-formed. Otherwise the RPC will fail and return
     * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
     * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
     * </pre>
     *
     * <code>string ssml = 2;</code>
     *
     * @param value The bytes for ssml to set.
     * @return This builder for chaining.
     */
    public Builder setSsmlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      inputSourceCase_ = 2;
      inputSource_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1beta1.SynthesisInput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1beta1.SynthesisInput)
  private static final com.google.cloud.texttospeech.v1beta1.SynthesisInput DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1beta1.SynthesisInput();
  }

  public static com.google.cloud.texttospeech.v1beta1.SynthesisInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SynthesisInput> PARSER =
      new com.google.protobuf.AbstractParser<SynthesisInput>() {
        @java.lang.Override
        public SynthesisInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<SynthesisInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SynthesisInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.texttospeech.v1beta1.SynthesisInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
