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
// source: google/ads/admanager/v1/taxonomy_type_enum.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

/**
 *
 *
 * <pre>
 * Wrapper for
 * [TaxonomyType][google.ads.admanager.v1.TaxonomyTypeEnum.TaxonomyType]
 * </pre>
 *
 * Protobuf type {@code google.ads.admanager.v1.TaxonomyTypeEnum}
 */
public final class TaxonomyTypeEnum extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.ads.admanager.v1.TaxonomyTypeEnum)
    TaxonomyTypeEnumOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TaxonomyTypeEnum.newBuilder() to construct.
  private TaxonomyTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TaxonomyTypeEnum() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TaxonomyTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.ads.admanager.v1.TaxonomyTypeEnumProto
        .internal_static_google_ads_admanager_v1_TaxonomyTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.admanager.v1.TaxonomyTypeEnumProto
        .internal_static_google_ads_admanager_v1_TaxonomyTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.admanager.v1.TaxonomyTypeEnum.class,
            com.google.ads.admanager.v1.TaxonomyTypeEnum.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The taxonomy type of the IAB defined taxonomies.
   * Used for Publisher provided signals.
   * </pre>
   *
   * Protobuf enum {@code google.ads.admanager.v1.TaxonomyTypeEnum.TaxonomyType}
   */
  public enum TaxonomyType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified/not present
     * </pre>
     *
     * <code>TAXONOMY_TYPE_UNSPECIFIED = 0;</code>
     */
    TAXONOMY_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The IAB Audience Taxonomy v1.1.
     * </pre>
     *
     * <code>TAXONOMY_IAB_AUDIENCE_1_1 = 3;</code>
     */
    TAXONOMY_IAB_AUDIENCE_1_1(3),
    /**
     *
     *
     * <pre>
     * The IAB Content Taxonomy v2.1.
     * </pre>
     *
     * <code>TAXONOMY_IAB_CONTENT_2_1 = 4;</code>
     */
    TAXONOMY_IAB_CONTENT_2_1(4),
    /**
     *
     *
     * <pre>
     * The IAB Content Taxonomy v2.2.
     * </pre>
     *
     * <code>TAXONOMY_IAB_CONTENT_2_2 = 6;</code>
     */
    TAXONOMY_IAB_CONTENT_2_2(6),
    /**
     *
     *
     * <pre>
     * The IAB Content Taxonomy v3.0.
     * </pre>
     *
     * <code>TAXONOMY_IAB_CONTENT_3_0 = 5;</code>
     */
    TAXONOMY_IAB_CONTENT_3_0(5),
    /**
     *
     *
     * <pre>
     * The PPS structured video signals taxonomy.
     * </pre>
     *
     * <code>TAXONOMY_GOOGLE_STRUCTURED_VIDEO_1_0 = 7;</code>
     */
    TAXONOMY_GOOGLE_STRUCTURED_VIDEO_1_0(7),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified/not present
     * </pre>
     *
     * <code>TAXONOMY_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TAXONOMY_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The IAB Audience Taxonomy v1.1.
     * </pre>
     *
     * <code>TAXONOMY_IAB_AUDIENCE_1_1 = 3;</code>
     */
    public static final int TAXONOMY_IAB_AUDIENCE_1_1_VALUE = 3;
    /**
     *
     *
     * <pre>
     * The IAB Content Taxonomy v2.1.
     * </pre>
     *
     * <code>TAXONOMY_IAB_CONTENT_2_1 = 4;</code>
     */
    public static final int TAXONOMY_IAB_CONTENT_2_1_VALUE = 4;
    /**
     *
     *
     * <pre>
     * The IAB Content Taxonomy v2.2.
     * </pre>
     *
     * <code>TAXONOMY_IAB_CONTENT_2_2 = 6;</code>
     */
    public static final int TAXONOMY_IAB_CONTENT_2_2_VALUE = 6;
    /**
     *
     *
     * <pre>
     * The IAB Content Taxonomy v3.0.
     * </pre>
     *
     * <code>TAXONOMY_IAB_CONTENT_3_0 = 5;</code>
     */
    public static final int TAXONOMY_IAB_CONTENT_3_0_VALUE = 5;
    /**
     *
     *
     * <pre>
     * The PPS structured video signals taxonomy.
     * </pre>
     *
     * <code>TAXONOMY_GOOGLE_STRUCTURED_VIDEO_1_0 = 7;</code>
     */
    public static final int TAXONOMY_GOOGLE_STRUCTURED_VIDEO_1_0_VALUE = 7;

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
    public static TaxonomyType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TaxonomyType forNumber(int value) {
      switch (value) {
        case 0:
          return TAXONOMY_TYPE_UNSPECIFIED;
        case 3:
          return TAXONOMY_IAB_AUDIENCE_1_1;
        case 4:
          return TAXONOMY_IAB_CONTENT_2_1;
        case 6:
          return TAXONOMY_IAB_CONTENT_2_2;
        case 5:
          return TAXONOMY_IAB_CONTENT_3_0;
        case 7:
          return TAXONOMY_GOOGLE_STRUCTURED_VIDEO_1_0;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TaxonomyType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<TaxonomyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TaxonomyType>() {
          public TaxonomyType findValueByNumber(int number) {
            return TaxonomyType.forNumber(number);
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
      return com.google.ads.admanager.v1.TaxonomyTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final TaxonomyType[] VALUES = values();

    public static TaxonomyType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TaxonomyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.admanager.v1.TaxonomyTypeEnum.TaxonomyType)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.ads.admanager.v1.TaxonomyTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.admanager.v1.TaxonomyTypeEnum other =
        (com.google.ads.admanager.v1.TaxonomyTypeEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum parseFrom(
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

  public static Builder newBuilder(com.google.ads.admanager.v1.TaxonomyTypeEnum prototype) {
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
   * Wrapper for
   * [TaxonomyType][google.ads.admanager.v1.TaxonomyTypeEnum.TaxonomyType]
   * </pre>
   *
   * Protobuf type {@code google.ads.admanager.v1.TaxonomyTypeEnum}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.ads.admanager.v1.TaxonomyTypeEnum)
      com.google.ads.admanager.v1.TaxonomyTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.ads.admanager.v1.TaxonomyTypeEnumProto
          .internal_static_google_ads_admanager_v1_TaxonomyTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.admanager.v1.TaxonomyTypeEnumProto
          .internal_static_google_ads_admanager_v1_TaxonomyTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.admanager.v1.TaxonomyTypeEnum.class,
              com.google.ads.admanager.v1.TaxonomyTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.admanager.v1.TaxonomyTypeEnum.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.ads.admanager.v1.TaxonomyTypeEnumProto
          .internal_static_google_ads_admanager_v1_TaxonomyTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.TaxonomyTypeEnum getDefaultInstanceForType() {
      return com.google.ads.admanager.v1.TaxonomyTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.TaxonomyTypeEnum build() {
      com.google.ads.admanager.v1.TaxonomyTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.admanager.v1.TaxonomyTypeEnum buildPartial() {
      com.google.ads.admanager.v1.TaxonomyTypeEnum result =
          new com.google.ads.admanager.v1.TaxonomyTypeEnum(this);
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
      if (other instanceof com.google.ads.admanager.v1.TaxonomyTypeEnum) {
        return mergeFrom((com.google.ads.admanager.v1.TaxonomyTypeEnum) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.admanager.v1.TaxonomyTypeEnum other) {
      if (other == com.google.ads.admanager.v1.TaxonomyTypeEnum.getDefaultInstance()) return this;
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.ads.admanager.v1.TaxonomyTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.admanager.v1.TaxonomyTypeEnum)
  private static final com.google.ads.admanager.v1.TaxonomyTypeEnum DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.ads.admanager.v1.TaxonomyTypeEnum();
  }

  public static com.google.ads.admanager.v1.TaxonomyTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaxonomyTypeEnum> PARSER =
      new com.google.protobuf.AbstractParser<TaxonomyTypeEnum>() {
        @java.lang.Override
        public TaxonomyTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaxonomyTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaxonomyTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.admanager.v1.TaxonomyTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
