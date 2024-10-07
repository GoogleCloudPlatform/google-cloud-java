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
// source: google/apps/meet/v2/service.proto

// Protobuf Java Version: 3.25.5
package com.google.apps.meet.v2;

/**
 *
 *
 * <pre>
 * Request to create a space.
 * </pre>
 *
 * Protobuf type {@code google.apps.meet.v2.CreateSpaceRequest}
 */
public final class CreateSpaceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.meet.v2.CreateSpaceRequest)
    CreateSpaceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSpaceRequest.newBuilder() to construct.
  private CreateSpaceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSpaceRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSpaceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.meet.v2.ServiceProto
        .internal_static_google_apps_meet_v2_CreateSpaceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.meet.v2.ServiceProto
        .internal_static_google_apps_meet_v2_CreateSpaceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.meet.v2.CreateSpaceRequest.class,
            com.google.apps.meet.v2.CreateSpaceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SPACE_FIELD_NUMBER = 1;
  private com.google.apps.meet.v2.Space space_;
  /**
   *
   *
   * <pre>
   * Space to be created. As of May 2023, the input space can be empty. Later on
   * the input space can be non-empty when space configuration is introduced.
   * </pre>
   *
   * <code>.google.apps.meet.v2.Space space = 1;</code>
   *
   * @return Whether the space field is set.
   */
  @java.lang.Override
  public boolean hasSpace() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Space to be created. As of May 2023, the input space can be empty. Later on
   * the input space can be non-empty when space configuration is introduced.
   * </pre>
   *
   * <code>.google.apps.meet.v2.Space space = 1;</code>
   *
   * @return The space.
   */
  @java.lang.Override
  public com.google.apps.meet.v2.Space getSpace() {
    return space_ == null ? com.google.apps.meet.v2.Space.getDefaultInstance() : space_;
  }
  /**
   *
   *
   * <pre>
   * Space to be created. As of May 2023, the input space can be empty. Later on
   * the input space can be non-empty when space configuration is introduced.
   * </pre>
   *
   * <code>.google.apps.meet.v2.Space space = 1;</code>
   */
  @java.lang.Override
  public com.google.apps.meet.v2.SpaceOrBuilder getSpaceOrBuilder() {
    return space_ == null ? com.google.apps.meet.v2.Space.getDefaultInstance() : space_;
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
      output.writeMessage(1, getSpace());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSpace());
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
    if (!(obj instanceof com.google.apps.meet.v2.CreateSpaceRequest)) {
      return super.equals(obj);
    }
    com.google.apps.meet.v2.CreateSpaceRequest other =
        (com.google.apps.meet.v2.CreateSpaceRequest) obj;

    if (hasSpace() != other.hasSpace()) return false;
    if (hasSpace()) {
      if (!getSpace().equals(other.getSpace())) return false;
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
    if (hasSpace()) {
      hash = (37 * hash) + SPACE_FIELD_NUMBER;
      hash = (53 * hash) + getSpace().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest parseFrom(
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

  public static Builder newBuilder(com.google.apps.meet.v2.CreateSpaceRequest prototype) {
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
   * Request to create a space.
   * </pre>
   *
   * Protobuf type {@code google.apps.meet.v2.CreateSpaceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.meet.v2.CreateSpaceRequest)
      com.google.apps.meet.v2.CreateSpaceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.meet.v2.ServiceProto
          .internal_static_google_apps_meet_v2_CreateSpaceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.meet.v2.ServiceProto
          .internal_static_google_apps_meet_v2_CreateSpaceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.meet.v2.CreateSpaceRequest.class,
              com.google.apps.meet.v2.CreateSpaceRequest.Builder.class);
    }

    // Construct using com.google.apps.meet.v2.CreateSpaceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSpaceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      space_ = null;
      if (spaceBuilder_ != null) {
        spaceBuilder_.dispose();
        spaceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.meet.v2.ServiceProto
          .internal_static_google_apps_meet_v2_CreateSpaceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.apps.meet.v2.CreateSpaceRequest getDefaultInstanceForType() {
      return com.google.apps.meet.v2.CreateSpaceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.meet.v2.CreateSpaceRequest build() {
      com.google.apps.meet.v2.CreateSpaceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.meet.v2.CreateSpaceRequest buildPartial() {
      com.google.apps.meet.v2.CreateSpaceRequest result =
          new com.google.apps.meet.v2.CreateSpaceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.meet.v2.CreateSpaceRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.space_ = spaceBuilder_ == null ? space_ : spaceBuilder_.build();
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
      if (other instanceof com.google.apps.meet.v2.CreateSpaceRequest) {
        return mergeFrom((com.google.apps.meet.v2.CreateSpaceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.meet.v2.CreateSpaceRequest other) {
      if (other == com.google.apps.meet.v2.CreateSpaceRequest.getDefaultInstance()) return this;
      if (other.hasSpace()) {
        mergeSpace(other.getSpace());
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
                input.readMessage(getSpaceFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.apps.meet.v2.Space space_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.meet.v2.Space,
            com.google.apps.meet.v2.Space.Builder,
            com.google.apps.meet.v2.SpaceOrBuilder>
        spaceBuilder_;
    /**
     *
     *
     * <pre>
     * Space to be created. As of May 2023, the input space can be empty. Later on
     * the input space can be non-empty when space configuration is introduced.
     * </pre>
     *
     * <code>.google.apps.meet.v2.Space space = 1;</code>
     *
     * @return Whether the space field is set.
     */
    public boolean hasSpace() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Space to be created. As of May 2023, the input space can be empty. Later on
     * the input space can be non-empty when space configuration is introduced.
     * </pre>
     *
     * <code>.google.apps.meet.v2.Space space = 1;</code>
     *
     * @return The space.
     */
    public com.google.apps.meet.v2.Space getSpace() {
      if (spaceBuilder_ == null) {
        return space_ == null ? com.google.apps.meet.v2.Space.getDefaultInstance() : space_;
      } else {
        return spaceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Space to be created. As of May 2023, the input space can be empty. Later on
     * the input space can be non-empty when space configuration is introduced.
     * </pre>
     *
     * <code>.google.apps.meet.v2.Space space = 1;</code>
     */
    public Builder setSpace(com.google.apps.meet.v2.Space value) {
      if (spaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        space_ = value;
      } else {
        spaceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Space to be created. As of May 2023, the input space can be empty. Later on
     * the input space can be non-empty when space configuration is introduced.
     * </pre>
     *
     * <code>.google.apps.meet.v2.Space space = 1;</code>
     */
    public Builder setSpace(com.google.apps.meet.v2.Space.Builder builderForValue) {
      if (spaceBuilder_ == null) {
        space_ = builderForValue.build();
      } else {
        spaceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Space to be created. As of May 2023, the input space can be empty. Later on
     * the input space can be non-empty when space configuration is introduced.
     * </pre>
     *
     * <code>.google.apps.meet.v2.Space space = 1;</code>
     */
    public Builder mergeSpace(com.google.apps.meet.v2.Space value) {
      if (spaceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && space_ != null
            && space_ != com.google.apps.meet.v2.Space.getDefaultInstance()) {
          getSpaceBuilder().mergeFrom(value);
        } else {
          space_ = value;
        }
      } else {
        spaceBuilder_.mergeFrom(value);
      }
      if (space_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Space to be created. As of May 2023, the input space can be empty. Later on
     * the input space can be non-empty when space configuration is introduced.
     * </pre>
     *
     * <code>.google.apps.meet.v2.Space space = 1;</code>
     */
    public Builder clearSpace() {
      bitField0_ = (bitField0_ & ~0x00000001);
      space_ = null;
      if (spaceBuilder_ != null) {
        spaceBuilder_.dispose();
        spaceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Space to be created. As of May 2023, the input space can be empty. Later on
     * the input space can be non-empty when space configuration is introduced.
     * </pre>
     *
     * <code>.google.apps.meet.v2.Space space = 1;</code>
     */
    public com.google.apps.meet.v2.Space.Builder getSpaceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSpaceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Space to be created. As of May 2023, the input space can be empty. Later on
     * the input space can be non-empty when space configuration is introduced.
     * </pre>
     *
     * <code>.google.apps.meet.v2.Space space = 1;</code>
     */
    public com.google.apps.meet.v2.SpaceOrBuilder getSpaceOrBuilder() {
      if (spaceBuilder_ != null) {
        return spaceBuilder_.getMessageOrBuilder();
      } else {
        return space_ == null ? com.google.apps.meet.v2.Space.getDefaultInstance() : space_;
      }
    }
    /**
     *
     *
     * <pre>
     * Space to be created. As of May 2023, the input space can be empty. Later on
     * the input space can be non-empty when space configuration is introduced.
     * </pre>
     *
     * <code>.google.apps.meet.v2.Space space = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.meet.v2.Space,
            com.google.apps.meet.v2.Space.Builder,
            com.google.apps.meet.v2.SpaceOrBuilder>
        getSpaceFieldBuilder() {
      if (spaceBuilder_ == null) {
        spaceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.apps.meet.v2.Space,
                com.google.apps.meet.v2.Space.Builder,
                com.google.apps.meet.v2.SpaceOrBuilder>(
                getSpace(), getParentForChildren(), isClean());
        space_ = null;
      }
      return spaceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.apps.meet.v2.CreateSpaceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.apps.meet.v2.CreateSpaceRequest)
  private static final com.google.apps.meet.v2.CreateSpaceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.meet.v2.CreateSpaceRequest();
  }

  public static com.google.apps.meet.v2.CreateSpaceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSpaceRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSpaceRequest>() {
        @java.lang.Override
        public CreateSpaceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSpaceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSpaceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.meet.v2.CreateSpaceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
