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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * The data that will be profiled.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DataProfileLocation}
 */
public final class DataProfileLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DataProfileLocation)
    DataProfileLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataProfileLocation.newBuilder() to construct.
  private DataProfileLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataProfileLocation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataProfileLocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DataProfileLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DataProfileLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DataProfileLocation.class,
            com.google.privacy.dlp.v2.DataProfileLocation.Builder.class);
  }

  private int locationCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object location_;

  public enum LocationCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ORGANIZATION_ID(1),
    FOLDER_ID(2),
    LOCATION_NOT_SET(0);
    private final int value;

    private LocationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LocationCase valueOf(int value) {
      return forNumber(value);
    }

    public static LocationCase forNumber(int value) {
      switch (value) {
        case 1:
          return ORGANIZATION_ID;
        case 2:
          return FOLDER_ID;
        case 0:
          return LOCATION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public LocationCase getLocationCase() {
    return LocationCase.forNumber(locationCase_);
  }

  public static final int ORGANIZATION_ID_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The ID of an organization to scan.
   * </pre>
   *
   * <code>int64 organization_id = 1;</code>
   *
   * @return Whether the organizationId field is set.
   */
  @java.lang.Override
  public boolean hasOrganizationId() {
    return locationCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The ID of an organization to scan.
   * </pre>
   *
   * <code>int64 organization_id = 1;</code>
   *
   * @return The organizationId.
   */
  @java.lang.Override
  public long getOrganizationId() {
    if (locationCase_ == 1) {
      return (java.lang.Long) location_;
    }
    return 0L;
  }

  public static final int FOLDER_ID_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * The ID of the folder within an organization to scan.
   * </pre>
   *
   * <code>int64 folder_id = 2;</code>
   *
   * @return Whether the folderId field is set.
   */
  @java.lang.Override
  public boolean hasFolderId() {
    return locationCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * The ID of the folder within an organization to scan.
   * </pre>
   *
   * <code>int64 folder_id = 2;</code>
   *
   * @return The folderId.
   */
  @java.lang.Override
  public long getFolderId() {
    if (locationCase_ == 2) {
      return (java.lang.Long) location_;
    }
    return 0L;
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
    if (locationCase_ == 1) {
      output.writeInt64(1, (long) ((java.lang.Long) location_));
    }
    if (locationCase_ == 2) {
      output.writeInt64(2, (long) ((java.lang.Long) location_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (locationCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(
              1, (long) ((java.lang.Long) location_));
    }
    if (locationCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(
              2, (long) ((java.lang.Long) location_));
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DataProfileLocation)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DataProfileLocation other =
        (com.google.privacy.dlp.v2.DataProfileLocation) obj;

    if (!getLocationCase().equals(other.getLocationCase())) return false;
    switch (locationCase_) {
      case 1:
        if (getOrganizationId() != other.getOrganizationId()) return false;
        break;
      case 2:
        if (getFolderId() != other.getFolderId()) return false;
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
    switch (locationCase_) {
      case 1:
        hash = (37 * hash) + ORGANIZATION_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getOrganizationId());
        break;
      case 2:
        hash = (37 * hash) + FOLDER_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getFolderId());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.DataProfileLocation prototype) {
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
   * The data that will be profiled.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DataProfileLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DataProfileLocation)
      com.google.privacy.dlp.v2.DataProfileLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DataProfileLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DataProfileLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DataProfileLocation.class,
              com.google.privacy.dlp.v2.DataProfileLocation.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DataProfileLocation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      locationCase_ = 0;
      location_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DataProfileLocation_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileLocation getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DataProfileLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileLocation build() {
      com.google.privacy.dlp.v2.DataProfileLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileLocation buildPartial() {
      com.google.privacy.dlp.v2.DataProfileLocation result =
          new com.google.privacy.dlp.v2.DataProfileLocation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.DataProfileLocation result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.privacy.dlp.v2.DataProfileLocation result) {
      result.locationCase_ = locationCase_;
      result.location_ = this.location_;
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
      if (other instanceof com.google.privacy.dlp.v2.DataProfileLocation) {
        return mergeFrom((com.google.privacy.dlp.v2.DataProfileLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DataProfileLocation other) {
      if (other == com.google.privacy.dlp.v2.DataProfileLocation.getDefaultInstance()) return this;
      switch (other.getLocationCase()) {
        case ORGANIZATION_ID:
          {
            setOrganizationId(other.getOrganizationId());
            break;
          }
        case FOLDER_ID:
          {
            setFolderId(other.getFolderId());
            break;
          }
        case LOCATION_NOT_SET:
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
            case 8:
              {
                location_ = input.readInt64();
                locationCase_ = 1;
                break;
              } // case 8
            case 16:
              {
                location_ = input.readInt64();
                locationCase_ = 2;
                break;
              } // case 16
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

    private int locationCase_ = 0;
    private java.lang.Object location_;

    public LocationCase getLocationCase() {
      return LocationCase.forNumber(locationCase_);
    }

    public Builder clearLocation() {
      locationCase_ = 0;
      location_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * The ID of an organization to scan.
     * </pre>
     *
     * <code>int64 organization_id = 1;</code>
     *
     * @return Whether the organizationId field is set.
     */
    public boolean hasOrganizationId() {
      return locationCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The ID of an organization to scan.
     * </pre>
     *
     * <code>int64 organization_id = 1;</code>
     *
     * @return The organizationId.
     */
    public long getOrganizationId() {
      if (locationCase_ == 1) {
        return (java.lang.Long) location_;
      }
      return 0L;
    }
    /**
     *
     *
     * <pre>
     * The ID of an organization to scan.
     * </pre>
     *
     * <code>int64 organization_id = 1;</code>
     *
     * @param value The organizationId to set.
     * @return This builder for chaining.
     */
    public Builder setOrganizationId(long value) {

      locationCase_ = 1;
      location_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of an organization to scan.
     * </pre>
     *
     * <code>int64 organization_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOrganizationId() {
      if (locationCase_ == 1) {
        locationCase_ = 0;
        location_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ID of the folder within an organization to scan.
     * </pre>
     *
     * <code>int64 folder_id = 2;</code>
     *
     * @return Whether the folderId field is set.
     */
    public boolean hasFolderId() {
      return locationCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * The ID of the folder within an organization to scan.
     * </pre>
     *
     * <code>int64 folder_id = 2;</code>
     *
     * @return The folderId.
     */
    public long getFolderId() {
      if (locationCase_ == 2) {
        return (java.lang.Long) location_;
      }
      return 0L;
    }
    /**
     *
     *
     * <pre>
     * The ID of the folder within an organization to scan.
     * </pre>
     *
     * <code>int64 folder_id = 2;</code>
     *
     * @param value The folderId to set.
     * @return This builder for chaining.
     */
    public Builder setFolderId(long value) {

      locationCase_ = 2;
      location_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the folder within an organization to scan.
     * </pre>
     *
     * <code>int64 folder_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFolderId() {
      if (locationCase_ == 2) {
        locationCase_ = 0;
        location_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DataProfileLocation)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DataProfileLocation)
  private static final com.google.privacy.dlp.v2.DataProfileLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DataProfileLocation();
  }

  public static com.google.privacy.dlp.v2.DataProfileLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataProfileLocation> PARSER =
      new com.google.protobuf.AbstractParser<DataProfileLocation>() {
        @java.lang.Override
        public DataProfileLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataProfileLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataProfileLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DataProfileLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
