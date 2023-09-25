/*
 * Copyright 2023 Google LLC
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
// source: google/apps/script/type/gmail/gmail_addon_manifest.proto

package com.google.apps.script.type.gmail;

/**
 *
 *
 * <pre>
 * Defines a trigger that fires when the open email meets a specific criteria.
 * When the trigger fires, it executes a specific endpoint, usually
 * in order to create new cards and update the UI.
 * </pre>
 *
 * Protobuf type {@code google.apps.script.type.gmail.ContextualTrigger}
 */
public final class ContextualTrigger extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.script.type.gmail.ContextualTrigger)
    ContextualTriggerOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ContextualTrigger.newBuilder() to construct.
  private ContextualTrigger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ContextualTrigger() {
    onTriggerFunction_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ContextualTrigger();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.script.type.gmail.GmailAddOnManifestProto
        .internal_static_google_apps_script_type_gmail_ContextualTrigger_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.script.type.gmail.GmailAddOnManifestProto
        .internal_static_google_apps_script_type_gmail_ContextualTrigger_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.script.type.gmail.ContextualTrigger.class,
            com.google.apps.script.type.gmail.ContextualTrigger.Builder.class);
  }

  private int triggerCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object trigger_;

  public enum TriggerCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    UNCONDITIONAL(1),
    TRIGGER_NOT_SET(0);
    private final int value;

    private TriggerCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TriggerCase valueOf(int value) {
      return forNumber(value);
    }

    public static TriggerCase forNumber(int value) {
      switch (value) {
        case 1:
          return UNCONDITIONAL;
        case 0:
          return TRIGGER_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TriggerCase getTriggerCase() {
    return TriggerCase.forNumber(triggerCase_);
  }

  public static final int UNCONDITIONAL_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * UnconditionalTriggers are executed when any mail message is opened.
   * </pre>
   *
   * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
   *
   * @return Whether the unconditional field is set.
   */
  @java.lang.Override
  public boolean hasUnconditional() {
    return triggerCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * UnconditionalTriggers are executed when any mail message is opened.
   * </pre>
   *
   * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
   *
   * @return The unconditional.
   */
  @java.lang.Override
  public com.google.apps.script.type.gmail.UnconditionalTrigger getUnconditional() {
    if (triggerCase_ == 1) {
      return (com.google.apps.script.type.gmail.UnconditionalTrigger) trigger_;
    }
    return com.google.apps.script.type.gmail.UnconditionalTrigger.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * UnconditionalTriggers are executed when any mail message is opened.
   * </pre>
   *
   * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
   */
  @java.lang.Override
  public com.google.apps.script.type.gmail.UnconditionalTriggerOrBuilder
      getUnconditionalOrBuilder() {
    if (triggerCase_ == 1) {
      return (com.google.apps.script.type.gmail.UnconditionalTrigger) trigger_;
    }
    return com.google.apps.script.type.gmail.UnconditionalTrigger.getDefaultInstance();
  }

  public static final int ON_TRIGGER_FUNCTION_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object onTriggerFunction_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the endpoint to call when a message matches the
   * trigger.
   * </pre>
   *
   * <code>string on_trigger_function = 4;</code>
   *
   * @return The onTriggerFunction.
   */
  @java.lang.Override
  public java.lang.String getOnTriggerFunction() {
    java.lang.Object ref = onTriggerFunction_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      onTriggerFunction_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the endpoint to call when a message matches the
   * trigger.
   * </pre>
   *
   * <code>string on_trigger_function = 4;</code>
   *
   * @return The bytes for onTriggerFunction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOnTriggerFunctionBytes() {
    java.lang.Object ref = onTriggerFunction_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      onTriggerFunction_ = b;
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
    if (triggerCase_ == 1) {
      output.writeMessage(1, (com.google.apps.script.type.gmail.UnconditionalTrigger) trigger_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onTriggerFunction_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, onTriggerFunction_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (triggerCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.apps.script.type.gmail.UnconditionalTrigger) trigger_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onTriggerFunction_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, onTriggerFunction_);
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
    if (!(obj instanceof com.google.apps.script.type.gmail.ContextualTrigger)) {
      return super.equals(obj);
    }
    com.google.apps.script.type.gmail.ContextualTrigger other =
        (com.google.apps.script.type.gmail.ContextualTrigger) obj;

    if (!getOnTriggerFunction().equals(other.getOnTriggerFunction())) return false;
    if (!getTriggerCase().equals(other.getTriggerCase())) return false;
    switch (triggerCase_) {
      case 1:
        if (!getUnconditional().equals(other.getUnconditional())) return false;
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
    hash = (37 * hash) + ON_TRIGGER_FUNCTION_FIELD_NUMBER;
    hash = (53 * hash) + getOnTriggerFunction().hashCode();
    switch (triggerCase_) {
      case 1:
        hash = (37 * hash) + UNCONDITIONAL_FIELD_NUMBER;
        hash = (53 * hash) + getUnconditional().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger parseFrom(
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

  public static Builder newBuilder(com.google.apps.script.type.gmail.ContextualTrigger prototype) {
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
   * Defines a trigger that fires when the open email meets a specific criteria.
   * When the trigger fires, it executes a specific endpoint, usually
   * in order to create new cards and update the UI.
   * </pre>
   *
   * Protobuf type {@code google.apps.script.type.gmail.ContextualTrigger}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.script.type.gmail.ContextualTrigger)
      com.google.apps.script.type.gmail.ContextualTriggerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.script.type.gmail.GmailAddOnManifestProto
          .internal_static_google_apps_script_type_gmail_ContextualTrigger_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.script.type.gmail.GmailAddOnManifestProto
          .internal_static_google_apps_script_type_gmail_ContextualTrigger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.script.type.gmail.ContextualTrigger.class,
              com.google.apps.script.type.gmail.ContextualTrigger.Builder.class);
    }

    // Construct using com.google.apps.script.type.gmail.ContextualTrigger.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (unconditionalBuilder_ != null) {
        unconditionalBuilder_.clear();
      }
      onTriggerFunction_ = "";
      triggerCase_ = 0;
      trigger_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.script.type.gmail.GmailAddOnManifestProto
          .internal_static_google_apps_script_type_gmail_ContextualTrigger_descriptor;
    }

    @java.lang.Override
    public com.google.apps.script.type.gmail.ContextualTrigger getDefaultInstanceForType() {
      return com.google.apps.script.type.gmail.ContextualTrigger.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.script.type.gmail.ContextualTrigger build() {
      com.google.apps.script.type.gmail.ContextualTrigger result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.script.type.gmail.ContextualTrigger buildPartial() {
      com.google.apps.script.type.gmail.ContextualTrigger result =
          new com.google.apps.script.type.gmail.ContextualTrigger(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.script.type.gmail.ContextualTrigger result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.onTriggerFunction_ = onTriggerFunction_;
      }
    }

    private void buildPartialOneofs(com.google.apps.script.type.gmail.ContextualTrigger result) {
      result.triggerCase_ = triggerCase_;
      result.trigger_ = this.trigger_;
      if (triggerCase_ == 1 && unconditionalBuilder_ != null) {
        result.trigger_ = unconditionalBuilder_.build();
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
      if (other instanceof com.google.apps.script.type.gmail.ContextualTrigger) {
        return mergeFrom((com.google.apps.script.type.gmail.ContextualTrigger) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.script.type.gmail.ContextualTrigger other) {
      if (other == com.google.apps.script.type.gmail.ContextualTrigger.getDefaultInstance())
        return this;
      if (!other.getOnTriggerFunction().isEmpty()) {
        onTriggerFunction_ = other.onTriggerFunction_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getTriggerCase()) {
        case UNCONDITIONAL:
          {
            mergeUnconditional(other.getUnconditional());
            break;
          }
        case TRIGGER_NOT_SET:
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
                input.readMessage(getUnconditionalFieldBuilder().getBuilder(), extensionRegistry);
                triggerCase_ = 1;
                break;
              } // case 10
            case 34:
              {
                onTriggerFunction_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private int triggerCase_ = 0;
    private java.lang.Object trigger_;

    public TriggerCase getTriggerCase() {
      return TriggerCase.forNumber(triggerCase_);
    }

    public Builder clearTrigger() {
      triggerCase_ = 0;
      trigger_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.script.type.gmail.UnconditionalTrigger,
            com.google.apps.script.type.gmail.UnconditionalTrigger.Builder,
            com.google.apps.script.type.gmail.UnconditionalTriggerOrBuilder>
        unconditionalBuilder_;
    /**
     *
     *
     * <pre>
     * UnconditionalTriggers are executed when any mail message is opened.
     * </pre>
     *
     * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
     *
     * @return Whether the unconditional field is set.
     */
    @java.lang.Override
    public boolean hasUnconditional() {
      return triggerCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * UnconditionalTriggers are executed when any mail message is opened.
     * </pre>
     *
     * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
     *
     * @return The unconditional.
     */
    @java.lang.Override
    public com.google.apps.script.type.gmail.UnconditionalTrigger getUnconditional() {
      if (unconditionalBuilder_ == null) {
        if (triggerCase_ == 1) {
          return (com.google.apps.script.type.gmail.UnconditionalTrigger) trigger_;
        }
        return com.google.apps.script.type.gmail.UnconditionalTrigger.getDefaultInstance();
      } else {
        if (triggerCase_ == 1) {
          return unconditionalBuilder_.getMessage();
        }
        return com.google.apps.script.type.gmail.UnconditionalTrigger.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * UnconditionalTriggers are executed when any mail message is opened.
     * </pre>
     *
     * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
     */
    public Builder setUnconditional(com.google.apps.script.type.gmail.UnconditionalTrigger value) {
      if (unconditionalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        trigger_ = value;
        onChanged();
      } else {
        unconditionalBuilder_.setMessage(value);
      }
      triggerCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * UnconditionalTriggers are executed when any mail message is opened.
     * </pre>
     *
     * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
     */
    public Builder setUnconditional(
        com.google.apps.script.type.gmail.UnconditionalTrigger.Builder builderForValue) {
      if (unconditionalBuilder_ == null) {
        trigger_ = builderForValue.build();
        onChanged();
      } else {
        unconditionalBuilder_.setMessage(builderForValue.build());
      }
      triggerCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * UnconditionalTriggers are executed when any mail message is opened.
     * </pre>
     *
     * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
     */
    public Builder mergeUnconditional(
        com.google.apps.script.type.gmail.UnconditionalTrigger value) {
      if (unconditionalBuilder_ == null) {
        if (triggerCase_ == 1
            && trigger_
                != com.google.apps.script.type.gmail.UnconditionalTrigger.getDefaultInstance()) {
          trigger_ =
              com.google.apps.script.type.gmail.UnconditionalTrigger.newBuilder(
                      (com.google.apps.script.type.gmail.UnconditionalTrigger) trigger_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          trigger_ = value;
        }
        onChanged();
      } else {
        if (triggerCase_ == 1) {
          unconditionalBuilder_.mergeFrom(value);
        } else {
          unconditionalBuilder_.setMessage(value);
        }
      }
      triggerCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * UnconditionalTriggers are executed when any mail message is opened.
     * </pre>
     *
     * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
     */
    public Builder clearUnconditional() {
      if (unconditionalBuilder_ == null) {
        if (triggerCase_ == 1) {
          triggerCase_ = 0;
          trigger_ = null;
          onChanged();
        }
      } else {
        if (triggerCase_ == 1) {
          triggerCase_ = 0;
          trigger_ = null;
        }
        unconditionalBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * UnconditionalTriggers are executed when any mail message is opened.
     * </pre>
     *
     * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
     */
    public com.google.apps.script.type.gmail.UnconditionalTrigger.Builder
        getUnconditionalBuilder() {
      return getUnconditionalFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * UnconditionalTriggers are executed when any mail message is opened.
     * </pre>
     *
     * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
     */
    @java.lang.Override
    public com.google.apps.script.type.gmail.UnconditionalTriggerOrBuilder
        getUnconditionalOrBuilder() {
      if ((triggerCase_ == 1) && (unconditionalBuilder_ != null)) {
        return unconditionalBuilder_.getMessageOrBuilder();
      } else {
        if (triggerCase_ == 1) {
          return (com.google.apps.script.type.gmail.UnconditionalTrigger) trigger_;
        }
        return com.google.apps.script.type.gmail.UnconditionalTrigger.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * UnconditionalTriggers are executed when any mail message is opened.
     * </pre>
     *
     * <code>.google.apps.script.type.gmail.UnconditionalTrigger unconditional = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.script.type.gmail.UnconditionalTrigger,
            com.google.apps.script.type.gmail.UnconditionalTrigger.Builder,
            com.google.apps.script.type.gmail.UnconditionalTriggerOrBuilder>
        getUnconditionalFieldBuilder() {
      if (unconditionalBuilder_ == null) {
        if (!(triggerCase_ == 1)) {
          trigger_ = com.google.apps.script.type.gmail.UnconditionalTrigger.getDefaultInstance();
        }
        unconditionalBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.apps.script.type.gmail.UnconditionalTrigger,
                com.google.apps.script.type.gmail.UnconditionalTrigger.Builder,
                com.google.apps.script.type.gmail.UnconditionalTriggerOrBuilder>(
                (com.google.apps.script.type.gmail.UnconditionalTrigger) trigger_,
                getParentForChildren(),
                isClean());
        trigger_ = null;
      }
      triggerCase_ = 1;
      onChanged();
      return unconditionalBuilder_;
    }

    private java.lang.Object onTriggerFunction_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the endpoint to call when a message matches the
     * trigger.
     * </pre>
     *
     * <code>string on_trigger_function = 4;</code>
     *
     * @return The onTriggerFunction.
     */
    public java.lang.String getOnTriggerFunction() {
      java.lang.Object ref = onTriggerFunction_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        onTriggerFunction_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the endpoint to call when a message matches the
     * trigger.
     * </pre>
     *
     * <code>string on_trigger_function = 4;</code>
     *
     * @return The bytes for onTriggerFunction.
     */
    public com.google.protobuf.ByteString getOnTriggerFunctionBytes() {
      java.lang.Object ref = onTriggerFunction_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        onTriggerFunction_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the endpoint to call when a message matches the
     * trigger.
     * </pre>
     *
     * <code>string on_trigger_function = 4;</code>
     *
     * @param value The onTriggerFunction to set.
     * @return This builder for chaining.
     */
    public Builder setOnTriggerFunction(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      onTriggerFunction_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the endpoint to call when a message matches the
     * trigger.
     * </pre>
     *
     * <code>string on_trigger_function = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOnTriggerFunction() {
      onTriggerFunction_ = getDefaultInstance().getOnTriggerFunction();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the endpoint to call when a message matches the
     * trigger.
     * </pre>
     *
     * <code>string on_trigger_function = 4;</code>
     *
     * @param value The bytes for onTriggerFunction to set.
     * @return This builder for chaining.
     */
    public Builder setOnTriggerFunctionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      onTriggerFunction_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.apps.script.type.gmail.ContextualTrigger)
  }

  // @@protoc_insertion_point(class_scope:google.apps.script.type.gmail.ContextualTrigger)
  private static final com.google.apps.script.type.gmail.ContextualTrigger DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.script.type.gmail.ContextualTrigger();
  }

  public static com.google.apps.script.type.gmail.ContextualTrigger getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContextualTrigger> PARSER =
      new com.google.protobuf.AbstractParser<ContextualTrigger>() {
        @java.lang.Override
        public ContextualTrigger parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContextualTrigger> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContextualTrigger> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.script.type.gmail.ContextualTrigger getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
