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
// source: google/devtools/clouddebugger/v2/data.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.clouddebugger.v2;

/**
 *
 *
 * <pre>
 * Represents a contextual status message.
 * The message can indicate an error or informational status, and refer to
 * specific parts of the containing object.
 * For example, the `Breakpoint.status` field can indicate an error referring
 * to the `BREAKPOINT_SOURCE_LOCATION` with the message `Location not found`.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.StatusMessage}
 */
public final class StatusMessage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.StatusMessage)
    StatusMessageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StatusMessage.newBuilder() to construct.
  private StatusMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StatusMessage() {
    refersTo_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StatusMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.clouddebugger.v2.DataProto
        .internal_static_google_devtools_clouddebugger_v2_StatusMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DataProto
        .internal_static_google_devtools_clouddebugger_v2_StatusMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.StatusMessage.class,
            com.google.devtools.clouddebugger.v2.StatusMessage.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enumerates references to which the message applies.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.clouddebugger.v2.StatusMessage.Reference}
   */
  public enum Reference implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Status doesn't refer to any particular input.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Status applies to the breakpoint and is related to its location.
     * </pre>
     *
     * <code>BREAKPOINT_SOURCE_LOCATION = 3;</code>
     */
    BREAKPOINT_SOURCE_LOCATION(3),
    /**
     *
     *
     * <pre>
     * Status applies to the breakpoint and is related to its condition.
     * </pre>
     *
     * <code>BREAKPOINT_CONDITION = 4;</code>
     */
    BREAKPOINT_CONDITION(4),
    /**
     *
     *
     * <pre>
     * Status applies to the breakpoint and is related to its expressions.
     * </pre>
     *
     * <code>BREAKPOINT_EXPRESSION = 7;</code>
     */
    BREAKPOINT_EXPRESSION(7),
    /**
     *
     *
     * <pre>
     * Status applies to the breakpoint and is related to its age.
     * </pre>
     *
     * <code>BREAKPOINT_AGE = 8;</code>
     */
    BREAKPOINT_AGE(8),
    /**
     *
     *
     * <pre>
     * Status applies to the entire variable.
     * </pre>
     *
     * <code>VARIABLE_NAME = 5;</code>
     */
    VARIABLE_NAME(5),
    /**
     *
     *
     * <pre>
     * Status applies to variable value (variable name is valid).
     * </pre>
     *
     * <code>VARIABLE_VALUE = 6;</code>
     */
    VARIABLE_VALUE(6),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Status doesn't refer to any particular input.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Status applies to the breakpoint and is related to its location.
     * </pre>
     *
     * <code>BREAKPOINT_SOURCE_LOCATION = 3;</code>
     */
    public static final int BREAKPOINT_SOURCE_LOCATION_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Status applies to the breakpoint and is related to its condition.
     * </pre>
     *
     * <code>BREAKPOINT_CONDITION = 4;</code>
     */
    public static final int BREAKPOINT_CONDITION_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Status applies to the breakpoint and is related to its expressions.
     * </pre>
     *
     * <code>BREAKPOINT_EXPRESSION = 7;</code>
     */
    public static final int BREAKPOINT_EXPRESSION_VALUE = 7;
    /**
     *
     *
     * <pre>
     * Status applies to the breakpoint and is related to its age.
     * </pre>
     *
     * <code>BREAKPOINT_AGE = 8;</code>
     */
    public static final int BREAKPOINT_AGE_VALUE = 8;
    /**
     *
     *
     * <pre>
     * Status applies to the entire variable.
     * </pre>
     *
     * <code>VARIABLE_NAME = 5;</code>
     */
    public static final int VARIABLE_NAME_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Status applies to variable value (variable name is valid).
     * </pre>
     *
     * <code>VARIABLE_VALUE = 6;</code>
     */
    public static final int VARIABLE_VALUE_VALUE = 6;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Reference valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Reference forNumber(int value) {
      switch (value) {
        case 0:
          return UNSPECIFIED;
        case 3:
          return BREAKPOINT_SOURCE_LOCATION;
        case 4:
          return BREAKPOINT_CONDITION;
        case 7:
          return BREAKPOINT_EXPRESSION;
        case 8:
          return BREAKPOINT_AGE;
        case 5:
          return VARIABLE_NAME;
        case 6:
          return VARIABLE_VALUE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Reference> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Reference> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Reference>() {
          public Reference findValueByNumber(int number) {
            return Reference.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.devtools.clouddebugger.v2.StatusMessage.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Reference[] VALUES = values();

    public static Reference valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Reference(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.clouddebugger.v2.StatusMessage.Reference)
  }

  private int bitField0_;
  public static final int IS_ERROR_FIELD_NUMBER = 1;
  private boolean isError_ = false;
  /**
   *
   *
   * <pre>
   * Distinguishes errors from informational messages.
   * </pre>
   *
   * <code>bool is_error = 1;</code>
   *
   * @return The isError.
   */
  @java.lang.Override
  public boolean getIsError() {
    return isError_;
  }

  public static final int REFERS_TO_FIELD_NUMBER = 2;
  private int refersTo_ = 0;
  /**
   *
   *
   * <pre>
   * Reference to which the message applies.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage.Reference refers_to = 2;</code>
   *
   * @return The enum numeric value on the wire for refersTo.
   */
  @java.lang.Override
  public int getRefersToValue() {
    return refersTo_;
  }
  /**
   *
   *
   * <pre>
   * Reference to which the message applies.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage.Reference refers_to = 2;</code>
   *
   * @return The refersTo.
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.StatusMessage.Reference getRefersTo() {
    com.google.devtools.clouddebugger.v2.StatusMessage.Reference result =
        com.google.devtools.clouddebugger.v2.StatusMessage.Reference.forNumber(refersTo_);
    return result == null
        ? com.google.devtools.clouddebugger.v2.StatusMessage.Reference.UNRECOGNIZED
        : result;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private com.google.devtools.clouddebugger.v2.FormatMessage description_;
  /**
   *
   *
   * <pre>
   * Status message text.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
   *
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Status message text.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.FormatMessage getDescription() {
    return description_ == null
        ? com.google.devtools.clouddebugger.v2.FormatMessage.getDefaultInstance()
        : description_;
  }
  /**
   *
   *
   * <pre>
   * Status message text.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.FormatMessageOrBuilder getDescriptionOrBuilder() {
    return description_ == null
        ? com.google.devtools.clouddebugger.v2.FormatMessage.getDefaultInstance()
        : description_;
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
    if (isError_ != false) {
      output.writeBool(1, isError_);
    }
    if (refersTo_
        != com.google.devtools.clouddebugger.v2.StatusMessage.Reference.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, refersTo_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getDescription());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isError_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isError_);
    }
    if (refersTo_
        != com.google.devtools.clouddebugger.v2.StatusMessage.Reference.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, refersTo_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getDescription());
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.StatusMessage)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.StatusMessage other =
        (com.google.devtools.clouddebugger.v2.StatusMessage) obj;

    if (getIsError() != other.getIsError()) return false;
    if (refersTo_ != other.refersTo_) return false;
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription().equals(other.getDescription())) return false;
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
    hash = (37 * hash) + IS_ERROR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsError());
    hash = (37 * hash) + REFERS_TO_FIELD_NUMBER;
    hash = (53 * hash) + refersTo_;
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage parseFrom(
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

  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.StatusMessage prototype) {
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
   * Represents a contextual status message.
   * The message can indicate an error or informational status, and refer to
   * specific parts of the containing object.
   * For example, the `Breakpoint.status` field can indicate an error referring
   * to the `BREAKPOINT_SOURCE_LOCATION` with the message `Location not found`.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.StatusMessage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.StatusMessage)
      com.google.devtools.clouddebugger.v2.StatusMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DataProto
          .internal_static_google_devtools_clouddebugger_v2_StatusMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DataProto
          .internal_static_google_devtools_clouddebugger_v2_StatusMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.StatusMessage.class,
              com.google.devtools.clouddebugger.v2.StatusMessage.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.StatusMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDescriptionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      isError_ = false;
      refersTo_ = 0;
      description_ = null;
      if (descriptionBuilder_ != null) {
        descriptionBuilder_.dispose();
        descriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DataProto
          .internal_static_google_devtools_clouddebugger_v2_StatusMessage_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.StatusMessage getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.StatusMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.StatusMessage build() {
      com.google.devtools.clouddebugger.v2.StatusMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.StatusMessage buildPartial() {
      com.google.devtools.clouddebugger.v2.StatusMessage result =
          new com.google.devtools.clouddebugger.v2.StatusMessage(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.clouddebugger.v2.StatusMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isError_ = isError_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.refersTo_ = refersTo_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description_ =
            descriptionBuilder_ == null ? description_ : descriptionBuilder_.build();
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
      if (other instanceof com.google.devtools.clouddebugger.v2.StatusMessage) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.StatusMessage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.StatusMessage other) {
      if (other == com.google.devtools.clouddebugger.v2.StatusMessage.getDefaultInstance())
        return this;
      if (other.getIsError() != false) {
        setIsError(other.getIsError());
      }
      if (other.refersTo_ != 0) {
        setRefersToValue(other.getRefersToValue());
      }
      if (other.hasDescription()) {
        mergeDescription(other.getDescription());
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
            case 8:
              {
                isError_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                refersTo_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(getDescriptionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private boolean isError_;
    /**
     *
     *
     * <pre>
     * Distinguishes errors from informational messages.
     * </pre>
     *
     * <code>bool is_error = 1;</code>
     *
     * @return The isError.
     */
    @java.lang.Override
    public boolean getIsError() {
      return isError_;
    }
    /**
     *
     *
     * <pre>
     * Distinguishes errors from informational messages.
     * </pre>
     *
     * <code>bool is_error = 1;</code>
     *
     * @param value The isError to set.
     * @return This builder for chaining.
     */
    public Builder setIsError(boolean value) {

      isError_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Distinguishes errors from informational messages.
     * </pre>
     *
     * <code>bool is_error = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIsError() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isError_ = false;
      onChanged();
      return this;
    }

    private int refersTo_ = 0;
    /**
     *
     *
     * <pre>
     * Reference to which the message applies.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.StatusMessage.Reference refers_to = 2;</code>
     *
     * @return The enum numeric value on the wire for refersTo.
     */
    @java.lang.Override
    public int getRefersToValue() {
      return refersTo_;
    }
    /**
     *
     *
     * <pre>
     * Reference to which the message applies.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.StatusMessage.Reference refers_to = 2;</code>
     *
     * @param value The enum numeric value on the wire for refersTo to set.
     * @return This builder for chaining.
     */
    public Builder setRefersToValue(int value) {
      refersTo_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reference to which the message applies.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.StatusMessage.Reference refers_to = 2;</code>
     *
     * @return The refersTo.
     */
    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.StatusMessage.Reference getRefersTo() {
      com.google.devtools.clouddebugger.v2.StatusMessage.Reference result =
          com.google.devtools.clouddebugger.v2.StatusMessage.Reference.forNumber(refersTo_);
      return result == null
          ? com.google.devtools.clouddebugger.v2.StatusMessage.Reference.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Reference to which the message applies.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.StatusMessage.Reference refers_to = 2;</code>
     *
     * @param value The refersTo to set.
     * @return This builder for chaining.
     */
    public Builder setRefersTo(com.google.devtools.clouddebugger.v2.StatusMessage.Reference value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      refersTo_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reference to which the message applies.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.StatusMessage.Reference refers_to = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRefersTo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      refersTo_ = 0;
      onChanged();
      return this;
    }

    private com.google.devtools.clouddebugger.v2.FormatMessage description_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.FormatMessage,
            com.google.devtools.clouddebugger.v2.FormatMessage.Builder,
            com.google.devtools.clouddebugger.v2.FormatMessageOrBuilder>
        descriptionBuilder_;
    /**
     *
     *
     * <pre>
     * Status message text.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
     *
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Status message text.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
     *
     * @return The description.
     */
    public com.google.devtools.clouddebugger.v2.FormatMessage getDescription() {
      if (descriptionBuilder_ == null) {
        return description_ == null
            ? com.google.devtools.clouddebugger.v2.FormatMessage.getDefaultInstance()
            : description_;
      } else {
        return descriptionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Status message text.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
     */
    public Builder setDescription(com.google.devtools.clouddebugger.v2.FormatMessage value) {
      if (descriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description_ = value;
      } else {
        descriptionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status message text.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
     */
    public Builder setDescription(
        com.google.devtools.clouddebugger.v2.FormatMessage.Builder builderForValue) {
      if (descriptionBuilder_ == null) {
        description_ = builderForValue.build();
      } else {
        descriptionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status message text.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
     */
    public Builder mergeDescription(com.google.devtools.clouddebugger.v2.FormatMessage value) {
      if (descriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && description_ != null
            && description_
                != com.google.devtools.clouddebugger.v2.FormatMessage.getDefaultInstance()) {
          getDescriptionBuilder().mergeFrom(value);
        } else {
          description_ = value;
        }
      } else {
        descriptionBuilder_.mergeFrom(value);
      }
      if (description_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status message text.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
     */
    public Builder clearDescription() {
      bitField0_ = (bitField0_ & ~0x00000004);
      description_ = null;
      if (descriptionBuilder_ != null) {
        descriptionBuilder_.dispose();
        descriptionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status message text.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
     */
    public com.google.devtools.clouddebugger.v2.FormatMessage.Builder getDescriptionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDescriptionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Status message text.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
     */
    public com.google.devtools.clouddebugger.v2.FormatMessageOrBuilder getDescriptionOrBuilder() {
      if (descriptionBuilder_ != null) {
        return descriptionBuilder_.getMessageOrBuilder();
      } else {
        return description_ == null
            ? com.google.devtools.clouddebugger.v2.FormatMessage.getDefaultInstance()
            : description_;
      }
    }
    /**
     *
     *
     * <pre>
     * Status message text.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.FormatMessage,
            com.google.devtools.clouddebugger.v2.FormatMessage.Builder,
            com.google.devtools.clouddebugger.v2.FormatMessageOrBuilder>
        getDescriptionFieldBuilder() {
      if (descriptionBuilder_ == null) {
        descriptionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.clouddebugger.v2.FormatMessage,
                com.google.devtools.clouddebugger.v2.FormatMessage.Builder,
                com.google.devtools.clouddebugger.v2.FormatMessageOrBuilder>(
                getDescription(), getParentForChildren(), isClean());
        description_ = null;
      }
      return descriptionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.StatusMessage)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.StatusMessage)
  private static final com.google.devtools.clouddebugger.v2.StatusMessage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.StatusMessage();
  }

  public static com.google.devtools.clouddebugger.v2.StatusMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatusMessage> PARSER =
      new com.google.protobuf.AbstractParser<StatusMessage>() {
        @java.lang.Override
        public StatusMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<StatusMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatusMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.StatusMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
