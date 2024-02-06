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
// source: google/apps/meet/v2beta/service.proto

// Protobuf Java Version: 3.25.2
package com.google.apps.meet.v2beta;

/**
 *
 *
 * <pre>
 * Response of ListParticipants method.
 * </pre>
 *
 * Protobuf type {@code google.apps.meet.v2beta.ListParticipantSessionsResponse}
 */
public final class ListParticipantSessionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.meet.v2beta.ListParticipantSessionsResponse)
    ListParticipantSessionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListParticipantSessionsResponse.newBuilder() to construct.
  private ListParticipantSessionsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListParticipantSessionsResponse() {
    participantSessions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListParticipantSessionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.meet.v2beta.ServiceProto
        .internal_static_google_apps_meet_v2beta_ListParticipantSessionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.meet.v2beta.ServiceProto
        .internal_static_google_apps_meet_v2beta_ListParticipantSessionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.meet.v2beta.ListParticipantSessionsResponse.class,
            com.google.apps.meet.v2beta.ListParticipantSessionsResponse.Builder.class);
  }

  public static final int PARTICIPANT_SESSIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.apps.meet.v2beta.ParticipantSession> participantSessions_;
  /**
   *
   *
   * <pre>
   * List of participants in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.apps.meet.v2beta.ParticipantSession>
      getParticipantSessionsList() {
    return participantSessions_;
  }
  /**
   *
   *
   * <pre>
   * List of participants in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.apps.meet.v2beta.ParticipantSessionOrBuilder>
      getParticipantSessionsOrBuilderList() {
    return participantSessions_;
  }
  /**
   *
   *
   * <pre>
   * List of participants in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
   */
  @java.lang.Override
  public int getParticipantSessionsCount() {
    return participantSessions_.size();
  }
  /**
   *
   *
   * <pre>
   * List of participants in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
   */
  @java.lang.Override
  public com.google.apps.meet.v2beta.ParticipantSession getParticipantSessions(int index) {
    return participantSessions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of participants in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
   */
  @java.lang.Override
  public com.google.apps.meet.v2beta.ParticipantSessionOrBuilder getParticipantSessionsOrBuilder(
      int index) {
    return participantSessions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token to be circulated back for further List call if current List doesn't
   * include all the participants. Unset if all participants are returned.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to be circulated back for further List call if current List doesn't
   * include all the participants. Unset if all participants are returned.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < participantSessions_.size(); i++) {
      output.writeMessage(1, participantSessions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < participantSessions_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, participantSessions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.apps.meet.v2beta.ListParticipantSessionsResponse)) {
      return super.equals(obj);
    }
    com.google.apps.meet.v2beta.ListParticipantSessionsResponse other =
        (com.google.apps.meet.v2beta.ListParticipantSessionsResponse) obj;

    if (!getParticipantSessionsList().equals(other.getParticipantSessionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getParticipantSessionsCount() > 0) {
      hash = (37 * hash) + PARTICIPANT_SESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getParticipantSessionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse parseFrom(
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
      com.google.apps.meet.v2beta.ListParticipantSessionsResponse prototype) {
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
   * Response of ListParticipants method.
   * </pre>
   *
   * Protobuf type {@code google.apps.meet.v2beta.ListParticipantSessionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.meet.v2beta.ListParticipantSessionsResponse)
      com.google.apps.meet.v2beta.ListParticipantSessionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.meet.v2beta.ServiceProto
          .internal_static_google_apps_meet_v2beta_ListParticipantSessionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.meet.v2beta.ServiceProto
          .internal_static_google_apps_meet_v2beta_ListParticipantSessionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.meet.v2beta.ListParticipantSessionsResponse.class,
              com.google.apps.meet.v2beta.ListParticipantSessionsResponse.Builder.class);
    }

    // Construct using com.google.apps.meet.v2beta.ListParticipantSessionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (participantSessionsBuilder_ == null) {
        participantSessions_ = java.util.Collections.emptyList();
      } else {
        participantSessions_ = null;
        participantSessionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.meet.v2beta.ServiceProto
          .internal_static_google_apps_meet_v2beta_ListParticipantSessionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.apps.meet.v2beta.ListParticipantSessionsResponse getDefaultInstanceForType() {
      return com.google.apps.meet.v2beta.ListParticipantSessionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.meet.v2beta.ListParticipantSessionsResponse build() {
      com.google.apps.meet.v2beta.ListParticipantSessionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.meet.v2beta.ListParticipantSessionsResponse buildPartial() {
      com.google.apps.meet.v2beta.ListParticipantSessionsResponse result =
          new com.google.apps.meet.v2beta.ListParticipantSessionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.apps.meet.v2beta.ListParticipantSessionsResponse result) {
      if (participantSessionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          participantSessions_ = java.util.Collections.unmodifiableList(participantSessions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.participantSessions_ = participantSessions_;
      } else {
        result.participantSessions_ = participantSessionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.apps.meet.v2beta.ListParticipantSessionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.apps.meet.v2beta.ListParticipantSessionsResponse) {
        return mergeFrom((com.google.apps.meet.v2beta.ListParticipantSessionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.meet.v2beta.ListParticipantSessionsResponse other) {
      if (other == com.google.apps.meet.v2beta.ListParticipantSessionsResponse.getDefaultInstance())
        return this;
      if (participantSessionsBuilder_ == null) {
        if (!other.participantSessions_.isEmpty()) {
          if (participantSessions_.isEmpty()) {
            participantSessions_ = other.participantSessions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParticipantSessionsIsMutable();
            participantSessions_.addAll(other.participantSessions_);
          }
          onChanged();
        }
      } else {
        if (!other.participantSessions_.isEmpty()) {
          if (participantSessionsBuilder_.isEmpty()) {
            participantSessionsBuilder_.dispose();
            participantSessionsBuilder_ = null;
            participantSessions_ = other.participantSessions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            participantSessionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getParticipantSessionsFieldBuilder()
                    : null;
          } else {
            participantSessionsBuilder_.addAllMessages(other.participantSessions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                com.google.apps.meet.v2beta.ParticipantSession m =
                    input.readMessage(
                        com.google.apps.meet.v2beta.ParticipantSession.parser(), extensionRegistry);
                if (participantSessionsBuilder_ == null) {
                  ensureParticipantSessionsIsMutable();
                  participantSessions_.add(m);
                } else {
                  participantSessionsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private java.util.List<com.google.apps.meet.v2beta.ParticipantSession> participantSessions_ =
        java.util.Collections.emptyList();

    private void ensureParticipantSessionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        participantSessions_ =
            new java.util.ArrayList<com.google.apps.meet.v2beta.ParticipantSession>(
                participantSessions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.apps.meet.v2beta.ParticipantSession,
            com.google.apps.meet.v2beta.ParticipantSession.Builder,
            com.google.apps.meet.v2beta.ParticipantSessionOrBuilder>
        participantSessionsBuilder_;

    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public java.util.List<com.google.apps.meet.v2beta.ParticipantSession>
        getParticipantSessionsList() {
      if (participantSessionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(participantSessions_);
      } else {
        return participantSessionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public int getParticipantSessionsCount() {
      if (participantSessionsBuilder_ == null) {
        return participantSessions_.size();
      } else {
        return participantSessionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public com.google.apps.meet.v2beta.ParticipantSession getParticipantSessions(int index) {
      if (participantSessionsBuilder_ == null) {
        return participantSessions_.get(index);
      } else {
        return participantSessionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public Builder setParticipantSessions(
        int index, com.google.apps.meet.v2beta.ParticipantSession value) {
      if (participantSessionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantSessionsIsMutable();
        participantSessions_.set(index, value);
        onChanged();
      } else {
        participantSessionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public Builder setParticipantSessions(
        int index, com.google.apps.meet.v2beta.ParticipantSession.Builder builderForValue) {
      if (participantSessionsBuilder_ == null) {
        ensureParticipantSessionsIsMutable();
        participantSessions_.set(index, builderForValue.build());
        onChanged();
      } else {
        participantSessionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public Builder addParticipantSessions(com.google.apps.meet.v2beta.ParticipantSession value) {
      if (participantSessionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantSessionsIsMutable();
        participantSessions_.add(value);
        onChanged();
      } else {
        participantSessionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public Builder addParticipantSessions(
        int index, com.google.apps.meet.v2beta.ParticipantSession value) {
      if (participantSessionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantSessionsIsMutable();
        participantSessions_.add(index, value);
        onChanged();
      } else {
        participantSessionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public Builder addParticipantSessions(
        com.google.apps.meet.v2beta.ParticipantSession.Builder builderForValue) {
      if (participantSessionsBuilder_ == null) {
        ensureParticipantSessionsIsMutable();
        participantSessions_.add(builderForValue.build());
        onChanged();
      } else {
        participantSessionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public Builder addParticipantSessions(
        int index, com.google.apps.meet.v2beta.ParticipantSession.Builder builderForValue) {
      if (participantSessionsBuilder_ == null) {
        ensureParticipantSessionsIsMutable();
        participantSessions_.add(index, builderForValue.build());
        onChanged();
      } else {
        participantSessionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public Builder addAllParticipantSessions(
        java.lang.Iterable<? extends com.google.apps.meet.v2beta.ParticipantSession> values) {
      if (participantSessionsBuilder_ == null) {
        ensureParticipantSessionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, participantSessions_);
        onChanged();
      } else {
        participantSessionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public Builder clearParticipantSessions() {
      if (participantSessionsBuilder_ == null) {
        participantSessions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        participantSessionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public Builder removeParticipantSessions(int index) {
      if (participantSessionsBuilder_ == null) {
        ensureParticipantSessionsIsMutable();
        participantSessions_.remove(index);
        onChanged();
      } else {
        participantSessionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public com.google.apps.meet.v2beta.ParticipantSession.Builder getParticipantSessionsBuilder(
        int index) {
      return getParticipantSessionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public com.google.apps.meet.v2beta.ParticipantSessionOrBuilder getParticipantSessionsOrBuilder(
        int index) {
      if (participantSessionsBuilder_ == null) {
        return participantSessions_.get(index);
      } else {
        return participantSessionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public java.util.List<? extends com.google.apps.meet.v2beta.ParticipantSessionOrBuilder>
        getParticipantSessionsOrBuilderList() {
      if (participantSessionsBuilder_ != null) {
        return participantSessionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(participantSessions_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public com.google.apps.meet.v2beta.ParticipantSession.Builder addParticipantSessionsBuilder() {
      return getParticipantSessionsFieldBuilder()
          .addBuilder(com.google.apps.meet.v2beta.ParticipantSession.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public com.google.apps.meet.v2beta.ParticipantSession.Builder addParticipantSessionsBuilder(
        int index) {
      return getParticipantSessionsFieldBuilder()
          .addBuilder(index, com.google.apps.meet.v2beta.ParticipantSession.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of participants in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.ParticipantSession participant_sessions = 1;</code>
     */
    public java.util.List<com.google.apps.meet.v2beta.ParticipantSession.Builder>
        getParticipantSessionsBuilderList() {
      return getParticipantSessionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.apps.meet.v2beta.ParticipantSession,
            com.google.apps.meet.v2beta.ParticipantSession.Builder,
            com.google.apps.meet.v2beta.ParticipantSessionOrBuilder>
        getParticipantSessionsFieldBuilder() {
      if (participantSessionsBuilder_ == null) {
        participantSessionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.apps.meet.v2beta.ParticipantSession,
                com.google.apps.meet.v2beta.ParticipantSession.Builder,
                com.google.apps.meet.v2beta.ParticipantSessionOrBuilder>(
                participantSessions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        participantSessions_ = null;
      }
      return participantSessionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the participants. Unset if all participants are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the participants. Unset if all participants are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the participants. Unset if all participants are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the participants. Unset if all participants are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the participants. Unset if all participants are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.apps.meet.v2beta.ListParticipantSessionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.apps.meet.v2beta.ListParticipantSessionsResponse)
  private static final com.google.apps.meet.v2beta.ListParticipantSessionsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.meet.v2beta.ListParticipantSessionsResponse();
  }

  public static com.google.apps.meet.v2beta.ListParticipantSessionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListParticipantSessionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListParticipantSessionsResponse>() {
        @java.lang.Override
        public ListParticipantSessionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListParticipantSessionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListParticipantSessionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.meet.v2beta.ListParticipantSessionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
