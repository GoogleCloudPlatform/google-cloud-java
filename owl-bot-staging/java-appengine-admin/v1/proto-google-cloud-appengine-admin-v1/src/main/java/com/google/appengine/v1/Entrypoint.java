// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

/**
 * <pre>
 * The entrypoint for the application.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.Entrypoint}
 */
public final class Entrypoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.Entrypoint)
    EntrypointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Entrypoint.newBuilder() to construct.
  private Entrypoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Entrypoint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Entrypoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Entrypoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Entrypoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.Entrypoint.class, com.google.appengine.v1.Entrypoint.Builder.class);
  }

  private int commandCase_ = 0;
  private java.lang.Object command_;
  public enum CommandCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SHELL(1),
    COMMAND_NOT_SET(0);
    private final int value;
    private CommandCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CommandCase valueOf(int value) {
      return forNumber(value);
    }

    public static CommandCase forNumber(int value) {
      switch (value) {
        case 1: return SHELL;
        case 0: return COMMAND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public CommandCase
  getCommandCase() {
    return CommandCase.forNumber(
        commandCase_);
  }

  public static final int SHELL_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The format should be a shell command that can be fed to `bash -c`.
   * </pre>
   *
   * <code>string shell = 1;</code>
   * @return Whether the shell field is set.
   */
  public boolean hasShell() {
    return commandCase_ == 1;
  }
  /**
   * <pre>
   * The format should be a shell command that can be fed to `bash -c`.
   * </pre>
   *
   * <code>string shell = 1;</code>
   * @return The shell.
   */
  public java.lang.String getShell() {
    java.lang.Object ref = "";
    if (commandCase_ == 1) {
      ref = command_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (commandCase_ == 1) {
        command_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The format should be a shell command that can be fed to `bash -c`.
   * </pre>
   *
   * <code>string shell = 1;</code>
   * @return The bytes for shell.
   */
  public com.google.protobuf.ByteString
      getShellBytes() {
    java.lang.Object ref = "";
    if (commandCase_ == 1) {
      ref = command_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (commandCase_ == 1) {
        command_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (commandCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, command_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commandCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, command_);
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
    if (!(obj instanceof com.google.appengine.v1.Entrypoint)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.Entrypoint other = (com.google.appengine.v1.Entrypoint) obj;

    if (!getCommandCase().equals(other.getCommandCase())) return false;
    switch (commandCase_) {
      case 1:
        if (!getShell()
            .equals(other.getShell())) return false;
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
    switch (commandCase_) {
      case 1:
        hash = (37 * hash) + SHELL_FIELD_NUMBER;
        hash = (53 * hash) + getShell().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.Entrypoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.Entrypoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.Entrypoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.Entrypoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.Entrypoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.Entrypoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.Entrypoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.Entrypoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.Entrypoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.Entrypoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.Entrypoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.Entrypoint parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.Entrypoint prototype) {
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
   * The entrypoint for the application.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.Entrypoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.Entrypoint)
      com.google.appengine.v1.EntrypointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Entrypoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Entrypoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.Entrypoint.class, com.google.appengine.v1.Entrypoint.Builder.class);
    }

    // Construct using com.google.appengine.v1.Entrypoint.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      commandCase_ = 0;
      command_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Entrypoint_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.Entrypoint getDefaultInstanceForType() {
      return com.google.appengine.v1.Entrypoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.Entrypoint build() {
      com.google.appengine.v1.Entrypoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.Entrypoint buildPartial() {
      com.google.appengine.v1.Entrypoint result = new com.google.appengine.v1.Entrypoint(this);
      if (commandCase_ == 1) {
        result.command_ = command_;
      }
      result.commandCase_ = commandCase_;
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
      if (other instanceof com.google.appengine.v1.Entrypoint) {
        return mergeFrom((com.google.appengine.v1.Entrypoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.Entrypoint other) {
      if (other == com.google.appengine.v1.Entrypoint.getDefaultInstance()) return this;
      switch (other.getCommandCase()) {
        case SHELL: {
          commandCase_ = 1;
          command_ = other.command_;
          onChanged();
          break;
        }
        case COMMAND_NOT_SET: {
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              commandCase_ = 1;
              command_ = s;
              break;
            } // case 10
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
    private int commandCase_ = 0;
    private java.lang.Object command_;
    public CommandCase
        getCommandCase() {
      return CommandCase.forNumber(
          commandCase_);
    }

    public Builder clearCommand() {
      commandCase_ = 0;
      command_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * The format should be a shell command that can be fed to `bash -c`.
     * </pre>
     *
     * <code>string shell = 1;</code>
     * @return Whether the shell field is set.
     */
    @java.lang.Override
    public boolean hasShell() {
      return commandCase_ == 1;
    }
    /**
     * <pre>
     * The format should be a shell command that can be fed to `bash -c`.
     * </pre>
     *
     * <code>string shell = 1;</code>
     * @return The shell.
     */
    @java.lang.Override
    public java.lang.String getShell() {
      java.lang.Object ref = "";
      if (commandCase_ == 1) {
        ref = command_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (commandCase_ == 1) {
          command_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The format should be a shell command that can be fed to `bash -c`.
     * </pre>
     *
     * <code>string shell = 1;</code>
     * @return The bytes for shell.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getShellBytes() {
      java.lang.Object ref = "";
      if (commandCase_ == 1) {
        ref = command_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (commandCase_ == 1) {
          command_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The format should be a shell command that can be fed to `bash -c`.
     * </pre>
     *
     * <code>string shell = 1;</code>
     * @param value The shell to set.
     * @return This builder for chaining.
     */
    public Builder setShell(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  commandCase_ = 1;
      command_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The format should be a shell command that can be fed to `bash -c`.
     * </pre>
     *
     * <code>string shell = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShell() {
      if (commandCase_ == 1) {
        commandCase_ = 0;
        command_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The format should be a shell command that can be fed to `bash -c`.
     * </pre>
     *
     * <code>string shell = 1;</code>
     * @param value The bytes for shell to set.
     * @return This builder for chaining.
     */
    public Builder setShellBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      commandCase_ = 1;
      command_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.Entrypoint)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.Entrypoint)
  private static final com.google.appengine.v1.Entrypoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.Entrypoint();
  }

  public static com.google.appengine.v1.Entrypoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Entrypoint>
      PARSER = new com.google.protobuf.AbstractParser<Entrypoint>() {
    @java.lang.Override
    public Entrypoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<Entrypoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Entrypoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.Entrypoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

