// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * A single inspection rule to be applied to infoTypes, specified in
 * `InspectionRuleSet`.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.InspectionRule}
 */
public final class InspectionRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.InspectionRule)
    InspectionRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InspectionRule.newBuilder() to construct.
  private InspectionRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InspectionRule() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InspectionRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InspectionRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InspectionRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.InspectionRule.class, com.google.privacy.dlp.v2.InspectionRule.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    HOTWORD_RULE(1),
    EXCLUSION_RULE(2),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return HOTWORD_RULE;
        case 2: return EXCLUSION_RULE;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int HOTWORD_RULE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Hotword-based detection rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
   * @return Whether the hotwordRule field is set.
   */
  @java.lang.Override
  public boolean hasHotwordRule() {
    return typeCase_ == 1;
  }
  /**
   * <pre>
   * Hotword-based detection rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
   * @return The hotwordRule.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule getHotwordRule() {
    if (typeCase_ == 1) {
       return (com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule) type_;
    }
    return com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.getDefaultInstance();
  }
  /**
   * <pre>
   * Hotword-based detection rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRuleOrBuilder getHotwordRuleOrBuilder() {
    if (typeCase_ == 1) {
       return (com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule) type_;
    }
    return com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.getDefaultInstance();
  }

  public static final int EXCLUSION_RULE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Exclusion rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
   * @return Whether the exclusionRule field is set.
   */
  @java.lang.Override
  public boolean hasExclusionRule() {
    return typeCase_ == 2;
  }
  /**
   * <pre>
   * Exclusion rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
   * @return The exclusionRule.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ExclusionRule getExclusionRule() {
    if (typeCase_ == 2) {
       return (com.google.privacy.dlp.v2.ExclusionRule) type_;
    }
    return com.google.privacy.dlp.v2.ExclusionRule.getDefaultInstance();
  }
  /**
   * <pre>
   * Exclusion rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ExclusionRuleOrBuilder getExclusionRuleOrBuilder() {
    if (typeCase_ == 2) {
       return (com.google.privacy.dlp.v2.ExclusionRule) type_;
    }
    return com.google.privacy.dlp.v2.ExclusionRule.getDefaultInstance();
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
    if (typeCase_ == 1) {
      output.writeMessage(1, (com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule) type_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (com.google.privacy.dlp.v2.ExclusionRule) type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule) type_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.privacy.dlp.v2.ExclusionRule) type_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.InspectionRule)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.InspectionRule other = (com.google.privacy.dlp.v2.InspectionRule) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getHotwordRule()
            .equals(other.getHotwordRule())) return false;
        break;
      case 2:
        if (!getExclusionRule()
            .equals(other.getExclusionRule())) return false;
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
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + HOTWORD_RULE_FIELD_NUMBER;
        hash = (53 * hash) + getHotwordRule().hashCode();
        break;
      case 2:
        hash = (37 * hash) + EXCLUSION_RULE_FIELD_NUMBER;
        hash = (53 * hash) + getExclusionRule().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.InspectionRule parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.InspectionRule prototype) {
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
   * A single inspection rule to be applied to infoTypes, specified in
   * `InspectionRuleSet`.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.InspectionRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.InspectionRule)
      com.google.privacy.dlp.v2.InspectionRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InspectionRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InspectionRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.InspectionRule.class, com.google.privacy.dlp.v2.InspectionRule.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.InspectionRule.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (hotwordRuleBuilder_ != null) {
        hotwordRuleBuilder_.clear();
      }
      if (exclusionRuleBuilder_ != null) {
        exclusionRuleBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InspectionRule_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InspectionRule getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.InspectionRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InspectionRule build() {
      com.google.privacy.dlp.v2.InspectionRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InspectionRule buildPartial() {
      com.google.privacy.dlp.v2.InspectionRule result = new com.google.privacy.dlp.v2.InspectionRule(this);
      if (typeCase_ == 1) {
        if (hotwordRuleBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = hotwordRuleBuilder_.build();
        }
      }
      if (typeCase_ == 2) {
        if (exclusionRuleBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = exclusionRuleBuilder_.build();
        }
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof com.google.privacy.dlp.v2.InspectionRule) {
        return mergeFrom((com.google.privacy.dlp.v2.InspectionRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.InspectionRule other) {
      if (other == com.google.privacy.dlp.v2.InspectionRule.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case HOTWORD_RULE: {
          mergeHotwordRule(other.getHotwordRule());
          break;
        }
        case EXCLUSION_RULE: {
          mergeExclusionRule(other.getExclusionRule());
          break;
        }
        case TYPE_NOT_SET: {
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
              input.readMessage(
                  getHotwordRuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getExclusionRuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 2;
              break;
            } // case 18
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
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule, com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.Builder, com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRuleOrBuilder> hotwordRuleBuilder_;
    /**
     * <pre>
     * Hotword-based detection rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
     * @return Whether the hotwordRule field is set.
     */
    @java.lang.Override
    public boolean hasHotwordRule() {
      return typeCase_ == 1;
    }
    /**
     * <pre>
     * Hotword-based detection rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
     * @return The hotwordRule.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule getHotwordRule() {
      if (hotwordRuleBuilder_ == null) {
        if (typeCase_ == 1) {
          return (com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule) type_;
        }
        return com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return hotwordRuleBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Hotword-based detection rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
     */
    public Builder setHotwordRule(com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule value) {
      if (hotwordRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        hotwordRuleBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Hotword-based detection rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
     */
    public Builder setHotwordRule(
        com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.Builder builderForValue) {
      if (hotwordRuleBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        hotwordRuleBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Hotword-based detection rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
     */
    public Builder mergeHotwordRule(com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule value) {
      if (hotwordRuleBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.getDefaultInstance()) {
          type_ = com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.newBuilder((com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          hotwordRuleBuilder_.mergeFrom(value);
        } else {
          hotwordRuleBuilder_.setMessage(value);
        }
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Hotword-based detection rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
     */
    public Builder clearHotwordRule() {
      if (hotwordRuleBuilder_ == null) {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
        }
        hotwordRuleBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Hotword-based detection rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
     */
    public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.Builder getHotwordRuleBuilder() {
      return getHotwordRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Hotword-based detection rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRuleOrBuilder getHotwordRuleOrBuilder() {
      if ((typeCase_ == 1) && (hotwordRuleBuilder_ != null)) {
        return hotwordRuleBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule) type_;
        }
        return com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Hotword-based detection rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule hotword_rule = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule, com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.Builder, com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRuleOrBuilder> 
        getHotwordRuleFieldBuilder() {
      if (hotwordRuleBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.getDefaultInstance();
        }
        hotwordRuleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule, com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule.Builder, com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRuleOrBuilder>(
                (com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRule) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();;
      return hotwordRuleBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.ExclusionRule, com.google.privacy.dlp.v2.ExclusionRule.Builder, com.google.privacy.dlp.v2.ExclusionRuleOrBuilder> exclusionRuleBuilder_;
    /**
     * <pre>
     * Exclusion rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
     * @return Whether the exclusionRule field is set.
     */
    @java.lang.Override
    public boolean hasExclusionRule() {
      return typeCase_ == 2;
    }
    /**
     * <pre>
     * Exclusion rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
     * @return The exclusionRule.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.ExclusionRule getExclusionRule() {
      if (exclusionRuleBuilder_ == null) {
        if (typeCase_ == 2) {
          return (com.google.privacy.dlp.v2.ExclusionRule) type_;
        }
        return com.google.privacy.dlp.v2.ExclusionRule.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return exclusionRuleBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.ExclusionRule.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Exclusion rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
     */
    public Builder setExclusionRule(com.google.privacy.dlp.v2.ExclusionRule value) {
      if (exclusionRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        exclusionRuleBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Exclusion rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
     */
    public Builder setExclusionRule(
        com.google.privacy.dlp.v2.ExclusionRule.Builder builderForValue) {
      if (exclusionRuleBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        exclusionRuleBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Exclusion rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
     */
    public Builder mergeExclusionRule(com.google.privacy.dlp.v2.ExclusionRule value) {
      if (exclusionRuleBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != com.google.privacy.dlp.v2.ExclusionRule.getDefaultInstance()) {
          type_ = com.google.privacy.dlp.v2.ExclusionRule.newBuilder((com.google.privacy.dlp.v2.ExclusionRule) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          exclusionRuleBuilder_.mergeFrom(value);
        } else {
          exclusionRuleBuilder_.setMessage(value);
        }
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Exclusion rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
     */
    public Builder clearExclusionRule() {
      if (exclusionRuleBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        exclusionRuleBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Exclusion rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
     */
    public com.google.privacy.dlp.v2.ExclusionRule.Builder getExclusionRuleBuilder() {
      return getExclusionRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Exclusion rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.ExclusionRuleOrBuilder getExclusionRuleOrBuilder() {
      if ((typeCase_ == 2) && (exclusionRuleBuilder_ != null)) {
        return exclusionRuleBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (com.google.privacy.dlp.v2.ExclusionRule) type_;
        }
        return com.google.privacy.dlp.v2.ExclusionRule.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Exclusion rule.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ExclusionRule exclusion_rule = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.ExclusionRule, com.google.privacy.dlp.v2.ExclusionRule.Builder, com.google.privacy.dlp.v2.ExclusionRuleOrBuilder> 
        getExclusionRuleFieldBuilder() {
      if (exclusionRuleBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = com.google.privacy.dlp.v2.ExclusionRule.getDefaultInstance();
        }
        exclusionRuleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.ExclusionRule, com.google.privacy.dlp.v2.ExclusionRule.Builder, com.google.privacy.dlp.v2.ExclusionRuleOrBuilder>(
                (com.google.privacy.dlp.v2.ExclusionRule) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();;
      return exclusionRuleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.InspectionRule)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.InspectionRule)
  private static final com.google.privacy.dlp.v2.InspectionRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.InspectionRule();
  }

  public static com.google.privacy.dlp.v2.InspectionRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InspectionRule>
      PARSER = new com.google.protobuf.AbstractParser<InspectionRule>() {
    @java.lang.Override
    public InspectionRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<InspectionRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InspectionRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectionRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

