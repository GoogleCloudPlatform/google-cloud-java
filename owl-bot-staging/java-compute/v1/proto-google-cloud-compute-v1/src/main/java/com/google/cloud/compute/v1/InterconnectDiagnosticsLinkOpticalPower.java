// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower}
 */
public final class InterconnectDiagnosticsLinkOpticalPower extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower)
    InterconnectDiagnosticsLinkOpticalPowerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InterconnectDiagnosticsLinkOpticalPower.newBuilder() to construct.
  private InterconnectDiagnosticsLinkOpticalPower(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InterconnectDiagnosticsLinkOpticalPower() {
    state_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InterconnectDiagnosticsLinkOpticalPower();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectDiagnosticsLinkOpticalPower_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectDiagnosticsLinkOpticalPower_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.class, com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.Builder.class);
  }

  /**
   * <pre>
   * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold. 
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_STATE = 0;</code>
     */
    UNDEFINED_STATE(0),
    /**
     * <pre>
     * The value has crossed above the high alarm threshold.
     * </pre>
     *
     * <code>HIGH_ALARM = 305363284;</code>
     */
    HIGH_ALARM(305363284),
    /**
     * <pre>
     * The value of the current optical power has crossed above the high warning threshold.
     * </pre>
     *
     * <code>HIGH_WARNING = 220984799;</code>
     */
    HIGH_WARNING(220984799),
    /**
     * <pre>
     * The value of the current optical power has crossed below the low alarm threshold.
     * </pre>
     *
     * <code>LOW_ALARM = 316659046;</code>
     */
    LOW_ALARM(316659046),
    /**
     * <pre>
     * The value of the current optical power has crossed below the low warning threshold.
     * </pre>
     *
     * <code>LOW_WARNING = 338793841;</code>
     */
    LOW_WARNING(338793841),
    /**
     * <pre>
     * The value of the current optical power has not crossed a warning threshold.
     * </pre>
     *
     * <code>OK = 2524;</code>
     */
    OK(2524),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_STATE = 0;</code>
     */
    public static final int UNDEFINED_STATE_VALUE = 0;
    /**
     * <pre>
     * The value has crossed above the high alarm threshold.
     * </pre>
     *
     * <code>HIGH_ALARM = 305363284;</code>
     */
    public static final int HIGH_ALARM_VALUE = 305363284;
    /**
     * <pre>
     * The value of the current optical power has crossed above the high warning threshold.
     * </pre>
     *
     * <code>HIGH_WARNING = 220984799;</code>
     */
    public static final int HIGH_WARNING_VALUE = 220984799;
    /**
     * <pre>
     * The value of the current optical power has crossed below the low alarm threshold.
     * </pre>
     *
     * <code>LOW_ALARM = 316659046;</code>
     */
    public static final int LOW_ALARM_VALUE = 316659046;
    /**
     * <pre>
     * The value of the current optical power has crossed below the low warning threshold.
     * </pre>
     *
     * <code>LOW_WARNING = 338793841;</code>
     */
    public static final int LOW_WARNING_VALUE = 338793841;
    /**
     * <pre>
     * The value of the current optical power has not crossed a warning threshold.
     * </pre>
     *
     * <code>OK = 2524;</code>
     */
    public static final int OK_VALUE = 2524;


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
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_STATE;
        case 305363284: return HIGH_ALARM;
        case 220984799: return HIGH_WARNING;
        case 316659046: return LOW_ALARM;
        case 338793841: return LOW_WARNING;
        case 2524: return OK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.State)
  }

  private int bitField0_;
  public static final int STATE_FIELD_NUMBER = 109757585;
  @SuppressWarnings("serial")
  private volatile java.lang.Object state_ = "";
  /**
   * <pre>
   * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   * @return The state.
   */
  @java.lang.Override
  public java.lang.String getState() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      state_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   * @return The bytes for state.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStateBytes() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      state_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 111972721;
  private float value_ = 0F;
  /**
   * <pre>
   * Value of the current receiving or transmitting optical power, read in dBm. Take a known good optical value, give it a 10% margin and trigger warnings relative to that value. In general, a -7dBm warning and a -11dBm alarm are good optical value estimates for most links.
   * </pre>
   *
   * <code>optional float value = 111972721;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Value of the current receiving or transmitting optical power, read in dBm. Take a known good optical value, give it a 10% margin and trigger warnings relative to that value. In general, a -7dBm warning and a -11dBm alarm are good optical value estimates for most links.
   * </pre>
   *
   * <code>optional float value = 111972721;</code>
   * @return The value.
   */
  @java.lang.Override
  public float getValue() {
    return value_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 109757585, state_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeFloat(111972721, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(109757585, state_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(111972721, value_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower other = (com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower) obj;

    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState()
          .equals(other.getState())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (java.lang.Float.floatToIntBits(getValue())
          != java.lang.Float.floatToIntBits(
              other.getValue())) return false;
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
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getValue());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower)
      com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPowerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectDiagnosticsLinkOpticalPower_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectDiagnosticsLinkOpticalPower_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.class, com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      state_ = "";
      value_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InterconnectDiagnosticsLinkOpticalPower_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower build() {
      com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower buildPartial() {
      com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower result = new com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower other) {
      if (other == com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower.getDefaultInstance()) return this;
      if (other.hasState()) {
        state_ = other.state_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasValue()) {
        setValue(other.getValue());
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
            case 878060682: {
              state_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 878060682
            case 895781773: {
              value_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 895781773
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
    private int bitField0_;

    private java.lang.Object state_ = "";
    /**
     * <pre>
     * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @return The state.
     */
    public java.lang.String getState() {
      java.lang.Object ref = state_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        state_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @return The bytes for state.
     */
    public com.google.protobuf.ByteString
        getStateBytes() {
      java.lang.Object ref = state_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        state_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      state_ = getDefaultInstance().getState();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high alarm threshold.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @param value The bytes for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private float value_ ;
    /**
     * <pre>
     * Value of the current receiving or transmitting optical power, read in dBm. Take a known good optical value, give it a 10% margin and trigger warnings relative to that value. In general, a -7dBm warning and a -11dBm alarm are good optical value estimates for most links.
     * </pre>
     *
     * <code>optional float value = 111972721;</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Value of the current receiving or transmitting optical power, read in dBm. Take a known good optical value, give it a 10% margin and trigger warnings relative to that value. In general, a -7dBm warning and a -11dBm alarm are good optical value estimates for most links.
     * </pre>
     *
     * <code>optional float value = 111972721;</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
    }
    /**
     * <pre>
     * Value of the current receiving or transmitting optical power, read in dBm. Take a known good optical value, give it a 10% margin and trigger warnings relative to that value. In general, a -7dBm warning and a -11dBm alarm are good optical value estimates for most links.
     * </pre>
     *
     * <code>optional float value = 111972721;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(float value) {

      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of the current receiving or transmitting optical power, read in dBm. Take a known good optical value, give it a 10% margin and trigger warnings relative to that value. In general, a -7dBm warning and a -11dBm alarm are good optical value estimates for most links.
     * </pre>
     *
     * <code>optional float value = 111972721;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower)
  private static final com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower();
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectDiagnosticsLinkOpticalPower>
      PARSER = new com.google.protobuf.AbstractParser<InterconnectDiagnosticsLinkOpticalPower>() {
    @java.lang.Override
    public InterconnectDiagnosticsLinkOpticalPower parsePartialFrom(
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

  public static com.google.protobuf.Parser<InterconnectDiagnosticsLinkOpticalPower> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectDiagnosticsLinkOpticalPower> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

