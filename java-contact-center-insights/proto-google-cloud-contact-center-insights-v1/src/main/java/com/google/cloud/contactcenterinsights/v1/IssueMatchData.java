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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * The data for an issue match annotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.IssueMatchData}
 */
public final class IssueMatchData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.IssueMatchData)
    IssueMatchDataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IssueMatchData.newBuilder() to construct.
  private IssueMatchData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IssueMatchData() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IssueMatchData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_IssueMatchData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_IssueMatchData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.IssueMatchData.class,
            com.google.cloud.contactcenterinsights.v1.IssueMatchData.Builder.class);
  }

  private int bitField0_;
  public static final int ISSUE_ASSIGNMENT_FIELD_NUMBER = 1;
  private com.google.cloud.contactcenterinsights.v1.IssueAssignment issueAssignment_;
  /**
   *
   *
   * <pre>
   * Information about the issue's assignment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
   *
   * @return Whether the issueAssignment field is set.
   */
  @java.lang.Override
  public boolean hasIssueAssignment() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Information about the issue's assignment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
   *
   * @return The issueAssignment.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueAssignment getIssueAssignment() {
    return issueAssignment_ == null
        ? com.google.cloud.contactcenterinsights.v1.IssueAssignment.getDefaultInstance()
        : issueAssignment_;
  }
  /**
   *
   *
   * <pre>
   * Information about the issue's assignment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder
      getIssueAssignmentOrBuilder() {
    return issueAssignment_ == null
        ? com.google.cloud.contactcenterinsights.v1.IssueAssignment.getDefaultInstance()
        : issueAssignment_;
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
      output.writeMessage(1, getIssueAssignment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIssueAssignment());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.IssueMatchData)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.IssueMatchData other =
        (com.google.cloud.contactcenterinsights.v1.IssueMatchData) obj;

    if (hasIssueAssignment() != other.hasIssueAssignment()) return false;
    if (hasIssueAssignment()) {
      if (!getIssueAssignment().equals(other.getIssueAssignment())) return false;
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
    if (hasIssueAssignment()) {
      hash = (37 * hash) + ISSUE_ASSIGNMENT_FIELD_NUMBER;
      hash = (53 * hash) + getIssueAssignment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.IssueMatchData prototype) {
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
   * The data for an issue match annotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.IssueMatchData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.IssueMatchData)
      com.google.cloud.contactcenterinsights.v1.IssueMatchDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_IssueMatchData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_IssueMatchData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.IssueMatchData.class,
              com.google.cloud.contactcenterinsights.v1.IssueMatchData.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.IssueMatchData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIssueAssignmentFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      issueAssignment_ = null;
      if (issueAssignmentBuilder_ != null) {
        issueAssignmentBuilder_.dispose();
        issueAssignmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_IssueMatchData_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.IssueMatchData getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.IssueMatchData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.IssueMatchData build() {
      com.google.cloud.contactcenterinsights.v1.IssueMatchData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.IssueMatchData buildPartial() {
      com.google.cloud.contactcenterinsights.v1.IssueMatchData result =
          new com.google.cloud.contactcenterinsights.v1.IssueMatchData(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contactcenterinsights.v1.IssueMatchData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.issueAssignment_ =
            issueAssignmentBuilder_ == null ? issueAssignment_ : issueAssignmentBuilder_.build();
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.IssueMatchData) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.IssueMatchData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.IssueMatchData other) {
      if (other == com.google.cloud.contactcenterinsights.v1.IssueMatchData.getDefaultInstance())
        return this;
      if (other.hasIssueAssignment()) {
        mergeIssueAssignment(other.getIssueAssignment());
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
                input.readMessage(getIssueAssignmentFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.contactcenterinsights.v1.IssueAssignment issueAssignment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.IssueAssignment,
            com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder,
            com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder>
        issueAssignmentBuilder_;
    /**
     *
     *
     * <pre>
     * Information about the issue's assignment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
     *
     * @return Whether the issueAssignment field is set.
     */
    public boolean hasIssueAssignment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Information about the issue's assignment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
     *
     * @return The issueAssignment.
     */
    public com.google.cloud.contactcenterinsights.v1.IssueAssignment getIssueAssignment() {
      if (issueAssignmentBuilder_ == null) {
        return issueAssignment_ == null
            ? com.google.cloud.contactcenterinsights.v1.IssueAssignment.getDefaultInstance()
            : issueAssignment_;
      } else {
        return issueAssignmentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Information about the issue's assignment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
     */
    public Builder setIssueAssignment(
        com.google.cloud.contactcenterinsights.v1.IssueAssignment value) {
      if (issueAssignmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        issueAssignment_ = value;
      } else {
        issueAssignmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information about the issue's assignment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
     */
    public Builder setIssueAssignment(
        com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder builderForValue) {
      if (issueAssignmentBuilder_ == null) {
        issueAssignment_ = builderForValue.build();
      } else {
        issueAssignmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information about the issue's assignment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
     */
    public Builder mergeIssueAssignment(
        com.google.cloud.contactcenterinsights.v1.IssueAssignment value) {
      if (issueAssignmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && issueAssignment_ != null
            && issueAssignment_
                != com.google.cloud.contactcenterinsights.v1.IssueAssignment.getDefaultInstance()) {
          getIssueAssignmentBuilder().mergeFrom(value);
        } else {
          issueAssignment_ = value;
        }
      } else {
        issueAssignmentBuilder_.mergeFrom(value);
      }
      if (issueAssignment_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information about the issue's assignment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
     */
    public Builder clearIssueAssignment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      issueAssignment_ = null;
      if (issueAssignmentBuilder_ != null) {
        issueAssignmentBuilder_.dispose();
        issueAssignmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information about the issue's assignment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder
        getIssueAssignmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIssueAssignmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Information about the issue's assignment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder
        getIssueAssignmentOrBuilder() {
      if (issueAssignmentBuilder_ != null) {
        return issueAssignmentBuilder_.getMessageOrBuilder();
      } else {
        return issueAssignment_ == null
            ? com.google.cloud.contactcenterinsights.v1.IssueAssignment.getDefaultInstance()
            : issueAssignment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Information about the issue's assignment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueAssignment issue_assignment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.IssueAssignment,
            com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder,
            com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder>
        getIssueAssignmentFieldBuilder() {
      if (issueAssignmentBuilder_ == null) {
        issueAssignmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.IssueAssignment,
                com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder,
                com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder>(
                getIssueAssignment(), getParentForChildren(), isClean());
        issueAssignment_ = null;
      }
      return issueAssignmentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.IssueMatchData)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.IssueMatchData)
  private static final com.google.cloud.contactcenterinsights.v1.IssueMatchData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.IssueMatchData();
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueMatchData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IssueMatchData> PARSER =
      new com.google.protobuf.AbstractParser<IssueMatchData>() {
        @java.lang.Override
        public IssueMatchData parsePartialFrom(
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

  public static com.google.protobuf.Parser<IssueMatchData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IssueMatchData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueMatchData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
