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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Reservation Affinity for consuming Zonal reservation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.ReservationAffinity}
 */
public final class ReservationAffinity extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.ReservationAffinity)
    ReservationAffinityOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReservationAffinity.newBuilder() to construct.
  private ReservationAffinity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReservationAffinity() {
    consumeReservationType_ = 0;
    key_ = "";
    values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReservationAffinity();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReservationAffinity(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              int rawValue = input.readEnum();

              consumeReservationType_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              key_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                values_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              values_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        values_ = values_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_ReservationAffinity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_ReservationAffinity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.ReservationAffinity.class,
            com.google.cloud.dataproc.v1.ReservationAffinity.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Indicates whether to consume capacity from an reservation or not.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dataproc.v1.ReservationAffinity.Type}
   */
  public enum Type implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>TYPE_UNSPECIFIED = 0;</code> */
    TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Do not consume from any allocated capacity.
     * </pre>
     *
     * <code>NO_RESERVATION = 1;</code>
     */
    NO_RESERVATION(1),
    /**
     *
     *
     * <pre>
     * Consume any reservation available.
     * </pre>
     *
     * <code>ANY_RESERVATION = 2;</code>
     */
    ANY_RESERVATION(2),
    /**
     *
     *
     * <pre>
     * Must consume from a specific reservation. Must specify key value fields
     * for specifying the reservations.
     * </pre>
     *
     * <code>SPECIFIC_RESERVATION = 3;</code>
     */
    SPECIFIC_RESERVATION(3),
    UNRECOGNIZED(-1),
    ;

    /** <code>TYPE_UNSPECIFIED = 0;</code> */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Do not consume from any allocated capacity.
     * </pre>
     *
     * <code>NO_RESERVATION = 1;</code>
     */
    public static final int NO_RESERVATION_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Consume any reservation available.
     * </pre>
     *
     * <code>ANY_RESERVATION = 2;</code>
     */
    public static final int ANY_RESERVATION_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Must consume from a specific reservation. Must specify key value fields
     * for specifying the reservations.
     * </pre>
     *
     * <code>SPECIFIC_RESERVATION = 3;</code>
     */
    public static final int SPECIFIC_RESERVATION_VALUE = 3;

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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0:
          return TYPE_UNSPECIFIED;
        case 1:
          return NO_RESERVATION;
        case 2:
          return ANY_RESERVATION;
        case 3:
          return SPECIFIC_RESERVATION;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.forNumber(number);
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
      return com.google.cloud.dataproc.v1.ReservationAffinity.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dataproc.v1.ReservationAffinity.Type)
  }

  public static final int CONSUME_RESERVATION_TYPE_FIELD_NUMBER = 1;
  private int consumeReservationType_;
  /**
   *
   *
   * <pre>
   * Optional. Type of reservation to consume
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for consumeReservationType.
   */
  @java.lang.Override
  public int getConsumeReservationTypeValue() {
    return consumeReservationType_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Type of reservation to consume
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The consumeReservationType.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.ReservationAffinity.Type getConsumeReservationType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dataproc.v1.ReservationAffinity.Type result =
        com.google.cloud.dataproc.v1.ReservationAffinity.Type.valueOf(consumeReservationType_);
    return result == null
        ? com.google.cloud.dataproc.v1.ReservationAffinity.Type.UNRECOGNIZED
        : result;
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object key_;
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label key of reservation resource.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label key of reservation resource.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList values_;
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the values.
   */
  public com.google.protobuf.ProtocolStringList getValuesList() {
    return values_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public java.lang.String getValues(int index) {
    return values_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  public com.google.protobuf.ByteString getValuesBytes(int index) {
    return values_.getByteString(index);
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
    if (consumeReservationType_
        != com.google.cloud.dataproc.v1.ReservationAffinity.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, consumeReservationType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
    for (int i = 0; i < values_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, values_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (consumeReservationType_
        != com.google.cloud.dataproc.v1.ReservationAffinity.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, consumeReservationType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += computeStringSizeNoTag(values_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValuesList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dataproc.v1.ReservationAffinity)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.ReservationAffinity other =
        (com.google.cloud.dataproc.v1.ReservationAffinity) obj;

    if (consumeReservationType_ != other.consumeReservationType_) return false;
    if (!getKey().equals(other.getKey())) return false;
    if (!getValuesList().equals(other.getValuesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONSUME_RESERVATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + consumeReservationType_;
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.ReservationAffinity prototype) {
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
   * Reservation Affinity for consuming Zonal reservation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.ReservationAffinity}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.ReservationAffinity)
      com.google.cloud.dataproc.v1.ReservationAffinityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_ReservationAffinity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_ReservationAffinity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.ReservationAffinity.class,
              com.google.cloud.dataproc.v1.ReservationAffinity.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.ReservationAffinity.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      consumeReservationType_ = 0;

      key_ = "";

      values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_ReservationAffinity_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ReservationAffinity getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.ReservationAffinity.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ReservationAffinity build() {
      com.google.cloud.dataproc.v1.ReservationAffinity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ReservationAffinity buildPartial() {
      com.google.cloud.dataproc.v1.ReservationAffinity result =
          new com.google.cloud.dataproc.v1.ReservationAffinity(this);
      int from_bitField0_ = bitField0_;
      result.consumeReservationType_ = consumeReservationType_;
      result.key_ = key_;
      if (((bitField0_ & 0x00000001) != 0)) {
        values_ = values_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.values_ = values_;
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
      if (other instanceof com.google.cloud.dataproc.v1.ReservationAffinity) {
        return mergeFrom((com.google.cloud.dataproc.v1.ReservationAffinity) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.ReservationAffinity other) {
      if (other == com.google.cloud.dataproc.v1.ReservationAffinity.getDefaultInstance())
        return this;
      if (other.consumeReservationType_ != 0) {
        setConsumeReservationTypeValue(other.getConsumeReservationTypeValue());
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.dataproc.v1.ReservationAffinity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.ReservationAffinity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private int consumeReservationType_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Type of reservation to consume
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for consumeReservationType.
     */
    @java.lang.Override
    public int getConsumeReservationTypeValue() {
      return consumeReservationType_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of reservation to consume
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for consumeReservationType to set.
     * @return This builder for chaining.
     */
    public Builder setConsumeReservationTypeValue(int value) {

      consumeReservationType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of reservation to consume
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The consumeReservationType.
     */
    @java.lang.Override
    public com.google.cloud.dataproc.v1.ReservationAffinity.Type getConsumeReservationType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dataproc.v1.ReservationAffinity.Type result =
          com.google.cloud.dataproc.v1.ReservationAffinity.Type.valueOf(consumeReservationType_);
      return result == null
          ? com.google.cloud.dataproc.v1.ReservationAffinity.Type.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of reservation to consume
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The consumeReservationType to set.
     * @return This builder for chaining.
     */
    public Builder setConsumeReservationType(
        com.google.cloud.dataproc.v1.ReservationAffinity.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }

      consumeReservationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of reservation to consume
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConsumeReservationType() {

      consumeReservationType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label key of reservation resource.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label key of reservation resource.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label key of reservation resource.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      key_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label key of reservation resource.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKey() {

      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label key of reservation resource.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      key_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList values_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new com.google.protobuf.LazyStringArrayList(values_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label values of reservation resource.
     * </pre>
     *
     * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return A list containing the values.
     */
    public com.google.protobuf.ProtocolStringList getValuesList() {
      return values_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label values of reservation resource.
     * </pre>
     *
     * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label values of reservation resource.
     * </pre>
     *
     * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public java.lang.String getValues(int index) {
      return values_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label values of reservation resource.
     * </pre>
     *
     * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    public com.google.protobuf.ByteString getValuesBytes(int index) {
      return values_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label values of reservation resource.
     * </pre>
     *
     * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValuesIsMutable();
      values_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label values of reservation resource.
     * </pre>
     *
     * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValuesIsMutable();
      values_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label values of reservation resource.
     * </pre>
     *
     * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(java.lang.Iterable<java.lang.String> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, values_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label values of reservation resource.
     * </pre>
     *
     * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Corresponds to the label values of reservation resource.
     * </pre>
     *
     * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes of the values to add.
     * @return This builder for chaining.
     */
    public Builder addValuesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureValuesIsMutable();
      values_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.ReservationAffinity)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.ReservationAffinity)
  private static final com.google.cloud.dataproc.v1.ReservationAffinity DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.ReservationAffinity();
  }

  public static com.google.cloud.dataproc.v1.ReservationAffinity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReservationAffinity> PARSER =
      new com.google.protobuf.AbstractParser<ReservationAffinity>() {
        @java.lang.Override
        public ReservationAffinity parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReservationAffinity(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReservationAffinity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReservationAffinity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.ReservationAffinity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
