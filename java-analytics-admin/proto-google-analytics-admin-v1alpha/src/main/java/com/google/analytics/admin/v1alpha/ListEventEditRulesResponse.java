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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Response message for ListEventEditRules RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ListEventEditRulesResponse}
 */
public final class ListEventEditRulesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ListEventEditRulesResponse)
    ListEventEditRulesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListEventEditRulesResponse.newBuilder() to construct.
  private ListEventEditRulesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListEventEditRulesResponse() {
    eventEditRules_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListEventEditRulesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListEventEditRulesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListEventEditRulesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ListEventEditRulesResponse.class,
            com.google.analytics.admin.v1alpha.ListEventEditRulesResponse.Builder.class);
  }

  public static final int EVENT_EDIT_RULES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.admin.v1alpha.EventEditRule> eventEditRules_;
  /**
   *
   *
   * <pre>
   * List of EventEditRules. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.EventEditRule> getEventEditRulesList() {
    return eventEditRules_;
  }
  /**
   *
   *
   * <pre>
   * List of EventEditRules. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.EventEditRuleOrBuilder>
      getEventEditRulesOrBuilderList() {
    return eventEditRules_;
  }
  /**
   *
   *
   * <pre>
   * List of EventEditRules. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
   */
  @java.lang.Override
  public int getEventEditRulesCount() {
    return eventEditRules_.size();
  }
  /**
   *
   *
   * <pre>
   * List of EventEditRules. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.EventEditRule getEventEditRules(int index) {
    return eventEditRules_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of EventEditRules. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.EventEditRuleOrBuilder getEventEditRulesOrBuilder(
      int index) {
    return eventEditRules_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < eventEditRules_.size(); i++) {
      output.writeMessage(1, eventEditRules_.get(i));
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
    for (int i = 0; i < eventEditRules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, eventEditRules_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ListEventEditRulesResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ListEventEditRulesResponse other =
        (com.google.analytics.admin.v1alpha.ListEventEditRulesResponse) obj;

    if (!getEventEditRulesList().equals(other.getEventEditRulesList())) return false;
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
    if (getEventEditRulesCount() > 0) {
      hash = (37 * hash) + EVENT_EDIT_RULES_FIELD_NUMBER;
      hash = (53 * hash) + getEventEditRulesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse parseFrom(
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
      com.google.analytics.admin.v1alpha.ListEventEditRulesResponse prototype) {
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
   * Response message for ListEventEditRules RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ListEventEditRulesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ListEventEditRulesResponse)
      com.google.analytics.admin.v1alpha.ListEventEditRulesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListEventEditRulesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListEventEditRulesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ListEventEditRulesResponse.class,
              com.google.analytics.admin.v1alpha.ListEventEditRulesResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.ListEventEditRulesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (eventEditRulesBuilder_ == null) {
        eventEditRules_ = java.util.Collections.emptyList();
      } else {
        eventEditRules_ = null;
        eventEditRulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListEventEditRulesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListEventEditRulesResponse
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ListEventEditRulesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListEventEditRulesResponse build() {
      com.google.analytics.admin.v1alpha.ListEventEditRulesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListEventEditRulesResponse buildPartial() {
      com.google.analytics.admin.v1alpha.ListEventEditRulesResponse result =
          new com.google.analytics.admin.v1alpha.ListEventEditRulesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.analytics.admin.v1alpha.ListEventEditRulesResponse result) {
      if (eventEditRulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          eventEditRules_ = java.util.Collections.unmodifiableList(eventEditRules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.eventEditRules_ = eventEditRules_;
      } else {
        result.eventEditRules_ = eventEditRulesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.ListEventEditRulesResponse result) {
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
      if (other instanceof com.google.analytics.admin.v1alpha.ListEventEditRulesResponse) {
        return mergeFrom((com.google.analytics.admin.v1alpha.ListEventEditRulesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.ListEventEditRulesResponse other) {
      if (other
          == com.google.analytics.admin.v1alpha.ListEventEditRulesResponse.getDefaultInstance())
        return this;
      if (eventEditRulesBuilder_ == null) {
        if (!other.eventEditRules_.isEmpty()) {
          if (eventEditRules_.isEmpty()) {
            eventEditRules_ = other.eventEditRules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventEditRulesIsMutable();
            eventEditRules_.addAll(other.eventEditRules_);
          }
          onChanged();
        }
      } else {
        if (!other.eventEditRules_.isEmpty()) {
          if (eventEditRulesBuilder_.isEmpty()) {
            eventEditRulesBuilder_.dispose();
            eventEditRulesBuilder_ = null;
            eventEditRules_ = other.eventEditRules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eventEditRulesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEventEditRulesFieldBuilder()
                    : null;
          } else {
            eventEditRulesBuilder_.addAllMessages(other.eventEditRules_);
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
                com.google.analytics.admin.v1alpha.EventEditRule m =
                    input.readMessage(
                        com.google.analytics.admin.v1alpha.EventEditRule.parser(),
                        extensionRegistry);
                if (eventEditRulesBuilder_ == null) {
                  ensureEventEditRulesIsMutable();
                  eventEditRules_.add(m);
                } else {
                  eventEditRulesBuilder_.addMessage(m);
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

    private java.util.List<com.google.analytics.admin.v1alpha.EventEditRule> eventEditRules_ =
        java.util.Collections.emptyList();

    private void ensureEventEditRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        eventEditRules_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.EventEditRule>(
                eventEditRules_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.EventEditRule,
            com.google.analytics.admin.v1alpha.EventEditRule.Builder,
            com.google.analytics.admin.v1alpha.EventEditRuleOrBuilder>
        eventEditRulesBuilder_;

    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.EventEditRule>
        getEventEditRulesList() {
      if (eventEditRulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(eventEditRules_);
      } else {
        return eventEditRulesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public int getEventEditRulesCount() {
      if (eventEditRulesBuilder_ == null) {
        return eventEditRules_.size();
      } else {
        return eventEditRulesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.EventEditRule getEventEditRules(int index) {
      if (eventEditRulesBuilder_ == null) {
        return eventEditRules_.get(index);
      } else {
        return eventEditRulesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public Builder setEventEditRules(
        int index, com.google.analytics.admin.v1alpha.EventEditRule value) {
      if (eventEditRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventEditRulesIsMutable();
        eventEditRules_.set(index, value);
        onChanged();
      } else {
        eventEditRulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public Builder setEventEditRules(
        int index, com.google.analytics.admin.v1alpha.EventEditRule.Builder builderForValue) {
      if (eventEditRulesBuilder_ == null) {
        ensureEventEditRulesIsMutable();
        eventEditRules_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventEditRulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public Builder addEventEditRules(com.google.analytics.admin.v1alpha.EventEditRule value) {
      if (eventEditRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventEditRulesIsMutable();
        eventEditRules_.add(value);
        onChanged();
      } else {
        eventEditRulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public Builder addEventEditRules(
        int index, com.google.analytics.admin.v1alpha.EventEditRule value) {
      if (eventEditRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventEditRulesIsMutable();
        eventEditRules_.add(index, value);
        onChanged();
      } else {
        eventEditRulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public Builder addEventEditRules(
        com.google.analytics.admin.v1alpha.EventEditRule.Builder builderForValue) {
      if (eventEditRulesBuilder_ == null) {
        ensureEventEditRulesIsMutable();
        eventEditRules_.add(builderForValue.build());
        onChanged();
      } else {
        eventEditRulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public Builder addEventEditRules(
        int index, com.google.analytics.admin.v1alpha.EventEditRule.Builder builderForValue) {
      if (eventEditRulesBuilder_ == null) {
        ensureEventEditRulesIsMutable();
        eventEditRules_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventEditRulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public Builder addAllEventEditRules(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.EventEditRule> values) {
      if (eventEditRulesBuilder_ == null) {
        ensureEventEditRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, eventEditRules_);
        onChanged();
      } else {
        eventEditRulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public Builder clearEventEditRules() {
      if (eventEditRulesBuilder_ == null) {
        eventEditRules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eventEditRulesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public Builder removeEventEditRules(int index) {
      if (eventEditRulesBuilder_ == null) {
        ensureEventEditRulesIsMutable();
        eventEditRules_.remove(index);
        onChanged();
      } else {
        eventEditRulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.EventEditRule.Builder getEventEditRulesBuilder(
        int index) {
      return getEventEditRulesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.EventEditRuleOrBuilder getEventEditRulesOrBuilder(
        int index) {
      if (eventEditRulesBuilder_ == null) {
        return eventEditRules_.get(index);
      } else {
        return eventEditRulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.EventEditRuleOrBuilder>
        getEventEditRulesOrBuilderList() {
      if (eventEditRulesBuilder_ != null) {
        return eventEditRulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(eventEditRules_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.EventEditRule.Builder addEventEditRulesBuilder() {
      return getEventEditRulesFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1alpha.EventEditRule.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.EventEditRule.Builder addEventEditRulesBuilder(
        int index) {
      return getEventEditRulesFieldBuilder()
          .addBuilder(index, com.google.analytics.admin.v1alpha.EventEditRule.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of EventEditRules. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.EventEditRule event_edit_rules = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.EventEditRule.Builder>
        getEventEditRulesBuilderList() {
      return getEventEditRulesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.EventEditRule,
            com.google.analytics.admin.v1alpha.EventEditRule.Builder,
            com.google.analytics.admin.v1alpha.EventEditRuleOrBuilder>
        getEventEditRulesFieldBuilder() {
      if (eventEditRulesBuilder_ == null) {
        eventEditRulesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.EventEditRule,
                com.google.analytics.admin.v1alpha.EventEditRule.Builder,
                com.google.analytics.admin.v1alpha.EventEditRuleOrBuilder>(
                eventEditRules_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        eventEditRules_ = null;
      }
      return eventEditRulesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ListEventEditRulesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ListEventEditRulesResponse)
  private static final com.google.analytics.admin.v1alpha.ListEventEditRulesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ListEventEditRulesResponse();
  }

  public static com.google.analytics.admin.v1alpha.ListEventEditRulesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEventEditRulesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListEventEditRulesResponse>() {
        @java.lang.Override
        public ListEventEditRulesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListEventEditRulesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEventEditRulesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ListEventEditRulesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
